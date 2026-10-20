/*
 * Decompiled with CFR 0.152.
 */
package com.c;

import java.awt.Color;

public final class H {
    public static Color e;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2336384871572679195L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = ">\u00fb\u00a2\u00ecx\u00af\u00aaA(qs\u00c7x\u00af\u00aaA\u0085~^0x\u00af\u00aa\u00c7";
        int n11 = ">\u00fb\u00a2\u00ecx\u00af\u00aaA(qs\u00c7x\u00af\u00aaA\u0085~^0x\u00af\u00aa\u00c7".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        e = new Color((int)lArray[1], (int)lArray[0], (int)lArray[0], (int)lArray[2]);
    }
}

