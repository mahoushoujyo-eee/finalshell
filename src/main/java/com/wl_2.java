/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.EP;
import com.P7;
import com.X4;
import com.ak_0;
import com.nl_1;
import com.nv_2;
import com.oc_0;
import com.yn_2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/*
 * Renamed from com.wl
 */
public class wl_2
implements ak_0,
X4 {
    public static final wl_2 y;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public final void u(nl_1 var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) throws IOException {
        block64: {
            block53: {
                block68: {
                    block52: {
                        block66: {
                            var7_6 = var1_1.w;
                            var8_7 = (Object[])var2_2;
                            var6_8 = nv_2.o();
                            if (var6_8 == null) break block66;
                            try {
                                block67: {
                                    if (var2_2 != null) break block52;
                                    break block67;
                                    catch (IOException v0) {
                                        throw wl_2.a(v0);
                                    }
                                }
                                var7_6.x(EP.WriteNullListAsEmpty);
                            }
                            catch (IOException v1) {
                                throw wl_2.a(v1);
                            }
                        }
                        return;
                    }
                    var9_9 = var8_7.length;
                    var10_10 = var9_9 - 1;
                    if (var6_8 == null) break block68;
                    try {
                        block69: {
                            if (var10_10 != -1) break block53;
                            break block69;
                            catch (IOException v2) {
                                throw wl_2.a(v2);
                            }
                        }
                        var7_6.q(wl_2.a(4489, 20677));
                    }
                    catch (IOException v3) {
                        throw wl_2.a(v3);
                    }
                }
                return;
            }
            var11_11 = var1_1.W;
            var1_1.N(var11_11, var2_2, var3_3, 0);
            try {
                block65: {
                    block80: {
                        block82: {
                            block81: {
                                block63: {
                                    block59: {
                                        block54: {
                                            block55: {
                                                block56: {
                                                    var12_12 = null;
                                                    var13_13 = null;
                                                    try {
                                                        var7_6.T((char)wl_2.a(3761, 2120680946671319079L));
                                                        v4 = var7_6.I(EP.PrettyFormat);
                                                        if (var6_8 == null) break block54;
                                                        if (v4 == 0) break block55;
                                                    }
                                                    catch (IOException v5) {
                                                        throw wl_2.a(v5);
                                                    }
                                                    var1_1.C();
                                                    var1_1.i();
                                                    for (var14_14 = 0; var14_14 < var9_9; ++var14_14) {
                                                        block57: {
                                                            if (var6_8 == null) break block56;
                                                            try {
                                                                block70: {
                                                                    if (var14_14 == 0) break block57;
                                                                    break block70;
                                                                    catch (IOException v6) {
                                                                        throw wl_2.a(v6);
                                                                    }
                                                                }
                                                                var7_6.write(wl_2.a(430, 3975594783649003319L));
                                                                var1_1.i();
                                                            }
                                                            catch (IOException v7) {
                                                                throw wl_2.a(v7);
                                                            }
                                                        }
                                                        var1_1.c(var8_7[var14_14], var14_14);
                                                        if (var6_8 != null) continue;
                                                    }
                                                    var1_1.r();
                                                    var1_1.i();
                                                    var7_6.write(wl_2.a(25642, 6650910833040036539L));
                                                }
                                                return;
                                            }
                                            v4 = var14_15 = 0;
                                        }
                                        while (var14_15 < var10_10) {
                                            block60: {
                                                block61: {
                                                    block62: {
                                                        block77: {
                                                            block73: {
                                                                block75: {
                                                                    block74: {
                                                                        block58: {
                                                                            block71: {
                                                                                var15_17 = var8_7[var14_15];
                                                                                if (var6_8 == null) break block58;
                                                                                v8 = var15_17;
                                                                                if (var6_8 == null) break block59;
                                                                                break block71;
                                                                                catch (IOException v9) {
                                                                                    throw wl_2.a(v9);
                                                                                }
                                                                            }
                                                                            try {
                                                                                block72: {
                                                                                    if (v8 != null) ** GOTO lbl104
                                                                                    break block72;
                                                                                    catch (IOException v10) {
                                                                                        throw wl_2.a(v10);
                                                                                    }
                                                                                }
                                                                                var7_6.q(wl_2.a(4490, -27175));
                                                                            }
                                                                            catch (IOException v11) {
                                                                                throw wl_2.a(v11);
                                                                            }
                                                                        }
                                                                        if (var6_8 != null) break block60;
lbl104:
                                                                        // 3 sources

                                                                        v12 = var1_1;
                                                                        if (var6_8 == null) break block73;
                                                                        break block74;
                                                                        catch (IOException v13) {
                                                                            throw wl_2.a(v13);
                                                                        }
                                                                    }
                                                                    if (!v12.S(var15_17)) ** GOTO lbl122
                                                                    break block75;
                                                                    catch (IOException v14) {
                                                                        throw wl_2.a(v14);
                                                                    }
                                                                }
                                                                try {
                                                                    block76: {
                                                                        var1_1.G(var15_17);
                                                                        if (var6_8 != null) break block61;
                                                                        break block76;
                                                                        catch (IOException v15) {
                                                                            throw wl_2.a(v15);
                                                                        }
                                                                    }
                                                                    v12 = var15_17;
                                                                }
                                                                catch (IOException v16) {
                                                                    throw wl_2.a(v16);
                                                                }
                                                            }
                                                            var16_18 = v12.getClass();
                                                            v17 = var16_18;
                                                            if (var6_8 == null) break block62;
                                                            if (v17 != var12_12) ** GOTO lbl144
                                                            break block77;
                                                            catch (IOException v18) {
                                                                throw wl_2.a(v18);
                                                            }
                                                        }
                                                        try {
                                                            block78: {
                                                                var13_13.u(var1_1, var15_17, var14_15, null, 0);
                                                                if (var6_8 != null) break block61;
                                                                break block78;
                                                                catch (IOException v19) {
                                                                    throw wl_2.a(v19);
                                                                }
                                                            }
                                                            v17 = var16_18;
                                                        }
                                                        catch (IOException v20) {
                                                            throw wl_2.a(v20);
                                                        }
                                                    }
                                                    var12_12 = v17;
                                                    var13_13 = var1_1.E(var16_18);
                                                    var13_13.u(var1_1, var15_17, var14_15, null, 0);
                                                }
                                                var7_6.T((char)wl_2.a(11657, 6704058024916638491L));
                                            }
                                            ++var14_15;
                                            if (var6_8 != null) continue;
                                        }
                                        v8 = var8_7[var10_10];
                                    }
                                    var14_16 = v8;
                                    if (var6_8 == null) break block63;
                                    try {
                                        block79: {
                                            if (var14_16 != null) ** GOTO lbl179
                                            break block79;
                                            catch (IOException v21) {
                                                throw wl_2.a(v21);
                                            }
                                        }
                                        var7_6.q(wl_2.a(4491, -22562));
                                    }
                                    catch (IOException v22) {
                                        throw wl_2.a(v22);
                                    }
                                }
                                if (var6_8 != null) break block64;
lbl179:
                                // 3 sources

                                v23 = var1_1;
                                v24 = var14_16;
                                if (var6_8 == null) break block80;
                                break block81;
                                catch (IOException v25) {
                                    throw wl_2.a(v25);
                                }
                            }
                            if (!v23.S(v24)) ** GOTO lbl198
                            break block82;
                            catch (IOException v26) {
                                throw wl_2.a(v26);
                            }
                        }
                        try {
                            block83: {
                                var1_1.G(var14_16);
                                if (var6_8 != null) break block65;
                                break block83;
                                catch (IOException v27) {
                                    throw wl_2.a(v27);
                                }
                            }
                            v23 = var1_1;
                            v24 = var14_16;
                        }
                        catch (IOException v28) {
                            throw wl_2.a(v28);
                        }
                    }
                    v23.c(v24, var10_10);
                }
                var7_6.T((char)wl_2.a(13840, 8512289372703309957L));
            }
            finally {
                var1_1.W = var11_11;
            }
        }
    }

    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        Class<Object> clazz;
        Class<Object> clazz2;
        Object object2;
        block47: {
            Type type2;
            block34: {
                block35: {
                    String string;
                    block46: {
                        Class<Object> clazz3;
                        block36: {
                            block37: {
                                block45: {
                                    Type type3;
                                    block38: {
                                        TypeVariable typeVariable;
                                        block39: {
                                            block44: {
                                                block43: {
                                                    TypeVariable typeVariable2;
                                                    block42: {
                                                        boolean bl;
                                                        TypeVariable typeVariable3;
                                                        block29: {
                                                            block41: {
                                                                Type type4;
                                                                ParameterizedType parameterizedType;
                                                                block40: {
                                                                    Type type5;
                                                                    int n10;
                                                                    block32: {
                                                                        block33: {
                                                                            P7 p7;
                                                                            block31: {
                                                                                int n11;
                                                                                block30: {
                                                                                    p7 = yn_22.N;
                                                                                    int n12 = p7.P();
                                                                                    string = nv_2.o();
                                                                                    n10 = n12;
                                                                                    n11 = wl_2.a(23430, 6030332132320455957L);
                                                                                    if (string != null) {
                                                                                        if (n10 == n11) {
                                                                                            p7.S(wl_2.a(26139, 8642702717917237388L));
                                                                                            return null;
                                                                                        }
                                                                                        n10 = n12;
                                                                                        n11 = 4;
                                                                                    }
                                                                                    if (string == null) break block30;
                                                                                    if (n10 == n11) break block31;
                                                                                    n10 = n12;
                                                                                    if (string == null) break block32;
                                                                                    n11 = wl_2.a(14976, 7136130673852861464L);
                                                                                }
                                                                                if (n10 != n11) break block33;
                                                                            }
                                                                            byte[] byArray = p7.e();
                                                                            p7.S(wl_2.a(11372, 5792281832017386232L));
                                                                            byte[] byArray2 = byArray;
                                                                            if (string != null) {
                                                                                if (byArray2.length == 0 && type != byte[].class) {
                                                                                    return null;
                                                                                }
                                                                                byArray2 = byArray;
                                                                            }
                                                                            return byArray2;
                                                                        }
                                                                        type2 = type;
                                                                        if (string == null) break block34;
                                                                        n10 = type2 instanceof GenericArrayType;
                                                                    }
                                                                    if (n10 == 0) break block35;
                                                                    object2 = (GenericArrayType)type;
                                                                    clazz3 = clazz2 = object2.getGenericComponentType();
                                                                    if (string == null) break block36;
                                                                    if (!(clazz3 instanceof TypeVariable)) break block37;
                                                                    typeVariable = (TypeVariable)((Object)clazz2);
                                                                    type3 = type5 = yn_22.A().F;
                                                                    if (string == null) break block38;
                                                                    if (!(type3 instanceof ParameterizedType)) break block39;
                                                                    parameterizedType = (ParameterizedType)type5;
                                                                    Type type6 = parameterizedType.getRawType();
                                                                    typeVariable3 = null;
                                                                    type4 = type6;
                                                                    if (string == null) break block40;
                                                                    if (!(type4 instanceof Class)) break block41;
                                                                    type4 = type6;
                                                                }
                                                                TypeVariable<Class<T>>[] typeVariableArray = ((Class)type4).getTypeParameters();
                                                                for (int i2 = 0; i2 < typeVariableArray.length; ++i2) {
                                                                    TypeVariable typeVariable4 = typeVariableArray[i2];
                                                                    if (string != null) {
                                                                        bl = typeVariable4.getName().equals(typeVariable.getName());
                                                                        if (string == null) break block29;
                                                                        if (!bl) continue;
                                                                        typeVariable4 = parameterizedType.getActualTypeArguments()[i2];
                                                                    }
                                                                    typeVariable3 = typeVariable4;
                                                                    if (string != null) continue;
                                                                }
                                                            }
                                                            typeVariable2 = typeVariable3;
                                                            if (string == null) break block42;
                                                            bl = typeVariable2 instanceof Class;
                                                        }
                                                        if (!bl) break block43;
                                                        typeVariable2 = typeVariable3;
                                                    }
                                                    clazz = (Class)((Object)typeVariable2);
                                                    if (string != null) break block44;
                                                }
                                                clazz = Object.class;
                                            }
                                            if (string != null) break block45;
                                        }
                                        type3 = typeVariable.getBounds()[0];
                                    }
                                    clazz = B8.x(type3);
                                }
                                if (string != null) break block46;
                            }
                            clazz3 = clazz2;
                        }
                        clazz = B8.x(clazz3);
                    }
                    if (string != null) break block47;
                }
                type2 = type;
            }
            object2 = (Class)type2;
            clazz2 = clazz = ((Class)object2).getComponentType();
        }
        object2 = new oc_0();
        yn_22.t((Type)((Object)clazz2), (Collection)object2, object);
        return this.x(yn_22, clazz, (oc_0)object2);
    }

    /*
     * Unable to fully structure code
     */
    private Object x(yn_2 var1_1, Class var2_2, oc_0 var3_3) {
        block19: {
            var4_4 = nv_2.o();
            v0 = var3_3;
            if (var4_4 != null) {
                if (v0 == null) {
                    return null;
                }
                v0 = var3_3;
            }
            var5_5 = v0.size();
            var6_6 = Array.newInstance(var2_2, var5_5);
            block0: for (var7_7 = 0; var7_7 < var5_5; ++var7_7) {
                block20: {
                    v1 = var8_8 = var3_3.get(var7_7);
                    if (var4_4 == null) break block19;
                    if (var4_4 == null) ** GOTO lbl17
                    v2 = var3_3;
                    block1: while (true) {
                        block23: {
                            block26: {
                                block24: {
                                    block25: {
                                        block22: {
                                            block21: {
                                                if (v1 != v2) break block21;
                                                v3 = var6_6;
lbl17:
                                                // 2 sources

                                                Array.set(v3, var7_7, var6_6);
                                                if (var4_4 != null) continue block0;
                                            }
                                            v4 = var2_2.isArray();
                                            if (var4_4 == null) break block22;
                                            if (!v4) break block23;
                                            v5 = var2_2;
                                            if (var4_4 == null) break block24;
                                            v4 = v5.isInstance(var8_8);
                                        }
                                        if (!v4) break block25;
                                        var9_9 = var8_8;
                                        if (var4_4 != null) break block26;
                                    }
                                    v5 = this.x(var1_1, var2_2, (oc_0)var8_8);
                                }
                                var9_9 = v5;
                            }
                            Array.set(var6_6, var7_7, var9_9);
                            if (var4_4 != null) continue block0;
                        }
                        var9_9 = null;
                        v6 = var8_8 instanceof oc_0;
                        if (var4_4 != null) {
                            if (!v6) break block20;
                            v6 = false;
                        }
                        var10_10 = v6;
                        var11_11 = (oc_0)var8_8;
                        var12_12 = var11_11.size();
                        var13_13 = 0;
                        while (var13_13 < var12_12) {
                            var14_14 = var11_11.get(var13_13);
                            if (var4_4 != null) {
                                v7 = var14_14;
                                v2 = var3_3;
                                if (var4_4 == null) continue block1;
                                if (v7 == v2) {
                                    var11_11.set(var7_7, var6_6);
                                    var10_10 = true;
                                }
                                ++var13_13;
                            }
                            if (var4_4 != null) continue;
                        }
                        break;
                    }
                    if (var10_10) {
                        var9_9 = var11_11.toArray();
                    }
                }
                v8 = var9_9;
                if (var4_4 != null) {
                    if (v8 == null) {
                        var9_9 = B8.B(var8_8, var2_2, var1_1.L());
                    }
                    v8 = var6_6;
                }
                Array.set(v8, var7_7, var9_9);
                if (var4_4 != null) continue;
            }
            var3_3.L(var6_6);
            var3_3.w(var2_2);
            v1 = var6_6;
        }
        return v1;
    }

    @Override
    public int j() {
        return wl_2.a(9690, 6892262657220170570L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[3];
                    var11_1 = 0;
                    var10_2 = "o{\u00a3\u008b!\u0005\f\u0095\u00cfV\u00dd\u0002\u00c1\u0014";
                    var12_3 = "o{\u00a3\u008b!\u0005\f\u0095\u00cfV\u00dd\u0002\u00c1\u0014".length();
                    var9_4 = 5;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 46;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 91;
                                    break;
                                }
                                case 1: {
                                    v11 = 29;
                                    break;
                                }
                                case 2: {
                                    v11 = 1;
                                    break;
                                }
                                case 3: {
                                    v11 = 27;
                                    break;
                                }
                                case 4: {
                                    v11 = 34;
                                    break;
                                }
                                case 5: {
                                    v11 = 26;
                                    break;
                                }
                                default: {
                                    v11 = 9;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                wl_2.a = var13;
                wl_2.b = new String[3];
                var0_7 = 1686357750603785917L;
                var6_8 = new long[10];
                var3_9 = 0;
                var4_10 = "V\u00a5\u0004\u00fe6\u00bbu\u00f9\u001dP\u00d9\u0094\u00a4\u00d14[\u00cc1\u0097\u00be\u00884}\u008a\u00e0\u0017\u00d6}Pb\u008b\u00a0\u00f8\u0011&\u0015\u00ac\u00af|U\u00b6\u00f9:\u00ce\u001d\u00a7fe\u00d5(\u001a\u00d2L\u00bf^\u00c1\u00d1\u009c\u008d\u00ec85\u00b6!";
                var5_11 = "V\u00a5\u0004\u00fe6\u00bbu\u00f9\u001dP\u00d9\u0094\u00a4\u00d14[\u00cc1\u0097\u00be\u00884}\u008a\u00e0\u0017\u00d6}Pb\u008b\u00a0\u00f8\u0011&\u0015\u00ac\u00af|U\u00b6\u00f9:\u00ce\u001d\u00a7fe\u00d5(\u001a\u00d2L\u00bf^\u00c1\u00d1\u009c\u008d\u00ec85\u00b6!".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "%YW\u00ff}3\u00ea\u00bf\u00b6w\u00ce1\u00e2\u00bcQ\u00a6";
                    var5_11 = "%YW\u00ff}3\u00ea\u00bf\u00b6w\u00ce1\u00e2\u00bcQ\u00a6".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        wl_2.c = var6_8;
        wl_2.d = new Integer[10];
        wl_2.y = new wl_2();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x118B) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 185;
                    break;
                }
                case 1: {
                    n14 = 162;
                    break;
                }
                case 2: {
                    n14 = 70;
                    break;
                }
                case 3: {
                    n14 = 207;
                    break;
                }
                case 4: {
                    n14 = 136;
                    break;
                }
                case 5: {
                    n14 = 191;
                    break;
                }
                case 6: {
                    n14 = 19;
                    break;
                }
                case 7: {
                    n14 = 172;
                    break;
                }
                case 8: {
                    n14 = 50;
                    break;
                }
                case 9: {
                    n14 = 240;
                    break;
                }
                case 10: {
                    n14 = 49;
                    break;
                }
                case 11: {
                    n14 = 231;
                    break;
                }
                case 12: {
                    n14 = 89;
                    break;
                }
                case 13: {
                    n14 = 222;
                    break;
                }
                case 14: {
                    n14 = 176;
                    break;
                }
                case 15: {
                    n14 = 181;
                    break;
                }
                case 16: {
                    n14 = 83;
                    break;
                }
                case 17: {
                    n14 = 152;
                    break;
                }
                case 18: {
                    n14 = 73;
                    break;
                }
                case 19: {
                    n14 = 121;
                    break;
                }
                case 20: {
                    n14 = 161;
                    break;
                }
                case 21: {
                    n14 = 165;
                    break;
                }
                case 22: {
                    n14 = 180;
                    break;
                }
                case 23: {
                    n14 = 157;
                    break;
                }
                case 24: {
                    n14 = 169;
                    break;
                }
                case 25: {
                    n14 = 11;
                    break;
                }
                case 26: {
                    n14 = 106;
                    break;
                }
                case 27: {
                    n14 = 245;
                    break;
                }
                case 28: {
                    n14 = 120;
                    break;
                }
                case 29: {
                    n14 = 33;
                    break;
                }
                case 30: {
                    n14 = 21;
                    break;
                }
                case 31: {
                    n14 = 205;
                    break;
                }
                case 32: {
                    n14 = 202;
                    break;
                }
                case 33: {
                    n14 = 206;
                    break;
                }
                case 34: {
                    n14 = 230;
                    break;
                }
                case 35: {
                    n14 = 93;
                    break;
                }
                case 36: {
                    n14 = 235;
                    break;
                }
                case 37: {
                    n14 = 78;
                    break;
                }
                case 38: {
                    n14 = 20;
                    break;
                }
                case 39: {
                    n14 = 224;
                    break;
                }
                case 40: {
                    n14 = 82;
                    break;
                }
                case 41: {
                    n14 = 148;
                    break;
                }
                case 42: {
                    n14 = 110;
                    break;
                }
                case 43: {
                    n14 = 76;
                    break;
                }
                case 44: {
                    n14 = 237;
                    break;
                }
                case 45: {
                    n14 = 107;
                    break;
                }
                case 46: {
                    n14 = 129;
                    break;
                }
                case 47: {
                    n14 = 61;
                    break;
                }
                case 48: {
                    n14 = 197;
                    break;
                }
                case 49: {
                    n14 = 0;
                    break;
                }
                case 50: {
                    n14 = 100;
                    break;
                }
                case 51: {
                    n14 = 3;
                    break;
                }
                case 52: {
                    n14 = 209;
                    break;
                }
                case 53: {
                    n14 = 37;
                    break;
                }
                case 54: {
                    n14 = 138;
                    break;
                }
                case 55: {
                    n14 = 187;
                    break;
                }
                case 56: {
                    n14 = 15;
                    break;
                }
                case 57: {
                    n14 = 8;
                    break;
                }
                case 58: {
                    n14 = 220;
                    break;
                }
                case 59: {
                    n14 = 79;
                    break;
                }
                case 60: {
                    n14 = 59;
                    break;
                }
                case 61: {
                    n14 = 81;
                    break;
                }
                case 62: {
                    n14 = 97;
                    break;
                }
                case 63: {
                    n14 = 196;
                    break;
                }
                case 64: {
                    n14 = 95;
                    break;
                }
                case 65: {
                    n14 = 12;
                    break;
                }
                case 66: {
                    n14 = 166;
                    break;
                }
                case 67: {
                    n14 = 80;
                    break;
                }
                case 68: {
                    n14 = 198;
                    break;
                }
                case 69: {
                    n14 = 94;
                    break;
                }
                case 70: {
                    n14 = 71;
                    break;
                }
                case 71: {
                    n14 = 201;
                    break;
                }
                case 72: {
                    n14 = 75;
                    break;
                }
                case 73: {
                    n14 = 199;
                    break;
                }
                case 74: {
                    n14 = 144;
                    break;
                }
                case 75: {
                    n14 = 111;
                    break;
                }
                case 76: {
                    n14 = 108;
                    break;
                }
                case 77: {
                    n14 = 18;
                    break;
                }
                case 78: {
                    n14 = 195;
                    break;
                }
                case 79: {
                    n14 = 39;
                    break;
                }
                case 80: {
                    n14 = 204;
                    break;
                }
                case 81: {
                    n14 = 40;
                    break;
                }
                case 82: {
                    n14 = 178;
                    break;
                }
                case 83: {
                    n14 = 250;
                    break;
                }
                case 84: {
                    n14 = 25;
                    break;
                }
                case 85: {
                    n14 = 46;
                    break;
                }
                case 86: {
                    n14 = 213;
                    break;
                }
                case 87: {
                    n14 = 242;
                    break;
                }
                case 88: {
                    n14 = 6;
                    break;
                }
                case 89: {
                    n14 = 200;
                    break;
                }
                case 90: {
                    n14 = 60;
                    break;
                }
                case 91: {
                    n14 = 208;
                    break;
                }
                case 92: {
                    n14 = 48;
                    break;
                }
                case 93: {
                    n14 = 42;
                    break;
                }
                case 94: {
                    n14 = 38;
                    break;
                }
                case 95: {
                    n14 = 53;
                    break;
                }
                case 96: {
                    n14 = 164;
                    break;
                }
                case 97: {
                    n14 = 133;
                    break;
                }
                case 98: {
                    n14 = 118;
                    break;
                }
                case 99: {
                    n14 = 125;
                    break;
                }
                case 100: {
                    n14 = 88;
                    break;
                }
                case 101: {
                    n14 = 139;
                    break;
                }
                case 102: {
                    n14 = 239;
                    break;
                }
                case 103: {
                    n14 = 249;
                    break;
                }
                case 104: {
                    n14 = 168;
                    break;
                }
                case 105: {
                    n14 = 114;
                    break;
                }
                case 106: {
                    n14 = 186;
                    break;
                }
                case 107: {
                    n14 = 134;
                    break;
                }
                case 108: {
                    n14 = 225;
                    break;
                }
                case 109: {
                    n14 = 66;
                    break;
                }
                case 110: {
                    n14 = 116;
                    break;
                }
                case 111: {
                    n14 = 72;
                    break;
                }
                case 112: {
                    n14 = 84;
                    break;
                }
                case 113: {
                    n14 = 103;
                    break;
                }
                case 114: {
                    n14 = 28;
                    break;
                }
                case 115: {
                    n14 = 229;
                    break;
                }
                case 116: {
                    n14 = 36;
                    break;
                }
                case 117: {
                    n14 = 109;
                    break;
                }
                case 118: {
                    n14 = 124;
                    break;
                }
                case 119: {
                    n14 = 233;
                    break;
                }
                case 120: {
                    n14 = 113;
                    break;
                }
                case 121: {
                    n14 = 194;
                    break;
                }
                case 122: {
                    n14 = 182;
                    break;
                }
                case 123: {
                    n14 = 203;
                    break;
                }
                case 124: {
                    n14 = 123;
                    break;
                }
                case 125: {
                    n14 = 55;
                    break;
                }
                case 126: {
                    n14 = 47;
                    break;
                }
                case 127: {
                    n14 = 24;
                    break;
                }
                case 128: {
                    n14 = 234;
                    break;
                }
                case 129: {
                    n14 = 155;
                    break;
                }
                case 130: {
                    n14 = 27;
                    break;
                }
                case 131: {
                    n14 = 7;
                    break;
                }
                case 132: {
                    n14 = 96;
                    break;
                }
                case 133: {
                    n14 = 140;
                    break;
                }
                case 134: {
                    n14 = 13;
                    break;
                }
                case 135: {
                    n14 = 217;
                    break;
                }
                case 136: {
                    n14 = 29;
                    break;
                }
                case 137: {
                    n14 = 173;
                    break;
                }
                case 138: {
                    n14 = 145;
                    break;
                }
                case 139: {
                    n14 = 32;
                    break;
                }
                case 140: {
                    n14 = 255;
                    break;
                }
                case 141: {
                    n14 = 154;
                    break;
                }
                case 142: {
                    n14 = 223;
                    break;
                }
                case 143: {
                    n14 = 16;
                    break;
                }
                case 144: {
                    n14 = 67;
                    break;
                }
                case 145: {
                    n14 = 216;
                    break;
                }
                case 146: {
                    n14 = 10;
                    break;
                }
                case 147: {
                    n14 = 251;
                    break;
                }
                case 148: {
                    n14 = 142;
                    break;
                }
                case 149: {
                    n14 = 170;
                    break;
                }
                case 150: {
                    n14 = 189;
                    break;
                }
                case 151: {
                    n14 = 211;
                    break;
                }
                case 152: {
                    n14 = 127;
                    break;
                }
                case 153: {
                    n14 = 99;
                    break;
                }
                case 154: {
                    n14 = 35;
                    break;
                }
                case 155: {
                    n14 = 167;
                    break;
                }
                case 156: {
                    n14 = 248;
                    break;
                }
                case 157: {
                    n14 = 69;
                    break;
                }
                case 158: {
                    n14 = 143;
                    break;
                }
                case 159: {
                    n14 = 128;
                    break;
                }
                case 160: {
                    n14 = 150;
                    break;
                }
                case 161: {
                    n14 = 218;
                    break;
                }
                case 162: {
                    n14 = 247;
                    break;
                }
                case 163: {
                    n14 = 141;
                    break;
                }
                case 164: {
                    n14 = 4;
                    break;
                }
                case 165: {
                    n14 = 63;
                    break;
                }
                case 166: {
                    n14 = 135;
                    break;
                }
                case 167: {
                    n14 = 91;
                    break;
                }
                case 168: {
                    n14 = 119;
                    break;
                }
                case 169: {
                    n14 = 65;
                    break;
                }
                case 170: {
                    n14 = 62;
                    break;
                }
                case 171: {
                    n14 = 175;
                    break;
                }
                case 172: {
                    n14 = 54;
                    break;
                }
                case 173: {
                    n14 = 43;
                    break;
                }
                case 174: {
                    n14 = 174;
                    break;
                }
                case 175: {
                    n14 = 232;
                    break;
                }
                case 176: {
                    n14 = 112;
                    break;
                }
                case 177: {
                    n14 = 190;
                    break;
                }
                case 178: {
                    n14 = 77;
                    break;
                }
                case 179: {
                    n14 = 87;
                    break;
                }
                case 180: {
                    n14 = 214;
                    break;
                }
                case 181: {
                    n14 = 193;
                    break;
                }
                case 182: {
                    n14 = 246;
                    break;
                }
                case 183: {
                    n14 = 252;
                    break;
                }
                case 184: {
                    n14 = 85;
                    break;
                }
                case 185: {
                    n14 = 130;
                    break;
                }
                case 186: {
                    n14 = 117;
                    break;
                }
                case 187: {
                    n14 = 115;
                    break;
                }
                case 188: {
                    n14 = 104;
                    break;
                }
                case 189: {
                    n14 = 236;
                    break;
                }
                case 190: {
                    n14 = 227;
                    break;
                }
                case 191: {
                    n14 = 228;
                    break;
                }
                case 192: {
                    n14 = 126;
                    break;
                }
                case 193: {
                    n14 = 52;
                    break;
                }
                case 194: {
                    n14 = 244;
                    break;
                }
                case 195: {
                    n14 = 90;
                    break;
                }
                case 196: {
                    n14 = 98;
                    break;
                }
                case 197: {
                    n14 = 51;
                    break;
                }
                case 198: {
                    n14 = 1;
                    break;
                }
                case 199: {
                    n14 = 30;
                    break;
                }
                case 200: {
                    n14 = 122;
                    break;
                }
                case 201: {
                    n14 = 183;
                    break;
                }
                case 202: {
                    n14 = 219;
                    break;
                }
                case 203: {
                    n14 = 158;
                    break;
                }
                case 204: {
                    n14 = 68;
                    break;
                }
                case 205: {
                    n14 = 179;
                    break;
                }
                case 206: {
                    n14 = 151;
                    break;
                }
                case 207: {
                    n14 = 177;
                    break;
                }
                case 208: {
                    n14 = 17;
                    break;
                }
                case 209: {
                    n14 = 153;
                    break;
                }
                case 210: {
                    n14 = 188;
                    break;
                }
                case 211: {
                    n14 = 9;
                    break;
                }
                case 212: {
                    n14 = 23;
                    break;
                }
                case 213: {
                    n14 = 34;
                    break;
                }
                case 214: {
                    n14 = 58;
                    break;
                }
                case 215: {
                    n14 = 184;
                    break;
                }
                case 216: {
                    n14 = 101;
                    break;
                }
                case 217: {
                    n14 = 192;
                    break;
                }
                case 218: {
                    n14 = 45;
                    break;
                }
                case 219: {
                    n14 = 160;
                    break;
                }
                case 220: {
                    n14 = 226;
                    break;
                }
                case 221: {
                    n14 = 221;
                    break;
                }
                case 222: {
                    n14 = 56;
                    break;
                }
                case 223: {
                    n14 = 212;
                    break;
                }
                case 224: {
                    n14 = 243;
                    break;
                }
                case 225: {
                    n14 = 137;
                    break;
                }
                case 226: {
                    n14 = 74;
                    break;
                }
                case 227: {
                    n14 = 22;
                    break;
                }
                case 228: {
                    n14 = 64;
                    break;
                }
                case 229: {
                    n14 = 149;
                    break;
                }
                case 230: {
                    n14 = 102;
                    break;
                }
                case 231: {
                    n14 = 254;
                    break;
                }
                case 232: {
                    n14 = 41;
                    break;
                }
                case 233: {
                    n14 = 5;
                    break;
                }
                case 234: {
                    n14 = 44;
                    break;
                }
                case 235: {
                    n14 = 210;
                    break;
                }
                case 236: {
                    n14 = 163;
                    break;
                }
                case 237: {
                    n14 = 146;
                    break;
                }
                case 238: {
                    n14 = 156;
                    break;
                }
                case 239: {
                    n14 = 147;
                    break;
                }
                case 240: {
                    n14 = 171;
                    break;
                }
                case 241: {
                    n14 = 86;
                    break;
                }
                case 242: {
                    n14 = 26;
                    break;
                }
                case 243: {
                    n14 = 238;
                    break;
                }
                case 244: {
                    n14 = 253;
                    break;
                }
                case 245: {
                    n14 = 57;
                    break;
                }
                case 246: {
                    n14 = 92;
                    break;
                }
                case 247: {
                    n14 = 105;
                    break;
                }
                case 248: {
                    n14 = 14;
                    break;
                }
                case 249: {
                    n14 = 132;
                    break;
                }
                case 250: {
                    n14 = 215;
                    break;
                }
                case 251: {
                    n14 = 159;
                    break;
                }
                case 252: {
                    n14 = 241;
                    break;
                }
                case 253: {
                    n14 = 31;
                    break;
                }
                case 254: {
                    n14 = 2;
                    break;
                }
                default: {
                    n14 = 131;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            wl_2.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7690;
        if (d[n11] == null) {
            wl_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

