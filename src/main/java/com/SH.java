/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GN;
import com.dm_2;
import com.xe_0;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SH
implements GN {
    private static final Logger L = Logger.getLogger(xe_0.class.getName());

    @Override
    public boolean K(int n10) {
        return L.isLoggable(SH.Y(n10));
    }

    @Override
    public void t(int n10, String string) {
        this.c(n10, string, null);
    }

    @Override
    public void c(int n10, String string, Throwable throwable) {
        boolean bl = dm_2.F();
        if (bl) {
            if (throwable == null) {
                L.log(SH.Y(n10), string);
                return;
            }
            L.log(SH.Y(n10), string, throwable);
        }
    }

    static Level Y(int n10) {
        switch (n10) {
            case 0: {
                return Level.FINE;
            }
            case 1: {
                return Level.INFO;
            }
            case 2: {
                return Level.WARNING;
            }
            case 3: 
            case 4: {
                return Level.SEVERE;
            }
        }
        return Level.FINER;
    }
}

