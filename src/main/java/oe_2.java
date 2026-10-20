/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from oe
 */
class oe_2
extends Thread {
    final bh_0 X;
    private static final long a;

    oe_2(bh_0 bh_02) {
        this.X = bh_02;
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
            this.X.s();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8819303886834341408L;
        a = 0x7A6476288CFB95C8L ^ l2;
    }
}

