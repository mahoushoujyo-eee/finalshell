/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DC;
import com.DF;
import com.df_0;
import com.dg_1;
import com.ik_2;
import com.nm_2;
import com.ue_0;
import java.io.ByteArrayOutputStream;

final class a4 {
    int O;
    int N;
    long i = a4.c(4102, 4271266680613976758L);
    long a;
    int V;
    int y;
    int t;
    DC G;
    private final df_0 s;
    private int W;
    private int U = -1;
    private byte[] R = new byte[4];
    DF F = null;
    private static byte[] H;
    private ByteArrayOutputStream B = null;
    private static final String[] b;
    private static final String[] c;
    private static final long[] d;
    private static final Integer[] e;
    private static final long[] f;
    private static final Long[] g;

    int v() {
        int[] nArray = nm_2.g();
        df_0 df_02 = this.s;
        if (nArray == null) {
            if (df_02 == null) {
                return a4.a(20936, 7115522834845632053L);
            }
            this.s.F = 0L;
            this.s.O = 0L;
            df_02 = this.s;
        }
        df_02.t = null;
        this.O = a4.a(27645, 8674853530203503658L);
        this.U = -1;
        this.G.z();
        return 0;
    }

    int m() {
        block3: {
            DC dC;
            block2: {
                int[] nArray = nm_2.g();
                dC = this.G;
                if (nArray != null) break block2;
                if (dC == null) break block3;
                dC = this.G;
            }
            dC.I();
        }
        return 0;
    }

    a4(df_0 df_02) {
        this.s = df_02;
    }

    int e(int n10) {
        int n11;
        block21: {
            a4 a42;
            block19: {
                block20: {
                    int[] nArray;
                    block18: {
                        int n12;
                        block16: {
                            block17: {
                                int n13;
                                block13: {
                                    block10: {
                                        block14: {
                                            block15: {
                                                block11: {
                                                    block12: {
                                                        block8: {
                                                            block9: {
                                                                this.s.t = null;
                                                                this.G = null;
                                                                this.y = 0;
                                                                nArray = nm_2.g();
                                                                n12 = n10;
                                                                if (nArray != null) break block8;
                                                                if (n12 >= 0) break block9;
                                                                n10 = -n10;
                                                                if (nArray == null) break block10;
                                                            }
                                                            n12 = n10 & a4.a(26721, 4951765260771999639L);
                                                        }
                                                        if (nArray != null) break block11;
                                                        if (n12 == 0) break block12;
                                                        this.y = a4.a(27417, 2622813429361687796L);
                                                        n12 = n10 &= a4.a(31770, 4741819084736474050L);
                                                        n13 = a4.a(6305, 4999559189936852800L);
                                                        if (nArray != null) break block13;
                                                        if (n12 >= n13) break block10;
                                                        n10 &= a4.a(28734, 2695156862434486231L);
                                                        if (nArray == null) break block10;
                                                    }
                                                    n12 = n10 & a4.a(9442, 2039352601519289123L);
                                                }
                                                if (nArray != null) break block14;
                                                if (n12 == 0) break block15;
                                                this.y = a4.a(6476, 7117838744833773200L);
                                                n10 &= a4.a(10469, 5696939088395304733L);
                                                if (nArray == null) break block10;
                                            }
                                            this.y = (n10 >> 4) + 1;
                                            n12 = n10;
                                        }
                                        n13 = a4.a(8254, 3334861552766056393L);
                                        if (nArray != null) break block13;
                                        if (n12 < n13) {
                                            n10 &= a4.a(10469, 5696939088395304733L);
                                        }
                                    }
                                    n12 = n10;
                                    if (nArray != null) break block16;
                                    n13 = a4.a(19408, 3788319632254082052L);
                                }
                                if (n12 < n13) break block17;
                                n12 = n10;
                                if (nArray != null) break block16;
                                if (n12 <= a4.a(10469, 5696939088395304733L)) break block18;
                            }
                            this.m();
                            n12 = a4.a(20936, 7115522834845632053L);
                        }
                        return n12;
                    }
                    a42 = this;
                    if (nArray != null) break block19;
                    if (a42.G == null) break block20;
                    n11 = this.t;
                    if (nArray != null) break block21;
                    if (n11 != n10) {
                        this.G.I();
                        this.G = null;
                    }
                }
                this.t = n10;
                this.G = new DC(this.s, 1 << n10);
                a42 = this;
            }
            a42.v();
            n11 = 0;
        }
        return n11;
    }

