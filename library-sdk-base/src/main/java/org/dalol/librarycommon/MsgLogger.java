package org.dalol.librarycommon;

import android.util.Log;

/**
 * @author Filippo
 * @version 1.0.0
 * @since Sun, 14/10/2018 at 18:50.
 */
public class MsgLogger {

    public static void iLog(String tag, String message) {
        Log.i(tag, message);
    }

    public static void vLog(String tag, String message) {
        Log.v(tag, message);
    }

    public static void dLog(String tag, String message) {
        Log.d(tag, message);
    }

    public static void wLog(String tag, String message) {
        Log.w(tag, message);
    }

    public static void wtfLog(String tag, String message) {
        Log.wtf(tag, message);
    }

    public static void eLog(String tag, String message) {
        Log.e(tag, message);
    }
}
