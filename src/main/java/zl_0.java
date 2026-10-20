/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

/*
 * Renamed from zl
 */
class zl_0
implements Runnable {
    final JPasswordField n;
    final fl_2 I;
    private static final long a;

    zl_0(fl_2 fl_22, JPasswordField jPasswordField) {
        this.I = fl_22;
        this.n = jPasswordField;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(a);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        SwingUtilities.invokeLater(new bb_2(this));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3696381474741709159L;
        a = 0x334C2F5DF45069AFL ^ l2;
    }
}

