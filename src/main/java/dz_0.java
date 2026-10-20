/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.SwingUtilities;

/*
 * Renamed from Dz
 */
class dz_0
implements Runnable {
    final int n;
    final vz_0 V;
    private static final long a;

    dz_0(vz_0 vz_02, int n10) {
        this.V = vz_02;
        this.n = n10;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(a);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        SwingUtilities.invokeLater(new CQ(this));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2401060664398434607L;
        a = 0x215247F3F1A1D14BL ^ l2;
    }
}

