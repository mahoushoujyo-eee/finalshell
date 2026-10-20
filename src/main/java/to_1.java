/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from tO
 */
class to_1
implements Runnable {
    final _y_0 n;
    final _y_0 P;
    final qw_0 t;
    private static final long a;

    to_1(qw_0 qw_02, _y_0 _y_02, _y_0 _y_03) {
        this.t = qw_02;
        this.n = _y_02;
        this.P = _y_03;
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
                        cB = ((_y_0)this.n).t();
                        if (ky_2Array != null) break block11;
                        if (cB == null) continue;
                    }
                    catch (InterruptedException interruptedException) {
                        throw to_1.a(interruptedException);
                    }
                    cB = ((_y_0)this.n).t();
                }
                catch (InterruptedException interruptedException) {
                    throw to_1.a(interruptedException);
                }
            }
            try {
                cB.q();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                ((_y_0)this.P).x().t();
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
        long l2 = 6017299143411389852L;
        a = 0x5381BDB09E4C5554L ^ l2;
    }
}

