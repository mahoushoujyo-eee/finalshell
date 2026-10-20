/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.Hq
 */
public final class hq_0
extends Enum {
    public static final hq_0 componentFocus;
    public static final hq_0 fieldFocus;
    private static final /* synthetic */ hq_0[] W;

    public static hq_0[] values() {
        return (hq_0[])W.clone();
    }

    public static hq_0 valueOf(String string) {
        return Enum.valueOf(hq_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hq_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ hq_0[] k() {
        return new hq_0[]{componentFocus, fieldFocus};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\b\r\u0000n\u001c7\u007f\u0005\u0016+q\u0010,i\n\r\u000b\br\u0017\u001fu\b\u0017\u001e";
            var5_3 = "\b\r\u0000n\u001c7\u007f\u0005\u0016+q\u0010,i\n\r\u000b\br\u0017\u001fu\b\u0017\u001e".length();
            var2_4 = 14;
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
            v4 = 60;
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
                            v11 = 87;
                            break;
                        }
                        case 1: {
                            v11 = 94;
                            break;
                        }
                        case 2: {
                            v11 = 81;
                            break;
                        }
                        case 3: {
                            v11 = 34;
                            break;
                        }
                        case 4: {
                            v11 = 79;
                            break;
                        }
                        case 5: {
                            v11 = 101;
                            break;
                        }
                        default: {
                            v11 = 38;
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
        hq_0.componentFocus = new hq_0(var0[0], 0);
        hq_0.fieldFocus = new hq_0(var0[1], 1);
        hq_0.W = hq_0.k();
    }
}

