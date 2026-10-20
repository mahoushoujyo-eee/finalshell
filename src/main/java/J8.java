/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class J8
extends Thread {
    final jx_0 Q;
    private static final long a;

    J8(jx_0 jx_02) {
        this.Q = jx_02;
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
                this.Q.c();
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
        long l2 = 3186634981635917129L;
        a = 0x2C3933A1DD3E0465L ^ l2;
    }
}

