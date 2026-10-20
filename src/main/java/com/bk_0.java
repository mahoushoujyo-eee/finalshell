/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.X4;
import com.ak_0;
import com.nl_1;
import com.nv_2;
import com.yn_2;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from com.Bk
 */
public class bk_0
implements ak_0,
X4 {
    public static final bk_0 G;
    private static final long a;

    /*
     * Unable to fully structure code
     */
    @Override
    public void u(nl_1 var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) throws IOException {
        block6: {
            block5: {
                var6_6 = nv_2.o();
                try {
                    v0 = var2_2;
                    if (var6_6 == null) break block5;
                    if (v0 instanceof AtomicReference) {
                    }
                    ** GOTO lbl14
                }
                catch (IOException v1) {
                    throw bk_0.a(v1);
                }
                var8_7 = (AtomicReference)var2_2;
                var7_8 = var8_7.get();
                try {
                    if (var6_6 != null) break block6;
lbl14:
                    // 2 sources

                    v0 = ((Reference)var2_2).get();
                }
                catch (IOException v2) {
                    throw bk_0.a(v2);
                }
            }
            var7_8 = v0;
        }
        var1_1.B(var7_8);
    }

    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        Class clazz;
        Type type2;
        Type type3;
        Object object2;
        block13: {
            block14: {
                String string;
                block11: {
                    block12: {
                        ParameterizedType parameterizedType = (ParameterizedType)type;
                        string = nv_2.o();
                        Type type4 = parameterizedType.getActualTypeArguments()[0];
                        object2 = yn_22.o(type4);
                        type3 = parameterizedType.getRawType();
                        try {
                            try {
                                type2 = type3;
                                clazz = AtomicReference.class;
                                if (string == null) break block11;
                                if (type2 != clazz) break block12;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw bk_0.a(unsupportedOperationException);
                            }
                            return new AtomicReference<Object>(object2);
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw bk_0.a(unsupportedOperationException);
                        }
                    }
                    type2 = type3;
                    clazz = WeakReference.class;
                }
                try {
                    try {
                        if (string == null) break block13;
                        if (type2 != clazz) break block14;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw bk_0.a(unsupportedOperationException);
                    }
                    return new WeakReference<Object>(object2);
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw bk_0.a(unsupportedOperationException);
                }
            }
            type2 = type3;
            clazz = SoftReference.class;
        }
        try {
            if (type2 == clazz) {
                return new SoftReference<Object>(object2);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw bk_0.a(unsupportedOperationException);
        }
        throw new UnsupportedOperationException(type3.toString());
    }

    @Override
    public int j() {
        return (int)a;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5052890908347983415L;
        a = 0x69FE99BE80E1E63BL ^ l2;
        G = new bk_0();
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

