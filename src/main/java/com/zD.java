/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.hi_0;
import com.ph_2;
import com.z8;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class zD
extends z8 {
    private final Pattern O;
    private final boolean K;

    public zD(String string, boolean bl, String string2, boolean bl2) {
        super(string, bl);
        this.O = Pattern.compile(string2);
        this.K = bl2;
    }

    @Override
    public boolean x(ph_2 ph_22, Object object, Object object2, Object object3) {
        boolean bl;
        block12: {
            boolean bl2;
            block13: {
                boolean bl3;
                block14: {
                    block15: {
                        Object object4;
                        String string;
                        block10: {
                            Object object5;
                            block11: {
                                object5 = this.H(ph_22, object, object3);
                                string = hi_0.C();
                                try {
                                    try {
                                        object4 = object5;
                                        if (string != null) break block10;
                                        if (object4 != null) break block11;
                                    }
                                    catch (hi_0 hi_02) {
                                        throw zD.a(hi_02);
                                    }
                                    return false;
                                }
                                catch (hi_0 hi_03) {
                                    throw zD.a(hi_03);
                                }
                            }
                            object4 = object5;
                        }
                        String string2 = object4.toString();
                        Matcher matcher = this.O.matcher(string2);
                        bl2 = matcher.matches();
                        try {
                            try {
                                try {
                                    bl = this.K;
                                    if (string != null) break block12;
                                    if (!bl) break block13;
                                }
                                catch (hi_0 hi_04) {
                                    throw zD.a(hi_04);
                                }
                                bl3 = bl2;
                                if (string != null) break block14;
                            }
                            catch (hi_0 hi_05) {
                                throw zD.a(hi_05);
                            }
                            if (bl3) break block15;
                        }
                        catch (hi_0 hi_06) {
                            throw zD.a(hi_06);
                        }
                        bl3 = true;
                        break block14;
                    }
                    bl3 = false;
                }
                bl2 = bl3;
            }
            bl = bl2;
        }
        return bl;
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

