/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hn_1;
import com.iw_2;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.gj
 */
public abstract class gj_2
extends hn_1 {
    protected int[] f;
    protected int[] d;
    protected int[] M;
    protected boolean N = false;
    private static final long[] c;
    private static final Integer[] e;

    public gj_2() {
        this.O = true;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13 = n12 & gj_2.a(28405, 9196415276138950581L);
        int n14 = n12 >> gj_2.a(32034, 2745921672547728481L) & gj_2.a(26676, 3343197330804107633L);
        int n15 = n12 >> gj_2.a(2629, 7319444743180651266L) & gj_2.a(18, 2369007058723307862L);
        int n16 = n12 & gj_2.a(18, 2369007058723307862L);
        n14 = this.f[n14];
        n15 = this.d[n15];
        n16 = this.M[n16];
        return n13 | n14 << gj_2.a(32034, 2745921672547728481L) | n15 << gj_2.a(2629, 7319444743180651266L) | n16;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        String[] stringArray = W5.q();
        gj_2 gj_22 = this;
        if (stringArray != null) {
            if (!gj_22.N) {
                this.D();
            }
            gj_22 = this;
        }
        return super.filter(bufferedImage, bufferedImage2);
    }

    protected void D() {
        this.N = true;
        this.M = this.f();
        this.d = this.M;
        this.f = this.M;
    }

    protected int[] f() {
        int[] nArray;
        block2: {
            int[] nArray2 = new int[gj_2.a(25968, 6046869089493836850L)];
            String[] stringArray = W5.q();
            for (int i2 = 0; i2 < gj_2.a(25968, 6046869089493836850L); ++i2) {
                nArray = nArray2;
                if (stringArray != null) {
                    nArray[i2] = iw_2.e((int)(255.0f * this.q((float)i2 / 255.0f)));
                    if (stringArray != null) continue;
                }
                break block2;
            }
            nArray = nArray2;
        }
        return nArray;
    }

    protected float q(float f10) {
        return 0.0f;
    }

    public int[] p() {
        int[] nArray;
        block4: {
            String[] stringArray = W5.q();
            int n10 = this.N;
            if (stringArray != null) {
                if (n10 == 0) {
                    this.D();
                }
                n10 = gj_2.a(6444, 5966400067737917549L);
            }
            int[] nArray2 = new int[n10];
            for (int i2 = 0; i2 < gj_2.a(25968, 6046869089493836850L); ++i2) {
                nArray = nArray2;
                if (stringArray != null) {
                    nArray[i2] = this.C(0, 0, i2 << gj_2.a(24236, 6614282499635830762L) | i2 << gj_2.a(24801, 3323669388338913707L) | i2 << gj_2.a(11028, 813336584640637535L) | i2);
                    if (stringArray != null) continue;
                }
                break block4;
            }
            nArray = nArray2;
        }
        return nArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 4176910908618162373L;
                var6_1 = new long[10];
                var3_2 = 0;
                var4_3 = "\u00e7\u00a2\u00ea\u00ddd2%\u00f7d\u0017\u00c1\u00dd'\u00e3<\u00b4\u00e7\u001b\u00c9#\u00a4\u009f/p\u00ab8\u00fe\u0086G\u00c1Y\u00a8.\u0090\u00f0G\u00e4C\u009f7\u00ec\u009a\u008a\u0007\u00e8\u00c1\u00cb\u00cf)\u00dd\u009a\u00bf\u001b;Al\u00ac?\u00cc\u00bb2?)K";
                var5_4 = "\u00e7\u00a2\u00ea\u00ddd2%\u00f7d\u0017\u00c1\u00dd'\u00e3<\u00b4\u00e7\u001b\u00c9#\u00a4\u009f/p\u00ab8\u00fe\u0086G\u00c1Y\u00a8.\u0090\u00f0G\u00e4C\u009f7\u00ec\u009a\u008a\u0007\u00e8\u00c1\u00cb\u00cf)\u00dd\u009a\u00bf\u001b;Al\u00ac?\u00cc\u00bb2?)K".length();
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
                    var4_3 = "\u00ba~,\u0082\u00acd!~Y\u0095\u0095\u00b7\u00d4\u00f6j\u0092";
                    var5_4 = "\u00ba~,\u0082\u00acd!~Y\u0095\u0095\u00b7\u00d4\u00f6j\u0092".length();
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
        gj_2.c = var6_1;
        gj_2.e = new Integer[10];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x142;
        if (e[n11] == null) {
            gj_2.e[n11] = (int)(c[n11] ^ l2);
        }
        return e[n11];
    }
}

