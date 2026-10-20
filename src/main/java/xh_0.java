/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.SwingUtilities;

/*
 * Renamed from xh
 */
class xh_0
extends Thread {
    final KC O;

    xh_0(KC kC) {
        this.O = kC;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.O.x.Y);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        try {
            if (!this.O.x.S) {
                SwingUtilities.invokeLater(new bv_2(this));
            }
        }
        catch (InterruptedException interruptedException) {
            throw xh_0.a(interruptedException);
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }
}

