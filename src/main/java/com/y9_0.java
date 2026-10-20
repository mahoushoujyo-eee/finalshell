/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.y1_0;

/*
 * Renamed from com.y9
 */
public class y9_0
extends y1_0 {
    private final byte[] D = new byte[y9_0.b(15577, 1517793645032144345L)];
    private static final String f;
    private static final long[] k;
    private static final Integer[] l;

    public y9_0() {
        this.N = f;
    }

    @Override
    public int h() {
        return y9_0.b(7080, 7106674098521397930L);
    }

    @Override
    public void U(byte[] byArray, int n10) {
        super.U(this.D, 0);
        System.arraycopy(this.D, 0, byArray, n10, y9_0.b(6771, 7605531016987138930L));
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
                char[] cArray3 = "z:NaN\u0017Tsf\u0002;U".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 67;
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
                            n17 = 81;
                            break;
                        }
                        case 1: {
                            n17 = 20;
                            break;
                        }
                        case 2: {
                            n17 = 108;
                            break;
                        }
                        case 3: {
                            n17 = 65;
                            break;
                        }
                        case 4: {
                            n17 = 32;
                            break;
                        }
                        case 5: {
                            n17 = 39;
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
        long l2 = 2803924732131640658L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u001fa\u00d4&m\u00df\u00f8\u009f\u0094S\u009c\u00a2 \u0018^,\u00begH\u00f7\u00bbu\u00df\u00f4";
        int n19 = "\u001fa\u00d4&m\u00df\u00f8\u009f\u0094S\u009c\u00a2 \u0018^,\u00begH\u00f7\u00bbu\u00df\u00f4".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4100;
        if (l[n11] == null) {
            y9_0.l[n11] = (int)(k[n11] ^ l2);
        }
        return l[n11];
    }
}

