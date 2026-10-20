/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DI;
import com.E8;
import com.YU;
import com.dm_2;
import com.qi_0;
import com.uJ;

/*
 * Renamed from com.Qh
 */
class qh_0
extends qi_0 {
    private byte[] h = new byte[0];
    private static final String a;
    private static final long d;

    qh_0(byte[] byArray) {
        this.h = byArray;
    }

    @Override
    public void Q(DI dI, dm_2 dm_22) throws Exception {
        boolean bl;
        uJ uJ2;
        YU yU;
        uJ uJ3;
        block2: {
            block3: {
                super.Q(dI, dm_22);
                uJ3 = new uJ();
                boolean bl2 = dm_2.F();
                yU = new YU(uJ3);
                yU.M();
                boolean bl3 = bl2;
                try {
                    uJ3.V((byte)d);
                    uJ3.u(dm_22.J());
                    uJ3.q(E8.J(a));
                    uJ2 = uJ3;
                    bl = this.K();
                    if (!bl3) break block2;
                    if (!bl) break block3;
                }
                catch (Exception exception) {
                    throw qh_0.b(exception);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        uJ2.V((byte)(bl ? 1 : 0));
        uJ3.X(4 + this.h.length);
        uJ3.q(this.h);
        this.C(yU);
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u000f;y\u0010".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 107;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
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
                            n17 = 1;
                            break;
                        }
                        case 1: {
                            n17 = 40;
                            break;
                        }
                        case 2: {
                            n17 = 119;
                            break;
                        }
                        case 3: {
                            n17 = 24;
                            break;
                        }
                        case 4: {
                            n17 = 59;
                            break;
                        }
                        case 5: {
                            n17 = 6;
                            break;
                        }
                        default: {
                            n17 = 108;
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
        long l2 = 4576108795913100817L;
        d = 0x408DC85F61F0DE73L ^ l2;
    }
}

