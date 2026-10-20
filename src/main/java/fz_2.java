/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

/*
 * Renamed from fz
 */
class fz_2
implements Runnable {
    final JPasswordField i;
    final yy_2 G;
    private static final long a;

    fz_2(yy_2 yy_22, JPasswordField jPasswordField) {
        this.G = yy_22;
        this.i = jPasswordField;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(a);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        SwingUtilities.invokeLater(new b3_0(this));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3403430707449283592L;
        a = 0x2F3B6A323F2BC4C0L ^ l2;
    }
}

