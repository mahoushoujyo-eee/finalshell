/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import com.ky_2;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.P;
import org.l.F;

public class u
implements Iterator {
    private final Iterator D;
    private Iterator E;
    private static final String a;

    public u(Iterator[] iteratorArray) {
        this.E = Collections.emptyList().iterator();
        this.D = Arrays.asList(iteratorArray).iterator();
    }

    public u(Collection[] collectionArray) {
        this.E = Collections.emptyList().iterator();
        this.D = Arrays.asList(collectionArray).iterator();
    }

    public u(Object[][] objectArray) {
        this.E = Collections.emptyList().iterator();
        this.D = Arrays.asList(objectArray).iterator();
    }

    public u(Collection collection) {
        this.E = Collections.emptyList().iterator();
        this.D = collection.iterator();
    }

    public u(Iterator iterator) {
        this.E = Collections.emptyList().iterator();
        this.D = iterator;
    }

    public u(Object[] objectArray) {
        this.E = Collections.emptyList().iterator();
        this.D = Arrays.asList(objectArray).iterator();
    }

    public u(Object object, Collection collection) {
        this.E = Collections.emptyList().iterator();
        this.D = Arrays.asList(new Object[]{object}, collection).iterator();
    }

    public u(Collection collection, Object object) {
        this.E = Collections.emptyList().iterator();
        this.D = Arrays.asList(collection, new Object[]{object}).iterator();
    }

    public u(Object object, Iterator iterator) {
        this.E = Collections.emptyList().iterator();
        this.D = Arrays.asList(new Object[]{object}, iterator).iterator();
    }

    public u(Iterator iterator, Object object) {
        block4: {
            boolean bl;
            block6: {
                block5: {
                    boolean bl2 = F.s();
                    boolean bl3 = bl2;
                    try {
                        try {
                            this.E = Collections.emptyList().iterator();
                            this.D = Arrays.asList(iterator, new Object[]{object}).iterator();
                            if (ky_2.F() == null) break block4;
                            if (!bl3) break block5;
                        }
                        catch (P p2) {
                            throw u.a(p2);
                        }
                        bl = false;
                        break block6;
                    }
                    catch (P p3) {
                        throw u.a(p3);
                    }
                }
                bl = true;
            }
            F.u(bl);
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [20[DOLOOP]], but top level block is 9[TRYBLOCK]
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
        block5: {
            u u10;
            block4: {
                boolean bl = F.G();
                try {
                    try {
                        u10 = this;
                        if (bl) break block4;
                        if (!u10.hasNext()) break block5;
                    }
                    catch (P p2) {
                        throw u.a(p2);
                    }
                    u10 = this.E.next();
                }
                catch (P p3) {
                    throw u.a(p3);
                }
            }
            return u10;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        this.E.remove();
    }

    private static P a(P p2) {
        return p2;
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
                char[] cArray3 = "_'# UJ1~,\"x@C7g,(,\u0005[+z,fz".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 119;
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
                            n17 = 125;
                            break;
                        }
                        case 1: {
                            n17 = 62;
                            break;
                        }
                        case 2: {
                            n17 = 49;
                            break;
                        }
                        case 3: {
                            n17 = 47;
                            break;
                        }
                        case 4: {
                            n17 = 82;
                            break;
                        }
                        case 5: {
                            n17 = 88;
                            break;
                        }
                        default: {
                            n17 = 37;
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
    }
}

