/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QG;
import com.lz_0;
import com.nj_1;
import com.rl_2;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/*
 * Renamed from com.Ln
 */
class ln_0
extends lz_0 {
    private static final float[] D;
    private static final Color[] W;
    private static final long[] a;
    private static final Integer[] b;

    private ln_0() {
    }

    /*
     * Exception decompiling
     */
    public void B(Graphics2D var1_1, Rectangle var2_2, QG var3_3) {
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
    public void u(Graphics2D graphics2D, Rectangle rectangle, JComponent jComponent) {
        this.B(graphics2D, rectangle, (QG)jComponent);
    }

    ln_0(rl_2 rl_22) {
        this();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1779289978631629666L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00a0\u00d1.\u00d6D \u00ae\u00c9\"\u0098.\u00abs\u00b0>\nia\u00fc\u00f7y\u00cd\u00ee\u00f3";
        int n11 = "\u00a0\u00d1.\u00d6D \u00ae\u00c9\"\u0098.\u00abs\u00b0>\nia\u00fc\u00f7y\u00cd\u00ee\u00f3".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
        D = new float[]{0.0f, 0.5f};
        W = new Color[]{nj_1.o, nj_1.m};
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7DDA;
        if (b[n11] == null) {
            ln_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

