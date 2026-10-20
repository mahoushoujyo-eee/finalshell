/*
 * Decompiled with CFR 0.152.
 */
class WM
extends Thread {
    private static final long a;
    private static final long b;

    WM() {
    }

    @Override
    public void run() {
        byte[] byArray = new byte[(int)a];
        boolean bl = false;
        while (true) {
            try {
                Thread.sleep(b);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            OF.j = OF.s / 2;
            OF.s = 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2123588059801587817L;
        a = 0xB4A1312D1BC2EE9L ^ l2;
        long l3 = 4246234471418882046L;
        b = 0x3AEDA7C115F0E02EL ^ l3;
    }
}

