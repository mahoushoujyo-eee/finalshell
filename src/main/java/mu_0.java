/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from mu
 */
class mu_0
extends Thread {
    final ku_2 w;
    private static final long[] a;
    private static final Long[] b;

    mu_0(ku_2 ku_22) {
        this.w = ku_22;
    }

    @Override
    public void run() {
        long l2 = System.currentTimeMillis();
        boolean bl = cn_1.Y();
        while (true) {
            if (Math.abs(System.currentTimeMillis() - l2) > mu_0.a(3534, 1195484283812696659L)) {
                l2 = System.currentTimeMillis();
                try {
                    if (!bl) continue;
                    this.w.u();
                }
                catch (InterruptedException interruptedException) {
                    throw mu_0.a(interruptedException);
                }
            }
            try {
                Thread.sleep(mu_0.a(27245, 8072374203092088305L));
            }
            catch (InterruptedException interruptedException) {
                return;
            }
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 9176999656272942083L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u000f]\u0095\u0001MSa\u0096o\u00ccv\u000f\u008f0\u0005\u00b8";
        int n11 = "\u000f]\u0095\u0001MSa\u0096o\u00ccv\u000f\u008f0\u0005\u00b8".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Long[2];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x5F9C) & Short.MAX_VALUE;
        if (b[n11] == null) {
            mu_0.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

