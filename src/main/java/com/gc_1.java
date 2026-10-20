/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.g3_0;

/*
 * Renamed from com.gC
 */
public class gc_1
extends g3_0 {
    private float t = 0.4f;
    private boolean K = false;
    private int M = (int)j;
    private float f = 0.1f;
    private static final String d;
    private static final long j;

    public gc_1() {
        this.u(16.0f);
        this.U(0.0f);
    }

    public void Z(float f10) {
        this.t = f10;
    }

    public float J() {
        return this.t;
    }

    public void D(boolean bl) {
        this.K = bl;
    }

    public boolean H() {
        return this.K;
    }

    public void m(int n10) {
        this.M = n10;
    }

    public int v() {
        return this.M;
    }

    public void z(float f10) {
        this.f = f10;
    }

    public float s() {
        return this.f;
    }

    @Override
    public int J(int n10, int n11, int[] nArray, int n12, int n13) {
        int n14;
        block4: {
            int n15;
            block2: {
                float f10;
                float f11;
                block3: {
                    float f12 = this.i * (float)n10 + this.x * (float)n11;
                    float f13 = this.O * (float)n10 + this.h * (float)n11;
                    f12 /= this.E;
                    f13 /= this.E * this.N;
                    f11 = this.h(f12 += 1000.0f, f13 += 1000.0f);
                    f10 = this.n[0].S;
                    int n16 = NM.L((int)((this.n[0].E - 1000.0f) * this.E), 0, n12 - 1);
                    String[] stringArray = W5.q();
                    int n17 = NM.L((int)((this.n[0].k - 1000.0f) * this.E), 0, n13 - 1);
                    n14 = nArray[n17 * n12 + n16];
                    n15 = this.K;
                    if (stringArray == null) break block2;
                    if (n15 == 0) break block3;
                    float f14 = this.n[1].S;
                    n16 = NM.L((int)((this.n[1].E - 1000.0f) * this.E), 0, n12 - 1);
                    n17 = NM.L((int)((this.n[1].k - 1000.0f) * this.E), 0, n13 - 1);
                    int n18 = nArray[n17 * n12 + n16];
                    n14 = NM.n(0.5f * f10 / f14, n14, n18);
                    if (stringArray != null) break block4;
                }
                f11 = 1.0f - NM.k(this.t, this.t + this.f, f10);
                n15 = NM.n(f11, this.M, n14);
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
                char[] cArray3 = "Ej-\u000bm\u000fnafz>n\naaj9\u0002h\u0019j;-{".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 19;
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
                            n17 = 6;
                            break;
                        }
                        case 1: {
                            n17 = 16;
                            break;
                        }
                        case 2: {
                            n17 = 70;
                            break;
                        }
                        case 3: {
                            n17 = 125;
                            break;
                        }
                        case 4: {
                            n17 = 18;
                            break;
                        }
                        case 5: {
                            n17 = 112;
                            break;
                        }
                        default: {
                            n17 = 28;
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
        long l2 = 8141687885352367223L;
        j = 0xCFDBFE9139877477L ^ l2;
    }
}

