/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EP;
import com.P7;
import com.X4;
import com.ak_0;
import com.hi_0;
import com.n_0;
import com.nl_1;
import com.nv_2;
import com.ok_0;
import com.ym_1;
import com.yn_2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Type;

/*
 * Renamed from com.Hg
 */
public class hg_0
implements ak_0,
X4 {
    public static final hg_0 w;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean y(Class clazz) {
        Class clazz2;
        Class clazz3;
        block16: {
            String string;
            block15: {
                block14: {
                    string = nv_2.o();
                    try {
                        try {
                            Class clazz2 = clazz;
                            clazz2 = Point.class;
                            if (string == null) break block14;
                            if (clazz3 == clazz2) return true;
                        }
                        catch (hi_0 hi_02) {
                            throw hg_0.a(hi_02);
                        }
                        Class clazz2 = clazz;
                        clazz2 = Rectangle.class;
                    }
                    catch (hi_0 hi_03) {
                        throw hg_0.a(hi_03);
                    }
                }
                try {
                    try {
                        if (string == null) break block15;
                        if (clazz3 == clazz2) return true;
                    }
                    catch (hi_0 hi_04) {
                        throw hg_0.a(hi_04);
                    }
                    Class clazz2 = clazz;
                    clazz2 = Font.class;
                }
                catch (hi_0 hi_05) {
                    throw hg_0.a(hi_05);
                }
            }
            try {
                try {
                    if (string == null) break block16;
                    if (clazz3 == clazz2) return true;
                }
                catch (hi_0 hi_06) {
                    throw hg_0.a(hi_06);
                }
                Class clazz2 = clazz;
                clazz2 = Color.class;
            }
            catch (hi_0 hi_07) {
                throw hg_0.a(hi_07);
            }
        }
        try {
            if (clazz3 != clazz2) return false;
            return true;
        }
        catch (hi_0 hi_08) {
            throw hg_0.a(hi_08);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void u(nl_1 var1_1, Object var2_2, Object var3_3, Type var4_4, int var5_5) throws IOException {
        block31: {
            block36: {
                block35: {
                    block34: {
                        block33: {
                            block32: {
                                block30: {
                                    block29: {
                                        block28: {
                                            var7_6 = var1_1.w;
                                            var6_7 = nv_2.o();
                                            try {
                                                try {
                                                    if (var6_7 == null) break block28;
                                                    if (var2_2 != null) break block29;
                                                }
                                                catch (IOException v0) {
                                                    throw hg_0.a(v0);
                                                }
                                                var7_6.Y();
                                            }
                                            catch (IOException v1) {
                                                throw hg_0.a(v1);
                                            }
                                        }
                                        return;
                                    }
                                    var8_8 = hg_0.a(29601, 1673135259243974211L);
                                    try {
                                        v2 = var2_2 instanceof Point;
                                        if (var6_7 == null) break block30;
                                        if (v2) {
                                        }
                                        ** GOTO lbl32
                                    }
                                    catch (IOException v3) {
                                        throw hg_0.a(v3);
                                    }
                                    var9_9 = (Point)var2_2;
                                    var8_8 = this.W(var7_6, Point.class, var8_8);
                                    try {
                                        var7_6.D(var8_8, "x", var9_9.x);
                                        var7_6.D((char)hg_0.a(16416, 305322563811556813L), "y", var9_9.y);
                                        if (var6_7 != null) break block31;
lbl32:
                                        // 2 sources

                                        v2 = var2_2 instanceof Font;
                                    }
                                    catch (IOException v4) {
                                        throw hg_0.a(v4);
                                    }
                                }
                                try {
                                    if (var6_7 == null) break block32;
                                    if (v2) {
                                    }
                                    ** GOTO lbl51
                                }
                                catch (IOException v5) {
                                    throw hg_0.a(v5);
                                }
                                var9_9 = (Font)var2_2;
                                var8_8 = this.W(var7_6, Font.class, var8_8);
                                try {
                                    var7_6.H(var8_8, hg_0.a(5852, -10108), var9_9.getName());
                                    var7_6.D((char)hg_0.a(9451, 7224593862732372224L), hg_0.a(5830, 6029), var9_9.getStyle());
                                    var7_6.D((char)hg_0.a(9451, 7224593862732372224L), hg_0.a(5827, -3407), var9_9.getSize());
                                    if (var6_7 != null) break block31;
lbl51:
                                    // 2 sources

                                    v2 = var2_2 instanceof Rectangle;
                                }
                                catch (IOException v6) {
                                    throw hg_0.a(v6);
                                }
                            }
                            try {
                                if (var6_7 == null) break block33;
                                if (v2) {
                                }
                                ** GOTO lbl72
                            }
                            catch (IOException v7) {
                                throw hg_0.a(v7);
                            }
                            var9_9 = (Rectangle)var2_2;
                            var8_8 = this.W(var7_6, Rectangle.class, var8_8);
                            try {
                                try {
                                    var7_6.D(var8_8, "x", var9_9.x);
                                    var7_6.D((char)hg_0.a(9451, 7224593862732372224L), "y", var9_9.y);
                                    var7_6.D((char)hg_0.a(9451, 7224593862732372224L), hg_0.a(5844, -30461), var9_9.width);
                                    var7_6.D((char)hg_0.a(9451, 7224593862732372224L), hg_0.a(5842, -28216), var9_9.height);
                                    if (var6_7 != null) break block31;
lbl72:
                                    // 2 sources

                                    v8 = var2_2;
                                    if (var6_7 == null) break block34;
                                }
                                catch (IOException v9) {
                                    throw hg_0.a(v9);
                                }
                                v2 = v8 instanceof Color;
                            }
                            catch (IOException v10) {
                                throw hg_0.a(v10);
                            }
                        }
                        if (!v2) ** GOTO lbl113
                        v8 = var2_2;
                    }
                    var9_9 = (Color)v8;
                    var8_8 = this.W(var7_6, Color.class, var8_8);
                    try {
                        try {
                            var7_6.D(var8_8, "r", var9_9.getRed());
                            var7_6.D((char)hg_0.a(9451, 7224593862732372224L), "g", var9_9.getGreen());
                            v11 = var7_6;
                            v12 = hg_0.a(9451, 7224593862732372224L);
                            v13 = "b";
                            v14 = var9_9.getBlue();
                            if (var6_7 == null) break block35;
                            v11.D((char)v12, v13, v14);
                            if (var9_9.getAlpha() <= 0) break block36;
                        }
                        catch (IOException v15) {
                            throw hg_0.a(v15);
                        }
                        v11 = var7_6;
                        v12 = hg_0.a(9451, 7224593862732372224L);
                        v13 = hg_0.a(5825, -3995);
                        v14 = var9_9.getAlpha();
                    }
                    catch (IOException v16) {
                        throw hg_0.a(v16);
                    }
                }
                v11.D((char)v12, v13, v14);
            }
            try {
                if (var6_7 != null) break block31;
lbl113:
                // 2 sources

                throw new hi_0(hg_0.a(5849, 2359) + var2_2.getClass().getName());
            }
            catch (IOException v17) {
                throw hg_0.a(v17);
            }
        }
        var7_6.write(hg_0.a(4879, 8481963488836906720L));
    }

    protected char W(ym_1 ym_12, Class clazz, char c2) {
        char c3;
        block2: {
            block3: {
                String string = nv_2.o();
                try {
                    c3 = ym_12.I(EP.WriteClassName);
                    if (string == null) break block2;
                    if (c3 == '\u0000') break block3;
                }
                catch (hi_0 hi_02) {
                    throw hg_0.a(hi_02);
                }
                ym_12.write(hg_0.a(4621, 6209918400756543468L));
                ym_12.u(ok_0.Z);
                ym_12.y(clazz.getName());
                c2 = (char)hg_0.a(9451, 7224593862732372224L);
            }
            c3 = c2;
        }
        return c3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Object z(yn_2 var1_1, Type var2_2, Object var3_3) {
        block35: {
            block37: {
                block36: {
                    block34: {
                        block32: {
                            block33: {
                                block30: {
                                    block31: {
                                        var5_4 = var1_1.N;
                                        var4_5 = nv_2.o();
                                        try {
                                            try {
                                                v0 = var5_4.P();
                                                v1 = hg_0.a(23247, 3457865441324803878L);
                                                if (var4_5 == null) break block30;
                                                if (v0 != v1) break block31;
                                            }
                                            catch (hi_0 v2) {
                                                throw hg_0.a(v2);
                                            }
                                            var5_4.S(hg_0.a(17292, 892265204399193711L));
                                            return null;
                                        }
                                        catch (hi_0 v3) {
                                            throw hg_0.a(v3);
                                        }
                                    }
                                    try {
                                        v4 = var5_4;
                                        if (var4_5 == null) break block32;
                                        v0 = v4.P();
                                        v1 = hg_0.a(22345, 596108195657427625L);
                                    }
                                    catch (hi_0 v5) {
                                        throw hg_0.a(v5);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (v0 == v1) break block33;
                                            v4 = var5_4;
                                            if (var4_5 == null) break block32;
                                        }
                                        catch (hi_0 v6) {
                                            throw hg_0.a(v6);
                                        }
                                        if (v4.P() == hg_0.a(17292, 892265204399193711L)) break block33;
                                    }
                                    catch (hi_0 v7) {
                                        throw hg_0.a(v7);
                                    }
                                    throw new hi_0(hg_0.a(5848, 15564));
                                }
                                catch (hi_0 v8) {
                                    throw hg_0.a(v8);
                                }
                            }
                            v4 = var5_4;
                        }
                        try {
                            v4.K();
                            v9 = var2_2;
                            v10 /* !! */  = Point.class;
                            if (var4_5 == null) break block34;
                            if (v9 == v10 /* !! */ ) {
                            }
                            ** GOTO lbl58
                        }
                        catch (hi_0 v11) {
                            throw hg_0.a(v11);
                        }
                        var6_6 /* !! */  = this.i(var1_1, var3_3);
                        try {
                            if (var4_5 != null) break block35;
lbl58:
                            // 2 sources

                            v9 = var2_2;
                            v10 /* !! */  = Rectangle.class;
                        }
                        catch (hi_0 v12) {
                            throw hg_0.a(v12);
                        }
                    }
                    try {
                        if (var4_5 == null) break block36;
                        if (v9 == v10 /* !! */ ) {
                        }
                        ** GOTO lbl74
                    }
                    catch (hi_0 v13) {
                        throw hg_0.a(v13);
                    }
                    var6_6 /* !! */  = this.W(var1_1);
                    try {
                        if (var4_5 != null) break block35;
lbl74:
                        // 2 sources

                        v9 = var2_2;
                        v10 /* !! */  = Color.class;
                    }
                    catch (hi_0 v14) {
                        throw hg_0.a(v14);
                    }
                }
                try {
                    if (var4_5 == null) break block37;
                    if (v9 == v10 /* !! */ ) {
                    }
                    ** GOTO lbl90
                }
                catch (hi_0 v15) {
                    throw hg_0.a(v15);
                }
                var6_6 /* !! */  = this.K(var1_1);
                try {
                    if (var4_5 != null) break block35;
lbl90:
                    // 2 sources

                    v9 = var2_2;
                    v10 /* !! */  = Font.class;
                }
                catch (hi_0 v16) {
                    throw hg_0.a(v16);
                }
            }
            if (v9 != v10 /* !! */ ) ** GOTO lbl100
            var6_6 /* !! */  = this.T(var1_1);
            try {
                if (var4_5 != null) break block35;
lbl100:
                // 2 sources

                throw new hi_0(hg_0.a(5841, 266) + var2_2);
            }
            catch (hi_0 v17) {
                throw hg_0.a(v17);
            }
        }
        var7_7 = var1_1.A();
        var1_1.F(var6_6 /* !! */ , var3_3);
        var1_1.z(var7_7);
        return var6_6 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected Font T(yn_2 var1_1) {
        var3_2 = var1_1.N;
        var4_3 = 0;
        var5_4 = 0;
        var2_5 = nv_2.o();
        var6_6 = null;
        do {
            block64: {
                block57: {
                    block62: {
                        block63: {
                            block61: {
                                block58: {
                                    block59: {
                                        block60: {
                                            block54: {
                                                block55: {
                                                    block56: {
                                                        block65: {
                                                            block52: {
                                                                block53: {
                                                                    if (var3_2.P() != hg_0.a(22553, 4571839915522172403L)) ** GOTO lbl18
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    var3_2.K();
                                                                                    if (var2_5 == null) break block52;
                                                                                    if (var2_5 != null) break;
                                                                                }
                                                                                catch (hi_0 v0) {
                                                                                    throw hg_0.a(v0);
                                                                                }
lbl18:
                                                                                // 2 sources

                                                                                v1 = var3_2;
                                                                                if (var2_5 == null) break block53;
                                                                            }
                                                                            catch (hi_0 v2) {
                                                                                throw hg_0.a(v2);
                                                                            }
                                                                            if (v1.P() != 4) break block52;
                                                                        }
                                                                        catch (hi_0 v3) {
                                                                            throw hg_0.a(v3);
                                                                        }
                                                                        v1 = var3_2;
                                                                    }
                                                                    catch (hi_0 v4) {
                                                                        throw hg_0.a(v4);
                                                                    }
                                                                }
                                                                var7_7 = v1.z();
                                                                var3_2.e(2);
                                                                if (var2_5 != null) break block65;
                                                            }
                                                            throw new hi_0(hg_0.a(5850, -31501));
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    v5 = var7_7.equalsIgnoreCase(hg_0.a(5854, 9513));
                                                                    if (var2_5 == null) break block54;
                                                                    if (v5 == 0) break block55;
                                                                }
                                                                catch (hi_0 v6) {
                                                                    throw hg_0.a(v6);
                                                                }
                                                                v7 = var3_2;
                                                                if (var2_5 == null) break block56;
                                                            }
                                                            catch (hi_0 v8) {
                                                                throw hg_0.a(v8);
                                                            }
                                                            if (v7.P() == 4) {
                                                            }
                                                            ** GOTO lbl63
                                                        }
                                                        catch (hi_0 v9) {
                                                            throw hg_0.a(v9);
                                                        }
                                                        var6_6 = var3_2.z();
                                                        v7 = var3_2;
                                                    }
                                                    try {
                                                        v7.K();
                                                        if (var2_5 != null) break block57;
lbl63:
                                                        // 2 sources

                                                        throw new hi_0(hg_0.a(5848, 15564));
                                                    }
                                                    catch (hi_0 v10) {
                                                        throw hg_0.a(v10);
                                                    }
                                                }
                                                v5 = var7_7.equalsIgnoreCase(hg_0.a(5853, 31792));
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (var2_5 == null) break block58;
                                                            if (v5 == 0) break block59;
                                                        }
                                                        catch (hi_0 v11) {
                                                            throw hg_0.a(v11);
                                                        }
                                                        v12 = var3_2.P();
                                                        if (var2_5 == null) break block60;
                                                    }
                                                    catch (hi_0 v13) {
                                                        throw hg_0.a(v13);
                                                    }
                                                    if (v12 == 2) {
                                                    }
                                                    ** GOTO lbl97
                                                }
                                                catch (hi_0 v14) {
                                                    throw hg_0.a(v14);
                                                }
                                                v12 = var3_2.G();
                                            }
                                            catch (hi_0 v15) {
                                                throw hg_0.a(v15);
                                            }
                                        }
                                        var5_4 = v12;
                                        try {
                                            var3_2.K();
                                            if (var2_5 != null) break block57;
lbl97:
                                            // 2 sources

                                            throw new hi_0(hg_0.a(5848, 15564));
                                        }
                                        catch (hi_0 v16) {
                                            throw hg_0.a(v16);
                                        }
                                    }
                                    v5 = var7_7.equalsIgnoreCase(hg_0.a(5846, -32603));
                                }
                                try {
                                    try {
                                        if (var2_5 == null) break block61;
                                        if (v5 == 0) break block62;
                                    }
                                    catch (hi_0 v17) {
                                        throw hg_0.a(v17);
                                    }
                                    v5 = var3_2.P();
                                }
                                catch (hi_0 v18) {
                                    throw hg_0.a(v18);
                                }
                            }
                            try {
                                try {
                                    if (var2_5 == null) break block63;
                                    if (v5 == 2) {
                                    }
                                    ** GOTO lbl132
                                }
                                catch (hi_0 v19) {
                                    throw hg_0.a(v19);
                                }
                                v5 = var3_2.G();
                            }
                            catch (hi_0 v20) {
                                throw hg_0.a(v20);
                            }
                        }
                        var4_3 = v5;
                        try {
                            var3_2.K();
                            if (var2_5 != null) break block57;
lbl132:
                            // 2 sources

                            throw new hi_0(hg_0.a(5848, 15564));
                        }
                        catch (hi_0 v21) {
                            throw hg_0.a(v21);
                        }
                    }
                    throw new hi_0(hg_0.a(5855, 9527) + var7_7);
                }
                try {
                    try {
                        v22 = var3_2;
                        if (var2_5 == null) break block64;
                        if (v22.P() != hg_0.a(17403, 2737210487338876439L)) continue;
                    }
                    catch (hi_0 v23) {
                        throw hg_0.a(v23);
                    }
                    v22 = var3_2;
                }
                catch (hi_0 v24) {
                    throw hg_0.a(v24);
                }
            }
            v22.S(4);
        } while (var2_5 != null);
        return new Font(var6_6, var5_4, var4_3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected Color K(yn_2 var1_1) {
        var3_2 = var1_1.N;
        var4_3 = 0;
        var5_4 = 0;
        var6_5 = 0;
        var7_6 = 0;
        var2_7 = nv_2.o();
        do {
            block56: {
                block52: {
                    block55: {
                        block54: {
                            block53: {
                                block51: {
                                    block50: {
                                        block49: {
                                            block57: {
                                                block47: {
                                                    block48: {
                                                        if (var3_2.P() != hg_0.a(6708, 1308407740119508954L)) ** GOTO lbl19
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        var3_2.K();
                                                                        if (var2_7 == null) break block47;
                                                                        if (var2_7 != null) break;
                                                                    }
                                                                    catch (hi_0 v0) {
                                                                        throw hg_0.a(v0);
                                                                    }
lbl19:
                                                                    // 2 sources

                                                                    v1 = var3_2;
                                                                    if (var2_7 == null) break block48;
                                                                }
                                                                catch (hi_0 v2) {
                                                                    throw hg_0.a(v2);
                                                                }
                                                                if (v1.P() != 4) break block47;
                                                            }
                                                            catch (hi_0 v3) {
                                                                throw hg_0.a(v3);
                                                            }
                                                            v1 = var3_2;
                                                        }
                                                        catch (hi_0 v4) {
                                                            throw hg_0.a(v4);
                                                        }
                                                    }
                                                    var8_8 = v1.z();
                                                    var3_2.e(2);
                                                    if (var2_7 != null) break block57;
                                                }
                                                throw new hi_0(hg_0.a(5848, 15564));
                                            }
                                            try {
                                                try {
                                                    v5 = var3_2.P();
                                                    if (var2_7 == null) break block49;
                                                    if (v5 == 2) {
                                                    }
                                                    ** GOTO lbl57
                                                }
                                                catch (hi_0 v6) {
                                                    throw hg_0.a(v6);
                                                }
                                                v5 = var3_2.G();
                                            }
                                            catch (hi_0 v7) {
                                                throw hg_0.a(v7);
                                            }
                                        }
                                        var9_9 = v5;
                                        try {
                                            var3_2.K();
                                            if (var2_7 != null) break block50;
lbl57:
                                            // 2 sources

                                            throw new hi_0(hg_0.a(5848, 15564));
                                        }
                                        catch (hi_0 v8) {
                                            throw hg_0.a(v8);
                                        }
                                    }
                                    try {
                                        v9 = var8_8.equalsIgnoreCase("r");
                                        if (var2_7 == null) break block51;
                                        if (v9 != 0) {
                                        }
                                        ** GOTO lbl72
                                    }
                                    catch (hi_0 v10) {
                                        throw hg_0.a(v10);
                                    }
                                    var4_3 = var9_9;
                                    try {
                                        if (var2_7 != null) break block52;
lbl72:
                                        // 2 sources

                                        v9 = var8_8.equalsIgnoreCase("g");
                                    }
                                    catch (hi_0 v11) {
                                        throw hg_0.a(v11);
                                    }
                                }
                                try {
                                    if (var2_7 == null) break block53;
                                    if (v9 != 0) {
                                    }
                                    ** GOTO lbl87
                                }
                                catch (hi_0 v12) {
                                    throw hg_0.a(v12);
                                }
                                var5_4 = var9_9;
                                try {
                                    if (var2_7 != null) break block52;
lbl87:
                                    // 2 sources

                                    v9 = var8_8.equalsIgnoreCase("b");
                                }
                                catch (hi_0 v13) {
                                    throw hg_0.a(v13);
                                }
                            }
                            try {
                                if (var2_7 == null) break block54;
                                if (v9 != 0) {
                                }
                                ** GOTO lbl102
                            }
                            catch (hi_0 v14) {
                                throw hg_0.a(v14);
                            }
                            var6_5 = var9_9;
                            try {
                                if (var2_7 != null) break block52;
lbl102:
                                // 2 sources

                                v9 = var8_8.equalsIgnoreCase(hg_0.a(5845, 19208));
                            }
                            catch (hi_0 v15) {
                                throw hg_0.a(v15);
                            }
                        }
                        try {
                            if (var2_7 == null) break block55;
                            if (v9 != 0) {
                            }
                            ** GOTO lbl119
                        }
                        catch (hi_0 v16) {
                            throw hg_0.a(v16);
                        }
                        v9 = var9_9;
                    }
                    var7_6 = v9;
                    try {
                        if (var2_7 != null) break block52;
lbl119:
                        // 2 sources

                        throw new hi_0(hg_0.a(5840, 30302) + var8_8);
                    }
                    catch (hi_0 v17) {
                        throw hg_0.a(v17);
                    }
                }
                try {
                    try {
                        v18 = var3_2;
                        if (var2_7 == null) break block56;
                        if (v18.P() != hg_0.a(17292, 892265204399193711L)) continue;
                    }
                    catch (hi_0 v19) {
                        throw hg_0.a(v19);
                    }
                    v18 = var3_2;
                }
                catch (hi_0 v20) {
                    throw hg_0.a(v20);
                }
            }
            v18.S(4);
        } while (var2_7 != null);
        return new Color(var4_3, var5_4, var6_5, var7_6);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected Rectangle W(yn_2 var1_1) {
        var3_2 = var1_1.N;
        var4_3 = 0;
        var5_4 = 0;
        var2_5 = nv_2.o();
        var6_6 = 0;
        var7_7 = 0;
        do {
            block62: {
                block58: {
                    block61: {
                        block60: {
                            block59: {
                                block57: {
                                    block55: {
                                        block56: {
                                            block54: {
                                                block63: {
                                                    block52: {
                                                        block53: {
                                                            if (var3_2.P() != hg_0.a(6708, 1308407740119508954L)) ** GOTO lbl19
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            var3_2.K();
                                                                            if (var2_5 == null) break block52;
                                                                            if (var2_5 != null) break;
                                                                        }
                                                                        catch (hi_0 v0) {
                                                                            throw hg_0.a(v0);
                                                                        }
lbl19:
                                                                        // 2 sources

                                                                        v1 = var3_2;
                                                                        if (var2_5 == null) break block53;
                                                                    }
                                                                    catch (hi_0 v2) {
                                                                        throw hg_0.a(v2);
                                                                    }
                                                                    if (v1.P() != 4) break block52;
                                                                }
                                                                catch (hi_0 v3) {
                                                                    throw hg_0.a(v3);
                                                                }
                                                                v1 = var3_2;
                                                            }
                                                            catch (hi_0 v4) {
                                                                throw hg_0.a(v4);
                                                            }
                                                        }
                                                        var8_8 = v1.z();
                                                        var3_2.e(2);
                                                        if (var2_5 != null) break block63;
                                                    }
                                                    throw new hi_0(hg_0.a(5848, 15564));
                                                }
                                                var10_10 = var3_2.P();
                                                try {
                                                    v5 = var10_10;
                                                    v6 = 2;
                                                    if (var2_5 == null) break block54;
                                                    if (v5 == v6) {
                                                    }
                                                    ** GOTO lbl54
                                                }
                                                catch (hi_0 v7) {
                                                    throw hg_0.a(v7);
                                                }
                                                var9_9 = var3_2.G();
                                                try {
                                                    try {
                                                        var3_2.K();
                                                        if (var2_5 != null) break block55;
lbl54:
                                                        // 2 sources

                                                        v5 = var10_10;
                                                        if (var2_5 == null) break block56;
                                                    }
                                                    catch (hi_0 v8) {
                                                        throw hg_0.a(v8);
                                                    }
                                                    v6 = 3;
                                                }
                                                catch (hi_0 v9) {
                                                    throw hg_0.a(v9);
                                                }
                                            }
                                            try {
                                                if (v5 == v6) {
                                                    v5 = (int)var3_2.I();
                                                }
                                                ** GOTO lbl76
                                            }
                                            catch (hi_0 v10) {
                                                throw hg_0.a(v10);
                                            }
                                        }
                                        var9_9 = v5;
                                        try {
                                            var3_2.K();
                                            if (var2_5 != null) break block55;
lbl76:
                                            // 2 sources

                                            throw new hi_0(hg_0.a(5848, 15564));
                                        }
                                        catch (hi_0 v11) {
                                            throw hg_0.a(v11);
                                        }
                                    }
                                    try {
                                        v12 = var8_8.equalsIgnoreCase("x");
                                        if (var2_5 == null) break block57;
                                        if (v12 != 0) {
                                        }
                                        ** GOTO lbl91
                                    }
                                    catch (hi_0 v13) {
                                        throw hg_0.a(v13);
                                    }
                                    var4_3 = var9_9;
                                    try {
                                        if (var2_5 != null) break block58;
lbl91:
                                        // 2 sources

                                        v12 = var8_8.equalsIgnoreCase("y");
                                    }
                                    catch (hi_0 v14) {
                                        throw hg_0.a(v14);
                                    }
                                }
                                try {
                                    if (var2_5 == null) break block59;
                                    if (v12 != 0) {
                                    }
                                    ** GOTO lbl106
                                }
                                catch (hi_0 v15) {
                                    throw hg_0.a(v15);
                                }
                                var5_4 = var9_9;
                                try {
                                    if (var2_5 != null) break block58;
lbl106:
                                    // 2 sources

                                    v12 = var8_8.equalsIgnoreCase(hg_0.a(5851, -26995));
                                }
                                catch (hi_0 v16) {
                                    throw hg_0.a(v16);
                                }
                            }
                            try {
                                if (var2_5 == null) break block60;
                                if (v12 != 0) {
                                }
                                ** GOTO lbl121
                            }
                            catch (hi_0 v17) {
                                throw hg_0.a(v17);
                            }
                            var6_6 = var9_9;
                            try {
                                if (var2_5 != null) break block58;
lbl121:
                                // 2 sources

                                v12 = var8_8.equalsIgnoreCase(hg_0.a(5847, -27774));
                            }
                            catch (hi_0 v18) {
                                throw hg_0.a(v18);
                            }
                        }
                        try {
                            if (var2_5 == null) break block61;
                            if (v12 != 0) {
                            }
                            ** GOTO lbl138
                        }
                        catch (hi_0 v19) {
                            throw hg_0.a(v19);
                        }
                        v12 = var9_9;
                    }
                    var7_7 = v12;
                    try {
                        if (var2_5 != null) break block58;
lbl138:
                        // 2 sources

                        throw new hi_0(hg_0.a(5840, 30302) + var8_8);
                    }
                    catch (hi_0 v20) {
                        throw hg_0.a(v20);
                    }
                }
                try {
                    try {
                        v21 = var3_2;
                        if (var2_5 == null) break block62;
                        if (v21.P() != hg_0.a(17292, 892265204399193711L)) continue;
                    }
                    catch (hi_0 v22) {
                        throw hg_0.a(v22);
                    }
                    v21 = var3_2;
                }
                catch (hi_0 v23) {
                    throw hg_0.a(v23);
                }
            }
            v21.S(4);
        } while (var2_5 != null);
        return new Rectangle(var4_3, var5_4, var6_6, var7_7);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected Point i(yn_2 var1_1, Object var2_2) {
        var4_3 = var1_1.N;
        var5_4 = 0;
        var3_5 = nv_2.o();
        var6_6 = 0;
        do lbl-1000:
        // 3 sources

        {
            block62: {
                block60: {
                    block61: {
                        block59: {
                            block57: {
                                block58: {
                                    block56: {
                                        block63: {
                                            block50: {
                                                block55: {
                                                    block54: {
                                                        block52: {
                                                            block53: {
                                                                block51: {
                                                                    if (var4_3.P() != hg_0.a(6708, 1308407740119508954L)) ** GOTO lbl17
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    var4_3.K();
                                                                                    if (var3_5 == null) break block50;
                                                                                    if (var3_5 != null) break;
                                                                                }
                                                                                catch (hi_0 v0) {
                                                                                    throw hg_0.a(v0);
                                                                                }
lbl17:
                                                                                // 2 sources

                                                                                v1 = var4_3;
                                                                                if (var3_5 == null) break block51;
                                                                            }
                                                                            catch (hi_0 v2) {
                                                                                throw hg_0.a(v2);
                                                                            }
                                                                            if (v1.P() != 4) break block50;
                                                                        }
                                                                        catch (hi_0 v3) {
                                                                            throw hg_0.a(v3);
                                                                        }
                                                                        v1 = var4_3;
                                                                    }
                                                                    catch (hi_0 v4) {
                                                                        throw hg_0.a(v4);
                                                                    }
                                                                }
                                                                var7_7 = v1.z();
                                                                try {
                                                                    try {
                                                                        v5 = ok_0.Z.equals(var7_7);
                                                                        if (var3_5 == null) break block52;
                                                                        if (!v5) break block53;
                                                                    }
                                                                    catch (hi_0 v6) {
                                                                        throw hg_0.a(v6);
                                                                    }
                                                                    var1_1.N(hg_0.a(5826, 23561));
                                                                    if (var3_5 != null) ** GOTO lbl-1000
                                                                }
                                                                catch (hi_0 v7) {
                                                                    throw hg_0.a(v7);
                                                                }
                                                            }
                                                            try {
                                                                v8 = hg_0.a(5843, 28816);
                                                                if (var3_5 == null) break block54;
                                                                v5 = v8.equals(var7_7);
                                                            }
                                                            catch (hi_0 v9) {
                                                                throw hg_0.a(v9);
                                                            }
                                                        }
                                                        try {
                                                            if (!v5) break block55;
                                                            v8 = this.y(var1_1, var2_2);
                                                        }
                                                        catch (hi_0 v10) {
                                                            throw hg_0.a(v10);
                                                        }
                                                    }
                                                    return (Point)v8;
                                                }
                                                var4_3.e(2);
                                                if (var3_5 != null) break block63;
                                            }
                                            throw new hi_0(hg_0.a(5848, 15564));
                                        }
                                        var8_8 = var4_3.P();
                                        try {
                                            v11 = var8_8;
                                            v12 = 2;
                                            if (var3_5 == null) break block56;
                                            if (v11 == v12) {
                                            }
                                            ** GOTO lbl83
                                        }
                                        catch (hi_0 v13) {
                                            throw hg_0.a(v13);
                                        }
                                        var9_9 = var4_3.G();
                                        try {
                                            try {
                                                var4_3.K();
                                                if (var3_5 != null) break block57;
lbl83:
                                                // 2 sources

                                                v11 = var8_8;
                                                if (var3_5 == null) break block58;
                                            }
                                            catch (hi_0 v14) {
                                                throw hg_0.a(v14);
                                            }
                                            v12 = 3;
                                        }
                                        catch (hi_0 v15) {
                                            throw hg_0.a(v15);
                                        }
                                    }
                                    try {
                                        if (v11 == v12) {
                                            v11 = (int)var4_3.I();
                                        }
                                        ** GOTO lbl105
                                    }
                                    catch (hi_0 v16) {
                                        throw hg_0.a(v16);
                                    }
                                }
                                var9_9 = v11;
                                try {
                                    var4_3.K();
                                    if (var3_5 != null) break block57;
lbl105:
                                    // 2 sources

                                    throw new hi_0(hg_0.a(5824, 12059) + var4_3.B());
                                }
                                catch (hi_0 v17) {
                                    throw hg_0.a(v17);
                                }
                            }
                            try {
                                v18 = var7_7.equalsIgnoreCase("x");
                                if (var3_5 == null) break block59;
                                if (v18 != 0) {
                                }
                                ** GOTO lbl120
                            }
                            catch (hi_0 v19) {
                                throw hg_0.a(v19);
                            }
                            var5_4 = var9_9;
                            try {
                                if (var3_5 != null) break block60;
lbl120:
                                // 2 sources

                                v18 = var7_7.equalsIgnoreCase("y");
                            }
                            catch (hi_0 v20) {
                                throw hg_0.a(v20);
                            }
                        }
                        try {
                            if (var3_5 == null) break block61;
                            if (v18 != 0) {
                            }
                            ** GOTO lbl137
                        }
                        catch (hi_0 v21) {
                            throw hg_0.a(v21);
                        }
                        v18 = var9_9;
                    }
                    var6_6 = v18;
                    try {
                        if (var3_5 != null) break block60;
lbl137:
                        // 2 sources

                        throw new hi_0(hg_0.a(5840, 30302) + var7_7);
                    }
                    catch (hi_0 v22) {
                        throw hg_0.a(v22);
                    }
                }
                try {
                    try {
                        v23 = var4_3;
                        if (var3_5 == null) break block62;
                        if (v23.P() != hg_0.a(17292, 892265204399193711L)) continue;
                    }
                    catch (hi_0 v24) {
                        throw hg_0.a(v24);
                    }
                    v23 = var4_3;
                }
                catch (hi_0 v25) {
                    throw hg_0.a(v25);
                }
            }
            v23.S(4);
        } while (var3_5 != null);
        return new Point(var5_4, var6_6);
    }

    private Object y(yn_2 yn_22, Object object) {
        P7 p7 = yn_22.E();
        p7.e(4);
        String string = p7.z();
        yn_22.F(yn_22.A(), object);
        yn_22.O(new n_0(yn_22.A(), string));
        yn_22.A();
        yn_22.l(1);
        p7.S(hg_0.a(6708, 1308407740119508954L));
        yn_22.M(hg_0.a(6708, 1308407740119508954L));
        return null;
    }

    @Override
    public int j() {
        return hg_0.a(27645, 5503816077835212309L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[21];
                        var11_1 = 0;
                        var10_2 = "\u007f\u0010W^\u00ba\u00d1\u0004\u000e\u00e3\u00b0\u00d4\u000eqH\u00e9\u00d9\u0083\\\u00cf\u00fb\u00d8p\u00ba<\u001cI\u0018\u0095\u00d0\u00d1J\u00cf\u00fdFv\u00aev\u00d1\u00aeDT\u00d3DW2\u00f81\u00f3y.\u009f\u0004\u00eb\u008f\u00ae\"\u0006\u00ab\u00ec\u00cd\u00c1\u00e9\"\u0005\u0095N\u00fb\u000b\u0083\u0005;\u00a0\u00eeo\u00be\fS\u00ad\u00ade\u000b\u00cb\u00de\t\u00fa.\u00fe\u00f7\u0005\u00cd\u0083\u00f0\u00b2\u00e2\f\u00c4\u0005_pUi\u0015]\u0083\u00a4\u00d1\u00a6\u0018\u0002\u000e#\u0091\u0091\u0086\u008d\u0019\u00d7\u009b\u00fe\u0013\u00a1\u00e3o\u00b2\u00c0\u00ec\n\u00ea\u00ad\u0002\u00e5\u00f0\u0004\u008d\u00dd\u00cba\u000eJ\t\u008e\u00f1oYR[kd\u00cc\u00be\u00d2\u0019\u0004\u00cd\u00f5\u00c3d\u0005yq\u00ffJ\u00b0\u000e\u0092?\u00b79\u001c\u00ee\u00cd\u0086y\u00ceY\u0096\"0\u0004\u0006\u0086\u0013\u0003\u000f\u0001|\u00e7_B\u008c\u00f7\u00e1\u00df3ZT\f^\u00e7";
                        var12_3 = "\u007f\u0010W^\u00ba\u00d1\u0004\u000e\u00e3\u00b0\u00d4\u000eqH\u00e9\u00d9\u0083\\\u00cf\u00fb\u00d8p\u00ba<\u001cI\u0018\u0095\u00d0\u00d1J\u00cf\u00fdFv\u00aev\u00d1\u00aeDT\u00d3DW2\u00f81\u00f3y.\u009f\u0004\u00eb\u008f\u00ae\"\u0006\u00ab\u00ec\u00cd\u00c1\u00e9\"\u0005\u0095N\u00fb\u000b\u0083\u0005;\u00a0\u00eeo\u00be\fS\u00ad\u00ade\u000b\u00cb\u00de\t\u00fa.\u00fe\u00f7\u0005\u00cd\u0083\u00f0\u00b2\u00e2\f\u00c4\u0005_pUi\u0015]\u0083\u00a4\u00d1\u00a6\u0018\u0002\u000e#\u0091\u0091\u0086\u008d\u0019\u00d7\u009b\u00fe\u0013\u00a1\u00e3o\u00b2\u00c0\u00ec\n\u00ea\u00ad\u0002\u00e5\u00f0\u0004\u008d\u00dd\u00cba\u000eJ\t\u008e\u00f1oYR[kd\u00cc\u00be\u00d2\u0019\u0004\u00cd\u00f5\u00c3d\u0005yq\u00ffJ\u00b0\u000e\u0092?\u00b79\u001c\u00ee\u00cd\u0086y\u00ceY\u0096\"0\u0004\u0006\u0086\u0013\u0003\u000f\u0001|\u00e7_B\u008c\u00f7\u00e1\u00df3ZT\f^\u00e7".length();
                        var9_4 = 6;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 53;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00da\u0019\u00eba'\u0005\u00f8\u00d2\u00f6\u0007\u00a8";
                            var12_3 = "\u00da\u0019\u00eba'\u0005\u00f8\u00d2\u00f6\u0007\u00a8".length();
                            var9_4 = 5;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 102;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl85
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 26;
                                    break;
                                }
                                case 1: {
                                    v15 = 65;
                                    break;
                                }
                                case 2: {
                                    v15 = 100;
                                    break;
                                }
                                case 3: {
                                    v15 = 73;
                                    break;
                                }
                                case 4: {
                                    v15 = 99;
                                    break;
                                }
                                case 5: {
                                    v15 = 95;
                                    break;
                                }
                                default: {
                                    v15 = 45;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
lbl85:
                        // 2 sources

                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var14_6);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl95:
                        // 1 sources

                        ** continue;
                    }
                }
                hg_0.a = var13;
                hg_0.b = new String[21];
                var0_7 = 1851304529347514432L;
                var6_8 = new long[12];
                var3_9 = 0;
                var4_10 = "6ir\u000b\u001cr5\u00be:lB\u0007\u0018u\u00c9lu\u00e8\u000f-\u00de\u00a7\u0006YXy\u008fsu\u00977n\u00ae\u00ca1\u001aa\u00e5w\u0097~\u0012j\u00e6\u00a7 ~\u00dd\u00aak\u0091\u00d4\u00bf\u009a.G\u009e*zw'2\u00ad\u00a1\u008d\u00b6\u00b9\u00b5~\u00bf\u009ex\u00cb\u00f4L-\u00f3s.?";
                var5_11 = "6ir\u000b\u001cr5\u00be:lB\u0007\u0018u\u00c9lu\u00e8\u000f-\u00de\u00a7\u0006YXy\u008fsu\u00977n\u00ae\u00ca1\u001aa\u00e5w\u0097~\u0012j\u00e6\u00a7 ~\u00dd\u00aak\u0091\u00d4\u00bf\u009a.G\u009e*zw'2\u00ad\u00a1\u008d\u00b6\u00b9\u00b5~\u00bf\u009ex\u00cb\u00f4L-\u00f3s.?".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "Gk\f=\u00cb\b\u00ba\u00e5H\u00a9\u008b\u00e5c\u0095\u00ff\u00d7";
                    var5_11 = "Gk\f=\u00cb\b\u00ba\u00e5H\u00a9\u008b\u00e5c\u0095\u00ff\u00d7".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl136:
                // 1 sources

                ** continue;
            }
        }
        hg_0.c = var6_8;
        hg_0.d = new Integer[12];
        hg_0.w = new hg_0();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x16D2) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 152;
                    break;
                }
                case 1: {
                    n14 = 239;
                    break;
                }
                case 2: {
                    n14 = 245;
                    break;
                }
                case 3: {
                    n14 = 131;
                    break;
                }
                case 4: {
                    n14 = 115;
                    break;
                }
                case 5: {
                    n14 = 51;
                    break;
                }
                case 6: {
                    n14 = 187;
                    break;
                }
                case 7: {
                    n14 = 212;
                    break;
                }
                case 8: {
                    n14 = 174;
                    break;
                }
                case 9: {
                    n14 = 8;
                    break;
                }
                case 10: {
                    n14 = 136;
                    break;
                }
                case 11: {
                    n14 = 214;
                    break;
                }
                case 12: {
                    n14 = 220;
                    break;
                }
                case 13: {
                    n14 = 121;
                    break;
                }
                case 14: {
                    n14 = 28;
                    break;
                }
                case 15: {
                    n14 = 128;
                    break;
                }
                case 16: {
                    n14 = 94;
                    break;
                }
                case 17: {
                    n14 = 175;
                    break;
                }
                case 18: {
                    n14 = 57;
                    break;
                }
                case 19: {
                    n14 = 215;
                    break;
                }
                case 20: {
                    n14 = 147;
                    break;
                }
                case 21: {
                    n14 = 17;
                    break;
                }
                case 22: {
                    n14 = 83;
                    break;
                }
                case 23: {
                    n14 = 235;
                    break;
                }
                case 24: {
                    n14 = 114;
                    break;
                }
                case 25: {
                    n14 = 221;
                    break;
                }
                case 26: {
                    n14 = 145;
                    break;
                }
                case 27: {
                    n14 = 86;
                    break;
                }
                case 28: {
                    n14 = 39;
                    break;
                }
                case 29: {
                    n14 = 59;
                    break;
                }
                case 30: {
                    n14 = 26;
                    break;
                }
                case 31: {
                    n14 = 205;
                    break;
                }
                case 32: {
                    n14 = 68;
                    break;
                }
                case 33: {
                    n14 = 139;
                    break;
                }
                case 34: {
                    n14 = 55;
                    break;
                }
                case 35: {
                    n14 = 154;
                    break;
                }
                case 36: {
                    n14 = 170;
                    break;
                }
                case 37: {
                    n14 = 35;
                    break;
                }
                case 38: {
                    n14 = 142;
                    break;
                }
                case 39: {
                    n14 = 189;
                    break;
                }
                case 40: {
                    n14 = 176;
                    break;
                }
                case 41: {
                    n14 = 87;
                    break;
                }
                case 42: {
                    n14 = 37;
                    break;
                }
                case 43: {
                    n14 = 32;
                    break;
                }
                case 44: {
                    n14 = 74;
                    break;
                }
                case 45: {
                    n14 = 244;
                    break;
                }
                case 46: {
                    n14 = 190;
                    break;
                }
                case 47: {
                    n14 = 25;
                    break;
                }
                case 48: {
                    n14 = 148;
                    break;
                }
                case 49: {
                    n14 = 160;
                    break;
                }
                case 50: {
                    n14 = 90;
                    break;
                }
                case 51: {
                    n14 = 252;
                    break;
                }
                case 52: {
                    n14 = 58;
                    break;
                }
                case 53: {
                    n14 = 204;
                    break;
                }
                case 54: {
                    n14 = 104;
                    break;
                }
                case 55: {
                    n14 = 60;
                    break;
                }
                case 56: {
                    n14 = 38;
                    break;
                }
                case 57: {
                    n14 = 191;
                    break;
                }
                case 58: {
                    n14 = 9;
                    break;
                }
                case 59: {
                    n14 = 162;
                    break;
                }
                case 60: {
                    n14 = 76;
                    break;
                }
                case 61: {
                    n14 = 111;
                    break;
                }
                case 62: {
                    n14 = 173;
                    break;
                }
                case 63: {
                    n14 = 133;
                    break;
                }
                case 64: {
                    n14 = 98;
                    break;
                }
                case 65: {
                    n14 = 56;
                    break;
                }
                case 66: {
                    n14 = 72;
                    break;
                }
                case 67: {
                    n14 = 164;
                    break;
                }
                case 68: {
                    n14 = 99;
                    break;
                }
                case 69: {
                    n14 = 48;
                    break;
                }
                case 70: {
                    n14 = 192;
                    break;
                }
                case 71: {
                    n14 = 172;
                    break;
                }
                case 72: {
                    n14 = 254;
                    break;
                }
                case 73: {
                    n14 = 118;
                    break;
                }
                case 74: {
                    n14 = 34;
                    break;
                }
                case 75: {
                    n14 = 119;
                    break;
                }
                case 76: {
                    n14 = 157;
                    break;
                }
                case 77: {
                    n14 = 166;
                    break;
                }
                case 78: {
                    n14 = 78;
                    break;
                }
                case 79: {
                    n14 = 103;
                    break;
                }
                case 80: {
                    n14 = 144;
                    break;
                }
                case 81: {
                    n14 = 0;
                    break;
                }
                case 82: {
                    n14 = 3;
                    break;
                }
                case 83: {
                    n14 = 237;
                    break;
                }
                case 84: {
                    n14 = 64;
                    break;
                }
                case 85: {
                    n14 = 88;
                    break;
                }
                case 86: {
                    n14 = 11;
                    break;
                }
                case 87: {
                    n14 = 208;
                    break;
                }
                case 88: {
                    n14 = 155;
                    break;
                }
                case 89: {
                    n14 = 236;
                    break;
                }
                case 90: {
                    n14 = 207;
                    break;
                }
                case 91: {
                    n14 = 209;
                    break;
                }
                case 92: {
                    n14 = 151;
                    break;
                }
                case 93: {
                    n14 = 97;
                    break;
                }
                case 94: {
                    n14 = 49;
                    break;
                }
                case 95: {
                    n14 = 135;
                    break;
                }
                case 96: {
                    n14 = 218;
                    break;
                }
                case 97: {
                    n14 = 92;
                    break;
                }
                case 98: {
                    n14 = 247;
                    break;
                }
                case 99: {
                    n14 = 197;
                    break;
                }
                case 100: {
                    n14 = 23;
                    break;
                }
                case 101: {
                    n14 = 33;
                    break;
                }
                case 102: {
                    n14 = 65;
                    break;
                }
                case 103: {
                    n14 = 181;
                    break;
                }
                case 104: {
                    n14 = 210;
                    break;
                }
                case 105: {
                    n14 = 12;
                    break;
                }
                case 106: {
                    n14 = 137;
                    break;
                }
                case 107: {
                    n14 = 156;
                    break;
                }
                case 108: {
                    n14 = 70;
                    break;
                }
                case 109: {
                    n14 = 108;
                    break;
                }
                case 110: {
                    n14 = 31;
                    break;
                }
                case 111: {
                    n14 = 200;
                    break;
                }
                case 112: {
                    n14 = 41;
                    break;
                }
                case 113: {
                    n14 = 188;
                    break;
                }
                case 114: {
                    n14 = 82;
                    break;
                }
                case 115: {
                    n14 = 61;
                    break;
                }
                case 116: {
                    n14 = 16;
                    break;
                }
                case 117: {
                    n14 = 232;
                    break;
                }
                case 118: {
                    n14 = 42;
                    break;
                }
                case 119: {
                    n14 = 66;
                    break;
                }
                case 120: {
                    n14 = 195;
                    break;
                }
                case 121: {
                    n14 = 146;
                    break;
                }
                case 122: {
                    n14 = 132;
                    break;
                }
                case 123: {
                    n14 = 45;
                    break;
                }
                case 124: {
                    n14 = 228;
                    break;
                }
                case 125: {
                    n14 = 126;
                    break;
                }
                case 126: {
                    n14 = 177;
                    break;
                }
                case 127: {
                    n14 = 246;
                    break;
                }
                case 128: {
                    n14 = 80;
                    break;
                }
                case 129: {
                    n14 = 226;
                    break;
                }
                case 130: {
                    n14 = 224;
                    break;
                }
                case 131: {
                    n14 = 199;
                    break;
                }
                case 132: {
                    n14 = 150;
                    break;
                }
                case 133: {
                    n14 = 201;
                    break;
                }
                case 134: {
                    n14 = 222;
                    break;
                }
                case 135: {
                    n14 = 40;
                    break;
                }
                case 136: {
                    n14 = 19;
                    break;
                }
                case 137: {
                    n14 = 81;
                    break;
                }
                case 138: {
                    n14 = 14;
                    break;
                }
                case 139: {
                    n14 = 62;
                    break;
                }
                case 140: {
                    n14 = 63;
                    break;
                }
                case 141: {
                    n14 = 124;
                    break;
                }
                case 142: {
                    n14 = 171;
                    break;
                }
                case 143: {
                    n14 = 255;
                    break;
                }
                case 144: {
                    n14 = 105;
                    break;
                }
                case 145: {
                    n14 = 225;
                    break;
                }
                case 146: {
                    n14 = 13;
                    break;
                }
                case 147: {
                    n14 = 4;
                    break;
                }
                case 148: {
                    n14 = 102;
                    break;
                }
                case 149: {
                    n14 = 140;
                    break;
                }
                case 150: {
                    n14 = 67;
                    break;
                }
                case 151: {
                    n14 = 18;
                    break;
                }
                case 152: {
                    n14 = 213;
                    break;
                }
                case 153: {
                    n14 = 219;
                    break;
                }
                case 154: {
                    n14 = 243;
                    break;
                }
                case 155: {
                    n14 = 46;
                    break;
                }
                case 156: {
                    n14 = 117;
                    break;
                }
                case 157: {
                    n14 = 198;
                    break;
                }
                case 158: {
                    n14 = 27;
                    break;
                }
                case 159: {
                    n14 = 5;
                    break;
                }
                case 160: {
                    n14 = 227;
                    break;
                }
                case 161: {
                    n14 = 123;
                    break;
                }
                case 162: {
                    n14 = 93;
                    break;
                }
                case 163: {
                    n14 = 15;
                    break;
                }
                case 164: {
                    n14 = 77;
                    break;
                }
                case 165: {
                    n14 = 100;
                    break;
                }
                case 166: {
                    n14 = 158;
                    break;
                }
                case 167: {
                    n14 = 120;
                    break;
                }
                case 168: {
                    n14 = 106;
                    break;
                }
                case 169: {
                    n14 = 7;
                    break;
                }
                case 170: {
                    n14 = 125;
                    break;
                }
                case 171: {
                    n14 = 89;
                    break;
                }
                case 172: {
                    n14 = 138;
                    break;
                }
                case 173: {
                    n14 = 95;
                    break;
                }
                case 174: {
                    n14 = 127;
                    break;
                }
                case 175: {
                    n14 = 30;
                    break;
                }
                case 176: {
                    n14 = 20;
                    break;
                }
                case 177: {
                    n14 = 29;
                    break;
                }
                case 178: {
                    n14 = 253;
                    break;
                }
                case 179: {
                    n14 = 167;
                    break;
                }
                case 180: {
                    n14 = 73;
                    break;
                }
                case 181: {
                    n14 = 234;
                    break;
                }
                case 182: {
                    n14 = 43;
                    break;
                }
                case 183: {
                    n14 = 107;
                    break;
                }
                case 184: {
                    n14 = 180;
                    break;
                }
                case 185: {
                    n14 = 6;
                    break;
                }
                case 186: {
                    n14 = 54;
                    break;
                }
                case 187: {
                    n14 = 149;
                    break;
                }
                case 188: {
                    n14 = 163;
                    break;
                }
                case 189: {
                    n14 = 50;
                    break;
                }
                case 190: {
                    n14 = 153;
                    break;
                }
                case 191: {
                    n14 = 141;
                    break;
                }
                case 192: {
                    n14 = 47;
                    break;
                }
                case 193: {
                    n14 = 165;
                    break;
                }
                case 194: {
                    n14 = 251;
                    break;
                }
                case 195: {
                    n14 = 110;
                    break;
                }
                case 196: {
                    n14 = 238;
                    break;
                }
                case 197: {
                    n14 = 84;
                    break;
                }
                case 198: {
                    n14 = 202;
                    break;
                }
                case 199: {
                    n14 = 186;
                    break;
                }
                case 200: {
                    n14 = 241;
                    break;
                }
                case 201: {
                    n14 = 185;
                    break;
                }
                case 202: {
                    n14 = 217;
                    break;
                }
                case 203: {
                    n14 = 206;
                    break;
                }
                case 204: {
                    n14 = 1;
                    break;
                }
                case 205: {
                    n14 = 101;
                    break;
                }
                case 206: {
                    n14 = 75;
                    break;
                }
                case 207: {
                    n14 = 85;
                    break;
                }
                case 208: {
                    n14 = 179;
                    break;
                }
                case 209: {
                    n14 = 182;
                    break;
                }
                case 210: {
                    n14 = 143;
                    break;
                }
                case 211: {
                    n14 = 240;
                    break;
                }
                case 212: {
                    n14 = 10;
                    break;
                }
                case 213: {
                    n14 = 231;
                    break;
                }
                case 214: {
                    n14 = 36;
                    break;
                }
                case 215: {
                    n14 = 194;
                    break;
                }
                case 216: {
                    n14 = 122;
                    break;
                }
                case 217: {
                    n14 = 169;
                    break;
                }
                case 218: {
                    n14 = 250;
                    break;
                }
                case 219: {
                    n14 = 21;
                    break;
                }
                case 220: {
                    n14 = 69;
                    break;
                }
                case 221: {
                    n14 = 134;
                    break;
                }
                case 222: {
                    n14 = 196;
                    break;
                }
                case 223: {
                    n14 = 168;
                    break;
                }
                case 224: {
                    n14 = 233;
                    break;
                }
                case 225: {
                    n14 = 242;
                    break;
                }
                case 226: {
                    n14 = 248;
                    break;
                }
                case 227: {
                    n14 = 229;
                    break;
                }
                case 228: {
                    n14 = 216;
                    break;
                }
                case 229: {
                    n14 = 109;
                    break;
                }
                case 230: {
                    n14 = 161;
                    break;
                }
                case 231: {
                    n14 = 113;
                    break;
                }
                case 232: {
                    n14 = 159;
                    break;
                }
                case 233: {
                    n14 = 184;
                    break;
                }
                case 234: {
                    n14 = 71;
                    break;
                }
                case 235: {
                    n14 = 52;
                    break;
                }
                case 236: {
                    n14 = 203;
                    break;
                }
                case 237: {
                    n14 = 79;
                    break;
                }
                case 238: {
                    n14 = 130;
                    break;
                }
                case 239: {
                    n14 = 44;
                    break;
                }
                case 240: {
                    n14 = 24;
                    break;
                }
                case 241: {
                    n14 = 230;
                    break;
                }
                case 242: {
                    n14 = 193;
                    break;
                }
                case 243: {
                    n14 = 53;
                    break;
                }
                case 244: {
                    n14 = 96;
                    break;
                }
                case 245: {
                    n14 = 22;
                    break;
                }
                case 246: {
                    n14 = 91;
                    break;
                }
                case 247: {
                    n14 = 249;
                    break;
                }
                case 248: {
                    n14 = 183;
                    break;
                }
                case 249: {
                    n14 = 211;
                    break;
                }
                case 250: {
                    n14 = 129;
                    break;
                }
                case 251: {
                    n14 = 2;
                    break;
                }
                case 252: {
                    n14 = 223;
                    break;
                }
                case 253: {
                    n14 = 116;
                    break;
                }
                case 254: {
                    n14 = 178;
                    break;
                }
                default: {
                    n14 = 112;
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
            hg_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7DEA;
        if (d[n11] == null) {
            hg_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

