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
 * Renamed from com.Qf
 */
class qf_0
extends qi_0 {
    private static final String a;
    private static final long d;

    qf_0() {
    }

    @Override
    public void Q(DI dI, dm_2 dm_22) throws Exception {
        boolean bl;
        uJ uJ2;
        YU yU;
        block2: {
            block3: {
                super.Q(dI, dm_22);
                this.T(false);
                uJ uJ3 = new uJ();
                yU = new YU(uJ3);
                boolean bl2 = dm_2.J();
                yU.M();
                uJ3.V((byte)d);
                boolean bl3 = bl2;
                try {
                    uJ3.u(dm_22.J());
                    uJ3.q(E8.J(a));
                    uJ2 = uJ3;
                    bl = this.K();
                    if (bl3) break block2;
                    if (!bl) break block3;
                }
                catch (Exception exception) {
                    throw qf_0.b(exception);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        uJ2.V((byte)(bl ? 1 : 0));
        this.C(yU);
        dI.iu = true;
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
                char[] cArray3 = "\ba-ITws\fz-\f\u000bse){)D\u0017eg\u0001::N\u0014".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 73;
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
                            n17 = 32;
                            break;
                        }
                        case 1: {
                            n17 = 93;
                            break;
                        }
                        case 2: {
                            n17 = 16;
                            break;
                        }
                        case 3: {
                            n17 = 104;
                            break;
                        }
                        case 4: {
                            n17 = 48;
                            break;
                        }
                        case 5: {
                            n17 = 95;
                            break;
                        }
                        default: {
                            n17 = 93;
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
        long l2 = 5890219856245163127L;
        d = 0xA41B511C64720415L ^ l2;
    }
}

