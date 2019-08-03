package com.example.logutils;

import android.util.Log;

public class LogDebug {
    public static String TAG = "SUPER_AWESOME_APP";
    public static void d(String message){
        Log.d(TAG,message);
    }
}