    /*
     * Unable to fully structure code
     */
    int N(int var1_1) {
        block325: {
            block326: {
                block322: {
                    block323: {
                        block324: {
                            block330: {
                                block329: {
                                    block328: {
                                        block321: {
                                            var3_2 = false;
                                            var2_3 = nm_2.g();
                                            v0 = this.s;
                                            if (var2_3 != null) break block321;
                                            try {
                                                block327: {
                                                    if (v0 == null) ** GOTO lbl20
                                                    break block327;
                                                    catch (ik_2 v1) {
                                                        throw a4.a(v1);
                                                    }
                                                }
                                                v0 = this.s;
                                            }
                                            catch (ik_2 v2) {
                                                throw a4.a(v2);
                                            }
                                        }
                                        if (v0.x != null) break block322;
lbl20:
                                        // 3 sources

                                        v3 = var1_1;
                                        if (var2_3 != null) break block323;
                                        break block328;
                                        catch (ik_2 v4) {
                                            throw a4.a(v4);
                                        }
                                    }
                                    if (v3 != 4) break block324;
                                    break block329;
                                    catch (ik_2 v5) {
                                        throw a4.a(v5);
                                    }
                                }
                                v3 = this.O;
                                if (var2_3 != null) break block323;
                                break block330;
                                catch (ik_2 v6) {
                                    throw a4.a(v6);
                                }
                            }
                            try {
                                block331: {
                                    if (v3 != a4.a(22937, 7010560974798851680L)) break block324;
                                    break block331;
                                    catch (ik_2 v7) {
                                        throw a4.a(v7);
                                    }
                                }
                                return 0;
                            }
                            catch (ik_2 v8) {
                                throw a4.a(v8);
                            }
                        }
                        v3 = a4.a(20936, 7115522834845632053L);
                    }
                    return v3;
                }
                v9 = var1_1;
                if (var2_3 != null) break block325;
                try {
                    block332: {
                        if (v9 != 4) break block326;
                        break block332;
                        catch (ik_2 v10) {
                            throw a4.a(v10);
                        }
                    }
                    v9 = a4.a(22448, 3656459363730980966L);
                    break block325;
                }
                catch (ik_2 v11) {
                    throw a4.a(v11);
                }
            }
            v9 = 0;
        }
        var1_1 = v9;
        var4_4 = a4.a(22448, 3656459363730980966L);
        block304: while (true) lbl-1000:
        // 19 sources

        {
            switch (this.O) {
                case 14: {
                    v12 = this.y;
                    if (var2_3 != null) ** GOTO lbl89
                    try {
                        if (v12 != 0) ** GOTO lbl87
                        ** GOTO lbl82
                        catch (ik_2 v13) {
                            throw a4.a(v13);
                        }
lbl82:
                        // 1 sources

                        this.O = a4.a(16593, 6164126498226640671L);
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v14) {
                        throw a4.a(v14);
                    }
lbl87:
                    // 2 sources

                    try {
                        v12 = this.Y(2, var4_4, var1_1);
lbl89:
                        // 2 sources

                        var4_4 = v12;
                    }
                    catch (ik_2 var6_7) {
                        return var6_7.Y;
                    }
                    v15 = this.y;
                    if (var2_3 != null) ** GOTO lbl117
                    if (v15 == 4) ** GOTO lbl112
                    ** GOTO lbl102
                    catch (ik_2 v16) {
                        throw a4.a(v16);
                    }
lbl102:
                    // 2 sources

                    v15 = this.y & 2;
                    if (var2_3 != null) ** GOTO lbl157
                    ** GOTO lbl107
                    catch (ik_2 v17) {
                        throw a4.a(v17);
                    }
lbl107:
                    // 1 sources

                    try {
                        if (v15 == 0) ** GOTO lbl155
                        ** GOTO lbl112
                        catch (ik_2 v18) {
                            throw a4.a(v18);
                        }
lbl112:
                        // 2 sources

                        v15 = (cfr_temp_0 = this.a - a4.c(32097, 5500606694343268306L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                    }
                    catch (ik_2 v19) {
                        throw a4.a(v19);
                    }
lbl117:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl157
                    if (v15 != 0) ** GOTO lbl155
                    ** GOTO lbl124
                    catch (ik_2 v20) {
                        throw a4.a(v20);
                    }
lbl124:
                    // 2 sources

                    v21 = this;
                    if (var2_3 != null) ** GOTO lbl142
                    ** GOTO lbl129
                    catch (ik_2 v22) {
                        throw a4.a(v22);
                    }
lbl129:
                    // 1 sources

                    try {
                        if (v21.y != 4) ** GOTO lbl138
                        ** GOTO lbl134
                        catch (ik_2 v23) {
                            throw a4.a(v23);
                        }
lbl134:
                        // 1 sources

                        this.y = a4.a(28429, 3754601069931215054L);
                    }
                    catch (ik_2 v24) {
                        throw a4.a(v24);
                    }
lbl138:
                    // 2 sources

                    this.s.e = new ue_0();
                    this.b(2, this.a);
                    v21 = this;
lbl142:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl153
                    try {
                        if (v21.F != null) ** GOTO lbl152
                        ** GOTO lbl148
                        catch (ik_2 v25) {
                            throw a4.a(v25);
                        }
lbl148:
                        // 1 sources

                        this.F = new DF();
                    }
                    catch (ik_2 v26) {
                        throw a4.a(v26);
                    }
lbl152:
                    // 2 sources

                    v21 = this;
lbl153:
                    // 2 sources

                    v21.O = a4.a(11471, 1089527730443254531L);
                    if (var2_3 == null) ** GOTO lbl-1000
lbl155:
                    // 3 sources

                    v15 = this.y & 2;
lbl157:
                    // 4 sources

                    if (var2_3 != null) ** GOTO lbl172
                    try {
                        if (v15 == 0) ** GOTO lbl169
                        ** GOTO lbl163
                        catch (ik_2 v27) {
                            throw a4.a(v27);
                        }
lbl163:
                        // 1 sources

                        this.O = a4.a(32117, 1266935714368826016L);
                        this.s.t = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53930 out of bounds for length 3";
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v28) {
                        throw a4.a(v28);
                    }
lbl169:
                    // 2 sources

                    this.W = 0;
                    this.N = (int)this.a & a4.a(22692, 6839445763520368510L);
                    v15 = (int)(this.a >> a4.a(8444, 6817212859351660315L)) & a4.a(22692, 6839445763520368510L);
lbl172:
                    // 2 sources

                    var5_5 = v15;
                    v29 = this.y & 1;
                    if (var2_3 != null) ** GOTO lbl197
                    if (v29 == 0) ** GOTO lbl192
                    ** GOTO lbl182
                    catch (ik_2 v30) {
                        throw a4.a(v30);
                    }
lbl182:
                    // 2 sources

                    v29 = ((this.N << a4.a(8444, 6817212859351660315L)) + var5_5) % a4.a(22700, 3879518310618959723L);
                    if (var2_3 != null) ** GOTO lbl229
                    ** GOTO lbl187
                    catch (ik_2 v31) {
                        throw a4.a(v31);
                    }
lbl187:
                    // 1 sources

                    try {
                        if (v29 == 0) ** GOTO lbl228
                        ** GOTO lbl192
                        catch (ik_2 v32) {
                            throw a4.a(v32);
                        }
lbl192:
                        // 2 sources

                        v29 = this.N & a4.a(10469, 5696939088395304733L);
                    }
                    catch (ik_2 v33) {
                        throw a4.a(v33);
                    }
lbl197:
                    // 3 sources

                    v34 = a4.a(8444, 6817212859351660315L);
                    if (var2_3 != null) ** GOTO lbl231
                    if (v29 == v34) ** GOTO lbl228
                    ** GOTO lbl205
                    catch (ik_2 v35) {
                        throw a4.a(v35);
                    }
lbl205:
                    // 2 sources

                    v36 = this;
                    if (var2_3 != null) ** GOTO lbl226
                    ** GOTO lbl210
                    catch (ik_2 v37) {
                        throw a4.a(v37);
                    }
lbl210:
                    // 1 sources

                    try {
                        if (v36.y != 4) ** GOTO lbl224
                        ** GOTO lbl215
                        catch (ik_2 v38) {
                            throw a4.a(v38);
                        }
lbl215:
                        // 1 sources

                        this.s.f -= 2;
                        this.s.L += 2;
                        this.s.O -= a4.c(7538, 8981576780583090125L);
                        this.y = 0;
                        this.O = a4.a(16593, 6164126498226640671L);
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v39) {
                        throw a4.a(v39);
                    }
lbl224:
                    // 2 sources

                    this.O = a4.a(32117, 1266935714368826016L);
                    v36 = this;
lbl226:
                    // 2 sources

                    v36.s.t = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53929 out of bounds for length 3";
                    if (var2_3 == null) ** GOTO lbl-1000
lbl228:
                    // 3 sources

                    v29 = this.N & a4.a(10469, 5696939088395304733L);
lbl229:
                    // 2 sources

                    v34 = a4.a(8444, 6817212859351660315L);
lbl231:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl246
                    try {
                        if (v29 == v34) ** GOTO lbl243
                        ** GOTO lbl237
                        catch (ik_2 v40) {
                            throw a4.a(v40);
                        }
lbl237:
                        // 1 sources

                        this.O = a4.a(32117, 1266935714368826016L);
                        this.s.t = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53931 out of bounds for length 3";
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v41) {
                        throw a4.a(v41);
                    }
lbl243:
                    // 2 sources

                    v29 = this.y;
                    v34 = 4;
lbl246:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl259
                    try {
                        if (v29 != v34) ** GOTO lbl256
                        ** GOTO lbl252
                        catch (ik_2 v42) {
                            throw a4.a(v42);
                        }
lbl252:
                        // 1 sources

                        this.y = 1;
                    }
                    catch (ik_2 v43) {
                        throw a4.a(v43);
                    }
lbl256:
                    // 2 sources

                    v29 = (this.N >> 4) + a4.a(8444, 6817212859351660315L);
                    v34 = this.t;
lbl259:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl281
                    try {
                        if (v29 <= v34) ** GOTO lbl271
                        ** GOTO lbl265
                        catch (ik_2 v44) {
                            throw a4.a(v44);
                        }
lbl265:
                        // 1 sources

                        this.O = a4.a(32117, 1266935714368826016L);
                        this.s.t = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53926 out of bounds for length 3";
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v45) {
                        throw a4.a(v45);
                    }
lbl271:
                    // 2 sources

                    try {
                        v46 = this;
                        if (var2_3 == null) {
                            v46.s.e = new dg_1();
                            v29 = var5_5;
                            v34 = a4.a(10506, 7643847508299316969L);
                        }
                        ** GOTO lbl289
                    }
                    catch (ik_2 v47) {
                        throw a4.a(v47);
                    }
lbl281:
                    // 2 sources

                    try {
                        if ((v29 & v34) != 0) ** GOTO lbl288
                        this.O = a4.a(16593, 6164126498226640671L);
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v48) {
                        throw a4.a(v48);
                    }
lbl288:
                    // 2 sources

                    v46 = this;
lbl289:
                    // 2 sources

                    v46.O = a4.a(22278, 6624816313608732864L);
                }
                case 2: {
                    v49 = this.s.L;
                    if (var2_3 != null) ** GOTO lbl303
                    try {
                        if (v49 != 0) ** GOTO lbl302
                        ** GOTO lbl299
                        catch (ik_2 v50) {
                            throw a4.a(v50);
                        }
lbl299:
                        // 1 sources

                        return var4_4;
                    }
                    catch (ik_2 v51) {
                        throw a4.a(v51);
                    }
lbl302:
                    // 1 sources

                    v49 = var1_1;
lbl303:
                    // 2 sources

                    var4_4 = v49;
                    --this.s.L;
                    ++this.s.O;
                    this.a = (long)((this.s.x[this.s.f++] & a4.a(22692, 6839445763520368510L)) << a4.a(13412, 9003296142589256577L)) & a4.c(22736, 1686306058536612461L);
                    this.O = a4.a(4916, 496060451737060603L);
                }
                case 3: {
                    v52 = this.s.L;
                    if (var2_3 != null) ** GOTO lbl321
                    try {
                        if (v52 != 0) ** GOTO lbl320
                        ** GOTO lbl317
                        catch (ik_2 v53) {
                            throw a4.a(v53);
                        }
lbl317:
                        // 1 sources

                        return var4_4;
                    }
                    catch (ik_2 v54) {
                        throw a4.a(v54);
                    }
lbl320:
                    // 1 sources

                    v52 = var1_1;
lbl321:
                    // 2 sources

                    var4_4 = v52;
                    --this.s.L;
                    ++this.s.O;
                    this.a += (long)((this.s.x[this.s.f++] & a4.a(22692, 6839445763520368510L)) << a4.a(27317, 4626486676951186789L)) & a4.c(8797, 2442095170423720164L);
                    this.O = a4.a(6476, 7117838744833773200L);
                }
                case 4: {
                    v55 = this.s.L;
                    if (var2_3 != null) ** GOTO lbl339
                    try {
                        if (v55 != 0) ** GOTO lbl338
                        ** GOTO lbl335
                        catch (ik_2 v56) {
                            throw a4.a(v56);
                        }
lbl335:
                        // 1 sources

                        return var4_4;
                    }
                    catch (ik_2 v57) {
                        throw a4.a(v57);
                    }
lbl338:
                    // 1 sources

                    v55 = var1_1;
lbl339:
                    // 2 sources

                    var4_4 = v55;
                    --this.s.L;
                    ++this.s.O;
                    this.a += (long)((this.s.x[this.s.f++] & a4.a(22692, 6839445763520368510L)) << a4.a(8444, 6817212859351660315L)) & a4.c(16899, 7059650450529675451L);
                    this.O = a4.a(24241, 4532158553124047210L);
                }
                case 5: {
                    v58 = this.s.L--;
                    if (var2_3 != null) ** GOTO lbl362
                    try {
                        if (v58 != 0) ** GOTO lbl356
                        ** GOTO lbl353
                        catch (ik_2 v59) {
                            throw a4.a(v59);
                        }
lbl353:
                        // 1 sources

                        return var4_4;
                    }
                    catch (ik_2 v60) {
                        throw a4.a(v60);
                    }
lbl356:
                    // 1 sources

                    var4_4 = var1_1;
                    ++this.s.O;
                    this.a += (long)this.s.x[this.s.f++] & a4.c(6512, 9077575468358120396L);
                    this.s.e.I(this.a);
                    this.O = a4.a(23306, 8467786741266091262L);
                    v58 = 2;
lbl362:
                    // 2 sources

                    return v58;
                }
                case 6: {
                    this.O = a4.a(32117, 1266935714368826016L);
                    this.s.t = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53927 out of bounds for length 3";
                    this.V = 0;
                    return a4.a(20936, 7115522834845632053L);
                }
                case 7: {
                    var4_4 = this.G.S(var4_4);
                    v61 = var4_4;
                    if (var2_3 != null) ** GOTO lbl385
                    try {
                        if (v61 != a4.a(31892, 2187186631325723462L)) ** GOTO lbl384
                        ** GOTO lbl378
                        catch (ik_2 v62) {
                            throw a4.a(v62);
                        }
lbl378:
                        // 1 sources

                        this.O = a4.a(32117, 1266935714368826016L);
                        this.V = 0;
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v63) {
                        throw a4.a(v63);
                    }
lbl384:
                    // 2 sources

                    v61 = var4_4;
lbl385:
                    // 2 sources

                    try {
                        if (var2_3 != null) ** GOTO lbl395
                        if (v61 == 0) {
                        }
                        ** GOTO lbl393
                    }
                    catch (ik_2 v64) {
                        throw a4.a(v64);
                    }
                    var4_4 = var1_1;
lbl393:
                    // 2 sources

                    v61 = var4_4;
lbl395:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl415
                    try {
                        if (v61 == 1) ** GOTO lbl404
                        ** GOTO lbl401
                        catch (ik_2 v65) {
                            throw a4.a(v65);
                        }
lbl401:
                        // 1 sources

                        return var4_4;
                    }
                    catch (ik_2 v66) {
                        throw a4.a(v66);
                    }
lbl404:
                    // 1 sources

                    var4_4 = var1_1;
                    try {
                        this.i = this.s.e.u();
                        this.G.z();
                        v67 = this;
                        if (var2_3 == null) {
                            v61 = v67.y;
                        }
                        ** GOTO lbl423
                    }
                    catch (ik_2 v68) {
                        throw a4.a(v68);
                    }
lbl415:
                    // 2 sources

                    try {
                        if (v61 != 0) ** GOTO lbl422
                        this.O = a4.a(24344, 7085604449346455787L);
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v69) {
                        throw a4.a(v69);
                    }
lbl422:
                    // 2 sources

                    v67 = this;
lbl423:
                    // 2 sources

                    v67.O = a4.a(8444, 6817212859351660315L);
                }
                case 8: {
                    v70 = this.s.L;
                    if (var2_3 != null) ** GOTO lbl437
                    try {
                        if (v70 != 0) ** GOTO lbl436
                        ** GOTO lbl433
                        catch (ik_2 v71) {
                            throw a4.a(v71);
                        }
lbl433:
                        // 1 sources

                        return var4_4;
                    }
                    catch (ik_2 v72) {
                        throw a4.a(v72);
                    }
lbl436:
                    // 1 sources

                    v70 = var1_1;
lbl437:
                    // 2 sources

                    var4_4 = v70;
                    --this.s.L;
                    ++this.s.O;
                    this.a = (long)((this.s.x[this.s.f++] & a4.a(22692, 6839445763520368510L)) << a4.a(31945, 5763188300358855436L)) & a4.c(1777, 8841734766773218374L);
                    this.O = a4.a(10378, 654152618383638376L);
                }
                case 9: {
                    v73 = this.s.L;
                    if (var2_3 != null) ** GOTO lbl455
                    try {
                        if (v73 != 0) ** GOTO lbl454
                        ** GOTO lbl451
                        catch (ik_2 v74) {
                            throw a4.a(v74);
                        }
lbl451:
                        // 1 sources

                        return var4_4;
                    }
                    catch (ik_2 v75) {
                        throw a4.a(v75);
                    }
lbl454:
                    // 1 sources

                    v73 = var1_1;
lbl455:
                    // 2 sources

                    var4_4 = v73;
                    --this.s.L;
                    ++this.s.O;
                    this.a += (long)((this.s.x[this.s.f++] & a4.a(22692, 6839445763520368510L)) << a4.a(3084, 9186361394830433234L)) & a4.c(726, 8155737978570844263L);
                    this.O = a4.a(3992, 1304366854327457912L);
                }
                case 10: {
                    v76 = this.s.L;
                    if (var2_3 != null) ** GOTO lbl473
                    try {
                        if (v76 != 0) ** GOTO lbl472
                        ** GOTO lbl469
                        catch (ik_2 v77) {
                            throw a4.a(v77);
                        }
lbl469:
                        // 1 sources

                        return var4_4;
                    }
                    catch (ik_2 v78) {
                        throw a4.a(v78);
                    }
lbl472:
                    // 1 sources

                    v76 = var1_1;
lbl473:
                    // 2 sources

                    var4_4 = v76;
                    --this.s.L;
                    ++this.s.O;
                    this.a += (long)((this.s.x[this.s.f++] & a4.a(22692, 6839445763520368510L)) << a4.a(8444, 6817212859351660315L)) & a4.c(279, 9182932253811846060L);
                    this.O = a4.a(9026, 6129355384654853304L);
                }
                case 11: {
                    v79 = this.s.L--;
                    if (var2_3 != null) ** GOTO lbl495
                    try {
                        if (v79 != 0) ** GOTO lbl490
                        ** GOTO lbl487
                        catch (ik_2 v80) {
                            throw a4.a(v80);
                        }
lbl487:
                        // 1 sources

                        return var4_4;
                    }
                    catch (ik_2 v81) {
                        throw a4.a(v81);
                    }
lbl490:
                    // 1 sources

                    var4_4 = var1_1;
                    ++this.s.O;
                    this.a += (long)this.s.x[this.s.f++] & a4.c(26144, 654664165493460118L);
                    v79 = this.W;
lbl495:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl507
                    try {
                        if (v79 == 0) ** GOTO lbl505
                        ** GOTO lbl501
                        catch (ik_2 v82) {
                            throw a4.a(v82);
                        }
lbl501:
                        // 1 sources

                        this.a = ((this.a & a4.c(5360, 8867307719897693762L)) >> a4.a(31945, 5763188300358855436L) | (this.a & a4.c(726, 8155737978570844263L)) >> a4.a(8444, 6817212859351660315L) | (this.a & a4.c(279, 9182932253811846060L)) << a4.a(8444, 6817212859351660315L) | (this.a & a4.c(238, 2775247064706198100L)) << a4.a(31945, 5763188300358855436L)) & a4.c(20141, 7723234579825550361L);
                    }
                    catch (ik_2 v83) {
                        throw a4.a(v83);
                    }
lbl505:
                    // 2 sources

                    v79 = (int)this.i;
lbl507:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl530
                    if (v79 == (int)this.a) ** GOTO lbl519
                    ** GOTO lbl514
                    catch (ik_2 v84) {
                        throw a4.a(v84);
                    }
lbl514:
                    // 2 sources

                    this.s.t = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53921 out of bounds for length 3";
                    if (var2_3 == null) ** GOTO lbl546
                    ** GOTO lbl519
                    catch (ik_2 v85) {
                        throw a4.a(v85);
                    }
lbl519:
                    // 2 sources

                    try {
                        v86 = this;
                        if (var2_3 != null) ** GOTO lbl547
                        ** GOTO lbl525
                        catch (ik_2 v87) {
                            throw a4.a(v87);
                        }
lbl525:
                        // 1 sources

                        v79 = v86.W;
                    }
                    catch (ik_2 v88) {
                        throw a4.a(v88);
                    }
lbl530:
                    // 3 sources

                    if (v79 == 0) ** GOTO lbl546
                    v86 = this;
                    if (var2_3 != null) ** GOTO lbl547
                    ** GOTO lbl537
                    catch (ik_2 v89) {
                        throw a4.a(v89);
                    }
lbl537:
                    // 1 sources

                    try {
                        if (v86.F == null) ** GOTO lbl546
                        ** GOTO lbl542
                        catch (ik_2 v90) {
                            throw a4.a(v90);
                        }
lbl542:
                        // 1 sources

                        this.F.C = this.a;
                    }
                    catch (ik_2 v91) {
                        throw a4.a(v91);
                    }
lbl546:
                    // 4 sources

                    v86 = this;
lbl547:
                    // 3 sources

                    v86.O = a4.a(10469, 5696939088395304733L);
                }
                case 15: {
                    v92 = this;
                    if (var2_3 != null) ** GOTO lbl625
                    if (v92.y == 0) ** GOTO lbl619
                    ** GOTO lbl557
                    catch (ik_2 v93) {
                        throw a4.a(v93);
                    }
lbl557:
                    // 1 sources

                    try {
                        v92 = this;
                        if (var2_3 != null) ** GOTO lbl625
                        ** GOTO lbl563
                        catch (ik_2 v94) {
                            throw a4.a(v94);
                        }
lbl563:
                        // 1 sources

                        if (v92.W != 0) {
                        }
                        ** GOTO lbl619
                    }
                    catch (ik_2 v95) {
                        throw a4.a(v95);
                    }
                    try {
                        var4_4 = this.Y(4, var4_4, var1_1);
                    }
                    catch (ik_2 var6_8) {
                        return var6_8.Y;
                    }
                    v96 = this;
                    if (var2_3 != null) ** GOTO lbl599
                    if (v96.s.t == null) ** GOTO lbl598
                    ** GOTO lbl582
                    catch (ik_2 v97) {
                        throw a4.a(v97);
                    }
lbl582:
                    // 2 sources

                    v98 = (long)this.s.t.equals("\u0000ERR:ArrayIndexOutOfBoundsException:Index 53920 out of bounds for length 3");
                    if (var2_3 != null) ** GOTO lbl607
                    ** GOTO lbl587
                    catch (ik_2 v99) {
                        throw a4.a(v99);
                    }
lbl587:
                    // 1 sources

                    try {
                        if (v98 == false) ** GOTO lbl598
                        ** GOTO lbl592
                        catch (ik_2 v100) {
                            throw a4.a(v100);
                        }
lbl592:
                        // 1 sources

                        this.O = a4.a(32117, 1266935714368826016L);
                        this.V = a4.a(6686, 61080495891172813L);
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v101) {
                        throw a4.a(v101);
                    }
lbl598:
                    // 3 sources

                    v96 = this;
lbl599:
                    // 2 sources

                    try {
                        if (var2_3 == null) {
                            cfr_temp_1 = v96.a - (this.s.F & a4.c(20141, 7723234579825550361L));
                            v98 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                        }
                        ** GOTO lbl616
                    }
                    catch (ik_2 v102) {
                        throw a4.a(v102);
                    }
lbl607:
                    // 2 sources

                    try {
                        if (v98 == false) ** GOTO lbl615
                        this.s.t = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53925 out of bounds for length 3";
                        this.O = a4.a(32117, 1266935714368826016L);
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v103) {
                        throw a4.a(v103);
                    }
lbl615:
                    // 2 sources

                    v96 = this;
lbl616:
                    // 2 sources

                    try {
                        v96.s.t = null;
                        if (var2_3 == null) ** GOTO lbl648
lbl619:
                        // 3 sources

                        v92 = this;
                    }
                    catch (ik_2 v104) {
                        throw a4.a(v104);
                    }
lbl625:
                    // 4 sources

                    if (var2_3 != null) ** GOTO lbl649
                    if (v92.s.t == null) ** GOTO lbl648
                    ** GOTO lbl632
                    catch (ik_2 v105) {
                        throw a4.a(v105);
                    }
lbl632:
                    // 2 sources

                    v92 = this;
                    if (var2_3 != null) ** GOTO lbl649
                    ** GOTO lbl637
                    catch (ik_2 v106) {
                        throw a4.a(v106);
                    }
lbl637:
                    // 1 sources

                    try {
                        if (!v92.s.t.equals("\u0000ERR:ArrayIndexOutOfBoundsException:Index 53920 out of bounds for length 3")) ** GOTO lbl648
                        ** GOTO lbl642
                        catch (ik_2 v107) {
                            throw a4.a(v107);
                        }
lbl642:
                        // 1 sources

                        this.O = a4.a(32117, 1266935714368826016L);
                        this.V = a4.a(6686, 61080495891172813L);
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v108) {
                        throw a4.a(v108);
                    }
lbl648:
                    // 4 sources

                    v92 = this;
lbl649:
                    // 3 sources

                    v92.O = a4.a(17617, 7141208964640641834L);
                }
                case 12: {
                    return 1;
                }
                case 13: {
                    return a4.a(31892, 2187186631325723462L);
                }
                case 23: {
                    try {
                        var4_4 = this.Y(2, var4_4, var1_1);
                    }
                    catch (ik_2 var6_9) {
                        return var6_9.Y;
                    }
                    this.W = (int)this.a & a4.a(7932, 2661146856993540375L);
                    v109 = this.W & a4.a(22692, 6839445763520368510L);
                    v110 = a4.a(8444, 6817212859351660315L);
                    if (var2_3 != null) ** GOTO lbl679
                    try {
                        if (v109 == v110) ** GOTO lbl676
                        ** GOTO lbl670
                        catch (ik_2 v111) {
                            throw a4.a(v111);
                        }
lbl670:
                        // 1 sources

                        this.s.t = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53928 out of bounds for length 3";
                        this.O = a4.a(32117, 1266935714368826016L);
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v112) {
                        throw a4.a(v112);
                    }
lbl676:
                    // 2 sources

                    v109 = this.W;
                    v110 = a4.a(4658, 6584332778978067951L);
lbl679:
                    // 3 sources

                    v113 = v109 & v110;
                    if (var2_3 != null) ** GOTO lbl700
                    try {
                        if (v113 == 0) ** GOTO lbl692
                        ** GOTO lbl686
                        catch (ik_2 v114) {
                            throw a4.a(v114);
                        }
lbl686:
                        // 1 sources

                        this.s.t = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53923 out of bounds for length 3";
                        this.O = a4.a(32117, 1266935714368826016L);
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v115) {
                        throw a4.a(v115);
                    }
lbl692:
                    // 2 sources

                    try {
                        v116 = this;
                        if (var2_3 == null) {
                            v113 = v116.W & a4.a(23437, 8523780503787113551L);
                        }
                        ** GOTO lbl707
                    }
                    catch (ik_2 v117) {
                        throw a4.a(v117);
                    }
lbl700:
                    // 2 sources

                    try {
                        if (v113 != 0) {
                            this.b(2, this.a);
                        }
                    }
                    catch (ik_2 v118) {
                        throw a4.a(v118);
                    }
                    v116 = this;
lbl707:
                    // 2 sources

                    v116.O = a4.a(3084, 9186361394830433234L);
                }
                case 16: {
                    try {
                        var4_4 = this.Y(4, var4_4, var1_1);
                    }
                    catch (ik_2 var6_10) {
                        return var6_10.Y;
                    }
                    v119 = this;
                    if (var2_3 != null) ** GOTO lbl728
                    try {
                        if (v119.F == null) ** GOTO lbl726
                        ** GOTO lbl722
                        catch (ik_2 v120) {
                            throw a4.a(v120);
                        }
lbl722:
                        // 1 sources

                        this.F.E(this.a);
                    }
                    catch (ik_2 v121) {
                        throw a4.a(v121);
                    }
lbl726:
                    // 2 sources

                    v119 = this;
lbl728:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl739
                    try {
                        if ((v119.W & a4.a(15155, 6536086958589766860L)) == 0) ** GOTO lbl738
                        ** GOTO lbl734
                        catch (ik_2 v122) {
                            throw a4.a(v122);
                        }
lbl734:
                        // 1 sources

                        this.b(4, this.a);
                    }
                    catch (ik_2 v123) {
                        throw a4.a(v123);
                    }
lbl738:
                    // 2 sources

                    v119 = this;
lbl739:
                    // 2 sources

                    v119.O = a4.a(3255, 3392611941295315827L);
                }
                case 17: {
                    try {
                        var4_4 = this.Y(2, var4_4, var1_1);
                    }
                    catch (ik_2 var6_11) {
                        return var6_11.Y;
                    }
                    v124 = this;
                    if (var2_3 != null) ** GOTO lbl761
                    try {
                        if (v124.F == null) ** GOTO lbl759
                        ** GOTO lbl754
                        catch (ik_2 v125) {
                            throw a4.a(v125);
                        }
lbl754:
                        // 1 sources

                        this.F.c = (int)this.a & a4.a(22692, 6839445763520368510L);
                        this.F.i = (int)this.a >> a4.a(8444, 6817212859351660315L) & a4.a(22692, 6839445763520368510L);
                    }
                    catch (ik_2 v126) {
                        throw a4.a(v126);
                    }
lbl759:
                    // 2 sources

                    v124 = this;
lbl761:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl772
                    try {
                        if ((v124.W & a4.a(15155, 6536086958589766860L)) == 0) ** GOTO lbl771
                        ** GOTO lbl767
                        catch (ik_2 v127) {
                            throw a4.a(v127);
                        }
lbl767:
                        // 1 sources

                        this.b(2, this.a);
                    }
                    catch (ik_2 v128) {
                        throw a4.a(v128);
                    }
lbl771:
                    // 2 sources

                    v124 = this;
lbl772:
                    // 2 sources

                    v124.O = a4.a(15355, 5754904432264408106L);
                }
                case 18: {
                    try {
                        v129 = this;
                        if (var2_3 != null) ** GOTO lbl818
                        if ((v129.W & a4.a(31306, 3940252259571346879L)) != 0) {
                        }
                        ** GOTO lbl813
                    }
                    catch (ik_2 v130) {
                        throw a4.a(v130);
                    }
                    try {
                        var4_4 = this.Y(2, var4_4, var1_1);
                    }
                    catch (ik_2 var6_12) {
                        return var6_12.Y;
                    }
                    v129 = this;
                    if (var2_3 != null) ** GOTO lbl801
                    try {
                        if (v129.F == null) ** GOTO lbl799
                        ** GOTO lbl795
                        catch (ik_2 v131) {
                            throw a4.a(v131);
                        }
lbl795:
                        // 1 sources

                        this.F.L = new byte[(int)this.a & a4.a(20212, 6282669335024343304L)];
                    }
                    catch (ik_2 v132) {
                        throw a4.a(v132);
                    }
lbl799:
                    // 2 sources

                    v129 = this;
lbl801:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl829
                    if ((v129.W & a4.a(15155, 6536086958589766860L)) == 0) ** GOTO lbl828
                    ** GOTO lbl807
                    catch (ik_2 v133) {
                        throw a4.a(v133);
                    }
lbl807:
                    // 1 sources

                    try {
                        this.b(2, this.a);
                        if (var2_3 == null) ** GOTO lbl828
                        ** GOTO lbl813
                        catch (ik_2 v134) {
                            throw a4.a(v134);
                        }
lbl813:
                        // 2 sources

                        v129 = this;
                    }
                    catch (ik_2 v135) {
                        throw a4.a(v135);
                    }
lbl818:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl829
                    try {
                        if (v129.F == null) ** GOTO lbl828
                        ** GOTO lbl824
                        catch (ik_2 v136) {
                            throw a4.a(v136);
                        }
lbl824:
                        // 1 sources

                        this.F.L = null;
                    }
                    catch (ik_2 v137) {
                        throw a4.a(v137);
                    }
lbl828:
                    // 4 sources

                    v129 = this;
lbl829:
                    // 3 sources

                    v129.O = a4.a(8061, 2556608508573042837L);
                }
                case 19: {
                    try {
                        v138 = this;
                        if (var2_3 != null) ** GOTO lbl879
                        if ((v138.W & a4.a(26720, 6606262198121152398L)) != 0) {
                        }
                        ** GOTO lbl877
                    }
                    catch (ik_2 v139) {
                        throw a4.a(v139);
                    }
                    try {
                        var4_4 = this.d(var4_4, var1_1);
                        v140 = this;
                        if (var2_3 != null) ** GOTO lbl853
                        try {
                            if (v140.F == null) ** GOTO lbl889
                            ** GOTO lbl849
                            catch (ik_2 v141) {
                                throw a4.a(v141);
                            }
lbl849:
                            // 1 sources

                            v140 = this;
                        }
                        catch (ik_2 v142) {
                            throw a4.a(v142);
                        }
lbl853:
                        // 2 sources

                        var6_6 = v140.B.toByteArray();
                        this.B = null;
                        if (var2_3 != null) ** GOTO lbl873
                        if (var6_6.length != this.F.L.length) ** GOTO lbl868
                        ** GOTO lbl862
                        catch (ik_2 v143) {
                            throw a4.a(v143);
                        }
lbl862:
                        // 1 sources

                        try {
                            System.arraycopy(var6_6, 0, this.F.L, 0, var6_6.length);
                            if (var2_3 == null) ** GOTO lbl889
                            ** GOTO lbl868
                            catch (ik_2 v144) {
                                throw a4.a(v144);
                            }
lbl868:
                            // 2 sources

                            this.s.t = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53924 out of bounds for length 3";
                            this.O = a4.a(32117, 1266935714368826016L);
                        }
                        catch (ik_2 v145) {
                            throw a4.a(v145);
                        }
lbl873:
                        // 2 sources

                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 var6_13) {
                        return var6_13.Y;
                    }
lbl877:
                    // 1 sources

                    v138 = this;
lbl879:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl890
                    try {
                        if (v138.F == null) ** GOTO lbl889
                        ** GOTO lbl885
                        catch (ik_2 v146) {
                            throw a4.a(v146);
                        }
lbl885:
                        // 1 sources

                        this.F.L = null;
                    }
                    catch (ik_2 v147) {
                        throw a4.a(v147);
                    }
lbl889:
                    // 5 sources

                    v138 = this;
lbl890:
                    // 2 sources

                    v138.O = a4.a(5286, 3720931722568057686L);
                }
                case 20: {
                    try {
                        v148 = this;
                        if (var2_3 != null) ** GOTO lbl921
                        if ((v148.W & a4.a(5004, 8057696975919891582L)) != 0) {
                        }
                        ** GOTO lbl919
                    }
                    catch (ik_2 v149) {
                        throw a4.a(v149);
                    }
                    try {
                        var4_4 = this.b(var4_4, var1_1);
                        v150 = this;
                        if (var2_3 != null) ** GOTO lbl915
                        try {
                            if (v150.F == null) ** GOTO lbl914
                            ** GOTO lbl910
                            catch (ik_2 v151) {
                                throw a4.a(v151);
                            }
lbl910:
                            // 1 sources

                            this.F.Z = this.B.toByteArray();
                        }
                        catch (ik_2 v152) {
                            throw a4.a(v152);
                        }
lbl914:
                        // 2 sources

                        v150 = this;
lbl915:
                        // 2 sources

                        v150.B = null;
                    }
                    catch (ik_2 var6_14) {
                        return var6_14.Y;
                    }
lbl919:
                    // 1 sources

                    v148 = this;
lbl921:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl932
                    try {
                        if (v148.F == null) ** GOTO lbl931
                        ** GOTO lbl927
                        catch (ik_2 v153) {
                            throw a4.a(v153);
                        }
lbl927:
                        // 1 sources

                        this.F.Z = null;
                    }
                    catch (ik_2 v154) {
                        throw a4.a(v154);
                    }
lbl931:
                    // 3 sources

                    v148 = this;
lbl932:
                    // 2 sources

                    v148.O = a4.a(27816, 6333333479151254338L);
                }
                case 21: {
                    try {
                        v155 = this;
                        if (var2_3 != null) ** GOTO lbl963
                        if ((v155.W & a4.a(17939, 4100839962586092028L)) != 0) {
                        }
                        ** GOTO lbl961
                    }
                    catch (ik_2 v156) {
                        throw a4.a(v156);
                    }
                    try {
                        var4_4 = this.b(var4_4, var1_1);
                        v157 = this;
                        if (var2_3 != null) ** GOTO lbl957
                        try {
                            if (v157.F == null) ** GOTO lbl956
                            ** GOTO lbl952
                            catch (ik_2 v158) {
                                throw a4.a(v158);
                            }
lbl952:
                            // 1 sources

                            this.F.q = this.B.toByteArray();
                        }
                        catch (ik_2 v159) {
                            throw a4.a(v159);
                        }
lbl956:
                        // 2 sources

                        v157 = this;
lbl957:
                        // 2 sources

                        v157.B = null;
                    }
                    catch (ik_2 var6_15) {
                        return var6_15.Y;
                    }
lbl961:
                    // 1 sources

                    v155 = this;
lbl963:
                    // 3 sources

                    if (var2_3 != null) ** GOTO lbl974
                    try {
                        if (v155.F == null) ** GOTO lbl973
                        ** GOTO lbl969
                        catch (ik_2 v160) {
                            throw a4.a(v160);
                        }
lbl969:
                        // 1 sources

                        this.F.q = null;
                    }
                    catch (ik_2 v161) {
                        throw a4.a(v161);
                    }
lbl973:
                    // 3 sources

                    v155 = this;
lbl974:
                    // 2 sources

                    v155.O = a4.a(16105, 8165030562487003407L);
                }
                case 22: {
                    try {
                        v162 = this;
                        if (var2_3 != null) ** GOTO lbl1020
                        if ((v162.W & a4.a(15155, 6536086958589766860L)) != 0) {
                        }
                        ** GOTO lbl1018
                    }
                    catch (ik_2 v163) {
                        throw a4.a(v163);
                    }
                    try {
                        var4_4 = this.Y(2, var4_4, var1_1);
                    }
                    catch (ik_2 var6_16) {
                        return var6_16.Y;
                    }
                    try {
                        try {
                            v162 = this;
                            if (var2_3 != null) ** GOTO lbl1003
                            if (v162.F != null) {
                            }
                            ** GOTO lbl1002
                        }
                        catch (ik_2 v164) {
                            throw a4.a(v164);
                        }
                        this.F.F = (int)(this.a & a4.c(238, 2775247064706198100L));
                    }
                    catch (ik_2 v165) {
                        throw a4.a(v165);
                    }
lbl1002:
                    // 2 sources

                    v162 = this;
lbl1003:
                    // 2 sources

                    try {
                        try {
                            if (var2_3 != null) ** GOTO lbl1020
                            if (v162.a != (this.s.e.u() & a4.c(238, 2775247064706198100L))) {
                            }
                            ** GOTO lbl1018
                        }
                        catch (ik_2 v166) {
                            throw a4.a(v166);
                        }
                        this.O = a4.a(32117, 1266935714368826016L);
                        this.s.t = "\u0000ERR:ArrayIndexOutOfBoundsException:Index 53922 out of bounds for length 3";
                        this.V = a4.a(6686, 61080495891172813L);
                        if (var2_3 == null) ** GOTO lbl-1000
                    }
                    catch (ik_2 v167) {
                        throw a4.a(v167);
                    }
lbl1018:
                    // 3 sources

                    this.s.e = new ue_0();
                    v162 = this;
lbl1020:
                    // 3 sources

                    v162.O = a4.a(16593, 6164126498226640671L);
                    if (var2_3 == null) continue block304;
                }
            }
            break;
        }
        return a4.a(20936, 7115522834845632053L);
    }

    /*
     * Unable to fully structure code
     */
    int I(byte[] var1_1, int var2_2) {
        block18: {
            block17: {
                block15: {
                    block16: {
                        block14: {
                            block13: {
                                var3_3 = nm_2.g();
                                v0 = this;
                                if (var3_3 != null) break block13;
                                if (v0.s == null) break block14;
                                v0 = this;
                            }
                            v1 = v0.O;
                            if (var3_3 != null) break block15;
                            if (v1 == a4.a(24817, 6086439531815286528L)) break block16;
                            v1 = this.y;
                            if (var3_3 != null) break block15;
                            if (v1 == 0) break block16;
                        }
                        return a4.a(2035, 7247708505408589868L);
                    }
                    v1 = 0;
                }
                var4_4 = v1;
                var5_5 = var2_2;
                v2 = this.O;
                v3 = a4.a(23306, 8467786741266091262L);
                if (var3_3 != null) break block17;
                if (v2 == v3) {
                    var6_6 = this.s.e.u();
                    this.s.e.C();
                    this.s.e.A(var1_1, 0, var2_2);
                    cfr_temp_0 = this.s.e.u() - var6_6;
                    v2 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                    if (var3_3 == null) {
                        if (v2 != 0) {
                            return a4.a(16117, 6564650233520974105L);
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    this.s.e.C();
                    v2 = var5_5;
                }
                if (var3_3 != null) break block18;
                v3 = 1 << this.t;
            }
            if (v2 >= v3) {
                var5_5 = (1 << this.t) - 1;
                var4_4 = var2_2 - var5_5;
            }
            this.G.b(var1_1, var4_4, var5_5);
            this.O = a4.a(14698, 6846870617226473130L);
            v2 = 0;
        }
        return v2;
    }

    int D() {
        a4 a42;
        block20: {
            int n10;
            int n11;
            block14: {
                int[] nArray = nm_2.g();
                a4 a43 = this;
                if (nArray == null) {
                    if (a43.s == null) {
                        return a4.a(20936, 7115522834845632053L);
                    }
                    a43 = this;
                }
                int n12 = a43.O;
                int n13 = a4.a(15657, 8283836157454772951L);
                if (nArray == null) {
                    if (n12 != n13) {
                        this.O = a4.a(32117, 1266935714368826016L);
                        this.V = 0;
                    }
                    int n14 = this.s.L;
                    n13 = n14;
                    n12 = n14;
                }
                int n15 = n13;
                if (nArray == null) {
                    if (n12 == 0) {
                        return a4.a(6953, 5045079500675960048L);
                    }
                    n12 = this.s.f;
                }
                int n16 = n12;
                int n17 = this.V;
                while (n15 != 0) {
                    block17: {
                        int n18;
                        block18: {
                            block19: {
                                block15: {
                                    block16: {
                                        n11 = n17;
                                        n10 = 4;
                                        if (nArray != null || nArray != null) break block14;
                                        if (n11 >= n10) break;
                                        n18 = this.s.x[n16];
                                        if (nArray != null) break block15;
                                        if (n18 != H[n17]) break block16;
                                        ++n17;
                                        if (nArray == null) break block17;
                                    }
                                    n18 = this.s.x[n16];
                                }
                                if (nArray != null) break block18;
                                if (n18 == 0) break block19;
                                n17 = 0;
                                if (nArray == null) break block17;
                            }
                            n18 = 4 - n17;
                        }
                        n17 = n18;
                    }
                    ++n16;
                    --n15;
                    if (nArray == null) continue;
                }
                this.s.O += (long)(n16 - this.s.f);
                this.s.f = n16;
                this.s.L = n15;
                a42 = this;
                if (nArray != null) break block20;
                a42.V = n17;
                n11 = n17;
                n10 = 4;
            }
            if (n11 != n10) {
                return a4.a(31892, 2187186631325723462L);
            }
            a42 = this;
        }
        long l2 = a42.s.O;
        long l3 = this.s.F;
        this.v();
        this.s.O = l2;
        this.s.F = l3;
        this.O = a4.a(16593, 6164126498226640671L);
        return 0;
    }

    int i() {
        DC dC;
        block4: {
            block5: {
                block3: {
                    a4 a42;
                    int[] nArray;
                    block2: {
                        nArray = nm_2.g();
                        a42 = this;
                        if (nArray != null) break block2;
                        if (a42.s == null) break block3;
                        a42 = this;
                    }
                    dC = a42.G;
                    if (nArray != null) break block4;
                    if (dC != null) break block5;
                }
                return a4.a(20936, 7115522834845632053L);
            }
            dC = this.G;
        }
        return dC.F();
    }

    /*
     * Unable to fully structure code
     */
    private int Y(int var1_1, int var2_2, int var3_3) throws ik_2 {
        block32: {
            block31: {
                block29: {
                    block26: {
                        block25: {
                            var4_4 = nm_2.g();
                            try {
                                try {
                                    v0 = this.U;
                                    if (var4_4 == null) {
                                        if (v0 != -1) break block25;
                                    }
                                    ** GOTO lbl19
                                }
                                catch (ik_2 v1) {
                                    throw a4.a(v1);
                                }
                                this.U = var1_1;
                                this.a = 0L;
                            }
                            catch (ik_2 v2) {
                                throw a4.a(v2);
                            }
                        }
                        do {
                            block27: {
                                block28: {
                                    v0 = this.U;
lbl19:
                                    // 2 sources

                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (v0 <= 0) break;
                                                    v3 = this.s.L;
                                                    if (var4_4 != null) break block26;
                                                }
                                                catch (ik_2 v4) {
                                                    throw a4.a(v4);
                                                }
                                                if (var4_4 != null) break block27;
                                            }
                                            catch (ik_2 v5) {
                                                throw a4.a(v5);
                                            }
                                            if (v3 != 0) break block28;
                                        }
                                        catch (ik_2 v6) {
                                            throw a4.a(v6);
                                        }
                                        throw new ik_2(var2_2);
                                    }
                                    catch (ik_2 v7) {
                                        throw a4.a(v7);
                                    }
                                }
                                v8 = var3_3;
                            }
                            var2_2 = v8;
                            --this.s.L;
                            ++this.s.O;
                            this.a |= (long)((this.s.x[this.s.f++] & a4.a(6288, 5667599485599567732L)) << (var1_1 - this.U) * a4.a(8444, 6817212859351660315L));
                            --this.U;
                        } while (var4_4 == null);
                        v3 = var1_1;
                    }
                    try {
                        try {
                            block30: {
                                try {
                                    try {
                                        v9 = 2;
                                        if (var4_4 != null) break block29;
                                        if (v3 != v9) break block30;
                                    }
                                    catch (ik_2 v10) {
                                        throw a4.a(v10);
                                    }
                                    this.a &= a4.c(24887, 2063881861406182274L);
                                    if (var4_4 == null) break block31;
                                }
                                catch (ik_2 v11) {
                                    throw a4.a(v11);
                                }
                            }
                            v3 = var1_1;
                            if (var4_4 != null) break block32;
                        }
                        catch (ik_2 v12) {
                            throw a4.a(v12);
                        }
                        v9 = 4;
                    }
                    catch (ik_2 v13) {
                        throw a4.a(v13);
                    }
                }
                try {
                    if (v3 == v9) {
                        this.a &= a4.c(13615, 1627355144446320529L);
                    }
                }
                catch (ik_2 v14) {
                    throw a4.a(v14);
                }
            }
            this.U = -1;
            v3 = var2_2;
        }
        return v3;
    }

