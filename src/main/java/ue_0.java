/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Ue
 */
class ue_0
extends Thread {
    final d8_0 k;
    private static final long a;

    ue_0(d8_0 d8_02) {
        this.k = d8_02;
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
                this.k.o();
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
        long l2 = 2203987499599607839L;
        a = 0x1E9622F42309382DL ^ l2;
    }
}

