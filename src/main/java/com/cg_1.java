/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.cG
 */
public final class cg_1
extends Enum {
    public static final cg_1 flow;
    public static final cg_1 stack;
    private static final /* synthetic */ cg_1[] F;

    public static cg_1[] values() {
        return (cg_1[])F.clone();
    }

    public static cg_1 valueOf(String string) {
        return Enum.valueOf(cg_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cg_1() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ cg_1[] k() {
        return new cg_1[]{flow, stack};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "i\u001aOP\u0005|\u0002AD\t";
            var5_3 = "i\u001aOP\u0005|\u0002AD\t".length();
            var2_4 = 4;
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
            v4 = 13;
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
                            v11 = 2;
                            break;
                        }
                        case 1: {
                            v11 = 123;
                            break;
                        }
                        case 2: {
                            v11 = 45;
                            break;
                        }
                        case 3: {
                            v11 = 42;
                            break;
                        }
                        case 4: {
                            v11 = 111;
                            break;
                        }
                        case 5: {
                            v11 = 55;
                            break;
                        }
                        default: {
                            v11 = 67;
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
        cg_1.flow = new cg_1(var0[0], 0);
        cg_1.stack = new cg_1(var0[1], 1);
        cg_1.F = cg_1.k();
    }
}

