/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KE;
import com.N5;
import com.a0;
import com.hi_0;
import com.oc_0;
import com.ph_2;
import com.yn_2;
import java.util.Iterator;

public class LQ
implements a0 {
    private final N5 J;

    public LQ(N5 n52) {
        this.J = n52;
    }

    @Override
    public Object Y(ph_2 ph_22, Object object, Object object2) {
        block20: {
            Object object3;
            block19: {
                boolean bl;
                block16: {
                    String string;
                    block17: {
                        string = hi_0.C();
                        try {
                            if (object2 == null) {
                                return null;
                            }
                        }
                        catch (hi_0 hi_02) {
                            throw LQ.a(hi_02);
                        }
                        oc_0 oc_02 = new oc_0();
                        try {
                            bl = object2 instanceof Iterable;
                            if (string != null) break block16;
                            if (!bl) break block17;
                        }
                        catch (hi_0 hi_03) {
                            throw LQ.a(hi_03);
                        }
                        for (Object t2 : (Iterable)object2) {
                            block18: {
                                try {
                                    boolean bl2;
                                    try {
                                        bl2 = this.J.x(ph_22, object, object2, t2);
                                        if (string != null || !bl2) break block18;
                                    }
                                    catch (hi_0 hi_04) {
                                        throw LQ.a(hi_04);
                                    }
                                    bl2 = oc_02.add(t2);
                                }
                                catch (hi_0 hi_05) {
                                    throw LQ.a(hi_05);
                                }
                            }
                            if (string == null) continue;
                        }
                        return oc_02;
                    }
                    try {
                        object3 = this.J;
                        if (string != null) break block19;
                        bl = object3.x(ph_22, object, object2, object2);
                    }
                    catch (hi_0 hi_06) {
                        throw LQ.a(hi_06);
                    }
                }
                if (!bl) break block20;
                object3 = object2;
            }
            return object3;
        }
        return null;
    }

    @Override
    public void Z(ph_2 ph_22, yn_2 yn_22, KE kE) {
        Object object = yn_22.M();
        kE.t = this.Y(ph_22, object, object);
    }

    public boolean Q(ph_2 ph_22, Object object, Object object2) {
        boolean bl;
        block13: {
            block14: {
                boolean bl2;
                block15: {
                    Object object3;
                    String string;
                    block11: {
                        block12: {
                            string = hi_0.C();
                            try {
                                try {
                                    object3 = object2;
                                    if (string != null) break block11;
                                    if (object3 != null) break block12;
                                }
                                catch (hi_0 hi_02) {
                                    throw LQ.a(hi_02);
                                }
                                return false;
                            }
                            catch (hi_0 hi_03) {
                                throw LQ.a(hi_03);
                            }
                        }
                        object3 = object2;
                    }
                    try {
                        bl = object3 instanceof Iterable;
                        if (string != null) break block13;
                        if (!bl) break block14;
                    }
                    catch (hi_0 hi_04) {
                        throw LQ.a(hi_04);
                    }
                    Iterator iterator = ((Iterable)object2).iterator();
                    while (iterator.hasNext()) {
                        block16: {
                            Object t2 = iterator.next();
                            try {
                                try {
                                    bl2 = this.J.x(ph_22, object, object2, t2);
                                    if (string != null) break block15;
                                    if (!bl2) break block16;
                                }
                                catch (hi_0 hi_05) {
                                    throw LQ.a(hi_05);
                                }
                                iterator.remove();
                            }
                            catch (hi_0 hi_06) {
                                throw LQ.a(hi_06);
                            }
                        }
                        if (string == null) continue;
                    }
                    bl2 = true;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    static N5 w(LQ lQ) {
        return lQ.J;
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

