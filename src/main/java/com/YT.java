/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class YT
extends Enum {
    public static final YT MOUSE_REPORTING_NONE;
    public static final YT MOUSE_REPORTING_NORMAL;
    public static final YT MOUSE_REPORTING_HILITE;
    public static final YT MOUSE_REPORTING_BUTTON_MOTION;
    public static final YT MOUSE_REPORTING_ALL_MOTION;
    public static final YT MOUSE_REPORTING_FOCUS;
    private static final /* synthetic */ YT[] f;
    private static String p;
    private static final long a;

    public static YT[] values() {
        return (YT[])f.clone();
    }

    public static YT valueOf(String string) {
        return Enum.valueOf(YT.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private YT() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ YT[] Y() {
        YT[] yTArray = new YT[(int)a];
        yTArray[0] = MOUSE_REPORTING_NONE;
        yTArray[1] = MOUSE_REPORTING_NORMAL;
        yTArray[2] = MOUSE_REPORTING_HILITE;
        yTArray[3] = MOUSE_REPORTING_BUTTON_MOTION;
        yTArray[4] = MOUSE_REPORTING_ALL_MOTION;
        yTArray[5] = MOUSE_REPORTING_FOCUS;
        return yTArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = "YfDtwK?Qy^uf]#SvYn~]9Q\u001dYfDtwK?Qy^uf]#SvSrf@\"Zv\\hf]\"Z\u001aYfDtwK?Qy^uf]#SvPk~K [}Xh|\u0015YfDtwK?Qy^uf]#SvWhqA>";
                var7_3 = "YfDtwK?Qy^uf]#SvYn~]9Q\u001dYfDtwK?Qy^uf]#SvSrf@\"Zv\\hf]\"Z\u001aYfDtwK?Qy^uf]#SvPk~K [}Xh|\u0015YfDtwK?Qy^uf]#SvWhqA>".length();
                var4_4 = 22;
                YT.c("EvJVKc");
                var3_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    v0 = 16;
                    v1 = ++var3_5;
                    v2 = var5_2.substring(v1, v1 + var4_4);
                    v3 = -1;
                    break block20;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    var5_2 = "KtVfeY-CkLgtO1AdMznC\u0016KtVfeY-CkLgtO1AdMzrK>J";
                    var7_3 = "KtVfeY-CkLgtO1AdMznC\u0016KtVfeY-CkLgtO1AdMzrK>J".length();
                    var4_4 = 20;
                    var3_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 2;
                        v5 = ++var3_5;
                        v2 = var5_2.substring(v5, v5 + var4_4);
                        v3 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl29:
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
            if (v7 > 1) ** GOTO lbl86
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var8_6;
                while (true) {
                    switch (var8_6 % 7) {
                        case 0: {
                            v15 = 4;
                            break;
                        }
                        case 1: {
                            v15 = 57;
                            break;
                        }
                        case 2: {
                            v15 = 1;
                            break;
                        }
                        case 3: {
                            v15 = 55;
                            break;
                        }
                        case 4: {
                            v15 = 34;
                            break;
                        }
                        case 5: {
                            v15 = 4;
                            break;
                        }
                        default: {
                            v15 = 125;
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
lbl86:
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
lbl96:
                // 1 sources

                ** continue;
            }
lbl97:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 4418713021632058281L;
        ** while (true)
        YT.a = 6214231401169261487L ^ var0_7;
        YT.MOUSE_REPORTING_NONE = new YT(var2[4], 0);
        YT.MOUSE_REPORTING_NORMAL = new YT(var2[5], 1);
        YT.MOUSE_REPORTING_HILITE = new YT(var2[0], 2);
        YT.MOUSE_REPORTING_BUTTON_MOTION = new YT(var2[1], 3);
        YT.MOUSE_REPORTING_ALL_MOTION = new YT(var2[2], 4);
        YT.MOUSE_REPORTING_FOCUS = new YT(var2[3], 5);
        YT.f = YT.Y();
    }

    public static void c(String string) {
        p = string;
    }

    public static String M() {
        return p;
    }
}

