/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.hn_1;
import com.hx_1;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.hn
 */
public class hn_2
extends hn_1 {
    private float o;
    private float m = 0.0f;
    private float H = 5.0f;
    private float P;
    private float Y;
    private int R = -1;
    private int v = hn_2.a(22236, 1907896469272345454L);
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public hn_2() {
        this(0.5f);
    }

    public hn_2(float f10) {
        this.b(f10);
    }

    public void j(float f10) {
        this.H = f10;
    }

    public float K() {
        return this.H;
    }

    public void b(float f10) {
        this.o = f10;
    }

    public float r() {
        return this.o;
    }

    public void J(float f10) {
        this.m = f10;
    }

    public float o() {
        return this.m;
    }

    public void x(int n10) {
        this.R = n10;
    }

    public int h() {
        return this.R;
    }

    public void Z(int n10) {
        this.v = n10;
    }

    public int s() {
        return this.v;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        bufferedImage2 = new hx_1((int)this.H).filter(bufferedImage, null);
        this.P = 765.0f * (this.o - this.m * 0.5f);
        this.Y = 765.0f * (this.o + this.m * 0.5f);
        return super.filter(bufferedImage2, bufferedImage2);
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13 = n12 & hn_2.a(16580, 3506859011826462066L);
        int n14 = n12 >> hn_2.a(24071, 3323699808061928372L) & hn_2.a(9905, 7308389125468605185L);
        int n15 = n12 >> hn_2.a(24757, 3374347854465993988L) & hn_2.a(5952, 149717198413167351L);
        int n16 = n12 & hn_2.a(5952, 149717198413167351L);
        int n17 = n14 + n15 + n16;
        float f10 = NM.k(this.P, this.Y, n17);
        return NM.n(f10, this.v, this.R);
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
                v0 = "G\u0006\u000b\r3kx;!\u0006\u00007a3:\\".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 34;
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
                                v9 = 54;
                                break;
                            }
                            case 1: {
                                v9 = 80;
                                break;
                            }
                            case 2: {
                                v9 = 80;
                                break;
                            }
                            case 3: {
                                v9 = 67;
                                break;
                            }
                            case 4: {
                                v9 = 120;
                                break;
                            }
                            case 5: {
                                v9 = 51;
                                break;
                            }
                            default: {
                                v9 = 63;
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
                hn_2.a = new String(v10).intern();
                var0_1 = 484179743335391059L;
                var6_2 = new long[6];
                var3_3 = 0;
                var4_4 = "\u0095s{k@\u00c1$=N\b\"\u00b0\u00d7b\u00ac\u00f7\u00c1\u00d5\u00e7io\u0010T\u00ad\u00f6K\u00f6\u0003\u0096\u00fe\u0012_";
                var5_5 = "\u0095s{k@\u00c1$=N\b\"\u00b0\u00d7b\u00ac\u00f7\u00c1\u00d5\u00e7io\u0010T\u00ad\u00f6K\u00f6\u0003\u0096\u00fe\u0012_".length();
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
                    var4_4 = "\u00c0l.\u00edZ\u00b92!\u00d8\u00aa>\n\u00e4\u00dc\u00e5[";
                    var5_5 = "\u00c0l.\u00edZ\u00b92!\u00d8\u00aa>\n\u00e4\u00dc\u00e5[".length();
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
        hn_2.b = var6_2;
        hn_2.c = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6DB2;
        if (c[n11] == null) {
            hn_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

