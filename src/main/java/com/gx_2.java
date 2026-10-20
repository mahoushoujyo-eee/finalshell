/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

/*
 * Renamed from com.gx
 */
public class gx_2
extends W5 {
    private int I;
    private int L;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public gx_2() {
        this(gx_2.a(19878, 202536531292673529L), gx_2.a(22510, 7587775295191338930L));
    }

    public gx_2(int n10, int n11) {
        this.I = n10;
        this.L = n11;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        Transparency transparency;
        String[] stringArray = W5.q();
        Image image = bufferedImage2;
        if (stringArray != null) {
            if (image == null) {
                transparency = bufferedImage.getColorModel();
                bufferedImage2 = new BufferedImage((ColorModel)transparency, ((ColorModel)transparency).createCompatibleWritableRaster(this.I, this.L), ((ColorModel)transparency).isAlphaPremultiplied(), null);
            }
            image = bufferedImage.getScaledInstance(this.I, this.L, gx_2.a(4659, 537349642251962989L));
        }
        transparency = image;
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.drawImage((Image)((Object)transparency), 0, 0, this.I, this.L, null);
        graphics2D.dispose();
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
                char[] cArray3 = "NlE\u0015\u0006\\\"%VU\u0000\u0005K".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 127;
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
                            n17 = 117;
                            break;
                        }
                        case 1: {
                            n17 = 122;
                            break;
                        }
                        case 2: {
                            n17 = 73;
                            break;
                        }
                        case 3: {
                            n17 = 30;
                            break;
                        }
                        case 4: {
                            n17 = 22;
                            break;
                        }
                        case 5: {
                            n17 = 81;
                            break;
                        }
                        default: {
                            n17 = 41;
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
        long l2 = 1626609472003773652L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u00cf:\u0096;E\u008e\u009e\u00a9wEH\u00be\u00a6\u00afA\r\u00bd\u0018\u00fa\\\u00b6O[F";
        int n19 = "\u00cf:\u0096;E\u008e\u009e\u00a9wEH\u00be\u00a6\u00afA\r\u00bd\u0018\u00fa\\\u00b6O[F".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x185E;
        if (c[n11] == null) {
            gx_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

