/*
 * Decompiled with CFR 0.152.
 */
package com.t;

/*
 * Renamed from com.t.a
 */
final class a_0
extends Enum {
    public static final a_0 outer;
    public static final a_0 palette;
    public static final a_0 doubleField;
    public static final a_0 hsbField;
    public static final a_0 rgbField;
    public static final a_0 hexField;
    private static final a_0[] L;
    private static final long a;

    public static a_0[] values() {
        return (a_0[])L.clone();
    }

    public static a_0 valueOf(String string) {
        return Enum.valueOf(a_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a_0() {
        void var2_-1;
        void var1_-1;
    }

    private static a_0[] G() {
        a_0[] a_0Array = new a_0[(int)a];
        a_0Array[0] = outer;
        a_0Array[1] = palette;
        a_0Array[2] = doubleField;
        a_0Array[3] = hsbField;
        a_0Array[4] = rgbField;
        a_0Array[5] = hexField;
        return a_0Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = "@T\u0017\u0013\fE0V\u0007BR\u00190\u0011T9\u000bV\\\u00007\tE\u001a[V\u00191\bZ@\u0017\u0013\fE0V";
                var7_3 = "@T\u0017\u0013\fE0V\u0007BR\u00190\u0011T9\u000bV\\\u00007\tE\u001a[V\u00191\bZ@\u0017\u0013\fE0V".length();
                var4_4 = 8;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 5;
                    v1 = ++var3_5;
                    v2 = var5_2.substring(v1, v1 + var4_4);
                    v3 = -1;
                    break block20;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    var5_2 = "[W\f\u0012\rD1W\u0005\\G\u00001\u0016";
                    var7_3 = "[W\f\u0012\rD1W\u0005\\G\u00001\u0016".length();
                    var4_4 = 8;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 4;
                        v5 = ++var3_5;
                        v2 = var5_2.substring(v5, v5 + var4_4);
                        v3 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    break block21;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var8_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var8_6;
                while (true) {
                    switch (var8_6 % 7) {
                        case 0: {
                            v15 = 55;
                            break;
                        }
                        case 1: {
                            v15 = 54;
                            break;
                        }
                        case 2: {
                            v15 = 112;
                            break;
                        }
                        case 3: {
                            v15 = 80;
                            break;
                        }
                        case 4: {
                            v15 = 96;
                            break;
                        }
                        case 5: {
                            v15 = 37;
                            break;
                        }
                        default: {
                            v15 = 89;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var8_6;
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
            } while (v10 > var8_6);
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
lbl96:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 5835743864236076817L;
        ** while (true)
        a_0.a = 988449628010901271L ^ var0_7;
        a_0.outer = new a_0(var2[5], 0);
        a_0.palette = new a_0(var2[1], 1);
        a_0.doubleField = new a_0(var2[2], 2);
        a_0.hsbField = new a_0(var2[3], 3);
        a_0.rgbField = new a_0(var2[0], 4);
        a_0.hexField = new a_0(var2[4], 5);
        a_0.L = a_0.G();
    }
}

