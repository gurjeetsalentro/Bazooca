package sharepref;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by user on 24-Aug-15.
 */
public class UserInfoShrePref {

    private static final String TAG = "UserInfoShrePref";
    private static final String KEY_DEVICE_ID = "Device_ID";
    private static final String KEY_STATUS = "Status";
    // Sharedpref file name
    private static final String PREF_NAME = "UserInfoSharePref";
    private static final String KEY_USER_ID = "UserId";
    private static final String KEY_EMAIL = "Email";
    private static final String KEY_PASSWORD = "Password";
    private static final String KEY_LOGIN_EMAIL = "LoginEmail";
    private static final String KEY_LOGIN_PASSWORD = "LoginPassword";
    private static final String KEY_LOGIN_REMEMBER_ME = "LoginRememberMe";
    private static final String KEY_LOGIN_FLAG = "LogInFlag";
    private static final String KEY_PROFILE_IMAGE = "ProfileImage";
    private static final String KEY_FIRST_NAME = "FirstName";
    private static final String KEY_LAST_NAME = "LastName";
    private static final String KEY_PHONE_NUMBER = "PhoneNumber";
    private static final String KEY_FIRST = "IsFirst";
    private static final String KEY_DATE_CREATED = "DateCreated";
    private static final String KEY_IS_REGISTERED = "IS_REGISTERED";
    // Shared pref mode
    static int PRIVATE_MODE = 0;
    // Editor for Shared preferences
    static SharedPreferences.Editor editor;

    public static void setProfileImage(Context context, String profile_image) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_PROFILE_IMAGE, profile_image);
        editor.commit();
    }

    public static String getProfileImage(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String profile_image = sharedPref.getString(KEY_PROFILE_IMAGE, "http://salentro.quicquik.com//ck//taxi//img//default.png");
        return profile_image;
    }

    public static void setPhoneNumber(Context context, String phone_no) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_PHONE_NUMBER, phone_no);
        editor.commit();
    }

    public static String getPhoneNumber(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String phone_no = sharedPref.getString(KEY_PHONE_NUMBER, "");
        return phone_no;
    }

    public static void setFirstName(Context context, String firstName) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_FIRST_NAME, firstName);
        editor.commit();
    }

    public static String getFirstName(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String email = sharedPref.getString(KEY_FIRST_NAME, "");
        return email;
    }

    public static void setLastName(Context context, String firstName) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_LAST_NAME, firstName);
        editor.commit();
    }

    public static String getLastName(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String email = sharedPref.getString(KEY_LAST_NAME, "");
        return email;
    }


    public static void setUserId(Context context, String userId) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_USER_ID, userId);
        editor.commit();
    }

    public static String getUserId(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String userId = sharedPref.getString(KEY_USER_ID, "NA");
        return userId;
    }

    public static void setEmail(Context context, String email) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_EMAIL, email);
        editor.commit();
    }

    public static String getEmail(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String email = sharedPref.getString(KEY_EMAIL, "");
        return email;
    }


    public static void setLoginEmail(Context context, String email) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_LOGIN_EMAIL, email);
        editor.commit();
    }

    public static String getLoginEmail(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String email = sharedPref.getString(KEY_LOGIN_EMAIL, "");
        return email;
    }

    public static void setLoginPassword(Context context, String password) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_LOGIN_PASSWORD, password);
        editor.commit();
    }

    public static String getLoginPassword(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String password = sharedPref.getString(KEY_LOGIN_PASSWORD, "");
        return password;
    }

    public static void setRememberMe(Context context, boolean flag) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(KEY_LOGIN_REMEMBER_ME, flag);
        editor.commit();
    }

    public static boolean getRememberMe(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        boolean rememberMe = sharedPref.getBoolean(KEY_LOGIN_REMEMBER_ME, false);
        return rememberMe;
    }

    public static void setIsRegistered(Context context, boolean flag) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(KEY_IS_REGISTERED, flag);
        editor.commit();
    }

    public static boolean isRegistered(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        boolean login = sharedPref.getBoolean(KEY_IS_REGISTERED, false);
        return login;
    }

    public static void setStatus(Context context, boolean flag) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(KEY_STATUS, flag);
        editor.commit();
    }

    public static boolean getStatus(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        boolean login = sharedPref.getBoolean(KEY_STATUS, false);
        return login;
    }

    public static void setLogInFlag(Context context, boolean flag) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(KEY_LOGIN_FLAG, flag);
        editor.commit();
    }

    public static boolean isLogInFlag(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        boolean login = sharedPref.getBoolean(KEY_LOGIN_FLAG, false);
        return login;
    }

    public static void setFirstTime(Context context, boolean flag) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(KEY_FIRST, flag);
        editor.commit();
    }

    public static boolean isFirstTime(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        boolean login = sharedPref.getBoolean(KEY_FIRST, false);
        return login;
    }

    public static void setDateCreated(Context context, String dateModified) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_DATE_CREATED, dateModified);
        editor.commit();
    }

    public static String getDateCreated(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String dateModified = sharedPref.getString(KEY_DATE_CREATED, "");
        return dateModified;
    }


    public static void setDeviceID(Context context, String deviceType) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_DEVICE_ID, deviceType);
        editor.commit();
    }

    public static String getDeviceID(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        String deviceType = sharedPref.getString(KEY_DEVICE_ID, "");
        return deviceType;
    }

    public static void clearSharePref(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        sharedPref.edit().clear().commit();
        return;
    }

}
