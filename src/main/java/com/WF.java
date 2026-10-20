/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="TooltipWay")
public final class WF
extends Enum {
    public static final WF up;
    public static final WF left;
    public static final WF leading;
    public static final WF down;
    public static final WF right;
    public static final WF trailing;
    private static final /* synthetic */ WF[] S;
    private static final long a;

    public static WF[] values() {
        return (WF[])S.clone();
    }

    public static WF valueOf(String string) {
        return Enum.valueOf(WF.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private WF() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ WF[] x() {
        WF[] wFArray = new WF[(int)a];
        wFArray[0] = up;
        wFArray[1] = left;
        wFArray[2] = leading;
        wFArray[3] = down;
        wFArray[4] = right;
        wFArray[5] = trailing;
        return wFArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = ">X\b?ZN\u000bQ(\u0000,\u0007'MN\u0006T/\t\u0004'MI\u0016";
                var7_3 = ">X\b?ZN\u000bQ(\u0000,\u0007'MN\u0006T/\t\u0004'MI\u0016".length();
                var4_4 = 2;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 57;
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
                    var5_2 = "E=4v5\u0004S;$p";
                    var7_3 = "E=4v5\u0004S;$p".length();
                    var4_4 = 5;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 69;
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
                            v15 = 114;
                            break;
                        }
                        case 1: {
                            v15 = 17;
                            break;
                        }
                        case 2: {
                            v15 = 22;
                            break;
                        }
                        case 3: {
                            v15 = 91;
                            break;
                        }
                        case 4: {
                            v15 = 4;
                            break;
                        }
                        case 5: {
                            v15 = 120;
                            break;
                        }
                        default: {
                            v15 = 87;
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
        var0_7 = 6343215426344666518L;
        ** while (true)
        WF.a = -8067621276009806448L ^ var0_7;
        WF.up = new WF(var2[0], 0);
        WF.left = new WF(var2[3], 1);
        WF.leading = new WF(var2[2], 2);
        WF.down = new WF(var2[5], 3);
        WF.right = new WF(var2[4], 4);
        WF.trailing = new WF(var2[1], 5);
        WF.S = WF.x();
    }
}

