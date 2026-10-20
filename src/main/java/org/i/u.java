/*
 * Decompiled with CFR 0.152.
 */
package org.i;

final class u
extends Enum {
    public static final u EXTENDS;
    public static final u SUPER;
    public static final u ANY;
    public static final u NONE;
    private static final u[] d;

    public static u[] values() {
        return (u[])d.clone();
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private u() {
        void var2_-1;
        void var1_-1;
    }

    private static u[] B() {
        return new u[]{EXTENDS, SUPER, ANY, NONE};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "|\u0010(\u0004s\u0011?5";
                var5_3 = "|\u0010(\u0004s\u0011?5".length();
                var2_4 = 3;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 82;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "t\u0011;/+\u0007b\u001c?/7=2";
                    var5_3 = "t\u0011;/+\u0007b\u001c?/7=2".length();
                    var2_4 = 5;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 72;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 111;
                            break;
                        }
                        case 1: {
                            v15 = 12;
                            break;
                        }
                        case 2: {
                            v15 = 35;
                            break;
                        }
                        case 3: {
                            v15 = 34;
                            break;
                        }
                        case 4: {
                            v15 = 49;
                            break;
                        }
                        case 5: {
                            v15 = 49;
                            break;
                        }
                        default: {
                            v15 = 41;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        u.EXTENDS = new u(var0[3], 0);
        u.SUPER = new u(var0[2], 1);
        u.ANY = new u(var0[0], 2);
        u.NONE = new u(var0[1], 3);
        u.d = u.B();
    }
}

