/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Wf
 */
public class wf_0
extends W2 {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public wf_0() {
        try {
            this.G(a);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void O() {
        String[] stringArray;
        try {
            stringArray = (String[])lk_0.B(this.F);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String[] stringArray2 = stringArray;
        String string = W2.F();
        for (int i2 = 0; i2 < stringArray2.length; ++i2) {
            String string2 = stringArray2[i2].trim();
            int n10 = i2;
            if (string != null) {
                if (n10 == 0) {
                    this.p.P = string2;
                    if (string != null) continue;
                }
                n10 = i2;
            }
            int n11 = 1;
            if (string != null) {
                if (n10 == n11) {
                    this.p.T = string2;
                    if (string != null) continue;
                }
                n10 = i2;
                n11 = 2;
            }
            if (string != null) {
                if (n10 == n11) {
                    this.p.K7 = string2;
                    if (string != null) continue;
                }
                n10 = i2;
                n11 = 3;
            }
            if (string != null) {
                if (n10 == n11) {
                    this.p.h = string2;
                    if (string != null) continue;
                }
                n10 = i2;
                n11 = 4;
            }
            if (string != null) {
                if (n10 == n11) {
                    this.p.KF = string2;
                    if (string != null) continue;
                }
                n10 = i2;
                n11 = 5;
            }
            if (string != null) {
                if (n10 == n11) {
                    this.p.a = string2;
                    if (string != null) continue;
                }
                n10 = i2;
                n11 = wf_0.a(23747, 4153500945913195258L);
            }
            if (string != null) {
                if (n10 == n11) {
                    this.p.G = string2;
                    if (string != null) continue;
                }
                n10 = i2;
                n11 = wf_0.a(3923, 3930974507800590699L);
            }
            if (n10 != n11) continue;
            this.p.u = string2;
            if (string != null) continue;
        }
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
                char[] cArray3 = "'\u0003A~eN-!VU}a\u0003er@N(u\u0000a?\b\u0000>rUu<\fMv Cvi\u0018Nrm\u000b \u007f\u0000\u001bfn\u000fm7M\rc;\u001bn3\u0000E3-\u0007;'\u0003A~eN-=".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 90;
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
                            n17 = 8;
                            break;
                        }
                        case 1: {
                            n17 = 55;
                            break;
                        }
                        case 2: {
                            n17 = 122;
                            break;
                        }
                        case 3: {
                            n17 = 73;
                            break;
                        }
                        case 4: {
                            n17 = 90;
                            break;
                        }
                        case 5: {
                            n17 = 52;
                            break;
                        }
                        default: {
                            n17 = 90;
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
        long l2 = 2645282152617454591L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "{\u0092iG\u009a\u0016\u0001\u0003I\u00b1\\\u00a5\u00eb\u00e0R\u0093";
        int n19 = "{\u0092iG\u009a\u0016\u0001\u0003I\u00b1\\\u00a5\u00eb\u00e0R\u0093".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7639;
        if (c[n11] == null) {
            wf_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

