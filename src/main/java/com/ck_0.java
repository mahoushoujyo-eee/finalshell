/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CF;
import com.NM;
import com.W5;
import com.iw_2;

/*
 * Renamed from com.Ck
 */
public class ck_0
extends CF {
    private int c;
    private int[] w;
    private int[] O;
    private static final long[] d;
    private static final Integer[] e;

    public ck_0() {
        this.c = ck_0.b(10535, 9211702663563737715L);
        this.w = new int[]{0, 0, ck_0.b(2768, 241697367397980545L), ck_0.b(24761, 5491092279887344623L)};
        this.O = new int[]{ck_0.b(13257, 4718376878064951449L), ck_0.b(13676, 838596846614472251L), -1, -1};
        this.T();
    }

    public ck_0(int[] nArray, int[] nArray2) {
        this.c = ck_0.b(16497, 6345783189182386978L);
        this.w = new int[]{0, 0, ck_0.b(24761, 5491092279887344623L), ck_0.b(24761, 5491092279887344623L)};
        this.O = new int[]{ck_0.b(13676, 838596846614472251L), ck_0.b(13676, 838596846614472251L), -1, -1};
        this.w = nArray;
        this.O = nArray2;
        this.c = nArray.length;
        this.T();
    }

    public void x(int n10, int n11) {
        this.O[n10] = n11;
        this.T();
    }

    public int S(int n10) {
        return this.O[n10];
    }

    public void T(int n10, int n11) {
        int[] nArray = new int[this.c + 1];
        int[] nArray2 = new int[this.c + 1];
        System.arraycopy(this.w, 0, nArray, 0, this.c);
        System.arraycopy(this.O, 0, nArray2, 0, this.c);
        this.w = nArray;
        this.O = nArray2;
        this.w[this.c] = n10;
        this.O[this.c] = n11;
        ++this.c;
        this.Q();
        this.T();
    }

    public void r(int n10) {
        String[] stringArray = W5.q();
        int n11 = this.c;
        int n12 = 4;
        if (stringArray != null) {
            if (n11 <= n12) {
                return;
            }
            n11 = n10;
            n12 = this.c - 1;
        }
        if (n11 < n12) {
            System.arraycopy(this.w, n10 + 1, this.w, n10, this.c - n10 - 1);
            System.arraycopy(this.O, n10 + 1, this.O, n10, this.c - n10 - 1);
        }
        --this.c;
        this.T();
    }

    public void M(int n10, int n11) {
        this.w[n10] = iw_2.e(n11);
        this.Q();
        this.T();
    }

    private void T() {
        this.w[0] = -1;
        String[] stringArray = W5.q();
        this.w[this.c - 1] = ck_0.b(12431, 9195968329879577562L);
        this.O[0] = this.O[1];
        this.O[this.c - 1] = this.O[this.c - 2];
        for (int i2 = 0; i2 < ck_0.b(14857, 4443526870043191643L); ++i2) {
            this.B[i2] = NM.B(i2, this.c, this.w, this.O);
            if (stringArray != null) continue;
        }
    }

    private void Q() {
        int n10 = 1;
        String[] stringArray = W5.q();
        block0: while (true) {
            int n11 = n10;
            int n12 = this.c;
            block1: while (n11 < n12) {
                for (int i2 = 1; i2 < n10; ++i2) {
                    int n13 = this.w[n10];
                    if (stringArray != null) {
                        n12 = this.w[i2];
                        if (stringArray == null) continue block1;
                        if (n13 >= n12) continue;
                        n13 = this.w[n10];
                    }
                    int n14 = n13;
                    this.w[n10] = this.w[i2];
                    this.w[i2] = n14;
                    n14 = this.O[n10];
                    this.O[n10] = this.O[i2];
                    this.O[i2] = n14;
                    if (stringArray != null) continue;
                }
                ++n10;
                if (stringArray != null) continue block0;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3632453507662625412L;
                var6_1 = new long[8];
                var3_2 = 0;
                var4_3 = "\u009e\u00cc\u00f7~\u0005\u0089\u00d2\u00df\u0010d\u0011oW\u0086\u00a9\u00a2\u00ab\u00c0\u00feCA Z\u001de3\ro\u00a5\u00bdc\u00fa\"\u0087|\u00f8\u00d8\u00c9\t\u0094w_VTTm\u00dc\u00bf";
                var5_4 = "\u009e\u00cc\u00f7~\u0005\u0089\u00d2\u00df\u0010d\u0011oW\u0086\u00a9\u00a2\u00ab\u00c0\u00feCA Z\u001de3\ro\u00a5\u00bdc\u00fa\"\u0087|\u00f8\u00d8\u00c9\t\u0094w_VTTm\u00dc\u00bf".length();
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
                    var4_3 = "\u00aed|\nuf@\u00f3\u00c3\u000f\u00df+\u007fl\u00d8^";
                    var5_4 = "\u00aed|\nuf@\u00f3\u00c3\u000f\u00df+\u007fl\u00d8^".length();
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
        ck_0.d = var6_1;
        ck_0.e = new Integer[8];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5352;
        if (e[n11] == null) {
            ck_0.e[n11] = (int)(d[n11] ^ l2);
        }
        return e[n11];
    }
}

