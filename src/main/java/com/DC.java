/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.df_0;
import com.nm_2;
import com.ny_0;
import com.re_0;

final class DC {
    private static final int[] M;
    static final int[] b;
    int N;
    int p;
    int q;
    int J;
    int[] P;
    int[] u = new int[1];
    int[] Q = new int[1];
    int[] G = new int[1];
    int[] H = new int[1];
    int[][] D = new int[1][];
    int[][] o = new int[1][];
    int[] y = new int[1];
    int[] w;
    private final re_0 V;
    int v;
    int m;
    int t;
    int[] g;
    byte[] B;
    int Z;
    int a;
    int O;
    private boolean z;
    private final ny_0 n;
    private final df_0 h;
    private static final String[] c;
    private static final String[] d;
    private static final long[] e;
    private static final Integer[] f;

    DC(df_0 df_02, int n10) {
        int[] nArray = nm_2.g();
        this.w = new int[1];
        this.n = new ny_0();
        this.h = df_02;
        this.V = new re_0(this.h, this);
        this.g = new int[DC.a(22997, 4523291595935445694L)];
        this.B = new byte[n10];
        this.Z = n10;
        int n11 = df_02.T.y;
        if (nArray == null) {
            n11 = n11 == 0 ? 0 : 1;
        }
        this.z = n11;
        this.N = 0;
        this.z();
    }

    void z() {
        block8: {
            DC dC;
            block7: {
                int n10;
                block6: {
                    int n11;
                    int[] nArray;
                    block5: {
                        nArray = nm_2.g();
                        n10 = this.N;
                        n11 = 4;
                        if (nArray != null) break block5;
                        if (n10 == n11 || this.N == 5) {
                            // empty if block
                        }
                        n10 = this.N;
                        if (nArray != null) break block6;
                        n11 = DC.a(4269, 2118151574774430715L);
                    }
                    if (n10 == n11) {
                        this.V.O(this.h);
                    }
                    this.N = 0;
                    this.m = 0;
                    this.t = 0;
                    this.O = 0;
                    this.a = 0;
                    dC = this;
                    if (nArray != null) break block7;
                    n10 = dC.z ? '\u0001' : '\u0000';
                }
                if (n10 == 0) break block8;
                dC = this;
            }
            dC.h.e.C();
        }
    }

