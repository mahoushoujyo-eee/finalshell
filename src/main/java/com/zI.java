/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;

public class zI {
    protected int[][] d;
    protected int A;
    protected int[] B;
    protected int[] G;
    protected int[] e;
    protected int[] t;
    protected float[] H;
    protected boolean p;
    private static final long[] a;
    private static final Integer[] b;

    public zI() {
        this.d = null;
        this.A = 0;
        this.p = true;
        this.B = null;
        this.G = null;
        this.e = null;
        this.t = null;
        this.H = null;
    }

    /*
     * Unable to fully structure code
     */
    public zI(int[] var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block23: {
            block21: {
                v0 = W5.q();
                super();
                var6_6 = v0;
                this.d = new int[3][zI.a(28816, 629281330306058382L)];
                this.B = new int[4];
                this.G = new int[4];
                this.e = new int[3];
                this.t = new int[3];
                this.H = new float[3];
                this.A = var2_2 * var3_3;
                this.p = true;
                var7_7 = 0;
                var8_8 = 0;
                while (var8_8 < var3_3) {
                    block22: {
                        var7_7 = var4_4 + var8_8 * var5_5;
                        v1 = 0;
                        if (var6_6 == null) break block21;
                        for (var9_9 = v10211995; var9_9 < var2_2; ++var9_9) {
                            var10_10 = var1_1[var7_7++];
                            var11_11 = var10_10 >> zI.a(26929, 5752573862038933804L) & zI.a(4903, 4047677630544014140L);
                            var12_12 = var10_10 >> zI.a(7334, 5197173741303751865L) & zI.a(4903, 4047677630544014140L);
                            var13_13 = var10_10 & zI.a(4903, 4047677630544014140L);
                            v2 = this.d[0];
                            v3 = var11_11;
                            v2[v3] = v2[v3] + 1;
                            v4 = this.d[1];
                            v5 = var12_12;
                            v4[v5] = v4[v5] + 1;
                            v6 = this.d[2];
                            v7 = var13_13;
                            v6[v7] = v6[v7] + 1;
                            if (var6_6 != null) {
                                if (var6_6 != null) continue;
                            }
                            break block22;
                        }
                        ++var8_8;
                    }
                    if (var6_6 != null) continue;
                }
                v1 = var8_8 = 0;
            }
            while (var8_8 < zI.a(26680, 1280804433601630242L)) {
                block28: {
                    block26: {
                        block27: {
                            v8 = this;
                            if (var6_6 == null) break block26;
                            v9 = v8.d[0][var8_8];
                            v10 = this.d[1][var8_8];
                            if (var6_6 == null) ** GOTO lbl62
                            if (v9 != v10) break block27;
                            v8 = this;
                            if (var6_6 == null) break block26;
                            if (v8.d[1][var8_8] == this.d[2][var8_8]) break block28;
                        }
                        v8 = this;
                    }
                    v8.p = false;
                    if (var6_6 != null) break;
                }
                ++var8_8;
                if (var6_6 != null) continue;
            }
            var8_8 = 0;
            block3: do {
                block25: {
                    block24: {
                        v9 = var8_8;
                        v10 = 3;
lbl62:
                        // 2 sources

                        if (v9 >= v10) break;
                        if (var6_6 == null) break block23;
                        for (var9_9 = 0; var9_9 < zI.a(26680, 1280804433601630242L); ++var9_9) {
                            v11 = this.d[var8_8];
                            v12 = var9_9;
                            if (var6_6 != null) {
                                v13 = v11[v12];
                                if (var6_6 == null) break block24;
                                if (v13 <= 0) continue;
                                v11 = this.B;
                                v12 = var8_8;
                            }
                            v11[v12] = var9_9;
                            if (var6_6 != null) break;
                            if (var6_6 != null) continue;
                        }
                        v13 = var9_9 = zI.a(4903, 4047677630544014140L);
                    }
                    while (var9_9 >= 0) {
                        block30: {
                            block29: {
                                v14 = this.d[var8_8];
                                v15 = var9_9;
                                if (var6_6 == null) break block29;
                                v16 = v14[v15];
                                if (var6_6 == null) break block25;
                                if (v16 <= 0) break block30;
                                v14 = this.G;
                                v15 = var8_8;
                            }
                            v14[v15] = var9_9;
                            if (var6_6 != null) break;
                        }
                        --var9_9;
                        if (var6_6 != null) continue;
                    }
                    this.e[var8_8] = zI.a(24744, 2132443970020710580L);
                    this.t[var8_8] = 0;
                    v16 = var9_9 = 0;
                }
                while (var9_9 < zI.a(26680, 1280804433601630242L)) {
                    this.e[var8_8] = Math.min(this.e[var8_8], this.d[var8_8][var9_9]);
                    this.t[var8_8] = Math.max(this.t[var8_8], this.d[var8_8][var9_9]);
                    v17 = var8_8;
                    this.H[v17] = this.H[v17] + (float)(var9_9 * this.d[var8_8][var9_9]);
                    ++var9_9;
                    if (var6_6 == null) continue block3;
                    if (var6_6 != null) continue;
                }
                v18 = var8_8++;
                this.H[v18] = this.H[v18] / (float)this.A;
            } while (var6_6 != null);
            this.B[3] = Math.min(Math.min(this.B[0], this.B[1]), this.B[2]);
            this.G[3] = Math.max(Math.max(this.G[0], this.G[1]), this.G[2]);
        }
    }

