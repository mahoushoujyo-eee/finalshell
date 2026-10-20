/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/*
 * Renamed from Kq
 */
class kq_0
implements Runnable {
    final DefaultMutableTreeNode u;
    final tf_2 q;
    final DefaultMutableTreeNode J;
    final boolean R;
    final TreePath v;
    final String E;
    final boolean y;
    final a3 r;
    private static final long a;

    kq_0(a3 a32, DefaultMutableTreeNode defaultMutableTreeNode, tf_2 tf_22, DefaultMutableTreeNode defaultMutableTreeNode2, boolean bl, TreePath treePath, String string, boolean bl2) {
        this.r = a32;
        this.u = defaultMutableTreeNode;
        this.q = tf_22;
        this.J = defaultMutableTreeNode2;
        this.R = bl;
        this.v = treePath;
        this.E = string;
        this.y = bl2;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        String string;
        block59: {
            int[] nArray = a3.I();
            try {
                a3 a32;
                block58: {
                    String string2;
                    block56: {
                        block57: {
                            kq_0 kq_02;
                            block52: {
                                block53: {
                                    String string3;
                                    boolean bl;
                                    block54: {
                                        block55: {
                                            block63: {
                                                boolean bl2;
                                                block50: {
                                                    block51: {
                                                        block61: {
                                                            block60: {
                                                                try {
                                                                    this.r.w(this.u, this.q, true, (Object)false, this.J, false);
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                                try {
                                                                    bl2 = (Boolean)this.r.J(this.q);
                                                                }
                                                                catch (InvocationTargetException invocationTargetException) {
                                                                    throw invocationTargetException.getTargetException();
                                                                }
                                                                if (nArray == null) break block50;
                                                                if (!bl2) break block51;
                                                                break block60;
                                                                catch (InterruptedException interruptedException) {
                                                                    throw kq_0.a(interruptedException);
                                                                }
                                                            }
                                                            try {
                                                                bl2 = (Boolean)this.q.z();
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                            if (nArray == null) break block50;
                                                            break block61;
                                                            catch (InterruptedException interruptedException) {
                                                                throw kq_0.a(interruptedException);
                                                            }
                                                        }
                                                        try {
                                                            block62: {
                                                                if (bl2) break block51;
                                                                break block62;
                                                                catch (InterruptedException interruptedException) {
                                                                    throw kq_0.a(interruptedException);
                                                                }
                                                            }
                                                            try {
                                                                this.r.o.c(false);
                                                            }
                                                            catch (InvocationTargetException invocationTargetException) {
                                                                throw invocationTargetException.getTargetException();
                                                            }
                                                        }
                                                        catch (InterruptedException interruptedException) {
                                                            throw kq_0.a(interruptedException);
                                                        }
                                                    }
                                                    try {
                                                        String string4;
                                                        kq_02 = this;
                                                        if (nArray == null) break block52;
                                                        try {
                                                            string4 = (String)this.q.k();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        bl2 = ((HashSet)kq_02.r.T).contains(string4);
                                                    }
                                                    catch (InterruptedException interruptedException) {
                                                        throw kq_0.a(interruptedException);
                                                    }
                                                }
                                                if (!bl2) break block53;
                                                bl = this.R;
                                                if (nArray == null) break block53;
                                                break block63;
                                                catch (InterruptedException interruptedException) {
                                                    throw kq_0.a(interruptedException);
                                                }
                                            }
                                            try {
                                                boolean bl3;
                                                block64: {
                                                    if (!bl) break block54;
                                                    break block64;
                                                    catch (InterruptedException interruptedException) {
                                                        throw kq_0.a(interruptedException);
                                                    }
                                                }
                                                try {
                                                    bl3 = (Boolean)this.q.z();
                                                }
                                                catch (InvocationTargetException invocationTargetException) {
                                                    throw invocationTargetException.getTargetException();
                                                }
                                                if (!bl3) break block55;
                                            }
                                            catch (InterruptedException interruptedException) {
                                                throw kq_0.a(interruptedException);
                                            }
                                            try {
                                                Thread.sleep(a);
                                            }
                                            catch (InterruptedException interruptedException) {
                                                // empty catch block
                                            }
                                        }
                                        SwingUtilities.invokeLater(new nm_0(this));
                                    }
                                    try {
                                        string3 = (String)this.q.k();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    bl = ((HashSet)this.r.T).remove(string3);
                                }
                                kq_02 = this;
                            }
                            string2 = (String)kq_02.E;
                            if (nArray == null) break block56;
                            try {
                                block65: {
                                    if (string2 == null) break block57;
                                    break block65;
                                    catch (InterruptedException interruptedException) {
                                        throw kq_0.a(interruptedException);
                                    }
                                }
                                try {
                                    this.r.X(this.E, this.y);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            catch (InterruptedException interruptedException) {
                                throw kq_0.a(interruptedException);
                            }
                        }
                        try {
                            a32 = (a3)this.r;
                            if (nArray == null) break block58;
                            string2 = (String)a32.E;
                        }
                        catch (InterruptedException interruptedException) {
                            throw kq_0.a(interruptedException);
                        }
                    }
                    try {
                        if (string2 == null) break block59;
                        try {
                            this.r.h.Z(this.r.E);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        a32 = (a3)this.r;
                    }
                    catch (InterruptedException interruptedException) {
                        throw kq_0.a(interruptedException);
                    }
                }
                a32.E = null;
            }
            catch (Exception exception) {
                String string5;
                try {
                    string5 = (String)this.q.k();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((HashSet)this.r.Z).remove(string5);
            }
        }
        try {
            string = (String)this.q.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        ((HashSet)this.r.P).remove(string);
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5785613971342639345L;
        a = 0x504AA140E16A4095L ^ l2;
    }
}

