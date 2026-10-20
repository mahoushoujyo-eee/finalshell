/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.hi_0;
import com.ph_2;
import com.z8;

/*
 * Renamed from com.zu
 */
class zu_0
extends z8 {
    private final Long[] d;
    private final boolean e;

    public zu_0(String string, boolean bl, Long[] longArray, boolean bl2) {
        super(string, bl);
        this.d = longArray;
        this.e = bl2;
    }

    @Override
    public boolean x(ph_2 ph_22, Object object, Object object2, Object object3) {
        boolean bl;
        block30: {
            block31: {
                Object object4;
                String string;
                Object object5;
                block24: {
                    block25: {
                        object5 = this.H(ph_22, object, object3);
                        string = hi_0.C();
                        try {
                            object4 = object5;
                            if (string != null) break block24;
                            if (object4 != null) break block25;
                        }
                        catch (hi_0 hi_02) {
                            throw zu_0.a(hi_02);
                        }
                        Long[] longArray = this.d;
                        int n10 = longArray.length;
                        int n11 = 0;
                        while (n11 < n10) {
                            block26: {
                                block27: {
                                    boolean bl2;
                                    block28: {
                                        block29: {
                                            Long l2 = longArray[n11];
                                            try {
                                                try {
                                                    try {
                                                        if (string != null) break block26;
                                                        if (l2 != null) break block27;
                                                    }
                                                    catch (hi_0 hi_03) {
                                                        throw zu_0.a(hi_03);
                                                    }
                                                    bl2 = this.e;
                                                    if (string != null) break block28;
                                                }
                                                catch (hi_0 hi_04) {
                                                    throw zu_0.a(hi_04);
                                                }
                                                if (bl2) break block29;
                                            }
                                            catch (hi_0 hi_05) {
                                                throw zu_0.a(hi_05);
                                            }
                                            bl2 = true;
                                            break block28;
                                        }
                                        bl2 = false;
                                    }
                                    return bl2;
                                }
                                ++n11;
                            }
                            if (string == null) continue;
                        }
                        return this.e;
                    }
                    object4 = object5;
                }
                try {
                    bl = object4 instanceof Number;
                    if (string != null) break block30;
                    if (!bl) break block31;
                }
                catch (hi_0 hi_06) {
                    throw zu_0.a(hi_06);
                }
                long l3 = B8.e((Number)object5);
                for (Long l4 : this.d) {
                    long l5;
                    block35: {
                        block36: {
                            block34: {
                                Long l6;
                                block32: {
                                    try {
                                        block33: {
                                            try {
                                                try {
                                                    l6 = l4;
                                                    if (string != null) break block32;
                                                    if (l6 != null) break block33;
                                                }
                                                catch (hi_0 hi_07) {
                                                    throw zu_0.a(hi_07);
                                                }
                                                if (string == null) continue;
                                            }
                                            catch (hi_0 hi_08) {
                                                throw zu_0.a(hi_08);
                                            }
                                        }
                                        l6 = l4;
                                    }
                                    catch (hi_0 hi_09) {
                                        throw zu_0.a(hi_09);
                                    }
                                }
                                try {
                                    try {
                                        long l7 = l6 - l3;
                                        l5 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                        if (string != null) break block34;
                                        if (l5 != false) continue;
                                    }
                                    catch (hi_0 hi_010) {
                                        throw zu_0.a(hi_010);
                                    }
                                    l5 = (long)this.e;
                                }
                                catch (hi_0 hi_011) {
                                    throw zu_0.a(hi_011);
                                }
                            }
                            try {
                                if (string != null) break block35;
                                if (l5 != false) break block36;
                            }
                            catch (hi_0 hi_012) {
                                throw zu_0.a(hi_012);
                            }
                            l5 = 1;
                            break block35;
                        }
                        l5 = 0;
                    }
                    return (boolean)l5;
                }
            }
            bl = this.e;
        }
        return bl;
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

