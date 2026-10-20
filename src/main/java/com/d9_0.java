/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.d9
 */
final class d9_0
extends Enum {
    public static final d9_0 NONE;
    public static final d9_0 ZLIB;
    public static final d9_0 GZIP;
    public static final d9_0 ANY;
    private static final d9_0[] C;

    public static d9_0[] values() {
        return (d9_0[])C.clone();
    }

    public static d9_0 valueOf(String string) {
        return Enum.valueOf(d9_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d9_0() {
        void var2_-1;
        void var1_-1;
    }

    private static d9_0[] E() {
        return new d9_0[]{NONE, ZLIB, GZIP, ANY};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "\u000e6Y\u0004\b\"I\u0007";
                var5_3 = "\u000e6Y\u0004\b\"I\u0007".length();
                var2_4 = 3;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 12;
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
                    var3_2 = "uT)u\u0004aW.r";
                    var5_3 = "uT)u\u0004aW.r".length();
                    var2_4 = 4;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 108;
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
                            v15 = 67;
                            break;
                        }
                        case 1: {
                            v15 = 116;
                            break;
                        }
                        case 2: {
                            v15 = 12;
                            break;
                        }
                        case 3: {
                            v15 = 91;
                            break;
                        }
                        case 4: {
                            v15 = 114;
                            break;
                        }
                        case 5: {
                            v15 = 55;
                            break;
                        }
                        default: {
                            v15 = 98;
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
        d9_0.NONE = new d9_0(var0[3], 0);
        d9_0.ZLIB = new d9_0(var0[2], 1);
        d9_0.GZIP = new d9_0(var0[1], 2);
        d9_0.ANY = new d9_0(var0[0], 3);
        d9_0.C = d9_0.E();
    }
}

