/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.FV;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.util.HashMap;
import java.util.Map;

class GE {
    private final FontMetrics T;
    private final Font g;
    private final FontRenderContext l;
    private final Map a;
    private static final char[] H;
    static final boolean S;
    private static final long[] b;
    private static final Integer[] c;

    public GE(FontMetrics fontMetrics) {
        block3: {
            block5: {
                GE gE2;
                block4: {
                    String string;
                    block2: {
                        String string2 = FV.D();
                        this.T = fontMetrics;
                        this.g = fontMetrics.getFont();
                        this.l = fontMetrics.getFontRenderContext();
                        string = string2;
                        gE2 = this;
                        if (string != null) break block2;
                        gE2.a = new HashMap();
                        if (S) break block3;
                        gE2 = this;
                    }
                    if (string != null) break block4;
                    if (gE2.g == null) break block5;
                    gE2 = this;
                }
                if (gE2.l != null) break block3;
            }
            throw new AssertionError();
        }
    }

    public int G(char c2) {
        Short s2 = (Short)this.a.get(Character.valueOf(c2));
        String string = FV.D();
        Short s3 = s2;
        if (string == null && s3 == null) {
            s2 = this.k(c2);
            s3 = this.a.put(Character.valueOf(c2), s2);
        }
        return ((GE.a(17385, 6578449476650503238L) & s2) >>> GE.a(15720, 8802378366684230344L)) - GE.a(17425, 241585815428041651L);
    }

    public int g(char c2) {
        Short s2 = (Short)this.a.get(Character.valueOf(c2));
        String string = FV.D();
        Short s3 = s2;
        if (string == null && s3 == null) {
            s2 = this.k(c2);
            s3 = this.a.put(Character.valueOf(c2), s2);
        }
        return (GE.a(9003, 4505525811107097735L) & s2) - GE.a(17425, 241585815428041651L);
    }

    private short k(char c2) {
        int n10;
        int n11;
        block22: {
            int n12;
            int n13;
            block23: {
                int n14;
                block20: {
                    block21: {
                        int n15;
                        String string;
                        block18: {
                            block19: {
                                int n16;
                                block16: {
                                    block17: {
                                        block12: {
                                            block13: {
                                                block15: {
                                                    Object object;
                                                    Object object2;
                                                    block14: {
                                                        Object object3;
                                                        block8: {
                                                            block9: {
                                                                block11: {
                                                                    Object object4;
                                                                    Object object5;
                                                                    block10: {
                                                                        GE.H[0] = c2;
                                                                        GlyphVector glyphVector = this.g.createGlyphVector(this.l, H);
                                                                        Rectangle rectangle = glyphVector.getGlyphPixelBounds(0, this.l, 0.0f, 0.0f);
                                                                        string = FV.D();
                                                                        n13 = rectangle.x;
                                                                        n12 = rectangle.width - this.T.charWidth(c2);
                                                                        n16 = n13;
                                                                        if (string != null) break block8;
                                                                        if (n16 >= 0) break block9;
                                                                        object5 = object3 = this.l.getAntiAliasingHint();
                                                                        object4 = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB;
                                                                        if (string != null) break block10;
                                                                        if (object5 == object4) break block11;
                                                                        object5 = object3;
                                                                        object4 = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HBGR;
                                                                    }
                                                                    if (object5 != object4) break block9;
                                                                }
                                                                ++n13;
                                                            }
                                                            n16 = n12;
                                                        }
                                                        if (string != null) break block12;
                                                        if (n16 <= 0) break block13;
                                                        object2 = object3 = this.l.getAntiAliasingHint();
                                                        object = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB;
                                                        if (string != null) break block14;
                                                        if (object2 == object) break block15;
                                                        object2 = object3;
                                                        object = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HBGR;
                                                    }
                                                    if (object2 != object) break block13;
                                                }
                                                --n12;
                                            }
                                            n16 = n13;
                                        }
                                        if (string != null) break block16;
                                        if (n16 < GE.a(21427, 2140305497940499472L)) break block17;
                                        n14 = n13;
                                        n15 = GE.a(16803, 4006517586498784777L);
                                        if (string != null) break block18;
                                        if (n14 <= n15) break block19;
                                    }
                                    n16 = 0;
                                }
                                n13 = n16;
                            }
                            n14 = n12;
                            if (string != null) break block20;
                            n15 = GE.a(15892, 6166191262402474431L);
                        }
                        if (n14 < n15) break block21;
                        n11 = n12;
                        n10 = GE.a(17425, 241585815428041651L);
                        if (string != null) break block22;
                        if (n11 <= n10) break block23;
                    }
                    n14 = 0;
                }
                n12 = n14;
            }
            n11 = (n13 + GE.a(17425, 241585815428041651L) << GE.a(25715, 6341177783699778525L)) + n12;
            n10 = GE.a(17425, 241585815428041651L);
        }
        int n17 = n11 + n10;
        return (short)n17;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String string = FV.D();
        Object object2 = object;
        if (string == null) {
            if (object2 == this) {
                return true;
            }
            object2 = object;
        }
        if (string == null) {
            if (!(object2 instanceof GE)) {
                return false;
            }
            object2 = object;
        }
        GE gE2 = (GE)object2;
        boolean bl = this.g.equals(gE2.g);
        if (string == null) {
            if (!bl) return false;
            bl = this.l.equals(gE2.l);
        }
        if (string != null) return bl;
        if (!bl) return false;
        return true;
    }

