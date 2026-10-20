/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.SwingUtilities;

class g_
implements Runnable {
    final KA V;
    private static final long a;

    g_(KA kA) {
        this.V = kA;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(a);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        SwingUtilities.invokeLater(new jb_0(this));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 591028527190101473L;
        a = 0x833C1506749CD85L ^ l2;
    }
}

