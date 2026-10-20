/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ke_1;
import javax.swing.JComponent;

public final class BU
extends Enum {
    public static final BU start;
    public static final BU middle;
    public static final BU end;
    public static final BU none;
    private static final /* synthetic */ BU[] O;

    public static BU[] values() {
        return (BU[])O.clone();
    }

    public static BU valueOf(String string) {
        return Enum.valueOf(BU.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BU() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    public static BU I(JComponent var0, ke_1 var1_1) {
        block13: {
            block12: {
                var3_2 = var1_1.getComponentZOrder(var0);
                var4_3 = var1_1.getComponentCount() - 1;
                var2_4 = ke_1.v();
                var5_5 = var1_1.z();
                v0 = var4_3;
                if (var2_4 == null) {
                    if (v0 == 0) {
                        v0 = (int)var5_5;
                        if (var2_4 == null) {
                            if (v0 == 0) {
                                return BU.none;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var3_2;
                    }
                }
                if (var2_4 == null) {
                    if (v0 == 0) {
                        return BU.start;
                    }
                    v0 = var3_2;
                }
                if (var2_4 != null) break block12;
                if (v0 != var4_3) break block13;
                v0 = (int)var5_5;
            }
            if (v0 == 0) {
                return BU.end;
            }
        }
        return BU.middle;
    }

    private static /* synthetic */ BU[] K() {
        return new BU[]{start, middle, end, none};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "\u001b7\u001e\u0005\r-\u001b\f\u0011";
                var5_3 = "\u001b7\u001e\u0005\r-\u001b\f\u0011".length();
                var2_4 = 3;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 119;
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
                    var3_2 = "wQs|\u0006tWy}nS";
                    var5_3 = "wQs|\u0006tWy}nS".length();
                    var2_4 = 4;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 16;
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
                            v15 = 9;
                            break;
                        }
                        case 1: {
                            v15 = 46;
                            break;
                        }
                        case 2: {
                            v15 = 13;
                            break;
                        }
                        case 3: {
                            v15 = 9;
                            break;
                        }
                        case 4: {
                            v15 = 18;
                            break;
                        }
                        case 5: {
                            v15 = 38;
                            break;
                        }
                        default: {
                            v15 = 25;
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
        BU.start = new BU(var0[1], 0);
        BU.middle = new BU(var0[3], 1);
        BU.end = new BU(var0[0], 2);
        BU.none = new BU(var0[2], 3);
        BU.O = BU.K();
    }
}

