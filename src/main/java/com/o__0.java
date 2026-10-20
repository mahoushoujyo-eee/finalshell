/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.og_2;
import java.awt.Color;
import java.awt.Insets;

/*
 * Renamed from com.o_
 */
public final class o__0 {
    public static Insets u;
    public static og_2 C;
    public static Color k;
    public static boolean U;
    public static Color v;
    public static Float l;
    public static og_2 j;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3394287280097680113L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = ";\u0095\u0084\u0099+\u00d9Z\u0017h\u00ec\u00f8\u00ed+\u00d9Z\u0017";
        int n11 = ";\u0095\u0084\u0099+\u00d9Z\u0017h\u00ec\u00f8\u00ed+\u00d9Z\u0017".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        u = GO.P;
        C = null;
        k = GO.R;
        U = false;
        v = new Color((int)lArray[0], (int)lArray[1], (int)lArray[1]);
        l = null;
        j = null;
    }
}

