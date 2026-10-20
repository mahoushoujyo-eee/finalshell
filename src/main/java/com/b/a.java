/*
 * Decompiled with CFR 0.152.
 */
package com.b;

public final class a
extends Enum {
    public static final a OR;
    public static final a AND;
    private static final /* synthetic */ a[] Y;

    public static a[] values() {
        return (a[])Y.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ a[] V() {
        return new a[]{OR, AND};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "U\u0006p\u0002[\u001a";
            var5_3 = "U\u0006p\u0002[\u001a".length();
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
            v4 = 38;
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
                            v11 = 50;
                            break;
                        }
                        case 1: {
                            v11 = 110;
                            break;
                        }
                        case 2: {
                            v11 = 18;
                            break;
                        }
                        case 3: {
                            v11 = 71;
                            break;
                        }
                        case 4: {
                            v11 = 109;
                            break;
                        }
                        case 5: {
                            v11 = 96;
                            break;
                        }
                        default: {
                            v11 = 62;
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
        a.OR = new a(var0[1], 0);
        a.AND = new a(var0[0], 1);
        a.Y = a.V();
    }
}

