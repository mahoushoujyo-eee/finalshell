/*
 * Decompiled with CFR 0.152.
 */
package org;

import com.ky_2;
import java.io.IOException;
import java.io.OutputStream;
import org.M;
import org.V.H;
import org.d_0;
import org.g;

class E
implements H {
    static final boolean T;
    final H I;
    final M k;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    E(M m10, H h10) {
        this.k = m10;
        this.I = h10;
    }

    @Override
    public OutputStream X(String string) throws IOException {
        String string2;
        OutputStream outputStream;
        block14: {
            block13: {
                boolean bl;
                block12: {
                    outputStream = this.I.X(string);
                    ky_2[] ky_2Array = d_0.b();
                    try {
                        try {
                            try {
                                bl = T;
                                if (ky_2Array == null) break block12;
                                if (bl) break block13;
                            }
                            catch (IOException iOException) {
                                throw E.a(iOException);
                            }
                            string2 = string;
                            if (ky_2Array == null) break block14;
                        }
                        catch (IOException iOException) {
                            throw E.a(iOException);
                        }
                        bl = string2.endsWith(a);
                    }
                    catch (IOException iOException) {
                        throw E.a(iOException);
                    }
                }
                try {
                    if (!bl) {
                        throw new AssertionError();
                    }
                }
                catch (IOException iOException) {
                    throw E.a(iOException);
                }
            }
            string2 = string.substring(0, string.length() - E.a(2576, 3401687132664766364L)).replace((char)E.a(24309, 2128834021764975483L), (char)E.a(3386, 6058176889694951607L));
        }
        String string3 = string2;
        try {
            if (M.m().matcher(string3).matches()) {
                return new g(this, outputStream);
            }
        }
        catch (IOException iOException) {
            throw E.a(iOException);
        }
        return outputStream;
    }

    @Override
    public boolean A(String string) {
        return this.I.A(string);
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
                char[] cArray3 = "H\r\u0015Z\u001c\u007f".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 58;
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
                            n17 = 92;
                            break;
                        }
                        case 1: {
                            n17 = 84;
                            break;
                        }
                        case 2: {
                            n17 = 67;
                            break;
                        }
                        case 3: {
                            n17 = 1;
                            break;
                        }
                        case 4: {
                            n17 = 85;
                            break;
                        }
                        case 5: {
                            n17 = 54;
                            break;
                        }
                        default: {
                            n17 = 28;
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
        long l2 = 8815217580317574880L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "g\u00cfen\u00b7\u001b\u0099zJ\u00f3\u00ae\u00dd\u00b4$\u001ey@f\u00ed\u00a4\u00a9\u008a\u00cd\u00b4";
        int n19 = "g\u00cfen\u00b7\u001b\u0099zJ\u00f3\u00ae\u00dd\u00b4$\u001ey@f\u00ed\u00a4\u00a9\u008a\u00cd\u00b4".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[3];
        T = !M.class.desiredAssertionStatus();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x158C;
        if (c[n11] == null) {
            E.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