    /*
     * Unable to fully structure code
     */
    int S(int var1_1) {
        var6_2 = this.h.f;
        var7_3 = this.h.L;
        var4_4 = this.t;
        var5_5 = this.m;
        var8_6 = this.O;
        var2_7 = nm_2.g();
        v0 = var8_6;
        v1 = this.a;
        if (var2_7 != null) ** GOTO lbl15
        if (v0 < v1) {
            v2 = this.a - var8_6 - 1;
        } else {
            v0 = this.Z;
            v1 = var8_6;
lbl15:
            // 2 sources

            v2 = v0 - v1;
        }
        var9_8 = v2;
        block18: while (true) {
            switch (this.N) {
                case 0: {
                    while (var5_5 < 3) {
                        v3 = var7_3--;
                        if (var2_7 != null) ** GOTO lbl39
                        if (var2_7 != null) ** GOTO lbl34
                        if (v3 == 0) ** GOTO lbl27
                        var1_1 = 0;
                        if (var2_7 == null) ** GOTO lbl35
lbl27:
                        // 2 sources

                        this.t = var4_4;
                        this.m = var5_5;
                        this.h.L = var7_3;
                        this.h.O += (long)(var6_2 - this.h.f);
                        this.h.f = var6_2;
                        this.O = var8_6;
                        v4 = this.C(var1_1);
lbl34:
                        // 2 sources

                        return v4;
lbl35:
                        // 1 sources

                        var4_4 |= (this.h.x[var6_2++] & DC.a(18678, 3436660671119254430L)) << var5_5;
                        var5_5 += 8;
                        if (var2_7 == null) continue;
                    }
                    v3 = var4_4 & DC.a(24432, 2353475014245184559L);
lbl39:
                    // 2 sources

                    var3_9 = v3;
                    this.v = var3_9 & 1;
                    v5 = var3_9 >>> 1;
                    if (var2_7 != null) ** GOTO lbl49
                    switch (v5) {
                        case 0: {
                            var4_4 >>>= 3;
                            var3_9 = (var5_5 -= 3) & DC.a(14864, 6734652441806836052L);
                            var4_4 >>>= var3_9;
                            v5 = var5_5 - var3_9;
lbl49:
                            // 2 sources

                            var5_5 = v5;
                            this.N = 1;
                            if (var2_7 == null) break;
                        }
                        case 1: {
                            ny_0.r(this.G, this.H, this.D, this.o, this.h);
                            this.V.m(this.G[0], this.H[0], this.D[0], 0, this.o[0], 0);
                            var4_4 >>>= 3;
                            var5_5 -= 3;
                            this.N = DC.a(30862, 773978373744841679L);
                            if (var2_7 == null) break;
                        }
                        case 2: {
                            var4_4 >>>= 3;
                            var5_5 -= 3;
                            this.N = DC.a(11694, 7064307950215759570L);
                            if (var2_7 == null) break;
                        }
                        case 3: {
                            this.N = DC.a(8944, 2581519292372191624L);
                            this.h.t = DC.a(25412, -7535);
                            var1_1 = DC.a(23658, 398273062011401993L);
                            this.t = var4_4 >>>= 3;
                            this.m = var5_5 -= 3;
                            this.h.L = var7_3;
                            this.h.O += (long)(var6_2 - this.h.f);
                            this.h.f = var6_2;
                            this.O = var8_6;
                            return this.C(var1_1);
                        }
                    }
                    if (var2_7 == null) continue block18;
                }
                case 1: {
                    while (var5_5 < DC.a(14721, 6868418703061717721L)) {
                        v6 = var7_3--;
                        if (var2_7 != null) ** GOTO lbl97
                        if (var2_7 != null) ** GOTO lbl92
                        if (v6 == 0) ** GOTO lbl85
                        var1_1 = 0;
                        if (var2_7 == null) ** GOTO lbl93
lbl85:
                        // 2 sources

                        this.t = var4_4;
                        this.m = var5_5;
                        this.h.L = var7_3;
                        this.h.O += (long)(var6_2 - this.h.f);
                        this.h.f = var6_2;
                        this.O = var8_6;
                        v7 = this.C(var1_1);
lbl92:
                        // 2 sources

                        return v7;
lbl93:
                        // 1 sources

                        var4_4 |= (this.h.x[var6_2++] & DC.a(12757, 3571799317012224677L)) << var5_5;
                        var5_5 += 8;
                        if (var2_7 == null) continue;
                    }
                    v6 = ~var4_4 >>> DC.a(8835, 7049914514974935518L) & DC.a(22808, 6212619223366693500L);
lbl97:
                    // 2 sources

                    v8 = var4_4 & DC.a(474, 4390235326533347993L);
                    if (var2_7 == null) {
                        if (v6 != v8) {
                            this.N = DC.a(9290, 5204385231924629297L);
                            this.h.t = DC.a(25415, 29950);
                            var1_1 = DC.a(14913, 857702905109352719L);
                            this.t = var4_4;
                            this.m = var5_5;
                            this.h.L = var7_3;
                            this.h.O += (long)(var6_2 - this.h.f);
                            this.h.f = var6_2;
                            this.O = var8_6;
                            return this.C(var1_1);
                        }
                        this.p = var4_4 & DC.a(474, 4390235326533347993L);
                        v8 = 0;
                        v6 = 0;
                    }
                    var5_5 = v8;
                    var4_4 = v6;
                    v9 = this.p;
                    if (var2_7 != null) ** GOTO lbl121
                    if (v9 != 0) {
                        v9 = 2;
                    } else {
                        v9 = this.v;
lbl121:
                        // 2 sources

                        if (var2_7 == null) {
                            v9 = this.N = v9 != 0 ? DC.a(14864, 6734652441806836052L) : 0;
                        }
                    }
                    if (var2_7 == null) continue block18;
                }
                case 2: {
                    v10 = var7_3;
                    if (var2_7 == null) {
                        if (v10 == 0) {
                            this.t = var4_4;
                            this.m = var5_5;
                            this.h.L = var7_3;
                            this.h.O += (long)(var6_2 - this.h.f);
                            this.h.f = var6_2;
                            this.O = var8_6;
                            return this.C(var1_1);
                        }
                        v10 = var9_8;
                    }
                    if (var2_7 != null) ** GOTO lbl198
                    if (v10 != 0) ** GOTO lbl196
                    v10 = var8_6;
                    if (var2_7 != null) ** GOTO lbl155
                    if (v10 != this.Z) ** GOTO lbl154
                    v10 = this.a;
                    if (var2_7 != null) ** GOTO lbl155
                    if (v10 == 0) ** GOTO lbl154
                    v11 = var8_6 = 0;
                    v12 = this.a;
                    if (var2_7 != null) ** GOTO lbl152
                    if (v11 < v12) {
                        v13 = this.a - var8_6 - 1;
                    } else {
                        v11 = this.Z;
                        v12 = var8_6;
lbl152:
                        // 2 sources

                        v13 = v11 - v12;
                    }
                    var9_8 = v13;
lbl154:
                    // 3 sources

                    v10 = var9_8;
lbl155:
                    // 3 sources

                    if (var2_7 != null) ** GOTO lbl198
                    if (v10 != 0) ** GOTO lbl196
                    this.O = var8_6;
                    var1_1 = this.C(var1_1);
                    v14 = var8_6 = this.O;
                    v15 = this.a;
                    if (var2_7 != null) ** GOTO lbl167
                    if (v14 < v15) {
                        v16 = this.a - var8_6 - 1;
                    } else {
                        v14 = this.Z;
                        v15 = var8_6;
lbl167:
                        // 2 sources

                        v16 = v14 - v15;
                    }
                    var9_8 = v16;
                    v10 = var8_6;
                    if (var2_7 != null) ** GOTO lbl186
                    if (v10 != this.Z) ** GOTO lbl185
                    v10 = this.a;
                    if (var2_7 != null) ** GOTO lbl186
                    if (v10 == 0) ** GOTO lbl185
                    v17 = var8_6 = 0;
                    v18 = this.a;
                    if (var2_7 != null) ** GOTO lbl183
                    if (v17 < v18) {
                        v19 = this.a - var8_6 - 1;
                    } else {
                        v17 = this.Z;
                        v18 = var8_6;
lbl183:
                        // 2 sources

                        v19 = v17 - v18;
                    }
                    var9_8 = v19;
lbl185:
                    // 3 sources

                    v10 = var9_8;
lbl186:
                    // 3 sources

                    if (var2_7 == null) {
                        if (v10 == 0) {
                            this.t = var4_4;
                            this.m = var5_5;
                            this.h.L = var7_3;
                            this.h.O += (long)(var6_2 - this.h.f);
                            this.h.f = var6_2;
                            this.O = var8_6;
                            return this.C(var1_1);
                        } else {
                            ** GOTO lbl196
                        }
                    }
                    ** GOTO lbl198
lbl196:
                    // 4 sources

                    var1_1 = 0;
                    v10 = this.p;
lbl198:
                    // 4 sources

                    v20 = var3_9 = v10;
                    v21 = var7_3;
                    if (var2_7 == null) {
                        if (v20 > v21) {
                            var3_9 = var7_3;
                        }
                        v20 = var3_9;
                        v21 = var9_8;
                    }
                    if (var2_7 == null) {
                        if (v20 > v21) {
                            var3_9 = var9_8;
                        }
                        System.arraycopy(this.h.x, var6_2, this.B, var8_6, var3_9);
                        var6_2 += var3_9;
                        var7_3 -= var3_9;
                        var8_6 += var3_9;
                        v20 = var9_8;
                        v21 = var3_9;
                    }
                    var9_8 = v20 - v21;
                    v22 = this;
                    v23 = v22;
                    v24 = v22.p - var3_9;
                    if (var2_7 == null) {
                        v23.p = v24;
                        if (v24 != 0 && var2_7 == null) continue block18;
                        v23 = this;
                        v24 = this.v;
                    }
                    if (var2_7 == null) {
                        v24 = v23.N = v24 != 0 ? DC.a(14864, 6734652441806836052L) : 0;
                    }
                    if (var2_7 == null) continue block18;
                }
                case 3: {
                    while (var5_5 < DC.a(25037, 1492721350452923019L)) {
                        v25 = var7_3--;
                        if (var2_7 != null) ** GOTO lbl290
                        if (var2_7 != null) ** GOTO lbl241
                        if (v25 == 0) ** GOTO lbl234
                        var1_1 = 0;
                        if (var2_7 == null) ** GOTO lbl242
lbl234:
                        // 2 sources

                        this.t = var4_4;
                        this.m = var5_5;
                        this.h.L = var7_3;
                        this.h.O += (long)(var6_2 - this.h.f);
                        this.h.f = var6_2;
                        this.O = var8_6;
                        v26 = this.C(var1_1);
lbl241:
                        // 2 sources

                        return v26;
lbl242:
                        // 1 sources

                        var4_4 |= (this.h.x[var6_2++] & DC.a(12757, 3571799317012224677L)) << var5_5;
                        var5_5 += 8;
                        if (var2_7 == null) continue;
                    }
                    this.q = var3_9 = var4_4 & DC.a(12792, 1697514516235655833L);
                    v27 = var3_9 & DC.a(3854, 1447116990127645800L);
                    if (var2_7 != null) ** GOTO lbl263
                    if (v27 > DC.a(14013, 7620670665642712532L)) ** GOTO lbl253
                    v28 = var3_9 >> 5 & DC.a(16572, 6474331508880731111L);
                    v29 = DC.a(22661, 218260688106779598L);
                    if (var2_7 != null) ** GOTO lbl266
                    if (v28 <= v29) ** GOTO lbl264
lbl253:
                    // 2 sources

                    this.N = DC.a(9290, 5204385231924629297L);
                    this.h.t = DC.a(25413, 30840);
                    var1_1 = DC.a(14913, 857702905109352719L);
                    this.t = var4_4;
                    this.m = var5_5;
                    this.h.L = var7_3;
                    this.h.O += (long)(var6_2 - this.h.f);
                    this.h.f = var6_2;
                    this.O = var8_6;
                    v27 = this.C(var1_1);
lbl263:
                    // 2 sources

                    return v27;
lbl264:
                    // 1 sources

                    v28 = DC.a(24028, 8794803382669670018L) + (var3_9 & DC.a(16572, 6474331508880731111L));
                    v29 = var3_9 >> 5 & DC.a(16572, 6474331508880731111L);
lbl266:
                    // 2 sources

                    var3_9 = v28 + v29;
                    v30 = this;
                    if (var2_7 != null) ** GOTO lbl274
                    if (v30.P == null) ** GOTO lbl273
                    v31 = this.P.length;
                    if (var2_7 != null) ** GOTO lbl277
                    if (v31 >= var3_9) ** GOTO lbl-1000
lbl273:
                    // 2 sources

                    v30 = this;
lbl274:
                    // 2 sources

                    v30.P = new int[var3_9];
                    if (var2_7 != null) lbl-1000:
                    // 2 sources

                    {
                        v31 = var10_10 = 0;
lbl277:
                        // 3 sources

                        while (var10_10 < var3_9) {
                            this.P[var10_10] = 0;
                            ++var10_10;
                            if (var2_7 == null) {
                                if (var2_7 == null) continue;
                            }
                            break;
                        }
                    } else {
                        var4_4 >>>= DC.a(29366, 4843262844623149504L);
                        var5_5 -= 14;
                        this.J = 0;
                    }
                    this.N = DC.a(24433, 144612162747790344L);
                }
                case 4: {
                    do {
                        v25 = this.J;
lbl290:
                        // 2 sources

                        if (v25 >= 4 + (this.q >>> DC.a(29534, 6640681241821370412L))) break;
                        do {
                            v32 = var5_5;
                            v33 = 3;
                            if (var2_7 != null) ** GOTO lbl321
                            if (v32 >= v33) break;
                            v34 = var7_3--;
                            if (var2_7 != null) ** GOTO lbl315
                            if (var2_7 != null) ** GOTO lbl309
                            if (v34 == 0) ** GOTO lbl302
                            var1_1 = 0;
                            if (var2_7 == null) ** GOTO lbl310
lbl302:
                            // 2 sources

                            this.t = var4_4;
                            this.m = var5_5;
                            this.h.L = var7_3;
                            this.h.O += (long)(var6_2 - this.h.f);
                            this.h.f = var6_2;
                            this.O = var8_6;
                            v35 = this.C(var1_1);
lbl309:
                            // 2 sources

                            return v35;
lbl310:
                            // 1 sources

                            var4_4 |= (this.h.x[var6_2++] & DC.a(12757, 3571799317012224677L)) << var5_5;
                            var5_5 += 8;
                        } while (var2_7 == null);
                        this.P[DC.b[this.J++]] = var4_4 & DC.a(14864, 6734652441806836052L);
                        v34 = var4_4 >>> 3;
lbl315:
                        // 2 sources

                        var4_4 = v34;
                        var5_5 -= 3;
                    } while (var2_7 == null);
                    do {
                        v32 = this.J;
                        v33 = DC.a(10614, 3372948448106152497L);
lbl321:
                        // 2 sources

                        if (v32 >= v33) break;
                        this.P[DC.b[this.J++]] = 0;
                        if (var2_7 != null) ** GOTO lbl326
                    } while (var2_7 == null);
                    this.u[0] = DC.a(14864, 6734652441806836052L);
lbl326:
                    // 2 sources

                    var3_9 = this.n.P(this.P, this.u, this.Q, this.g, this.h);
                    if (var2_7 == null) {
                        if (var3_9 != 0) {
                            v36 = var1_1 = var3_9;
                            if (var2_7 == null) {
                                if (v36 == DC.a(14913, 857702905109352719L)) {
                                    this.P = null;
                                    this.N = DC.a(9290, 5204385231924629297L);
                                }
                                this.t = var4_4;
                                this.m = var5_5;
                                this.h.L = var7_3;
                                this.h.O += (long)(var6_2 - this.h.f);
                                this.h.f = var6_2;
                                this.O = var8_6;
                                v36 = this.C(var1_1);
                            }
                            return v36;
                        }
                        this.J = 0;
                    }
                    this.N = DC.a(25200, 5707485352743258372L);
                }
                case 5: {
                    do {
                        var3_9 = this.q;
                        if (this.J >= DC.a(6151, 9108551211836977986L) + (var3_9 & DC.a(16572, 6474331508880731111L)) + (var3_9 >> 5 & DC.a(16572, 6474331508880731111L))) {
                            if (var2_7 == null) {
                                if (var2_7 == null) break;
                            }
                        } else {
                            var3_9 = this.u[0];
                        }
                        while (var5_5 < var3_9) {
                            v37 = var7_3--;
                            if (var2_7 != null) ** GOTO lbl371
                            if (var2_7 != null) ** GOTO lbl366
                            if (v37 == 0) ** GOTO lbl359
                            var1_1 = 0;
                            if (var2_7 == null) ** GOTO lbl367
lbl359:
                            // 2 sources

                            this.t = var4_4;
                            this.m = var5_5;
                            this.h.L = var7_3;
                            this.h.O += (long)(var6_2 - this.h.f);
                            this.h.f = var6_2;
                            this.O = var8_6;
                            v38 = this.C(var1_1);
lbl366:
                            // 2 sources

                            return v38;
lbl367:
                            // 1 sources

                            var4_4 |= (this.h.x[var6_2++] & DC.a(12757, 3571799317012224677L)) << var5_5;
                            var5_5 += 8;
                            if (var2_7 == null) continue;
                        }
                        v37 = this.Q[0];
lbl371:
                        // 2 sources

                        if (v37 == -1) {
                            // empty if block
                        }
                        var3_9 = this.g[(this.Q[0] + (var4_4 & DC.M[var3_9])) * 3 + 1];
                        v39 = var13_13 = this.g[(this.Q[0] + (var4_4 & DC.M[var3_9])) * 3 + 2];
                        v40 = DC.a(32511, 1230210044097811866L);
                        if (var2_7 == null) {
                            if (v39 < v40) {
                                var4_4 >>>= var3_9;
                                var5_5 -= var3_9;
                                this.P[this.J++] = var13_13;
                                if (var2_7 == null) continue;
                            }
                            v39 = var13_13;
                            v40 = DC.a(1816, 3694444548171115625L);
                        }
                        if (var2_7 != null) ** GOTO lbl390
                        if (v39 == v40) {
                            v41 = DC.a(14864, 6734652441806836052L);
                        } else {
                            v39 = var13_13;
                            v40 = DC.a(29366, 4843262844623149504L);
lbl390:
                            // 2 sources

                            v41 = v39 - v40;
                        }
                        var11_11 = v41;
                        v42 = var13_13;
                        if (var2_7 == null) {
                            v42 = var12_12 = v42 == DC.a(29632, 4870013022758033582L) ? DC.a(23180, 7250323131201647103L) : 3;
                        }
                        while (var5_5 < var3_9 + var11_11) {
                            v43 = var7_3--;
                            if (var2_7 != null) ** GOTO lbl420
                            if (var2_7 != null) ** GOTO lbl409
                            if (v43 == 0) ** GOTO lbl402
                            var1_1 = 0;
                            if (var2_7 == null) ** GOTO lbl410
lbl402:
                            // 2 sources

                            this.t = var4_4;
                            this.m = var5_5;
                            this.h.L = var7_3;
                            this.h.O += (long)(var6_2 - this.h.f);
                            this.h.f = var6_2;
                            this.O = var8_6;
                            v44 = this.C(var1_1);
lbl409:
                            // 2 sources

                            return v44;
lbl410:
                            // 1 sources

                            var4_4 |= (this.h.x[var6_2++] & DC.a(12757, 3571799317012224677L)) << var5_5;
                            var5_5 += 8;
                            if (var2_7 == null) continue;
                        }
                        var5_5 -= var3_9;
                        var12_12 += (var4_4 >>>= var3_9) & DC.M[var11_11];
                        var4_4 >>>= var11_11;
                        var5_5 -= var11_11;
                        var11_11 = this.J;
                        var3_9 = this.q;
                        v43 = var11_11 + var12_12;
lbl420:
                        // 2 sources

                        if (var2_7 != null) ** GOTO lbl441
                        if (v43 > DC.a(6151, 9108551211836977986L) + (var3_9 & DC.a(16572, 6474331508880731111L)) + (var3_9 >> 5 & DC.a(16572, 6474331508880731111L))) ** GOTO lbl430
                        v45 = var13_13;
                        v46 = DC.a(32511, 1230210044097811866L);
                        if (var2_7 != null) ** GOTO lbl445
                        if (v45 != v46) ** GOTO lbl442
                        v45 = var11_11;
                        v46 = 1;
                        if (var2_7 != null) ** GOTO lbl445
                        if (v45 >= v46) ** GOTO lbl442
lbl430:
                        // 2 sources

                        this.P = null;
                        this.N = DC.a(9290, 5204385231924629297L);
                        this.h.t = DC.a(25414, 16936);
                        var1_1 = DC.a(14913, 857702905109352719L);
                        this.t = var4_4;
                        this.m = var5_5;
                        this.h.L = var7_3;
                        this.h.O += (long)(var6_2 - this.h.f);
                        this.h.f = var6_2;
                        this.O = var8_6;
                        v43 = this.C(var1_1);
lbl441:
                        // 2 sources

                        return v43;
lbl442:
                        // 2 sources

                        v45 = var13_13;
                        if (var2_7 != null) ** GOTO lbl446
                        v46 = DC.a(32511, 1230210044097811866L);
lbl445:
                        // 3 sources

                        v45 = v45 == v46 ? this.P[var11_11 - 1] : 0;
lbl446:
                        // 2 sources

                        var13_13 = v45;
                        block29: while (true) {
                            v47 = this;
                            do {
                                v47.P[var11_11++] = var13_13;
                                if (--var12_12 != 0) continue block29;
                                v47 = this;
                            } while (var2_7 != null);
                            break;
                        }
                        v47.J = var11_11;
                    } while (var2_7 == null);
                    this.Q[0] = -1;
                    this.G[0] = DC.a(9290, 5204385231924629297L);
                    this.H[0] = DC.a(30862, 773978373744841679L);
                    var3_9 = this.q;
                    var3_9 = this.n.u(DC.a(16993, 7630357195837401372L) + (var3_9 & DC.a(16572, 6474331508880731111L)), 1 + (var3_9 >> 5 & DC.a(16572, 6474331508880731111L)), this.P, this.G, this.H, this.y, this.w, this.g, this.h);
                    if (var2_7 == null) {
                        if (var3_9 != 0) {
                            v48 = var3_9;
                            if (var2_7 == null) {
                                if (v48 == DC.a(14913, 857702905109352719L)) {
                                    this.P = null;
                                    this.N = DC.a(9290, 5204385231924629297L);
                                }
                                var1_1 = var3_9;
                                this.t = var4_4;
                                this.m = var5_5;
                                this.h.L = var7_3;
                                this.h.O += (long)(var6_2 - this.h.f);
                                this.h.f = var6_2;
                                this.O = var8_6;
                                v48 = this.C(var1_1);
                            }
                            return v48;
                        }
                        this.V.m(this.G[0], this.H[0], this.g, this.y[0], this.g, this.w[0]);
                    }
                    this.N = DC.a(30862, 773978373744841679L);
                }
                case 6: {
                    this.t = var4_4;
                    this.m = var5_5;
                    this.h.L = var7_3;
                    this.h.O += (long)(var6_2 - this.h.f);
                    this.h.f = var6_2;
                    this.O = var8_6;
                    v49 = this.V.Q(var1_1);
                    v50 = 1;
                    if (var2_7 == null) {
                        if (v49 != v50) {
                            return this.C(var1_1);
                        }
                        var1_1 = 0;
                        this.V.O(this.h);
                        var6_2 = this.h.f;
                        var7_3 = this.h.L;
                        var4_4 = this.t;
                        var5_5 = this.m;
                        v49 = var8_6 = this.O;
                        v50 = this.a;
                    }
                    if (var2_7 != null) ** GOTO lbl505
                    if (v49 < v50) {
                        v51 = this.a - var8_6 - 1;
                    } else {
                        v49 = this.Z;
                        v50 = var8_6;
lbl505:
                        // 2 sources

                        v51 = v49 - v50;
                    }
                    var9_8 = v51;
                    v52 = this;
                    if (var2_7 == null) {
                        if (v52.v == 0) {
                            this.N = 0;
                            if (var2_7 != null) ** break;
                            continue block18;
                        }
                        v52 = this;
                    }
                    v52.N = DC.a(14864, 6734652441806836052L);
                }
                case 7: {
                    this.O = var8_6;
                    var1_1 = this.C(var1_1);
                    v53 = var8_6 = this.O;
                    v54 = this.a;
                    if (var2_7 != null) ** GOTO lbl526
                    if (v53 < v54) {
                        v55 = this.a - var8_6 - 1;
                    } else {
                        v53 = this.Z;
                        v54 = var8_6;
lbl526:
                        // 2 sources

                        v55 = v53 - v54;
                    }
                    var9_8 = v55;
                    v56 = this;
                    if (var2_7 == null) {
                        if (v56.a != this.O) {
                            this.t = var4_4;
                            this.m = var5_5;
                            this.h.L = var7_3;
                            this.h.O += (long)(var6_2 - this.h.f);
                            this.h.f = var6_2;
                            this.O = var8_6;
                            return this.C(var1_1);
                        }
                        v56 = this;
                    }
                    v56.N = DC.a(25662, 5053135927995125623L);
                }
                case 8: {
                    var1_1 = 1;
                    this.t = var4_4;
                    this.m = var5_5;
                    this.h.L = var7_3;
                    this.h.O += (long)(var6_2 - this.h.f);
                    this.h.f = var6_2;
                    this.O = var8_6;
                    return this.C(var1_1);
                }
                case 9: {
                    var1_1 = DC.a(14913, 857702905109352719L);
                    this.t = var4_4;
                    this.m = var5_5;
                    this.h.L = var7_3;
                    this.h.O += (long)(var6_2 - this.h.f);
                    this.h.f = var6_2;
                    this.O = var8_6;
                    return this.C(var1_1);
                }
            }
            break;
        }
        var1_1 = DC.a(10007, 11645518728170615L);
        this.t = var4_4;
        this.m = var5_5;
        this.h.L = var7_3;
        this.h.O += (long)(var6_2 - this.h.f);
        this.h.f = var6_2;
        this.O = var8_6;
        return this.C(var1_1);
    }

