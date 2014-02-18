package com.deyang.share.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: yudeyang
 * Date: 13-12-8
 * Time: 下午3:42
 * To change this template use File | Settings | File Templates.
 */
public class DateTimeUtil {
    private static final long serialVersionUID = 1L;

    private static final SimpleDateFormat dateTimeFormat = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm:ss");

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
            "yyyy-MM-dd");

    public static String getFormatedDateTimeString(Date date) {
        return dateTimeFormat.format(date);
    }


    public static String getFormatedDateString(Date date) {
        return dateFormat.format(date);
    }


    public static String getDateTimeStringByFormat(String format, Date date){
        String retVal = "";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        retVal = sdf.format(date);
        return retVal;
    }


    public static String getWeekOfDate(String strDate) {
        Date date = null;
        try {
            date = dateFormat.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return new SimpleDateFormat("EEEE").format(calendar.getTime());
    }


    public static String getCurrentDate() {
        Date today = new Date();
        return dateFormat.format(today);
    }


    public static String getCurrentDateTime() {
        Date today = new Date();
        return dateTimeFormat.format(today);
    }


    public static String getTodayStart() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date date = new Date(calendar.getTimeInMillis());
        return dateTimeFormat.format(date);
    }


    public static String getTodayEnd() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        Date date = new Date(calendar.getTimeInMillis());
        return dateTimeFormat.format(date);
    }


    public static String getDateStart(String strDate) {
        if (null == strDate || "".equals(strDate.trim())) {
            return "";
        }
        Date date = null;
        try {
            date = dateFormat.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateTimeFormat.format(date);
    }


    public static String getDateEnd(String strDate) {
        if (null == strDate || "".equals(strDate.trim())) {
            return "";
        }
        Date date = null;
        try {
            date = dateFormat.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 0);

        return dateTimeFormat.format(calendar.getTime());
    }


    public static String getMondayOfThisWeek() {
        Calendar calendar = Calendar.getInstance();
        int day_of_week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if (day_of_week == 0) {
            day_of_week = 7;
        }
        calendar.add(Calendar.DATE, -day_of_week + 1);
		/*
		 * calendar.set(Calendar.HOUR_OF_DAY, 0); calendar.set(Calendar.MINUTE,
		 * 0); calendar.set(Calendar.SECOND, 0);
		 * calendar.set(Calendar.MILLISECOND, 0);
		 */
        return dateFormat.format(calendar.getTime());
    }


    public static String getSundayOfThisWeek() {
        Calendar calendar = Calendar.getInstance();
        int day_of_week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if (day_of_week == 0) {
            day_of_week = 7;
        }
        calendar.add(Calendar.DATE, -day_of_week + 1);
		/*
		 * calendar.set(Calendar.HOUR_OF_DAY, 0); calendar.set(Calendar.MINUTE,
		 * 0); calendar.set(Calendar.SECOND, 0);
		 * calendar.set(Calendar.MILLISECOND, 0);
		 */
        // ����ȡ�õ�����һ
        calendar.add(Calendar.DATE, 6);
        return dateFormat.format(calendar.getTime());
    }


    public static String getMondayOfPreviousWeek() {
        Calendar calendar = Calendar.getInstance();
        int day_of_week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if (day_of_week == 0) {
            day_of_week = 7;
        }
        calendar.add(Calendar.DATE, -day_of_week + 1);
        calendar.add(Calendar.DATE, -7);
        return dateFormat.format(calendar.getTime());
    }


    public static String getSundayOfPreviousWeek() {
        Calendar calendar = Calendar.getInstance();
        int day_of_week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if (day_of_week == 0) {
            day_of_week = 7;
        }
        calendar.add(Calendar.DATE, -day_of_week + 1);
        calendar.add(Calendar.DATE, -1);
        return dateFormat.format(calendar.getTime());
    }


    public static String getMondayOfNextWeek() {
        Calendar calendar = Calendar.getInstance();
        int day_of_week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if (day_of_week == 0) {
            day_of_week = 7;
        }
        calendar.add(Calendar.DATE, -day_of_week + 1); // ������һ
        calendar.add(Calendar.DATE, 7);
        return dateFormat.format(calendar.getTime());
    }


    public static String getSundayOfNextWeek() {
        Calendar calendar = Calendar.getInstance();
        int day_of_week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if (day_of_week == 0) {
            day_of_week = 7;
        }
        calendar.add(Calendar.DATE, -day_of_week + 1); // ������һ
        calendar.add(Calendar.DATE, 13);
        return dateFormat.format(calendar.getTime());
    }


    public static String getFirstDayOfThisMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, 1); // ��Ϊ��ǰ�µ�1��
        return dateFormat.format(calendar.getTime());
    }

    public static String getLastDayOfThisMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, 1);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DATE, -1);
        return dateFormat.format(calendar.getTime());
    }


    public static String getFirstDayOfPreviousMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, 1); // ��Ϊ��ǰ�µ�1��
        calendar.add(Calendar.MONTH, -1); // ��һ���£���Ϊ���µ�1��
        return dateFormat.format(calendar.getTime());
    }


    public static String getLastDayOfPreviousMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, 1); // ��Ϊ��ǰ�µ�1��
        calendar.add(Calendar.DATE, -1); // ��ȥһ�죬��Ϊ�������һ��
        return dateFormat.format(calendar.getTime());
    }


    public static String getFirstDayOfNextMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1); // ��һ����
        calendar.set(Calendar.DATE, 1); // ����������Ϊ���µ�һ��
        return dateFormat.format(calendar.getTime());
    }


    public static String getLastDayOfNextMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);// ��һ����
        calendar.set(Calendar.DATE, 1);// ����������Ϊ���µ�һ��
        calendar.roll(Calendar.DATE, -1);// ���ڻع�һ�죬Ҳ���Ǳ������һ��
        return dateFormat.format(calendar.getTime());
    }


    public static int getTotalDaysOfThisYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, 1);// ��������Ϊ�����һ��
        calendar.roll(Calendar.DAY_OF_YEAR, -1);// �����ڻع�һ�졣
        int totalDays = calendar.get(Calendar.DAY_OF_YEAR);
        return totalDays;
    }


    public static int getLastDayOfMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
        return 0;
    }


    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    public static String getFirstDayOfThisYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_YEAR, 1);
        Date date = new Date(calendar.getTimeInMillis());
        return dateFormat.format(date);
    }


    public static String getLastDayOfThisYear() {
        Date date = new Date();
        String years = new SimpleDateFormat("yyyy").format(date);
        return years + "-12-31";
    }


    public static String getFirstDayOfPreviousYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -1); // ���� �����Ϊ������1����
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_YEAR, 1);
        Date date = new Date(calendar.getTimeInMillis());
        return dateFormat.format(date);
    }

    public static long getDaysBetweenDate(String date1, String date2) {
        if (date1 == null || "".equals(date1.trim())) {
            return 0;
        }
        if (date2 == null || "".equals(date2.trim())) {
            return 0;
        }
        Date date = null;
        Date mydate = null;
        try {
            date = dateFormat.parse(date1);
            mydate = dateFormat.parse(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long day = 0;
        if (date.before(mydate)) {
            day = (mydate.getTime() - date.getTime()) / (24 * 60 * 60 * 1000);
        } else {
            day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
        }
        return day;
    }
}