    private int b(int n10, int n11) throws ik_2 {
        byte by;
        int[] nArray;
        block11: {
            block10: {
                nArray = nm_2.g();
                try {
                    a4 a42;
                    try {
                        a42 = this;
                        if (nArray != null) break block10;
                        if (a42.B != null) break block11;
                    }
                    catch (ik_2 ik_22) {
                        throw a4.a(ik_22);
                    }
                    a42 = this;
                }
                catch (ik_2 ik_23) {
                    throw a4.a(ik_23);
                }
            }
            a42.B = new ByteArrayOutputStream();
        }
        byte by2 = 0;
        do {
            block12: {
                if (this.s.L == 0) {
                    throw new ik_2(n10);
                }
                n10 = n11;
                --this.s.L;
                ++this.s.O;
                by2 = this.s.x[this.s.f];
                try {
                    try {
                        by = by2;
                        if (nArray != null) continue;
                        if (by == 0) break block12;
                    }
                    catch (ik_2 ik_24) {
                        throw a4.a(ik_24);
                    }
                    this.B.write(this.s.x, this.s.f, 1);
                }
                catch (ik_2 ik_25) {
                    throw a4.a(ik_25);
                }
            }
            this.s.e.A(this.s.x, this.s.f, 1);
            ++this.s.f;
            by = by2;
        } while (by != 0);
        return n10;
    }

