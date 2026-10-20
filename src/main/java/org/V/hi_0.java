/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.b_0;
import org.v.M;
import org.v.NB;
import org.v.NQ;
import org.v.R3;
import org.v.RG;
import org.v.fY;
import org.v.h_1;
import org.v.ni_0;
import org.v.q_2;
import org.v.rd_0;
import org.v.rf_0;
import org.v.rx_0;
import org.v.s_1;

/*
 * Renamed from org.v.hi
 */
class hi_0
implements fY {
    static final boolean x;
    final rx_0 u;
    final h_1 D;
    private static final String a;

    hi_0(h_1 h_12, rx_0 rx_02) {
        this.D = h_12;
        this.u = rx_02;
    }

    @c
    public s_1 A(rf_0 rf_02) throws b_0 {
        s_1 s_12;
        block6: {
            M m10;
            q_2 q_22;
            block7: {
                q_22 = h_1.v(this.D, rf_02.C);
                s_12 = h_1.a(this.D, true, q_22);
                m10 = rf_02.p.G;
                String[] stringArray = RG.C();
                try {
                    try {
                        try {
                            if (stringArray == null) break block6;
                            if (x) break block7;
                        }
                        catch (b_0 b_02) {
                            throw hi_0.a(b_02);
                        }
                        if (m10 != null) break block7;
                    }
                    catch (b_0 b_03) {
                        throw hi_0.a(b_03);
                    }
                    throw new AssertionError();
                }
                catch (b_0 b_04) {
                    throw hi_0.a(b_04);
                }
            }
            h_1.D(this.D, m10, q_22);
            h_1.g(this.D, this.u, s_12);
        }
        return s_12;
    }

    @c
    public s_1 d(R3 r3) throws b_0 {
        h_1 h_12;
        block15: {
            block16: {
                boolean bl;
                block18: {
                    String[] stringArray;
                    block17: {
                        stringArray = RG.C();
                        try {
                            try {
                                try {
                                    try {
                                        h_12 = this.D;
                                        if (stringArray == null) break block15;
                                        if (h_1.t(h_12).contains((Object)rd_0.EXPRESSIONS_IN_TRY_WITH_RESOURCES_ALLOWED)) break block16;
                                    }
                                    catch (b_0 b_02) {
                                        throw hi_0.a(b_02);
                                    }
                                    bl = r3.S instanceof NQ;
                                    if (stringArray == null) break block17;
                                }
                                catch (b_0 b_03) {
                                    throw hi_0.a(b_03);
                                }
                                if (bl) break block16;
                            }
                            catch (b_0 b_04) {
                                throw hi_0.a(b_04);
                            }
                            bl = r3.S instanceof ni_0;
                        }
                        catch (b_0 b_05) {
                            throw hi_0.a(b_05);
                        }
                    }
                    try {
                        try {
                            if (stringArray == null) break block18;
                            if (bl) break block16;
                        }
                        catch (b_0 b_06) {
                            throw hi_0.a(b_06);
                        }
                        bl = r3.S instanceof NB;
                    }
                    catch (b_0 b_07) {
                        throw hi_0.a(b_07);
                    }
                }
                try {
                    if (!bl) {
                        throw new b_0(r3.S.getClass().getSimpleName() + a, r3.Q());
                    }
                }
                catch (b_0 b_08) {
                    throw hi_0.a(b_08);
                }
            }
            h_12 = this.D;
        }
        s_1 s_12 = h_1.a(h_12, true, h_1.X(this.D, r3.S));
        h_1.g(this.D, this.u, s_12);
        return s_12;
    }

    @Override
    @c
    public Object S(R3 r3) throws Throwable {
        return this.d(r3);
    }

    @Override
    @c
    public Object K(rf_0 rf_02) throws Throwable {
        return this.A(rf_02);
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
                char[] cArray3 = "<-H\u0000v\u0003\r<1Q\u0015:\u0017\u0004p0I\u0004~V\to\u007f_Ah\u0013\u001bs*L\u0002\u007f".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 126;
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
                            n17 = 98;
                            break;
                        }
                        case 1: {
                            n17 = 33;
                            break;
                        }
                        case 2: {
                            n17 = 64;
                            break;
                        }
                        case 3: {
                            n17 = 31;
                            break;
                        }
                        case 4: {
                            n17 = 100;
                            break;
                        }
                        case 5: {
                            n17 = 8;
                            break;
                        }
                        default: {
                            n17 = 22;
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
        x = !h_1.class.desiredAssertionStatus();
    }

    private static b_0 a(b_0 b_02) {
        return b_02;
    }
}

