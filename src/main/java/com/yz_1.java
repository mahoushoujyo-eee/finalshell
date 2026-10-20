/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import com.iw_2;
import com.po_0;
import com.wy_1;
import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.yZ
 */
public class yz_1
extends gt_1 {
    public float g = 1.0f;
    private float D = 0.0f;
    private po_0 T = new wy_1();
    private Random r;
    private long u = d;
    private boolean w = false;
    private boolean F = false;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;
    private static final long d;

    public yz_1() {
        this.r = new Random();
    }

    public void V(float f10) {
        this.g = f10;
    }

    public float N() {
        return this.g;
    }

    public void k(float f10) {
        this.D = f10;
    }

    public float h() {
        return this.D;
    }

    public void r(po_0 po_02) {
        this.T = po_02;
    }

    public po_0 v() {
        return this.T;
    }

    public void f(boolean bl) {
        this.w = bl;
    }

    public boolean s() {
        return this.w;
    }

    public void W(boolean bl) {
        this.F = bl;
    }

    public boolean J() {
        return this.F;
    }

    public void W(int n10) {
        this.u = n10;
    }

    public int T() {
        return (int)this.u;
    }

    public void J() {
        this.u = new Date().getTime();
    }

    private int G(int[] nArray, int n10, int n11) {
        String[] stringArray = W5.q();
        int n12 = this.F;
        if (stringArray != null) {
            if (n12 != 0) {
                return nArray[n11 * this.H.width + n10];
            }
            n12 = (int)(255.0f * this.r.nextFloat());
        }
        int n13 = n12;
        int n14 = (int)(255.0f * this.r.nextFloat());
        int n15 = (int)(255.0f * this.r.nextFloat());
        return yz_1.a(16085, 3711343934145825361L) | n13 << yz_1.a(8301, 5170418059275146477L) | n14 << yz_1.a(28456, 1770221322871954351L) | n15;
    }

    private int S(int n10, float f10) {
        int n11 = n10 >> yz_1.a(17929, 3511331616957919880L) & yz_1.a(26130, 1330109334475657872L);
        int n12 = n10 >> yz_1.a(21366, 403324178118895609L) & yz_1.a(9593, 1494584738105725436L);
        int n13 = n10 & yz_1.a(9593, 1494584738105725436L);
        n11 = iw_2.e(n11 + (int)((double)f10 * ((double)this.r.nextFloat() - 0.5)));
        n12 = iw_2.e(n12 + (int)((double)f10 * ((double)this.r.nextFloat() - 0.5)));
        n13 = iw_2.e(n13 + (int)((double)f10 * ((double)this.r.nextFloat() - 0.5)));
        return yz_1.a(27181, 4050020905111805611L) | n11 << yz_1.a(8301, 5170418059275146477L) | n12 << yz_1.a(28456, 1770221322871954351L) | n13;
    }

    private int y(int n10, int n11) {
        return iw_2.P(n10, n11, yz_1.a(15352, 6264230424333750139L));
    }

    private int P(int n10, int n11, int[] nArray, int n12) {
        return nArray[n11 * n12 + n10];
    }

    private void y(int n10, int n11, int n12, int[] nArray, int n13) {
        nArray[n11 * n13 + n10] = n12;
    }

    /*
     * Unable to fully structure code
     */
    private boolean Y(int var1_1, int var2_2, int var3_3, int var4_4, int[] var5_5, int var6_6, int var7_7, int var8_8) {
        block41: {
            block42: {
                block61: {
                    block59: {
                        block60: {
                            block57: {
                                block58: {
                                    block51: {
                                        block52: {
                                            block55: {
                                                block56: {
                                                    block53: {
                                                        block54: {
                                                            block49: {
                                                                block50: {
                                                                    block47: {
                                                                        block48: {
                                                                            block45: {
                                                                                block46: {
                                                                                    block43: {
                                                                                        block44: {
                                                                                            var9_9 = W5.q();
                                                                                            v0 = var7_7;
                                                                                            if (var9_9 == null) break block41;
                                                                                            if (v0 != 0) break block42;
                                                                                            var18_10 = this.P(var1_1, var2_2, var5_5, var6_6);
                                                                                            var19_11 = this.P(var1_1, var4_4, var5_5, var6_6);
                                                                                            var20_12 = this.P(var3_3, var2_2, var5_5, var6_6);
                                                                                            var21_13 = this.P(var3_3, var4_4, var5_5, var6_6);
                                                                                            var22_14 = 256.0f / (2.0f * (float)var8_8) * this.g;
                                                                                            var10_15 = (var1_1 + var3_3) / 2;
                                                                                            var11_17 = (var2_2 + var4_4) / 2;
                                                                                            v1 = var10_15;
                                                                                            v2 = var1_1;
                                                                                            if (var9_9 == null) break block43;
                                                                                            if (v1 != v2) break block44;
                                                                                            v1 = var10_15;
                                                                                            v2 = var3_3;
                                                                                            if (var9_9 == null) break block43;
                                                                                            if (v1 != v2) break block44;
                                                                                            v1 = var11_17;
                                                                                            v2 = var2_2;
                                                                                            if (var9_9 != null) {
                                                                                                if (v1 == v2) {
                                                                                                    v1 = var11_17;
                                                                                                    v2 = var4_4;
                                                                                                    if (var9_9 != null) {
                                                                                                        if (v1 == v2) {
                                                                                                            return true;
                                                                                                        } else {
                                                                                                            ** GOTO lbl32
                                                                                                        }
                                                                                                    } else {
                                                                                                        ** GOTO lbl31
                                                                                                    }
                                                                                                } else {
                                                                                                    ** GOTO lbl30
                                                                                                }
                                                                                            }
                                                                                            break block43;
lbl30:
                                                                                            // 2 sources

                                                                                            break block44;
lbl31:
                                                                                            // 2 sources

                                                                                            break block43;
                                                                                        }
                                                                                        v1 = var10_15;
                                                                                        if (var9_9 == null) break block45;
                                                                                        v2 = var1_1;
                                                                                    }
                                                                                    if (v1 != v2) break block46;
                                                                                    v3 = var10_15;
                                                                                    v4 = var3_3;
                                                                                    if (var9_9 == null) break block47;
                                                                                    if (v3 == v4) break block48;
                                                                                }
                                                                                v1 = this.y(var18_10, var19_11);
                                                                            }
                                                                            var12_19 = v1;
                                                                            var12_19 = this.S(var12_19, var22_14);
                                                                            this.y(var1_1, var11_17, var12_19, var5_5, var6_6);
                                                                            v3 = var1_1;
                                                                            v4 = var3_3;
                                                                            if (var9_9 == null) break block47;
                                                                            if (v3 != v4) {
                                                                                var13_20 = this.y(var20_12, var21_13);
                                                                                var13_20 = this.S(var13_20, var22_14);
                                                                                this.y(var3_3, var11_17, var13_20, var5_5, var6_6);
                                                                            }
                                                                        }
                                                                        v3 = var11_17;
                                                                        v4 = var2_2;
                                                                    }
                                                                    if (var9_9 == null) break block49;
                                                                    if (v3 != v4) break block50;
                                                                    v5 = var11_17;
                                                                    v6 = var4_4;
                                                                    if (var9_9 == null) break block51;
                                                                    if (v5 == v6) break block52;
                                                                }
                                                                v3 = var1_1;
                                                                if (var9_9 == null) break block53;
                                                                v4 = var10_15;
                                                            }
                                                            if (v3 != v4) break block54;
                                                            v5 = var11_17;
                                                            v6 = var4_4;
                                                            if (var9_9 == null) break block55;
                                                            if (v5 == v6) break block56;
                                                        }
                                                        v3 = this.y(var19_11, var21_13);
                                                    }
                                                    var15_21 = v3;
                                                    var15_21 = this.S(var15_21, var22_14);
                                                    this.y(var10_15, var4_4, var15_21, var5_5, var6_6);
                                                }
                                                v5 = var2_2;
                                                v6 = var4_4;
                                            }
                                            if (var9_9 == null) break block51;
                                            if (v5 != v6) {
                                                var14_22 = this.y(var18_10, var20_12);
                                                var14_22 = this.S(var14_22, var22_14);
                                                this.y(var10_15, var2_2, var14_22, var5_5, var6_6);
                                            }
                                        }
                                        v5 = var2_2;
                                        if (var9_9 == null) break block57;
                                        v6 = var4_4;
                                    }
                                    if (v5 != v6) break block58;
                                    v7 = var1_1;
                                    v8 = var3_3;
                                    if (var9_9 == null) break block59;
                                    if (v7 == v8) break block60;
                                }
                                v5 = this.y(var18_10, var21_13);
                            }
                            var16_23 = v5;
                            var17_24 = this.y(var19_11, var20_12);
                            var16_23 = this.y(var16_23, var17_24);
                            var16_23 = this.S(var16_23, var22_14);
                            this.y(var10_15, var11_17, var16_23, var5_5, var6_6);
                        }
                        v7 = var3_3 - var1_1;
                        if (var9_9 == null) break block61;
                        v8 = 3;
                    }
                    if (v7 < v8) {
                        v7 = var4_4 - var2_2;
                        if (var9_9 != null) {
                            if (v7 < 3) {
                                return false;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v7 = 1;
                    }
                }
                return (boolean)v7;
            }
            v0 = (var1_1 + var3_3) / 2;
        }
        var10_16 = v0;
        var11_18 = (var2_2 + var4_4) / 2;
        this.Y(var1_1, var2_2, var10_16, var11_18, var5_5, var6_6, var7_7 - 1, var8_8 + 1);
        this.Y(var1_1, var11_18, var10_16, var4_4, var5_5, var6_6, var7_7 - 1, var8_8 + 1);
        this.Y(var10_16, var2_2, var3_3, var11_18, var5_5, var6_6, var7_7 - 1, var8_8 + 1);
        return this.Y(var10_16, var11_18, var3_3, var4_4, var5_5, var6_6, var7_7 - 1, var8_8 + 1);
    }

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int[] nArray2;
        block8: {
            yz_1 yz_12;
            String[] stringArray;
            block10: {
                nArray2 = new int[n10 * n11];
                String[] stringArray2 = W5.q();
                this.r.setSeed(this.u);
                int n12 = n10 - 1;
                int n13 = n11 - 1;
                this.y(0, 0, this.G(nArray, 0, 0), nArray2, n10);
                this.y(n12, 0, this.G(nArray, n12, 0), nArray2, n10);
                this.y(0, n13, this.G(nArray, 0, n13), nArray2, n10);
                stringArray = stringArray2;
                this.y(n12, n13, this.G(nArray, n12, n13), nArray2, n10);
                this.y(n12 / 2, n13 / 2, this.G(nArray, n12 / 2, n13 / 2), nArray2, n10);
                this.y(0, n13 / 2, this.G(nArray, 0, n13 / 2), nArray2, n10);
                this.y(n12, n13 / 2, this.G(nArray, n12, n13 / 2), nArray2, n10);
                this.y(n12 / 2, 0, this.G(nArray, n12 / 2, 0), nArray2, n10);
                this.y(n12 / 2, n13, this.G(nArray, n12 / 2, n13), nArray2, n10);
                int n14 = 1;
                while (this.Y(0, 0, n10 - 1, n11 - 1, nArray2, n10, n14, 0)) {
                    ++n14;
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                    }
                    break block8;
                }
                yz_12 = this;
                if (stringArray == null) break block10;
                if (!yz_12.w) break block8;
                yz_12 = this;
            }
            if (yz_12.T != null) {
                int n15 = 0;
                int n16 = 0;
                while (n16 < n11) {
                    block9: {
                        for (int i2 = 0; i2 < n10; ++i2) {
                            nArray2[n15] = this.T.D((float)(nArray2[n15] & yz_1.a(9593, 1494584738105725436L)) / 255.0f);
                            ++n15;
                            if (stringArray != null) {
                                if (stringArray != null) continue;
                            }
                            break block9;
                        }
                        ++n16;
                    }
                    if (stringArray != null) continue;
                }
            }
        }
        return nArray2;
    }

    public String toString() {
        return a;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block20: {
                block19: {
                    block21: {
                        break block21;
lbl1:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    v0 = "5.\u0001\u0013\n2\u001bN\u001b\u0015\u0006\f-\u001fOeW".toCharArray();
                    v1 = v0.length;
                    var10 = 0;
                    v2 = 58;
                    v3 = v0;
                    v4 = v1;
                    if (v1 > 1) ** GOTO lbl54
                    do {
                        v5 = v2;
                        v3 = v3;
                        v6 = v3;
                        v7 = v2;
                        v8 = var10;
                        while (true) {
                            switch (var10 % 7) {
                                case 0: {
                                    v9 = 91;
                                    break;
                                }
                                case 1: {
                                    v9 = 113;
                                    break;
                                }
                                case 2: {
                                    v9 = 67;
                                    break;
                                }
                                case 3: {
                                    v9 = 93;
                                    break;
                                }
                                case 4: {
                                    v9 = 69;
                                    break;
                                }
                                case 5: {
                                    v9 = 122;
                                    break;
                                }
                                default: {
                                    v9 = 68;
                                }
                            }
                            v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                            ++var10;
                            v2 = v5;
                            if (v5 != 0) break;
                            v5 = v2;
                            v3 = v3;
                            v8 = v2;
                            v6 = v3;
                            v7 = v2;
                        }
lbl54:
                        // 2 sources

                        v10 = v3;
                        v4 = v4;
                    } while (v4 > var10);
                    ** while (true)
                    yz_1.a = new String(v10).intern();
                    var2_1 = 7745782081022057597L;
                    var8_2 = new long[9];
                    var5_3 = 0;
                    var6_4 = "@\u00c9m\u00ef\u0085}\u0007\u00da\u00e8(\u00b1[_\u00ff\u0082\u00d6\u00b4|\u00bb\u00ea\u0017d\u00cd~\\I\u0081\u00e5{\u00f7\u00d6,3b\u0013\u009f7|S\u000b8#\u00ed\u0001\u00ff=\u008e\u0012\u009cD\u00f1s\u00f3\u00b8.\u00e5";
                    var7_5 = "@\u00c9m\u00ef\u0085}\u0007\u00da\u00e8(\u00b1[_\u00ff\u0082\u00d6\u00b4|\u00bb\u00ea\u0017d\u00cd~\\I\u0081\u00e5{\u00f7\u00d6,3b\u0013\u009f7|S\u000b8#\u00ed\u0001\u00ff=\u008e\u0012\u009cD\u00f1s\u00f3\u00b8.\u00e5".length();
                    var4_6 = 0;
                    while (true) {
                        var9_7 = var6_4.substring(var4_6, var4_6 += 8).getBytes("ISO-8859-1");
                        v11 = var8_2;
                        v12 = var5_3++;
                        v13 = ((long)var9_7[0] & 255L) << 56 | ((long)var9_7[1] & 255L) << 48 | ((long)var9_7[2] & 255L) << 40 | ((long)var9_7[3] & 255L) << 32 | ((long)var9_7[4] & 255L) << 24 | ((long)var9_7[5] & 255L) << 16 | ((long)var9_7[6] & 255L) << 8 | (long)var9_7[7] & 255L;
                        v14 = -1;
                        break block19;
                        break;
                    }
lbl75:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var4_6 < var7_5) ** continue;
                        var6_4 = "\u00afs\u00d0\u00b15\u00bb\u00c8\u0080\u00e1M\u00f4\u001bx\u00fd\u00bb\u008c";
                        var7_5 = "\u00afs\u00d0\u00b15\u00bb\u00c8\u0080\u00e1M\u00f4\u001bx\u00fd\u00bb\u008c".length();
                        var4_6 = 0;
                        while (true) {
                            var9_7 = var6_4.substring(var4_6, var4_6 += 8).getBytes("ISO-8859-1");
                            v11 = var8_2;
                            v12 = var5_3++;
                            v13 = ((long)var9_7[0] & 255L) << 56 | ((long)var9_7[1] & 255L) << 48 | ((long)var9_7[2] & 255L) << 40 | ((long)var9_7[3] & 255L) << 32 | ((long)var9_7[4] & 255L) << 24 | ((long)var9_7[5] & 255L) << 16 | ((long)var9_7[6] & 255L) << 8 | (long)var9_7[7] & 255L;
                            v14 = 0;
                            break block19;
                            break;
                        }
                        break;
                    }
lbl88:
                    // 1 sources

                    while (true) {
                        v11[v12] = v15;
                        if (var4_6 < var7_5) ** continue;
                        break block20;
                        break;
                    }
                }
                v15 = v13 ^ var2_1;
                switch (v14) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl99:
                    // 1 sources

                    ** continue;
                }
            }
            yz_1.b = var8_2;
            yz_1.c = new Integer[9];
            break block22;
lbl104:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_8 = 1727192939476898652L;
        ** while (true)
        yz_1.d = 1727192939476898155L ^ var0_8;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3487;
        if (c[n11] == null) {
            yz_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

