/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.W5;
import com.iw_2;
import java.awt.image.BufferedImage;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.h9
 */
public class h9_0
extends W5 {
    private float Y = 0.1f;
    private boolean B;
    private boolean o;
    private BufferedImage k;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void J(float f10) {
        this.Y = f10;
    }

    public float e() {
        return this.Y;
    }

    public void l(BufferedImage bufferedImage) {
        this.k = bufferedImage;
    }

    public BufferedImage t() {
        return this.k;
    }

    public void q(boolean bl) {
        this.B = bl;
    }

    public boolean S() {
        return this.B;
    }

    public void k(boolean bl) {
        this.o = bl;
    }

    public boolean e() {
        return this.o;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int n10 = bufferedImage.getWidth();
        int n11 = bufferedImage.getHeight();
        String[] stringArray = W5.q();
        BufferedImage bufferedImage3 = bufferedImage2;
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage3 = this.k;
        }
        if (stringArray != null) {
            if (bufferedImage3 == null) {
                return bufferedImage2;
            }
            bufferedImage3 = this.k;
        }
        int n12 = bufferedImage3.getWidth();
        int n13 = this.k.getHeight();
        float f10 = 255.0f * this.Y;
        int[] nArray = new int[n10];
        int[] nArray2 = new int[n12];
        int n14 = 0;
        block0: while (true) {
            int n15 = n14;
            block1: while (n15 < n11) {
                this.l(bufferedImage, 0, n14, n10, 1, nArray);
                this.l(this.k, 0, n14 % n13, n12, 1, nArray2);
                for (int i2 = 0; i2 < n10; ++i2) {
                    int n16;
                    int n17;
                    int n18;
                    int n19;
                    int n20 = nArray2[i2 % n12];
                    int n21 = nArray[i2];
                    n15 = this.B ? 1 : 0;
                    if (stringArray == null) continue block1;
                    if (stringArray != null) {
                        if (n15 != 0) {
                            n20 ^= h9_0.a(22292, 7395652081760514884L);
                        }
                        n19 = this.o;
                    }
                    if (stringArray != null) {
                        if (n19 != 0) {
                            n18 = iw_2.g(n20);
                            n17 = iw_2.g(n21);
                            float f11 = 1.0f - NM.k((float)n17 - f10, (float)n17 + f10, n18);
                            n16 = (int)(255.0f * f11);
                            nArray[i2] = n21 & h9_0.a(17596, 4970807513504162024L) | n16 << h9_0.a(24210, 1938847947064457924L) | n16 << h9_0.a(10142, 1762725774363542475L) | n16;
                            if (stringArray != null) continue;
                        }
                        n19 = n21 >> h9_0.a(11786, 4902382073065523803L) & h9_0.a(23712, 4684922653428857075L);
                    }
                    n18 = n19;
                    n17 = n21 >> h9_0.a(29196, 2000236595304011344L) & h9_0.a(30155, 8970371347664179612L);
                    int n22 = n21 & h9_0.a(30155, 8970371347664179612L);
                    n16 = n20 >> h9_0.a(11786, 4902382073065523803L) & h9_0.a(30155, 8970371347664179612L);
                    int n23 = n20 >> h9_0.a(29196, 2000236595304011344L) & h9_0.a(30155, 8970371347664179612L);
                    int n24 = n20 & h9_0.a(30155, 8970371347664179612L);
                    int n25 = (int)(255.0f * (1.0f - NM.k((float)n18 - f10, (float)n18 + f10, n16)));
                    int n26 = (int)(255.0f * (1.0f - NM.k((float)n17 - f10, (float)n17 + f10, n23)));
                    int n27 = (int)(255.0f * (1.0f - NM.k((float)n22 - f10, (float)n22 + f10, n24)));
                    nArray[i2] = n21 & h9_0.a(13110, 1326393641486899044L) | n25 << h9_0.a(11786, 4902382073065523803L) | n26 << h9_0.a(29196, 2000236595304011344L) | n27;
                    if (stringArray != null) continue;
                }
                this.E(bufferedImage2, 0, n14, n10, 1, nArray);
                ++n14;
                if (stringArray != null) continue block0;
            }
            break;
        }
        return bufferedImage2;
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
                v0 = "o>&(l\u0010~\u0013\u0002>(c\u001etR/qj+".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 36;
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
                                v9 = 24;
                                break;
                            }
                            case 1: {
                                v9 = 110;
                                break;
                            }
                            case 2: {
                                v9 = 123;
                                break;
                            }
                            case 3: {
                                v9 = 96;
                                break;
                            }
                            case 4: {
                                v9 = 33;
                                break;
                            }
                            case 5: {
                                v9 = 78;
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
                h9_0.a = new String(v10).intern();
                var0_1 = 380387870754734014L;
                var6_2 = new long[9];
                var3_3 = 0;
                var4_4 = "\u00ad\u001b\rk\u00efq\u00dfV\u00aa\u00d1\u00c7\u0013hn\u00bc}E\u009d\u00e2\u00e3\u00bfvEjV\u00a3\u0080\u00f5y\u00een\u00dd@\u00eeo\u0017\u00a6z\u00b3\u0005\u0017\u00afz.Kc\u00b5\u00f5\u0012_\u00d1\u0018\u007f\u001a(\u00da";
                var5_5 = "\u00ad\u001b\rk\u00efq\u00dfV\u00aa\u00d1\u00c7\u0013hn\u00bc}E\u009d\u00e2\u00e3\u00bfvEjV\u00a3\u0080\u00f5y\u00een\u00dd@\u00eeo\u0017\u00a6z\u00b3\u0005\u0017\u00afz.Kc\u00b5\u00f5\u0012_\u00d1\u0018\u007f\u001a(\u00da".length();
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
                    var4_4 = "\u009d4\tn\u0014\u00fdG\u00b2x78]8\u00e6\u00e9\u00e6";
                    var5_5 = "\u009d4\tn\u0014\u00fdG\u00b2x78]8\u00e6\u00e9\u00e6".length();
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
        h9_0.b = var6_2;
        h9_0.c = new Integer[9];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6454;
        if (c[n11] == null) {
            h9_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

