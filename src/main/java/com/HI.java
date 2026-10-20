/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.HC;
import com.HK;
import com.hi_0;
import com.ky_2;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class HI {
    static ConcurrentMap U;
    protected final Type I;
    public static final Type L;

    protected HI() {
        Type type = this.getClass().getGenericSuperclass();
        Type type2 = ((ParameterizedType)type).getActualTypeArguments()[0];
        Type type3 = (Type)U.get(type2);
        if (type3 == null) {
            U.putIfAbsent(type2, type2);
            type3 = (Type)U.get(type2);
        }
        this.I = type3;
    }

    protected HI(Type[] typeArray) {
        block27: {
            Type type;
            block28: {
                String string = hi_0.C();
                String string2 = string;
                Class<?> clazz = this.getClass();
                Type type2 = clazz.getGenericSuperclass();
                ParameterizedType parameterizedType = (ParameterizedType)((ParameterizedType)type2).getActualTypeArguments()[0];
                Type type3 = parameterizedType.getRawType();
                Type[] typeArray2 = parameterizedType.getActualTypeArguments();
                int n10 = 0;
                for (int i2 = 0; i2 < typeArray2.length; ++i2) {
                    block26: {
                        int n11;
                        Type[] typeArray3;
                        int n12;
                        block24: {
                            block25: {
                                block22: {
                                    block23: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        n12 = typeArray2[i2] instanceof TypeVariable;
                                                        if (string2 != null) break block22;
                                                        if (n12 == 0) break block23;
                                                    }
                                                    catch (hi_0 hi_02) {
                                                        throw HI.a(hi_02);
                                                    }
                                                    n12 = n10;
                                                    if (string2 != null) break block22;
                                                }
                                                catch (hi_0 hi_03) {
                                                    throw HI.a(hi_03);
                                                }
                                                if (n12 >= typeArray.length) break block23;
                                            }
                                            catch (hi_0 hi_04) {
                                                throw HI.a(hi_04);
                                            }
                                            typeArray2[i2] = typeArray[n10++];
                                        }
                                        catch (hi_0 hi_05) {
                                            throw HI.a(hi_05);
                                        }
                                    }
                                    n12 = typeArray2[i2] instanceof GenericArrayType;
                                }
                                try {
                                    try {
                                        if (string2 != null) break block24;
                                        if (n12 == 0) break block25;
                                    }
                                    catch (hi_0 hi_06) {
                                        throw HI.a(hi_06);
                                    }
                                    typeArray2[i2] = B8.A((GenericArrayType)typeArray2[i2]);
                                }
                                catch (hi_0 hi_07) {
                                    throw HI.a(hi_07);
                                }
                            }
                            try {
                                typeArray3 = typeArray2;
                                n11 = i2;
                                if (string2 != null) break block26;
                                n12 = typeArray3[n11] instanceof ParameterizedType;
                            }
                            catch (hi_0 hi_08) {
                                throw HI.a(hi_08);
                            }
                        }
                        try {
                            if (n12 == 0) continue;
                            typeArray3 = typeArray2;
                            n11 = i2;
                        }
                        catch (hi_0 hi_09) {
                            throw HI.a(hi_09);
                        }
                    }
                    typeArray3[n11] = this.s((ParameterizedType)typeArray2[i2], typeArray, n10);
                    if (string2 == null) continue;
                }
                HK hK = new HK(typeArray2, clazz, type3);
                type = (Type)U.get(hK);
                try {
                    if (string2 != null) break block27;
                    if (type != null) break block28;
                }
                catch (hi_0 hi_010) {
                    throw HI.a(hi_010);
                }
                U.putIfAbsent(hK, hK);
                type = (Type)U.get(hK);
            }
            this.I = type;
        }
        try {
            if (ky_2.F() != null) {
                hi_0.F("YwuUi");
            }
        }
        catch (hi_0 hi_011) {
            throw HI.a(hi_011);
        }
    }

    public static Type V(HK hK) {
        Type type;
        block2: {
            Type type2;
            block3: {
                type2 = (Type)U.get(hK);
                String string = hi_0.C();
                try {
                    type = type2;
                    if (string != null) break block2;
                    if (type != null) break block3;
                }
                catch (hi_0 hi_02) {
                    throw HI.a(hi_02);
                }
                U.putIfAbsent(hK, hK);
                type2 = (Type)U.get(hK);
            }
            type = type2;
        }
        return type;
    }

    private Type s(ParameterizedType parameterizedType, Type[] typeArray, int n10) {
        Class<?> clazz = this.getClass();
        Type type = parameterizedType.getRawType();
        Type[] typeArray2 = parameterizedType.getActualTypeArguments();
        String string = hi_0.C();
        for (int i2 = 0; i2 < typeArray2.length; ++i2) {
            block21: {
                int n11;
                Type[] typeArray3;
                int n12;
                block19: {
                    block20: {
                        block17: {
                            block18: {
                                try {
                                    try {
                                        try {
                                            try {
                                                n12 = typeArray2[i2] instanceof TypeVariable;
                                                if (string != null) break block17;
                                                if (n12 == 0) break block18;
                                            }
                                            catch (hi_0 hi_02) {
                                                throw HI.a(hi_02);
                                            }
                                            n12 = n10;
                                            if (string != null) break block17;
                                        }
                                        catch (hi_0 hi_03) {
                                            throw HI.a(hi_03);
                                        }
                                        if (n12 >= typeArray.length) break block18;
                                    }
                                    catch (hi_0 hi_04) {
                                        throw HI.a(hi_04);
                                    }
                                    typeArray2[i2] = typeArray[n10++];
                                }
                                catch (hi_0 hi_05) {
                                    throw HI.a(hi_05);
                                }
                            }
                            n12 = typeArray2[i2] instanceof GenericArrayType;
                        }
                        try {
                            try {
                                if (string != null) break block19;
                                if (n12 == 0) break block20;
                            }
                            catch (hi_0 hi_06) {
                                throw HI.a(hi_06);
                            }
                            typeArray2[i2] = B8.A((GenericArrayType)typeArray2[i2]);
                        }
                        catch (hi_0 hi_07) {
                            throw HI.a(hi_07);
                        }
                    }
                    try {
                        typeArray3 = typeArray2;
                        n11 = i2;
                        if (string != null) break block21;
                        n12 = typeArray3[n11] instanceof ParameterizedType;
                    }
                    catch (hi_0 hi_08) {
                        throw HI.a(hi_08);
                    }
                }
                try {
                    if (n12 == 0) continue;
                    typeArray3 = typeArray2;
                    n11 = i2;
                }
                catch (hi_0 hi_09) {
                    throw HI.a(hi_09);
                }
            }
            typeArray3[n11] = this.s((ParameterizedType)typeArray2[i2], typeArray, n10);
            if (string == null) continue;
        }
        HK hK = new HK(typeArray2, clazz, type);
        return hK;
    }

    public Type O() {
        return this.I;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 390808525397096305L;
        long l3 = 0x9DABD071837CF761L ^ l2;
        U = new ConcurrentHashMap((int)l3, 0.75f, 1);
        L = new HC().O();
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

