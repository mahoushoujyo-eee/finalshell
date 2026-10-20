/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import java.util.concurrent.ThreadFactory;

public class PU
implements ThreadFactory {
    private static String[] o;

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        String[] stringArray = PU.l();
        thread.setDaemon(true);
        if (stringArray == null) {
            ky_2.K(new String[3]);
        }
        return thread;
    }

    public static void z(String[] stringArray) {
        o = stringArray;
    }

    public static String[] l() {
        return o;
    }

    static {
        if (PU.l() == null) {
            PU.z(new String[2]);
        }
    }
}

