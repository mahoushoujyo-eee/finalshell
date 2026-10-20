/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import java.awt.Rectangle;

/*
 * Renamed from com.yv
 */
public class yv_2
extends gt_1 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int n12 = 0;
        int[] nArray2 = new int[n10 * n11];
        String[] stringArray = W5.q();
        int n13 = 0;
        block0: while (true) {
            int n14 = n13;
            int n15 = n11;
            block1: while (n14 < n15) {
                int n16 = 0;
                while (n16 < n10) {
                    block11: {
                        int n17;
                        block12: {
                            int n18;
                            block16: {
                                int n19;
                                block15: {
                                    int n20;
                                    block14: {
                                        block13: {
                                            n17 = nArray[n13 * n10 + n16];
                                            if (stringArray == null) break block11;
                                            n14 = n17;
                                            n15 = yv_2.a(30003, 5415453996748147951L);
                                            if (stringArray == null) continue block1;
                                            if (n14 == n15) break block12;
                                            n20 = n13;
                                            if (stringArray == null) break block13;
                                            if (n20 <= 0) break block12;
                                            n20 = n16;
                                        }
                                        if (stringArray == null) break block14;
                                        if (n20 <= 0) break block12;
                                        n20 = 0;
                                    }
                                    int n21 = n20;
                                    n18 = nArray[n13 * n10 + n16 - 1];
                                    n19 = yv_2.a(11037, 1991015082252128960L);
                                    if (stringArray != null) {
                                        if (n18 == n19) {
                                            ++n21;
                                        }
                                        n18 = nArray[(n13 - 1) * n10 + n16];
                                        n19 = yv_2.a(11037, 1991015082252128960L);
                                    }
                                    if (stringArray != null) {
                                        if (n18 == n19) {
                                            ++n21;
                                        }
                                        n18 = nArray[(n13 - 1) * n10 + n16 - 1];
                                        n19 = yv_2.a(11037, 1991015082252128960L);
                                    }
                                    if (stringArray == null) break block15;
                                    if (n18 == n19) {
                                        // empty if block
                                    }
                                    n18 = ++n21;
                                    if (stringArray == null) break block16;
                                    n19 = 2;
                                }
                                if (n18 < n19) break block12;
                                n18 = -1;
                            }
                            n17 = n18;
                        }
                        nArray2[n12++] = n17;
                        ++n16;
                    }
                    if (stringArray != null) continue;
                }
                ++n13;
                if (stringArray != null) continue block0;
            }
            break;
        }
        return nArray2;
    }

    public String toString() {
        return a;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = " \u0004ev\u0006;A\\6po\u001c)\u0004@424A".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 104;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 27;
                            break;
                        }
                        case 1: {
                            n17 = 24;
                            break;
                        }
                        case 2: {
                            n17 = 116;
                            break;
                        }
                        case 3: {
                            n17 = 114;
                            break;
                        }
                        case 4: {
                            n17 = 7;
                            break;
                        }
                        case 5: {
                            n17 = 41;
                            break;
                        }
                        default: {
                            n17 = 76;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 1153244256504670011L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u001c\u00a5\u00a2\u00a2W-5\u00fb\u00ab\u00e5L\u00d9\u00ca\u009c\u00eb\u00d4";
        int n19 = "\u001c\u00a5\u00a2\u00a2W-5\u00fb\u00ab\u00e5L\u00d9\u00ca\u009c\u00eb\u00d4".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x79DD;
        if (c[n11] == null) {
            yv_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

