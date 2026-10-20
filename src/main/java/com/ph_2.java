/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B8;
import com.DX;
import com.H5;
import com.IG;
import com.KE;
import com.LQ;
import com.O0;
import com.S9;
import com.W3;
import com.X4;
import com._o_0;
import com.a0;
import com.ad_0;
import com.ak_0;
import com.en_0;
import com.ep_2;
import com.fn_0;
import com.hf_0;
import com.hi_0;
import com.il_0;
import com.ks_0;
import com.nj_2;
import com.nz_2;
import com.oc_0;
import com.ok_0;
import com.uT;
import com.xd_2;
import com.yn_2;
import com.zC;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/*
 * Renamed from com.ph
 */
public class ph_2
implements xd_2 {
    private static ConcurrentMap s;
    private final String V;
    private a0[] K;
    private boolean i;
    private en_0 F;
    private IG w;
    private boolean T;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long[] e;
    private static final Long[] f;

    public ph_2(String string) {
        this(string, en_0.p(), IG.G(), true);
    }

    public ph_2(String string, boolean bl) {
        this(string, en_0.p(), IG.G(), bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ph_2(String string, en_0 en_02, IG iG, boolean bl) {
        String string2;
        block5: {
            String string3 = hi_0.C();
            String string4 = string3;
            try {
                string2 = string;
                if (string4 != null) break block5;
                if (string2 == null) throw new hf_0(ph_2.a(2743, -17262));
            }
            catch (hf_0 hf_02) {
                throw ph_2.a(hf_02);
            }
            string2 = string;
        }
        try {
            if (string2.length() == 0) {
                throw new hf_0(ph_2.a(2743, -17262));
            }
        }
        catch (hf_0 hf_03) {
            throw ph_2.a(hf_03);
        }
        this.V = string;
        this.F = en_02;
        this.w = iG;
        this.T = bl;
    }

    protected void x() {
        block6: {
            block5: {
                String string = hi_0.C();
                try {
                    if (this.K != null) {
                        return;
                    }
                }
                catch (hf_0 hf_02) {
                    throw ph_2.a(hf_02);
                }
                try {
                    if (!"*".equals(this.V)) break block5;
                    this.K = new a0[]{_o_0.O};
                    if (string == null) break block6;
                }
                catch (hf_0 hf_03) {
                    throw ph_2.a(hf_03);
                }
            }
            S9 s9 = new S9(this.V);
            this.K = s9.S();
            this.i = S9.Y(s9);
        }
    }

    /*
     * Loose catch block
     */
    public boolean X() {
        String string = hi_0.C();
        try {
            this.x();
            int n10 = 0;
            while (n10 < this.K.length) {
                block11: {
                    block10: {
                        block9: {
                            Class<?> clazz;
                            block12: {
                                a0 a02 = this.K[n10];
                                clazz = a02.getClass();
                                if (string != null) break block11;
                                if (clazz == DX.class) break block10;
                                break block12;
                                catch (hf_0 hf_02) {
                                    throw ph_2.a(hf_02);
                                }
                            }
                            try {
                                block13: {
                                    if (clazz != W3.class) break block9;
                                    break block13;
                                    catch (hf_0 hf_03) {
                                        throw ph_2.a(hf_03);
                                    }
                                }
                                if (string == null) break block10;
                            }
                            catch (hf_0 hf_04) {
                                throw ph_2.a(hf_04);
                            }
                        }
                        return false;
                    }
                    ++n10;
                }
                if (string == null) continue;
            }
            return true;
        }
        catch (hf_0 hf_05) {
            return false;
        }
    }

    public Object S(Object object) {
        Object object2;
        block8: {
            Object object3;
            String string;
            block6: {
                block7: {
                    string = hi_0.C();
                    try {
                        try {
                            object3 = object;
                            if (string != null) break block6;
                            if (object3 != null) break block7;
                        }
                        catch (hf_0 hf_02) {
                            throw ph_2.a(hf_02);
                        }
                        return null;
                    }
                    catch (hf_0 hf_03) {
                        throw ph_2.a(hf_03);
                    }
                }
                this.x();
                object3 = object;
            }
            Object object4 = object3;
            for (int i2 = 0; i2 < this.K.length; ++i2) {
                a0 a02 = this.K[i2];
                object2 = a02.Y(this, object, object4);
                if (string == null) {
                    object4 = object2;
                    if (string == null) continue;
                }
                break block8;
            }
            object2 = object4;
        }
        return object2;
    }

    public Object L(Object object, Type type, IG iG) {
        Object object2 = this.S(object);
        return B8.I(object2, type, iG);
    }

    public Object F(Object object, Type type) {
        return this.L(object, type, IG.G());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Object e(yn_2 var1_1) {
        block110: {
            block109: {
                block107: {
                    block106: {
                        block104: {
                            block105: {
                                block102: {
                                    block103: {
                                        var2_2 = hi_0.C();
                                        try {
                                            try {
                                                if (var2_2 != null) break block102;
                                                if (var1_1 != null) break block103;
                                            }
                                            catch (hf_0 v0) {
                                                throw ph_2.a(v0);
                                            }
                                            return null;
                                        }
                                        catch (hf_0 v1) {
                                            throw ph_2.a(v1);
                                        }
                                    }
                                    this.x();
                                }
                                try {
                                    v2 = this.i;
                                    if (var2_2 != null) break block104;
                                    if (v2 == 0) break block105;
                                }
                                catch (hf_0 v3) {
                                    throw ph_2.a(v3);
                                }
                                var3_3 = var1_1.M();
                                return this.S(var3_3);
                            }
                            try {
                                v4 = this.K;
                                if (var2_2 != null) break block106;
                                v2 = v4.length;
                            }
                            catch (hf_0 v5) {
                                throw ph_2.a(v5);
                            }
                        }
                        try {
                            if (v2 == 0) {
                                return var1_1.M();
                            }
                        }
                        catch (hf_0 v6) {
                            throw ph_2.a(v6);
                        }
                        v4 = this.K;
                    }
                    var3_4 = v4[this.K.length - 1];
                    try {
                        block108: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                v7 = var3_4;
                                                if (var2_2 != null) break block107;
                                                if (v7 instanceof fn_0) break block108;
                                            }
                                            catch (hf_0 v8) {
                                                throw ph_2.a(v8);
                                            }
                                            v7 = var3_4;
                                            if (var2_2 != null) break block107;
                                        }
                                        catch (hf_0 v9) {
                                            throw ph_2.a(v9);
                                        }
                                        if (v7 instanceof zC) break block108;
                                    }
                                    catch (hf_0 v10) {
                                        throw ph_2.a(v10);
                                    }
                                    v7 = var3_4;
                                    if (var2_2 != null) break block107;
                                }
                                catch (hf_0 v11) {
                                    throw ph_2.a(v11);
                                }
                                if (!(v7 instanceof ad_0)) break block109;
                            }
                            catch (hf_0 v12) {
                                throw ph_2.a(v12);
                            }
                        }
                        v7 = this.S(var1_1.M());
                    }
                    catch (hf_0 v13) {
                        throw ph_2.a(v13);
                    }
                }
                return v7;
            }
            var4_5 = null;
            for (var5_6 = 0; var5_6 < this.K.length; ++var5_6) {
                block124: {
                    block115: {
                        block119: {
                            block123: {
                                block122: {
                                    block121: {
                                        block120: {
                                            block116: {
                                                block117: {
                                                    block118: {
                                                        block114: {
                                                            block113: {
                                                                block111: {
                                                                    block112: {
                                                                        v14 = this.K[var5_6];
                                                                        if (var2_2 != null) break block110;
                                                                        var6_7 = v14;
                                                                        try {
                                                                            try {
                                                                                v15 = var5_6;
                                                                                if (var2_2 != null) break block111;
                                                                                if (v15 != this.K.length - 1) break block112;
                                                                            }
                                                                            catch (hf_0 v16) {
                                                                                throw ph_2.a(v16);
                                                                            }
                                                                            v15 = 1;
                                                                            break block111;
                                                                        }
                                                                        catch (hf_0 v17) {
                                                                            throw ph_2.a(v17);
                                                                        }
                                                                    }
                                                                    v15 = 0;
                                                                }
                                                                var7_8 = v15;
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v18 = var4_5;
                                                                            if (var2_2 != null) break block113;
                                                                            if (v18 != null) {
                                                                            }
                                                                            ** GOTO lbl128
                                                                        }
                                                                        catch (hf_0 v19) {
                                                                            throw ph_2.a(v19);
                                                                        }
                                                                        v20 = var4_5;
                                                                        if (var2_2 != null) break block114;
                                                                    }
                                                                    catch (hf_0 v21) {
                                                                        throw ph_2.a(v21);
                                                                    }
                                                                    v18 = v20.t;
                                                                }
                                                                catch (hf_0 v22) {
                                                                    throw ph_2.a(v22);
                                                                }
                                                            }
                                                            if (v18 == null) ** GOTO lbl128
                                                            v20 = var4_5;
                                                        }
                                                        try {
                                                            try {
                                                                v20.t = var6_7.Y(this, null, var4_5.t);
                                                                if (var2_2 == null) continue;
lbl128:
                                                                // 3 sources

                                                                v23 = var7_8;
                                                                if (var2_2 != null) break block115;
                                                            }
                                                            catch (hf_0 v24) {
                                                                throw ph_2.a(v24);
                                                            }
                                                            if (v23 == 0) {
                                                            }
                                                            ** GOTO lbl313
                                                        }
                                                        catch (hf_0 v25) {
                                                            throw ph_2.a(v25);
                                                        }
                                                        var9_10 = this.K[var5_6 + 1];
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
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    v26 = var6_7 instanceof W3;
                                                                                                                    if (var2_2 != null) break block116;
                                                                                                                    if (v26 != 0) {
                                                                                                                    }
                                                                                                                    ** GOTO lbl232
                                                                                                                }
                                                                                                                catch (hf_0 v27) {
                                                                                                                    throw ph_2.a(v27);
                                                                                                                }
                                                                                                                v26 = W3.Z((W3)var6_7);
                                                                                                                if (var2_2 != null) break block116;
                                                                                                            }
                                                                                                            catch (hf_0 v28) {
                                                                                                                throw ph_2.a(v28);
                                                                                                            }
                                                                                                            if (v26 != 0) {
                                                                                                            }
                                                                                                            ** GOTO lbl232
                                                                                                        }
                                                                                                        catch (hf_0 v29) {
                                                                                                            throw ph_2.a(v29);
                                                                                                        }
                                                                                                        v30 = var9_10 instanceof DX;
                                                                                                        if (var2_2 != null) break block117;
                                                                                                    }
                                                                                                    catch (hf_0 v31) {
                                                                                                        throw ph_2.a(v31);
                                                                                                    }
                                                                                                    if (v30 != 0) break block118;
                                                                                                }
                                                                                                catch (hf_0 v32) {
                                                                                                    throw ph_2.a(v32);
                                                                                                }
                                                                                                v30 = var9_10 instanceof ad_0;
                                                                                                if (var2_2 != null) break block117;
                                                                                            }
                                                                                            catch (hf_0 v33) {
                                                                                                throw ph_2.a(v33);
                                                                                            }
                                                                                            if (v30 != 0) break block118;
                                                                                        }
                                                                                        catch (hf_0 v34) {
                                                                                            throw ph_2.a(v34);
                                                                                        }
                                                                                        v30 = var9_10 instanceof nz_2;
                                                                                        if (var2_2 != null) break block117;
                                                                                    }
                                                                                    catch (hf_0 v35) {
                                                                                        throw ph_2.a(v35);
                                                                                    }
                                                                                    if (v30 != 0) break block118;
                                                                                }
                                                                                catch (hf_0 v36) {
                                                                                    throw ph_2.a(v36);
                                                                                }
                                                                                v30 = var9_10 instanceof H5;
                                                                                if (var2_2 != null) break block117;
                                                                            }
                                                                            catch (hf_0 v37) {
                                                                                throw ph_2.a(v37);
                                                                            }
                                                                            if (v30 != 0) break block118;
                                                                        }
                                                                        catch (hf_0 v38) {
                                                                            throw ph_2.a(v38);
                                                                        }
                                                                        v30 = var9_10 instanceof W3;
                                                                        if (var2_2 != null) break block117;
                                                                    }
                                                                    catch (hf_0 v39) {
                                                                        throw ph_2.a(v39);
                                                                    }
                                                                    if (v30 != 0) break block118;
                                                                }
                                                                catch (hf_0 v40) {
                                                                    throw ph_2.a(v40);
                                                                }
                                                                v26 = var9_10 instanceof LQ;
                                                                if (var2_2 != null) break block116;
                                                            }
                                                            catch (hf_0 v41) {
                                                                throw ph_2.a(v41);
                                                            }
                                                            if (v26 != 0) {
                                                            }
                                                            ** GOTO lbl232
                                                        }
                                                        catch (hf_0 v42) {
                                                            throw ph_2.a(v42);
                                                        }
                                                    }
                                                    v30 = 1;
                                                }
                                                var8_9 = v30;
                                                try {
                                                    if (var2_2 == null) break block119;
lbl232:
                                                    // 4 sources

                                                    v26 = var9_10 instanceof DX;
                                                }
                                                catch (hf_0 v43) {
                                                    throw ph_2.a(v43);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (var2_2 != null) break block120;
                                                        if (v26 != 0) {
                                                        }
                                                        ** GOTO lbl259
                                                    }
                                                    catch (hf_0 v44) {
                                                        throw ph_2.a(v44);
                                                    }
                                                    v26 = DX.n((DX)var9_10);
                                                    if (var2_2 != null) break block120;
                                                }
                                                catch (hf_0 v45) {
                                                    throw ph_2.a(v45);
                                                }
                                                if (v26 < 0) {
                                                }
                                                ** GOTO lbl259
                                            }
                                            catch (hf_0 v46) {
                                                throw ph_2.a(v46);
                                            }
                                            var8_9 = 1;
                                            try {
                                                if (var2_2 == null) break block119;
lbl259:
                                                // 3 sources

                                                v26 = var9_10 instanceof LQ;
                                            }
                                            catch (hf_0 v47) {
                                                throw ph_2.a(v47);
                                            }
                                        }
                                        try {
                                            if (var2_2 != null) break block121;
                                            if (v26 != 0) {
                                            }
                                            ** GOTO lbl274
                                        }
                                        catch (hf_0 v48) {
                                            throw ph_2.a(v48);
                                        }
                                        var8_9 = 1;
                                        try {
                                            if (var2_2 == null) break block119;
lbl274:
                                            // 2 sources

                                            v26 = var6_7 instanceof _o_0;
                                        }
                                        catch (hf_0 v49) {
                                            throw ph_2.a(v49);
                                        }
                                    }
                                    try {
                                        if (var2_2 != null) break block122;
                                        if (v26 != 0) {
                                        }
                                        ** GOTO lbl289
                                    }
                                    catch (hf_0 v50) {
                                        throw ph_2.a(v50);
                                    }
                                    var8_9 = 1;
                                    try {
                                        if (var2_2 == null) break block119;
lbl289:
                                        // 2 sources

                                        v26 = var6_7 instanceof ad_0;
                                    }
                                    catch (hf_0 v51) {
                                        throw ph_2.a(v51);
                                    }
                                }
                                try {
                                    if (var2_2 != null) break block123;
                                    if (v26 != 0) {
                                    }
                                    ** GOTO lbl304
                                }
                                catch (hf_0 v52) {
                                    throw ph_2.a(v52);
                                }
                                var8_9 = 1;
                                try {
                                    if (var2_2 == null) break block119;
lbl304:
                                    // 2 sources

                                    v26 = 0;
                                }
                                catch (hf_0 v53) {
                                    throw ph_2.a(v53);
                                }
                            }
                            var8_9 = v26;
                        }
                        try {
                            if (var2_2 == null) break block124;
lbl313:
                            // 2 sources

                            v23 = 1;
                        }
                        catch (hf_0 v54) {
                            throw ph_2.a(v54);
                        }
                    }
                    var8_9 = v23;
                }
                var4_5 = new KE((KE)var4_5, (boolean)var8_9);
                var6_7.Z(this, var1_1, (KE)var4_5);
                if (var2_2 == null) continue;
            }
            v14 = var4_5.t;
        }
        return v14;
    }

    public boolean V(Object object) {
        Object object2;
        String string;
        block17: {
            block18: {
                string = hi_0.C();
                try {
                    try {
                        object2 = object;
                        if (string != null) break block17;
                        if (object2 != null) break block18;
                    }
                    catch (hf_0 hf_02) {
                        throw ph_2.a(hf_02);
                    }
                    return false;
                }
                catch (hf_0 hf_03) {
                    throw ph_2.a(hf_03);
                }
            }
            this.x();
            object2 = object;
        }
        Object object3 = object2;
        for (int i2 = 0; i2 < this.K.length; ++i2) {
            boolean bl;
            block22: {
                Object object4;
                Object object5;
                block21: {
                    block19: {
                        block20: {
                            object5 = object3;
                            object3 = this.K[i2].Y(this, object, object3);
                            try {
                                try {
                                    object4 = object3;
                                    if (string != null) break block19;
                                    if (object4 != null) break block20;
                                }
                                catch (hf_0 hf_04) {
                                    throw ph_2.a(hf_04);
                                }
                                return false;
                            }
                            catch (hf_0 hf_05) {
                                throw ph_2.a(hf_05);
                            }
                        }
                        object4 = object3;
                    }
                    try {
                        try {
                            if (string != null) break block21;
                            if (object4 != Collections.EMPTY_LIST) continue;
                        }
                        catch (hf_0 hf_06) {
                            throw ph_2.a(hf_06);
                        }
                        object4 = object5;
                    }
                    catch (hf_0 hf_07) {
                        throw ph_2.a(hf_07);
                    }
                }
                try {
                    try {
                        bl = object4 instanceof List;
                        if (string != null) break block22;
                        if (!bl) continue;
                    }
                    catch (hf_0 hf_08) {
                        throw ph_2.a(hf_08);
                    }
                    bl = ((List)object5).contains(object3);
                }
                catch (hf_0 hf_09) {
                    throw ph_2.a(hf_09);
                }
            }
            return bl;
        }
        return true;
    }

    public boolean D(Object object, Object object2) {
        boolean bl;
        block19: {
            Object object3;
            block20: {
                boolean bl2;
                block21: {
                    Object object4;
                    String string;
                    block17: {
                        block18: {
                            block15: {
                                block16: {
                                    object3 = this.S(object);
                                    string = hi_0.C();
                                    try {
                                        try {
                                            object4 = object3;
                                            if (string != null) break block15;
                                            if (object4 != object2) break block16;
                                        }
                                        catch (hf_0 hf_02) {
                                            throw ph_2.a(hf_02);
                                        }
                                        return true;
                                    }
                                    catch (hf_0 hf_03) {
                                        throw ph_2.a(hf_03);
                                    }
                                }
                                object4 = object3;
                            }
                            try {
                                try {
                                    if (string != null) break block17;
                                    if (object4 != null) break block18;
                                }
                                catch (hf_0 hf_04) {
                                    throw ph_2.a(hf_04);
                                }
                                return false;
                            }
                            catch (hf_0 hf_05) {
                                throw ph_2.a(hf_05);
                            }
                        }
                        object4 = object3;
                    }
                    try {
                        bl = object4 instanceof Iterable;
                        if (string != null) break block19;
                        if (!bl) break block20;
                    }
                    catch (hf_0 hf_06) {
                        throw ph_2.a(hf_06);
                    }
                    for (Object t2 : (Iterable)object3) {
                        block23: {
                            boolean bl3;
                            block22: {
                                try {
                                    try {
                                        bl2 = ph_2.m(t2, object2);
                                        if (string != null) break block21;
                                        if (string != null) break block22;
                                    }
                                    catch (hf_0 hf_07) {
                                        throw ph_2.a(hf_07);
                                    }
                                    if (!bl2) break block23;
                                }
                                catch (hf_0 hf_08) {
                                    throw ph_2.a(hf_08);
                                }
                                bl3 = true;
                            }
                            return bl3;
                        }
                        if (string == null) continue;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            bl = ph_2.m(object3, object2);
        }
        return bl;
    }

    public int j(Object object) {
        ph_2 ph_22;
        Object object2;
        block8: {
            Object object3;
            String string;
            block6: {
                block7: {
                    string = hi_0.C();
                    try {
                        try {
                            object3 = object;
                            if (string != null) break block6;
                            if (object3 != null) break block7;
                        }
                        catch (hf_0 hf_02) {
                            throw ph_2.a(hf_02);
                        }
                        return -1;
                    }
                    catch (hf_0 hf_03) {
                        throw ph_2.a(hf_03);
                    }
                }
                this.x();
                object3 = object;
            }
            object2 = object3;
            for (int i2 = 0; i2 < this.K.length; ++i2) {
                ph_22 = this;
                if (string == null) {
                    object2 = ph_22.K[i2].Y(this, object, object2);
                    if (string == null) continue;
                }
                break block8;
            }
            ph_22 = this;
        }
        return ph_22.T(object2);
    }

    public Set u(Object object) {
        ph_2 ph_22;
        Object object2;
        block8: {
            Object object3;
            String string;
            block6: {
                block7: {
                    string = hi_0.C();
                    try {
                        try {
                            object3 = object;
                            if (string != null) break block6;
                            if (object3 != null) break block7;
                        }
                        catch (hf_0 hf_02) {
                            throw ph_2.a(hf_02);
                        }
                        return null;
                    }
                    catch (hf_0 hf_03) {
                        throw ph_2.a(hf_03);
                    }
                }
                this.x();
                object3 = object;
            }
            object2 = object3;
            for (int i2 = 0; i2 < this.K.length; ++i2) {
                ph_22 = this;
                if (string == null) {
                    object2 = ph_22.K[i2].Y(this, object, object2);
                    if (string == null) continue;
                }
                break block8;
            }
            ph_22 = this;
        }
        return ph_22.K(object2);
    }

    /*
     * Unable to fully structure code
     */
    public void H(Object var1_1, Object var2_2, boolean var3_3) {
        block62: {
            block61: {
                block59: {
                    block60: {
                        block58: {
                            block54: {
                                block56: {
                                    block57: {
                                        block55: {
                                            block53: {
                                                block52: {
                                                    block51: {
                                                        block48: {
                                                            block45: {
                                                                block46: {
                                                                    var4_4 = hi_0.C();
                                                                    try {
                                                                        v0 = var1_1;
                                                                        if (var4_4 != null) break block45;
                                                                        if (v0 != null) break block46;
                                                                    }
                                                                    catch (hf_0 v1) {
                                                                        throw ph_2.a(v1);
                                                                    }
                                                                    return;
                                                                }
                                                                this.x();
                                                                v0 = var1_1;
                                                            }
                                                            var5_5 = v0;
                                                            var6_6 = null;
                                                            var7_7 = 0;
                                                            while (var7_7 < this.K.length) {
                                                                block47: {
                                                                    block49: {
                                                                        block50: {
                                                                            var6_6 = var5_5;
                                                                            var8_9 = this.K[var7_7];
                                                                            var5_5 = var8_9.Y(this, var1_1, var5_5);
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (var4_4 != null) break block47;
                                                                                                v2 = var5_5;
                                                                                                if (var4_4 != null) break block48;
                                                                                            }
                                                                                            catch (hf_0 v3) {
                                                                                                throw ph_2.a(v3);
                                                                                            }
                                                                                            if (v2 != null) break block49;
                                                                                        }
                                                                                        catch (hf_0 v4) {
                                                                                            throw ph_2.a(v4);
                                                                                        }
                                                                                        v5 = var7_7;
                                                                                        if (var4_4 != null) break block50;
                                                                                    }
                                                                                    catch (hf_0 v6) {
                                                                                        throw ph_2.a(v6);
                                                                                    }
                                                                                    if (v5 == this.K.length - 1) break block49;
                                                                                }
                                                                                catch (hf_0 v7) {
                                                                                    throw ph_2.a(v7);
                                                                                }
                                                                                v5 = var8_9 instanceof W3;
                                                                            }
                                                                            catch (hf_0 v8) {
                                                                                throw ph_2.a(v8);
                                                                            }
                                                                        }
                                                                        if (v5 != 0) {
                                                                            var5_5 = new O0();
                                                                            ((W3)var8_9).M(this, var6_6, var5_5);
                                                                        }
                                                                    }
                                                                    ++var7_7;
                                                                }
                                                                if (var4_4 == null) continue;
                                                            }
                                                            v2 = var5_5;
                                                        }
                                                        var7_8 = v2;
                                                        try {
                                                            try {
                                                                try {
                                                                    v9 = var3_3;
                                                                    if (var4_4 != null) break block51;
                                                                    if (v9) break block52;
                                                                }
                                                                catch (hf_0 v10) {
                                                                    throw ph_2.a(v10);
                                                                }
                                                                v11 = var7_8;
                                                                if (var4_4 != null) break block53;
                                                            }
                                                            catch (hf_0 v12) {
                                                                throw ph_2.a(v12);
                                                            }
                                                            v9 = v11 instanceof Collection;
                                                        }
                                                        catch (hf_0 v13) {
                                                            throw ph_2.a(v13);
                                                        }
                                                    }
                                                    if (v9) {
                                                        var8_9 = (Collection)var7_8;
                                                        var8_9.add(var2_2);
                                                        return;
                                                    }
                                                }
                                                v11 = var7_8;
                                            }
                                            try {
                                                try {
                                                    if (var4_4 != null) break block54;
                                                    if (v11 != null) {
                                                    }
                                                    ** GOTO lbl139
                                                }
                                                catch (hf_0 v14) {
                                                    throw ph_2.a(v14);
                                                }
                                                if (!var3_3) {
                                                }
                                                ** GOTO lbl139
                                            }
                                            catch (hf_0 v15) {
                                                throw ph_2.a(v15);
                                            }
                                            var9_10 = var7_8.getClass();
                                            try {
                                                v16 = var9_10.isArray();
                                                if (var4_4 != null) break block55;
                                                if (v16) {
                                                }
                                                ** GOTO lbl117
                                            }
                                            catch (hf_0 v17) {
                                                throw ph_2.a(v17);
                                            }
                                            var10_11 = Array.getLength(var7_8);
                                            var11_13 = Array.newInstance(var9_10.getComponentType(), var10_11 + 1);
                                            System.arraycopy(var7_8, 0, var11_13, 0, var10_11);
                                            Array.set(var11_13, var10_11, var2_2);
                                            var8_9 = var11_13;
                                            try {
                                                try {
                                                    if (var4_4 == null) break block56;
lbl117:
                                                    // 2 sources

                                                    v18 = Map.class;
                                                    if (var4_4 != null) break block57;
                                                }
                                                catch (hf_0 v19) {
                                                    throw ph_2.a(v19);
                                                }
                                                v16 = v18.isAssignableFrom((Class<?>)var9_10);
                                            }
                                            catch (hf_0 v20) {
                                                throw ph_2.a(v20);
                                            }
                                        }
                                        if (!v16) ** GOTO lbl133
                                        v18 = var2_2;
                                    }
                                    var8_9 = v18;
                                    try {
                                        if (var4_4 == null) break block56;
lbl133:
                                        // 2 sources

                                        throw new hi_0(ph_2.a(2750, 11111) + var9_10);
                                    }
                                    catch (hf_0 v21) {
                                        throw ph_2.a(v21);
                                    }
                                }
                                try {
                                    if (var4_4 == null) break block58;
lbl139:
                                    // 3 sources

                                    v11 = var2_2;
                                }
                                catch (hf_0 v22) {
                                    throw ph_2.a(v22);
                                }
                            }
                            var8_9 = v11;
                        }
                        var9_10 = this.K[this.K.length - 1];
                        try {
                            v23 = var9_10 instanceof W3;
                            if (var4_4 != null) break block59;
                            if (!v23) break block60;
                        }
                        catch (hf_0 v24) {
                            throw ph_2.a(v24);
                        }
                        var10_12 = (W3)var9_10;
                        var10_12.M(this, var6_6, var8_9);
                        return;
                    }
                    v23 = var9_10 instanceof DX;
                }
                try {
                    try {
                        if (var4_4 != null) break block61;
                        if (!v23) break block62;
                    }
                    catch (hf_0 v25) {
                        throw ph_2.a(v25);
                    }
                    v23 = ((DX)var9_10).a(this, var6_6, var8_9);
                }
                catch (hf_0 v26) {
                    throw ph_2.a(v26);
                }
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void v(Object object, Object[] objectArray) {
        boolean bl;
        a0 a02;
        Object object2;
        Object object3;
        String string;
        block45: {
            block46: {
                Object object4;
                Object object5;
                Class<?> clazz;
                block44: {
                    int n10;
                    Object object6;
                    block43: {
                        Object object7;
                        block41: {
                            block42: {
                                block39: {
                                    block40: {
                                        Object object8;
                                        block37: {
                                            block38: {
                                                block35: {
                                                    block36: {
                                                        block34: {
                                                            string = hi_0.C();
                                                            try {
                                                                object8 = objectArray;
                                                                if (string != null) break block34;
                                                                if (object8 == null) return;
                                                            }
                                                            catch (hf_0 hf_02) {
                                                                throw ph_2.a(hf_02);
                                                            }
                                                            object8 = objectArray;
                                                        }
                                                        try {
                                                            try {
                                                                if (string != null) break block35;
                                                                if (((Object[])object8).length != 0) break block36;
                                                                return;
                                                            }
                                                            catch (hf_0 hf_03) {
                                                                throw ph_2.a(hf_03);
                                                            }
                                                        }
                                                        catch (hf_0 hf_04) {
                                                            throw ph_2.a(hf_04);
                                                        }
                                                    }
                                                    object8 = object;
                                                }
                                                try {
                                                    if (string != null) break block37;
                                                    if (object8 != null) break block38;
                                                    return;
                                                }
                                                catch (hf_0 hf_05) {
                                                    throw ph_2.a(hf_05);
                                                }
                                            }
                                            this.x();
                                            object8 = object;
                                        }
                                        Object object9 = object8;
                                        object3 = null;
                                        for (int i2 = 0; i2 < this.K.length; ++i2) {
                                            if (i2 == this.K.length - 1) {
                                                object3 = object9;
                                            }
                                            object9 = this.K[i2].Y(this, object, object9);
                                            if (string == null) continue;
                                        }
                                        object6 = object9;
                                        try {
                                            try {
                                                object7 = object6;
                                                if (string != null) break block39;
                                                if (object7 != null) break block40;
                                                throw new hf_0(ph_2.a(2746, -9506) + this.V);
                                            }
                                            catch (hf_0 hf_06) {
                                                throw ph_2.a(hf_06);
                                            }
                                        }
                                        catch (hf_0 hf_07) {
                                            throw ph_2.a(hf_07);
                                        }
                                    }
                                    object7 = object6;
                                }
                                try {
                                    if (string != null) break block41;
                                    if (!(object7 instanceof Collection)) break block42;
                                }
                                catch (hf_0 hf_08) {
                                    throw ph_2.a(hf_08);
                                }
                                Collection collection = (Collection)object6;
                                for (Object object10 : objectArray) {
                                    collection.add(object10);
                                    if (string == null) continue;
                                }
                                return;
                            }
                            object7 = object6;
                        }
                        clazz = object7.getClass();
                        try {
                            try {
                                n10 = clazz.isArray();
                                if (string != null) break block43;
                                if (n10 == 0) throw new hi_0(ph_2.a(2742, 22558) + clazz);
                            }
                            catch (hf_0 hf_09) {
                                throw ph_2.a(hf_09);
                            }
                            n10 = Array.getLength(object6);
                        }
                        catch (hf_0 hf_010) {
                            throw ph_2.a(hf_010);
                        }
                    }
                    int n11 = n10;
                    object5 = Array.newInstance(clazz.getComponentType(), n11 + objectArray.length);
                    System.arraycopy(object6, 0, object5, 0, n11);
                    for (int i3 = 0; i3 < objectArray.length; ++i3) {
                        try {
                            object4 = object5;
                            if (string == null) {
                                Array.set(object4, n11 + i3, objectArray[i3]);
                                if (string == null) continue;
                                break;
                            }
                            break block44;
                        }
                        catch (hf_0 hf_011) {
                            throw ph_2.a(hf_011);
                        }
                    }
                    object4 = object5;
                }
                object2 = object4;
                try {
                    if (string != null) {
                        throw new hi_0(ph_2.a(2742, 22558) + clazz);
                    }
                }
                catch (hf_0 hf_012) {
                    throw ph_2.a(hf_012);
                }
                a02 = this.K[this.K.length - 1];
                try {
                    bl = a02 instanceof W3;
                    if (string != null) break block45;
                    if (!bl) break block46;
                }
                catch (hf_0 hf_013) {
                    throw ph_2.a(hf_013);
                }
                object5 = (W3)a02;
                ((W3)object5).M(this, object3, object2);
                return;
            }
            bl = a02 instanceof DX;
        }
        try {
            try {
                if (string != null) return;
                if (!bl) throw new UnsupportedOperationException();
            }
            catch (hf_0 hf_014) {
                throw ph_2.a(hf_014);
            }
            bl = ((DX)a02).a(this, object3, object2);
            return;
        }
        catch (hf_0 hf_015) {
            throw ph_2.a(hf_015);
        }
    }

    public boolean n(Object object) {
        block115: {
            a0 a02;
            Object object2;
            block114: {
                boolean bl;
                a0 a03;
                block112: {
                    String string;
                    block113: {
                        block104: {
                            block105: {
                                int n10;
                                block106: {
                                    W3 w3;
                                    block107: {
                                        boolean bl2;
                                        block110: {
                                            Object object3;
                                            Object object4;
                                            Object object5;
                                            block108: {
                                                block109: {
                                                    a0 a04;
                                                    Object object6;
                                                    block89: {
                                                        block90: {
                                                            string = hi_0.C();
                                                            try {
                                                                try {
                                                                    object6 = object;
                                                                    if (string != null) break block89;
                                                                    if (object6 != null) break block90;
                                                                }
                                                                catch (hf_0 hf_02) {
                                                                    throw ph_2.a(hf_02);
                                                                }
                                                                return false;
                                                            }
                                                            catch (hf_0 hf_03) {
                                                                throw ph_2.a(hf_03);
                                                            }
                                                        }
                                                        this.x();
                                                        object6 = object;
                                                    }
                                                    Object object7 = object6;
                                                    object2 = null;
                                                    a03 = this.K[this.K.length - 1];
                                                    int n11 = 0;
                                                    while (true) {
                                                        Object object8;
                                                        block94: {
                                                            block92: {
                                                                block93: {
                                                                    W3 w32;
                                                                    boolean bl3;
                                                                    block95: {
                                                                        block96: {
                                                                            boolean bl4;
                                                                            block97: {
                                                                                block91: {
                                                                                    try {
                                                                                        if (n11 >= this.K.length) break;
                                                                                        if (n11 != this.K.length - 1) break block91;
                                                                                    }
                                                                                    catch (hf_0 hf_04) {
                                                                                        throw ph_2.a(hf_04);
                                                                                    }
                                                                                    object2 = object7;
                                                                                    break;
                                                                                }
                                                                                a04 = this.K[n11];
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (string != null) break block92;
                                                                                                    if (n11 != this.K.length - 2) break block93;
                                                                                                }
                                                                                                catch (hf_0 hf_05) {
                                                                                                    throw ph_2.a(hf_05);
                                                                                                }
                                                                                                object8 = a03;
                                                                                                if (string != null) break block94;
                                                                                            }
                                                                                            catch (hf_0 hf_06) {
                                                                                                throw ph_2.a(hf_06);
                                                                                            }
                                                                                            if (!(object8 instanceof LQ)) break block93;
                                                                                        }
                                                                                        catch (hf_0 hf_07) {
                                                                                            throw ph_2.a(hf_07);
                                                                                        }
                                                                                        object8 = a04;
                                                                                        if (string != null) break block94;
                                                                                    }
                                                                                    catch (hf_0 hf_08) {
                                                                                        throw ph_2.a(hf_08);
                                                                                    }
                                                                                    if (!(object8 instanceof W3)) break block93;
                                                                                }
                                                                                catch (hf_0 hf_09) {
                                                                                    throw ph_2.a(hf_09);
                                                                                }
                                                                                object5 = (LQ)a03;
                                                                                try {
                                                                                    bl3 = object7 instanceof List;
                                                                                    if (string != null) break block95;
                                                                                    if (!bl3) break block96;
                                                                                }
                                                                                catch (hf_0 hf_010) {
                                                                                    throw ph_2.a(hf_010);
                                                                                }
                                                                                w32 = (W3)a04;
                                                                                object4 = (List)object7;
                                                                                Iterator iterator = object4.iterator();
                                                                                while (iterator.hasNext()) {
                                                                                    block100: {
                                                                                        boolean bl5;
                                                                                        block101: {
                                                                                            Object object9;
                                                                                            block98: {
                                                                                                Object e2 = iterator.next();
                                                                                                object9 = w32.Y(this, object, e2);
                                                                                                try {
                                                                                                    block99: {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    bl4 = object9 instanceof Iterable;
                                                                                                                    if (string != null) break block97;
                                                                                                                    if (string != null) break block98;
                                                                                                                }
                                                                                                                catch (hf_0 hf_011) {
                                                                                                                    throw ph_2.a(hf_011);
                                                                                                                }
                                                                                                                if (!bl4) break block99;
                                                                                                            }
                                                                                                            catch (hf_0 hf_012) {
                                                                                                                throw ph_2.a(hf_012);
                                                                                                            }
                                                                                                            ((LQ)object5).Q(this, object, object9);
                                                                                                            if (string == null) break block100;
                                                                                                        }
                                                                                                        catch (hf_0 hf_013) {
                                                                                                            throw ph_2.a(hf_013);
                                                                                                        }
                                                                                                    }
                                                                                                    bl5 = object9 instanceof Map;
                                                                                                }
                                                                                                catch (hf_0 hf_014) {
                                                                                                    throw ph_2.a(hf_014);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (string != null) break block101;
                                                                                                    if (!bl5) break block100;
                                                                                                }
                                                                                                catch (hf_0 hf_015) {
                                                                                                    throw ph_2.a(hf_015);
                                                                                                }
                                                                                                bl5 = LQ.w((LQ)object5).x(this, object, object7, object9);
                                                                                            }
                                                                                            catch (hf_0 hf_016) {
                                                                                                throw ph_2.a(hf_016);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            if (bl5) {
                                                                                                iterator.remove();
                                                                                            }
                                                                                        }
                                                                                        catch (hf_0 hf_017) {
                                                                                            throw ph_2.a(hf_017);
                                                                                        }
                                                                                    }
                                                                                    if (string == null) continue;
                                                                                }
                                                                                bl4 = true;
                                                                            }
                                                                            return bl4;
                                                                        }
                                                                        try {
                                                                            object8 = object7;
                                                                            if (string != null) break block94;
                                                                            bl3 = object8 instanceof Map;
                                                                        }
                                                                        catch (hf_0 hf_018) {
                                                                            throw ph_2.a(hf_018);
                                                                        }
                                                                    }
                                                                    if (bl3) {
                                                                        block102: {
                                                                            block103: {
                                                                                w32 = (W3)a04;
                                                                                object4 = w32.Y(this, object, object7);
                                                                                try {
                                                                                    try {
                                                                                        object8 = object4;
                                                                                        if (string != null) break block102;
                                                                                        if (object8 != null) break block103;
                                                                                    }
                                                                                    catch (hf_0 hf_019) {
                                                                                        throw ph_2.a(hf_019);
                                                                                    }
                                                                                    return false;
                                                                                }
                                                                                catch (hf_0 hf_020) {
                                                                                    throw ph_2.a(hf_020);
                                                                                }
                                                                            }
                                                                            object8 = object4;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (string != null) break block94;
                                                                                        if (!(object8 instanceof Map)) break block93;
                                                                                    }
                                                                                    catch (hf_0 hf_021) {
                                                                                        throw ph_2.a(hf_021);
                                                                                    }
                                                                                    object8 = LQ.w((LQ)object5);
                                                                                    if (string != null) break block94;
                                                                                }
                                                                                catch (hf_0 hf_022) {
                                                                                    throw ph_2.a(hf_022);
                                                                                }
                                                                                if (!object8.x(this, object, object7, object4)) break block93;
                                                                            }
                                                                            catch (hf_0 hf_023) {
                                                                                throw ph_2.a(hf_023);
                                                                            }
                                                                            w32.m(this, object7);
                                                                            return true;
                                                                        }
                                                                        catch (hf_0 hf_024) {
                                                                            throw ph_2.a(hf_024);
                                                                        }
                                                                    }
                                                                }
                                                                object7 = a04.Y(this, object, object7);
                                                            }
                                                            try {
                                                                if (string != null) continue;
                                                                object8 = object7;
                                                            }
                                                            catch (hf_0 hf_025) {
                                                                throw ph_2.a(hf_025);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (object8 == null && string == null) break;
                                                            }
                                                            catch (hf_0 hf_026) {
                                                                throw ph_2.a(hf_026);
                                                            }
                                                            ++n11;
                                                        }
                                                        catch (hf_0 hf_027) {
                                                            throw ph_2.a(hf_027);
                                                        }
                                                    }
                                                    try {
                                                        if (object2 == null) {
                                                            return false;
                                                        }
                                                    }
                                                    catch (hf_0 hf_028) {
                                                        throw ph_2.a(hf_028);
                                                    }
                                                    try {
                                                        bl = a03 instanceof W3;
                                                        if (string != null) break block104;
                                                        if (!bl) break block105;
                                                    }
                                                    catch (hf_0 hf_029) {
                                                        throw ph_2.a(hf_029);
                                                    }
                                                    w3 = (W3)a03;
                                                    try {
                                                        try {
                                                            try {
                                                                n10 = object2 instanceof Collection;
                                                                if (string != null) break block106;
                                                                if (n10 == 0) break block107;
                                                            }
                                                            catch (hf_0 hf_030) {
                                                                throw ph_2.a(hf_030);
                                                            }
                                                            n10 = this.K.length;
                                                            if (string != null) break block106;
                                                        }
                                                        catch (hf_0 hf_031) {
                                                            throw ph_2.a(hf_031);
                                                        }
                                                        if (n10 <= 1) break block107;
                                                    }
                                                    catch (hf_0 hf_032) {
                                                        throw ph_2.a(hf_032);
                                                    }
                                                    a04 = this.K[this.K.length - 2];
                                                    try {
                                                        try {
                                                            try {
                                                                object3 = a04;
                                                                if (string != null) break block108;
                                                                if (object3 instanceof il_0) break block109;
                                                            }
                                                            catch (hf_0 hf_033) {
                                                                throw ph_2.a(hf_033);
                                                            }
                                                            n10 = a04 instanceof ad_0;
                                                            if (string != null) break block106;
                                                        }
                                                        catch (hf_0 hf_034) {
                                                            throw ph_2.a(hf_034);
                                                        }
                                                        if (n10 == 0) break block107;
                                                    }
                                                    catch (hf_0 hf_035) {
                                                        throw ph_2.a(hf_035);
                                                    }
                                                }
                                                object3 = object2;
                                            }
                                            object5 = (Collection)object3;
                                            boolean bl6 = false;
                                            object4 = object5.iterator();
                                            while (object4.hasNext()) {
                                                block111: {
                                                    Object e3 = object4.next();
                                                    boolean bl7 = w3.m(this, e3);
                                                    try {
                                                        try {
                                                            bl2 = bl7;
                                                            if (string != null) break block110;
                                                            if (string != null) break block111;
                                                        }
                                                        catch (hf_0 hf_036) {
                                                            throw ph_2.a(hf_036);
                                                        }
                                                        if (!bl2) break block111;
                                                    }
                                                    catch (hf_0 hf_037) {
                                                        throw ph_2.a(hf_037);
                                                    }
                                                    boolean bl8 = bl6 = true;
                                                }
                                                if (string == null) continue;
                                            }
                                            bl2 = bl6;
                                        }
                                        return bl2;
                                    }
                                    n10 = w3.m(this, object2) ? 1 : 0;
                                }
                                return n10 != 0;
                            }
                            bl = a03 instanceof DX;
                        }
                        try {
                            try {
                                if (string != null) break block112;
                                if (!bl) break block113;
                            }
                            catch (hf_0 hf_038) {
                                throw ph_2.a(hf_038);
                            }
                            return ((DX)a03).s(this, object2);
                        }
                        catch (hf_0 hf_039) {
                            throw ph_2.a(hf_039);
                        }
                    }
                    try {
                        a02 = a03;
                        if (string != null) break block114;
                        bl = a02 instanceof LQ;
                    }
                    catch (hf_0 hf_040) {
                        throw ph_2.a(hf_040);
                    }
                }
                if (!bl) break block115;
                a02 = a03;
            }
            LQ lQ = (LQ)a02;
            return lQ.Q(this, object, object2);
        }
        throw new UnsupportedOperationException();
    }

    public boolean G(Object object, Object object2) {
        return this.G(object, object2, true);
    }

    /*
     * Unable to fully structure code
     */
    public boolean G(Object var1_1, Object var2_2, boolean var3_3) {
        block63: {
            block62: {
                block60: {
                    block61: {
                        block48: {
                            block45: {
                                block46: {
                                    var4_4 = hi_0.C();
                                    try {
                                        try {
                                            v0 = var1_1;
                                            if (var4_4 != null) break block45;
                                            if (v0 != null) break block46;
                                        }
                                        catch (hf_0 v1) {
                                            throw ph_2.a(v1);
                                        }
                                        return false;
                                    }
                                    catch (hf_0 v2) {
                                        throw ph_2.a(v2);
                                    }
                                }
                                this.x();
                                v0 = var1_1;
                            }
                            var5_5 = v0;
                            var6_6 = null;
                            var7_7 = 0;
                            while (var7_7 < this.K.length) {
                                block47: {
                                    block49: {
                                        block59: {
                                            block64: {
                                                block50: {
                                                    block51: {
                                                        block56: {
                                                            block58: {
                                                                block57: {
                                                                    block55: {
                                                                        block53: {
                                                                            block54: {
                                                                                block52: {
                                                                                    var6_6 = var5_5;
                                                                                    var8_9 = this.K[var7_7];
                                                                                    var5_5 = var8_9.Y(this, var1_1, var5_5);
                                                                                    try {
                                                                                        try {
                                                                                            if (var4_4 != null) break block47;
                                                                                            v3 = var5_5;
                                                                                            if (var4_4 != null) break block48;
                                                                                        }
                                                                                        catch (hf_0 v4) {
                                                                                            throw ph_2.a(v4);
                                                                                        }
                                                                                        if (v3 != null) break block49;
                                                                                    }
                                                                                    catch (hf_0 v5) {
                                                                                        throw ph_2.a(v5);
                                                                                    }
                                                                                    var9_10 = null;
                                                                                    if (var7_7 < this.K.length - 1) {
                                                                                        var9_10 = this.K[var7_7 + 1];
                                                                                    }
                                                                                    var10_11 = null;
                                                                                    try {
                                                                                        v6 = var9_10 instanceof W3;
                                                                                        if (var4_4 != null) break block50;
                                                                                        if (!v6) break block51;
                                                                                    }
                                                                                    catch (hf_0 v7) {
                                                                                        throw ph_2.a(v7);
                                                                                    }
                                                                                    var11_12 = null;
                                                                                    var12_13 = null;
                                                                                    try {
                                                                                        try {
                                                                                            v8 = var8_9;
                                                                                            if (var4_4 != null) break block52;
                                                                                            if (!(v8 instanceof W3)) break block53;
                                                                                        }
                                                                                        catch (hf_0 v9) {
                                                                                            throw ph_2.a(v9);
                                                                                        }
                                                                                        v8 = var8_9;
                                                                                    }
                                                                                    catch (hf_0 v10) {
                                                                                        throw ph_2.a(v10);
                                                                                    }
                                                                                }
                                                                                var13_14 = W3.h((W3)v8);
                                                                                var14_15 = var6_6.getClass();
                                                                                var15_16 = this.Z(var14_15);
                                                                                try {
                                                                                    v11 = var15_16;
                                                                                    if (var4_4 != null) break block54;
                                                                                    if (v11 == null) break block53;
                                                                                }
                                                                                catch (hf_0 v12) {
                                                                                    throw ph_2.a(v12);
                                                                                }
                                                                                v11 = var15_16;
                                                                            }
                                                                            var16_17 = v11.a(var13_14);
                                                                            var12_13 = var16_17.p.O;
                                                                            var11_12 = this.Z(var12_13);
                                                                        }
                                                                        try {
                                                                            v13 = var11_12;
                                                                            if (var4_4 != null) break block55;
                                                                            if (v13 == null) break block56;
                                                                        }
                                                                        catch (hf_0 v14) {
                                                                            throw ph_2.a(v14);
                                                                        }
                                                                        v13 = var11_12;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            v15 = v13.T.t;
                                                                            if (var4_4 != null) break block57;
                                                                            if (v15 == null) break block58;
                                                                        }
                                                                        catch (hf_0 v16) {
                                                                            throw ph_2.a(v16);
                                                                        }
                                                                        v15 = var11_12.O(null, var12_13);
                                                                    }
                                                                    catch (hf_0 v17) {
                                                                        throw ph_2.a(v17);
                                                                    }
                                                                }
                                                                var10_11 = v15;
                                                                break block64;
                                                            }
                                                            return false;
                                                        }
                                                        var10_11 = new O0();
                                                        break block64;
                                                    }
                                                    v6 = var9_10 instanceof DX;
                                                }
                                                if (v6) {
                                                    var10_11 = new oc_0();
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        v3 = var10_11;
                                                        if (var4_4 != null) break block48;
                                                        if (v3 == null) break;
                                                    }
                                                    catch (hf_0 v18) {
                                                        throw ph_2.a(v18);
                                                    }
                                                    v19 = var8_9 instanceof W3;
                                                    if (var4_4 != null) break block59;
                                                }
                                                catch (hf_0 v20) {
                                                    throw ph_2.a(v20);
                                                }
                                                if (v19) {
                                                }
                                                ** GOTO lbl138
                                            }
                                            catch (hf_0 v21) {
                                                throw ph_2.a(v21);
                                            }
                                            var11_12 = (W3)var8_9;
                                            var11_12.M(this, var6_6, var10_11);
                                            var5_5 = var10_11;
                                            try {
                                                try {
                                                    if (var4_4 == null) break block49;
lbl138:
                                                    // 2 sources

                                                    v3 = var8_9;
                                                    if (var4_4 != null) break block48;
                                                }
                                                catch (hf_0 v22) {
                                                    throw ph_2.a(v22);
                                                }
                                                v19 = v3 instanceof DX;
                                            }
                                            catch (hf_0 v23) {
                                                throw ph_2.a(v23);
                                            }
                                        }
                                        if (!v19) break;
                                        var11_12 = (DX)var8_9;
                                        var11_12.a(this, var6_6, var10_11);
                                        var5_5 = var10_11;
                                    }
                                    ++var7_7;
                                }
                                if (var4_4 == null) continue;
                            }
                            v3 = var6_6;
                        }
                        try {
                            if (v3 == null) {
                                return false;
                            }
                        }
                        catch (hf_0 v24) {
                            throw ph_2.a(v24);
                        }
                        var7_8 = this.K[this.K.length - 1];
                        try {
                            v25 = var7_8 instanceof W3;
                            if (var4_4 != null) break block60;
                            if (!v25) break block61;
                        }
                        catch (hf_0 v26) {
                            throw ph_2.a(v26);
                        }
                        var8_9 = (W3)var7_8;
                        var8_9.M(this, var6_6, var2_2);
                        return true;
                    }
                    v25 = var7_8 instanceof DX;
                }
                try {
                    try {
                        if (var4_4 != null) break block62;
                        if (!v25) break block63;
                    }
                    catch (hf_0 v27) {
                        throw ph_2.a(v27);
                    }
                    v25 = ((DX)var7_8).a(this, var6_6, var2_2);
                }
                catch (hf_0 v28) {
                    throw ph_2.a(v28);
                }
            }
            return v25;
        }
        throw new UnsupportedOperationException();
    }

    public static Object V(Object object, String string) {
        ph_2 ph_22 = ph_2.B(string);
        return ph_22.S(object);
    }

    public static Object D(Object object, String string, boolean bl) {
        ph_2 ph_22 = ph_2.Q(string, bl);
        return ph_22.S(object);
    }

    public static int n(Object object, String string) {
        ph_2 ph_22 = ph_2.B(string);
        Object object2 = ph_22.S(object);
        return ph_22.T(object2);
    }

    public static Set Z(Object object, String string) {
        ph_2 ph_22 = ph_2.B(string);
        Object object2 = ph_22.S(object);
        return ph_22.K(object2);
    }

    public static boolean H(Object object, String string) {
        try {
            if (object == null) {
                return false;
            }
        }
        catch (hf_0 hf_02) {
            throw ph_2.a(hf_02);
        }
        ph_2 ph_22 = ph_2.B(string);
        return ph_22.V(object);
    }

    public static boolean I(Object object, String string, Object object2) {
        ph_2 ph_22 = ph_2.B(string);
        return ph_22.D(object, object2);
    }

    public static void L(Object object, String string, Object[] objectArray) {
        ph_2 ph_22 = ph_2.B(string);
        ph_22.v(object, objectArray);
    }

    public static boolean P(Object object, String string, Object object2) {
        ph_2 ph_22 = ph_2.B(string);
        return ph_22.G(object, object2);
    }

    public static boolean E(Object object, String string) {
        ph_2 ph_22 = ph_2.B(string);
        return ph_22.n(object);
    }

    public static ph_2 B(String string) {
        ph_2 ph_22;
        block11: {
            ph_2 ph_23;
            block12: {
                String string2;
                String string3;
                block9: {
                    block10: {
                        string3 = hi_0.C();
                        try {
                            try {
                                string2 = string;
                                if (string3 != null) break block9;
                                if (string2 != null) break block10;
                            }
                            catch (hf_0 hf_02) {
                                throw ph_2.a(hf_02);
                            }
                            throw new hf_0(ph_2.a(2739, -15717));
                        }
                        catch (hf_0 hf_03) {
                            throw ph_2.a(hf_03);
                        }
                    }
                    string2 = s.get(string);
                }
                ph_23 = (ph_2)((Object)string2);
                try {
                    try {
                        ph_22 = ph_23;
                        if (string3 != null) break block11;
                        if (ph_22 != null) break block12;
                    }
                    catch (hf_0 hf_04) {
                        throw ph_2.a(hf_04);
                    }
                    ph_22 = new ph_2(string);
                    if (string3 != null) break block11;
                }
                catch (hf_0 hf_05) {
                    throw ph_2.a(hf_05);
                }
                ph_23 = ph_22;
                if (s.size() < ph_2.a(2580, 6628368933578315098L)) {
                    s.putIfAbsent(string, ph_23);
                    ph_23 = (ph_2)s.get(string);
                }
            }
            ph_22 = ph_23;
        }
        return ph_22;
    }

    public static ph_2 Q(String string, boolean bl) {
        ph_2 ph_22;
        block11: {
            ph_2 ph_23;
            block12: {
                String string2;
                String string3;
                block9: {
                    block10: {
                        string3 = hi_0.C();
                        try {
                            try {
                                string2 = string;
                                if (string3 != null) break block9;
                                if (string2 != null) break block10;
                            }
                            catch (hf_0 hf_02) {
                                throw ph_2.a(hf_02);
                            }
                            throw new hf_0(ph_2.a(2751, -32407));
                        }
                        catch (hf_0 hf_03) {
                            throw ph_2.a(hf_03);
                        }
                    }
                    string2 = s.get(string);
                }
                ph_23 = (ph_2)((Object)string2);
                try {
                    try {
                        ph_22 = ph_23;
                        if (string3 != null) break block11;
                        if (ph_22 != null) break block12;
                    }
                    catch (hf_0 hf_04) {
                        throw ph_2.a(hf_04);
                    }
                    ph_22 = new ph_2(string, bl);
                    if (string3 != null) break block11;
                }
                catch (hf_0 hf_05) {
                    throw ph_2.a(hf_05);
                }
                ph_23 = ph_22;
                if (s.size() < ph_2.a(11539, 5581129419713032794L)) {
                    s.putIfAbsent(string, ph_23);
                    ph_23 = (ph_2)s.get(string);
                }
            }
            ph_22 = ph_23;
        }
        return ph_22;
    }

    public static Object r(String string, String string2) {
        return ph_2.B(string2).S(ok_0.X(string));
    }

    public static Object d(String string, String string2, Type type, IG iG) {
        return ph_2.B(string2).L(ok_0.X(string), type, iG);
    }

    public static Object S(String string, String string2, Type type) {
        return ph_2.d(string, string2, type, null);
    }

    public static Object f(String string, String string2, IG iG, int n10, ks_0[] ks_0Array) {
        yn_2 yn_22 = new yn_2(string, iG, n10 |= ks_0.OrderedField.mask);
        ph_2 ph_22 = ph_2.B(string2);
        Object object = ph_22.e(yn_22);
        yn_22.N.close();
        return object;
    }

    public static Object U(String string, String string2) {
        return ph_2.f(string, string2, IG.D, ok_0.h, new ks_0[0]);
    }

    public static Map h(Object object) {
        return ph_2.T(object, en_0.a);
    }

    public static Map T(Object object, en_0 en_02) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        HashMap hashMap = new HashMap();
        ph_2.f(identityHashMap, hashMap, "/", object, en_02);
        return hashMap;
    }

    /*
     * Loose catch block
     */
    private static void f(Map map, Map map2, String string, Object object, en_0 en_02) {
        block105: {
            block106: {
                ak_0 ak_02;
                String string2;
                block104: {
                    Object object2;
                    block124: {
                        block103: {
                            boolean bl;
                            block102: {
                                block98: {
                                    block99: {
                                        Object object3;
                                        int n10;
                                        block95: {
                                            block120: {
                                                int n11;
                                                block90: {
                                                    block91: {
                                                        block89: {
                                                            Object object4;
                                                            block80: {
                                                                block81: {
                                                                    int n12;
                                                                    block87: {
                                                                        block88: {
                                                                            block83: {
                                                                                block116: {
                                                                                    block115: {
                                                                                        block114: {
                                                                                            Object object5;
                                                                                            block86: {
                                                                                                Class clazz;
                                                                                                block85: {
                                                                                                    block112: {
                                                                                                        block84: {
                                                                                                            block82: {
                                                                                                                Object object6;
                                                                                                                block78: {
                                                                                                                    block79: {
                                                                                                                        string2 = hi_0.C();
                                                                                                                        try {
                                                                                                                            object6 = object;
                                                                                                                            if (string2 != null) break block78;
                                                                                                                            if (object6 != null) break block79;
                                                                                                                        }
                                                                                                                        catch (Exception exception) {
                                                                                                                            throw ph_2.a(exception);
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    object6 = map.put(object, string);
                                                                                                                }
                                                                                                                String string3 = (String)object6;
                                                                                                                try {
                                                                                                                    object4 = string3;
                                                                                                                    if (string2 != null) break block80;
                                                                                                                    if (object4 == null) break block81;
                                                                                                                }
                                                                                                                catch (Exception exception) {
                                                                                                                    throw ph_2.a(exception);
                                                                                                                }
                                                                                                                object2 = object.getClass();
                                                                                                                object5 = object2;
                                                                                                                clazz = String.class;
                                                                                                                if (string2 != null) break block82;
                                                                                                                try {
                                                                                                                    block110: {
                                                                                                                        if (object5 == clazz) break block83;
                                                                                                                        break block110;
                                                                                                                        catch (Exception exception) {
                                                                                                                            throw ph_2.a(exception);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    object5 = object2;
                                                                                                                    clazz = Boolean.class;
                                                                                                                }
                                                                                                                catch (Exception exception) {
                                                                                                                    throw ph_2.a(exception);
                                                                                                                }
                                                                                                            }
                                                                                                            if (string2 != null) break block84;
                                                                                                            try {
                                                                                                                block111: {
                                                                                                                    if (object5 == clazz) break block83;
                                                                                                                    break block111;
                                                                                                                    catch (Exception exception) {
                                                                                                                        throw ph_2.a(exception);
                                                                                                                    }
                                                                                                                }
                                                                                                                object5 = object2;
                                                                                                                clazz = Character.class;
                                                                                                            }
                                                                                                            catch (Exception exception) {
                                                                                                                throw ph_2.a(exception);
                                                                                                            }
                                                                                                        }
                                                                                                        if (string2 != null) break block85;
                                                                                                        if (object5 == clazz) break block83;
                                                                                                        break block112;
                                                                                                        catch (Exception exception) {
                                                                                                            throw ph_2.a(exception);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        block113: {
                                                                                                            object5 = object2;
                                                                                                            if (string2 != null) break block86;
                                                                                                            break block113;
                                                                                                            catch (Exception exception) {
                                                                                                                throw ph_2.a(exception);
                                                                                                            }
                                                                                                        }
                                                                                                        clazz = UUID.class;
                                                                                                    }
                                                                                                    catch (Exception exception) {
                                                                                                        throw ph_2.a(exception);
                                                                                                    }
                                                                                                }
                                                                                                if (object5 == clazz) break block83;
                                                                                                object5 = object2;
                                                                                            }
                                                                                            n12 = ((Class)object5).isEnum() ? 1 : 0;
                                                                                            if (string2 != null) break block87;
                                                                                            if (n12 != 0) break block83;
                                                                                            break block114;
                                                                                            catch (Exception exception) {
                                                                                                throw ph_2.a(exception);
                                                                                            }
                                                                                        }
                                                                                        n12 = object instanceof Number;
                                                                                        if (string2 != null) break block87;
                                                                                        break block115;
                                                                                        catch (Exception exception) {
                                                                                            throw ph_2.a(exception);
                                                                                        }
                                                                                    }
                                                                                    if (n12 != 0) break block83;
                                                                                    break block116;
                                                                                    catch (Exception exception) {
                                                                                        throw ph_2.a(exception);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    block117: {
                                                                                        n12 = object instanceof Date;
                                                                                        if (string2 != null) break block87;
                                                                                        break block117;
                                                                                        catch (Exception exception) {
                                                                                            throw ph_2.a(exception);
                                                                                        }
                                                                                    }
                                                                                    if (n12 == 0) break block88;
                                                                                }
                                                                                catch (Exception exception) {
                                                                                    throw ph_2.a(exception);
                                                                                }
                                                                            }
                                                                            n12 = 1;
                                                                            break block87;
                                                                        }
                                                                        n12 = 0;
                                                                    }
                                                                    n10 = n12;
                                                                    try {
                                                                        n11 = n10;
                                                                        if (string2 != null) break block89;
                                                                        if (n11 != 0) break block81;
                                                                    }
                                                                    catch (Exception exception) {
                                                                        throw ph_2.a(exception);
                                                                    }
                                                                    return;
                                                                }
                                                                map2.put(string, object);
                                                                object4 = object;
                                                            }
                                                            n11 = object4 instanceof Map;
                                                        }
                                                        try {
                                                            if (string2 != null) break block90;
                                                            if (n11 == 0) break block91;
                                                        }
                                                        catch (Exception exception) {
                                                            throw ph_2.a(exception);
                                                        }
                                                        object2 = (Map)object;
                                                        Iterator iterator = object2.entrySet().iterator();
                                                        while (iterator.hasNext()) {
                                                            block93: {
                                                                String string4;
                                                                Map.Entry entry;
                                                                block94: {
                                                                    boolean bl2;
                                                                    Object k2;
                                                                    block92: {
                                                                        block118: {
                                                                            Map.Entry entry2;
                                                                            entry = entry2 = iterator.next();
                                                                            k2 = entry.getKey();
                                                                            bl2 = k2 instanceof String;
                                                                            if (string2 != null) break block92;
                                                                            if (!bl2) break block93;
                                                                            break block118;
                                                                            catch (Exception exception) {
                                                                                throw ph_2.a(exception);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block119: {
                                                                                string4 = string;
                                                                                if (string2 != null) break block94;
                                                                                break block119;
                                                                                catch (Exception exception) {
                                                                                    throw ph_2.a(exception);
                                                                                }
                                                                            }
                                                                            bl2 = string4.equals("/");
                                                                        }
                                                                        catch (Exception exception) {
                                                                            throw ph_2.a(exception);
                                                                        }
                                                                    }
                                                                    try {
                                                                        string4 = bl2 ? "/" + k2 : string + "/" + k2;
                                                                    }
                                                                    catch (Exception exception) {
                                                                        throw ph_2.a(exception);
                                                                    }
                                                                }
                                                                String string5 = string4;
                                                                ph_2.f(map, map2, string5, entry.getValue(), en_02);
                                                            }
                                                            if (string2 == null) continue;
                                                        }
                                                        return;
                                                    }
                                                    try {
                                                        object3 = object;
                                                        if (string2 != null) break block95;
                                                        n11 = object3 instanceof Collection;
                                                    }
                                                    catch (Exception exception) {
                                                        throw ph_2.a(exception);
                                                    }
                                                }
                                                if (n11 == 0) break block120;
                                                object2 = (Collection)object;
                                                n10 = 0;
                                                Iterator iterator = object2.iterator();
                                                while (iterator.hasNext()) {
                                                    String string6;
                                                    Object e2;
                                                    block96: {
                                                        block97: {
                                                            e2 = iterator.next();
                                                            string6 = string;
                                                            if (string2 != null) break block96;
                                                            try {
                                                                block121: {
                                                                    if (!string6.equals("/")) break block97;
                                                                    break block121;
                                                                    catch (Exception exception) {
                                                                        throw ph_2.a(exception);
                                                                    }
                                                                }
                                                                string6 = "/" + n10;
                                                                break block96;
                                                            }
                                                            catch (Exception exception) {
                                                                throw ph_2.a(exception);
                                                            }
                                                        }
                                                        string6 = string + "/" + n10;
                                                    }
                                                    String string7 = string6;
                                                    ph_2.f(map, map2, string7, e2, en_02);
                                                    ++n10;
                                                    if (string2 == null) continue;
                                                }
                                                return;
                                            }
                                            object3 = object;
                                        }
                                        object2 = object3.getClass();
                                        try {
                                            bl = ((Class)object2).isArray();
                                            if (string2 != null) break block98;
                                            if (!bl) break block99;
                                        }
                                        catch (Exception exception) {
                                            throw ph_2.a(exception);
                                        }
                                        n10 = Array.getLength(object);
                                        for (int i2 = 0; i2 < n10; ++i2) {
                                            String string8;
                                            Object object7;
                                            block100: {
                                                block101: {
                                                    object7 = Array.get(object, i2);
                                                    string8 = string;
                                                    if (string2 != null) break block100;
                                                    try {
                                                        block122: {
                                                            if (!string8.equals("/")) break block101;
                                                            break block122;
                                                            catch (Exception exception) {
                                                                throw ph_2.a(exception);
                                                            }
                                                        }
                                                        string8 = "/" + i2;
                                                        break block100;
                                                    }
                                                    catch (Exception exception) {
                                                        throw ph_2.a(exception);
                                                    }
                                                }
                                                string8 = string + "/" + i2;
                                            }
                                            String string9 = string8;
                                            ph_2.f(map, map2, string9, object7, en_02);
                                            if (string2 == null) continue;
                                        }
                                        return;
                                    }
                                    bl = IG.C((Class)object2);
                                }
                                if (string2 != null) break block102;
                                try {
                                    block123: {
                                        if (bl) break block103;
                                        break block123;
                                        catch (Exception exception) {
                                            throw ph_2.a(exception);
                                        }
                                    }
                                    bl = ((Class)object2).isEnum();
                                }
                                catch (Exception exception) {
                                    throw ph_2.a(exception);
                                }
                            }
                            if (!bl) break block124;
                        }
                        return;
                    }
                    ak_0 ak_03 = en_02.O((Class)object2);
                    ak_02 = ak_03;
                    if (string2 != null) break block104;
                    try {
                        block125: {
                            if (!(ak_02 instanceof nj_2)) break block105;
                            break block125;
                            catch (Exception exception) {
                                throw ph_2.a(exception);
                            }
                        }
                        ak_02 = ak_03;
                    }
                    catch (Exception exception) {
                        throw ph_2.a(exception);
                    }
                }
                nj_2 nj_22 = (nj_2)ak_02;
                try {
                    Map map3 = nj_22.k(object);
                    for (Map.Entry entry : map3.entrySet()) {
                        block108: {
                            String string10;
                            block109: {
                                boolean bl;
                                String string11;
                                block107: {
                                    block127: {
                                        block126: {
                                            string11 = (String)entry.getKey();
                                            if (string2 != null) break block106;
                                            bl = string11 instanceof String;
                                            if (string2 != null) break block107;
                                            break block126;
                                            catch (Exception exception) {
                                                throw ph_2.a(exception);
                                            }
                                        }
                                        if (!bl) break block108;
                                        break block127;
                                        catch (Exception exception) {
                                            throw ph_2.a(exception);
                                        }
                                    }
                                    try {
                                        block128: {
                                            string10 = string;
                                            if (string2 != null) break block109;
                                            break block128;
                                            catch (Exception exception) {
                                                throw ph_2.a(exception);
                                            }
                                        }
                                        bl = string10.equals("/");
                                    }
                                    catch (Exception exception) {
                                        throw ph_2.a(exception);
                                    }
                                }
                                try {
                                    string10 = bl ? "/" + string11 : string + "/" + string11;
                                }
                                catch (Exception exception) {
                                    throw ph_2.a(exception);
                                }
                            }
                            String string12 = string10;
                            ph_2.f(map, map2, string12, entry.getValue(), en_02);
                        }
                        if (string2 == null) continue;
                        break;
                    }
                }
                catch (Exception exception) {
                    throw new hi_0(ph_2.a(2744, 12069), exception);
                }
            }
            return;
        }
    }

    public String F() {
        return this.V;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static int x(Object var0, Object var1_1) {
        block119: {
            block116: {
                block132: {
                    block131: {
                        block128: {
                            block130: {
                                block129: {
                                    block124: {
                                        block127: {
                                            block126: {
                                                block125: {
                                                    block120: {
                                                        block123: {
                                                            block122: {
                                                                block121: {
                                                                    block114: {
                                                                        block118: {
                                                                            block117: {
                                                                                block115: {
                                                                                    block112: {
                                                                                        block113: {
                                                                                            var2_2 = hi_0.C();
                                                                                            try {
                                                                                                try {
                                                                                                    v0 = var0.getClass();
                                                                                                    if (var2_2 != null) break block112;
                                                                                                    if (v0 != var1_1.getClass()) break block113;
                                                                                                }
                                                                                                catch (hf_0 v1) {
                                                                                                    throw ph_2.a(v1);
                                                                                                }
                                                                                                return ((Comparable)var0).compareTo(var1_1);
                                                                                            }
                                                                                            catch (hf_0 v2) {
                                                                                                throw ph_2.a(v2);
                                                                                            }
                                                                                        }
                                                                                        v0 = var0.getClass();
                                                                                    }
                                                                                    var3_3 = v0;
                                                                                    var4_4 = var1_1.getClass();
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v3 = var3_3;
                                                                                                v4 /* !! */  = BigDecimal.class;
                                                                                                if (var2_2 != null) break block114;
                                                                                                if (v3 == v4 /* !! */ ) {
                                                                                                }
                                                                                                ** GOTO lbl90
                                                                                            }
                                                                                            catch (hf_0 v5) {
                                                                                                throw ph_2.a(v5);
                                                                                            }
                                                                                            v3 = var4_4;
                                                                                            v6 /* !! */  = Integer.class;
                                                                                            if (var2_2 != null) break block115;
                                                                                        }
                                                                                        catch (hf_0 v7) {
                                                                                            throw ph_2.a(v7);
                                                                                        }
                                                                                        if (v3 == v6 /* !! */ ) {
                                                                                        }
                                                                                        ** GOTO lbl43
                                                                                    }
                                                                                    catch (hf_0 v8) {
                                                                                        throw ph_2.a(v8);
                                                                                    }
                                                                                    var1_1 = new BigDecimal((Integer)var1_1);
                                                                                    try {
                                                                                        if (var2_2 == null) break block116;
lbl43:
                                                                                        // 2 sources

                                                                                        v3 = var4_4;
                                                                                        v6 /* !! */  = Long.class;
                                                                                    }
                                                                                    catch (hf_0 v9) {
                                                                                        throw ph_2.a(v9);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (var2_2 != null) break block117;
                                                                                    if (v3 == v6 /* !! */ ) {
                                                                                    }
                                                                                    ** GOTO lbl59
                                                                                }
                                                                                catch (hf_0 v10) {
                                                                                    throw ph_2.a(v10);
                                                                                }
                                                                                var1_1 = new BigDecimal((Long)var1_1);
                                                                                try {
                                                                                    if (var2_2 == null) break block116;
lbl59:
                                                                                    // 2 sources

                                                                                    v3 = var4_4;
                                                                                    v6 /* !! */  = Float.class;
                                                                                }
                                                                                catch (hf_0 v11) {
                                                                                    throw ph_2.a(v11);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (var2_2 != null) break block118;
                                                                                if (v3 == v6 /* !! */ ) {
                                                                                }
                                                                                ** GOTO lbl76
                                                                            }
                                                                            catch (hf_0 v12) {
                                                                                throw ph_2.a(v12);
                                                                            }
                                                                            var1_1 = new BigDecimal(((Float)var1_1).floatValue());
                                                                            try {
                                                                                try {
                                                                                    if (var2_2 == null) break block116;
lbl76:
                                                                                    // 2 sources

                                                                                    v3 = var4_4;
                                                                                    if (var2_2 != null) break block119;
                                                                                }
                                                                                catch (hf_0 v13) {
                                                                                    throw ph_2.a(v13);
                                                                                }
                                                                                v6 /* !! */  = Double.class;
                                                                            }
                                                                            catch (hf_0 v14) {
                                                                                throw ph_2.a(v14);
                                                                            }
                                                                        }
                                                                        if (v3 != v6 /* !! */ ) break block116;
                                                                        var1_1 = new BigDecimal((Double)var1_1);
                                                                        try {
                                                                            if (var2_2 == null) break block116;
lbl90:
                                                                            // 2 sources

                                                                            v3 = var3_3;
                                                                            v4 /* !! */  = Long.class;
                                                                        }
                                                                        catch (hf_0 v15) {
                                                                            throw ph_2.a(v15);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var2_2 != null) break block120;
                                                                                if (v3 == v4 /* !! */ ) {
                                                                                }
                                                                                ** GOTO lbl166
                                                                            }
                                                                            catch (hf_0 v16) {
                                                                                throw ph_2.a(v16);
                                                                            }
                                                                            v3 = var4_4;
                                                                            v17 /* !! */  = Integer.class;
                                                                            if (var2_2 != null) break block121;
                                                                        }
                                                                        catch (hf_0 v18) {
                                                                            throw ph_2.a(v18);
                                                                        }
                                                                        if (v3 == v17 /* !! */ ) {
                                                                        }
                                                                        ** GOTO lbl119
                                                                    }
                                                                    catch (hf_0 v19) {
                                                                        throw ph_2.a(v19);
                                                                    }
                                                                    var1_1 = new Long(((Integer)var1_1).intValue());
                                                                    try {
                                                                        if (var2_2 == null) break block116;
lbl119:
                                                                        // 2 sources

                                                                        v3 = var4_4;
                                                                        v17 /* !! */  = BigDecimal.class;
                                                                    }
                                                                    catch (hf_0 v20) {
                                                                        throw ph_2.a(v20);
                                                                    }
                                                                }
                                                                try {
                                                                    if (var2_2 != null) break block122;
                                                                    if (v3 == v17 /* !! */ ) {
                                                                    }
                                                                    ** GOTO lbl135
                                                                }
                                                                catch (hf_0 v21) {
                                                                    throw ph_2.a(v21);
                                                                }
                                                                var0 = new BigDecimal((Long)var0);
                                                                try {
                                                                    if (var2_2 == null) break block116;
lbl135:
                                                                    // 2 sources

                                                                    v3 = var4_4;
                                                                    v17 /* !! */  = Float.class;
                                                                }
                                                                catch (hf_0 v22) {
                                                                    throw ph_2.a(v22);
                                                                }
                                                            }
                                                            try {
                                                                if (var2_2 != null) break block123;
                                                                if (v3 == v17 /* !! */ ) {
                                                                }
                                                                ** GOTO lbl152
                                                            }
                                                            catch (hf_0 v23) {
                                                                throw ph_2.a(v23);
                                                            }
                                                            var0 = new Float(((Long)var0).longValue());
                                                            try {
                                                                try {
                                                                    if (var2_2 == null) break block116;
lbl152:
                                                                    // 2 sources

                                                                    v3 = var4_4;
                                                                    if (var2_2 != null) break block119;
                                                                }
                                                                catch (hf_0 v24) {
                                                                    throw ph_2.a(v24);
                                                                }
                                                                v17 /* !! */  = Double.class;
                                                            }
                                                            catch (hf_0 v25) {
                                                                throw ph_2.a(v25);
                                                            }
                                                        }
                                                        if (v3 != v17 /* !! */ ) break block116;
                                                        var0 = new Double(((Long)var0).longValue());
                                                        try {
                                                            if (var2_2 == null) break block116;
lbl166:
                                                            // 2 sources

                                                            v3 = var3_3;
                                                            v4 /* !! */  = Integer.class;
                                                        }
                                                        catch (hf_0 v26) {
                                                            throw ph_2.a(v26);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if (var2_2 != null) break block124;
                                                                if (v3 == v4 /* !! */ ) {
                                                                }
                                                                ** GOTO lbl242
                                                            }
                                                            catch (hf_0 v27) {
                                                                throw ph_2.a(v27);
                                                            }
                                                            v3 = var4_4;
                                                            v28 /* !! */  = Long.class;
                                                            if (var2_2 != null) break block125;
                                                        }
                                                        catch (hf_0 v29) {
                                                            throw ph_2.a(v29);
                                                        }
                                                        if (v3 == v28 /* !! */ ) {
                                                        }
                                                        ** GOTO lbl195
                                                    }
                                                    catch (hf_0 v30) {
                                                        throw ph_2.a(v30);
                                                    }
                                                    var0 = new Long(((Integer)var0).intValue());
                                                    try {
                                                        if (var2_2 == null) break block116;
lbl195:
                                                        // 2 sources

                                                        v3 = var4_4;
                                                        v28 /* !! */  = BigDecimal.class;
                                                    }
                                                    catch (hf_0 v31) {
                                                        throw ph_2.a(v31);
                                                    }
                                                }
                                                try {
                                                    if (var2_2 != null) break block126;
                                                    if (v3 == v28 /* !! */ ) {
                                                    }
                                                    ** GOTO lbl211
                                                }
                                                catch (hf_0 v32) {
                                                    throw ph_2.a(v32);
                                                }
                                                var0 = new BigDecimal((Integer)var0);
                                                try {
                                                    if (var2_2 == null) break block116;
lbl211:
                                                    // 2 sources

                                                    v3 = var4_4;
                                                    v28 /* !! */  = Float.class;
                                                }
                                                catch (hf_0 v33) {
                                                    throw ph_2.a(v33);
                                                }
                                            }
                                            try {
                                                if (var2_2 != null) break block127;
                                                if (v3 == v28 /* !! */ ) {
                                                }
                                                ** GOTO lbl228
                                            }
                                            catch (hf_0 v34) {
                                                throw ph_2.a(v34);
                                            }
                                            var0 = new Float(((Integer)var0).intValue());
                                            try {
                                                try {
                                                    if (var2_2 == null) break block116;
lbl228:
                                                    // 2 sources

                                                    v3 = var4_4;
                                                    if (var2_2 != null) break block119;
                                                }
                                                catch (hf_0 v35) {
                                                    throw ph_2.a(v35);
                                                }
                                                v28 /* !! */  = Double.class;
                                            }
                                            catch (hf_0 v36) {
                                                throw ph_2.a(v36);
                                            }
                                        }
                                        if (v3 != v28 /* !! */ ) break block116;
                                        var0 = new Double(((Integer)var0).intValue());
                                        try {
                                            if (var2_2 == null) break block116;
lbl242:
                                            // 2 sources

                                            v3 = var3_3;
                                            v4 /* !! */  = Double.class;
                                        }
                                        catch (hf_0 v37) {
                                            throw ph_2.a(v37);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (var2_2 != null) break block128;
                                                if (v3 == v4 /* !! */ ) {
                                                }
                                                ** GOTO lbl303
                                            }
                                            catch (hf_0 v38) {
                                                throw ph_2.a(v38);
                                            }
                                            v3 = var4_4;
                                            v39 /* !! */  = Integer.class;
                                            if (var2_2 != null) break block129;
                                        }
                                        catch (hf_0 v40) {
                                            throw ph_2.a(v40);
                                        }
                                        if (v3 == v39 /* !! */ ) {
                                        }
                                        ** GOTO lbl271
                                    }
                                    catch (hf_0 v41) {
                                        throw ph_2.a(v41);
                                    }
                                    var1_1 = new Double(((Integer)var1_1).intValue());
                                    try {
                                        if (var2_2 == null) break block116;
lbl271:
                                        // 2 sources

                                        v3 = var4_4;
                                        v39 /* !! */  = Long.class;
                                    }
                                    catch (hf_0 v42) {
                                        throw ph_2.a(v42);
                                    }
                                }
                                try {
                                    if (var2_2 != null) break block130;
                                    if (v3 == v39 /* !! */ ) {
                                    }
                                    ** GOTO lbl288
                                }
                                catch (hf_0 v43) {
                                    throw ph_2.a(v43);
                                }
                                var1_1 = new Double(((Long)var1_1).longValue());
                                try {
                                    try {
                                        if (var2_2 == null) break block116;
lbl288:
                                        // 2 sources

                                        v3 = var4_4;
                                        if (var2_2 != null) break block119;
                                    }
                                    catch (hf_0 v44) {
                                        throw ph_2.a(v44);
                                    }
                                    v39 /* !! */  = Float.class;
                                }
                                catch (hf_0 v45) {
                                    throw ph_2.a(v45);
                                }
                            }
                            if (v3 != v39 /* !! */ ) break block116;
                            var1_1 = new Double(((Float)var1_1).floatValue());
                            try {
                                try {
                                    if (var2_2 == null) break block116;
lbl303:
                                    // 2 sources

                                    v3 = var3_3;
                                    if (var2_2 != null) break block119;
                                }
                                catch (hf_0 v46) {
                                    throw ph_2.a(v46);
                                }
                                v4 /* !! */  = Float.class;
                            }
                            catch (hf_0 v47) {
                                throw ph_2.a(v47);
                            }
                        }
                        try {
                            try {
                                if (v3 != v4 /* !! */ ) break block116;
                                v3 = var4_4;
                                v48 /* !! */  = Integer.class;
                                if (var2_2 != null) break block131;
                            }
                            catch (hf_0 v49) {
                                throw ph_2.a(v49);
                            }
                            if (v3 == v48 /* !! */ ) {
                            }
                            ** GOTO lbl330
                        }
                        catch (hf_0 v50) {
                            throw ph_2.a(v50);
                        }
                        var1_1 = new Float(((Integer)var1_1).intValue());
                        try {
                            if (var2_2 == null) break block116;
lbl330:
                            // 2 sources

                            v3 = var4_4;
                            v48 /* !! */  = Long.class;
                        }
                        catch (hf_0 v51) {
                            throw ph_2.a(v51);
                        }
                    }
                    try {
                        if (var2_2 != null) break block132;
                        if (v3 == v48 /* !! */ ) {
                        }
                        ** GOTO lbl347
                    }
                    catch (hf_0 v52) {
                        throw ph_2.a(v52);
                    }
                    var1_1 = new Float(((Long)var1_1).longValue());
                    try {
                        try {
                            if (var2_2 == null) break block116;
lbl347:
                            // 2 sources

                            v3 = var4_4;
                            if (var2_2 != null) break block119;
                        }
                        catch (hf_0 v53) {
                            throw ph_2.a(v53);
                        }
                        v48 /* !! */  = Double.class;
                    }
                    catch (hf_0 v54) {
                        throw ph_2.a(v54);
                    }
                }
                if (v3 == v48 /* !! */ ) {
                    var0 = new Double(((Float)var0).floatValue());
                }
            }
            v3 = var0;
        }
        return ((Comparable)v3).compareTo(var1_1);
    }

    protected Object n(Object object, int n10) {
        int n11;
        block56: {
            block57: {
                String string;
                block52: {
                    block53: {
                        Object v2;
                        block54: {
                            Object v3;
                            block55: {
                                block47: {
                                    block48: {
                                        int n12;
                                        int n13;
                                        block49: {
                                            block50: {
                                                block51: {
                                                    block42: {
                                                        block43: {
                                                            int n14;
                                                            List list;
                                                            block44: {
                                                                block45: {
                                                                    block46: {
                                                                        Object object2;
                                                                        block40: {
                                                                            block41: {
                                                                                string = hi_0.C();
                                                                                try {
                                                                                    try {
                                                                                        object2 = object;
                                                                                        if (string != null) break block40;
                                                                                        if (object2 != null) break block41;
                                                                                    }
                                                                                    catch (hf_0 hf_02) {
                                                                                        throw ph_2.a(hf_02);
                                                                                    }
                                                                                    return null;
                                                                                }
                                                                                catch (hf_0 hf_03) {
                                                                                    throw ph_2.a(hf_03);
                                                                                }
                                                                            }
                                                                            object2 = object;
                                                                        }
                                                                        try {
                                                                            n11 = object2 instanceof List;
                                                                            if (string != null) break block42;
                                                                            if (n11 == 0) break block43;
                                                                        }
                                                                        catch (hf_0 hf_04) {
                                                                            throw ph_2.a(hf_04);
                                                                        }
                                                                        list = (List)object;
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    n14 = n10;
                                                                                    if (string != null) break block44;
                                                                                    if (n14 < 0) break block45;
                                                                                }
                                                                                catch (hf_0 hf_05) {
                                                                                    throw ph_2.a(hf_05);
                                                                                }
                                                                                if (n10 >= list.size()) break block46;
                                                                            }
                                                                            catch (hf_0 hf_06) {
                                                                                throw ph_2.a(hf_06);
                                                                            }
                                                                            return list.get(n10);
                                                                        }
                                                                        catch (hf_0 hf_07) {
                                                                            throw ph_2.a(hf_07);
                                                                        }
                                                                    }
                                                                    return null;
                                                                }
                                                                n14 = Math.abs(n10);
                                                            }
                                                            try {
                                                                if (n14 <= list.size()) {
                                                                    return list.get(list.size() + n10);
                                                                }
                                                            }
                                                            catch (hf_0 hf_08) {
                                                                throw ph_2.a(hf_08);
                                                            }
                                                            return null;
                                                        }
                                                        n11 = object.getClass().isArray();
                                                    }
                                                    try {
                                                        if (string != null) break block47;
                                                        if (n11 == 0) break block48;
                                                    }
                                                    catch (hf_0 hf_09) {
                                                        throw ph_2.a(hf_09);
                                                    }
                                                    n13 = Array.getLength(object);
                                                    try {
                                                        try {
                                                            try {
                                                                n12 = n10;
                                                                if (string != null) break block49;
                                                                if (n12 < 0) break block50;
                                                            }
                                                            catch (hf_0 hf_010) {
                                                                throw ph_2.a(hf_010);
                                                            }
                                                            if (n10 >= n13) break block51;
                                                        }
                                                        catch (hf_0 hf_011) {
                                                            throw ph_2.a(hf_011);
                                                        }
                                                        return Array.get(object, n10);
                                                    }
                                                    catch (hf_0 hf_012) {
                                                        throw ph_2.a(hf_012);
                                                    }
                                                }
                                                return null;
                                            }
                                            n12 = Math.abs(n10);
                                        }
                                        try {
                                            if (n12 <= n13) {
                                                return Array.get(object, n13 + n10);
                                            }
                                        }
                                        catch (hf_0 hf_013) {
                                            throw ph_2.a(hf_013);
                                        }
                                        return null;
                                    }
                                    n11 = object instanceof Map;
                                }
                                try {
                                    if (string != null) break block52;
                                    if (n11 == 0) break block53;
                                }
                                catch (hf_0 hf_014) {
                                    throw ph_2.a(hf_014);
                                }
                                Map map = (Map)object;
                                v3 = map.get(n10);
                                try {
                                    v2 = v3;
                                    if (string != null) break block54;
                                    if (v2 != null) break block55;
                                }
                                catch (hf_0 hf_015) {
                                    throw ph_2.a(hf_015);
                                }
                                v3 = map.get(Integer.toString(n10));
                            }
                            v2 = v3;
                        }
                        return v2;
                    }
                    n11 = object instanceof Collection;
                }
                try {
                    if (string != null) break block56;
                    if (n11 == 0) break block57;
                }
                catch (hf_0 hf_016) {
                    throw ph_2.a(hf_016);
                }
                Collection collection = (Collection)object;
                int n15 = 0;
                for (Object e2 : collection) {
                    block58: {
                        block59: {
                            try {
                                try {
                                    if (string != null) break block58;
                                    if (n15 != n10) break block59;
                                }
                                catch (hf_0 hf_017) {
                                    throw ph_2.a(hf_017);
                                }
                                return e2;
                            }
                            catch (hf_0 hf_018) {
                                throw ph_2.a(hf_018);
                            }
                        }
                        ++n15;
                    }
                    if (string == null) continue;
                }
                return null;
            }
            n11 = n10;
        }
        try {
            if (n11 == 0) {
                return object;
            }
        }
        catch (hf_0 hf_019) {
            throw ph_2.a(hf_019);
        }
        throw new UnsupportedOperationException();
    }

    /*
     * Unable to fully structure code
     */
    public boolean I(ph_2 var1_1, Object var2_2, int var3_3, Object var4_4) {
        block33: {
            block36: {
                block37: {
                    block34: {
                        block32: {
                            block28: {
                                block29: {
                                    block31: {
                                        block30: {
                                            var5_5 = hi_0.C();
                                            try {
                                                v0 = var2_2;
                                                if (var5_5 != null) break block28;
                                                if (!(v0 instanceof List)) break block29;
                                            }
                                            catch (hf_0 v1) {
                                                throw ph_2.a(v1);
                                            }
                                            var6_6 = (List)var2_2;
                                            try {
                                                try {
                                                    if (var5_5 != null) break block30;
                                                    if (var3_3 >= 0) {
                                                    }
                                                    ** GOTO lbl26
                                                }
                                                catch (hf_0 v2) {
                                                    throw ph_2.a(v2);
                                                }
                                                var6_6.set(var3_3, var4_4);
                                            }
                                            catch (hf_0 v3) {
                                                throw ph_2.a(v3);
                                            }
                                        }
                                        try {
                                            if (var5_5 == null) break block31;
lbl26:
                                            // 2 sources

                                            var6_6.set(var6_6.size() + var3_3, var4_4);
                                        }
                                        catch (hf_0 v4) {
                                            throw ph_2.a(v4);
                                        }
                                    }
                                    return true;
                                }
                                v0 = var2_2;
                            }
                            var6_7 = v0.getClass();
                            try {
                                try {
                                    v5 = var6_7.isArray();
                                    if (var5_5 != null) break block32;
                                    if (v5 == 0) break block33;
                                }
                                catch (hf_0 v6) {
                                    throw ph_2.a(v6);
                                }
                                v5 = Array.getLength(var2_2);
                            }
                            catch (hf_0 v7) {
                                throw ph_2.a(v7);
                            }
                        }
                        var7_8 = v5;
                        try {
                            block35: {
                                try {
                                    try {
                                        try {
                                            try {
                                                v8 = var3_3;
                                                if (var5_5 != null) break block34;
                                                if (v8 < 0) break block35;
                                            }
                                            catch (hf_0 v9) {
                                                throw ph_2.a(v9);
                                            }
                                            v8 = var3_3;
                                            if (var5_5 != null) break block36;
                                        }
                                        catch (hf_0 v10) {
                                            throw ph_2.a(v10);
                                        }
                                        if (v8 >= var7_8) break block37;
                                    }
                                    catch (hf_0 v11) {
                                        throw ph_2.a(v11);
                                    }
                                    Array.set(var2_2, var3_3, var4_4);
                                    if (var5_5 == null) break block37;
                                }
                                catch (hf_0 v12) {
                                    throw ph_2.a(v12);
                                }
                            }
                            v8 = Math.abs(var3_3);
                        }
                        catch (hf_0 v13) {
                            throw ph_2.a(v13);
                        }
                    }
                    try {
                        try {
                            if (var5_5 != null) break block36;
                            if (v8 > var7_8) break block37;
                        }
                        catch (hf_0 v14) {
                            throw ph_2.a(v14);
                        }
                        Array.set(var2_2, var7_8 + var3_3, var4_4);
                    }
                    catch (hf_0 v15) {
                        throw ph_2.a(v15);
                    }
                }
                v8 = 1;
            }
            return (boolean)v8;
        }
        throw new hf_0(ph_2.a(2741, -16292) + var6_7);
    }

    /*
     * Unable to fully structure code
     */
    public boolean B(ph_2 var1_1, Object var2_2, int var3_3) {
        block15: {
            block16: {
                block20: {
                    block22: {
                        block21: {
                            block17: {
                                block19: {
                                    block18: {
                                        var4_4 = hi_0.C();
                                        try {
                                            v0 = var2_2;
                                            if (var4_4 != null) break block15;
                                            if (!(v0 instanceof List)) break block16;
                                        }
                                        catch (hf_0 v1) {
                                            throw ph_2.a(v1);
                                        }
                                        var5_5 = (List)var2_2;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v2 = var3_3;
                                                        if (var4_4 != null) break block17;
                                                        if (v2 >= 0) {
                                                        }
                                                        ** GOTO lbl41
                                                    }
                                                    catch (hf_0 v3) {
                                                        throw ph_2.a(v3);
                                                    }
                                                    v4 = var3_3;
                                                    if (var4_4 != null) break block18;
                                                }
                                                catch (hf_0 v5) {
                                                    throw ph_2.a(v5);
                                                }
                                                if (v4 < var5_5.size()) break block19;
                                            }
                                            catch (hf_0 v6) {
                                                throw ph_2.a(v6);
                                            }
                                            v4 = 0;
                                        }
                                        catch (hf_0 v7) {
                                            throw ph_2.a(v7);
                                        }
                                    }
                                    return (boolean)v4;
                                }
                                try {
                                    var5_5.remove(var3_3);
                                    if (var4_4 == null) break block20;
lbl41:
                                    // 2 sources

                                    v2 = var5_5.size() + var3_3;
                                }
                                catch (hf_0 v8) {
                                    throw ph_2.a(v8);
                                }
                            }
                            var6_7 = v2;
                            try {
                                v9 = var6_7;
                                if (var4_4 != null) break block21;
                                if (v9 >= 0) break block22;
                            }
                            catch (hf_0 v10) {
                                throw ph_2.a(v10);
                            }
                            v9 = 0;
                        }
                        return (boolean)v9;
                    }
                    var5_5.remove(var6_7);
                }
                return true;
            }
            v0 = var2_2;
        }
        var5_6 = v0.getClass();
        throw new hf_0(ph_2.a(2737, 24511) + var5_6);
    }

    /*
     * Loose catch block
     */
    protected Collection G(Object object) {
        block22: {
            Object object2;
            block19: {
                boolean bl;
                block17: {
                    String string;
                    block18: {
                        Object object3;
                        block15: {
                            block16: {
                                Object object4;
                                block20: {
                                    block14: {
                                        string = hi_0.C();
                                        object4 = object;
                                        if (string != null) break block20;
                                        try {
                                            block21: {
                                                if (object4 != null) break block14;
                                                break block21;
                                                catch (Exception exception) {
                                                    throw ph_2.a(exception);
                                                }
                                            }
                                            return null;
                                        }
                                        catch (Exception exception) {
                                            throw ph_2.a(exception);
                                        }
                                    }
                                    object4 = object;
                                }
                                Class<?> clazz = object4.getClass();
                                nj_2 nj_22 = this.e(clazz);
                                try {
                                    object3 = nj_22;
                                    if (string != null) break block15;
                                    if (object3 == null) break block16;
                                }
                                catch (Exception exception) {
                                    throw ph_2.a(exception);
                                }
                                try {
                                    return nj_22.Y(object);
                                }
                                catch (Exception exception) {
                                    throw new hf_0(ph_2.a(2745, -31157) + this.V, exception);
                                }
                            }
                            object3 = object;
                        }
                        try {
                            bl = object3 instanceof Map;
                            if (string != null) break block17;
                            if (!bl) break block18;
                        }
                        catch (Exception exception) {
                            throw ph_2.a(exception);
                        }
                        Map map = (Map)object;
                        return map.values();
                    }
                    try {
                        object2 = object;
                        if (string != null) break block19;
                        bl = object2 instanceof Collection;
                    }
                    catch (Exception exception) {
                        throw ph_2.a(exception);
                    }
                }
                if (!bl) break block22;
                object2 = object;
            }
            return (Collection)object2;
        }
        throw new UnsupportedOperationException();
    }

    protected void X(Object object, List list) {
        Class<?> clazz;
        block23: {
            List list2;
            String string;
            block22: {
                Collection<Object> collection;
                block27: {
                    Object object2;
                    block21: {
                        boolean bl;
                        block19: {
                            block20: {
                                Object object3;
                                block17: {
                                    block18: {
                                        clazz = object.getClass();
                                        nj_2 nj_22 = this.e(clazz);
                                        string = hi_0.C();
                                        collection = null;
                                        try {
                                            object3 = nj_22;
                                            if (string != null) break block17;
                                            if (object3 == null) break block18;
                                        }
                                        catch (Exception exception) {
                                            throw ph_2.a(exception);
                                        }
                                        try {
                                            collection = nj_22.Y(object);
                                            list.add(object);
                                        }
                                        catch (Exception exception) {
                                            throw new hf_0(ph_2.a(2745, -31157) + this.V, exception);
                                        }
                                    }
                                    object3 = object;
                                }
                                try {
                                    bl = object3 instanceof Map;
                                    if (string != null) break block19;
                                    if (!bl) break block20;
                                }
                                catch (Exception exception) {
                                    throw ph_2.a(exception);
                                }
                                list.add(object);
                                Map map = (Map)object;
                                collection = map.values();
                                break block27;
                            }
                            try {
                                object2 = object;
                                if (string != null) break block21;
                                bl = object2 instanceof Collection;
                            }
                            catch (Exception exception) {
                                throw ph_2.a(exception);
                            }
                        }
                        if (!bl) break block27;
                        object2 = object;
                    }
                    collection = (Collection)object2;
                }
                try {
                    list2 = collection;
                    if (string != null) break block22;
                    if (list2 == null) break block23;
                }
                catch (Exception exception) {
                    throw ph_2.a(exception);
                }
                list2 = collection;
            }
            for (Object e2 : list2) {
                block25: {
                    block26: {
                        Object e3;
                        block24: {
                            try {
                                e3 = e2;
                                if (string != null) break block24;
                                if (e3 == null) break block25;
                            }
                            catch (Exception exception) {
                                throw ph_2.a(exception);
                            }
                            e3 = e2;
                        }
                        try {
                            if (!IG.C(e3.getClass())) break block26;
                            break block25;
                        }
                        catch (Exception exception) {
                            throw ph_2.a(exception);
                        }
                    }
                    this.X(e2, list);
                }
                if (string == null) continue;
            }
            return;
        }
        throw new UnsupportedOperationException(clazz.getName());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void u(Object var1_1, List var2_2) {
        block34: {
            block33: {
                block38: {
                    block32: {
                        block30: {
                            block31: {
                                block28: {
                                    block29: {
                                        var4_3 = var1_1.getClass();
                                        var3_4 = hi_0.C();
                                        var5_5 = this.e(var4_3);
                                        var6_6 /* !! */  = null;
                                        try {
                                            v0 = var5_5;
                                            if (var3_4 != null) break block28;
                                            if (v0 == null) break block29;
                                        }
                                        catch (Exception v1) {
                                            throw ph_2.a(v1);
                                        }
                                        try {
                                            var6_6 /* !! */  = var5_5.Y(var1_1);
                                        }
                                        catch (Exception var7_7) {
                                            throw new hf_0(ph_2.a(2745, -31157) + this.V, var7_7);
                                        }
                                    }
                                    v0 = var1_1;
                                }
                                try {
                                    v2 = v0 instanceof Map;
                                    if (var3_4 != null) break block30;
                                    if (!v2) break block31;
                                }
                                catch (Exception v3) {
                                    throw ph_2.a(v3);
                                }
                                var7_8 = (Map)var1_1;
                                var6_6 /* !! */  = var7_8.values();
                                break block38;
                            }
                            try {
                                v4 = var1_1;
                                if (var3_4 != null) break block32;
                                v2 = v4 instanceof Collection;
                            }
                            catch (Exception v5) {
                                throw ph_2.a(v5);
                            }
                        }
                        if (!v2) break block38;
                        v4 = var1_1;
                    }
                    var6_6 /* !! */  = (Collection)v4;
                }
                try {
                    v6 = var6_6 /* !! */ ;
                    if (var3_4 != null) break block33;
                    if (v6 == null) break block34;
                }
                catch (Exception v7) {
                    throw ph_2.a(v7);
                }
                v6 = var6_6 /* !! */ ;
            }
            for (E var8_9 : v6) {
                block37: {
                    block35: {
                        try {
                            block36: {
                                try {
                                    try {
                                        try {
                                            if (var3_4 != null) break block35;
                                            if (var8_9 == null) break block36;
                                        }
                                        catch (Exception v8) {
                                            throw ph_2.a(v8);
                                        }
                                        v9 = IG.C(var8_9.getClass());
                                        if (var3_4 != null) break block35;
                                    }
                                    catch (Exception v10) {
                                        throw ph_2.a(v10);
                                    }
                                    if (v9) {
                                    }
                                    ** GOTO lbl81
                                }
                                catch (Exception v11) {
                                    throw ph_2.a(v11);
                                }
                            }
                            v9 = var2_2.add(var8_9);
                        }
                        catch (Exception v12) {
                            throw ph_2.a(v12);
                        }
                    }
                    try {
                        if (var3_4 == null) break block37;
lbl81:
                        // 2 sources

                        this.u(var8_9, var2_2);
                    }
                    catch (Exception v13) {
                        throw ph_2.a(v13);
                    }
                }
                if (var3_4 == null) continue;
            }
            return;
        }
        throw new UnsupportedOperationException(var4_3.getName());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean m(Object object, Object object2) {
        boolean bl;
        block29: {
            Object object3;
            String string;
            block27: {
                block28: {
                    Object object4;
                    block25: {
                        block26: {
                            block24: {
                                block22: {
                                    block23: {
                                        string = hi_0.C();
                                        try {
                                            try {
                                                object4 = object;
                                                if (string != null) break block22;
                                                if (object4 != object2) break block23;
                                                return true;
                                            }
                                            catch (hf_0 hf_02) {
                                                throw ph_2.a(hf_02);
                                            }
                                        }
                                        catch (hf_0 hf_03) {
                                            throw ph_2.a(hf_03);
                                        }
                                    }
                                    object4 = object;
                                }
                                try {
                                    if (string != null) break block24;
                                    if (object4 == null) return false;
                                }
                                catch (hf_0 hf_04) {
                                    throw ph_2.a(hf_04);
                                }
                                object4 = object2;
                            }
                            try {
                                try {
                                    if (string != null) break block25;
                                    if (object4 != null) break block26;
                                    return false;
                                }
                                catch (hf_0 hf_05) {
                                    throw ph_2.a(hf_05);
                                }
                            }
                            catch (hf_0 hf_06) {
                                throw ph_2.a(hf_06);
                            }
                        }
                        object4 = object;
                    }
                    try {
                        try {
                            object3 = object4.getClass();
                            if (string != null) break block27;
                            if (object3 != object2.getClass()) break block28;
                            return object.equals(object2);
                        }
                        catch (hf_0 hf_07) {
                            throw ph_2.a(hf_07);
                        }
                    }
                    catch (hf_0 hf_08) {
                        throw ph_2.a(hf_08);
                    }
                }
                object3 = object;
            }
            try {
                try {
                    boolean bl2;
                    try {
                        try {
                            bl = object3 instanceof Number;
                            if (string != null) return bl;
                            if (!bl) break block29;
                        }
                        catch (hf_0 hf_09) {
                            throw ph_2.a(hf_09);
                        }
                        bl2 = object2 instanceof Number;
                        if (string != null) return bl2;
                    }
                    catch (hf_0 hf_010) {
                        throw ph_2.a(hf_010);
                    }
                    if (!bl2) return false;
                    return ph_2.A((Number)object, (Number)object2);
                }
                catch (hf_0 hf_011) {
                    throw ph_2.a(hf_011);
                }
            }
            catch (hf_0 hf_012) {
                throw ph_2.a(hf_012);
            }
        }
        bl = object.equals(object2);
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static boolean A(Number var0, Number var1_1) {
        block63: {
            block64: {
                block65: {
                    block66: {
                        block60: {
                            block61: {
                                block62: {
                                    block58: {
                                        block59: {
                                            block56: {
                                                block57: {
                                                    block50: {
                                                        block51: {
                                                            block52: {
                                                                block53: {
                                                                    block54: {
                                                                        block55: {
                                                                            block48: {
                                                                                block49: {
                                                                                    var3_2 = var0.getClass();
                                                                                    var2_3 = hi_0.C();
                                                                                    var4_4 = ph_2.O(var3_2);
                                                                                    var5_5 = var1_1.getClass();
                                                                                    var6_6 = ph_2.O(var5_5);
                                                                                    try {
                                                                                        v0 = var0 instanceof BigDecimal;
                                                                                        if (var2_3 != null) break block48;
                                                                                        if (!v0) break block49;
                                                                                    }
                                                                                    catch (hf_0 v1) {
                                                                                        throw ph_2.a(v1);
                                                                                    }
                                                                                    var7_7 = (BigDecimal)var0;
                                                                                    try {
                                                                                        try {
                                                                                            v0 = var6_6;
                                                                                            if (var2_3 != null) break block48;
                                                                                            if (!v0) break block49;
                                                                                        }
                                                                                        catch (hf_0 v2) {
                                                                                            throw ph_2.a(v2);
                                                                                        }
                                                                                        return var7_7.equals(BigDecimal.valueOf(B8.e(var1_1)));
                                                                                    }
                                                                                    catch (hf_0 v3) {
                                                                                        throw ph_2.a(v3);
                                                                                    }
                                                                                }
                                                                                v0 = var4_4;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (var2_3 != null) break block50;
                                                                                                if (!v0) break block51;
                                                                                            }
                                                                                            catch (hf_0 v4) {
                                                                                                throw ph_2.a(v4);
                                                                                            }
                                                                                            v0 = var6_6;
                                                                                            if (var2_3 != null) break block52;
                                                                                        }
                                                                                        catch (hf_0 v5) {
                                                                                            throw ph_2.a(v5);
                                                                                        }
                                                                                        if (!v0) break block53;
                                                                                    }
                                                                                    catch (hf_0 v6) {
                                                                                        throw ph_2.a(v6);
                                                                                    }
                                                                                    cfr_temp_0 = var0.longValue() - var1_1.longValue();
                                                                                    v7 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                    if (var2_3 != null) break block54;
                                                                                }
                                                                                catch (hf_0 v8) {
                                                                                    throw ph_2.a(v8);
                                                                                }
                                                                                if (v7 != false) break block55;
                                                                            }
                                                                            catch (hf_0 v9) {
                                                                                throw ph_2.a(v9);
                                                                            }
                                                                            v7 = 1;
                                                                            break block54;
                                                                        }
                                                                        v7 = 0;
                                                                    }
                                                                    return (boolean)v7;
                                                                }
                                                                v0 = var1_1 instanceof BigInteger;
                                                            }
                                                            try {
                                                                if (var2_3 != null) break block50;
                                                                if (!v0) break block51;
                                                            }
                                                            catch (hf_0 v10) {
                                                                throw ph_2.a(v10);
                                                            }
                                                            var7_7 = (BigInteger)var0;
                                                            var8_9 = BigInteger.valueOf(var0.longValue());
                                                            return var8_9.equals(var7_7);
                                                        }
                                                        v0 = var6_6;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if (var2_3 != null) break block56;
                                                                if (!v0) break block57;
                                                            }
                                                            catch (hf_0 v11) {
                                                                throw ph_2.a(v11);
                                                            }
                                                            v0 = var0 instanceof BigInteger;
                                                            if (var2_3 != null) break block56;
                                                        }
                                                        catch (hf_0 v12) {
                                                            throw ph_2.a(v12);
                                                        }
                                                        if (!v0) break block57;
                                                    }
                                                    catch (hf_0 v13) {
                                                        throw ph_2.a(v13);
                                                    }
                                                    var7_7 = (BigInteger)var0;
                                                    var8_10 = BigInteger.valueOf(B8.e(var1_1));
                                                    return var7_7.equals(var8_10);
                                                }
                                                v0 = ph_2.o(var3_2);
                                            }
                                            var7_8 = v0;
                                            var8_11 = ph_2.o(var5_5);
                                            try {
                                                try {
                                                    try {
                                                        v14 = var7_8;
                                                        if (var2_3 != null) break block58;
                                                        if (!v14) break block59;
                                                    }
                                                    catch (hf_0 v15) {
                                                        throw ph_2.a(v15);
                                                    }
                                                    v16 = var8_11;
                                                    if (var2_3 != null) break block60;
                                                }
                                                catch (hf_0 v17) {
                                                    throw ph_2.a(v17);
                                                }
                                                if (!v16) {
                                                }
                                                ** GOTO lbl164
                                            }
                                            catch (hf_0 v18) {
                                                throw ph_2.a(v18);
                                            }
                                        }
                                        v14 = var7_8;
                                    }
                                    try {
                                        try {
                                            try {
                                                if (var2_3 != null) break block61;
                                                if (!v14) break block62;
                                            }
                                            catch (hf_0 v19) {
                                                throw ph_2.a(v19);
                                            }
                                            v16 = var6_6;
                                            if (var2_3 != null) break block60;
                                        }
                                        catch (hf_0 v20) {
                                            throw ph_2.a(v20);
                                        }
                                        if (!v16) {
                                        }
                                        ** GOTO lbl164
                                    }
                                    catch (hf_0 v21) {
                                        throw ph_2.a(v21);
                                    }
                                }
                                v14 = var8_11;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (var2_3 != null) break block63;
                                            if (!v14) break block64;
                                        }
                                        catch (hf_0 v22) {
                                            throw ph_2.a(v22);
                                        }
                                        v14 = var4_4;
                                        if (var2_3 != null) break block63;
                                    }
                                    catch (hf_0 v23) {
                                        throw ph_2.a(v23);
                                    }
                                    if (!v14) break block64;
                                }
                                catch (hf_0 v24) {
                                    throw ph_2.a(v24);
                                }
lbl164:
                                // 3 sources

                                v16 = (cfr_temp_1 = var0.doubleValue() - var1_1.doubleValue()) == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                            }
                            catch (hf_0 v25) {
                                throw ph_2.a(v25);
                            }
                        }
                        try {
                            if (var2_3 != null) break block65;
                            if (v16) break block66;
                        }
                        catch (hf_0 v26) {
                            throw ph_2.a(v26);
                        }
                        v16 = true;
                        break block65;
                    }
                    v16 = false;
                }
                return v16;
            }
            v14 = false;
        }
        return v14;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean o(Class clazz) {
        Class clazz2;
        Class clazz3;
        block6: {
            String string = hi_0.C();
            try {
                try {
                    Class clazz2 = clazz;
                    clazz2 = Float.class;
                    if (string != null) break block6;
                    if (clazz3 == clazz2) return true;
                }
                catch (hf_0 hf_02) {
                    throw ph_2.a(hf_02);
                }
                Class clazz2 = clazz;
                clazz2 = Double.class;
            }
            catch (hf_0 hf_03) {
                throw ph_2.a(hf_03);
            }
        }
        try {
            if (clazz3 != clazz2) return false;
            return true;
        }
        catch (hf_0 hf_04) {
            throw ph_2.a(hf_04);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean O(Class clazz) {
        Class clazz2;
        Class clazz3;
        block16: {
            String string;
            block15: {
                block14: {
                    string = hi_0.C();
                    try {
                        try {
                            Class clazz2 = clazz;
                            clazz2 = Byte.class;
                            if (string != null) break block14;
                            if (clazz3 == clazz2) return true;
                        }
                        catch (hf_0 hf_02) {
                            throw ph_2.a(hf_02);
                        }
                        Class clazz2 = clazz;
                        clazz2 = Short.class;
                    }
                    catch (hf_0 hf_03) {
                        throw ph_2.a(hf_03);
                    }
                }
                try {
                    try {
                        if (string != null) break block15;
                        if (clazz3 == clazz2) return true;
                    }
                    catch (hf_0 hf_04) {
                        throw ph_2.a(hf_04);
                    }
                    Class clazz2 = clazz;
                    clazz2 = Integer.class;
                }
                catch (hf_0 hf_05) {
                    throw ph_2.a(hf_05);
                }
            }
            try {
                try {
                    if (string != null) break block16;
                    if (clazz3 == clazz2) return true;
                }
                catch (hf_0 hf_06) {
                    throw ph_2.a(hf_06);
                }
                Class clazz2 = clazz;
                clazz2 = Long.class;
            }
            catch (hf_0 hf_07) {
                throw ph_2.a(hf_07);
            }
        }
        try {
            if (clazz3 != clazz2) return false;
            return true;
        }
        catch (hf_0 hf_08) {
            throw ph_2.a(hf_08);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected Object S(Object var1_1, String var2_2, long var3_3) {
        block175: {
            block160: {
                block161: {
                    block162: {
                        block163: {
                            block151: {
                                block152: {
                                    block155: {
                                        block153: {
                                            block136: {
                                                block137: {
                                                    block150: {
                                                        block141: {
                                                            block140: {
                                                                block138: {
                                                                    block134: {
                                                                        block135: {
                                                                            block130: {
                                                                                block177: {
                                                                                    block131: {
                                                                                        block132: {
                                                                                            block133: {
                                                                                                block181: {
                                                                                                    block180: {
                                                                                                        block179: {
                                                                                                            block178: {
                                                                                                                block128: {
                                                                                                                    block129: {
                                                                                                                        block126: {
                                                                                                                            block127: {
                                                                                                                                var5_4 = hi_0.C();
                                                                                                                                v0 = var1_1;
                                                                                                                                if (var5_4 != null) break block126;
                                                                                                                                try {
                                                                                                                                    block176: {
                                                                                                                                        if (v0 != null) break block127;
                                                                                                                                        break block176;
                                                                                                                                        catch (Exception v1) {
                                                                                                                                            throw ph_2.a(v1);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    return null;
                                                                                                                                }
                                                                                                                                catch (Exception v2) {
                                                                                                                                    throw ph_2.a(v2);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v0 = var1_1;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            v3 = v0 instanceof String;
                                                                                                                            if (var5_4 != null) break block128;
                                                                                                                            if (!v3) break block129;
                                                                                                                        }
                                                                                                                        catch (Exception v4) {
                                                                                                                            throw ph_2.a(v4);
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            var1_1 = var6_5 = (O0)ok_0.q((String)var1_1, this.w);
                                                                                                                        }
                                                                                                                        catch (Exception var6_6) {
                                                                                                                            // empty catch block
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        v5 = var1_1;
                                                                                                                        if (var5_4 != null) break block130;
                                                                                                                        v3 = v5 instanceof Map;
                                                                                                                    }
                                                                                                                    catch (Exception v6) {
                                                                                                                        throw ph_2.a(v6);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (!v3) break block177;
                                                                                                                var6_5 = (Map)var1_1;
                                                                                                                var7_7 /* !! */  = var6_5.get(var2_2);
                                                                                                                v7 = var7_7 /* !! */ ;
                                                                                                                if (var5_4 != null) break block131;
                                                                                                                if (v7 != null) break block132;
                                                                                                                break block178;
                                                                                                                catch (Exception v8) {
                                                                                                                    throw ph_2.a(v8);
                                                                                                                }
                                                                                                            }
                                                                                                            cfr_temp_0 = ph_2.b(25101, 5373610143680010505L) - var3_3;
                                                                                                            v9 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                                            if (var5_4 != null) break block133;
                                                                                                            break block179;
                                                                                                            catch (Exception v10) {
                                                                                                                throw ph_2.a(v10);
                                                                                                            }
                                                                                                        }
                                                                                                        if (v9 == false) ** GOTO lbl77
                                                                                                        break block180;
                                                                                                        catch (Exception v11) {
                                                                                                            throw ph_2.a(v11);
                                                                                                        }
                                                                                                    }
                                                                                                    cfr_temp_1 = ph_2.b(13474, 4151343535624310697L) - var3_3;
                                                                                                    v9 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                                                                                    if (var5_4 != null) break block133;
                                                                                                    break block181;
                                                                                                    catch (Exception v12) {
                                                                                                        throw ph_2.a(v12);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    block182: {
                                                                                                        if (v9 != false) break block132;
                                                                                                        break block182;
                                                                                                        catch (Exception v13) {
                                                                                                            throw ph_2.a(v13);
                                                                                                        }
                                                                                                    }
                                                                                                    v9 = var6_5.size();
                                                                                                }
                                                                                                catch (Exception v14) {
                                                                                                    throw ph_2.a(v14);
                                                                                                }
                                                                                            }
                                                                                            var7_7 /* !! */  = (int)v9;
                                                                                        }
                                                                                        v7 = var7_7 /* !! */ ;
                                                                                    }
                                                                                    return v7;
                                                                                }
                                                                                v5 = var1_1;
                                                                            }
                                                                            var6_5 = v5.getClass();
                                                                            var7_8 = this.e((Class)var6_5);
                                                                            try {
                                                                                v15 = var7_8;
                                                                                if (var5_4 != null) break block134;
                                                                                if (v15 == null) break block135;
                                                                            }
                                                                            catch (Exception v16) {
                                                                                throw ph_2.a(v16);
                                                                            }
                                                                            try {
                                                                                return var7_8.R(var1_1, var2_2, var3_3, false);
                                                                            }
                                                                            catch (Exception var8_9) {
                                                                                throw new hf_0(ph_2.a(2745, -31157) + this.V + ph_2.a(2740, 24767) + var2_2, var8_9);
                                                                            }
                                                                        }
                                                                        v15 = var1_1;
                                                                    }
                                                                    try {
                                                                        v17 = v15 instanceof List;
                                                                        if (var5_4 != null) break block136;
                                                                        if (!v17) break block137;
                                                                    }
                                                                    catch (Exception v18) {
                                                                        throw ph_2.a(v18);
                                                                    }
                                                                    var8_10 = (List)var1_1;
                                                                    try {
                                                                        block139: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        cfr_temp_2 = ph_2.b(13541, 4460833452907581416L) - var3_3;
                                                                                        v19 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                                                                        if (var5_4 != null) break block138;
                                                                                        if (v19 == false) break block139;
                                                                                    }
                                                                                    catch (Exception v20) {
                                                                                        throw ph_2.a(v20);
                                                                                    }
                                                                                    cfr_temp_3 = ph_2.b(5266, 5429430684185816989L) - var3_3;
                                                                                    v19 = cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1);
                                                                                    if (var5_4 != null) break block138;
                                                                                }
                                                                                catch (Exception v21) {
                                                                                    throw ph_2.a(v21);
                                                                                }
                                                                                if (v19 != false) break block140;
                                                                            }
                                                                            catch (Exception v22) {
                                                                                throw ph_2.a(v22);
                                                                            }
                                                                        }
                                                                        v19 = var8_10.size();
                                                                    }
                                                                    catch (Exception v23) {
                                                                        throw ph_2.a(v23);
                                                                    }
                                                                }
                                                                return (int)v19;
                                                            }
                                                            var9_13 = null;
                                                            for (var10_15 = 0; var10_15 < var8_10.size(); ++var10_15) {
                                                                block148: {
                                                                    block149: {
                                                                        block145: {
                                                                            block146: {
                                                                                block147: {
                                                                                    block142: {
                                                                                        block143: {
                                                                                            block144: {
                                                                                                var11_18 = var8_10.get(var10_15);
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var5_4 != null) break block141;
                                                                                                                v24 /* !! */  = var11_18;
                                                                                                                if (var5_4 != null) break block142;
                                                                                                            }
                                                                                                            catch (Exception v25) {
                                                                                                                throw ph_2.a(v25);
                                                                                                            }
                                                                                                            if (v24 /* !! */  == var8_10) {
                                                                                                            }
                                                                                                            ** GOTO lbl179
                                                                                                        }
                                                                                                        catch (Exception v26) {
                                                                                                            throw ph_2.a(v26);
                                                                                                        }
                                                                                                        v27 = var9_13;
                                                                                                        if (var5_4 != null) break block143;
                                                                                                    }
                                                                                                    catch (Exception v28) {
                                                                                                        throw ph_2.a(v28);
                                                                                                    }
                                                                                                    if (v27 != null) break block144;
                                                                                                }
                                                                                                catch (Exception v29) {
                                                                                                    throw ph_2.a(v29);
                                                                                                }
                                                                                                var9_13 = new oc_0(var8_10.size());
                                                                                            }
                                                                                            v27 = var9_13;
                                                                                        }
                                                                                        try {
                                                                                            v27.add(var11_18);
                                                                                            if (var5_4 == null) continue;
lbl179:
                                                                                            // 2 sources

                                                                                            v24 /* !! */  = this.S(var11_18, var2_2, var3_3);
                                                                                        }
                                                                                        catch (Exception v30) {
                                                                                            throw ph_2.a(v30);
                                                                                        }
                                                                                    }
                                                                                    var12_20 = v24 /* !! */ ;
                                                                                    try {
                                                                                        v31 = var12_20;
                                                                                        if (var5_4 != null) break block145;
                                                                                        if (v31 instanceof Collection) {
                                                                                        }
                                                                                        ** GOTO lbl209
                                                                                    }
                                                                                    catch (Exception v32) {
                                                                                        throw ph_2.a(v32);
                                                                                    }
                                                                                    var13_24 = (Collection)var12_20;
                                                                                    try {
                                                                                        v33 = var9_13;
                                                                                        if (var5_4 != null) break block146;
                                                                                        if (v33 != null) break block147;
                                                                                    }
                                                                                    catch (Exception v34) {
                                                                                        throw ph_2.a(v34);
                                                                                    }
                                                                                    var9_13 = new oc_0(var8_10.size());
                                                                                }
                                                                                v33 = var9_13;
                                                                            }
                                                                            try {
                                                                                v33.addAll(var13_24);
                                                                                if (var5_4 == null) continue;
lbl209:
                                                                                // 2 sources

                                                                                v31 = var12_20;
                                                                            }
                                                                            catch (Exception v35) {
                                                                                throw ph_2.a(v35);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (v31 == null && this.T) continue;
                                                                                }
                                                                                catch (Exception v36) {
                                                                                    throw ph_2.a(v36);
                                                                                }
                                                                                v37 = var9_13;
                                                                                if (var5_4 != null) break block148;
                                                                            }
                                                                            catch (Exception v38) {
                                                                                throw ph_2.a(v38);
                                                                            }
                                                                            if (v37 != null) break block149;
                                                                        }
                                                                        catch (Exception v39) {
                                                                            throw ph_2.a(v39);
                                                                        }
                                                                        var9_13 = new oc_0(var8_10.size());
                                                                    }
                                                                    v37 = var9_13;
                                                                }
                                                                v37.add(var12_20);
                                                                if (var5_4 == null) continue;
                                                            }
                                                            try {
                                                                v40 = var9_13;
                                                                if (var5_4 != null) break block150;
                                                                if (v40 != null) break block141;
                                                            }
                                                            catch (Exception v41) {
                                                                throw ph_2.a(v41);
                                                            }
                                                            var9_13 = Collections.emptyList();
                                                        }
                                                        v40 = var9_13;
                                                    }
                                                    return v40;
                                                }
                                                v17 = var1_1 instanceof Object[];
                                            }
                                            try {
                                                if (var5_4 != null) break block151;
                                                if (!v17) break block152;
                                            }
                                            catch (Exception v42) {
                                                throw ph_2.a(v42);
                                            }
                                            var8_11 = (Object[])var1_1;
                                            try {
                                                block154: {
                                                    try {
                                                        try {
                                                            try {
                                                                cfr_temp_4 = ph_2.b(13541, 4460833452907581416L) - var3_3;
                                                                v43 = cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1);
                                                                if (var5_4 != null) break block153;
                                                                if (v43 == false) break block154;
                                                            }
                                                            catch (Exception v44) {
                                                                throw ph_2.a(v44);
                                                            }
                                                            cfr_temp_5 = ph_2.b(5266, 5429430684185816989L) - var3_3;
                                                            v43 = cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1);
                                                            if (var5_4 != null) break block153;
                                                        }
                                                        catch (Exception v45) {
                                                            throw ph_2.a(v45);
                                                        }
                                                        if (v43 != false) break block155;
                                                    }
                                                    catch (Exception v46) {
                                                        throw ph_2.a(v46);
                                                    }
                                                }
                                                v43 = var8_11.length;
                                            }
                                            catch (Exception v47) {
                                                throw ph_2.a(v47);
                                            }
                                        }
                                        return (int)v43;
                                    }
                                    var9_14 = new oc_0(var8_11.length);
                                    for (var10_16 = 0; var10_16 < var8_11.length; ++var10_16) {
                                        block158: {
                                            block156: {
                                                var11_19 = var8_11[var10_16];
                                                try {
                                                    block157: {
                                                        try {
                                                            try {
                                                                v48 = var11_19;
                                                                if (var5_4 != null) break block156;
                                                                if (v48 != var8_11) break block157;
                                                            }
                                                            catch (Exception v49) {
                                                                throw ph_2.a(v49);
                                                            }
                                                            var9_14.add(var11_19);
                                                            if (var5_4 == null) continue;
                                                        }
                                                        catch (Exception v50) {
                                                            throw ph_2.a(v50);
                                                        }
                                                    }
                                                    v48 = this.S(var11_19, var2_2, var3_3);
                                                }
                                                catch (Exception v51) {
                                                    throw ph_2.a(v51);
                                                }
                                            }
                                            var12_21 = v48;
                                            try {
                                                v52 = var12_21;
                                                if (var5_4 != null) break block158;
                                                if (v52 instanceof Collection) {
                                                }
                                                ** GOTO lbl326
                                            }
                                            catch (Exception v53) {
                                                throw ph_2.a(v53);
                                            }
                                            var13_25 = (Collection)var12_21;
                                            try {
                                                var9_14.addAll(var13_25);
                                                if (var5_4 == null) continue;
lbl326:
                                                // 2 sources

                                                v52 = var12_21;
                                            }
                                            catch (Exception v54) {
                                                throw ph_2.a(v54);
                                            }
                                        }
                                        try {
                                            block159: {
                                                try {
                                                    try {
                                                        if (v52 != null) break block159;
                                                        v55 = this.T;
                                                        if (var5_4 != null) continue;
                                                    }
                                                    catch (Exception v56) {
                                                        throw ph_2.a(v56);
                                                    }
                                                    if (v55) continue;
                                                }
                                                catch (Exception v57) {
                                                    throw ph_2.a(v57);
                                                }
                                            }
                                            v55 = var9_14.add(var12_21);
                                            continue;
                                        }
                                        catch (Exception v58) {
                                            throw ph_2.a(v58);
                                        }
                                    }
                                    return var9_14;
                                }
                                v17 = var1_1 instanceof Enum;
                            }
                            try {
                                if (var5_4 != null) break block160;
                                if (!v17) break block161;
                            }
                            catch (Exception v59) {
                                throw ph_2.a(v59);
                            }
                            var8_12 = ph_2.b(24888, 4613454632877529636L);
                            var10_17 = ph_2.b(3158, 4834138499094902620L);
                            var12_22 = (Enum)var1_1;
                            try {
                                try {
                                    cfr_temp_6 = ph_2.b(31798, 4207313242258310970L) - var3_3;
                                    v17 = cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1);
                                    if (var5_4 != null) break block162;
                                    if (v17) break block163;
                                }
                                catch (Exception v60) {
                                    throw ph_2.a(v60);
                                }
                                return var12_22.name();
                            }
                            catch (Exception v61) {
                                throw ph_2.a(v61);
                            }
                        }
                        cfr_temp_7 = ph_2.b(27073, 7537955708887077596L) - var3_3;
                        v17 = cfr_temp_7 == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1);
                    }
                    try {
                        try {
                            if (var5_4 != null) break block160;
                            if (v17) break block161;
                        }
                        catch (Exception v62) {
                            throw ph_2.a(v62);
                        }
                        return var12_22.ordinal();
                    }
                    catch (Exception v63) {
                        throw ph_2.a(v63);
                    }
                }
                v17 = var1_1 instanceof Calendar;
            }
            if (v17) {
                block174: {
                    block172: {
                        block173: {
                            block170: {
                                block171: {
                                    block168: {
                                        block169: {
                                            block166: {
                                                block167: {
                                                    block164: {
                                                        block165: {
                                                            var8_12 = ph_2.b(15373, 4510529984305973004L);
                                                            var10_17 = ph_2.b(25031, 559826626649299653L);
                                                            var12_23 = ph_2.b(22532, 4726992648096850690L);
                                                            var14_26 = ph_2.b(26669, 4419094668829561640L);
                                                            var16_27 = ph_2.b(28343, 1332627107792131519L);
                                                            var18_28 = ph_2.b(14976, 8855573924842095007L);
                                                            var20_29 = (Calendar)var1_1;
                                                            try {
                                                                try {
                                                                    cfr_temp_8 = ph_2.b(4741, 160794128543508875L) - var3_3;
                                                                    v64 = cfr_temp_8 == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1);
                                                                    if (var5_4 != null) break block164;
                                                                    if (v64 != false) break block165;
                                                                }
                                                                catch (Exception v65) {
                                                                    throw ph_2.a(v65);
                                                                }
                                                                return var20_29.get(1);
                                                            }
                                                            catch (Exception v66) {
                                                                throw ph_2.a(v66);
                                                            }
                                                        }
                                                        cfr_temp_9 = ph_2.b(31504, 3058217878099886096L) - var3_3;
                                                        v64 = cfr_temp_9 == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1);
                                                    }
                                                    try {
                                                        try {
                                                            if (var5_4 != null) break block166;
                                                            if (v64 != false) break block167;
                                                        }
                                                        catch (Exception v67) {
                                                            throw ph_2.a(v67);
                                                        }
                                                        return var20_29.get(2);
                                                    }
                                                    catch (Exception v68) {
                                                        throw ph_2.a(v68);
                                                    }
                                                }
                                                cfr_temp_10 = ph_2.b(4624, 3327246407184673038L) - var3_3;
                                                v64 = cfr_temp_10 == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1);
                                            }
                                            try {
                                                try {
                                                    if (var5_4 != null) break block168;
                                                    if (v64 != false) break block169;
                                                }
                                                catch (Exception v69) {
                                                    throw ph_2.a(v69);
                                                }
                                                return var20_29.get(5);
                                            }
                                            catch (Exception v70) {
                                                throw ph_2.a(v70);
                                            }
                                        }
                                        cfr_temp_11 = ph_2.b(5705, 8719773549315124544L) - var3_3;
                                        v64 = cfr_temp_11 == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1);
                                    }
                                    try {
                                        try {
                                            if (var5_4 != null) break block170;
                                            if (v64 != false) break block171;
                                        }
                                        catch (Exception v71) {
                                            throw ph_2.a(v71);
                                        }
                                        return var20_29.get(ph_2.a(350, 4928691428755676694L));
                                    }
                                    catch (Exception v72) {
                                        throw ph_2.a(v72);
                                    }
                                }
                                cfr_temp_12 = ph_2.b(3718, 553241040576607621L) - var3_3;
                                v64 = cfr_temp_12 == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1);
                            }
                            try {
                                try {
                                    if (var5_4 != null) break block172;
                                    if (v64 != false) break block173;
                                }
                                catch (Exception v73) {
                                    throw ph_2.a(v73);
                                }
                                return var20_29.get(ph_2.a(18485, 3339895755361081210L));
                            }
                            catch (Exception v74) {
                                throw ph_2.a(v74);
                            }
                        }
                        cfr_temp_13 = ph_2.b(10755, 3222351445514703108L) - var3_3;
                        v64 = cfr_temp_13 == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1);
                    }
                    try {
                        try {
                            if (var5_4 != null) break block174;
                            if (v64 != false) break block175;
                        }
                        catch (Exception v75) {
                            throw ph_2.a(v75);
                        }
                        v64 = var20_29.get(ph_2.a(10608, 7735060080889968188L));
                    }
                    catch (Exception v76) {
                        throw ph_2.a(v76);
                    }
                }
                return (int)v64;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void L(Object var1_1, String var2_2, List var3_3) {
        block55: {
            block54: {
                block51: {
                    block52: {
                        block49: {
                            block59: {
                                block42: {
                                    block43: {
                                        block40: {
                                            block41: {
                                                var4_4 = hi_0.C();
                                                try {
                                                    v0 = var1_1;
                                                    if (var4_4 != null) break block40;
                                                    if (v0 != null) break block41;
                                                }
                                                catch (InvocationTargetException v1) {
                                                    throw ph_2.a(v1);
                                                }
                                                return;
                                            }
                                            v0 = var1_1;
                                        }
                                        try {
                                            v2 = v0 instanceof Map;
                                            if (var4_4 != null) break block42;
                                            if (!v2) break block43;
                                        }
                                        catch (InvocationTargetException v3) {
                                            throw ph_2.a(v3);
                                        }
                                        var5_5 = (Map)var1_1;
                                        for (Map.Entry<K, V> var7_11 : var5_5.entrySet()) {
                                            block48: {
                                                block44: {
                                                    block45: {
                                                        block46: {
                                                            block47: {
                                                                block57: {
                                                                    block56: {
                                                                        var8_15 = var7_11.getValue();
                                                                        v4 /* !! */  = var2_2;
                                                                        if (var4_4 != null) break block44;
                                                                        if (!v4 /* !! */ .equals(var7_11.getKey())) break block45;
                                                                        break block56;
                                                                        catch (InvocationTargetException v5) {
                                                                            throw ph_2.a(v5);
                                                                        }
                                                                    }
                                                                    v6 = var8_15 instanceof Collection;
                                                                    if (var4_4 != null) break block46;
                                                                    break block57;
                                                                    catch (InvocationTargetException v7) {
                                                                        throw ph_2.a(v7);
                                                                    }
                                                                }
                                                                try {
                                                                    block58: {
                                                                        if (!v6) break block47;
                                                                        break block58;
                                                                        catch (InvocationTargetException v8) {
                                                                            throw ph_2.a(v8);
                                                                        }
                                                                    }
                                                                    var3_3.addAll((Collection)var8_15);
                                                                    if (var4_4 == null) continue;
                                                                }
                                                                catch (InvocationTargetException v9) {
                                                                    throw ph_2.a(v9);
                                                                }
                                                            }
                                                            v6 = var3_3.add(var8_15);
                                                        }
                                                        if (var4_4 == null) continue;
                                                    }
                                                    v4 /* !! */  = var8_15;
                                                }
                                                try {
                                                    if (var4_4 != null) break block48;
                                                    if (v4 /* !! */  == null) continue;
                                                }
                                                catch (InvocationTargetException v10) {
                                                    throw ph_2.a(v10);
                                                }
                                                v4 /* !! */  = var8_15;
                                            }
                                            try {
                                                if (IG.C(v4 /* !! */ .getClass()) && var4_4 == null) continue;
                                            }
                                            catch (InvocationTargetException v11) {
                                                throw ph_2.a(v11);
                                            }
                                            this.L(var8_15, var2_2, var3_3);
                                            if (var4_4 == null) continue;
                                        }
                                        return;
                                    }
                                    try {
                                        v12 = var1_1;
                                        if (var4_4 != null) break block49;
                                        v2 = v12 instanceof Collection;
                                    }
                                    catch (InvocationTargetException v13) {
                                        throw ph_2.a(v13);
                                    }
                                }
                                if (!v2) break block59;
                                for (E var6_9 : (Collection)var1_1) {
                                    block60: {
                                        block50: {
                                            if (var4_4 != null) break block60;
                                            try {
                                                block61: {
                                                    if (!IG.C(var6_9.getClass())) break block50;
                                                    break block61;
                                                    catch (InvocationTargetException v14) {
                                                        throw ph_2.a(v14);
                                                    }
                                                }
                                                if (var4_4 == null) continue;
                                            }
                                            catch (InvocationTargetException v15) {
                                                throw ph_2.a(v15);
                                            }
                                        }
                                        this.L(var6_9, var2_2, var3_3);
                                    }
                                    if (var4_4 == null) continue;
                                }
                                return;
                            }
                            v12 = var1_1;
                        }
                        var5_7 = v12.getClass();
                        var6_10 = this.e(var5_7);
                        try {
                            v16 = var6_10;
                            if (var4_4 != null) break block51;
                            if (v16 == null) break block52;
                        }
                        catch (InvocationTargetException v17) {
                            throw ph_2.a(v17);
                        }
                        try {
                            block53: {
                                var7_12 = var6_10.d(var2_2);
                                try {
                                    v18 = var7_12;
                                    if (var4_4 == null) {
                                        if (v18 == null) break block53;
                                    }
                                    ** GOTO lbl126
                                }
                                catch (InvocationTargetException v19) {
                                    throw ph_2.a(v19);
                                }
                                try {
                                    v18 = var7_12.t(var1_1);
lbl126:
                                    // 2 sources

                                    var8_16 = v18;
                                    var3_3.add(var8_16);
                                }
                                catch (InvocationTargetException var8_17) {
                                    throw new hi_0(ph_2.a(2747, -6984) + var2_2, var8_17);
                                }
                                catch (IllegalAccessException var8_18) {
                                    throw new hi_0(ph_2.a(2735, 18482) + var2_2, var8_18);
                                }
                                return;
                            }
                            var8_19 = var6_10.Y(var1_1);
                            for (E var10_23 : var8_19) {
                                this.L(var10_23, var2_2, var3_3);
                                if (var4_4 == null) continue;
                            }
                            return;
                        }
                        catch (Exception var7_13) {
                            throw new hf_0(ph_2.a(2745, -31157) + this.V + ph_2.a(2740, 24767) + var2_2, var7_13);
                        }
                    }
                    v16 = var1_1;
                }
                try {
                    try {
                        if (var4_4 != null) break block54;
                        if (!(v16 instanceof List)) break block55;
                    }
                    catch (InvocationTargetException v20) {
                        throw ph_2.a(v20);
                    }
                    v16 = var1_1;
                }
                catch (InvocationTargetException v21) {
                    throw ph_2.a(v21);
                }
            }
            var7_14 = (List)v16;
            for (var8_20 = 0; var8_20 < var7_14.size(); ++var8_20) {
                var9_22 = var7_14.get(var8_20);
                this.L(var9_22, var2_2, var3_3);
                if (var4_4 == null) continue;
            }
            return;
        }
    }

    protected void R(Object object, String string, long l2, Object object2) {
        block30: {
            Object object3;
            String string2;
            block29: {
                block25: {
                    block26: {
                        Object object4;
                        block21: {
                            block22: {
                                Map map;
                                block23: {
                                    Map map2;
                                    block24: {
                                        block19: {
                                            block20: {
                                                string2 = hi_0.C();
                                                try {
                                                    object4 = object;
                                                    if (string2 != null) break block19;
                                                    if (object4 != null) break block20;
                                                }
                                                catch (Exception exception) {
                                                    throw ph_2.a(exception);
                                                }
                                                return;
                                            }
                                            object4 = object;
                                        }
                                        try {
                                            if (string2 != null) break block21;
                                            if (!(object4 instanceof Map)) break block22;
                                        }
                                        catch (Exception exception) {
                                            throw ph_2.a(exception);
                                        }
                                        map2 = (Map)object;
                                        try {
                                            map = map2;
                                            if (string2 != null) break block23;
                                            if (!map.containsKey(string)) break block24;
                                        }
                                        catch (Exception exception) {
                                            throw ph_2.a(exception);
                                        }
                                        Object v2 = map2.get(string);
                                        map2.put(string, object2);
                                        return;
                                    }
                                    map = map2;
                                }
                                for (Object v3 : map.values()) {
                                    this.R(v3, string, l2, object2);
                                    if (string2 == null) continue;
                                }
                                return;
                            }
                            object4 = object;
                        }
                        Class<?> clazz = object4.getClass();
                        ep_2 ep_22 = this.Z(clazz);
                        try {
                            object3 = ep_22;
                            if (string2 != null) break block25;
                            if (object3 == null) break block26;
                        }
                        catch (Exception exception) {
                            throw ph_2.a(exception);
                        }
                        try {
                            block28: {
                                uT uT2;
                                block27: {
                                    uT uT3 = ep_22.a(string);
                                    try {
                                        uT2 = uT3;
                                        if (string2 != null) break block27;
                                        if (uT2 == null) break block28;
                                    }
                                    catch (Exception exception) {
                                        throw ph_2.a(exception);
                                    }
                                    uT2 = uT3;
                                }
                                uT2.D(object, object2);
                                return;
                            }
                            nj_2 nj_22 = this.e(clazz);
                            List list = nj_22.y(object);
                            for (Object e2 : list) {
                                this.R(e2, string, l2, object2);
                                if (string2 == null) continue;
                            }
                            return;
                        }
                        catch (Exception exception) {
                            throw new hf_0(ph_2.a(2736, -14310) + this.V + ph_2.a(2738, -30609) + string, exception);
                        }
                    }
                    object3 = object;
                }
                try {
                    try {
                        if (string2 != null) break block29;
                        if (!(object3 instanceof List)) break block30;
                    }
                    catch (Exception exception) {
                        throw ph_2.a(exception);
                    }
                    object3 = object;
                }
                catch (Exception exception) {
                    throw ph_2.a(exception);
                }
            }
            List list = (List)object3;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                Object e3 = list.get(i2);
                this.R(e3, string, l2, object2);
                if (string2 == null) continue;
            }
            return;
        }
    }

    protected boolean u(Object object, String string, long l2, Object object2) {
        block36: {
            uT uT2;
            block40: {
                Type type;
                Object object3;
                block41: {
                    Object object4;
                    String string2;
                    block39: {
                        block37: {
                            block38: {
                                ep_2 ep_22;
                                block35: {
                                    ep_2 ep_23;
                                    block34: {
                                        X4 x42;
                                        block33: {
                                            block42: {
                                                Object object5;
                                                block30: {
                                                    boolean bl;
                                                    block28: {
                                                        block29: {
                                                            string2 = hi_0.C();
                                                            try {
                                                                try {
                                                                    bl = object instanceof Map;
                                                                    if (string2 != null) break block28;
                                                                    if (!bl) break block29;
                                                                }
                                                                catch (hf_0 hf_02) {
                                                                    throw ph_2.a(hf_02);
                                                                }
                                                                ((Map)object).put(string, object2);
                                                                return true;
                                                            }
                                                            catch (hf_0 hf_03) {
                                                                throw ph_2.a(hf_03);
                                                            }
                                                        }
                                                        try {
                                                            object5 = object;
                                                            if (string2 != null) break block30;
                                                            bl = object5 instanceof List;
                                                        }
                                                        catch (hf_0 hf_04) {
                                                            throw ph_2.a(hf_04);
                                                        }
                                                    }
                                                    if (!bl) break block42;
                                                    object5 = object;
                                                }
                                                for (Object e2 : (List)object5) {
                                                    block31: {
                                                        block32: {
                                                            try {
                                                                try {
                                                                    if (string2 != null) break block31;
                                                                    if (e2 != null) break block32;
                                                                }
                                                                catch (hf_0 hf_05) {
                                                                    throw ph_2.a(hf_05);
                                                                }
                                                                if (string2 == null) continue;
                                                            }
                                                            catch (hf_0 hf_06) {
                                                                throw ph_2.a(hf_06);
                                                            }
                                                        }
                                                        this.u(e2, string, l2, object2);
                                                    }
                                                    if (string2 == null) continue;
                                                }
                                                return true;
                                            }
                                            X4 x43 = this.w.h(object.getClass());
                                            ep_23 = null;
                                            try {
                                                try {
                                                    x42 = x43;
                                                    if (string2 != null) break block33;
                                                    if (!(x42 instanceof ep_2)) break block34;
                                                }
                                                catch (hf_0 hf_07) {
                                                    throw ph_2.a(hf_07);
                                                }
                                                x42 = x43;
                                            }
                                            catch (hf_0 hf_08) {
                                                throw ph_2.a(hf_08);
                                            }
                                        }
                                        ep_23 = (ep_2)x42;
                                    }
                                    try {
                                        ep_22 = ep_23;
                                        if (string2 != null) break block35;
                                        if (ep_22 == null) break block36;
                                    }
                                    catch (hf_0 hf_09) {
                                        throw ph_2.a(hf_09);
                                    }
                                    ep_22 = ep_23;
                                }
                                uT2 = ep_22.k(l2);
                                try {
                                    try {
                                        object4 = uT2;
                                        if (string2 != null) break block37;
                                        if (object4 != null) break block38;
                                    }
                                    catch (hf_0 hf_010) {
                                        throw ph_2.a(hf_010);
                                    }
                                    return false;
                                }
                                catch (hf_0 hf_011) {
                                    throw ph_2.a(hf_011);
                                }
                            }
                            object4 = object2;
                        }
                        try {
                            if (string2 != null) break block39;
                            if (object4 == null) break block40;
                        }
                        catch (hf_0 hf_012) {
                            throw ph_2.a(hf_012);
                        }
                        object4 = object2;
                    }
                    try {
                        try {
                            object3 = object4.getClass();
                            type = uT2.p.O;
                            if (string2 != null) break block41;
                            if (object3 == type) break block40;
                        }
                        catch (hf_0 hf_013) {
                            throw ph_2.a(hf_013);
                        }
                        object3 = object2;
                        type = uT2.p.a;
                    }
                    catch (hf_0 hf_014) {
                        throw ph_2.a(hf_014);
                    }
                }
                object2 = B8.I(object3, type, this.w);
            }
            uT2.D(object, object2);
            return true;
        }
        throw new UnsupportedOperationException();
    }

    protected boolean N(Object object, String string, boolean bl) {
        block44: {
            boolean bl2;
            block43: {
                String string2;
                block36: {
                    boolean bl3;
                    block39: {
                        boolean bl4;
                        block40: {
                            block38: {
                                uT uT2;
                                block37: {
                                    ep_2 ep_22;
                                    block35: {
                                        ep_2 ep_23;
                                        block34: {
                                            X4 x42;
                                            block33: {
                                                block30: {
                                                    boolean bl5;
                                                    block31: {
                                                        boolean bl6;
                                                        block32: {
                                                            boolean bl7;
                                                            Object object2;
                                                            block29: {
                                                                string2 = hi_0.C();
                                                                try {
                                                                    try {
                                                                        object2 = object;
                                                                        if (string2 != null) break block29;
                                                                        if (!(object2 instanceof Map)) break block30;
                                                                    }
                                                                    catch (hf_0 hf_02) {
                                                                        throw ph_2.a(hf_02);
                                                                    }
                                                                    object2 = ((Map)object).remove(string);
                                                                }
                                                                catch (hf_0 hf_03) {
                                                                    throw ph_2.a(hf_03);
                                                                }
                                                            }
                                                            Object object3 = object2;
                                                            try {
                                                                bl7 = object3 != null;
                                                            }
                                                            catch (hf_0 hf_04) {
                                                                throw ph_2.a(hf_04);
                                                            }
                                                            bl6 = bl7;
                                                            try {
                                                                bl5 = bl;
                                                                if (string2 != null) break block31;
                                                                if (!bl5) break block32;
                                                            }
                                                            catch (hf_0 hf_05) {
                                                                throw ph_2.a(hf_05);
                                                            }
                                                            for (Object v2 : ((Map)object).values()) {
                                                                try {
                                                                    bl5 = this.N(v2, string, bl);
                                                                    if (string2 == null) {
                                                                        if (string2 == null) continue;
                                                                        break;
                                                                    }
                                                                    break block31;
                                                                }
                                                                catch (hf_0 hf_06) {
                                                                    throw ph_2.a(hf_06);
                                                                }
                                                            }
                                                        }
                                                        bl5 = bl6;
                                                    }
                                                    return bl5;
                                                }
                                                X4 x43 = this.w.h(object.getClass());
                                                ep_23 = null;
                                                try {
                                                    try {
                                                        x42 = x43;
                                                        if (string2 != null) break block33;
                                                        if (!(x42 instanceof ep_2)) break block34;
                                                    }
                                                    catch (hf_0 hf_07) {
                                                        throw ph_2.a(hf_07);
                                                    }
                                                    x42 = x43;
                                                }
                                                catch (hf_0 hf_08) {
                                                    throw ph_2.a(hf_08);
                                                }
                                            }
                                            ep_23 = (ep_2)x42;
                                        }
                                        try {
                                            ep_22 = ep_23;
                                            if (string2 != null) break block35;
                                            if (ep_22 == null) break block36;
                                        }
                                        catch (hf_0 hf_09) {
                                            throw ph_2.a(hf_09);
                                        }
                                        ep_22 = ep_23;
                                    }
                                    uT uT3 = ep_22.a(string);
                                    bl4 = false;
                                    try {
                                        uT2 = uT3;
                                        if (string2 != null) break block37;
                                        if (uT2 == null) break block38;
                                    }
                                    catch (hf_0 hf_010) {
                                        throw ph_2.a(hf_010);
                                    }
                                    uT2 = uT3;
                                }
                                uT2.S(object, null);
                                bl4 = true;
                            }
                            try {
                                bl3 = bl;
                                if (string2 != null) break block39;
                                if (!bl3) break block40;
                            }
                            catch (hf_0 hf_011) {
                                throw ph_2.a(hf_011);
                            }
                            Collection collection = this.G(object);
                            for (Object e2 : collection) {
                                block41: {
                                    block42: {
                                        try {
                                            try {
                                                if (string2 != null) break block41;
                                                if (e2 != null) break block42;
                                            }
                                            catch (hf_0 hf_012) {
                                                throw ph_2.a(hf_012);
                                            }
                                            if (string2 == null) continue;
                                        }
                                        catch (hf_0 hf_013) {
                                            throw ph_2.a(hf_013);
                                        }
                                    }
                                    this.N(e2, string, bl);
                                }
                                if (string2 == null) continue;
                            }
                        }
                        bl3 = bl4;
                    }
                    return bl3;
                }
                try {
                    bl2 = bl;
                    if (string2 != null) break block43;
                    if (!bl2) break block44;
                }
                catch (hf_0 hf_014) {
                    throw ph_2.a(hf_014);
                }
                bl2 = false;
            }
            return bl2;
        }
        throw new UnsupportedOperationException();
    }

    protected nj_2 e(Class clazz) {
        nj_2 nj_22;
        block5: {
            ak_0 ak_02;
            block4: {
                nj_22 = null;
                String string = hi_0.C();
                ak_0 ak_03 = this.F.O(clazz);
                try {
                    try {
                        ak_02 = ak_03;
                        if (string != null) break block4;
                        if (!(ak_02 instanceof nj_2)) break block5;
                    }
                    catch (hf_0 hf_02) {
                        throw ph_2.a(hf_02);
                    }
                    ak_02 = ak_03;
                }
                catch (hf_0 hf_03) {
                    throw ph_2.a(hf_03);
                }
            }
            nj_22 = (nj_2)ak_02;
        }
        return nj_22;
    }

    protected ep_2 Z(Class clazz) {
        ep_2 ep_22;
        block5: {
            X4 x42;
            block4: {
                ep_22 = null;
                String string = hi_0.C();
                X4 x43 = this.w.h(clazz);
                try {
                    try {
                        x42 = x43;
                        if (string != null) break block4;
                        if (!(x42 instanceof ep_2)) break block5;
                    }
                    catch (hf_0 hf_02) {
                        throw ph_2.a(hf_02);
                    }
                    x42 = x43;
                }
                catch (hf_0 hf_03) {
                    throw ph_2.a(hf_03);
                }
            }
            ep_22 = (ep_2)x42;
        }
        return ep_22;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    int T(Object object) {
        nj_2 nj_22;
        nj_2 nj_23;
        block38: {
            String string;
            block37: {
                int n10;
                block36: {
                    block34: {
                        block35: {
                            block32: {
                                block33: {
                                    block30: {
                                        block31: {
                                            Object object2;
                                            block28: {
                                                block29: {
                                                    string = hi_0.C();
                                                    object2 = object;
                                                    if (string != null) break block28;
                                                    try {
                                                        if (object2 != null) break block29;
                                                        return -1;
                                                        catch (Exception exception) {
                                                            throw ph_2.a(exception);
                                                        }
                                                    }
                                                    catch (Exception exception) {
                                                        throw ph_2.a(exception);
                                                    }
                                                }
                                                object2 = object;
                                            }
                                            n10 = object2 instanceof Collection;
                                            if (string != null) break block30;
                                            try {
                                                if (n10 == 0) break block31;
                                                return ((Collection)object).size();
                                                catch (Exception exception) {
                                                    throw ph_2.a(exception);
                                                }
                                            }
                                            catch (Exception exception) {
                                                throw ph_2.a(exception);
                                            }
                                        }
                                        n10 = object instanceof Object[];
                                    }
                                    if (string != null) break block32;
                                    try {
                                        if (n10 == 0) break block33;
                                        return ((Object[])object).length;
                                        catch (Exception exception) {
                                            throw ph_2.a(exception);
                                        }
                                    }
                                    catch (Exception exception) {
                                        throw ph_2.a(exception);
                                    }
                                }
                                n10 = object.getClass().isArray();
                            }
                            if (string != null) break block34;
                            try {
                                if (n10 == 0) break block35;
                                return Array.getLength(object);
                                catch (Exception exception) {
                                    throw ph_2.a(exception);
                                }
                            }
                            catch (Exception exception) {
                                throw ph_2.a(exception);
                            }
                        }
                        n10 = object instanceof Map;
                    }
                    try {
                        if (string != null) break block36;
                        if (n10 == 0) break block37;
                    }
                    catch (Exception exception) {
                        throw ph_2.a(exception);
                    }
                    n10 = 0;
                }
                int n11 = n10;
                for (Object v2 : ((Map)object).values()) {
                    try {
                        if (v2 != null) {
                            ++n11;
                        }
                    }
                    catch (Exception exception) {
                        throw ph_2.a(exception);
                    }
                    if (string == null) continue;
                }
                return n11;
            }
            nj_23 = this.e(object.getClass());
            nj_22 = nj_23;
            if (string != null) return nj_22.J(object);
            try {
                if (nj_22 != null) break block38;
                return -1;
                catch (Exception exception) {
                    throw ph_2.a(exception);
                }
            }
            catch (Exception exception) {
                throw ph_2.a(exception);
            }
        }
        try {
            nj_22 = nj_23;
            return nj_22.J(object);
        }
        catch (Exception exception) {
            throw new hf_0(ph_2.a(2748, -6552) + this.V, exception);
        }
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    Set K(Object object) {
        nj_2 nj_22;
        nj_2 nj_23;
        block31: {
            boolean bl;
            String string;
            block30: {
                block29: {
                    block27: {
                        block28: {
                            Object object2;
                            block25: {
                                block26: {
                                    string = hi_0.C();
                                    object2 = object;
                                    if (string != null) break block25;
                                    try {
                                        if (object2 != null) break block26;
                                        return null;
                                        catch (Exception exception) {
                                            throw ph_2.a(exception);
                                        }
                                    }
                                    catch (Exception exception) {
                                        throw ph_2.a(exception);
                                    }
                                }
                                object2 = object;
                            }
                            bl = object2 instanceof Map;
                            if (string != null) break block27;
                            try {
                                if (!bl) break block28;
                                return ((Map)object).keySet();
                                catch (Exception exception) {
                                    throw ph_2.a(exception);
                                }
                            }
                            catch (Exception exception) {
                                throw ph_2.a(exception);
                            }
                        }
                        bl = object instanceof Collection;
                    }
                    if (string != null) break block29;
                    try {
                        block32: {
                            if (bl) return null;
                            break block32;
                            catch (Exception exception) {
                                throw ph_2.a(exception);
                            }
                        }
                        bl = object instanceof Object[];
                    }
                    catch (Exception exception) {
                        throw ph_2.a(exception);
                    }
                }
                if (string != null) break block30;
                try {
                    block33: {
                        if (bl) return null;
                        break block33;
                        catch (Exception exception) {
                            throw ph_2.a(exception);
                        }
                    }
                    bl = object.getClass().isArray();
                }
                catch (Exception exception) {
                    throw ph_2.a(exception);
                }
            }
            try {
                if (bl) {
                    return null;
                }
            }
            catch (Exception exception) {
                throw ph_2.a(exception);
            }
            nj_23 = this.e(object.getClass());
            nj_22 = nj_23;
            if (string != null) return nj_22.v(object);
            try {
                if (nj_22 != null) break block31;
                return null;
                catch (Exception exception) {
                    throw ph_2.a(exception);
                }
            }
            catch (Exception exception) {
                throw ph_2.a(exception);
            }
        }
        try {
            nj_22 = nj_23;
            return nj_22.v(object);
        }
        catch (Exception exception) {
            throw new hf_0(ph_2.a(2749, -13255) + this.V, exception);
        }
    }

    @Override
    public String V() {
        return ok_0.x(this.V);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object t(Object object, String[] stringArray) {
        oc_0 oc_02;
        String[] stringArray2;
        String string;
        oc_0 oc_03;
        block10: {
            block11: {
                block9: {
                    oc_03 = new oc_0();
                    string = hi_0.C();
                    try {
                        stringArray2 = stringArray;
                        if (string != null) break block9;
                        if (stringArray2 == null) return oc_03;
                    }
                    catch (hf_0 hf_02) {
                        throw ph_2.a(hf_02);
                    }
                    stringArray2 = stringArray;
                }
                try {
                    try {
                        if (string != null) break block10;
                        if (stringArray2.length != 0) break block11;
                        return oc_03;
                    }
                    catch (hf_0 hf_03) {
                        throw ph_2.a(hf_03);
                    }
                }
                catch (hf_0 hf_04) {
                    throw ph_2.a(hf_04);
                }
            }
            stringArray2 = stringArray;
        }
        for (String string2 : stringArray2) {
            ph_2 ph_22 = ph_2.B(string2);
            ph_22.x();
            Object object2 = ph_22.S(object);
            try {
                oc_02 = oc_03;
                if (string != null) return oc_02;
                oc_02.add(object2);
                if (string == null) continue;
                break;
            }
            catch (hf_0 hf_05) {
                throw ph_2.a(hf_05);
            }
        }
        oc_02 = oc_03;
        return oc_02;
    }

    public static Object b(Object object, String[] stringArray) {
        String string;
        block17: {
            Object object2;
            block15: {
                string = hi_0.C();
                try {
                    block16: {
                        try {
                            try {
                                try {
                                    object2 = stringArray;
                                    if (string != null) break block15;
                                    if (object2 == null) break block16;
                                }
                                catch (hf_0 hf_02) {
                                    throw ph_2.a(hf_02);
                                }
                                object2 = stringArray;
                                if (string != null) break block15;
                            }
                            catch (hf_0 hf_03) {
                                throw ph_2.a(hf_03);
                            }
                            if (((String[])object2).length != 0) break block17;
                        }
                        catch (hf_0 hf_04) {
                            throw ph_2.a(hf_04);
                        }
                    }
                    object2 = object;
                }
                catch (hf_0 hf_05) {
                    throw ph_2.a(hf_05);
                }
            }
            return object2;
        }
        O0 o0 = new O0(true);
        String[] stringArray2 = stringArray;
        int n10 = stringArray2.length;
        int n11 = 0;
        while (n11 < n10) {
            block18: {
                block19: {
                    String string2 = stringArray2[n11];
                    ph_2 ph_22 = ph_2.B(string2);
                    ph_22.x();
                    a0 a02 = ph_22.K[ph_22.K.length - 1];
                    try {
                        if (string != null) break block18;
                        if (!(a02 instanceof W3)) break block19;
                    }
                    catch (hf_0 hf_06) {
                        throw ph_2.a(hf_06);
                    }
                    Object object3 = ph_22.S(object);
                    try {
                        try {
                            if (object3 == null && string == null) break block19;
                        }
                        catch (hf_0 hf_07) {
                            throw ph_2.a(hf_07);
                        }
                        ph_22.G(o0, object3);
                    }
                    catch (hf_0 hf_08) {
                        throw ph_2.a(hf_08);
                    }
                }
                ++n11;
            }
            if (string == null) continue;
        }
        return o0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block37: {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                var21 = new String[17];
                                var19_1 = 0;
                                var18_2 = "1.\u0006\u00009\u00d3\u00172z(\u00bco\u00eb\u001a[\u00d6\u00a1\u00f4~\u0081R\f\u00c7^!\u00f8\u0011\u00dfB\u009d\u00f2\u0098?\u00a7\u00d6\u00dc8\u0003k2rk\u0095@\u00f28\u00c8\u00d0%K\u00a3\u00d0\u0006S\u0017(\u00f8\u008d\u0013\u00cdey\u00ce\"L%~\u00d5\u00ea\u00e5\u00c9\u00fb\u00b8A\u001b\u00e2\u00d3S\u00111\u008e\u00e6\u00b3\u00c9\u00ef@\u00b1_\u00f2\u000b\u00ee#\u00a9\u00abq\u0019\u0014\u00f5\u00f5)\u0087\u00bd\n\u00a5\u0081A\u00d1n\tX\u00e0\u00ca\b\u008a\u00e4\u0014!\u0018\u00f9\u00c4\u0083\u0016\u00ff(b#\u00d9\u00ae\u0011\u0095\u00ecdOM\u0000Uoh\u0092j5\u00ff\u0015\u00a8\u00a25\u0091_\u00e1\u00dbt\u00e3\u00e6\u009cl\u00d1\u00f9\u00f9a\u008e\u00df\u00d0\u00cf\u00fa\f0\u0013\u00de\u0005\u009c\u00c6/W\u00f19\u00dbb\"\u007f\u001e\u00cf\u0006]\u0002x'hV\u00bd\u0084\u00c7\u00c7X\u00f1\u00b4*\u0005\u0015\u0094h\u0081\u00aa1\u009f\u00b9\u009f\u00f8\u00e8>\u0012xT!\u00c3\u00ac\u00b8\u00f5q\u0004\u0005\u00e1\u0014\r\u00aaC\u00cd\u0004\u00eb\u009fP('E\u00d4>M\u00fb\u00f8x\u00a6}\u009dx\u00f1\u0015\u00b6\u001aP\u00c9\u00caY?\u0091\u00ccS-[\u008d\u0089;Jc\u00e2\u0091\u00be\u00de\u00caI|Oru\u00e9\u000b5\u00b6\u0014!\u00f3\u0099\u00a2\u00f2\u00b8\u008b\"\u0018\u00ad\u00b5\u0095sK\u00bdY\u00ff\u00b3\u0091\u0085X\u00cc\u00fc\u00bf\n=o\u00ed\u00f2 b\u0089\u0093\u000bE\u008e\u001a&2y\u009a\u00ee\u00bf\b\u00c2\u001a{\u00ee\u00af\u00bd\u0093\rY\u00c0\u009f)\u00db\u00c7\u00f1\u0083:\u00db\u00ba\u0099\u00bb.\u00e5\u00e0\u00da\u00e1\u00c7\u009b";
                                var20_3 = "1.\u0006\u00009\u00d3\u00172z(\u00bco\u00eb\u001a[\u00d6\u00a1\u00f4~\u0081R\f\u00c7^!\u00f8\u0011\u00dfB\u009d\u00f2\u0098?\u00a7\u00d6\u00dc8\u0003k2rk\u0095@\u00f28\u00c8\u00d0%K\u00a3\u00d0\u0006S\u0017(\u00f8\u008d\u0013\u00cdey\u00ce\"L%~\u00d5\u00ea\u00e5\u00c9\u00fb\u00b8A\u001b\u00e2\u00d3S\u00111\u008e\u00e6\u00b3\u00c9\u00ef@\u00b1_\u00f2\u000b\u00ee#\u00a9\u00abq\u0019\u0014\u00f5\u00f5)\u0087\u00bd\n\u00a5\u0081A\u00d1n\tX\u00e0\u00ca\b\u008a\u00e4\u0014!\u0018\u00f9\u00c4\u0083\u0016\u00ff(b#\u00d9\u00ae\u0011\u0095\u00ecdOM\u0000Uoh\u0092j5\u00ff\u0015\u00a8\u00a25\u0091_\u00e1\u00dbt\u00e3\u00e6\u009cl\u00d1\u00f9\u00f9a\u008e\u00df\u00d0\u00cf\u00fa\f0\u0013\u00de\u0005\u009c\u00c6/W\u00f19\u00dbb\"\u007f\u001e\u00cf\u0006]\u0002x'hV\u00bd\u0084\u00c7\u00c7X\u00f1\u00b4*\u0005\u0015\u0094h\u0081\u00aa1\u009f\u00b9\u009f\u00f8\u00e8>\u0012xT!\u00c3\u00ac\u00b8\u00f5q\u0004\u0005\u00e1\u0014\r\u00aaC\u00cd\u0004\u00eb\u009fP('E\u00d4>M\u00fb\u00f8x\u00a6}\u009dx\u00f1\u0015\u00b6\u001aP\u00c9\u00caY?\u0091\u00ccS-[\u008d\u0089;Jc\u00e2\u0091\u00be\u00de\u00caI|Oru\u00e9\u000b5\u00b6\u0014!\u00f3\u0099\u00a2\u00f2\u00b8\u008b\"\u0018\u00ad\u00b5\u0095sK\u00bdY\u00ff\u00b3\u0091\u0085X\u00cc\u00fc\u00bf\n=o\u00ed\u00f2 b\u0089\u0093\u000bE\u008e\u001a&2y\u009a\u00ee\u00bf\b\u00c2\u001a{\u00ee\u00af\u00bd\u0093\rY\u00c0\u009f)\u00db\u00c7\u00f1\u0083:\u00db\u00ba\u0099\u00bb.\u00e5\u00e0\u00da\u00e1\u00c7\u009b".length();
                                var17_4 = 24;
                                var16_5 = -1;
lbl7:
                                // 2 sources

                                while (true) {
                                    v0 = 126;
                                    v1 = ++var16_5;
                                    v2 = var18_2.substring(v1, v1 + var17_4);
                                    v3 = -1;
                                    break block33;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    var18_2 = "\u00f6s\b]\u000e\u008e\u0007o\u008es\u00c7(L\u0087\u00bcX\u00d0\u000e\u00ed\u0003\u00ab\u0014)3D\u00a9\u00e698\u0011\u000450ce[\u009b\u0089V\"y\u000f";
                                    var20_3 = "\u00f6s\b]\u000e\u008e\u0007o\u008es\u00c7(L\u0087\u00bcX\u00d0\u000e\u00ed\u0003\u00ab\u0014)3D\u00a9\u00e698\u0011\u000450ce[\u009b\u0089V\"y\u000f".length();
                                    var17_4 = 21;
                                    var16_5 = -1;
lbl22:
                                    // 2 sources

                                    while (true) {
                                        v0 = 35;
                                        v5 = ++var16_5;
                                        v2 = var18_2.substring(v5, v5 + var17_4);
                                        v3 = 0;
                                        break block33;
                                        break;
                                    }
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var21[var19_1++] = v4.intern();
                                    if ((var16_5 += var17_4) < var20_3) {
                                        var17_4 = var18_2.charAt(var16_5);
                                        ** continue;
                                    }
                                    break block34;
                                    break;
                                }
                            }
                            v6 = v2.toCharArray();
                            v7 = v6.length;
                            var22_6 = 0;
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) ** GOTO lbl85
                            do {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var22_6;
                                while (true) {
                                    switch (var22_6 % 7) {
                                        case 0: {
                                            v15 = 125;
                                            break;
                                        }
                                        case 1: {
                                            v15 = 83;
                                            break;
                                        }
                                        case 2: {
                                            v15 = 118;
                                            break;
                                        }
                                        case 3: {
                                            v15 = 109;
                                            break;
                                        }
                                        case 4: {
                                            v15 = 116;
                                            break;
                                        }
                                        case 5: {
                                            v15 = 13;
                                            break;
                                        }
                                        default: {
                                            v15 = 5;
                                        }
                                    }
                                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                    ++var22_6;
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
                            } while (v10 > var22_6);
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
                        ph_2.a = var21;
                        ph_2.b = new String[17];
                        var8_7 = 2610527661910028729L;
                        var14_8 = new long[6];
                        var11_9 = 0;
                        var12_10 = "zu\u00bf\u00a1\u00c3\u00faD\u00e5\u009e\u0012\u008dF\u0099\u00baG\u0088\u0014\u0000~\u00db\u00b9[\u00a6\u00cfy\u0006P\u0001\u00e2Q\u00e0\u00e3";
                        var13_11 = "zu\u00bf\u00a1\u00c3\u00faD\u00e5\u009e\u0012\u008dF\u0099\u00baG\u0088\u0014\u0000~\u00db\u00b9[\u00a6\u00cfy\u0006P\u0001\u00e2Q\u00e0\u00e3".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v17 = var14_8;
                            v18 = var11_9++;
                            v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v20 = -1;
                            break block35;
                            break;
                        }
lbl112:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u0098\u00d5%E\u00d7\u0000G\u00e34\u009f\u00c2*v\u0004\u00ef\u00a4";
                            var13_11 = "\u0098\u00d5%E\u00d7\u0000G\u00e34\u009f\u00c2*v\u0004\u00ef\u00a4".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v17 = var14_8;
                                v18 = var11_9++;
                                v19 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v20 = 0;
                                break block35;
                                break;
                            }
                            break;
                        }
lbl125:
                        // 1 sources

                        while (true) {
                            v17[v18] = v21;
                            if (var10_12 < var13_11) ** continue;
                            break block36;
                            break;
                        }
                    }
                    v21 = v19 ^ var8_7;
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
                ph_2.c = var14_8;
                ph_2.d = new Integer[6];
                var0_14 = 4180382787613909172L;
                var6_15 = new long[20];
                var3_16 = 0;
                var4_17 = "D\\\u0091\u00de.m\u00d7\u00e3\u009bK\u00d2\u00b0\u00ed\u0097\u0091\u009c\u00c4\u00dc\u007f_\u0099\u001b\u00fc\bJ\u00015\u0083\u00dcF\u0081`\u0088\u00fe;gjW\u00eb\u00ca\u00e9\u008el3_\u0097\u00b1\u00a8s\u00cf;\t\u0098\u0019$\u00e2\u0003\u007f\u0096\u00ebV\u0091{\u00bb\u00b1\u0017,#\u0011\u0007\u00cc\u00ab\u00b2\"!\u0081GR\u0091\r={\u00c0\u0013\u00b1\u0081W\u0081G.\u008a\u0003J?\u0085\u00d3\u00c9z\u00975\u0096q\u00ac\u00d4f\u001c\u00cb\u0089H\u00a4\u00c4\u00d8\u00e4\u00ce\u0088\u0098\u00ba\u00a9\u00b6\u0001x\u00ffO\u00a9(\u00eeyd\u00de\u00a2J\u001dH\u00da\u0006\u00a7\u00e4\u007fg\u0080\u00bc`\u0081\u0096";
                var5_18 = "D\\\u0091\u00de.m\u00d7\u00e3\u009bK\u00d2\u00b0\u00ed\u0097\u0091\u009c\u00c4\u00dc\u007f_\u0099\u001b\u00fc\bJ\u00015\u0083\u00dcF\u0081`\u0088\u00fe;gjW\u00eb\u00ca\u00e9\u008el3_\u0097\u00b1\u00a8s\u00cf;\t\u0098\u0019$\u00e2\u0003\u007f\u0096\u00ebV\u0091{\u00bb\u00b1\u0017,#\u0011\u0007\u00cc\u00ab\u00b2\"!\u0081GR\u0091\r={\u00c0\u0013\u00b1\u0081W\u0081G.\u008a\u0003J?\u0085\u00d3\u00c9z\u00975\u0096q\u00ac\u00d4f\u001c\u00cb\u0089H\u00a4\u00c4\u00d8\u00e4\u00ce\u0088\u0098\u00ba\u00a9\u00b6\u0001x\u00ffO\u00a9(\u00eeyd\u00de\u00a2J\u001dH\u00da\u0006\u00a7\u00e4\u007fg\u0080\u00bc`\u0081\u0096".length();
                var2_19 = 0;
                while (true) {
                    var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                    v22 = var6_15;
                    v23 = var3_16++;
                    v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                    v25 = -1;
                    break block37;
                    break;
                }
