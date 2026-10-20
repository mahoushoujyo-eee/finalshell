/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.E6;
import com.HI;
import com.HK;
import com.ky_2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;

/*
 * Renamed from com.Ph
 */
public class ph_0
implements Comparable {
    public final String I;
    public final Method Y;
    public final Field w;
    private int p;
    public final Class O;
    public final Type a;
    public final Class Q;
    public final boolean j;
    public final int c;
    public final int h;
    public final String N;
    private final E6 F;
    private final E6 A;
    public final boolean b;
    public final boolean Z;
    public final char[] L;
    public final boolean X;
    public final boolean s;
    public final boolean D;
    public final String J;
    public final String[] E;
    public final long x;
    private static int z;
    private static final String[] d;
    private static final String[] e;
    private static final long[] f;
    private static final Integer[] g;

    /*
     * Unable to fully structure code
     */
    public ph_0(String var1_1, Class var2_2, Class var3_3, Type var4_4, Field var5_5, int var6_6, int var7_7, int var8_8) {
        block35: {
            block33: {
                block34: {
                    block31: {
                        block32: {
                            block30: {
                                block26: {
                                    block27: {
                                        block29: {
                                            block24: {
                                                block25: {
                                                    v0 = ph_0.w();
                                                    super();
                                                    var9_9 = v0;
                                                    try {
                                                        this.p = 0;
                                                        if (var9_9 == 0) break block24;
                                                        if (var6_6 >= 0) break block25;
                                                    }
                                                    catch (SecurityException v1) {
                                                        throw ph_0.a(v1);
                                                    }
                                                    var6_6 = 0;
                                                }
                                                this.I = var1_1;
                                                this.Q = var2_2;
                                                this.O = var3_3;
                                                this.a = var4_4;
                                                this.Y = null;
                                                this.w = var5_5;
                                                this.p = var6_6;
                                                this.c = var7_7;
                                                this.h = var8_8;
                                                this.X = var3_3.isEnum();
                                            }
                                            try {
                                                if (var9_9 == 0) break block26;
                                                if (var5_5 != null) {
                                                }
                                                ** GOTO lbl58
                                            }
                                            catch (SecurityException v2) {
                                                throw ph_0.a(v2);
                                            }
                                            var10_10 = var5_5.getModifiers();
                                            try {
                                                block28: {
                                                    try {
                                                        try {
                                                            v3 = this;
                                                            v4 = var10_10 & 1;
                                                            if (var9_9 == 0) break block27;
                                                            if (v4 != 0) break block28;
                                                        }
                                                        catch (SecurityException v5) {
                                                            throw ph_0.a(v5);
                                                        }
                                                        if (this.Y != null) break block29;
                                                    }
                                                    catch (SecurityException v6) {
                                                        throw ph_0.a(v6);
                                                    }
                                                }
                                                v4 = 1;
                                                break block27;
                                            }
                                            catch (SecurityException v7) {
                                                throw ph_0.a(v7);
                                            }
                                        }
                                        v4 = 0;
                                    }
                                    try {
                                        v3.b = v4;
                                        this.Z = Modifier.isTransient(var10_10);
                                        if (var9_9 != 0) break block30;
lbl58:
                                        // 2 sources

                                        this.Z = false;
                                    }
                                    catch (SecurityException v8) {
                                        throw ph_0.a(v8);
                                    }
                                }
                                this.b = false;
                            }
                            try {
                                try {
                                    this.L = this.l();
                                    if (var9_9 == 0) break block31;
                                    if (var5_5 == null) break block32;
                                }
                                catch (SecurityException v9) {
                                    throw ph_0.a(v9);
                                }
                                B8.P(var5_5);
                            }
                            catch (SecurityException v10) {
                                throw ph_0.a(v10);
                            }
                        }
                        this.N = "";
                    }
                    try {
                        try {
                            v11 = this;
                            v12 = var5_5;
                            if (var9_9 == 0) break block33;
                            if (v12 != null) break block34;
                        }
                        catch (SecurityException v13) {
                            throw ph_0.a(v13);
                        }
                        v14 = null;
                        break block35;
                    }
                    catch (SecurityException v15) {
                        throw ph_0.a(v15);
                    }
                }
                v12 = var5_5;
            }
            v14 = (E6)B8.f(v12, E6.class);
        }
        try {
            v11.F = v14;
            this.A = null;
            this.j = false;
            this.s = false;
            this.D = false;
            this.J = null;
            this.E = new String[0];
            this.x = this.v(var1_1, this.F);
            if (ky_2.F() != null) {
                ph_0.S(++var9_9);
            }
        }
        catch (SecurityException v16) {
            throw ph_0.a(v16);
        }
    }

    public ph_0(String string, Method method, Field field, Class clazz, Type type, int n10, int n11, int n12, E6 e6, E6 e62, String string2) {
        this(string, method, field, clazz, type, n10, n11, n12, e6, e62, string2, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ph_0(String var1_1, Method var2_2, Field var3_3, Class var4_4, Type var5_5, int var6_6, int var7_7, int var8_8, E6 var9_9, E6 var10_10, String var11_11, Map var12_12) {
        block135: {
            block136: {
                block140: {
                    block139: {
                        block137: {
                            block138: {
                                block134: {
                                    block132: {
                                        block133: {
                                            block131: {
                                                block130: {
                                                    block142: {
                                                        block125: {
                                                            block127: {
                                                                block129: {
                                                                    block128: {
                                                                        block126: {
                                                                            block124: {
                                                                                block123: {
                                                                                    block122: {
                                                                                        block121: {
                                                                                            block120: {
                                                                                                block141: {
                                                                                                    block116: {
                                                                                                        block117: {
                                                                                                            block118: {
                                                                                                                block119: {
                                                                                                                    block115: {
                                                                                                                        block113: {
                                                                                                                            block112: {
                                                                                                                                block104: {
                                                                                                                                    block105: {
                                                                                                                                        block109: {
                                                                                                                                            block111: {
                                                                                                                                                block110: {
                                                                                                                                                    block106: {
                                                                                                                                                        block108: {
                                                                                                                                                            block103: {
                                                                                                                                                                block102: {
                                                                                                                                                                    block101: {
                                                                                                                                                                        block100: {
                                                                                                                                                                            block99: {
                                                                                                                                                                                super();
                                                                                                                                                                                this.p = 0;
                                                                                                                                                                                var13_13 = ph_0.w();
                                                                                                                                                                                try {
                                                                                                                                                                                    v0 = var3_3;
                                                                                                                                                                                    if (var13_13 == 0) break block99;
                                                                                                                                                                                    if (v0 == null) break block100;
                                                                                                                                                                                }
                                                                                                                                                                                catch (SecurityException v1) {
                                                                                                                                                                                    throw ph_0.a(v1);
                                                                                                                                                                                }
                                                                                                                                                                                v0 = var3_3;
                                                                                                                                                                            }
                                                                                                                                                                            var14_14 = v0.getName();
                                                                                                                                                                            try {
                                                                                                                                                                                v2 = (int)var14_14.equals(var1_1);
                                                                                                                                                                                if (var13_13 == 0) break block101;
                                                                                                                                                                                if (v2 == 0) break block100;
                                                                                                                                                                            }
                                                                                                                                                                            catch (SecurityException v3) {
                                                                                                                                                                                throw ph_0.a(v3);
                                                                                                                                                                            }
                                                                                                                                                                            var1_1 = var14_14;
                                                                                                                                                                        }
                                                                                                                                                                        v2 = var6_6;
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        if (var13_13 == 0) break block102;
                                                                                                                                                                        if (v2 >= 0) break block103;
                                                                                                                                                                    }
                                                                                                                                                                    catch (SecurityException v4) {
                                                                                                                                                                        throw ph_0.a(v4);
                                                                                                                                                                    }
                                                                                                                                                                    v2 = 0;
                                                                                                                                                                }
                                                                                                                                                                var6_6 = v2;
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                this.I = var1_1;
                                                                                                                                                                this.Y = var2_2;
                                                                                                                                                                this.w = var3_3;
                                                                                                                                                                this.p = var6_6;
                                                                                                                                                                this.c = var7_7;
                                                                                                                                                                this.h = var8_8;
                                                                                                                                                                this.F = var9_9;
                                                                                                                                                                this.A = var10_10;
                                                                                                                                                                if (var13_13 == 0) break block104;
                                                                                                                                                                if (var3_3 == null) break block105;
                                                                                                                                                            }
                                                                                                                                                            catch (SecurityException v5) {
                                                                                                                                                                throw ph_0.a(v5);
                                                                                                                                                            }
                                                                                                                                                            var14_15 = var3_3.getModifiers();
                                                                                                                                                            try {
                                                                                                                                                                block107: {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            v6 = this;
                                                                                                                                                                            v7 = var14_15 & 1;
                                                                                                                                                                            if (var13_13 == 0) break block106;
                                                                                                                                                                            if (v7 != 0) break block107;
                                                                                                                                                                        }
                                                                                                                                                                        catch (SecurityException v8) {
                                                                                                                                                                            throw ph_0.a(v8);
                                                                                                                                                                        }
                                                                                                                                                                        if (var2_2 != null) break block108;
                                                                                                                                                                    }
                                                                                                                                                                    catch (SecurityException v9) {
                                                                                                                                                                        throw ph_0.a(v9);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                v7 = 1;
                                                                                                                                                                break block106;
                                                                                                                                                            }
                                                                                                                                                            catch (SecurityException v10) {
                                                                                                                                                                throw ph_0.a(v10);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        v7 = 0;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                v6.b = v7;
                                                                                                                                                                v11 = this;
                                                                                                                                                                v12 = Modifier.isTransient(var14_15);
                                                                                                                                                                if (var13_13 == 0) break block109;
                                                                                                                                                                if (v12) break block110;
                                                                                                                                                            }
                                                                                                                                                            catch (SecurityException v13) {
                                                                                                                                                                throw ph_0.a(v13);
                                                                                                                                                            }
                                                                                                                                                            v12 = B8.w(var2_2);
                                                                                                                                                            if (var13_13 == 0) break block109;
                                                                                                                                                        }
                                                                                                                                                        catch (SecurityException v14) {
                                                                                                                                                            throw ph_0.a(v14);
                                                                                                                                                        }
                                                                                                                                                        if (!v12) break block111;
                                                                                                                                                    }
                                                                                                                                                    catch (SecurityException v15) {
                                                                                                                                                        throw ph_0.a(v15);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                v12 = true;
                                                                                                                                                break block109;
                                                                                                                                            }
                                                                                                                                            v12 = false;
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            v11.Z = v12;
                                                                                                                                            if (var13_13 != 0) break block112;
                                                                                                                                            ky_2.K(new String[4]);
                                                                                                                                        }
                                                                                                                                        catch (SecurityException v16) {
                                                                                                                                            throw ph_0.a(v16);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    this.b = false;
                                                                                                                                }
                                                                                                                                this.Z = B8.w(var2_2);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                v17 = var11_11;
                                                                                                                                if (var13_13 == 0) break block113;
                                                                                                                                if (v17 != null) {
                                                                                                                                }
                                                                                                                                ** GOTO lbl128
                                                                                                                            }
                                                                                                                            catch (SecurityException v18) {
                                                                                                                                throw ph_0.a(v18);
                                                                                                                            }
                                                                                                                            v17 = var11_11;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            block114: {
                                                                                                                                try {
                                                                                                                                    if (v17.length() <= 0) break block114;
                                                                                                                                    this.N = var11_11;
                                                                                                                                    if (var13_13 != 0) break block115;
                                                                                                                                }
                                                                                                                                catch (SecurityException v19) {
                                                                                                                                    throw ph_0.a(v19);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            this.N = "";
                                                                                                                        }
                                                                                                                        catch (SecurityException v20) {
                                                                                                                            throw ph_0.a(v20);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var14_16 = null;
                                                                                                                    var15_17 = this.Z();
                                                                                                                    this.x = this.v(var1_1, var15_17);
                                                                                                                    var16_18 = 0;
                                                                                                                    try {
                                                                                                                        if (var13_13 == 0) break block116;
                                                                                                                        if (var15_17 == null) break block117;
                                                                                                                    }
                                                                                                                    catch (SecurityException v21) {
                                                                                                                        throw ph_0.a(v21);
                                                                                                                    }
                                                                                                                    var14_16 = var15_17.q();
                                                                                                                    try {
                                                                                                                        v22 = var14_16.trim().length();
                                                                                                                        if (var13_13 == 0) break block118;
                                                                                                                        if (v22 != 0) break block119;
                                                                                                                    }
                                                                                                                    catch (SecurityException v23) {
                                                                                                                        throw ph_0.a(v23);
                                                                                                                    }
                                                                                                                    var14_16 = null;
                                                                                                                }
                                                                                                                v22 = (int)var15_17.i();
                                                                                                            }
                                                                                                            var16_18 = v22;
                                                                                                            this.D = var15_17.t();
                                                                                                            this.E = var15_17.X();
                                                                                                            break block141;
                                                                                                        }
                                                                                                        var16_18 = 0;
                                                                                                        this.D = false;
                                                                                                    }
                                                                                                    this.E = new String[0];
                                                                                                }
                                                                                                try {
                                                                                                    this.J = var14_16;
                                                                                                    this.L = this.l();
                                                                                                    v24 = var2_2;
                                                                                                    if (var13_13 == 0) break block120;
                                                                                                    if (v24 == null) break block121;
                                                                                                }
                                                                                                catch (SecurityException v25) {
                                                                                                    throw ph_0.a(v25);
                                                                                                }
                                                                                                v24 = var2_2;
                                                                                            }
                                                                                            B8.P(v24);
                                                                                        }
                                                                                        try {
                                                                                            v26 = var3_3;
                                                                                            if (var13_13 == 0) break block122;
                                                                                            if (v26 == null) break block123;
                                                                                        }
                                                                                        catch (SecurityException v27) {
                                                                                            throw ph_0.a(v27);
                                                                                        }
                                                                                        v26 = var3_3;
                                                                                    }
                                                                                    B8.P(v26);
                                                                                }
                                                                                var17_19 = false;
                                                                                try {
                                                                                    v28 = var2_2;
                                                                                    if (var13_13 == 0) break block124;
                                                                                    if (v28 == null) break block125;
                                                                                }
                                                                                catch (SecurityException v29) {
                                                                                    throw ph_0.a(v29);
                                                                                }
                                                                                v28 = var2_2;
                                                                            }
                                                                            var20_20 /* !! */  = v28.getParameterTypes();
                                                                            try {
                                                                                v30 = var20_20 /* !! */ .length;
                                                                                v31 = 1;
                                                                                if (var13_13 == 0) break block126;
                                                                                if (v30 == v31) {
                                                                                }
                                                                                ** GOTO lbl215
                                                                            }
                                                                            catch (SecurityException v32) {
                                                                                throw ph_0.a(v32);
                                                                            }
                                                                            var19_21 = var20_20 /* !! */ [0];
                                                                            var18_22 = var2_2.getGenericParameterTypes()[0];
                                                                            try {
                                                                                try {
                                                                                    if (var13_13 != 0) break block127;
lbl215:
                                                                                    // 2 sources

                                                                                    v33 = var20_20 /* !! */ ;
                                                                                    if (var13_13 == 0) break block128;
                                                                                }
                                                                                catch (SecurityException v34) {
                                                                                    throw ph_0.a(v34);
                                                                                }
                                                                                v30 = v33.length;
                                                                                v31 = 2;
                                                                            }
                                                                            catch (SecurityException v35) {
                                                                                throw ph_0.a(v35);
                                                                            }
                                                                        }
                                                                        if (v30 != v31) ** GOTO lbl253
                                                                        v33 = var20_20 /* !! */ ;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v36 = v33[0];
                                                                                if (var13_13 == 0) break block129;
                                                                                if (v36 == String.class) {
                                                                                }
                                                                                ** GOTO lbl253
                                                                            }
                                                                            catch (SecurityException v37) {
                                                                                throw ph_0.a(v37);
                                                                            }
                                                                            v36 = var20_20 /* !! */ [1];
                                                                            if (var13_13 == 0) break block129;
                                                                        }
                                                                        catch (SecurityException v38) {
                                                                            throw ph_0.a(v38);
                                                                        }
                                                                        if (v36 == Object.class) {
                                                                        }
                                                                        ** GOTO lbl253
                                                                    }
                                                                    catch (SecurityException v39) {
                                                                        throw ph_0.a(v39);
                                                                    }
                                                                    var19_21 = var20_20 /* !! */ [0];
                                                                    var18_22 = var19_21;
                                                                    try {
                                                                        if (var13_13 != 0) break block127;
lbl253:
                                                                        // 4 sources

                                                                        v36 = var2_2.getReturnType();
                                                                    }
                                                                    catch (SecurityException v40) {
                                                                        throw ph_0.a(v40);
                                                                    }
                                                                }
                                                                var19_21 = v36;
                                                                var18_22 = var2_2.getGenericReturnType();
                                                                var17_19 = true;
                                                            }
                                                            this.Q = var2_2.getDeclaringClass();
                                                            if (var13_13 != 0) break block142;
                                                        }
                                                        var19_21 = var3_3.getType();
                                                        var18_22 = var3_3.getGenericType();
                                                        this.Q = var3_3.getDeclaringClass();
                                                        var17_19 = Modifier.isFinal(var3_3.getModifiers());
                                                    }
                                                    try {
                                                        try {
                                                            this.j = var17_19;
                                                            v41 = this;
                                                            if (var16_18 == 0 || var19_21 != String.class) break block130;
                                                        }
                                                        catch (SecurityException v42) {
                                                            throw ph_0.a(v42);
                                                        }
                                                        v43 = true;
                                                        break block131;
                                                    }
                                                    catch (SecurityException v44) {
                                                        throw ph_0.a(v44);
                                                    }
                                                }
                                                v43 = false;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v41.s = v43;
                                                                v45 = var4_4;
                                                                if (var13_13 == 0) break block132;
                                                                if (v45 == null) break block133;
                                                            }
                                                            catch (SecurityException v46) {
                                                                throw ph_0.a(v46);
                                                            }
                                                            v45 = var19_21;
                                                            if (var13_13 == 0) break block132;
                                                        }
                                                        catch (SecurityException v47) {
                                                            throw ph_0.a(v47);
                                                        }
                                                        if (v45 != Object.class) break block133;
                                                    }
                                                    catch (SecurityException v48) {
                                                        throw ph_0.a(v48);
                                                    }
                                                    v45 = var18_22;
                                                    if (var13_13 == 0) break block132;
                                                }
                                                catch (SecurityException v49) {
                                                    throw ph_0.a(v49);
                                                }
                                                if (!(v45 instanceof TypeVariable)) break block133;
                                            }
                                            catch (SecurityException v50) {
                                                throw ph_0.a(v50);
                                            }
                                            var20_20 /* !! */  = (TypeVariable)var18_22;
                                            var21_23 = ph_0.e(var4_4, var5_5, var20_20 /* !! */ );
                                            try {
                                                try {
                                                    v51 /* !! */  = var21_23;
                                                    if (var13_13 == 0) break block134;
                                                    if (v51 /* !! */  == null) break block133;
                                                }
                                                catch (SecurityException v52) {
                                                    throw ph_0.a(v52);
                                                }
                                                this.O = B8.x(var21_23);
                                                this.a = var21_23;
                                                this.X = var19_21.isEnum();
                                                return;
                                            }
                                            catch (SecurityException v53) {
                                                throw ph_0.a(v53);
                                            }
                                        }
                                        v45 = var18_22;
                                    }
                                    var20_20 /* !! */  = v45;
                                    try {
                                        if (var13_13 == 0) break block135;
                                        v51 /* !! */  = var18_22;
                                    }
                                    catch (SecurityException v54) {
                                        throw ph_0.a(v54);
                                    }
                                }
                                try {
                                    try {
                                        if (v51 /* !! */  instanceof Class) break block136;
                                        v55 = var4_4;
                                        v56 = var5_5;
                                        if (var13_13 == 0) break block137;
                                    }
                                    catch (SecurityException v57) {
                                        throw ph_0.a(v57);
                                    }
                                    if (v56 == null) break block138;
                                }
                                catch (SecurityException v58) {
                                    throw ph_0.a(v58);
                                }
                                v56 = var5_5;
                                break block137;
                            }
                            v56 = var4_4;
                        }
                        var20_20 /* !! */  = ph_0.I(v55, v56, var18_22, var12_12);
                        try {
                            try {
                                try {
                                    if (var13_13 == 0) break block135;
                                    if (var20_20 /* !! */  == var18_22) break block136;
                                }
                                catch (SecurityException v59) {
                                    throw ph_0.a(v59);
                                }
                                v60 = var20_20 /* !! */  instanceof ParameterizedType;
                                if (var13_13 == 0) break block139;
                            }
                            catch (SecurityException v61) {
                                throw ph_0.a(v61);
                            }
                            if (v60) {
                            }
                            ** GOTO lbl383
                        }
                        catch (SecurityException v62) {
                            throw ph_0.a(v62);
                        }
                        var19_21 = B8.x(var20_20 /* !! */ );
                        try {
                            try {
                                if (var13_13 != 0) break block136;
lbl383:
                                // 2 sources

                                v63 /* !! */  = var20_20 /* !! */ ;
                                if (var13_13 == 0) break block140;
                            }
                            catch (SecurityException v64) {
                                throw ph_0.a(v64);
                            }
                            v60 = v63 /* !! */  instanceof Class;
                        }
                        catch (SecurityException v65) {
                            throw ph_0.a(v65);
                        }
                    }
                    if (!v60) break block136;
                    v63 /* !! */  = var20_20 /* !! */ ;
                }
                var19_21 = B8.x(v63 /* !! */ );
            }
            this.a = var20_20 /* !! */ ;
            this.O = var19_21;
            this.X = var19_21.isEnum();
        }
    }

    private long v(String string, E6 e6) {
        String string2;
        block8: {
            block7: {
                E6 e62;
                int n10;
                block6: {
                    n10 = ph_0.w();
                    try {
                        e62 = e6;
                        if (n10 == 0) break block6;
                        if (e62 == null) break block7;
                    }
                    catch (SecurityException securityException) {
                        throw ph_0.a(securityException);
                    }
                    e62 = e6;
                }
                try {
                    try {
                        string2 = e62.W();
                        if (n10 == 0) break block8;
                        if (string2.length() == 0) break block7;
                    }
                    catch (SecurityException securityException) {
                        throw ph_0.a(securityException);
                    }
                    return B8.o(string);
                }
                catch (SecurityException securityException) {
                    throw ph_0.a(securityException);
                }
            }
            string2 = string;
        }
        return B8.A(string2);
    }

    protected char[] l() {
        int n10 = this.I.length();
        char[] cArray = new char[n10 + 3];
        this.I.getChars(0, this.I.length(), cArray, 1);
        cArray[0] = ph_0.a(6529, 1377286997616063244L);
        cArray[n10 + 1] = ph_0.a(19880, 2702823453134104358L);
        cArray[n10 + 2] = ph_0.a(17537, 5716825889897000462L);
        return cArray;
    }

    public Annotation m(Class clazz) {
        Annotation annotation;
        block17: {
            Annotation annotation2;
            block18: {
                Field field;
                block19: {
                    int n10;
                    block16: {
                        Method method;
                        block15: {
                            n10 = ph_0.u();
                            try {
                                if (clazz == E6.class) {
                                    return this.Z();
                                }
                            }
                            catch (SecurityException securityException) {
                                throw ph_0.a(securityException);
                            }
                            annotation2 = null;
                            try {
                                try {
                                    method = this.Y;
                                    if (n10 != 0) break block15;
                                    if (method == null) break block16;
                                }
                                catch (SecurityException securityException) {
                                    throw ph_0.a(securityException);
                                }
                                method = this.Y;
                            }
                            catch (SecurityException securityException) {
                                throw ph_0.a(securityException);
                            }
                        }
                        annotation2 = B8.J(method, clazz);
                    }
                    try {
                        try {
                            try {
                                try {
                                    annotation = annotation2;
                                    if (n10 != 0) break block17;
                                    if (annotation != null) break block18;
                                }
                                catch (SecurityException securityException) {
                                    throw ph_0.a(securityException);
                                }
                                field = this.w;
                                if (n10 != 0) break block19;
                            }
                            catch (SecurityException securityException) {
                                throw ph_0.a(securityException);
                            }
                            if (field == null) break block18;
                        }
                        catch (SecurityException securityException) {
                            throw ph_0.a(securityException);
                        }
                        field = this.w;
                    }
                    catch (SecurityException securityException) {
                        throw ph_0.a(securityException);
                    }
                }
                annotation2 = B8.f(field, clazz);
            }
            annotation = annotation2;
        }
        return annotation;
    }

    public static Type O(Class clazz, Type type, Type type2) {
        return ph_0.I(clazz, type, type2, null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Type I(Class var0, Type var1_1, Type var2_2, Map var3_3) {
        block55: {
            block62: {
                block56: {
                    block57: {
                        block59: {
                            block61: {
                                block60: {
                                    block58: {
                                        block52: {
                                            block53: {
                                                block50: {
                                                    block51: {
                                                        block46: {
                                                            block47: {
                                                                block48: {
                                                                    block49: {
                                                                        block44: {
                                                                            block45: {
                                                                                block42: {
                                                                                    block43: {
                                                                                        var4_4 = ph_0.w();
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v0 /* !! */  = var0;
                                                                                                    if (var4_4 == 0) break block42;
                                                                                                    if (v0 /* !! */  == null) break block43;
                                                                                                }
                                                                                                catch (SecurityException v1) {
                                                                                                    throw ph_0.a(v1);
                                                                                                }
                                                                                                v2 = var1_1;
                                                                                                if (var4_4 == 0) break block44;
                                                                                            }
                                                                                            catch (SecurityException v3) {
                                                                                                throw ph_0.a(v3);
                                                                                            }
                                                                                            if (v2 != null) break block45;
                                                                                        }
                                                                                        catch (SecurityException v4) {
                                                                                            throw ph_0.a(v4);
                                                                                        }
                                                                                    }
                                                                                    v0 /* !! */  = var2_2;
                                                                                }
                                                                                return v0 /* !! */ ;
                                                                            }
                                                                            v2 = var2_2;
                                                                        }
                                                                        try {
                                                                            v5 = v2 instanceof GenericArrayType;
                                                                            if (var4_4 == 0) break block46;
                                                                            if (!v5) break block47;
                                                                        }
                                                                        catch (SecurityException v6) {
                                                                            throw ph_0.a(v6);
                                                                        }
                                                                        var5_5 = (GenericArrayType)var2_2;
                                                                        var6_7 = var5_5.getGenericComponentType();
                                                                        var7_9 = ph_0.I(var0, var1_1, var6_7, var3_3);
                                                                        try {
                                                                            v7 = var6_7;
                                                                            if (var4_4 == 0) break block48;
                                                                            if (v7 == var7_9) break block49;
                                                                        }
                                                                        catch (SecurityException v8) {
                                                                            throw ph_0.a(v8);
                                                                        }
                                                                        var8_11 = Array.newInstance(B8.x(var7_9), 0).getClass();
                                                                        return var8_11;
                                                                    }
                                                                    v7 = var2_2;
                                                                }
                                                                return v7;
                                                            }
                                                            v5 = B8.A(var1_1);
                                                        }
                                                        try {
                                                            try {
                                                                if (var4_4 == 0) break block50;
                                                                if (v5) break block51;
                                                            }
                                                            catch (SecurityException v9) {
                                                                throw ph_0.a(v9);
                                                            }
                                                            return var2_2;
                                                        }
                                                        catch (SecurityException v10) {
                                                            throw ph_0.a(v10);
                                                        }
                                                    }
                                                    v5 = var2_2 instanceof TypeVariable;
                                                }
                                                try {
                                                    if (var4_4 == 0) break block52;
                                                    if (!v5) break block53;
                                                }
                                                catch (SecurityException v11) {
                                                    throw ph_0.a(v11);
                                                }
                                                var5_6 = (ParameterizedType)B8.U(var1_1);
                                                var6_8 = B8.x(var5_6);
                                                var7_10 = (TypeVariable<Class<?>>[])var2_2;
                                                var8_12 = var6_8.getTypeParameters();
                                                for (var9_13 = 0; var9_13 < ((TypeVariable<Class<T>>[])var8_12).length; ++var9_13) {
                                                    block54: {
                                                        try {
                                                            try {
                                                                v12 = var8_12[var9_13];
                                                                if (var4_4 == 0) break block54;
                                                                v5 = v12.getName().equals(var7_10.getName());
                                                                if (var4_4 == 0) break block52;
                                                            }
                                                            catch (SecurityException v13) {
                                                                throw ph_0.a(v13);
                                                            }
                                                            if (!v5) continue;
                                                        }
                                                        catch (SecurityException v14) {
                                                            throw ph_0.a(v14);
                                                        }
                                                        var2_2 = var5_6.getActualTypeArguments()[var9_13];
                                                        v12 = var2_2;
                                                    }
                                                    return v12;
                                                }
                                            }
                                            try {
                                                v15 = var2_2;
                                                if (var4_4 == 0) break block55;
                                                v5 = v15 instanceof ParameterizedType;
                                            }
                                            catch (SecurityException v16) {
                                                throw ph_0.a(v16);
                                            }
                                        }
                                        if (!v5) break block62;
                                        var5_6 = (ParameterizedType)var2_2;
                                        var6_8 = var5_6.getActualTypeArguments();
                                        var9_13 = ph_0.Z((Type[])var6_8, var3_3);
                                        try {
                                            try {
                                                try {
                                                    v17 = var9_13;
                                                    if (var4_4 == 0) break block56;
                                                    if (v17 != 0) break block57;
                                                }
                                                catch (SecurityException v18) {
                                                    throw ph_0.a(v18);
                                                }
                                                v19 = var1_1 instanceof ParameterizedType;
                                                if (var4_4 == 0) break block58;
                                            }
                                            catch (SecurityException v20) {
                                                throw ph_0.a(v20);
                                            }
                                            if (v19) {
                                            }
                                            ** GOTO lbl131
                                        }
                                        catch (SecurityException v21) {
                                            throw ph_0.a(v21);
                                        }
                                        var8_12 = (ParameterizedType)var1_1;
                                        var7_10 = var0.getTypeParameters();
                                        try {
                                            try {
                                                if (var4_4 != 0) break block59;
lbl131:
                                                // 2 sources

                                                v22 = var0.getGenericSuperclass();
                                                if (var4_4 == 0) break block60;
                                            }
                                            catch (SecurityException v23) {
                                                throw ph_0.a(v23);
                                            }
                                            v19 = v22 instanceof ParameterizedType;
                                        }
                                        catch (SecurityException v24) {
                                            throw ph_0.a(v24);
                                        }
                                    }
                                    try {
                                        if (!v19) break block61;
                                        v22 = var0.getGenericSuperclass();
                                    }
                                    catch (SecurityException v25) {
                                        throw ph_0.a(v25);
                                    }
                                }
                                var8_12 = (ParameterizedType)v22;
                                var7_10 = var0.getSuperclass().getTypeParameters();
                                if (var4_4 != 0) break block59;
                            }
                            var8_12 = var5_6;
                            var7_10 = var1_1.getClass().getTypeParameters();
                        }
                        var9_13 = (int)ph_0.y((Type[])var6_8, var7_10, var8_12.getActualTypeArguments());
                    }
                    v17 = var9_13;
                }
                if (v17 != 0) {
                    var2_2 = HI.V(new HK((Type[])var6_8, var5_6.getOwnerType(), var5_6.getRawType()));
                    return var2_2;
                }
            }
            v15 = var2_2;
        }
        return v15;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean Z(Type[] var0, Map var1_1) {
        block30: {
            block28: {
                block29: {
                    block27: {
                        var2_2 = ph_0.w();
                        try {
                            v0 = var1_1;
                            if (var2_2 == 0) break block27;
                            if (v0 != null) {
                            }
                            ** GOTO lbl20
                        }
                        catch (SecurityException v1) {
                            throw ph_0.a(v1);
                        }
                        v0 = var1_1;
                    }
                    try {
                        try {
                            v2 = v0.size();
                            if (var2_2 == 0) break block28;
                            if (v2) break block29;
                        }
                        catch (SecurityException v3) {
                            throw ph_0.a(v3);
                        }
lbl20:
                        // 2 sources

                        return false;
                    }
                    catch (SecurityException v4) {
                        throw ph_0.a(v4);
                    }
                }
                v2 = false;
            }
            var3_3 = v2;
            for (var4_4 = 0; var4_4 < var0.length; ++var4_4) {
                block35: {
                    block34: {
                        block31: {
                            block33: {
                                block32: {
                                    var5_5 = var0[var4_4];
                                    try {
                                        try {
                                            v5 = var5_5 instanceof ParameterizedType;
                                            if (var2_2 == 0) break block30;
                                            if (var2_2 == 0) break block31;
                                        }
                                        catch (SecurityException v6) {
                                            throw ph_0.a(v6);
                                        }
                                        if (v5) {
                                        }
                                        ** GOTO lbl63
                                    }
                                    catch (SecurityException v7) {
                                        throw ph_0.a(v7);
                                    }
                                    var6_6 = (ParameterizedType)var5_5;
                                    var7_7 = var6_6.getActualTypeArguments();
                                    var8_8 = ph_0.Z(var7_7, var1_1);
                                    try {
                                        try {
                                            v8 = var8_8;
                                            if (var2_2 == 0) break block32;
                                            if (!v8) break block33;
                                        }
                                        catch (SecurityException v9) {
                                            throw ph_0.a(v9);
                                        }
                                        var0[var4_4] = HI.V(new HK(var7_7, var6_6.getOwnerType(), var6_6.getRawType()));
                                        v8 = true;
                                    }
                                    catch (SecurityException v10) {
                                        throw ph_0.a(v10);
                                    }
                                }
                                var3_3 = v8;
                            }
                            try {
                                if (var2_2 != 0) continue;
lbl63:
                                // 2 sources

                                v11 = var5_5 instanceof TypeVariable;
                            }
                            catch (SecurityException v12) {
                                throw ph_0.a(v12);
                            }
                        }
                        try {
                            try {
                                if (var2_2 == 0) break block34;
                                if (!v11) continue;
                            }
                            catch (SecurityException v13) {
                                throw ph_0.a(v13);
                            }
                            v11 = var1_1.containsKey(var5_5);
                        }
                        catch (SecurityException v14) {
                            throw ph_0.a(v14);
                        }
                    }
                    try {
                        try {
                            if (var2_2 == 0) break block35;
                            if (!v11) continue;
                        }
                        catch (SecurityException v15) {
                            throw ph_0.a(v15);
                        }
                        var0[var4_4] = (Type)var1_1.get(var5_5);
                        v11 = true;
                    }
                    catch (SecurityException v16) {
                        throw ph_0.a(v16);
                    }
                }
                var3_3 = v11;
                if (var2_2 != 0) continue;
            }
            v5 = var3_3;
        }
        return v5;
    }

    /*
     * Unable to fully structure code
     */
    private static boolean y(Type[] var0, TypeVariable[] var1_1, Type[] var2_2) {
        block29: {
            block27: {
                block28: {
                    var3_3 = ph_0.w();
                    try {
                        block26: {
                            try {
                                try {
                                    if (var2_2 == null) break block26;
                                    v0 = var1_1.length;
                                    if (var3_3 == 0) break block27;
                                }
                                catch (SecurityException v1) {
                                    throw ph_0.a(v1);
                                }
                                if (v0) break block28;
                            }
                            catch (SecurityException v2) {
                                throw ph_0.a(v2);
                            }
                        }
                        return false;
                    }
                    catch (SecurityException v3) {
                        throw ph_0.a(v3);
                    }
                }
                v0 = false;
            }
            var4_4 = v0;
            var5_5 = 0;
            block22: while (true) {
                v4 = var5_5;
                block23: while (v4 < var0.length) {
                    block33: {
                        block34: {
                            block30: {
                                block32: {
                                    block31: {
                                        var6_6 = var0[var5_5];
                                        try {
                                            try {
                                                v5 = var6_6 instanceof ParameterizedType;
                                                if (var3_3 == 0) break block29;
                                                if (var3_3 == 0) break block30;
                                            }
                                            catch (SecurityException v6) {
                                                throw ph_0.a(v6);
                                            }
                                            if (v5) {
                                            }
                                            ** GOTO lbl62
                                        }
                                        catch (SecurityException v7) {
                                            throw ph_0.a(v7);
                                        }
                                        var7_7 = (ParameterizedType)var6_6;
                                        var8_9 = var7_7.getActualTypeArguments();
                                        var9_10 = ph_0.y(var8_9, var1_1, var2_2);
                                        try {
                                            try {
                                                v8 = var9_10;
                                                if (var3_3 == 0) break block31;
                                                if (!v8) break block32;
                                            }
                                            catch (SecurityException v9) {
                                                throw ph_0.a(v9);
                                            }
                                            var0[var5_5] = HI.V(new HK(var8_9, var7_7.getOwnerType(), var7_7.getRawType()));
                                            v8 = true;
                                        }
                                        catch (SecurityException v10) {
                                            throw ph_0.a(v10);
                                        }
                                    }
                                    var4_4 = v8;
                                }
                                try {
                                    if (var3_3 != 0) break block33;
lbl62:
                                    // 2 sources

                                    v11 = var6_6 instanceof TypeVariable;
                                }
                                catch (SecurityException v12) {
                                    throw ph_0.a(v12);
                                }
                            }
                            try {
                                if (var3_3 == 0) break block34;
                                if (v11 == 0) break block33;
                            }
                            catch (SecurityException v13) {
                                throw ph_0.a(v13);
                            }
                            v11 = var7_8 = 0;
                        }
                        while (var7_8 < var1_1.length) {
                            block36: {
                                block35: {
                                    v4 = (int)var6_6.equals(var1_1[var7_8]);
                                    if (var3_3 == 0) continue block23;
                                    try {
                                        try {
                                            if (var3_3 == 0) break block35;
                                            if (v4 == 0) break block36;
                                        }
                                        catch (SecurityException v14) {
                                            throw ph_0.a(v14);
                                        }
                                        var0[var5_5] = var2_2[var7_8];
                                        v15 = true;
                                    }
                                    catch (SecurityException v16) {
                                        throw ph_0.a(v16);
                                    }
                                }
                                var4_4 = v15;
                            }
                            ++var7_8;
                            if (var3_3 != 0) continue;
                        }
                    }
                    ++var5_5;
                    if (var3_3 != 0) continue block22;
                }
                break;
            }
            v5 = var4_4;
        }
        return v5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Type e(Class clazz, Type type, TypeVariable typeVariable) {
        Class clazz2;
        Type type2;
        Type[] typeArray;
        int n10;
        Class clazz3;
        block43: {
            block42: {
                block39: {
                    Type type3;
                    block40: {
                        Type type4;
                        block41: {
                            block38: {
                                Object d2;
                                block37: {
                                    Object d3 = typeVariable.getGenericDeclaration();
                                    clazz3 = null;
                                    n10 = ph_0.w();
                                    try {
                                        try {
                                            d2 = d3;
                                            if (n10 == 0) break block37;
                                            if (!(d2 instanceof Class)) break block38;
                                        }
                                        catch (SecurityException securityException) {
                                            throw ph_0.a(securityException);
                                        }
                                        d2 = typeVariable.getGenericDeclaration();
                                    }
                                    catch (SecurityException securityException) {
                                        throw ph_0.a(securityException);
                                    }
                                }
                                clazz3 = (Class)d2;
                            }
                            typeArray = null;
                            try {
                                try {
                                    try {
                                        try {
                                            type3 = clazz3;
                                            if (n10 == 0) break block39;
                                            if (type3 != clazz) break block40;
                                        }
                                        catch (SecurityException securityException) {
                                            throw ph_0.a(securityException);
                                        }
                                        type4 = type;
                                        if (n10 == 0) break block41;
                                    }
                                    catch (SecurityException securityException) {
                                        throw ph_0.a(securityException);
                                    }
                                    if (!(type4 instanceof ParameterizedType)) break block42;
                                }
                                catch (SecurityException securityException) {
                                    throw ph_0.a(securityException);
                                }
                                type4 = type;
                            }
                            catch (SecurityException securityException) {
                                throw ph_0.a(securityException);
                            }
                        }
                        type2 = (ParameterizedType)type4;
                        typeArray = type2.getActualTypeArguments();
                        break block42;
                    }
                    type3 = type2 = clazz;
                }
                while (type2 != null) {
                    block46: {
                        block47: {
                            Type type5;
                            block45: {
                                Class clazz4;
                                block44: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    clazz2 = type2;
                                                    if (n10 == 0) break block43;
                                                    clazz4 = Object.class;
                                                    if (n10 == 0) break block44;
                                                }
                                                catch (SecurityException securityException) {
                                                    throw ph_0.a(securityException);
                                                }
                                                if (clazz2 == clazz4) break;
                                            }
                                            catch (SecurityException securityException) {
                                                throw ph_0.a(securityException);
                                            }
                                            type5 = type2;
                                            if (n10 == 0) break block45;
                                        }
                                        catch (SecurityException securityException) {
                                            throw ph_0.a(securityException);
                                        }
                                        clazz4 = clazz3;
                                    }
                                    catch (SecurityException securityException) {
                                        throw ph_0.a(securityException);
                                    }
                                }
                                try {
                                    if (type5 == clazz4) break;
                                    type5 = ((Class)type2).getGenericSuperclass();
                                }
                                catch (SecurityException securityException) {
                                    throw ph_0.a(securityException);
                                }
                            }
                            Type type6 = type5;
                            try {
                                if (n10 == 0) break block46;
                                if (!(type6 instanceof ParameterizedType)) break block47;
                            }
                            catch (SecurityException securityException) {
                                throw ph_0.a(securityException);
                            }
                            ParameterizedType parameterizedType = (ParameterizedType)type6;
                            Type[] typeArray2 = parameterizedType.getActualTypeArguments();
                            ph_0.y(typeArray2, ((Class)type2).getTypeParameters(), typeArray);
                            typeArray = typeArray2;
                        }
                        type2 = ((Class)type2).getSuperclass();
                    }
                    if (n10 != 0) continue;
                }
            }
            try {
                if (typeArray == null) return null;
                clazz2 = clazz3;
            }
            catch (SecurityException securityException) {
                throw ph_0.a(securityException);
            }
        }
        try {
            if (clazz2 == null) {
                return null;
            }
        }
        catch (SecurityException securityException) {
            throw ph_0.a(securityException);
        }
        type2 = null;
        TypeVariable<Class<T>>[] typeVariableArray = clazz3.getTypeParameters();
        int n11 = 0;
        while (true) {
            block48: {
                try {
                    Type type7;
                    try {
                        try {
                            if (n11 >= typeVariableArray.length) return type2;
                            type7 = typeVariable;
                            if (n10 == 0) return type7;
                        }
                        catch (SecurityException securityException) {
                            throw ph_0.a(securityException);
                        }
                        if (!type7.equals(typeVariableArray[n11])) break block48;
                    }
                    catch (SecurityException securityException) {
                        throw ph_0.a(securityException);
                    }
                    type7 = typeArray[n11];
                    return type7;
                }
                catch (SecurityException securityException) {
                    throw ph_0.a(securityException);
                }
            }
            ++n11;
        }
    }

    public String toString() {
        return this.I;
    }

    public Member r() {
        ph_0 ph_02;
        block4: {
            block5: {
                int n10 = ph_0.w();
                try {
                    try {
                        ph_02 = this;
                        if (n10 == 0) break block4;
                        if (ph_02.Y == null) break block5;
                    }
                    catch (SecurityException securityException) {
                        throw ph_0.a(securityException);
                    }
                    return this.Y;
                }
                catch (SecurityException securityException) {
                    throw ph_0.a(securityException);
                }
            }
            ph_02 = this;
        }
        return ph_02.w;
    }

    protected Class W() {
        block11: {
            Field field;
            block10: {
                ph_0 ph_02;
                int n10;
                block8: {
                    block9: {
                        n10 = ph_0.w();
                        try {
                            try {
                                ph_02 = this;
                                if (n10 == 0) break block8;
                                if (ph_02.Y == null) break block9;
                            }
                            catch (SecurityException securityException) {
                                throw ph_0.a(securityException);
                            }
                            return this.Y.getDeclaringClass();
                        }
                        catch (SecurityException securityException) {
                            throw ph_0.a(securityException);
                        }
                    }
                    ph_02 = this;
                }
                try {
                    try {
                        field = ph_02.w;
                        if (n10 == 0) break block10;
                        if (field == null) break block11;
                    }
                    catch (SecurityException securityException) {
                        throw ph_0.a(securityException);
                    }
                    field = this.w;
                }
                catch (SecurityException securityException) {
                    throw ph_0.a(securityException);
                }
            }
            return field.getDeclaringClass();
        }
        return null;
    }

    public int M(ph_0 ph_02) {
        int n10;
        block136: {
            block137: {
                int n11;
                block134: {
                    block135: {
                        block132: {
                            block133: {
                                block130: {
                                    block131: {
                                        block128: {
                                            block129: {
                                                int n12;
                                                block126: {
                                                    int n13;
                                                    block127: {
                                                        int n14;
                                                        block125: {
                                                            block124: {
                                                                Field field;
                                                                block123: {
                                                                    int n15;
                                                                    block122: {
                                                                        block121: {
                                                                            Field field2;
                                                                            block120: {
                                                                                block114: {
                                                                                    int n16;
                                                                                    block119: {
                                                                                        block117: {
                                                                                            Class clazz;
                                                                                            Class clazz2;
                                                                                            block118: {
                                                                                                Class clazz3;
                                                                                                Class clazz4;
                                                                                                block116: {
                                                                                                    block115: {
                                                                                                        block113: {
                                                                                                            block112: {
                                                                                                                int n17;
                                                                                                                block111: {
                                                                                                                    int n18;
                                                                                                                    block110: {
                                                                                                                        int n19;
                                                                                                                        block108: {
                                                                                                                            block109: {
                                                                                                                                block107: {
                                                                                                                                    ph_0 ph_03;
                                                                                                                                    block105: {
                                                                                                                                        block106: {
                                                                                                                                            n11 = ph_0.u();
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    ph_03 = ph_02;
                                                                                                                                                                                    if (n11 != 0) break block105;
                                                                                                                                                                                    if (ph_03.Y == null) break block106;
                                                                                                                                                                                }
                                                                                                                                                                                catch (SecurityException securityException) {
                                                                                                                                                                                    throw ph_0.a(securityException);
                                                                                                                                                                                }
                                                                                                                                                                                ph_03 = this;
                                                                                                                                                                                if (n11 != 0) break block105;
                                                                                                                                                                            }
                                                                                                                                                                            catch (SecurityException securityException) {
                                                                                                                                                                                throw ph_0.a(securityException);
                                                                                                                                                                            }
                                                                                                                                                                            if (ph_03.Y == null) break block106;
                                                                                                                                                                        }
                                                                                                                                                                        catch (SecurityException securityException) {
                                                                                                                                                                            throw ph_0.a(securityException);
                                                                                                                                                                        }
                                                                                                                                                                        n18 = ph_02.Y.isBridge() ? 1 : 0;
                                                                                                                                                                        if (n11 != 0) break block107;
                                                                                                                                                                    }
                                                                                                                                                                    catch (SecurityException securityException) {
                                                                                                                                                                        throw ph_0.a(securityException);
                                                                                                                                                                    }
                                                                                                                                                                    if (n18 == 0) break block106;
                                                                                                                                                                }
                                                                                                                                                                catch (SecurityException securityException) {
                                                                                                                                                                    throw ph_0.a(securityException);
                                                                                                                                                                }
                                                                                                                                                                n18 = this.Y.isBridge() ? 1 : 0;
                                                                                                                                                                if (n11 != 0) break block107;
                                                                                                                                                            }
                                                                                                                                                            catch (SecurityException securityException) {
                                                                                                                                                                throw ph_0.a(securityException);
                                                                                                                                                            }
                                                                                                                                                            if (n18 != 0) break block106;
                                                                                                                                                        }
                                                                                                                                                        catch (SecurityException securityException) {
                                                                                                                                                            throw ph_0.a(securityException);
                                                                                                                                                        }
                                                                                                                                                        n18 = ph_02.Y.getName().equals(this.Y.getName()) ? 1 : 0;
                                                                                                                                                        if (n11 != 0) break block107;
                                                                                                                                                    }
                                                                                                                                                    catch (SecurityException securityException) {
                                                                                                                                                        throw ph_0.a(securityException);
                                                                                                                                                    }
                                                                                                                                                    if (n18 == 0) break block106;
                                                                                                                                                }
                                                                                                                                                catch (SecurityException securityException) {
                                                                                                                                                    throw ph_0.a(securityException);
                                                                                                                                                }
                                                                                                                                                return 1;
                                                                                                                                            }
                                                                                                                                            catch (SecurityException securityException) {
                                                                                                                                                throw ph_0.a(securityException);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        ph_03 = this;
                                                                                                                                    }
                                                                                                                                    n18 = ph_03.p;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        n19 = ph_02.p;
                                                                                                                                        if (n11 != 0) break block108;
                                                                                                                                        if (n18 >= n19) break block109;
                                                                                                                                    }
                                                                                                                                    catch (SecurityException securityException) {
                                                                                                                                        throw ph_0.a(securityException);
                                                                                                                                    }
                                                                                                                                    return -1;
                                                                                                                                }
                                                                                                                                catch (SecurityException securityException) {
                                                                                                                                    throw ph_0.a(securityException);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                n18 = this.p;
                                                                                                                                if (n11 != 0) break block110;
                                                                                                                                n19 = ph_02.p;
                                                                                                                            }
                                                                                                                            catch (SecurityException securityException) {
                                                                                                                                throw ph_0.a(securityException);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (n18 > n19) {
                                                                                                                                return 1;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        catch (SecurityException securityException) {
                                                                                                                            throw ph_0.a(securityException);
                                                                                                                        }
                                                                                                                        n18 = this.I.compareTo(ph_02.I);
                                                                                                                    }
                                                                                                                    int n20 = n18;
                                                                                                                    try {
                                                                                                                        n17 = n20;
                                                                                                                        if (n11 != 0) break block111;
                                                                                                                        if (n17 == 0) break block112;
                                                                                                                    }
                                                                                                                    catch (SecurityException securityException) {
                                                                                                                        throw ph_0.a(securityException);
                                                                                                                    }
                                                                                                                    n17 = n20;
                                                                                                                }
                                                                                                                return n17;
                                                                                                            }
                                                                                                            clazz2 = this.W();
                                                                                                            clazz = ph_02.W();
                                                                                                            try {
                                                                                                                clazz4 = clazz2;
                                                                                                                if (n11 != 0) break block113;
                                                                                                                if (clazz4 == null) break block114;
                                                                                                            }
                                                                                                            catch (SecurityException securityException) {
                                                                                                                throw ph_0.a(securityException);
                                                                                                            }
                                                                                                            clazz4 = clazz;
                                                                                                        }
                                                                                                        try {
                                                                                                            if (n11 != 0) break block115;
                                                                                                            if (clazz4 == null) break block114;
                                                                                                        }
                                                                                                        catch (SecurityException securityException) {
                                                                                                            throw ph_0.a(securityException);
                                                                                                        }
                                                                                                        clazz4 = clazz2;
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            clazz3 = clazz;
                                                                                                            if (n11 != 0) break block116;
                                                                                                            if (clazz4 == clazz3) break block114;
                                                                                                        }
                                                                                                        catch (SecurityException securityException) {
                                                                                                            throw ph_0.a(securityException);
                                                                                                        }
                                                                                                        Class clazz3 = clazz2;
                                                                                                        clazz3 = clazz;
                                                                                                    }
                                                                                                    catch (SecurityException securityException) {
                                                                                                        throw ph_0.a(securityException);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        n16 = clazz4.isAssignableFrom(clazz3);
                                                                                                        if (n11 != 0) break block117;
                                                                                                        if (n16 == 0) break block118;
                                                                                                    }
                                                                                                    catch (SecurityException securityException) {
                                                                                                        throw ph_0.a(securityException);
                                                                                                    }
                                                                                                    return -1;
                                                                                                }
                                                                                                catch (SecurityException securityException) {
                                                                                                    throw ph_0.a(securityException);
                                                                                                }
                                                                                            }
                                                                                            n16 = clazz.isAssignableFrom(clazz2);
                                                                                        }
                                                                                        try {
                                                                                            if (n11 != 0) break block119;
                                                                                            if (n16 == 0) break block114;
                                                                                        }
                                                                                        catch (SecurityException securityException) {
                                                                                            throw ph_0.a(securityException);
                                                                                        }
                                                                                        n16 = 1;
                                                                                    }
                                                                                    return n16;
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        field2 = this.w;
                                                                                        if (n11 != 0) break block120;
                                                                                        if (field2 == null) break block121;
                                                                                    }
                                                                                    catch (SecurityException securityException) {
                                                                                        throw ph_0.a(securityException);
                                                                                    }
                                                                                    field2 = this.w;
                                                                                }
                                                                                catch (SecurityException securityException) {
                                                                                    throw ph_0.a(securityException);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (field2.getType() != this.O) break block121;
                                                                                n15 = 1;
                                                                                break block122;
                                                                            }
                                                                            catch (SecurityException securityException) {
                                                                                throw ph_0.a(securityException);
                                                                            }
                                                                        }
                                                                        n15 = 0;
                                                                    }
                                                                    n12 = n15;
                                                                    try {
                                                                        try {
                                                                            field = ph_02.w;
                                                                            if (n11 != 0) break block123;
                                                                            if (field == null) break block124;
                                                                        }
                                                                        catch (SecurityException securityException) {
                                                                            throw ph_0.a(securityException);
                                                                        }
                                                                        field = ph_02.w;
                                                                    }
                                                                    catch (SecurityException securityException) {
                                                                        throw ph_0.a(securityException);
                                                                    }
                                                                }
                                                                try {
                                                                    if (field.getType() != ph_02.O) break block124;
                                                                    n14 = 1;
                                                                    break block125;
                                                                }
                                                                catch (SecurityException securityException) {
                                                                    throw ph_0.a(securityException);
                                                                }
                                                            }
                                                            n14 = 0;
                                                        }
                                                        n13 = n14;
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        n10 = n12;
                                                                        if (n11 != 0) break block126;
                                                                        if (n10 == 0) break block127;
                                                                    }
                                                                    catch (SecurityException securityException) {
                                                                        throw ph_0.a(securityException);
                                                                    }
                                                                    n10 = n13;
                                                                    if (n11 != 0) break block126;
                                                                }
                                                                catch (SecurityException securityException) {
                                                                    throw ph_0.a(securityException);
                                                                }
                                                                if (n10 != 0) break block127;
                                                            }
                                                            catch (SecurityException securityException) {
                                                                throw ph_0.a(securityException);
                                                            }
                                                            return 1;
                                                        }
                                                        catch (SecurityException securityException) {
                                                            throw ph_0.a(securityException);
                                                        }
                                                    }
                                                    n10 = n13;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (n11 != 0) break block128;
                                                                if (n10 == 0) break block129;
                                                            }
                                                            catch (SecurityException securityException) {
                                                                throw ph_0.a(securityException);
                                                            }
                                                            n10 = n12;
                                                            if (n11 != 0) break block128;
                                                        }
                                                        catch (SecurityException securityException) {
                                                            throw ph_0.a(securityException);
                                                        }
                                                        if (n10 != 0) break block129;
                                                    }
                                                    catch (SecurityException securityException) {
                                                        throw ph_0.a(securityException);
                                                    }
                                                    return -1;
                                                }
                                                catch (SecurityException securityException) {
                                                    throw ph_0.a(securityException);
                                                }
                                            }
                                            n10 = ph_02.O.isPrimitive();
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n11 != 0) break block130;
                                                        if (n10 == 0) break block131;
                                                    }
                                                    catch (SecurityException securityException) {
                                                        throw ph_0.a(securityException);
                                                    }
                                                    n10 = this.O.isPrimitive();
                                                    if (n11 != 0) break block130;
                                                }
                                                catch (SecurityException securityException) {
                                                    throw ph_0.a(securityException);
                                                }
                                                if (n10 != 0) break block131;
                                            }
                                            catch (SecurityException securityException) {
                                                throw ph_0.a(securityException);
                                            }
                                            return 1;
                                        }
                                        catch (SecurityException securityException) {
                                            throw ph_0.a(securityException);
                                        }
                                    }
                                    n10 = this.O.isPrimitive();
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n11 != 0) break block132;
                                                if (n10 == 0) break block133;
                                            }
                                            catch (SecurityException securityException) {
                                                throw ph_0.a(securityException);
                                            }
                                            n10 = ph_02.O.isPrimitive();
                                            if (n11 != 0) break block132;
                                        }
                                        catch (SecurityException securityException) {
                                            throw ph_0.a(securityException);
                                        }
                                        if (n10 != 0) break block133;
                                    }
                                    catch (SecurityException securityException) {
                                        throw ph_0.a(securityException);
                                    }
                                    return -1;
                                }
                                catch (SecurityException securityException) {
                                    throw ph_0.a(securityException);
                                }
                            }
                            n10 = ph_02.O.getName().startsWith(ph_0.a(-12314, 4452));
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (n11 != 0) break block134;
                                        if (n10 == 0) break block135;
                                    }
                                    catch (SecurityException securityException) {
                                        throw ph_0.a(securityException);
                                    }
                                    n10 = this.O.getName().startsWith(ph_0.a(-12313, 2000)) ? 1 : 0;
                                    if (n11 != 0) break block134;
                                }
                                catch (SecurityException securityException) {
                                    throw ph_0.a(securityException);
                                }
                                if (n10 != 0) break block135;
                            }
                            catch (SecurityException securityException) {
                                throw ph_0.a(securityException);
                            }
                            return 1;
                        }
                        catch (SecurityException securityException) {
                            throw ph_0.a(securityException);
                        }
                    }
                    n10 = this.O.getName().startsWith(ph_0.a(-12313, 2000)) ? 1 : 0;
                }
                try {
                    try {
                        try {
                            try {
                                if (n11 != 0) break block136;
                                if (n10 == 0) break block137;
                            }
                            catch (SecurityException securityException) {
                                throw ph_0.a(securityException);
                            }
                            n10 = ph_02.O.getName().startsWith(ph_0.a(-12313, 2000)) ? 1 : 0;
                            if (n11 != 0) break block136;
                        }
                        catch (SecurityException securityException) {
                            throw ph_0.a(securityException);
                        }
                        if (n10 != 0) break block137;
                    }
                    catch (SecurityException securityException) {
                        throw ph_0.a(securityException);
                    }
                    return -1;
                }
                catch (SecurityException securityException) {
                    throw ph_0.a(securityException);
                }
            }
            n10 = this.O.getName().compareTo(ph_02.O.getName());
        }
        return n10;
    }

    public E6 Z() {
        E6 e6;
        block4: {
            block5: {
                int n10 = ph_0.w();
                try {
                    try {
                        e6 = this.F;
                        if (n10 == 0) break block4;
                        if (e6 == null) break block5;
                    }
                    catch (SecurityException securityException) {
                        throw ph_0.a(securityException);
                    }
                    return this.F;
                }
                catch (SecurityException securityException) {
                    throw ph_0.a(securityException);
                }
            }
            e6 = this.A;
        }
        return e6;
    }

    public String G() {
        return this.J;
    }

    public Object e(Object object) throws IllegalAccessException, InvocationTargetException {
        Object object2;
        block6: {
            ph_0 ph_02;
            block4: {
                block5: {
                    int n10 = ph_0.w();
                    try {
                        try {
                            ph_02 = this;
                            if (n10 == 0) break block4;
                            if (ph_02.Y == null) break block5;
                        }
                        catch (IllegalAccessException illegalAccessException) {
                            throw ph_0.a(illegalAccessException);
                        }
                        object2 = this.Y.invoke(object, new Object[0]);
                        break block6;
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        throw ph_0.a(illegalAccessException);
                    }
                }
                ph_02 = this;
            }
            object2 = ph_02.w.get(object);
        }
        return object2;
    }

    public void K(Object object, Object object2) throws IllegalAccessException, InvocationTargetException {
        ph_0 ph_02;
        block4: {
            block5: {
                int n10 = ph_0.w();
                try {
                    try {
                        ph_02 = this;
                        if (n10 == 0) break block4;
                        if (ph_02.Y == null) break block5;
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        throw ph_0.a(illegalAccessException);
                    }
                    this.Y.invoke(object, object2);
                    return;
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw ph_0.a(illegalAccessException);
                }
            }
            ph_02 = this;
        }
        ph_02.w.set(object, object2);
    }

    public void L() throws SecurityException {
        ph_0 ph_02;
        block4: {
            block5: {
                int n10 = ph_0.w();
                try {
                    try {
                        ph_02 = this;
                        if (n10 == 0) break block4;
                        if (ph_02.Y == null) break block5;
                    }
                    catch (SecurityException securityException) {
                        throw ph_0.a(securityException);
                    }
                    B8.P(this.Y);
                    return;
                }
                catch (SecurityException securityException) {
                    throw ph_0.a(securityException);
                }
            }
            ph_02 = this;
        }
        B8.P(ph_02.w);
    }

    public int compareTo(Object object) {
        return this.M((ph_0)object);
    }

    public static void S(int n10) {
        z = n10;
    }

    public static int w() {
        return z;
    }

    public static int u() {
        int n10 = ph_0.w();
        try {
            if (n10 == 0) {
                return 50;
            }
        }
        catch (SecurityException securityException) {
            throw ph_0.a(securityException);
        }
        return 0;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    var13 = new String[2];
                    var11_1 = 0;
                    ph_0.S(90);
                    var10_2 = "\u00dc\u00a9\u00ac\u0097\u00f4\u0005\u00bc7\u00a0Du";
                    var12_3 = "\u00dc\u00a9\u00ac\u0097\u00f4\u0005\u00bc7\u00a0Du".length();
                    var9_4 = 5;
                    var8_5 = -1;
lbl8:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block15;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 49;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl68
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 42;
                                    break;
                                }
                                case 1: {
                                    v11 = 29;
                                    break;
                                }
                                case 2: {
                                    v11 = 52;
                                    break;
                                }
                                case 3: {
                                    v11 = 58;
                                    break;
                                }
                                case 4: {
                                    v11 = 102;
                                    break;
                                }
                                case 5: {
                                    v11 = 32;
                                    break;
                                }
                                default: {
                                    v11 = 116;
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
lbl68:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                ph_0.d = var13;
                ph_0.e = new String[2];
                var0_7 = 6093904486419795693L;
                var6_8 = new long[3];
                var3_9 = 0;
                var4_10 = "\u0083\u00d5\u00ae\u00d1j' \u00d9\u00e2\u00a1\u00fa\u00eb\u00b6\u0091)\u00e9r&\u000e\u00ec\u00d6\u009d}\u00c3";
                var5_11 = "\u0083\u00d5\u00ae\u00d1j' \u00d9\u00e2\u00a1\u00fa\u00eb\u00b6\u0091)\u00e9r&\u000e\u00ec\u00d6\u009d}\u00c3".length();
                var2_12 = 0;
                while (true) {
                    break block16;
                    break;
                }
lbl86:
                // 1 sources

                while (true) {
                    var6_8[v12] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block17;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v12 = var3_9++;
            ** while (true)
        }
        ph_0.f = var6_8;
        ph_0.g = new Integer[3];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFCFE7) & 0xFFFF;
        if (e[n12] == null) {
            int n13;
            int n14;
            char[] cArray = d[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 171;
                    break;
                }
                case 1: {
                    n14 = 6;
                    break;
                }
                case 2: {
                    n14 = 52;
                    break;
                }
                case 3: {
                    n14 = 29;
                    break;
                }
                case 4: {
                    n14 = 137;
                    break;
                }
                case 5: {
                    n14 = 118;
                    break;
                }
                case 6: {
                    n14 = 56;
                    break;
                }
                case 7: {
                    n14 = 108;
                    break;
                }
                case 8: {
                    n14 = 30;
                    break;
                }
                case 9: {
                    n14 = 103;
                    break;
                }
                case 10: {
                    n14 = 53;
                    break;
                }
                case 11: {
                    n14 = 61;
                    break;
                }
                case 12: {
                    n14 = 222;
                    break;
                }
                case 13: {
                    n14 = 126;
                    break;
                }
                case 14: {
                    n14 = 185;
                    break;
                }
                case 15: {
                    n14 = 225;
                    break;
                }
                case 16: {
                    n14 = 109;
                    break;
                }
                case 17: {
                    n14 = 42;
                    break;
                }
                case 18: {
                    n14 = 183;
                    break;
                }
                case 19: {
                    n14 = 116;
                    break;
                }
                case 20: {
                    n14 = 1;
                    break;
                }
                case 21: {
                    n14 = 48;
                    break;
                }
                case 22: {
                    n14 = 73;
                    break;
                }
                case 23: {
                    n14 = 235;
                    break;
                }
                case 24: {
                    n14 = 86;
                    break;
                }
                case 25: {
                    n14 = 43;
                    break;
                }
                case 26: {
                    n14 = 184;
                    break;
                }
                case 27: {
                    n14 = 33;
                    break;
                }
                case 28: {
                    n14 = 20;
                    break;
                }
                case 29: {
                    n14 = 251;
                    break;
                }
                case 30: {
                    n14 = 106;
                    break;
                }
                case 31: {
                    n14 = 101;
                    break;
                }
                case 32: {
                    n14 = 217;
                    break;
                }
                case 33: {
                    n14 = 75;
                    break;
                }
                case 34: {
                    n14 = 121;
                    break;
                }
                case 35: {
                    n14 = 228;
                    break;
                }
                case 36: {
                    n14 = 194;
                    break;
                }
                case 37: {
                    n14 = 91;
                    break;
                }
                case 38: {
                    n14 = 148;
                    break;
                }
                case 39: {
                    n14 = 66;
                    break;
                }
                case 40: {
                    n14 = 67;
                    break;
                }
                case 41: {
                    n14 = 32;
                    break;
                }
                case 42: {
                    n14 = 119;
                    break;
                }
                case 43: {
                    n14 = 247;
                    break;
                }
                case 44: {
                    n14 = 104;
                    break;
                }
                case 45: {
                    n14 = 78;
                    break;
                }
                case 46: {
                    n14 = 47;
                    break;
                }
                case 47: {
                    n14 = 158;
                    break;
                }
                case 48: {
                    n14 = 170;
                    break;
                }
                case 49: {
                    n14 = 69;
                    break;
                }
                case 50: {
                    n14 = 37;
                    break;
                }
                case 51: {
                    n14 = 23;
                    break;
                }
                case 52: {
                    n14 = 68;
                    break;
                }
                case 53: {
                    n14 = 41;
                    break;
                }
                case 54: {
                    n14 = 163;
                    break;
                }
                case 55: {
                    n14 = 135;
                    break;
                }
                case 56: {
                    n14 = 242;
                    break;
                }
                case 57: {
                    n14 = 85;
                    break;
                }
                case 58: {
                    n14 = 127;
                    break;
                }
                case 59: {
                    n14 = 150;
                    break;
                }
                case 60: {
                    n14 = 200;
                    break;
                }
                case 61: {
                    n14 = 208;
                    break;
                }
                case 62: {
                    n14 = 4;
                    break;
                }
                case 63: {
                    n14 = 236;
                    break;
                }
                case 64: {
                    n14 = 179;
                    break;
                }
                case 65: {
                    n14 = 18;
                    break;
                }
                case 66: {
                    n14 = 63;
                    break;
                }
                case 67: {
                    n14 = 97;
                    break;
                }
                case 68: {
                    n14 = 79;
                    break;
                }
                case 69: {
                    n14 = 7;
                    break;
                }
                case 70: {
                    n14 = 141;
                    break;
                }
                case 71: {
                    n14 = 17;
                    break;
                }
                case 72: {
                    n14 = 156;
                    break;
                }
                case 73: {
                    n14 = 3;
                    break;
                }
                case 74: {
                    n14 = 12;
                    break;
                }
                case 75: {
                    n14 = 96;
                    break;
                }
                case 76: {
                    n14 = 113;
                    break;
                }
                case 77: {
                    n14 = 216;
                    break;
                }
                case 78: {
                    n14 = 16;
                    break;
                }
                case 79: {
                    n14 = 173;
                    break;
                }
                case 80: {
                    n14 = 55;
                    break;
                }
                case 81: {
                    n14 = 248;
                    break;
                }
                case 82: {
                    n14 = 253;
                    break;
                }
                case 83: {
                    n14 = 9;
                    break;
                }
                case 84: {
                    n14 = 136;
                    break;
                }
                case 85: {
                    n14 = 72;
                    break;
                }
                case 86: {
                    n14 = 39;
                    break;
                }
                case 87: {
                    n14 = 252;
                    break;
                }
                case 88: {
                    n14 = 123;
                    break;
                }
                case 89: {
                    n14 = 159;
                    break;
                }
                case 90: {
                    n14 = 223;
                    break;
                }
                case 91: {
                    n14 = 152;
                    break;
                }
                case 92: {
                    n14 = 74;
                    break;
                }
                case 93: {
                    n14 = 186;
                    break;
                }
                case 94: {
                    n14 = 220;
                    break;
                }
                case 95: {
                    n14 = 209;
                    break;
                }
                case 96: {
                    n14 = 224;
                    break;
                }
                case 97: {
                    n14 = 99;
                    break;
                }
                case 98: {
                    n14 = 227;
                    break;
                }
                case 99: {
                    n14 = 146;
                    break;
                }
                case 100: {
                    n14 = 40;
                    break;
                }
                case 101: {
                    n14 = 21;
                    break;
                }
                case 102: {
                    n14 = 196;
                    break;
                }
                case 103: {
                    n14 = 174;
                    break;
                }
                case 104: {
                    n14 = 168;
                    break;
                }
                case 105: {
                    n14 = 245;
                    break;
                }
                case 106: {
                    n14 = 139;
                    break;
                }
                case 107: {
                    n14 = 160;
                    break;
                }
                case 108: {
                    n14 = 206;
                    break;
                }
                case 109: {
                    n14 = 192;
                    break;
                }
                case 110: {
                    n14 = 77;
                    break;
                }
                case 111: {
                    n14 = 221;
                    break;
                }
                case 112: {
                    n14 = 5;
                    break;
                }
                case 113: {
                    n14 = 234;
                    break;
                }
                case 114: {
                    n14 = 144;
                    break;
                }
                case 115: {
                    n14 = 201;
                    break;
                }
                case 116: {
                    n14 = 213;
                    break;
                }
                case 117: {
                    n14 = 100;
                    break;
                }
                case 118: {
                    n14 = 131;
                    break;
                }
                case 119: {
                    n14 = 166;
                    break;
                }
                case 120: {
                    n14 = 254;
                    break;
                }
                case 121: {
                    n14 = 107;
                    break;
                }
                case 122: {
                    n14 = 105;
                    break;
                }
                case 123: {
                    n14 = 243;
                    break;
                }
                case 124: {
                    n14 = 14;
                    break;
                }
                case 125: {
                    n14 = 34;
                    break;
                }
                case 126: {
                    n14 = 207;
                    break;
                }
                case 127: {
                    n14 = 22;
                    break;
                }
                case 128: {
                    n14 = 129;
                    break;
                }
                case 129: {
                    n14 = 212;
                    break;
                }
                case 130: {
                    n14 = 147;
                    break;
                }
                case 131: {
                    n14 = 197;
                    break;
                }
                case 132: {
                    n14 = 162;
                    break;
                }
                case 133: {
                    n14 = 177;
                    break;
                }
                case 134: {
                    n14 = 246;
                    break;
                }
                case 135: {
                    n14 = 180;
                    break;
                }
                case 136: {
                    n14 = 44;
                    break;
                }
                case 137: {
                    n14 = 157;
                    break;
                }
                case 138: {
                    n14 = 102;
                    break;
                }
                case 139: {
                    n14 = 15;
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
                    n14 = 142;
                    break;
                }
                case 143: {
                    n14 = 124;
                    break;
                }
                case 144: {
                    n14 = 70;
                    break;
                }
                case 145: {
                    n14 = 19;
                    break;
                }
                case 146: {
                    n14 = 229;
                    break;
                }
                case 147: {
                    n14 = 239;
                    break;
                }
                case 148: {
                    n14 = 155;
                    break;
                }
                case 149: {
                    n14 = 145;
                    break;
                }
                case 150: {
                    n14 = 153;
                    break;
                }
                case 151: {
                    n14 = 64;
                    break;
                }
                case 152: {
                    n14 = 214;
                    break;
                }
                case 153: {
                    n14 = 202;
                    break;
                }
                case 154: {
                    n14 = 59;
                    break;
                }
                case 155: {
                    n14 = 172;
                    break;
                }
                case 156: {
                    n14 = 50;
                    break;
                }
                case 157: {
                    n14 = 233;
                    break;
                }
                case 158: {
                    n14 = 80;
                    break;
                }
                case 159: {
                    n14 = 65;
                    break;
                }
                case 160: {
                    n14 = 112;
                    break;
                }
                case 161: {
                    n14 = 46;
                    break;
                }
                case 162: {
                    n14 = 195;
                    break;
                }
                case 163: {
                    n14 = 49;
                    break;
                }
                case 164: {
                    n14 = 231;
                    break;
                }
                case 165: {
                    n14 = 81;
                    break;
                }
                case 166: {
                    n14 = 218;
                    break;
                }
                case 167: {
                    n14 = 151;
                    break;
                }
                case 168: {
                    n14 = 134;
                    break;
                }
                case 169: {
                    n14 = 188;
                    break;
                }
                case 170: {
                    n14 = 26;
                    break;
                }
                case 171: {
                    n14 = 187;
                    break;
                }
                case 172: {
                    n14 = 98;
                    break;
                }
                case 173: {
                    n14 = 27;
                    break;
                }
                case 174: {
                    n14 = 143;
                    break;
                }
                case 175: {
                    n14 = 165;
                    break;
                }
                case 176: {
                    n14 = 190;
                    break;
                }
                case 177: {
                    n14 = 110;
                    break;
                }
                case 178: {
                    n14 = 149;
                    break;
                }
                case 179: {
                    n14 = 250;
                    break;
                }
                case 180: {
                    n14 = 132;
                    break;
                }
                case 181: {
                    n14 = 83;
                    break;
                }
                case 182: {
                    n14 = 133;
                    break;
                }
                case 183: {
                    n14 = 175;
                    break;
                }
                case 184: {
                    n14 = 232;
                    break;
                }
                case 185: {
                    n14 = 87;
                    break;
                }
                case 186: {
                    n14 = 219;
                    break;
                }
                case 187: {
                    n14 = 93;
                    break;
                }
                case 188: {
                    n14 = 205;
                    break;
                }
                case 189: {
                    n14 = 138;
                    break;
                }
                case 190: {
                    n14 = 211;
                    break;
                }
                case 191: {
                    n14 = 31;
                    break;
                }
                case 192: {
                    n14 = 115;
                    break;
                }
                case 193: {
                    n14 = 38;
                    break;
                }
                case 194: {
                    n14 = 117;
                    break;
                }
                case 195: {
                    n14 = 51;
                    break;
                }
                case 196: {
                    n14 = 210;
                    break;
                }
                case 197: {
                    n14 = 204;
                    break;
                }
                case 198: {
                    n14 = 95;
                    break;
                }
                case 199: {
                    n14 = 35;
                    break;
                }
                case 200: {
                    n14 = 114;
                    break;
                }
                case 201: {
                    n14 = 88;
                    break;
                }
                case 202: {
                    n14 = 241;
                    break;
                }
                case 203: {
                    n14 = 10;
                    break;
                }
                case 204: {
                    n14 = 120;
                    break;
                }
                case 205: {
                    n14 = 57;
                    break;
                }
                case 206: {
                    n14 = 2;
                    break;
                }
                case 207: {
                    n14 = 249;
                    break;
                }
                case 208: {
                    n14 = 0;
                    break;
                }
                case 209: {
                    n14 = 167;
                    break;
                }
                case 210: {
                    n14 = 181;
                    break;
                }
                case 211: {
                    n14 = 125;
                    break;
                }
                case 212: {
                    n14 = 54;
                    break;
                }
                case 213: {
                    n14 = 244;
                    break;
                }
                case 214: {
                    n14 = 178;
                    break;
                }
                case 215: {
                    n14 = 161;
                    break;
                }
                case 216: {
                    n14 = 94;
                    break;
                }
                case 217: {
                    n14 = 13;
                    break;
                }
                case 218: {
                    n14 = 169;
                    break;
                }
                case 219: {
                    n14 = 203;
                    break;
                }
                case 220: {
                    n14 = 45;
                    break;
                }
                case 221: {
                    n14 = 128;
                    break;
                }
                case 222: {
                    n14 = 199;
                    break;
                }
                case 223: {
                    n14 = 90;
                    break;
                }
                case 224: {
                    n14 = 111;
                    break;
                }
                case 225: {
                    n14 = 76;
                    break;
                }
                case 226: {
                    n14 = 193;
                    break;
                }
                case 227: {
                    n14 = 182;
                    break;
                }
                case 228: {
                    n14 = 84;
                    break;
                }
                case 229: {
                    n14 = 25;
                    break;
                }
                case 230: {
                    n14 = 237;
                    break;
                }
                case 231: {
                    n14 = 191;
                    break;
                }
                case 232: {
                    n14 = 82;
                    break;
                }
                case 233: {
                    n14 = 226;
                    break;
                }
                case 234: {
                    n14 = 62;
                    break;
                }
                case 235: {
                    n14 = 140;
                    break;
                }
                case 236: {
                    n14 = 215;
                    break;
                }
                case 237: {
                    n14 = 122;
                    break;
                }
                case 238: {
                    n14 = 11;
                    break;
                }
                case 239: {
                    n14 = 60;
                    break;
                }
                case 240: {
                    n14 = 28;
                    break;
                }
                case 241: {
                    n14 = 198;
                    break;
                }
                case 242: {
                    n14 = 58;
                    break;
                }
                case 243: {
                    n14 = 71;
                    break;
                }
                case 244: {
                    n14 = 238;
                    break;
                }
                case 245: {
                    n14 = 164;
                    break;
                }
                case 246: {
                    n14 = 189;
                    break;
                }
                case 247: {
                    n14 = 230;
                    break;
                }
                case 248: {
                    n14 = 92;
                    break;
                }
                case 249: {
                    n14 = 8;
                    break;
                }
                case 250: {
                    n14 = 24;
                    break;
                }
                case 251: {
                    n14 = 36;
                    break;
                }
                case 252: {
                    n14 = 176;
                    break;
                }
                case 253: {
                    n14 = 89;
                    break;
                }
                case 254: {
                    n14 = 240;
                    break;
                }
                default: {
                    n14 = 130;
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
            ph_0.e[n12] = new String(cArray).intern();
        }
        return e[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6A8F;
        if (g[n11] == null) {
            ph_0.g[n11] = (int)(f[n11] ^ l2);
        }
        return g[n11];
    }
}

