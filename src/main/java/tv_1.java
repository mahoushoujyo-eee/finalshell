/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from tV
 */
public class tv_1 {
    private static final long[] a;
    private static final Integer[] b;

    public static void main(String[] stringArray) {
        short s2 = tv_1.a(6663, 1370578618877566394L);
        byte by = tv_1.T(s2);
        short s3 = tv_1.t(by);
    }

    public static byte T(short s2) {
        byte by = (byte)(s2 >> 0 & tv_1.a(19809, 6500086065374071518L));
        return by;
    }

    public static short t(byte by) {
        short s2 = 0;
        byte by2 = by;
        s2 = (short)(s2 + ((by2 & tv_1.a(23107, 5416214318471585279L)) << 0));
        return s2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8663726413449002529L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00ea\u00daZ\u00f3J:\u00a3\u0093\u008c\u00cb\u00da\u00a9\u00a7)\u00e3!\u00baU\u00ae\u00e9 \u00ddt\u0000";
        int n11 = "\u00ea\u00daZ\u00f3J:\u00a3\u0093\u008c\u00cb\u00da\u00a9\u00a7)\u00e3!\u00baU\u00ae\u00e9 \u00ddt\u0000".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x47BD;
        if (b[n11] == null) {
            tv_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

