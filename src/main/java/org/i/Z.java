/*
 * Decompiled with CFR 0.152.
 */
package org.i;

import java.util.Iterator;
import java.util.List;
import org.i.M;
import org.i.l;

public class Z {
    public final String E;
    public final List C;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public Z(String string, List list) {
        this.E = string;
        this.C = list;
    }

    public String toString() {
        StringBuilder stringBuilder;
        block5: {
            List list;
            String string;
            block6: {
                stringBuilder = new StringBuilder(this.E);
                string = M.w();
                list = this.C;
                if (string == null) break block6;
                if (list.isEmpty()) break block5;
                list = this.C;
            }
            Iterator iterator = list.iterator();
            stringBuilder.append((char)Z.a(27425, 5233722792579288972L)).append(((l)iterator.next()).toString());
            while (iterator.hasNext()) {
                stringBuilder.append(a).append(((l)iterator.next()).toString());
                if (string != null) {
                    if (string != null) continue;
                }
                break block5;
            }
            stringBuilder.append((char)Z.a(15092, 7597099401763561048L));
        }
        return stringBuilder.toString();
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
                char[] cArray3 = "Y\u0006".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 40;
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
                            n17 = 93;
                            break;
                        }
                        case 1: {
                            n17 = 14;
                            break;
                        }
                        case 2: {
                            n17 = 71;
                            break;
                        }
                        case 3: {
                            n17 = 8;
                            break;
                        }
                        case 4: {
                            n17 = 25;
                            break;
                        }
                        case 5: {
                            n17 = 98;
                            break;
                        }
                        default: {
                            n17 = 68;
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
        long l2 = 5690185576154854112L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "M\u00b9\u0014\u00e1\u00b4O=P\u008d\u00ab\u00bf\u0001\u00a9\u00b1\u00ec\u0086";
        int n19 = "M\u00b9\u0014\u00e1\u00b4O=P\u008d\u00ab\u00bf\u0001\u00a9\u00b1\u00ec\u0086".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x24AD;
        if (c[n11] == null) {
            Z.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

