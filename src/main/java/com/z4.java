/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hi_0;
import com.ph_2;
import com.z8;

class z4
extends z8 {
    private final String c;
    private final String A;
    private final String[] E;
    private final int q;
    private final boolean e;

    public z4(String string, boolean bl, String string2, String string3, String[] stringArray, boolean bl2) {
        block13: {
            int n10;
            block12: {
                String[] stringArray2;
                String string4;
                block11: {
                    String string5;
                    block9: {
                        block10: {
                            String string6 = hi_0.C();
                            super(string, bl);
                            string4 = string6;
                            this.c = string2;
                            this.A = string3;
                            this.E = stringArray;
                            this.e = bl2;
                            n10 = 0;
                            try {
                                string5 = string2;
                                if (string4 != null) break block9;
                                if (string5 == null) break block10;
                            }
                            catch (hi_0 hi_02) {
                                throw z4.a(hi_02);
                            }
                            n10 += string2.length();
                        }
                        string5 = string3;
                    }
                    if (string5 != null) {
                        n10 += string3.length();
                    }
                    try {
                        stringArray2 = stringArray;
                        if (string4 != null) break block11;
                        if (stringArray2 == null) break block12;
                    }
                    catch (hi_0 hi_03) {
                        throw z4.a(hi_03);
                    }
                    stringArray2 = stringArray;
                }
                for (String string7 : stringArray2) {
                    n10 += string7.length();
                    try {
                        if (string4 == null) {
                            if (string4 == null) continue;
                            break;
                        }
                        break block13;
                    }
                    catch (hi_0 hi_04) {
                        throw z4.a(hi_04);
                    }
                }
            }
            this.q = n10;
        }
    }

    @Override
    public boolean x(ph_2 ph_22, Object object, Object object2, Object object3) {
        int n10;
        block50: {
            block51: {
                String string;
                block45: {
                    z4 z42;
                    block48: {
                        block49: {
                            String string2;
                            block43: {
                                block44: {
                                    int n11;
                                    block39: {
                                        block40: {
                                            int n12;
                                            block41: {
                                                block42: {
                                                    int n13;
                                                    block37: {
                                                        block38: {
                                                            Object object4;
                                                            block35: {
                                                                Object object5;
                                                                block36: {
                                                                    object5 = this.H(ph_22, object, object3);
                                                                    string = hi_0.C();
                                                                    try {
                                                                        try {
                                                                            object4 = object5;
                                                                            if (string != null) break block35;
                                                                            if (object4 != null) break block36;
                                                                        }
                                                                        catch (hi_0 hi_02) {
                                                                            throw z4.a(hi_02);
                                                                        }
                                                                        return false;
                                                                    }
                                                                    catch (hi_0 hi_03) {
                                                                        throw z4.a(hi_03);
                                                                    }
                                                                }
                                                                object4 = object5;
                                                            }
                                                            string2 = object4.toString();
                                                            try {
                                                                try {
                                                                    n13 = string2.length();
                                                                    if (string != null) break block37;
                                                                    if (n13 >= this.q) break block38;
                                                                }
                                                                catch (hi_0 hi_04) {
                                                                    throw z4.a(hi_04);
                                                                }
                                                                return this.e;
                                                            }
                                                            catch (hi_0 hi_05) {
                                                                throw z4.a(hi_05);
                                                            }
                                                        }
                                                        n13 = 0;
                                                    }
                                                    n11 = n13;
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    z42 = this;
                                                                    if (string != null) break block39;
                                                                    if (z42.c == null) break block40;
                                                                }
                                                                catch (hi_0 hi_06) {
                                                                    throw z4.a(hi_06);
                                                                }
                                                                n12 = string2.startsWith(this.c);
                                                                if (string != null) break block41;
                                                            }
                                                            catch (hi_0 hi_07) {
                                                                throw z4.a(hi_07);
                                                            }
                                                            if (n12 != 0) break block42;
                                                        }
                                                        catch (hi_0 hi_08) {
                                                            throw z4.a(hi_08);
                                                        }
                                                        return this.e;
                                                    }
                                                    catch (hi_0 hi_09) {
                                                        throw z4.a(hi_09);
                                                    }
                                                }
                                                n12 = n11 + this.c.length();
                                            }
                                            n11 = n12;
                                        }
                                        z42 = this;
                                    }
                                    try {
                                        if (string != null) break block43;
                                        if (z42.E == null) break block44;
                                    }
                                    catch (hi_0 hi_010) {
                                        throw z4.a(hi_010);
                                    }
                                    for (String string3 : this.E) {
                                        int n14;
                                        int n15;
                                        block46: {
                                            int n16;
                                            block47: {
                                                n16 = string2.indexOf(string3, n11);
                                                try {
                                                    try {
                                                        try {
                                                            n10 = n16;
                                                            if (string != null) break block45;
                                                            n15 = -1;
                                                            if (string != null) break block46;
                                                        }
                                                        catch (hi_0 hi_011) {
                                                            throw z4.a(hi_011);
                                                        }
                                                        if (n10 != n15) break block47;
                                                    }
                                                    catch (hi_0 hi_012) {
                                                        throw z4.a(hi_012);
                                                    }
                                                    return this.e;
                                                }
                                                catch (hi_0 hi_013) {
                                                    throw z4.a(hi_013);
                                                }
                                            }
                                            int n15 = n16;
                                            n15 = string3.length();
                                        }
                                        n11 = n14 + n15;
                                        if (string == null) continue;
                                    }
                                }
                                z42 = this;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (string != null) break block48;
                                            if (z42.A == null) break block49;
                                        }
                                        catch (hi_0 hi_014) {
                                            throw z4.a(hi_014);
                                        }
                                        n10 = string2.endsWith(this.A);
                                        if (string != null) break block45;
                                    }
                                    catch (hi_0 hi_015) {
                                        throw z4.a(hi_015);
                                    }
                                    if (n10 != 0) break block49;
                                }
                                catch (hi_0 hi_016) {
                                    throw z4.a(hi_016);
                                }
                                return this.e;
                            }
                            catch (hi_0 hi_017) {
                                throw z4.a(hi_017);
                            }
                        }
                        z42 = this;
                    }
                    n10 = z42.e;
                }
                try {
                    if (string != null) break block50;
                    if (n10 != 0) break block51;
                }
                catch (hi_0 hi_018) {
                    throw z4.a(hi_018);
                }
                n10 = 1;
                break block50;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

