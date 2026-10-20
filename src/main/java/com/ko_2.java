/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.LW;
import com.ON;
import com.c4_0;
import com.cc_2;
import com.kc_1;
import com.ky_2;
import com.uY;
import java.awt.Component;

/*
 * Renamed from com.ko
 */
public class ko_2
extends ky_2 {
    private final c4_0 C;
    private boolean p;
    private boolean b;
    final kc_1 V;
    private static final long[] a;
    private static final Integer[] c;

    public ko_2(kc_1 kc_12) {
        this.V = kc_12;
        this.p = false;
        this.b = false;
        this.Q();
        this.L(new LW(kc_12));
        uY uY2 = new uY(this, kc_12);
        this.addMouseListener(uY2);
        this.addMouseMotionListener(uY2);
        this.C = new cc_2(this, true, kc_12);
        ON.b(this, this.C);
    }

    /*
     * Exception decompiling
     */
    public void Q() {
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

    public boolean a() {
        return this.b;
    }

    public boolean O() {
        return this.p;
    }

    public Component I() {
        return this.getComponent(0);
    }

    public int L() {
        return this.V.v().z(this);
    }

    static boolean r(ko_2 ko_22, boolean bl) {
        ko_22.p = bl;
        return ko_22.p;
    }

    static boolean Q(ko_2 ko_22) {
        return ko_22.p;
    }

    static boolean R(ko_2 ko_22, boolean bl) {
        ko_22.b = bl;
        return ko_22.b;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6095273514244250006L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00e0\u00cd\u0005hYk(\u00f2\u0096\u00f9\u00a1W\u00afe\u00f1d";
        int n11 = "\u00e0\u00cd\u0005hYk(\u00f2\u0096\u00f9\u00a1W\u00afe\u00f1d".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6FE3;
        if (c[n11] == null) {
            ko_2.c[n11] = (int)(a[n11] ^ l2);
        }
        return c[n11];
    }
}

