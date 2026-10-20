/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.oV
 */
public final class ov_1
extends Enum {
    public static final ov_1 random;
    public static final ov_1 zoomIn;
    public static final ov_1 zoomOut;
    private static final /* synthetic */ ov_1[] C;
    private static String P;

    public static ov_1[] values() {
        return (ov_1[])C.clone();
    }

    public static ov_1 valueOf(String string) {
        return Enum.valueOf(ov_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ov_1() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ ov_1[] r() {
        return new ov_1[]{random, zoomIn, zoomOut};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "Fn\u0017\u001ayYW\u0006N`\u0016\u0013YA\u0006Fn\u0017\u001a\u007fB";
            var5_3 = "Fn\u0017\u001ayYW\u0006N`\u0016\u0013YA\u0006Fn\u0017\u001a\u007fB".length();
            var2_4 = 7;
            ov_1.R("EdXBvb");
            var1_5 = -1;
lbl8:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl10:
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
            v4 = 10;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl68
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 54;
                            break;
                        }
                        case 1: {
                            v11 = 11;
                            break;
                        }
                        case 2: {
                            v11 = 114;
                            break;
                        }
                        case 3: {
                            v11 = 125;
                            break;
                        }
                        case 4: {
                            v11 = 60;
                            break;
                        }
                        case 5: {
                            v11 = 38;
                            break;
                        }
                        default: {
                            v11 = 41;
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
lbl68:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        ov_1.random = new ov_1(var0[1], 0);
        ov_1.zoomIn = new ov_1(var0[2], 1);
        ov_1.zoomOut = new ov_1(var0[0], 2);
        ov_1.C = ov_1.r();
    }

    public static void R(String string) {
        P = string;
    }

    public static String n() {
        return P;
    }
}

