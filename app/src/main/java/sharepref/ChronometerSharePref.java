package sharepref;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;


/**
 * Created by pc5 on 8/13/2015.
 */
public class ChronometerSharePref {

    private static final String TAG = "ChronometerSharePref";
    // Sharedpref file name
    private static final String PREF_NAME = "ChronometerSharePref";
    private static final String KEY_RIDE_TIME_IN_MILLISECONDS = "RideTimeInMilliseconds";
    private static final String KEY_WAIT_TIME_IN_MILLISECONDS = "WaitTimeInMilliseconds";
    private static final String KEY_STOP_TIME_IN_MILLISECONDS = "StopTimeInMilliseconds";
    private static final String KEY_RIDE_TIME_IN_DATE = "RideTimeInDate";
    private static final String KEY_WAIT_TIME_IN_DATE = "WaitTimeInDate";
    private static final String KEY_STOP_TIME_IN_DATE = "StopTimeInDate";
    private static final String KEY_WHICH_TIMER_IS_RUNNING = "WhichTimerIsRunning";
    private static final String KEY_HAS_SERVICE_STOPPED = "HasServiceStopped";
    // Shared pref mode
    static int PRIVATE_MODE = 0;
    // Editor for Shared preferences
    static Editor editor;

    public static String getRideTimeInDate(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String date = sharedPref.getString(KEY_RIDE_TIME_IN_DATE, "0000-00-00 00:00:00");
        return date;
    }

    public static void setRideTimeInDate(Context context, String date) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_TIME_IN_DATE, date);
        editor.commit();
    }

    public static String getStopTimeInDate(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String date = sharedPref.getString(KEY_STOP_TIME_IN_DATE, "0000-00-00 00:00:00");
        return date;
    }

    public static void setStopTimeInDate(Context context, String date) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        Editor editor = sharedPref.edit();
        editor.putString(KEY_STOP_TIME_IN_DATE, date);
        editor.commit();
    }

    public static String getWaitTimeInDate(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String date = sharedPref.getString(KEY_WAIT_TIME_IN_DATE, "0000-00-00 00:00:00");
        return date;
    }

    public static void setWaitTimeInDate(Context context, String date) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        Editor editor = sharedPref.edit();
        editor.putString(KEY_WAIT_TIME_IN_DATE, date);
        editor.commit();
    }

    public static long getRideTimeInMiliseconds(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        long timeInMiliseconds = sharedPref.getLong(KEY_RIDE_TIME_IN_MILLISECONDS, 0);
        return timeInMiliseconds;
    }

    public static void setRideTimeInMiliseconds(Context context, long timeInMiliseconds) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        Editor editor = sharedPref.edit();
        editor.putLong(KEY_RIDE_TIME_IN_MILLISECONDS, timeInMiliseconds);
        editor.commit();
    }

    public static long getStopTimeInMiliseconds(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        long timeInMiliseconds = sharedPref.getLong(KEY_STOP_TIME_IN_MILLISECONDS, 0);
        return timeInMiliseconds;
    }

    public static void setStopTimeInMiliseconds(Context context, long timeInMiliseconds) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        Editor editor = sharedPref.edit();
        editor.putLong(KEY_STOP_TIME_IN_MILLISECONDS, timeInMiliseconds);
        editor.commit();
    }

    public static long getWaitTimeInMiliseconds(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        long timeInMiliseconds = sharedPref.getLong(KEY_WAIT_TIME_IN_MILLISECONDS, 0);
        return timeInMiliseconds;
    }

    public static void setWaitTimeInMiliseconds(Context context, long timeInMiliseconds) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        Editor editor = sharedPref.edit();
        editor.putLong(KEY_WAIT_TIME_IN_MILLISECONDS, timeInMiliseconds);
        editor.commit();
    }

    public static String getWhichTimerIsRunning(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String timer = sharedPref.getString(KEY_WHICH_TIMER_IS_RUNNING, "NA");
        return timer;
    }

    public static void setWhichTimerIsRunning(Context context, String timer) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        Editor editor = sharedPref.edit();
        editor.putString(KEY_WHICH_TIMER_IS_RUNNING, timer);
        editor.commit();
    }

    public static void clearSharePref(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        sharedPref.edit().clear().commit();
        return;
    }
}
