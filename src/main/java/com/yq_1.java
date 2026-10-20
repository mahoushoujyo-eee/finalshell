/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.gt_1;
import com.po_0;
import com.wy_1;
import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.yQ
 */
public class yq_1
extends gt_1 {
    private po_0 O = new wy_1();
    private float t = 0.0f;
    private float i = 0.5f;
    private float M = 0.0f;
    private int x = yq_1.a(23965, 4805033606505485566L);
    private Random J;
    private long W = e;
    private int a = 1;
    private float h = 0.5f;
    private int K = 0;
    private boolean r = false;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long e;

    public yq_1() {
        this.J = new Random();
    }

    public void W(int n10) {
        this.a = n10;
    }

    public int q() {
        return this.a;
    }

    public void Z(int n10) {
        this.x = n10;
    }

    public int U() {
        return this.x;
    }

    public void f(float f10) {
        this.i = f10;
    }

    public float A() {
        return this.i;
    }

    public void t(float f10) {
        this.M = f10;
    }

    public float d() {
        return this.M;
    }

    public void U(float f10) {
        this.t = f10;
    }

    public float U() {
        return this.t;
    }

    public void a(float f10) {
        this.h = f10;
    }

    public float Q() {
        return this.h;
    }

    public void o(int n10) {
        this.K = n10;
    }

    public int v() {
        return this.K;
    }

    public void Z(boolean bl) {
        this.r = bl;
    }

    public boolean G() {
        return this.r;
    }

    public void n() {
        this.W = new Date().getTime();
    }

    private float n(float f10, float f11) {
        return f10 + (f11 - f10) * this.J.nextFloat();
    }

    /*
     * Exception decompiling
     */
    @Override
    protected int[] K(int var1_1, int var2_2, int[] var3_3, Rectangle var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE], 7[DOLOOP]], but top level block is 8[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    public String toString() {
        return b;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "Fu'\bICJ,@,\bKE\u0017-=".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 15;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 12;
                            break;
                        }
                        case 1: {
                            n17 = 28;
                            break;
                        }
                        case 2: {
                            n17 = 78;
                            break;
                        }
                        case 3: {
                            n17 = 98;
                            break;
                        }
                        case 4: {
                            n17 = 37;
                            break;
                        }
                        case 5: {
                            n17 = 56;
                            break;
                        }
                        default: {
                            n17 = 54;
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
        b = new String(cArray).intern();
        long l2 = 5776289087962842112L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u00e9\u009f\u00beD\u0095D\u001d\u0081\u00f2]ot&oP\u00f6|\u009cX\u00d9\u00a4\u0092\t\u0016";
        int n19 = "\u00e9\u009f\u00beD\u0095D\u001d\u0081\u00f2]ot&oP\u00f6|\u009cX\u00d9\u00a4\u0092\t\u0016".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        c = lArray;
        d = new Integer[3];
        long l3 = 1965613845076084500L;
        e = 0x1B474360B9598523L ^ l3;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x962;
        if (d[n11] == null) {
            yq_1.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

