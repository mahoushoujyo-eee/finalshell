/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from tF
 */
class tf_1
implements Runnable {
    private static final long[] a;
    private static final Integer[] b;

    tf_1() {
    }

    @Override
    public void run() {
        int n10 = bn_1.Z();
        try {
            bn_1.E(2);
            bs_1.v(System.currentTimeMillis());
            bn_1.D(tf_1.a(11234, 4752015861437679003L));
            bn_1.y.write(new byte[tf_1.a(21908, 3003856844670483436L)]);
        }
        catch (InterruptedException interruptedException) {
        }
        catch (Exception exception) {
            block7: {
                block8: {
                    try {
                        try {
                            exception.printStackTrace();
                            if (n10 == 0) break block7;
                            if (bs_1.m() != null) break block8;
                        }
                        catch (InterruptedException interruptedException) {
                            throw tf_1.a(interruptedException);
                        }
                        bs_1.w(exception);
                    }
                    catch (InterruptedException interruptedException) {
                        throw tf_1.a(interruptedException);
                    }
                }
                bs_1.G().interrupt();
            }
            bs_1.D().interrupt();
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8735284352673407664L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "H\u00e0-\u0085\u00f9#\u0080;\u00bd\u00e3\u00fa\u00b5\u00c3\u0095\u00d9[";
        int n11 = "H\u00e0-\u0085\u00f9#\u0080;\u00bd\u00e3\u00fa\u00b5\u00c3\u0095\u00d9[".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6E79;
        if (b[n11] == null) {
            tf_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

