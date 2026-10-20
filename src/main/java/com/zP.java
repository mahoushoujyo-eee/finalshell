/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.S6;
import com.hi_0;
import com.ph_2;
import com.z8;

class zP
extends z8 {
    private final String A;
    private final S6 l;

    public zP(String string, boolean bl, String string2, S6 s6) {
        super(string, bl);
        this.A = string2;
        this.l = s6;
    }

    @Override
    public boolean x(ph_2 ph_22, Object object, Object object2, Object object3) {
        block53: {
            boolean bl;
            block54: {
                block55: {
                    S6 s6;
                    S6 s62;
                    boolean bl2;
                    String string;
                    block49: {
                        block50: {
                            boolean bl3;
                            block51: {
                                block52: {
                                    block45: {
                                        block46: {
                                            boolean bl4;
                                            block47: {
                                                block48: {
                                                    block41: {
                                                        block42: {
                                                            boolean bl5;
                                                            block43: {
                                                                block44: {
                                                                    Object object4;
                                                                    Object object5;
                                                                    block37: {
                                                                        block38: {
                                                                            boolean bl6;
                                                                            block39: {
                                                                                block40: {
                                                                                    S6 s63;
                                                                                    block35: {
                                                                                        block36: {
                                                                                            object5 = this.H(ph_22, object, object3);
                                                                                            string = hi_0.C();
                                                                                            try {
                                                                                                try {
                                                                                                    object4 = this.l;
                                                                                                    s63 = S6.EQ;
                                                                                                    if (string != null) break block35;
                                                                                                    if (object4 != s63) break block36;
                                                                                                }
                                                                                                catch (hi_0 hi_02) {
                                                                                                    throw zP.a(hi_02);
                                                                                                }
                                                                                                return this.A.equals(object5);
                                                                                            }
                                                                                            catch (hi_0 hi_03) {
                                                                                                throw zP.a(hi_03);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            object4 = this.l;
                                                                                            if (string != null) break block37;
                                                                                            s63 = S6.NE;
                                                                                        }
                                                                                        catch (hi_0 hi_04) {
                                                                                            throw zP.a(hi_04);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (object4 != s63) break block38;
                                                                                            bl6 = this.A.equals(object5);
                                                                                            if (string != null) break block39;
                                                                                        }
                                                                                        catch (hi_0 hi_05) {
                                                                                            throw zP.a(hi_05);
                                                                                        }
                                                                                        if (bl6) break block40;
                                                                                    }
                                                                                    catch (hi_0 hi_06) {
                                                                                        throw zP.a(hi_06);
                                                                                    }
                                                                                    bl6 = true;
                                                                                    break block39;
                                                                                }
                                                                                bl6 = false;
                                                                            }
                                                                            return bl6;
                                                                        }
                                                                        object4 = object5;
                                                                    }
                                                                    try {
                                                                        if (object4 == null) {
                                                                            return false;
                                                                        }
                                                                    }
                                                                    catch (hi_0 hi_07) {
                                                                        throw zP.a(hi_07);
                                                                    }
                                                                    bl2 = this.A.compareTo(object5.toString());
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                s62 = this.l;
                                                                                s6 = S6.GE;
                                                                                if (string != null) break block41;
                                                                                if (s62 != s6) break block42;
                                                                            }
                                                                            catch (hi_0 hi_08) {
                                                                                throw zP.a(hi_08);
                                                                            }
                                                                            bl5 = bl2;
                                                                            if (string != null) break block43;
                                                                        }
                                                                        catch (hi_0 hi_09) {
                                                                            throw zP.a(hi_09);
                                                                        }
                                                                        if (bl5 > false) break block44;
                                                                    }
                                                                    catch (hi_0 hi_010) {
                                                                        throw zP.a(hi_010);
                                                                    }
                                                                    bl5 = true;
                                                                    break block43;
                                                                }
                                                                bl5 = false;
                                                            }
                                                            return bl5;
                                                        }
                                                        s62 = this.l;
                                                        s6 = S6.GT;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if (string != null) break block45;
                                                                if (s62 != s6) break block46;
                                                            }
                                                            catch (hi_0 hi_011) {
                                                                throw zP.a(hi_011);
                                                            }
                                                            bl4 = bl2;
                                                            if (string != null) break block47;
                                                        }
                                                        catch (hi_0 hi_012) {
                                                            throw zP.a(hi_012);
                                                        }
                                                        if (bl4 >= false) break block48;
                                                    }
                                                    catch (hi_0 hi_013) {
                                                        throw zP.a(hi_013);
                                                    }
                                                    bl4 = true;
                                                    break block47;
                                                }
                                                bl4 = false;
                                            }
                                            return bl4;
                                        }
                                        s62 = this.l;
                                        s6 = S6.LE;
                                    }
                                    try {
                                        try {
                                            try {
                                                if (string != null) break block49;
                                                if (s62 != s6) break block50;
                                            }
                                            catch (hi_0 hi_014) {
                                                throw zP.a(hi_014);
                                            }
                                            bl3 = bl2;
                                            if (string != null) break block51;
                                        }
                                        catch (hi_0 hi_015) {
                                            throw zP.a(hi_015);
                                        }
                                        if (bl3 < false) break block52;
                                    }
                                    catch (hi_0 hi_016) {
                                        throw zP.a(hi_016);
                                    }
                                    bl3 = true;
                                    break block51;
                                }
                                bl3 = false;
                            }
                            return bl3;
                        }
                        s62 = this.l;
                        s6 = S6.LT;
                    }
                    try {
                        try {
                            if (s62 != s6) break block53;
                            bl = bl2;
                            if (string != null) break block54;
                        }
                        catch (hi_0 hi_017) {
                            throw zP.a(hi_017);
                        }
                        if (bl <= false) break block55;
                    }
                    catch (hi_0 hi_018) {
                        throw zP.a(hi_018);
                    }
                    bl = true;
                    break block54;
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

