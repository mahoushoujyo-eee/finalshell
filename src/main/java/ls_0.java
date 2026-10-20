/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ls
 */
class ls_0
implements Runnable {
    final md_0 L;
    private static final long[] a;
    private static final Integer[] b;

    ls_0(md_0 md_02) {
        this.L = md_02;
    }

    @Override
    public void run() {
        try {
            zq_0 zq_02 = new zq_0();
            a0 a02 = new a0(zq_02, this.L.I, this.L.M, ls_0.a(19808, 6809153206749227081L), ls_0.a(28638, 816656385357630197L));
            a0 a03 = new a0(zq_02, this.L.g, this.L.m, ls_0.a(19209, 5422482100022210083L), ls_0.a(23931, 6579935693682538579L));
            a02.R(a0.d);
            a02.E(this.L.B);
            a02.g(this.L.P);
            a03.R(a0.T);
            a03.E(this.L.B);
            a03.g(this.L.P);
            a02.b(this.L.r);
            a03.b(this.L.r);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1906683675450021589L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u00f5\u0004U]\u00be\u00f8| \u00fd\u00b8\u00df\u0082\u00ea\u0080\u00d0\u00f6";
                var5_4 = "\u00f5\u0004U]\u00be\u00f8| \u00fd\u00b8\u00df\u0082\u00ea\u0080\u00d0\u00f6".length();
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
                    var4_3 = "\u0011\\\bg\u00bbC\u00d6\u009c\u00a0\u00919\u00ed\u00a4\u00ef\u00ce\u0086";
                    var5_4 = "\u0011\\\bg\u00bbC\u00d6\u009c\u00a0\u00919\u00ed\u00a4\u00ef\u00ce\u0086".length();
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
        ls_0.a = var6_1;
        ls_0.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x252B;
        if (b[n11] == null) {
            ls_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

