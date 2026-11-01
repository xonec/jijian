package cn.jianyun.workplan.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: loaded from: classes2.dex */
public class MyReflectTool {
    private static final String OBJECT = "Object";
    private static final Map<String, List<String>> fieldNamesMap = new ConcurrentHashMap();

    public static boolean isNotSuperObjectClass(Class c2) {
        return !OBJECT.equals(c2.getSimpleName());
    }

    public static <T> List<String> getFieldNames(Class cls) {
        String name = cls.getName();
        Map<String, List<String>> map = fieldNamesMap;
        if (map.containsKey(name)) {
            return map.get(name);
        }
        ArrayList arrayList = new ArrayList();
        while (isNotSuperObjectClass(cls)) {
            arrayList.addAll(MyCollectionTool.lstFilterOne(Arrays.asList(cls.getDeclaredFields()), "name"));
            cls = cls.getSuperclass();
        }
        fieldNamesMap.put(name, arrayList);
        return arrayList;
    }

    public static <T> List<String> getFieldNames(T t) {
        return getFieldNames((Class) t.getClass());
    }

    public static Field getField(Class cls, String fieldName) {
        try {
            return cls.getDeclaredField(fieldName);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static <T> List<Field> getFields(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (isNotSuperObjectClass(cls)) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    public static <T> List<Field> getFields(T t) {
        return getFields((Class) t.getClass());
    }

    public static List<String> getMethodNames(Class cls) {
        return MyCollectionTool.lstFilterOne(Arrays.asList(cls.getDeclaredMethods()), "name");
    }

    public static List<String> getAllMethodNames(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (isNotSuperObjectClass(cls)) {
            arrayList.addAll(getMethodNames(cls));
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    public static Map<String, Method> getMethods(Class cls) {
        return MyCollectionTool.lst2map(Arrays.asList(cls.getDeclaredMethods()), "name");
    }

    public static Map<String, Method> getAllMethods(Class cls) {
        HashMap map = new HashMap();
        while (isNotSuperObjectClass(cls)) {
            map.putAll(getMethods(cls));
            cls = cls.getSuperclass();
        }
        return map;
    }

    public static boolean hasAnnotation(Field field, Class annotation) {
        return field.getAnnotation(annotation) != null;
    }

    public static Object newInstance(Class cls) {
        try {
            return cls.newInstance();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void setFieldValue(Object object, String fieldName, Object value) {
        for (Class<?> superclass = object.getClass(); isNotSuperObjectClass(superclass); superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(fieldName);
                if (Modifier.isFinal(declaredField.getModifiers())) {
                    return;
                }
                declaredField.setAccessible(true);
                declaredField.set(object, value);
                return;
            } catch (Exception unused) {
                System.out.println("field error" + object.getClass());
            }
        }
    }

    public static Object getFieldValue(Object obj, String fieldName) {
        for (Class<?> superclass = obj.getClass(); isNotSuperObjectClass(superclass); superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Object invokeMethod(Object obj, String methodName, Class[] parameters, Object... paramValues) {
        for (Class<?> superclass = obj.getClass(); isNotSuperObjectClass(superclass); superclass = superclass.getSuperclass()) {
            try {
                if (parameters == null) {
                    Method declaredMethod = superclass.getDeclaredMethod(methodName, new Class[0]);
                    declaredMethod.setAccessible(true);
                    obj = declaredMethod.invoke(obj, new Object[0]);
                } else {
                    Method declaredMethod2 = superclass.getDeclaredMethod(methodName, parameters);
                    declaredMethod2.setAccessible(true);
                    obj = declaredMethod2.invoke(obj, paramValues);
                }
                return obj;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Object invokeMethod(Object obj, String methodName) {
        return invokeMethod(obj, methodName, null, new Object[0]);
    }

    public static <T> Object getValue(T v, String key) {
        if (v instanceof Map) {
            return ((Map) v).get(key);
        }
        return getFieldValue(v, key);
    }

    public static List<String> getKeys(Object v) {
        return getFieldNames(v);
    }

    public static <T> void setValue(T v, String key, Object value) {
        if (v instanceof Map) {
            ((Map) v).put(key, value);
        } else {
            setFieldValue(v, key, value);
        }
    }

    public static String getClassName(Object v) {
        if (v == null) {
            return null;
        }
        return v.getClass().getSimpleName();
    }

    public static <T> T copy(T t, String str) {
        List<String> listStr2list = MyCollectionTool.str2list(str);
        try {
            T t2 = (T) t.getClass().newInstance();
            for (String str2 : listStr2list) {
                setValue(t2, str2, getValue(t, str2));
            }
            return t2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void clearProps(Object source, String excludes) {
        Set<String> setStr2set = MyCollectionTool.str2set(excludes);
        for (Field field : getFields((Class) source.getClass())) {
            if (!setStr2set.contains(field.getName())) {
                String lowerCase = field.getType().getSimpleName().toLowerCase();
                if ("string".equals(lowerCase)) {
                    setFieldValue(source, field.getName(), "");
                }
                if (XmlErrorCodes.INT.equals(lowerCase)) {
                    setFieldValue(source, field.getName(), 0);
                }
                if (XmlErrorCodes.LIST.equals(lowerCase)) {
                    setFieldValue(source, field.getName(), Collections.EMPTY_LIST);
                }
            }
        }
    }

    public static <T> T copyExclude(T t, String str) {
        Set<String> hashSet;
        List<String> listStr2list = MyCollectionTool.str2list(str);
        try {
            T t2 = (T) t.getClass().newInstance();
            if (t instanceof Map) {
                hashSet = ((Map) t).keySet();
            } else {
                hashSet = new HashSet(getFieldNames(t));
            }
            for (String str2 : hashSet) {
                if (!listStr2list.contains(str2)) {
                    setValue(t2, str2, getValue(t, str2));
                }
            }
            return t2;
        } catch (Exception unused) {
            return null;
        }
    }
}