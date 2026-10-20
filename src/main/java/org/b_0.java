/*
 * Decompiled with CFR 0.152.
 */
package org;

import org.F.c;
import org.I;
import org.d_0;

/*
 * Renamed from org.b
 */
public class b_0
extends d_0 {
    private static String[] u;

    public b_0(String string, @c I i2) {
        super(string, i2);
    }

    public b_0(String string, @c I i2, Throwable throwable) {
        super(string, i2, throwable);
    }

    public static void Q(String[] stringArray) {
        u = stringArray;
    }

    public static String[] d() {
        return u;
    }

    static {
        if (b_0.d() != null) {
            b_0.Q(new String[3]);
        }
    }
}

