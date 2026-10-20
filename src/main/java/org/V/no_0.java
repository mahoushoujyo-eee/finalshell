/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.N5;
import org.v.NV;
import org.v.N_;
import org.v.RG;
import org.v._w_0;
import org.v.hP;

/*
 * Renamed from org.v.No
 */
public final class no_0
extends N5 {
    @c
    public final N_ l;
    @c
    hP L;
    private static final String a;
    private static final long[] d;
    private static final Integer[] f;

    public no_0(I i2, @c N_ n_3, String string, NV[] nVArray) {
        super(i2, string, nVArray);
        this.l = n_3;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder;
        block5: {
            stringBuilder = new StringBuilder();
            String[] stringArray = RG.C();
            if (stringArray != null) {
                if (this.l != null) {
                    stringBuilder.append(this.l.toString()).append((char)no_0.a(1607, 9112999455519398289L));
                }
                stringBuilder.append(this.i).append((char)no_0.a(18117, 3392281145300523281L));
            }
            for (int i2 = 0; i2 < this.w.length; ++i2) {
                if (stringArray != null) {
                    if (i2 > 0) {
                        stringBuilder.append(a);
                    }
                    stringBuilder.append(this.w[i2].toString());
                    if (stringArray != null) continue;
                }
                break block5;
            }
            stringBuilder.append((char)no_0.a(1426, 8093902826367113799L));
        }
        return stringBuilder.toString();
    }

    @Override
    @c
    public Object i(_w_0 _w_02) throws Throwable {
        return _w_02.W(this);
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
                char[] cArray3 = "Qv".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 114;
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
                            n17 = 15;
                            break;
                        }
                        case 1: {
                            n17 = 36;
                            break;
                        }
                        case 2: {
                            n17 = 105;
                            break;
                        }
                        case 3: {
                            n17 = 96;
                            break;
                        }
                        case 4: {
                            n17 = 94;
                            break;
                        }
                        case 5: {
                            n17 = 69;
                            break;
                        }
                        default: {
                            n17 = 81;
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
        long l2 = 6411260078894738663L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "*?|\u00f2N\u00cdu\u00de+\r\u0084\u009aq\r\u00b6\u0089\u00b5\u00c8\u00fe\u00ae\u0015\u00a65X";
        int n19 = "*?|\u00f2N\u00cdu\u00de+\r\u0084\u009aq\r\u00b6\u0089\u00b5\u00c8\u00fe\u00ae\u0015\u00a65X".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        d = lArray;
        f = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5FD4;
        if (f[n11] == null) {
            no_0.f[n11] = (int)(d[n11] ^ l2);
        }
        return f[n11];
    }
}

