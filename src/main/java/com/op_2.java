/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O0;
import com.X4;
import com.ak_0;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.nl_1;
import com.nv_2;
import com.ym_1;
import com.yn_2;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/*
 * Renamed from com.op
 */
public class op_2
implements ak_0,
X4 {
    public static op_2 K = new op_2();

    @Override
    public void u(nl_1 nl_12, Object object, Object object2, Type type, int n10) throws IOException {
        block5: {
            Object object3;
            block4: {
                ym_1 ym_12 = nl_12.w;
                String string = nv_2.o();
                try {
                    try {
                        object3 = object;
                        if (string == null) break block4;
                        if (!(object3 instanceof Multimap)) break block5;
                    }
                    catch (IOException iOException) {
                        throw op_2.a(iOException);
                    }
                    object3 = object;
                }
                catch (IOException iOException) {
                    throw op_2.a(iOException);
                }
            }
            Multimap multimap = (Multimap)object3;
            nl_12.B(multimap.asMap());
        }
    }

    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        block6: {
            Type type2 = type;
            String string = nv_2.o();
            Type type3 = type;
            if (string != null) {
                if (type3 instanceof ParameterizedType) {
                    type2 = ((ParameterizedType)type).getRawType();
                }
                type3 = type2;
            }
            if (type3 != ArrayListMultimap.class) break block6;
            ArrayListMultimap arrayListMultimap = ArrayListMultimap.create();
            O0 o0 = yn_22.Q();
            for (Map.Entry entry : o0.entrySet()) {
                block7: {
                    boolean bl;
                    Object v2;
                    block8: {
                        v2 = entry.getValue();
                        bl = v2 instanceof Collection;
                        if (string == null) break block7;
                        if (!bl) break block8;
                        arrayListMultimap.putAll(entry.getKey(), (Iterable)((List)v2));
                        if (string != null) break block7;
                    }
                    bl = arrayListMultimap.put(entry.getKey(), v2);
                }
                if (string != null) continue;
            }
            return arrayListMultimap;
        }
        return null;
    }

    @Override
    public int j() {
        return 0;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

