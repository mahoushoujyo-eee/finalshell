/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from tu
 */
public class tu_2
implements bg_1 {
    private static tu_2 Q = null;

    public static tu_2 n() {
        String[] stringArray = lr_0.Q();
        tu_2 tu_22 = Q;
        if (stringArray == null) {
            if (tu_22 == null) {
                Q = new tu_2();
            }
            tu_22 = Q;
        }
        return tu_22;
    }

    private tu_2() {
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public double N(String var1_1, String var2_2) {
        block25: {
            block26: {
                block24: {
                    block23: {
                        block21: {
                            block22: {
                                block20: {
                                    block19: {
                                        var4_3 = 0.0;
                                        var3_4 = lr_0.Q();
                                        v0 = var1_1;
                                        if (var3_4 == null) {
                                            if (v0 == null) {
                                                v0 = var2_2;
                                                if (var3_4 == null) {
                                                    if (v0 == null) {
                                                        return 1.0;
                                                    } else {
                                                        ** GOTO lbl-1000
                                                    }
                                                }
                                            } else lbl-1000:
                                            // 3 sources

                                            {
                                                v0 = var1_1;
                                            }
                                        }
                                        if (var3_4 != null) break block19;
                                        if (v0 == null) break block20;
                                        v0 = var2_2;
                                    }
                                    if (var3_4 != null) break block21;
                                    if (v0 != null) break block22;
                                }
                                return 0.0;
                            }
                            v0 = var1_1;
                        }
                        if (v0.equalsIgnoreCase(var2_2)) {
                            return 1.0;
                        }
                        var6_5 = lr_0.L().P(var1_1);
                        var7_6 = lr_0.L().P(var2_2);
                        v1 = var6_5;
                        if (var3_4 != null) break block23;
                        if (v1 == null) break block24;
                        v1 = var7_6;
                    }
                    if (var3_4 != null) break block25;
                    if (v1 != null) break block26;
                }
                return 0.0;
            }
            v1 = var6_5;
        }
        var8_7 = v1.iterator();
        block0: while (true) {
            v2 = var8_7.hasNext();
            block1: while (v2 != 0) {
                var9_8 = (String)var8_7.next();
                for (String var11_10 : var7_6) {
                    var12_11 = this.D(var9_8, var11_10);
                    System.out.println(var9_8 + "-" + var11_10 + "-" + ke_1.O(var9_8, var11_10));
                    v3 = var4_3;
                    if (var3_4 == null) {
                        cfr_temp_0 = v3 - var12_11;
                        v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                        if (var3_4 != null) continue block1;
                        if (v2 < 0) {
                            v3 = var4_3 = var12_11;
                        }
                    }
                    if (var3_4 == null) continue;
                }
                if (var3_4 == null) continue block0;
            }
            break;
        }
        return var4_3;
    }

    public double D(String string, String string2) {
        return ke_1.O(string, string2) / ke_1.I;
    }
}

