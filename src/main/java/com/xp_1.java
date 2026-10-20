/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.xP
 */
public final class xp_1
extends Enum {
    public static final xp_1 atMinuteEnd;
    public static final xp_1 atHourEnd;
    public static final xp_1 atDayEnd;
    public static final xp_1 atMonthEnd;
    public static final xp_1 atYearEnd;
    private static final /* synthetic */ xp_1[] V;

    public static xp_1[] values() {
        return (xp_1[])V.clone();
    }

    public static xp_1 valueOf(String string) {
        return Enum.valueOf(xp_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xp_1() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ xp_1[] s() {
        return new xp_1[]{atMinuteEnd, atHourEnd, atDayEnd, atMonthEnd, atYearEnd};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "l+\u0004\u001e@)nc;\bl+\b\u0010L\u001eEi\tl+\u0015\u0014T)nc;";
                var5_3 = "l+\u0004\u001e@)nc;\bl+\b\u0010L\u001eEi\tl+\u0015\u0014T)nc;".length();
                var2_4 = 9;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 97;
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
                    var3_2 = "g \n\u0015P$HC:#\u000bg \n\u0013P%Tc\u0011)\u001e";
                    var5_3 = "g \n\u0015P$HC:#\u000bg \n\u0013P%Tc\u0011)\u001e".length();
                    var2_4 = 10;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 106;
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
                            v15 = 108;
                            break;
                        }
                        case 1: {
                            v15 = 62;
                            break;
                        }
                        case 2: {
                            v15 = 45;
                            break;
                        }
                        case 3: {
                            v15 = 16;
                            break;
                        }
                        case 4: {
                            v15 = 84;
                            break;
                        }
                        case 5: {
                            v15 = 58;
                            break;
                        }
                        default: {
                            v15 = 74;
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
        xp_1.atMinuteEnd = new xp_1(var0[4], 0);
        xp_1.atHourEnd = new xp_1(var0[0], 1);
        xp_1.atDayEnd = new xp_1(var0[1], 2);
        xp_1.atMonthEnd = new xp_1(var0[3], 3);
        xp_1.atYearEnd = new xp_1(var0[2], 4);
        xp_1.V = xp_1.s();
    }
}

