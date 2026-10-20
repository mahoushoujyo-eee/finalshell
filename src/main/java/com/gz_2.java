/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gy_2;
import java.awt.Rectangle;

/*
 * Renamed from com.gz
 */
public class gz_2
extends gy_2 {
    private float R = 0.0f;
    private float w = 0.0f;
    private float Z = 0.0f;
    private float u = 0.0f;
    private float V = 0.0f;
    private float E = 0.0f;
    private boolean T = true;
    private static final String a;

    public void P(boolean bl) {
        this.T = bl;
    }

    public boolean m() {
        return this.T;
    }

    public void P(float f10) {
        this.R = f10;
        this.y();
    }

    public float c() {
        return this.R;
    }

    public void z(float f10) {
        this.w = f10;
        this.y();
    }

    public float z() {
        return this.w;
    }

    private void y() {
        this.Z = (float)Math.sin(this.R);
        this.u = (float)Math.sin(this.w);
    }

    @Override
    protected void T(Rectangle rectangle) {
        block6: {
            double d2;
            float f10;
            block5: {
                f10 = (float)Math.tan(this.R);
                this.V = (float)(-rectangle.height) * f10;
                String[] stringArray = W5.q();
                double d3 = (double)f10 - 0.0;
                d2 = d3 == 0.0 ? 0 : (d3 < 0.0 ? -1 : 1);
                if (stringArray == null) break block5;
                if (d2 < 0) {
                    f10 = -f10;
                }
                rectangle.width = (int)((float)rectangle.height * f10 + (float)rectangle.width + 0.999999f);
                f10 = (float)Math.tan(this.w);
                this.E = (float)(-rectangle.width) * f10;
                if (stringArray == null) break block6;
                double d4 = (double)f10 - 0.0;
                d2 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
            }
            if (d2 < 0) {
                f10 = -f10;
            }
            rectangle.height = (int)((float)rectangle.width * f10 + (float)rectangle.height + 0.999999f);
        }
    }

    @Override
    protected void h(int n10, int n11, float[] fArray) {
        fArray[0] = (float)n10 + this.V + (float)n11 * this.Z;
        fArray[1] = (float)n11 + this.E + (float)n10 * this.u;
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
                char[] cArray3 = "r-#\tZ&\t\u0019\u00178\u0018T&S\u0018j".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 22;
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
                            n17 = 32;
                            break;
                        }
                        case 1: {
                            n17 = 82;
                            break;
                        }
                        case 2: {
                            n17 = 70;
                            break;
                        }
                        case 3: {
                            n17 = 107;
                            break;
                        }
                        case 4: {
                            n17 = 35;
                            break;
                        }
                        case 5: {
                            n17 = 66;
                            break;
                        }
                        default: {
                            n17 = 107;
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