    public boolean S() {
        return this.p;
    }

    public int M() {
        return this.A;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int F(int n10) {
        String[] stringArray = W5.q();
        int n11 = this.A;
        if (stringArray == null) return n11;
        if (n11 <= 0) return -1;
        n11 = this.p ? 1 : 0;
        if (stringArray == null) return n11;
        if (n11 == 0) return -1;
        n11 = n10;
        if (stringArray == null) return n11;
        if (n11 < 0) return -1;
        n11 = n10;
        if (stringArray == null) return n11;
        if (n11 > zI.a(2317, 4875918305006252308L)) return -1;
        return this.d[0][n10];
    }

    public int G(int n10, int n11) {
        int n12;
        block4: {
            block5: {
                int n13;
                block2: {
                    block3: {
                        String[] stringArray = W5.q();
                        n13 = this.A;
                        if (stringArray == null) break block2;
                        if (n13 < 1) break block3;
                        n13 = n10;
                        if (stringArray == null) break block2;
                        if (n13 < 0) break block3;
                        n13 = n10;
                        if (stringArray == null) break block2;
                        if (n13 > 2) break block3;
                        n13 = n11;
                        if (stringArray == null) break block2;
                        if (n13 < 0) break block3;
                        n12 = n11;
                        if (stringArray == null) break block4;
                        if (n12 <= zI.a(4903, 4047677630544014140L)) break block5;
                    }
                    n13 = -1;
                }
                return n13;
            }
            n12 = this.d[n10][n11];
        }
        return n12;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int C() {
        String[] stringArray = W5.q();
        int n10 = this.A;
        if (stringArray == null) return n10;
        if (n10 <= 0) return -1;
        n10 = this.p ? 1 : 0;
        if (stringArray == null) return n10;
        if (n10 == 0) return -1;
        return this.e[0];
    }

    public int W(int n10) {
        int n11;
        block4: {
            block5: {
                int n12;
                block2: {
                    block3: {
                        String[] stringArray = W5.q();
                        n12 = this.A;
                        if (stringArray == null) break block2;
                        if (n12 < 1) break block3;
                        n12 = n10;
                        if (stringArray == null) break block2;
                        if (n12 < 0) break block3;
                        n11 = n10;
                        if (stringArray == null) break block4;
                        if (n11 <= 2) break block5;
                    }
                    n12 = -1;
                }
                return n12;
            }
            n11 = this.e[n10];
        }
        return n11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int I() {
        String[] stringArray = W5.q();
        int n10 = this.A;
        if (stringArray == null) return n10;
        if (n10 <= 0) return -1;
        n10 = this.p ? 1 : 0;
        if (stringArray == null) return n10;
        if (n10 == 0) return -1;
        return this.t[0];
    }

    public int I(int n10) {
        int n11;
        block4: {
            block5: {
                int n12;
                block2: {
                    block3: {
                        String[] stringArray = W5.q();
                        n12 = this.A;
                        if (stringArray == null) break block2;
                        if (n12 < 1) break block3;
                        n12 = n10;
                        if (stringArray == null) break block2;
                        if (n12 < 0) break block3;
                        n11 = n10;
                        if (stringArray == null) break block4;
                        if (n11 <= 2) break block5;
                    }
                    n12 = -1;
                }
                return n12;
            }
            n11 = this.t[n10];
        }
        return n11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int O() {
        String[] stringArray = W5.q();
        int n10 = this.A;
        if (stringArray == null) return n10;
        if (n10 <= 0) return -1;
        n10 = this.p ? 1 : 0;
        if (stringArray == null) return n10;
        if (n10 == 0) return -1;
        return this.B[0];
    }

    public int Q(int n10) {
        return this.B[n10];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int J() {
        String[] stringArray = W5.q();
        int n10 = this.A;
        if (stringArray == null) return n10;
        if (n10 <= 0) return -1;
        n10 = this.p ? 1 : 0;
        if (stringArray == null) return n10;
        if (n10 == 0) return -1;
        return this.G[0];
    }

    public int X(int n10) {
        return this.G[n10];
    }

    public float F() {
        block3: {
            zI zI2;
            block4: {
                int n10;
                block2: {
                    String[] stringArray = W5.q();
                    n10 = this.A;
                    if (stringArray == null) break block2;
                    if (n10 <= 0) break block3;
                    zI2 = this;
                    if (stringArray == null) break block4;
                    n10 = zI2.p ? 1 : 0;
                }
                if (n10 == 0) break block3;
                zI2 = this;
            }
            return zI2.H[0];
        }
        return -1.0f;
    }

    public float Y(int n10) {
        block5: {
            int n11;
            int n12;
            block6: {
                String[] stringArray;
                block4: {
                    stringArray = W5.q();
                    n12 = this.A;
                    if (stringArray == null) break block4;
                    if (n12 <= 0) break block5;
                    n12 = 0;
                }
                n11 = n10;
                if (stringArray == null) break block6;
                if (n12 > n11) break block5;
                n12 = n10;
                n11 = 2;
            }
            if (n12 <= n11) {
                return this.H[n10];
            }
        }
        return -1.0f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4310379434906793348L;
                var6_1 = new long[7];
                var3_2 = 0;
                var4_3 = "\u00a1\u00fe\u00d1lf\u00a1Q5\u0015Q\u00cbv\u0014i<\n\u00e4c\u00a2\u0094\u00cf\u00c3\u00a4\u00b8\u00fd]\u0018\u00f6_\u00b9R\u00cf\u00b9\u0018\b\u00a8=\u001a^G";
                var5_4 = "\u00a1\u00fe\u00d1lf\u00a1Q5\u0015Q\u00cbv\u0014i<\n\u00e4c\u00a2\u0094\u00cf\u00c3\u00a4\u00b8\u00fd]\u0018\u00f6_\u00b9R\u00cf\u00b9\u0018\b\u00a8=\u001a^G".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00a7\u00e9\u00bf\u00ba\u0093V\u00a4\u00a6\u00d1\u00fa\u00ed\u00b2c|Do";
                    var5_4 = "\u00a7\u00e9\u00bf\u00ba\u0093V\u00a4\u00a6\u00d1\u00fa\u00ed\u00b2c|Do".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        zI.a = var6_1;
        zI.b = new Integer[7];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x781F;
        if (b[n11] == null) {
            zI.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

