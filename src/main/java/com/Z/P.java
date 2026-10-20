/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

public final class P
extends Enum {
    public static final P save;
    public static final P open;
    public static final P custom;
    private static final /* synthetic */ P[] i;

    public static P[] values() {
        return (P[])i.clone();
    }

    public static P valueOf(String string) {
        return Enum.valueOf(P.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private P() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ P[] H() {
        return new P[]{save, open, custom};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "IHcH\u0006Y\\fYz:\u0004UYpC";
            var5_3 = "IHcH\u0006Y\\fYz:\u0004UYpC".length();
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
            v4 = 76;
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
                            v11 = 118;
                            break;
                        }
                        case 1: {
                            v11 = 101;
                            break;
                        }
                        case 2: {
                            v11 = 89;
                            break;
                        }
                        case 3: {
                            v11 = 97;
                            break;
                        }
                        case 4: {
                            v11 = 89;
                            break;
                        }
                        case 5: {
                            v11 = 27;
                            break;
                        }
                        default: {
                            v11 = 19;
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
        P.save = new P(var0[0], 0);
        P.open = new P(var0[2], 1);
        P.custom = new P(var0[1], 2);
        P.i = P.H();
    }
}

