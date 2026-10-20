/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Qx
 */
class qx_0
extends Thread {
    final li_0 q;
    private static final long a;
    private static final long b;

    qx_0(li_0 li_02) {
        this.q = li_02;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        int n10 = 0;
        boolean bl = true;
        do {
            String[] stringArray;
            if (bl && !(bl = false) && (stringArray = li_0.I()) == null) continue;
            boolean bl2 = this.q.E();
            if (stringArray == null) {
                try {
                    if (bl2 && stringArray == null) break;
                }
                catch (InterruptedException interruptedException) {
                    throw qx_0.a(interruptedException);
                }
                try {
                    Thread.sleep(b);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
            ++n10;
        } while (n10 > (int)a);
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4584791071525074752L;
        a = 0x833B3AB533A2774AL ^ l2;
        long l3 = 5055224283347089703L;
        b = 0x4627C3B3B4D41347L ^ l3;
    }
}

