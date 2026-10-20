/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.F.c;
import org.T.a;
import org.l.F;
import org.l.M;

class E
implements Iterator {
    M K;
    @c
    Object h;
    final Iterator n;
    final a C;

    E(Iterator iterator, a a10) {
        this.n = iterator;
        this.C = a10;
        this.K = M.DEFAULT;
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean hasNext() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[SWITCH]
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

    @c
    public Object next() {
        Object object;
        block4: {
            block5: {
                boolean bl = F.G();
                try {
                    try {
                        object = this;
                        if (bl) break block4;
                        if (((E)object).hasNext()) break block5;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        throw E.a(noSuchElementException);
                    }
                    throw new NoSuchElementException();
                }
                catch (NoSuchElementException noSuchElementException) {
                    throw E.a(noSuchElementException);
                }
            }
            this.K = M.DEFAULT;
            object = this.h;
        }
        E e2 = object;
        this.h = null;
        return e2;
    }

    @Override
    public void remove() {
        this.n.remove();
    }

    private static NoSuchElementException a(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
    }
}

