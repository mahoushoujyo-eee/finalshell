/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.hi_0;
import com.ph_2;
import com.z8;

class zV
extends z8 {
    private final long s;
    private final long I;
    private final boolean N;

    public zV(String string, boolean bl, long l2, long l3, boolean bl2) {
        super(string, bl);
        this.s = l2;
        this.I = l3;
        this.N = bl2;
    }

    @Override
    public boolean x(ph_2 ph_22, Object object, Object object2, Object object3) {
        int n10;
        block18: {
            block19: {
                boolean bl;
                block20: {
                    block21: {
                        Object object4;
                        String string;
                        Object object5;
                        block16: {
                            block17: {
                                object5 = this.H(ph_22, object, object3);
                                string = hi_0.C();
                                try {
                                    try {
                                        object4 = object5;
                                        if (string != null) break block16;
                                        if (object4 != null) break block17;
                                    }
                                    catch (hi_0 hi_02) {
                                        throw zV.a(hi_02);
                                    }
                                    return false;
                                }
                                catch (hi_0 hi_03) {
                                    throw zV.a(hi_03);
                                }
                            }
                            object4 = object5;
                        }
                        try {
                            n10 = object4 instanceof Number;
                            if (string != null) break block18;
                            if (n10 == 0) break block19;
                        }
                        catch (hi_0 hi_04) {
                            throw zV.a(hi_04);
                        }
                        long l2 = B8.e((Number)object5);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            long l3 = l2 - this.s;
                                            n10 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                                            if (string != null) break block18;
                                            if (n10 < 0) break block19;
                                        }
                                        catch (hi_0 hi_05) {
                                            throw zV.a(hi_05);
                                        }
                                        long l4 = l2 - this.I;
                                        n10 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                        if (string != null) break block18;
                                    }
                                    catch (hi_0 hi_06) {
                                        throw zV.a(hi_06);
                                    }
                                    if (n10 > 0) break block19;
                                }
                                catch (hi_0 hi_07) {
                                    throw zV.a(hi_07);
                                }
                                bl = this.N;
                                if (string != null) break block20;
                            }
                            catch (hi_0 hi_08) {
                                throw zV.a(hi_08);
                            }
                            if (bl) break block21;
                        }
                        catch (hi_0 hi_09) {
                            throw zV.a(hi_09);
                        }
                        bl = true;
                        break block20;
                    }
                    bl = false;
                }
                return bl;
            }
            n10 = this.N;
        }
        return n10 != 0;
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

