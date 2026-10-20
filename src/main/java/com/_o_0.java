/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KE;
import com.O0;
import com.a0;
import com.hi_0;
import com.oc_0;
import com.ph_2;
import com.yn_2;
import java.util.ArrayList;

/*
 * Renamed from com._o
 */
class _o_0
implements a0 {
    private boolean g;
    private boolean d;
    public static final _o_0 O;
    public static final _o_0 v;
    public static final _o_0 t;
    private static final String a;

    private _o_0(boolean bl, boolean bl2) {
        this.g = bl;
        this.d = bl2;
    }

    @Override
    public Object Y(ph_2 ph_22, Object object, Object object2) {
        try {
            if (!this.g) {
                return ph_22.G(object2);
            }
        }
        catch (hi_0 hi_02) {
            throw _o_0.a(hi_02);
        }
        ArrayList arrayList = new ArrayList();
        ph_22.u(object2, arrayList);
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void Z(ph_2 var1_1, yn_2 var2_2, KE var3_3) {
        block20: {
            block25: {
                block26: {
                    block21: {
                        block22: {
                            block24: {
                                block23: {
                                    block19: {
                                        var4_4 = hi_0.C();
                                        try {
                                            try {
                                                v0 = var3_3;
                                                if (var4_4 != null) break block19;
                                                if (!v0.o) break block20;
                                            }
                                            catch (hi_0 v1) {
                                                throw _o_0.a(v1);
                                            }
                                            v0 = var2_2.M();
                                        }
                                        catch (hi_0 v2) {
                                            throw _o_0.a(v2);
                                        }
                                    }
                                    var5_5 = v0;
                                    try {
                                        v3 = this.g;
                                        if (var4_4 != null) break block21;
                                        if (!v3) break block22;
                                    }
                                    catch (hi_0 v4) {
                                        throw _o_0.a(v4);
                                    }
                                    var6_6 = new ArrayList<E>();
                                    try {
                                        try {
                                            if (var4_4 != null) break block23;
                                            if (this.d) {
                                            }
                                            ** GOTO lbl39
                                        }
                                        catch (hi_0 v5) {
                                            throw _o_0.a(v5);
                                        }
                                        var1_1.X(var5_5, var6_6);
                                    }
                                    catch (hi_0 v6) {
                                        throw _o_0.a(v6);
                                    }
                                }
                                try {
                                    if (var4_4 == null) break block24;
lbl39:
                                    // 2 sources

                                    var1_1.u(var5_5, var6_6);
                                }
                                catch (hi_0 v7) {
                                    throw _o_0.a(v7);
                                }
                            }
                            var3_3.t = var6_6;
                            return;
                        }
                        v3 = var5_5 instanceof O0;
                    }
                    try {
                        if (var4_4 != null) break block25;
                        if (!v3) break block26;
                    }
                    catch (hi_0 v8) {
                        throw _o_0.a(v8);
                    }
                    var6_7 = ((O0)var5_5).values();
                    var7_8 = new oc_0(var6_7.size());
                    var7_8.addAll(var6_7);
                    var3_3.t = var7_8;
                    return;
                }
                v3 = var5_5 instanceof oc_0;
            }
            try {
                if (v3) {
                    var3_3.t = var5_5;
                    return;
                }
            }
            catch (hi_0 v9) {
                throw _o_0.a(v9);
            }
        }
        throw new hi_0(_o_0.a);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "G\\'\t".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 56;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 43;
                            break;
                        }
                        case 1: {
                            n17 = 43;
                            break;
                        }
                        case 2: {
                            n17 = 91;
                            break;
                        }
                        case 3: {
                            n17 = 126;
                            break;
                        }
                        case 4: {
                            n17 = 119;
                            break;
                        }
                        case 5: {
                            n17 = 106;
                            break;
                        }
                        default: {
                            n17 = 87;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
        O = new _o_0(false, false);
        v = new _o_0(true, false);
        t = new _o_0(true, true);
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

