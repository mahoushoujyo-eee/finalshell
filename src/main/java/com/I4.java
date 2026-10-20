/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kj_2;
import com.ky_2;

public class I4 {
    protected int X;
    protected byte[] c;
    protected int u;
    protected int d;
    protected int[][] m;
    protected int[] q = new int[I4.a(5290, 1521622656332694852L)];
    protected int[] l = new int[I4.a(5321, 3772957331856065837L)];
    protected int[] B = new int[I4.a(5321, 3772957331856065837L)];
    protected int[] g = new int[I4.a(2726, 5453761995530148700L)];
    private static final long[] a;
    private static final Integer[] b;

    public I4(byte[] byArray, int n10, int n11) {
        this.c = byArray;
        this.u = n10;
        this.d = n11;
        this.m = new int[I4.a(5321, 3772957331856065837L)][];
        ky_2[] ky_2Array = kj_2.d();
        for (int i2 = 0; i2 < I4.a(5321, 3772957331856065837L); ++i2) {
            this.m[i2] = new int[4];
            int[] nArray = this.m[i2];
            nArray[1] = nArray[2] = (i2 << I4.a(16161, 4009672161975774942L)) / I4.a(5321, 3772957331856065837L);
            nArray[0] = nArray[2];
            this.B[i2] = I4.a(5321, 3772957331856065837L);
            this.l[i2] = 0;
            if (ky_2Array != null) continue;
        }
    }

    public byte[] p() {
        byte[] byArray;
        block5: {
            ky_2[] ky_2Array;
            int[] nArray;
            byte[] byArray2;
            block4: {
                int n10;
                byArray2 = new byte[I4.a(19858, 1660691168488152167L)];
                nArray = new int[I4.a(5321, 3772957331856065837L)];
                ky_2Array = kj_2.d();
                for (n10 = 0; n10 < I4.a(5321, 3772957331856065837L); ++n10) {
                    nArray[this.m[n10][3]] = n10;
                    if (ky_2Array != null) {
                        if (ky_2Array != null) continue;
                    }
                    break block4;
                }
                n10 = 0;
            }
            for (int i2 = 0; i2 < I4.a(5321, 3772957331856065837L); ++i2) {
                int n11 = nArray[i2];
                byArray2[n10++] = (byte)this.m[n11][0];
                byArray2[n10++] = (byte)this.m[n11][1];
                byArray = byArray2;
                if (ky_2Array != null) {
                    byArray[n10++] = (byte)this.m[n11][2];
                    if (ky_2Array != null) continue;
                }
                break block5;
            }
            byArray = byArray2;
        }
        return byArray;
    }

