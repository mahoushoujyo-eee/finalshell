/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.nq
 */
public final class nq_2
extends Enum {
    public static final nq_2 leading;
    public static final nq_2 centered;
    public static final nq_2 trailing;
    private static final /* synthetic */ nq_2[] m;

    public static nq_2[] values() {
        return (nq_2[])m.clone();
    }

    public static nq_2 valueOf(String string) {
        return Enum.valueOf(nq_2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private nq_2() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ nq_2[] F() {
        return new nq_2[]{leading, centered, trailing};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "g5s9w(K\b\u007f\"s4r/Bl\bh5|){4Io";
            var5_3 = "g5s9w(K\b\u007f\"s4r/Bl\bh5|){4Io".length();
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
            v4 = 41;
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
                            v11 = 34;
                            break;
                        }
                        case 1: {
                            v11 = 121;
                            break;
                        }
                        case 2: {
                            v11 = 59;
                            break;
                        }
                        case 3: {
                            v11 = 116;
                            break;
                        }
                        case 4: {
                            v11 = 55;
                            break;
                        }
                        case 5: {
                            v11 = 111;
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
        nq_2.leading = new nq_2(var0[0], 0);
        nq_2.centered = new nq_2(var0[2], 1);
        nq_2.trailing = new nq_2(var0[1], 2);
        nq_2.m = nq_2.F();
    }
}

