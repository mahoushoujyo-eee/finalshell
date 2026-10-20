/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

/*
 * Renamed from Ut
 */
public class ut_0
extends ub_0 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    @Override
    public ky_0 R() {
        kk_0 kk_02;
        block5: {
            int n10;
            ky_2[] ky_2Array;
            block4: {
                kk_02 = kk_0.v(ut_0.a(20808, 6414432192428781762L));
                ky_2Array = yu_2.c();
                for (n10 = 0; n10 < ut_0.a(18055, 8009640008883808012L); ++n10) {
                    kk_02.c(kd_1.CAN.m());
                    if (ky_2Array == null) {
                        if (ky_2Array == null) continue;
                    }
                    break block4;
                }
                n10 = 0;
            }
            while (n10 < ut_0.a(30019, 2621284142345000139L)) {
                kk_02.c(kd_1.BS.m());
                ++n10;
                if (ky_2Array == null) {
                    if (ky_2Array == null) continue;
                }
                break block5;
            }
            kk_02.a();
        }
        return kk_02;
    }

    public String toString() {
        return a;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "m\u0019uT_v\u0007\u000e;Zy\u001a0\u001d\u0016X0\u0017xI\u001d\u0004X#".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 75;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 101;
                            break;
                        }
                        case 1: {
                            n17 = 51;
                            break;
                        }
                        case 2: {
                            n17 = 80;
                            break;
                        }
                        case 3: {
                            n17 = 124;
                            break;
                        }
                        case 4: {
                            n17 = 113;
                            break;
                        }
                        case 5: {
                            n17 = 81;
                            break;
                        }
                        default: {
                            n17 = 118;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        long l2 = 2849888110560918954L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u00a5\u0099\u00f8*\u0016\u001b\u008dx\t\u00b5Z\u00de\u00ab\u00d1\u001a\u00ae\u00b2\u00bc\"O\u0010A)i";
        int n19 = "\u00a5\u0099\u00f8*\u0016\u001b\u008dx\t\u00b5Z\u00de\u00ab\u00d1\u001a\u00ae\u00b2\u00bc\"O\u0010A)i".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x618A;
        if (c[n11] == null) {
            ut_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

