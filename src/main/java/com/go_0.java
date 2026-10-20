/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O;
import com.W5;
import com.od_2;
import java.awt.Color;

/*
 * Renamed from com.Go
 */
public class go_0
implements Cloneable {
    int T = 0;
    od_2 j;
    od_2 r;
    O H = new O();
    int Y = -1;
    float L;
    float D;
    float F;
    float w = 0.5f;
    float V = 0.5f;
    float u = 0.5f;
    float v = 0.5235988f;
    float X;
    float k = 100.0f;
    private static final String a;

    public go_0() {
        this(4.712389f, 0.5235988f, 1.0f);
    }

    public go_0(float f10, float f11, float f12) {
        this.D = f10;
        this.F = f11;
        this.L = f12;
    }

    public void p(float f10) {
        this.D = f10;
    }

    public float S() {
        return this.D;
    }

    public void d(float f10) {
        this.F = f10;
    }

    public float L() {
        return this.F;
    }

    public void W(float f10) {
        this.k = f10;
    }

    public float X() {
        return this.k;
    }

    public void j(float f10) {
        this.L = f10;
    }

    public float q() {
        return this.L;
    }

    public void U(float f10) {
        this.v = f10;
    }

    public float s() {
        return this.v;
    }

    public void o(float f10) {
        this.w = f10;
    }

    public float Q() {
        return this.w;
    }

    public void j(int n10) {
        this.Y = n10;
    }

    public int U() {
        return this.Y;
    }

    public void h(float f10) {
        this.V = f10;
    }

    public float M() {
        return this.V;
    }

    public void Z(float f10) {
        this.u = f10;
    }

    public float o() {
        return this.u;
    }

    public void j(int n10, int n11) {
        float f10 = (float)(Math.cos(this.D) * Math.cos(this.F));
        float f11 = (float)(Math.sin(this.D) * Math.cos(this.F));
        String[] stringArray = W5.q();
        float f12 = (float)Math.sin(this.F);
        this.r = new od_2(f10, f11, f12);
        this.r.E();
        go_0 go_02 = this;
        if (stringArray != null) {
            if (go_02.T != 1) {
                f10 *= this.k;
                f11 *= this.k;
                f12 *= this.k;
                f10 += (float)n10 * this.V;
                f11 += (float)n11 * this.u;
            }
            this.j = new od_2(f10, f11, f12);
            this.H.x(new Color(this.Y));
            this.H.K(this.L);
            go_02 = this;
        }
        go_02.X = (float)Math.cos(this.v);
    }

    public Object clone() {
        try {
            go_0 go_02 = (go_0)super.clone();
            return go_02;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
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
                char[] cArray3 = "\u001eqk7c".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 119;
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
                            n17 = 37;
                            break;
                        }
                        case 1: {
                            n17 = 111;
                            break;
                        }
                        case 2: {
                            n17 = 123;
                            break;
                        }
                        case 3: {
                            n17 = 40;
                            break;
                        }
                        case 4: {
                            n17 = 96;
                            break;
                        }
                        case 5: {
                            n17 = 43;
                            break;
                        }
                        default: {
                            n17 = 124;
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

