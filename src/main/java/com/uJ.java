/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dm_2;
import com.pc_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class uJ {
    final byte[] l = new byte[4];
    byte[] g;
    int X;
    int Z;
    private static final long[] a;
    private static final Integer[] b;
    private static final long[] c;
    private static final Long[] d;

    public uJ(int n10) {
        this.g = new byte[n10];
        this.X = 0;
        this.Z = 0;
    }

    public uJ(byte[] byArray) {
        this.g = byArray;
        this.X = 0;
        this.Z = 0;
    }

    public uJ() {
        this(uJ.a(13254, 5500483342134397450L));
    }

    public void V(byte by) {
        this.g[this.X++] = by;
    }

    public void e(byte[] byArray) {
        this.P(byArray, 0, byArray.length);
    }

    public void P(byte[] byArray, int n10, int n11) {
        System.arraycopy(byArray, n10, this.g, this.X, n11);
        this.X += n11;
    }

    public void q(byte[] byArray) {
        this.l(byArray, 0, byArray.length);
    }

    public void l(byte[] byArray, int n10, int n11) {
        this.u(n11);
        this.P(byArray, n10, n11);
    }

    public void u(int n10) {
        this.l[0] = (byte)(n10 >>> uJ.a(23657, 1481021654533678497L));
        this.l[1] = (byte)(n10 >>> uJ.a(22671, 625972412490195277L));
        this.l[2] = (byte)(n10 >>> uJ.a(14872, 799791411457606617L));
        this.l[3] = (byte)n10;
        System.arraycopy(this.l, 0, this.g, this.X, 4);
        this.X += 4;
    }

    public void V(long l2) {
        this.l[0] = (byte)(l2 >>> uJ.a(11343, 7823761778029614486L));
        this.l[1] = (byte)(l2 >>> uJ.a(30659, 160162379088432647L));
        this.l[2] = (byte)(l2 >>> uJ.a(14474, 4247655513863930199L));
        this.l[3] = (byte)(l2 >>> uJ.a(28621, 649813016768157198L));
        System.arraycopy(this.l, 0, this.g, this.X, 4);
        this.l[0] = (byte)(l2 >>> uJ.a(20550, 5005610954177259928L));
        this.l[1] = (byte)(l2 >>> uJ.a(22671, 625972412490195277L));
        this.l[2] = (byte)(l2 >>> uJ.a(14872, 799791411457606617L));
        this.l[3] = (byte)l2;
        System.arraycopy(this.l, 0, this.g, this.X + 4, 4);
        this.X += uJ.a(14872, 799791411457606617L);
    }

    void S(int n10) {
        this.X += n10;
    }

    void J(int n10) {
        boolean bl = dm_2.F();
        while (n10 > 0) {
            this.g[this.X++] = 0;
            --n10;
            if (bl) continue;
        }
    }

    public void x(byte[] byArray) {
        block4: {
            int n10;
            block3: {
                boolean bl;
                block2: {
                    n10 = byArray.length;
                    bl = dm_2.F();
                    if (!bl) break block2;
                    if ((byArray[0] & uJ.a(10814, 2579964628172493817L)) == 0) break block3;
                    this.u(++n10);
                    this.V((byte)0);
                }
                if (bl) break block4;
            }
            this.u(n10);
        }
        this.e(byArray);
    }

    public int P() {
        return this.X - this.Z;
    }

    public int R() {
        return this.Z;
    }

    public void Z(int n10) {
        this.Z = n10;
    }

    public long E() {
        long l2 = (long)this.d() & uJ.b(24721, 205470153976506057L);
        l2 = l2 << uJ.a(12611, 3559914527733205126L) | (long)this.d() & uJ.b(25667, 5957028753900298778L);
        return l2;
    }

    public int d() {
        int n10 = this.c();
        n10 = n10 << uJ.a(27875, 1697937455061636411L) & uJ.a(26115, 1605537971229368280L) | this.c() & uJ.a(22142, 3168044852373565346L);
        return n10;
    }

    public long K() {
        long l2 = 0L;
        long l3 = 0L;
        l2 = this.r();
        l2 = l2 << uJ.a(14872, 799791411457606617L) & uJ.b(9151, 4739287720158733794L) | (long)(this.r() & uJ.a(9679, 3020366631504436245L));
        l3 = this.r();
        l3 = l3 << uJ.a(14872, 799791411457606617L) & uJ.b(32533, 8369051866110687567L) | (long)(this.r() & uJ.a(9679, 3020366631504436245L));
        l2 = l2 << uJ.a(22671, 625972412490195277L) & uJ.b(29961, 3825806452494889813L) | l3 & uJ.b(6222, 5154550432671014421L);
        return l2;
    }

    int c() {
        int n10 = this.r();
        n10 = n10 << uJ.a(26730, 5647035932439482789L) & uJ.a(27092, 7800845655292219423L) | this.r() & uJ.a(21352, 3605338777157184166L);
        return n10;
    }

    public int r() {
        return this.g[this.Z++] & uJ.a(9679, 3020366631504436245L);
    }

    public void W(byte[] byArray) {
        this.G(byArray, 0, byArray.length);
    }

    void G(byte[] byArray, int n10, int n11) {
        System.arraycopy(this.g, this.Z, byArray, n10, n11);
        this.Z += n11;
    }

    public int T(int n10) {
        int n11 = this.Z;
        this.Z += n10;
        return n11;
    }

    public byte[] e() {
        int n10;
        int n11;
        block4: {
            block5: {
                int n12;
                block2: {
                    block3: {
                        n11 = this.d();
                        boolean bl = dm_2.F();
                        n12 = n11;
                        if (!bl) break block2;
                        if (n12 < 0) break block3;
                        n10 = n11;
                        if (!bl) break block4;
                        if (n10 <= uJ.a(6176, 3189787690981679584L)) break block5;
                    }
                    n12 = uJ.a(14511, 7557912548441899362L);
                }
                n11 = n12;
            }
            n10 = n11;
        }
        byte[] byArray = new byte[n10];
        this.G(byArray, 0, n11);
        return byArray;
    }

    public byte[] c() {
        int n10 = this.d();
        boolean bl = dm_2.J();
        int n11 = (n10 + uJ.a(9907, 620760934282485612L)) / uJ.a(14872, 799791411457606617L);
        byte[] byArray = new byte[n11];
        this.G(byArray, 0, n11);
        byte[] byArray2 = byArray;
        if (!bl) {
            if ((byArray2[0] & uJ.a(10814, 2579964628172493817L)) != 0) {
                byte[] byArray3 = new byte[byArray.length + 1];
                byArray3[0] = 0;
                System.arraycopy(byArray, 0, byArray3, 1, byArray.length);
                byArray = byArray3;
            }
            byArray2 = byArray;
        }
        return byArray2;
    }

    public byte[] S() {
        int n10;
        int n11;
        block4: {
            block5: {
                int n12;
                block2: {
                    block3: {
                        n11 = this.d();
                        boolean bl = dm_2.J();
                        n12 = n11;
                        if (bl) break block2;
                        if (n12 < 0) break block3;
                        n10 = n11;
                        if (bl) break block4;
                        if (n10 <= uJ.a(26765, 6742151809290670407L)) break block5;
                    }
                    n12 = uJ.a(29245, 6991124047706065915L);
                }
                n11 = n12;
            }
            n10 = n11;
        }
        byte[] byArray = new byte[n10];
        this.G(byArray, 0, n11);
        return byArray;
    }

    byte[] C(int[] nArray, int[] nArray2) {
        int n10 = this.d();
        nArray[0] = this.T(n10);
        nArray2[0] = n10;
        return this.g;
    }

    public void m() {
        this.X = 0;
        this.Z = 0;
    }

    public void f() {
        boolean bl = dm_2.J();
        uJ uJ2 = this;
        if (!bl) {
            if (uJ2.Z == 0) {
                return;
            }
            System.arraycopy(this.g, this.Z, this.g, 0, this.X - this.Z);
            this.X -= this.Z;
            uJ2 = this;
        }
        uJ2.Z = 0;
    }

    void a() {
        this.Z = 0;
    }

    byte A() {
        return this.g[5];
    }

    void X(int n10) {
        block6: {
            int n11;
            int n12;
            int n13;
            boolean bl;
            int n14;
            block5: {
                n14 = this.X + n10 + uJ.a(16078, 7651718402987869959L);
                bl = dm_2.J();
                n13 = this.g.length;
                n12 = n14;
                if (bl) break block5;
                if (n13 >= n12) break block6;
                n13 = this.g.length;
                n12 = 2;
            }
            int n15 = n11 = n13 * n12;
            if (!bl) {
                if (n15 < n14) {
                    n11 = n14;
                }
                n15 = n11;
            }
            byte[] byArray = new byte[n15];
            System.arraycopy(this.g, 0, byArray, 0, this.X);
            this.g = byArray;
        }
    }

    byte[][] U(int n10, String string) throws pc_0 {
        byte[][] byArrayArray = new byte[n10][];
        boolean bl = dm_2.F();
        for (int i2 = 0; i2 < n10; ++i2) {
            uJ uJ2;
            block5: {
                int n11;
                block6: {
                    n11 = this.d();
                    try {
                        try {
                            uJ2 = this;
                            if (!bl) break block5;
                            if (uJ2.P() >= n11) break block6;
                        }
                        catch (pc_0 pc_02) {
                            throw uJ.a(pc_02);
                        }
                        throw new pc_0(string);
                    }
                    catch (pc_0 pc_03) {
                        throw uJ.a(pc_03);
                    }
                }
                byArrayArray[i2] = new byte[n11];
                uJ2 = this;
            }
            uJ2.W(byArrayArray[i2]);
            if (bl) continue;
        }
        return byArrayArray;
    }

    static uJ h(byte[][] byArray) {
        uJ uJ2;
        block3: {
            int n10 = byArray.length * 4;
            boolean bl = dm_2.J();
            for (int i2 = 0; i2 < byArray.length; ++i2) {
                n10 += byArray[i2].length;
                if (!bl) continue;
            }
            uJ uJ3 = new uJ(n10);
            for (int i3 = 0; i3 < byArray.length; ++i3) {
                uJ2 = uJ3;
                if (!bl) {
                    uJ2.q(byArray[i3]);
                    if (!bl) continue;
                }
                break block3;
            }
            uJ2 = uJ3;
        }
        return uJ2;
    }

    private static pc_0 a(pc_0 pc_02) {
        return pc_02;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    block14: {
                        var8 = 7413961304399841567L;
                        var14_1 = new long[24];
                        var11_2 = 0;
                        var12_3 = "\u00a4\u00fa\u00fb\u001ee\u00d2\u0098\u00b2\b\u007f|\u00cb\u0094[\u00a3F5)\u001c,\u00d2fh}$2\u008a\u0012s\u00e1\u0013\u0015\u00cf\u00a2\u000e\u008fpi\u00e6\u0000\u00ba\u00e7K\u0017\u00d9\u00bd\u0098X\rrf\u00aaTW\u00ce\u0098\u00c2\u00f0\u00ff\u00aa\u0090\u001a\u00ac\u00a6\u00fe\f\u00f2\u00e9|u\u00daf\u000f\"-\u00b4c\f\u0082\u00e4\u00f0W\u00e1\u00ef_t\u00c1\u00b9\u0017\u00e6\f\u0088H\u00cc\u0007(\u00ff\u00ef\u000e\u000bu\u00da\u009f1\u009fT\u00c1T2\u0092\u00a8B\u008di\u00f5\u00e6\u0099hJ\u00ce\u008a\u0012\u00dc4\u00b2\u00de\u00c8\u00ff;.\u00da\u00feefVtd\u00ec\u0004\u00b7\u00d0\u00b4\u00a0\u009f\u0002\u00b4S\r\u00d7(H`\u00b3\u00b8\"V\u009d\u0005YB\u00e6B\u0083\u007f8F\u0096\u00c7\u0007+\u0082\u00ffe}U\u00f5";
                        var13_4 = "\u00a4\u00fa\u00fb\u001ee\u00d2\u0098\u00b2\b\u007f|\u00cb\u0094[\u00a3F5)\u001c,\u00d2fh}$2\u008a\u0012s\u00e1\u0013\u0015\u00cf\u00a2\u000e\u008fpi\u00e6\u0000\u00ba\u00e7K\u0017\u00d9\u00bd\u0098X\rrf\u00aaTW\u00ce\u0098\u00c2\u00f0\u00ff\u00aa\u0090\u001a\u00ac\u00a6\u00fe\f\u00f2\u00e9|u\u00daf\u000f\"-\u00b4c\f\u0082\u00e4\u00f0W\u00e1\u00ef_t\u00c1\u00b9\u0017\u00e6\f\u0088H\u00cc\u0007(\u00ff\u00ef\u000e\u000bu\u00da\u009f1\u009fT\u00c1T2\u0092\u00a8B\u008di\u00f5\u00e6\u0099hJ\u00ce\u008a\u0012\u00dc4\u00b2\u00de\u00c8\u00ff;.\u00da\u00feefVtd\u00ec\u0004\u00b7\u00d0\u00b4\u00a0\u009f\u0002\u00b4S\r\u00d7(H`\u00b3\u00b8\"V\u009d\u0005YB\u00e6B\u0083\u007f8F\u0096\u00c7\u0007+\u0082\u00ffe}U\u00f5".length();
                        var10_5 = 0;
                        while (true) {
                            var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes("ISO-8859-1");
                            v0 = var14_1;
                            v1 = var11_2++;
                            v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                            v3 = -1;
                            break block14;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            var12_3 = "\u0011\u00df\u00d9\u00c1\u0015\u0085\\\u00b1O\u00bb\u00ee@\f\u00f9\u001c4";
                            var13_4 = "\u0011\u00df\u00d9\u00c1\u0015\u0085\\\u00b1O\u00bb\u00ee@\f\u00f9\u001c4".length();
                            var10_5 = 0;
                            while (true) {
                                var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes("ISO-8859-1");
                                v0 = var14_1;
                                v1 = var11_2++;
                                v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                                v3 = 0;
                                break block14;
                                break;
                            }
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            break block15;
                            break;
                        }
                    }
                    v4 = v2 ^ var8;
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
                uJ.a = var14_1;
                uJ.b = new Integer[24];
                var0_7 = 2356218982051855414L;
                var6_8 = new long[6];
                var3_9 = 0;
                var4_10 = "\"k\u0002\u00aa\u00e2r\u00a5\u0000r\u0019f\u00b9\u00d8\u00c7\u00a1\u00d3T\u0096 \u00fa\u00ecc\u00bayg:\\\u00e0\u00d2\n]\u00dc";
                var5_11 = "\"k\u0002\u00aa\u00e2r\u00a5\u0000r\u0019f\u00b9\u00d8\u00c7\u00a1\u00d3T\u0096 \u00fa\u00ecc\u00bayg:\\\u00e0\u00d2\n]\u00dc".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v5 = var6_8;
                    v6 = var3_9++;
                    v7 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v8 = -1;
                    break block16;
                    break;
                }
lbl55:
                // 1 sources

                while (true) {
                    v5[v6] = v9;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00eaZ\u00f9\u00e3\u0005\u009eOcaw\u00ad\u00bcvU\u00e6\u00d4";
                    var5_11 = "\u00eaZ\u00f9\u00e3\u0005\u009eOcaw\u00ad\u00bcvU\u00e6\u00d4".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v5 = var6_8;
                        v6 = var3_9++;
                        v7 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v8 = 0;
                        break block16;
                        break;
                    }
                    break;
                }
lbl68:
                // 1 sources

                while (true) {
                    v5[v6] = v9;
                    if (var2_12 < var5_11) ** continue;
                    break block17;
                    break;
                }
            }
            v9 = v7 ^ var0_7;
            switch (v8) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl79:
                // 1 sources

                ** continue;
            }
        }
        uJ.c = var6_8;
        uJ.d = new Long[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x79CF;
        if (b[n11] == null) {
            uJ.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x658) & Short.MAX_VALUE;
        if (d[n11] == null) {
            uJ.d[n11] = c[n11] ^ l2;
        }
        return d[n11];
    }
}

