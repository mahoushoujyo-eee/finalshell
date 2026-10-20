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

class Q8
extends qi_0 {
    byte[] a = new byte[0];
    byte[] t = new byte[0];
    private static final String d;
    private static final long e;

    Q8() {
    }

    void r(byte[] byArray, byte[] byArray2) {
        this.a = byArray;
        this.t = byArray2;
    }

    @Override
    public void Q(DI dI, dm_2 dm_22) throws Exception {
        super.Q(dI, dm_22);
        this.T(false);
        uJ uJ2 = new uJ();
        YU yU = new YU(uJ2);
        yU.M();
        uJ2.V((byte)e);
        uJ2.u(dm_22.J());
        uJ2.q(E8.J(d));
        uJ2.V((byte)0);
        uJ2.q(this.a);
        uJ2.q(this.t);
        this.C(yU);
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
                char[] cArray3 = "9vL".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 52;
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
                            n17 = 104;
                            break;
                        }
                        case 1: {
                            n17 = 44;
                            break;
                        }
                        case 2: {
                            n17 = 14;
                            break;
                        }
                        case 3: {
                            n17 = 20;
                            break;
                        }
                        case 4: {
                            n17 = 82;
                            break;
                        }
                        case 5: {
                            n17 = 28;
                            break;
                        }
                        default: {
                            n17 = 20;
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
        long l2 = 7151579847413521239L;
        e = 0xA518B15E03ECDB35L ^ l2;
    }
}

