/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class FL {
    private static final long[] a;
    private static final Integer[] b;

    public static void main(String[] stringArray) {
        System.out.println(new Random().nextInt(FL.a(9364, 6368665132608393489L)) + FL.a(365, 6363274621649728745L));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1180641364772026120L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00df\u00be_P\u00e8\u00d4\u00be\u00f6G\u009c\u009b\u0000\u0005\u00ee\u00e4\u00f1";
        int n11 = "\u00df\u00be_P\u00e8\u00d4\u00be\u00f6G\u009c\u009b\u0000\u0005\u00ee\u00e4\u00f1".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3585;
        if (b[n11] == null) {
            FL.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

