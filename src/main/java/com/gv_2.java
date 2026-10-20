/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.C4;
import com.NM;
import com.SC;
import com.W5;
import com.hn_1;
import com.iw_2;
import com.po_0;
import com.uZ;

/*
 * Renamed from com.gv
 */
public class gv_2
extends hn_1 {
    private float v = 32.0f;
    private float u = 1.0f;
    private float k = 0.0f;
    public float m = 1.0f;
    public float x = 1.0f;
    public float I = 0.5f;
    public float T = 0.5f;
    public int U;
    private float S = 1.0f;
    private float C = 0.0f;
    private float V = 0.0f;
    private float s = 1.0f;
    private po_0 l = new C4();
    private SC F = new uZ();
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void L(float f10) {
        this.m = f10;
    }

    public float J() {
        return this.m;
    }

    public void B(SC sC) {
        this.F = sC;
    }

    public SC M() {
        return this.F;
    }

    public void L(int n10) {
        this.U = n10;
    }

    public int A() {
        return this.U;
    }

    public void l(float f10) {
        this.v = f10;
    }

    public float R() {
        return this.v;
    }

    public void I(float f10) {
        this.u = f10;
    }

    public float K() {
        return this.u;
    }

    public void y(float f10) {
        this.k = f10;
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        this.S = f11;
        this.C = f12;
        this.V = -f12;
        this.s = f11;
    }

    public float I() {
        return this.k;
    }

    public void N(float f10) {
        this.x = f10;
    }

    public float N() {
        return this.x;
    }

    public void g(po_0 po_02) {
        this.l = po_02;
    }

    public po_0 r() {
        return this.l;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int C(int var1_1, int var2_2, int var3_3) {
        block9: {
            block8: {
                block7: {
                    var5_4 = this.S * (float)var1_1 + this.C * (float)var2_2;
                    var6_5 = this.V * (float)var1_1 + this.s * (float)var2_2;
                    var5_4 /= this.v;
                    var6_5 /= this.v * this.u;
                    var4_6 = W5.q();
                    v0 = this.x;
                    if (var4_6 == null) ** GOTO lbl12
                    if ((double)v0 == 1.0) {
                        v1 = uZ.x(var5_4, var6_5);
                    } else {
                        v0 = var5_4;
lbl12:
                        // 2 sources

                        v1 = uZ.q(v0, var6_5, this.x);
                    }
                    var7_7 = v1;
                    var7_7 = var7_7 * 0.5f + 0.5f;
                    var7_7 = NM.w(var7_7, this.I);
                    var7_7 = NM.E(var7_7, this.T);
                    var7_7 *= this.m;
                    var8_8 = var3_3 & gv_2.a(12631, 4424826963692083416L);
                    v2 = this.l;
                    if (var4_6 == null) break block7;
                    if (v2 == null) break block8;
                    v2 = this.l;
                }
                var9_9 = v2.D(var7_7);
                if (var4_6 != null) break block9;
            }
            var9_9 = iw_2.e((int)(var7_7 * 255.0f));
            var10_10 = var9_9 << gv_2.a(20503, 812447778416540058L);
            var11_11 = var9_9 << gv_2.a(22594, 5252387932988617166L);
            var12_12 = var9_9;
            var9_9 = var8_8 | var10_10 | var11_11 | var12_12;
        }
        v3 = this.U;
        if (var4_6 != null) {
            if (v3 != 0) {
                var9_9 = iw_2.P(var3_3, var9_9, this.U);
            }
            v3 = var9_9;
        }
        return v3;
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
                char[] cArray3 = "Kn-\u001d\fe}0E:\u0000\nr61%".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 27;
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
                            n17 = 4;
                            break;
                        }
                        case 1: {
                            n17 = 16;
                            break;
                        }
                        case 2: {
                            n17 = 78;
                            break;
                        }
                        case 3: {
                            n17 = 114;
                            break;
                        }
                        case 4: {
                            n17 = 98;
                            break;
                        }
                        case 5: {
                            n17 = 12;
                            break;
                        }
                        default: {
                            n17 = 3;
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
        long l2 = 6777714783949377007L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "#\u00d9\u00f7\u00e1\u0089%\u00f4eT\u0002\u0097\u0081\u008eb\u00fc)\n\u0015\u008e\u0096ZX\u00957";
        int n19 = "#\u00d9\u00f7\u00e1\u0089%\u00f4eT\u0002\u0097\u0081\u008eb\u00fc)\n\u0015\u008e\u0096ZX\u00957".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x698D;
        if (c[n11] == null) {
            gv_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

