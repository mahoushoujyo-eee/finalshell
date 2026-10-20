/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.xX
 */
public class xx_1 {
    private static final long[] a;
    private static final Integer[] b;

    public static BufferedImage C(BufferedImage bufferedImage, boolean bl) {
        BufferedImage bufferedImage2;
        block8: {
            bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 2);
            int n10 = bufferedImage.getWidth();
            int n11 = bufferedImage.getHeight();
            int n12 = _y_0.y();
            int[] nArray = new int[n10 * n11];
            nArray = bufferedImage.getRGB(0, 0, n10, n11, nArray, 0, n10);
            int n13 = 0;
            int n14 = n10;
            int n15 = 0;
            block0: while (true) {
                int n16 = n15;
                block1: while (n16 < n11) {
                    if (n12 != 0) break block8;
                    for (int i2 = 0; i2 < n10; ++i2) {
                        int n17;
                        float f10;
                        int n18;
                        int n19;
                        int n20;
                        Color color;
                        block11: {
                            int n21;
                            block9: {
                                block10: {
                                    color = new Color(bufferedImage.getRGB(i2, n15), true);
                                    int n22 = color.getAlpha();
                                    n20 = color.getRed();
                                    n19 = color.getGreen();
                                    n18 = color.getBlue();
                                    f10 = 0.0f;
                                    n17 = xx_1.a(32228, 3365650341355253721L);
                                    n16 = bl ? 1 : 0;
                                    if (n12 != 0) continue block1;
                                    if (n12 != 0) break block9;
                                    if (n16 != 0) break block10;
                                    f10 = (float)Math.sqrt(Math.pow(i2 - n14, 2.0) + Math.pow(n15 - n14, 2.0));
                                    if (n12 == 0) break block11;
                                }
                                n21 = i2;
                            }
                            f10 = (float)Math.sqrt(Math.pow(n21, 2.0) + Math.pow(n15 - n14, 2.0));
                        }
                        int n23 = n17 = (int)(255.0f * f10 / (float)n10);
                        int n24 = xx_1.a(6814, 7803854575031683234L);
                        if (n12 == 0) {
                            if (n23 > n24) {
                                n17 = xx_1.a(6814, 7803854575031683234L);
                            }
                            n23 = xx_1.a(6814, 7803854575031683234L);
                            n24 = n17;
                        }
                        n17 = n23 - n24;
                        color = new Color(n20, n19, n18, n17);
                        nArray[n13] = color.getRGB();
                        ++n13;
                        if (n12 == 0) continue;
                    }
                    ++n15;
                    if (n12 == 0) continue block0;
                }
                break;
            }
            bufferedImage2.setRGB(0, 0, n10, n11, nArray, 0, n10);
        }
        return bufferedImage2;
    }

    public static BufferedImage G(BufferedImage bufferedImage, boolean bl) {
        BufferedImage bufferedImage2;
        block9: {
            bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 2);
            int n10 = _y_0.y();
            Graphics2D graphics2D = bufferedImage2.createGraphics();
            int n11 = bufferedImage.getWidth();
            int n12 = bufferedImage.getHeight();
            int[] nArray = new int[n11 * n12];
            nArray = bufferedImage.getRGB(0, 0, n11, n12, nArray, 0, n11);
            int n13 = 0;
            int n14 = 0;
            block0: while (true) {
                int n15 = n14;
                block1: while (n15 < n12) {
                    if (n10 != 0) break block9;
                    for (int i2 = 0; i2 < n11; ++i2) {
                        int n16;
                        int n17;
                        int n18;
                        int n19;
                        Color color;
                        block11: {
                            int n20;
                            block10: {
                                color = new Color(bufferedImage.getRGB(i2, n14), true);
                                int n21 = color.getAlpha();
                                n19 = color.getRed();
                                n18 = color.getGreen();
                                n17 = color.getBlue();
                                n16 = (int)(255.0f * (float)n14 / (float)n12);
                                n15 = bl ? 1 : 0;
                                if (n10 != 0) continue block1;
                                if (n15 == 0) {
                                    // empty if block
                                }
                                n20 = n16;
                                if (n10 == 0) {
                                    if (n20 > xx_1.a(6814, 7803854575031683234L)) {
                                        n16 = xx_1.a(6814, 7803854575031683234L);
                                    }
                                    n20 = bl ? 1 : 0;
                                }
                                if (n10 != 0) break block10;
                                if (n20 == 0) break block11;
                                n20 = xx_1.a(6814, 7803854575031683234L) - n16;
                            }
                            n16 = n20;
                        }
                        color = new Color(n19, n18, n17, n16);
                        nArray[n13] = color.getRGB();
                        ++n13;
                        if (n10 == 0) continue;
                    }
                    ++n14;
                    if (n10 == 0) continue block0;
                }
                break;
            }
            bufferedImage2.setRGB(0, 0, n11, n12, nArray, 0, n11);
        }
        return bufferedImage2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6736174549470996823L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00f5$\u00a9j\u00b1\u00ac\u00e1\n/`\u00a6!T\u0098\u0006q";
        int n11 = "\u00f5$\u00a9j\u00b1\u00ac\u00e1\n/`\u00a6!T\u0098\u0006q".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x123C;
        if (b[n11] == null) {
            xx_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

