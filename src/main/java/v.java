/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class v
implements Runnable {
    HashMap o;
    HashMap c;
    boolean z = false;
    Object D = new Object();
    Thread m;
    long u = 0L;
    LinkedBlockingQueue Z = new LinkedBlockingQueue();

    public v() {
        this.o = new HashMap();
        this.c = new HashMap();
        this.m = new Thread(this);
        this.m.start();
    }

    public void p(qu_0 qu_02, int n10) {
        cd_0 cd_02 = new cd_0(qu_02, n10);
        cd_02.V(this.k(qu_02));
        this.Z.add(cd_02);
    }

    long k(qu_0 qu_02) {
        int n10 = (int)((float)qu_02.P.E * yh_0.o);
        long l2 = System.currentTimeMillis() + (long)qu_02.P.E + (long)n10;
        return l2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }
}

