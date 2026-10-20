/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

class OJ
implements Runnable {
    private static final long[] a;
    private static final Integer[] b;

    OJ() {
    }

    @Override
    public void run() {
        long l2 = (5 + new Random().nextInt(OJ.a(13154, 2478924074353434229L))) * OJ.a(31350, 998398688498734944L);
        try {
            Thread.sleep(l2);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        new ur_1();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4388694280978576318L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0005pn\u0010\u00f0\u0084-\u00c1\u0017\"1\u00e8y\u00aa\u00e76";
        int n11 = "\u0005pn\u0010\u00f0\u0084-\u00c1\u0017\"1\u00e8y\u00aa\u00e76".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2D17;
        if (b[n11] == null) {
            OJ.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

