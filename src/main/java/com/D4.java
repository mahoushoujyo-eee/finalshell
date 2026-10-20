/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.it_0;
import com.ph_0;
import java.lang.ref.SoftReference;
import java.nio.charset.CharsetDecoder;

public class D4 {
    private static final ThreadLocal v;
    private static final ThreadLocal u;
    private static final ThreadLocal d;
    static final /* synthetic */ boolean C;
    private static final long[] a;
    private static final Integer[] b;

    public static CharsetDecoder B() {
        CharsetDecoder charsetDecoder = (CharsetDecoder)u.get();
        int n10 = ph_0.w();
        CharsetDecoder charsetDecoder2 = charsetDecoder;
        if (n10 != 0) {
            if (charsetDecoder2 == null) {
                charsetDecoder = new it_0();
                u.set(charsetDecoder);
            }
            charsetDecoder2 = charsetDecoder;
        }
        return charsetDecoder2;
    }

    public static void v() {
        v.set(null);
    }

    public static char[] j(int n10) {
        char[] cArray;
        SoftReference softReference = (SoftReference)v.get();
        int n11 = ph_0.u();
        SoftReference softReference2 = softReference;
        if (n11 == 0) {
            if (softReference2 == null) {
                return D4.q(n10);
            }
            softReference2 = softReference.get();
        }
        char[] cArray2 = cArray = (char[])softReference2;
        if (n11 == 0) {
            if (cArray2 == null) {
                return D4.q(n10);
            }
            cArray2 = cArray;
        }
        if (n11 == 0) {
            if (cArray2.length < n10) {
                cArray = D4.q(n10);
            }
            cArray2 = cArray;
        }
        return cArray2;
    }

    private static char[] q(int n10) {
        int n11 = ph_0.w();
        int n12 = n10;
        int n13 = D4.a(4205, 146789832753123902L);
        if (n11 != 0) {
            if (n12 > n13) {
                return new char[n10];
            }
            n12 = D4.a(30045, 7982684965541672712L);
            n13 = D4.a(23308, 48716670681831768L);
        }
        int n14 = D4.j(n12, n13, n10);
        char[] cArray = new char[n14];
        v.set(new SoftReference<char[]>(cArray));
        return cArray;
    }

    /*
     * Unable to fully structure code
     */
    private static int j(int var0, int var1_1, int var2_2) {
        var3_3 = ph_0.w();
        v0 = D4.C;
        if (var3_3 != 0) {
            if (v0 == 0) {
                v1 = 1 << var1_1;
                v2 = var2_2;
                if (var3_3 != 0) {
                    if (v1 < v2) {
                        throw new AssertionError();
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = var2_2;
                v2 = var0;
            }
            v0 = v1 >>> v2;
        }
        v3 = var4_4 = v0;
        if (var3_3 != 0) {
            if (v3 <= 0) {
                return 1 << var0;
            }
            v3 = 1 << D4.a(12187, 7502342916888735177L) - Integer.numberOfLeadingZeros(var2_2 - 1);
        }
        return v3;
    }

    public static void t() {
        d.set(null);
    }

    public static byte[] X(int n10) {
        byte[] byArray;
        SoftReference softReference = (SoftReference)d.get();
        int n11 = ph_0.u();
        SoftReference softReference2 = softReference;
        if (n11 == 0) {
            if (softReference2 == null) {
                return D4.R(n10);
            }
            softReference2 = softReference.get();
        }
        byte[] byArray2 = byArray = (byte[])softReference2;
        if (n11 == 0) {
            if (byArray2 == null) {
                return D4.R(n10);
            }
            byArray2 = byArray;
        }
        if (n11 == 0) {
            if (byArray2.length < n10) {
                byArray = D4.R(n10);
            }
            byArray2 = byArray;
        }
        return byArray2;
    }

    private static byte[] R(int n10) {
        int n11 = ph_0.u();
        int n12 = n10;
        int n13 = D4.a(30312, 3660073804290618425L);
        if (n11 == 0) {
            if (n12 > n13) {
                return new byte[n10];
            }
            n12 = D4.a(17560, 8259504185196431054L);
            n13 = D4.a(31818, 4794798345256074778L);
        }
        int n14 = D4.j(n12, n13, n10);
        byte[] byArray = new byte[n14];
        d.set(new SoftReference<byte[]>(byArray));
        return byArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2925141180149538470L;
                var6_1 = new long[7];
                var3_2 = 0;
                var4_3 = "n\u008f\u00e2\u00c8*0`\u00ad\u00c8\u00c4!kl\u00d8j\u009f\f\u00e1\u009e\u0088\u0080\u00fc3O\u00d4\u0087\u0083H\u00fdO\u008c\u0098\u00a6\u00b7%\u0094\n\u000fG\u00ef";
                var5_4 = "n\u008f\u00e2\u00c8*0`\u00ad\u00c8\u00c4!kl\u00d8j\u009f\f\u00e1\u009e\u0088\u0080\u00fc3O\u00d4\u0087\u0083H\u00fdO\u008c\u0098\u00a6\u00b7%\u0094\n\u000fG\u00ef".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "*A\u00d5\u00e5\\Xi\u00a4\u00e1\u001av\u0013s\u00d2Xb";
                    var5_4 = "*A\u00d5\u00e5\\Xi\u00a4\u00e1\u001av\u0013s\u00d2Xb".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        D4.a = var6_1;
        D4.b = new Integer[7];
        D4.C = D4.class.desiredAssertionStatus() == false;
        D4.v = new ThreadLocal<T>();
        D4.u = new ThreadLocal<T>();
        D4.d = new ThreadLocal<T>();
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x250;
        if (b[n11] == null) {
            D4.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

