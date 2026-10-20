/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KE;
import com.a0;
import com.hi_0;
import com.oc_0;
import com.ph_2;
import com.yn_2;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

class zC
implements a0 {
    public static final zC Q = new zC();

    zC() {
    }

    @Override
    public Object Y(ph_2 ph_22, Object object, Object object2) {
        Object object3;
        block7: {
            block8: {
                oc_0 oc_02;
                block9: {
                    String string = hi_0.C();
                    try {
                        object3 = object2;
                        if (string != null) break block7;
                        if (!(object3 instanceof oc_0)) break block8;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw zC.a(unsupportedOperationException);
                    }
                    oc_0 oc_03 = (oc_0)((oc_0)object2).clone();
                    int n10 = 0;
                    while (n10 < oc_03.size()) {
                        block10: {
                            block11: {
                                oc_02 = oc_03;
                                if (string != null) break block9;
                                Object object4 = oc_02.get(n10);
                                Object object5 = zC.g(object4);
                                try {
                                    try {
                                        if (string != null) break block10;
                                        if (object5 == object4) break block11;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw zC.a(unsupportedOperationException);
                                    }
                                    oc_03.set(n10, object5);
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw zC.a(unsupportedOperationException);
                                }
                            }
                            ++n10;
                        }
                        if (string == null) continue;
                    }
                    oc_02 = oc_03;
                }
                return oc_02;
            }
            object3 = zC.g(object2);
        }
        return object3;
    }

    private static Object g(Object object) {
        block44: {
            Object object2;
            block42: {
                boolean bl;
                String string;
                block40: {
                    block41: {
                        block38: {
                            block39: {
                                block36: {
                                    block37: {
                                        Object object3;
                                        block34: {
                                            block35: {
                                                string = hi_0.C();
                                                try {
                                                    try {
                                                        object3 = object;
                                                        if (string != null) break block34;
                                                        if (object3 != null) break block35;
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        throw zC.a(unsupportedOperationException);
                                                    }
                                                    return null;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    throw zC.a(unsupportedOperationException);
                                                }
                                            }
                                            object3 = object;
                                        }
                                        try {
                                            try {
                                                bl = object3 instanceof Float;
                                                if (string != null) break block36;
                                                if (!bl) break block37;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                throw zC.a(unsupportedOperationException);
                                            }
                                            return Math.floor(((Float)object).floatValue());
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw zC.a(unsupportedOperationException);
                                        }
                                    }
                                    bl = object instanceof Double;
                                }
                                try {
                                    try {
                                        if (string != null) break block38;
                                        if (!bl) break block39;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw zC.a(unsupportedOperationException);
                                    }
                                    return Math.floor((Double)object);
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw zC.a(unsupportedOperationException);
                                }
                            }
                            bl = object instanceof BigDecimal;
                        }
                        try {
                            if (string != null) break block40;
                            if (!bl) break block41;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw zC.a(unsupportedOperationException);
                        }
                        BigDecimal bigDecimal = (BigDecimal)object;
                        return bigDecimal.setScale(0, RoundingMode.FLOOR);
                    }
                    try {
                        object2 = object;
                        if (string != null) break block42;
                        bl = object2 instanceof Byte;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw zC.a(unsupportedOperationException);
                    }
                }
                try {
                    block43: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (bl) break block43;
                                                        object2 = object;
                                                        if (string != null) break block42;
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        throw zC.a(unsupportedOperationException);
                                                    }
                                                    if (object2 instanceof Short) break block43;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    throw zC.a(unsupportedOperationException);
                                                }
                                                object2 = object;
                                                if (string != null) break block42;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                throw zC.a(unsupportedOperationException);
                                            }
                                            if (object2 instanceof Integer) break block43;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw zC.a(unsupportedOperationException);
                                        }
                                        object2 = object;
                                        if (string != null) break block42;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw zC.a(unsupportedOperationException);
                                    }
                                    if (object2 instanceof Long) break block43;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw zC.a(unsupportedOperationException);
                                }
                                object2 = object;
                                if (string != null) break block42;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw zC.a(unsupportedOperationException);
                            }
                            if (!(object2 instanceof BigInteger)) break block44;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw zC.a(unsupportedOperationException);
                        }
                    }
                    object2 = object;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw zC.a(unsupportedOperationException);
                }
            }
            return object2;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public void Z(ph_2 ph_22, yn_2 yn_22, KE kE) {
        throw new UnsupportedOperationException();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}

