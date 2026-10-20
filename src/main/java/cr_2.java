/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cr
 */
public class cr_2 {
    long c;
    int T;
    public static int Z;
    public static int i;
    int Y = Z;
    String G;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5922888288820105474L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00dd\u00af\u001d\u00f5\u0093q\u0091\b\u00e1GG\u00ca\u0093q\u0091\t";
        int n11 = "\u00dd\u00af\u001d\u00f5\u0093q\u0091\b\u00e1GG\u00ca\u0093q\u0091\t".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        Z = (int)lArray[0];
        i = (int)lArray[1];
    }

    cr_2(long l2, int n10, int n11) {
        this(null, l2, n10, n11);
    }

    public cr_2(String string, long l2, int n10, int n11) {
        this.G = string;
        this.c = l2;
        this.T = n10;
        this.Y = n11;
    }

    public String B() {
        return this.G;
    }

    public void T(String string) {
        this.G = string;
    }

    public int R() {
        return this.Y;
    }

    public long l() {
        return this.c;
    }

    public void I(long l2) {
        this.c = l2;
    }

    public int m() {
        return this.T;
    }

    public void a(int n10) {
        this.T = n10;
    }
}

