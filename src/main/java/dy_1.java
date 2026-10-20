/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/*
 * Renamed from dY
 */
class dy_1
implements Runnable {
    final JScrollPane G;
    final xw_0 w;
    private static final long a;

    dy_1(xw_0 xw_02, JScrollPane jScrollPane) {
        this.w = xw_02;
        this.G = jScrollPane;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(a);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        SwingUtilities.invokeLater(new lo_0(this));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4400891631342927584L;
        a = 0x3D131B9F2D2F3E28L ^ l2;
    }
}

