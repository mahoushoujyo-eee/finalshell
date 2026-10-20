/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GO;
import com.PQ;
import com.ax_0;
import com.ky_2;
import com.oy_0;
import com.sm_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTableHeaderUI;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class WK
extends BasicTableHeaderUI {
    public static final Color Q;
    public static final Color G;
    public static final Color D;
    public static final Color C;
    boolean x = true;
    private static final String a;

    public static ComponentUI createUI(JComponent jComponent) {
        return new WK();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        FN.Y(this.header);
        LookAndFeel.installProperty(this.header, a, Boolean.TRUE);
        this.header.setDefaultRenderer(new oy_0(this));
    }

    @Override
    public void paint(Graphics graphics, JComponent jComponent) {
        TableColumn tableColumn;
        int n10;
        TableColumn tableColumn2;
        TableColumnModel tableColumnModel;
        boolean bl;
        Paint paint;
        Graphics2D graphics2D;
        block22: {
            block27: {
                int n11;
                TableColumn tableColumn3;
                Rectangle rectangle;
                int n12;
                block25: {
                    int n13;
                    int n14;
                    block26: {
                        int n15;
                        block24: {
                            int n16;
                            int n17;
                            block23: {
                                graphics2D = (Graphics2D)graphics;
                                paint = WK.t(0, 1, 0, this.header.getHeight() - 1);
                                bl = PQ.G();
                                graphics2D.setPaint(paint);
                                if (jComponent.isOpaque()) {
                                    // empty if block
                                }
                                graphics2D.setColor(Q);
                                graphics2D.drawLine(0, 0, this.header.getWidth(), 0);
                                graphics2D.setPaint(G);
                                graphics2D.drawLine(0, this.header.getHeight() - 1, this.header.getWidth(), this.header.getHeight() - 1);
                                int n18 = this.header.getColumnModel().getColumnCount();
                                if (bl) {
                                    if (n18 <= 0) {
                                        return;
                                    }
                                    n18 = this.header.getComponentOrientation().isLeftToRight() ? 1 : 0;
                                }
                                n15 = n18;
                                Rectangle rectangle2 = graphics.getClipBounds();
                                Point point = rectangle2.getLocation();
                                Point point2 = new Point(rectangle2.x + rectangle2.width - 1, rectangle2.y);
                                tableColumnModel = this.header.getColumnModel();
                                n12 = this.header.columnAtPoint(n15 != 0 ? point : point2);
                                n14 = this.header.columnAtPoint(n15 != 0 ? point2 : point);
                                n17 = n12;
                                n16 = -1;
                                if (bl) {
                                    if (n17 == n16) {
                                        n12 = 0;
                                    }
                                    n17 = n14;
                                    n16 = -1;
                                }
                                if (!bl) break block23;
                                if (n17 != n16) break block24;
                                n17 = tableColumnModel.getColumnCount();
                                n16 = 1;
                            }
                            n14 = n17 - n16;
                        }
                        tableColumn2 = this.header.getDraggedColumn();
                        int n19 = n15;
                        if (bl) {
                            n19 = n19 != 0 ? n12 : n14;
                        }
                        rectangle = this.header.getHeaderRect(n19);
                        n13 = n15;
                        if (!bl) break block25;
                        if (n13 == 0) break block26;
                        n10 = n12;
                        while (n10 <= n14) {
                            tableColumn3 = tableColumnModel.getColumn(n10);
                            rectangle.width = n11 = tableColumn3.getWidth();
                            if (bl) {
                                tableColumn = tableColumn3;
                                if (!bl) break block22;
                                if (tableColumn != tableColumn2) {
                                    this.D(graphics, rectangle, n10, tableColumn3, tableColumn2, tableColumnModel);
                                }
                                rectangle.x += n11;
                                ++n10;
                            }
                            if (bl) continue;
                        }
                        if (bl) break block27;
                    }
                    n13 = n10 = n14;
                }
                while (n10 >= n12) {
                    tableColumn3 = tableColumnModel.getColumn(n10);
                    rectangle.width = n11 = tableColumn3.getWidth();
                    if (bl) {
                        tableColumn = tableColumn3;
                        if (!bl) break block22;
                        if (tableColumn != tableColumn2) {
                            this.D(graphics, rectangle, n10, tableColumn3, tableColumn2, tableColumnModel);
                        }
                        rectangle.x += n11;
                        --n10;
                    }
                    if (bl) continue;
                }
            }
            tableColumn = tableColumn2;
        }
        if (tableColumn != null) {
            n10 = this.H(tableColumn2);
            Rectangle rectangle = this.header.getHeaderRect(n10);
            rectangle.x += this.header.getDraggedDistance();
            graphics2D.setPaint(paint);
            this.D(graphics, rectangle, n10, tableColumn2, tableColumn2, tableColumnModel);
        }
        if (ky_2.F() != null) {
            PQ.N(!bl);
        }
    }

    public static Paint t(int n10, int n11, int n12, int n13) {
        block4: {
            Color color;
            block2: {
                block3: {
                    boolean bl = PQ.G();
                    color = C;
                    if (!bl) break block2;
                    if (color == null) break block3;
                    color = D;
                    if (!bl) break block2;
                    if (!ax_0.Z(color, new Object[]{C})) break block4;
                }
                color = D;
            }
            return color;
        }
        return new GradientPaint(n10, n11, D, n12, n13, C);
    }

    private void D(Graphics graphics, Rectangle rectangle, int n10, TableColumn tableColumn, TableColumn tableColumn2, TableColumnModel tableColumnModel) {
        block5: {
            block6: {
                int n11;
                block7: {
                    block8: {
                        int n12 = this.header.getComponentOrientation().isLeftToRight();
                        boolean bl = PQ.G();
                        WK wK = this;
                        if (bl) {
                            if (wK.x) {
                                graphics.setColor(GO.N);
                                graphics.drawLine(rectangle.x - 1, rectangle.y + 2, rectangle.x - 1, rectangle.y + rectangle.height - 4);
                            }
                            wK = this;
                        }
                        JComponent jComponent = (JComponent)wK.L(n10);
                        jComponent.setEnabled(this.header.getTable().isEnabled());
                        this.rendererPane.paintComponent(graphics, jComponent, this.header, rectangle.x, rectangle.y, rectangle.width, rectangle.height, true);
                        if (!this.x) break block5;
                        if (tableColumn == tableColumn2) break block6;
                        n11 = n12;
                        if (!bl) break block7;
                        if (n11 == 0) break block8;
                        if (n10 == tableColumnModel.getColumnCount() - 1) break block5;
                        break block6;
                    }
                    n11 = n10;
                }
                if (n11 == 0) break block5;
            }
            graphics.setColor(sm_0.h);
            graphics.drawLine(rectangle.x + rectangle.width - 1, rectangle.y + 2, rectangle.x + rectangle.width - 1, rectangle.y + rectangle.height - 4);
        }
    }

    /*
     * Exception decompiling
     */
    private Component L(int var1_1) {
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

    private int H(TableColumn tableColumn) {
        TableColumnModel tableColumnModel = this.header.getColumnModel();
        boolean bl = PQ.p();
        for (int i2 = 0; i2 < tableColumnModel.getColumnCount(); ++i2) {
            if (tableColumnModel.getColumn(i2) != tableColumn) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public Dimension getPreferredSize(JComponent jComponent) {
        Dimension dimension = super.getPreferredSize(jComponent);
        dimension.height = Math.max(dimension.height, sm_0.w);
        return dimension;
    }

    public boolean f() {
        return this.x;
    }

    public void H(boolean bl) {
        this.x = bl;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "$p\\D\u0003@".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 124;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 55;
                            break;
                        }
                        case 1: {
                            n17 = 124;
                            break;
                        }
                        case 2: {
                            n17 = 65;
                            break;
                        }
                        case 3: {
                            n17 = 73;
                            break;
                        }
                        case 4: {
                            n17 = 10;
                            break;
                        }
                        case 5: {
                            n17 = 89;
                            break;
                        }
                        default: {
                            n17 = 105;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        Q = sm_0.P;
        G = sm_0.U;
        D = sm_0.b;
        C = sm_0.q;
    }
}

