/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gy_2;
import com.iw_2;
import com.uZ;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.gN
 */
public class gn_1
extends gy_2 {
    private float[] T;
    private float[] M;
    private float n = 4.0f;
    private float S = 4.0f;
    private float i = 1.0f;
    private float N = 1.0f;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public gn_1() {
        this.Y(1);
    }

    public void C(float f10) {
        this.n = f10;
    }

    public float u() {
        return this.n;
    }

    public void W(float f10) {
        this.S = f10;
    }

    public float E() {
        return this.S;
    }

    public void L(float f10) {
        this.i = f10;
    }

    public float L() {
        return this.i;
    }

    public void o(float f10) {
        this.N = f10;
    }

    public float a() {
        return this.N;
    }

    private void r() {
        this.T = new float[gn_1.b(31694, 5517541827996539773L)];
        this.M = new float[gn_1.b(15666, 3174700197610003840L)];
        String[] stringArray = W5.q();
        for (int i2 = 0; i2 < gn_1.b(15666, 3174700197610003840L); ++i2) {
            float f10 = (float)Math.PI * 2 * (float)i2 / 256.0f * this.N;
            this.T[i2] = (float)((double)(-this.S) * Math.sin(f10));
            this.M[i2] = (float)((double)this.S * Math.cos(f10));
            if (stringArray != null) continue;
        }
    }

    private int F(int n10, int n11) {
        return iw_2.e((int)(127.0f * (1.0f + uZ.x((float)n10 / this.n, (float)n11 / this.n))));
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        int n12 = this.F(n10, n11);
        fArray[0] = (float)n10 + this.T[n12];
        fArray[1] = (float)n11 + this.M[n12];
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        this.r();
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
                char[] cArray3 = "I_SHu6!\"{ANx(0#\u0018\u000e".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 18;
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
                            n17 = 31;
                            break;
                        }
                        case 1: {
                            n17 = 36;
                            break;
                        }
                        case 2: {
                            n17 = 50;
                            break;
                        }
                        case 3: {
                            n17 = 46;
                            break;
                        }
                        case 4: {
                            n17 = 8;
                            break;
                        }
                        case 5: {
                            n17 = 86;
                            break;
                        }
                        default: {
                            n17 = 71;
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
        long l2 = 6123596083155539961L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u00b8\u00d5\u00e1\u00a4\u00b7bM\u0084\u00aa2jU\u00ee\u009d\u008by";
        int n19 = "\u00b8\u00d5\u00e1\u00a4\u00b7bM\u0084\u00aa2jU\u00ee\u009d\u008by".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x20B3;
        if (c[n11] == null) {
            gn_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

