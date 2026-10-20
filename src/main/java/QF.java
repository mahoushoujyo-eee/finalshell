/*
 * Decompiled with CFR 0.152.
 */
import com.c;

class QF
implements Runnable {
    final oe_1 I;
    private static final long a;

    QF(oe_1 oe_12) {
        this.I = oe_12;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(a);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        ((nq_0)this.I.U).setVisible(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6469273428450883857L;
        a = 0x59C779E851B03C05L ^ l2;
    }
}

