/*
 * Decompiled with CFR 0.152.
 */
import com.DI;
import com.c;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.HashMap;

/*
 * Renamed from ca
 */
public class ca_2 {
    WatchService u;
    String S;
    HashMap Y;
    HashMap C;
    Object y;
    private static final long[] a;
    private static final Long[] b;

    static void y() {
        block11: {
            long l2;
            block12: {
                Object object;
                long l3;
                block9: {
                    boolean bl;
                    block10: {
                        Object object2;
                        bl = F6.i();
                        long l4 = DI.ia - 0L;
                        l3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (!bl) break block9;
                        if (l3 <= 0) break block10;
                        try {
                            object2 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object2.v();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        DI.ia = 0L;
                        if (bl) break block11;
                    }
                    l2 = DI.J;
                    if (!bl) break block12;
                    long l5 = l2 - 0L;
                    l3 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
                }
                if (l3 <= 0) break block11;
                try {
                    object = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object.P();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                l2 = 0L;
            }
            DI.J = l2;
        }
    }

    public ca_2() throws IOException {
        this.S = dd_1.c;
        this.Y = new HashMap();
        this.C = new HashMap();
        this.y = new Object();
        this.u = FileSystems.getDefault().newWatchService();
        Path path = Paths.get((String)this.S, new String[0]);
        WatchKey watchKey = path.register((WatchService)this.u, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_CREATE);
        try {
            yt_1.F.J(new QZ(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            yt_1.F.J(new gM(this));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void U() {
        Object object = this.y;
        synchronized (object) {
            boolean bl = F6.i();
            for (String string : ((HashMap)this.C).keySet()) {
                YI yI = (YI)((HashMap)this.C).get(string);
                if (!bl) break;
                if (bl) {
                    long l2;
                    try {
                        l2 = (Long)yI.R();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (System.currentTimeMillis() - l2 > ca_2.a(23198, 8419433224076059951L)) {
                        Object object2;
                        Object object3;
                        try {
                            yI.B();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object3 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object2 = object3.E();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object2.z(yI);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        ((HashMap)this.C).remove(string);
                        try {
                            yI.w(new CZ(this, yI, string));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                } else if (bl) break;
                if (bl) continue;
            }
            return;
        }
    }

    public void l(String string, YI yI) {
        String string2 = new File(string).getAbsolutePath();
        ((HashMap)this.Y).put(string2, yI);
    }

    /*
     * Exception decompiling
     */
    public void O() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l2 = 7912007353809633475L;
        long l3 = 0x33453121C81A000BL ^ l2;
        long l4 = 375315575166384396L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "q\u00e2\u00b6n3Z_\u00cb\u001b\u00d9R\u0081\u00db\u00a5\u00816";
        int n11 = "q\u00e2\u00b6n3Z_\u00cb\u001b\u00d9R\u0081\u00db\u00a5\u00816".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l4;
        } while (n12 < n11);
        a = lArray;
        b = new Long[2];
        DI.W();
        try {
            yt_1.F.V((Object)new BG(), (int)l3);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x3FB1) & Short.MAX_VALUE;
        if (b[n11] == null) {
            ca_2.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

