/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class WE
implements Runnable {
    final qg_0 W;
    private static final long a;

    WE(qg_0 qg_02) {
        this.W = qg_02;
    }

    @Override
    public void run() {
        String string = vn_0.C();
        while (true) {
            block17: {
                try {
                    boolean bl;
                    Object object;
                    Object object2;
                    yf_0 yf_02;
                    Object object3;
                    try {
                        object3 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        yf_02 = (yf_0)object3.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (yf_02 == null) break block17;
                    try {
                        object2 = yt_1.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        object = object2.g();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    try {
                        bl = (Boolean)object.A();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl) break;
                }
                catch (InterruptedException interruptedException) {
                    throw WE.a(interruptedException);
                }
            }
            try {
                Thread.sleep(a);
                continue;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                if (string != null) break;
                continue;
            }
            break;
        }
        try {
            this.W.d();
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
        long l2 = 3805953201902328409L;
        a = 0x34D17645B7261A5AL ^ l2;
    }
}

