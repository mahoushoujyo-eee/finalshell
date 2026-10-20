/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.Color;

/*
 * Renamed from com.xu
 */
public final class xu_2 {
    public static boolean L;
    public static boolean m;
    public static boolean e;
    public static Color H;
    public static Color T;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6090014267733229659L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "!\t\bN\u00d1L\u00c0?\u007f\t\u00f0\u008d\u00d1L\u00c0\u0093";
        int n11 = "!\t\bN\u00d1L\u00c0?\u007f\t\u00f0\u008d\u00d1L\u00c0\u0093".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        L = true;
        m = false;
        e = true;
        H = new Color(0, 0, (int)lArray[1]);
        T = new Color((int)lArray[0], 0, 0);
    }
}

