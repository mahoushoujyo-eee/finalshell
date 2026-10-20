/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class HF
extends Enum {
    public static final HF Object;
    public static final HF Array;
    public static final HF Value;
    private static final HF[] W;

    public static HF[] values() {
        return (HF[])W.clone();
    }

    public static HF valueOf(String string) {
        return Enum.valueOf(HF.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HF() {
        void var2_-1;
        void var1_-1;
    }

    private static HF[] w() {
        return new HF[]{Object, Array, Value};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "ot9\u0014\u0018\u0006vw?\u0004\u001eQ\u0005xg'\u0000\u0004";
            var5_3 = "ot9\u0014\u0018\u0006vw?\u0004\u001eQ\u0005xg'\u0000\u0004".length();
            var2_4 = 5;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
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
            v4 = 10;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 51;
                            break;
                        }
                        case 1: {
                            v11 = 31;
                            break;
                        }
                        case 2: {
                            v11 = 95;
                            break;
                        }
                        case 3: {
                            v11 = 107;
                            break;
                        }
                        case 4: {
                            v11 = 119;
                            break;
                        }
                        case 5: {
                            v11 = 47;
                            break;
                        }
                        default: {
                            v11 = 15;
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
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        HF.Object = new HF(var0[1], 0);
        HF.Array = new HF(var0[2], 1);
        HF.Value = new HF(var0[0], 2);
        HF.W = HF.w();
    }
}

