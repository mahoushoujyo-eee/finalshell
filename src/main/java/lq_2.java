/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from lq
 */
class lq_2
implements Runnable {
    final du_2 F;
    private static final long[] a;
    private static final Integer[] b;

    lq_2(du_2 du_22) {
        this.F = du_22;
    }

    @Override
    public void run() {
        try {
            YM yM = new YM();
            or_2 or_22 = new or_2(yM, this.F.r, this.F.x, lq_2.a(18655, 5145856011517322564L), lq_2.a(5553, 8669048392514746411L));
            or_2 or_23 = new or_2(yM, this.F.d, this.F.z, lq_2.a(26229, 3279064825879677933L), lq_2.a(6328, 2401795625748903201L));
            or_22.x(or_2.k);
            or_22.B(this.F.O);
            or_22.i(this.F.J);
            or_23.x(or_2.R);
            or_23.B(this.F.O);
            or_23.i(this.F.J);
            or_22.J(this.F.W);
            or_23.J(this.F.W);
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
                var0 = 2342384572092119530L;
                var6_1 = new long[4];
                var3_2 = 0;
                var4_3 = "\u0091\u000e\nB\u00d5+\u00b4\u00aeYmJO\u0082ka\u00c1";
                var5_4 = "\u0091\u000e\nB\u00d5+\u00b4\u00aeYmJO\u0082ka\u00c1".length();
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
                    var4_3 = "\u001f\u00cf~\u0085\u00ed1\u00ec\u00cb\u00ffl\u00bdVd\u00ee\u009a\u0007";
                    var5_4 = "\u001f\u00cf~\u0085\u00ed1\u00ec\u00cb\u00ffl\u00bdVd\u00ee\u009a\u0007".length();
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
        lq_2.a = var6_1;
        lq_2.b = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2D9B;
        if (b[n11] == null) {
            lq_2.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

