/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.iw_2;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.h1
 */
public class h1_0
extends W5 {
    private float h = 0.0f;
    private float o = 0.0f;
    private boolean u;
    private BufferedImage A;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void l(float f10) {
        this.h = f10;
    }

    public float T() {
        return this.h;
    }

    public void u(float f10) {
        this.o = f10;
    }

    public float I() {
        return this.o;
    }

    public void n(BufferedImage bufferedImage) {
        this.A = bufferedImage;
    }

    public BufferedImage P() {
        return this.A;
    }

    public void W(boolean bl) {
        this.u = bl;
    }

    public boolean h() {
        return this.u;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int n10 = bufferedImage.getWidth();
        int n11 = bufferedImage.getHeight();
        String[] stringArray = W5.q();
        BufferedImage bufferedImage3 = bufferedImage2;
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage3 = this.A;
        }
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                return bufferedImage2;
            }
            bufferedImage3 = this.A;
        }
        int n12 = bufferedImage3.getWidth();
        int n13 = this.A.getHeight();
        float f10 = this.h * (1.0f + this.o);
        float f11 = 255.0f * (f10 - this.o);
        float f12 = 255.0f * f10;
        int[] nArray = new int[n10];
        int[] nArray2 = new int[n12];
        int n14 = 0;
        block0: while (true) {
            int n15 = n14;
            block1: while (n15 < n11) {
                this.l(bufferedImage, 0, n14, n10, 1, nArray);
                this.l(this.A, 0, n14 % n13, n12, 1, nArray2);
                int n16 = 0;
                while (n16 < n10) {
                    int n17 = nArray2[n16 % n12];
                    int n18 = nArray[n16];
                    int n19 = iw_2.g(n17);
                    float f13 = NM.k(f11, f12, n19);
                    int n20 = (int)(255.0f * f13);
                    if (stringArray != null) {
                        n15 = this.u ? 1 : 0;
                        if (stringArray == null) continue block1;
                        if (n15 != 0) {
                            n20 = h1_0.a(2403, 6318691238013243380L) - n20;
                        }
                        nArray[n16] = n20 << h1_0.a(22932, 2413232373991595776L) | n18 & h1_0.a(18328, 4787953961670263054L);
                        ++n16;
                    }
                    if (stringArray != null) continue;
                }
                this.E(bufferedImage2, 0, n14, n10, 1, nArray);
                ++n14;
                if (stringArray != null) continue block0;
            }
            break;
        }
        return bufferedImage2;
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
                char[] cArray3 = "3:1gABd\u000e'>z\u001dlb\u0006,9l\\_00! l\u001c\u0005>".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 95;
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
                            n17 = 56;
                            break;
                        }
                        case 1: {
                            n17 = 23;
                            break;
                        }
                        case 2: {
                            n17 = 15;
                            break;
                        }
                        case 3: {
                            n17 = 86;
                            break;
                        }
                        case 4: {
                            n17 = 109;
                            break;
                        }
                        case 5: {
                            n17 = 116;
                            break;
                        }
                        default: {
                            n17 = 79;
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
        long l2 = 8345881065097258281L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u00ce\u0093:G\u0090\u007f\u00db\u00d8\u0097\u00ee(g\u00c1\u00e0\u00ea\"\u00d8W\u00b5\b\u00d2\u00fa:1";
        int n19 = "\u00ce\u0093:G\u0090\u007f\u00db\u00d8\u0097\u00ee(g\u00c1\u00e0\u00ea\"\u00d8W\u00b5\b\u00d2\u00fa:1".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x696;
        if (c[n11] == null) {
            h1_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

