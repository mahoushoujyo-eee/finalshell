/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;

/*
 * Renamed from com.Pt
 */
public final class pt_0
extends Enum {
    public static final pt_0 unchecked;
    public static final pt_0 checked;
    public static final pt_0 mixed;
    private static final /* synthetic */ pt_0[] G;
    private static ky_2[] L;

    public static pt_0[] values() {
        return (pt_0[])G.clone();
    }

    public static pt_0 valueOf(String string) {
        return Enum.valueOf(pt_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pt_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ pt_0[] Q() {
        return new pt_0[]{unchecked, checked, mixed};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            pt_0.J(null);
            var3_2 = "i!Z ;\u0007g G&4\u001fF\tq&A-:\u0019Ia,";
            var5_3 = "i!Z ;\u0007g G&4\u001fF\tq&A-:\u0019Ia,".length();
            var2_4 = 5;
            var1_5 = -1;
lbl8:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 36;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl68
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 32;
                            break;
                        }
                        case 1: {
                            v11 = 108;
                            break;
                        }
                        case 2: {
                            v11 = 6;
                            break;
                        }
                        case 3: {
                            v11 = 97;
                            break;
                        }
                        case 4: {
                            v11 = 123;
                            break;
                        }
                        case 5: {
                            v11 = 94;
                            break;
                        }
                        default: {
                            v11 = 6;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl68:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        pt_0.unchecked = new pt_0(var0[2], 0);
        pt_0.checked = new pt_0(var0[1], 1);
        pt_0.mixed = new pt_0(var0[0], 2);
        pt_0.G = pt_0.Q();
    }

    public static void J(ky_2[] ky_2Array) {
        L = ky_2Array;
    }

    public static ky_2[] b() {
        return L;
    }
}

