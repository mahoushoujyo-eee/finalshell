/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hn_1;

/*
 * Renamed from com.hl
 */
public class hl_2
extends hn_1 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public hl_2() {
        this.O = true;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13 = n12 & hl_2.a(2464, 220348976969176372L);
        return n13 | ~n12 & hl_2.a(4231, 2365075589130505234L);
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
                char[] cArray3 = "\u000e`$GZ\u0000d\u0004a>MZ\u0007".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 110;
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
                            n17 = 35;
                            break;
                        }
                        case 1: {
                            n17 = 97;
                            break;
                        }
                        case 2: {
                            n17 = 38;
                            break;
                        }
                        case 3: {
                            n17 = 70;
                            break;
                        }
                        case 4: {
                            n17 = 70;
                            break;
                        }
                        case 5: {
                            n17 = 29;
                            break;
                        }
                        default: {
                            n17 = 37;
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
        long l2 = 8449374398057058232L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\n<\u000bC'\u0095<U\u00da^e\u00aeO\u00a6\u00da\u008c";
        int n19 = "\n<\u000bC'\u0095<U\u00da^e\u00aeO\u00a6\u00da\u008c".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5C95;
        if (c[n11] == null) {
            hl_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

