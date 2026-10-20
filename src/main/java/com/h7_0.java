/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.iw_2;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

/*
 * Renamed from com.h7
 */
public class h7_0
extends W5 {
    private BufferedImage C;
    private float J;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void f(BufferedImage bufferedImage) {
        this.C = bufferedImage;
    }

    public BufferedImage n() {
        return this.C;
    }

    public void m(float f10) {
        this.J = f10;
    }

    public float k() {
        return this.J;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int n10 = bufferedImage.getWidth();
        int n11 = bufferedImage.getHeight();
        int n12 = bufferedImage.getType();
        WritableRaster writableRaster = bufferedImage.getRaster();
        String[] stringArray = W5.q();
        BufferedImage bufferedImage3 = bufferedImage2;
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage3 = bufferedImage2;
        }
        WritableRaster writableRaster2 = bufferedImage3.getRaster();
        BufferedImage bufferedImage4 = this.C;
        if (stringArray != null) {
            if (bufferedImage4 != null) {
                n10 = Math.min(n10, this.C.getWidth());
                n11 = Math.min(n11, this.C.getWidth());
                int[] nArray = null;
                int[] nArray2 = null;
                int n13 = 0;
                while (n13 < n11) {
                    block7: {
                        nArray = this.l(bufferedImage, 0, n13, n10, 1, nArray);
                        nArray2 = this.l(this.C, 0, n13, n10, 1, nArray2);
                        for (int i2 = 0; i2 < n10; ++i2) {
                            int n14 = nArray[i2];
                            int n15 = nArray2[i2];
                            int n16 = n14 >> h7_0.a(22318, 1419353154635558414L) & h7_0.a(7865, 2184163835890050975L);
                            int n17 = n14 >> h7_0.a(26666, 2881362310166139145L) & h7_0.a(26743, 6187875281530376530L);
                            int n18 = n14 >> h7_0.a(27031, 8340520092832977075L) & h7_0.a(26743, 6187875281530376530L);
                            int n19 = n14 & h7_0.a(26743, 6187875281530376530L);
                            int n20 = n15 >> h7_0.a(13542, 5264367012463283652L) & h7_0.a(26743, 6187875281530376530L);
                            int n21 = n15 >> h7_0.a(31004, 8322430865805787195L) & h7_0.a(26743, 6187875281530376530L);
                            int n22 = n15 >> h7_0.a(1019, 2862013292942637786L) & h7_0.a(26743, 6187875281530376530L);
                            int n23 = n15 & h7_0.a(26743, 6187875281530376530L);
                            n17 = iw_2.e(NM.Q(this.J, n17, n21));
                            n18 = iw_2.e(NM.Q(this.J, n18, n22));
                            n19 = iw_2.e(NM.Q(this.J, n19, n23));
                            nArray[i2] = n16 << h7_0.a(13542, 5264367012463283652L) | n17 << h7_0.a(31004, 8322430865805787195L) | n18 << h7_0.a(1019, 2862013292942637786L) | n19;
                            if (stringArray != null) {
                                if (stringArray != null) continue;
                            }
                            break block7;
                        }
                        this.E(bufferedImage2, 0, n13, n10, 1, nArray);
                        ++n13;
                    }
                    if (stringArray != null) continue;
                }
            }
            bufferedImage4 = bufferedImage2;
        }
        return bufferedImage4;
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
                v0 = ">\u0015\u000513\u001c\u001dT:\r 5\u001a\u001e\u0014\u001f\u0002 5F@U".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 60;
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
                                v9 = 71;
                                break;
                            }
                            case 1: {
                                v9 = 79;
                                break;
                            }
                            case 2: {
                                v9 = 95;
                                break;
                            }
                            case 3: {
                                v9 = 104;
                                break;
                            }
                            case 4: {
                                v9 = 108;
                                break;
                            }
                            case 5: {
                                v9 = 84;
                                break;
                            }
                            default: {
                                v9 = 82;
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
                h7_0.a = new String(v10).intern();
                var0_1 = 6499792767935496911L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "V\fR\u00bf\u0080\u00d4\u0013\u00d6\u00cbjZ\u00ab7ZO\u0013\u0013\u00c3)\u00d2\u00e28x\u001dK\u00b5\u00bb\u008eV\u0093,\u00d9\u00f9\u00cb\u00b8\u00cf\u0086k\u0002\u00e4=\u00d8c\u009d\u0007\t\u00e5\u00af";
                var5_5 = "V\fR\u00bf\u0080\u00d4\u0013\u00d6\u00cbjZ\u00ab7ZO\u0013\u0013\u00c3)\u00d2\u00e28x\u001dK\u00b5\u00bb\u008eV\u0093,\u00d9\u00f9\u00cb\u00b8\u00cf\u0086k\u0002\u00e4=\u00d8c\u009d\u0007\t\u00e5\u00af".length();
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
                    var4_4 = "a\u0012\u0014A`{\u0013b\u00a9\u0088\u0086~Y#\u0092t";
                    var5_5 = "a\u0012\u0014A`{\u0013b\u00a9\u0088\u0086~Y#\u0092t".length();
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
        h7_0.b = var6_2;
        h7_0.c = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3923;
        if (c[n11] == null) {
            h7_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

