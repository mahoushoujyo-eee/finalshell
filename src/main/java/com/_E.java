/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DE;
import com.G6;
import com.b.V;

public final class _E {
    public static boolean d;
    public static int M;
    public static int P;
    public static G6 z;
    public static V Z;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8194998609679021620L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00a0\u00ea[\u00c1\b\u00bc\u00f67\u00da:\u00bd\u00bb\b\u00bc\u00f67";
        int n11 = "\u00a0\u00ea[\u00c1\b\u00bc\u00f67\u00da:\u00bd\u00bb\b\u00bc\u00f67".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        d = true;
        M = (int)lArray[1];
        P = (int)lArray[0];
        z = G6.tiles;
        Z = DE.I;
    }
}

