/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.gt_1;
import com.iw_2;
import java.awt.Rectangle;

/*
 * Renamed from com.gM
 */
public class gm_1
extends gt_1 {
    public static final float e;
    public static final float[] L;
    public static final float[] t;
    public static final float[] i;
    public static final float[] N;
    public static final float[] S;
    public static float[] R;
    public static final float[] p;
    public static float[] M;
    protected float[] d = S;
    protected float[] T = R;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public void y(float[] fArray) {
        this.d = fArray;
    }

    public float[] p() {
        return this.d;
    }

    public void f(float[] fArray) {
        this.T = fArray;
    }

    public float[] Z() {
        return this.T;
    }

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int n12 = 0;
        int[] nArray2 = new int[n10 * n11];
        String[] stringArray = W5.q();
        int n13 = 0;
        block0: while (true) {
            int n14 = n13;
            block1: while (n14 < n11) {
                for (int i2 = 0; i2 < n10; ++i2) {
                    int n15;
                    int n16;
                    int n17;
                    int n18;
                    int n19;
                    int n20;
                    block10: {
                        n20 = 0;
                        n19 = 0;
                        n18 = 0;
                        int n21 = 0;
                        int n22 = 0;
                        int n23 = 0;
                        int n24 = 0;
                        int n25 = 0;
                        int n26 = 0;
                        n17 = nArray[n13 * n10 + i2] & gm_1.a(12404, 7604787667714226000L);
                        n14 = -1;
                        if (stringArray == null) continue block1;
                        int n27 = n14;
                        block3: while (true) {
                            int n28 = n27;
                            int n29 = 1;
                            block4: while (n28 <= n29) {
                                int n30;
                                block13: {
                                    int n31;
                                    int n32;
                                    block11: {
                                        block12: {
                                            int n33 = n13 + n27;
                                            n16 = 0;
                                            n15 = n33;
                                            if (stringArray == null) break block10;
                                            if (stringArray == null) break block11;
                                            if (n16 > n15) break block12;
                                            n32 = n33;
                                            n31 = n11;
                                            if (stringArray == null) break block11;
                                            if (n32 >= n31) break block12;
                                            n30 = n33 * n10;
                                            if (stringArray != null) break block13;
                                        }
                                        n32 = n13;
                                        n31 = n10;
                                    }
                                    n30 = n32 * n31;
                                }
                                int n34 = 3 * (n27 + 1) + 1;
                                for (int i3 = -1; i3 <= 1; ++i3) {
                                    int n35;
                                    block16: {
                                        int n36;
                                        block17: {
                                            int n37;
                                            block14: {
                                                block15: {
                                                    n36 = i2 + i3;
                                                    n37 = 0;
                                                    if (stringArray == null) break block14;
                                                    n29 = n36;
                                                    if (stringArray == null) continue block4;
                                                    if (n37 > n29) break block15;
                                                    n35 = n36;
                                                    if (stringArray == null) break block16;
                                                    if (n35 < n10) break block17;
                                                }
                                                n37 = i2;
                                            }
                                            n36 = n37;
                                        }
                                        n35 = nArray[n30 + n36];
                                    }
                                    int n38 = n35;
                                    float f10 = this.T[n34 + i3];
                                    float f11 = this.d[n34 + i3];
                                    n20 = (n38 & gm_1.a(18707, 4564500819708038713L)) >> gm_1.a(11607, 935946842587474559L);
                                    n19 = (n38 & gm_1.a(2848, 3258992809372060681L)) >> gm_1.a(12797, 1064130171544581841L);
                                    n18 = n38 & gm_1.a(19449, 7698272194334772443L);
                                    n21 += (int)(f10 * (float)n20);
                                    n22 += (int)(f10 * (float)n19);
                                    n23 += (int)(f10 * (float)n18);
                                    n24 += (int)(f11 * (float)n20);
                                    n25 += (int)(f11 * (float)n19);
                                    n26 += (int)(f11 * (float)n18);
                                    if (stringArray != null) continue;
                                }
                                ++n27;
                                if (stringArray != null) continue block3;
                            }
                            break;
                        }
                        n20 = (int)(Math.sqrt(n21 * n21 + n24 * n24) / 1.8);
                        n19 = (int)(Math.sqrt(n22 * n22 + n25 * n25) / 1.8);
                        n16 = n23 * n23;
                        n15 = n26 * n26;
                    }
                    n18 = (int)(Math.sqrt(n16 + n15) / 1.8);
                    n20 = iw_2.e(n20);
                    n19 = iw_2.e(n19);
                    n18 = iw_2.e(n18);
                    nArray2[n12++] = n17 | n20 << gm_1.a(5452, 5960234544762557031L) | n19 << gm_1.a(5807, 1492394015331750272L) | n18;
                    if (stringArray != null) continue;
                }
                ++n13;
                if (stringArray != null) continue block0;
            }
            break;
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
                v0 = "1\u0015O2=\u0017\u0010\u0011\u0005M4:\u0018\u0011\u0010\u0016M$".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 107;
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
                                v9 = 31;
                                break;
                            }
                            case 1: {
                                v9 = 26;
                                break;
                            }
                            case 2: {
                                v9 = 67;
                                break;
                            }
                            case 3: {
                                v9 = 60;
                                break;
                            }
                            case 4: {
                                v9 = 37;
                                break;
                            }
                            case 5: {
                                v9 = 83;
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
                gm_1.a = new String(v10).intern();
                var0_1 = 5909161447376435688L;
                var6_2 = new long[14];
                var3_3 = 0;
                var4_4 = "\u00d5\u00d6\u00a0\u00b0\u0013\u008a\u00a8`I\u00b0\u00c5e(\u0085\t0\u0010\u00fc\u00d4-\u00c1\u009d7\u00df:d\u000f\u0006\u00fa\u00fe\u008f1\"t\u00b2\u00af]\u00db\u00ab\u009f\u00be\u00d3qQ\u00f0\u001cw\u00d1\t\u008d\u0093\"GbJ\u00e1}YSM\u00f6]\u0013\u0087\u00ff\u00b5\u00c3\u00df\u00e0[4\u00a8\n?E\u00f5\u00e4\u00e5;,D\u0088\u009c\u00d1\u0013\u0088P\u00ef\u00c8\u00d1\u00cbnF.\u008e\u00b8";
                var5_5 = "\u00d5\u00d6\u00a0\u00b0\u0013\u008a\u00a8`I\u00b0\u00c5e(\u0085\t0\u0010\u00fc\u00d4-\u00c1\u009d7\u00df:d\u000f\u0006\u00fa\u00fe\u008f1\"t\u00b2\u00af]\u00db\u00ab\u009f\u00be\u00d3qQ\u00f0\u001cw\u00d1\t\u008d\u0093\"GbJ\u00e1}YSM\u00f6]\u0013\u0087\u00ff\u00b5\u00c3\u00df\u00e0[4\u00a8\n?E\u00f5\u00e4\u00e5;,D\u0088\u009c\u00d1\u0013\u0088P\u00ef\u00c8\u00d1\u00cbnF.\u008e\u00b8".length();
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
                    var4_4 = "V\u00a13\u00fa\u00ef\u00e4\u00de&\u0095\u00d8&\u00cf8\u00d9u\u00cc";
                    var5_5 = "V\u00a13\u00fa\u00ef\u00e4\u00de&\u0095\u00d8&\u00cf8\u00d9u\u00cc".length();
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
        gm_1.b = var6_2;
        gm_1.c = new Integer[14];
        gm_1.e = (float)Math.sqrt(2.0);
        v16 = new float[gm_1.a(2323, 8253840146799201854L)];
        v16[0] = 0.0f;
        v16[1] = 0.0f;
        v16[2] = -1.0f;
        v16[3] = 0.0f;
        v16[4] = 1.0f;
        v16[5] = 0.0f;
        v16[gm_1.a((int)24811, (long)2574382003196192712L)] = 0.0f;
        v16[gm_1.a((int)1509, (long)2813745744877126339L)] = 0.0f;
        v16[gm_1.a((int)5807, (long)1492394015331750272L)] = 0.0f;
        gm_1.L = v16;
        v17 = new float[gm_1.a(14335, 3936911163015246033L)];
        v17[0] = -1.0f;
        v17[1] = 0.0f;
        v17[2] = 0.0f;
        v17[3] = 0.0f;
        v17[4] = 1.0f;
        v17[5] = 0.0f;
        v17[gm_1.a((int)28196, (long)1483324118144542977L)] = 0.0f;
        v17[gm_1.a((int)2656, (long)1111336436693798215L)] = 0.0f;
        v17[gm_1.a((int)5807, (long)1492394015331750272L)] = 0.0f;
        gm_1.t = v17;
        v18 = new float[gm_1.a(14335, 3936911163015246033L)];
        v18[0] = -1.0f;
        v18[1] = 0.0f;
        v18[2] = 1.0f;
        v18[3] = -1.0f;
        v18[4] = 0.0f;
        v18[5] = 1.0f;
        v18[gm_1.a((int)28196, (long)1483324118144542977L)] = -1.0f;
        v18[gm_1.a((int)2656, (long)1111336436693798215L)] = 0.0f;
        v18[gm_1.a((int)5807, (long)1492394015331750272L)] = 1.0f;
        gm_1.i = v18;
        v19 = new float[gm_1.a(14335, 3936911163015246033L)];
        v19[0] = -1.0f;
        v19[1] = -1.0f;
        v19[2] = -1.0f;
        v19[3] = 0.0f;
        v19[4] = 0.0f;
        v19[5] = 0.0f;
        v19[gm_1.a((int)28196, (long)1483324118144542977L)] = 1.0f;
        v19[gm_1.a((int)2656, (long)1111336436693798215L)] = 1.0f;
        v19[gm_1.a((int)5807, (long)1492394015331750272L)] = 1.0f;
        gm_1.N = v19;
        v20 = new float[gm_1.a(14335, 3936911163015246033L)];
        v20[0] = -1.0f;
        v20[1] = 0.0f;
        v20[2] = 1.0f;
        v20[3] = -2.0f;
        v20[4] = 0.0f;
        v20[5] = 2.0f;
        v20[gm_1.a((int)28196, (long)1483324118144542977L)] = -1.0f;
        v20[gm_1.a((int)2656, (long)1111336436693798215L)] = 0.0f;
        v20[gm_1.a((int)5807, (long)1492394015331750272L)] = 1.0f;
        gm_1.S = v20;
        v21 = new float[gm_1.a(14335, 3936911163015246033L)];
        v21[0] = -1.0f;
        v21[1] = -2.0f;
        v21[2] = -1.0f;
        v21[3] = 0.0f;
        v21[4] = 0.0f;
        v21[5] = 0.0f;
        v21[gm_1.a((int)28196, (long)1483324118144542977L)] = 1.0f;
        v21[gm_1.a((int)2656, (long)1111336436693798215L)] = 2.0f;
        v21[gm_1.a((int)5807, (long)1492394015331750272L)] = 1.0f;
        gm_1.R = v21;
        v22 = new float[gm_1.a(14335, 3936911163015246033L)];
        v22[0] = -1.0f;
        v22[1] = 0.0f;
        v22[2] = 1.0f;
        v22[3] = -gm_1.e;
        v22[4] = 0.0f;
        v22[5] = gm_1.e;
        v22[gm_1.a((int)28196, (long)1483324118144542977L)] = -1.0f;
        v22[gm_1.a((int)2656, (long)1111336436693798215L)] = 0.0f;
        v22[gm_1.a((int)5807, (long)1492394015331750272L)] = 1.0f;
        gm_1.p = v22;
        v23 = new float[gm_1.a(14335, 3936911163015246033L)];
        v23[0] = -1.0f;
        v23[1] = -gm_1.e;
        v23[2] = -1.0f;
        v23[3] = 0.0f;
        v23[4] = 0.0f;
        v23[5] = 0.0f;
        v23[gm_1.a((int)28196, (long)1483324118144542977L)] = 1.0f;
        v23[gm_1.a((int)2656, (long)1111336436693798215L)] = gm_1.e;
        v23[gm_1.a((int)5807, (long)1492394015331750272L)] = 1.0f;
        gm_1.M = v23;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x72F;
        if (c[n11] == null) {
            gm_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

