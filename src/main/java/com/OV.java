/*
 * Decompiled with CFR 0.152.
 */
package com;

public final class OV
extends Enum {
    public static final OV none;
    public static final OV fillFirst;
    public static final OV fillMiddle;
    public static final OV fillLast;
    public static final OV fillFirstAndLast;
    public static final OV fillAll;
    private static final /* synthetic */ OV[] k;
    private static final long a;

    public static OV[] values() {
        return (OV[])k.clone();
    }

    public static OV valueOf(String string) {
        return Enum.valueOf(OV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private OV() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ OV[] I() {
        OV[] oVArray = new OV[(int)a];
        oVArray[0] = none;
        oVArray[1] = fillFirst;
        oVArray[2] = fillMiddle;
        oVArray[3] = fillLast;
        oVArray[4] = fillFirstAndLast;
        oVArray[5] = fillAll;
        return oVArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = "k2A#o\u0001V~/l!M$E~/\bk2A#e\tWy\u0004c4C*\u0007k2A#h\u0004H";
                var7_3 = "k2A#o\u0001V~/l!M$E~/\bk2A#e\tWy\u0004c4C*\u0007k2A#h\u0004H".length();
                var4_4 = 16;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 56;
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
                    var5_2 = "%|\u000fm*O\u000e'y\u0006\t%|\u000fm!O\u00180a";
                    var7_3 = "%|\u000fm*O\u000e'y\u0006\t%|\u000fm!O\u00180a".length();
                    var4_4 = 10;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 118;
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
                            v15 = 53;
                            break;
                        }
                        case 1: {
                            v15 = 99;
                            break;
                        }
                        case 2: {
                            v15 = 21;
                            break;
                        }
                        case 3: {
                            v15 = 119;
                            break;
                        }
                        case 4: {
                            v15 = 17;
                            break;
                        }
                        case 5: {
                            v15 = 80;
                            break;
                        }
                        default: {
                            v15 = 28;
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
        var0_7 = 8886392014867456997L;
        ** while (true)
        OV.a = -7095282113610849309L ^ var0_7;
        OV.none = new OV(var2[2], 0);
        OV.fillFirst = new OV(var2[5], 1);
        OV.fillMiddle = new OV(var2[4], 2);
        OV.fillLast = new OV(var2[1], 3);
        OV.fillFirstAndLast = new OV(var2[0], 4);
        OV.fillAll = new OV(var2[3], 5);
        OV.k = OV.I();
    }
}

