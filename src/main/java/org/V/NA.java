/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.I;
import org.v.RG;
import org.v.fE;
import org.v.fz_0;
import org.v.hV;
import org.v.hp_0;
import org.v.nt_0;
import org.v.x_0;
import org.v.x_1;

public final class NA
extends nt_0
implements hp_0 {
    public final hV[] N;
    public final String[] k;
    @c
    public final hp_0[] C;
    static final boolean f;
    private static final String d;
    private static final long[] e;
    private static final Integer[] h;

    public NA(I i2, hV[] hVArray, String[] stringArray, @c hp_0[] hp_0Array) {
        block6: {
            boolean bl;
            block5: {
                String[] stringArray2 = RG.C();
                super(i2);
                String[] stringArray3 = stringArray2;
                bl = f;
                if (stringArray3 == null) break block5;
                if (!bl && hVArray == null) {
                    throw new AssertionError();
                }
                this.N = hVArray;
                if (stringArray3 == null) break block6;
                bl = f;
            }
            if (!bl && stringArray == null) {
                throw new AssertionError();
            }
            this.k = stringArray;
            this.C = hp_0Array;
        }
    }

    @Override
    public void n(x_1 x_12) {
        block4: {
            hp_0[] hp_0Array;
            String[] stringArray;
            block3: {
                String[] stringArray2 = RG.C();
                super.n(x_12);
                stringArray = stringArray2;
                hp_0Array = this.C;
                if (stringArray == null) break block3;
                if (hp_0Array == null) break block4;
                hp_0Array = this.C;
            }
            for (hp_0 hp_02 : hp_0Array) {
                hp_02.n(x_12);
                if (stringArray != null) continue;
            }
        }
    }

    @Override
    public String toString() {
        String string;
        block6: {
            NA nA2;
            String string2;
            block5: {
                string2 = RG.N(this.N, " ");
                String[] stringArray = RG.C();
                nA2 = this;
                if (stringArray == null) break block5;
                if (nA2.N.length >= 1) {
                    string2 = string2 + (char)NA.a(24719, 3914022510489648698L);
                }
                string = string2 + RG.N(this.k, ".");
                if (stringArray == null) break block6;
                string2 = string;
                nA2 = this;
            }
            if (nA2.C != null) {
                string2 = string2 + (char)NA.a(1402, 7487801877993413582L) + RG.N(this.C, d) + ">";
            }
            string = string2;
        }
        return string;
    }

    @Override
    @c
    public Object p(x_0 x_02) throws Throwable {
        return x_02.u(this);
    }

    @Override
    @c
    public Object h(fz_0 fz_02) throws Throwable {
        return fz_02.u(this);
    }

    @Override
    @c
    public Object N(fE fE2) throws Throwable {
        return fE2.v(this);
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
                char[] cArray3 = "\u0006h".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 116;
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
                            n17 = 94;
                            break;
                        }
                        case 1: {
                            n17 = 60;
                            break;
                        }
                        case 2: {
                            n17 = 7;
                            break;
                        }
                        case 3: {
                            n17 = 79;
                            break;
                        }
                        case 4: {
                            n17 = 76;
                            break;
                        }
                        case 5: {
                            n17 = 102;
                            break;
                        }
                        default: {
                            n17 = 90;
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
        d = new String(cArray).intern();
        long l2 = 6239460787332754857L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u00d4\u00b3*\u008f\u00e4\u00bev[\u001au\u00a2\u001fNl\u0093\u00b3";
        int n19 = "\u00d4\u00b3*\u008f\u00e4\u00bev[\u001au\u00a2\u001fNl\u0093\u00b3".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        e = lArray;
        h = new Integer[2];
        f = !RG.class.desiredAssertionStatus();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5EB4;
        if (h[n11] == null) {
            NA.h[n11] = (int)(e[n11] ^ l2);
        }
        return h[n11];
    }
}

