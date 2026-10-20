/*
 * Decompiled with CFR 0.152.
 */
package com.m;

public final class T
extends Enum {
    public static final T single;
    public static final T group;
    public static final T line;
    private static final /* synthetic */ T[] Z;

    public static T[] values() {
        return (T[])Z.clone();
    }

    public static T valueOf(String string) {
        return Enum.valueOf(T.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private T() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ T[] S() {
        return new T[]{single, group, line};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "j<\u0011;\u0006u<\u0011964\u0005a'\u0010+*";
            var5_3 = "j<\u0011;\u0006u<\u0011964\u0005a'\u0010+*".length();
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
            v4 = 74;
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
                            v11 = 76;
                            break;
                        }
                        case 1: {
                            v11 = 31;
                            break;
                        }
                        case 2: {
                            v11 = 53;
                            break;
                        }
                        case 3: {
                            v11 = 20;
                            break;
                        }
                        case 4: {
                            v11 = 16;
                            break;
                        }
                        case 5: {
                            v11 = 27;
                            break;
                        }
                        default: {
                            v11 = 5;
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
        T.single = new T(var0[1], 0);
        T.group = new T(var0[2], 1);
        T.line = new T(var0[0], 2);
        T.Z = T.S();
    }
}

