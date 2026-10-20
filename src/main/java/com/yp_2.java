/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.gp_2;
import com.yj_2;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.yp
 */
public class yp_2
extends yj_2 {
    private float Z = 0.5f;
    private float h = 1.0f;
    private static final String c;

    public void X(float f10) {
        this.Z = f10;
    }

    public float z() {
        return this.Z;
    }

    public void x(float f10) {
        this.h = f10;
    }

    public float N() {
        return this.h;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        this.E(1);
        bufferedImage2 = super.filter(bufferedImage, bufferedImage2);
        gp_2 gp_22 = new gp_2(this);
        return gp_22.filter(bufferedImage2, bufferedImage2);
    }

    @Override
    public String toString() {
        return c;
    }

    static float f(yp_2 yp_22) {
        return yp_22.Z;
    }

    static float o(yp_2 yp_22) {
        return yp_22.h;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "T\u00171HqS\">2?_}J4?_y".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 26;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
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
                            n17 = 11;
                            break;
                        }
                        case 1: {
                            n17 = 107;
                            break;
                        }
                        case 2: {
                            n17 = 77;
                            break;
                        }
                        case 3: {
                            n17 = 55;
                            break;
                        }
                        case 4: {
                            n17 = 8;
                            break;
                        }
                        case 5: {
                            n17 = 61;
                            break;
                        }
                        default: {
                            n17 = 75;
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
        c = new String(cArray).intern();
    }
}

