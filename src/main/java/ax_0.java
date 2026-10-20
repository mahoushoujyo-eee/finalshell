/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.SwingUtilities;

/*
 * Renamed from ax
 */
class ax_0
extends Thread {
    final TM i;

    ax_0(TM tM) {
        this.i = tM;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.i.T.e);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        try {
            if (!this.i.T.w) {
                SwingUtilities.invokeLater(new tw_0(this));
            }
        }
        catch (InterruptedException interruptedException) {
            throw ax_0.a(interruptedException);
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }
}

