/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import java.awt.Color;
import java.awt.Insets;

/*
 * Renamed from com.ci
 */
public final class ci_2 {
    public static Color S;
    public static Color s;
    public static boolean I;
    public static int O;
    public static int M;
    public static Insets p;
    public static boolean H;
    public static boolean e;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 9106272956191526278L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00bb\u00eaA\u008e\u00ad\u008a\u00cd,\u00f9\u0013wS\u00ad\u008a\u00cd,";
        int n11 = "\u00bb\u00eaA\u008e\u00ad\u008a\u00cd,\u00f9\u0013wS\u00ad\u008a\u00cd,".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        S = Color.LIGHT_GRAY;
        s = new Color((int)lArray[1], (int)lArray[0], (int)lArray[0]);
        I = GO.d;
        O = GO.Fx;
        M = GO.FG;
        p = GO.P;
        H = false;
        e = false;
    }
}