    void I() {
        this.z();
        this.B = null;
        this.g = null;
    }

    void b(byte[] byArray, int n10, int n11) {
        System.arraycopy(byArray, n10, this.B, 0, n11);
        this.a = this.O = n11;
    }

    int F() {
        int[] nArray = nm_2.g();
        int n10 = this.N;
        if (nArray == null) {
            n10 = n10 == 1 ? 1 : 0;
        }
        return n10;
    }

    int C(int n10) {
        int n11;
        block28: {
            int n12;
            int n13;
            block29: {
                int n14;
                block34: {
                    int n15;
                    block35: {
                        int[] nArray;
                        block32: {
                            block33: {
                                block31: {
                                    int n16;
                                    block30: {
                                        block26: {
                                            block27: {
                                                block24: {
                                                    block25: {
                                                        n13 = this.h.V;
                                                        n12 = this.a;
                                                        nArray = nm_2.g();
                                                        int n17 = n12;
                                                        if (nArray == null) {
                                                            n17 = n17 <= this.O ? this.O : this.Z;
                                                        }
                                                        n11 = n15 = n17 - n12;
                                                        if (nArray == null) {
                                                            if (n11 > this.h.g) {
                                                                n15 = this.h.g;
                                                            }
                                                            n11 = n15;
                                                        }
                                                        if (nArray != null) break block24;
                                                        if (n11 == 0) break block25;
                                                        n11 = n10;
                                                        if (nArray != null) break block24;
                                                        if (n11 == DC.a(547, 8414639432665573753L)) {
                                                            n10 = 0;
                                                        }
                                                    }
                                                    this.h.g -= n15;
                                                    this.h.F += (long)n15;
                                                    n11 = this.z ? '\u0001' : '\u0000';
                                                }
                                                if (nArray != null) break block26;
                                                if (n11 == 0) break block27;
                                                n11 = n15;
                                                if (nArray != null) break block26;
                                                if (n11 > 0) {
                                                    this.h.e.A(this.B, n12, n15);
                                                }
                                            }
                                            System.arraycopy(this.B, n12, this.h.h, n13, n15);
                                            n13 += n15;
                                            n11 = n12 += n15;
                                        }
                                        if (nArray != null) break block28;
                                        if (n11 != this.Z) break block29;
                                        n12 = 0;
                                        n14 = this.O;
                                        n16 = this.Z;
                                        if (nArray != null) break block30;
                                        if (n14 == n16) {
                                            this.O = 0;
                                        }
                                        n14 = n15 = this.O - n12;
                                        if (nArray != null) break block31;
                                        n16 = this.h.g;
                                    }
                                    if (n14 > n16) {
                                        n15 = this.h.g;
                                    }
                                    n14 = n15;
                                }
                                if (nArray != null) break block32;
                                if (n14 == 0) break block33;
                                n14 = n10;
                                if (nArray != null) break block32;
                                if (n14 == DC.a(18451, 8181390361273328500L)) {
                                    n10 = 0;
                                }
                            }
                            this.h.g -= n15;
                            this.h.F += (long)n15;
                            n14 = this.z ? '\u0001' : '\u0000';
                        }
                        if (nArray != null) break block34;
                        if (n14 == 0) break block35;
                        n14 = n15;
                        if (nArray != null) break block34;
                        if (n14 > 0) {
                            this.h.e.A(this.B, n12, n15);
                        }
                    }
                    System.arraycopy(this.B, n12, this.h.h, n13, n15);
                    n13 += n15;
                    n14 = n12 + n15;
                }
                n12 = n14;
            }
            this.h.V = n13;
            this.a = n12;
            n11 = n10;
        }
        return n11;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[4];
                        var11_1 = 0;
                        var10_2 = "\u0013\n\u00ab\u008a?-s\u0084\u00ba\u00f6\u007f\u00f4xs\u00f9\u00e3iC*\t2\u00af!\u00d5\u00d91\u00c437l\u00ca\u00d0Sa\u00a1\u0012\u008d'\u00dfO\u008a\u00f4\u00ee\u00ef\u0000\u00e9(\u001a\u00d5V\u00dd\u00c0mB";
                        var12_3 = "\u0013\n\u00ab\u008a?-s\u0084\u00ba\u00f6\u007f\u00f4xs\u00f9\u00e3iC*\t2\u00af!\u00d5\u00d91\u00c437l\u00ca\u00d0Sa\u00a1\u0012\u008d'\u00dfO\u008a\u00f4\u00ee\u00ef\u0000\u00e9(\u001a\u00d5V\u00dd\u00c0mB".length();
                        var9_4 = 35;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 85;
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
                            var10_2 = "\u00bf\fx\u00cb\u009f\u0085\u00ad \u0098\u00e9\u00e9\u00f1\u0002\u00bd]\u008b^\u00b8\r&UZ]y\u008d\u00bc\u008a\u00c5\u0019\u0082\u00ad\u00df\u00ffk\u00033\u00f0Z\u00ee\u0099\u00fd}%\u00d4\u00bc\u00f0\u00fc\u0080P\u008a\u00b2K\u00f4\\";
                            var12_3 = "\u00bf\fx\u00cb\u009f\u0085\u00ad \u0098\u00e9\u00e9\u00f1\u0002\u00bd]\u008b^\u00b8\r&UZ]y\u008d\u00bc\u008a\u00c5\u0019\u0082\u00ad\u00df\u00ffk\u00033\u00f0Z\u00ee\u0099\u00fd}%\u00d4\u00bc\u00f0\u00fc\u0080P\u008a\u00b2K\u00f4\\".length();
                            var9_4 = 28;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 57;
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
                                    v15 = 78;
                                    break;
                                }
                                case 1: {
                                    v15 = 76;
                                    break;
                                }
                                case 2: {
                                    v15 = 106;
                                    break;
                                }
                                case 3: {
                                    v15 = 31;
                                    break;
                                }
                                case 4: {
                                    v15 = 23;
                                    break;
                                }
                                case 5: {
                                    v15 = 37;
                                    break;
                                }
                                default: {
                                    v15 = 39;
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
                DC.c = var13;
                DC.d = new String[4];
                var0_7 = 8615879035741064270L;
                var6_8 = new long[59];
                var3_9 = 0;
                var4_10 = "\u00a6\u009b\u00d4\u00ee\u00c8\u0016na\u00b68\u00dbP\u0011b\u00e8l\u00ef.\u00f3\u00158\u0010\u0014\u00f2\u00d6\u0080\u00b7# \nY<~\u00ca\u0089\u00bc\u009a\u008a\u00af/\u0084\\/y\u00ae\u00cbQ\u0087\u0014\u00cc\u00fe\u0092$\u00ba\u00b5\u00fa/A\u00fa\u00ab>).\u0010,\u00ab\u0002\u00cf\u0004\u009c\u00c1\u00cdP]s}\u00ec\u0085\u0099\u00c4-~d\u0088\u00c9\u00e9h9z\u0081\u0080\u00f2\u00bakP\u00c1\u00d0\u00c1\u0013r\u00e9\u00ef\u00bf\u00c7\u00e9\u0006\u00b2D\u00e4_i(w\f\u00d0Q\u00b6#N\u0083\u009c\u00b4}\u00a4\u0016 \u00c4\u00ba\u009a\u001cwA\u008d\u0080\u00ca\u009f\u00c7\u00ab]S\u00be/$S\u000f\u00f9\u0087A\u00c1\u00a9\u00b7\u00c7K\u001f\u00fbe\u0011\u00f1[\u00c6\u008e\u00a3\u00d0\u00e5\u00fb\u00bdE\u00cf\u00bd\u008c\u00b6$g\u00dc\u00b8Bc\u0002\u009c\u0017\u00cc\u0007\u000f\u00f5\u0096\u008cZ\u0084\u00d6<\u00c3v\u00ad\u00b4T\u00dd\u00da\u0015\u0005O\u00a5I\u00ea\u00a8\u00fcK\u00fdZ15\u00c4a\u00f6\u0088\u0095\u0080Hn\u0094\u00dd\u001f\u00ef\u00f4\u001b\u00d6\u0091Lmrk\u00d6\u0014Y<\u00bb\u0017\u0091\n\u00e05\t\u00fe\u00ad\u00db\\H\u0014h\u000e(\u009f\u00f3\u00df\u0006\u00bd\u00babi\u00f2i\u00ae\u00e9\u00c2%\u00162d\u00d8\u00a9\u00f4\u009c\u0000\u008a\u00a6\u00a2\u00b3\u00036\"\u00bc\u0080N\u00b3;\u00d0\u0094L\"\u001a\"Q\u0017\u009f\u00d3\u00f3\u0015\u00e3\u0082\u00f2'\u001c\u00fd\u00031RV\u009b\u00e70\u00a0\u00af^= c\u00f7\u00f6\u001d\u00bf\u009dn\u0091\u00d3\u007fF\u0089\u00dd\u001d\u00e0\u009f2\u00b2\u00ee\u00eb\u00fe\u000e\u00de\u0002\u00b1P[w\u0086\u00cbj=\u00eb\u00f7\u00a6\u0006NlMS\u00c8(\u00e2k\u009d\u00d4}\u00c4\u0011Kg\u00f1\u009f\u0087\u00e0\u00aa\u00f3\u0095\u001c\u00b9a\u00fe\u00d8\u00a6F\u00eaWp\u0019(d\u00b3JSQ\u00acu\u0000\u009e\u0003Vl\u00b0\u00e7E\u0080\u0005\u00d8\u00be\u00a3\u00ecy;\u00ce\u00cf\u00b6\u00d5\u001f\u00ea\u00c3\u00b8f\u00ddeo\u00d5\r\u00b0^\u00b7\u0087\u00ff|\u00ad\u00c2\u00a3\u00d2\u0097r\u00ddr]O\u00ed\u009a\u00ccH\u0091\u0094\u001c\u00f9\u00e0\u00a7\u00b6\u00c0\u00d4\u00a7\\\u00cb\u00bc\u00fb\u00b8";
                var5_11 = "\u00a6\u009b\u00d4\u00ee\u00c8\u0016na\u00b68\u00dbP\u0011b\u00e8l\u00ef.\u00f3\u00158\u0010\u0014\u00f2\u00d6\u0080\u00b7# \nY<~\u00ca\u0089\u00bc\u009a\u008a\u00af/\u0084\\/y\u00ae\u00cbQ\u0087\u0014\u00cc\u00fe\u0092$\u00ba\u00b5\u00fa/A\u00fa\u00ab>).\u0010,\u00ab\u0002\u00cf\u0004\u009c\u00c1\u00cdP]s}\u00ec\u0085\u0099\u00c4-~d\u0088\u00c9\u00e9h9z\u0081\u0080\u00f2\u00bakP\u00c1\u00d0\u00c1\u0013r\u00e9\u00ef\u00bf\u00c7\u00e9\u0006\u00b2D\u00e4_i(w\f\u00d0Q\u00b6#N\u0083\u009c\u00b4}\u00a4\u0016 \u00c4\u00ba\u009a\u001cwA\u008d\u0080\u00ca\u009f\u00c7\u00ab]S\u00be/$S\u000f\u00f9\u0087A\u00c1\u00a9\u00b7\u00c7K\u001f\u00fbe\u0011\u00f1[\u00c6\u008e\u00a3\u00d0\u00e5\u00fb\u00bdE\u00cf\u00bd\u008c\u00b6$g\u00dc\u00b8Bc\u0002\u009c\u0017\u00cc\u0007\u000f\u00f5\u0096\u008cZ\u0084\u00d6<\u00c3v\u00ad\u00b4T\u00dd\u00da\u0015\u0005O\u00a5I\u00ea\u00a8\u00fcK\u00fdZ15\u00c4a\u00f6\u0088\u0095\u0080Hn\u0094\u00dd\u001f\u00ef\u00f4\u001b\u00d6\u0091Lmrk\u00d6\u0014Y<\u00bb\u0017\u0091\n\u00e05\t\u00fe\u00ad\u00db\\H\u0014h\u000e(\u009f\u00f3\u00df\u0006\u00bd\u00babi\u00f2i\u00ae\u00e9\u00c2%\u00162d\u00d8\u00a9\u00f4\u009c\u0000\u008a\u00a6\u00a2\u00b3\u00036\"\u00bc\u0080N\u00b3;\u00d0\u0094L\"\u001a\"Q\u0017\u009f\u00d3\u00f3\u0015\u00e3\u0082\u00f2'\u001c\u00fd\u00031RV\u009b\u00e70\u00a0\u00af^= c\u00f7\u00f6\u001d\u00bf\u009dn\u0091\u00d3\u007fF\u0089\u00dd\u001d\u00e0\u009f2\u00b2\u00ee\u00eb\u00fe\u000e\u00de\u0002\u00b1P[w\u0086\u00cbj=\u00eb\u00f7\u00a6\u0006NlMS\u00c8(\u00e2k\u009d\u00d4}\u00c4\u0011Kg\u00f1\u009f\u0087\u00e0\u00aa\u00f3\u0095\u001c\u00b9a\u00fe\u00d8\u00a6F\u00eaWp\u0019(d\u00b3JSQ\u00acu\u0000\u009e\u0003Vl\u00b0\u00e7E\u0080\u0005\u00d8\u00be\u00a3\u00ecy;\u00ce\u00cf\u00b6\u00d5\u001f\u00ea\u00c3\u00b8f\u00ddeo\u00d5\r\u00b0^\u00b7\u0087\u00ff|\u00ad\u00c2\u00a3\u00d2\u0097r\u00ddr]O\u00ed\u009a\u00ccH\u0091\u0094\u001c\u00f9\u00e0\u00a7\u00b6\u00c0\u00d4\u00a7\\\u00cb\u00bc\u00fb\u00b8".length();
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
                    var4_10 = "\u00de\u00a0\u0088`\u00d2\u00b1\u00f4\u0004\\\u0007\u00dc\u00b1\u000b\u00c9\u00f7\u00b3";
                    var5_11 = "\u00de\u00a0\u0088`\u00d2\u00b1\u00f4\u0004\\\u0007\u00dc\u00b1\u000b\u00c9\u00f7\u00b3".length();
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
        DC.e = var6_8;
        DC.f = new Integer[59];
        v22 = new int[DC.a(26832, 4748265326764082090L)];
        v22[0] = 0;
        v22[1] = 1;
        v22[2] = 3;
        v22[3] = DC.a(14864, 6734652441806836052L);
        v22[4] = DC.a(4909, 5471805779499235418L);
        v22[5] = DC.a(16572, 6474331508880731111L);
        v22[DC.a((int)30862, (long)773978373744841679L)] = DC.a(2428, 5954139560404492816L);
        v22[DC.a((int)14864, (long)6734652441806836052L)] = DC.a(4717, 6259525846662953265L);
        v22[DC.a((int)7338, (long)6287363142098368510L)] = DC.a(12757, 3571799317012224677L);
        v22[DC.a((int)9290, (long)5204385231924629297L)] = DC.a(1805, 7902106074661891151L);
        v22[DC.a((int)15895, (long)6947442459787826552L)] = DC.a(9944, 7199207393198935444L);
        v22[DC.a((int)18513, (long)3728649253815608091L)] = DC.a(11484, 4998309385252931475L);
        v22[DC.a((int)20731, (long)695988018334235525L)] = DC.a(13064, 6059802835466688631L);
        v22[DC.a((int)10658, (long)3831658441717809856L)] = DC.a(1438, 3464531462867332843L);
        v22[DC.a((int)29366, (long)4843262844623149504L)] = DC.a(11244, 6980981796817535140L);
        v22[DC.a((int)31445, (long)30879635545739669L)] = DC.a(28848, 5624076865681906653L);
        v22[DC.a((int)32511, (long)1230210044097811866L)] = DC.a(474, 4390235326533347993L);
        DC.M = v22;
        v23 = new int[DC.a(31504, 6243033353845493853L)];
        v23[0] = DC.a(32511, 1230210044097811866L);
        v23[1] = DC.a(21199, 1355574930882591141L);
        v23[2] = DC.a(29632, 4870013022758033582L);
        v23[3] = 0;
        v23[4] = DC.a(7338, 6287363142098368510L);
        v23[5] = DC.a(14864, 6734652441806836052L);
        v23[DC.a((int)30862, (long)773978373744841679L)] = DC.a(9290, 5204385231924629297L);
        v23[DC.a((int)14864, (long)6734652441806836052L)] = DC.a(30862, 773978373744841679L);
        v23[DC.a((int)7338, (long)6287363142098368510L)] = DC.a(15895, 6947442459787826552L);
        v23[DC.a((int)9290, (long)5204385231924629297L)] = 5;
        v23[DC.a((int)15895, (long)6947442459787826552L)] = DC.a(18513, 3728649253815608091L);
        v23[DC.a((int)18513, (long)3728649253815608091L)] = 4;
        v23[DC.a((int)4883, (long)8764703379816790086L)] = DC.a(4883, 8764703379816790086L);
        v23[DC.a((int)13709, (long)7837418196586405588L)] = 3;
        v23[DC.a((int)29366, (long)4843262844623149504L)] = DC.a(13709, 7837418196586405588L);
        v23[DC.a((int)31445, (long)30879635545739669L)] = 2;
        v23[DC.a((int)32511, (long)1230210044097811866L)] = DC.a(29366, 4843262844623149504L);
        v23[DC.a((int)21199, (long)1355574930882591141L)] = 1;
        v23[DC.a((int)29632, (long)4870013022758033582L)] = DC.a(31445, 30879635545739669L);
        DC.b = v23;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6345) & 0xFFFF;
        if (d[n12] == null) {
            int n13;
            int n14;
            char[] cArray = c[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 229;
                    break;
                }
                case 1: {
                    n14 = 52;
                    break;
                }
                case 2: {
                    n14 = 125;
                    break;
                }
                case 3: {
                    n14 = 210;
                    break;
                }
                case 4: {
                    n14 = 67;
                    break;
                }
                case 5: {
                    n14 = 173;
                    break;
                }
                case 6: {
                    n14 = 254;
                    break;
                }
                case 7: {
                    n14 = 22;
                    break;
                }
                case 8: {
                    n14 = 252;
                    break;
                }
                case 9: {
                    n14 = 202;
                    break;
                }
                case 10: {
                    n14 = 126;
                    break;
                }
                case 11: {
                    n14 = 189;
                    break;
                }
                case 12: {
                    n14 = 43;
                    break;
                }
                case 13: {
                    n14 = 19;
                    break;
                }
                case 14: {
                    n14 = 171;
                    break;
                }
                case 15: {
                    n14 = 83;
                    break;
                }
                case 16: {
                    n14 = 230;
                    break;
                }
                case 17: {
                    n14 = 169;
                    break;
                }
                case 18: {
                    n14 = 150;
                    break;
                }
                case 19: {
                    n14 = 192;
                    break;
                }
                case 20: {
                    n14 = 179;
                    break;
                }
                case 21: {
                    n14 = 244;
                    break;
                }
                case 22: {
                    n14 = 142;
                    break;
                }
                case 23: {
                    n14 = 101;
                    break;
                }
                case 24: {
                    n14 = 141;
                    break;
                }
                case 25: {
                    n14 = 214;
                    break;
                }
                case 26: {
                    n14 = 89;
                    break;
                }
                case 27: {
                    n14 = 98;
                    break;
                }
                case 28: {
                    n14 = 119;
                    break;
                }
                case 29: {
                    n14 = 30;
                    break;
                }
                case 30: {
                    n14 = 77;
                    break;
                }
                case 31: {
                    n14 = 191;
                    break;
                }
                case 32: {
                    n14 = 80;
                    break;
                }
                case 33: {
                    n14 = 239;
                    break;
                }
                case 34: {
                    n14 = 227;
                    break;
                }
                case 35: {
                    n14 = 64;
                    break;
                }
                case 36: {
                    n14 = 221;
                    break;
                }
                case 37: {
                    n14 = 95;
                    break;
                }
                case 38: {
                    n14 = 195;
                    break;
                }
                case 39: {
                    n14 = 228;
                    break;
                }
                case 40: {
                    n14 = 91;
                    break;
                }
                case 41: {
                    n14 = 72;
                    break;
                }
                case 42: {
                    n14 = 122;
                    break;
                }
                case 43: {
                    n14 = 253;
                    break;
                }
                case 44: {
                    n14 = 21;
                    break;
                }
                case 45: {
                    n14 = 144;
                    break;
                }
                case 46: {
                    n14 = 219;
                    break;
                }
                case 47: {
                    n14 = 127;
                    break;
                }
                case 48: {
                    n14 = 240;
                    break;
                }
                case 49: {
                    n14 = 158;
                    break;
                }
                case 50: {
                    n14 = 249;
                    break;
                }
                case 51: {
                    n14 = 41;
                    break;
                }
                case 52: {
                    n14 = 15;
                    break;
                }
                case 53: {
                    n14 = 154;
                    break;
                }
                case 54: {
                    n14 = 174;
                    break;
                }
                case 55: {
                    n14 = 48;
                    break;
                }
                case 56: {
                    n14 = 225;
                    break;
                }
                case 57: {
                    n14 = 250;
                    break;
                }
                case 58: {
                    n14 = 232;
                    break;
                }
                case 59: {
                    n14 = 128;
                    break;
                }
                case 60: {
                    n14 = 103;
                    break;
                }
                case 61: {
                    n14 = 11;
                    break;
                }
                case 62: {
                    n14 = 14;
                    break;
                }
                case 63: {
                    n14 = 112;
                    break;
                }
                case 64: {
                    n14 = 136;
                    break;
                }
                case 65: {
                    n14 = 194;
                    break;
                }
                case 66: {
                    n14 = 182;
                    break;
                }
                case 67: {
                    n14 = 118;
                    break;
                }
                case 68: {
                    n14 = 199;
                    break;
                }
                case 69: {
                    n14 = 13;
                    break;
                }
                case 70: {
                    n14 = 242;
                    break;
                }
                case 71: {
                    n14 = 104;
                    break;
                }
                case 72: {
                    n14 = 114;
                    break;
                }
                case 73: {
                    n14 = 40;
                    break;
                }
                case 74: {
                    n14 = 251;
                    break;
                }
                case 75: {
                    n14 = 212;
                    break;
                }
                case 76: {
                    n14 = 71;
                    break;
                }
                case 77: {
                    n14 = 184;
                    break;
                }
                case 78: {
                    n14 = 180;
                    break;
                }
                case 79: {
                    n14 = 56;
                    break;
                }
                case 80: {
                    n14 = 197;
                    break;
                }
                case 81: {
                    n14 = 109;
                    break;
                }
                case 82: {
                    n14 = 31;
                    break;
                }
                case 83: {
                    n14 = 187;
                    break;
                }
                case 84: {
                    n14 = 236;
                    break;
                }
                case 85: {
                    n14 = 115;
                    break;
                }
                case 86: {
                    n14 = 157;
                    break;
                }
                case 87: {
                    n14 = 110;
                    break;
                }
                case 88: {
                    n14 = 223;
                    break;
                }
                case 89: {
                    n14 = 193;
                    break;
                }
                case 90: {
                    n14 = 138;
                    break;
                }
                case 91: {
                    n14 = 220;
                    break;
                }
                case 92: {
                    n14 = 63;
                    break;
                }
                case 93: {
                    n14 = 186;
                    break;
                }
                case 94: {
                    n14 = 26;
                    break;
                }
                case 95: {
                    n14 = 237;
                    break;
                }
                case 96: {
                    n14 = 209;
                    break;
                }
                case 97: {
                    n14 = 0;
                    break;
                }
                case 98: {
                    n14 = 60;
                    break;
                }
                case 99: {
                    n14 = 84;
                    break;
                }
                case 100: {
                    n14 = 8;
                    break;
                }
                case 101: {
                    n14 = 12;
                    break;
                }
                case 102: {
                    n14 = 233;
                    break;
                }
                case 103: {
                    n14 = 161;
                    break;
                }
                case 104: {
                    n14 = 100;
                    break;
                }
                case 105: {
                    n14 = 106;
                    break;
                }
                case 106: {
                    n14 = 166;
                    break;
                }
                case 107: {
                    n14 = 38;
                    break;
                }
                case 108: {
                    n14 = 137;
                    break;
                }
                case 109: {
                    n14 = 3;
                    break;
                }
                case 110: {
                    n14 = 78;
                    break;
                }
                case 111: {
                    n14 = 73;
                    break;
                }
                case 112: {
                    n14 = 49;
                    break;
                }
                case 113: {
                    n14 = 121;
                    break;
                }
                case 114: {
                    n14 = 34;
                    break;
                }
                case 115: {
                    n14 = 92;
                    break;
                }
                case 116: {
                    n14 = 167;
                    break;
                }
                case 117: {
                    n14 = 76;
                    break;
                }
                case 118: {
                    n14 = 245;
                    break;
                }
                case 119: {
                    n14 = 218;
                    break;
                }
                case 120: {
                    n14 = 206;
                    break;
                }
                case 121: {
                    n14 = 58;
                    break;
                }
                case 122: {
                    n14 = 99;
                    break;
                }
                case 123: {
                    n14 = 7;
                    break;
                }
                case 124: {
                    n14 = 57;
                    break;
                }
                case 125: {
                    n14 = 175;
                    break;
                }
                case 126: {
                    n14 = 16;
                    break;
                }
                case 127: {
                    n14 = 59;
                    break;
                }
                case 128: {
                    n14 = 25;
                    break;
                }
                case 129: {
                    n14 = 170;
                    break;
                }
                case 130: {
                    n14 = 66;
                    break;
                }
                case 131: {
                    n14 = 10;
                    break;
                }
                case 132: {
                    n14 = 105;
                    break;
                }
                case 133: {
                    n14 = 143;
                    break;
                }
                case 134: {
                    n14 = 94;
                    break;
                }
                case 135: {
                    n14 = 204;
                    break;
                }
                case 136: {
                    n14 = 54;
                    break;
                }
                case 137: {
                    n14 = 32;
                    break;
                }
                case 138: {
                    n14 = 62;
                    break;
                }
                case 139: {
                    n14 = 124;
                    break;
                }
                case 140: {
                    n14 = 74;
                    break;
                }
                case 141: {
                    n14 = 90;
                    break;
                }
                case 142: {
                    n14 = 79;
                    break;
                }
                case 143: {
                    n14 = 33;
                    break;
                }
                case 144: {
                    n14 = 42;
                    break;
                }
                case 145: {
                    n14 = 155;
                    break;
                }
                case 146: {
                    n14 = 216;
                    break;
                }
                case 147: {
                    n14 = 53;
                    break;
                }
                case 148: {
                    n14 = 172;
                    break;
                }
                case 149: {
                    n14 = 177;
                    break;
                }
                case 150: {
                    n14 = 146;
                    break;
                }
                case 151: {
                    n14 = 217;
                    break;
                }
                case 152: {
                    n14 = 87;
                    break;
                }
                case 153: {
                    n14 = 159;
                    break;
                }
                case 154: {
                    n14 = 131;
                    break;
                }
                case 155: {
                    n14 = 28;
                    break;
                }
                case 156: {
                    n14 = 45;
                    break;
                }
                case 157: {
                    n14 = 108;
                    break;
                }
                case 158: {
                    n14 = 151;
                    break;
                }
                case 159: {
                    n14 = 134;
                    break;
                }
                case 160: {
                    n14 = 2;
                    break;
                }
                case 161: {
                    n14 = 207;
                    break;
                }
                case 162: {
                    n14 = 29;
                    break;
                }
                case 163: {
                    n14 = 165;
                    break;
                }
                case 164: {
                    n14 = 139;
                    break;
                }
                case 165: {
                    n14 = 181;
                    break;
                }
                case 166: {
                    n14 = 61;
                    break;
                }
                case 167: {
                    n14 = 17;
                    break;
                }
                case 168: {
                    n14 = 113;
                    break;
                }
                case 169: {
                    n14 = 1;
                    break;
                }
                case 170: {
                    n14 = 24;
                    break;
                }
                case 171: {
                    n14 = 6;
                    break;
                }
                case 172: {
                    n14 = 211;
                    break;
                }
                case 173: {
                    n14 = 133;
                    break;
                }
                case 174: {
                    n14 = 148;
                    break;
                }
                case 175: {
                    n14 = 65;
                    break;
                }
                case 176: {
                    n14 = 44;
                    break;
                }
                case 177: {
                    n14 = 201;
                    break;
                }
                case 178: {
                    n14 = 111;
                    break;
                }
                case 179: {
                    n14 = 75;
                    break;
                }
                case 180: {
                    n14 = 241;
                    break;
                }
                case 181: {
                    n14 = 156;
                    break;
                }
                case 182: {
                    n14 = 152;
                    break;
                }
                case 183: {
                    n14 = 18;
                    break;
                }
                case 184: {
                    n14 = 226;
                    break;
                }
                case 185: {
                    n14 = 224;
                    break;
                }
                case 186: {
                    n14 = 5;
                    break;
                }
                case 187: {
                    n14 = 200;
                    break;
                }
                case 188: {
                    n14 = 160;
                    break;
                }
                case 189: {
                    n14 = 222;
                    break;
                }
                case 190: {
                    n14 = 246;
                    break;
                }
                case 191: {
                    n14 = 23;
                    break;
                }
                case 192: {
                    n14 = 123;
                    break;
                }
                case 193: {
                    n14 = 234;
                    break;
                }
                case 194: {
                    n14 = 243;
                    break;
                }
                case 195: {
                    n14 = 190;
                    break;
                }
                case 196: {
                    n14 = 176;
                    break;
                }
                case 197: {
                    n14 = 50;
                    break;
                }
                case 198: {
                    n14 = 70;
                    break;
                }
                case 199: {
                    n14 = 82;
                    break;
                }
                case 200: {
                    n14 = 93;
                    break;
                }
                case 201: {
                    n14 = 208;
                    break;
                }
                case 202: {
                    n14 = 149;
                    break;
                }
                case 203: {
                    n14 = 129;
                    break;
                }
                case 204: {
                    n14 = 102;
                    break;
                }
                case 205: {
                    n14 = 37;
                    break;
                }
                case 206: {
                    n14 = 132;
                    break;
                }
                case 207: {
                    n14 = 4;
                    break;
                }
                case 208: {
                    n14 = 188;
                    break;
                }
                case 209: {
                    n14 = 107;
                    break;
                }
                case 210: {
                    n14 = 248;
                    break;
                }
                case 211: {
                    n14 = 86;
                    break;
                }
                case 212: {
                    n14 = 235;
                    break;
                }
                case 213: {
                    n14 = 147;
                    break;
                }
                case 214: {
                    n14 = 88;
                    break;
                }
                case 215: {
                    n14 = 162;
                    break;
                }
                case 216: {
                    n14 = 39;
                    break;
                }
                case 217: {
                    n14 = 178;
                    break;
                }
                case 218: {
                    n14 = 97;
                    break;
                }
                case 219: {
                    n14 = 205;
                    break;
                }
                case 220: {
                    n14 = 196;
                    break;
                }
                case 221: {
                    n14 = 163;
                    break;
                }
                case 222: {
                    n14 = 247;
                    break;
                }
                case 223: {
                    n14 = 36;
                    break;
                }
                case 224: {
                    n14 = 164;
                    break;
                }
                case 225: {
                    n14 = 81;
                    break;
                }
                case 226: {
                    n14 = 215;
                    break;
                }
                case 227: {
                    n14 = 145;
                    break;
                }
                case 228: {
                    n14 = 51;
                    break;
                }
                case 229: {
                    n14 = 185;
                    break;
                }
                case 230: {
                    n14 = 120;
                    break;
                }
                case 231: {
                    n14 = 130;
                    break;
                }
                case 232: {
                    n14 = 255;
                    break;
                }
                case 233: {
                    n14 = 20;
                    break;
                }
                case 234: {
                    n14 = 9;
                    break;
                }
                case 235: {
                    n14 = 135;
                    break;
                }
                case 236: {
                    n14 = 68;
                    break;
                }
                case 237: {
                    n14 = 46;
                    break;
                }
                case 238: {
                    n14 = 231;
                    break;
                }
                case 239: {
                    n14 = 203;
                    break;
                }
                case 240: {
                    n14 = 55;
                    break;
                }
                case 241: {
                    n14 = 168;
                    break;
                }
                case 242: {
                    n14 = 153;
                    break;
                }
                case 243: {
                    n14 = 183;
                    break;
                }
                case 244: {
                    n14 = 116;
                    break;
                }
                case 245: {
                    n14 = 140;
                    break;
                }
                case 246: {
                    n14 = 47;
                    break;
                }
                case 247: {
                    n14 = 96;
                    break;
                }
                case 248: {
                    n14 = 69;
                    break;
                }
                case 249: {
                    n14 = 35;
                    break;
                }
                case 250: {
                    n14 = 27;
                    break;
                }
                case 251: {
                    n14 = 238;
                    break;
                }
                case 252: {
                    n14 = 85;
                    break;
                }
                case 253: {
                    n14 = 213;
                    break;
                }
                case 254: {
                    n14 = 117;
                    break;
                }
                default: {
                    n14 = 198;
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
            DC.d[n12] = new String(cArray).intern();
        }
        return d[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2B6C;
        if (f[n11] == null) {
            DC.f[n11] = (int)(e[n11] ^ l2);
        }
        return f[n11];
    }
}

