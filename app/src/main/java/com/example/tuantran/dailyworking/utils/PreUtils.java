package com.example.tuantran.dailyworking.utils;

import android.content.Context;
import android.content.SharedPreferences;

/*
*  Storing API Key in shared preferences to add in header part of every request retrofit
* */
public class PreUtils {
    private static String NAME_PRE = "APP_NAME";
    private static String API_KEY = "API_KEY";

    public PreUtils() {
    }

    private static SharedPreferences getSharedPreferences(Context context){
        return context.getSharedPreferences(NAME_PRE,Context.MODE_PRIVATE);
    }

    public static void storeAPIKey(Context context, String apiKey){
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(API_KEY,apiKey);
        editor.commit();
    }

    public static String getApiKey(Context context){
        return getSharedPreferences(context).getString(API_KEY,null);
    }
}
