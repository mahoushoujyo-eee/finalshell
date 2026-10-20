/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class HA
extends Enum {
    public static final HA debug;
    public static final HA info;
    public static final HA warn;
    public static final HA error;
    private static final /* synthetic */ HA[] p;

    public static HA[] values() {
        return (HA[])p.clone();
    }

    public static HA valueOf(String string) {
        return Enum.valueOf(HA.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HA() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ HA[] M() {
        return new HA[]{debug, info, warn, error};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "\u001a}\u0001\u001e\u001b\u0005\u001bj\u0011\u0004\u000e";
                var5_3 = "\u001a}\u0001\u001e\u001b\u0005\u001bj\u0011\u0004\u000e".length();
                var2_4 = 5;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 90;
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
                    var3_2 = "\bx\u0010\u0004\u0004\u0016w\u0004\u0005";
                    var5_3 = "\bx\u0010\u0004\u0004\u0016w\u0004\u0005".length();
                    var2_4 = 4;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 91;
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
                            v15 = 36;
                            break;
                        }
                        case 1: {
                            v15 = 66;
                            break;
                        }
                        case 2: {
                            v15 = 57;
                            break;
                        }
                        case 3: {
                            v15 = 49;
                            break;
                        }
                        case 4: {
                            v15 = 38;
                            break;
                        }
                        case 5: {
                            v15 = 37;
                            break;
                        }
                        default: {
                            v15 = 56;
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
        HA.debug = new HA(var0[0], 0);
        HA.info = new HA(var0[3], 1);
        HA.warn = new HA(var0[2], 2);
        HA.error = new HA(var0[1], 3);
        HA.p = HA.M();
    }
}

