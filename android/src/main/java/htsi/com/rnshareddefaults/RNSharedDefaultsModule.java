package htsi.com.rnshareddefaults;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;

import java.util.Map;

/**
 * Created by sunnypointios on 9/7/17.
 */

class RNSharedDefaultsModule extends ReactContextBaseJavaModule {

    private String mName;

    public RNSharedDefaultsModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RNSharedDefaults";
    }

    @ReactMethod
    public void setFileName(String name) {
        this.mName = name;
    }

    @ReactMethod
    public  void allObjects(Promise promise) {
        SharedPreferencesHandler.init(getReactApplicationContext(), this.mName);
        Map<String, ?> keyValues = SharedPreferencesHandler.getInstance().getAllSharedData();
        WritableMap map = Arguments.createMap();
        for(Map.Entry<String,?> entry : keyValues.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                map.putString(key, (String) value);
            } else if (value instanceof Boolean) {
                map.putBoolean(key, (Boolean) value);
            } else if (value instanceof Integer) {
                map.putInt(key, (Integer) value);
            } else if (value instanceof Long) {
                map.putDouble(key, (Long) value);
            } else if (value instanceof Float) {
                map.putDouble(key, (Float) value);
            }
        }
        promise.resolve(map);
    }

    @ReactMethod
    public void setBool(boolean object, String key) {
        SharedPreferencesHandler.init(getReactApplicationContext(), this.mName);
        SharedPreferencesHandler.getInstance().putExtra(key, object);
    }

    @ReactMethod
    public void setString(String object, String key) {
        SharedPreferencesHandler.init(getReactApplicationContext(), this.mName);
        SharedPreferencesHandler.getInstance().putExtra(key, object);
    }

    @ReactMethod
    public void setInt(int object, String key) {
        SharedPreferencesHandler.init(getReactApplicationContext(), this.mName);
        SharedPreferencesHandler.getInstance().putExtra(key, object);
    }

    @ReactMethod
    public void setDouble(double object, String key) {
        SharedPreferencesHandler.init(getReactApplicationContext(), this.mName);
        SharedPreferencesHandler.getInstance().putExtra(key, object);
    }

    @ReactMethod
    public void setLong(double object, String key) {
        SharedPreferencesHandler.init(getReactApplicationContext(), this.mName);
        SharedPreferencesHandler.getInstance().putExtra(key, object);
    }

    @ReactMethod
    public void getBool(String key, Promise promise) {
        SharedPreferencesHandler.init(getReactApplicationContext(), this.mName);
        promise.resolve(SharedPreferencesHandler.getInstance().getBoolean(key));
    }

    @ReactMethod
    public void getString(String key, Promise promise) {
        SharedPreferencesHandler.init(getReactApplicationContext(), this.mName);
        promise.resolve(SharedPreferencesHandler.getInstance().getString(key));
    }

    @ReactMethod
    public void getInt(String key, Promise promise) {
        SharedPreferencesHandler.init(getReactApplicationContext(), this.mName);
        promise.resolve(SharedPreferencesHandler.getInstance().getInt(key));
    }

    @ReactMethod
    public void getDouble(String key, Promise promise) {
        SharedPreferencesHandler.init(getReactApplicationContext(), this.mName);
        promise.resolve(SharedPreferencesHandler.getInstance().getFloat(key));
    }

    @ReactMethod
    public void getLong(String key, Promise promise) {
        SharedPreferencesHandler.init(getReactApplicationContext(), this.mName);
        promise.resolve(SharedPreferencesHandler.getInstance().getLong(key));
    }
}
