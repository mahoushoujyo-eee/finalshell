/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.X4;
import com.ak_0;
import com.hi_0;
import com.ky_2;
import com.nl_1;
import com.yn_2;
import com.zS;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/*
 * Renamed from com.wi
 */
public class wi_2
implements ak_0,
X4 {
    public static wi_2 l;
    private static final String a;
    private static final long b;

    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        Type type2;
        block34: {
            Type type3;
            block35: {
                Object object2;
                ky_2[] ky_2Array;
                block31: {
                    Class clazz;
                    block27: {
                        block28: {
                            Long l2;
                            block29: {
                                Long l3;
                                block30: {
                                    block23: {
                                        block24: {
                                            Integer n10;
                                            block25: {
                                                Integer n11;
                                                block26: {
                                                    ky_2Array = zS.p();
                                                    try {
                                                        object2 = type;
                                                        clazz = OptionalInt.class;
                                                        if (ky_2Array != null) break block23;
                                                        if (object2 != clazz) break block24;
                                                    }
                                                    catch (hi_0 hi_02) {
                                                        throw wi_2.a(hi_02);
                                                    }
                                                    Object object3 = yn_22.M(Integer.class);
                                                    n11 = B8.Y(object3);
                                                    try {
                                                        try {
                                                            n10 = n11;
                                                            if (ky_2Array != null) break block25;
                                                            if (n10 != null) break block26;
                                                        }
                                                        catch (hi_0 hi_03) {
                                                            throw wi_2.a(hi_03);
                                                        }
                                                        return OptionalInt.empty();
                                                    }
                                                    catch (hi_0 hi_04) {
                                                        throw wi_2.a(hi_04);
                                                    }
                                                }
                                                n10 = n11;
                                            }
                                            return OptionalInt.of(n10);
                                        }
                                        object2 = type;
                                        clazz = OptionalLong.class;
                                    }
                                    try {
                                        if (ky_2Array != null) break block27;
                                        if (object2 != clazz) break block28;
                                    }
                                    catch (hi_0 hi_05) {
                                        throw wi_2.a(hi_05);
                                    }
                                    Object object4 = yn_22.M(Long.class);
                                    l3 = B8.s(object4);
                                    try {
                                        try {
                                            l2 = l3;
                                            if (ky_2Array != null) break block29;
                                            if (l2 != null) break block30;
                                        }
                                        catch (hi_0 hi_06) {
                                            throw wi_2.a(hi_06);
                                        }
                                        return OptionalLong.empty();
                                    }
                                    catch (hi_0 hi_07) {
                                        throw wi_2.a(hi_07);
                                    }
                                }
                                l2 = l3;
                            }
                            return OptionalLong.of(l2);
                        }
                        try {
                            object2 = type;
                            if (ky_2Array != null) break block31;
                            clazz = OptionalDouble.class;
                        }
                        catch (hi_0 hi_08) {
                            throw wi_2.a(hi_08);
                        }
                    }
                    if (object2 == clazz) {
                        Double d2;
                        block32: {
                            Double d3;
                            block33: {
                                Object object5 = yn_22.M(Double.class);
                                d3 = B8.Z(object5);
                                try {
                                    try {
                                        d2 = d3;
                                        if (ky_2Array != null) break block32;
                                        if (d2 != null) break block33;
                                    }
                                    catch (hi_0 hi_09) {
                                        throw wi_2.a(hi_09);
                                    }
                                    return OptionalDouble.empty();
                                }
                                catch (hi_0 hi_010) {
                                    throw wi_2.a(hi_010);
                                }
                            }
                            d2 = d3;
                        }
                        return OptionalDouble.of(d2);
                    }
                    type = B8.u(type);
                    object2 = yn_22.o(type);
                }
                type3 = object2;
                try {
                    try {
                        type2 = type3;
                        if (ky_2Array != null) break block34;
                        if (type2 != null) break block35;
                    }
                    catch (hi_0 hi_011) {
                        throw wi_2.a(hi_011);
                    }
                    return Optional.empty();
                }
                catch (hi_0 hi_012) {
                    throw wi_2.a(hi_012);
                }
            }
            type2 = type3;
        }
        return Optional.of(type2);
    }

    @Override
    public int j() {
        return (int)b;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void u(nl_1 var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) throws IOException {
        block57: {
            block56: {
                block55: {
                    block54: {
                        block50: {
                            block51: {
                                block53: {
                                    block52: {
                                        block46: {
                                            block47: {
                                                block49: {
                                                    block48: {
                                                        block42: {
                                                            block43: {
                                                                block44: {
                                                                    block45: {
                                                                        block40: {
                                                                            block41: {
                                                                                var6_6 = zS.p();
                                                                                try {
                                                                                    try {
                                                                                        v0 = var2_2;
                                                                                        if (var6_6 != null) break block40;
                                                                                        if (v0 != null) break block41;
                                                                                    }
                                                                                    catch (IOException v1) {
                                                                                        throw wi_2.a(v1);
                                                                                    }
                                                                                    var1_1.e();
                                                                                    return;
                                                                                }
                                                                                catch (IOException v2) {
                                                                                    throw wi_2.a(v2);
                                                                                }
                                                                            }
                                                                            v0 = var2_2;
                                                                        }
                                                                        try {
                                                                            v3 = v0 instanceof Optional;
                                                                            if (var6_6 != null) break block42;
                                                                            if (!v3) break block43;
                                                                        }
                                                                        catch (IOException v4) {
                                                                            throw wi_2.a(v4);
                                                                        }
                                                                        var7_7 = (Optional)var2_2;
                                                                        try {
                                                                            try {
                                                                                v5 /* !! */  = var7_7;
                                                                                if (var6_6 != null) break block44;
                                                                                if (!v5 /* !! */ .isPresent()) break block45;
                                                                            }
                                                                            catch (IOException v6) {
                                                                                throw wi_2.a(v6);
                                                                            }
                                                                            v5 /* !! */  = var7_7.get();
                                                                            break block44;
                                                                        }
                                                                        catch (IOException v7) {
                                                                            throw wi_2.a(v7);
                                                                        }
                                                                    }
                                                                    v5 /* !! */  = null;
                                                                }
                                                                var8_11 = v5 /* !! */ ;
                                                                var1_1.B(var8_11);
                                                                return;
                                                            }
                                                            v3 = var2_2 instanceof OptionalDouble;
                                                        }
                                                        try {
                                                            if (var6_6 != null) break block46;
                                                            if (!v3) break block47;
                                                        }
                                                        catch (IOException v8) {
                                                            throw wi_2.a(v8);
                                                        }
                                                        var7_8 = (OptionalDouble)var2_2;
                                                        try {
                                                            try {
                                                                v9 = var7_8;
                                                                if (var6_6 != null) break block48;
                                                                if (v9.isPresent()) {
                                                                }
                                                                ** GOTO lbl71
                                                            }
                                                            catch (IOException v10) {
                                                                throw wi_2.a(v10);
                                                            }
                                                            v9 = var7_8;
                                                        }
                                                        catch (IOException v11) {
                                                            throw wi_2.a(v11);
                                                        }
                                                    }
                                                    var8_12 = v9.getAsDouble();
                                                    try {
                                                        var1_1.B(var8_12);
                                                        if (var6_6 == null) break block49;
lbl71:
                                                        // 2 sources

                                                        var1_1.e();
                                                    }
                                                    catch (IOException v12) {
                                                        throw wi_2.a(v12);
                                                    }
                                                }
                                                return;
                                            }
                                            v3 = var2_2 instanceof OptionalInt;
                                        }
                                        try {
                                            if (var6_6 != null) break block50;
                                            if (!v3) break block51;
                                        }
                                        catch (IOException v13) {
                                            throw wi_2.a(v13);
                                        }
                                        var7_9 = (OptionalInt)var2_2;
                                        try {
                                            try {
                                                v14 = var7_9.isPresent();
                                                if (var6_6 != null) break block52;
                                                if (v14 != 0) {
                                                }
                                                ** GOTO lbl105
                                            }
                                            catch (IOException v15) {
                                                throw wi_2.a(v15);
                                            }
                                            v14 = var7_9.getAsInt();
                                        }
                                        catch (IOException v16) {
                                            throw wi_2.a(v16);
                                        }
                                    }
                                    var8_13 = v14;
                                    try {
                                        var1_1.w.v(var8_13);
                                        if (var6_6 == null) break block53;
lbl105:
                                        // 2 sources

                                        var1_1.e();
                                    }
                                    catch (IOException v17) {
                                        throw wi_2.a(v17);
                                    }
                                }
                                return;
                            }
                            try {
                                v18 = var2_2;
                                if (var6_6 != null) break block54;
                                v3 = v18 instanceof OptionalLong;
                            }
                            catch (IOException v19) {
                                throw wi_2.a(v19);
                            }
                        }
                        if (!v3) break block57;
                        v18 = var2_2;
                    }
                    var7_10 = (OptionalLong)v18;
                    try {
                        try {
                            v20 = var7_10;
                            if (var6_6 != null) break block55;
                            if (v20.isPresent()) {
                            }
                            ** GOTO lbl142
                        }
                        catch (IOException v21) {
                            throw wi_2.a(v21);
                        }
                        v20 = var7_10;
                    }
                    catch (IOException v22) {
                        throw wi_2.a(v22);
                    }
                }
                var8_14 = v20.getAsLong();
                try {
                    var1_1.w.i(var8_14);
                    if (var6_6 == null) break block56;
lbl142:
                    // 2 sources

                    var1_1.e();
                }
                catch (IOException v23) {
                    throw wi_2.a(v23);
                }
            }
            return;
        }
        throw new hi_0(wi_2.a + var2_2.getClass());
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
                char[] cArray3 = ".;_ |\t\u00020;Yt/\u0013\u00024=Dnn\u0010Rzt".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 123;
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
                            n17 = 59;
                            break;
                        }
                        case 1: {
                            n17 = 47;
                            break;
                        }
                        case 2: {
                            n17 = 80;
                            break;
                        }
                        case 3: {
                            n17 = 123;
                            break;
                        }
                        case 4: {
                            n17 = 116;
                            break;
                        }
                        case 5: {
                            n17 = 7;
                            break;
                        }
                        default: {
                            n17 = 9;
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
        long l2 = 9031439970598650324L;
        b = 0xBA8046C379CC01D8L ^ l2;
        l = new wi_2();
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

