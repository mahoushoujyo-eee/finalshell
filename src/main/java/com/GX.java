/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="TooltipType")
public final class GX
extends Enum {
    public static final GX swing;
    public static final GX weblaf;
    private static final /* synthetic */ GX[] W;

    public static GX[] values() {
        return (GX[])W.clone();
    }

    public static GX valueOf(String string) {
        return Enum.valueOf(GX.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private GX() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ GX[] Y() {
        return new GX[]{swing, weblaf};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "5S|\t%\u0014\u00051Aw\u000b#";
            var5_3 = "5S|\t%\u0014\u00051Aw\u000b#".length();
            var2_4 = 6;
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
            v4 = 117;
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
                            v11 = 55;
                            break;
                        }
                        case 1: {
                            v11 = 67;
                            break;
                        }
                        case 2: {
                            v11 = 107;
                            break;
                        }
                        case 3: {
                            v11 = 16;
                            break;
                        }
                        case 4: {
                            v11 = 49;
                            break;
                        }
                        case 5: {
                            v11 = 7;
                            break;
                        }
                        default: {
                            v11 = 80;
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
        GX.swing = new GX(var0[1], 0);
        GX.weblaf = new GX(var0[0], 1);
        GX.W = GX.Y();
    }
}

