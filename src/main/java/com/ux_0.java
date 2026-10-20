/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.ux
 */
public final class ux_0
extends Enum {
    public static final ux_0 waiting;
    public static final ux_0 loading;
    public static final ux_0 loaded;
    public static final ux_0 failed;
    private static final /* synthetic */ ux_0[] s;

    public static ux_0[] values() {
        return (ux_0[])s.clone();
    }

    public static ux_0 valueOf(String string) {
        return Enum.valueOf(ux_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ux_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ ux_0[] s() {
        return new ux_0[]{waiting, loading, loaded, failed};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "\u0011\u0014>\u0000>P\u001c\u0006\u001b\u001a6\b2Z";
                var5_3 = "\u0011\u0014>\u0000>P\u001c\u0006\u001b\u001a6\b2Z".length();
                var2_4 = 7;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 80;
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
                    var3_2 = "+.\u0004:\b`\u00070 \f*\u0004j&";
                    var5_3 = "+.\u0004:\b`\u00070 \f*\u0004j&".length();
                    var2_4 = 6;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 106;
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
                            v15 = 45;
                            break;
                        }
                        case 1: {
                            v15 = 43;
                            break;
                        }
                        case 2: {
                            v15 = 15;
                            break;
                        }
                        case 3: {
                            v15 = 52;
                            break;
                        }
                        case 4: {
                            v15 = 7;
                            break;
                        }
                        case 5: {
                            v15 = 110;
                            break;
                        }
                        default: {
                            v15 = 43;
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
        ux_0.waiting = new ux_0(var0[3], 0);
        ux_0.loading = new ux_0(var0[0], 1);
        ux_0.loaded = new ux_0(var0[2], 2);
        ux_0.failed = new ux_0(var0[1], 3);
        ux_0.s = ux_0.s();
    }
}

