/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hl_2;
import com.hv_2;
import com.zZ;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

/*
 * Renamed from com.he
 */
public class he_2
extends W5 {
    private float x = 1.0f;
    private float N = 2.0f;
    private boolean c = true;
    private boolean S;
    private static final String a;
    private static final long[] b;
    private static final Integer[] d;

    public void H(float f10) {
        this.x = f10;
    }

    public float M() {
        return this.x;
    }

    public void U(float f10) {
        this.N = f10;
    }

    public float Y() {
        return this.N;
    }

    public void U(boolean bl) {
        this.c = bl;
    }

    public boolean C() {
        return this.c;
    }

    public void c(boolean bl) {
        this.S = bl;
    }

    public boolean t() {
        return this.S;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        boolean bl;
        BufferedImage bufferedImage3;
        block15: {
            block17: {
                int n10;
                int n11;
                int n12;
                int n13;
                int n14;
                int n15;
                int n16;
                int[] nArray;
                String[] stringArray;
                int n17;
                int n18;
                block14: {
                    int n19;
                    n18 = bufferedImage.getWidth();
                    n17 = bufferedImage.getHeight();
                    BufferedImage bufferedImage4 = new hv_2(this.x, this.x, 3).filter(bufferedImage, null);
                    bufferedImage3 = new hv_2(this.N, this.N, 3).filter(bufferedImage, null);
                    stringArray = W5.q();
                    Graphics2D graphics2D = bufferedImage3.createGraphics();
                    graphics2D.setComposite(new zZ(1.0f));
                    graphics2D.drawImage((Image)bufferedImage4, 0, 0, null);
                    graphics2D.dispose();
                    bl = this.c;
                    if (stringArray == null) break block15;
                    if (!bl) break block17;
                    float f10 = this.x - this.N;
                    bl = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                    if (stringArray == null) break block15;
                    if (!bl) break block17;
                    nArray = null;
                    n16 = 0;
                    n15 = 0;
                    block0: while (true) {
                        int n21 = n15;
                        n21 = n17;
                        block1: while (n20 < n21) {
                            nArray = this.l(bufferedImage3, 0, n15, n18, 1, nArray);
                            n19 = 0;
                            if (stringArray == null) break block14;
                            for (n14 = v8066331; n14 < n18; ++n14) {
                                int n22;
                                block19: {
                                    int n23;
                                    block18: {
                                        n13 = nArray[n14];
                                        n12 = n13 >> he_2.a(25863, 4883882624508762582L) & he_2.a(19957, 8833851932250779936L);
                                        n11 = n13 >> he_2.a(17226, 6882561002739351452L) & he_2.a(26900, 148677007791789508L);
                                        n10 = n13 & he_2.a(26900, 148677007791789508L);
                                        int n21 = n12;
                                        n21 = n16;
                                        if (stringArray == null) continue block1;
                                        if (stringArray != null) {
                                            if (n20 > n21) {
                                                n16 = n12;
                                            }
                                            int n23 = n11;
                                            n23 = n16;
                                        }
                                        if (stringArray == null) break block18;
                                        if (n22 > n23) {
                                            n16 = n11;
                                        }
                                        n22 = n10;
                                        if (stringArray == null) break block19;
                                        n23 = n16;
                                    }
                                    if (n22 <= n23) continue;
                                    n22 = n10;
                                }
                                n16 = n22;
                                if (stringArray != null) continue;
                            }
                            ++n15;
                            if (stringArray != null) continue block0;
                        }
                        break;
                    }
                    n19 = n15 = 0;
                }
                while (n15 < n17) {
                    block16: {
                        nArray = this.l(bufferedImage3, 0, n15, n18, 1, nArray);
                        bl = false;
                        if (stringArray == null) break block15;
                        for (n14 = (int)((v8066425) ? 1 : 0); n14 < n18; ++n14) {
                            n13 = nArray[n14];
                            n12 = n13 >> he_2.a(29190, 7271435517217607381L) & he_2.a(26900, 148677007791789508L);
                            n11 = n13 >> he_2.a(29584, 7649389514892480327L) & he_2.a(26900, 148677007791789508L);
                            n10 = n13 & he_2.a(26900, 148677007791789508L);
                            n12 = n12 * he_2.a(26900, 148677007791789508L) / n16;
                            n11 = n11 * he_2.a(26900, 148677007791789508L) / n16;
                            n10 = n10 * he_2.a(26900, 148677007791789508L) / n16;
                            nArray[n14] = n13 & he_2.a(28078, 5042850219683320186L) | n12 << he_2.a(29190, 7271435517217607381L) | n11 << he_2.a(29584, 7649389514892480327L) | n10;
                            if (stringArray != null) {
                                if (stringArray != null) continue;
                            }
                            break block16;
                        }
                        this.E(bufferedImage3, 0, n15, n18, 1, nArray);
                        ++n15;
                    }
                    if (stringArray != null) continue;
                }
            }
            bl = this.S;
        }
        if (bl) {
            bufferedImage3 = new hl_2().filter(bufferedImage3, bufferedImage3);
        }
        return bufferedImage3;
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
                v0 = "+q]\u0018Lvk\u0007s\\\u0018M<A\rp\u001a\u0012Yyh\u000f`I\u000eV8A\u001d;\u0014S".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 111;
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
                                v9 = 1;
                                break;
                            }
                            case 1: {
                                v9 = 122;
                                break;
                            }
                            case 2: {
                                v9 = 85;
                                break;
                            }
                            case 3: {
                                v9 = 18;
                                break;
                            }
                            case 4: {
                                v9 = 80;
                                break;
                            }
                            case 5: {
                                v9 = 54;
                                break;
                            }
                            default: {
                                v9 = 64;
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
                he_2.a = new String(v10).intern();
                var0_1 = 1059035424258658681L;
                var6_2 = new long[7];
                var3_3 = 0;
                var4_4 = "\u00c3\u00dc\u00e67/J\u00a0\u00a6\u00eb\u00cf\u00d4\u00c7\u00fb\u00c7\u0080\u0003\u00cb5\u00f8#4\u00bd\u009e6\u00a0a\u0016K:B.\u00ed=\u00b2\u00f0\n\u0085\u00f2\b\u00bf";
                var5_5 = "\u00c3\u00dc\u00e67/J\u00a0\u00a6\u00eb\u00cf\u00d4\u00c7\u00fb\u00c7\u0080\u0003\u00cb5\u00f8#4\u00bd\u009e6\u00a0a\u0016K:B.\u00ed=\u00b2\u00f0\n\u0085\u00f2\b\u00bf".length();
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
                    var4_4 = "\u0019\u00c2\u009f\u00e6\u0010\u00cc\u0084Bh\u00deC\u00a5\u00b9\u0094\u001f\u00bc";
                    var5_5 = "\u0019\u00c2\u009f\u00e6\u0010\u00cc\u0084Bh\u00deC\u00a5\u00b9\u0094\u001f\u00bc".length();
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
        he_2.b = var6_2;
        he_2.d = new Integer[7];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7CD5;
        if (d[n11] == null) {
            he_2.d[n11] = (int)(b[n11] ^ l2);
        }
        return d[n11];
    }
}

