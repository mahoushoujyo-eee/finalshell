/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.L4;
import com.LF;
import com.lu_0;
import com.w8_0;

public abstract class LN
extends Enum {
    public static final LN Back;
    public static final LN BackStyle;
    public static final LN Scroll;
    private static final LN[] l;

    public static LN[] values() {
        return (LN[])l.clone();
    }

    public static LN valueOf(String string) {
        return Enum.valueOf(LN.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LN() {
        void var2_-1;
        void var1_-1;
    }

    public abstract String W(w8_0 var1, int var2);

    private static LN[] y() {
        return new LN[]{Back, BackStyle, Scroll};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    LN() {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "<k*+\u0006-i;/LE\t<k*+s]C\u0012o";
            var5_3 = "<k*+\u0006-i;/LE\t<k*+s]C\u0012o".length();
            var2_4 = 4;
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
            v4 = 59;
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
                            v11 = 69;
                            break;
                        }
                        case 1: {
                            v11 = 49;
                            break;
                        }
                        case 2: {
                            v11 = 114;
                            break;
                        }
                        case 3: {
                            v11 = 123;
                            break;
                        }
                        case 4: {
                            v11 = 27;
                            break;
                        }
                        case 5: {
                            v11 = 18;
                            break;
                        }
                        default: {
                            v11 = 1;
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
        LN.Back = new lu_0();
        LN.BackStyle = new LF();
        LN.Scroll = new L4();
        LN.l = LN.y();
    }
}

