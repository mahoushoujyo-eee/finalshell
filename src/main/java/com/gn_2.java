/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import com.iw_2;
import java.awt.Rectangle;

/*
 * Renamed from com.gn
 */
public class gn_2
extends gt_1 {
    private float p = 2.3561945f;
    private float j = 0.5235988f;
    private boolean U = false;
    private float k = 3.0f;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void b(float f10) {
        this.p = f10;
    }

    public float l() {
        return this.p;
    }

    public void k(float f10) {
        this.j = f10;
    }

    public float Q() {
        return this.j;
    }

    public void P(float f10) {
        this.k = 3.0f * f10;
    }

    public float G() {
        return this.k / 3.0f;
    }

    public void V(boolean bl) {
        this.U = bl;
    }

    public boolean V() {
        return this.U;
    }

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int n12;
        int n13 = 0;
        int[] nArray2 = new int[n10 * n11];
        int n14 = n10;
        int n15 = n11;
        int[] nArray3 = new int[n14 * n15];
        String[] stringArray = W5.q();
        for (n12 = 0; n12 < nArray.length; ++n12) {
            nArray3[n12] = iw_2.g(nArray[n12]);
            if (stringArray != null) continue;
        }
        int n16 = (int)(Math.cos(this.p) * Math.cos(this.j) * (double)255.9f);
        int n17 = (int)(Math.sin(this.p) * Math.cos(this.j) * (double)255.9f);
        int n18 = (int)(Math.sin(this.j) * (double)255.9f);
        int n19 = (int)(1530.0f / this.k);
        int n20 = n19 * n19;
        int n21 = n19 * n18;
        int n22 = n18;
        int n23 = 0;
        int n24 = 0;
        while (n24 < n11) {
            block7: {
                int n25;
                int n26 = n23;
                int n27 = n26 + n14;
                int n28 = n27 + n14;
                int n29 = 0;
                while (n29 < n10) {
                    block17: {
                        int n30;
                        block16: {
                            int n31;
                            block15: {
                                block12: {
                                    int n32;
                                    block8: {
                                        block9: {
                                            block13: {
                                                int n33;
                                                int n34;
                                                int n35;
                                                block14: {
                                                    int n36;
                                                    block10: {
                                                        block11: {
                                                            n25 = n24;
                                                            if (stringArray == null) break block7;
                                                            if (stringArray == null) break block8;
                                                            if (n25 == 0) break block9;
                                                            n32 = n24;
                                                            if (stringArray == null) break block8;
                                                            if (n32 >= n11 - 2) break block9;
                                                            n32 = n29;
                                                            if (stringArray == null) break block8;
                                                            if (n32 == 0) break block9;
                                                            n32 = n29;
                                                            if (stringArray == null) break block8;
                                                            if (n32 >= n10 - 2) break block9;
                                                            n12 = nArray3[n26 - 1] + nArray3[n27 - 1] + nArray3[n28 - 1] - nArray3[n26 + 1] - nArray3[n27 + 1] - nArray3[n28 + 1];
                                                            n35 = nArray3[n28 - 1] + nArray3[n28] + nArray3[n28 + 1] - nArray3[n26 - 1] - nArray3[n26] - nArray3[n26 + 1];
                                                            n36 = n12;
                                                            if (stringArray == null) break block10;
                                                            if (n36 != 0) break block11;
                                                            n36 = n35;
                                                            if (stringArray == null) break block10;
                                                            if (n36 != 0) break block11;
                                                            n30 = n22;
                                                            if (stringArray != null) break block12;
                                                        }
                                                        n36 = n12 * n16 + n35 * n17 + n21;
                                                    }
                                                    n33 = n34 = n36;
                                                    if (stringArray == null) break block13;
                                                    if (n33 >= 0) break block14;
                                                    n30 = 0;
                                                    if (stringArray != null) break block12;
                                                }
                                                n33 = n30 = (int)((double)n34 / Math.sqrt(n12 * n12 + n35 * n35 + n20));
                                            }
                                            if (stringArray != null) break block12;
                                        }
                                        n32 = n22;
                                    }
                                    n30 = n32;
                                }
                                n31 = this.U;
                                if (stringArray == null) break block15;
                                if (n31 == 0) break block16;
                                n31 = nArray[n13];
                            }
                            int n37 = n31;
                            int n38 = n37 & gn_2.a(31222, 8109987245816246867L);
                            int n39 = n37 >> gn_2.a(15548, 9074451703399986975L) & gn_2.a(32085, 6156801358014052081L);
                            int n40 = n37 >> gn_2.a(20873, 7363365684734122536L) & gn_2.a(1793, 4995917531087867041L);
                            int n41 = n37 & gn_2.a(1793, 4995917531087867041L);
                            n39 = n39 * n30 >> gn_2.a(11621, 2035294097463355075L);
                            n40 = n40 * n30 >> gn_2.a(11621, 2035294097463355075L);
                            n41 = n41 * n30 >> gn_2.a(11621, 2035294097463355075L);
                            nArray2[n13++] = n38 | n39 << gn_2.a(26562, 1042989956288998496L) | n40 << gn_2.a(11621, 2035294097463355075L) | n41;
                            if (stringArray != null) break block17;
                        }
                        nArray2[n13++] = gn_2.a(30919, 3597071436533298016L) | n30 << gn_2.a(26562, 1042989956288998496L) | n30 << gn_2.a(11621, 2035294097463355075L) | n30;
                    }
                    ++n29;
                    ++n26;
                    ++n27;
                    ++n28;
                    if (stringArray != null) continue;
                }
                ++n24;
                n25 = n23 = n23 + n14;
            }
            if (stringArray != null) continue;
        }
        return nArray2;
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
                v0 = "\u0010\"\u001f]S,\u001fl\u0013\u000bSU%\tmxH".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 39;
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
                                v9 = 100;
                                break;
                            }
                            case 1: {
                                v9 = 113;
                                break;
                            }
                            case 2: {
                                v9 = 65;
                                break;
                            }
                            case 3: {
                                v9 = 22;
                                break;
                            }
                            case 4: {
                                v9 = 29;
                                break;
                            }
                            case 5: {
                                v9 = 113;
                                break;
                            }
                            default: {
                                v9 = 93;
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
                gn_2.a = new String(v10).intern();
                var0_1 = 8445393072392395988L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "DP\u00d0\u0085\u00dd;/\u00b4H\u00d1\u00fc\u00e0H\u00be\u00fa\u001f(\u00de\u009f\u00af|\u00ad.\u0087\u009f\u0002#\u00b2\u00fdo\u00aa\u00da\u00ec\u00e5\u009cn\u001c\u00e6k\u00dbamIR,\u0099\u00b0\u00a4";
                var5_5 = "DP\u00d0\u0085\u00dd;/\u00b4H\u00d1\u00fc\u00e0H\u00be\u00fa\u001f(\u00de\u009f\u00af|\u00ad.\u0087\u009f\u0002#\u00b2\u00fdo\u00aa\u00da\u00ec\u00e5\u009cn\u001c\u00e6k\u00dbamIR,\u0099\u00b0\u00a4".length();
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
                    var4_4 = "<|[\u00a7!\u009e\u0086\u00f4\u00e4,\u00ab[\u0093\u00dd\u00d0\u008a";
                    var5_5 = "<|[\u00a7!\u009e\u0086\u00f4\u00e4,\u00ab[\u0093\u00dd\u00d0\u008a".length();
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
        gn_2.b = var6_2;
        gn_2.c = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xBA7;
        if (c[n11] == null) {
            gn_2.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

