/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

/*
 * Renamed from Qv
 */
class qv_0
implements Runnable {
    final JPasswordField J;
    final yy_2 a;
    private static final long b;

    qv_0(yy_2 yy_22, JPasswordField jPasswordField) {
        this.a = yy_22;
        this.J = jPasswordField;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(b);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        SwingUtilities.invokeLater(new OL(this));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5184639206001186526L;
        b = 0x47F389E372439616L ^ l2;
    }
}

