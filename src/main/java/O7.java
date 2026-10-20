/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class O7
implements Runnable {
    final qh_0 A;
    final U E;
    private static final long a;

    O7(U u10, qh_0 qh_02) {
        this.E = u10;
        this.A = qh_02;
    }

    @Override
    public void run() {
        block14: {
            Object object;
            Object object2;
            String[] stringArray = F8.y();
            while (true) {
                pG pG2;
                Object object3;
                try {
                    object3 = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    pG2 = (pG)object3.M();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                if (pG2 != null) break;
                try {
                    Thread.sleep(a);
                    if (stringArray == null) {
                        continue;
                    }
                    break block14;
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                    if (stringArray != null) break;
                    continue;
                }
                break;
            }
            try {
                object2 = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = object2.M();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.o(this.A);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2117471273568922787L;
        a = 0x1D62C4E78B2B6CA0L ^ l2;
    }
}

