/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

/*
 * Renamed from b7
 */
class b7_0
implements Runnable {
    final U T;
    final m6 F;
    private static final long a;

    b7_0(m6 m62, U u10) {
        this.F = m62;
        this.T = u10;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        long l2 = System.currentTimeMillis();
        String[] stringArray = F8.y();
        while (true) {
            boolean bl;
            try {
                bl = (Boolean)this.T.l();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            if (bl) break;
            try {
                Thread.sleep(a);
                if (stringArray != null) return;
                continue;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                if (stringArray != null) break;
                continue;
            }
            break;
        }
        SwingUtilities.invokeLater(new fy_2(this));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2556498245502164036L;
        a = 0x237A819C0010DC46L ^ l2;
    }
}

