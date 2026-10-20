/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Fq
 */
class fq_0
extends Thread {
    final cm_1 e;
    private static final long a;

    fq_0(cm_1 cm_12) {
        this.e = cm_12;
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
            this.e.T();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 9045522668680755593L;
        a = 0x7D8826F12275BA61L ^ l2;
    }
}

