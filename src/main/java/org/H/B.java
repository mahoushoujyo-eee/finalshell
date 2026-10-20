/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import java.io.DataOutputStream;
import java.io.IOException;
import org.F.c;
import org.h.y_0;

class B
implements y_0 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    B() {
    }

    @Override
    public int u() {
        return 1;
    }

    @Override
    public void H(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(B.a(26840, 8422470570156507264L));
    }

    public String toString() {
        return a;
    }

    public int hashCode() {
        return B.a(29208, 2851213699623606849L);
    }

    public boolean equals(@c Object object) {
        return object == this;
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
                char[] cArray3 = "\"Qv\u000b=2?6Sv\u001f1\"\u0002?Vl".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 89;
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
                            n17 = 14;
                            break;
                        }
                        case 1: {
                            n17 = 102;
                            break;
                        }
                        case 2: {
                            n17 = 70;
                            break;
                        }
                        case 3: {
                            n17 = 60;
                            break;
                        }
                        case 4: {
                            n17 = 13;
                            break;
                        }
                        case 5: {
                            n17 = 31;
                            break;
                        }
                        default: {
                            n17 = 15;
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
        long l2 = 2179042298542423084L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u0007U\u00df\u00e2\u00eaw\u00bc\u00aa\"8\u00e4\u0098\u000b\u00e1&k";
        int n19 = "\u0007U\u00df\u00e2\u00eaw\u00bc\u00aa\"8\u00e4\u0098\u000b\u00e1&k".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2858;
        if (c[n11] == null) {
            B.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

