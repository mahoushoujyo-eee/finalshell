/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class M
implements FocusListener,
MouseListener {
    private Boolean k;
    private Boolean m;
    private Component p;
    private boolean W = false;
    private boolean o = false;

    public static void I(Component component, Component component2, Boolean bl, Boolean bl2) {
        M m10 = new M(component2, bl, bl2);
        int[] nArray = WC.V();
        Boolean bl3 = bl;
        if (nArray == null) {
            if (bl3 != null) {
                component.addFocusListener(m10);
            }
            bl3 = bl2;
        }
        if (bl3 != null) {
            component.addMouseListener(m10);
        }
    }

    public M(Component component) {
        this(component, null, null);
    }

    public M(Component component, Boolean bl, Boolean bl2) {
        this.W(component);
        this.C(bl);
        this.q(bl2);
    }

    public Boolean P() {
        return this.k;
    }

    public void C(Boolean bl) {
        this.k = bl;
    }

    public Boolean W() {
        return this.m;
    }

    public void q(Boolean bl) {
        this.m = bl;
    }

    public Component Y() {
        return this.p;
    }

    public void W(Component component) {
        this.p = component;
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        block3: {
            M m10;
            block2: {
                int[] nArray = WC.V();
                m10 = this;
                if (nArray != null) break block2;
                if (m10.k == null) break block3;
                this.W = true;
                m10 = this;
            }
            m10.n();
        }
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        block3: {
            M m10;
            block2: {
                int[] nArray = WC.V();
                m10 = this;
                if (nArray != null) break block2;
                if (m10.k == null) break block3;
                this.W = false;
                m10 = this;
            }
            m10.n();
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        block3: {
            M m10;
            block2: {
                int[] nArray = WC.V();
                m10 = this;
                if (nArray != null) break block2;
                if (m10.m == null) break block3;
                this.o = true;
                m10 = this;
            }
            m10.n();
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        block3: {
            M m10;
            block2: {
                int[] nArray = WC.V();
                m10 = this;
                if (nArray != null) break block2;
                if (m10.m == null) break block3;
                this.o = false;
                m10 = this;
            }
            m10.n();
        }
    }

    public void n() {
        this.p.setVisible(this.g());
    }

    /*
     * Exception decompiling
     */
    public boolean g() {
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
}

