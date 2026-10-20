/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.T4;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TJ
extends T4 {
    protected int d;
    protected boolean r;

    public TJ() {
        this(2);
    }

    public TJ(int n10) {
        this(n10, false);
    }

    public TJ(int n10, boolean bl) {
        this.d = n10;
        this.r = bl;
    }

    public int d() {
        return this.d;
    }

    public void c(int n10) {
        this.d = n10;
    }

    public boolean d() {
        return this.r;
    }

    public void X(boolean bl) {
        this.r = bl;
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        return this.Q(container, false);
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        return this.Q(container, true);
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

    protected Dimension Q(Container container, boolean bl) {
        Container container2;
        Dimension dimension;
        block4: {
            int n10 = container.getComponentCount();
            int n11 = T4.O();
            dimension = new Dimension(0, 0);
            int n12 = 0;
            while (n12 < n10) {
                container2 = container;
                if (n11 == 0) {
                    Component component = container2.getComponent(n12);
                    Dimension dimension2 = bl ? component.getMinimumSize() : component.getPreferredSize();
                    dimension.height = Math.max(dimension2.height, dimension.height);
                    dimension.width += dimension2.width;
                    if (n11 == 0) {
                        if (n12 != 0) {
                            dimension.width += this.d();
                        }
                        ++n12;
                    }
                    if (n11 == 0) continue;
                }
                break block4;
            }
            container2 = container;
        }
        Insets insets = container2.getInsets();
        dimension.width += insets.left + insets.right;
        dimension.height += insets.top + insets.bottom;
        return dimension;
    }
}

