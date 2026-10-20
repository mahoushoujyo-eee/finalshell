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

class Q4
extends qi_0 {
    private String U = null;
    private static final String a;
    private static final long d;

    Q4() {
    }

    public void J(DI dI, dm_2 dm_22, String string, boolean bl) throws Exception {
        this.T(bl);
        this.U = string;
        this.Q(dI, dm_22);
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
                yU = new YU(uJ3);
                boolean bl2 = dm_2.F();
                try {
                    yU.M();
                    uJ3.V((byte)d);
                    uJ3.u(dm_22.J());
                    uJ3.q(E8.J(a));
                    uJ2 = uJ3;
                    bl = this.K();
                    if (!bl2) break block2;
                    if (!bl) break block3;
                }
                catch (Exception exception) {
                    throw Q4.b(exception);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        uJ2.V((byte)(bl ? 1 : 0));
        uJ3.q(E8.J(this.U));
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
                char[] cArray3 = ",$F\u000b%_n:<".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 1;
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
                            n17 = 94;
                            break;
                        }
                        case 1: {
                            n17 = 80;
                            break;
                        }
                        case 2: {
                            n17 = 37;
                            break;
                        }
                        case 3: {
                            n17 = 121;
                            break;
                        }
                        case 4: {
                            n17 = 93;
                            break;
                        }
                        case 5: {
                            n17 = 45;
                            break;
                        }
                        default: {
                            n17 = 27;
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
        long l2 = 2462140786726028969L;
        d = 0x169BD31223CE46CBL ^ l2;
    }
}

