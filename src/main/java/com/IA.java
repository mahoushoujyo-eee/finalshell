/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.a9;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

public final class IA {
    public static int t;
    public static int i;
    public static Dimension Y;
    public static Insets X;
    public static boolean W;
    public static Font G;
    public static Color x;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7815911595721060150L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00d1)c&\u0092\u00cfo=\u00a8~\u009d \u0092\u00cfo%\u0088\u00e8\u00a1o\u0092\u00cfo\"";
        int n11 = "\u00d1)c&\u0092\u00cfo=\u00a8~\u009d \u0092\u00cfo%\u0088\u00e8\u00a1o\u0092\u00cfo\"".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        t = GO.FG;
        i = (int)lArray[2];
        Y = new Dimension((int)lArray[0], (int)lArray[1]);
        X = GO.P;
        W = true;
        G = a9.zD.deriveFont(10.0f);
        x = Color.BLACK;
    }
}

