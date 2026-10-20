/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class OW
implements Runnable {
    final ln_0 l;
    private static final long a;

    OW(ln_0 ln_02) {
        this.l = ln_02;
    }

    @Override
    public void run() {
        block24: {
            Object object;
            Object object2;
            block23: {
                U5 u52;
                Object object3;
                boolean bl = ln_2.i();
                try {
                    boolean bl2;
                    try {
                        bl2 = (Boolean)this.l.v();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (!bl2) {
                        return;
                    }
                }
                catch (Exception exception) {
                    throw OW.a(exception);
                }
                try {
                    object3 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    u52 = (U5)object3.P();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                U5 u53 = u52;
                int n10 = (int)a;
                try {
                    long l2;
                    if (!bl) break block23;
                    try {
                        l2 = (Long)u53.n();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (System.currentTimeMillis() - l2 <= (long)n10) break block24;
                }
                catch (Exception exception) {
                    throw OW.a(exception);
                }
                try {
                    try {
                        this.l.s(this.l.Y);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            try {
                object2 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = object2.P();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.Y(System.currentTimeMillis());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8592086498739285636L;
        a = 0x2B5C282AD4C89BB4L ^ l2;
    }
}