lbl153:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    var4_17 = "\u00be\u00b9V\u00ce\u0002\u008a\u00e1\u0016\u00a3tF\u00fa\u00a3\u0017\u000eJ";
                    var5_18 = "\u00be\u00b9V\u00ce\u0002\u008a\u00e1\u0016\u00a3tF\u00fa\u00a3\u0017\u000eJ".length();
                    var2_19 = 0;
                    while (true) {
                        var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
                        v22 = var6_15;
                        v23 = var3_16++;
                        v24 = ((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L;
                        v25 = 0;
                        break block37;
                        break;
                    }
                    break;
                }
lbl166:
                // 1 sources

                while (true) {
                    v22[v23] = v26;
                    if (var2_19 < var5_18) ** continue;
                    break block38;
                    break;
                }
            }
            v26 = v24 ^ var0_14;
            switch (v25) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl177:
                // 1 sources

                ** continue;
            }
        }
        ph_2.e = var6_15;
        ph_2.f = new Long[20];
        ph_2.s = new ConcurrentHashMap<K, V>(ph_2.a(10897, 1903953822846301660L), 0.75f, 1);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xABF) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 205;
                    break;
                }
                case 1: {
                    n14 = 80;
                    break;
                }
                case 2: {
                    n14 = 47;
                    break;
                }
                case 3: {
                    n14 = 177;
                    break;
                }
                case 4: {
                    n14 = 194;
                    break;
                }
                case 5: {
                    n14 = 38;
                    break;
                }
                case 6: {
                    n14 = 250;
                    break;
                }
                case 7: {
                    n14 = 207;
                    break;
                }
                case 8: {
                    n14 = 46;
                    break;
                }
                case 9: {
                    n14 = 239;
                    break;
                }
                case 10: {
                    n14 = 148;
                    break;
                }
                case 11: {
                    n14 = 75;
                    break;
                }
                case 12: {
                    n14 = 126;
                    break;
                }
                case 13: {
                    n14 = 210;
                    break;
                }
                case 14: {
                    n14 = 98;
                    break;
                }
                case 15: {
                    n14 = 4;
                    break;
                }
                case 16: {
                    n14 = 107;
                    break;
                }
                case 17: {
                    n14 = 99;
                    break;
                }
                case 18: {
                    n14 = 234;
                    break;
                }
                case 19: {
                    n14 = 67;
                    break;
                }
                case 20: {
                    n14 = 145;
                    break;
                }
                case 21: {
                    n14 = 95;
                    break;
                }
                case 22: {
                    n14 = 235;
                    break;
                }
                case 23: {
                    n14 = 109;
                    break;
                }
                case 24: {
                    n14 = 31;
                    break;
                }
                case 25: {
                    n14 = 37;
                    break;
                }
                case 26: {
                    n14 = 246;
                    break;
                }
                case 27: {
                    n14 = 146;
                    break;
                }
                case 28: {
                    n14 = 181;
                    break;
                }
                case 29: {
                    n14 = 1;
                    break;
                }
                case 30: {
                    n14 = 253;
                    break;
                }
                case 31: {
                    n14 = 92;
                    break;
                }
                case 32: {
                    n14 = 189;
                    break;
                }
                case 33: {
                    n14 = 196;
                    break;
                }
                case 34: {
                    n14 = 43;
                    break;
                }
                case 35: {
                    n14 = 85;
                    break;
                }
                case 36: {
                    n14 = 76;
                    break;
                }
                case 37: {
                    n14 = 26;
                    break;
                }
                case 38: {
                    n14 = 151;
                    break;
                }
                case 39: {
                    n14 = 121;
                    break;
                }
                case 40: {
                    n14 = 117;
                    break;
                }
                case 41: {
                    n14 = 101;
                    break;
                }
                case 42: {
                    n14 = 35;
                    break;
                }
                case 43: {
                    n14 = 212;
                    break;
                }
                case 44: {
                    n14 = 74;
                    break;
                }
                case 45: {
                    n14 = 56;
                    break;
                }
                case 46: {
                    n14 = 50;
                    break;
                }
                case 47: {
                    n14 = 10;
                    break;
                }
                case 48: {
                    n14 = 57;
                    break;
                }
                case 49: {
                    n14 = 23;
                    break;
                }
                case 50: {
                    n14 = 17;
                    break;
                }
                case 51: {
                    n14 = 222;
                    break;
                }
                case 52: {
                    n14 = 167;
                    break;
                }
                case 53: {
                    n14 = 150;
                    break;
                }
                case 54: {
                    n14 = 165;
                    break;
                }
                case 55: {
                    n14 = 200;
                    break;
                }
                case 56: {
                    n14 = 159;
                    break;
                }
                case 57: {
                    n14 = 137;
                    break;
                }
                case 58: {
                    n14 = 11;
                    break;
                }
                case 59: {
                    n14 = 252;
                    break;
                }
                case 60: {
                    n14 = 166;
                    break;
                }
                case 61: {
                    n14 = 223;
                    break;
                }
                case 62: {
                    n14 = 201;
                    break;
                }
                case 63: {
                    n14 = 247;
                    break;
                }
                case 64: {
                    n14 = 131;
                    break;
                }
                case 65: {
                    n14 = 25;
                    break;
                }
                case 66: {
                    n14 = 244;
                    break;
                }
                case 67: {
                    n14 = 58;
                    break;
                }
                case 68: {
                    n14 = 168;
                    break;
                }
                case 69: {
                    n14 = 48;
                    break;
                }
                case 70: {
                    n14 = 5;
                    break;
                }
                case 71: {
                    n14 = 185;
                    break;
                }
                case 72: {
                    n14 = 202;
                    break;
                }
                case 73: {
                    n14 = 154;
                    break;
                }
                case 74: {
                    n14 = 221;
                    break;
                }
                case 75: {
                    n14 = 174;
                    break;
                }
                case 76: {
                    n14 = 172;
                    break;
                }
                case 77: {
                    n14 = 128;
                    break;
                }
                case 78: {
                    n14 = 52;
                    break;
                }
                case 79: {
                    n14 = 63;
                    break;
                }
                case 80: {
                    n14 = 171;
                    break;
                }
                case 81: {
                    n14 = 169;
                    break;
                }
                case 82: {
                    n14 = 83;
                    break;
                }
                case 83: {
                    n14 = 54;
                    break;
                }
                case 84: {
                    n14 = 44;
                    break;
                }
                case 85: {
                    n14 = 62;
                    break;
                }
                case 86: {
                    n14 = 149;
                    break;
                }
                case 87: {
                    n14 = 173;
                    break;
                }
                case 88: {
                    n14 = 218;
                    break;
                }
                case 89: {
                    n14 = 19;
                    break;
                }
                case 90: {
                    n14 = 93;
                    break;
                }
                case 91: {
                    n14 = 197;
                    break;
                }
                case 92: {
                    n14 = 255;
                    break;
                }
                case 93: {
                    n14 = 216;
                    break;
                }
                case 94: {
                    n14 = 118;
                    break;
                }
                case 95: {
                    n14 = 227;
                    break;
                }
                case 96: {
                    n14 = 9;
                    break;
                }
                case 97: {
                    n14 = 232;
                    break;
                }
                case 98: {
                    n14 = 113;
                    break;
                }
                case 99: {
                    n14 = 132;
                    break;
                }
                case 100: {
                    n14 = 28;
                    break;
                }
                case 101: {
                    n14 = 213;
                    break;
                }
                case 102: {
                    n14 = 195;
                    break;
                }
                case 103: {
                    n14 = 21;
                    break;
                }
                case 104: {
                    n14 = 49;
                    break;
                }
                case 105: {
                    n14 = 115;
                    break;
                }
                case 106: {
                    n14 = 243;
                    break;
                }
                case 107: {
                    n14 = 106;
                    break;
                }
                case 108: {
                    n14 = 226;
                    break;
                }
                case 109: {
                    n14 = 64;
                    break;
                }
                case 110: {
                    n14 = 79;
                    break;
                }
                case 111: {
                    n14 = 190;
                    break;
                }
                case 112: {
                    n14 = 32;
                    break;
                }
                case 113: {
                    n14 = 236;
                    break;
                }
                case 114: {
                    n14 = 2;
                    break;
                }
                case 115: {
                    n14 = 45;
                    break;
                }
                case 116: {
                    n14 = 41;
                    break;
                }
                case 117: {
                    n14 = 24;
                    break;
                }
                case 118: {
                    n14 = 104;
                    break;
                }
                case 119: {
                    n14 = 34;
                    break;
                }
                case 120: {
                    n14 = 178;
                    break;
                }
                case 121: {
                    n14 = 156;
                    break;
                }
                case 122: {
                    n14 = 158;
                    break;
                }
                case 123: {
                    n14 = 130;
                    break;
                }
                case 124: {
                    n14 = 124;
                    break;
                }
                case 125: {
                    n14 = 72;
                    break;
                }
                case 126: {
                    n14 = 90;
                    break;
                }
                case 127: {
                    n14 = 78;
                    break;
                }
                case 128: {
                    n14 = 91;
                    break;
                }
                case 129: {
                    n14 = 161;
                    break;
                }
                case 130: {
                    n14 = 191;
                    break;
                }
                case 131: {
                    n14 = 182;
                    break;
                }
                case 132: {
                    n14 = 123;
                    break;
                }
                case 133: {
                    n14 = 61;
                    break;
                }
                case 134: {
                    n14 = 112;
                    break;
                }
                case 135: {
                    n14 = 122;
                    break;
                }
                case 136: {
                    n14 = 77;
                    break;
                }
                case 137: {
                    n14 = 84;
                    break;
                }
                case 138: {
                    n14 = 73;
                    break;
                }
                case 139: {
                    n14 = 160;
                    break;
                }
                case 140: {
                    n14 = 65;
                    break;
                }
                case 141: {
                    n14 = 15;
                    break;
                }
                case 142: {
                    n14 = 30;
                    break;
                }
                case 143: {
                    n14 = 86;
                    break;
                }
                case 144: {
                    n14 = 66;
                    break;
                }
                case 145: {
                    n14 = 36;
                    break;
                }
                case 146: {
                    n14 = 211;
                    break;
                }
                case 147: {
                    n14 = 81;
                    break;
                }
                case 148: {
                    n14 = 245;
                    break;
                }
                case 149: {
                    n14 = 241;
                    break;
                }
                case 150: {
                    n14 = 179;
                    break;
                }
                case 151: {
                    n14 = 133;
                    break;
                }
                case 152: {
                    n14 = 40;
                    break;
                }
                case 153: {
                    n14 = 144;
                    break;
                }
                case 154: {
                    n14 = 238;
                    break;
                }
                case 155: {
                    n14 = 114;
                    break;
                }
                case 156: {
                    n14 = 198;
                    break;
                }
                case 157: {
                    n14 = 224;
                    break;
                }
                case 158: {
                    n14 = 7;
                    break;
                }
                case 159: {
                    n14 = 20;
                    break;
                }
                case 160: {
                    n14 = 170;
                    break;
                }
                case 161: {
                    n14 = 184;
                    break;
                }
                case 162: {
                    n14 = 8;
                    break;
                }
                case 163: {
                    n14 = 100;
                    break;
                }
                case 164: {
                    n14 = 164;
                    break;
                }
                case 165: {
                    n14 = 139;
                    break;
                }
                case 166: {
                    n14 = 59;
                    break;
                }
                case 167: {
                    n14 = 14;
                    break;
                }
                case 168: {
                    n14 = 88;
                    break;
                }
                case 169: {
                    n14 = 55;
                    break;
                }
                case 170: {
                    n14 = 208;
                    break;
                }
                case 171: {
                    n14 = 138;
                    break;
                }
                case 172: {
                    n14 = 141;
                    break;
                }
                case 173: {
                    n14 = 162;
                    break;
                }
                case 174: {
                    n14 = 215;
                    break;
                }
                case 175: {
                    n14 = 204;
                    break;
                }
                case 176: {
                    n14 = 51;
                    break;
                }
                case 177: {
                    n14 = 225;
                    break;
                }
                case 178: {
                    n14 = 233;
                    break;
                }
                case 179: {
                    n14 = 135;
                    break;
                }
                case 180: {
                    n14 = 18;
                    break;
                }
                case 181: {
                    n14 = 87;
                    break;
                }
                case 182: {
                    n14 = 102;
                    break;
                }
                case 183: {
                    n14 = 96;
                    break;
                }
                case 184: {
                    n14 = 125;
                    break;
                }
                case 185: {
                    n14 = 103;
                    break;
                }
                case 186: {
                    n14 = 183;
                    break;
                }
                case 187: {
                    n14 = 140;
                    break;
                }
                case 188: {
                    n14 = 127;
                    break;
                }
                case 189: {
                    n14 = 209;
                    break;
                }
                case 190: {
                    n14 = 143;
                    break;
                }
                case 191: {
                    n14 = 248;
                    break;
                }
                case 192: {
                    n14 = 105;
                    break;
                }
                case 193: {
                    n14 = 89;
                    break;
                }
                case 194: {
                    n14 = 94;
                    break;
                }
                case 195: {
                    n14 = 163;
                    break;
                }
                case 196: {
                    n14 = 60;
                    break;
                }
                case 197: {
                    n14 = 203;
                    break;
                }
                case 198: {
                    n14 = 42;
                    break;
                }
                case 199: {
                    n14 = 254;
                    break;
                }
                case 200: {
                    n14 = 110;
                    break;
                }
                case 201: {
                    n14 = 206;
                    break;
                }
                case 202: {
                    n14 = 12;
                    break;
                }
                case 203: {
                    n14 = 119;
                    break;
                }
                case 204: {
                    n14 = 108;
                    break;
                }
                case 205: {
                    n14 = 120;
                    break;
                }
                case 206: {
                    n14 = 142;
                    break;
                }
                case 207: {
                    n14 = 186;
                    break;
                }
                case 208: {
                    n14 = 228;
                    break;
                }
                case 209: {
                    n14 = 237;
                    break;
                }
                case 210: {
                    n14 = 187;
                    break;
                }
                case 211: {
                    n14 = 53;
                    break;
                }
                case 212: {
                    n14 = 97;
                    break;
                }
                case 213: {
                    n14 = 199;
                    break;
                }
                case 214: {
                    n14 = 16;
                    break;
                }
                case 215: {
                    n14 = 29;
                    break;
                }
                case 216: {
                    n14 = 70;
                    break;
                }
                case 217: {
                    n14 = 214;
                    break;
                }
                case 218: {
                    n14 = 68;
                    break;
                }
                case 219: {
                    n14 = 13;
                    break;
                }
                case 220: {
                    n14 = 33;
                    break;
                }
                case 221: {
                    n14 = 71;
                    break;
                }
                case 222: {
                    n14 = 231;
                    break;
                }
                case 223: {
                    n14 = 6;
                    break;
                }
                case 224: {
                    n14 = 230;
                    break;
                }
                case 225: {
                    n14 = 176;
                    break;
                }
                case 226: {
                    n14 = 229;
                    break;
                }
                case 227: {
                    n14 = 22;
                    break;
                }
                case 228: {
                    n14 = 147;
                    break;
                }
                case 229: {
                    n14 = 155;
                    break;
                }
                case 230: {
                    n14 = 240;
                    break;
                }
                case 231: {
                    n14 = 69;
                    break;
                }
                case 232: {
                    n14 = 192;
                    break;
                }
                case 233: {
                    n14 = 111;
                    break;
                }
                case 234: {
                    n14 = 116;
                    break;
                }
                case 235: {
                    n14 = 251;
                    break;
                }
                case 236: {
                    n14 = 0;
                    break;
                }
                case 237: {
                    n14 = 3;
                    break;
                }
                case 238: {
                    n14 = 129;
                    break;
                }
                case 239: {
                    n14 = 134;
                    break;
                }
                case 240: {
                    n14 = 153;
                    break;
                }
                case 241: {
                    n14 = 220;
                    break;
                }
                case 242: {
                    n14 = 219;
                    break;
                }
                case 243: {
                    n14 = 136;
                    break;
                }
                case 244: {
                    n14 = 180;
                    break;
                }
                case 245: {
                    n14 = 249;
                    break;
                }
                case 246: {
                    n14 = 39;
                    break;
                }
                case 247: {
                    n14 = 242;
                    break;
                }
                case 248: {
                    n14 = 27;
                    break;
                }
                case 249: {
                    n14 = 188;
                    break;
                }
                case 250: {
                    n14 = 82;
                    break;
                }
                case 251: {
                    n14 = 217;
                    break;
                }
                case 252: {
                    n14 = 157;
                    break;
                }
                case 253: {
                    n14 = 175;
                    break;
                }
                case 254: {
                    n14 = 152;
                    break;
                }
                default: {
                    n14 = 193;
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
            ph_2.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1F4D;
        if (d[n11] == null) {
            ph_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x7B0E) & Short.MAX_VALUE;
        if (f[n11] == null) {
            ph_2.f[n11] = e[n11] ^ l2;
        }
        return f[n11];
    }
}

