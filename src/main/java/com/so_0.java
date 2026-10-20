/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.So
 */
public final class so_0
extends Enum {
    public static final so_0 never;
    public static final so_0 multiline;
    public static final so_0 always;
    private static final /* synthetic */ so_0[] C;

    public static so_0[] values() {
        return (so_0[])C.clone();
    }

    public static so_0 valueOf(String string) {
        return Enum.valueOf(so_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private so_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ so_0[] a() {
        return new so_0[]{never, multiline, always};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "|I<\\kn~\u007fY\u0006pP'I{q\u0005\u007fY&Mp";
            var5_3 = "|I<\\kn~\u007fY\u0006pP'I{q\u0005\u007fY&Mp".length();
            var2_4 = 9;
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
            v4 = 12;
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
                            v11 = 29;
                            break;
                        }
                        case 1: {
                            v11 = 48;
                            break;
                        }
                        case 2: {
                            v11 = 92;
                            break;
                        }
                        case 3: {
                            v11 = 36;
                            break;
                        }
                        case 4: {
                            v11 = 14;
                            break;
                        }
                        case 5: {
                            v11 = 14;
                            break;
                        }
                        default: {
                            v11 = 27;
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
        so_0.never = new so_0(var0[2], 0);
        so_0.multiline = new so_0(var0[0], 1);
        so_0.always = new so_0(var0[1], 2);
        so_0.C = so_0.a();
    }
}