    private int d(int n10, int n11) throws ik_2 {
        int n12;
        block13: {
            int[] nArray;
            block12: {
                block11: {
                    nArray = nm_2.g();
                    try {
                        a4 a42;
                        try {
                            a42 = this;
                            if (nArray != null) break block11;
                            if (a42.B != null) break block12;
                        }
                        catch (ik_2 ik_22) {
                            throw a4.a(ik_22);
                        }
                        a42 = this;
                    }
                    catch (ik_2 ik_23) {
                        throw a4.a(ik_23);
                    }
                }
                a42.B = new ByteArrayOutputStream();
            }
            boolean bl = false;
            while (this.a > 0L) {
                byte by;
                block14: {
                    block15: {
                        try {
                            try {
                                try {
                                    n12 = this.s.L--;
                                    if (nArray != null) break block13;
                                    if (nArray != null) break block14;
                                }
                                catch (ik_2 ik_24) {
                                    throw a4.a(ik_24);
                                }
                                if (n12 != 0) break block15;
                            }
                            catch (ik_2 ik_25) {
                                throw a4.a(ik_25);
                            }
                            throw new ik_2(n10);
                        }
                        catch (ik_2 ik_26) {
                            throw a4.a(ik_26);
                        }
                    }
                    n10 = n11;
                    ++this.s.O;
                    by = this.s.x[this.s.f];
                }
                void var4_5 = by;
                this.B.write(this.s.x, this.s.f, 1);
                this.s.e.A(this.s.x, this.s.f, 1);
                ++this.s.f;
                --this.a;
                if (nArray == null) continue;
            }
            n12 = n10;
        }
        return n12;
    }

