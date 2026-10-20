/*
 * Decompiled with CFR 0.152.
 */
package org.v;

/*
 * Renamed from org.v.g
 */
public final class g_1
extends Enum {
    public static final g_1 BLOCK;
    public static final g_1 TYPE_DECLARATION;
    public static final g_1 COMPILATION_UNIT;
    private static final g_1[] e;

    public static g_1[] values() {
        return (g_1[])e.clone();
    }

    public static g_1 valueOf(String string) {
        return Enum.valueOf(g_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g_1() {
        void var2_-1;
        void var1_-1;
    }

    private static g_1[] J() {
        return new g_1[]{BLOCK, TYPE_DECLARATION, COMPILATION_UNIT};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "*=iF\u00014]=;kX\u0017-R &\u0010=+tS\u0017<Y*>eD\t,U&<\u0005+>kU\u0003";
            var5_3 = "*=iF\u00014]=;kX\u0017-R &\u0010=+tS\u0017<Y*>eD\t,U&<\u0005+>kU\u0003".length();
            var2_4 = 16;
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
            v4 = 113;
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
                            v11 = 24;
                            break;
                        }
                        case 1: {
                            v11 = 3;
                            break;
                        }
                        case 2: {
                            v11 = 85;
                            break;
                        }
                        case 3: {
                            v11 = 103;
                            break;
                        }
                        case 4: {
                            v11 = 57;
                            break;
                        }
                        case 5: {
                            v11 = 9;
                            break;
                        }
                        default: {
                            v11 = 109;
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
        g_1.BLOCK = new g_1(var0[2], 0);
        g_1.TYPE_DECLARATION = new g_1(var0[1], 1);
        g_1.COMPILATION_UNIT = new g_1(var0[0], 2);
        g_1.e = g_1.J();
    }
}

