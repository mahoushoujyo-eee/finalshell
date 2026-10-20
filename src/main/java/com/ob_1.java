/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.oB
 */
public final class ob_1
extends Enum {
    public static final ob_1 step;
    public static final ob_1 progress;
    private static final /* synthetic */ ob_1[] y;

    public static ob_1[] values() {
        return (ob_1[])y.clone();
    }

    public static ob_1 valueOf(String string) {
        return Enum.valueOf(ob_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ob_1() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ ob_1[] X() {
        return new ob_1[]{step, progress};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "$\u0006OxNa$'\u0004'\u0000Eo";
            var5_3 = "$\u0006OxNa$'\u0004'\u0000Eo".length();
            var2_4 = 8;
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
            v4 = 103;
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
                            v11 = 19;
                            break;
                        }
                        case 2: {
                            v11 = 71;
                            break;
                        }
                        case 3: {
                            v11 = 120;
                            break;
                        }
                        case 4: {
                            v11 = 91;
                            break;
                        }
                        case 5: {
                            v11 = 99;
                            break;
                        }
                        default: {
                            v11 = 48;
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
        ob_1.step = new ob_1(var0[1], 0);
        ob_1.progress = new ob_1(var0[0], 1);
        ob_1.y = ob_1.X();
    }
}

