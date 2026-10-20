/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.L3;
import com.fk_0;
import com.ky_2;
import com.lz_0;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class LI
extends L3 {
    protected int E;
    protected int Z;
    protected float X;
    protected boolean A;
    protected boolean w;
    protected boolean W;
    protected boolean r;
    protected int x;
    protected int y;
    protected float m;
    private static final long[] a;
    private static final Integer[] b;

    public LI() {
        this.E = LI.a(19335, 474099625837707963L);
        this.Z = 0;
        this.X = 0.75f;
        this.A = true;
        this.w = true;
        this.W = true;
        this.r = true;
        this.x = LI.a(19335, 474099625837707963L);
        this.y = 0;
        this.m = 0.75f;
    }

    public LI(int n10, int n11, float f10) {
        this.E = LI.a(17392, 3842359393206651597L);
        this.Z = 0;
        this.X = 0.75f;
        this.A = true;
        this.w = true;
        this.W = true;
        this.r = true;
        this.x = LI.a(19335, 474099625837707963L);
        this.y = 0;
        this.m = 0.75f;
        this.E = n10;
        this.Z = n11;
        this.X = f10;
    }

    public LI(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.E = LI.a(19335, 474099625837707963L);
        this.Z = 0;
        this.X = 0.75f;
        this.A = true;
        this.w = true;
        this.W = true;
        int[] nArray = lz_0.M();
        this.r = true;
        this.x = LI.a(19335, 474099625837707963L);
        this.y = 0;
        this.m = 0.75f;
        this.A = bl;
        this.w = bl2;
        this.W = bl3;
        this.r = bl4;
        if (ky_2.F() != null) {
            lz_0.d(new int[4]);
        }
    }

    protected void F() {
        this.x = this.E;
        this.y = this.Z;
        this.m = this.X;
        this.P(fk_0.o(this.E, this.Z, this.X));
    }

    public int n() {
        return this.E;
    }

    public LI N(int n10) {
        this.E = n10;
        return this;
    }

    public int r() {
        return this.Z;
    }

    public LI D(int n10) {
        this.Z = n10;
        return this;
    }

    public float i() {
        return this.X;
    }

    public LI x(float f10) {
        this.X = f10;
        return this;
    }

    public boolean e() {
        return this.A;
    }

    public LI I(boolean bl) {
        this.A = bl;
        return this;
    }

    public boolean H() {
        return this.w;
    }

    public LI L(boolean bl) {
        this.w = bl;
        return this;
    }

    public boolean m() {
        return this.W;
    }

    public LI J(boolean bl) {
        this.W = bl;
        return this;
    }

    public boolean n() {
        return this.r;
    }

    public LI O(boolean bl) {
        this.r = bl;
        return this;
    }

    public LI w(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.A = bl;
        this.w = bl2;
        this.W = bl3;
        this.r = bl4;
        return this;
    }

    @Override
    public Insets B(JComponent jComponent) {
        return new Insets(this.A ? this.E : 0, this.w ? this.E : 0, this.W ? this.E : 0, this.r ? this.E : 0);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void u(Graphics2D var1_1, Rectangle var2_2, JComponent var3_3) {
        block20: {
            block19: {
                block17: {
                    block18: {
                        block15: {
                            block16: {
                                var4_4 = lz_0.M();
                                v0 = this;
                                if (var4_4 != null) break block15;
                                if (v0.x != this.E) break block16;
                                v0 = this;
                                if (var4_4 != null) break block15;
                                if (v0.y != this.Z) break block16;
                                v0 = this;
                                if (var4_4 != null) break block15;
                                if (v0.m != this.X) break block16;
                                v1 = this.t;
                                if (var4_4 != null) break block17;
                                if (v1 != null) break block18;
                            }
                            v0 = this;
                        }
                        v0.F();
                    }
                    v1 = this.t;
                }
                if (var4_4 != null) break block19;
                if (v1 == null) break block20;
                this.t.k(var3_3);
                v1 = this.t;
            }
            v2 = var2_2.x;
            v3 = this;
            if (var4_4 != null) ** GOTO lbl33
            if (v3.w) {
                v4 = 0;
            } else {
                v3 = this;
lbl33:
                // 2 sources

                v4 = v3.E;
            }
            v5 = v2 - v4;
            v6 = var2_2.y;
            v7 = this;
            if (var4_4 != null) ** GOTO lbl42
            if (v7.A) {
                v8 = 0;
            } else {
                v7 = this;
lbl42:
                // 2 sources

                v8 = v7.E;
            }
            v9 = v6 - v8;
            v10 = var2_2.width;
            v11 = this;
            if (var4_4 != null) ** GOTO lbl51
            if (v11.w) {
                v12 = 0;
            } else {
                v11 = this;
lbl51:
                // 2 sources

                v12 = v11.E;
            }
            v13 = v10 + v12;
            v14 = this;
            if (var4_4 != null) ** GOTO lbl59
            if (v14.r) {
                v15 = 0;
            } else {
                v14 = this;
lbl59:
                // 2 sources

                v15 = v14.E;
            }
            v16 = v13 + v15;
            v17 = var2_2.height;
            v18 = this;
            if (var4_4 != null) ** GOTO lbl68
            if (v18.A) {
                v19 = 0;
            } else {
                v18 = this;
lbl68:
                // 2 sources

                v19 = v18.E;
            }
            v20 = v17 + v19;
            v21 = this;
            if (var4_4 != null) ** GOTO lbl76
            if (v21.W) {
                v22 = 0;
            } else {
                v21 = this;
lbl76:
                // 2 sources

                v22 = v21.E;
            }
            v1.l(var1_1, v5, v9, v16, v20 + v22);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3449872024967202370L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00c7#\u00ff\u00b7\u0012\u0089\u0084\u00f3f\u00ff\nh\u00b3\u00cd\u008c\u0085";
        int n11 = "\u00c7#\u00ff\u00b7\u0012\u0089\u0084\u00f3f\u00ff\nh\u00b3\u00cd\u008c\u0085".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x93C;
        if (b[n11] == null) {
            LI.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

