/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.N5;
import com.hi_0;
import com.ph_2;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from com.ka
 */
class ka_2
implements N5 {
    private boolean V;
    private List c = new ArrayList(2);

    public ka_2(N5 n52, N5 n53, boolean bl) {
        this.c.add(n52);
        this.c.add(n53);
        this.V = bl;
    }

    @Override
    public boolean x(ph_2 ph_22, Object object, Object object2, Object object3) {
        boolean bl;
        block17: {
            ka_2 ka_22;
            String string;
            block12: {
                block13: {
                    boolean bl2;
                    block14: {
                        string = hi_0.C();
                        try {
                            ka_22 = this;
                            if (string != null) break block12;
                            if (!ka_22.V) break block13;
                        }
                        catch (hi_0 hi_02) {
                            throw ka_2.a(hi_02);
                        }
                        for (N5 n52 : this.c) {
                            block16: {
                                boolean bl3;
                                block15: {
                                    try {
                                        try {
                                            bl2 = n52.x(ph_22, object, object2, object3);
                                            if (string != null) break block14;
                                            if (string != null) break block15;
                                        }
                                        catch (hi_0 hi_03) {
                                            throw ka_2.a(hi_03);
                                        }
                                        if (bl2) break block16;
                                    }
                                    catch (hi_0 hi_04) {
                                        throw ka_2.a(hi_04);
                                    }
                                    bl3 = false;
                                }
                                return bl3;
                            }
                            if (string == null) continue;
                        }
                        bl2 = true;
                    }
                    return bl2;
                }
                ka_22 = this;
            }
            for (N5 n53 : ka_22.c) {
                block19: {
                    boolean bl4;
                    block18: {
                        try {
                            try {
                                bl = n53.x(ph_22, object, object2, object3);
                                if (string != null) break block17;
                                if (string != null) break block18;
                            }
                            catch (hi_0 hi_05) {
                                throw ka_2.a(hi_05);
                            }
                            if (!bl) break block19;
                        }
                        catch (hi_0 hi_06) {
                            throw ka_2.a(hi_06);
                        }
                        bl4 = true;
                    }
                    return bl4;
                }
                if (string == null) continue;
            }
            bl = false;
        }
        return bl;
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

