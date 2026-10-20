/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.P;
import org.v.B;
import org.v.RG;
import org.v.fU;
import org.v.hq_0;

class hD
extends hq_0 {
    private final fU N;
    private final fU y;
    private final fU p;
    final B z;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    hD(B b2, fU fU2, fU fU3, fU fU4) {
        this.z = b2;
        super(b2, null);
        this.N = fU2;
        this.y = fU3;
        this.p = fU4;
    }

    @Override
    public void W() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void i() {
        int n10;
        int n11;
        block9: {
            block10: {
                String[] stringArray;
                block8: {
                    stringArray = RG.C();
                    try {
                        try {
                            n11 = this.y.E;
                            n10 = -1;
                            if (stringArray == null) break block8;
                            if (n11 == n10) throw new P(a);
                        }
                        catch (P p2) {
                            throw hD.a(p2);
                        }
                        n11 = this.p.E;
                        n10 = -1;
                    }
                    catch (P p3) {
                        throw hD.a(p3);
                    }
                }
                try {
                    try {
                        if (stringArray == null) break block9;
                        if (n11 != n10) break block10;
                        throw new P(a);
                    }
                    catch (P p5) {
                        throw hD.a(p5);
                    }
                }
                catch (P p6) {
                    throw hD.a(p6);
                }
            }
            n11 = this.p.E;
            n10 = this.y.E;
        }
        int n12 = n11 - n10;
        byte[] byArray = new byte[]{(byte)(n12 >> hD.a(26203, 5755400069355521437L)), (byte)(n12 >> hD.a(7163, 1485853274894055487L)), (byte)(n12 >> hD.a(28043, 852927981213437516L)), (byte)n12};
        System.arraycopy(byArray, 0, B.s(this.z), this.N.E, 4);
    }

    static fU E(hD hD2) {
        return hD2.y;
    }

    static fU T(hD hD2) {
        return hD2.p;
    }

    private static P a(P p2) {
        return p2;
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
                char[] cArray3 = "#\b\u0015~7Rj\u0012\f\u0017\u007f;G>\u0005I\u0014v>U/\u0014I\u0019b9H)\bI\u000f\u007fxS$\u0013\f\u000f0<C9\u0014\u0000\u0015q,O%\u000eI\u0014v>U/\u0014".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 33;
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
                            n17 = 65;
                            break;
                        }
                        case 1: {
                            n17 = 72;
                            break;
                        }
                        case 2: {
                            n17 = 90;
                            break;
                        }
                        case 3: {
                            n17 = 49;
                            break;
                        }
                        case 4: {
                            n17 = 121;
                            break;
                        }
                        case 5: {
                            n17 = 7;
                            break;
                        }
                        default: {
                            n17 = 107;
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
        long l2 = 989219453243424840L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u00fb7\u00d5\r\u00a1J\u00c5\u00cd\u00a6H\u00808\u00d8L\u00ce\fJ\u00c6\u00b5\u00e8]\u00128g";
        int n19 = "\u00fb7\u00d5\r\u00a1J\u00c5\u00cd\u00a6H\u00808\u00d8L\u00ce\fJ\u00c6\u00b5\u00e8]\u00128g".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x23C6;
        if (c[n11] == null) {
            hD.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

