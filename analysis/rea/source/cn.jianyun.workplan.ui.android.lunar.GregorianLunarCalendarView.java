package cn.jianyun.workplan.ui.android.lunar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import cn.jianyun.workplan.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public class GregorianLunarCalendarView extends LinearLayout implements NumberPickerView.OnValueChangeListener {
    private static final int DAY_SPAN_GREGORIAN = 31;
    private static final int DAY_SPAN_LUNAR = 30;
    private static final int DAY_START = 1;
    private static final int DAY_START_GREGORIAN = 1;
    private static final int DAY_START_LUNAR = 1;
    private static final int DAY_STOP = 30;
    private static final int DAY_STOP_GREGORIAN = 31;
    private static final int DAY_STOP_LUNAR = 30;
    private static final int DEFAULT_GREGORIAN_COLOR = -13399809;
    private static final int DEFAULT_LUNAR_COLOR = -1157820;
    private static final int DEFAULT_NORMAL_TEXT_COLOR = -11184811;
    private static final int MONTH_SPAN_GREGORIAN = 12;
    private static final int MONTH_SPAN_LUNAR_LEAP = 13;
    private static final int MONTH_SPAN_LUNAR_NORMAL = 12;
    private static final int MONTH_START = 1;
    private static final int MONTH_START_GREGORIAN = 1;
    private static final int MONTH_START_LUNAR = 1;
    private static final int MONTH_START_LUNAR_LEAP = 1;
    private static final int MONTH_START_LUNAR_NORMAL = 1;
    private static final int MONTH_STOP_GREGORIAN = 12;
    private static final int MONTH_STOP_LUNAR_LEAP = 13;
    private static final int MONTH_STOP_LUNAR_NORMAL = 12;
    private static final int YEAR_SPAN = 200;
    private static final int YEAR_START = 1901;
    private static final int YEAR_STOP = 2100;
    private String[] mCurrDisplayMonthsLunar;
    private NumberPickerView mDayPickerView;
    private String[] mDisplayDaysGregorian;
    private String[] mDisplayDaysLunar;
    private String[] mDisplayMonthsGregorian;
    private String[] mDisplayMonthsLunar;
    private String[] mDisplayYearsGregorian;
    private String[] mDisplayYearsLunar;
    private boolean mIsGregorian;
    private NumberPickerView mMonthPickerView;
    private int mNormalTextColor;
    private OnDateChangedListener mOnDateChangedListener;
    private boolean mScrollAnim;
    private int mThemeColorG;
    private int mThemeColorL;
    private NumberPickerView mYearPickerView;

    public interface OnDateChangedListener {
        void onDateChanged(CalendarData calendarData);
    }

    public GregorianLunarCalendarView(Context context) {
        super(context);
        this.mThemeColorG = DEFAULT_GREGORIAN_COLOR;
        this.mThemeColorL = DEFAULT_LUNAR_COLOR;
        this.mNormalTextColor = DEFAULT_NORMAL_TEXT_COLOR;
        this.mIsGregorian = true;
        this.mScrollAnim = true;
        initInternal(context);
    }

    public GregorianLunarCalendarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mThemeColorG = DEFAULT_GREGORIAN_COLOR;
        this.mThemeColorL = DEFAULT_LUNAR_COLOR;
        this.mNormalTextColor = DEFAULT_NORMAL_TEXT_COLOR;
        this.mIsGregorian = true;
        this.mScrollAnim = true;
        initAttr(context, attrs);
        initInternal(context);
    }

    public GregorianLunarCalendarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.mThemeColorG = DEFAULT_GREGORIAN_COLOR;
        this.mThemeColorL = DEFAULT_LUNAR_COLOR;
        this.mNormalTextColor = DEFAULT_NORMAL_TEXT_COLOR;
        this.mIsGregorian = true;
        this.mScrollAnim = true;
        initAttr(context, attrs);
        initInternal(context);
    }

    private void initInternal(Context context) {
        View viewInflate = inflate(context, R.layout.view_gregorian_lunar_calendar, this);
        this.mYearPickerView = (NumberPickerView) viewInflate.findViewById(R.id.picker_year);
        this.mMonthPickerView = (NumberPickerView) viewInflate.findViewById(R.id.picker_month);
        this.mDayPickerView = (NumberPickerView) viewInflate.findViewById(R.id.picker_day);
        this.mYearPickerView.setOnValueChangedListener(this);
        this.mMonthPickerView.setOnValueChangedListener(this);
        this.mDayPickerView.setOnValueChangedListener(this);
    }

    private void initAttr(Context context, AttributeSet attrs) {
        if (attrs == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.GregorianLunarCalendarView);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R.styleable.GregorianLunarCalendarView_glcv_ScrollAnimation) {
                this.mScrollAnim = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == R.styleable.GregorianLunarCalendarView_glcv_GregorianThemeColor) {
                this.mThemeColorG = typedArrayObtainStyledAttributes.getColor(index, DEFAULT_GREGORIAN_COLOR);
            }
            if (index == R.styleable.GregorianLunarCalendarView_glcv_LunarThemeColor) {
                this.mThemeColorL = typedArrayObtainStyledAttributes.getColor(index, DEFAULT_LUNAR_COLOR);
            }
            if (index == R.styleable.GregorianLunarCalendarView_glcv_NormalTextColor) {
                this.mNormalTextColor = typedArrayObtainStyledAttributes.getColor(index, DEFAULT_NORMAL_TEXT_COLOR);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void init() {
        setColor(this.mThemeColorG, this.mNormalTextColor);
        setConfigs(Calendar.getInstance(), true, false);
    }

    public void init(Calendar calendar) {
        setColor(this.mThemeColorG, this.mNormalTextColor);
        setConfigs(calendar, true, false);
    }

    public void init(Calendar calendar, boolean isGregorian) {
        setColor(isGregorian ? this.mThemeColorG : this.mThemeColorL, this.mNormalTextColor);
        setConfigs(calendar, isGregorian, false);
    }

    private void setConfigs(Calendar c2, boolean isGregorian, boolean anim) {
        ChineseCalendar chineseCalendar;
        if (c2 == null) {
            c2 = Calendar.getInstance();
        }
        if (!checkCalendarAvailable(c2, YEAR_START, YEAR_STOP, isGregorian)) {
            c2 = adjustCalendarByLimit(c2, YEAR_START, YEAR_STOP, isGregorian);
        }
        this.mIsGregorian = isGregorian;
        if (c2 instanceof ChineseCalendar) {
            chineseCalendar = (ChineseCalendar) c2;
        } else {
            chineseCalendar = new ChineseCalendar(c2);
        }
        setDisplayValuesForAll(chineseCalendar, this.mIsGregorian, anim);
    }

    private Calendar adjustCalendarByLimit(Calendar c2, int yearStart, int yearStop, boolean isGregorian) {
        int i = c2.get(1);
        if (!isGregorian) {
            if (Math.abs(i - yearStart) < Math.abs(i - yearStop)) {
                return new ChineseCalendar(true, yearStart, 1, 1);
            }
            return new ChineseCalendar(true, yearStop, 12, Util.getSumOfDayInMonthForLunarByMonthLunar(yearStop, 12));
        }
        if (i < yearStart) {
            c2.set(1, yearStart);
            c2.set(2, 1);
            c2.set(5, 1);
        }
        if (i <= yearStop) {
            return c2;
        }
        c2.set(1, yearStop);
        c2.set(2, 11);
        c2.set(5, Util.getSumOfDayInMonthForGregorianByMonth(yearStop, 12));
        return c2;
    }

    public void toGregorianMode() {
        setThemeColor(this.mThemeColorG);
        setGregorian(true, true);
    }

    public void toLunarMode() {
        setThemeColor(this.mThemeColorL);
        setGregorian(false, true);
    }

    public void setColor(int themeColor, int normalColor) {
        setThemeColor(themeColor);
        setNormalColor(normalColor);
    }

    public void setThemeColor(int themeColor) {
        this.mYearPickerView.setSelectedTextColor(themeColor);
        this.mYearPickerView.setHintTextColor(themeColor);
        this.mYearPickerView.setDividerColor(themeColor);
        this.mMonthPickerView.setSelectedTextColor(themeColor);
        this.mMonthPickerView.setHintTextColor(themeColor);
        this.mMonthPickerView.setDividerColor(themeColor);
        this.mDayPickerView.setSelectedTextColor(themeColor);
        this.mDayPickerView.setHintTextColor(themeColor);
        this.mDayPickerView.setDividerColor(themeColor);
    }

    public void setDividerColor(int themeColor) {
        this.mYearPickerView.setDividerColor(themeColor);
        this.mMonthPickerView.setDividerColor(themeColor);
        this.mDayPickerView.setDividerColor(themeColor);
    }

    public void setNormalColor(int normalColor) {
        this.mYearPickerView.setNormalTextColor(normalColor);
        this.mMonthPickerView.setNormalTextColor(normalColor);
        this.mDayPickerView.setNormalTextColor(normalColor);
    }

    private void setDisplayValuesForAll(ChineseCalendar cc, boolean isGregorian, boolean anim) {
        setDisplayData(isGregorian);
        initValuesForY(cc, isGregorian, anim);
        initValuesForM(cc, isGregorian, anim);
        initValuesForD(cc, isGregorian, anim);
    }

    private void setDisplayData(boolean isGregorian) {
        int i = 0;
        if (isGregorian) {
            if (this.mDisplayYearsGregorian == null) {
                this.mDisplayYearsGregorian = new String[200];
                for (int i2 = 0; i2 < 200; i2++) {
                    this.mDisplayYearsGregorian[i2] = String.valueOf(i2 + YEAR_START);
                }
            }
            if (this.mDisplayMonthsGregorian == null) {
                this.mDisplayMonthsGregorian = new String[12];
                int i3 = 0;
                while (i3 < 12) {
                    int i4 = i3 + 1;
                    this.mDisplayMonthsGregorian[i3] = String.valueOf(i4);
                    i3 = i4;
                }
            }
            if (this.mDisplayDaysGregorian == null) {
                this.mDisplayDaysGregorian = new String[31];
                while (i < 31) {
                    int i5 = i + 1;
                    this.mDisplayDaysGregorian[i] = String.valueOf(i5);
                    i = i5;
                }
                return;
            }
            return;
        }
        if (this.mDisplayYearsLunar == null) {
            this.mDisplayYearsLunar = new String[200];
            for (int i6 = 0; i6 < 200; i6++) {
                this.mDisplayYearsLunar[i6] = String.valueOf(i6 + YEAR_START);
            }
        }
        if (this.mDisplayMonthsLunar == null) {
            this.mDisplayMonthsLunar = new String[12];
            int i7 = 0;
            while (i7 < 12) {
                int i8 = i7 + 1;
                this.mDisplayMonthsLunar[i7] = Util.getLunarNameOfMonth(i8);
                i7 = i8;
            }
        }
        if (this.mDisplayDaysLunar == null) {
            this.mDisplayDaysLunar = new String[30];
            while (i < 30) {
                int i9 = i + 1;
                this.mDisplayDaysLunar[i] = Util.getLunarNameOfDay(i9);
                i = i9;
            }
        }
    }

    private void initValuesForY(ChineseCalendar cc, boolean isGregorian, boolean anim) {
        if (isGregorian) {
            setValuesForPickerView(this.mYearPickerView, cc.get(1), YEAR_START, YEAR_STOP, this.mDisplayYearsGregorian, false, anim);
        } else {
            setValuesForPickerView(this.mYearPickerView, cc.get(801), YEAR_START, YEAR_STOP, this.mDisplayYearsLunar, false, anim);
        }
    }

    private void initValuesForM(ChineseCalendar cc, boolean isGregorian, boolean anim) {
        int iConvertMonthLunarToMonthSway;
        String[] lunarMonthsNamesWithLeap;
        int i = 12;
        if (isGregorian) {
            iConvertMonthLunarToMonthSway = cc.get(2) + 1;
            lunarMonthsNamesWithLeap = this.mDisplayMonthsGregorian;
        } else {
            int monthLeapByYear = Util.getMonthLeapByYear(cc.get(801));
            if (monthLeapByYear == 0) {
                iConvertMonthLunarToMonthSway = cc.get(802);
                lunarMonthsNamesWithLeap = this.mDisplayMonthsLunar;
            } else {
                iConvertMonthLunarToMonthSway = Util.convertMonthLunarToMonthSway(cc.get(802), monthLeapByYear);
                lunarMonthsNamesWithLeap = Util.getLunarMonthsNamesWithLeap(monthLeapByYear);
                i = 13;
            }
        }
        setValuesForPickerView(this.mMonthPickerView, iConvertMonthLunarToMonthSway, 1, i, lunarMonthsNamesWithLeap, false, anim);
    }

    private void initValuesForD(ChineseCalendar cc, boolean isGregorian, boolean anim) {
        if (isGregorian) {
            int sumOfDayInMonthForGregorianByMonth = Util.getSumOfDayInMonthForGregorianByMonth(cc.get(1), cc.get(2) + 1);
            int i = cc.get(5);
            this.mDayPickerView.setHintText(getContext().getResources().getString(R.string.day));
            setValuesForPickerView(this.mDayPickerView, i, 1, sumOfDayInMonthForGregorianByMonth, this.mDisplayDaysGregorian, false, anim);
            return;
        }
        int sumOfDayInMonthForLunarByMonthLunar = Util.getSumOfDayInMonthForLunarByMonthLunar(cc.get(801), cc.get(802));
        int i2 = cc.get(803);
        this.mDayPickerView.setHintText("");
        setValuesForPickerView(this.mDayPickerView, i2, 1, sumOfDayInMonthForLunarByMonthLunar, this.mDisplayDaysLunar, false, anim);
    }

    private void setValuesForPickerView(NumberPickerView pickerView, int newSway, int newStart, int newStop, String[] newDisplayedVales, boolean needRespond, boolean anim) {
        if (newDisplayedVales == null) {
            throw new IllegalArgumentException("newDisplayedVales should not be null.");
        }
        if (newDisplayedVales.length == 0) {
            throw new IllegalArgumentException("newDisplayedVales's length should not be 0.");
        }
        int i = (newStop - newStart) + 1;
        if (newDisplayedVales.length < i) {
            throw new IllegalArgumentException("newDisplayedVales's length should not be less than newSpan.");
        }
        int maxValue = (pickerView.getMaxValue() - pickerView.getMinValue()) + 1;
        int value = pickerView.getValue();
        pickerView.setMinValue(newStart);
        if (i > maxValue) {
            pickerView.setDisplayedValues(newDisplayedVales);
            pickerView.setMaxValue(newStop);
        } else {
            pickerView.setMaxValue(newStop);
            pickerView.setDisplayedValues(newDisplayedVales);
        }
        if (this.mScrollAnim && anim) {
            if (value >= newStart) {
                newStart = value;
            }
            pickerView.smoothScrollToValue(newStart, newSway, needRespond);
            return;
        }
        pickerView.setValue(newSway);
    }

    @Override // cn.jianyun.workplan.ui.android.lunar.NumberPickerView.OnValueChangeListener
    public void onValueChange(NumberPickerView picker, int oldVal, int newVal) {
        OnDateChangedListener onDateChangedListener;
        if (picker == null) {
            return;
        }
        NumberPickerView numberPickerView = this.mYearPickerView;
        if (picker == numberPickerView) {
            passiveUpdateMonthAndDay(oldVal, newVal, this.mIsGregorian);
            return;
        }
        if (picker == this.mMonthPickerView) {
            int value = numberPickerView.getValue();
            passiveUpdateDay(value, value, oldVal, newVal, this.mIsGregorian);
        } else {
            if (picker != this.mDayPickerView || (onDateChangedListener = this.mOnDateChangedListener) == null) {
                return;
            }
            onDateChangedListener.onDateChanged(getCalendarData());
        }
    }

    private void passiveUpdateMonthAndDay(int oldYearFix, int newYearFix, boolean isGregorian) {
        int value = this.mMonthPickerView.getValue();
        int value2 = this.mDayPickerView.getValue();
        if (isGregorian) {
            int sumOfDayInMonth = Util.getSumOfDayInMonth(oldYearFix, value, true);
            int sumOfDayInMonth2 = Util.getSumOfDayInMonth(newYearFix, value, true);
            if (sumOfDayInMonth == sumOfDayInMonth2) {
                OnDateChangedListener onDateChangedListener = this.mOnDateChangedListener;
                if (onDateChangedListener != null) {
                    onDateChangedListener.onDateChanged(getCalendarData(newYearFix, value, value2, isGregorian));
                    return;
                }
                return;
            }
            if (value2 > sumOfDayInMonth2) {
                value2 = sumOfDayInMonth2;
            }
            setValuesForPickerView(this.mDayPickerView, value2, 1, sumOfDayInMonth2, this.mDisplayDaysGregorian, true, true);
            OnDateChangedListener onDateChangedListener2 = this.mOnDateChangedListener;
            if (onDateChangedListener2 != null) {
                onDateChangedListener2.onDateChanged(getCalendarData(newYearFix, value, value2, isGregorian));
                return;
            }
            return;
        }
        int monthLeapByYear = Util.getMonthLeapByYear(newYearFix);
        int monthLeapByYear2 = Util.getMonthLeapByYear(oldYearFix);
        if (monthLeapByYear == monthLeapByYear2) {
            int iConvertMonthSwayToMonthLunar = Util.convertMonthSwayToMonthLunar(value, monthLeapByYear2);
            int iConvertMonthSwayToMonthLunar2 = Util.convertMonthSwayToMonthLunar(value, monthLeapByYear);
            int sumOfDayInMonthForLunarByMonthLunar = Util.getSumOfDayInMonthForLunarByMonthLunar(oldYearFix, iConvertMonthSwayToMonthLunar);
            int sumOfDayInMonthForLunarByMonthLunar2 = Util.getSumOfDayInMonthForLunarByMonthLunar(newYearFix, iConvertMonthSwayToMonthLunar2);
            if (sumOfDayInMonthForLunarByMonthLunar == sumOfDayInMonthForLunarByMonthLunar2) {
                OnDateChangedListener onDateChangedListener3 = this.mOnDateChangedListener;
                if (onDateChangedListener3 != null) {
                    onDateChangedListener3.onDateChanged(getCalendarData(newYearFix, value, value2, isGregorian));
                    return;
                }
                return;
            }
            if (value2 > sumOfDayInMonthForLunarByMonthLunar2) {
                value2 = sumOfDayInMonthForLunarByMonthLunar2;
            }
            setValuesForPickerView(this.mDayPickerView, value2, 1, sumOfDayInMonthForLunarByMonthLunar2, this.mDisplayDaysLunar, true, true);
            OnDateChangedListener onDateChangedListener4 = this.mOnDateChangedListener;
            if (onDateChangedListener4 != null) {
                onDateChangedListener4.onDateChanged(getCalendarData(newYearFix, value, value2, isGregorian));
                return;
            }
            return;
        }
        this.mCurrDisplayMonthsLunar = Util.getLunarMonthsNamesWithLeap(monthLeapByYear);
        int iConvertMonthLunarToMonthSway = Util.convertMonthLunarToMonthSway(Math.abs(Util.convertMonthSwayToMonthLunar(value, monthLeapByYear2)), monthLeapByYear);
        setValuesForPickerView(this.mMonthPickerView, iConvertMonthLunarToMonthSway, 1, monthLeapByYear == 0 ? 12 : 13, this.mCurrDisplayMonthsLunar, false, true);
        int sumOfDayInMonth3 = Util.getSumOfDayInMonth(oldYearFix, value, false);
        int sumOfDayInMonth4 = Util.getSumOfDayInMonth(newYearFix, iConvertMonthLunarToMonthSway, false);
        if (sumOfDayInMonth3 == sumOfDayInMonth4) {
            OnDateChangedListener onDateChangedListener5 = this.mOnDateChangedListener;
            if (onDateChangedListener5 != null) {
                onDateChangedListener5.onDateChanged(getCalendarData(newYearFix, iConvertMonthLunarToMonthSway, value2, isGregorian));
                return;
            }
            return;
        }
        if (value2 > sumOfDayInMonth4) {
            value2 = sumOfDayInMonth4;
        }
        setValuesForPickerView(this.mDayPickerView, value2, 1, sumOfDayInMonth4, this.mDisplayDaysLunar, true, true);
        OnDateChangedListener onDateChangedListener6 = this.mOnDateChangedListener;
        if (onDateChangedListener6 != null) {
            onDateChangedListener6.onDateChanged(getCalendarData(newYearFix, iConvertMonthLunarToMonthSway, value2, isGregorian));
        }
    }

    private void passiveUpdateDay(int oldYear, int newYear, int oldMonth, int newMonth, boolean isGregorian) {
        int value = this.mDayPickerView.getValue();
        int sumOfDayInMonth = Util.getSumOfDayInMonth(oldYear, oldMonth, isGregorian);
        int sumOfDayInMonth2 = Util.getSumOfDayInMonth(newYear, newMonth, isGregorian);
        if (sumOfDayInMonth == sumOfDayInMonth2) {
            OnDateChangedListener onDateChangedListener = this.mOnDateChangedListener;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(getCalendarData(newYear, newMonth, value, isGregorian));
                return;
            }
            return;
        }
        if (value > sumOfDayInMonth2) {
            value = sumOfDayInMonth2;
        }
        setValuesForPickerView(this.mDayPickerView, value, 1, sumOfDayInMonth2, isGregorian ? this.mDisplayDaysGregorian : this.mDisplayDaysLunar, true, true);
        OnDateChangedListener onDateChangedListener2 = this.mOnDateChangedListener;
        if (onDateChangedListener2 != null) {
            onDateChangedListener2.onDateChanged(getCalendarData(newYear, newMonth, value, isGregorian));
        }
    }

    public void setGregorian(boolean isGregorian, boolean anim) {
        if (this.mIsGregorian == isGregorian) {
            return;
        }
        ChineseCalendar chineseCalendar = (ChineseCalendar) getCalendarData().getCalendar();
        if (!checkCalendarAvailable(chineseCalendar, YEAR_START, YEAR_STOP, isGregorian)) {
            chineseCalendar = (ChineseCalendar) adjustCalendarByLimit(chineseCalendar, YEAR_START, YEAR_STOP, isGregorian);
        }
        this.mIsGregorian = isGregorian;
        setConfigs(chineseCalendar, isGregorian, anim);
    }

    private boolean checkCalendarAvailable(Calendar cc, int yearStart, int yearStop, boolean isGregorian) {
        int i = isGregorian ? cc.get(1) : ((ChineseCalendar) cc).get(801);
        return yearStart <= i && i <= yearStop;
    }

    public View getNumberPickerYear() {
        return this.mYearPickerView;
    }

    public View getNumberPickerMonth() {
        return this.mMonthPickerView;
    }

    public View getNumberPickerDay() {
        return this.mDayPickerView;
    }

    public void setNumberPickerYearVisibility(int visibility) {
        setNumberPickerVisibility(this.mYearPickerView, visibility);
    }

    public void setNumberPickerMonthVisibility(int visibility) {
        setNumberPickerVisibility(this.mMonthPickerView, visibility);
    }

    public void setNumberPickerDayVisibility(int visibility) {
        setNumberPickerVisibility(this.mDayPickerView, visibility);
    }

    public void setNumberPickerVisibility(NumberPickerView view, int visibility) {
        if (view.getVisibility() == visibility) {
            return;
        }
        if (visibility == 8 || visibility == 0 || visibility == 4) {
            view.setVisibility(visibility);
        }
    }

    public boolean getIsGregorian() {
        return this.mIsGregorian;
    }

    private CalendarData getCalendarData(int pickedYear, int pickedMonthSway, int pickedDay, boolean mIsGregorian) {
        return new CalendarData(pickedYear, pickedMonthSway, pickedDay, mIsGregorian);
    }

    public CalendarData getCalendarData() {
        return new CalendarData(this.mYearPickerView.getValue(), this.mMonthPickerView.getValue(), this.mDayPickerView.getValue(), this.mIsGregorian);
    }

    public static class CalendarData {
        public ChineseCalendar chineseCalendar;
        public boolean isGregorian;
        public int pickedDay;
        public int pickedMonthSway;
        public int pickedYear;

        public CalendarData(int pickedYear, int pickedMonthSway, int pickedDay, boolean isGregorian) {
            this.pickedYear = pickedYear;
            this.pickedMonthSway = pickedMonthSway;
            this.pickedDay = pickedDay;
            this.isGregorian = isGregorian;
            initChineseCalendar();
        }

        private void initChineseCalendar() {
            if (this.isGregorian) {
                this.chineseCalendar = new ChineseCalendar(this.pickedYear, this.pickedMonthSway - 1, this.pickedDay);
            } else {
                int i = this.pickedYear;
                this.chineseCalendar = new ChineseCalendar(true, i, Util.convertMonthSwayToMonthLunarByYear(this.pickedMonthSway, i), this.pickedDay);
            }
        }

        public Calendar getCalendar() {
            return this.chineseCalendar;
        }
    }

    public void setOnDateChangedListener(OnDateChangedListener listener) {
        this.mOnDateChangedListener = listener;
    }
}