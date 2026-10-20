/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KE;
import com.a0;
import com.hi_0;
import com.ph_2;
import com.yn_2;
import java.util.Collection;

/*
 * Renamed from com.oM
 */
class om_1
implements a0 {
    public static final om_1 f = new om_1();

    om_1() {
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public Object Y(ph_2 var1_1, Object var2_2, Object var3_3) {
        block22: {
            block28: {
                block21: {
                    block20: {
                        var5_4 = null;
                        var4_5 = hi_0.C();
                        try {
                            try {
                                v0 = var3_3;
                                if (var4_5 != null) break block20;
                                if (!(v0 instanceof Collection)) break block21;
                            }
                            catch (UnsupportedOperationException v1) {
                                throw om_1.a(v1);
                            }
                            v0 = var3_3;
                        }
                        catch (UnsupportedOperationException v2) {
                            throw om_1.a(v2);
                        }
                    }
                    for (E var7_7 : (Collection)v0) {
                        block26: {
                            block27: {
                                block25: {
                                    block23: {
                                        block24: {
                                            try {
                                                try {
                                                    try {
                                                        v3 = var7_7;
                                                        if (var4_5 != null) break block22;
                                                        if (var4_5 != null) break block23;
                                                    }
                                                    catch (UnsupportedOperationException v4) {
                                                        throw om_1.a(v4);
                                                    }
                                                    if (v3 != null) break block24;
                                                }
                                                catch (UnsupportedOperationException v5) {
                                                    throw om_1.a(v5);
                                                }
                                                if (var4_5 == null) continue;
                                            }
                                            catch (UnsupportedOperationException v6) {
                                                throw om_1.a(v6);
                                            }
                                        }
                                        v7 = var5_4;
                                    }
                                    try {
                                        if (var4_5 != null) break block25;
                                        if (v7 == null) {
                                        }
                                        ** GOTO lbl47
                                    }
                                    catch (UnsupportedOperationException v8) {
                                        throw om_1.a(v8);
                                    }
                                    var5_4 = var7_7;
                                    try {
                                        if (var4_5 == null) break block26;
lbl47:
                                        // 2 sources

                                        v7 = var5_4;
                                    }
                                    catch (UnsupportedOperationException v9) {
                                        throw om_1.a(v9);
                                    }
                                }
                                try {
                                    try {
                                        if (var4_5 != null) break block27;
                                        if (ph_2.x(v7, var7_7) >= 0) break block26;
                                    }
                                    catch (UnsupportedOperationException v10) {
                                        throw om_1.a(v10);
                                    }
                                    v7 = var7_7;
                                }
                                catch (UnsupportedOperationException v11) {
                                    throw om_1.a(v11);
                                }
                            }
                            var5_4 = v7;
                        }
                        if (var4_5 == null) continue;
                        break block28;
                    }
                    break block28;
                }
                throw new UnsupportedOperationException();
            }
            v3 = var5_4;
        }
        return v3;
    }

    @Override
    public void Z(ph_2 ph_22, yn_2 yn_22, KE kE) {
        throw new UnsupportedOperationException();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}

