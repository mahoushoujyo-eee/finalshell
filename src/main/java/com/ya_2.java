/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.yx_2;

/*
 * Renamed from com.ya
 */
public class ya_2
extends yx_2 {
    private final byte[] b = new byte[ya_2.b(14356, 739317319887751021L)];
    private static final String f;
    private static final long[] k;
    private static final Integer[] l;

    public ya_2() {
        this.N = f;
    }

    @Override
    public int h() {
        return ya_2.b(26564, 4353087614314076348L);
    }

    @Override
    public void U(byte[] byArray, int n10) {
        super.U(this.b, 0);
        System.arraycopy(this.b, 0, byArray, n10, ya_2.b(16139, 3268082584422678640L));
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
                char[] cArray3 = "pE\u001d@VY%-\u0005E\u0015".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 62;
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
                            n17 = 38;
                            break;
                        }
                        case 1: {
                            n17 = 22;
                            break;
                        }
                        case 2: {
                            n17 = 66;
                            break;
                        }
                        case 3: {
                            n17 = 29;
                            break;
                        }
                        case 4: {
                            n17 = 69;
                            break;
                        }
                        case 5: {
                            n17 = 10;
                            break;
                        }
                        default: {
                            n17 = 127;
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
        f = new String(cArray).intern();
        long l2 = 3871706730480718190L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\"|~`l\u00fe\u00d6\u0013_V\u0004\u00c7\u0007\u009d\t\u00de\u0093^$#\u00bd\u00edQ\u0012";
        int n19 = "\"|~`l\u00fe\u00d6\u0013_V\u0004\u00c7\u0007\u009d\t\u00de\u0093^$#\u00bd\u00edQ\u0012".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        k = lArray;
        l = new Integer[3];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3F79;
        if (l[n11] == null) {
            ya_2.l[n11] = (int)(k[n11] ^ l2);
        }
        return l[n11];
    }
}

