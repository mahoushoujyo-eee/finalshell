/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dm_2;
import com.dn_0;
import com.dy_1;
import com.ou_1;
import com.po_1;
import com.s_0;
import java.io.IOException;
import java.io.InputStream;

/*
 * Renamed from com.x5
 */
class x5_0
extends InputStream {
    long k;
    boolean V;
    int j;
    byte[] m;
    byte[] Q;
    s_0 u;
    int Z;
    long n;
    final long G;
    final po_1 O;
    final byte[] c;
    final dy_1 Y;
    private static final String[] a;
    private static final String[] b;
    private static final long[] d;
    private static final Integer[] e;

    x5_0(dy_1 dy_12, long l2, po_1 po_12, byte[] byArray) {
        this.Y = dy_12;
        this.G = l2;
        this.O = po_12;
        this.c = byArray;
        this.k = this.G;
        this.V = false;
        this.j = 0;
        this.m = new byte[1];
        this.Q = new byte[x5_0.a(1621, 3975562298513291096L)];
        this.u = new s_0();
        this.Z = 1;
        this.n = this.k;
    }

    @Override
    public int read() throws IOException {
        int n10;
        int n11;
        block10: {
            block11: {
                int n12;
                boolean bl;
                block8: {
                    block9: {
                        bl = dm_2.F();
                        try {
                            try {
                                n12 = this.V;
                                if (!bl) break block8;
                                if (n12 == 0) break block9;
                            }
                            catch (IOException iOException) {
                                throw x5_0.a(iOException);
                            }
                            return -1;
                        }
                        catch (IOException iOException) {
                            throw x5_0.a(iOException);
                        }
                    }
                    n12 = this.read(this.m, 0, 1);
                }
                int n13 = n12;
                try {
                    try {
                        n11 = n13;
                        n10 = -1;
                        if (!bl) break block10;
                        if (n11 != n10) break block11;
                    }
                    catch (IOException iOException) {
                        throw x5_0.a(iOException);
                    }
                    return -1;
                }
                catch (IOException iOException) {
                    throw x5_0.a(iOException);
                }
            }
            n11 = this.m[0];
            n10 = x5_0.a(21546, 8361509018971415843L);
        }
        return n11 & n10;
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        int n10;
        block4: {
            block5: {
                boolean bl = dm_2.F();
                try {
                    try {
                        n10 = this.V;
                        if (!bl) break block4;
                        if (n10 == 0) break block5;
                    }
                    catch (IOException iOException) {
                        throw x5_0.a(iOException);
                    }
                    return -1;
                }
                catch (IOException iOException) {
                    throw x5_0.a(iOException);
                }
            }
            n10 = this.read(byArray, 0, byArray.length);
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public int read(byte[] var1_1, int var2_2, int var3_3) throws IOException {
        block139: {
            block140: {
                block158: {
                    block157: {
                        block156: {
                            block155: {
                                block153: {
                                    block154: {
                                        block151: {
                                            block152: {
                                                block145: {
                                                    block146: {
                                                        block147: {
                                                            block148: {
                                                                block175: {
                                                                    block174: {
                                                                        block143: {
                                                                            block144: {
                                                                                block141: {
                                                                                    block142: {
                                                                                        block136: {
                                                                                            block171: {
                                                                                                block138: {
                                                                                                    block137: {
                                                                                                        block134: {
                                                                                                            block135: {
                                                                                                                block169: {
                                                                                                                    block168: {
                                                                                                                        block133: {
                                                                                                                            block132: {
                                                                                                                                block130: {
                                                                                                                                    block131: {
                                                                                                                                        block166: {
                                                                                                                                            block128: {
                                                                                                                                                block129: {
                                                                                                                                                    block121: {
                                                                                                                                                        block122: {
                                                                                                                                                            block126: {
                                                                                                                                                                block162: {
                                                                                                                                                                    block127: {
                                                                                                                                                                        block164: {
                                                                                                                                                                            block163: {
                                                                                                                                                                                block125: {
                                                                                                                                                                                    block123: {
                                                                                                                                                                                        block124: {
                                                                                                                                                                                            block119: {
                                                                                                                                                                                                block120: {
                                                                                                                                                                                                    block117: {
                                                                                                                                                                                                        block118: {
                                                                                                                                                                                                            block116: {
                                                                                                                                                                                                                block115: {
                                                                                                                                                                                                                    block114: {
                                                                                                                                                                                                                        block113: {
                                                                                                                                                                                                                            var4_4 = dm_2.F();
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                v0 = this.V;
                                                                                                                                                                                                                                if (!var4_4) break block113;
                                                                                                                                                                                                                                if (v0 == 0) break block114;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (Exception v1) {
                                                                                                                                                                                                                                throw x5_0.a(v1);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            v0 = -1;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        return v0;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        if (var1_1 == null) {
                                                                                                                                                                                                                            throw new NullPointerException();
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (Exception v2) {
                                                                                                                                                                                                                        throw x5_0.a(v2);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        v3 = var2_2;
                                                                                                                                                                                                                        if (!var4_4) break block115;
                                                                                                                                                                                                                        if (v3 >= 0) {
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        ** GOTO lbl49
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (Exception v4) {
                                                                                                                                                                                                                        throw x5_0.a(v4);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v3 = var3_3;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (!var4_4) break block116;
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    block159: {
                                                                                                                                                                                                                        if (v3 < 0) ** GOTO lbl49
                                                                                                                                                                                                                        break block159;
                                                                                                                                                                                                                        catch (Exception v5) {
                                                                                                                                                                                                                            throw x5_0.a(v5);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v3 = var2_2 + var3_3;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (Exception v6) {
                                                                                                                                                                                                                    throw x5_0.a(v6);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (!var4_4) break block117;
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                block160: {
                                                                                                                                                                                                                    if (v3 <= var1_1.length) break block118;
                                                                                                                                                                                                                    break block160;
                                                                                                                                                                                                                    catch (Exception v7) {
                                                                                                                                                                                                                        throw x5_0.a(v7);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                throw new IndexOutOfBoundsException();
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (Exception v8) {
                                                                                                                                                                                                                throw x5_0.a(v8);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        v3 = var3_3;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (!var4_4) break block119;
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        block161: {
                                                                                                                                                                                                            if (v3 != 0) break block120;
                                                                                                                                                                                                            break block161;
                                                                                                                                                                                                            catch (Exception v9) {
                                                                                                                                                                                                                throw x5_0.a(v9);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return 0;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (Exception v10) {
                                                                                                                                                                                                        throw x5_0.a(v10);
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                v3 = this.j;
                                                                                                                                                                                            }
                                                                                                                                                                                            try {
                                                                                                                                                                                                if (!var4_4) break block121;
                                                                                                                                                                                                if (v3 <= 0) break block122;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (Exception v11) {
                                                                                                                                                                                                throw x5_0.a(v11);
                                                                                                                                                                                            }
                                                                                                                                                                                            var5_5 = this.j;
                                                                                                                                                                                            try {
                                                                                                                                                                                                v12 = var5_5;
                                                                                                                                                                                                v13 = var3_3;
                                                                                                                                                                                                if (!var4_4) break block123;
                                                                                                                                                                                                if (v12 <= v13) break block124;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (Exception v14) {
                                                                                                                                                                                                throw x5_0.a(v14);
                                                                                                                                                                                            }
                                                                                                                                                                                            var5_5 = var3_3;
                                                                                                                                                                                        }
                                                                                                                                                                                        try {
                                                                                                                                                                                            v15 = this;
                                                                                                                                                                                            if (!var4_4) break block125;
                                                                                                                                                                                            System.arraycopy(v15.Q, 0, var1_1, var2_2, var5_5);
                                                                                                                                                                                            v12 = var5_5;
                                                                                                                                                                                            v13 = this.j;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (Exception v16) {
                                                                                                                                                                                            throw x5_0.a(v16);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        if (v12 != v13) {
                                                                                                                                                                                            System.arraycopy(this.Q, var5_5, this.Q, 0, this.j - var5_5);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (Exception v17) {
                                                                                                                                                                                        throw x5_0.a(v17);
                                                                                                                                                                                    }
                                                                                                                                                                                    v15 = this;
                                                                                                                                                                                }
                                                                                                                                                                                if (!var4_4) break block162;
                                                                                                                                                                                if (v15.O == null) break block127;
                                                                                                                                                                                break block163;
                                                                                                                                                                                catch (Exception v18) {
                                                                                                                                                                                    throw x5_0.a(v18);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            v19 = (int)this.O.o(var5_5);
                                                                                                                                                                            if (!var4_4) break block126;
                                                                                                                                                                            break block164;
                                                                                                                                                                            catch (Exception v20) {
                                                                                                                                                                                throw x5_0.a(v20);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            block165: {
                                                                                                                                                                                if (v19 != 0) break block127;
                                                                                                                                                                                break block165;
                                                                                                                                                                                catch (Exception v21) {
                                                                                                                                                                                    throw x5_0.a(v21);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            this.close();
                                                                                                                                                                            return -1;
                                                                                                                                                                        }
                                                                                                                                                                        catch (Exception v22) {
                                                                                                                                                                            throw x5_0.a(v22);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    v15 = this;
                                                                                                                                                                }
                                                                                                                                                                v15.j -= var5_5;
                                                                                                                                                                v19 = var5_5;
                                                                                                                                                            }
                                                                                                                                                            return v19;
                                                                                                                                                        }
                                                                                                                                                        v3 = dy_1.Z((dy_1)this.Y).g.length - x5_0.a(31346, 2562398751666572153L);
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        if (!var4_4) break block128;
                                                                                                                                                        if (v3 >= var3_3) break block129;
                                                                                                                                                    }
                                                                                                                                                    catch (Exception v23) {
                                                                                                                                                        throw x5_0.a(v23);
                                                                                                                                                    }
                                                                                                                                                    var3_3 = dy_1.Z((dy_1)this.Y).g.length - x5_0.a(17802, 616220958800131202L);
                                                                                                                                                }
                                                                                                                                                v3 = dy_1.l(this.Y);
                                                                                                                                            }
                                                                                                                                            if (!var4_4) break block130;
                                                                                                                                            if (v3 != 0) break block131;
                                                                                                                                            break block166;
                                                                                                                                            catch (Exception v24) {
                                                                                                                                                throw x5_0.a(v24);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            block167: {
                                                                                                                                                v3 = var3_3;
                                                                                                                                                if (!var4_4) break block130;
                                                                                                                                                break block167;
                                                                                                                                                catch (Exception v25) {
                                                                                                                                                    throw x5_0.a(v25);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            if (v3 <= x5_0.a(21995, 7815967576441955557L)) break block131;
                                                                                                                                        }
                                                                                                                                        catch (Exception v26) {
                                                                                                                                            throw x5_0.a(v26);
                                                                                                                                        }
                                                                                                                                        var3_3 = x5_0.a(21995, 7815967576441955557L);
                                                                                                                                    }
                                                                                                                                    v3 = dy_1.A(this.Y).J();
                                                                                                                                }
                                                                                                                                if (v3 != 0) {
                                                                                                                                    // empty if block
                                                                                                                                }
                                                                                                                                var5_6 = dy_1.Z((dy_1)this.Y).g.length - x5_0.a(17802, 616220958800131202L);
                                                                                                                                try {
                                                                                                                                    v27 = dy_1.l(this.Y);
                                                                                                                                    if (var4_4) {
                                                                                                                                        if (v27 != 0) break block132;
                                                                                                                                    }
                                                                                                                                    ** GOTO lbl188
                                                                                                                                }
                                                                                                                                catch (Exception v28) {
                                                                                                                                    throw x5_0.a(v28);
                                                                                                                                }
                                                                                                                                var5_6 = x5_0.a(21995, 7815967576441955557L);
                                                                                                                            }
                                                                                                                            do {
                                                                                                                                v27 = dy_1.A(this.Y).J();
lbl188:
                                                                                                                                // 2 sources

                                                                                                                                if (v27 >= this.Z) break;
                                                                                                                                try {
                                                                                                                                    dy_1.U(this.Y, this.c, this.n, var5_6, dy_1.A(this.Y));
                                                                                                                                    if (!var4_4) break block133;
                                                                                                                                }
                                                                                                                                catch (Exception var6_7) {
                                                                                                                                    throw new IOException(x5_0.a(28331, 10249));
                                                                                                                                }
                                                                                                                                this.n += (long)var5_6;
                                                                                                                            } while (var4_4);
                                                                                                                            this.u = dy_1.b(this.Y, dy_1.Z(this.Y), this.u);
                                                                                                                            this.j = this.u.W;
                                                                                                                            var5_6 = this.u.T;
                                                                                                                        }
                                                                                                                        var6_8 = this.u.w;
                                                                                                                        var7_9 = null;
                                                                                                                        try {
                                                                                                                            var7_9 = dy_1.A(this.Y).y(this.u.w);
                                                                                                                        }
                                                                                                                        catch (ou_1 var8_10) {
                                                                                                                            this.n = var8_10.Y;
                                                                                                                            this.skip(this.u.W);
                                                                                                                            dy_1.A(this.Y).W(this.u, dy_1.Z(this.Y));
                                                                                                                            return 0;
                                                                                                                        }
                                                                                                                        catch (dn_0 var8_11) {
                                                                                                                            throw new IOException(x5_0.a(28329, 31055) + var8_11.toString(), var8_11);
                                                                                                                        }
                                                                                                                        v29 = var5_6;
                                                                                                                        v30 = x5_0.a(31892, 770956517577231774L);
                                                                                                                        if (!var4_4) break block134;
                                                                                                                        if (v29 == v30) break block135;
                                                                                                                        break block168;
                                                                                                                        catch (Exception v31) {
                                                                                                                            throw x5_0.a(v31);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v29 = var5_6;
                                                                                                                    v30 = x5_0.a(11196, 6713879165440973488L);
                                                                                                                    if (!var4_4) break block134;
                                                                                                                    break block169;
                                                                                                                    catch (Exception v32) {
                                                                                                                        throw x5_0.a(v32);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    block170: {
                                                                                                                        if (v29 == v30) break block135;
                                                                                                                        break block170;
                                                                                                                        catch (Exception v33) {
                                                                                                                            throw x5_0.a(v33);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    throw new IOException(x5_0.a(28330, 24905));
                                                                                                                }
                                                                                                                catch (Exception v34) {
                                                                                                                    throw x5_0.a(v34);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                v29 = var5_6;
                                                                                                                if (!var4_4) break block136;
                                                                                                                v30 = x5_0.a(23302, 3419757513495292425L);
                                                                                                            }
                                                                                                            catch (Exception v35) {
                                                                                                                throw x5_0.a(v35);
                                                                                                            }
                                                                                                        }
                                                                                                        if (v29 != v30) break block171;
                                                                                                        dy_1.N(this.Y, dy_1.Z(this.Y), this.j);
                                                                                                        var8_12 = dy_1.Z(this.Y).d();
                                                                                                        this.j = 0;
                                                                                                        v36 = var8_12;
                                                                                                        if (!var4_4) break block137;
                                                                                                        try {
                                                                                                            block172: {
                                                                                                                if (v36 != 1) break block138;
                                                                                                                break block172;
                                                                                                                catch (Exception v37) {
                                                                                                                    throw x5_0.a(v37);
                                                                                                                }
                                                                                                            }
                                                                                                            this.close();
                                                                                                            v36 = -1;
                                                                                                        }
                                                                                                        catch (Exception v38) {
                                                                                                            throw x5_0.a(v38);
                                                                                                        }
                                                                                                    }
                                                                                                    return v36;
                                                                                                }
                                                                                                throw new IOException(x5_0.a(28330, 24905));
                                                                                            }
                                                                                            dy_1.Z(this.Y).a();
                                                                                            dy_1.z(this.Y, dy_1.Z((dy_1)this.Y).g, 0, 4);
                                                                                            v29 = dy_1.Z(this.Y).d();
                                                                                        }
                                                                                        var8_13 = v29;
                                                                                        this.j -= 4;
                                                                                        var9_14 = this.j - var8_13;
                                                                                        this.k += (long)var8_13;
                                                                                        var10_15 = var8_13;
                                                                                        try {
                                                                                            v39 = var10_15;
                                                                                            if (!var4_4) break block139;
                                                                                            if (v39 <= 0) break block140;
                                                                                        }
                                                                                        catch (Exception v40) {
                                                                                            throw x5_0.a(v40);
                                                                                        }
                                                                                        var11_16 = var10_15;
                                                                                        try {
                                                                                            v41 = var11_16;
                                                                                            if (!var4_4) break block141;
                                                                                            if (v41 <= var3_3) break block142;
                                                                                        }
                                                                                        catch (Exception v42) {
                                                                                            throw x5_0.a(v42);
                                                                                        }
                                                                                        var11_16 = var3_3;
                                                                                    }
                                                                                    v41 = dy_1.P(this.Y).read(var1_1, var2_2, var11_16);
                                                                                }
                                                                                var12_17 = v41;
                                                                                v43 = var12_17;
                                                                                if (!var4_4) break block143;
                                                                                try {
                                                                                    block173: {
                                                                                        if (v43 >= 0) break block144;
                                                                                        break block173;
                                                                                        catch (Exception v44) {
                                                                                            throw x5_0.a(v44);
                                                                                        }
                                                                                    }
                                                                                    return -1;
                                                                                }
                                                                                catch (Exception v45) {
                                                                                    throw x5_0.a(v45);
                                                                                }
                                                                            }
                                                                            this.j = var10_15 -= var12_17;
                                                                            v43 = var10_15;
                                                                        }
                                                                        if (!var4_4) break block145;
                                                                        if (v43 <= 0) break block146;
                                                                        break block174;
                                                                        catch (Exception v46) {
                                                                            throw x5_0.a(v46);
                                                                        }
                                                                    }
                                                                    v47 = this.Q.length;
                                                                    if (!var4_4) break block147;
                                                                    break block175;
                                                                    catch (Exception v48) {
                                                                        throw x5_0.a(v48);
                                                                    }
                                                                }
                                                                try {
                                                                    block176: {
                                                                        if (v47 >= var10_15) break block148;
                                                                        break block176;
                                                                        catch (Exception v49) {
                                                                            throw x5_0.a(v49);
                                                                        }
                                                                    }
                                                                    this.Q = new byte[var10_15];
                                                                }
                                                                catch (Exception v50) {
                                                                    throw x5_0.a(v50);
                                                                }
                                                            }
                                                            v47 = 0;
                                                        }
                                                        var13_18 = v47;
                                                        var14_20 = var10_15;
                                                        while (var14_20 > 0) {
                                                            block149: {
                                                                block150: {
                                                                    block177: {
                                                                        var15_21 = dy_1.P(this.Y).read(this.Q, var13_18, var14_20);
                                                                        v43 = var15_21;
                                                                        if (!var4_4) break block145;
                                                                        if (!var4_4) break block149;
                                                                        break block177;
                                                                        catch (Exception v51) {
                                                                            throw x5_0.a(v51);
                                                                        }
                                                                    }
                                                                    try {
                                                                        block178: {
                                                                            if (v43 > 0) break block150;
                                                                            break block178;
                                                                            catch (Exception v52) {
                                                                                throw x5_0.a(v52);
                                                                            }
                                                                        }
                                                                        if (var4_4) break;
                                                                    }
                                                                    catch (Exception v53) {
                                                                        throw x5_0.a(v53);
                                                                    }
                                                                }
                                                                var13_18 += var15_21;
                                                                v54 = var14_20 = var14_20 - var15_21;
                                                            }
                                                            if (var4_4) continue;
                                                        }
                                                    }
                                                    v43 = var9_14;
                                                }
                                                if (!var4_4) break block151;
                                                try {
                                                    block179: {
                                                        if (v43 <= 0) break block152;
                                                        break block179;
                                                        catch (Exception v55) {
                                                            throw x5_0.a(v55);
                                                        }
                                                    }
                                                    dy_1.P(this.Y).skip(var9_14);
                                                }
                                                catch (Exception v56) {
                                                    throw x5_0.a(v56);
                                                }
                                            }
                                            v43 = (cfr_temp_0 = (long)var8_13 - var7_9.C) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                        }
                                        try {
                                            if (!var4_4) break block153;
                                            if (v43 >= 0) break block154;
                                        }
                                        catch (Exception v57) {
                                            throw x5_0.a(v57);
                                        }
                                        dy_1.A(this.Y).W(this.u, dy_1.Z(this.Y));
                                        try {
                                            dy_1.U(this.Y, this.c, var7_9.P + (long)var8_13, (int)(var7_9.C - (long)var8_13), dy_1.A(this.Y));
                                        }
                                        catch (Exception var13_19) {
                                            throw new IOException(x5_0.a(28330, 24905));
                                        }
                                        this.n = var7_9.P + var7_9.C;
                                    }
                                    try {
                                        v58 = this;
                                        if (!var4_4) break block155;
                                        v43 = v58.Z;
                                    }
                                    catch (Exception v59) {
                                        throw x5_0.a(v59);
                                    }
                                }
                                try {
                                    if (v43 < dy_1.A(this.Y).D()) {
                                        ++this.Z;
                                    }
                                }
                                catch (Exception v60) {
                                    throw x5_0.a(v60);
                                }
                                v58 = this;
                            }
                            try {
                                try {
                                    v61 = v58.O;
                                    if (!var4_4) break block156;
                                    if (v61 == null) break block157;
                                }
                                catch (Exception v62) {
                                    throw x5_0.a(v62);
                                }
                                v61 = this.O;
                            }
                            catch (Exception v63) {
                                throw x5_0.a(v63);
                            }
                        }
                        try {
                            try {
                                v64 = (int)v61.o(var12_17);
                                if (!var4_4) break block158;
                                if (v64 != 0) break block157;
                            }
                            catch (Exception v65) {
                                throw x5_0.a(v65);
                            }
                            this.close();
                            return -1;
                        }
                        catch (Exception v66) {
                            throw x5_0.a(v66);
                        }
                    }
                    v64 = var12_17;
                }
                return v64;
            }
            v39 = 0;
        }
        return v39;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void close() throws IOException {
        block13: {
            block11: {
                block12: {
                    var1_1 = dm_2.J();
                    v0 = this;
                    if (var1_1) break block11;
                    try {
                        block14: {
                            if (!v0.V) break block12;
                            break block14;
                            catch (IOException v1) {
                                throw x5_0.a(v1);
                            }
                        }
                        return;
                    }
                    catch (IOException v2) {
                        throw x5_0.a(v2);
                    }
                }
                this.V = true;
                v0 = this;
            }
            if (var1_1) ** GOTO lbl34
            try {
                block15: {
                    if (v0.O == null) break block13;
                    break block15;
                    catch (IOException v3) {
                        throw x5_0.a(v3);
                    }
                }
                this.O.c();
            }
            catch (IOException v4) {
                throw x5_0.a(v4);
            }
        }
        dy_1.A(this.Y).W(this.u, dy_1.Z(this.Y));
        try {
            v0 = this;
lbl34:
            // 2 sources

            dy_1.a(v0.Y, this.c, this.u);
        }
        catch (IOException var2_2) {
            throw var2_2;
        }
        catch (Exception var2_3) {
            throw new IOException(var2_3.toString(), var2_3);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[3];
                    var11_1 = 0;
                    var10_2 = "\u00cf\u00d3\u00a6\u00a3\u00cd\u0005\u0019\f|X\u0096\u0007\b\u000b^\u00b8\u00d2\u00c6\u00c9";
                    var12_3 = "\u00cf\u00d3\u00a6\u00a3\u00cd\u0005\u0019\f|X\u0096\u0007\b\u000b^\u00b8\u00d2\u00c6\u00c9".length();
                    var9_4 = 5;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 126;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 25;
                                    break;
                                }
                                case 1: {
                                    v11 = 51;
                                    break;
                                }
                                case 2: {
                                    v11 = 118;
                                    break;
                                }
                                case 3: {
                                    v11 = 93;
                                    break;
                                }
                                case 4: {
                                    v11 = 40;
                                    break;
                                }
                                case 5: {
                                    v11 = 115;
                                    break;
                                }
                                default: {
                                    v11 = 59;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                x5_0.a = var13;
                x5_0.b = new String[3];
                var0_7 = 5647083561068770220L;
                var6_8 = new long[8];
                var3_9 = 0;
                var4_10 = "~K\u00bcD2\u001d\u0007#5\u00aea\u0091\u0084w\u0096p,t\u008e\u0001}\u0005>W\u0086\u0011\u00cb\u0019\u00ef\u008e8\u00d8Jv\u00f0\r\u00cbr\u00e9{\u00e2\u00d9\nc\u0093\"@\u00f4";
                var5_11 = "~K\u00bcD2\u001d\u0007#5\u00aea\u0091\u0084w\u0096p,t\u008e\u0001}\u0005>W\u0086\u0011\u00cb\u0019\u00ef\u008e8\u00d8Jv\u00f0\r\u00cbr\u00e9{\u00e2\u00d9\nc\u0093\"@\u00f4".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u0019\u009e\u0087K\u00d3\u00b8\u0093IY\u0000\u00d84K\u00af\u0099\u00c0";
                    var5_11 = "\u0019\u009e\u0087K\u00d3\u00b8\u0093IY\u0000\u00d84K\u00af\u0099\u00c0".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        x5_0.d = var6_8;
        x5_0.e = new Integer[8];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6EAB) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 86;
                    break;
                }
                case 1: {
                    n14 = 64;
                    break;
                }
                case 2: {
                    n14 = 237;
                    break;
                }
                case 3: {
                    n14 = 54;
                    break;
                }
                case 4: {
                    n14 = 87;
                    break;
                }
                case 5: {
                    n14 = 148;
                    break;
                }
                case 6: {
                    n14 = 39;
                    break;
                }
                case 7: {
                    n14 = 172;
                    break;
                }
                case 8: {
                    n14 = 239;
                    break;
                }
                case 9: {
                    n14 = 115;
                    break;
                }
                case 10: {
                    n14 = 242;
                    break;
                }
                case 11: {
                    n14 = 123;
                    break;
                }
                case 12: {
                    n14 = 162;
                    break;
                }
                case 13: {
                    n14 = 166;
                    break;
                }
                case 14: {
                    n14 = 90;
                    break;
                }
                case 15: {
                    n14 = 209;
                    break;
                }
                case 16: {
                    n14 = 30;
                    break;
                }
                case 17: {
                    n14 = 88;
                    break;
                }
                case 18: {
                    n14 = 246;
                    break;
                }
                case 19: {
                    n14 = 7;
                    break;
                }
                case 20: {
                    n14 = 106;
                    break;
                }
                case 21: {
                    n14 = 144;
                    break;
                }
                case 22: {
                    n14 = 225;
                    break;
                }
                case 23: {
                    n14 = 37;
                    break;
                }
                case 24: {
                    n14 = 170;
                    break;
                }
                case 25: {
                    n14 = 93;
                    break;
                }
                case 26: {
                    n14 = 250;
                    break;
                }
                case 27: {
                    n14 = 215;
                    break;
                }
                case 28: {
                    n14 = 13;
                    break;
                }
                case 29: {
                    n14 = 18;
                    break;
                }
                case 30: {
                    n14 = 190;
                    break;
                }
                case 31: {
                    n14 = 141;
                    break;
                }
                case 32: {
                    n14 = 174;
                    break;
                }
                case 33: {
                    n14 = 29;
                    break;
                }
                case 34: {
                    n14 = 4;
                    break;
                }
                case 35: {
                    n14 = 63;
                    break;
                }
                case 36: {
                    n14 = 143;
                    break;
                }
                case 37: {
                    n14 = 120;
                    break;
                }
                case 38: {
                    n14 = 71;
                    break;
                }
                case 39: {
                    n14 = 210;
                    break;
                }
                case 40: {
                    n14 = 8;
                    break;
                }
                case 41: {
                    n14 = 156;
                    break;
                }
                case 42: {
                    n14 = 163;
                    break;
                }
                case 43: {
                    n14 = 254;
                    break;
                }
                case 44: {
                    n14 = 175;
                    break;
                }
                case 45: {
                    n14 = 147;
                    break;
                }
                case 46: {
                    n14 = 16;
                    break;
                }
                case 47: {
                    n14 = 248;
                    break;
                }
                case 48: {
                    n14 = 222;
                    break;
                }
                case 49: {
                    n14 = 11;
                    break;
                }
                case 50: {
                    n14 = 121;
                    break;
                }
                case 51: {
                    n14 = 42;
                    break;
                }
                case 52: {
                    n14 = 241;
                    break;
                }
                case 53: {
                    n14 = 136;
                    break;
                }
                case 54: {
                    n14 = 132;
                    break;
                }
                case 55: {
                    n14 = 134;
                    break;
                }
                case 56: {
                    n14 = 57;
                    break;
                }
                case 57: {
                    n14 = 104;
                    break;
                }
                case 58: {
                    n14 = 206;
                    break;
                }
                case 59: {
                    n14 = 56;
                    break;
                }
                case 60: {
                    n14 = 15;
                    break;
                }
                case 61: {
                    n14 = 165;
                    break;
                }
                case 62: {
                    n14 = 238;
                    break;
                }
                case 63: {
                    n14 = 43;
                    break;
                }
                case 64: {
                    n14 = 224;
                    break;
                }
                case 65: {
                    n14 = 66;
                    break;
                }
                case 66: {
                    n14 = 49;
                    break;
                }
                case 67: {
                    n14 = 98;
                    break;
                }
                case 68: {
                    n14 = 44;
                    break;
                }
                case 69: {
                    n14 = 51;
                    break;
                }
                case 70: {
                    n14 = 67;
                    break;
                }
                case 71: {
                    n14 = 157;
                    break;
                }
                case 72: {
                    n14 = 0;
                    break;
                }
                case 73: {
                    n14 = 107;
                    break;
                }
                case 74: {
                    n14 = 10;
                    break;
                }
                case 75: {
                    n14 = 17;
                    break;
                }
                case 76: {
                    n14 = 50;
                    break;
                }
                case 77: {
                    n14 = 102;
                    break;
                }
                case 78: {
                    n14 = 185;
                    break;
                }
                case 79: {
                    n14 = 12;
                    break;
                }
                case 80: {
                    n14 = 85;
                    break;
                }
                case 81: {
                    n14 = 198;
                    break;
                }
                case 82: {
                    n14 = 233;
                    break;
                }
                case 83: {
                    n14 = 32;
                    break;
                }
                case 84: {
                    n14 = 146;
                    break;
                }
                case 85: {
                    n14 = 6;
                    break;
                }
                case 86: {
                    n14 = 82;
                    break;
                }
                case 87: {
                    n14 = 77;
                    break;
                }
                case 88: {
                    n14 = 181;
                    break;
                }
                case 89: {
                    n14 = 197;
                    break;
                }
                case 90: {
                    n14 = 110;
                    break;
                }
                case 91: {
                    n14 = 192;
                    break;
                }
                case 92: {
                    n14 = 75;
                    break;
                }
                case 93: {
                    n14 = 133;
                    break;
                }
                case 94: {
                    n14 = 177;
                    break;
                }
                case 95: {
                    n14 = 131;
                    break;
                }
                case 96: {
                    n14 = 191;
                    break;
                }
                case 97: {
                    n14 = 230;
                    break;
                }
                case 98: {
                    n14 = 124;
                    break;
                }
                case 99: {
                    n14 = 216;
                    break;
                }
                case 100: {
                    n14 = 244;
                    break;
                }
                case 101: {
                    n14 = 65;
                    break;
                }
                case 102: {
                    n14 = 212;
                    break;
                }
                case 103: {
                    n14 = 38;
                    break;
                }
                case 104: {
                    n14 = 196;
                    break;
                }
                case 105: {
                    n14 = 31;
                    break;
                }
                case 106: {
                    n14 = 226;
                    break;
                }
                case 107: {
                    n14 = 182;
                    break;
                }
                case 108: {
                    n14 = 97;
                    break;
                }
                case 109: {
                    n14 = 168;
                    break;
                }
                case 110: {
                    n14 = 140;
                    break;
                }
                case 111: {
                    n14 = 69;
                    break;
                }
                case 112: {
                    n14 = 68;
                    break;
                }
                case 113: {
                    n14 = 189;
                    break;
                }
                case 114: {
                    n14 = 76;
                    break;
                }
                case 115: {
                    n14 = 232;
                    break;
                }
                case 116: {
                    n14 = 99;
                    break;
                }
                case 117: {
                    n14 = 201;
                    break;
                }
                case 118: {
                    n14 = 92;
                    break;
                }
                case 119: {
                    n14 = 169;
                    break;
                }
                case 120: {
                    n14 = 235;
                    break;
                }
                case 121: {
                    n14 = 114;
                    break;
                }
                case 122: {
                    n14 = 208;
                    break;
                }
                case 123: {
                    n14 = 21;
                    break;
                }
                case 124: {
                    n14 = 193;
                    break;
                }
                case 125: {
                    n14 = 219;
                    break;
                }
                case 126: {
                    n14 = 46;
                    break;
                }
                case 127: {
                    n14 = 40;
                    break;
                }
                case 128: {
                    n14 = 173;
                    break;
                }
                case 129: {
                    n14 = 167;
                    break;
                }
                case 130: {
                    n14 = 100;
                    break;
                }
                case 131: {
                    n14 = 223;
                    break;
                }
                case 132: {
                    n14 = 105;
                    break;
                }
                case 133: {
                    n14 = 9;
                    break;
                }
                case 134: {
                    n14 = 176;
                    break;
                }
                case 135: {
                    n14 = 183;
                    break;
                }
                case 136: {
                    n14 = 130;
                    break;
                }
                case 137: {
                    n14 = 179;
                    break;
                }
                case 138: {
                    n14 = 118;
                    break;
                }
                case 139: {
                    n14 = 161;
                    break;
                }
                case 140: {
                    n14 = 228;
                    break;
                }
                case 141: {
                    n14 = 251;
                    break;
                }
                case 142: {
                    n14 = 27;
                    break;
                }
                case 143: {
                    n14 = 229;
                    break;
                }
                case 144: {
                    n14 = 245;
                    break;
                }
                case 145: {
                    n14 = 199;
                    break;
                }
                case 146: {
                    n14 = 113;
                    break;
                }
                case 147: {
                    n14 = 249;
                    break;
                }
                case 148: {
                    n14 = 139;
                    break;
                }
                case 149: {
                    n14 = 73;
                    break;
                }
                case 150: {
                    n14 = 109;
                    break;
                }
                case 151: {
                    n14 = 214;
                    break;
                }
                case 152: {
                    n14 = 149;
                    break;
                }
                case 153: {
                    n14 = 116;
                    break;
                }
                case 154: {
                    n14 = 187;
                    break;
                }
                case 155: {
                    n14 = 101;
                    break;
                }
                case 156: {
                    n14 = 79;
                    break;
                }
                case 157: {
                    n14 = 59;
                    break;
                }
                case 158: {
                    n14 = 22;
                    break;
                }
                case 159: {
                    n14 = 211;
                    break;
                }
                case 160: {
                    n14 = 80;
                    break;
                }
                case 161: {
                    n14 = 227;
                    break;
                }
                case 162: {
                    n14 = 178;
                    break;
                }
                case 163: {
                    n14 = 55;
                    break;
                }
                case 164: {
                    n14 = 200;
                    break;
                }
                case 165: {
                    n14 = 205;
                    break;
                }
                case 166: {
                    n14 = 28;
                    break;
                }
                case 167: {
                    n14 = 1;
                    break;
                }
                case 168: {
                    n14 = 60;
                    break;
                }
                case 169: {
                    n14 = 127;
                    break;
                }
                case 170: {
                    n14 = 158;
                    break;
                }
                case 171: {
                    n14 = 150;
                    break;
                }
                case 172: {
                    n14 = 2;
                    break;
                }
                case 173: {
                    n14 = 154;
                    break;
                }
                case 174: {
                    n14 = 128;
                    break;
                }
                case 175: {
                    n14 = 47;
                    break;
                }
                case 176: {
                    n14 = 243;
                    break;
                }
                case 177: {
                    n14 = 70;
                    break;
                }
                case 178: {
                    n14 = 252;
                    break;
                }
                case 179: {
                    n14 = 152;
                    break;
                }
                case 180: {
                    n14 = 202;
                    break;
                }
                case 181: {
                    n14 = 89;
                    break;
                }
                case 182: {
                    n14 = 135;
                    break;
                }
                case 183: {
                    n14 = 125;
                    break;
                }
                case 184: {
                    n14 = 247;
                    break;
                }
                case 185: {
                    n14 = 159;
                    break;
                }
                case 186: {
                    n14 = 155;
                    break;
                }
                case 187: {
                    n14 = 74;
                    break;
                }
                case 188: {
                    n14 = 36;
                    break;
                }
                case 189: {
                    n14 = 72;
                    break;
                }
                case 190: {
                    n14 = 45;
                    break;
                }
                case 191: {
                    n14 = 19;
                    break;
                }
                case 192: {
                    n14 = 62;
                    break;
                }
                case 193: {
                    n14 = 204;
                    break;
                }
                case 194: {
                    n14 = 122;
                    break;
                }
                case 195: {
                    n14 = 231;
                    break;
                }
                case 196: {
                    n14 = 20;
                    break;
                }
                case 197: {
                    n14 = 138;
                    break;
                }
                case 198: {
                    n14 = 25;
                    break;
                }
                case 199: {
                    n14 = 184;
                    break;
                }
                case 200: {
                    n14 = 34;
                    break;
                }
                case 201: {
                    n14 = 236;
                    break;
                }
                case 202: {
                    n14 = 188;
                    break;
                }
                case 203: {
                    n14 = 160;
                    break;
                }
                case 204: {
                    n14 = 14;
                    break;
                }
                case 205: {
                    n14 = 53;
                    break;
                }
                case 206: {
                    n14 = 221;
                    break;
                }
                case 207: {
                    n14 = 129;
                    break;
                }
                case 208: {
                    n14 = 23;
                    break;
                }
                case 209: {
                    n14 = 58;
                    break;
                }
                case 210: {
                    n14 = 94;
                    break;
                }
                case 211: {
                    n14 = 240;
                    break;
                }
                case 212: {
                    n14 = 119;
                    break;
                }
                case 213: {
                    n14 = 3;
                    break;
                }
                case 214: {
                    n14 = 207;
                    break;
                }
                case 215: {
                    n14 = 186;
                    break;
                }
                case 216: {
                    n14 = 95;
                    break;
                }
                case 217: {
                    n14 = 142;
                    break;
                }
                case 218: {
                    n14 = 24;
                    break;
                }
                case 219: {
                    n14 = 145;
                    break;
                }
                case 220: {
                    n14 = 96;
                    break;
                }
                case 221: {
                    n14 = 220;
                    break;
                }
                case 222: {
                    n14 = 137;
                    break;
                }
                case 223: {
                    n14 = 213;
                    break;
                }
                case 224: {
                    n14 = 253;
                    break;
                }
                case 225: {
                    n14 = 203;
                    break;
                }
                case 226: {
                    n14 = 84;
                    break;
                }
                case 227: {
                    n14 = 33;
                    break;
                }
                case 228: {
                    n14 = 180;
                    break;
                }
                case 229: {
                    n14 = 153;
                    break;
                }
                case 230: {
                    n14 = 108;
                    break;
                }
                case 231: {
                    n14 = 112;
                    break;
                }
                case 232: {
                    n14 = 234;
                    break;
                }
                case 233: {
                    n14 = 35;
                    break;
                }
                case 234: {
                    n14 = 103;
                    break;
                }
                case 235: {
                    n14 = 41;
                    break;
                }
                case 236: {
                    n14 = 164;
                    break;
                }
                case 237: {
                    n14 = 26;
                    break;
                }
                case 238: {
                    n14 = 195;
                    break;
                }
                case 239: {
                    n14 = 61;
                    break;
                }
                case 240: {
                    n14 = 111;
                    break;
                }
                case 241: {
                    n14 = 151;
                    break;
                }
                case 242: {
                    n14 = 48;
                    break;
                }
                case 243: {
                    n14 = 83;
                    break;
                }
                case 244: {
                    n14 = 5;
                    break;
                }
                case 245: {
                    n14 = 194;
                    break;
                }
                case 246: {
                    n14 = 126;
                    break;
                }
                case 247: {
                    n14 = 217;
                    break;
                }
                case 248: {
                    n14 = 218;
                    break;
                }
                case 249: {
                    n14 = 52;
                    break;
                }
                case 250: {
                    n14 = 91;
                    break;
                }
                case 251: {
                    n14 = 255;
                    break;
                }
                case 252: {
                    n14 = 81;
                    break;
                }
                case 253: {
                    n14 = 117;
                    break;
                }
                case 254: {
                    n14 = 171;
                    break;
                }
                default: {
                    n14 = 78;
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
            x5_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7108;
        if (e[n11] == null) {
            x5_0.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

