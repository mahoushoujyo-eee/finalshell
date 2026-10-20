/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ur
 */
class ur_2
implements Runnable {
    final lf_1 m;
    private static final long a;

    ur_2(lf_1 lf_12) {
        this.m = lf_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        ky_2[] ky_2Array = dl_2.K();
        while (this.m.O) {
            block15: {
                lf_1 lf_12;
                block13: {
                    try {
                        Thread.sleep(a);
                    }
                    catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    try {
                        block14: {
                            try {
                                try {
                                    lf_12 = (lf_1)this.m;
                                    if (ky_2Array == null) break block13;
                                    if (!lf_12.p) break block14;
                                }
                                catch (InterruptedException interruptedException) {
                                    throw ur_2.a(interruptedException);
                                }
                                try {
                                    (KV)this.m.e.l(this.m.n);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (ky_2Array != null) break block15;
                            }
                            catch (InterruptedException interruptedException) {
                                throw ur_2.a(interruptedException);
                            }
                        }
                        lf_12 = (lf_1)this.m;
                    }
                    catch (InterruptedException interruptedException) {
                        throw ur_2.a(interruptedException);
                    }
                }
                try {
                    (KV)lf_12.e.V(this.m.n);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            this.m.n = 0;
            if (ky_2Array != null) continue;
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7196922524210270402L;
        a = 0x63E09AE7A38F9DC7L ^ l2;
    }
}

