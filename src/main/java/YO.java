/*
 * Decompiled with CFR 0.152.
 */
class YO
extends Thread {
    final tp_2 U;
    private static final long a;

    YO(tp_2 tp_22) {
        this.U = tp_22;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(a);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            this.U.R();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8393351857207357747L;
        a = 0x747B2D0B53B5B12DL ^ l2;
    }
}

