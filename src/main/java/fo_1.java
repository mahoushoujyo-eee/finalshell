/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fO
 */
class fo_1
implements Runnable {
    private static final long[] a;
    private static final Integer[] b;

    fo_1() {
    }

    @Override
    public void run() {
        int n10 = bn_1.C();
        try {
            bn_1.E(2);
            bn_1.D(fo_1.a(18427, 8671834275942224305L));
            bn_1.y.write(fo_1.a(23546, 3309506564528590257L));
        }
        catch (InterruptedException interruptedException) {
        }
        catch (Exception exception) {
            block7: {
                block8: {
                    try {
                        try {
                            exception.printStackTrace();
                            if (n10 != 0) break block7;
                            if (bl_2.J() != null) break block8;
                        }
                        catch (InterruptedException interruptedException) {
                            throw fo_1.a(interruptedException);
                        }
                        bl_2.g(exception);
                    }
                    catch (InterruptedException interruptedException) {
                        throw fo_1.a(interruptedException);
                    }
                }
                bl_2.x().interrupt();
            }
            bl_2.d().interrupt();
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5233909076563516805L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00a8q\u00f3\f?\u00d5+$\t\u001b\u000f\u00de\u0087\u00ce\u0010}";
        int n11 = "\u00a8q\u00f3\f?\u00d5+$\t\u001b\u000f\u00de\u0087\u00ce\u0010}".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x164A;
        if (b[n11] == null) {
            fo_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

