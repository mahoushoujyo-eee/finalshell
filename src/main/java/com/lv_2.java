/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.og_2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

/*
 * Renamed from com.lv
 */
public final class lv_2 {
    public static Insets G;
    public static String n;
    public static Font U;
    public static Color m;
    public static int q;
    public static int K;
    public static boolean V;
    public static og_2 R;
    public static Color o;
    public static Color k;
    public static Color P;
    public static Color g;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2215293657539704676L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00d6\u00d7\u008b\u0094*\u00d4w\u00c4\u00a0\u00ea\u00cb\u00c1*\u00d4w\u00c4";
        int n11 = "\u00d6\u00d7\u008b\u0094*\u00d4w\u00c4\u00a0\u00ea\u00cb\u00c1*\u00d4w\u00c4".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        G = new Insets(2, 2, 2, 2);
        n = null;
        U = null;
        m = new Color((int)lArray[1], (int)lArray[0], (int)lArray[0]);
        q = 0;
        K = 0;
        V = true;
        R = null;
        o = Color.WHITE;
        k = Color.BLACK;
        P = Color.BLACK;
        g = Color.GRAY;
    }
}

