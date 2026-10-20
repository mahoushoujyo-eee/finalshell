/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ny
 */
class ny_0
extends Thread {
    final oy_2 W;
    private static final long a;

    ny_0(oy_2 oy_22) {
        this.W = oy_22;
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
            System.gc();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6962483420017977830L;
        a = 0x609FB5C81CB7FA6EL ^ l2;
    }
}

