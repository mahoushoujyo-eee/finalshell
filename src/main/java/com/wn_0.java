/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

/*
 * Renamed from com.Wn
 */
public class wn_0
extends W5 {
    private int p;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public wn_0() {
        this.p = wn_0.a(12310, 6043725273262062438L);
    }

    public wn_0(int n10) {
        this.p = wn_0.a(4701, 935603847029119273L);
        this.p = n10;
    }

    public void R(int n10) {
        this.p = n10;
    }

    public int R() {
        return this.p;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        String[] stringArray;
        int n10;
        int n11;
        block18: {
            BufferedImage bufferedImage3;
            block17: {
                n11 = bufferedImage.getWidth();
                n10 = bufferedImage.getHeight();
                int n12 = bufferedImage.getType();
                stringArray = W5.q();
                WritableRaster writableRaster = bufferedImage.getRaster();
                bufferedImage3 = bufferedImage2;
                if (stringArray == null) break block17;
                if (bufferedImage3 != null) break block18;
                bufferedImage3 = this.createCompatibleDestImage(bufferedImage, null);
            }
            bufferedImage2 = bufferedImage3;
        }
        int[] nArray = new int[this.p * this.p];
        int n13 = 0;
        while (n13 < n10) {
            block12: {
                int n14;
                int n15 = 0;
                while (n15 < n11) {
                    block15: {
                        int n16;
                        int n17;
                        int n18;
                        int n19;
                        int n20;
                        int n21;
                        int n22;
                        int n23;
                        block13: {
                            n23 = Math.min(this.p, n11 - n15);
                            n22 = Math.min(this.p, n10 - n13);
                            int n24 = n23 * n22;
                            this.l(bufferedImage, n15, n13, n23, n22, nArray);
                            int n25 = 0;
                            int n26 = 0;
                            int n27 = 0;
                            n21 = 0;
                            n14 = 0;
                            if (stringArray == null) break block12;
                            n20 = n14;
                            while (n20 < n22) {
                                block14: {
                                    n19 = 0;
                                    if (stringArray == null) break block13;
                                    for (n18 = v5277220; n18 < n23; ++n18) {
                                        n17 = nArray[n21];
                                        n25 += n17 >> wn_0.a(2536, 2236656074292380313L) & wn_0.a(3125, 1565285346372470606L);
                                        n26 += n17 >> wn_0.a(8800, 4992849081458551059L) & wn_0.a(3162, 171589964607047471L);
                                        n27 += n17 & wn_0.a(3162, 171589964607047471L);
                                        ++n21;
                                        if (stringArray != null) {
                                            if (stringArray != null) continue;
                                        }
                                        break block14;
                                    }
                                    ++n20;
                                }
                                if (stringArray != null) continue;
                            }
                            n19 = n25 / n24 << wn_0.a(31393, 6920623054707110358L) | n26 / n24 << wn_0.a(29770, 5204818039570284348L) | n27 / n24;
                        }
                        n17 = n19;
                        n21 = 0;
                        n20 = 0;
                        while (n20 < n22) {
                            block16: {
                                n16 = 0;
                                if (stringArray == null) break block15;
                                for (n18 = v5277253; n18 < n23; ++n18) {
                                    nArray[n21] = nArray[n21] & wn_0.a(6022, 5795552734345288948L) | n17;
                                    ++n21;
                                    if (stringArray != null) {
                                        if (stringArray != null) continue;
                                    }
                                    break block16;
                                }
                                ++n20;
                            }
                            if (stringArray != null) continue;
                        }
                        this.E(bufferedImage2, n15, n13, n23, n22, nArray);
                        n16 = n15 = n15 + this.p;
                    }
                    if (stringArray != null) continue;
                }
                n14 = n13 = n13 + this.p;
            }
            if (stringArray != null) continue;
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
                v0 = "Y\\f7x\u0006%}P1\u001f{\u0019%`V0|:".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 122;
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
                                v9 = 115;
                                break;
                            }
                            case 1: {
                                v9 = 79;
                                break;
                            }
                            case 2: {
                                v9 = 100;
                                break;
                            }
                            case 3: {
                                v9 = 40;
                                break;
                            }
                            case 4: {
                                v9 = 110;
                                break;
                            }
                            case 5: {
                                v9 = 16;
                                break;
                            }
                            default: {
                                v9 = 62;
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
                wn_0.a = new String(v10).intern();
                var0_1 = 3865600601891543067L;
                var6_2 = new long[9];
                var3_3 = 0;
                var4_4 = "<`\u00ee\u00d5r0\u00f1\u0000d\u0011\u00a4#\u00b7\u00f9\u00c4\u00efj\u008c\u0091\u00c9W\u00a2\u00da\u0092T\u00c1\u0084\u0097O\u009d\u00e3\u007f\u00f4\u009f\u00f3Yoz)\u00dd\u0081H\u00c9g~i\u00a7/\u009d\u00b1r\u00e5\u00d8$\u00df\u00cb";
                var5_5 = "<`\u00ee\u00d5r0\u00f1\u0000d\u0011\u00a4#\u00b7\u00f9\u00c4\u00efj\u008c\u0091\u00c9W\u00a2\u00da\u0092T\u00c1\u0084\u0097O\u009d\u00e3\u007f\u00f4\u009f\u00f3Yoz)\u00dd\u0081H\u00c9g~i\u00a7/\u009d\u00b1r\u00e5\u00d8$\u00df\u00cb".length();
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
                    var4_4 = "\u009f\u0005\u009f}\u00d7\u00e0\u00c10\u00e2Bed\u008d\u00ef\u00df\u00aa";
                    var5_5 = "\u009f\u0005\u009f}\u00d7\u00e0\u00c10\u00e2Bed\u008d\u00ef\u00df\u00aa".length();
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
        wn_0.b = var6_2;
        wn_0.c = new Integer[9];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4B73;
        if (c[n11] == null) {
            wn_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

