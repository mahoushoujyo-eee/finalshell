/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.SwingUtilities;

/*
 * Renamed from o3
 */
class o3_0
implements Runnable {
    final int d;
    final int u;
    final TO E;

    o3_0(TO tO, int n10, int n11) {
        this.E = tO;
        this.d = n10;
        this.u = n11;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.E.b.N);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        try {
            if (!this.E.b.b) {
                SwingUtilities.invokeLater(new uv_2(this));
            }
        }
        catch (InterruptedException interruptedException) {
            throw o3_0.a(interruptedException);
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }
}

