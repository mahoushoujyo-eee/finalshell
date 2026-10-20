/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

/*
 * Renamed from gm
 */
class gm_0
implements Runnable {
    final boolean v;
    final m6 J;
    private static final long a;

    gm_0(m6 m62, boolean bl) {
        this.J = m62;
        this.v = bl;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        U u10;
        block16: {
            long l2 = System.currentTimeMillis();
            String[] stringArray = F8.y();
            while (true) {
                block15: {
                    boolean bl;
                    Object object;
                    try {
                        object = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        bl = (Boolean)object.k();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (!bl) break block15;
                    try {
                        boolean bl2;
                        block17: {
                            u10 = (U)this.J.K;
                            if (stringArray != null) break block16;
                            break block17;
                            catch (InterruptedException interruptedException) {
                                throw gm_0.a(interruptedException);
                            }
                        }
                        try {
                            bl2 = (Boolean)u10.l();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (bl2) break;
                    }
                    catch (InterruptedException interruptedException) {
                        throw gm_0.a(interruptedException);
                    }
                }
                try {
                    Thread.sleep(a);
                    continue;
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                    if (stringArray != null) break;
                    continue;
                }
                break;
            }
            SwingUtilities.invokeLater(new YW(this));
            u10 = (U)this.J.K;
        }
        try {
            u10.a(this.v);
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
        long l2 = 523192404160442864L;
        a = 0x742C0B8372A71F2L ^ l2;
    }
}

