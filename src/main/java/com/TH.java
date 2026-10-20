/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.X4;
import com.ky_2;
import com.yn_2;
import com.zS;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;

public class TH
implements X4 {
    public static final TH S;
    private static final long a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        Object object2;
        boolean bl;
        ky_2[] ky_2Array;
        block9: {
            block10: {
                Object object3;
                Type type2;
                block12: {
                    Type type3;
                    block11: {
                        ky_2Array = zS.p();
                        bl = type instanceof GenericArrayType;
                        if (ky_2Array != null) break block9;
                        if (!bl) break block10;
                        type3 = type2 = ((GenericArrayType)type).getGenericComponentType();
                        if (ky_2Array != null) break block11;
                        if (!(type3 instanceof TypeVariable)) break block12;
                        type3 = type2;
                    }
                    object3 = (TypeVariable)type3;
                    type2 = object3.getBounds()[0];
                }
                object3 = new ArrayList();
                yn_22.p(type2, (Collection)object3);
                Class clazz = B8.P(type2);
                Object[] objectArray = (Object[])Array.newInstance(clazz, object3.size());
                object3.toArray(objectArray);
                return objectArray;
            }
            object2 = type;
            if (ky_2Array != null) return object2;
            bl = object2 instanceof Class;
        }
        if (bl) {
            object2 = type;
            if (ky_2Array != null) return object2;
            if (object2 != Object.class) {
                object2 = type;
                if (ky_2Array != null) return object2;
                if (object2 != Serializable.class) {
                    object2 = type;
                    if (ky_2Array != null) return object2;
                    if (object2 != Cloneable.class) {
                        object2 = type;
                        if (ky_2Array != null) return object2;
                        if (object2 != Closeable.class) {
                            object2 = type;
                            if (ky_2Array != null) return object2;
                            if (object2 != Comparable.class) {
                                return yn_22.o(type);
                            }
                        }
                    }
                }
            }
        }
        object2 = yn_22.F(object);
        return object2;
    }

    @Override
    public int j() {
        return (int)a;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6509822957084724406L;
        a = 0xB2FE7F962BB7CCBAL ^ l2;
        S = new TH();
    }
}

