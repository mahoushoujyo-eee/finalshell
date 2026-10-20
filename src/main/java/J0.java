/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

public class J0
extends JLabel {
    boolean E;
    boolean P;
    boolean y;
    boolean d;
    kw_2 e;
    Color z;
    Color f;
    private static final long[] a;
    private static final Integer[] b;

    public J0() {
        this.E = false;
        this.P = false;
        this.y = false;
        this.z = new Color(J0.a(2008, 6877392405139075383L), J0.a(13640, 9048047858366645156L), J0.a(3963, 336304932294834579L), J0.a(29973, 1412147024354034683L));
        this.f = new Color(J0.a(10576, 6483732662636257211L), J0.a(24366, 419031080208296388L), J0.a(3963, 336304932294834579L), J0.a(4545, 414216209378060076L));
    }

    @Override
    public void paint(Graphics graphics) {
        J0 j0;
        block29: {
            block21: {
                int n10;
                int n11;
                int n12;
                Graphics2D graphics2D;
                block32: {
                    int n13;
                    int[] nArray;
                    block30: {
                        double d2;
                        double d3;
                        block31: {
                            float f10;
                            int n14;
                            int n15;
                            boolean bl;
                            block22: {
                                block23: {
                                    block28: {
                                        int n16;
                                        block26: {
                                            block27: {
                                                float f11;
                                                float f12;
                                                block24: {
                                                    block25: {
                                                        float f13;
                                                        block20: {
                                                            graphics2D = (Graphics2D)graphics;
                                                            nArray = CE.S();
                                                            bl = this.E;
                                                            if (nArray == null) break block20;
                                                            if (bl) break block21;
                                                            bl = this.P;
                                                        }
                                                        if (nArray == null) break block22;
                                                        if (!bl) break block23;
                                                        graphics2D.setColor((Color)this.f);
                                                        try {
                                                            f13 = ((Float)this.e.E()).floatValue();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        f12 = f13 * 0.01f;
                                                        n16 = 3;
                                                        n12 = 0;
                                                        n15 = 5;
                                                        n14 = (int)(((float)this.getWidth() - (float)n15) * f12) + n12;
                                                        float f14 = f12 - 0.0f;
                                                        f11 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                                        if (nArray == null) break block24;
                                                        if (f11 <= 0) break block25;
                                                        f11 = n14;
                                                        if (nArray == null) break block24;
                                                        if (f11 == false) {
                                                            n14 = 1;
                                                        }
                                                    }
                                                    f11 = n16;
                                                }
                                                n11 = (int)f11;
                                                if (nArray == null) break block26;
                                                if (!(f12 > 0.0f)) break block27;
                                                graphics2D.fillRect(this.getWidth() - n14, n11, n14, this.getHeight() - 2 * n16);
                                                if (nArray != null) break block28;
                                            }
                                            graphics2D.setColor((Color)this.f);
                                        }
                                        graphics2D.fillRect(this.getWidth() - n14, n11, n14, this.getHeight() - 2 * n16);
                                    }
                                    if (nArray != null) break block21;
                                }
                                j0 = this;
                                if (nArray == null) break block29;
                                bl = j0.y;
                            }
                            if (!bl) break block21;
                            graphics2D.setColor((Color)this.z);
                            try {
                                f10 = ((Float)this.e.v()).floatValue();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            d3 = f10 * 0.01f;
                            n12 = 3;
                            n15 = 0;
                            n14 = 5;
                            n11 = (int)((double)((float)this.getWidth() - (float)n14) * d3) + n15;
                            n10 = n12;
                            try {
                                n13 = (Integer)this.e.X();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (nArray == null) break block30;
                            if (n13 <= 0) break block31;
                            n13 = n11;
                            if (nArray == null) break block30;
                            if (n13 == 0) {
                                n11 = 1;
                            }
                        }
                        n13 = (d2 = d3 - 0.0) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                    }
                    if (n13 <= 0) break block32;
                    graphics2D.fillRect(this.getWidth() - n11, n10, n11, this.getHeight() - 2 * n12);
                    if (nArray != null) break block21;
                }
                graphics2D.setColor((Color)this.z);
                graphics2D.fillRect(this.getWidth() - n11, n10, n11, this.getHeight() - 2 * n12);
            }
            j0 = this;
        }
        super.paint(graphics);
    }

    public boolean Q() {
        return this.d;
    }

    public void C(boolean bl) {
        this.d = bl;
    }

    public boolean C() {
        return this.E;
    }

    public void V(boolean bl) {
        this.E = bl;
    }

    public kw_2 R() {
        return (kw_2)this.e;
    }

    public void k(kw_2 kw_22) {
        this.e = kw_22;
    }

    public boolean D() {
        return this.P;
    }

    public void i(boolean bl) {
        this.P = bl;
    }

    public boolean P() {
        return this.y;
    }

    public void D(boolean bl) {
        this.y = bl;
    }

    public kw_2 s() {
        return (kw_2)this.e;
    }

    public void s(kw_2 kw_22) {
        this.e = kw_22;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8414051312702908116L;
                var6_1 = new long[7];
                var3_2 = 0;
                var4_3 = "t!RkB\u00af\u00a5Whd3l\u0086\u00d8W\u00d1X\u00f1\u0092\u009es=e\u00dan\u0093d\u00e8{\u00a0\u00c1R\u00cb\u00d6\u0092\u00b2\u00c29\u000f@";
                var5_4 = "t!RkB\u00af\u00a5Whd3l\u0086\u00d8W\u00d1X\u00f1\u0092\u009es=e\u00dan\u0093d\u00e8{\u00a0\u00c1R\u00cb\u00d6\u0092\u00b2\u00c29\u000f@".length();
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
                    var4_3 = "0\u00ee\u009eS\u00c0\u0098\u00f9\u0090\u0096\u00d8m\u00c2\u00065\u00dfu";
                    var5_4 = "0\u00ee\u009eS\u00c0\u0098\u00f9\u0090\u0096\u00d8m\u00c2\u00065\u00dfu".length();
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
        J0.a = var6_1;
        J0.b = new Integer[7];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x36EE;
        if (b[n11] == null) {
            J0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

