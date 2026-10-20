/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

/*
 * Renamed from tn
 */
class tn_2
implements Runnable {
    final JPasswordField b;
    final fl_2 R;
    private static final long a;

    tn_2(fl_2 fl_22, JPasswordField jPasswordField) {
        this.R = fl_22;
        this.b = jPasswordField;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(a);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        SwingUtilities.invokeLater(new yw_0(this));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8891621449729358866L;
        a = 0x7B656299445CBCDAL ^ l2;
    }
}