    public int hashCode() {
        int n10 = GE.a(25276, 5389899735197953297L);
        String string = FV.D();
        GE gE2 = this;
        if (string == null) {
            if (gE2.g != null) {
                n10 = GE.a(1779, 1943290617856051546L) * n10 + this.g.hashCode();
            }
            gE2 = this;
        }
        if (gE2.l != null) {
            n10 = GE.a(32345, 8202851128078021105L) * n10 + this.l.hashCode();
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1713784925716413036L;
                var6_1 = new long[11];
                var3_2 = 0;
                var4_3 = "\u00a9U\u0011\u008d/#t\u001a\u00cb\u00fd\u0091`-\u00dc\u00f4R\u00dcM;<\u00a4>K\u00b8j\u008b\u00930\n\u00163\u0013\u00b2\u001c\u00a6_\u00b1\u00b8\u00d1\u00b9l3\u00f7\u00a7\u00b2%\u0089*\u0099Z\u00aa\u0084\u00cf\u00da\u0096\u0014*.+\u00eb\u00c5\u00cc\u00d7llk\u0081\u00cd\u00b1\u00e2q\u00a0";
                var5_4 = "\u00a9U\u0011\u008d/#t\u001a\u00cb\u00fd\u0091`-\u00dc\u00f4R\u00dcM;<\u00a4>K\u00b8j\u008b\u00930\n\u00163\u0013\u00b2\u001c\u00a6_\u00b1\u00b8\u00d1\u00b9l3\u00f7\u00a7\u00b2%\u0089*\u0099Z\u00aa\u0084\u00cf\u00da\u0096\u0014*.+\u00eb\u00c5\u00cc\u00d7llk\u0081\u00cd\u00b1\u00e2q\u00a0".length();
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
                    var4_3 = "\u00c0\u0011\u00acD\u001a\u00ce\u0019\u00fd\u00e6$m\u00cd\u009au\b\u00ac";
                    var5_4 = "\u00c0\u0011\u00acD\u001a\u00ce\u0019\u00fd\u00e6$m\u00cd\u009au\b\u00ac".length();
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
        GE.b = var6_1;
        GE.c = new Integer[11];
        GE.S = FN.class.desiredAssertionStatus() == false;
        GE.H = new char[1];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4FAA;
        if (c[n11] == null) {
            GE.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

