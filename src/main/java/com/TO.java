/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T4;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

public class TO
extends T4 {
    protected int Y;
    protected int s;
    protected int d;
    protected boolean Q;
    protected boolean j;

    public TO() {
        this(0, 0, 0, true, false);
    }

    public TO(boolean bl, boolean bl2) {
        this(0, 0, 0, bl, bl2);
    }

    public TO(int n10, int n11) {
        this(0, n10, n11, true, false);
    }

    public TO(int n10, int n11, int n12) {
        this(n10, n11, n12, true, false);
    }

    public TO(int n10) {
        this(n10, 0, 0, true, false);
    }

    public TO(int n10, boolean bl, boolean bl2) {
        this(n10, 0, 0, bl, bl2);
    }

    public TO(int n10, int n11, boolean bl, boolean bl2) {
        this(0, n10, n11, bl, bl2);
    }

    public TO(int n10, int n11, int n12, boolean bl, boolean bl2) {
        this.Y = n10;
        this.s = n11;
        this.d = n12;
        this.Q = bl;
        this.j = bl2;
    }

    public void J(int n10) {
        this.s = n10;
    }

    public void Z(int n10) {
        this.d = n10;
    }

    public void r(boolean bl) {
        this.j = bl;
    }

    public void t(boolean bl) {
        this.Q = bl;
    }

    public int m() {
        return this.s;
    }

    public int V() {
        return this.d;
    }

    public boolean d() {
        return this.j;
    }

    public boolean i() {
        return this.Q;
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        Container container2;
        Dimension dimension;
        block6: {
            dimension = new Dimension(0, 0);
            int n10 = T4.b();
            int n11 = 0;
            while (n11 < container.getComponentCount()) {
                container2 = container;
                if (n10 != 0) {
                    Component component = container2.getComponent(n11);
                    if (n10 != 0) {
                        if (component.isVisible()) {
                            Dimension dimension2 = component.getPreferredSize();
                            Dimension dimension3 = dimension;
                            int n12 = Math.max(dimension.width, dimension2.width);
                            if (n10 != 0) {
                                dimension3.width = n12;
                                if (n11 > 0) {
                                    dimension.height += this.d;
                                }
                                Dimension dimension4 = dimension;
                                dimension3 = dimension4;
                                n12 = dimension4.height + dimension2.height;
                            }
                            dimension3.height = n12;
                        }
                        ++n11;
                    }
                    if (n10 != 0) continue;
                }
                break block6;
            }
            container2 = container;
        }
        Insets insets = container2.getInsets();
        dimension.width += insets.left + insets.right;
        dimension.height += insets.top + insets.bottom;
        return dimension;
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        Container container2;
        Dimension dimension;
        block6: {
            dimension = new Dimension(0, 0);
            int n10 = 0;
            int n11 = T4.O();
            while (n10 < container.getComponentCount()) {
                container2 = container;
                if (n11 == 0) {
                    Component component = container2.getComponent(n10);
                    if (n11 == 0) {
                        if (component.isVisible()) {
                            Dimension dimension2 = component.getMinimumSize();
                            Dimension dimension3 = dimension;
                            int n12 = Math.max(dimension.width, dimension2.width);
                            if (n11 == 0) {
                                dimension3.width = n12;
                                if (n10 > 0) {
                                    dimension.height += this.d;
                                }
                                Dimension dimension4 = dimension;
                                dimension3 = dimension4;
                                n12 = dimension4.height + dimension2.height;
                            }
                            dimension3.height = n12;
                        }
                        ++n10;
                    }
                    if (n11 == 0) continue;
                }
                break block6;
            }
            container2 = container;
        }
        Insets insets = container2.getInsets();
        dimension.width += insets.left + insets.right;
        dimension.height += insets.top + insets.bottom;
        return dimension;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void layoutContainer(Container var1_1) {
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

    protected int m(Container container) {
        int n10;
        block4: {
            int n11 = 0;
            int n12 = 0;
            int n13 = T4.b();
            while (n12 < container.getComponentCount()) {
                n11 += container.getComponent((int)n12).getPreferredSize().height;
                if (n13 != 0) {
                    n10 = n12;
                    if (n13 == 0) break block4;
                    if (n10 < container.getComponentCount() - 1) {
                        n11 += this.d;
                    }
                    ++n12;
                }
                if (n13 != 0) continue;
            }
            n10 = n11;
        }
        return n10;
    }
}

