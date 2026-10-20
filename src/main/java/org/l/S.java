/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.l.D;
import org.l.F;
import org.l.p;

public class S
implements Iterator {
    private final Iterator[] g;
    private static final Iterator S;
    private static final String a;

    public S(Iterator iterator, int n10) {
        boolean bl = F.s();
        this.g = new Iterator[n10];
        this.g[0] = iterator;
        boolean bl2 = bl;
        for (int i2 = 1; i2 < n10; ++i2) {
            this.g[i2] = S;
            if (bl2) continue;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean hasNext() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [40[DOLOOP]], but top level block is 41[SIMPLE_IF_TAKEN]
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

    public Object next() {
        S s2;
        block4: {
            block5: {
                boolean bl = F.G();
                try {
                    try {
                        s2 = this;
                        if (bl) break block4;
                        if (s2.hasNext()) break block5;
                    }
                    catch (D d2) {
                        throw org.l.S.a(d2);
                    }
                    throw new NoSuchElementException();
                }
                catch (D d3) {
                    throw org.l.S.a(d3);
                }
            }
            s2 = this.g[this.g.length - 1].next();
        }
        S s3 = s2;
        return s3;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(a);
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
                char[] cArray3 = "\f`\u000eHr\u0010".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 64;
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
                            n17 = 62;
                            break;
                        }
                        case 1: {
                            n17 = 69;
                            break;
                        }
                        case 2: {
                            n17 = 35;
                            break;
                        }
                        case 3: {
                            n17 = 103;
                            break;
                        }
                        case 4: {
                            n17 = 68;
                            break;
                        }
                        case 5: {
                            n17 = 53;
                            break;
                        }
                        default: {
                            n17 = 81;
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
        S = new p();
    }

    private static D a(D d2) {
        return d2;
    }
}

