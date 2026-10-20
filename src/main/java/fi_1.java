/*
 * Decompiled with CFR 0.152.
 */
import com.c;

/*
 * Renamed from fI
 */
public class fi_1 {
    int O;
    int J;
    int p;
    private static final long[] a;
    private static final Integer[] b;

    public fi_1() {
        this.O = fi_1.a(24154, 1811965513138010724L);
        this.J = 1;
        this.p = fi_1.a(23512, 4554476906064281575L);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 832076526935242639L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "r\u0080\u00d4\u00d4\u00e6(z\u00ab\u00f76\u00db0\u00deD\bm";
        int n11 = "r\u0080\u00d4\u00d4\u00e6(z\u00ab\u00f76\u00db0\u00deD\bm".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x243E;
        if (b[n11] == null) {
            fi_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

