/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.DF;
import com.GK;
import com.df_0;
import com.dt_1;
import com.nm_2;
import com.ue_0;
import com.xd_0;

/*
 * Renamed from com.Wa
 */
final class wa_0
implements Cloneable {
    private static final dt_1[] r;
    private static final String[] O;
    df_0 Q;
    int R;
    byte[] F;
    int a;
    int W;
    int I;
    int Y = 1;
    byte M;
    byte T;
    int c;
    int Z;
    int B;
    int p;
    byte[] D;
    int x;
    short[] i;
    short[] k;
    int U4;
    int UK;
    int S;
    int w;
    int C;
    int q;
    int E;
    int e;
    int d;
    int f;
    int j;
    int U;
    int Uj;
    int u;
    int P;
    int N;
    int b;
    int l;
    int g;
    short[] L;
    short[] Ue;
    short[] Uf;
    xd_0 UJ = new xd_0();
    xd_0 s = new xd_0();
    xd_0 m = new xd_0();
    short[] v = new short[wa_0.a(11385, 6033874610907855286L)];
    short[] UW = new short[wa_0.a(11385, 6033874610907855286L)];
    int[] X = new int[wa_0.a(19763, 7225873651125737694L)];
    int h;
    int H;
    byte[] z = new byte[wa_0.a(28674, 1165011225590556113L)];
    byte[] G;
    int K;
    int n;
    int y;
    int V;
    int t;
    int A;
    int U9;
    short o;
    int J;
    DF UV = null;
    private static final long[] ab;
    private static final Integer[] bb;
    private static final long[] cb;
    private static final Long[] db;

    wa_0(df_0 df_02) {
        this.Q = df_02;
        this.L = new short[wa_0.a(30706, 2572097326115644012L)];
        this.Ue = new short[wa_0.a(1533, 1726388448479842404L)];
        this.Uf = new short[wa_0.a(28537, 3590607867828796089L)];
    }

    void m() {
        block2: {
            this.x = 2 * this.Z;
            this.k[this.UK - 1] = 0;
            int[] nArray = nm_2.g();
            for (int i2 = 0; i2 < this.UK - 1; ++i2) {
                this.k[i2] = 0;
                if (nArray == null) {
                    if (nArray == null) continue;
                }
                break block2;
            }
            this.P = wa_0.r[this.N].r;
            this.l = wa_0.r[this.N].q;
            this.g = wa_0.r[this.N].y;
            this.u = wa_0.r[this.N].U;
            this.f = 0;
            this.q = 0;
            this.U = 0;
            this.Uj = 2;
            this.E = 2;
            this.d = 0;
            this.U4 = 0;
        }
    }

    void B() {
        this.UJ.V = this.L;
        this.UJ.n = GK.D;
        this.s.V = this.Ue;
        this.s.n = GK.p;
        this.m.V = this.Uf;
        this.m.n = GK.L;
        this.o = 0;
        this.J = 0;
        this.U9 = wa_0.a(674, 4619306808194668361L);
        this.X();
    }

    void X() {
        block8: {
            int n10;
            int[] nArray;
            block7: {
                block6: {
                    nArray = nm_2.g();
                    for (n10 = 0; n10 < wa_0.a(4070, 384312355185793581L); ++n10) {
                        this.L[n10 * 2] = 0;
                        if (nArray == null) {
                            if (nArray == null) continue;
                        }
                        break block6;
                    }
                    n10 = 0;
                }
                while (n10 < wa_0.a(12369, 6660857589810767260L)) {
                    this.Ue[n10 * 2] = 0;
                    ++n10;
                    if (nArray == null) {
                        if (nArray == null) continue;
                    }
                    break block7;
                }
                n10 = 0;
            }
            while (n10 < wa_0.a(27447, 7314451647333793519L)) {
                this.Uf[n10 * 2] = 0;
                ++n10;
                if (nArray == null) {
                    if (nArray == null) continue;
                }
                break block8;
            }
            this.L[wa_0.a((int)22120, (long)7571742034290656139L)] = 1;
            this.t = 0;
            this.V = 0;
            this.A = 0;
            this.n = 0;
        }
    }

    void O(short[] sArray, int n10) {
        block6: {
            int n11 = this.X[n10];
            int[] nArray = nm_2.g();
            int n12 = n10 << 1;
            while (n12 <= this.h) {
                int n13;
                block7: {
                    block8: {
                        if (nArray != null) break block6;
                        n13 = n12;
                        if (nArray != null) break block7;
                        if (n13 >= this.h) break block8;
                        n13 = wa_0.m(sArray, this.X[n12 + 1], this.X[n12], this.z) ? 1 : 0;
                        if (nArray != null) break block7;
                        if (n13 != 0) {
                            ++n12;
                        }
                    }
                    n13 = wa_0.m(sArray, n11, this.X[n12], this.z) ? 1 : 0;
                }
                if (nArray == null) {
                    if (n13 != 0 && nArray == null) break;
                    this.X[n10] = this.X[n12];
                    n10 = n12;
                    n13 = n12 = n12 << 1;
                }
                if (nArray == null) continue;
            }
            this.X[n10] = n11;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean m(short[] sArray, int n10, int n11, byte[] byArray) {
        short s2 = sArray[n10 * 2];
        int[] nArray = nm_2.g();
        short s3 = sArray[n11 * 2];
        short s4 = s2;
        if (nArray != null) return s4 != 0;
        if (s4 < s3) return 1 != 0;
        s4 = s2;
        short s5 = s3;
        if (nArray == null) {
            if (s4 != s5) return 0 != 0;
            s4 = byArray[n10];
            if (nArray != null) return s4 != 0;
            s5 = byArray[n11];
        }
        if (s4 > s5) return 0 != 0;
        return 1 != 0;
    }

    void B(short[] sArray, int n10) {
        int n11;
        int n12 = -1;
        int n13 = sArray[1];
        int[] nArray = nm_2.g();
        int n14 = 0;
        int n15 = wa_0.a(29657, 4152544568793720388L);
        int n16 = 4;
        int n17 = n13;
        if (nArray == null) {
            if (n17 == 0) {
                n15 = wa_0.a(18567, 1433694224735001958L);
                n16 = 3;
            }
            sArray[(n10 + 1) * 2 + 1] = -1;
            n17 = n11 = 0;
        }
        while (n11 <= n10) {
            block12: {
                int n18;
                block21: {
                    block22: {
                        block19: {
                            int n19;
                            block20: {
                                block15: {
                                    block18: {
                                        int n20;
                                        block16: {
                                            block17: {
                                                block13: {
                                                    block14: {
                                                        int n21;
                                                        block10: {
                                                            block11: {
                                                                n19 = n13;
                                                                n13 = sArray[(n11 + 1) * 2 + 1];
                                                                n20 = ++n14;
                                                                n21 = n15;
                                                                if (nArray != null) break block10;
                                                                if (n20 >= n21) break block11;
                                                                n20 = n19;
                                                                n21 = n13;
                                                                if (nArray != null) break block10;
                                                                if (n20 == n21 && nArray == null) break block12;
                                                            }
                                                            n20 = n14;
                                                            if (nArray != null) break block13;
                                                            n21 = n16;
                                                        }
                                                        if (n20 >= n21) break block14;
                                                        int n22 = n19 * 2;
                                                        this.Uf[n22] = (short)(this.Uf[n22] + (short)n14);
                                                        if (nArray == null) break block15;
                                                    }
                                                    n20 = n19;
                                                }
                                                if (nArray != null) break block16;
                                                if (n20 == 0) break block17;
                                                if (n19 != n12) {
                                                    int n23 = n19 * 2;
                                                    this.Uf[n23] = (short)(this.Uf[n23] + 1);
                                                }
                                                int n24 = wa_0.a(32470, 4607017807551359760L);
                                                this.Uf[n24] = (short)(this.Uf[n24] + 1);
                                                if (nArray == null) break block15;
                                            }
                                            n20 = n14;
                                        }
                                        if (n20 > wa_0.a(25474, 5076007018410538614L)) break block18;
                                        int n25 = wa_0.a(27496, 1076911588194156223L);
                                        this.Uf[n25] = (short)(this.Uf[n25] + 1);
                                        if (nArray == null) break block15;
                                    }
                                    int n26 = wa_0.a(13196, 7471053410697062012L);
                                    this.Uf[n26] = (short)(this.Uf[n26] + 1);
                                }
                                n14 = 0;
                                n12 = n19;
                                n18 = n13;
                                if (nArray != null) break block19;
                                if (n18 != 0) break block20;
                                n15 = wa_0.a(18567, 1433694224735001958L);
                                n16 = 3;
                                if (nArray == null) break block12;
                            }
                            n18 = n19;
                        }
                        if (nArray != null) break block21;
                        if (n18 != n13) break block22;
                        n15 = wa_0.a(26002, 7364195423021592659L);
                        n16 = 3;
                        if (nArray == null) break block12;
                    }
                    n15 = wa_0.a(29657, 4152544568793720388L);
                    n18 = 4;
                }
                n16 = n18;
            }
            ++n11;
            if (nArray == null) continue;
        }
    }

    int D() {
        int n10;
        block2: {
            int n11;
            this.B(this.L, this.UJ.J);
            this.B(this.Ue, this.s.J);
            this.m.t(this);
            int[] nArray = nm_2.g();
            for (n11 = wa_0.a(14389, 8170115760957042169L); n11 >= 3; --n11) {
                n10 = this.Uf[xd_0.M[n11] * 2 + 1];
                if (nArray == null) {
                    if (n10 != 0 && nArray == null) break;
                    if (nArray == null) continue;
                }
                break block2;
            }
            this.V += 3 * (n11 + 1) + 5 + 5 + 4;
            n10 = n11;
        }
        return n10;
    }

    void f(int n10, int n11, int n12) {
        block2: {
            this.W(n10 - wa_0.a(16642, 7579497002448737520L), 5);
            int[] nArray = nm_2.g();
            this.W(n11 - 1, 5);
            this.W(n12 - 4, 4);
            int[] nArray2 = nArray;
            for (int i2 = 0; i2 < n12; ++i2) {
                this.W(this.Uf[xd_0.M[i2] * 2 + 1], 3);
                if (nArray2 == null) {
                    if (nArray2 == null) continue;
                }
                break block2;
            }
            this.w(this.L, n10 - 1);
            this.w(this.Ue, n11 - 1);
        }
    }

    void w(short[] sArray, int n10) {
        int n11;
        int n12 = -1;
        int n13 = sArray[1];
        int n14 = 0;
        int n15 = wa_0.a(29657, 4152544568793720388L);
        int[] nArray = nm_2.g();
        int n16 = 4;
        int n17 = n13;
        if (nArray == null) {
            if (n17 == 0) {
                n15 = wa_0.a(19309, 2657578515937255103L);
                n16 = 3;
            }
            n17 = n11 = 0;
        }
        while (n11 <= n10) {
            block13: {
                int n18;
                block22: {
                    block23: {
                        block20: {
                            int n19;
                            block21: {
                                block16: {
                                    block19: {
                                        int n20;
                                        block17: {
                                            block18: {
                                                block14: {
                                                    block15: {
                                                        int n21;
                                                        block11: {
                                                            block12: {
                                                                n19 = n13;
                                                                n13 = sArray[(n11 + 1) * 2 + 1];
                                                                n20 = ++n14;
                                                                n21 = n15;
                                                                if (nArray != null) break block11;
                                                                if (n20 >= n21) break block12;
                                                                n20 = n19;
                                                                n21 = n13;
                                                                if (nArray != null) break block11;
                                                                if (n20 == n21 && nArray == null) break block13;
                                                            }
                                                            n20 = n14;
                                                            if (nArray != null) break block14;
                                                            n21 = n16;
                                                        }
                                                        if (n20 >= n21) break block15;
                                                        do {
                                                            this.i(n19, this.Uf);
                                                        } while (--n14 != 0);
                                                        break block16;
                                                    }
                                                    n20 = n19;
                                                }
                                                if (nArray != null) break block17;
                                                if (n20 == 0) break block18;
                                                if (n19 != n12) {
                                                    this.i(n19, this.Uf);
                                                    --n14;
                                                }
                                                this.i(wa_0.a(11385, 6033874610907855286L), this.Uf);
                                                this.W(n14 - 3, 2);
                                                if (nArray == null) break block16;
                                            }
                                            n20 = n14;
                                        }
                                        if (n20 > wa_0.a(25474, 5076007018410538614L)) break block19;
                                        this.i(wa_0.a(9546, 4294102662092337324L), this.Uf);
                                        this.W(n14 - 3, 3);
                                        if (nArray == null) break block16;
                                    }
                                    this.i(wa_0.a(5547, 1186511094697230403L), this.Uf);
                                    this.W(n14 - wa_0.a(4912, 4650141211243284175L), wa_0.a(29657, 4152544568793720388L));
                                }
                                n14 = 0;
                                n12 = n19;
                                n18 = n13;
                                if (nArray != null) break block20;
                                if (n18 != 0) break block21;
                                n15 = wa_0.a(18567, 1433694224735001958L);
                                n16 = 3;
                                if (nArray == null) break block13;
                            }
                            n18 = n19;
                        }
                        if (nArray != null) break block22;
                        if (n18 != n13) break block23;
                        n15 = wa_0.a(26002, 7364195423021592659L);
                        n16 = 3;
                        if (nArray == null) break block13;
                    }
                    n15 = wa_0.a(29657, 4152544568793720388L);
                    n18 = 4;
                }
                n16 = n18;
            }
            ++n11;
            if (nArray == null) continue;
        }
    }

    final void P(byte[] byArray, int n10, int n11) {
        System.arraycopy(byArray, n10, this.F, this.I, n11);
        this.I += n11;
    }

    final void a(byte by) {
        this.F[this.I++] = by;
    }

    final void C(int n10) {
        this.a((byte)n10);
        this.a((byte)(n10 >>> wa_0.a(674, 4619306808194668361L)));
    }

    final void G(int n10) {
        this.a((byte)(n10 >> wa_0.a(674, 4619306808194668361L)));
        this.a((byte)n10);
    }

    final void i(int n10, short[] sArray) {
        int n11 = n10 * 2;
        this.W(sArray[n11] & wa_0.a(10923, 7527050280887795560L), sArray[n11 + 1] & wa_0.a(14491, 9174950205415632236L));
    }

    void W(int n10, int n11) {
        block4: {
            int n12;
            block2: {
                wa_0 wa_02;
                block3: {
                    n12 = n11;
                    int[] nArray = nm_2.g();
                    wa_02 = this;
                    if (nArray != null) break block2;
                    if (wa_02.J <= wa_0.a(11385, 6033874610907855286L) - n12) break block3;
                    int n13 = n10;
                    this.o = (short)(this.o | (short)(n13 << this.J & wa_0.a(14491, 9174950205415632236L)));
                    this.C(this.o);
                    this.o = (short)(n13 >>> wa_0.a(11385, 6033874610907855286L) - this.J);
                    this.J += n12 - wa_0.a(11385, 6033874610907855286L);
                    if (nArray == null) break block4;
                }
                this.o = (short)(this.o | (short)(n10 << this.J & wa_0.a(14491, 9174950205415632236L)));
                wa_02 = this;
            }
            wa_02.J += n12;
        }
    }

    void E() {
        int[] nArray = nm_2.g();
        this.W(2, 3);
        int[] nArray2 = nArray;
        this.i(wa_0.a(11665, 4083881631959726166L), GK.G);
        this.Z();
        if (nArray2 == null) {
            if (1 + this.U9 + wa_0.a(25474, 5076007018410538614L) - this.J < wa_0.a(32530, 6539745746093271784L)) {
                this.W(2, 3);
                this.i(wa_0.a(11665, 4083881631959726166L), GK.G);
                this.Z();
            }
            this.U9 = wa_0.a(29657, 4152544568793720388L);
        }
    }

    /*
     * Unable to fully structure code
     */
    boolean Y(int var1_1, int var2_2) {
        block29: {
            block28: {
                block26: {
                    block27: {
                        block22: {
                            block25: {
                                block23: {
                                    block24: {
                                        this.F[this.y + this.n * 2] = (byte)(var1_1 >>> wa_0.a(674, 4619306808194668361L));
                                        this.F[this.y + this.n * 2 + 1] = (byte)var1_1;
                                        this.G[this.n] = (byte)var2_2;
                                        ++this.n;
                                        var3_3 = nm_2.g();
                                        if (var3_3 != null) break block23;
                                        if (var1_1 != 0) break block24;
                                        v0 = var2_2 * 2;
                                        this.L[v0] = (short)(this.L[v0] + 1);
                                        if (var3_3 == null) break block25;
                                    }
                                    ++this.A;
                                    --var1_1;
                                    v1 = (xd_0.v[var2_2] + wa_0.a(11665, 4083881631959726166L) + 1) * 2;
                                    this.L[v1] = (short)(this.L[v1] + 1);
                                }
                                v2 = xd_0.f(var1_1) * 2;
                                this.Ue[v2] = (short)(this.Ue[v2] + 1);
                            }
                            v3 = this.n & wa_0.a(19623, 3237656604028787066L);
                            if (var3_3 != null) break block26;
                            if (v3 != 0) break block27;
                            v3 = this.N;
                            v4 = 2;
                            if (var3_3 != null) break block28;
                            if (v3 <= v4) break block27;
                            var4_4 = this.n * wa_0.a(674, 4619306808194668361L);
                            var5_5 = this.f - this.q;
                            for (var6_6 = 0; var6_6 < wa_0.a(2004, 6993718967149859372L); ++var6_6) {
                                var4_4 += this.Ue[var6_6 * 2] * (5 + xd_0.A[var6_6]);
                                if (var3_3 == null) {
                                    if (var3_3 == null) continue;
                                }
                                break block22;
                            }
                            var4_4 >>>= 3;
                        }
                        v3 = this.A;
                        v4 = this.n / 2;
                        if (var3_3 == null) {
                            if (v3 < v4) {
                                v3 = var4_4;
                                v4 = var5_5 / 2;
                                if (var3_3 == null) {
                                    if (v3 < v4) {
                                        return true;
                                    } else {
                                        ** GOTO lbl48
                                    }
                                } else {
                                    ** GOTO lbl47
                                }
                            } else {
                                ** GOTO lbl46
                            }
                        }
                        break block28;
lbl46:
                        // 2 sources

                        break block27;
lbl47:
                        // 2 sources

                        break block28;
                    }
                    v3 = this.n;
                }
                if (var3_3 != null) break block29;
                v4 = this.K - 1;
            }
            v3 = v3 == v4 ? 1 : 0;
        }
        return (boolean)v3;
    }

    void H(short[] sArray, short[] sArray2) {
        block7: {
            wa_0 wa_02;
            block8: {
                int n10;
                int n11 = 0;
                int[] nArray = nm_2.g();
                wa_02 = this;
                if (nArray != null) break block7;
                if (wa_02.n == 0) break block8;
                do {
                    block10: {
                        int n12;
                        int n13;
                        int n14;
                        block9: {
                            n14 = this.F[this.y + n11 * 2] << wa_0.a(674, 4619306808194668361L) & wa_0.a(30469, 2117598553947464410L) | this.F[this.y + n11 * 2 + 1] & wa_0.a(28102, 2568201338079377498L);
                            n13 = this.G[n11] & wa_0.a(28102, 2568201338079377498L);
                            ++n11;
                            if (n14 != 0) break block9;
                            this.i(n13, sArray);
                            if (nArray == null) break block10;
                        }
                        int n15 = xd_0.v[n13];
                        this.i(n15 + wa_0.a(11665, 4083881631959726166L) + 1, sArray);
                        n10 = n12 = xd_0.w[n15];
                        if (nArray == null) {
                            if (n10 != 0) {
                                this.W(n13 -= xd_0.j[n15], n12);
                            }
                            n15 = xd_0.f(--n14);
                            this.i(n15, sArray2);
                            n10 = n12 = xd_0.A[n15];
                        }
                        if (nArray != null) continue;
                        if (n10 != 0) {
                            this.W(n14 -= xd_0.N[n15], n12);
                        }
                    }
                    n10 = n11;
                } while (n10 < this.n);
            }
            this.i(wa_0.a(11665, 4083881631959726166L), sArray);
            wa_02 = this;
        }
        wa_02.U9 = sArray[wa_0.a(23070, 2628685220654927856L)];
    }

    void A() {
        block9: {
            int n10;
            int n11;
            int[] nArray;
            block8: {
                int n12;
                block7: {
                    nArray = nm_2.g();
                    n11 = 0;
                    n10 = 0;
                    for (n12 = 0; n12 < wa_0.a(29657, 4152544568793720388L); ++n12) {
                        n10 += this.L[n12 * 2];
                        if (nArray == null) {
                            if (nArray == null) continue;
                        }
                        break block7;
                    }
                    while (n12 < wa_0.a(23439, 60516941033197130L)) {
                        n11 += this.L[n12 * 2];
                        ++n12;
                        if (nArray == null) {
                            if (nArray == null) continue;
                        }
                        break block8;
                    }
                }
                while (n12 < wa_0.a(11665, 4083881631959726166L)) {
                    n10 += this.L[n12 * 2];
                    ++n12;
                    if (nArray == null) {
                        if (nArray == null) continue;
                    }
                    break block9;
                }
            }
            int n13 = n10;
            if (nArray == null) {
                n13 = n13 > n11 >>> 2 ? 0 : 1;
            }
            this.M = (byte)n13;
        }
    }

    void Z() {
        block4: {
            block5: {
                wa_0 wa_02;
                int n10;
                int n11;
                block2: {
                    int[] nArray;
                    block3: {
                        nArray = nm_2.g();
                        n11 = this.J;
                        n10 = wa_0.a(11385, 6033874610907855286L);
                        if (nArray != null) break block2;
                        if (n11 != n10) break block3;
                        this.C(this.o);
                        this.o = 0;
                        this.J = 0;
                        if (nArray == null) break block4;
                    }
                    wa_02 = this;
                    if (nArray != null) break block5;
                    n11 = wa_02.J;
                    n10 = wa_0.a(674, 4619306808194668361L);
                }
                if (n11 < n10) break block4;
                this.a((byte)this.o);
                this.o = (short)(this.o >>> wa_0.a(674, 4619306808194668361L));
                wa_02 = this;
            }
            wa_02.J -= wa_0.a(674, 4619306808194668361L);
        }
    }

    void F() {
        block7: {
            wa_0 wa_02;
            block6: {
                int n10;
                block4: {
                    int[] nArray;
                    block5: {
                        nArray = nm_2.g();
                        n10 = this.J;
                        if (nArray != null) break block4;
                        if (n10 <= wa_0.a(674, 4619306808194668361L)) break block5;
                        this.C(this.o);
                        if (nArray == null) break block6;
                    }
                    wa_02 = this;
                    if (nArray != null) break block7;
                    n10 = wa_02.J;
                }
                if (n10 > 0) {
                    this.a((byte)this.o);
                }
            }
            this.o = 0;
            wa_02 = this;
        }
        wa_02.J = 0;
    }

    void D(int n10, int n11, boolean bl) {
        boolean bl2 = false;
        int[] nArray = nm_2.g();
        this.F();
        this.U9 = wa_0.a(11616, 1819031572542765199L);
        if (nArray == null) {
            if (bl) {
                this.C((short)n11);
                this.C((short)(~n11));
            }
            this.P(this.D, n10, n11);
        }
    }

    void b(boolean bl) {
        int[] nArray = nm_2.g();
        int n10 = this.q;
        if (nArray == null) {
            n10 = n10 >= 0 ? this.q : -1;
        }
        this.t(n10, this.f - this.q, bl);
        this.q = this.f;
        this.Q.O();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    int P(int var1_1) {
        block26: {
            var3_2 = wa_0.a(14491, 9174950205415632236L);
            var2_3 = nm_2.g();
            v0 = var3_2;
            v1 = this.a - 5;
            if (var2_3 != null) ** GOTO lbl11
            if (v0 > v1) {
                var3_2 = this.a - 5;
            }
            block0: while (true) {
                v0 = this.U;
                v1 = 1;
lbl11:
                // 2 sources

                if (v0 > v1) ** GOTO lbl26
                this.M();
                v2 = this.U;
                do {
                    block29: {
                        block28: {
                            block27: {
                                if (var2_3 == null) {
                                    if (v2 == 0) {
                                        v2 = var1_1;
                                        if (var2_3 == null) {
                                            if (v2 == 0) {
                                                return 0;
                                            } else {
                                                ** GOTO lbl-1000
                                            }
                                        }
                                    } else lbl-1000:
                                    // 3 sources

                                    {
                                        v2 = this.U;
                                    }
                                }
                                if (var2_3 == null) {
                                    if (v2 == 0 && var2_3 == null) break block26;
                                }
                                break block27;
lbl26:
                                // 2 sources

                                this.f += this.U;
                                this.U = 0;
                                v2 = this.q + var3_2;
                            }
                            var4_4 = v2;
                            v3 = this.f;
                            if (var2_3 != null) ** GOTO lbl43
                            if (v3 == 0) ** GOTO lbl-1000
                            v3 = this.f;
                            v4 = var4_4;
                            if (var2_3 == null) {
                                ** if (v3 < v4) goto lbl-1000
                            }
                            break block28;
lbl-1000:
                            // 2 sources

                            {
                                this.U = this.f - var4_4;
                                this.f = var4_4;
                                this.b(false);
                                v3 = this.Q.g;
lbl43:
                                // 2 sources

                                if (var2_3 == null) {
                                    if (v3 == 0) {
                                        return 0;
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                                ** GOTO lbl48
                            }
lbl-1000:
                            // 3 sources

                            {
                                v3 = this.f - this.q;
                            }
lbl48:
                            // 2 sources

                            if (var2_3 != null) break block29;
                            v4 = this.Z - wa_0.a(3252, 258262829457807697L);
                        }
                        if (v3 < v4) continue block0;
                        this.b(false);
                        v3 = this.Q.g;
                    }
                    if (v3 == 0) ** break;
                    continue block0;
                    v5 = 0;
                } while (var2_3 != null);
                break;
            }
            return v5;
        }
        v6 = var1_1;
        if (var2_3 == null) {
            v6 = v6 == 4 != 0;
        }
        this.b(v6);
        v7 = this.Q.g;
        if (var2_3 == null) {
            if (v7 == 0) {
                v8 = var1_1;
                if (var2_3 == null) {
                    v8 = v8 == 4 ? 2 : 0;
                }
                return v8;
            }
            v7 = var1_1;
        }
        if (var2_3 == null) {
            v7 = v7 == 4 ? 3 : 1;
        }
        return v7;
    }

    void l(int n10, int n11, boolean bl) {
        int[] nArray = nm_2.g();
        int n12 = bl;
        if (nArray == null) {
            n12 = n12 != 0 ? 1 : 0;
        }
        this.W(0 + n12, 3);
        this.D(n10, n11, true);
    }

    void t(int n10, int n11, boolean bl) {
        block22: {
            wa_0 wa_02;
            block21: {
                int[] nArray;
                block19: {
                    int n12;
                    block20: {
                        int n13;
                        int n14;
                        block17: {
                            int n15;
                            int n16;
                            block18: {
                                block15: {
                                    block16: {
                                        int n17;
                                        block13: {
                                            block14: {
                                                n12 = 0;
                                                nArray = nm_2.g();
                                                n17 = this.N;
                                                if (nArray != null) break block13;
                                                if (n17 <= 0) break block14;
                                                int n19 = this.M;
                                                n19 = 2;
                                                if (nArray == null) {
                                                    if (n18 == n19) {
                                                        this.A();
                                                    }
                                                    this.UJ.t(this);
                                                    this.s.t(this);
                                                    n12 = this.D();
                                                    int n19 = this.V + 3 + wa_0.a(29657, 4152544568793720388L);
                                                    n19 = 3;
                                                }
                                                n16 = n18 >>> n19;
                                                int n13 = n15 = this.t + 3 + wa_0.a(29657, 4152544568793720388L) >>> 3;
                                                n13 = n16;
                                                if (nArray != null) break block15;
                                                if (n14 > n13) break block16;
                                                n16 = n15;
                                                if (nArray == null) break block16;
                                            }
                                            n17 = n11 + 5;
                                        }
                                        n15 = n17;
                                        n16 = n17;
                                    }
                                    int n13 = n11 + 4;
                                    n13 = n16;
                                }
                                if (nArray != null) break block17;
                                if (n14 > n13) break block18;
                                int n13 = n10;
                                n13 = -1;
                                if (nArray != null) break block17;
                                if (n14 == n13) break block18;
                                this.l(n10, n11, bl);
                                if (nArray == null) break block19;
                            }
                            int n13 = n15;
                            n13 = n16;
                        }
                        if (n14 != n13) break block20;
                        int n20 = bl;
                        if (nArray == null) {
                            n20 = n20 != 0 ? 1 : 0;
                        }
                        this.W(2 + n20, 3);
                        this.H(GK.G, GK.d);
                        if (nArray == null) break block19;
                    }
                    int n21 = bl;
                    if (nArray == null) {
                        n21 = n21 != 0 ? 1 : 0;
                    }
                    this.W(4 + n21, 3);
                    this.f(this.UJ.J + 1, this.s.J + 1, n12 + 1);
                    this.H(this.L, this.Ue);
                }
                wa_02 = this;
                if (nArray != null) break block21;
                wa_02.X();
                if (!bl) break block22;
                wa_02 = this;
            }
            wa_02.F();
        }
    }

    /*
     * Unable to fully structure code
     */
    void M() {
        var1_1 = nm_2.g();
        block0: while (true) {
            block16: {
                if ((var5_5 = this.x - this.U - this.f) != 0) break block16;
                v0 = this.f;
                if (var1_1 != null) ** GOTO lbl15
                if (v0 != 0) break block16;
                v0 = this.U;
                if (var1_1 != null) ** GOTO lbl15
                if (v0 != 0) break block16;
                var5_5 = this.Z;
                if (var1_1 == null) ** GOTO lbl49
            }
            do {
                block22: {
                    block21: {
                        block20: {
                            block19: {
                                block17: {
                                    block18: {
                                        v0 = var5_5;
lbl15:
                                        // 3 sources

                                        v1 = -1;
                                        if (var1_1 != null) break block17;
                                        if (v0 != v1) break block18;
                                        --var5_5;
                                        if (var1_1 == null) break block19;
                                    }
                                    v0 = this.f;
                                    if (var1_1 != null) break block20;
                                    v1 = this.Z + this.Z - wa_0.a(3252, 258262829457807697L);
                                }
                                if (v0 >= v1) {
                                    System.arraycopy(this.D, this.Z, this.D, 0, this.Z);
                                    this.j -= this.Z;
                                    this.f -= this.Z;
                                    this.q -= this.Z;
                                    var4_4 = var2_2 = this.UK;
                                    block2: while (true) {
                                        v2 = (var3_3 = this.k[--var4_4] & wa_0.a(14491, 9174950205415632236L)) >= this.Z ? (short)(var3_3 - this.Z) : 0;
                                        this.k[var4_4] = v2;
                                        v3 = --var2_2;
                                        do {
                                            if (v3 != 0) continue block2;
                                            v3 = var2_2 = this.Z;
                                        } while (var1_1 != null);
                                        break;
                                    }
                                    var4_4 = v3;
                                    block4: while (true) {
                                        v4 = (var3_3 = this.i[--var4_4] & wa_0.a(14491, 9174950205415632236L)) >= this.Z ? (short)(var3_3 - this.Z) : 0;
                                        this.i[var4_4] = v4;
                                        v5 = --var2_2;
                                        do {
                                            if (v5 != 0) continue block4;
                                            v5 = var5_5 + this.Z;
                                        } while (var1_1 != null);
                                        break;
                                    }
                                    var5_5 = v5;
                                }
                            }
                            v0 = this.Q.L;
                        }
                        if (var1_1 == null) {
                            if (v0 == 0) {
                                return;
                            }
                            v0 = this.Q.H(this.D, this.f + this.U, var5_5);
                        }
                        var2_2 = v0;
                        this.U += var2_2;
                        v6 = this.U;
                        v7 = 3;
                        if (var1_1 != null) break block21;
                        if (v6 >= v7) {
                            this.U4 = this.D[this.f] & wa_0.a(28102, 2568201338079377498L);
                            this.U4 = (this.U4 << this.C ^ this.D[this.f + 1] & wa_0.a(28102, 2568201338079377498L)) & this.w;
                        }
                        v6 = this.U;
                        if (var1_1 != null) break block22;
                        v7 = wa_0.a(3252, 258262829457807697L);
                    }
                    if (v6 >= v7) continue;
                    v6 = this.Q.L;
                }
                if (v6 != 0) continue block0;
            } while (var1_1 != null);
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    int k(int var1_1) {
        block26: {
            var3_2 = 0;
            var2_3 = nm_2.g();
            block0: while (true) {
                if (this.U >= wa_0.a(5703, 8615324106034709403L)) ** GOTO lbl19
                this.M();
                v0 = this.U;
                do {
                    block35: {
                        block31: {
                            block32: {
                                block33: {
                                    block34: {
                                        block30: {
                                            block28: {
                                                block29: {
                                                    block27: {
                                                        if (var2_3 == null) {
                                                            if (v0 < wa_0.a(3252, 258262829457807697L)) {
                                                                v0 = var1_1;
                                                                if (var2_3 == null) {
                                                                    if (v0 == 0) {
                                                                        return 0;
                                                                    } else {
                                                                        ** GOTO lbl-1000
                                                                    }
                                                                }
                                                            } else lbl-1000:
                                                            // 3 sources

                                                            {
                                                                v0 = this.U;
                                                            }
                                                        }
                                                        if (var2_3 == null) {
                                                            if (v0 == 0 && var2_3 == null) break block26;
                                                        }
                                                        break block27;
lbl19:
                                                        // 2 sources

                                                        v0 = this.U;
                                                    }
                                                    if (var2_3 == null) {
                                                        if (v0 >= 3) {
                                                            this.U4 = (this.U4 << this.C ^ this.D[this.f + 2] & wa_0.a(30278, 9099380523506787223L)) & this.w;
                                                            var3_2 = this.k[this.U4] & wa_0.a(14491, 9174950205415632236L);
                                                            this.i[this.f & this.p] = this.k[this.U4];
                                                            this.k[this.U4] = (short)this.f;
                                                        }
                                                        v0 = (cfr_temp_0 = (long)var3_2 - 0L) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                    }
                                                    if (var2_3 != null) break block28;
                                                    if (v0 == 0) break block29;
                                                    v0 = this.f - var3_2 & wa_0.a(14491, 9174950205415632236L);
                                                    v1 = this.Z - wa_0.a(3252, 258262829457807697L);
                                                    if (var2_3 != null) break block30;
                                                    if (v0 > v1) break block29;
                                                    v0 = this.b;
                                                    v1 = 2;
                                                    if (var2_3 != null) break block30;
                                                    if (v0 != v1) {
                                                        this.E = this.B(var3_2);
                                                    }
                                                }
                                                v0 = this.E;
                                            }
                                            if (var2_3 != null) break block31;
                                            v1 = 3;
                                        }
                                        if (v0 < v1) break block32;
                                        var4_4 = (int)this.Y(this.f - this.j, this.E - 3);
                                        this.U -= this.E;
                                        v2 = this;
                                        if (var2_3 != null) break block33;
                                        if (v2.E > this.P) break block34;
                                        v2 = this;
                                        if (var2_3 != null) break block33;
                                        if (v2.U < 3) break block34;
                                        --this.E;
                                        block2: while (true) {
                                            ++this.f;
                                            this.U4 = (this.U4 << this.C ^ this.D[this.f + 2] & wa_0.a(28102, 2568201338079377498L)) & this.w;
                                            var3_2 = this.k[this.U4] & wa_0.a(14491, 9174950205415632236L);
                                            this.i[this.f & this.p] = this.k[this.U4];
                                            this.k[this.U4] = (short)this.f;
                                            do {
                                                if (--this.E != 0) continue block2;
                                                ++this.f;
                                            } while (var2_3 != null);
                                            break;
                                        }
                                        if (var2_3 == null) break block35;
                                    }
                                    this.f += this.E;
                                    this.E = 0;
                                    this.U4 = this.D[this.f] & wa_0.a(28102, 2568201338079377498L);
                                    v2 = this;
                                }
                                v2.U4 = (this.U4 << this.C ^ this.D[this.f + 1] & wa_0.a(28102, 2568201338079377498L)) & this.w;
                                if (var2_3 == null) break block35;
                            }
                            v0 = (int)this.Y(0, this.D[this.f] & wa_0.a(28102, 2568201338079377498L));
                        }
                        var4_4 = v0;
                        --this.U;
                        ++this.f;
                    }
                    v3 = var4_4;
                    if (var2_3 == null) {
                        if (v3 == 0) continue block0;
                        this.b(false);
                        v3 = this.Q.g;
                    }
                    if (v3 == 0) ** break;
                    continue block0;
                    v4 = 0;
                } while (var2_3 != null);
                break;
            }
            return v4;
        }
        v5 = var1_1;
        if (var2_3 == null) {
            v5 = v5 == 4 != 0;
        }
        this.b(v5);
        v6 = this.Q.g;
        if (var2_3 == null) {
            if (v6 == 0) {
                v7 = var1_1;
                if (var2_3 == null) {
                    if (v7 == 4) {
                        return 2;
                    }
                    v7 = 0;
                }
                return v7;
            }
            v6 = var1_1;
        }
        if (var2_3 == null) {
            v6 = v6 == 4 ? 3 : 1;
        }
        return v6;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    int f(int var1_1) {
        var3_2 = 0;
        var2_3 = nm_2.g();
        while (true) {
            block54: {
                block49: {
                    block50: {
                        block52: {
                            block53: {
                                block51: {
                                    block46: {
                                        block44: {
                                            block45: {
                                                block47: {
                                                    block48: {
                                                        block43: {
                                                            block41: {
                                                                block42: {
                                                                    block39: {
                                                                        block40: {
                                                                            if (this.U >= wa_0.a(3252, 258262829457807697L)) break block39;
                                                                            this.M();
                                                                            v0 = this.U;
                                                                            if (var2_3 != null) break block40;
                                                                            v1 = wa_0.a(3252, 258262829457807697L);
                                                                            if (var2_3 != null) break block41;
                                                                            if (v0 < v1) {
                                                                                v0 = var1_1;
                                                                                if (var2_3 == null) {
                                                                                    if (v0 == 0) {
                                                                                        return 0;
                                                                                    } else {
                                                                                        ** GOTO lbl-1000
                                                                                    }
                                                                                }
                                                                            } else lbl-1000:
                                                                            // 3 sources

                                                                            {
                                                                                v0 = this.U;
                                                                            }
                                                                        }
                                                                        if (var2_3 == null) {
                                                                            if (v0 == 0 && var2_3 == null) break;
                                                                        }
                                                                        break block42;
                                                                    }
                                                                    v0 = this.U;
                                                                }
                                                                if (var2_3 != null) break block43;
                                                                v1 = 3;
                                                            }
                                                            if (v0 >= v1) {
                                                                this.U4 = (this.U4 << this.C ^ this.D[this.f + 2] & wa_0.a(28102, 2568201338079377498L)) & this.w;
                                                                var3_2 = this.k[this.U4] & wa_0.a(14491, 9174950205415632236L);
                                                                this.i[this.f & this.p] = this.k[this.U4];
                                                                this.k[this.U4] = (short)this.f;
                                                            }
                                                            this.Uj = this.E;
                                                            this.e = this.j;
                                                            this.E = wa_0.a(21730, 2608830680892227845L);
                                                            v0 = var3_2;
                                                        }
                                                        if (var2_3 != null) break block44;
                                                        if (v0 == 0) break block45;
                                                        v0 = this.Uj;
                                                        v2 = this.P;
                                                        if (var2_3 != null) break block46;
                                                        if (v0 >= v2) break block45;
                                                        v0 = this.f - var3_2 & wa_0.a(14491, 9174950205415632236L);
                                                        v2 = this.Z - wa_0.a(3252, 258262829457807697L);
                                                        if (var2_3 != null) break block46;
                                                        if (v0 > v2) break block45;
                                                        v0 = this.b;
                                                        v2 = 2;
                                                        if (var2_3 == null) {
                                                            if (v0 != v2) {
                                                                this.E = this.B(var3_2);
                                                            }
                                                            v0 = this.E;
                                                            v2 = 5;
                                                        }
                                                        if (var2_3 != null) break block46;
                                                        if (v0 > v2) break block45;
                                                        v3 = this;
                                                        if (var2_3 != null) break block47;
                                                        if (v3.b == 1) break block48;
                                                        v0 = this.E;
                                                        v2 = 3;
                                                        if (var2_3 != null) break block46;
                                                        if (v0 != v2) break block45;
                                                        v0 = this.f - this.j;
                                                        v2 = wa_0.a(12905, 8440713305693071250L);
                                                        if (var2_3 != null) break block46;
                                                        if (v0 <= v2) break block45;
                                                    }
                                                    v3 = this;
                                                }
                                                v3.E = wa_0.a(14237, 6663532021443043927L);
                                            }
                                            v0 = this.Uj;
                                        }
                                        if (var2_3 != null) break block49;
                                        v2 = 3;
                                    }
                                    if (v0 < v2) break block50;
                                    v0 = this.E;
                                    if (var2_3 != null) break block49;
                                    if (v0 > this.Uj) break block50;
                                    var5_5 = this.f + this.U - 3;
                                    var4_4 = (int)this.Y(this.f - 1 - this.e, this.Uj - 3);
                                    this.U -= this.Uj - 1;
                                    this.Uj -= 2;
                                    block1: while (true) {
                                        if (++this.f > var5_5) ** GOTO lbl93
                                        this.U4 = (this.U4 << this.C ^ this.D[this.f + 2] & wa_0.a(28102, 2568201338079377498L)) & this.w;
                                        v4 = this.k[this.U4] & wa_0.a(14491, 9174950205415632236L);
                                        do {
                                            var3_2 = v4;
                                            this.i[this.f & this.p] = this.k[this.U4];
                                            this.k[this.U4] = (short)this.f;
lbl93:
                                            // 2 sources

                                            if (--this.Uj != 0) continue block1;
                                            this.d = 0;
                                            this.E = wa_0.a(14237, 6663532021443043927L);
                                            ++this.f;
                                            v4 = var4_4;
                                        } while (var2_3 != null);
                                        break;
                                    }
                                    if (var2_3 != null) break block51;
                                    if (v4 == 0) break block52;
                                    this.b(false);
                                    v5 = this.Q.g;
                                }
                                if (var2_3 != null) break block53;
                                if (v5 != false) break block52;
                                v5 = 0;
                            }
                            return v5;
                        }
                        if (var2_3 == null) continue;
                    }
                    v6 = this;
                    if (var2_3 != null) break block54;
                    v0 = v6.d;
                }
                if (v0 != 0) {
                    v7 = var4_4 = this.Y(0, this.D[this.f - 1] & wa_0.a(28102, 2568201338079377498L));
                    if (var2_3 == null) {
                        if (v7 != 0) {
                            this.b(false);
                        }
                        ++this.f;
                        --this.U;
                        v7 = this.Q.g;
                    }
                    if (var2_3 == null) {
                        if (v7 != 0) continue;
                        v7 = 0;
                    }
                    return v7;
                }
                this.d = 1;
                ++this.f;
                v6 = this;
            }
            --v6.U;
            if (var2_3 != null) break;
        }
        v8 = this;
        if (var2_3 == null) {
            if (v8.d != 0) {
                var4_4 = (int)this.Y(0, this.D[this.f - 1] & wa_0.a(28102, 2568201338079377498L));
                this.d = 0;
            }
            v8 = this;
        }
        v9 = var1_1;
        if (var2_3 == null) {
            v9 = v9 == 4 != 0;
        }
        v8.b(v9);
        v10 = this.Q.g;
        if (var2_3 == null) {
            if (v10 == 0) {
                v11 = var1_1;
                if (var2_3 == null) {
                    if (v11 == 4) {
                        return 2;
                    }
                    v11 = 0;
                }
                return v11;
            }
            v10 = var1_1;
        }
        if (var2_3 == null) {
            v10 = v10 == 4 ? 3 : 1;
        }
        return v10;
    }

    /*
     * Unable to fully structure code
     */
    int B(int var1_1) {
        block26: {
            block27: {
                var3_2 = this.u;
                var4_3 = this.f;
                var2_4 = nm_2.g();
                var7_5 = this.Uj;
                v0 = this.f;
                v1 = this.Z - wa_0.a(3252, 258262829457807697L);
                if (var2_4 != null) ** GOTO lbl11
                if (v0 > v1) {
                    v0 = this.f;
                    v1 = this.Z - wa_0.a(3252, 258262829457807697L);
lbl11:
                    // 2 sources

                    v2 = v0 - v1;
                } else {
                    v2 = 0;
                }
                var8_6 = v2;
                var9_7 = this.g;
                var10_8 = this.p;
                var11_9 = this.f + wa_0.a(19623, 5362284299108211022L);
                var12_10 = this.D[var4_3 + var7_5 - 1];
                var13_11 = this.D[var4_3 + var7_5];
                v3 = this.Uj;
                v4 = this.l;
                if (var2_4 != null) break block27;
                if (v3 >= v4) {
                    var3_2 >>= 2;
                }
                v3 = var9_7;
                if (var2_4 != null) ** GOTO lbl33
                v4 = this.U;
            }
            if (v3 > v4) {
                var9_7 = this.U;
            }
            block0: while (true) {
                v3 = var1_1;
lbl33:
                // 2 sources

                if (this.D[(var5_12 = v3) + var7_5] != var13_11) ** GOTO lbl101
                v5 = this.D[var5_12 + var7_5 - 1];
                v6 = var12_10;
                do {
                    block33: {
                        block28: {
                            block29: {
                                block32: {
                                    if (var2_4 != null) break block28;
                                    if (v5 != v6) break block29;
                                    v5 = this.D[var5_12];
                                    v6 = this.D[var4_3];
                                    if (var2_4 != null) break block28;
                                    if (v5 != v6 || this.D[++var5_12] != this.D[var4_3 + 1] && var2_4 == null) break block29;
                                    var4_3 += 2;
                                    ++var5_12;
                                    block2: while (this.D[++var4_3] == this.D[++var5_12]) {
                                        v7 = this.D[++var4_3];
                                        v8 = this.D[++var5_12];
                                        do {
                                            block30: {
                                                block31: {
                                                    if (var2_4 != null) break block30;
                                                    if (v7 != v8) break block31;
                                                    v7 = this.D[++var4_3];
                                                    v8 = this.D[++var5_12];
                                                    if (var2_4 != null) break block30;
                                                    if (v7 != v8) break block31;
                                                    v7 = this.D[++var4_3];
                                                    v8 = this.D[++var5_12];
                                                    if (var2_4 != null) break block30;
                                                    if (v7 != v8) break block31;
                                                    v7 = this.D[++var4_3];
                                                    v8 = this.D[++var5_12];
                                                    if (var2_4 != null) break block30;
                                                    if (v7 == v8) {
                                                        v7 = this.D[++var4_3];
                                                        v8 = this.D[++var5_12];
                                                        if (var2_4 == null) {
                                                            if (v7 == v8) {
                                                                v7 = this.D[++var4_3];
                                                                v8 = this.D[++var5_12];
                                                                if (var2_4 == null) {
                                                                    if (v7 == v8) {
                                                                        v7 = this.D[++var4_3];
                                                                        v8 = this.D[++var5_12];
                                                                        if (var2_4 == null) {
                                                                            if (v7 == v8 && var4_3 < var11_9) continue block2;
                                                                        } else {
                                                                            ** GOTO lbl80
                                                                        }
                                                                    } else {
                                                                        ** GOTO lbl79
                                                                    }
                                                                } else {
                                                                    ** GOTO lbl78
                                                                }
                                                            } else {
                                                                ** GOTO lbl77
                                                            }
                                                        } else {
                                                            ** GOTO lbl76
                                                        }
                                                    }
                                                    break block31;
lbl76:
                                                    // 2 sources

                                                    break block30;
lbl77:
                                                    // 2 sources

                                                    break block31;
lbl78:
                                                    // 2 sources

                                                    break block30;
lbl79:
                                                    // 2 sources

                                                    break block31;
lbl80:
                                                    // 2 sources

                                                    break block30;
                                                }
                                                v7 = wa_0.a(19623, 5362284299108211022L) - var11_9;
                                                v8 = var4_3;
                                            }
                                            var6_13 = v7 - v8;
                                            var4_3 = var11_9 - wa_0.a(19623, 5362284299108211022L);
                                            v9 = var6_13;
                                            v10 = var7_5;
                                        } while (var2_4 != null);
                                    }
                                    if (var2_4 != null) break block28;
                                    if (v9 <= v10) break block29;
                                    this.j = var1_1;
                                    var7_5 = var6_13;
                                    v11 = var6_13;
                                    if (var2_4 != null) break block32;
                                    if (v11 >= var9_7 && var2_4 == null) break block33;
                                    var12_10 = this.D[var4_3 + var7_5 - 1];
                                    v11 = this.D[var4_3 + var7_5];
                                }
                                var13_11 = v11;
                            }
                            v5 = this.i[var1_1 & var10_8] & wa_0.a(14491, 9174950205415632236L);
                            v6 = var8_6;
                        }
                        if (var2_4 != null) break block0;
                        if (v5 > v6 && --var3_2 != 0) continue block0;
                    }
                    v5 = var7_5;
                    if (var2_4 != null) break block26;
                    v6 = this.U;
                } while (var2_4 != null);
                break;
            }
            if (v5 <= v6) {
                return var7_5;
            }
            v5 = this.U;
        }
        return v5;
    }

    int m(int n10, int n11, int n12) {
        return this.C(n10, wa_0.a(674, 4619306808194668361L), n11, n12, 0);
    }

    int Q(int n10, int n11) {
        return this.C(n10, wa_0.a(674, 4619306808194668361L), n11, wa_0.a(674, 4619306808194668361L), 0);
    }

    int x(int n10) {
        return this.Q(n10, wa_0.a(12147, 2653577501029448333L));
    }

    private int C(int n10, int n11, int n12, int n13, int n14) {
        int n15;
        block12: {
            int n16;
            block13: {
                int n17;
                block10: {
                    block11: {
                        int n18;
                        int[] nArray;
                        block9: {
                            block8: {
                                block6: {
                                    block7: {
                                        n16 = 1;
                                        this.Q.t = null;
                                        nArray = nm_2.g();
                                        n17 = n10;
                                        if (nArray == null) {
                                            if (n17 == -1) {
                                                n10 = wa_0.a(26002, 7364195423021592659L);
                                            }
                                            n17 = n12;
                                        }
                                        if (nArray != null) break block6;
                                        if (n17 >= 0) break block7;
                                        n16 = 0;
                                        n12 = -n12;
                                        if (nArray == null) break block8;
                                    }
                                    n17 = n12;
                                }
                                n18 = wa_0.a(8208, 474818030858646985L);
                                if (nArray != null) break block9;
                                if (n17 > n18) {
                                    n16 = 2;
                                    n12 -= 16;
                                    this.Q.e = new ue_0();
                                }
                            }
                            n17 = n13;
                            if (nArray != null) break block10;
                            n18 = 1;
                        }
                        if (n17 < n18) break block11;
                        n17 = n13;
                        if (nArray != null) break block10;
                        if (n17 > wa_0.a(32530, 6539745746093271784L)) break block11;
                        n17 = n11;
                        if (nArray != null) break block10;
                        if (n17 != wa_0.a(674, 4619306808194668361L)) break block11;
                        n17 = n12;
                        if (nArray != null) break block10;
                        if (n17 < wa_0.a(32530, 6539745746093271784L)) break block11;
                        n17 = n12;
                        if (nArray != null) break block10;
                        if (n17 > wa_0.a(12147, 2653577501029448333L)) break block11;
                        n17 = n10;
                        if (nArray != null) break block10;
                        if (n17 < 0) break block11;
                        n17 = n10;
                        if (nArray != null) break block10;
                        if (n17 > wa_0.a(32530, 6539745746093271784L)) break block11;
                        n17 = n14;
                        if (nArray != null) break block10;
                        if (n17 < 0) break block11;
                        n15 = n14;
                        if (nArray != null) break block12;
                        if (n15 <= 2) break block13;
                    }
                    n17 = wa_0.a(11787, 3843511092555955169L);
                }
                return n17;
            }
            this.Q.d = this;
            this.Y = n16;
            this.B = n12;
            this.Z = 1 << this.B;
            this.p = this.Z - 1;
            this.S = n13 + wa_0.a(29657, 4152544568793720388L);
            this.UK = 1 << this.S;
            this.w = this.UK - 1;
            this.C = (this.S + 3 - 1) / 3;
            this.D = new byte[this.Z * 2];
            this.i = new short[this.Z];
            this.k = new short[this.UK];
            this.K = 1 << n13 + wa_0.a(26002, 7364195423021592659L);
            this.F = new byte[this.K * 3];
            this.a = this.K * 3;
            this.y = this.K;
            this.G = new byte[this.K];
            this.N = n10;
            this.b = n14;
            this.T = (byte)n11;
            n15 = this.Q();
        }
        return n15;
    }

    int Q() {
        this.Q.F = 0L;
        this.Q.O = 0L;
        this.Q.t = null;
        int[] nArray = nm_2.g();
        this.Q.s = wa_0.a(14237, 6663532021443043927L);
        this.I = 0;
        this.W = 0;
        wa_0 wa_02 = this;
        if (nArray == null) {
            if (wa_02.Y < 0) {
                this.Y = -this.Y;
            }
            wa_02 = this;
        }
        int n10 = this.Y;
        if (nArray == null) {
            n10 = n10 == 0 ? wa_0.a(19013, 2193048932984872844L) : wa_0.a(43, 8757325055301948887L);
        }
        wa_02.R = n10;
        this.Q.e.C();
        this.c = 0;
        this.B();
        this.m();
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    int Y() {
        block11: {
            block9: {
                block10: {
                    var1_1 = nm_2.g();
                    v0 = this.R;
                    v1 = wa_0.a(43, 8757325055301948887L);
                    if (var1_1 != null) break block9;
                    if (v0 == v1) break block10;
                    v0 = this.R;
                    v1 = wa_0.a(19013, 2193048932984872844L);
                    if (var1_1 != null) break block9;
                    if (v0 != v1) {
                        v0 = this.R;
                        v1 = wa_0.a(11918, 7323045437863246698L);
                        if (var1_1 == null) {
                            if (v0 != v1) {
                                return wa_0.a(11787, 3843511092555955169L);
                            } else {
                                ** GOTO lbl17
                            }
                        } else {
                            ** GOTO lbl16
                        }
                    }
                    break block10;
lbl16:
                    // 2 sources

                    break block9;
                }
                this.F = null;
                this.G = null;
                this.k = null;
                this.i = null;
                this.D = null;
                v0 = this.R;
                if (var1_1 != null) break block11;
                v1 = wa_0.a(19013, 2193048932984872844L);
            }
            v0 = v0 == v1 ? wa_0.a(4162, 278793441181500800L) : 0;
        }
        return v0;
    }

    int K(int n10, int n11) {
        int n12;
        block20: {
            int n13;
            int n14;
            block17: {
                int[] nArray;
                block19: {
                    block18: {
                        block15: {
                            block16: {
                                int n15;
                                block13: {
                                    block14: {
                                        n14 = 0;
                                        nArray = nm_2.g();
                                        n15 = n10;
                                        if (nArray == null) {
                                            if (n15 == -1) {
                                                n10 = wa_0.a(26002, 7364195423021592659L);
                                            }
                                            n15 = n10;
                                        }
                                        if (nArray != null) break block13;
                                        if (n15 < 0) break block14;
                                        n15 = n10;
                                        if (nArray != null) break block13;
                                        if (n15 > wa_0.a(32530, 6539745746093271784L)) break block14;
                                        n15 = n11;
                                        if (nArray != null) break block13;
                                        if (n15 < 0) break block14;
                                        n12 = n11;
                                        n13 = 2;
                                        if (nArray != null) break block15;
                                        if (n12 <= n13) break block16;
                                    }
                                    n15 = wa_0.a(12525, 4704727660512257335L);
                                }
                                return n15;
                            }
                            n12 = wa_0.r[this.N].A;
                            n13 = wa_0.r[n10].A;
                        }
                        if (nArray != null) break block17;
                        if (n12 == n13) break block18;
                        long l2 = this.Q.O - 0L;
                        n12 = l2 == 0L ? (short)0 : (l2 < 0L ? (short)-1 : 1);
                        if (nArray != null) break block19;
                        if (n12 != 0) {
                            n14 = this.Q.o(1);
                        }
                    }
                    n12 = this.N;
                }
                if (nArray != null) break block20;
                n13 = n10;
            }
            if (n12 != n13) {
                this.N = n10;
                this.P = wa_0.r[this.N].r;
                this.l = wa_0.r[this.N].q;
                this.g = wa_0.r[this.N].y;
                this.u = wa_0.r[this.N].U;
            }
            this.b = n11;
            n12 = n14;
        }
        return n12;
    }

    int x(byte[] byArray, int n10) {
        int n11;
        int[] nArray;
        int n12;
        block13: {
            int n13;
            int n14;
            int n15;
            block12: {
                block10: {
                    block11: {
                        block9: {
                            n12 = n10;
                            n15 = 0;
                            nArray = nm_2.g();
                            if (byArray == null) break block9;
                            n14 = this.R;
                            n13 = wa_0.a(21036, 7447472602658785273L);
                            if (nArray != null) break block10;
                            if (n14 == n13) break block11;
                        }
                        return wa_0.a(11787, 3843511092555955169L);
                    }
                    this.Q.e.A(byArray, 0, n10);
                    n14 = n12;
                    n13 = 3;
                }
                if (nArray != null) break block12;
                if (n14 < n13) {
                    return 0;
                }
                n14 = n12;
                if (nArray != null) break block13;
                n13 = this.Z - wa_0.a(3252, 258262829457807697L);
            }
            if (n14 > n13) {
                n12 = this.Z - wa_0.a(3252, 258262829457807697L);
                n15 = n10 - n12;
            }
            System.arraycopy(byArray, n15, this.D, 0, n12);
            this.f = n12;
            this.q = n12;
            this.U4 = this.D[0] & wa_0.a(28102, 2568201338079377498L);
            this.U4 = (this.U4 << this.C ^ this.D[1] & wa_0.a(28102, 2568201338079377498L)) & this.w;
            n14 = n11 = 0;
        }
        while (n11 <= n12 - 3) {
            this.U4 = (this.U4 << this.C ^ this.D[n11 + 2] & wa_0.a(28102, 2568201338079377498L)) & this.w;
            this.i[n11 & this.p] = this.k[this.U4];
            this.k[this.U4] = (short)n11;
            ++n11;
            if (nArray == null) continue;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    int a(int var1_1) {
        block125: {
            block123: {
                block124: {
                    block122: {
                        block121: {
                            block109: {
                                block107: {
                                    block108: {
                                        block120: {
                                            block118: {
                                                block119: {
                                                    block116: {
                                                        block117: {
                                                            block114: {
                                                                block115: {
                                                                    block112: {
                                                                        block113: {
                                                                            block111: {
                                                                                block110: {
                                                                                    block105: {
                                                                                        block106: {
                                                                                            block104: {
                                                                                                block103: {
                                                                                                    block101: {
                                                                                                        block102: {
                                                                                                            block99: {
                                                                                                                block100: {
                                                                                                                    block93: {
                                                                                                                        block94: {
                                                                                                                            block98: {
                                                                                                                                block97: {
                                                                                                                                    block95: {
                                                                                                                                        block96: {
                                                                                                                                            block91: {
                                                                                                                                                block92: {
                                                                                                                                                    block90: {
                                                                                                                                                        block86: {
                                                                                                                                                            block87: {
                                                                                                                                                                block88: {
                                                                                                                                                                    block89: {
                                                                                                                                                                        block85: {
                                                                                                                                                                            block83: {
                                                                                                                                                                                block84: {
                                                                                                                                                                                    var2_2 = nm_2.g();
                                                                                                                                                                                    v0 = var1_1;
                                                                                                                                                                                    if (var2_2 != null) break block83;
                                                                                                                                                                                    if (v0 > 4) break block84;
                                                                                                                                                                                    v0 = var1_1;
                                                                                                                                                                                    if (var2_2 != null) break block83;
                                                                                                                                                                                    if (v0 >= 0) break block85;
                                                                                                                                                                                }
                                                                                                                                                                                v0 = wa_0.a(11787, 3843511092555955169L);
                                                                                                                                                                            }
                                                                                                                                                                            return v0;
                                                                                                                                                                        }
                                                                                                                                                                        v1 = this.Q;
                                                                                                                                                                        if (var2_2 != null) break block86;
                                                                                                                                                                        if (v1.h == null) break block87;
                                                                                                                                                                        v2 = this;
                                                                                                                                                                        if (var2_2 != null) break block88;
                                                                                                                                                                        if (v2.Q.x != null) break block89;
                                                                                                                                                                        v3 = this.Q.L;
                                                                                                                                                                        if (var2_2 != null) break block90;
                                                                                                                                                                        if (v3 != 0) break block87;
                                                                                                                                                                    }
                                                                                                                                                                    v2 = this;
                                                                                                                                                                }
                                                                                                                                                                v4 = v2.R;
                                                                                                                                                                if (var2_2 != null) break block91;
                                                                                                                                                                if (v4 != wa_0.a(26424, 8057854510856499952L)) break block92;
                                                                                                                                                                v4 = var1_1;
                                                                                                                                                                if (var2_2 != null) break block91;
                                                                                                                                                                if (v4 == 4) break block92;
                                                                                                                                                            }
                                                                                                                                                            v1 = this.Q;
                                                                                                                                                        }
                                                                                                                                                        v1.t = wa_0.O[4];
                                                                                                                                                        v3 = wa_0.a(11787, 3843511092555955169L);
                                                                                                                                                    }
                                                                                                                                                    return v3;
                                                                                                                                                }
                                                                                                                                                v4 = this.Q.g;
                                                                                                                                            }
                                                                                                                                            if (var2_2 == null) {
                                                                                                                                                if (v4 == 0) {
                                                                                                                                                    this.Q.t = wa_0.O[wa_0.a(29657, 4152544568793720388L)];
                                                                                                                                                    return wa_0.a(32411, 967861684975463266L);
                                                                                                                                                }
                                                                                                                                                v4 = this.c;
                                                                                                                                            }
                                                                                                                                            var3_3 = v4;
                                                                                                                                            this.c = var1_1;
                                                                                                                                            v5 = this.R;
                                                                                                                                            if (var2_2 != null) break block93;
                                                                                                                                            if (v5 != wa_0.a(43, 8757325055301948887L)) break block94;
                                                                                                                                            v6 = this.Y;
                                                                                                                                            v7 = 2;
                                                                                                                                            if (var2_2 != null) break block95;
                                                                                                                                            if (v6 != v7) break block96;
                                                                                                                                            this.x().t(this);
                                                                                                                                            this.R = wa_0.a(8345, 3148434959273964887L);
                                                                                                                                            this.Q.e.C();
                                                                                                                                            if (var2_2 == null) break block94;
                                                                                                                                        }
                                                                                                                                        v6 = wa_0.a(674, 4619306808194668361L) + (this.B - wa_0.a(674, 4619306808194668361L) << 4);
                                                                                                                                        v7 = wa_0.a(674, 4619306808194668361L);
                                                                                                                                    }
                                                                                                                                    var4_4 = v6 << v7;
                                                                                                                                    v8 = var5_7 = (this.N - 1 & wa_0.a(28102, 2568201338079377498L)) >> 1;
                                                                                                                                    v9 = 3;
                                                                                                                                    if (var2_2 == null) {
                                                                                                                                        if (v8 > v9) {
                                                                                                                                            var5_7 = 3;
                                                                                                                                        }
                                                                                                                                        v8 = var4_4;
                                                                                                                                        v9 = var5_7 << wa_0.a(26002, 7364195423021592659L);
                                                                                                                                    }
                                                                                                                                    var4_4 = v8 | v9;
                                                                                                                                    v10 = this.f;
                                                                                                                                    if (var2_2 != null) break block97;
                                                                                                                                    if (v10 != 0) {
                                                                                                                                        var4_4 |= wa_0.a(32470, 4607017807551359760L);
                                                                                                                                    }
                                                                                                                                    var4_4 += wa_0.a(26812, 7810448127324159312L) - var4_4 % wa_0.a(25791, 8058402211562418506L);
                                                                                                                                    this.R = wa_0.a(19013, 2193048932984872844L);
                                                                                                                                    this.G(var4_4);
                                                                                                                                    v11 = this;
                                                                                                                                    if (var2_2 != null) break block98;
                                                                                                                                    v10 = v11.f;
                                                                                                                                }
                                                                                                                                if (v10 != 0) {
                                                                                                                                    var6_8 = this.Q.e.u();
                                                                                                                                    this.G((int)(var6_8 >>> wa_0.a(11385, 6033874610907855286L)));
                                                                                                                                    this.G((int)(var6_8 & wa_0.b(8181, 7870284001560456034L)));
                                                                                                                                }
                                                                                                                                v11 = this;
                                                                                                                            }
                                                                                                                            v11.Q.e.C();
                                                                                                                        }
                                                                                                                        v5 = this.I;
                                                                                                                    }
                                                                                                                    if (var2_2 != null) break block99;
                                                                                                                    if (v5 == 0) break block100;
                                                                                                                    this.Q.O();
                                                                                                                    v5 = this.Q.g;
                                                                                                                    if (var2_2 != null) break block101;
                                                                                                                    if (v5 == 0) {
                                                                                                                        this.c = -1;
                                                                                                                        return 0;
                                                                                                                    }
                                                                                                                    break block102;
                                                                                                                }
                                                                                                                v5 = this.Q.L;
                                                                                                            }
                                                                                                            if (var2_2 != null) break block101;
                                                                                                            if (v5 != 0) break block102;
                                                                                                            v5 = var1_1;
                                                                                                            v12 = var3_3;
                                                                                                            if (var2_2 != null) break block103;
                                                                                                            if (v5 <= v12) {
                                                                                                                v5 = var1_1;
                                                                                                                v12 = 4;
                                                                                                                if (var2_2 == null) {
                                                                                                                    if (v5 != v12) {
                                                                                                                        this.Q.t = wa_0.O[wa_0.a(29657, 4152544568793720388L)];
                                                                                                                        return wa_0.a(13820, 5370206813438222351L);
                                                                                                                    } else {
                                                                                                                        ** GOTO lbl119
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    ** GOTO lbl118
                                                                                                                }
                                                                                                            }
                                                                                                            break block102;
lbl118:
                                                                                                            // 2 sources

                                                                                                            break block103;
                                                                                                        }
                                                                                                        v5 = this.R;
                                                                                                    }
                                                                                                    if (var2_2 != null) break block104;
                                                                                                    v12 = wa_0.a(11918, 7323045437863246698L);
                                                                                                }
                                                                                                if (v5 == v12) {
                                                                                                    v5 = this.Q.L;
                                                                                                    if (var2_2 == null) {
                                                                                                        if (v5 != 0) {
                                                                                                            this.Q.t = wa_0.O[wa_0.a(29657, 4152544568793720388L)];
                                                                                                            return wa_0.a(13820, 5370206813438222351L);
                                                                                                        } else {
                                                                                                            ** GOTO lbl-1000
                                                                                                        }
                                                                                                    }
                                                                                                } else lbl-1000:
                                                                                                // 3 sources

                                                                                                {
                                                                                                    v5 = this.Q.L;
                                                                                                }
                                                                                            }
                                                                                            if (var2_2 != null) break block105;
                                                                                            if (v5 != 0) break block106;
                                                                                            v5 = this.U;
                                                                                            if (var2_2 != null) break block105;
                                                                                            if (v5 != 0) break block106;
                                                                                            v13 = var1_1;
                                                                                            if (var2_2 != null) break block107;
                                                                                            if (v13 == 0) break block108;
                                                                                            v13 = this.R;
                                                                                            v14 = wa_0.a(11918, 7323045437863246698L);
                                                                                            if (var2_2 != null) break block109;
                                                                                            if (v13 == v14) break block108;
                                                                                        }
                                                                                        v5 = -1;
                                                                                    }
                                                                                    var4_4 = v5;
                                                                                    v15 = wa_0.r[this.N].A;
                                                                                    if (var2_2 == null) {
                                                                                        switch (v15) {
                                                                                            case 0: {
                                                                                                var4_4 = this.P(var1_1);
                                                                                                if (var2_2 == null) break;
                                                                                            }
                                                                                            case 1: {
                                                                                                var4_4 = this.k(var1_1);
                                                                                                if (var2_2 == null) break;
                                                                                            }
                                                                                            case 2: {
                                                                                                var4_4 = this.f(var1_1);
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        v15 = var4_4;
                                                                                    }
                                                                                    v16 = 2;
                                                                                    if (var2_2 != null) break block110;
                                                                                    if (v15 == v16) break block111;
                                                                                    v15 = var4_4;
                                                                                    if (var2_2 != null) break block112;
                                                                                    v16 = 3;
                                                                                }
                                                                                if (v15 != v16) break block113;
                                                                            }
                                                                            this.R = wa_0.a(11918, 7323045437863246698L);
                                                                        }
                                                                        v15 = var4_4;
                                                                    }
                                                                    if (var2_2 != null) break block114;
                                                                    if (v15 == 0) break block115;
                                                                    v13 = var4_4;
                                                                    v14 = 2;
                                                                    if (var2_2 != null) break block116;
                                                                    if (v13 != v14) break block117;
                                                                }
                                                                v15 = this.Q.g;
                                                            }
                                                            if (var2_2 == null) {
                                                                if (v15 == 0) {
                                                                    this.c = -1;
                                                                }
                                                                v15 = 0;
                                                            }
                                                            return v15;
                                                        }
                                                        v13 = var4_4;
                                                        v14 = 1;
                                                    }
                                                    if (var2_2 != null) break block109;
                                                    if (v13 != v14) break block108;
                                                    v13 = var1_1;
                                                    v17 = 1;
                                                    if (var2_2 != null) break block118;
                                                    if (v13 != v17) break block119;
                                                    this.E();
                                                    if (var2_2 == null) ** GOTO lbl-1000
                                                }
                                                this.l(0, 0, false);
                                                v13 = var1_1;
                                                if (var2_2 != null) break block120;
                                                v17 = 3;
                                            }
                                            ** if (v13 != v17) goto lbl-1000
lbl-1000:
                                            // 2 sources

                                            {
                                                for (var5_7 = 0; var5_7 < this.UK; ++var5_7) {
                                                    this.k[var5_7] = 0;
                                                    if (var2_2 == null) {
                                                        if (var2_2 == null) continue;
                                                    } else {
                                                        ** GOTO lbl213
                                                    }
lbl213:
                                                    // 2 sources

                                                    ** GOTO lbl216
                                                }
                                            }
lbl-1000:
                                            // 4 sources

                                            {
                                                this.Q.O();
                                            }
lbl216:
                                            // 2 sources

                                            v13 = this.Q.g;
                                        }
                                        if (var2_2 == null) {
                                            if (v13 == 0) {
                                                this.c = -1;
                                                return 0;
                                            } else {
                                                ** GOTO lbl223
                                            }
                                        }
                                        break block107;
                                    }
                                    v13 = var1_1;
                                }
                                if (var2_2 != null) break block121;
                                v14 = 4;
                            }
                            if (v13 != v14) {
                                return 0;
                            }
                            v13 = this.Y;
                        }
                        if (var2_2 != null) break block122;
                        if (v13 <= 0) {
                            return 1;
                        }
                        v18 = this;
                        if (var2_2 != null) break block123;
                        v13 = v18.Y;
                    }
                    if (v13 != 2) break block124;
                    var4_5 = this.Q.e.u();
                    this.a((byte)(var4_5 & wa_0.b(945, 5403995328249001767L)));
                    this.a((byte)(var4_5 >> wa_0.a(674, 4619306808194668361L) & wa_0.b(26823, 470063940230257746L)));
                    this.a((byte)(var4_5 >> wa_0.a(11385, 6033874610907855286L) & wa_0.b(26823, 470063940230257746L)));
                    this.a((byte)(var4_5 >> wa_0.a(29683, 77260705144792595L) & wa_0.b(26823, 470063940230257746L)));
                    this.a((byte)(this.Q.O & wa_0.b(26823, 470063940230257746L)));
                    this.a((byte)(this.Q.O >> wa_0.a(674, 4619306808194668361L) & wa_0.b(26823, 470063940230257746L)));
                    this.a((byte)(this.Q.O >> wa_0.a(11385, 6033874610907855286L) & wa_0.b(26823, 470063940230257746L)));
                    this.a((byte)(this.Q.O >> wa_0.a(16520, 8532962705696380254L) & wa_0.b(26823, 470063940230257746L)));
                    this.x().U(var4_5);
                    if (var2_2 == null) break block125;
                }
                v18 = this;
            }
            var4_6 = v18.Q.e.u();
            this.G((int)(var4_6 >>> wa_0.a(11385, 6033874610907855286L)));
            this.G((int)(var4_6 & wa_0.b(16876, 7121400348714218872L)));
        }
        this.Q.O();
        v19 = this.Y;
        if (var2_2 == null) {
            if (v19 > 0) {
                this.Y = -this.Y;
            }
            v19 = this.I;
        }
        if (var2_2 == null) {
            v19 = v19 != 0 ? 0 : 1;
        }
        return v19;
    }

    /*
     * Unable to fully structure code
     */
    static int E(df_0 var0, df_0 var1_1) {
        block18: {
            block19: {
                block16: {
                    block17: {
                        var2_2 = nm_2.g();
                        v0 = var1_1;
                        if (var2_2 != null) break block16;
                        try {
                            block20: {
                                if (v0.d != null) break block17;
                                break block20;
                                catch (CloneNotSupportedException v1) {
                                    throw wa_0.a(v1);
                                }
                            }
                            return wa_0.a(11787, 3843511092555955169L);
                        }
                        catch (CloneNotSupportedException v2) {
                            throw wa_0.a(v2);
                        }
                    }
                    v0 = var1_1;
                }
                v3 = v0.x;
                if (var2_2 != null) break block18;
                try {
                    block21: {
                        if (v3 == null) break block19;
                        break block21;
                        catch (CloneNotSupportedException v4) {
                            throw wa_0.a(v4);
                        }
                    }
                    var0.x = new byte[var1_1.x.length];
                    System.arraycopy(var1_1.x, 0, var0.x, 0, var1_1.x.length);
                }
                catch (CloneNotSupportedException v5) {
                    throw wa_0.a(v5);
                }
            }
            try {
                var0.f = var1_1.f;
                var0.L = var1_1.L;
                var0.O = var1_1.O;
                v6 = var1_1;
                if (var2_2 == null) {
                    v3 = v6.h;
                }
                ** GOTO lbl60
            }
            catch (CloneNotSupportedException v7) {
                throw wa_0.a(v7);
            }
        }
        try {
            if (v3 != null) {
                var0.h = new byte[var1_1.h.length];
                System.arraycopy(var1_1.h, 0, var0.h, 0, var1_1.h.length);
            }
        }
        catch (CloneNotSupportedException v8) {
            throw wa_0.a(v8);
        }
        var0.V = var1_1.V;
        var0.g = var1_1.g;
        var0.F = var1_1.F;
        var0.t = var1_1.t;
        var0.s = var1_1.s;
        var0.e = var1_1.e.y();
        try {
            var0.d = (wa_0)var1_1.d.clone();
            v6 = var0;
lbl60:
            // 2 sources

            v6.d.Q = var0;
        }
        catch (CloneNotSupportedException var3_3) {
            // empty catch block
        }
        return 0;
    }

    public Object clone() throws CloneNotSupportedException {
        wa_0 wa_02;
        block4: {
            wa_0 wa_03;
            block5: {
                wa_03 = (wa_0)super.clone();
                wa_03.F = this.y(wa_03.F);
                wa_03.G = this.y(wa_03.G);
                wa_03.D = this.y(wa_03.D);
                int[] nArray = nm_2.g();
                try {
                    try {
                        wa_03.i = this.N(wa_03.i);
                        wa_03.k = this.N(wa_03.k);
                        wa_03.L = this.N(wa_03.L);
                        wa_03.Ue = this.N(wa_03.Ue);
                        wa_03.Uf = this.N(wa_03.Uf);
                        wa_03.v = this.N(wa_03.v);
                        wa_03.UW = this.N(wa_03.UW);
                        wa_03.X = this.I(wa_03.X);
                        wa_03.z = this.y(wa_03.z);
                        wa_03.UJ.V = wa_03.L;
                        wa_03.s.V = wa_03.Ue;
                        wa_03.m.V = wa_03.Uf;
                        wa_02 = wa_03;
                        if (nArray != null) break block4;
                        if (wa_02.UV == null) break block5;
                    }
                    catch (CloneNotSupportedException cloneNotSupportedException) {
                        throw wa_0.a(cloneNotSupportedException);
                    }
                    wa_03.UV = (DF)wa_03.UV.clone();
                }
                catch (CloneNotSupportedException cloneNotSupportedException) {
                    throw wa_0.a(cloneNotSupportedException);
                }
            }
            wa_02 = wa_03;
        }
        return wa_02;
    }

    private byte[] y(byte[] byArray) {
        byte[] byArray2 = new byte[byArray.length];
        System.arraycopy(byArray, 0, byArray2, 0, byArray2.length);
        return byArray2;
    }

    private short[] N(short[] sArray) {
        short[] sArray2 = new short[sArray.length];
        System.arraycopy(sArray, 0, sArray2, 0, sArray2.length);
        return sArray2;
    }

    private int[] I(int[] nArray) {
        int[] nArray2 = new int[nArray.length];
        System.arraycopy(nArray, 0, nArray2, 0, nArray2.length);
        return nArray2;
    }

    synchronized DF x() {
        int[] nArray = nm_2.g();
        DF dF = this.UV;
        if (nArray == null) {
            if (dF == null) {
                this.UV = new DF();
            }
            dF = this.UV;
        }
        return dF;
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
                                var16 = new String[8];
                                var20_1 = 0;
                                var19_2 = "G=oi\"sIQ3i\u000fM9~l\"rR@(rglwIZ\fA)}ngd\u001bF.igp\fP(imc{\u001bF.igp\u0013J2h}dpR@5~fv6VF1tz{\nE5wm\"sIQ3i";
                                var21_3 = "G=oi\"sIQ3i\u000fM9~l\"rR@(rglwIZ\fA)}ngd\u001bF.igp\fP(imc{\u001bF.igp\u0013J2h}dpR@5~fv6VF1tz{\nE5wm\"sIQ3i".length();
                                var18_4 = 10;
                                var17_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 82;
                                    v1 = ++var17_5;
                                    v2 = var19_2.substring(v1, v1 + var18_4);
                                    v3 = -1;
                                    break block33;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var16[var20_1++] = v4.intern();
                                    if ((var17_5 += var18_4) < var21_3) {
                                        var18_4 = var19_2.charAt(var17_5);
                                        ** continue;
                                    }
                                    var19_2 = "3K\n\u000e\u0000\u0018x%Q\u001c\u0014)Q\u001b\u0004\f\u000594V\u001a\u0007\u0004U.%M\u000b\u0002\u000e\u001b";
                                    var21_3 = "3K\n\u000e\u0000\u0018x%Q\u001c\u0014)Q\u001b\u0004\f\u000594V\u001a\u0007\u0004U.%M\u000b\u0002\u000e\u001b".length();
                                    var18_4 = 10;
                                    var17_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 49;
                                        v5 = ++var17_5;
                                        v2 = var19_2.substring(v5, v5 + var18_4);
                                        v3 = 0;
                                        break block33;
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var16[var20_1++] = v4.intern();
                                    if ((var17_5 += var18_4) < var21_3) {
                                        var18_4 = var19_2.charAt(var17_5);
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
                                            v15 = 113;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 14;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 73;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 90;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 80;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 68;
                                            break;
                                        }
                                        default: {
                                            v15 = 105;
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
                        var8_7 = 3991030405232282345L;
                        var14_8 = new long[70];
                        var11_9 = 0;
                        var12_10 = "\u0082\u00ab\u00bfi\u001cr\fl\u0099\u0094OH\u00f2\u00a8Ht\u00b0R#\u00f7GL\u00d73v\u00a9'>\u00e6\u00f1]$4m9#\u00a9\u00e0\u00ff/n\t\u00c4\u0097\u0011\u00be\u00b4\u0015\u00c7\u00e2,\u00a7@\u00b0x\u00c4<\u0002o&\u0081\u0091\u0010 \u00d6\u00a7v\u00a1\u00bcI\r:\u00f5\u0082-\u00c9=\u00fb\u00fcv\u00c9!\u00c0\u00ac+w4t\u00c7&\u00adB\u001d\u0017\u001f\u00af\u008b\f\u00b1\u00014\u001d\u00a9\u0081B\u00c3w\u00aa\u0011\u00ba3R\u00fa\u00bf\u008f\u009a\u0093\r\u00ad\u0005\u00b8k/Pz\u0081\u0014\u00dc\u00b2\u00ca9\u0097\u00fb\u0085\u00efk\u00aa\u0013\u0085\u007fN\rg\u0002\u00a9\u00f4\u008d\u0099u\u00cesOU\u00d0\u00ad\u00a2\u0006U\u007f\u00cf\u00f1\u0013T\u008c\u00b6;\u0095\u0014x68\u00f4,\u00c6:\u0083\u00c8B\u00c4\u00b8\u0012\u0003\u00d1\u00da\u0015\u00ac\u00f3l\u0098*\u00e8\u00bc\u00ce\u00ec\u00fe\u001bB\u008a\u0004#\u00ca\u00eb\u00fdT\u00b2\u00f9\u00b8\u00d23>U\u001d\u00ee\u0014\u00f3\u00bf\u0090;\u008e\u00b5cX!\u00d9{,Z\u00dfBe:\u00bc/!W\u001b\u00ee\u000f0\u001eI.va\u00a1u\u008a~\u00b2i\u00f2\u001c\u00b3\r\u00b0\u0094YiH\u00fcFm\u009cd\u00ac\u00b2u\u00fbXA\u00df\u0014\u00ee\u00c1t\u00bb\\(\u00cc-\u00f9\u00d1\u0098>\u009bspk\u00b2a\u00cb\u00f8\u00fc\u00f4\u00dep\u00e0Q1\u00c3\u00b0FX\u00db]\u000b:d\u00cb\u0018\u00fd{A\u008b\u00c9`r\u00e5\u00a0\b\u00e9,\u00b8\u00f4\u00aa\u00c1;\u00bc\u00bfxq\u00dd^\u0018\u00bc\u0095C/\u00fa6\u00c6\u0015\u0098zQ\u00ad\u0097\u00f6\u00895\u00ae\u00041\u00cb\u00f1(\u0089Y:\u00c0\u00fa\u001dk\u001fu6\u00ec\u00b1\u00ef\u0016\u0010\u00d7\u0005\u0006\u0095\u001d,\u00ed\u000f\u0090\u00b0\u00bf\u001f\u0018\u008a\u00fc\u00dd\u00c90\u0093\u0010\n\u001eq\u00d6\u008a\u00a2b7\u00a6\u0081g\u0098\u00ae\u00cb\u0006\u00f2n;5\u00feH\u00f4\u00d3\u0087\u0018n\u00c3\u00eaK\u00c7X\u0092\u00a5\u008b\u0085Rw\u00f6\u00daJ\u00b8\u00b0\u00ffonu[\u00dd\u00a8\u008c\u00f0\u009c\u00bdzJ\u008e\u00f6&\u0004\u008c\u0098\u00c7\"R\u00be\\\u0094\u0081\u0098\u00daEs\u0019\"\u0083\u0098\u00a5\u008a\u001f\u008b\u00ee\u0005\u00fa\u0005\u00cc\u00ac\u00b5\u00faTG(\u001e\u00132|\u0097\u0005\u009d\u0095\u007f\u00f9\u00a2\u00e7,\u00e2\u0010\u00a7b\u0001{n\u008bb\u00e8!l\u0088\u00a4v\u00cc\u00e0\u00fe\u00e2)o\u00d7J,\u00aad=y\u00b0\u0084@2L7\u009cQ\u00ad\u00e0\u0001\u00dd\u00a1E\u00e9\u00dd\u00bd\u00ed}\u00ac\u00ff";
                        var13_11 = "\u0082\u00ab\u00bfi\u001cr\fl\u0099\u0094OH\u00f2\u00a8Ht\u00b0R#\u00f7GL\u00d73v\u00a9'>\u00e6\u00f1]$4m9#\u00a9\u00e0\u00ff/n\t\u00c4\u0097\u0011\u00be\u00b4\u0015\u00c7\u00e2,\u00a7@\u00b0x\u00c4<\u0002o&\u0081\u0091\u0010 \u00d6\u00a7v\u00a1\u00bcI\r:\u00f5\u0082-\u00c9=\u00fb\u00fcv\u00c9!\u00c0\u00ac+w4t\u00c7&\u00adB\u001d\u0017\u001f\u00af\u008b\f\u00b1\u00014\u001d\u00a9\u0081B\u00c3w\u00aa\u0011\u00ba3R\u00fa\u00bf\u008f\u009a\u0093\r\u00ad\u0005\u00b8k/Pz\u0081\u0014\u00dc\u00b2\u00ca9\u0097\u00fb\u0085\u00efk\u00aa\u0013\u0085\u007fN\rg\u0002\u00a9\u00f4\u008d\u0099u\u00cesOU\u00d0\u00ad\u00a2\u0006U\u007f\u00cf\u00f1\u0013T\u008c\u00b6;\u0095\u0014x68\u00f4,\u00c6:\u0083\u00c8B\u00c4\u00b8\u0012\u0003\u00d1\u00da\u0015\u00ac\u00f3l\u0098*\u00e8\u00bc\u00ce\u00ec\u00fe\u001bB\u008a\u0004#\u00ca\u00eb\u00fdT\u00b2\u00f9\u00b8\u00d23>U\u001d\u00ee\u0014\u00f3\u00bf\u0090;\u008e\u00b5cX!\u00d9{,Z\u00dfBe:\u00bc/!W\u001b\u00ee\u000f0\u001eI.va\u00a1u\u008a~\u00b2i\u00f2\u001c\u00b3\r\u00b0\u0094YiH\u00fcFm\u009cd\u00ac\u00b2u\u00fbXA\u00df\u0014\u00ee\u00c1t\u00bb\\(\u00cc-\u00f9\u00d1\u0098>\u009bspk\u00b2a\u00cb\u00f8\u00fc\u00f4\u00dep\u00e0Q1\u00c3\u00b0FX\u00db]\u000b:d\u00cb\u0018\u00fd{A\u008b\u00c9`r\u00e5\u00a0\b\u00e9,\u00b8\u00f4\u00aa\u00c1;\u00bc\u00bfxq\u00dd^\u0018\u00bc\u0095C/\u00fa6\u00c6\u0015\u0098zQ\u00ad\u0097\u00f6\u00895\u00ae\u00041\u00cb\u00f1(\u0089Y:\u00c0\u00fa\u001dk\u001fu6\u00ec\u00b1\u00ef\u0016\u0010\u00d7\u0005\u0006\u0095\u001d,\u00ed\u000f\u0090\u00b0\u00bf\u001f\u0018\u008a\u00fc\u00dd\u00c90\u0093\u0010\n\u001eq\u00d6\u008a\u00a2b7\u00a6\u0081g\u0098\u00ae\u00cb\u0006\u00f2n;5\u00feH\u00f4\u00d3\u0087\u0018n\u00c3\u00eaK\u00c7X\u0092\u00a5\u008b\u0085Rw\u00f6\u00daJ\u00b8\u00b0\u00ffonu[\u00dd\u00a8\u008c\u00f0\u009c\u00bdzJ\u008e\u00f6&\u0004\u008c\u0098\u00c7\"R\u00be\\\u0094\u0081\u0098\u00daEs\u0019\"\u0083\u0098\u00a5\u008a\u001f\u008b\u00ee\u0005\u00fa\u0005\u00cc\u00ac\u00b5\u00faTG(\u001e\u00132|\u0097\u0005\u009d\u0095\u007f\u00f9\u00a2\u00e7,\u00e2\u0010\u00a7b\u0001{n\u008bb\u00e8!l\u0088\u00a4v\u00cc\u00e0\u00fe\u00e2)o\u00d7J,\u00aad=y\u00b0\u0084@2L7\u009cQ\u00ad\u00e0\u0001\u00dd\u00a1E\u00e9\u00dd\u00bd\u00ed}\u00ac\u00ff".length();
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
lbl110:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "*\u00c3R\u00c2\u00b0]\u00da\u00f7o\u0006\u00840k\u0010l\u00d7";
                            var13_11 = "*\u00c3R\u00c2\u00b0]\u00da\u00f7o\u0006\u00840k\u0010l\u00d7".length();
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
lbl123:
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
lbl134:
                        // 1 sources

                        ** continue;
                    }
                }
                wa_0.ab = var14_8;
                wa_0.bb = new Integer[70];
                var0_14 = 1120406189603652126L;
                var6_15 = new long[4];
                var3_16 = 0;
                var4_17 = "b\u00b4\u00a6\u00e7\u0095\n\u0016\u0083Er\u00a2`\u00d3_u\u00c6";
                var5_18 = "b\u00b4\u00a6\u00e7\u0095\n\u0016\u0083Er\u00a2`\u00d3_u\u00c6".length();
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
lbl151:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "\t\n{\u00d7\u0084\\\u009e\u00b3mX0\u009c\u00af\rH\u0099";
                    var5_18 = "\t\n{\u00d7\u0084\\\u009e\u00b3mX0\u009c\u00af\rH\u0099".length();
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
lbl164:
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
lbl175:
                // 1 sources

                ** continue;
            }
        }
        wa_0.cb = var6_15;
        wa_0.db = new Long[4];
        wa_0.r = new dt_1[wa_0.a(26066, 9129754040370884643L)];
        wa_0.r[0] = new dt_1(0, 0, 0, 0, 0);
        wa_0.r[1] = new dt_1(4, 4, wa_0.a(674, 4619306808194668361L), 4, 1);
        wa_0.r[2] = new dt_1(4, 5, wa_0.a(13238, 6098184612666091054L), wa_0.a(674, 4619306808194668361L), 1);
        wa_0.r[3] = new dt_1(4, wa_0.a(26617, 6531650983651373629L), wa_0.a(9067, 3995945269766960831L), wa_0.a(32470, 4607017807551359760L), 1);
        wa_0.r[4] = new dt_1(4, 4, wa_0.a(11385, 6033874610907855286L), wa_0.a(11385, 6033874610907855286L), 2);
        wa_0.r[5] = new dt_1(wa_0.a(674, 4619306808194668361L), wa_0.a(11385, 6033874610907855286L), wa_0.a(32470, 4607017807551359760L), wa_0.a(32470, 4607017807551359760L), 2);
        wa_0.r[wa_0.a((int)26002, (long)7364195423021592659L)] = new dt_1(wa_0.a(674, 4619306808194668361L), wa_0.a(11385, 6033874610907855286L), wa_0.a(17392, 8839140776413419021L), wa_0.a(23439, 60516941033197130L), 2);
        wa_0.r[wa_0.a((int)28956, (long)240043315357213930L)] = new dt_1(wa_0.a(674, 4619306808194668361L), wa_0.a(32470, 4607017807551359760L), wa_0.a(23439, 60516941033197130L), wa_0.a(28011, 6017034201505560763L), 2);
        wa_0.r[wa_0.a((int)674, (long)4619306808194668361L)] = new dt_1(wa_0.a(32470, 4607017807551359760L), wa_0.a(23439, 60516941033197130L), wa_0.a(4841, 9190719087147321099L), wa_0.a(1751, 2046487590678729544L), 2);
        wa_0.r[wa_0.a((int)10239, (long)8357003978534760996L)] = new dt_1(wa_0.a(32470, 4607017807551359760L), wa_0.a(19623, 5362284299108211022L), wa_0.a(19623, 5362284299108211022L), wa_0.a(4627, 478319194565642189L), 2);
        v27 = new String[wa_0.a(25474, 5076007018410538614L)];
        v27[0] = var16[1];
        v27[1] = var16[6];
        v27[2] = "";
        v27[3] = var16[5];
        v27[4] = var16[3];
        v27[5] = var16[0];
        v27[wa_0.a((int)26002, (long)7364195423021592659L)] = var16[4];
        v27[wa_0.a((int)29657, (long)4152544568793720388L)] = var16[2];
        v27[wa_0.a((int)674, (long)4619306808194668361L)] = var16[7];
        v27[wa_0.a((int)32530, (long)6539745746093271784L)] = "";
        wa_0.O = v27;
    }

    private static CloneNotSupportedException a(CloneNotSupportedException cloneNotSupportedException) {
        return cloneNotSupportedException;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x15DD;
        if (bb[n11] == null) {
            wa_0.bb[n11] = (int)(ab[n11] ^ l2);
        }
        return bb[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x7497) & Short.MAX_VALUE;
        if (db[n11] == null) {
            wa_0.db[n11] = cb[n11] ^ l2;
        }
        return db[n11];
    }
}

