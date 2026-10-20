/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.oW
 */
public final class ow_1 {
    public static boolean E;
    public static boolean c;
    public static boolean b;
    public static int G;
    public static int K;
    public static boolean U;
    public static boolean d;
    public static int x;
    public static boolean I;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6071725609101435962L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00adx\u00a7\"\u00a8\"$24\u00e0\u00e2\u001f\u00a8\"$$";
        int n11 = "\u00adx\u00a7\"\u00a8\"$24\u00e0\u00e2\u001f\u00a8\"$$".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        E = true;
        c = true;
        b = true;
        G = 0;
        K = (int)lArray[1];
        U = true;
        d = false;
        x = (int)lArray[0];
        I = false;
    }
}

