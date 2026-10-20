/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;

class V8
implements Runnable {
    final bt_1 s;
    private static final long a;

    V8(bt_1 bt_12) {
        this.s = bt_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        cs_1 cs_12;
        block22: {
            ky_2[] ky_2Array;
            block21: {
                ky_2Array = yt_1.c();
                while (true) {
                    boolean bl;
                    try {
                        bl = (Boolean)this.s.j.V.A();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl) break;
                    try {
                        Thread.sleep(a);
                        if (ky_2Array != null) {
                            continue;
                        }
                        break block21;
                    }
                    catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                        if (ky_2Array == null) break;
                        continue;
                    }
                    break;
                }
                this.s.j.J = new KQ((Window)((JDialog)U.b));
                U.y = this.s.j.J;
                this.s.j.m = this.s.j;
            }
            try {
                try {
                    boolean bl;
                    Object object;
                    Object object2;
                    cs_12 = (yt_1)this.s.j;
                    if (ky_2Array == null) break block22;
                    try {
                        object2 = yt_1.W(cs_12);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object = object2.X();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        bl = (Boolean)lk_0.Y(object);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl) return;
                }
                catch (InterruptedException interruptedException) {
                    throw V8.a(interruptedException);
                }
                xI.u = new op_0();
                try {
                    this.s.j.m.P();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                cs_12 = (cs_1)this.s.j.m;
            }
            catch (InterruptedException interruptedException) {
                throw V8.a(interruptedException);
            }
        }
        try {
            cs_12.v();
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7014986197023391717L;
        a = 0x615A3CC779D8FFEFL ^ l2;
    }
}

