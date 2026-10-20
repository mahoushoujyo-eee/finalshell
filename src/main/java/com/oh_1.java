/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.hd_0;
import com.ky_2;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.text.View;

/*
 * Renamed from com.oH
 */
public class oh_1
extends BasicTabbedPaneUI {
    private final Color n = new Color(oh_1.a(30869, 6331030130161647827L), oh_1.a(17023, 8587638417083120188L), oh_1.a(17023, 8587638417083120188L));
    private final Color b = new Color(oh_1.a(26737, 3913403077390078010L), oh_1.a(18950, 5803028987773727306L), oh_1.a(18950, 5803028987773727306L));
    private static final String a;
    private static final long[] c;
    private static final Integer[] d;

    public static ComponentUI createUI(JComponent jComponent) {
        return new oh_1();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void paintTabArea(Graphics var1_1, int var2_2, int var3_3) {
        block24: {
            block25: {
                block23: {
                    block15: {
                        var5_4 = (Graphics2D)var1_1;
                        var6_5 = this.tabPane.getTabCount();
                        var7_6 = new Rectangle();
                        var4_7 = hd_0.X();
                        var8_8 = new Rectangle();
                        var9_9 = var1_1.getClipBounds();
                        var10_10 = -1;
                        var11_11 = -1;
                        var12_12 = -1;
                        for (var13_13 = this.runCount - 1; var13_13 >= 0; --var13_13) {
                            block16: {
                                block17: {
                                    var14_14 = 0;
                                    var15_15 = this.tabRuns[var13_13];
                                    v0 = this;
                                    if (var4_7 == null) break block15;
                                    v1 = v0.tabRuns;
                                    v2 = var13_13;
                                    v3 = this.runCount - 1;
                                    if (var4_7 == null) ** GOTO lbl24
                                    if (v2 == v3) {
                                        v4 = 0;
                                    } else {
                                        v2 = var13_13;
                                        v3 = 1;
lbl24:
                                        // 2 sources

                                        v4 = v2 + v3;
                                    }
                                    v5 = var16_16 = v1[v4];
                                    if (var4_7 == null) break block16;
                                    if (v5 == 0) break block17;
                                    v6 = var16_16 - 1;
                                    ** GOTO lbl36
                                }
                                v5 = var6_5;
                            }
                            v7 = 1;
                            block1: while (true) {
                                v6 = v5 - v7;
lbl36:
                                // 2 sources

                                var17_17 = v6;
                                var18_18 = var17_17 - var15_15 + 1;
                                for (var19_19 = var15_15; var19_19 <= var17_17; ++var19_19) {
                                    block22: {
                                        block21: {
                                            block18: {
                                                block20: {
                                                    block19: {
                                                        v5 = var19_19;
                                                        v7 = var3_3;
                                                        if (var4_7 == null) continue block1;
                                                        if (var4_7 == null) break block18;
                                                        if (v5 == v7) break block19;
                                                        v5 = (int)this.rects[var19_19].intersects(var9_9);
                                                        if (var4_7 == null) break block20;
                                                        if (v5 != 0) {
                                                            this.R(var5_4, var2_2, this.rects, this.runCount - 1 - var13_13, var14_14, var18_18, var19_19, var7_6, var8_8);
                                                        }
                                                    }
                                                    v5 = var19_19;
                                                }
                                                v7 = var3_3;
                                            }
                                            if (var4_7 == null) break block21;
                                            if (v5 != v7) break block22;
                                            v5 = this.runCount - 1;
                                            v7 = var13_13;
                                        }
                                        var10_10 = v5 - v7;
                                        var11_11 = var14_14;
                                        var12_12 = var18_18;
                                    }
                                    ++var14_14;
                                    if (var4_7 != null) continue;
                                }
                                break;
                            }
                            if (var4_7 != null) continue;
                        }
                        v8 = var3_3;
                        if (var4_7 == null) break block23;
                        if (v8 < 0) break block24;
                        v0 = this;
                    }
                    if (var4_7 == null) break block25;
                    v8 = (int)v0.rects[var3_3].intersects(var9_9);
                }
                if (v8 == 0) break block24;
                v0 = this;
            }
            v0.R(var5_4, var2_2, this.rects, var10_10, var11_11, var12_12, var3_3, var7_6, var8_8);
        }
    }

    protected void R(Graphics2D graphics2D, int n10, Rectangle[] rectangleArray, int n11, int n12, int n13, int n14, Rectangle rectangle, Rectangle rectangle2) {
        block5: {
            FontMetrics fontMetrics;
            Font font;
            String string;
            int n15;
            block4: {
                boolean bl;
                int n16;
                Rectangle rectangle3 = rectangleArray[n14];
                String string2 = hd_0.X();
                int n17 = n16 = this.tabPane.getSelectedIndex();
                if (string2 != null) {
                    n17 = n17 == n14 ? 1 : 0;
                }
                n15 = n17;
                this.S(graphics2D, n10, n11, n12, n13, n14, rectangle3.x, rectangle3.y, rectangle3.width, rectangle3.height, n15 != 0);
                string = this.tabPane.getTitleAt(n14);
                font = this.tabPane.getFont();
                fontMetrics = FN.P(this.tabPane, graphics2D, font);
                Icon icon = this.getIconForTab(n14);
                this.layoutLabel(n10, fontMetrics, n14, string, icon, rectangle3, rectangle, rectangle2, n15 != 0);
                boolean bl2 = bl = this.tabPane.getTabComponentAt(n14) == null;
                if (string2 == null) break block4;
                if (!bl) break block5;
                this.paintIcon(graphics2D, n10, n14, icon, rectangle, n15 != 0);
            }
            this.paintText(graphics2D, n10, font, fontMetrics, n14, string, rectangle2, n15 != 0);
        }
    }

    @Override
    protected void paintText(Graphics graphics, int n10, Font font, FontMetrics fontMetrics, int n11, String string, Rectangle rectangle, boolean bl) {
        Map map;
        block9: {
            int n12;
            block10: {
                block11: {
                    String string2;
                    block13: {
                        Color color;
                        block14: {
                            Color color2;
                            block15: {
                                int n13;
                                JTabbedPane jTabbedPane;
                                block12: {
                                    block8: {
                                        View view;
                                        block7: {
                                            String string3 = hd_0.X();
                                            map = FN.B(graphics);
                                            graphics.setFont(font);
                                            View view2 = this.getTextViewForTab(n11);
                                            string2 = string3;
                                            view = view2;
                                            if (string2 == null) break block7;
                                            if (view == null) break block8;
                                            view = view2;
                                        }
                                        view.paint(graphics, rectangle);
                                        if (string2 != null) break block9;
                                    }
                                    n12 = this.tabPane.getDisplayedMnemonicIndexAt(n11);
                                    if (string2 == null) break block10;
                                    if (!this.tabPane.isEnabled()) break block11;
                                    jTabbedPane = this.tabPane;
                                    n13 = n11;
                                    if (string2 == null) break block12;
                                    if (!jTabbedPane.isEnabledAt(n13)) break block11;
                                    jTabbedPane = this.tabPane;
                                    n13 = n11;
                                }
                                color = jTabbedPane.getForegroundAt(n13);
                                if (string2 == null) break block13;
                                if (!bl) break block14;
                                Color color3 = color;
                                if (string2 == null) break block15;
                                if (!(color3 instanceof UIResource)) break block14;
                                color3 = color2 = UIManager.getColor(a);
                            }
                            if (string2 == null) break block13;
                            if (color2 != null) {
                                color = color2;
                            }
                        }
                        graphics.setColor(color);
                        FN.W(graphics, string, n12, rectangle.x, rectangle.y + fontMetrics.getAscent());
                    }
                    if (string2 != null) break block9;
                }
                graphics.setColor(this.tabPane.getBackgroundAt(n11).brighter());
                FN.W(graphics, string, n12, rectangle.x, rectangle.y + fontMetrics.getAscent());
                graphics.setColor(this.tabPane.getBackgroundAt(n11).darker());
            }
            FN.W(graphics, string, n12, rectangle.x - 1, rectangle.y + fontMetrics.getAscent() - 1);
        }
        FN.O(graphics, map);
    }

    /*
     * Exception decompiling
     */
    protected void S(Graphics2D var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, int var9_9, int var10_10, boolean var11_11) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    protected void paintContentBorder(Graphics graphics, int n10, int n11) {
        int n12;
        int n13;
        int n14;
        block8: {
            int n15;
            block7: {
                int n16 = this.tabPane.getWidth();
                Insets insets = this.tabPane.getInsets();
                n14 = insets.left;
                String string = hd_0.X();
                n13 = insets.top;
                n12 = n16 - insets.right - insets.left;
                n15 = n10;
                if (string == null) break block7;
                switch (n15) {
                    case 2: {
                        n12 -= (n14 += this.calculateTabAreaWidth(n10, this.runCount, this.maxTabWidth)) - insets.left;
                        if (string != null) break block8;
                        ky_2.K(new String[4]);
                    }
                    case 4: {
                        n12 -= this.calculateTabAreaWidth(n10, this.runCount, this.maxTabWidth);
                        if (string != null) break block8;
                    }
                    case 3: {
                        if (string != null) break block8;
                    }
                    default: {
                        n15 = n13 + this.calculateTabAreaHeight(n10, this.runCount, this.maxTabHeight);
                    }
                }
            }
            n13 = n15;
        }
        switch (n10) {
            default: 
        }
        Graphics2D graphics2D = (Graphics2D)graphics;
        graphics2D.setPaint(new GradientPaint(n14, n13 + 1, new Color(oh_1.a(30094, 8038920903828639186L), oh_1.a(30094, 8038920903828639186L), oh_1.a(30094, 8038920903828639186L)), n14, n13 + 3, new Color(oh_1.a(8008, 4498914647841892104L), oh_1.a(3828, 8153646415644587699L), oh_1.a(3828, 8153646415644587699L))));
        graphics2D.fillRect(n14, n13 + 1, n12, 3);
        graphics2D.setPaint(this.n);
        graphics2D.drawLine(n14, n13, n14 + n12, n13);
        graphics2D.setPaint(this.b);
        graphics2D.drawLine(n14, n13 + 1, n14, n13 + 3);
        graphics2D.drawLine(n14 + n12 - 1, n13 + 1, n14 + n12 - 1, n13 + 3);
        graphics2D.drawLine(n14, n13 + 1, n14 + n12, n13 + 1);
        graphics2D.setPaint(new Color(oh_1.a(22030, 2310957875248574031L), oh_1.a(7923, 5591702179231426230L), oh_1.a(7923, 5591702179231426230L)));
        graphics2D.drawLine(n14, n13 + 4, n14 + n12, n13 + 4);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "{\u0006\bh\u0011BjN\t\u000f$\u0007CVJ\u0004\u001eo\u0010`U]\u0002\rx\u001bSTK".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 92;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 115;
                                break;
                            }
                            case 1: {
                                v9 = 59;
                                break;
                            }
                            case 2: {
                                v9 = 54;
                                break;
                            }
                            case 3: {
                                v9 = 86;
                                break;
                            }
                            case 4: {
                                v9 = 40;
                                break;
                            }
                            case 5: {
                                v9 = 122;
                                break;
                            }
                            default: {
                                v9 = 102;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
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
                } while (v4 > var8);
                ** while (true)
                oh_1.a = new String(v10).intern();
                var0_1 = 6257685085578504643L;
                var6_2 = new long[18];
                var3_3 = 0;
                var4_4 = "\u00a2\u0016\u00fdjx\u00f8\u00fe\\\u00c3v\u00aeN\u001f\u00a6\u009bq\u008a\u0013\u009d\u00ef\u00d5\u00e68!\u00bfJ\u001b\u00d2\u00ac\u00d7\u001f\u00ad\u00d3\f\u0097\u00e2h\u00d6\u00fb\u00f7\u00aa\u00cbM\u00cbU\u0017\u00b6\u00e2z.\u00fc6 \u00eb9\u0001\u0083z\u00c6\u009e\u00c0\u00c2\u009b*\u00b8\u0099\u0084\u001a\u00c0\u00f7O\u00cd\u00ff\u0093\u009f\u00cb\u0018\r;D\u00bb\u00bc\u00ecsV\u008b_\u0096\u0001\u00a7Z\u00a7p\u00be)\u00b5\u00d5\u0089\u00e0+\u00cf?\u00874\u00e9\u00a8\u0083\u00afq@N-\u00fe\u00c5\u00bcl_\u0096\u0013Z\u0083\u00f6\u00e5\u00e2:\u00bbL:";
                var5_5 = "\u00a2\u0016\u00fdjx\u00f8\u00fe\\\u00c3v\u00aeN\u001f\u00a6\u009bq\u008a\u0013\u009d\u00ef\u00d5\u00e68!\u00bfJ\u001b\u00d2\u00ac\u00d7\u001f\u00ad\u00d3\f\u0097\u00e2h\u00d6\u00fb\u00f7\u00aa\u00cbM\u00cbU\u0017\u00b6\u00e2z.\u00fc6 \u00eb9\u0001\u0083z\u00c6\u009e\u00c0\u00c2\u009b*\u00b8\u0099\u0084\u001a\u00c0\u00f7O\u00cd\u00ff\u0093\u009f\u00cb\u0018\r;D\u00bb\u00bc\u00ecsV\u008b_\u0096\u0001\u00a7Z\u00a7p\u00be)\u00b5\u00d5\u0089\u00e0+\u00cf?\u00874\u00e9\u00a8\u0083\u00afq@N-\u00fe\u00c5\u00bcl_\u0096\u0013Z\u0083\u00f6\u00e5\u00e2:\u00bbL:".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "|\u00cb\u00d0$S\u009b\u00fa\u00a0\u00fd/\u00e7b\u0010\u0001\u00a4\u00f9";
                    var5_5 = "|\u00cb\u00d0$S\u009b\u00fa\u00a0\u00fd/\u00e7b\u0010\u0001\u00a4\u00f9".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
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
        oh_1.c = var6_2;
        oh_1.d = new Integer[18];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x784D;
        if (d[n11] == null) {
            oh_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

