/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.SwingUtilities;

/*
 * Renamed from Di
 */
class di_0
implements Runnable {
    final bq_0 q;
    private static final long a;

    di_0(bq_0 bq_02) {
        this.q = bq_02;
    }

    @Override
    public void run() {
        int n10 = (int)a;
        try {
            Thread.sleep(n10);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        SwingUtilities.invokeLater(new yx_2(this, n10));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4738022423121376192L;
        a = 0xD507C9F06BFC33A4L ^ l2;
    }
}

