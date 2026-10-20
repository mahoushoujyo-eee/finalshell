/*
 * Decompiled with CFR 0.152.
 */
package org.H;

import com.ky_2;
import java.io.DataOutputStream;
import java.io.IOException;
import org.F.c;
import org.h.cr_0;
import org.h.n_0;

class L
extends n_0 {
    private final double u;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;

    L(double d2) {
        this.u = d2;
    }

    @Override
    public Object w(cr_0 cr_02) {
        return this.u;
    }

    @Override
    public boolean x() {
        return true;
    }

    @Override
    public void R(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(L.a(6365, 2108958419676507690L));
        dataOutputStream.writeDouble(this.u);
    }

    public String toString() {
        return b + this.u + ")";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@c Object object) {
        ky_2[] ky_2Array = cr_0.q();
        boolean bl = object instanceof L;
        if (ky_2Array == null) {
            if (!bl) return false;
            double d2 = ((L)object).u - this.u;
            bl = d2 == 0.0 ? (short)0 : (d2 > 0.0 ? (short)1 : -1);
        }
        if (ky_2Array != null) return bl;
        if (bl) return false;
        return true;
    }

    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.u);
        return (int)l2 ^ (int)(l2 >> L.a(22801, 3468460289844506599L));
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
                char[] cArray3 = "{to/<7\rlde\u0013\u001d\u0014/]dH\u0012\u000e\u0019k".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 26;
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
                            n17 = 34;
                            break;
                        }
                        case 1: {
                            n17 = 33;
                            break;
                        }
                        case 2: {
                            n17 = 59;
                            break;
                        }
                        case 3: {
                            n17 = 102;
                            break;
                        }
                        case 4: {
                            n17 = 114;
                            break;
                        }
                        case 5: {
                            n17 = 108;
                            break;
                        }
                        default: {
                            n17 = 89;
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
        b = new String(cArray).intern();
        long l2 = 1667289751014645484L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u00d7\u00e5\u00b2Q'Zq+\u00a0\u00bb\u0090\u0010\u00a8\u0003\u00b0\u00c0";
        int n19 = "\u00d7\u00e5\u00b2Q'Zq+\u00a0\u00bb\u0090\u0010\u00a8\u0003\u00b0\u00c0".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        c = lArray;
        d = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x36F6;
        if (d[n11] == null) {
            L.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

