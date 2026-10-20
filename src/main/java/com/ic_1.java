/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.iC
 */
public final class ic_1
extends Enum {
    public static final ic_1 none;
    public static final ic_1 fadeIn;
    public static final ic_1 fadeOut;
    private static final /* synthetic */ ic_1[] H;

    public static ic_1[] values() {
        return (ic_1[])H.clone();
    }

    public static ic_1 valueOf(String string) {
        return Enum.valueOf(ic_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ic_1() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ ic_1[] C() {
        return new ic_1[]{none, fadeIn, fadeOut};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "#Y\u0004:Y\u0003O\u0004+W\u000e:\u0006#Y\u0004:_\u0018";
            var5_3 = "#Y\u0004:Y\u0003O\u0004+W\u000e:\u0006#Y\u0004:_\u0018".length();
            var2_4 = 7;
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
            v4 = 20;
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
                            v11 = 81;
                            break;
                        }
                        case 1: {
                            v11 = 44;
                            break;
                        }
                        case 2: {
                            v11 = 116;
                            break;
                        }
                        case 3: {
                            v11 = 75;
                            break;
                        }
                        case 4: {
                            v11 = 2;
                            break;
                        }
                        case 5: {
                            v11 = 98;
                            break;
                        }
                        default: {
                            v11 = 47;
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
        ic_1.none = new ic_1(var0[1], 0);
        ic_1.fadeIn = new ic_1(var0[2], 1);
        ic_1.fadeOut = new ic_1(var0[0], 2);
        ic_1.H = ic_1.C();
    }
}

