/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dm_2;
import com.uJ;

/*
 * Renamed from com.Kb
 */
public class kb_0 {
    private long X;
    private long f;
    private long d;
    private long p;
    private long Y;
    private long e;
    private long h;
    private long J;
    private long F;
    private long l;
    private long C;
    int y = 0;
    String[] A = null;
    private static final long[] a;
    private static final Long[] b;

    private kb_0() {
    }

    static kb_0 M(uJ uJ2) {
        kb_0 kb_02 = new kb_0();
        boolean bl = dm_2.F();
        kb_02.X = uJ2.E();
        kb_02.f = uJ2.E();
        kb_02.d = uJ2.E();
        kb_02.p = uJ2.E();
        kb_02.Y = uJ2.E();
        kb_02.e = uJ2.E();
        kb_02.h = uJ2.E();
        kb_02.J = uJ2.E();
        kb_02.F = uJ2.E();
        int n10 = (int)uJ2.E();
        kb_0 kb_03 = kb_02;
        long l2 = uJ2.E();
        if (bl) {
            kb_03.C = l2;
            kb_03 = kb_02;
            l2 = (n10 & 1) != 0 ? 1L : 0L;
        }
        kb_03.l = l2;
        kb_02.l = kb_02.l | ((n10 & 2) != 0 ? kb_0.a(29245, 3200391072197851743L) : 0L);
        return kb_02;
    }

    public long D() {
        return this.X;
    }

    public long f() {
        return this.f;
    }

    public long S() {
        return this.d;
    }

    public long N() {
        return this.p;
    }

    public long s() {
        return this.Y;
    }

    public long n() {
        return this.e;
    }

    public long L() {
        return this.h;
    }

    public long X() {
        return this.J;
    }

    public long F() {
        return this.F;
    }

    public long d() {
        return this.l;
    }

    public long E() {
        return this.C;
    }

    public long Q() {
        return this.f() * this.S() / kb_0.a(12795, 1337430774706076059L);
    }

    public long M() {
        return this.f() * (this.S() - this.N()) / kb_0.a(12795, 1337430774706076059L);
    }

    public long I() {
        return this.f() * this.s() / kb_0.a(30493, 8706715592798977918L);
    }

    public long O() {
        return this.f() * this.N() / kb_0.a(12795, 1337430774706076059L);
    }

    public int K() {
        return (int)(kb_0.a(446, 4609752892715813343L) * (this.S() - this.N()) / this.S());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1096083076228466353L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "w\u00e2fs\u00b7\u00c9}\u00cf#\\\u0003yjE|\u00ec";
                var5_4 = "w\u00e2fs\u00b7\u00c9}\u00cf#\\\u0003yjE|\u00ec".length();
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
                    var4_3 = "0\u00cf0\u0015:M\u008f\n\u001d\u00b9\u0093\u00f4<\u00ed\u00bb*";
                    var5_4 = "0\u00cf0\u0015:M\u008f\n\u001d\u00b9\u0093\u00f4<\u00ed\u00bb*".length();
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
        kb_0.a = var6_1;
        kb_0.b = new Long[4];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x4863) & Short.MAX_VALUE;
        if (b[n11] == null) {
            kb_0.b[n11] = a[n11] ^ l2;
        }
        return b[n11];
    }
}

