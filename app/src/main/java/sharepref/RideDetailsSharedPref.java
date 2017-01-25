package sharepref;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by user on 18-Aug-15.
 */
public class RideDetailsSharedPref {

    private static final String TAG = "JobHoursDetailsSharPref";
    private static final String KEY_RIDE_START_TIME = "RideStartTime";
    private static final String KEY_RIDE_END_TIME = "RideEndTime";
    private static final String KEY_RIDE_DESTINATION_ADDRESS = "RideDestinationAddress";
    private static final String KEY_RIDE_PICKUP_ADDRESS = "RidePickUpAddress";
    private static final String KEY_RIDE_DESTINATION_LONG = "RideDestinationLong";
    private static final String KEY_RIDE_DESTINATION_LAT = "RideDestinationLat";
    private static final String KEY_RIDE_PICKUP_LONG = "RidePickUpLong";
    private static final String KEY_RIDE_PICKUP_LAT = "RidePickUpLat";
    private static final String KEY_RIDE_CUSTOMER_NAME = "RideCustomerName";
    private static final String KEY_RIDE_CUSTOMER_PHONE = "RideCustomerPhone";
    private static final String KEY_RIDE_CUSTOMER_EMAIL = "RideCustomerEmail";
    private static final String KEY_RIDE_CUSTOMER_PROFILE_PIC = "RideCustomerProfilePic";
    private static final String KEY_RIDE_JOURNEY_DATE_TIME = "RideJourneyDateTime";
    private static final String KEY_LAST_CLASS = "LastClass";
    // Sharedpref file name
    private static final String PREF_NAME = "JobHoursDetailsSharPref";
    private static final String KEY_HAS_RIDE_STARTED = "HasRideStarted";
    private static final String KEY_HAS_STOP_STARTED = "HasStopStarted";
    private static final String KEY_HAS_WAIT_STARTED = "HasWaitStarted";
    private static final String KEY_IS_RIDE_ACCEPTED = "isRideAccepted";
    private static final String KEY_RIDE_ID = "ride_id";
    // Shared pref mode
    static int PRIVATE_MODE = 0;
    // Editor for Shared preferences
    static SharedPreferences.Editor editor;

    public static boolean getHasRideStarted(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        boolean hasRideStarted = sharedPref.getBoolean(KEY_HAS_RIDE_STARTED, false);
        return hasRideStarted;
    }

    public static void setHasRideStarted(Context context, boolean hasRideStarted) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(KEY_HAS_RIDE_STARTED, hasRideStarted);
        editor.commit();
    }

    public static boolean isRideAccepted(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        boolean hasRideStarted = sharedPref.getBoolean(KEY_IS_RIDE_ACCEPTED, false);
        return hasRideStarted;
    }

    public static void setIsRideAccepted(Context context, boolean isRideAccepted) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(KEY_IS_RIDE_ACCEPTED, isRideAccepted);
        editor.commit();
    }

    public static boolean getHasStopStarted(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        boolean hasRideStarted = sharedPref.getBoolean(KEY_HAS_STOP_STARTED, false);
        return hasRideStarted;
    }

    public static void setHasStopStarted(Context context, boolean hasRideStarted) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(KEY_HAS_STOP_STARTED, hasRideStarted);
        editor.commit();
    }

    public static boolean getHasWaitStarted(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        boolean hasRideStarted = sharedPref.getBoolean(KEY_HAS_WAIT_STARTED, false);
        return hasRideStarted;
    }

    public static void setHasWaitStarted(Context context, boolean hasRideStarted) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(KEY_HAS_WAIT_STARTED, hasRideStarted);
        editor.commit();
    }

    public static void setRideID(Context context, String ride_id) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_ID, ride_id);
        editor.commit();
    }

    public static String getRideID(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_RIDE_ID, "");
        return dateModified;
    }


    public static void setRideStartTime(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_START_TIME, dateModified);
        editor.commit();
    }

    public static String getRideStartTime(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_RIDE_START_TIME, "");
        return dateModified;
    }

    public static void setRideEndTime(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_END_TIME, dateModified);
        editor.commit();
    }

    public static String getRideEndTime(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_RIDE_END_TIME, "");
        return dateModified;
    }

    public static String getRideDestinationAddress(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_RIDE_DESTINATION_ADDRESS, "");
        return dateModified;
    }

    public static void setLastClass(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_LAST_CLASS, dateModified);
        editor.commit();
    }

    public static String getLastClass(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_LAST_CLASS, "");
        return dateModified;
    }

    public static void setRideDestinationAddress(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_DESTINATION_ADDRESS, dateModified);
        editor.commit();
    }

    public static String getRidePickUpAddress(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_RIDE_PICKUP_ADDRESS, "");
        return dateModified;
    }

    public static void setRidePickUpAddress(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_PICKUP_ADDRESS, dateModified);
        editor.commit();
    }

    public static String getRideDestinationLong(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_RIDE_DESTINATION_LONG, "00.0000");
        return dateModified;
    }

    public static void setRideDestinationLong(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_DESTINATION_LONG, dateModified);
        editor.commit();
    }

    public static String getRideDestinationLat(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_RIDE_DESTINATION_LAT, "00.0000");
        return dateModified;
    }

    public static void setRideDestinationLat(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_DESTINATION_LAT, dateModified);
        editor.commit();
    }

    public static String getRidePickUpLong(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_RIDE_PICKUP_LONG, "00.0000");
        return dateModified;
    }

    public static void setRidePickUpLong(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_PICKUP_LONG, dateModified);
        editor.commit();
    }

    public static String getRidePickUpLat(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_RIDE_PICKUP_LAT, "00.0000");
        return dateModified;
    }

    public static void setRidePickUpLat(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_CUSTOMER_NAME, dateModified);
        editor.commit();
    }

    public static String getRideCustomerName(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_RIDE_CUSTOMER_NAME, "");
        return dateModified;
    }

    public static void setRideCustomerName(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_CUSTOMER_NAME, dateModified);
        editor.commit();
    }

    public static String getRideCustomerPhone(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_RIDE_CUSTOMER_PHONE, "0123456789");
        return dateModified;
    }

    public static void setRideCustomerPhone(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_CUSTOMER_PHONE, dateModified);
        editor.commit();
    }

    public static String getRideCustomerEmail(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_RIDE_CUSTOMER_EMAIL, "");
        return dateModified;
    }

    public static void setRideCustomerEmail(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_CUSTOMER_EMAIL, dateModified);
        editor.commit();
    }

    public static String getRideCustomerProfilePic(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_RIDE_CUSTOMER_PROFILE_PIC, "");
        return dateModified;
    }

    public static void setRideCustomerProfilePic(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_RIDE_CUSTOMER_PROFILE_PIC, dateModified);
        editor.commit();
    }


    public static void clearSharePref(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        sharedPref.edit().clear().commit();
        return;
    }
}
