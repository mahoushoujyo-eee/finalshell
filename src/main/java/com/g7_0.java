/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

/*
 * Renamed from com.g7
 */
public class g7_0
extends W5 {
    private int E;
    private int c;
    private static final String a;
    private static final long[] b;
    private static final Integer[] d;

    public g7_0() {
        this(g7_0.a(20983, 3007134835169026756L), g7_0.a(32655, 7105656701496052925L));
    }

    public g7_0(int n10, int n11) {
        this.E = n10;
        this.c = n11;
    }

    public void P(int n10) {
        this.E = n10;
    }

    public int Q() {
        return this.E;
    }

    public void Y(int n10) {
        this.c = n10;
    }

    public int r() {
        return this.c;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        block5: {
            Object object;
            int n10 = bufferedImage.getWidth();
            String[] stringArray = W5.q();
            int n11 = bufferedImage.getHeight();
            BufferedImage bufferedImage3 = bufferedImage2;
            if (stringArray != null) {
                if (bufferedImage3 == null) {
                    object = bufferedImage.getColorModel();
                    bufferedImage2 = new BufferedImage((ColorModel)object, ((ColorModel)object).createCompatibleWritableRaster(this.E, this.c), ((ColorModel)object).isAlphaPremultiplied(), null);
                }
                bufferedImage3 = bufferedImage2;
            }
            object = bufferedImage3.createGraphics();
            int n12 = 0;
            while (n12 < this.c) {
                block6: {
                    if (stringArray == null) break block5;
                    for (int i2 = 0; i2 < this.E; i2 += n10) {
                        ((Graphics2D)object).drawImage(bufferedImage, null, i2, n12);
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block6;
                    }
                    n12 += n11;
                }
                if (stringArray != null) continue;
            }
            ((Graphics)object).dispose();
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
                char[] cArray3 = "+\u001aft".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 124;
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
                            n17 = 3;
                            break;
                        }
                        case 1: {
                            n17 = 15;
                            break;
                        }
                        case 2: {
                            n17 = 118;
                            break;
                        }
                        case 3: {
                            n17 = 109;
                            break;
                        }
                        case 4: {
                            n17 = 43;
                            break;
                        }
                        case 5: {
                            n17 = 59;
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
        long l2 = 5242703475794634724L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "%\u00ca\u0018L\u00f8\u0082\u0005\u0000b\u0081\u00fc\u00a6\u00a5\u00fa+y";
        int n19 = "%\u00ca\u0018L\u00f8\u0082\u0005\u0000b\u0081\u00fc\u00a6\u00a5\u00fa+y".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        d = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3333;
        if (d[n11] == null) {
            g7_0.d[n11] = (int)(b[n11] ^ l2);
        }
        return d[n11];
    }
}

