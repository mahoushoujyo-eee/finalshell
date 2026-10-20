/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.KE;
import com.a0;
import com.hi_0;
import com.ph_2;
import com.yn_2;
import java.util.ArrayList;

/*
 * Renamed from com.nz
 */
class nz_2
implements a0 {
    private final String[] Y;
    private final long[] u;
    private static final long[] a;
    private static final Integer[] b;

    public nz_2(String[] stringArray) {
        String string = hi_0.C();
        this.Y = stringArray;
        String string2 = string;
        this.u = new long[stringArray.length];
        for (int i2 = 0; i2 < this.u.length; ++i2) {
            this.u[i2] = B8.z(stringArray[i2]);
            if (string2 == null) continue;
        }
    }

    @Override
    public Object Y(ph_2 ph_22, Object object, Object object2) {
        ArrayList<Object> arrayList;
        block4: {
            ArrayList<Object> arrayList2 = new ArrayList<Object>(this.Y.length);
            String string = hi_0.C();
            for (int i2 = 0; i2 < this.Y.length; ++i2) {
                Object object3 = ph_22.S(object2, this.Y[i2], this.u[i2]);
                try {
                    arrayList = arrayList2;
                    if (string == null) {
                        arrayList.add(object3);
                        if (string == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (hi_0 hi_02) {
                    throw nz_2.a(hi_02);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void Z(ph_2 var1_1, yn_2 var2_2, KE var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[CASE]], but top level block is 5[TRYBLOCK]
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

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6358231305111882396L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00af\u00e1\u009a\u00e0!\u001a\u0099Q\u0016?2\u008defM\u0092";
        int n11 = "\u00af\u00e1\u009a\u00e0!\u001a\u0099Q\u0016?2\u008defM\u0092".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x23D;
        if (b[n11] == null) {
            nz_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

