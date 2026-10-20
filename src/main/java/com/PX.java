/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.XP;
import com.ky_2;
import com.pg_1;
import org.jetbrains.annotations.NotNull;

public class PX {
    private final int o;
    private pg_1 f;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public PX(int n10) {
        int n11;
        block12: {
            block13: {
                int n12;
                int[] nArray;
                block11: {
                    int[] nArray2 = XP.j();
                    nArray = nArray2;
                    try {
                        n12 = n10;
                        if (nArray != null) break block11;
                        if (n12 < 0) throw new IllegalArgumentException(a);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PX.a(illegalArgumentException);
                    }
                    n12 = n10;
                }
                try {
                    if (n12 > 3) {
                        throw new IllegalArgumentException(a);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PX.a(illegalArgumentException);
                }
                try {
                    try {
                        this.o = n10;
                        PX pX = this;
                        n11 = n10;
                        if (nArray != null) break block12;
                        if (n11 != 1) break block13;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PX.a(illegalArgumentException);
                    }
                    n11 = PX.a(24374, 2604183409553810464L);
                    break block12;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PX.a(illegalArgumentException);
                }
            }
            n11 = PX.a(25828, 2498600881696448499L);
        }
        try {
            pX.f = pg_1.T((char)n11);
            if (ky_2.F() == null) return;
            XP.x(new int[2]);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw PX.a(illegalArgumentException);
        }
    }

    public pg_1 X() {
        return this.f;
    }

    public int l() {
        return this.o;
    }

    public int j(char c2, int n10) {
        int n11;
        block2: {
            int n12;
            block3: {
                n12 = this.f.Q(n10);
                int[] nArray = XP.j();
                try {
                    n11 = n12;
                    if (nArray != null) break block2;
                    if (n11 >= 0) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PX.a(illegalArgumentException);
                }
                n12 = c2;
            }
            n11 = n12;
        }
        return n11;
    }

    public void t(@NotNull pg_1 pg_12) {
        this.f = pg_12;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
                char[] cArray3 = "N.0wl\u0003o')(re\u0012*".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 20;
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
                            n17 = 19;
                            break;
                        }
                        case 1: {
                            n17 = 84;
                            break;
                        }
                        case 2: {
                            n17 = 82;
                            break;
                        }
                        case 3: {
                            n17 = 2;
                            break;
                        }
                        case 4: {
                            n17 = 20;
                            break;
                        }
                        case 5: {
                            n17 = 126;
                            break;
                        }
                        default: {
                            n17 = 31;
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
        long l2 = 3656082006845097258L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u00d7\u00c8\u0014\u008c\u0097\u00d8\u00a1:\u00d3\u00fa\u009c\u009fcM\u009a\u009b";
        int n19 = "\u00d7\u00c8\u0014\u008c\u0097\u00d8\u00a1:\u00d3\u00fa\u009c\u009fcM\u009a\u009b".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7B16;
        if (c[n11] == null) {
            PX.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

