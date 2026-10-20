/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.gt_1;
import com.hr_0;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.yg
 */
public class yg_2
extends gt_1 {
    private hr_0 L;
    private hr_0 F;
    private int v = 1;
    private BufferedImage s;
    private float t;
    private static final String a;

    public yg_2() {
    }

    public yg_2(hr_0 hr_02, hr_0 hr_03) {
        this.L = hr_02;
        this.F = hr_03;
    }

    public void x(hr_0 hr_02) {
        this.L = hr_02;
    }

    public hr_0 y() {
        return this.L;
    }

    public void i(hr_0 hr_02) {
        this.F = hr_02;
    }

    public hr_0 c() {
        return this.F;
    }

    public void e(int n10) {
        this.v = n10;
    }

    public int n() {
        return this.v;
    }

    public void P(BufferedImage bufferedImage) {
        this.s = bufferedImage;
    }

    public BufferedImage r() {
        return this.s;
    }

    public void T(float f10) {
        this.t = f10;
    }

    public float a() {
        return this.t;
    }

    @Override
    protected void J(Rectangle rectangle) {
        rectangle.width *= this.v;
    }

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int[] nArray2;
        block5: {
            Object object;
            String[] stringArray;
            block7: {
                yg_2 yg_22;
                block6: {
                    block3: {
                        block4: {
                            nArray2 = new int[n10 * n11];
                            stringArray = W5.q();
                            yg_22 = this;
                            if (stringArray == null) break block3;
                            if (yg_22.s == null) break block4;
                            object = this.l(this.s, 0, 0, n10, n11, null);
                            this.s(nArray, (int[])object, nArray2, this.L, this.F, n10, n11, this.t);
                            if (stringArray != null) break block5;
                        }
                        yg_22 = this;
                    }
                    if (stringArray == null) break block6;
                    if (yg_22.v > 1) break block7;
                    yg_22 = this;
                }
                yg_22.L.l(nArray, n10, n11, this.L, this.F, nArray2);
                if (stringArray != null) break block5;
            }
            object = new hr_0(this.L.d, this.L.F, n10, n11);
            for (int i2 = 0; i2 < this.v; ++i2) {
                float f10 = (float)i2 / (float)(this.v - 1);
                this.L.O(f10, this.F, (hr_0)object);
                this.L.l(nArray, n10, n11, this.L, (hr_0)object, nArray2);
                if (stringArray != null) continue;
            }
        }
        return nArray2;
    }

    public void s(int[] nArray, int[] nArray2, int[] nArray3, hr_0 hr_02, hr_0 hr_03, int n10, int n11, float f10) {
        hr_0 hr_04 = new hr_0(hr_02.d, hr_02.F, n10, n11);
        hr_02.O(f10, hr_03, hr_04);
        hr_02.l(nArray, n10, n11, hr_02, hr_04, nArray3);
        int[] nArray4 = new int[n10 * n11];
        hr_03.l(nArray2, n10, n11, hr_03, hr_04, nArray4);
        this.Y(nArray3, nArray4, n10, n11, f10);
    }

    public void Y(int[] nArray, int[] nArray2, int n10, int n11, float f10) {
        int n12 = 0;
        String[] stringArray = W5.q();
        int n13 = 0;
        while (n13 < n11) {
            block3: {
                for (int i2 = 0; i2 < n10; ++i2) {
                    nArray[n12] = NM.n(f10, nArray[n12], nArray2[n12]);
                    ++n12;
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                    }
                    break block3;
                }
                ++n13;
            }
            if (stringArray != null) continue;
        }
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
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "!>GR\b*tJ\u001aQU\u000fxW\u0004%D\bIv".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 24;
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
                            n17 = 125;
                            break;
                        }
                        case 1: {
                            n17 = 79;
                            break;
                        }
                        case 2: {
                            n17 = 44;
                            break;
                        }
                        case 3: {
                            n17 = 62;
                            break;
                        }
                        case 4: {
                            n17 = 127;
                            break;
                        }
                        case 5: {
                            n17 = 64;
                            break;
                        }
                        default: {
                            n17 = 24;
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
    }
}

