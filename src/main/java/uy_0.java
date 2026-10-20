/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Uy
 */
public class uy_0 {
    long o;
    int x;
    public static int f;
    public static int T;
    int G = f;
    String l;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1724950434230890127L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\n\u0019\u00e3{\u00df|\u00ee\u0084\u00ee\u00dc\u008e\u00dc\u00df|\u00ee\u0085";
        int n11 = "\n\u0019\u00e3{\u00df|\u00ee\u0084\u00ee\u00dc\u008e\u00dc\u00df|\u00ee\u0085".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        f = (int)lArray[1];
        T = (int)lArray[0];
    }

    uy_0(long l2, int n10, int n11) {
        this(null, l2, n10, n11);
    }

    public uy_0(String string, long l2, int n10, int n11) {
        this.l = string;
        this.o = l2;
        this.x = n10;
        this.G = n11;
    }

    public String K() {
        return this.l;
    }

    public void g(String string) {
        this.l = string;
    }

    public int v() {
        return this.G;
    }

    public long o() {
        return this.o;
    }

    public void o(long l2) {
        this.o = l2;
    }

    public int t() {
        return this.x;
    }

    public void t(int n10) {
        this.x = n10;
    }
}

