/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.l9
 */
public final class l9_0
extends Enum {
    public static final l9_0 menuBarMenu;
    public static final l9_0 menuBarSubMenu;
    public static final l9_0 comboBoxMenu;
    public static final l9_0 customPopupMenu;
    private static final /* synthetic */ l9_0[] s;

    public static l9_0[] values() {
        return (l9_0[])s.clone();
    }

    public static l9_0 valueOf(String string) {
        return Enum.valueOf(l9_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private l9_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ l9_0[] X() {
        return new l9_0[]{menuBarMenu, menuBarSubMenu, comboBoxMenu, customPopupMenu};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "a\u001dmDb\u001fBm\u0018k@@\u0017|w\u000eo\rpEO\u0013`Q\u001d|}h\u001cg";
                var5_3 = "a\u001dmDb\u001fBm\u0018k@@\u0017|w\u000eo\rpEO\u0013`Q\u001d|}h\u001cg".length();
                var2_4 = 15;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 22;
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
                    var3_2 = "(J7\u0002\bT'\bJ7\u0002\f&@4\u0015%w:=b<\u0019?";
                    var5_3 = "(J7\u0002\bT'\bJ7\u0002\f&@4\u0015%w:=b<\u0019?".length();
                    var2_4 = 11;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 81;
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
                            v15 = 20;
                            break;
                        }
                        case 1: {
                            v15 = 126;
                            break;
                        }
                        case 2: {
                            v15 = 8;
                            break;
                        }
                        case 3: {
                            v15 = 38;
                            break;
                        }
                        case 4: {
                            v15 = 27;
                            break;
                        }
                        case 5: {
                            v15 = 100;
                            break;
                        }
                        default: {
                            v15 = 4;
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
        l9_0.menuBarMenu = new l9_0(var0[2], 0);
        l9_0.menuBarSubMenu = new l9_0(var0[1], 1);
        l9_0.comboBoxMenu = new l9_0(var0[3], 2);
        l9_0.customPopupMenu = new l9_0(var0[0], 3);
        l9_0.s = l9_0.X();
    }
}

