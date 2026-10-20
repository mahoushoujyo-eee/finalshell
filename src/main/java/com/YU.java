/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dm_2;
import com.i8_0;
import com.uJ;

class YU {
    private static i8_0 e;
    uJ P;
    byte[] p = new byte[4];
    private static final long[] a;
    private static final Integer[] b;

    static void c(i8_0 i8_02) {
        e = i8_02;
    }

    YU(uJ uJ2) {
        this.P = uJ2;
    }

    void M() {
        this.P.X = YU.a(21690, 6771670974593680585L);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void d(int n10, boolean n11) {
        int n12;
        int n13 = this.P.X;
        boolean bl = dm_2.J();
        int n14 = n11;
        if (!bl) {
            if (n14 == 0) {
                n13 -= 4;
            }
            n14 = -n13 & n10 - 1;
        }
        int n15 = n12 = n14;
        int n16 = n10;
        if (!bl) {
            if (n15 < n16) {
                n12 += n10;
            }
            n15 = n13;
            n16 = n12;
        }
        n13 = n15 + n16;
        if (!bl) {
            if (n11 != 0) {
                n13 -= 4;
            }
            this.p[0] = (byte)(n13 >>> YU.a(26011, 1150365073907807725L));
            this.p[1] = (byte)(n13 >>> YU.a(11591, 3530156642576678195L));
            this.p[2] = (byte)(n13 >>> YU.a(29141, 7873588118821298599L));
            this.p[3] = (byte)n13;
            System.arraycopy(this.p, 0, this.P.g, 0, 4);
            this.P.g[4] = (byte)n12;
        }
        i8_0 i8_02 = e;
        synchronized (i8_02) {
            e.Y(this.P.g, this.P.X, n12);
        }
        this.P.S(n12);
    }

    int h(int n10, int n11, int n12) {
        int n13;
        block6: {
            int n14;
            int n15;
            block5: {
                int n16;
                n15 = n10 + 5 + YU.a(28033, 1716368427774639606L);
                boolean bl = dm_2.J();
                n13 = n16 = -n15 & n11 - 1;
                n14 = n11;
                if (bl) break block5;
                if (n13 < n14) {
                    n16 += n11;
                }
                n15 += n16;
                n15 += n12;
                n15 += 32;
                n13 = this.P.g.length;
                if (bl) break block6;
                n14 = n15 + this.P.X - 5 - YU.a(28033, 1716368427774639606L) - n10;
            }
            if (n13 < n14) {
                byte[] byArray = new byte[n15 + this.P.X - 5 - YU.a(28033, 1716368427774639606L) - n10];
                System.arraycopy(this.P.g, 0, byArray, 0, this.P.g.length);
                this.P.g = byArray;
            }
            System.arraycopy(this.P.g, n10 + 5 + YU.a(28033, 1716368427774639606L), this.P.g, n15, this.P.X - 5 - YU.a(28033, 1716368427774639606L) - n10);
            this.P.X = YU.a(29886, 1847022847054832843L);
            this.P.u(n10);
            this.P.X = n10 + 5 + YU.a(28033, 1716368427774639606L);
            n13 = n15;
        }
        return n13;
    }

    void u(byte by, int n10, int n11, int n12) {
        System.arraycopy(this.P.g, n11, this.P.g, YU.a(18374, 7143747033848010679L), n12);
        this.P.g[5] = by;
        this.P.X = YU.a(26882, 721737783733778808L);
        this.P.u(n10);
        this.P.u(n12);
        this.P.X = n12 + 5 + YU.a(9438, 1740106895197123758L);
    }

    uJ I() {
        return this.P;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2197234426160027578L;
                var6_1 = new long[9];
                var3_2 = 0;
                var4_3 = "\u00ff\u00c4x\u00ef!\u0093v\u0015\u0007H\u00c5X\u0013\u00fd\u00d3vlv7\u0007\u00dc\u00e9\u00a3\u001d\u00a9=3\u008bNE\u00c0\u0003)\tY\u009d+\u00cdbO\u00cf\f\u009e\u009cz\u00b4\u00eaE\u001c\u0011\u00f6\u000f\u00f9\u00c3\u00aa\u0099";
                var5_4 = "\u00ff\u00c4x\u00ef!\u0093v\u0015\u0007H\u00c5X\u0013\u00fd\u00d3vlv7\u0007\u00dc\u00e9\u00a3\u001d\u00a9=3\u008bNE\u00c0\u0003)\tY\u009d+\u00cdbO\u00cf\f\u009e\u009cz\u00b4\u00eaE\u001c\u0011\u00f6\u000f\u00f9\u00c3\u00aa\u0099".length();
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
                    var4_3 = "\u00e5\u0085+\u0005\u00e1<\u00f3{\u00e8rW\u0097\u000f\u00ea\u00ee\u00c4";
                    var5_4 = "\u00e5\u0085+\u0005\u00e1<\u00f3{\u00e8rW\u0097\u000f\u00ea\u00ee\u00c4".length();
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
        YU.a = var6_1;
        YU.b = new Integer[9];
        YU.e = null;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1072;
        if (b[n11] == null) {
            YU.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

