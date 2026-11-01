package cn.jianyun.workplan.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public class MyCollectionTool {
    public static <T> String join(List<T> lists, String joiner) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<T> it = lists.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            stringBuffer.append(joiner);
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    public static <T> String join(T[] lists, String joiner) {
        StringBuffer stringBuffer = new StringBuffer();
        for (T t : lists) {
            stringBuffer.append(t);
            stringBuffer.append(joiner);
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    public static <T> String join(List<T> lists) {
        return join(lists, ",");
    }

    public static <T> List<T> makeList(T... data) {
        ArrayList arrayList = new ArrayList();
        for (T t : data) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public static <T> boolean contains(Map<String, T> obj, String key) {
        return obj != null && obj.containsKey(key);
    }

    public static <T> String getString(Map<String, T> obj, String key) {
        return getString(obj, key, "");
    }

    public static <T> String getString(Map<String, T> obj, String key, String defaultValue) {
        T t;
        return (obj == null || (t = obj.get(key)) == null) ? defaultValue : t.toString();
    }

    public static <T> int getInt(Map<String, T> obj, String key) {
        return getInt(obj, key);
    }

    public static <T> int getInt(Map<String, T> obj, String key, int defaultValue) {
        return MyDataTool.toInteger(getString(obj, key), Integer.valueOf(defaultValue)).intValue();
    }

    public static <T> boolean getBoolean(Map<String, T> obj, String key) {
        return MyDataTool.toBoolean(getString(obj, key));
    }

    public static <T> boolean containsAll(Map<String, T> obj, String... keys) {
        if (keys == null) {
            return true;
        }
        for (String str : keys) {
            if (!getBoolean(obj, str)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean containsAny(Map<String, T> obj, String... keys) {
        if (keys == null) {
            return true;
        }
        for (String str : keys) {
            if (getBoolean(obj, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(Map map) {
        return map == null || map.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> lst2map(List<V> list, String str) {
        if (isEmpty(list)) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        for (V v : list) {
            Object value = MyReflectTool.getValue(v, str);
            if (value != null) {
                map.put(value, v);
            }
        }
        return map;
    }

    public static <K, V> List<K> lstFilterOne(List<V> lst, String key) {
        if (isEmpty(lst)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<V> it = lst.iterator();
        while (it.hasNext()) {
            Object value = MyReflectTool.getValue(it.next(), key);
            if (value != null) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, Object> lst2map(List<V> list, String str, String str2) {
        if (isEmpty(list)) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        for (V v : list) {
            Object value = MyReflectTool.getValue(v, str);
            if (value != null) {
                map.put(value, MyReflectTool.getValue(v, str2));
            }
        }
        return map;
    }

    public static <V> List<V> lstFilter(List<V> lst, String keys) {
        if (isEmpty(lst)) {
            return Collections.EMPTY_LIST;
        }
        if (keys == null) {
            return lst;
        }
        List<String> keys2 = MyReflectTool.getKeys(lst.get(0));
        List<String> listStr2list = str2list(keys);
        for (V v : lst) {
            for (String str : keys2) {
                if (!listStr2list.contains(str)) {
                    MyReflectTool.setValue(v, str, null);
                }
            }
        }
        return lst;
    }

    public static <T> List<T> lstFilterExclude(List<T> lst, String excludeKeys) {
        if (isEmpty(lst)) {
            return Collections.EMPTY_LIST;
        }
        if (excludeKeys == null) {
            return lst;
        }
        List<String> listStr2list = str2list(excludeKeys);
        for (T t : lst) {
            Iterator<String> it = listStr2list.iterator();
            while (it.hasNext()) {
                MyReflectTool.setValue(t, it.next(), null);
            }
        }
        return lst;
    }

    public static List<String> str2list(String strs) {
        return str2list(strs, ",");
    }

    public static Set<String> str2set(String strs) {
        return new HashSet(str2list(strs));
    }

    public static List<String> str2list(String strs, String splitter) {
        final ArrayList arrayList = new ArrayList();
        Arrays.stream(strs.split(splitter)).forEach(new Consumer() { // from class: cn.jianyun.workplan.util.MyCollectionTool$$ExternalSyntheticLambda2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add(((String) obj).trim());
            }
        });
        return arrayList;
    }

    public static <T> T getFromList(List<T> data, String key, Object value) {
        if (!isEmpty(data) && key != null) {
            for (T t : data) {
                if (compareValue(MyReflectTool.getValue(t, key), value)) {
                    return t;
                }
            }
        }
        return null;
    }

    public static <T> boolean contains(List<T> data, String key, Object value) {
        if (!isEmpty(data) && key != null && value != null) {
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                if (compareValue(MyReflectTool.getValue(it.next(), key), value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> Map<String, T> list2map(List<T> data, final String prop) {
        final HashMap map = new HashMap();
        data.forEach(new Consumer() { // from class: cn.jianyun.workplan.util.MyCollectionTool$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                MyCollectionTool.lambda$list2map$1(prop, map, obj);
            }
        });
        return map;
    }

    static /* synthetic */ void lambda$list2map$1(String str, Map map, Object obj) {
        Object fieldValue = MyReflectTool.getFieldValue(obj, str);
        if (fieldValue != null) {
            map.put(String.valueOf(fieldValue), obj);
        }
    }

    public static boolean compareValue(Object o1, Object o2) {
        if (o1 == o2) {
            return true;
        }
        if (o1 == null || o2 == null) {
            return false;
        }
        String lowerCase = o1.getClass().getSimpleName().toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "double":
            case "string":
            case "int":
            case "long":
            case "boolean":
            case "integer":
                return Objects.equals(o1, o2);
            default:
                return false;
        }
    }

    public static Set<String> list2set(List<String> courseIds) {
        final HashSet hashSet = new HashSet();
        courseIds.forEach(new Consumer() { // from class: cn.jianyun.workplan.util.MyCollectionTool$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hashSet.add((String) obj);
            }
        });
        return hashSet;
    }
}