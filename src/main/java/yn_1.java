/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

/*
 * Renamed from yN
 */
class yn_1
implements MouseListener {
    final aM P;
    final t3_0 R;
    final boolean z;
    final bq_0 h;
    private static final long[] a;
    private static final Long[] b;

    yn_1(bq_0 bq_02, aM aM2, t3_0 t3_02, boolean bl) {
        this.h = bq_02;
        this.P = aM2;
        this.R = t3_02;
        this.z = bl;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void mouseReleased(MouseEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: CONTINUE without a while class org.benf.cfr.reader.bytecode.analysis.parse.statement.TryStatement
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getTargetStartBlock(GotoStatement.java:102)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getStructuredStatement(GotoStatement.java:116)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.getStructuredStatementPlaceHolder(Op03SimpleStatement.java:550)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:727)
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

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        String[] stringArray = aM.s();
        bq_0 bq_02 = (bq_0)this.h;
        if (stringArray == null) {
            if ((Window)bq_02.Q == null) {
                this.h.Q = SwingUtilities.getWindowAncestor((bq_0)this.h);
            }
            this.h.o = mouseEvent.getLocationOnScreen();
            this.h.n = ((bq_0)this.h).getMousePosition();
            this.h.z = true;
            this.h.E = mouseEvent.getButton();
            bq_02 = (bq_0)this.h;
        }
        bq_02.M = System.currentTimeMillis();
        if (stringArray == null) {
            if (mouseEvent.getButton() == 1) {
                try {
                    this.P.k(true);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.P.X(this.R);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            try {
                this.h.c();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.h.N();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.h.C = false;
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        try {
            this.h.r();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.h.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        block29: {
            Object object;
            block30: {
                Object object2;
                Object object3;
                aM aM2;
                boolean bl;
                block28: {
                    Object object4;
                    try {
                        this.h.r();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    String[] stringArray = aM.s();
                    this.h.m = true;
                    String[] stringArray2 = stringArray;
                    try {
                        this.h.N();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        this.h.c();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    this.P;
                    try {
                        object4 = aM.a();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        bl = (Boolean)object4.s();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (stringArray2 != null) break block28;
                    if (!bl) break block29;
                    aM2 = (aM)this.P;
                    if (stringArray2 == null) {
                        try {
                            bl = (Boolean)aM2.p();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block30;
                }
                if (bl) break block29;
                this.P;
                try {
                    object3 = aM.a();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object3.M(true);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                this.P;
                try {
                    object2 = aM.a();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object2.Q(this.P);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                aM2 = (aM)this.P;
            }
            try {
                object = aM.a();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.m(this.h);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5348400469076570630L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "tg!T\u001c\u0014z1It\u00c9C\u00a2\u00d6:v";
        int n11 = "tg!T\u001c\u0014z1It\u00c9C\u00a2\u00d6:v".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Long[2];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x736) & Short.MAX_VALUE;
        if (b[n11] == null) {
            yn_1.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

