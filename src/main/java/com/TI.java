/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.T4;
import com.ky_2;
import com.oy_1;
import com.u_;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.util.List;

public class TI
extends T4 {
    final oy_1 r;
    private static final long[] a;
    private static final Integer[] b;

    protected TI(oy_1 oy_12) {
        this.r = oy_12;
    }

    @Override
    public void layoutContainer(Container container) {
        int n10 = this.r.getComponentOrientation().isLeftToRight();
        int n11 = 0;
        boolean bl = oy_1.Z();
        while (n11 < this.r.y.size()) {
            block5: {
                block6: {
                    int n12;
                    int n13;
                    int n14;
                    Dimension dimension;
                    Component component;
                    block18: {
                        int n15;
                        int n16;
                        block20: {
                            Point point;
                            block19: {
                                int n17;
                                int n18;
                                block14: {
                                    block15: {
                                        block16: {
                                            block17: {
                                                int n19;
                                                block7: {
                                                    block8: {
                                                        block13: {
                                                            int n20;
                                                            int n21;
                                                            block11: {
                                                                block12: {
                                                                    int n22;
                                                                    int n23;
                                                                    block9: {
                                                                        block10: {
                                                                            component = this.r.J(n11).j();
                                                                            if (bl) break block5;
                                                                            if (component == null) break block6;
                                                                            point = this.r.S(n11);
                                                                            dimension = component.getPreferredSize();
                                                                            n19 = this.r.v;
                                                                            if (bl) break block7;
                                                                            if (n19 != 0) break block8;
                                                                            n14 = point.x - dimension.width / 2;
                                                                            n23 = this.r.b;
                                                                            n22 = 1;
                                                                            if (bl) break block9;
                                                                            if (n23 == n22) break block10;
                                                                            n21 = this.r.b;
                                                                            n20 = TI.b(28836, 8533925339857010955L);
                                                                            if (bl) break block11;
                                                                            if (n21 != n20) break block12;
                                                                        }
                                                                        n23 = point.y - this.r.g / 2 - this.r.q - this.r.s;
                                                                        n22 = dimension.height;
                                                                    }
                                                                    n13 = n23 - n22;
                                                                    component.setBounds(n14, n13, dimension.width, dimension.height);
                                                                    if (!bl) break block13;
                                                                }
                                                                n21 = point.y + this.r.g / 2 + this.r.q;
                                                                n20 = this.r.s;
                                                            }
                                                            n13 = n21 + n20;
                                                            component.setBounds(n14, n13, dimension.width, dimension.height);
                                                        }
                                                        if (!bl) break block6;
                                                    }
                                                    n19 = point.y - dimension.height / 2;
                                                }
                                                n14 = n19;
                                                n18 = this.r.b;
                                                n17 = 2;
                                                if (bl) break block14;
                                                if (n18 == n17) break block15;
                                                n12 = n10;
                                                if (bl) break block16;
                                                if (n12 == 0) break block17;
                                                n18 = this.r.b;
                                                n17 = TI.b(31330, 7488762487545121743L);
                                                if (bl) break block14;
                                                if (n18 == n17) break block15;
                                            }
                                            n12 = n10;
                                        }
                                        if (bl) break block18;
                                        if (n12 != 0) break block19;
                                        n16 = this.r.b;
                                        n15 = TI.b(25627, 2408699329735185847L);
                                        if (bl) break block20;
                                        if (n16 != n15) break block19;
                                    }
                                    n18 = point.x - this.r.g / 2 - this.r.q - this.r.s;
                                    n17 = dimension.width;
                                }
                                n13 = n18 - n17;
                                component.setBounds(n13, n14, dimension.width, dimension.height);
                                if (!bl) break block6;
                            }
                            n16 = point.x + this.r.g / 2 + this.r.q;
                            n15 = this.r.s;
                        }
                        n12 = n16 + n15;
                    }
                    n13 = n12;
                    component.setBounds(n13, n14, dimension.width, dimension.height);
                }
                ++n11;
            }
            if (!bl) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Dimension preferredLayoutSize(Container var1_1) {
        block16: {
            block13: {
                block14: {
                    block15: {
                        block12: {
                            var3_2 = this.L();
                            var4_3 = this.K();
                            var5_4 = this.r.y.size() - 1;
                            var2_5 = oy_1.Z();
                            v0 = this.r.v;
                            if (var2_5) break block14;
                            if (v0 != 0) break block15;
                            this.r.Q = Math.max(var4_3.width / 2, this.r.g / 2 + this.r.q);
                            var7_6 = 0;
                            for (var8_7 = 0; var8_7 < var5_4; ++var8_7) {
                                var9_8 = ((u_)this.r.y.get(var8_7)).j();
                                if (var2_5) break block12;
                                v1 = var9_8;
                                if (var2_5) ** GOTO lbl17
                                if (v1 != null) {
                                    v1 = var9_8;
lbl17:
                                    // 2 sources

                                    v2 = v1.getPreferredSize();
                                } else {
                                    v2 = new Dimension(0, 0);
                                }
                                var10_12 = v2;
                                v3 = var11_13 = ((u_)this.r.y.get(var8_7 + 1)).j();
                                if (var2_5) ** GOTO lbl25
                                if (v3 != null) {
                                    v3 = var11_13;
lbl25:
                                    // 2 sources

                                    v4 = v3.getPreferredSize();
                                } else {
                                    v4 = new Dimension(0, 0);
                                }
                                var12_14 = v4;
                                var7_6 = Math.max(var7_6, var10_12.width / 2 + var12_14.width / 2);
                                if (!var2_5) continue;
                                ky_2.K(new String[4]);
                                break;
                            }
                            var8_7 = (Math.max(this.r.q * 2 + this.r.g, var7_6) + this.r.T) * var5_4;
                        }
                        v5 = this.r.q * 2 + this.r.g + var3_2.height;
                        v6 = var3_2.height;
                        if (!var2_5) {
                            v6 = v6 > 0 ? this.r.s : 0;
                        }
                        var9_9 = v5 + v6;
                        var6_15 = new Dimension(this.r.k.left + var8_7 + this.r.Q * 2 + this.r.k.right + 1, this.r.k.top + var9_9 + this.r.k.bottom + 1);
                        if (!var2_5) break block16;
                    }
                    this.r.Q = Math.max(var4_3.height / 2, this.r.g / 2 + this.r.q);
                    v0 = 0;
                }
                var7_6 = v0;
                for (var8_7 = 0; var8_7 < var5_4; ++var8_7) {
                    var9_10 = ((u_)this.r.y.get(var8_7)).j();
                    if (var2_5) break block13;
                    v7 = var9_10;
                    if (var2_5) ** GOTO lbl54
                    if (v7 != null) {
                        v7 = var9_10;
lbl54:
                        // 2 sources

                        v8 = v7.getPreferredSize();
                    } else {
                        v8 = new Dimension(0, 0);
                    }
                    var10_12 = v8;
                    v9 = var11_13 = ((u_)this.r.y.get(var8_7 + 1)).j();
                    if (var2_5) ** GOTO lbl62
                    if (v9 != null) {
                        v9 = var11_13;
lbl62:
                        // 2 sources

                        v10 = v9.getPreferredSize();
                    } else {
                        v10 = new Dimension(0, 0);
                    }
                    var12_14 = v10;
                    var7_6 = Math.max(var7_6, var10_12.height / 2 + var12_14.height / 2);
                    if (!var2_5) continue;
                }
                var8_7 = (Math.max(this.r.q * 2 + this.r.g, var7_6) + var5_4) * var5_4;
            }
            v11 = this.r.q * 2 + this.r.g + var3_2.width;
            v12 = var3_2.width;
            if (!var2_5) {
                v12 = v12 > 0 ? this.r.s : 0;
            }
            var9_11 = v11 + v12;
            var6_15 = new Dimension(this.r.k.left + var9_11 + this.r.k.right + 1, this.r.k.top + var8_7 + this.r.Q * 2 + this.r.k.bottom + 1);
        }
        return var6_15;
    }

    public Dimension L() {
        Dimension dimension;
        block6: {
            List list;
            boolean bl;
            block7: {
                int n10;
                block5: {
                    dimension = new Dimension(0, 0);
                    bl = oy_1.y();
                    n10 = this.r.M;
                    if (!bl) break block5;
                    if (n10 == 0) break block6;
                    list = this.r.y;
                    if (!bl) break block7;
                    n10 = list.size();
                }
                if (n10 <= 0) break block6;
                list = this.r.y;
            }
            for (u_ u_2 : list) {
                if (u_2.j() != null) {
                    dimension = FN.h(dimension, u_2.j().getPreferredSize());
                }
                if (bl) continue;
            }
        }
        return dimension;
    }

    /*
     * Unable to fully structure code
     */
    public Dimension K() {
        block12: {
            block15: {
                block14: {
                    block13: {
                        block11: {
                            var1_1 = oy_1.y();
                            v0 = this.r.M;
                            if (!var1_1) break block11;
                            if (v0 == 0) break block12;
                            v1 = this.r.y;
                            if (!var1_1) break block13;
                            v0 = v1.size();
                        }
                        if (v0 <= 0) break block12;
                        v1 = this.r.y.get(0);
                    }
                    var2_2 = ((u_)v1).j();
                    var3_3 = ((u_)this.r.y.get(this.r.y.size() - 1)).j();
                    v2 = var2_2;
                    if (var1_1) {
                        if (v2 != null) {
                            v2 = var3_3;
                            if (var1_1) {
                                if (v2 != null) {
                                    return FN.h(var2_2.getPreferredSize(), var3_3.getPreferredSize());
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v2 = var2_2;
                        }
                    }
                    if (var1_1) {
                        if (v2 != null) {
                            return var2_2.getPreferredSize();
                        }
                        v2 = var3_3;
                    }
                    if (!var1_1) break block14;
                    if (v2 == null) break block15;
                    v2 = var3_3;
                }
                return v2.getPreferredSize();
            }
            return new Dimension(0, 0);
        }
        return new Dimension(0, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5837101667618556336L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "q\u00f9\u00f7\u0015}[Bu\u00d5\u0085\u00a1\u008b\u0017\u00a8\u00dc\fM;\u0080\u0002\u009d\u00dfH\u00b1";
        int n11 = "q\u00f9\u00f7\u0015}[Bu\u00d5\u0085\u00a1\u008b\u0017\u00a8\u00dc\fM;\u0080\u0002\u009d\u00dfH\u00b1".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x31AD;
        if (b[n11] == null) {
            TI.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

