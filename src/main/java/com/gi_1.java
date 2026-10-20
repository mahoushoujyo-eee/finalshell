/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.g3_0;

/*
 * Renamed from com.gI
 */
public class gi_1
extends g3_0 {
    private float s = 0.4f;
    private boolean R = false;
    private int m = (int)f;
    private static final String d;
    private static final long f;

    public gi_1() {
        this.u(16.0f);
        this.U(0.0f);
    }

    public void O(float f10) {
        this.s = f10;
    }

    public float a() {
        return this.s;
    }

    public void x(boolean bl) {
        this.R = bl;
    }

    public boolean t() {
        return this.R;
    }

    public void o(int n10) {
        this.m = n10;
    }

    public int h() {
        return this.m;
    }

    @Override
    public int J(int n10, int n11, int[] nArray, int n12, int n13) {
        int n14;
        block4: {
            int n15;
            block2: {
                float f10;
                block3: {
                    float f11 = this.i * (float)n10 + this.x * (float)n11;
                    float f12 = this.O * (float)n10 + this.h * (float)n11;
                    String[] stringArray = W5.q();
                    f11 /= this.E;
                    f12 /= this.E * this.N;
                    f10 = this.h(f11 += 1000.0f, f12 += 1000.0f);
                    float f13 = this.n[0].S;
                    float f14 = this.n[1].S;
                    int n16 = NM.L((int)((this.n[0].E - 1000.0f) * this.E), 0, n12 - 1);
                    int n17 = NM.L((int)((this.n[0].k - 1000.0f) * this.E), 0, n13 - 1);
                    n14 = nArray[n17 * n12 + n16];
                    f10 = (f14 - f13) / this.s;
                    f10 = NM.k(0.0f, this.s, f10);
                    n15 = this.R;
                    if (stringArray == null) break block2;
                    if (n15 == 0) break block3;
                    n16 = NM.L((int)((this.n[1].E - 1000.0f) * this.E), 0, n12 - 1);
                    n17 = NM.L((int)((this.n[1].k - 1000.0f) * this.E), 0, n13 - 1);
                    int n18 = nArray[n17 * n12 + n16];
                    n18 = NM.n(0.5f, n18, n14);
                    n14 = NM.n(f10, n18, n14);
                    if (stringArray != null) break block4;
                }
                n15 = NM.n(f10, this.m, n14);
            }
            n14 = n15;
        }
        return n14;
    }

    @Override
    public String toString() {
        return d;
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
                char[] cArray3 = "Pa\u0007e\u0018D0tmPC\u0006Q\"ti\u0013l\u001dR4.&Q".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 92;
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
                            n17 = 92;
                            break;
                        }
                        case 1: {
                            n17 = 84;
                            break;
                        }
                        case 2: {
                            n17 = 35;
                            break;
                        }
                        case 3: {
                            n17 = 92;
                            break;
                        }
                        case 4: {
                            n17 = 40;
                            break;
                        }
                        case 5: {
                            n17 = 116;
                            break;
                        }
                        default: {
                            n17 = 13;
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
        d = new String(cArray).intern();
        long l2 = 8239549337653411640L;
        f = 0xD3A15B0E4B22FF38L ^ l2;
    }
}

