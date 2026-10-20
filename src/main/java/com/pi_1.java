/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.pI
 */
public final class pi_1
extends Enum {
    public static final pi_1 simple;
    public static final pi_1 gradient;
    private static final /* synthetic */ pi_1[] H;
    private static String[] L;

    public static pi_1[] values() {
        return (pi_1[])H.clone();
    }

    public static pi_1 valueOf(String string) {
        return Enum.valueOf(pi_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pi_1() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ pi_1[] Q() {
        return new pi_1[]{simple, gradient};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            pi_1.t(null);
            var3_2 = "{\u0004vEK5@h\u0006o\u001fzQN5";
            var5_3 = "{\u0004vEK5@h\u0006o\u001fzQN5".length();
            var2_4 = 8;
            var1_5 = -1;
lbl8:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl10:
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
            v4 = 73;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl68
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
                            v11 = 63;
                            break;
                        }
                        case 2: {
                            v11 = 94;
                            break;
                        }
                        case 3: {
                            v11 = 104;
                            break;
                        }
                        case 4: {
                            v11 = 107;
                            break;
                        }
                        case 5: {
                            v11 = 25;
                            break;
                        }
                        default: {
                            v11 = 103;
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
lbl68:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        pi_1.simple = new pi_1(var0[1], 0);
        pi_1.gradient = new pi_1(var0[0], 1);
        pi_1.H = pi_1.Q();
    }

    public static void t(String[] stringArray) {
        L = stringArray;
    }

    public static String[] v() {
        return L;
    }
}

