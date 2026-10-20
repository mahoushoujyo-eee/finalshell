/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class L_
implements Runnable {
    final tv_0 U;
    private static final long a;

    L_(tv_0 tv_02) {
        this.U = tv_02;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(a);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            try {
                this.U.Y();
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
        long l2 = 8467135376623373278L;
        a = 0x75814EC3A4C78836L ^ l2;
    }
}

