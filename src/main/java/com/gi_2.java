/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gy_2;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.gi
 */
public class gi_2
extends gy_2 {
    private float[] X;
    private float[] e;
    private float w = 4.0f;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public gi_2() {
        this.Y(1);
    }

    public void f(float f10) {
        this.w = f10;
    }

    public float D() {
        return this.w;
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        int n12 = (int)(Math.random() * 255.0);
        float f10 = (float)Math.random();
        fArray[0] = (float)n10 + f10 * this.X[n12];
        fArray[1] = (float)n11 + f10 * this.e[n12];
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        gi_2 gi_22;
        block2: {
            this.X = new float[gi_2.b(17454, 4357647261016193132L)];
            String[] stringArray = W5.q();
            this.e = new float[gi_2.b(25936, 152856635800901907L)];
            for (int i2 = 0; i2 < gi_2.b(25936, 152856635800901907L); ++i2) {
                float f10 = (float)Math.PI * 2 * (float)i2 / 256.0f;
                this.X[i2] = (float)((double)this.w * Math.sin(f10));
                gi_22 = this;
                if (stringArray != null) {
                    gi_22.e[i2] = (float)((double)this.w * Math.cos(f10));
                    if (stringArray != null) continue;
                }
                break block2;
            }
            gi_22 = this;
        }
        return super.filter(bufferedImage, bufferedImage2);
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
                char[] cArray3 = "a#F-!J\u0012\n\u000e\\?(M\u0015@d\u001bw".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 117;
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
                            n17 = 80;
                            break;
                        }
                        case 1: {
                            n17 = 63;
                            break;
                        }
                        case 2: {
                            n17 = 64;
                            break;
                        }
                        case 3: {
                            n17 = 44;
                            break;
                        }
                        case 4: {
                            n17 = 59;
                            break;
                        }
                        case 5: {
                            n17 = 77;
                            break;
                        }
                        default: {
                            n17 = 19;
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
        long l2 = 4566877758410028636L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "-v[sc\u00fb\u008f0\u00b0'C\u00de\u001c\u00d0.O";
        int n19 = "-v[sc\u00fb\u008f0\u00b0'C\u00de\u001c\u00d0.O".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3C42;
        if (c[n11] == null) {
            gi_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

