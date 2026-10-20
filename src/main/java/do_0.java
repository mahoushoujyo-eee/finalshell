/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Do
 */
class do_0
implements Runnable {
    final xQ D;
    private static final long a;

    do_0(xQ xQ2) {
        this.D = xQ2;
    }

    @Override
    public void run() {
        this.D.x();
        try {
            Thread.sleep(a);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.D.d();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3013584503645805643L;
        a = 0x29D26723B06E1FA3L ^ l2;
    }
}

