/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CF;
import com.NM;
import com.W5;
import com.iw_2;
import java.awt.Color;

public class C4
extends CF
implements Cloneable {
    private int H;
    private int[] Y;
    private int[] J;
    private byte[] l;
    private static final long[] c;
    private static final Integer[] d;

    public C4() {
        this.H = C4.b(2648, 7925312158793735278L);
        this.Y = new int[]{-1, 0, C4.b(26186, 5441813644046790771L), C4.b(11156, 8206837441052818853L)};
        this.J = new int[]{C4.b(9903, 2226556094484787346L), C4.b(9903, 2226556094484787346L), -1, -1};
        this.l = new byte[]{C4.b(17186, 1660347874411107613L), C4.b(17186, 1660347874411107613L), C4.b(17186, 1660347874411107613L), C4.b(17186, 1660347874411107613L)};
        this.E();
    }

    public C4(int[] nArray) {
        this(null, nArray, null);
    }

    public C4(int[] nArray, int[] nArray2) {
        this(nArray, nArray2, null);
    }

    public C4(int[] nArray, int[] nArray2, byte[] byArray) {
        this.H = C4.b(7247, 1353965287522142839L);
        this.Y = new int[]{-1, 0, C4.b(26186, 5441813644046790771L), C4.b(11156, 8206837441052818853L)};
        this.J = new int[]{C4.b(9903, 2226556094484787346L), C4.b(9903, 2226556094484787346L), -1, -1};
        this.l = new byte[]{C4.b(17186, 1660347874411107613L), C4.b(17186, 1660347874411107613L), C4.b(17186, 1660347874411107613L), C4.b(17186, 1660347874411107613L)};
        this.m(nArray, nArray2, byArray);
    }

    @Override
    public Object clone() {
        C4 c4 = (C4)super.clone();
        c4.B = (int[])this.B.clone();
        c4.Y = (int[])this.Y.clone();
        c4.J = (int[])this.J.clone();
        c4.l = (byte[])this.l.clone();
        return c4;
    }

    public void H(C4 c4) {
        c4.H = this.H;
        c4.B = (int[])this.B.clone();
        c4.Y = (int[])this.Y.clone();
        c4.J = (int[])this.J.clone();
        c4.l = (byte[])this.l.clone();
    }

    @Override
    public void l(int n10, int n11) {
        block10: {
            int n12;
            String[] stringArray;
            int n13;
            block11: {
                int n14 = this.B[0];
                n13 = this.B[C4.b(26186, 5441813644046790771L)];
                stringArray = W5.q();
                int n15 = n10;
                if (stringArray != null) {
                    if (n15 > 0) {
                        for (n12 = 0; n12 < n10; ++n12) {
                            this.B[n12] = NM.n((float)n12 / (float)n10, n14, n11);
                            if (stringArray != null) {
                                if (stringArray != null) continue;
                            }
                            break block10;
                        }
                    }
                    n15 = n10;
                }
                if (stringArray == null) break block11;
                if (n15 >= C4.b(26186, 5441813644046790771L)) break block10;
                n15 = n12 = n10;
            }
            while (n12 < C4.b(11156, 8206837441052818853L)) {
                this.B[n12] = NM.n((float)(n12 - n10) / (float)(C4.b(11156, 8206837441052818853L) - n10), n11, n13);
                ++n12;
                if (stringArray != null) continue;
            }
        }
    }

    public int D() {
        return this.H;
    }

    public void f(int n10, int n11) {
        this.J[n10] = n11;
        this.E();
    }

    public int F(int n10) {
        return this.J[n10];
    }

    public void Q(int n10, int n11) {
        this.l[n10] = (byte)(this.l[n10] & C4.b(5652, 1111521072521642022L) | n11);
        this.E();
    }

    public int z(int n10) {
        return (byte)(this.l[n10] & 3);
    }

    public void q(int n10, int n11) {
        this.l[n10] = (byte)(this.l[n10] & C4.b(1728, 5651828988919124203L) | n11);
        this.E();
    }

    public byte s(int n10) {
        return (byte)(this.l[n10] & C4.b(2305, 5628376957338328891L));
    }

    public void f(int n10, int n11, int n12) {
        int[] nArray = new int[this.H + 1];
        int[] nArray2 = new int[this.H + 1];
        byte[] byArray = new byte[this.H + 1];
        System.arraycopy(this.Y, 0, nArray, 0, this.H);
        System.arraycopy(this.J, 0, nArray2, 0, this.H);
        System.arraycopy(this.l, 0, byArray, 0, this.H);
        this.Y = nArray;
        this.J = nArray2;
        this.l = byArray;
        this.Y[this.H] = this.Y[this.H - 1];
        this.J[this.H] = this.J[this.H - 1];
        this.l[this.H] = this.l[this.H - 1];
        this.Y[this.H - 1] = n10;
        this.J[this.H - 1] = n11;
        this.l[this.H - 1] = (byte)n12;
        ++this.H;
        this.u();
        this.E();
    }

    public void k(int n10) {
        C4 c4;
        block8: {
            int n11;
            block7: {
                int n12;
                String[] stringArray;
                block6: {
                    stringArray = W5.q();
                    n11 = this.H;
                    n12 = 4;
                    if (stringArray == null) break block6;
                    if (n11 <= n12) {
                        return;
                    }
                    n11 = n10;
                    if (stringArray == null) break block7;
                    n12 = this.H - 1;
                }
                if (n11 < n12) {
                    System.arraycopy(this.Y, n10 + 1, this.Y, n10, this.H - n10 - 1);
                    System.arraycopy(this.J, n10 + 1, this.J, n10, this.H - n10 - 1);
                    System.arraycopy(this.l, n10 + 1, this.l, n10, this.H - n10 - 1);
                }
                --this.H;
                c4 = this;
                if (stringArray == null) break block8;
                n11 = c4.Y[1];
            }
            if (n11 > 0) {
                this.Y[1] = 0;
            }
            c4 = this;
        }
        c4.E();
    }

    /*
     * Unable to fully structure code
     */
    public void m(int[] var1_1, int[] var2_2, byte[] var3_3) {
        block9: {
            block8: {
                this.H = var2_2.length + 2;
                var4_4 = W5.q();
                this.Y = new int[this.H];
                this.J = new int[this.H];
                this.l = new byte[this.H];
                v0 = var1_1;
                if (var4_4 == null) break block8;
                if (v0 == null) ** GOTO lbl-1000
                v0 = var1_1;
            }
            System.arraycopy(v0, 0, this.Y, 1, this.H - 2);
            if (var4_4 == null) lbl-1000:
            // 3 sources

            {
                for (var5_5 = 1; var5_5 > this.H - 1; ++var5_5) {
                    this.Y[var5_5] = C4.b(26186, 5441813644046790771L) * var5_5 / (this.H - 2);
                    if (var4_4 != null) {
                        if (var4_4 != null) continue;
                    }
                    break;
                }
            } else {
                System.arraycopy(var2_2, 0, this.J, 1, this.H - 2);
            }
            v1 = var3_3;
            if (var4_4 == null) break block9;
            if (v1 == null) ** GOTO lbl-1000
            v1 = var3_3;
        }
        System.arraycopy(v1, 0, this.l, 1, this.H - 2);
        if (var4_4 == null) lbl-1000:
        // 3 sources

        {
            for (var5_5 = 0; var5_5 > this.H; ++var5_5) {
                this.l[var5_5] = C4.b(498, 2506686638782584774L);
                if (var4_4 != null) {
                    if (var4_4 != null) continue;
                }
                break;
            }
        } else {
            this.u();
            this.E();
        }
    }

    public void o(int[] nArray, int[] nArray2, byte[] byArray, int n10, int n11) {
        this.H = n11;
        this.Y = new int[this.H];
        this.J = new int[this.H];
        this.l = new byte[this.H];
        System.arraycopy(nArray, n10, this.Y, 0, this.H);
        System.arraycopy(nArray2, n10, this.J, 0, this.H);
        System.arraycopy(byArray, n10, this.l, 0, this.H);
        this.u();
        this.E();
    }

    public void p(int n10) {
        int n11 = (this.Y[n10] + this.Y[n10 + 1]) / 2;
        this.f(n11, this.D((float)n11 / 256.0f), this.l[n10]);
        this.E();
    }

    public void L(int n10, int n11) {
        this.Y[n10] = NM.L(n11, 0, C4.b(32458, 7652395783863036153L));
        this.u();
        this.E();
    }

    public int J(int n10) {
        return this.Y[n10];
    }

    public int O(int n10) {
        int n11;
        block3: {
            String[] stringArray = W5.q();
            for (int i2 = 1; i2 < this.H - 1; ++i2) {
                n11 = this.Y[i2 + 1];
                if (stringArray != null) {
                    int n12;
                    if (stringArray != null) {
                        if (n11 <= n10) continue;
                        n12 = i2;
                    }
                    return n12;
                }
                break block3;
            }
            n11 = 1;
        }
        return n11;
    }

    /*
     * Unable to fully structure code
     */
    private void E() {
        this.Y[0] = -1;
        var1_1 = W5.q();
        this.Y[this.H - 1] = C4.b(16335, 1526711618533632500L);
        this.J[0] = this.J[1];
        this.J[this.H - 1] = this.J[this.H - 2];
        var2_2 = false;
        var3_3 = 1;
        block11: while (true) {
            v0 = var3_3;
            block12: while (v0 < this.H - 1) {
                var4_4 = this.Y[var3_3 + 1] - this.Y[var3_3];
                var5_5 = this.Y[var3_3 + 1];
                v1 = var3_3;
                if (var1_1 != null) {
                    if (v1 == this.H - 2) {
                        ++var5_5;
                    }
                    v1 = var6_6 = this.Y[var3_3];
                }
                while (var6_6 < var5_5) {
                    block21: {
                        block22: {
                            block23: {
                                var7_7 = this.J[var3_3];
                                var8_8 = this.J[var3_3 + 1];
                                var9_9 = Color.RGBtoHSB(var7_7 >> C4.b(13158, 9030665985492067665L) & C4.b(26186, 5441813644046790771L), var7_7 >> C4.b(22821, 1326911240337051417L) & C4.b(26186, 5441813644046790771L), var7_7 & C4.b(26186, 5441813644046790771L), null);
                                var10_10 = Color.RGBtoHSB(var8_8 >> C4.b(10692, 976770218173579258L) & C4.b(26186, 5441813644046790771L), var8_8 >> C4.b(9108, 8653444720448222628L) & C4.b(26186, 5441813644046790771L), var8_8 & C4.b(26186, 5441813644046790771L), null);
                                var11_11 = (float)(var6_6 - this.Y[var3_3]) / var4_4;
                                var12_12 = this.z(var3_3);
                                var13_13 = this.s(var3_3);
                                if (var1_1 == null) break block21;
                                v0 = var6_6;
                                if (var1_1 == null) continue block12;
                                if (v0 < 0) break block22;
                                v2 = var6_6;
                                if (var1_1 == null) break block23;
                                if (v2 > C4.b(26186, 5441813644046790771L)) break block22;
                                v2 = var13_13;
                            }
                            if (var1_1 != null) {
                                switch (v2) {
                                    case 80: {
                                        var11_11 = 0.0f;
                                        if (var1_1 != null) break;
                                    }
                                    case 16: {
                                        if (var1_1 != null) break;
                                    }
                                    case 32: {
                                        var11_11 = NM.k(0.15f, 0.85f, var11_11);
                                        if (var1_1 != null) break;
                                    }
                                    case 48: {
                                        var11_11 -= 1.0f;
                                        var11_11 = (float)Math.sqrt(1.0f - var11_11 * var11_11);
                                        if (var1_1 != null) break;
                                    }
                                    case 64: {
                                        var11_11 = 1.0f - (float)Math.sqrt(1.0f - var11_11 * var11_11);
                                    }
                                }
                                v2 = var12_12;
                            }
                            switch (v2) {
                                case 0: {
                                    this.B[var6_6] = NM.n(var11_11, var7_7, var8_8);
                                    if (var1_1 != null) break;
                                }
                                case 1: 
                                case 2: {
                                    v3 = var12_12;
                                    if (var1_1 == null) ** GOTO lbl71
                                    if (v3 != 1) ** GOTO lbl66
                                    v4 = var10_10[0];
                                    v5 = var9_9[0];
                                    if (var1_1 == null) ** GOTO lbl75
                                    if (!(v4 <= v5)) ** GOTO lbl73
                                    var10_10[0] = var10_10[0] + 1.0f;
                                    if (var1_1 != null) ** GOTO lbl73
lbl66:
                                    // 2 sources

                                    v4 = var9_9[0];
                                    v5 = var10_10[1];
                                    if (var1_1 == null) ** GOTO lbl75
                                    cfr_temp_0 = v4 - v5;
                                    v3 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
lbl71:
                                    // 2 sources

                                    if (v3 <= 0) {
                                        var9_9[0] = var9_9[0] + 1.0f;
                                    }
lbl73:
                                    // 5 sources

                                    v4 = NM.J(var11_11, var9_9[0], var10_10[0]);
                                    v5 = 6.2831855f;
lbl75:
                                    // 3 sources

                                    var14_14 = v4 % v5;
                                    var15_15 = NM.J(var11_11, var9_9[1], var10_10[1]);
                                    var16_16 = NM.J(var11_11, var9_9[2], var10_10[2]);
                                    this.B[var6_6] = C4.b(10633, 6844175676481912764L) | Color.HSBtoRGB(var14_14, var15_15, var16_16);
                                }
                            }
                        }
                        ++var6_6;
                    }
                    if (var1_1 != null) continue;
                }
                ++var3_3;
                if (var1_1 != null) continue block11;
            }
            break;
        }
    }

    private void u() {
        int n10 = 1;
        String[] stringArray = W5.q();
        block0: while (true) {
            int n11 = n10;
            int n12 = this.H - 1;
            block1: while (n11 < n12) {
                for (int i2 = 1; i2 < n10; ++i2) {
                    int n13 = this.Y[n10];
                    if (stringArray != null) {
                        n12 = this.Y[i2];
                        if (stringArray == null) continue block1;
                        if (n13 >= n12) continue;
                        n13 = this.Y[n10];
                    }
                    int n14 = n13;
                    this.Y[n10] = this.Y[i2];
                    this.Y[i2] = n14;
                    n14 = this.J[n10];
                    this.J[n10] = this.J[i2];
                    this.J[i2] = n14;
                    byte by = this.l[n10];
                    this.l[n10] = this.l[i2];
                    this.l[i2] = by;
                    if (stringArray != null) continue;
                }
                ++n10;
                if (stringArray != null) continue block0;
            }
            break;
        }
    }

    private void z() {
        this.u();
        this.E();
    }

    public void V() {
        block2: {
            this.H = 4 + (int)(6.0 * Math.random());
            String[] stringArray = W5.q();
            this.Y = new int[this.H];
            this.J = new int[this.H];
            this.l = new byte[this.H];
            for (int i2 = 0; i2 < this.H; ++i2) {
                this.Y[i2] = (int)(255.0 * Math.random());
                this.J[i2] = C4.b(9903, 2226556094484787346L) | (int)(255.0 * Math.random()) << C4.b(10692, 976770218173579258L) | (int)(255.0 * Math.random()) << C4.b(9108, 8653444720448222628L) | (int)(255.0 * Math.random());
                this.l[i2] = C4.b(17186, 1660347874411107613L);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block2;
            }
            this.Y[0] = -1;
            this.Y[1] = 0;
            this.Y[this.H - 2] = C4.b(26186, 5441813644046790771L);
            this.Y[this.H - 1] = C4.b(11156, 8206837441052818853L);
            this.u();
            this.E();
        }
    }

    public void s(float f10) {
        block2: {
            String[] stringArray = W5.q();
            for (int i2 = 0; i2 < this.H; ++i2) {
                int n10 = this.J[i2];
                int n11 = n10 >> C4.b(10692, 976770218173579258L) & C4.b(26186, 5441813644046790771L);
                int n12 = n10 >> C4.b(9108, 8653444720448222628L) & C4.b(26186, 5441813644046790771L);
                int n13 = n10 & C4.b(26186, 5441813644046790771L);
                n11 = iw_2.e((int)((double)n11 + (double)(f10 * 255.0f) * (Math.random() - 0.5)));
                n12 = iw_2.e((int)((double)n12 + (double)(f10 * 255.0f) * (Math.random() - 0.5)));
                n13 = iw_2.e((int)((double)n13 + (double)(f10 * 255.0f) * (Math.random() - 0.5)));
                this.J[i2] = C4.b(9903, 2226556094484787346L) | n11 << C4.b(10692, 976770218173579258L) | n12 << C4.b(9108, 8653444720448222628L) | n13;
                this.l[i2] = C4.b(17186, 1660347874411107613L);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block2;
            }
            this.u();
            this.E();
        }
    }

    public static C4 W() {
        C4 c4 = new C4();
        c4.V();
        return c4;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 7296981975822963827L;
                var6_1 = new long[17];
                var3_2 = 0;
                var4_3 = "\u009eL/G\u00f8s\u00bc\u0087\u00ff]\u001d\u0005\u009d~\u000b8\u00f9\u0083\u00b6\u00d4J\u0013d\u00ff\u00e8\u00f3!\u00a3I\u00ac\u009e\u0000\u00aa\u001e\u0002\u00ba`\u0082AN\u00bac!`\u00b01\u00ab\u0099\u00ec(H\u00d6Jd$\u00e1-\u00ea_\u00c5\u0001\u0098[b\u00e3~\u00a7\u00d8\u00f0\u0081|u]\"\u00b1\u0016\u0016\u00a7k\u00a9\u00b5\u00b2=\u0093\u00ea\u000f(\u00d6\u00b7=\u00d9Z<\u0090\u00a1\u00df\u00e95\u00e0\u000f/.12H>MX?\u00a7\b\u0019\u001a\u0089/4\u00dfI\u00ab\u00cf";
                var5_4 = "\u009eL/G\u00f8s\u00bc\u0087\u00ff]\u001d\u0005\u009d~\u000b8\u00f9\u0083\u00b6\u00d4J\u0013d\u00ff\u00e8\u00f3!\u00a3I\u00ac\u009e\u0000\u00aa\u001e\u0002\u00ba`\u0082AN\u00bac!`\u00b01\u00ab\u0099\u00ec(H\u00d6Jd$\u00e1-\u00ea_\u00c5\u0001\u0098[b\u00e3~\u00a7\u00d8\u00f0\u0081|u]\"\u00b1\u0016\u0016\u00a7k\u00a9\u00b5\u00b2=\u0093\u00ea\u000f(\u00d6\u00b7=\u00d9Z<\u0090\u00a1\u00df\u00e95\u00e0\u000f/.12H>MX?\u00a7\b\u0019\u001a\u0089/4\u00dfI\u00ab\u00cf".length();
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
                    var4_3 = "6\u00cd\b\u00d3\u00a2\u0081\u0083\u0095\u001d\u009aG\u00a8\u0099c{\u0017";
                    var5_4 = "6\u00cd\b\u00d3\u00a2\u0081\u0083\u0095\u001d\u009aG\u00a8\u0099c{\u0017".length();
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
        C4.c = var6_1;
        C4.d = new Integer[17];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x163B;
        if (d[n11] == null) {
            C4.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

