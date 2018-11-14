package htsi.com.rnshareddefaults;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Map;

/**
 * Created by sunnypointios on 9/7/17.
 */

public class SharedPreferencesHandler {

    private SharedPreferences mSharedPreferences;

    private static SharedPreferencesHandler mInstance;

    public static SharedPreferencesHandler getInstance() {
        return mInstance;
    }

    public SharedPreferencesHandler(Context context, String name) {
        mSharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    public static void init(Context context, String name) {
        if (mInstance != null) {
            return;
        }
        mInstance = new SharedPreferencesHandler(context, name);
    }

    public void putExtra(String key, Object value) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        if (value instanceof String) {
            editor.putString(key, (String) value).apply();
        } else if (value instanceof Boolean) {
            editor.putBoolean(key, (Boolean) value).apply();
        } else if (value instanceof Integer) {
            editor.putInt(key, (Integer) value).apply();
        } else if (value instanceof Long) {
            editor.putLong(key, (Long) value).apply();
        } else if (value instanceof Float) {
            editor.putFloat(key, (Float) value).apply();
        }
    }

    public String getString(String key) {
        return mSharedPreferences.getString(key, null);
    }

    public Float getFloat(String key) {
        return mSharedPreferences.getFloat(key, 0f);
    }

    public Long getLong(String key) {
        return mSharedPreferences.getLong(key, 0);
    }

    public Boolean getBoolean(String key) {
        return mSharedPreferences.getBoolean(key, false);
    }

    public Integer getInt(String key) {
        return mSharedPreferences.getInt(key, 0);
    }

    public void clear() {
        mSharedPreferences.edit().clear().apply();
    }

    public Map<String, ?> getAllSharedData(){
        return mSharedPreferences.getAll();
    }

    public void deleteKey(String key) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.remove(key);
        editor.apply();
    }

}
