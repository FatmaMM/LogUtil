package com.example.logutil;

import android.util.Log;

/**
 * Created by Android-2 on 12/13/2017.
 */

public class LogDailog {
    private static final String TAG = "LogDialogTag";

    public static void getSring(String message) {
        Log.e(TAG, message);
    }
}
