/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.hi_0;
import com.ph_2;
import com.z8;

class zN
extends z8 {
    private final long[] u;
    private final boolean T;

    public zN(String string, boolean bl, long[] lArray, boolean bl2) {
        super(string, bl);
        this.u = lArray;
        this.T = bl2;
    }

    @Override
    public boolean x(ph_2 ph_22, Object object, Object object2, Object object3) {
        boolean bl;
        block17: {
            block18: {
                Object object4;
                String string;
                Object object5;
                block15: {
                    block16: {
                        object5 = this.H(ph_22, object, object3);
                        string = hi_0.C();
                        try {
                            try {
                                object4 = object5;
                                if (string != null) break block15;
                                if (object4 != null) break block16;
                            }
                            catch (hi_0 hi_02) {
                                throw zN.a(hi_02);
                            }
                            return false;
                        }
                        catch (hi_0 hi_03) {
                            throw zN.a(hi_03);
                        }
                    }
                    object4 = object5;
                }
                try {
                    bl = object4 instanceof Number;
                    if (string != null) break block17;
                    if (!bl) break block18;
                }
                catch (hi_0 hi_04) {
                    throw zN.a(hi_04);
                }
                long l2 = B8.e((Number)object5);
                long[] lArray = this.u;
                int n10 = lArray.length;
                int n11 = 0;
                while (n11 < n10) {
                    block19: {
                        block20: {
                            boolean bl2;
                            block21: {
                                block22: {
                                    long l3 = lArray[n11];
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (string != null) break block19;
                                                    bl = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                                                    if (string != null) break block17;
                                                }
                                                catch (hi_0 hi_05) {
                                                    throw zN.a(hi_05);
                                                }
                                                if (bl) break block20;
                                            }
                                            catch (hi_0 hi_06) {
                                                throw zN.a(hi_06);
                                            }
                                            bl2 = this.T;
                                            if (string != null) break block21;
                                        }
                                        catch (hi_0 hi_07) {
                                            throw zN.a(hi_07);
                                        }
                                        if (bl2) break block22;
                                    }
                                    catch (hi_0 hi_08) {
                                        throw zN.a(hi_08);
                                    }
                                    bl2 = true;
                                    break block21;
                                }
                                bl2 = false;
                            }
                            return bl2;
                        }
                        ++n11;
                    }
                    if (string == null) continue;
                }
            }
            bl = this.T;
        }
        return bl;
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

