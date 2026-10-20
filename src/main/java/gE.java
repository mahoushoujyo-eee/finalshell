/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.SwingUtilities;

class gE
implements Runnable {
    final aM Q;
    private static final long a;

    gE(aM aM2) {
        this.Q = aM2;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(a);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        SwingUtilities.invokeLater(new YS(this));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4262348397449795676L;
        a = 0x3B26E748DAF35894L ^ l2;
    }
}

