/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.F;
import com.XB;
import com.re_1;

/*
 * Renamed from com.De
 */
public class de_0 {
    int p;
    int W;
    private int s;
    private int[] O;
    private static final long[] a;
    private static final Integer[] b;

    void B(F f10, re_1 re_12, int n10, boolean bl) {
        block5: {
            block6: {
                int n11;
                int[] nArray;
                block2: {
                    block3: {
                        block4: {
                            nArray = XB.X();
                            n11 = this.p & 2;
                            if (nArray != null) break block2;
                            if (n11 != 0) break block3;
                            if (!bl) break block4;
                            this.F(n10, re_12.V, de_0.a(18642, 8239009293587362182L));
                            re_12.z(-1);
                            if (nArray == null) break block5;
                        }
                        this.F(n10, re_12.V, de_0.a(10615, 2070205255294504999L));
                        re_12.G(-1);
                        if (nArray == null) break block5;
                    }
                    n11 = bl ? 1 : 0;
                }
                if (n11 == 0) break block6;
                re_12.z(this.W - n10);
                if (nArray == null) break block5;
            }
            re_12.G(this.W - n10);
        }
    }

    private void F(int n10, int n11, int n12) {
        int[] nArray = XB.X();
        de_0 de_02 = this;
        if (nArray == null) {
            if (de_02.O == null) {
                this.O = new int[de_0.a(23467, 4547883632073679608L)];
            }
            de_02 = this;
        }
        if (nArray == null) {
            if (de_02.s >= this.O.length) {
                int[] nArray2 = new int[this.O.length + de_0.a(10, 995935345284381020L)];
                System.arraycopy(this.O, 0, nArray2, 0, this.O.length);
                this.O = nArray2;
            }
            this.O[this.s++] = n10;
            de_02 = this;
        }
        de_02.O[this.s++] = n11 | n12;
    }

    void y(F f10, int n10, byte[] byArray) {
        this.p |= 2;
        this.W = n10;
        int[] nArray = XB.X();
        int n11 = 0;
        while (n11 < this.s) {
            block5: {
                int n12;
                block3: {
                    block4: {
                        int n13 = this.O[n11++];
                        int n14 = this.O[n11++];
                        int n15 = n14 & de_0.a(10906, 1385390787138507723L);
                        n12 = n10 - n13;
                        if (nArray != null) break block3;
                        if ((n14 & de_0.a(6978, 3874610686086275615L)) != de_0.a(3347, 1595674863296607300L)) break block4;
                        byArray[n15++] = (byte)(n12 >>> de_0.a(2147, 6886524580773720380L));
                        byArray[n15] = (byte)n12;
                        if (nArray == null) break block5;
                    }
                    byArray[n15++] = (byte)(n12 >>> de_0.a(22254, 3478865142731321276L));
                    byArray[n15++] = (byte)(n12 >>> de_0.a(2899, 5277821026422714886L));
                    byArray[n15++] = (byte)(n12 >>> de_0.a(9325, 1688988540924615987L));
                }
                byArray[n15] = (byte)n12;
            }
            if (nArray == null) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2073045692133575809L;
                var6_1 = new long[11];
                var3_2 = 0;
                var4_3 = "\u00bb\u00e10L\u00b9\u0016\u00f8\u00c5d\u00fb^=\u00a8(\u00f5\u00dbs\u008c1\u00c1~\u00c5\u00fe\u0097\u00e7\u009a\u00ca\u00c2\u0017\u00ac=\u0007\u00ff\u00ebf\u0006\u0083V.\u007f\u00f3J\u00c4\u0011\u008f;\u00a3%\u0098\u00c8\u0090\u00f5sD \u00b5i\u00a6\u00bcS\u00d7?\\\u00a6\u0086\u00e1~*|\u00c5\u00fd\u00b5";
                var5_4 = "\u00bb\u00e10L\u00b9\u0016\u00f8\u00c5d\u00fb^=\u00a8(\u00f5\u00dbs\u008c1\u00c1~\u00c5\u00fe\u0097\u00e7\u009a\u00ca\u00c2\u0017\u00ac=\u0007\u00ff\u00ebf\u0006\u0083V.\u007f\u00f3J\u00c4\u0011\u008f;\u00a3%\u0098\u00c8\u0090\u00f5sD \u00b5i\u00a6\u00bcS\u00d7?\\\u00a6\u0086\u00e1~*|\u00c5\u00fd\u00b5".length();
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
                    var4_3 = "\u00ed\u00d5\u00c7\u009d\u00c9B\u00d1\u00ba\u00fe\u00a50\u00a1\u00d1\u00dcn\u009e";
                    var5_4 = "\u00ed\u00d5\u00c7\u009d\u00c9B\u00d1\u00ba\u00fe\u00a50\u00a1\u00d1\u00dcn\u009e".length();
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
        de_0.a = var6_1;
        de_0.b = new Integer[11];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7957;
        if (b[n11] == null) {
            de_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

