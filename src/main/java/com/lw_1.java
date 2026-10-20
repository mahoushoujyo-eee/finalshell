/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E8;
import com.GN;
import com.al_0;
import com.co_1;
import com.dm_2;
import com.ip_2;
import com.ls_2;
import com.pc_0;
import com.uJ;
import com.xe_0;
import java.math.BigInteger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.lW
 */
class lw_1
extends ls_2 {
    private byte[] V;
    private byte[] L;
    private byte[] b;
    private byte[] d;
    private byte[] y;
    private byte[] H;
    private byte[] M;
    private byte[] j;
    private int w;
    private static final byte[] O;
    private static final byte[] o;
    private static final byte[] s;
    private static final String[] a;
    private static final String[] c;
    private static final long[] e;
    private static final Integer[] f;

    lw_1(xe_0 xe_02) {
        this(xe_02, null, null, null);
    }

    lw_1(xe_0 xe_02, byte[] byArray, byte[] byArray2, byte[] byArray3) {
        block3: {
            block2: {
                boolean bl = dm_2.F();
                super(xe_02);
                this.w = lw_1.b(4381, 9059953730157085362L);
                this.V = byArray;
                boolean bl2 = bl;
                this.L = byArray2;
                lw_1 lw_12 = this;
                if (!bl2) break block2;
                lw_12.b = byArray3;
                if (byArray == null) break block3;
                lw_12 = this;
            }
            lw_12.w = new BigInteger(byArray).bitLength();
        }
    }

    @Override
    void K(int n10) throws pc_0 {
        this.w = n10;
        try {
            Class<co_1> clazz = Class.forName(xe_0.r(lw_1.b(-19778, 2726))).asSubclass(co_1.class);
            co_1 co_12 = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            co_12.D(n10);
            this.L = co_12.l();
            this.b = co_12.S();
            this.V = co_12.w();
            this.d = co_12.R();
            this.y = co_12.M();
            this.H = co_12.h();
            this.M = co_12.C();
            this.j = co_12.g();
            co_12 = null;
        }
        catch (Exception exception) {
            throw new pc_0(exception.toString(), exception);
        }
    }

    @Override
    byte[] Y() {
        return O;
    }

    @Override
    byte[] d() {
        return o;
    }

    @Override
    byte[] r() {
        int n10 = 1 + this.M(1) + 1 + 1 + this.M(this.V.length) + this.V.length + 1 + this.M(this.L.length) + this.L.length + 1 + this.M(this.b.length) + this.b.length + 1 + this.M(this.d.length) + this.d.length + 1 + this.M(this.y.length) + this.y.length + 1 + this.M(this.H.length) + this.H.length + 1 + this.M(this.M.length) + this.M.length + 1 + this.M(this.j.length) + this.j.length;
        int n11 = 1 + this.M(n10) + n10;
        byte[] byArray = new byte[n11];
        int n12 = 0;
        n12 = this.L(byArray, n12, n10);
        n12 = this.O(byArray, n12, new byte[1]);
        n12 = this.O(byArray, n12, this.V);
        n12 = this.O(byArray, n12, this.L);
        n12 = this.O(byArray, n12, this.b);
        n12 = this.O(byArray, n12, this.d);
        n12 = this.O(byArray, n12, this.y);
        n12 = this.O(byArray, n12, this.H);
        n12 = this.O(byArray, n12, this.M);
        n12 = this.O(byArray, n12, this.j);
        return byArray;
    }

    /*
     * Loose catch block
     */
    @Override
    boolean I(byte[] byArray) {
        block157: {
            boolean bl = dm_2.J();
            try {
                block167: {
                    block156: {
                        int n10;
                        int n11;
                        block154: {
                            int n12;
                            block155: {
                                int n13;
                                block151: {
                                    block153: {
                                        block152: {
                                            block148: {
                                                block150: {
                                                    block149: {
                                                        block145: {
                                                            block147: {
                                                                block146: {
                                                                    block142: {
                                                                        block144: {
                                                                            block143: {
                                                                                block139: {
                                                                                    block141: {
                                                                                        block140: {
                                                                                            block136: {
                                                                                                block138: {
                                                                                                    block137: {
                                                                                                        block133: {
                                                                                                            block135: {
                                                                                                                block134: {
                                                                                                                    block130: {
                                                                                                                        block132: {
                                                                                                                            block131: {
                                                                                                                                int n14;
                                                                                                                                int n15;
                                                                                                                                block128: {
                                                                                                                                    block127: {
                                                                                                                                        block129: {
                                                                                                                                            block125: {
                                                                                                                                                block126: {
                                                                                                                                                    int n16;
                                                                                                                                                    int n17;
                                                                                                                                                    block121: {
                                                                                                                                                        block122: {
                                                                                                                                                            block123: {
                                                                                                                                                                byte[] byArray2;
                                                                                                                                                                uJ uJ2;
                                                                                                                                                                block124: {
                                                                                                                                                                    block113: {
                                                                                                                                                                        block114: {
                                                                                                                                                                            int n18;
                                                                                                                                                                            block119: {
                                                                                                                                                                                block120: {
                                                                                                                                                                                    block115: {
                                                                                                                                                                                        block116: {
                                                                                                                                                                                            block117: {
                                                                                                                                                                                                byte[] byArray3;
                                                                                                                                                                                                block118: {
                                                                                                                                                                                                    block162: {
                                                                                                                                                                                                        block109: {
                                                                                                                                                                                                            block110: {
                                                                                                                                                                                                                block108: {
                                                                                                                                                                                                                    block107: {
                                                                                                                                                                                                                        n11 = 0;
                                                                                                                                                                                                                        n12 = 0;
                                                                                                                                                                                                                        n17 = this.P;
                                                                                                                                                                                                                        n16 = 2;
                                                                                                                                                                                                                        if (bl) break block107;
                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                            block160: {
                                                                                                                                                                                                                                if (n17 == n16) break block108;
                                                                                                                                                                                                                                break block160;
                                                                                                                                                                                                                                catch (pc_0 pc_02) {
                                                                                                                                                                                                                                    throw lw_1.b(pc_02);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            n17 = this.P;
                                                                                                                                                                                                                            n16 = 5;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        catch (pc_0 pc_03) {
                                                                                                                                                                                                                            throw lw_1.b(pc_03);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        if (bl) break block109;
                                                                                                                                                                                                                        if (n17 != n16) break block110;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (pc_0 pc_04) {
                                                                                                                                                                                                                        throw lw_1.b(pc_04);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                uJ uJ3 = new uJ(byArray);
                                                                                                                                                                                                                uJ3.S(byArray.length);
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    byte[][] byArray4 = uJ3.U(4, "");
                                                                                                                                                                                                                    this.b = byArray4[0];
                                                                                                                                                                                                                    this.d = byArray4[1];
                                                                                                                                                                                                                    this.y = byArray4[2];
                                                                                                                                                                                                                    this.j = byArray4[3];
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (pc_0 pc_05) {
                                                                                                                                                                                                                    boolean bl2;
                                                                                                                                                                                                                    block111: {
                                                                                                                                                                                                                        block112: {
                                                                                                                                                                                                                            bl2 = this.Q.p().K(3);
                                                                                                                                                                                                                            if (bl) break block111;
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                block161: {
                                                                                                                                                                                                                                    if (!bl2) break block112;
                                                                                                                                                                                                                                    break block161;
                                                                                                                                                                                                                                    catch (pc_0 pc_06) {
                                                                                                                                                                                                                                        throw lw_1.b(pc_06);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                this.Q.p().c(3, lw_1.b(-19790, -21635), pc_05);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (pc_0 pc_07) {
                                                                                                                                                                                                                                throw lw_1.b(pc_07);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        bl2 = false;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    return bl2;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                this.y();
                                                                                                                                                                                                                this.c();
                                                                                                                                                                                                                return true;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            n17 = this.P;
                                                                                                                                                                                                            n16 = 1;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (bl) break block113;
                                                                                                                                                                                                        if (n17 != n16) break block114;
                                                                                                                                                                                                        break block162;
                                                                                                                                                                                                        catch (pc_0 pc_08) {
                                                                                                                                                                                                            throw lw_1.b(pc_08);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        block163: {
                                                                                                                                                                                                            n18 = byArray[n11];
                                                                                                                                                                                                            if (bl) break block115;
                                                                                                                                                                                                            break block163;
                                                                                                                                                                                                            catch (pc_0 pc_09) {
                                                                                                                                                                                                                throw lw_1.b(pc_09);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (n18 == lw_1.b(23255, 490052710915000691L)) break block116;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (pc_0 pc_010) {
                                                                                                                                                                                                        throw lw_1.b(pc_010);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    uJ uJ4 = new uJ(byArray);
                                                                                                                                                                                                    this.L = uJ4.c();
                                                                                                                                                                                                    this.b = uJ4.c();
                                                                                                                                                                                                    this.V = uJ4.c();
                                                                                                                                                                                                    byte[] byArray5 = uJ4.c();
                                                                                                                                                                                                    this.d = uJ4.c();
                                                                                                                                                                                                    this.y = uJ4.c();
                                                                                                                                                                                                    byArray3 = this.V;
                                                                                                                                                                                                    if (bl) break block117;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        block164: {
                                                                                                                                                                                                            if (byArray3 == null) break block118;
                                                                                                                                                                                                            break block164;
                                                                                                                                                                                                            catch (pc_0 pc_011) {
                                                                                                                                                                                                                throw lw_1.b(pc_011);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        this.w = new BigInteger(this.V).bitLength();
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (pc_0 pc_012) {
                                                                                                                                                                                                        throw lw_1.b(pc_012);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                this.y();
                                                                                                                                                                                                this.c();
                                                                                                                                                                                                byArray3 = this.z();
                                                                                                                                                                                            }
                                                                                                                                                                                            return true;
                                                                                                                                                                                        }
                                                                                                                                                                                        n18 = this.Q.p().K(3) ? 1 : 0;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (bl) break block119;
                                                                                                                                                                                    try {
                                                                                                                                                                                        block165: {
                                                                                                                                                                                            if (n18 == 0) break block120;
                                                                                                                                                                                            break block165;
                                                                                                                                                                                            catch (pc_0 pc_013) {
                                                                                                                                                                                                throw lw_1.b(pc_013);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        this.Q.p().t(3, lw_1.b(-19791, 11363));
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (pc_0 pc_014) {
                                                                                                                                                                                        throw lw_1.b(pc_014);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                n18 = 0;
                                                                                                                                                                            }
                                                                                                                                                                            return n18 != 0;
                                                                                                                                                                        }
                                                                                                                                                                        n17 = this.P;
                                                                                                                                                                        n16 = 4;
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        if (bl) break block121;
                                                                                                                                                                        if (n17 != n16) break block122;
                                                                                                                                                                    }
                                                                                                                                                                    catch (pc_0 pc_015) {
                                                                                                                                                                        throw lw_1.b(pc_015);
                                                                                                                                                                    }
                                                                                                                                                                    uJ2 = new uJ(byArray);
                                                                                                                                                                    int n19 = uJ2.d();
                                                                                                                                                                    int n20 = uJ2.d();
                                                                                                                                                                    try {
                                                                                                                                                                        if (n19 != n20) {
                                                                                                                                                                            throw new pc_0(lw_1.b(-19788, -17116));
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    catch (pc_0 pc_016) {
                                                                                                                                                                        throw lw_1.b(pc_016);
                                                                                                                                                                    }
                                                                                                                                                                    String string = E8.B(uJ2.S());
                                                                                                                                                                    this.V = uJ2.e();
                                                                                                                                                                    this.L = uJ2.e();
                                                                                                                                                                    this.b = uJ2.e();
                                                                                                                                                                    this.j = uJ2.e();
                                                                                                                                                                    this.d = uJ2.e();
                                                                                                                                                                    this.y = uJ2.e();
                                                                                                                                                                    byArray2 = this.V;
                                                                                                                                                                    if (bl) break block123;
                                                                                                                                                                    try {
                                                                                                                                                                        block166: {
                                                                                                                                                                            if (byArray2 == null) break block124;
                                                                                                                                                                            break block166;
                                                                                                                                                                            catch (pc_0 pc_017) {
                                                                                                                                                                                throw lw_1.b(pc_017);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        this.w = new BigInteger(this.V).bitLength();
                                                                                                                                                                    }
                                                                                                                                                                    catch (pc_0 pc_018) {
                                                                                                                                                                        throw lw_1.b(pc_018);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                this.m = E8.B(uJ2.S());
                                                                                                                                                                this.y();
                                                                                                                                                                byArray2 = this.c();
                                                                                                                                                            }
                                                                                                                                                            return true;
                                                                                                                                                        }
                                                                                                                                                        int n21 = ++n11;
                                                                                                                                                        ++n11;
                                                                                                                                                        n17 = n12 = byArray[n21] & lw_1.b(31060, 4591759866566437617L);
                                                                                                                                                        n16 = lw_1.b(24098, 5068565405166325135L);
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        n15 = n17 & n16;
                                                                                                                                                        if (bl) break block125;
                                                                                                                                                        if (n15 == 0) break block126;
                                                                                                                                                    }
                                                                                                                                                    catch (pc_0 pc_019) {
                                                                                                                                                        throw lw_1.b(pc_019);
                                                                                                                                                    }
                                                                                                                                                    n13 = n12 & lw_1.b(23448, 4342323155024136246L);
                                                                                                                                                    n12 = 0;
                                                                                                                                                    while (n13-- > 0) {
                                                                                                                                                        n12 = (n12 << lw_1.b(31459, 4672271247400134978L)) + (byArray[n11++] & lw_1.b(15852, 5360830958521232970L));
                                                                                                                                                        try {
                                                                                                                                                            if (!bl) {
                                                                                                                                                                if (!bl) continue;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            break block127;
                                                                                                                                                        }
                                                                                                                                                        catch (pc_0 pc_020) {
                                                                                                                                                            throw lw_1.b(pc_020);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                n15 = byArray[n11];
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                n14 = 2;
                                                                                                                                                if (bl) break block128;
                                                                                                                                                if (n15 == n14) break block129;
                                                                                                                                            }
                                                                                                                                            catch (pc_0 pc_021) {
                                                                                                                                                throw lw_1.b(pc_021);
                                                                                                                                            }
                                                                                                                                            return false;
                                                                                                                                        }
                                                                                                                                        int n22 = ++n11;
                                                                                                                                        ++n11;
                                                                                                                                        n12 = byArray[n22] & lw_1.b(15852, 5360830958521232970L);
                                                                                                                                    }
                                                                                                                                    n15 = n12;
                                                                                                                                    n14 = lw_1.b(27121, 6294279004533127763L);
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    n10 = n15 & n14;
                                                                                                                                    if (bl) break block130;
                                                                                                                                    if (n10 == 0) break block131;
                                                                                                                                }
                                                                                                                                catch (pc_0 pc_022) {
                                                                                                                                    throw lw_1.b(pc_022);
                                                                                                                                }
                                                                                                                                n13 = n12 & lw_1.b(28986, 5331665851565957786L);
                                                                                                                                n12 = 0;
                                                                                                                                while (n13-- > 0) {
                                                                                                                                    n12 = (n12 << lw_1.b(31459, 4672271247400134978L)) + (byArray[n11++] & lw_1.b(15852, 5360830958521232970L));
                                                                                                                                    try {
                                                                                                                                        if (!bl) {
                                                                                                                                            if (!bl) continue;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        break block132;
                                                                                                                                    }
                                                                                                                                    catch (pc_0 pc_023) {
                                                                                                                                        throw lw_1.b(pc_023);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            n11 += n12;
                                                                                                                            int n23 = ++n11;
                                                                                                                            ++n11;
                                                                                                                            n12 = byArray[n23] & lw_1.b(15852, 5360830958521232970L);
                                                                                                                        }
                                                                                                                        n10 = n12 & lw_1.b(27121, 6294279004533127763L);
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (bl) break block133;
                                                                                                                        if (n10 == 0) break block134;
                                                                                                                    }
                                                                                                                    catch (pc_0 pc_024) {
                                                                                                                        throw lw_1.b(pc_024);
                                                                                                                    }
                                                                                                                    n13 = n12 & lw_1.b(28986, 5331665851565957786L);
                                                                                                                    n12 = 0;
                                                                                                                    while (n13-- > 0) {
                                                                                                                        n12 = (n12 << lw_1.b(31459, 4672271247400134978L)) + (byArray[n11++] & lw_1.b(15852, 5360830958521232970L));
                                                                                                                        try {
                                                                                                                            if (!bl) {
                                                                                                                                if (!bl) continue;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            break block135;
                                                                                                                        }
                                                                                                                        catch (pc_0 pc_025) {
                                                                                                                            throw lw_1.b(pc_025);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                this.V = new byte[n12];
                                                                                                                System.arraycopy(byArray, n11, this.V, 0, n12);
                                                                                                                n11 += n12;
                                                                                                                int n24 = ++n11;
                                                                                                                ++n11;
                                                                                                                n12 = byArray[n24] & lw_1.b(15852, 5360830958521232970L);
                                                                                                            }
                                                                                                            n10 = n12 & lw_1.b(27121, 6294279004533127763L);
                                                                                                        }
                                                                                                        try {
                                                                                                            if (bl) break block136;
                                                                                                            if (n10 == 0) break block137;
                                                                                                        }
                                                                                                        catch (pc_0 pc_026) {
                                                                                                            throw lw_1.b(pc_026);
                                                                                                        }
                                                                                                        n13 = n12 & lw_1.b(28986, 5331665851565957786L);
                                                                                                        n12 = 0;
                                                                                                        while (n13-- > 0) {
                                                                                                            n12 = (n12 << lw_1.b(31459, 4672271247400134978L)) + (byArray[n11++] & lw_1.b(15852, 5360830958521232970L));
                                                                                                            try {
                                                                                                                if (!bl) {
                                                                                                                    if (!bl) continue;
                                                                                                                    break;
                                                                                                                }
                                                                                                                break block138;
                                                                                                            }
                                                                                                            catch (pc_0 pc_027) {
                                                                                                                throw lw_1.b(pc_027);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    this.L = new byte[n12];
                                                                                                    System.arraycopy(byArray, n11, this.L, 0, n12);
                                                                                                    n11 += n12;
                                                                                                    int n25 = ++n11;
                                                                                                    ++n11;
                                                                                                    n12 = byArray[n25] & lw_1.b(15852, 5360830958521232970L);
                                                                                                }
                                                                                                n10 = n12 & lw_1.b(27121, 6294279004533127763L);
                                                                                            }
                                                                                            try {
                                                                                                if (bl) break block139;
                                                                                                if (n10 == 0) break block140;
                                                                                            }
                                                                                            catch (pc_0 pc_028) {
                                                                                                throw lw_1.b(pc_028);
                                                                                            }
                                                                                            n13 = n12 & lw_1.b(28986, 5331665851565957786L);
                                                                                            n12 = 0;
                                                                                            while (n13-- > 0) {
                                                                                                n12 = (n12 << lw_1.b(31459, 4672271247400134978L)) + (byArray[n11++] & lw_1.b(15852, 5360830958521232970L));
                                                                                                try {
                                                                                                    if (!bl) {
                                                                                                        if (!bl) continue;
                                                                                                        break;
                                                                                                    }
                                                                                                    break block141;
                                                                                                }
                                                                                                catch (pc_0 pc_029) {
                                                                                                    throw lw_1.b(pc_029);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        this.b = new byte[n12];
                                                                                        System.arraycopy(byArray, n11, this.b, 0, n12);
                                                                                        n11 += n12;
                                                                                        int n26 = ++n11;
                                                                                        ++n11;
                                                                                        n12 = byArray[n26] & lw_1.b(15852, 5360830958521232970L);
                                                                                    }
                                                                                    n10 = n12 & lw_1.b(27121, 6294279004533127763L);
                                                                                }
                                                                                try {
                                                                                    if (bl) break block142;
                                                                                    if (n10 == 0) break block143;
                                                                                }
                                                                                catch (pc_0 pc_030) {
                                                                                    throw lw_1.b(pc_030);
                                                                                }
                                                                                n13 = n12 & lw_1.b(28986, 5331665851565957786L);
                                                                                n12 = 0;
                                                                                while (n13-- > 0) {
                                                                                    n12 = (n12 << lw_1.b(31459, 4672271247400134978L)) + (byArray[n11++] & lw_1.b(15852, 5360830958521232970L));
                                                                                    try {
                                                                                        if (!bl) {
                                                                                            if (!bl) continue;
                                                                                            break;
                                                                                        }
                                                                                        break block144;
                                                                                    }
                                                                                    catch (pc_0 pc_031) {
                                                                                        throw lw_1.b(pc_031);
                                                                                    }
                                                                                }
                                                                            }
                                                                            this.d = new byte[n12];
                                                                            System.arraycopy(byArray, n11, this.d, 0, n12);
                                                                            n11 += n12;
                                                                            int n27 = ++n11;
                                                                            ++n11;
                                                                            n12 = byArray[n27] & lw_1.b(15852, 5360830958521232970L);
                                                                        }
                                                                        n10 = n12 & lw_1.b(27121, 6294279004533127763L);
                                                                    }
                                                                    try {
                                                                        if (bl) break block145;
                                                                        if (n10 == 0) break block146;
                                                                    }
                                                                    catch (pc_0 pc_032) {
                                                                        throw lw_1.b(pc_032);
                                                                    }
                                                                    n13 = n12 & lw_1.b(28986, 5331665851565957786L);
                                                                    n12 = 0;
                                                                    while (n13-- > 0) {
                                                                        n12 = (n12 << lw_1.b(31459, 4672271247400134978L)) + (byArray[n11++] & lw_1.b(15852, 5360830958521232970L));
                                                                        try {
                                                                            if (!bl) {
                                                                                if (!bl) continue;
                                                                                break;
                                                                            }
                                                                            break block147;
                                                                        }
                                                                        catch (pc_0 pc_033) {
                                                                            throw lw_1.b(pc_033);
                                                                        }
                                                                    }
                                                                }
                                                                this.y = new byte[n12];
                                                                System.arraycopy(byArray, n11, this.y, 0, n12);
                                                                n11 += n12;
                                                                int n28 = ++n11;
                                                                ++n11;
                                                                n12 = byArray[n28] & lw_1.b(15852, 5360830958521232970L);
                                                            }
                                                            n10 = n12 & lw_1.b(27121, 6294279004533127763L);
                                                        }
                                                        try {
                                                            if (bl) break block148;
                                                            if (n10 == 0) break block149;
                                                        }
                                                        catch (pc_0 pc_034) {
                                                            throw lw_1.b(pc_034);
                                                        }
                                                        n13 = n12 & lw_1.b(28986, 5331665851565957786L);
                                                        n12 = 0;
                                                        while (n13-- > 0) {
                                                            n12 = (n12 << lw_1.b(31459, 4672271247400134978L)) + (byArray[n11++] & lw_1.b(15852, 5360830958521232970L));
                                                            try {
                                                                if (!bl) {
                                                                    if (!bl) continue;
                                                                    break;
                                                                }
                                                                break block150;
                                                            }
                                                            catch (pc_0 pc_035) {
                                                                throw lw_1.b(pc_035);
                                                            }
                                                        }
                                                    }
                                                    this.H = new byte[n12];
                                                    System.arraycopy(byArray, n11, this.H, 0, n12);
                                                    n11 += n12;
                                                    int n29 = ++n11;
                                                    ++n11;
                                                    n12 = byArray[n29] & lw_1.b(15852, 5360830958521232970L);
                                                }
                                                n10 = n12 & lw_1.b(27121, 6294279004533127763L);
                                            }
                                            try {
                                                if (bl) break block151;
                                                if (n10 == 0) break block152;
                                            }
                                            catch (pc_0 pc_036) {
                                                throw lw_1.b(pc_036);
                                            }
                                            n13 = n12 & lw_1.b(28986, 5331665851565957786L);
                                            n12 = 0;
                                            while (n13-- > 0) {
                                                n12 = (n12 << lw_1.b(31459, 4672271247400134978L)) + (byArray[n11++] & lw_1.b(15852, 5360830958521232970L));
                                                try {
                                                    if (!bl) {
                                                        if (!bl) continue;
                                                        break;
                                                    }
                                                    break block153;
                                                }
                                                catch (pc_0 pc_037) {
                                                    throw lw_1.b(pc_037);
                                                }
                                            }
                                        }
                                        this.M = new byte[n12];
                                        System.arraycopy(byArray, n11, this.M, 0, n12);
                                        n11 += n12;
                                        int n30 = ++n11;
                                        ++n11;
                                        n12 = byArray[n30] & lw_1.b(15852, 5360830958521232970L);
                                    }
                                    n10 = n12 & lw_1.b(27121, 6294279004533127763L);
                                }
                                try {
                                    if (bl) break block154;
                                    if (n10 == 0) break block155;
                                }
                                catch (pc_0 pc_038) {
                                    throw lw_1.b(pc_038);
                                }
                                n13 = n12 & lw_1.b(28986, 5331665851565957786L);
                                n12 = 0;
                                while (n13-- > 0) {
                                    n12 = (n12 << lw_1.b(31459, 4672271247400134978L)) + (byArray[n11++] & lw_1.b(15852, 5360830958521232970L));
                                    try {
                                        if (!bl) {
                                            if (!bl) continue;
                                            break;
                                        }
                                        break block156;
                                    }
                                    catch (pc_0 pc_039) {
                                        throw lw_1.b(pc_039);
                                    }
                                }
                            }
                            this.j = new byte[n12];
                            System.arraycopy(byArray, n11, this.j, 0, n12);
                            n10 = n11 + n12;
                        }
                        n11 = n10;
                    }
                    lw_1 lw_12 = this;
                    if (bl) break block167;
                    try {
                        block168: {
                            if (lw_12.V == null) break block157;
                            break block168;
                            catch (pc_0 pc_040) {
                                throw lw_1.b(pc_040);
                            }
                        }
                        lw_12 = this;
                    }
                    catch (pc_0 pc_041) {
                        throw lw_1.b(pc_041);
                    }
                }
                lw_12.w = new BigInteger(this.V).bitLength();
            }
            catch (Exception exception) {
                boolean bl3;
                block158: {
                    block159: {
                        try {
                            try {
                                bl3 = this.Q.p().K(3);
                                if (bl) break block158;
                                if (!bl3) break block159;
                            }
                            catch (pc_0 pc_042) {
                                throw lw_1.b(pc_042);
                            }
                            this.Q.p().c(3, lw_1.b(-19791, 11363), exception);
                        }
                        catch (pc_0 pc_043) {
                            throw lw_1.b(pc_043);
                        }
                    }
                    bl3 = false;
                }
                return bl3;
            }
        }
        return true;
    }

    @Override
    public byte[] O() {
        byte[] byArray = super.O();
        boolean bl = dm_2.F();
        byte[] byArray2 = byArray;
        if (bl) {
            if (byArray2 != null) {
                return byArray;
            }
            byArray2 = this.L;
        }
        if (byArray2 == null) {
            return null;
        }
        byte[][] byArrayArray = new byte[][]{s, this.L, this.V};
        return uJ.h((byte[][])byArrayArray).g;
    }

    @Override
    byte[] A() {
        return s;
    }

    @Override
    public int y() {
        return 2;
    }

    @Override
    public int r() {
        return this.w;
    }

    @Override
    public byte[] l(byte[] byArray) {
        return this.e(byArray, lw_1.b(-19792, -21127));
    }

    @Override
    public byte[] e(byte[] byArray, String string) {
        boolean bl = dm_2.F();
        try {
            Class<ip_2> clazz = Class.forName(xe_0.r(string)).asSubclass(ip_2.class);
            ip_2 ip_22 = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            ip_22.k();
            ip_22.i(this.b, this.V);
            ip_22.d(byArray);
            byte[] byArray2 = ip_22.k();
            byte[][] byArrayArray = new byte[][]{E8.J(string), byArray2};
            return uJ.h((byte[][])byArrayArray).g;
        }
        catch (Exception exception) {
            block7: {
                int n10;
                GN gN2;
                block6: {
                    try {
                        try {
                            gN2 = this.Q.p();
                            n10 = 3;
                            if (!bl) break block6;
                            if (!gN2.K(n10)) break block7;
                        }
                        catch (Exception exception2) {
                            throw lw_1.b(exception2);
                        }
                        gN2 = this.Q.p();
                        n10 = 3;
                    }
                    catch (Exception exception3) {
                        throw lw_1.b(exception3);
                    }
                }
                gN2.c(n10, lw_1.b(-19789, 3233), exception);
            }
            return null;
        }
    }

    @Override
    public al_0 R() {
        return this.a(lw_1.b(-19780, 23537));
    }

    /*
     * Loose catch block
     */
    @Override
    public al_0 a(String string) {
        boolean bl = dm_2.F();
        try {
            ip_2 ip_22;
            block15: {
                block16: {
                    byte[] byArray;
                    block17: {
                        block21: {
                            block20: {
                                Class<ip_2> clazz = Class.forName(xe_0.r(string)).asSubclass(ip_2.class);
                                ip_22 = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                ip_22.k();
                                if (!bl) break block15;
                                if (this.L != null) break block16;
                                break block20;
                                catch (Exception exception) {
                                    throw lw_1.b(exception);
                                }
                            }
                            byArray = this.V;
                            if (!bl) break block17;
                            break block21;
                            catch (Exception exception) {
                                throw lw_1.b(exception);
                            }
                        }
                        try {
                            block22: {
                                if (byArray != null) break block16;
                                break block22;
                                catch (Exception exception) {
                                    throw lw_1.b(exception);
                                }
                            }
                            byArray = this.O();
                        }
                        catch (Exception exception) {
                            throw lw_1.b(exception);
                        }
                    }
                    if (byArray != null) {
                        uJ uJ2 = new uJ(this.O());
                        uJ2.S();
                        this.L = uJ2.S();
                        this.V = uJ2.S();
                    }
                }
                ip_22.Q(this.L, this.V);
            }
            return ip_22;
        }
        catch (Exception exception) {
            block19: {
                int n10;
                GN gN2;
                block18: {
                    try {
                        try {
                            gN2 = this.Q.p();
                            n10 = 3;
                            if (!bl) break block18;
                            if (!gN2.K(n10)) break block19;
                        }
                        catch (Exception exception2) {
                            throw lw_1.b(exception2);
                        }
                        gN2 = this.Q.p();
                        n10 = 3;
                    }
                    catch (Exception exception3) {
                        throw lw_1.b(exception3);
                    }
                }
                gN2.c(n10, lw_1.b(-19779, 25912), exception);
            }
            return null;
        }
    }

    static ls_2 i(xe_0 xe_02, uJ uJ2) throws pc_0 {
        byte[][] byArray = uJ2.U(lw_1.b(23558, 5094501075915100069L), lw_1.b(-19786, 21277));
        byte[] byArray2 = byArray[1];
        byte[] byArray3 = byArray[2];
        byte[] byArray4 = byArray[3];
        lw_1 lw_12 = new lw_1(xe_02, byArray2, byArray3, byArray4);
        lw_12.j = byArray[4];
        lw_12.d = byArray[5];
        lw_12.y = byArray[lw_1.b(5069, 5831075402987470945L)];
        lw_12.m = E8.B(byArray[lw_1.b(29995, 1275361076012017292L)]);
        lw_12.P = 0;
        return lw_12;
    }

    @Override
    public byte[] T() throws pc_0 {
        try {
            if (this.t()) {
                throw new pc_0(lw_1.b(-19785, 19022));
            }
        }
        catch (pc_0 pc_02) {
            throw lw_1.b(pc_02);
        }
        uJ uJ2 = new uJ();
        uJ2.q(s);
        uJ2.q(this.V);
        uJ2.q(this.L);
        uJ2.q(this.b);
        uJ2.q(this.z());
        uJ2.q(this.d);
        uJ2.q(this.y);
        uJ2.q(E8.J(this.m));
        byte[] byArray = new byte[uJ2.P()];
        uJ2.G(byArray, 0, byArray.length);
        return byArray;
    }

    private byte[] y() {
        boolean bl = dm_2.J();
        byte[] byArray = this.H;
        if (!bl) {
            if (byArray == null) {
                this.H = new BigInteger(this.b).mod(new BigInteger(this.d).subtract(BigInteger.ONE)).toByteArray();
            }
            byArray = this.H;
        }
        return byArray;
    }

    private byte[] c() {
        boolean bl = dm_2.J();
        byte[] byArray = this.M;
        if (!bl) {
            if (byArray == null) {
                this.M = new BigInteger(this.b).mod(new BigInteger(this.y).subtract(BigInteger.ONE)).toByteArray();
            }
            byArray = this.M;
        }
        return byArray;
    }

    private byte[] z() {
        boolean bl = dm_2.F();
        byte[] byArray = this.j;
        if (bl) {
            if (byArray == null) {
                this.j = new BigInteger(this.y).modInverse(new BigInteger(this.d)).toByteArray();
            }
            byArray = this.j;
        }
        return byArray;
    }

    @Override
    public void a() {
        super.a();
        E8.Q(this.b);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[12];
                        var11_1 = 0;
                        var10_2 = "\u0092\u009b?\u00e1g\u00cc\u000eJ?\u00f1M\u00f7BZ\u00f8a\u00ea\u0012]\u000b\u008b\u00d8\u001a\u0098@\u00dc?\u00c8\u00e3O\u00eb$\u000e\u00df\u008e4\u001fi\u00f5\u009a`Iab\u00ca\\\u00aa\u00b0?\u00c68j\u008a)9\u00d4\u00a1\u00d4\u00b3\u00d0\u00c2\u0000\u009cgJ\u00e2X\u00eb\fr\u008d6\u00cc\u00db\u0011\u009d\u00cc\u00c4\u00aa\u00c2o\u001cu\u00f4\u007f\u00c4q\u00baA`\u00d7\u00c4df\u00ce\u00e6\u00a3\u00c0.K\u00a0t\u00df_e\u0013\u0000\u00e5/\u0084\u0013\u0003-\u00b1\u00ff\u00a8\u00ddz\u008c\u00b0Y\u009f\u00d1X\u0082\u00f9\u00d9\u008f\u00011\u0013\u001bp\u00b2T\u00c8\u00a8v\"1\u008c\u00afk^\u00d593\u0097\\2\u0007\u00b9VP\u0081\u00a2l\u008f\u001d\u00ba\u0000\u00e0\u00de\u0006\u00b1\u00804\u0003\nl\u00a73K\u00bb\u00ce+\u0083\u0012\u00fb:r\u0092'\u00e9\u0004?\u00a3\u00e9\u000e\u00c0\u00b1u\u00f4&.}MB^\u00d4\u00a5\u00a5o";
                        var12_3 = "\u0092\u009b?\u00e1g\u00cc\u000eJ?\u00f1M\u00f7BZ\u00f8a\u00ea\u0012]\u000b\u008b\u00d8\u001a\u0098@\u00dc?\u00c8\u00e3O\u00eb$\u000e\u00df\u008e4\u001fi\u00f5\u009a`Iab\u00ca\\\u00aa\u00b0?\u00c68j\u008a)9\u00d4\u00a1\u00d4\u00b3\u00d0\u00c2\u0000\u009cgJ\u00e2X\u00eb\fr\u008d6\u00cc\u00db\u0011\u009d\u00cc\u00c4\u00aa\u00c2o\u001cu\u00f4\u007f\u00c4q\u00baA`\u00d7\u00c4df\u00ce\u00e6\u00a3\u00c0.K\u00a0t\u00df_e\u0013\u0000\u00e5/\u0084\u0013\u0003-\u00b1\u00ff\u00a8\u00ddz\u008c\u00b0Y\u009f\u00d1X\u0082\u00f9\u00d9\u008f\u00011\u0013\u001bp\u00b2T\u00c8\u00a8v\"1\u008c\u00afk^\u00d593\u0097\\2\u0007\u00b9VP\u0081\u00a2l\u008f\u001d\u00ba\u0000\u00e0\u00de\u0006\u00b1\u00804\u0003\nl\u00a73K\u00bb\u00ce+\u0083\u0012\u00fb:r\u0092'\u00e9\u0004?\u00a3\u00e9\u000e\u00c0\u00b1u\u00f4&.}MB^\u00d4\u00a5\u00a5o".length();
                        var9_4 = 17;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 2;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "U\u001c\u009c>\u00ea\u0002\u00d5\u0090\u00a2=)\u00a9\u000f\t\u0010Z-h\u00bc\u0087V\u00e6\u00b4\u00e6<\u0007\u00e8e\u009d\u0000\u00fc\u00bb\u00a3";
                            var12_3 = "U\u001c\u009c>\u00ea\u0002\u00d5\u0090\u00a2=)\u00a9\u000f\t\u0010Z-h\u00bc\u0087V\u00e6\u00b4\u00e6<\u0007\u00e8e\u009d\u0000\u00fc\u00bb\u00a3".length();
                            var9_4 = 25;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 5;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 40;
                                    break;
                                }
                                case 1: {
                                    v15 = 51;
                                    break;
                                }
                                case 2: {
                                    v15 = 85;
                                    break;
                                }
                                case 3: {
                                    v15 = 95;
                                    break;
                                }
                                case 4: {
                                    v15 = 87;
                                    break;
                                }
                                case 5: {
                                    v15 = 14;
                                    break;
                                }
                                default: {
                                    v15 = 46;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                lw_1.a = var13;
                lw_1.c = new String[12];
                var0_7 = 9180169260350302216L;
                var6_8 = new long[12];
                var3_9 = 0;
                var4_10 = "\u00c4\u0017\u00a3]\u00a6m\u00a1K\u00aa0\u001e\u0000\u0081\u00b5\u0082\u0006R\u00af\u00d3O*\u00b0\u00c6\u00bd%\u00b5\u00dc\u00d9\u0085-\u008e\u0083b\u008b\u00a1SJ\u0088\u008a\u00edz\u00a2\u00af\u001df\u00ad\u0081B?\u001e\u00f3\tKF\u0092\u00db\u00f6\u0082 )$\u00e0'\u00a5S6\u00ac\u00cd\u00f8\u00b5\u00e8oH\u00cb\u00b61\u0012\u00e6%\u0007";
                var5_11 = "\u00c4\u0017\u00a3]\u00a6m\u00a1K\u00aa0\u001e\u0000\u0081\u00b5\u0082\u0006R\u00af\u00d3O*\u00b0\u00c6\u00bd%\u00b5\u00dc\u00d9\u0085-\u008e\u0083b\u008b\u00a1SJ\u0088\u008a\u00edz\u00a2\u00af\u001df\u00ad\u0081B?\u001e\u00f3\tKF\u0092\u00db\u00f6\u0082 )$\u00e0'\u00a5S6\u00ac\u00cd\u00f8\u00b5\u00e8oH\u00cb\u00b61\u0012\u00e6%\u0007".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00e1\u00c7(\u00e5\u009e\t A>\u0097\u00af\u00a0\u00ca^\u00ee\u00ba";
                    var5_11 = "\u00e1\u00c7(\u00e5\u009e\t A>\u0097\u00af\u00a0\u00ca^\u00ee\u00ba".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        lw_1.e = var6_8;
        lw_1.f = new Integer[12];
        lw_1.O = E8.J(lw_1.b(-19787, 19408));
        lw_1.o = E8.J(lw_1.b(-19777, 31259));
        lw_1.s = E8.J(lw_1.b(-19780, 23537));
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFB2B7) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 182;
                    break;
                }
                case 1: {
                    n14 = 214;
                    break;
                }
                case 2: {
                    n14 = 241;
                    break;
                }
                case 3: {
                    n14 = 81;
                    break;
                }
                case 4: {
                    n14 = 170;
                    break;
                }
                case 5: {
                    n14 = 6;
                    break;
                }
                case 6: {
                    n14 = 226;
                    break;
                }
                case 7: {
                    n14 = 203;
                    break;
                }
                case 8: {
                    n14 = 213;
                    break;
                }
                case 9: {
                    n14 = 144;
                    break;
                }
                case 10: {
                    n14 = 229;
                    break;
                }
                case 11: {
                    n14 = 42;
                    break;
                }
                case 12: {
                    n14 = 141;
                    break;
                }
                case 13: {
                    n14 = 29;
                    break;
                }
                case 14: {
                    n14 = 89;
                    break;
                }
                case 15: {
                    n14 = 218;
                    break;
                }
                case 16: {
                    n14 = 142;
                    break;
                }
                case 17: {
                    n14 = 211;
                    break;
                }
                case 18: {
                    n14 = 197;
                    break;
                }
                case 19: {
                    n14 = 101;
                    break;
                }
                case 20: {
                    n14 = 60;
                    break;
                }
                case 21: {
                    n14 = 61;
                    break;
                }
                case 22: {
                    n14 = 186;
                    break;
                }
                case 23: {
                    n14 = 111;
                    break;
                }
                case 24: {
                    n14 = 129;
                    break;
                }
                case 25: {
                    n14 = 103;
                    break;
                }
                case 26: {
                    n14 = 34;
                    break;
                }
                case 27: {
                    n14 = 140;
                    break;
                }
                case 28: {
                    n14 = 148;
                    break;
                }
                case 29: {
                    n14 = 86;
                    break;
                }
                case 30: {
                    n14 = 44;
                    break;
                }
                case 31: {
                    n14 = 90;
                    break;
                }
                case 32: {
                    n14 = 43;
                    break;
                }
                case 33: {
                    n14 = 166;
                    break;
                }
                case 34: {
                    n14 = 51;
                    break;
                }
                case 35: {
                    n14 = 14;
                    break;
                }
                case 36: {
                    n14 = 87;
                    break;
                }
                case 37: {
                    n14 = 92;
                    break;
                }
                case 38: {
                    n14 = 254;
                    break;
                }
                case 39: {
                    n14 = 115;
                    break;
                }
                case 40: {
                    n14 = 50;
                    break;
                }
                case 41: {
                    n14 = 46;
                    break;
                }
                case 42: {
                    n14 = 193;
                    break;
                }
                case 43: {
                    n14 = 38;
                    break;
                }
                case 44: {
                    n14 = 219;
                    break;
                }
                case 45: {
                    n14 = 217;
                    break;
                }
                case 46: {
                    n14 = 185;
                    break;
                }
                case 47: {
                    n14 = 135;
                    break;
                }
                case 48: {
                    n14 = 64;
                    break;
                }
                case 49: {
                    n14 = 12;
                    break;
                }
                case 50: {
                    n14 = 139;
                    break;
                }
                case 51: {
                    n14 = 163;
                    break;
                }
                case 52: {
                    n14 = 93;
                    break;
                }
                case 53: {
                    n14 = 45;
                    break;
                }
                case 54: {
                    n14 = 22;
                    break;
                }
                case 55: {
                    n14 = 77;
                    break;
                }
                case 56: {
                    n14 = 192;
                    break;
                }
                case 57: {
                    n14 = 239;
                    break;
                }
                case 58: {
                    n14 = 2;
                    break;
                }
                case 59: {
                    n14 = 84;
                    break;
                }
                case 60: {
                    n14 = 157;
                    break;
                }
                case 61: {
                    n14 = 122;
                    break;
                }
                case 62: {
                    n14 = 79;
                    break;
                }
                case 63: {
                    n14 = 249;
                    break;
                }
                case 64: {
                    n14 = 69;
                    break;
                }
                case 65: {
                    n14 = 75;
                    break;
                }
                case 66: {
                    n14 = 11;
                    break;
                }
                case 67: {
                    n14 = 98;
                    break;
                }
                case 68: {
                    n14 = 55;
                    break;
                }
                case 69: {
                    n14 = 247;
                    break;
                }
                case 70: {
                    n14 = 181;
                    break;
                }
                case 71: {
                    n14 = 132;
                    break;
                }
                case 72: {
                    n14 = 49;
                    break;
                }
                case 73: {
                    n14 = 183;
                    break;
                }
                case 74: {
                    n14 = 221;
                    break;
                }
                case 75: {
                    n14 = 17;
                    break;
                }
                case 76: {
                    n14 = 169;
                    break;
                }
                case 77: {
                    n14 = 179;
                    break;
                }
                case 78: {
                    n14 = 13;
                    break;
                }
                case 79: {
                    n14 = 208;
                    break;
                }
                case 80: {
                    n14 = 31;
                    break;
                }
                case 81: {
                    n14 = 237;
                    break;
                }
                case 82: {
                    n14 = 190;
                    break;
                }
                case 83: {
                    n14 = 105;
                    break;
                }
                case 84: {
                    n14 = 238;
                    break;
                }
                case 85: {
                    n14 = 204;
                    break;
                }
                case 86: {
                    n14 = 137;
                    break;
                }
                case 87: {
                    n14 = 71;
                    break;
                }
                case 88: {
                    n14 = 233;
                    break;
                }
                case 89: {
                    n14 = 62;
                    break;
                }
                case 90: {
                    n14 = 16;
                    break;
                }
                case 91: {
                    n14 = 228;
                    break;
                }
                case 92: {
                    n14 = 9;
                    break;
                }
                case 93: {
                    n14 = 74;
                    break;
                }
                case 94: {
                    n14 = 82;
                    break;
                }
                case 95: {
                    n14 = 104;
                    break;
                }
                case 96: {
                    n14 = 230;
                    break;
                }
                case 97: {
                    n14 = 30;
                    break;
                }
                case 98: {
                    n14 = 112;
                    break;
                }
                case 99: {
                    n14 = 150;
                    break;
                }
                case 100: {
                    n14 = 210;
                    break;
                }
                case 101: {
                    n14 = 188;
                    break;
                }
                case 102: {
                    n14 = 78;
                    break;
                }
                case 103: {
                    n14 = 121;
                    break;
                }
                case 104: {
                    n14 = 1;
                    break;
                }
                case 105: {
                    n14 = 118;
                    break;
                }
                case 106: {
                    n14 = 128;
                    break;
                }
                case 107: {
                    n14 = 126;
                    break;
                }
                case 108: {
                    n14 = 102;
                    break;
                }
                case 109: {
                    n14 = 149;
                    break;
                }
                case 110: {
                    n14 = 242;
                    break;
                }
                case 111: {
                    n14 = 194;
                    break;
                }
                case 112: {
                    n14 = 127;
                    break;
                }
                case 113: {
                    n14 = 235;
                    break;
                }
                case 114: {
                    n14 = 58;
                    break;
                }
                case 115: {
                    n14 = 116;
                    break;
                }
                case 116: {
                    n14 = 243;
                    break;
                }
                case 117: {
                    n14 = 200;
                    break;
                }
                case 118: {
                    n14 = 8;
                    break;
                }
                case 119: {
                    n14 = 255;
                    break;
                }
                case 120: {
                    n14 = 26;
                    break;
                }
                case 121: {
                    n14 = 227;
                    break;
                }
                case 122: {
                    n14 = 18;
                    break;
                }
                case 123: {
                    n14 = 232;
                    break;
                }
                case 124: {
                    n14 = 178;
                    break;
                }
                case 125: {
                    n14 = 146;
                    break;
                }
                case 126: {
                    n14 = 209;
                    break;
                }
                case 127: {
                    n14 = 206;
                    break;
                }
                case 128: {
                    n14 = 164;
                    break;
                }
                case 129: {
                    n14 = 83;
                    break;
                }
                case 130: {
                    n14 = 130;
                    break;
                }
                case 131: {
                    n14 = 177;
                    break;
                }
                case 132: {
                    n14 = 114;
                    break;
                }
                case 133: {
                    n14 = 120;
                    break;
                }
                case 134: {
                    n14 = 54;
                    break;
                }
                case 135: {
                    n14 = 145;
                    break;
                }
                case 136: {
                    n14 = 152;
                    break;
                }
                case 137: {
                    n14 = 162;
                    break;
                }
                case 138: {
                    n14 = 36;
                    break;
                }
                case 139: {
                    n14 = 160;
                    break;
                }
                case 140: {
                    n14 = 156;
                    break;
                }
                case 141: {
                    n14 = 0;
                    break;
                }
                case 142: {
                    n14 = 246;
                    break;
                }
                case 143: {
                    n14 = 245;
                    break;
                }
                case 144: {
                    n14 = 94;
                    break;
                }
                case 145: {
                    n14 = 63;
                    break;
                }
                case 146: {
                    n14 = 119;
                    break;
                }
                case 147: {
                    n14 = 153;
                    break;
                }
                case 148: {
                    n14 = 175;
                    break;
                }
                case 149: {
                    n14 = 23;
                    break;
                }
                case 150: {
                    n14 = 72;
                    break;
                }
                case 151: {
                    n14 = 171;
                    break;
                }
                case 152: {
                    n14 = 215;
                    break;
                }
                case 153: {
                    n14 = 33;
                    break;
                }
                case 154: {
                    n14 = 222;
                    break;
                }
                case 155: {
                    n14 = 133;
                    break;
                }
                case 156: {
                    n14 = 244;
                    break;
                }
                case 157: {
                    n14 = 65;
                    break;
                }
                case 158: {
                    n14 = 202;
                    break;
                }
                case 159: {
                    n14 = 199;
                    break;
                }
                case 160: {
                    n14 = 134;
                    break;
                }
                case 161: {
                    n14 = 66;
                    break;
                }
                case 162: {
                    n14 = 24;
                    break;
                }
                case 163: {
                    n14 = 113;
                    break;
                }
                case 164: {
                    n14 = 5;
                    break;
                }
                case 165: {
                    n14 = 161;
                    break;
                }
                case 166: {
                    n14 = 91;
                    break;
                }
                case 167: {
                    n14 = 27;
                    break;
                }
                case 168: {
                    n14 = 223;
                    break;
                }
                case 169: {
                    n14 = 97;
                    break;
                }
                case 170: {
                    n14 = 138;
                    break;
                }
                case 171: {
                    n14 = 52;
                    break;
                }
                case 172: {
                    n14 = 147;
                    break;
                }
                case 173: {
                    n14 = 4;
                    break;
                }
                case 174: {
                    n14 = 158;
                    break;
                }
                case 175: {
                    n14 = 96;
                    break;
                }
                case 176: {
                    n14 = 125;
                    break;
                }
                case 177: {
                    n14 = 191;
                    break;
                }
                case 178: {
                    n14 = 68;
                    break;
                }
                case 179: {
                    n14 = 80;
                    break;
                }
                case 180: {
                    n14 = 168;
                    break;
                }
                case 181: {
                    n14 = 196;
                    break;
                }
                case 182: {
                    n14 = 131;
                    break;
                }
                case 183: {
                    n14 = 15;
                    break;
                }
                case 184: {
                    n14 = 123;
                    break;
                }
                case 185: {
                    n14 = 195;
                    break;
                }
                case 186: {
                    n14 = 187;
                    break;
                }
                case 187: {
                    n14 = 108;
                    break;
                }
                case 188: {
                    n14 = 85;
                    break;
                }
                case 189: {
                    n14 = 151;
                    break;
                }
                case 190: {
                    n14 = 173;
                    break;
                }
                case 191: {
                    n14 = 240;
                    break;
                }
                case 192: {
                    n14 = 53;
                    break;
                }
                case 193: {
                    n14 = 176;
                    break;
                }
                case 194: {
                    n14 = 117;
                    break;
                }
                case 195: {
                    n14 = 32;
                    break;
                }
                case 196: {
                    n14 = 231;
                    break;
                }
                case 197: {
                    n14 = 59;
                    break;
                }
                case 198: {
                    n14 = 184;
                    break;
                }
                case 199: {
                    n14 = 155;
                    break;
                }
                case 200: {
                    n14 = 252;
                    break;
                }
                case 201: {
                    n14 = 250;
                    break;
                }
                case 202: {
                    n14 = 165;
                    break;
                }
                case 203: {
                    n14 = 212;
                    break;
                }
                case 204: {
                    n14 = 180;
                    break;
                }
                case 205: {
                    n14 = 19;
                    break;
                }
                case 206: {
                    n14 = 10;
                    break;
                }
                case 207: {
                    n14 = 73;
                    break;
                }
                case 208: {
                    n14 = 172;
                    break;
                }
                case 209: {
                    n14 = 3;
                    break;
                }
                case 210: {
                    n14 = 21;
                    break;
                }
                case 211: {
                    n14 = 107;
                    break;
                }
                case 212: {
                    n14 = 253;
                    break;
                }
                case 213: {
                    n14 = 154;
                    break;
                }
                case 214: {
                    n14 = 251;
                    break;
                }
                case 215: {
                    n14 = 198;
                    break;
                }
                case 216: {
                    n14 = 100;
                    break;
                }
                case 217: {
                    n14 = 47;
                    break;
                }
                case 218: {
                    n14 = 48;
                    break;
                }
                case 219: {
                    n14 = 201;
                    break;
                }
                case 220: {
                    n14 = 57;
                    break;
                }
                case 221: {
                    n14 = 143;
                    break;
                }
                case 222: {
                    n14 = 7;
                    break;
                }
                case 223: {
                    n14 = 236;
                    break;
                }
                case 224: {
                    n14 = 225;
                    break;
                }
                case 225: {
                    n14 = 159;
                    break;
                }
                case 226: {
                    n14 = 106;
                    break;
                }
                case 227: {
                    n14 = 189;
                    break;
                }
                case 228: {
                    n14 = 224;
                    break;
                }
                case 229: {
                    n14 = 110;
                    break;
                }
                case 230: {
                    n14 = 95;
                    break;
                }
                case 231: {
                    n14 = 41;
                    break;
                }
                case 232: {
                    n14 = 88;
                    break;
                }
                case 233: {
                    n14 = 20;
                    break;
                }
                case 234: {
                    n14 = 37;
                    break;
                }
                case 235: {
                    n14 = 220;
                    break;
                }
                case 236: {
                    n14 = 205;
                    break;
                }
                case 237: {
                    n14 = 76;
                    break;
                }
                case 238: {
                    n14 = 174;
                    break;
                }
                case 239: {
                    n14 = 28;
                    break;
                }
                case 240: {
                    n14 = 39;
                    break;
                }
                case 241: {
                    n14 = 234;
                    break;
                }
                case 242: {
                    n14 = 35;
                    break;
                }
                case 243: {
                    n14 = 109;
                    break;
                }
                case 244: {
                    n14 = 67;
                    break;
                }
                case 245: {
                    n14 = 248;
                    break;
                }
                case 246: {
                    n14 = 167;
                    break;
                }
                case 247: {
                    n14 = 40;
                    break;
                }
                case 248: {
                    n14 = 56;
                    break;
                }
                case 249: {
                    n14 = 207;
                    break;
                }
                case 250: {
                    n14 = 70;
                    break;
                }
                case 251: {
                    n14 = 216;
                    break;
                }
                case 252: {
                    n14 = 99;
                    break;
                }
                case 253: {
                    n14 = 25;
                    break;
                }
                case 254: {
                    n14 = 124;
                    break;
                }
                default: {
                    n14 = 136;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            lw_1.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x13A4;
        if (f[n11] == null) {
            lw_1.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }
}

