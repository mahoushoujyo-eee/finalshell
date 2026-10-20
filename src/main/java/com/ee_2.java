/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.og_2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

/*
 * Renamed from com.ee
 */
public final class ee_2 {
    public static boolean n;
    public static boolean X;
    public static int J;
    public static boolean k;
    public static int x;
    public static boolean u;
    public static boolean N;
    public static Color q;
    public static Color G;
    public static Color i;
    public static Color p;
    public static og_2 l;
    public static int O;
    public static Insets Q;
    public static Insets W;
    public static String h;
    public static Font K;
    public static Color j;
    public static int E;
    public static boolean S;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6320491227543759679L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00e5$\u00f9\u0010\u00b7\u00b7\u00eb\u009f=&\u00bcz\u00b7\u00b7\u00eb\u009f?\u0011\u0083\u001b\u00b7\u00b7\u00eb5";
        int n11 = "\u00e5$\u00f9\u0010\u00b7\u00b7\u00eb\u009f=&\u00bcz\u00b7\u00b7\u00eb\u009f?\u0011\u0083\u001b\u00b7\u00b7\u00eb5".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        n = GO.d;
        X = GO.X;
        J = 0;
        k = GO.Fe;
        x = GO.FG;
        u = true;
        N = false;
        q = Color.WHITE;
        G = Color.BLACK;
        i = Color.BLACK;
        p = Color.GRAY;
        l = null;
        O = GO.FJ;
        Q = new Insets(0, 0, 0, 0);
        W = new Insets(2, 2, 2, 2);
        h = null;
        K = null;
        j = new Color((int)lArray[1], (int)lArray[0], (int)lArray[0]);
        E = (int)lArray[2];
        S = true;
    }
}

