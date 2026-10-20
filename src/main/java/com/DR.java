/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.og_2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

public final class DR {
    public static boolean u;
    public static boolean t;
    public static int C;
    public static boolean g;
    public static int L;
    public static boolean Z;
    public static boolean P;
    public static og_2 H;
    public static int b;
    public static Insets r;
    public static Insets A;
    public static String Y;
    public static Font W;
    public static Color G;
    public static int y;
    public static boolean K;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4164159327288047597L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00f3\u0003{Us\"7M\u00ba\u009c'\u008ds\"7M\u0099\u00dc\t\u0017s\"7\u00e7";
        int n11 = "\u00f3\u0003{Us\"7M\u00ba\u009c'\u008ds\"7M\u0099\u00dc\t\u0017s\"7\u00e7".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        u = GO.d;
        t = GO.X;
        C = GO.Fx;
        g = GO.Fe;
        L = GO.FG;
        Z = true;
        P = false;
        H = null;
        b = GO.FJ;
        r = new Insets(0, 0, 0, 0);
        A = new Insets(2, 2, 2, 2);
        Y = null;
        W = null;
        G = new Color((int)lArray[1], (int)lArray[0], (int)lArray[0]);
        y = (int)lArray[2];
        K = true;
    }
}

