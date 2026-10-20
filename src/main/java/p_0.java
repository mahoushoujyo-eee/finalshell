/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from p
 */
class p_0
extends Thread {
    final dl_0 s;
    private static final long a;

    p_0(dl_0 dl_02) {
        this.s = dl_02;
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
            this.s.D();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2537106207605726704L;
        a = 0x23359CA755C71E18L ^ l2;
    }
}

