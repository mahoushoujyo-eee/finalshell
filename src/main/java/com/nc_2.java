/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FV;
import com.FZ;
import com.iz_0;
import com.xq_2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Renamed from com.nc
 */
public final class nc_2 {
    private static final String a;

    public static List Q(xq_2 xq_22) {
        Object object;
        block5: {
            Object object22;
            ArrayList arrayList = new ArrayList();
            String string = FV.D();
            HashMap hashMap = new HashMap();
            for (Object object22 : xq_22.f()) {
                nc_2.R(object22, arrayList, hashMap, xq_22);
                if (string == null) continue;
            }
            List list = nc_2.I(arrayList);
            object22 = new ArrayList(list.size());
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                iz_0 iz_02 = (iz_0)iterator.next();
                try {
                    object = object22;
                    if (string == null) {
                        object.add((Object)iz_02.P());
                        if (string == null) continue;
                        break;
                    }
                    break block5;
                }
                catch (RuntimeException runtimeException) {
                    throw nc_2.a(runtimeException);
                }
            }
            object = object22;
        }
        return object;
    }

    private static iz_0 R(Object object, List list, Map map, xq_2 xq_22) {
        iz_0 iz_02;
        block11: {
            iz_0 iz_03;
            block12: {
                String string;
                block10: {
                    Object object2;
                    Map map2;
                    block9: {
                        string = FV.D();
                        try {
                            try {
                                map2 = map;
                                object2 = object;
                                if (string != null) break block9;
                                if (!map2.containsKey(object2)) break block10;
                            }
                            catch (RuntimeException runtimeException) {
                                throw nc_2.a(runtimeException);
                            }
                            map2 = map;
                            object2 = object;
                        }
                        catch (RuntimeException runtimeException) {
                            throw nc_2.a(runtimeException);
                        }
                    }
                    iz_03 = (iz_0)map2.get(object2);
                    if (string == null) break block12;
                }
                iz_03 = new iz_0(object);
                list.add(iz_03);
                map.put(object, iz_03);
                for (Object e2 : xq_22.i(object)) {
                    try {
                        iz_02 = iz_03.F(nc_2.R(e2, list, map, xq_22));
                        if (string == null) {
                            if (string == null) continue;
                            break;
                        }
                        break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw nc_2.a(runtimeException);
                    }
                }
            }
            iz_02 = iz_03;
        }
        return iz_02;
    }

    /*
     * Unable to fully structure code
     */
    public static List I(List var0) {
        block29: {
            block27: {
                var2_1 = new ArrayList<Object>();
                var3_2 = new HashSet<Object>();
                var1_3 = FV.D();
                for (Iterator<E> var5_6 : var0) {
                    block26: {
                        try {
                            try {
                                try {
                                    v0 = var5_6.f.size();
                                    if (var1_3 == null) {
                                        if (var1_3 != null) break block26;
                                    }
                                    ** GOTO lbl27
                                }
                                catch (RuntimeException v1) {
                                    throw nc_2.a(v1);
                                }
                                if (v0 != 0) break block26;
                            }
                            catch (RuntimeException v2) {
                                throw nc_2.a(v2);
                            }
                            var3_2.add(var5_6);
                        }
                        catch (RuntimeException v3) {
                            throw nc_2.a(v3);
                        }
                    }
                    if (var1_3 == null) continue;
                }
                block19: while (true) {
                    v0 = var3_2.isEmpty();
                    block20: while (v0 == 0) {
                        var4_4 = (iz_0)var3_2.iterator().next();
                        var3_2.remove(var4_4);
                        v4 = var2_1.add(var4_4);
                        if (var1_3 != null) break block27;
                        var5_6 = var4_4.D.iterator();
                        while (var5_6.hasNext()) {
                            block28: {
                                var6_7 = (FZ)var5_6.next();
                                var7_8 = var6_7.l;
                                var5_6.remove();
                                var7_8.f.remove(var6_7);
                                v0 = (int)var7_8.f.isEmpty();
                                if (var1_3 != null) continue block20;
                                try {
                                    try {
                                        if (var1_3 != null || v0 == 0) break block28;
                                    }
                                    catch (RuntimeException v5) {
                                        throw nc_2.a(v5);
                                    }
                                    var3_2.add(var7_8);
                                }
                                catch (RuntimeException v6) {
                                    throw nc_2.a(v6);
                                }
                            }
                            if (var1_3 == null) continue;
                        }
                        if (var1_3 == null) continue block19;
                    }
                    break;
                }
                v4 = false;
            }
            var4_5 = v4;
            for (Object var6_7 : var0) {
                block30: {
                    try {
                        try {
                            v7 = var6_7.f.isEmpty();
                            if (var1_3 != null) break block29;
                            if (var1_3 != null) break block30;
                        }
                        catch (RuntimeException v8) {
                            throw nc_2.a(v8);
                        }
                        if (!v7) {
                        }
                        ** GOTO lbl77
                    }
                    catch (RuntimeException v9) {
                        throw nc_2.a(v9);
                    }
                    v10 = true;
                }
                var4_5 = v10;
                try {
                    if (var1_3 == null) break;
lbl77:
                    // 2 sources

                    if (var1_3 == null) continue;
                    break;
                }
                catch (RuntimeException v11) {
                    throw nc_2.a(v11);
                }
            }
            v7 = var4_5;
        }
        try {
            if (!v7) {
                return var2_1;
            }
        }
        catch (RuntimeException v12) {
            throw nc_2.a(v12);
        }
        throw new RuntimeException(nc_2.a);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "u{XodouDgHfo;)\u0016vTsn#jQkXbmovYpO#o q\u0016rTpr&gZg".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 117;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 67;
                            break;
                        }
                        case 1: {
                            n17 = 119;
                            break;
                        }
                        case 2: {
                            n17 = 78;
                            break;
                        }
                        case 3: {
                            n17 = 118;
                            break;
                        }
                        case 4: {
                            n17 = 116;
                            break;
                        }
                        case 5: {
                            n17 = 58;
                            break;
                        }
                        default: {
                            n17 = 112;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