    private void b(int n10, long l2) {
        block2: {
            int[] nArray = nm_2.g();
            for (int i2 = 0; i2 < n10; ++i2) {
                this.R[i2] = (byte)(l2 & a4.c(26144, 654664165493460118L));
                l2 >>= a4.a(8444, 6817212859351660315L);
                if (nArray == null) {
                    if (nArray == null) continue;
                }
                break block2;
            }
            this.s.e.A(this.R, 0, n10);
        }
    }

    DF y() {
        return this.F;
    }

    boolean z() {
        int[] nArray = nm_2.g();
        boolean bl = this.O;
        if (nArray == null) {
            switch (bl) {
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 14: 
                case 16: 
                case 17: 
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: {
                    return true;
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block37: {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                var21 = new String[12];
                                var19_1 = 0;
                                var18_2 = "\u00d4\u00cd0\u0017\u00df\u00af\u001a\u008a}\u00f3S\u009fKg\u0093A\u00b3 \u00d4\u001b\u0014\u00d5\u001c\u0010-\u00db\u00e8\u009abm\u00eeQ<\u000b\u0013\u009b\u00cf\u00b2\u00f1\u00f4!\u0018\u0093\u00fbO\u00d0$s\u00d0\u00f7R2,O\u0010\u00cb\u00cb\u00a0\u00bc\u00bd\u00b54\u00a5\u00c8v\u00fd\u0013\u00bf\u00e8~\u00d2C}9\u00d0\u00f2\u00fb \u00b9\u00f4<\u0097x\u00cbCO\u0016\u001c\u00ae){\u00fc\"~;\u00f1\u00c5\u00ca]k\u00bd\u009a\u00d7\u0004\u009eh\u0004\u00b3\u0002\u0016\u00e5a{#F\u0085\u00cd\u0095\u00a1#}\u008d\u00dd!6f\u00cf\u00ef\u00d2\u00ee5\u001e\u000f\u007f\b\u00a4\u00ce\u00d9\u00e8\u00ce\u00b6j=\u00ba)\tL5\u0013\u00a5\u00af\u000bU\u00113\u001f\"\u00ff\u0084j\u0014<\u00a5\u0005\u00dd`\u00be\u0089\u0016z\u0017\u00e5Le\u00c4M\u00e7\u0097^\u0002.\u00f9\u00d07\u0003\u0082]\u00b8|\u00a9\r\u001a\u00e4\u00c4\u00a17\u00f9\u008fkh.\u00cb\u00c5/\u00b7F\u0099\u00f1\u00ca.\u00d7\u00da\u008c:\u00a6k#\u00c8";
                                var20_3 = "\u00d4\u00cd0\u0017\u00df\u00af\u001a\u008a}\u00f3S\u009fKg\u0093A\u00b3 \u00d4\u001b\u0014\u00d5\u001c\u0010-\u00db\u00e8\u009abm\u00eeQ<\u000b\u0013\u009b\u00cf\u00b2\u00f1\u00f4!\u0018\u0093\u00fbO\u00d0$s\u00d0\u00f7R2,O\u0010\u00cb\u00cb\u00a0\u00bc\u00bd\u00b54\u00a5\u00c8v\u00fd\u0013\u00bf\u00e8~\u00d2C}9\u00d0\u00f2\u00fb \u00b9\u00f4<\u0097x\u00cbCO\u0016\u001c\u00ae){\u00fc\"~;\u00f1\u00c5\u00ca]k\u00bd\u009a\u00d7\u0004\u009eh\u0004\u00b3\u0002\u0016\u00e5a{#F\u0085\u00cd\u0095\u00a1#}\u008d\u00dd!6f\u00cf\u00ef\u00d2\u00ee5\u001e\u000f\u007f\b\u00a4\u00ce\u00d9\u00e8\u00ce\u00b6j=\u00ba)\tL5\u0013\u00a5\u00af\u000bU\u00113\u001f\"\u00ff\u0084j\u0014<\u00a5\u0005\u00dd`\u00be\u0089\u0016z\u0017\u00e5Le\u00c4M\u00e7\u0097^\u0002.\u00f9\u00d07\u0003\u0082]\u00b8|\u00a9\r\u001a\u00e4\u00c4\u00a17\u00f9\u008fkh.\u00cb\u00c5/\u00b7F\u0099\u00f1\u00ca.\u00d7\u00da\u008c:\u00a6k#\u00c8".length();
                                var17_4 = 20;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 4;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block33;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "\u00f9\u00a6\u00c7\u00be\u00f0{\u008f3we+?\u00af\u0081_\u00cc\u00d7L\u00b1S\u0085\u00ceB0zf\u0016\u008cR\u00fe!\u00c3\u00ac\\/p\u0082;p\u001b\u00de\u00ae\u0007t\u0018\u00a3\u0011\u000fe";
                                    var20_3 = "\u00f9\u00a6\u00c7\u00be\u00f0{\u008f3we+?\u00af\u0081_\u00cc\u00d7L\u00b1S\u0085\u00ceB0zf\u0016\u008cR\u00fe!\u00c3\u00ac\\/p\u0082;p\u001b\u00de\u00ae\u0007t\u0018\u00a3\u0011\u000fe".length();
                                    var17_4 = 26;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 72;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block33;
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block34;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 10;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 36;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 72;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 98;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 41;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 117;
                                            break;
                                        }
                                        default: {
                                            v15 = 25;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
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
                            } while (v10 > var22_6);
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
                        a4.b = var21;
                        a4.c = new String[12];
                        var8_7 = 2241097446209005461L;
                        var14_8 = new long[59];
                        var11_9 = 0;
                        var12_10 = "F9\u0010\u00c2G=\u0098\u0002\u00cb\u009d<\u00827\u00e8\u00d0lB}\u008f\u0085\u00ae\u00bf+m\u00ce)\u00a8c%|\u008e*\u00b9uz}\u00a1#k\u00eb\u0090%\rNzk\u00afrJ\u0003\u00ff_\u0011td\u00d7y\u00f5\u009c\u0091$\u00ec\u0010\u0093e\u00d5\u00af\u0003\u0092\u00f2MO\u00d7\u00a4Gfo\u009c\u00c9Y\u00b3C\u00acT\u00c7\u000f\u00c1bp\u00d2\u00c8\u0000\u0089\u008a\u00de^\u0081\u00d5\u0013\u00a5\u0080(S&\u00c7k~\u0010Po4\u00b3Y\r\u00e5\u000e*\u0084X\u0087\u00e8\u00a9n\u00ae\u00c7H\u00a9\u00fbfW\u00aa\n\u00b5lN\u008c\u00812\u00dc\u00a4\u0013\u00b3\u00d0\u0086\u0091\u0007\u00b4]\u00d0\u000b\u00e8\u001e\u00af2?&\u0006\u00ff\u00c4\f\u00ea7\u00ca;\u00cb\u00f7X\u00f4^.\u00b2\u00a9\u00bd=\u00d9\\I\u00b8\u00f9\u00d2\u00a4\u00a9\u00ff\u00e7\u00d9\u00f7\u00d7j\u00c9\u00ebh\u00e5Ka\u00d3\u00e8XH\u009c\u001b\u0018\u00eb\u00fe\u00e1\u00e6\u00f9&i/\u0015\u009f\u0003 \u001e\u00b1q\u00d6\bd\u00f4\u0015h\u009beh\u00e8\u00e1\u009d\u0088\u00b4\u009c\u00c2\u00cf\u00b8\u0080Xvm\u0011}\u00ec\u0012\u00e9\u008b{no\u0013\u0017r/\u00d3\u00e3\u000f\u0080M\u00e7A\u0089\u00c4={X\b=\u00178\u00cc\u00ee\u0000\u001b\u00b1\u000b\u00a14\u00cf\u00bcv;\u0099L\u009b\u0096\u00df<g\r8\u0098\u0005~\u00142\ns.\u00ffP\u00b5\u00d3\u00c8\u001e\u00ea]\u00f2`\u00b9\u00d5=\u0092\u001a\u00e0\u00b1\u0017\u00cf\u00d6\u00c5\"K\u00adP\u0019w\u00b6\u0081h|WM\u00a8\u00e9fO\u00d9\u0088G\u0011\u00ee\u00e7*\u0086\u0006\u00e9\u0001\u00fe\u00fe\u0085\u00d4\u0011\u00a0\u0082zcH\u00a3\u00e2\u00bf|(\u0014P\u000b\u00a4\u000e\u00f4\u00e7\u00ae\u00fa\u0083\u0019\u0098\u0019\u00cdO\u00f3\u00a8 X\u008aFv\u00c8\u0014\u009e\u00f2\u00b4i1\u0086\u008e'W\u00b2i\u001c_\u00b0C\u00a8\u00e1)\u009adh\u0011\u00f5|\u00f7\u001f\u00cd\u00e5\u008b\u009c\u00c1\f\u0081\u0092\r\u00b1\u00f8\u00eb\u00f3)\u00da \u0011\u00e0\u00b8\"\u00df\u009fY\u00c3\n\u00d2\u00136\u0085I8\u00ca\u001a\u00d5x\u00c2\u00fe+V\u008e\u008e\u00b1\u0086\u00c1\r\u00b0\u008d";
                        var13_11 = "F9\u0010\u00c2G=\u0098\u0002\u00cb\u009d<\u00827\u00e8\u00d0lB}\u008f\u0085\u00ae\u00bf+m\u00ce)\u00a8c%|\u008e*\u00b9uz}\u00a1#k\u00eb\u0090%\rNzk\u00afrJ\u0003\u00ff_\u0011td\u00d7y\u00f5\u009c\u0091$\u00ec\u0010\u0093e\u00d5\u00af\u0003\u0092\u00f2MO\u00d7\u00a4Gfo\u009c\u00c9Y\u00b3C\u00acT\u00c7\u000f\u00c1bp\u00d2\u00c8\u0000\u0089\u008a\u00de^\u0081\u00d5\u0013\u00a5\u0080(S&\u00c7k~\u0010Po4\u00b3Y\r\u00e5\u000e*\u0084X\u0087\u00e8\u00a9n\u00ae\u00c7H\u00a9\u00fbfW\u00aa\n\u00b5lN\u008c\u00812\u00dc\u00a4\u0013\u00b3\u00d0\u0086\u0091\u0007\u00b4]\u00d0\u000b\u00e8\u001e\u00af2?&\u0006\u00ff\u00c4\f\u00ea7\u00ca;\u00cb\u00f7X\u00f4^.\u00b2\u00a9\u00bd=\u00d9\\I\u00b8\u00f9\u00d2\u00a4\u00a9\u00ff\u00e7\u00d9\u00f7\u00d7j\u00c9\u00ebh\u00e5Ka\u00d3\u00e8XH\u009c\u001b\u0018\u00eb\u00fe\u00e1\u00e6\u00f9&i/\u0015\u009f\u0003 \u001e\u00b1q\u00d6\bd\u00f4\u0015h\u009beh\u00e8\u00e1\u009d\u0088\u00b4\u009c\u00c2\u00cf\u00b8\u0080Xvm\u0011}\u00ec\u0012\u00e9\u008b{no\u0013\u0017r/\u00d3\u00e3\u000f\u0080M\u00e7A\u0089\u00c4={X\b=\u00178\u00cc\u00ee\u0000\u001b\u00b1\u000b\u00a14\u00cf\u00bcv;\u0099L\u009b\u0096\u00df<g\r8\u0098\u0005~\u00142\ns.\u00ffP\u00b5\u00d3\u00c8\u001e\u00ea]\u00f2`\u00b9\u00d5=\u0092\u001a\u00e0\u00b1\u0017\u00cf\u00d6\u00c5\"K\u00adP\u0019w\u00b6\u0081h|WM\u00a8\u00e9fO\u00d9\u0088G\u0011\u00ee\u00e7*\u0086\u0006\u00e9\u0001\u00fe\u00fe\u0085\u00d4\u0011\u00a0\u0082zcH\u00a3\u00e2\u00bf|(\u0014P\u000b\u00a4\u000e\u00f4\u00e7\u00ae\u00fa\u0083\u0019\u0098\u0019\u00cdO\u00f3\u00a8 X\u008aFv\u00c8\u0014\u009e\u00f2\u00b4i1\u0086\u008e'W\u00b2i\u001c_\u00b0C\u00a8\u00e1)\u009adh\u0011\u00f5|\u00f7\u001f\u00cd\u00e5\u008b\u009c\u00c1\f\u0081\u0092\r\u00b1\u00f8\u00eb\u00f3)\u00da \u0011\u00e0\u00b8\"\u00df\u009fY\u00c3\n\u00d2\u00136\u0085I8\u00ca\u001a\u00d5x\u00c2\u00fe+V\u008e\u008e\u00b1\u0086\u00c1\r\u00b0\u008d".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block35;
                            break;
                        }
lbl112:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u0007b\u00a5\u0096\u00a0\u00ba\u00e3m^\u00bd\u00cb\u0099&S\\\u0081";
                            var13_11 = "\u0007b\u00a5\u0096\u00a0\u00ba\u00e3m^\u00bd\u00cb\u0099&S\\\u0081".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block35;
                                break;
                            }
                            break;
                        }
lbl125:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block36;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
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
                a4.d = var14_8;
                a4.e = new Integer[59];
                var0_14 = 6075897820323748396L;
                var6_15 = new long[16];
                var3_16 = 0;
                var4_17 = ")\u00ab\u00ea+Z\u00be\u00a9\u001fC7\u001a\u008d\u00b9^hAB\u00c4j\u0001\u0004(\u00faB(\u00f5\u0014\u009e\u009ez\u00ad\u00e35\u00a9\u0006N\u0019\u00c8\r\u0097u\u00b5\u00fc~#\u00c5\u0012\u00c8r\u00d2D`\u00185O\u0087+!\u00b8\u00db\u000f\u0019\u00ce\u0080?\u007f\u009c\u000e\u00f7\u008b\u0081\u00caH\u00f5\u008d~p\u008b\u00aeQ]D9w@\u009d\u00d6E.\u00e5\u00ca\f{J\u00b6j\u0090\u00e8\u0085u\u00ce\u00fd_e%~\u00ec\u009bB\u00e82K";
                var5_18 = ")\u00ab\u00ea+Z\u00be\u00a9\u001fC7\u001a\u008d\u00b9^hAB\u00c4j\u0001\u0004(\u00faB(\u00f5\u0014\u009e\u009ez\u00ad\u00e35\u00a9\u0006N\u0019\u00c8\r\u0097u\u00b5\u00fc~#\u00c5\u0012\u00c8r\u00d2D`\u00185O\u0087+!\u00b8\u00db\u000f\u0019\u00ce\u0080?\u007f\u009c\u000e\u00f7\u008b\u0081\u00caH\u00f5\u008d~p\u008b\u00aeQ]D9w@\u009d\u00d6E.\u00e5\u00ca\f{J\u00b6j\u0090\u00e8\u0085u\u00ce\u00fd_e%~\u00ec\u009bB\u00e82K".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v22 = var6_15;
                    v23 = var3_16++;
                    v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v25 = -1;
                    break block37;
                    break;
                }
lbl153:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "\u00d0\u00a1\u0012|^c$n\u0018\u0007\u00f8Ef\u0080F\u00e1";
                    var5_18 = "\u00d0\u00a1\u0012|^c$n\u0018\u0007\u00f8Ef\u0080F\u00e1".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v22 = var6_15;
                        v23 = var3_16++;
                        v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v25 = 0;
                        break block37;
                        break;
                    }
                    break;
                }
