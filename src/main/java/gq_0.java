/*
 * Decompiled with CFR 0.152.
 */
import com.c;

/*
 * Renamed from gq
 */
class gq_0
implements Runnable {
    final JA U;
    private static final long a;

    gq_0(JA jA) {
        this.U = jA;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(a);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        ((JA)this.U).setVisible(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8745436831272366096L;
        a = 0x795E0876759B7504L ^ l2;
    }
}

