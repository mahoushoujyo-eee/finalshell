/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.lg
 */
public final class lg_2
extends Enum {
    public static final lg_2 colorSwitch;
    public static final lg_2 defaultColor;
    public static final lg_2 color1;
    public static final lg_2 color2;
    private static final lg_2[] x;

    public static lg_2[] values() {
        return (lg_2[])x.clone();
    }

    public static lg_2 valueOf(String string) {
        return Enum.valueOf(lg_2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lg_2() {
        void var2_-1;
        void var1_-1;
    }

    private static lg_2[] M() {
        return new lg_2[]{colorSwitch, defaultColor, color1, color2};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "tLsl#c\fsFyb$>kTLsl#";
                var5_3 = "tLsl#c\fsFyb$>kTLsl#".length();
                var2_4 = 6;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 64;
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
                    var3_2 = "AyFY\u00164]KbI^\u0006AyFY\u0016U";
                    var5_3 = "AyFY\u00164]KbI^\u0006AyFY\u0016U".length();
                    var2_4 = 11;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 117;
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
                            v15 = 87;
                            break;
                        }
                        case 1: {
                            v15 = 99;
                            break;
                        }
                        case 2: {
                            v15 = 95;
                            break;
                        }
                        case 3: {
                            v15 = 67;
                            break;
                        }
                        case 4: {
                            v15 = 17;
                            break;
                        }
                        case 5: {
                            v15 = 18;
                            break;
                        }
                        default: {
                            v15 = 95;
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
        lg_2.colorSwitch = new lg_2(var0[2], 0);
        lg_2.defaultColor = new lg_2(var0[1], 1);
        lg_2.color1 = new lg_2(var0[0], 2);
        lg_2.color2 = new lg_2(var0[3], 3);
        lg_2.x = lg_2.M();
    }
}

