/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.SwingUtilities;

/*
 * Renamed from dJ
 */
class dj_1
implements Runnable {
    final CE x;
    private static final long a;

    dj_1(CE cE) {
        this.x = cE;
    }

    @Override
    public void run() {
        int[] nArray = CE.S();
        while (this.x.g) {
            SwingUtilities.invokeLater(new gl_0(this));
            try {
                Thread.sleep(a);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                if (nArray != null) continue;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6082190871435017201L;
        a = 0x5468485F6C01FA05L ^ l2;
    }
}

