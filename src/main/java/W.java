/*
 * Decompiled with CFR 0.152.
 */
class W
extends Thread {
    private final mm_0 v;
    private static final long[] a;
    private static final Integer[] b;
    private static final long c;

    W(mm_0 mm_02) {
        this.v = mm_02;
    }

    @Override
    public void run() {
        while (true) {
            this.v.i(W.a(9389, 4923485583310961952L));
            this.v.l(W.a(16516, 5369247535158581512L));
            try {
                Thread.sleep(c);
                continue;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                continue;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1302708350702169860L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = ",s\u009cyE\u00cd\u00db|\u0082\u00f1\u00ac\u0014\u00ab\u0088\u0016\u0094";
        int n11 = ",s\u009cyE\u00cd\u00db|\u0082\u00f1\u00ac\u0014\u00ab\u0088\u0016\u0094".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
        long l3 = 1577382990763278165L;
        c = 0x15E3FD7907303F5FL ^ l3;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x198C;
        if (b[n11] == null) {
            W.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

