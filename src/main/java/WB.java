/*
 * Decompiled with CFR 0.152.
 */
class WB
extends Thread {
    final mm_0 H;
    private static final long[] a;
    private static final Long[] b;

    WB(mm_0 mm_02) {
        this.H = mm_02;
    }

    @Override
    public void run() {
        long l2 = System.currentTimeMillis();
        boolean bl = mm_0.O();
        while (true) {
            if (Math.abs(System.currentTimeMillis() - l2) > WB.a(31173, 7999736964170235622L)) {
                l2 = System.currentTimeMillis();
                try {
                    if (!bl) continue;
                    this.H.M();
                }
                catch (InterruptedException interruptedException) {
                    throw WB.a(interruptedException);
                }
            }
            try {
                Thread.sleep(WB.a(21271, 3146832257850807349L));
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
        long l2 = 567096599806601209L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = ",up\u001eH=\u00f3\u00a8h\u00da}85 Z\u00f7";
        int n11 = ",up\u001eH=\u00f3\u00a8h\u00da}85 Z\u00f7".length();
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
        int n11 = (n10 ^ (int)l2 ^ 0x4722) & Short.MAX_VALUE;
        if (b[n11] == null) {
            WB.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

