/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.IJ;
import com.R9;
import com.au_0;
import com.i2_0;
import com.oj_2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class E4 {
    public static String y(String string, Object[] objectArray) {
        String string2;
        block4: {
            block3: {
                boolean bl;
                block2: {
                    boolean bl2 = i2_0.X();
                    bl = i2_0.m();
                    if (bl2) break block2;
                    if (!bl) break block3;
                    string2 = string;
                    if (bl2) break block4;
                    bl = i2_0.D(string2);
                }
                string2 = bl ? i2_0.A(string, objectArray) : string;
                break block4;
            }
            string2 = string;
        }
        return string2;
    }

    public static void a(au_0 au_02, String string, Object[] objectArray) {
        block5: {
            boolean bl;
            block4: {
                boolean bl2 = i2_0.K();
                bl = i2_0.m();
                if (!bl2) break block4;
                if (!bl) break block5;
                bl = i2_0.D(string);
            }
            if (bl) {
                au_02.u(string, objectArray);
            }
        }
    }

    public static List j(oj_2 oj_22) {
        ArrayList arrayList = new ArrayList();
        E4.a(oj_22.N(), oj_22, arrayList);
        return arrayList;
    }

    private static void a(String string, oj_2 oj_22, List list) {
        block10: {
            List list2;
            boolean bl;
            block11: {
                string = E4.O(string);
                bl = i2_0.X();
                list2 = oj_22.I();
                if (!bl) {
                    if (list2 != null) {
                        for (Serializable serializable : oj_22.I()) {
                            list.add(string + ((R9)serializable).h());
                            if (!bl) {
                                if (!bl) continue;
                            }
                            break block10;
                        }
                    }
                    list2 = oj_22.j();
                }
                if (bl) break block11;
                if (list2 == null) break block10;
                list2 = oj_22.j();
            }
            for (Serializable serializable : list2) {
                E4.a(E4.j(string, (oj_2)serializable), (oj_2)serializable, list);
                if (!bl) continue;
            }
        }
    }

    public static void Z(oj_2 oj_22, oj_2 oj_23) {
        E4.w(oj_22.N(), oj_22, oj_23);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void w(String var0, oj_2 var1_1, oj_2 var2_2) {
        block16: {
            block18: {
                block17: {
                    block15: {
                        var0 = E4.O(var0);
                        var3_3 = i2_0.X();
                        v0 = var1_1.I();
                        if (!var3_3) {
                            if (v0 != null) {
                                for (R9 var5_5 : var1_1.I()) {
                                    var6_6 = var5_5 /* !! */ .M();
                                    var6_6.Z(var0 + var6_6.h());
                                    var2_2.v(var6_6);
                                    if (!var3_3) {
                                        if (!var3_3) continue;
                                    }
                                    break block15;
                                }
                            }
                            v0 = var1_1.n();
                        }
                        if (!var3_3) {
                            if (v0 != null) {
                                for (R9 var5_5 : var1_1.n()) {
                                    var2_2.N((IJ)var5_5 /* !! */ );
                                    if (!var3_3) {
                                        if (!var3_3) continue;
                                    }
                                    break block16;
                                }
                            } else {
                                ** GOTO lbl23
                            }
                        }
                        break block17;
                    }
                    v0 = var1_1.j();
                }
                if (var3_3) break block18;
                if (v0 == null) break block16;
                v0 = var1_1.j();
            }
            for (R9 var5_5 : v0) {
                E4.w(E4.j(var0, (oj_2)var5_5 /* !! */ ), (oj_2)var5_5 /* !! */ , var2_2);
                if (!var3_3) continue;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String O(String string) {
        String string2;
        boolean bl = i2_0.K();
        String string3 = string;
        if (bl) {
            if (string3 == null) return "";
            string3 = string;
        }
        boolean bl2 = string3.equals("");
        if (bl) {
            if (bl2) return "";
            string2 = string;
            if (!bl) return string2;
            bl2 = string2.endsWith(".");
        }
        if (bl2) return "";
        string2 = string + ".";
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String j(String string, oj_2 oj_22) {
        String string2;
        StringBuilder stringBuilder;
        block5: {
            boolean bl;
            String string3;
            block4: {
                string3 = oj_22.N();
                bl = i2_0.K();
                stringBuilder = new StringBuilder().append(string);
                string2 = string3;
                if (!bl) break block4;
                if (string2 == null) break block5;
                string2 = string3;
            }
            if (!bl) return stringBuilder.append(string2).toString();
            if (!string2.equals("")) {
                string2 = string3;
                return stringBuilder.append(string2).toString();
            }
        }
        string2 = "";
        return stringBuilder.append(string2).toString();
    }
}

