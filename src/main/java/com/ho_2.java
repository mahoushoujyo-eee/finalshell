/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hn_1;
import com.iw_2;

/*
 * Renamed from com.ho
 */
public class ho_2
extends hn_1 {
    public float i;
    public float a;
    public float N;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;

    public ho_2() {
        this(0.0f, 0.0f, 0.0f);
    }

    public ho_2(float f10, float f11, float f12) {
        this.i = 1.0f + f10;
        this.a = 1.0f + f11;
        this.N = 1.0f + f12;
        this.O = true;
    }

    public void X(float f10) {
        this.i = 1.0f + f10;
    }

    public float D() {
        return this.i - 1.0f;
    }

    public void Q(float f10) {
        this.a = 1.0f + f10;
    }

    public float x() {
        return this.a - 1.0f;
    }

    public void e(float f10) {
        this.N = 1.0f + f10;
    }

    public float p() {
        return this.N - 1.0f;
    }

    public int[] C() {
        int[] nArray;
        block2: {
            int[] nArray2 = new int[ho_2.a(5668, 5731298942485127510L)];
            String[] stringArray = W5.q();
            for (int i2 = 0; i2 < ho_2.a(29567, 2327869025642120201L); ++i2) {
                nArray = nArray2;
                if (stringArray != null) {
                    nArray[i2] = this.C(0, 0, i2 << ho_2.a(23194, 2132559413775707629L) | i2 << ho_2.a(21533, 8039117690038887273L) | i2 << ho_2.a(5410, 6594747274161250897L) | i2);
                    if (stringArray != null) continue;
                }
                break block2;
            }
            nArray = nArray2;
        }
        return nArray;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13 = n12 & ho_2.a(16401, 4271840137529636717L);
        int n14 = n12 >> ho_2.a(14744, 6443840690622123757L) & ho_2.a(10413, 5730306050359975888L);
        int n15 = n12 >> ho_2.a(14520, 4371025885991587784L) & ho_2.a(5630, 7357301957522612879L);
        int n16 = n12 & ho_2.a(5630, 7357301957522612879L);
        n14 = iw_2.e((int)((float)n14 * this.i));
        n15 = iw_2.e((int)((float)n15 * this.a));
        n16 = iw_2.e((int)((float)n16 * this.N));
        return n13 | n14 << ho_2.a(14744, 6443840690622123757L) | n15 << ho_2.a(14520, 4371025885991587784L) | n16;
    }

    public String toString() {
        return b;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "E'\u001c%\u0017\u0012@G,\u001a?\u0016\u0015OT\u000f2dKO".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 29;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 27;
                                break;
                            }
                            case 1: {
                                v9 = 85;
                                break;
                            }
                            case 2: {
                                v9 = 109;
                                break;
                            }
                            case 3: {
                                v9 = 87;
                                break;
                            }
                            case 4: {
                                v9 = 120;
                                break;
                            }
                            case 5: {
                                v9 = 124;
                                break;
                            }
                            default: {
                                v9 = 114;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                ho_2.b = new String(v10).intern();
                var0_1 = 5924160921900028924L;
                var6_2 = new long[10];
                var3_3 = 0;
                var4_4 = "+\u0092\u00aa\u00f3\u00a0I\u00b0\u0085\u00afNFc\u0017\u00a7]\u0001\u00cf\u0098\u0005*\u001b\u0012\u0096\u00f5\u00b4\u00bd}2~\u009e>\t\u00f7r\u00fer\u00f8\u008a\u00dc<\u009b\u00bc\u00b1\u00e9\u00ddq\u00f1\u008c>oE\u000bN\u007f\u00f3\u00aa\u00cd\u00c8\u00df\u00fe\u001d\u00c1q\u00a5";
                var5_5 = "+\u0092\u00aa\u00f3\u00a0I\u00b0\u0085\u00afNFc\u0017\u00a7]\u0001\u00cf\u0098\u0005*\u001b\u0012\u0096\u00f5\u00b4\u00bd}2~\u009e>\t\u00f7r\u00fer\u00f8\u008a\u00dc<\u009b\u00bc\u00b1\u00e9\u00ddq\u00f1\u008c>oE\u000bN\u007f\u00f3\u00aa\u00cd\u00c8\u00df\u00fe\u001d\u00c1q\u00a5".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u000b\u00a1o\u00fd\u00bf\u00af\u00a4\u0091L\u0006\u0089|\u0087\u00e0L\u00d3";
                    var5_5 = "\u000b\u00a1o\u00fd\u00bf\u00af\u00a4\u0091L\u0006\u0089|\u0087\u00e0L\u00d3".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        ho_2.c = var6_2;
        ho_2.d = new Integer[10];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7774;
        if (d[n11] == null) {
            ho_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

