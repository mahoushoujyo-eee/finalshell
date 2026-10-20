/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.gy_2;
import com.uZ;
import java.awt.Rectangle;

/*
 * Renamed from com.gc
 */
public class gc_2
extends gy_2 {
    private float W = 5.0f;
    private float L = 0.0f;
    private float o = 16.0f;
    private float B = 16.0f;
    private int m;
    private static final String a;

    public void K(float f10) {
        this.W = f10;
    }

    public float j() {
        return this.W;
    }

    public void Y(float f10) {
        this.o = f10;
    }

    public float O() {
        return this.o;
    }

    public void W(float f10) {
        this.L = f10;
    }

    public float J() {
        return this.L;
    }

    public void G(float f10) {
        this.B = f10;
    }

    public float v() {
        return this.B;
    }

    public void H(int n10) {
        this.m = n10;
    }

    public int c() {
        return this.m;
    }

    @Override
    protected void T(Rectangle rectangle) {
        block3: {
            block2: {
                String[] stringArray = W5.q();
                if (stringArray == null) break block2;
                if (this.t != 0) break block3;
                rectangle.x -= (int)this.W;
                rectangle.width += (int)(2.0f * this.W);
                rectangle.y -= (int)this.L;
            }
            rectangle.height += (int)(2.0f * this.L);
        }
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        float f10;
        float f11;
        float f12 = (float)n11 / this.o;
        String[] stringArray = W5.q();
        float f13 = (float)n10 / this.B;
        switch (this.m) {
            default: {
                f11 = (float)Math.sin(f12);
                f10 = (float)Math.sin(f13);
                if (stringArray != null) break;
            }
            case 1: {
                f11 = NM.i(f12, 1.0f);
                f10 = NM.i(f13, 1.0f);
                if (stringArray != null) break;
            }
            case 2: {
                f11 = NM.l(f12);
                f10 = NM.l(f13);
                if (stringArray != null) break;
            }
            case 3: {
                f11 = uZ.x(f12);
                f10 = uZ.x(f13);
            }
        }
        fArray[0] = (float)n10 + this.W * f11;
        fArray[1] = (float)n11 + this.L * f10;
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
                char[] cArray3 = "NmF\u001c!\t\u001a%V\\\u0018>\u0017\u000b$*\u001b".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 16;
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
                            n17 = 26;
                            break;
                        }
                        case 1: {
                            n17 = 20;
                            break;
                        }
                        case 2: {
                            n17 = 37;
                            break;
                        }
                        case 3: {
                            n17 = 120;
                            break;
                        }
                        case 4: {
                            n17 = 94;
                            break;
                        }
                        case 5: {
                            n17 = 107;
                            break;
                        }
                        default: {
                            n17 = 126;
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

