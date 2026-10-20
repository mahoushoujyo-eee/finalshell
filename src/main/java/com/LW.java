/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GO;
import com.kc_1;
import com.ko_2;
import com.lz_0;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class LW
extends lz_0 {
    protected float[] G;
    protected Color[] Z;
    protected Color[] z;
    final kc_1 N;
    private static final long a;

    public LW(kc_1 kc_12) {
        this.N = kc_12;
        this.G = new float[]{0.0f, 0.25f, 0.75f, 1.0f};
        this.Z = new Color[]{GO.l, Color.WHITE, Color.WHITE, GO.l};
        this.z = new Color[]{GO.l, Color.GRAY, Color.GRAY, GO.l};
    }

    public Boolean v(ko_2 ko_22) {
        return true;
    }

    /*
     * Exception decompiling
     */
    public void N(Graphics2D var1_1, Rectangle var2_2, ko_2 var3_3) {
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
    public Boolean d(JComponent jComponent) {
        return this.v((ko_2)jComponent);
    }

    @Override
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.N(graphics2D, rectangle, (ko_2)jComponent);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8579087173977071657L;
        a = 0x6D8C0DEFAE03602EL ^ l2;
    }
}

