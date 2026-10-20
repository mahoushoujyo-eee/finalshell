/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.hn_1;
import java.awt.image.BufferedImage;
import java.util.Random;

/*
 * Renamed from com.h4
 */
public class h4_0
extends hn_1 {
    private float z = 1.0f;
    private float k = 0.0f;
    private float t;
    private float A;
    private Random n;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void J(float f10) {
        this.z = f10;
    }

    public float n() {
        return this.z;
    }

    public void V(float f10) {
        this.k = f10;
    }

    public float L() {
        return this.k;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        float f10 = (1.0f - this.z) * (1.0f + this.k);
        this.t = f10 - this.k;
        this.A = f10;
        this.n = new Random(0L);
        return super.filter(bufferedImage, bufferedImage2);
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13 = n12 >> h4_0.a(4034, 3521979274267364896L) & h4_0.a(8595, 8191003487376547955L);
        float f10 = this.n.nextFloat();
        float f11 = NM.k(this.t, this.A, f10);
        return (int)((float)n13 * f11) << h4_0.a(22580, 7209530937309977047L) | n12 & h4_0.a(11002, 7626885432755661595L);
    }

    public String toString() {
        return a;
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
                v0 = "\u00045\u001fZd3`x\u0005\u000fE~&i!$H\u0018#".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 18;
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
                                v9 = 69;
                                break;
                            }
                            case 1: {
                                v9 = 83;
                                break;
                            }
                            case 2: {
                                v9 = 116;
                                break;
                            }
                            case 3: {
                                v9 = 36;
                                break;
                            }
                            case 4: {
                                v9 = 31;
                                break;
                            }
                            case 5: {
                                v9 = 91;
                                break;
                            }
                            default: {
                                v9 = 23;
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
                h4_0.a = new String(v10).intern();
                var0_1 = 6466965829329417968L;
                var6_2 = new long[4];
                var3_3 = 0;
                var4_4 = "\u008e\u00c8$d\u0014H/?\u009c\u0004=\u00e7\u00db:x\u00c8";
                var5_5 = "\u008e\u00c8$d\u0014H/?\u009c\u0004=\u00e7\u00db:x\u00c8".length();
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
                    var4_4 = "\u008b\u007f\u00e9c\u00e5;\u00a2\u0014\u00a0\u00c6\u00d3\u000e\u00a4\u00d4V|";
                    var5_5 = "\u008b\u007f\u00e9c\u00e5;\u00a2\u0014\u00a0\u00c6\u00d3\u000e\u00a4\u00d4V|".length();
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
        h4_0.b = var6_2;
        h4_0.c = new Integer[4];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1E3;
        if (c[n11] == null) {
            h4_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

