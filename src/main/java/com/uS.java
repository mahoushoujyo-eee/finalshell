/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class uS
extends Enum {
    public static final uS Bash;
    public static final uS Zsh;
    public static final uS Unknown;
    private static final uS[] E;

    public static uS[] values() {
        return (uS[])E.clone();
    }

    public static uS valueOf(String string) {
        return Enum.valueOf(uS.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private uS() {
        void var2_-1;
        void var1_-1;
    }

    private static uS[] X() {
        return new uS[]{Bash, Zsh, Unknown};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\u000b\u001b|\u0004\u0013\tgP\u0007\u0004\u0006\u007fV\u0002G0";
            var5_3 = "\u000b\u001b|\u0004\u0013\tgP\u0007\u0004\u0006\u007fV\u0002G0".length();
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
            v4 = 4;
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
                            v11 = 85;
                            break;
                        }
                        case 1: {
                            v11 = 108;
                            break;
                        }
                        case 2: {
                            v11 = 16;
                            break;
                        }
                        case 3: {
                            v11 = 60;
                            break;
                        }
                        case 4: {
                            v11 = 105;
                            break;
                        }
                        case 5: {
                            v11 = 52;
                            break;
                        }
                        default: {
                            v11 = 90;
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
        uS.Bash = new uS(var0[1], 0);
        uS.Zsh = new uS(var0[0], 1);
        uS.Unknown = new uS(var0[2], 2);
        uS.E = uS.X();
    }
}

