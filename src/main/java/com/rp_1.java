/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.rP
 */
public final class rp_1
extends Enum {
    public static final rp_1 BLINK_BLOCK;
    public static final rp_1 STEADY_BLOCK;
    public static final rp_1 BLINK_UNDERLINE;
    public static final rp_1 STEADY_UNDERLINE;
    public static final rp_1 BLINK_VERTICAL_BAR;
    public static final rp_1 STEADY_VERTICAL_BAR;
    private static final /* synthetic */ rp_1[] w;
    private static final long a;

    public static rp_1[] values() {
        return (rp_1[])w.clone();
    }

    public static rp_1 valueOf(String string) {
        return Enum.valueOf(rp_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rp_1() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ rp_1[] C() {
        rp_1[] rp_1Array = new rp_1[(int)a];
        rp_1Array[0] = BLINK_BLOCK;
        rp_1Array[1] = STEADY_BLOCK;
        rp_1Array[2] = BLINK_UNDERLINE;
        rp_1Array[3] = STEADY_UNDERLINE;
        rp_1Array[4] = BLINK_VERTICAL_BAR;
        rp_1Array[5] = STEADY_VERTICAL_BAR;
        return rp_1Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = "B583%~_G$/&(dA]>?33\fB583%~_S-21*\u000fS-4<*xU_%8 -nNT\u0012S-4<*xVT3);\"fLN#< ";
                var7_3 = "B583%~_G$/&(dA]>?33\fB583%~_S-21*\u000fS-4<*xU_%8 -nNT\u0012S-4<*xVT3);\"fLN#< ".length();
                var4_4 = 19;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 35;
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
                    var5_2 = "A?&.8jPO<,+\u0010P'*!7lMV=+%!y[M6";
                    var7_3 = "A?&.8jPO<,+\u0010P'*!7lMV=+%!y[M6".length();
                    var4_4 = 11;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 49;
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
                            v15 = 50;
                            break;
                        }
                        case 1: {
                            v15 = 66;
                            break;
                        }
                        case 2: {
                            v15 = 94;
                            break;
                        }
                        case 3: {
                            v15 = 81;
                            break;
                        }
                        case 4: {
                            v15 = 66;
                            break;
                        }
                        case 5: {
                            v15 = 4;
                            break;
                        }
                        default: {
                            v15 = 35;
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
        var0_7 = 1402280390422034552L;
        ** while (true)
        rp_1.a = 6464223507119732862L ^ var0_7;
        rp_1.BLINK_BLOCK = new rp_1(var2[4], 0);
        rp_1.STEADY_BLOCK = new rp_1(var2[1], 1);
        rp_1.BLINK_UNDERLINE = new rp_1(var2[2], 2);
        rp_1.STEADY_UNDERLINE = new rp_1(var2[5], 3);
        rp_1.BLINK_VERTICAL_BAR = new rp_1(var2[3], 4);
        rp_1.STEADY_VERTICAL_BAR = new rp_1(var2[0], 5);
        rp_1.w = rp_1.C();
    }
}

