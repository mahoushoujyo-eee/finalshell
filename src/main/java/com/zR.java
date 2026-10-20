/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hi_0;
import com.ph_2;
import com.z8;

class zR
extends z8 {
    private final String[] E;
    private final boolean e;

    public zR(String string, boolean bl, String[] stringArray, boolean bl2) {
        super(string, bl);
        this.E = stringArray;
        this.e = bl2;
    }

    @Override
    public boolean x(ph_2 ph_22, Object object, Object object2, Object object3) {
        Object object4 = this.H(ph_22, object, object3);
        String string = hi_0.C();
        for (String string2 : this.E) {
            boolean bl;
            block21: {
                block22: {
                    block20: {
                        String string3;
                        block19: {
                            block15: {
                                block16: {
                                    boolean bl2;
                                    block17: {
                                        block18: {
                                            try {
                                                try {
                                                    try {
                                                        string3 = string2;
                                                        if (string != null) break block15;
                                                        if (string3 != object4) break block16;
                                                    }
                                                    catch (hi_0 hi_02) {
                                                        throw zR.a(hi_02);
                                                    }
                                                    bl2 = this.e;
                                                    if (string != null) break block17;
                                                }
                                                catch (hi_0 hi_03) {
                                                    throw zR.a(hi_03);
                                                }
                                                if (bl2) break block18;
                                            }
                                            catch (hi_0 hi_04) {
                                                throw zR.a(hi_04);
                                            }
                                            bl2 = true;
                                            break block17;
                                        }
                                        bl2 = false;
                                    }
                                    return bl2;
                                }
                                string3 = string2;
                            }
                            try {
                                if (string != null) break block19;
                                if (string3 == null) continue;
                            }
                            catch (hi_0 hi_05) {
                                throw zR.a(hi_05);
                            }
                            string3 = string2;
                        }
                        try {
                            try {
                                bl = string3.equals(object4);
                                if (string != null) break block20;
                                if (!bl) continue;
                            }
                            catch (hi_0 hi_06) {
                                throw zR.a(hi_06);
                            }
                            bl = this.e;
                        }
                        catch (hi_0 hi_07) {
                            throw zR.a(hi_07);
                        }
                    }
                    try {
                        if (string != null) break block21;
                        if (bl) break block22;
                    }
                    catch (hi_0 hi_08) {
                        throw zR.a(hi_08);
                    }
                    bl = true;
                    break block21;
                }
                bl = false;
            }
            return bl;
        }
        return this.e;
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

