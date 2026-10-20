/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class WM
extends W5 {
    private int U;
    private int A;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public WM() {
        this(WM.a(19608, 8310446517117948266L), WM.a(30524, 8589244937408686799L));
    }

    public WM(int n10, int n11) {
        this.U = n10;
        this.A = n11;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        Object object;
        int n10 = bufferedImage.getWidth();
        int n11 = bufferedImage.getHeight();
        String[] stringArray = W5.q();
        BufferedImage bufferedImage3 = bufferedImage2;
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                object = bufferedImage.getColorModel();
                bufferedImage2 = new BufferedImage((ColorModel)object, ((ColorModel)object).createCompatibleWritableRaster(this.U, this.A), ((ColorModel)object).isAlphaPremultiplied(), null);
            }
            bufferedImage3 = bufferedImage2;
        }
        object = bufferedImage3.createGraphics();
        ((Graphics2D)object).setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        ((Graphics)object).drawImage(bufferedImage, 0, 0, this.U, this.A, null);
        ((Graphics)object).dispose();
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
                char[] cArray3 = "\u0016\u007f%\u001cya\u0013}T?\u000bcq\u000e16\u0005\u000bw\u007f\u0002".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 10;
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
                            n17 = 88;
                            break;
                        }
                        case 1: {
                            n17 = 28;
                            break;
                        }
                        case 2: {
                            n17 = 92;
                            break;
                        }
                        case 3: {
                            n17 = 98;
                            break;
                        }
                        case 4: {
                            n17 = 28;
                            break;
                        }
                        case 5: {
                            n17 = 25;
                            break;
                        }
                        default: {
                            n17 = 109;
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
        long l2 = 387946350401585980L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u00fcf|V0\u0089\u00a9\u00d3j\u0098\u0086\u001a\u00d6*\u0012v";
        int n19 = "\u00fcf|V0\u0089\u00a9\u00d3j\u0098\u0086\u001a\u00d6*\u0012v".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5DF3;
        if (c[n11] == null) {
            WM.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