    public void m() {
        int n10;
        ky_2[] ky_2Array;
        block12: {
            int n11;
            int n12 = 0;
            int n13 = 0;
            ky_2Array = kj_2.d();
            for (int i2 = 0; i2 < I4.a(5321, 3772957331856065837L); ++i2) {
                block14: {
                    int n14;
                    int n15;
                    int[] nArray;
                    int n16;
                    int[] nArray2;
                    block13: {
                        nArray2 = this.m[i2];
                        int n17 = i2;
                        n16 = nArray2[1];
                        n11 = i2 + 1;
                        if (ky_2Array == null) break block12;
                        n10 = n11;
                        while (n10 < I4.a(5321, 3772957331856065837L)) {
                            nArray = this.m[n10];
                            if (ky_2Array != null) {
                                n15 = nArray[1];
                                n14 = n16;
                                if (ky_2Array == null) break block13;
                                if (n15 < n14) {
                                    n17 = n10;
                                    n16 = nArray[1];
                                }
                                ++n10;
                            }
                            if (ky_2Array != null) continue;
                        }
                        nArray = this.m[n17];
                        n15 = i2;
                        n14 = n17;
                    }
                    if (ky_2Array != null) {
                        if (n15 != n14) {
                            n10 = nArray[0];
                            nArray[0] = nArray2[0];
                            nArray2[0] = n10;
                            n10 = nArray[1];
                            nArray[1] = nArray2[1];
                            nArray2[1] = n10;
                            n10 = nArray[2];
                            nArray[2] = nArray2[2];
                            nArray2[2] = n10;
                            n10 = nArray[3];
                            nArray[3] = nArray2[3];
                            nArray2[3] = n10;
                        }
                        n15 = n16;
                        n14 = n12;
                    }
                    if (ky_2Array != null) {
                        if (n15 == n14) continue;
                        this.q[n12] = n13 + i2 >> 1;
                        n15 = n12;
                        n14 = 1;
                    }
                    for (n10 = (v3682206) + (v3682207); n10 < n16; ++n10) {
                        this.q[n10] = i2;
                        if (ky_2Array != null) {
                            if (ky_2Array != null) continue;
                        }
                        break block14;
                    }
                    n12 = n16;
                }
                n13 = i2;
                if (ky_2Array != null) continue;
            }
            this.q[n12] = n13 + I4.a(15506, 8562166995979119995L) >> 1;
            n11 = n10 = n12 + 1;
        }
        while (n10 < I4.a(5321, 3772957331856065837L)) {
            this.q[n10] = I4.a(15506, 8562166995979119995L);
            ++n10;
            if (ky_2Array != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void o() {
        block24: {
            block29: {
                block30: {
                    block27: {
                        block28: {
                            block25: {
                                block26: {
                                    block23: {
                                        block22: {
                                            var1_1 = kj_2.d();
                                            v0 = this;
                                            if (var1_1 != null) {
                                                if (v0.u < I4.a(30310, 7530069800600430485L)) {
                                                    this.d = 1;
                                                }
                                                this.X = I4.a(16711, 6887362107516211379L) + (this.d - 1) / 3;
                                                v0 = this;
                                            }
                                            var13_2 = v0.c;
                                            var14_3 = 0;
                                            var15_4 = this.u;
                                            var12_5 = this.u / (3 * this.d);
                                            var11_6 = var12_5 / I4.a(18036, 2268913273344972687L);
                                            var9_7 = I4.a(12674, 6204344715817492597L);
                                            var7_8 = I4.a(24439, 595035805799665296L);
                                            v1 = var8_9 = var7_8 >> I4.a(10340, 4700886911163611535L);
                                            if (var1_1 != null) {
                                                if (v1 <= 1) {
                                                    var8_9 = 0;
                                                }
                                                v1 = var2_10 = 0;
                                            }
                                            while (var2_10 < var8_9) {
                                                this.g[var2_10] = var9_7 * ((var8_9 * var8_9 - var2_10 * var2_10) * I4.a(5321, 3772957331856065837L) / (var8_9 * var8_9));
                                                ++var2_10;
                                                if (var1_1 != null) {
                                                    if (var1_1 != null) continue;
                                                }
                                                break block22;
                                            }
                                            v2 = this.u;
                                            v3 = I4.a(6014, 7336281413165221511L);
                                            if (var1_1 == null) break block23;
                                            if (v2 >= v3) break block22;
                                            var10_11 = 3;
                                            if (var1_1 != null) break block24;
                                        }
                                        v2 = this.u;
                                        v3 = I4.a(26754, 8985540181554428275L);
                                    }
                                    v4 = v2 % v3;
                                    if (var1_1 == null) break block25;
                                    if (v4 == 0) break block26;
                                    var10_11 = I4.a(12879, 2024936490490373042L);
                                    if (var1_1 != null) break block24;
                                }
                                v4 = this.u % I4.a(29223, 8520723513390523351L);
                            }
                            if (var1_1 == null) break block27;
                            if (v4 == 0) break block28;
                            var10_11 = I4.a(21815, 5556884296238548178L);
                            if (var1_1 != null) break block24;
                        }
                        v4 = this.u % I4.a(32055, 1460606690241080532L);
                    }
                    if (var1_1 == null) break block29;
                    if (v4 == 0) break block30;
                    var10_11 = I4.a(28633, 2352826868890205759L);
                    if (var1_1 != null) break block24;
                }
                v4 = I4.a(6014, 7336281413165221511L);
            }
            var10_11 = v4;
        }
        var2_10 = 0;
        block1: while (true) {
            if (var2_10 >= var12_5) return;
            var4_13 = (var13_2[var14_3] & I4.a(6194, 5070119436041882048L)) << 4;
            var5_14 = (var13_2[var14_3 + 1] & I4.a(15506, 8562166995979119995L)) << 4;
            var6_15 = (var13_2[var14_3 + 2] & I4.a(15506, 8562166995979119995L)) << 4;
            var3_12 = this.z(var4_13, var5_14, var6_15);
            this.u(var9_7, var3_12, var4_13, var5_14, var6_15);
            block2: while (true) {
                v5 = var8_9;
                if (var1_1 != null) {
                    if (v5 != 0) {
                        this.i(var8_9, var3_12, var4_13, var5_14, var6_15);
                    }
                    v5 = var14_3 += var10_11;
                }
                if (var1_1 != null) {
                    if (v5 >= var15_4) {
                        var14_3 -= this.u;
                    }
                    ++var2_10;
                    v5 = var11_6;
                }
                if (var1_1 != null) {
                    if (v5 == 0) {
                        var11_6 = 1;
                    }
                    v5 = var2_10 % var11_6;
                }
                if (var1_1 != null) {
                    if (v5 != 0) continue block1;
                    var9_7 -= var9_7 / this.X;
                    var7_8 -= var7_8 / I4.a(3017, 6861329322180057633L);
                    v5 = var8_9 = var7_8 >> I4.a(26777, 7378619417581648231L);
                }
                if (var1_1 != null) {
                    if (v5 <= 1) {
                        var8_9 = 0;
                    }
                    v5 = var3_12 = 0;
                }
                do {
                    if (var3_12 < var8_9) ** break;
                    continue block1;
                    this.g[var3_12] = var9_7 * ((var8_9 * var8_9 - var3_12 * var3_12) * I4.a(5321, 3772957331856065837L) / (var8_9 * var8_9));
                    ++var3_12;
                    if (var1_1 == null) continue block2;
                    if (var1_1 == null) return;
                } while (var1_1 != null);
                break;
            }
            break;
        }
    }

    public int Q(int n10, int n11, int n12) {
        int n13;
        block30: {
            int n14 = I4.a(24059, 8099749641299872775L);
            int n15 = -1;
            int n16 = this.q[n11];
            ky_2[] ky_2Array = kj_2.d();
            int n17 = n16 - 1;
            block0: while (true) {
                int n18;
                int n19;
                int[] nArray;
                int n20 = n16;
                do {
                    block31: {
                        int n21;
                        block32: {
                            block33: {
                                if (n20 >= I4.a(5321, 3772957331856065837L)) {
                                    n20 = n17;
                                    if (ky_2Array != null) {
                                        if (ky_2Array != null) {
                                            if (n20 < 0) break block0;
                                        }
                                        break block30;
                                    }
                                } else {
                                    n20 = n16;
                                }
                                if (ky_2Array == null) continue;
                                if (n20 >= I4.a(5321, 3772957331856065837L)) break block31;
                                nArray = this.m[n16];
                                n21 = n19 = nArray[1] - n11;
                                if (ky_2Array == null) break block32;
                                if (n21 < n14) break block33;
                                n16 = I4.a(5321, 3772957331856065837L);
                                if (ky_2Array != null) break block31;
                            }
                            ++n16;
                            n21 = n19;
                        }
                        if (ky_2Array != null) {
                            if (n21 < 0) {
                                n19 = -n19;
                            }
                            n21 = nArray[0] - n10;
                        }
                        n20 = n18 = n21;
                        if (ky_2Array != null) {
                            if (n20 < 0) {
                                n18 = -n18;
                            }
                            n20 = n19 += n18;
                        }
                        if (ky_2Array == null) continue;
                        if (n20 < n14) {
                            n20 = n18 = nArray[2] - n12;
                            if (ky_2Array != null) {
                                if (n20 < 0) {
                                    n18 = -n18;
                                }
                                n20 = n19 += n18;
                            }
                            if (ky_2Array == null) continue;
                            if (n20 < n14) {
                                n14 = n19;
                                n15 = nArray[3];
                            }
                        }
                    }
                    n20 = n17;
                } while (ky_2Array == null);
                if (n20 < 0) continue;
                nArray = this.m[n17];
                int n22 = n19 = n11 - nArray[1];
                if (ky_2Array != null) {
                    if (n22 >= n14) {
                        n17 = -1;
                        if (ky_2Array != null) continue;
                    }
                    --n17;
                    n22 = n19;
                }
                if (ky_2Array != null) {
                    if (n22 < 0) {
                        n19 = -n19;
                    }
                    n22 = nArray[0] - n10;
                }
                int n23 = n18 = n22;
                if (ky_2Array != null) {
                    if (n23 < 0) {
                        n18 = -n18;
                    }
                    n23 = n19 += n18;
                }
                int n24 = n14;
                if (ky_2Array != null) {
                    if (n23 >= n24) continue;
                    n23 = nArray[2];
                    n24 = n12;
                }
                int n25 = n18 = n23 - n24;
                if (ky_2Array != null) {
                    if (n25 < 0) {
                        n18 = -n18;
                    }
                    n25 = n19 += n18;
                }
                if (ky_2Array != null) {
                    if (n25 >= n14) continue;
                    n14 = n19;
                    n25 = n15 = nArray[3];
                }
                if (ky_2Array == null) break;
            }
            n13 = n15;
        }
        return n13;
    }

    public byte[] Q() {
        this.o();
        this.V();
        this.m();
        return this.p();
    }

    public void V() {
        ky_2[] ky_2Array = kj_2.d();
        for (int i2 = 0; i2 < I4.a(5321, 3772957331856065837L); ++i2) {
            int[] nArray = this.m[i2];
            nArray[0] = nArray[0] >> 4;
            int[] nArray2 = this.m[i2];
            nArray2[1] = nArray2[1] >> 4;
            int[] nArray3 = this.m[i2];
            nArray3[2] = nArray3[2] >> 4;
            this.m[i2][3] = i2;
            if (ky_2Array != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    protected void i(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block18: {
            block19: {
                block16: {
                    block17: {
                        var9_6 = var2_2 - var1_1;
                        var6_7 = kj_2.d();
                        try {
                            v0 = var9_6;
                            v1 = -1;
                            if (var6_7 == null) break block16;
                            if (v0 >= v1) break block17;
                        }
                        catch (Exception v2) {
                            throw I4.a(v2);
                        }
                        var9_6 = -1;
                    }
                    v0 = var2_2;
                    v1 = var1_1;
                }
                var10_8 = v0 + v1;
                try {
                    v3 = var10_8;
                    v4 = I4.a(5321, 3772957331856065837L);
                    if (var6_7 == null) break block18;
                    if (v3 <= v4) break block19;
                }
                catch (Exception v5) {
                    throw I4.a(v5);
                }
                var10_8 = I4.a(5321, 3772957331856065837L);
            }
            v3 = var2_2;
            v4 = 1;
        }
        var7_9 = v3 + v4;
        var8_10 = var2_2 - 1;
        var12_11 = 1;
        block14: while (true) {
            v6 = var7_9;
            v7 = var10_8;
            do lbl-1000:
            // 3 sources

            {
                block21: {
                    block20: {
                        if (v6 < v7) ** GOTO lbl48
                        try {
                            v8 = var8_10;
                            if (var6_7 == null) break block20;
                            v7 = var9_6;
                            if (var6_7 == null) ** GOTO lbl-1000
                        }
                        catch (Exception v9) {
                            throw I4.a(v9);
                        }
                        try {
                            if (v8 <= v7) break block14;
lbl48:
                            // 2 sources

                            v8 = this.g[var12_11++];
                        }
                        catch (Exception v10) {
                            throw I4.a(v10);
                        }
                    }
                    var11_12 = v8;
                    try {
                        v6 = var7_9;
                        v7 = var10_8;
                        if (var6_7 == null) continue;
                        if (v6 >= v7) break block21;
                    }
                    catch (Exception v11) {
                        throw I4.a(v11);
                    }
                    var13_13 = this.m[var7_9++];
                    try {
                        var13_13[0] = var13_13[0] - var11_12 * (var13_13[0] - var3_3) / I4.a(24685, 3444984586123637132L);
                        var13_13[1] = var13_13[1] - var11_12 * (var13_13[1] - var4_4) / I4.a(17622, 2847149764118402336L);
                        var13_13[2] = var13_13[2] - var11_12 * (var13_13[2] - var5_5) / I4.a(17622, 2847149764118402336L);
                    }
                    catch (Exception var14_15) {
                        // empty catch block
                    }
                }
                v6 = var8_10;
                v7 = var9_6;
            } while (var6_7 == null);
            if (v6 <= v7) continue;
            var13_13 = this.m[var8_10--];
            try {
                var13_13[0] = var13_13[0] - var11_12 * (var13_13[0] - var3_3) / I4.a(17622, 2847149764118402336L);
                var13_13[1] = var13_13[1] - var11_12 * (var13_13[1] - var4_4) / I4.a(17622, 2847149764118402336L);
                var13_13[2] = var13_13[2] - var11_12 * (var13_13[2] - var5_5) / I4.a(17622, 2847149764118402336L);
                continue;
            }
            catch (Exception var14_16) {
                if (var6_7 == null) break;
                continue;
            }
            break;
        }
    }

    protected void u(int n10, int n11, int n12, int n13, int n14) {
        int[] nArray = this.m[n11];
        nArray[0] = nArray[0] - n10 * (nArray[0] - n12) / I4.a(8276, 5155741919219036588L);
        nArray[1] = nArray[1] - n10 * (nArray[1] - n13) / I4.a(8276, 5155741919219036588L);
        nArray[2] = nArray[2] - n10 * (nArray[2] - n14) / I4.a(8276, 5155741919219036588L);
    }

    protected int z(int n10, int n11, int n12) {
        int n13;
        block12: {
            int n14;
            int n15 = n14 = I4.a(31094, 8481115058235566235L);
            int n16 = -1;
            ky_2[] ky_2Array = kj_2.d();
            int n17 = n16;
            int n18 = 0;
            while (n18 < I4.a(5321, 3772957331856065837L)) {
                int n19;
                int[] nArray = this.m[n18];
                n13 = n19 = nArray[0] - n10;
                if (ky_2Array != null) {
                    int n20;
                    int n21;
                    if (ky_2Array != null) {
                        if (n13 < 0) {
                            n19 = -n19;
                        }
                        n21 = nArray[1] - n11;
                    }
                    int n22 = n20 = n21;
                    if (ky_2Array != null) {
                        if (n22 < 0) {
                            n20 = -n20;
                        }
                        n19 += n20;
                        n22 = n20 = nArray[2] - n12;
                    }
                    if (ky_2Array != null) {
                        if (n22 < 0) {
                            n20 = -n20;
                        }
                        n22 = n19 += n20;
                    }
                    int n23 = n14;
                    if (ky_2Array != null) {
                        if (n22 < n23) {
                            n14 = n19;
                            n16 = n18;
                        }
                        n22 = n19;
                        n23 = this.l[n18] >> I4.a(7591, 1553456663447997517L);
                    }
                    void var8_12 = n22 - n23;
                    int n24 = var8_12;
                    int n25 = n15;
                    if (ky_2Array != null) {
                        if (n24 < n25) {
                            n15 = var8_12;
                            n17 = n18;
                        }
                        n24 = this.B[n18];
                        n25 = I4.a(9676, 59332022323852323L);
                    }
                    void var9_13 = n24 >> n25;
                    int n26 = n18;
                    this.B[n26] = this.B[n26] - var9_13;
                    int n27 = n18++;
                    this.l[n27] = this.l[n27] + (var9_13 << I4.a(30552, 1650642602783336122L));
                    if (ky_2Array != null) continue;
                }
                break block12;
            }
            int n28 = n16;
            this.B[n28] = this.B[n28] + I4.a(4925, 9022678360827757277L);
            int n29 = n16;
            this.l[n29] = this.l[n29] - I4.a(15777, 6195606620812749901L);
            n13 = n17;
        }
        return n13;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2007175099901810564L;
                var6_1 = new long[32];
                var3_2 = 0;
                var4_3 = "\u009a\u0080\u001c\u00b4\u001b\u00ab\u0094\u00e6(:\n\u0084\u00ff\f\"(\u00e1\b\u00e3\u001b\u00bcM@o\u00cb\u00823n\u00ae\u00b1\u008c\u00f8\u000f\u00f5\u0012i\u001f\u00cf\u00b1\u00ef\u00aa\u00ce\u0093\u0094\u0004\u00ee\u00d8kEu\u00c2d?\u00fe\u00b9V\u009c\u00e6Y\u001e*h\u00ee\u00e5\u00ee\u00eb\u0086\u00abc$\u00ef\u00049em\u0019k]\u00f5\u00b88T\"<\u0001\u0007u\u00f4\u00e6x\u00f5$\u00dd\u00bc\u009e\u00bb\u0080\u001b\u00a7\b\u00c4\u00f5H\u00e3,\u00899<\u00feUG),\u0084\u00b8\u00fd\u00cd\u00f7\u00b3\u00f1ET\\yG1B\u00a4\u007fS[8\u00d1@\u00ba\u0000s\u0012rf\b+\u008d\u00bb4\u0002}\u009c*\u0098\u00ae\r\u00c1\u008b\u0090\u008c\u00b9`\u001b\u00c5\u00ca>\u00b5)\u00f9\u000f\u0000\u00e0\u00a0Ay\u008c63;\u00c9\u00c9\u00dc\u00a6\u0089\u009d\u00c3#\u00ad2^\u00b7i\u0017M\u0093\u00c0I8\u00c6\u008c\u00ff4f\bV\u00c7\u00ceyT\u0016\u0015\u0019\u0093\u0096>\u00fd\u00bf\u00c8\u00fa\u00b7\u00f9\u00c6b\u009b\u00c9\u00ae\u00f14\u0087\u00d79\u00e1\b\u0096\u00d6\u0097BO##bT\u0093\u00a9";
                var5_4 = "\u009a\u0080\u001c\u00b4\u001b\u00ab\u0094\u00e6(:\n\u0084\u00ff\f\"(\u00e1\b\u00e3\u001b\u00bcM@o\u00cb\u00823n\u00ae\u00b1\u008c\u00f8\u000f\u00f5\u0012i\u001f\u00cf\u00b1\u00ef\u00aa\u00ce\u0093\u0094\u0004\u00ee\u00d8kEu\u00c2d?\u00fe\u00b9V\u009c\u00e6Y\u001e*h\u00ee\u00e5\u00ee\u00eb\u0086\u00abc$\u00ef\u00049em\u0019k]\u00f5\u00b88T\"<\u0001\u0007u\u00f4\u00e6x\u00f5$\u00dd\u00bc\u009e\u00bb\u0080\u001b\u00a7\b\u00c4\u00f5H\u00e3,\u00899<\u00feUG),\u0084\u00b8\u00fd\u00cd\u00f7\u00b3\u00f1ET\\yG1B\u00a4\u007fS[8\u00d1@\u00ba\u0000s\u0012rf\b+\u008d\u00bb4\u0002}\u009c*\u0098\u00ae\r\u00c1\u008b\u0090\u008c\u00b9`\u001b\u00c5\u00ca>\u00b5)\u00f9\u000f\u0000\u00e0\u00a0Ay\u008c63;\u00c9\u00c9\u00dc\u00a6\u0089\u009d\u00c3#\u00ad2^\u00b7i\u0017M\u0093\u00c0I8\u00c6\u008c\u00ff4f\bV\u00c7\u00ceyT\u0016\u0015\u0019\u0093\u0096>\u00fd\u00bf\u00c8\u00fa\u00b7\u00f9\u00c6b\u009b\u00c9\u00ae\u00f14\u0087\u00d79\u00e1\b\u0096\u00d6\u0097BO##bT\u0093\u00a9".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00e8\u001b!!\u00c6\u00fb\u00d1\u0014\u00130.\u00d4%\u0099\u00ec\u000e";
                    var5_4 = "\u00e8\u001b!!\u00c6\u00fb\u00d1\u0014\u00130.\u00d4%\u0099\u00ec\u000e".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        I4.a = var6_1;
        I4.b = new Integer[32];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x11F9;
        if (b[n11] == null) {
            I4.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

