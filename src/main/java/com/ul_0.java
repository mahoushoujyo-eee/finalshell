/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.HI;
import com.HK;
import com.IG;
import com.P7;
import com.X4;
import com.ks_0;
import com.ky_2;
import com.ph_0;
import com.uT;
import com.xm_1;
import com.yn_2;
import com.zS;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/*
 * Renamed from com.ul
 */
public class ul_0
extends uT {
    private final Type J;
    private int v;
    private X4 Y;
    private static final long[] c;
    private static final Integer[] d;

    public ul_0(IG iG, Class clazz, ph_0 ph_02) {
        block11: {
            block8: {
                ky_2[] ky_2Array;
                block9: {
                    Type type;
                    block10: {
                        block7: {
                            ky_2[] ky_2Array2 = zS.p();
                            super(clazz, ph_02);
                            Type type2 = ph_02.a;
                            ky_2Array = ky_2Array2;
                            Type type3 = type2;
                            if (ky_2Array != null) break block7;
                            if (!(type3 instanceof ParameterizedType)) break block8;
                            type3 = type = ((ParameterizedType)ph_02.a).getActualTypeArguments()[0];
                        }
                        if (ky_2Array != null) break block9;
                        if (!(type instanceof WildcardType)) break block10;
                        WildcardType wildcardType = (WildcardType)type;
                        Type[] typeArray = wildcardType.getUpperBounds();
                        if (ky_2Array != null) break block9;
                        if (typeArray.length == 1) {
                            type = typeArray[0];
                        }
                    }
                    this.J = type;
                }
                if (ky_2Array == null) break block11;
            }
            this.J = Object.class;
        }
    }

    @Override
    public int f() {
        return ul_0.a(25269, 7417536562036152064L);
    }

    @Override
    public void y(yn_2 yn_22, Object object, Type type, Map map) {
        block14: {
            Object object2;
            ul_0 ul_02;
            ArrayList arrayList;
            block12: {
                block13: {
                    ky_2[] ky_2Array;
                    block7: {
                        block11: {
                            block10: {
                                block9: {
                                    Object object3;
                                    block8: {
                                        block5: {
                                            int n10;
                                            block6: {
                                                int n11;
                                                P7 p7;
                                                block4: {
                                                    p7 = yn_22.N;
                                                    int n12 = p7.P();
                                                    ky_2Array = zS.p();
                                                    n10 = n12;
                                                    n11 = ul_0.a(22986, 3225542231451413628L);
                                                    if (ky_2Array != null) break block4;
                                                    if (n10 == n11) break block5;
                                                    n10 = n12;
                                                    if (ky_2Array != null) break block6;
                                                    n11 = 4;
                                                }
                                                if (n10 != n11) break block7;
                                                object3 = p7.z();
                                                if (ky_2Array != null) break block8;
                                                n10 = ((String)object3).length();
                                            }
                                            if (n10 != 0) break block7;
                                        }
                                        object3 = object;
                                    }
                                    if (ky_2Array != null) break block9;
                                    if (object3 != null) break block10;
                                    object3 = map.put(this.p.I, null);
                                }
                                if (ky_2Array == null) break block11;
                            }
                            this.S(object, null);
                        }
                        return;
                    }
                    arrayList = new ArrayList();
                    xm_1 xm_12 = yn_22.A();
                    yn_22.L(xm_12, object, this.p.I);
                    ul_02 = this;
                    object2 = yn_22;
                    if (ky_2Array != null) break block12;
                    ul_02.w((yn_2)object2, type, arrayList);
                    yn_22.z(xm_12);
                    if (object != null) break block13;
                    map.put(this.p.I, arrayList);
                    if (ky_2Array == null) break block14;
                }
                ul_02 = this;
                object2 = object;
            }
            ul_02.D(object2, arrayList);
        }
    }

    public final void w(yn_2 yn_22, Type type, Collection collection) {
        block73: {
            X4 x42;
            ky_2[] ky_2Array;
            Type type2;
            block69: {
                Object object;
                block71: {
                    X4 x43;
                    block70: {
                        int n10;
                        block60: {
                            Type type3;
                            Type[] typeArray;
                            block68: {
                                boolean bl;
                                block67: {
                                    block52: {
                                        block53: {
                                            block63: {
                                                int n11;
                                                ParameterizedType parameterizedType;
                                                int n12;
                                                block49: {
                                                    Class clazz;
                                                    Type type4;
                                                    block66: {
                                                        Type type5;
                                                        block65: {
                                                            Type type6;
                                                            block64: {
                                                                int n13;
                                                                block62: {
                                                                    Type type7;
                                                                    block61: {
                                                                        boolean bl2;
                                                                        block54: {
                                                                            block55: {
                                                                                block59: {
                                                                                    int n14;
                                                                                    block58: {
                                                                                        int n15;
                                                                                        block48: {
                                                                                            block57: {
                                                                                                Type type8;
                                                                                                block56: {
                                                                                                    type2 = this.J;
                                                                                                    ky_2Array = zS.p();
                                                                                                    x42 = this.Y;
                                                                                                    bl = type instanceof ParameterizedType;
                                                                                                    if (ky_2Array != null) break block52;
                                                                                                    if (!bl) break block53;
                                                                                                    bl2 = type2 instanceof TypeVariable;
                                                                                                    if (ky_2Array != null) break block54;
                                                                                                    if (!bl2) break block55;
                                                                                                    object = (TypeVariable)type2;
                                                                                                    typeArray = (ParameterizedType)type;
                                                                                                    type4 = null;
                                                                                                    type8 = typeArray.getRawType();
                                                                                                    if (ky_2Array != null) break block56;
                                                                                                    if (!(type8 instanceof Class)) break block57;
                                                                                                    type8 = typeArray.getRawType();
                                                                                                }
                                                                                                type4 = (Class)type8;
                                                                                            }
                                                                                            n15 = -1;
                                                                                            if (type4 != null) {
                                                                                                int n16 = 0;
                                                                                                n12 = ((Class)type4).getTypeParameters().length;
                                                                                                while (n16 < n12) {
                                                                                                    TypeVariable typeVariable = ((Class)type4).getTypeParameters()[n16];
                                                                                                    if (ky_2Array == null) {
                                                                                                        n14 = typeVariable.getName().equals(object.getName()) ? 1 : 0;
                                                                                                        if (ky_2Array != null) break block48;
                                                                                                        if (n14 != 0) {
                                                                                                            n15 = n16;
                                                                                                            if (ky_2Array == null) break;
                                                                                                        }
                                                                                                        ++n16;
                                                                                                    }
                                                                                                    if (ky_2Array == null) continue;
                                                                                                }
                                                                                            }
                                                                                            n14 = n15;
                                                                                        }
                                                                                        if (ky_2Array != null) break block58;
                                                                                        if (n14 == -1) break block59;
                                                                                        type2 = typeArray.getActualTypeArguments()[n15];
                                                                                        n14 = type2.equals(this.J) ? 1 : 0;
                                                                                    }
                                                                                    if (n14 == 0) {
                                                                                        x42 = yn_22.L().h(type2);
                                                                                    }
                                                                                }
                                                                                if (ky_2Array == null) break block60;
                                                                            }
                                                                            type7 = type2;
                                                                            if (ky_2Array != null) break block61;
                                                                            bl2 = type7 instanceof ParameterizedType;
                                                                        }
                                                                        if (!bl2) break block60;
                                                                        type7 = type2;
                                                                    }
                                                                    object = (ParameterizedType)type7;
                                                                    typeArray = object.getActualTypeArguments();
                                                                    n13 = typeArray.length;
                                                                    if (ky_2Array != null) break block62;
                                                                    if (n13 != 1) break block63;
                                                                    type6 = typeArray[0];
                                                                    if (ky_2Array != null) break block64;
                                                                    n13 = type6 instanceof TypeVariable;
                                                                }
                                                                if (n13 == 0) break block63;
                                                                type6 = typeArray[0];
                                                            }
                                                            type4 = (TypeVariable)type6;
                                                            parameterizedType = (ParameterizedType)type;
                                                            clazz = null;
                                                            type5 = parameterizedType.getRawType();
                                                            if (ky_2Array != null) break block65;
                                                            if (!(type5 instanceof Class)) break block66;
                                                            type5 = parameterizedType.getRawType();
                                                        }
                                                        clazz = (Class)type5;
                                                    }
                                                    n12 = -1;
                                                    if (clazz != null) {
                                                        int n17 = 0;
                                                        int n18 = clazz.getTypeParameters().length;
                                                        while (n17 < n18) {
                                                            TypeVariable typeVariable = clazz.getTypeParameters()[n17];
                                                            if (ky_2Array == null) {
                                                                n11 = typeVariable.getName().equals(type4.getName()) ? 1 : 0;
                                                                if (ky_2Array != null) break block49;
                                                                if (n11 != 0) {
                                                                    n12 = n17;
                                                                    if (ky_2Array == null) break;
                                                                }
                                                                ++n17;
                                                            }
                                                            if (ky_2Array == null) continue;
                                                        }
                                                    }
                                                    n11 = n12;
                                                }
                                                if (n11 != -1) {
                                                    typeArray[0] = parameterizedType.getActualTypeArguments()[n12];
                                                    type2 = HI.V(new HK(typeArray, object.getOwnerType(), object.getRawType()));
                                                }
                                            }
                                            if (ky_2Array == null) break block60;
                                        }
                                        bl = type2 instanceof TypeVariable;
                                    }
                                    if (ky_2Array != null) break block67;
                                    if (!bl) break block60;
                                    type3 = type;
                                    if (ky_2Array != null) break block68;
                                    bl = type3 instanceof Class;
                                }
                                if (!bl) break block60;
                                type3 = type;
                            }
                            object = (Class)type3;
                            typeArray = (TypeVariable)type2;
                            ((Class)object).getTypeParameters();
                            int n19 = 0;
                            int n20 = ((Class)object).getTypeParameters().length;
                            while (n19 < n20) {
                                TypeVariable typeVariable = ((Class)object).getTypeParameters()[n19];
                                if (ky_2Array == null) {
                                    if (typeVariable.getName().equals(typeArray.getName())) {
                                        Type[] typeArray2;
                                        Type[] typeArray3 = typeArray2 = typeVariable.getBounds();
                                        if (ky_2Array == null) {
                                            if (typeArray3.length != 1) break;
                                            typeArray3 = typeArray2;
                                        }
                                        type2 = typeArray3[0];
                                        if (ky_2Array == null) break;
                                    }
                                    ++n19;
                                }
                                if (ky_2Array == null) continue;
                            }
                        }
                        if ((n10 = (object = yn_22.N).P()) != ul_0.a(8589, 1692806367274292281L)) break block69;
                        x43 = x42;
                        if (ky_2Array != null) break block70;
                        if (x43 != null) break block71;
                        x43 = this.Y = yn_22.L().h(type2);
                    }
                    x42 = x43;
                    this.v = this.Y.j();
                }
                object.S(this.v);
                int n21 = 0;
                do {
                    Object object2;
                    block72: {
                        block51: {
                            int n22;
                            int n23;
                            block50: {
                                if (object.w(ks_0.AllowArbitraryCommas)) {
                                    do {
                                        n23 = object.P();
                                        n22 = ul_0.a(16009, 6183676592630123321L);
                                        if (ky_2Array != null) break block50;
                                        if (n23 != n22) break;
                                        object.K();
                                        if (ky_2Array != null) break block51;
                                    } while (ky_2Array == null);
                                }
                                object2 = object;
                                if (ky_2Array != null) break block72;
                                n23 = object2.P();
                                n22 = ul_0.a(14702, 1946729681533160671L);
                            }
                            if (n23 == n22 && ky_2Array == null) break;
                        }
                        object2 = x42.z(yn_22, type2, n21);
                    }
                    Object object3 = object2;
                    collection.add(object3);
                    yn_22.b(collection);
                    if (ky_2Array != null) continue;
                    if (object.P() == ul_0.a(14935, 7448782495277764576L)) {
                        object.S(this.v);
                    }
                    ++n21;
                } while (ky_2Array == null);
                object.S(ul_0.a(14935, 7448782495277764576L));
                if (ky_2Array == null) break block73;
            }
            Object object = x42;
            if (ky_2Array == null) {
                if (object == null) {
                    x42 = this.Y = yn_22.L().h(type2);
                }
                object = x42.z(yn_22, type2, 0);
            }
            X4 x44 = object;
            collection.add(x44);
            yn_22.b(collection);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 6745192190414285224L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "#\u001av\u0092Q\u0086\u00bd\u009fKA\u00fa\u0086S\u00c2\u00fe\u00a6a3}I\u00a2\u00cfE\u00dchZ\u00e8\u0012\u0093L&X";
                var5_4 = "#\u001av\u0092Q\u0086\u00bd\u009fKA\u00fa\u0086S\u00c2\u00fe\u00a6a3}I\u00a2\u00cfE\u00dchZ\u00e8\u0012\u0093L&X".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u00b4|E0v\u00fc\"\u0081\u0019\u00af\u00fc\u00f8\u0086\u001f\u00a5x";
                    var5_4 = "\u00b4|E0v\u00fc\"\u0081\u0019\u00af\u00fc\u00f8\u0086\u001f\u00a5x".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        ul_0.c = var6_1;
        ul_0.d = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x75B4;
        if (d[n11] == null) {
            ul_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

