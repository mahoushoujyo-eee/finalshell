/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ld
 */
class ld_2
implements Runnable {
    final _y_0 k;
    final _y_0 V;
    final yg_2 J;
    private static final long a;

    ld_2(yg_2 yg_22, _y_0 _y_02, _y_0 _y_03) {
        this.J = yg_22;
        this.k = _y_02;
        this.V = _y_03;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        ky_2[] ky_2Array = ka_1.y();
        for (int i2 = 0; i2 < 3; ++i2) {
            CB cB;
            block11: {
                try {
                    Thread.sleep(a);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                try {
                    try {
                        cB = ((_y_0)this.k).t();
                        if (ky_2Array != null) break block11;
                        if (cB == null) continue;
                    }
                    catch (InterruptedException interruptedException) {
                        throw ld_2.a(interruptedException);
                    }
                    cB = ((_y_0)this.k).t();
                }
                catch (InterruptedException interruptedException) {
                    throw ld_2.a(interruptedException);
                }
            }
            try {
                cB.q();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                ((_y_0)this.V).x().t();
                continue;
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2169817354109163121L;
        a = 0x1E1CBD632B2796B9L ^ l2;
    }
}