lbl166:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    break block38;
                    break;
                }
            }
            v26 = v24 ^ var0_14;
            switch (v25) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl177:
                // 1 sources

                ** continue;
            }
        }
        a4.f = var6_15;
        a4.g = new Long[16];
        a4.H = new byte[]{0, 0, -1, -1};
    }

    private static ik_2 a(ik_2 ik_22) {
        return ik_22;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFB426) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = b[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 97;
                    break;
                }
                case 1: {
                    n14 = 49;
                    break;
                }
                case 2: {
                    n14 = 124;
                    break;
                }
                case 3: {
                    n14 = 134;
                    break;
                }
                case 4: {
                    n14 = 29;
                    break;
                }
                case 5: {
                    n14 = 119;
                    break;
                }
                case 6: {
                    n14 = 74;
                    break;
                }
                case 7: {
                    n14 = 41;
                    break;
                }
                case 8: {
                    n14 = 48;
                    break;
                }
                case 9: {
                    n14 = 128;
                    break;
                }
                case 10: {
                    n14 = 115;
                    break;
                }
                case 11: {
                    n14 = 130;
                    break;
                }
                case 12: {
                    n14 = 199;
                    break;
                }
                case 13: {
                    n14 = 239;
                    break;
                }
                case 14: {
                    n14 = 186;
                    break;
                }
                case 15: {
                    n14 = 191;
                    break;
                }
                case 16: {
                    n14 = 100;
                    break;
                }
                case 17: {
                    n14 = 94;
                    break;
                }
                case 18: {
                    n14 = 83;
                    break;
                }
                case 19: {
                    n14 = 151;
                    break;
                }
                case 20: {
                    n14 = 107;
                    break;
                }
                case 21: {
                    n14 = 234;
                    break;
                }
                case 22: {
                    n14 = 86;
                    break;
                }
                case 23: {
                    n14 = 114;
                    break;
                }
                case 24: {
                    n14 = 84;
                    break;
                }
                case 25: {
                    n14 = 16;
                    break;
                }
                case 26: {
                    n14 = 109;
                    break;
                }
                case 27: {
                    n14 = 3;
                    break;
                }
                case 28: {
                    n14 = 10;
                    break;
                }
                case 29: {
                    n14 = 14;
                    break;
                }
                case 30: {
                    n14 = 24;
                    break;
                }
                case 31: {
                    n14 = 254;
                    break;
                }
                case 32: {
                    n14 = 38;
                    break;
                }
                case 33: {
                    n14 = 58;
                    break;
                }
                case 34: {
                    n14 = 64;
                    break;
                }
                case 35: {
                    n14 = 154;
                    break;
                }
                case 36: {
                    n14 = 157;
                    break;
                }
                case 37: {
                    n14 = 4;
                    break;
                }
                case 38: {
                    n14 = 232;
                    break;
                }
                case 39: {
                    n14 = 222;
                    break;
                }
                case 40: {
                    n14 = 8;
                    break;
                }
                case 41: {
                    n14 = 47;
                    break;
                }
                case 42: {
                    n14 = 69;
                    break;
                }
                case 43: {
                    n14 = 212;
                    break;
                }
                case 44: {
                    n14 = 206;
                    break;
                }
                case 45: {
                    n14 = 164;
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
                    n14 = 34;
                    break;
                }
                case 49: {
                    n14 = 56;
                    break;
                }
                case 50: {
                    n14 = 231;
                    break;
                }
                case 51: {
                    n14 = 175;
                    break;
                }
                case 52: {
                    n14 = 220;
                    break;
                }
                case 53: {
                    n14 = 246;
                    break;
                }
                case 54: {
                    n14 = 60;
                    break;
                }
                case 55: {
                    n14 = 233;
                    break;
                }
                case 56: {
                    n14 = 53;
                    break;
                }
                case 57: {
                    n14 = 176;
                    break;
                }
                case 58: {
                    n14 = 113;
                    break;
                }
                case 59: {
                    n14 = 75;
                    break;
                }
                case 60: {
                    n14 = 20;
                    break;
                }
                case 61: {
                    n14 = 208;
                    break;
                }
                case 62: {
                    n14 = 183;
                    break;
                }
                case 63: {
                    n14 = 68;
                    break;
                }
                case 64: {
                    n14 = 76;
                    break;
                }
                case 65: {
                    n14 = 120;
                    break;
                }
                case 66: {
                    n14 = 198;
                    break;
                }
                case 67: {
                    n14 = 129;
                    break;
                }
                case 68: {
                    n14 = 125;
                    break;
                }
                case 69: {
                    n14 = 90;
                    break;
                }
                case 70: {
                    n14 = 12;
                    break;
                }
                case 71: {
                    n14 = 26;
                    break;
                }
                case 72: {
                    n14 = 190;
                    break;
                }
                case 73: {
                    n14 = 85;
                    break;
                }
                case 74: {
                    n14 = 133;
                    break;
                }
                case 75: {
                    n14 = 170;
                    break;
                }
                case 76: {
                    n14 = 104;
                    break;
                }
                case 77: {
                    n14 = 11;
                    break;
                }
                case 78: {
                    n14 = 235;
                    break;
                }
                case 79: {
                    n14 = 219;
                    break;
                }
                case 80: {
                    n14 = 126;
                    break;
                }
                case 81: {
                    n14 = 247;
                    break;
                }
                case 82: {
                    n14 = 150;
                    break;
                }
                case 83: {
                    n14 = 105;
                    break;
                }
                case 84: {
                    n14 = 227;
                    break;
                }
                case 85: {
                    n14 = 116;
                    break;
                }
                case 86: {
                    n14 = 193;
                    break;
                }
                case 87: {
                    n14 = 178;
                    break;
                }
                case 88: {
                    n14 = 103;
                    break;
                }
                case 89: {
                    n14 = 214;
                    break;
                }
                case 90: {
                    n14 = 78;
                    break;
                }
                case 91: {
                    n14 = 117;
                    break;
                }
                case 92: {
                    n14 = 54;
                    break;
                }
                case 93: {
                    n14 = 148;
                    break;
                }
                case 94: {
                    n14 = 37;
                    break;
                }
                case 95: {
                    n14 = 253;
                    break;
                }
                case 96: {
                    n14 = 31;
                    break;
                }
                case 97: {
                    n14 = 42;
                    break;
                }
                case 98: {
                    n14 = 236;
                    break;
                }
                case 99: {
                    n14 = 152;
                    break;
                }
                case 100: {
                    n14 = 2;
                    break;
                }
                case 101: {
                    n14 = 91;
                    break;
                }
                case 102: {
                    n14 = 161;
                    break;
                }
                case 103: {
                    n14 = 165;
                    break;
                }
                case 104: {
                    n14 = 250;
                    break;
                }
                case 105: {
                    n14 = 200;
                    break;
                }
                case 106: {
                    n14 = 0;
                    break;
                }
                case 107: {
                    n14 = 248;
                    break;
                }
                case 108: {
                    n14 = 21;
                    break;
                }
                case 109: {
                    n14 = 177;
                    break;
                }
                case 110: {
                    n14 = 61;
                    break;
                }
                case 111: {
                    n14 = 207;
                    break;
                }
                case 112: {
                    n14 = 136;
                    break;
                }
                case 113: {
                    n14 = 230;
                    break;
                }
                case 114: {
                    n14 = 226;
                    break;
                }
                case 115: {
                    n14 = 172;
                    break;
                }
                case 116: {
                    n14 = 179;
                    break;
                }
                case 117: {
                    n14 = 71;
                    break;
                }
                case 118: {
                    n14 = 162;
                    break;
                }
                case 119: {
                    n14 = 131;
                    break;
                }
                case 120: {
                    n14 = 237;
                    break;
                }
                case 121: {
                    n14 = 57;
                    break;
                }
                case 122: {
                    n14 = 1;
                    break;
                }
                case 123: {
                    n14 = 23;
                    break;
                }
                case 124: {
                    n14 = 156;
                    break;
                }
                case 125: {
                    n14 = 140;
                    break;
                }
                case 126: {
                    n14 = 203;
                    break;
                }
                case 127: {
                    n14 = 211;
                    break;
                }
                case 128: {
                    n14 = 173;
                    break;
                }
                case 129: {
                    n14 = 251;
                    break;
                }
                case 130: {
                    n14 = 45;
                    break;
                }
                case 131: {
                    n14 = 63;
                    break;
                }
                case 132: {
                    n14 = 17;
                    break;
                }
                case 133: {
                    n14 = 122;
                    break;
                }
                case 134: {
                    n14 = 50;
                    break;
                }
                case 135: {
                    n14 = 245;
                    break;
                }
                case 136: {
                    n14 = 89;
                    break;
                }
                case 137: {
                    n14 = 32;
                    break;
                }
                case 138: {
                    n14 = 99;
                    break;
                }
                case 139: {
                    n14 = 13;
                    break;
                }
                case 140: {
                    n14 = 187;
                    break;
                }
                case 141: {
                    n14 = 123;
                    break;
                }
                case 142: {
                    n14 = 238;
                    break;
                }
                case 143: {
                    n14 = 88;
                    break;
                }
                case 144: {
                    n14 = 252;
                    break;
                }
                case 145: {
                    n14 = 55;
                    break;
                }
                case 146: {
                    n14 = 210;
                    break;
                }
                case 147: {
                    n14 = 194;
                    break;
                }
                case 148: {
                    n14 = 92;
                    break;
                }
                case 149: {
                    n14 = 159;
                    break;
                }
                case 150: {
                    n14 = 35;
                    break;
                }
                case 151: {
                    n14 = 149;
                    break;
                }
                case 152: {
                    n14 = 209;
                    break;
                }
                case 153: {
                    n14 = 244;
                    break;
                }
                case 154: {
                    n14 = 46;
                    break;
                }
                case 155: {
                    n14 = 139;
                    break;
                }
                case 156: {
                    n14 = 93;
                    break;
                }
                case 157: {
                    n14 = 39;
                    break;
                }
                case 158: {
                    n14 = 201;
                    break;
                }
                case 159: {
                    n14 = 202;
                    break;
                }
                case 160: {
                    n14 = 73;
                    break;
                }
                case 161: {
                    n14 = 166;
                    break;
                }
                case 162: {
                    n14 = 205;
                    break;
                }
                case 163: {
                    n14 = 62;
                    break;
                }
                case 164: {
                    n14 = 215;
                    break;
                }
                case 165: {
                    n14 = 101;
                    break;
                }
                case 166: {
                    n14 = 163;
                    break;
                }
                case 167: {
                    n14 = 228;
                    break;
                }
                case 168: {
                    n14 = 81;
                    break;
                }
                case 169: {
                    n14 = 189;
                    break;
                }
                case 170: {
                    n14 = 98;
                    break;
                }
                case 171: {
                    n14 = 96;
                    break;
                }
                case 172: {
                    n14 = 108;
                    break;
                }
                case 173: {
                    n14 = 184;
                    break;
                }
                case 174: {
                    n14 = 137;
                    break;
                }
                case 175: {
                    n14 = 80;
                    break;
                }
                case 176: {
                    n14 = 19;
                    break;
                }
                case 177: {
                    n14 = 5;
                    break;
                }
                case 178: {
                    n14 = 40;
                    break;
                }
                case 179: {
                    n14 = 195;
                    break;
                }
                case 180: {
                    n14 = 70;
                    break;
                }
                case 181: {
                    n14 = 144;
                    break;
                }
                case 182: {
                    n14 = 224;
                    break;
                }
                case 183: {
                    n14 = 27;
                    break;
                }
                case 184: {
                    n14 = 25;
                    break;
                }
                case 185: {
                    n14 = 255;
                    break;
                }
                case 186: {
                    n14 = 66;
                    break;
                }
                case 187: {
                    n14 = 221;
                    break;
                }
                case 188: {
                    n14 = 147;
                    break;
                }
                case 189: {
                    n14 = 243;
                    break;
                }
                case 190: {
                    n14 = 196;
                    break;
                }
                case 191: {
                    n14 = 168;
                    break;
                }
                case 192: {
                    n14 = 112;
                    break;
                }
                case 193: {
                    n14 = 33;
                    break;
                }
                case 194: {
                    n14 = 72;
                    break;
                }
                case 195: {
                    n14 = 30;
                    break;
                }
                case 196: {
                    n14 = 158;
                    break;
                }
                case 197: {
                    n14 = 15;
                    break;
                }
                case 198: {
                    n14 = 52;
                    break;
                }
                case 199: {
                    n14 = 155;
                    break;
                }
                case 200: {
                    n14 = 6;
                    break;
                }
                case 201: {
                    n14 = 118;
                    break;
                }
                case 202: {
                    n14 = 142;
                    break;
                }
                case 203: {
                    n14 = 51;
                    break;
                }
                case 204: {
                    n14 = 59;
                    break;
                }
                case 205: {
                    n14 = 141;
                    break;
                }
                case 206: {
                    n14 = 110;
                    break;
                }
                case 207: {
                    n14 = 241;
                    break;
                }
                case 208: {
                    n14 = 82;
                    break;
                }
                case 209: {
                    n14 = 180;
                    break;
                }
                case 210: {
                    n14 = 216;
                    break;
                }
                case 211: {
                    n14 = 229;
                    break;
                }
                case 212: {
                    n14 = 138;
                    break;
                }
                case 213: {
                    n14 = 143;
                    break;
                }
                case 214: {
                    n14 = 146;
                    break;
                }
                case 215: {
                    n14 = 87;
                    break;
                }
                case 216: {
                    n14 = 182;
                    break;
                }
                case 217: {
                    n14 = 28;
                    break;
                }
                case 218: {
                    n14 = 192;
                    break;
                }
                case 219: {
                    n14 = 67;
                    break;
                }
                case 220: {
                    n14 = 7;
                    break;
                }
                case 221: {
                    n14 = 77;
                    break;
                }
                case 222: {
                    n14 = 44;
                    break;
                }
                case 223: {
                    n14 = 36;
                    break;
                }
                case 224: {
                    n14 = 169;
                    break;
                }
                case 225: {
                    n14 = 213;
                    break;
                }
                case 226: {
                    n14 = 22;
                    break;
                }
                case 227: {
                    n14 = 153;
                    break;
                }
                case 228: {
                    n14 = 171;
                    break;
                }
                case 229: {
                    n14 = 174;
                    break;
                }
                case 230: {
                    n14 = 160;
                    break;
                }
                case 231: {
                    n14 = 240;
                    break;
                }
                case 232: {
                    n14 = 95;
                    break;
                }
                case 233: {
                    n14 = 218;
                    break;
                }
                case 234: {
                    n14 = 43;
                    break;
                }
                case 235: {
                    n14 = 111;
                    break;
                }
                case 236: {
                    n14 = 223;
                    break;
                }
                case 237: {
                    n14 = 242;
                    break;
                }
                case 238: {
                    n14 = 167;
                    break;
                }
                case 239: {
                    n14 = 249;
                    break;
                }
                case 240: {
                    n14 = 79;
                    break;
                }
                case 241: {
                    n14 = 65;
                    break;
                }
                case 242: {
                    n14 = 188;
                    break;
                }
                case 243: {
                    n14 = 121;
                    break;
                }
                case 244: {
                    n14 = 204;
                    break;
                }
                case 245: {
                    n14 = 225;
                    break;
                }
                case 246: {
                    n14 = 127;
                    break;
                }
                case 247: {
                    n14 = 106;
                    break;
                }
                case 248: {
                    n14 = 18;
                    break;
                }
                case 249: {
                    n14 = 181;
                    break;
                }
                case 250: {
                    n14 = 9;
                    break;
                }
                case 251: {
                    n14 = 132;
                    break;
                }
                case 252: {
                    n14 = 217;
                    break;
                }
                case 253: {
                    n14 = 197;
                    break;
                }
                case 254: {
                    n14 = 145;
                    break;
                }
                default: {
                    n14 = 102;
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
            a4.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x57F6;
        if (e[n11] == null) {
            a4.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }

    private static long c(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x2ABC) & Short.MAX_VALUE;
        if (g[n11] == null) {
            a4.g[n11] = f[n11] ^ l2;
        }
        return g[n11];
    }
}

