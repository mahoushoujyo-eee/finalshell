/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Stroke;

public final class _Q {
    public static Color r;
    public static Color X;
    public static Color B;
    public static Color Q;
    public static Color D;
    public static Color d;
    public static Color H;
    public static int l;
    public static int a;
    public static Insets I;
    public static boolean v;
    public static boolean L;
    public static Stroke t;
    public static int S;
    public static int Y;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7781003669659131827L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00d1q\u0088\u00a5\u00ae\u000b\u001f\u00a3P7\u0015+\u00ae\u000b\u001f\u00a3";
        int n11 = "\u00d1q\u0088\u00a5\u00ae\u000b\u001f\u00a3P7\u0015+\u00ae\u000b\u001f\u00a3".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        r = GO.N;
        X = GO.Ff;
        B = GO.FX;
        Q = GO.FR;
        D = GO.Q;
        d = GO.Fm;
        H = GO.Fo;
        l = GO.Fx;
        a = GO.FG;
        I = GO.P;
        v = GO.k;
        L = GO.F2;
        t = new BasicStroke(1.5f);
        S = (int)lArray[1];
        Y = (int)lArray[0];
    }
}

