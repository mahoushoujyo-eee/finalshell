/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.SwingUtilities;

class FA
implements Runnable {
    final CT o;
    private static final long a;

    FA(CT cT) {
        this.o = cT;
    }

    @Override
    public void run() {
        boolean bl = uo_0.i();
        while (this.o.V) {
            SwingUtilities.invokeLater(new oj_2(this));
            try {
                Thread.sleep(a);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                if (!bl) continue;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8141341996293006600L;
        a = 0x70FBDB693403A4FCL ^ l2;
    }
}

