/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.k7
 */
public final class k7_0
extends Enum {
    public static final k7_0 rgb;
    public static final k7_0 hex;
    private static final /* synthetic */ k7_0[] c;

    public static k7_0[] values() {
        return (k7_0[])c.clone();
    }

    public static k7_0 valueOf(String string) {
        return Enum.valueOf(k7_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k7_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ k7_0[] h() {
        return new k7_0[]{rgb, hex};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "2\u000fb\u0003(\rx";
            var5_3 = "2\u000fb\u0003(\rx".length();
            var2_4 = 3;
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
            v4 = 123;
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
                            v11 = 33;
                            break;
                        }
                        case 1: {
                            v11 = 17;
                            break;
                        }
                        case 2: {
                            v11 = 97;
                            break;
                        }
                        case 3: {
                            v11 = 2;
                            break;
                        }
                        case 4: {
                            v11 = 19;
                            break;
                        }
                        case 5: {
                            v11 = 82;
                            break;
                        }
                        default: {
                            v11 = 81;
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
        k7_0.rgb = new k7_0(var0[1], 0);
        k7_0.hex = new k7_0(var0[0], 1);
        k7_0.c = k7_0.h();
    }
}

