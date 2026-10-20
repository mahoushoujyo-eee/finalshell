/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.bj_0;
import java.awt.Color;

/*
 * Renamed from com.ea
 */
public final class ea_2 {
    public static Color k;
    public static Color E;
    public static boolean V;
    public static int g;
    public static int b;
    public static bj_0 x;
    public static Color d;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 955669292193814778L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u008ag\u00b2\u00dak\u00f6\u0018\u0011\u00bd\u00eb9\u007fk\u00f6\u0018\u0011";
        int n11 = "\u008ag\u00b2\u00dak\u00f6\u0018\u0011\u00bd\u00eb9\u007fk\u00f6\u0018\u0011".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        k = GO.FR;
        E = new Color((int)lArray[0], (int)lArray[1], (int)lArray[1]);
        V = false;
        g = GO.FT;
        b = 0;
        x = bj_0.attached;
        d = GO.N;
    }
}

