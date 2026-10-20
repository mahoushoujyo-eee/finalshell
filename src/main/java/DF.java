/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class DF {
    private static boolean J;
    private static final long[] a;
    private static final Integer[] b;
    private static final long c;

    public static byte[] s(byte[] byArray, int n10) {
        byte[] byArray2 = new byte[n10];
        System.arraycopy(byArray, 0, byArray2, 0, Math.min(byArray.length, n10));
        return byArray2;
    }

    public static boolean K(byte[] byArray, byte[] byArray2) {
        return Arrays.equals(byArray, byArray2);
    }

    public static long q(byte[] byArray, int n10, ks_0 ks_02) {
        long l2;
        block7: {
            int n11;
            long l3 = 0L;
            boolean bl = DF.M();
            int n12 = 0;
            int n13 = 1;
            int n14 = fk_1.s[ks_02.ordinal()];
            if (bl) {
                switch (n14) {
                    case 1: {
                        n13 = 1;
                        n12 = 0;
                        if (bl) break;
                    }
                    case 2: {
                        n13 = -1;
                        n12 = n10 - 1;
                    }
                }
                n14 = n11 = 0;
            }
            while (n11 < n10) {
                l2 = l3 + (long)((DF.a(15250, 5648174263929435891L) & byArray[n12]) * (1 << n11 * DF.a(31702, 4122133387206637238L)));
                if (bl) {
                    l3 = l2;
                    n12 += n13;
                    ++n11;
                    if (bl) continue;
                }
                break block7;
            }
            l2 = l3;
        }
        return l2;
    }

    public static short I(byte[] byArray, ks_0 ks_02) {
        return (short)DF.q(byArray, 2, ks_02);
    }

    public static int a(byte[] byArray, ks_0 ks_02) {
        return (int)DF.q(byArray, 4, ks_02);
    }

    public static long J(byte[] byArray, ks_0 ks_02) {
        return DF.q(byArray, DF.a(24130, 6465254043034161952L), ks_02);
    }

    public static byte[] O(long l2, int n10, ks_0 ks_02) {
        byte[] byArray;
        block7: {
            int n11;
            byte[] byArray2 = new byte[n10];
            int n12 = 0;
            boolean bl = DF.c();
            int n13 = 1;
            int n14 = fk_1.s[ks_02.ordinal()];
            if (!bl) {
                switch (n14) {
                    case 2: {
                        n13 = -1;
                        n12 = n10 - 1;
                        if (!bl) break;
                    }
                    case 1: {
                        n13 = 1;
                        n12 = 0;
                    }
                }
                n14 = n11 = 0;
            }
            while (n11 < n10) {
                byArray = byArray2;
                if (!bl) {
                    byArray[n12] = (byte)(l2 >> n11 * DF.a(31702, 4122133387206637238L) & c);
                    n12 += n13;
                    ++n11;
                    if (!bl) continue;
                }
                break block7;
            }
            byArray = byArray2;
        }
        return byArray;
    }

    public static byte[] C(short s2, ks_0 ks_02) {
        return DF.O(s2, 2, ks_02);
    }

    public static byte[] U(int n10, ks_0 ks_02) {
        return DF.O(n10, 4, ks_02);
    }

    public static byte[] h(long l2, ks_0 ks_02) {
        return DF.O(l2, DF.a(31702, 4122133387206637238L), ks_02);
    }

    public static void N(boolean bl) {
        J = bl;
    }

    public static boolean M() {
        return J;
    }

    public static boolean c() {
        boolean bl = DF.M();
        return !bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 537243454849800187L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "#3\u00af5\u00a1\u0003aE\u00a7E5\u00803=\u00a1\u00f7\u00c4\u00e1t\u00f0]\u008cD\u00d3";
        int n11 = "#3\u00af5\u00a1\u0003aE\u00a7E5\u00803=\u00a1\u00f7\u00c4\u00e1t\u00f0]\u008cD\u00d3".length();
        int n12 = 0;
        DF.N(true);
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
        long l3 = 8847818705301979332L;
        c = 0x7AC9C43C1694C03BL ^ l3;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4D60;
        if (b[n11] == null) {
            DF.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

