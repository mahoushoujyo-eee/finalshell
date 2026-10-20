/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

class gM
implements Runnable {
    final ca_2 k;
    private static final long a;

    gM(ca_2 ca_22) {
        this.k = ca_22;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        while (true) {
            try {
                this.k.U();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                Thread.sleep(a);
                continue;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                continue;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3302110406838298373L;
        a = 0x2DD373EB70B7A761L ^ l2;
    }
}

