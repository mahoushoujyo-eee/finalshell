/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

/*
 * Renamed from Um
 */
public class um_0
extends ub_0 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    @Override
    public ky_0 R() {
        kk_0 kk_02;
        block2: {
            kk_02 = kk_0.v(um_0.a(13831, 1723285674271872408L));
            ky_2[] ky_2Array = yu_2.c();
            for (int i2 = 0; i2 < 2; ++i2) {
                kk_02.c((byte)um_0.a(26784, 7352716196608068414L));
                if (ky_2Array == null) {
                    if (ky_2Array == null) continue;
                }
                break block2;
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
                char[] cArray3 = "]\u001b\fj3*\u000f;=-".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 73;
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
                            n17 = 82;
                            break;
                        }
                        case 1: {
                            n17 = 59;
                            break;
                        }
                        case 2: {
                            n17 = 43;
                            break;
                        }
                        case 3: {
                            n17 = 74;
                            break;
                        }
                        case 4: {
                            n17 = 9;
                            break;
                        }
                        case 5: {
                            n17 = 11;
                            break;
                        }
                        default: {
                            n17 = 124;
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
        long l2 = 4429740894336673907L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u009f\u0004\u00fa3\f\u00e0\u00a3\u0002\u00cb\u00c4\u00d8\u00ae\u0018\u008b\u00fd\u00fb";
        int n19 = "\u009f\u0004\u00fa3\f\u00e0\u00a3\u0002\u00cb\u00c4\u00d8\u00ae\u0018\u008b\u00fd\u00fb".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x239E;
        if (c[n11] == null) {
            um_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

