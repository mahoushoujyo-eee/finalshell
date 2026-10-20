/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.F.c;
import org.b_0;
import org.v.RG;
import org.v._J;
import org.v._S;
import org.v._f_0;
import org.v.f0;
import org.v.h4;
import org.v.hP;
import org.v.he_0;
import org.v.hr_0;
import org.v.hu_0;
import org.v.hv_0;
import org.v.i_0;
import org.v.q_2;
import org.v.u_1;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from org.v.hd
 */
public abstract class hd_0
implements _f_0 {
    private static final Logger b;
    public static final Object M;
    public static final hd_0 I;
    public static final hd_0 s;
    public static final hd_0 E;
    public static final hd_0 O;
    public static final hd_0 D;
    public static final hd_0 l;
    public static final hd_0 G;
    public static final hd_0 S;
    public static final hd_0 e;
    public static final hd_0 t;
    @c
    private _J[] x;
    @c
    private hv_0[] X;
    @c
    private hP[] K;
    @c
    private Map p;
    @c
    private hP[] f;
    private static final hP[] H;
    @c
    private Map R;
    @c
    private hd_0[] o;
    private boolean z;
    @c
    private hd_0 h;
    private boolean Z;
    @c
    private hd_0 V;
    private boolean A;
    @c
    private hd_0 r;
    @c
    private hd_0[] v;
    @c
    private String d;
    private boolean m;
    @c
    private hd_0 g;
    private static final Set y;
    private final Map C = new HashMap();
    private static final hd_0[] Y;
    @c
    private h4[] W;
    public static final h4[] u;
    static final boolean N;
    private static final String[] i;
    private static final String[] w;
    private static final long[] L;
    private static final Integer[] T;

    public final _J[] X() throws b_0 {
        _J[] _JArray;
        block4: {
            block5: {
                String[] stringArray = RG.C();
                try {
                    try {
                        _JArray = this.x;
                        if (stringArray == null) break block4;
                        if (_JArray == null) break block5;
                    }
                    catch (b_0 b_02) {
                        throw hd_0.a(b_02);
                    }
                    return this.x;
                }
                catch (b_0 b_03) {
                    throw hd_0.a(b_03);
                }
            }
            this.x = this.V();
            _JArray = this.x;
        }
        return _JArray;
    }

    protected abstract _J[] V() throws b_0;

    public final hv_0[] e() {
        String[] stringArray = RG.C();
        hv_0[] hv_0Array = this.X;
        if (stringArray != null) {
            if (hv_0Array != null) {
                return this.X;
            }
            this.X = this.C();
            hv_0Array = this.X;
        }
        return hv_0Array;
    }

    protected abstract hv_0[] C();

    public final hP[] j() {
        String[] stringArray = RG.C();
        hP[] hPArray = this.K;
        if (stringArray != null) {
            if (hPArray != null) {
                return this.K;
            }
            this.K = this.H();
            hPArray = this.K;
        }
        return hPArray;
    }

    protected abstract hP[] H();

    public final hP[] q(String string) {
        hP[] hPArray;
        HashMap<String, Object> hashMap;
        String[] stringArray;
        block12: {
            HashMap<String, Object> hashMap2;
            block13: {
                hashMap2 = this.p;
                stringArray = RG.C();
                hashMap = hashMap2;
                if (stringArray == null) break block12;
                if (hashMap != null) break block13;
                hPArray = this.j();
                hashMap2 = new HashMap<String, Object>();
                for (hP object : hPArray) {
                    String string2 = object.K();
                    Object v2 = hashMap2.get(string2);
                    hashMap = v2;
                    if (stringArray != null) {
                        ArrayList<hP> arrayList;
                        Object v3;
                        if (stringArray != null) {
                            if (hashMap == null) {
                                hashMap2.put(string2, object);
                                if (stringArray != null) continue;
                            }
                            v3 = v2;
                        }
                        if (stringArray != null) {
                            if (v3 instanceof hP) {
                                arrayList = new ArrayList<hP>();
                                arrayList.add((hP)v2);
                                arrayList.add(object);
                                hashMap2.put(string2, arrayList);
                                if (stringArray != null) continue;
                            }
                            v3 = v2;
                        }
                        arrayList = (ArrayList<hP>)v3;
                        arrayList.add(object);
                        if (stringArray != null) continue;
                    }
                    break block12;
                }
                for (Map.Entry entry : hashMap2.entrySet()) {
                    block16: {
                        Object v4;
                        block14: {
                            Object v5;
                            block15: {
                                v5 = entry.getValue();
                                hashMap = v5;
                                if (stringArray == null) break block12;
                                if (stringArray == null) break block14;
                                if (!(hashMap instanceof hP)) break block15;
                                entry.setValue(new hP[]{(hP)v5});
                                if (stringArray != null) break block16;
                            }
                            v4 = v5;
                        }
                        List list = (List)v4;
                        entry.setValue(list.toArray(new hP[list.size()]));
                    }
                    if (stringArray != null) continue;
                }
                this.p = hashMap2;
            }
            hashMap = hashMap2.get(string);
        }
        hP[] hPArray2 = hPArray = (hP[])hashMap;
        if (stringArray != null) {
            hPArray2 = hPArray2 == null ? H : hPArray;
        }
        return hPArray2;
    }

    public final hP[] w() throws b_0 {
        block5: {
            hP[] hPArray;
            block4: {
                String[] stringArray = RG.C();
                try {
                    try {
                        hPArray = this.f;
                        if (stringArray == null) break block4;
                        if (hPArray == null) break block5;
                    }
                    catch (b_0 b_02) {
                        throw hd_0.a(b_02);
                    }
                    hPArray = this.f;
                }
                catch (b_0 b_03) {
                    throw hd_0.a(b_03);
                }
            }
            return hPArray;
        }
        ArrayList arrayList = new ArrayList();
        this.g(arrayList);
        this.f = arrayList.toArray(new hP[arrayList.size()]);
        return this.f;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private void g(List var1_1) throws b_0 {
        block19: {
            block20: {
                var3_2 = this.j();
                var4_3 = var3_2;
                var5_4 = ((hP[])var4_3).length;
                var2_7 = RG.C();
                block14: for (var6_6 = 0; var6_6 < var5_4; ++var6_6) {
                    var7_8 = var4_3[var6_6];
                    var8_10 = var7_8.Y();
                    var9_11 = var7_8.K();
                    for (hP var11_13 : var1_1) {
                        block18: {
                            try {
                                try {
                                    try {
                                        v0 = var9_11.equals(var11_13.K());
                                        if (var2_7 == null) continue block14;
                                        if (var2_7 == null) break block18;
                                    }
                                    catch (b_0 v1) {
                                        throw hd_0.a(v1);
                                    }
                                    if (v0) {
                                    }
                                    ** GOTO lbl35
                                }
                                catch (b_0 v2) {
                                    throw hd_0.a(v2);
                                }
                                v3 = var8_10.equals(var11_13.Y());
                            }
                            catch (b_0 v4) {
                                throw hd_0.a(v4);
                            }
                        }
                        try {
                            try {
                                if (v3 && var2_7 != null) continue block14;
                            }
                            catch (b_0 v5) {
                                throw hd_0.a(v5);
                            }
lbl35:
                            // 2 sources

                            if (var2_7 != null) continue;
                            break;
                        }
                        catch (b_0 v6) {
                            throw hd_0.a(v6);
                        }
                    }
                    v0 = var1_1.add(var7_8);
                    if (var2_7 != null) continue;
                }
                var4_3 = this.c();
                try {
                    try {
                        v7 = var4_3;
                        if (var2_7 == null) break block19;
                        if (v7 == null) break block20;
                    }
                    catch (b_0 v8) {
                        throw hd_0.a(v8);
                    }
                    super.g(var1_1);
                }
                catch (b_0 v9) {
                    throw hd_0.a(v9);
                }
            }
            v7 = this;
        }
        for (Object var8_10 : v7.L()) {
            super.g(var1_1);
            if (var2_7 != null) continue;
        }
    }

    public final boolean L(String string, hd_0[] hd_0Array) throws b_0 {
        boolean bl;
        try {
            bl = this.U(string, hd_0Array) != null;
        }
        catch (b_0 b_02) {
            throw hd_0.a(b_02);
        }
        return bl;
    }

    @c
    public final hP U(String string, hd_0[] hd_0Array) throws b_0 {
        hd_0[] hd_0Array2;
        Object object;
        String[] stringArray;
        int n10;
        int n11;
        Object object2;
        hd_0[] hd_0Array3;
        block36: {
            block37: {
                block35: {
                    Object object3;
                    block34: {
                        block30: {
                            hd_0Array3 = null;
                            object2 = this.q(string);
                            n11 = ((hP[])object2).length;
                            n10 = 0;
                            stringArray = RG.C();
                            while (n10 < n11) {
                                block29: {
                                    block31: {
                                        Object object4;
                                        block32: {
                                            object = object2[n10];
                                            try {
                                                block33: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (stringArray == null) break block29;
                                                                            object3 = object;
                                                                            if (stringArray == null) break block30;
                                                                        }
                                                                        catch (b_0 b_02) {
                                                                            throw hd_0.a(b_02);
                                                                        }
                                                                        if (!Arrays.equals(((hu_0)object3).p(), hd_0Array)) break block31;
                                                                    }
                                                                    catch (b_0 b_03) {
                                                                        throw hd_0.a(b_03);
                                                                    }
                                                                    object4 = hd_0Array3;
                                                                    if (stringArray == null) break block32;
                                                                }
                                                                catch (b_0 b_04) {
                                                                    throw hd_0.a(b_04);
                                                                }
                                                                if (object4 == null) break block33;
                                                            }
                                                            catch (b_0 b_05) {
                                                                throw hd_0.a(b_05);
                                                            }
                                                            object4 = hd_0Array3;
                                                            if (stringArray == null) break block32;
                                                        }
                                                        catch (b_0 b_06) {
                                                            throw hd_0.a(b_06);
                                                        }
                                                        if (!((hP)object4).p().I(((hP)object).p())) break block31;
                                                    }
                                                    catch (b_0 b_07) {
                                                        throw hd_0.a(b_07);
                                                    }
                                                }
                                                object4 = object;
                                            }
                                            catch (b_0 b_08) {
                                                throw hd_0.a(b_08);
                                            }
                                        }
                                        hd_0Array3 = object4;
                                    }
                                    ++n10;
                                }
                                if (stringArray != null) continue;
                            }
                            object3 = hd_0Array3;
                        }
                        try {
                            if (stringArray == null) break block34;
                            if (object3 == null) break block35;
                        }
                        catch (b_0 b_09) {
                            throw hd_0.a(b_09);
                        }
                        object3 = hd_0Array3;
                    }
                    return object3;
                }
                hd_0Array3 = this.c();
                try {
                    try {
                        hd_0Array2 = hd_0Array3;
                        if (stringArray == null) break block36;
                        if (hd_0Array2 == null) break block37;
                    }
                    catch (b_0 b_010) {
                        throw hd_0.a(b_010);
                    }
                    hd_0Array2 = hd_0Array3;
                    if (stringArray == null) break block36;
                }
                catch (b_0 b_011) {
                    throw hd_0.a(b_011);
                }
                object2 = hd_0Array2.U(string, hd_0Array);
                try {
                    if (object2 != null) {
                        return object2;
                    }
                }
                catch (b_0 b_012) {
                    throw hd_0.a(b_012);
                }
            }
            hd_0Array2 = this;
        }
        hd_0Array3 = hd_0Array2.L();
        object2 = hd_0Array3;
        n11 = ((Object[])object2).length;
        n10 = 0;
        while (n10 < n11) {
            block38: {
                block39: {
                    object = object2[n10];
                    hP hP2 = ((hd_0)object).U(string, hd_0Array);
                    try {
                        try {
                            if (stringArray == null) break block38;
                            if (hP2 == null) break block39;
                        }
                        catch (b_0 b_013) {
                            throw hd_0.a(b_013);
                        }
                        return hP2;
                    }
                    catch (b_0 b_014) {
                        throw hd_0.a(b_014);
                    }
                }
                ++n10;
            }
            if (stringArray != null) continue;
        }
        return null;
    }

    @c
    public final hv_0 O(hd_0[] hd_0Array) throws b_0 {
        hv_0[] hv_0Array = this.e();
        String[] stringArray = RG.C();
        hv_0[] hv_0Array2 = hv_0Array;
        int n10 = hv_0Array2.length;
        int n11 = 0;
        while (n11 < n10) {
            block5: {
                block6: {
                    hv_0 hv_02 = hv_0Array2[n11];
                    try {
                        try {
                            if (stringArray == null) break block5;
                            if (!Arrays.equals(hv_02.p(), hd_0Array)) break block6;
                        }
                        catch (b_0 b_02) {
                            throw hd_0.a(b_02);
                        }
                        return hv_02;
                    }
                    catch (b_0 b_03) {
                        throw hd_0.a(b_03);
                    }
                }
                ++n11;
            }
            if (stringArray != null) continue;
        }
        return null;
    }

    public final u_1[] y() {
        Collection collection = this.V().values();
        return collection.toArray(new u_1[collection.size()]);
    }

    private Map V() {
        LinkedHashMap<String, u_1> linkedHashMap;
        block4: {
            String[] stringArray = RG.C();
            hd_0 hd_02 = this;
            if (stringArray != null) {
                if (hd_02.R != null) {
                    return this.R;
                }
                hd_02 = this;
            }
            u_1[] u_1Array = hd_02.A();
            LinkedHashMap<String, u_1> linkedHashMap2 = new LinkedHashMap<String, u_1>();
            for (u_1 u_12 : u_1Array) {
                linkedHashMap = linkedHashMap2;
                if (stringArray != null) {
                    linkedHashMap.put(u_12.h(), u_12);
                    if (stringArray != null) continue;
                }
                break block4;
            }
            linkedHashMap = this.R = linkedHashMap2;
        }
        return linkedHashMap;
    }

    @c
    public final u_1 G(String string) {
        return (u_1)this.V().get(string);
    }

    protected void z() {
        this.R = null;
    }

    protected abstract u_1[] A();

    public u_1[] I() {
        return new u_1[0];
    }

    public final hd_0[] p() throws b_0 {
        hd_0[] hd_0Array;
        block4: {
            block5: {
                String[] stringArray = RG.C();
                try {
                    try {
                        hd_0Array = this.o;
                        if (stringArray == null) break block4;
                        if (hd_0Array == null) break block5;
                    }
                    catch (b_0 b_02) {
                        throw hd_0.a(b_02);
                    }
                    return this.o;
                }
                catch (b_0 b_03) {
                    throw hd_0.a(b_03);
                }
            }
            this.o = this.j();
            hd_0Array = this.o;
        }
        return hd_0Array;
    }

    protected abstract hd_0[] j() throws b_0;

    @c
    public final hd_0 L() throws b_0 {
        hd_0 hd_02;
        block4: {
            block5: {
                String[] stringArray = RG.C();
                try {
                    try {
                        hd_02 = this;
                        if (stringArray == null) break block4;
                        if (hd_02.z) break block5;
                    }
                    catch (b_0 b_02) {
                        throw hd_0.a(b_02);
                    }
                    this.h = this.V();
                    this.z = true;
                }
                catch (b_0 b_03) {
                    throw hd_0.a(b_03);
                }
            }
            hd_02 = this.h;
        }
        return hd_02;
    }

    @c
    protected abstract hd_0 V() throws b_0;

    @c
    public final hd_0 i() throws b_0 {
        hd_0 hd_02;
        block4: {
            block5: {
                String[] stringArray = RG.C();
                try {
                    try {
                        hd_02 = this;
                        if (stringArray == null) break block4;
                        if (!hd_02.Z) break block5;
                    }
                    catch (b_0 b_02) {
                        throw hd_0.a(b_02);
                    }
                    return this.V;
                }
                catch (b_0 b_03) {
                    throw hd_0.a(b_03);
                }
            }
            this.Z = true;
            hd_02 = this.V = this.l();
        }
        return hd_02;
    }

    @c
    protected abstract hd_0 l() throws b_0;

    @c
    public final hd_0 c() throws b_0 {
        hd_0 hd_02;
        block14: {
            hd_0 hd_03;
            hd_0 hd_04;
            block16: {
                hd_0 hd_05;
                block15: {
                    hd_0 hd_06;
                    String[] stringArray;
                    block12: {
                        block13: {
                            stringArray = RG.C();
                            try {
                                try {
                                    hd_06 = this;
                                    if (stringArray == null) break block12;
                                    if (!hd_06.A) break block13;
                                }
                                catch (b_0 b_02) {
                                    throw hd_0.a(b_02);
                                }
                                return this.r;
                            }
                            catch (b_0 b_03) {
                                throw hd_0.a(b_03);
                            }
                        }
                        hd_06 = this.g();
                    }
                    hd_05 = hd_06;
                    try {
                        try {
                            try {
                                try {
                                    hd_02 = hd_05;
                                    if (stringArray == null) break block14;
                                    if (hd_02 == null) break block15;
                                }
                                catch (b_0 b_04) {
                                    throw hd_0.a(b_04);
                                }
                                hd_04 = hd_0.R(hd_05);
                                hd_03 = this;
                                if (stringArray == null) break block16;
                            }
                            catch (b_0 b_05) {
                                throw hd_0.a(b_05);
                            }
                            if (!hd_04.m(hd_03)) break block15;
                        }
                        catch (b_0 b_06) {
                            throw hd_0.a(b_06);
                        }
                        throw new b_0(hd_0.a(24618, 16364) + f0.F(this.z()) + "\"", null);
                    }
                    catch (b_0 b_07) {
                        throw hd_0.a(b_07);
                    }
                }
                this.A = true;
                hd_04 = this;
                hd_03 = hd_05;
            }
            hd_02 = hd_04.r = hd_03;
        }
        return hd_02;
    }

    @c
    protected abstract hd_0 g() throws b_0;

    public abstract _S r();

    public abstract boolean M();

    public final hd_0[] L() throws b_0 {
        hd_0[] hd_0Array;
        block14: {
            hd_0 hd_02;
            hd_0[] hd_0Array2;
            String[] stringArray;
            block11: {
                block12: {
                    stringArray = RG.C();
                    try {
                        try {
                            hd_0Array2 = this.v;
                            if (stringArray == null) break block11;
                            if (hd_0Array2 == null) break block12;
                        }
                        catch (b_0 b_02) {
                            throw hd_0.a(b_02);
                        }
                        return this.v;
                    }
                    catch (b_0 b_03) {
                        throw hd_0.a(b_03);
                    }
                }
                hd_0Array2 = this.l();
            }
            hd_0[] hd_0Array3 = hd_0Array = hd_0Array2;
            int n10 = hd_0Array3.length;
            int n11 = 0;
            while (n11 < n10) {
                block13: {
                    block15: {
                        hd_0 hd_03 = hd_0Array3[n11];
                        try {
                            try {
                                try {
                                    if (stringArray == null) break block13;
                                    hd_02 = hd_03;
                                    if (stringArray == null) break block14;
                                }
                                catch (b_0 b_04) {
                                    throw hd_0.a(b_04);
                                }
                                if (!hd_02.G(this)) break block15;
                            }
                            catch (b_0 b_05) {
                                throw hd_0.a(b_05);
                            }
                            throw new b_0(hd_0.a(24629, 22644) + f0.F(this.z()) + "\"", null);
                        }
                        catch (b_0 b_06) {
                            throw hd_0.a(b_06);
                        }
                    }
                    ++n11;
                }
                if (stringArray != null) continue;
            }
            hd_02 = this;
        }
        hd_02.v = hd_0Array;
        return hd_0Array;
    }

    protected abstract hd_0[] l() throws b_0;

    public abstract boolean B();

    public final String z() {
        String[] stringArray = RG.C();
        String string = this.d;
        if (stringArray != null) {
            if (string != null) {
                return this.d;
            }
            string = this.d = this.J();
        }
        return string;
    }

    protected abstract String J();

    public static String[] k(hd_0[] hd_0Array) {
        String[] stringArray;
        block2: {
            String[] stringArray2 = new String[hd_0Array.length];
            String[] stringArray3 = RG.C();
            for (int i2 = 0; i2 < hd_0Array.length; ++i2) {
                stringArray = stringArray2;
                if (stringArray3 != null) {
                    stringArray[i2] = hd_0Array[i2].z();
                    if (stringArray3 != null) continue;
                }
                break block2;
            }
            stringArray = stringArray2;
        }
        return stringArray;
    }

    public abstract boolean s();

    public abstract boolean P();

    public abstract boolean q();

    public abstract boolean o();

    public abstract boolean p();

    @c
    public final hd_0 k() {
        String[] stringArray = RG.C();
        hd_0 hd_02 = this;
        if (stringArray != null) {
            if (hd_02.m) {
                return this.g;
            }
            this.g = this.G();
            this.m = true;
            hd_02 = this.g;
        }
        return hd_02;
    }

    @c
    protected abstract hd_0 G();

    public String toString() {
        String string;
        block4: {
            String string2;
            block5: {
                string2 = f0.F(this.z());
                String[] stringArray = RG.C();
                string = string2;
                if (stringArray == null) break block4;
                if (!string.startsWith(hd_0.a(24617, 23747))) break block5;
                string = string2;
                if (stringArray == null) break block4;
                if (string.indexOf(hd_0.a(22814, 5238499819929658620L), hd_0.a(12766, 5748442128758869055L)) == -1) {
                    string2 = string2.substring(hd_0.a(19318, 6738677895195981457L));
                }
            }
            string = string2;
        }
        return string;
    }

    public boolean I(hd_0 hd_02) throws b_0 {
        boolean bl;
        block86: {
            block87: {
                hd_0 hd_03;
                Object object;
                String[] stringArray;
                block96: {
                    Object object2;
                    block98: {
                        block97: {
                            block94: {
                                block95: {
                                    block92: {
                                        block93: {
                                            block90: {
                                                block91: {
                                                    block88: {
                                                        block89: {
                                                            block84: {
                                                                block85: {
                                                                    block83: {
                                                                        hd_0 hd_04;
                                                                        block81: {
                                                                            block82: {
                                                                                hd_0 hd_05;
                                                                                block80: {
                                                                                    int n10;
                                                                                    block78: {
                                                                                        block79: {
                                                                                            block76: {
                                                                                                block77: {
                                                                                                    stringArray = RG.C();
                                                                                                    try {
                                                                                                        if (this == hd_02) {
                                                                                                            return true;
                                                                                                        }
                                                                                                    }
                                                                                                    catch (b_0 b_02) {
                                                                                                        throw hd_0.a(b_02);
                                                                                                    }
                                                                                                    object = hd_02.z() + this.z();
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    n10 = ((String)object).length();
                                                                                                                    if (stringArray == null) break block76;
                                                                                                                    if (n10 != 2) break block77;
                                                                                                                }
                                                                                                                catch (b_0 b_03) {
                                                                                                                    throw hd_0.a(b_03);
                                                                                                                }
                                                                                                                n10 = y.contains(object) ? 1 : 0;
                                                                                                                if (stringArray == null) break block76;
                                                                                                            }
                                                                                                            catch (b_0 b_04) {
                                                                                                                throw hd_0.a(b_04);
                                                                                                            }
                                                                                                            if (n10 == 0) break block77;
                                                                                                        }
                                                                                                        catch (b_0 b_05) {
                                                                                                            throw hd_0.a(b_05);
                                                                                                        }
                                                                                                        return true;
                                                                                                    }
                                                                                                    catch (b_0 b_06) {
                                                                                                        throw hd_0.a(b_06);
                                                                                                    }
                                                                                                }
                                                                                                n10 = hd_02.m(this) ? 1 : 0;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (stringArray == null) break block78;
                                                                                                    if (n10 == 0) break block79;
                                                                                                }
                                                                                                catch (b_0 b_07) {
                                                                                                    throw hd_0.a(b_07);
                                                                                                }
                                                                                                return true;
                                                                                            }
                                                                                            catch (b_0 b_08) {
                                                                                                throw hd_0.a(b_08);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            hd_04 = hd_02;
                                                                                            hd_05 = this;
                                                                                            if (stringArray == null) break block80;
                                                                                            n10 = hd_04.G(hd_05) ? 1 : 0;
                                                                                        }
                                                                                        catch (b_0 b_09) {
                                                                                            throw hd_0.a(b_09);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (n10 != 0) {
                                                                                            return true;
                                                                                        }
                                                                                    }
                                                                                    catch (b_0 b_010) {
                                                                                        throw hd_0.a(b_010);
                                                                                    }
                                                                                    try {
                                                                                        hd_04 = hd_02;
                                                                                        if (stringArray == null) break block81;
                                                                                        hd_05 = I;
                                                                                    }
                                                                                    catch (b_0 b_011) {
                                                                                        throw hd_0.a(b_011);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (hd_04 != hd_05) break block82;
                                                                                            bl = this.o();
                                                                                            if (stringArray == null) break block83;
                                                                                        }
                                                                                        catch (b_0 b_012) {
                                                                                            throw hd_0.a(b_012);
                                                                                        }
                                                                                        if (bl) break block82;
                                                                                    }
                                                                                    catch (b_0 b_013) {
                                                                                        throw hd_0.a(b_013);
                                                                                    }
                                                                                    return true;
                                                                                }
                                                                                catch (b_0 b_014) {
                                                                                    throw hd_0.a(b_014);
                                                                                }
                                                                            }
                                                                            hd_04 = hd_02;
                                                                        }
                                                                        bl = hd_04.P();
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (stringArray == null) break block84;
                                                                                    if (!bl) break block85;
                                                                                }
                                                                                catch (b_0 b_015) {
                                                                                    throw hd_0.a(b_015);
                                                                                }
                                                                                bl = this.z().equals(hd_0.a(24622, 29184));
                                                                                if (stringArray == null) break block84;
                                                                            }
                                                                            catch (b_0 b_016) {
                                                                                throw hd_0.a(b_016);
                                                                            }
                                                                            if (!bl) break block85;
                                                                        }
                                                                        catch (b_0 b_017) {
                                                                            throw hd_0.a(b_017);
                                                                        }
                                                                        return true;
                                                                    }
                                                                    catch (b_0 b_018) {
                                                                        throw hd_0.a(b_018);
                                                                    }
                                                                }
                                                                bl = hd_02.q();
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (stringArray == null) break block86;
                                                                            if (!bl) break block87;
                                                                        }
                                                                        catch (b_0 b_019) {
                                                                            throw hd_0.a(b_019);
                                                                        }
                                                                        bl = this.z().equals(hd_0.a(24616, -20933));
                                                                        if (stringArray == null) break block88;
                                                                    }
                                                                    catch (b_0 b_020) {
                                                                        throw hd_0.a(b_020);
                                                                    }
                                                                    if (!bl) break block89;
                                                                }
                                                                catch (b_0 b_021) {
                                                                    throw hd_0.a(b_021);
                                                                }
                                                                return true;
                                                            }
                                                            catch (b_0 b_022) {
                                                                throw hd_0.a(b_022);
                                                            }
                                                        }
                                                        bl = this.z().equals(hd_0.a(24627, 8776));
                                                    }
                                                    try {
                                                        try {
                                                            if (stringArray == null) break block90;
                                                            if (!bl) break block91;
                                                        }
                                                        catch (b_0 b_023) {
                                                            throw hd_0.a(b_023);
                                                        }
                                                        return true;
                                                    }
                                                    catch (b_0 b_024) {
                                                        throw hd_0.a(b_024);
                                                    }
                                                }
                                                bl = this.z().equals(hd_0.a(24628, -11904));
                                            }
                                            try {
                                                try {
                                                    if (stringArray == null) break block92;
                                                    if (!bl) break block93;
                                                }
                                                catch (b_0 b_025) {
                                                    throw hd_0.a(b_025);
                                                }
                                                return true;
                                            }
                                            catch (b_0 b_026) {
                                                throw hd_0.a(b_026);
                                            }
                                        }
                                        bl = this.q();
                                    }
                                    try {
                                        if (stringArray == null) break block86;
                                        if (!bl) break block87;
                                    }
                                    catch (b_0 b_027) {
                                        throw hd_0.a(b_027);
                                    }
                                    object = this.k();
                                    hd_03 = hd_02.k();
                                    try {
                                        try {
                                            try {
                                                bl = N;
                                                if (stringArray == null) break block94;
                                                if (bl) break block95;
                                            }
                                            catch (b_0 b_028) {
                                                throw hd_0.a(b_028);
                                            }
                                            if (object != null) break block95;
                                        }
                                        catch (b_0 b_029) {
                                            throw hd_0.a(b_029);
                                        }
                                        throw new AssertionError();
                                    }
                                    catch (b_0 b_030) {
                                        throw hd_0.a(b_030);
                                    }
                                }
                                bl = N;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (stringArray == null) break block96;
                                            if (bl) break block97;
                                        }
                                        catch (b_0 b_031) {
                                            throw hd_0.a(b_031);
                                        }
                                        object2 = hd_03;
                                        if (stringArray == null) break block98;
                                    }
                                    catch (b_0 b_032) {
                                        throw hd_0.a(b_032);
                                    }
                                    if (object2 != null) break block97;
                                }
                                catch (b_0 b_033) {
                                    throw hd_0.a(b_033);
                                }
                                throw new AssertionError();
                            }
                            catch (b_0 b_034) {
                                throw hd_0.a(b_034);
                            }
                        }
                        object2 = object;
                    }
                    bl = ((hd_0)object2).o();
                }
                try {
                    try {
                        try {
                            try {
                                if (stringArray == null) break block86;
                                if (bl) break block87;
                            }
                            catch (b_0 b_035) {
                                throw hd_0.a(b_035);
                            }
                            bl = ((hd_0)object).I(hd_03);
                            if (stringArray == null) break block86;
                        }
                        catch (b_0 b_036) {
                            throw hd_0.a(b_036);
                        }
                        if (!bl) break block87;
                    }
                    catch (b_0 b_037) {
                        throw hd_0.a(b_037);
                    }
                    return true;
                }
                catch (b_0 b_038) {
                    throw hd_0.a(b_038);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean m(hd_0 hd_02) throws b_0 {
        hd_0 hd_03 = this.c();
        String[] stringArray = RG.C();
        while (hd_03 != null) {
            block5: {
                hd_0 hd_04;
                block6: {
                    try {
                        try {
                            hd_04 = hd_03;
                            if (stringArray == null) break block5;
                            if (hd_04 != hd_02) break block6;
                        }
                        catch (b_0 b_02) {
                            throw hd_0.a(b_02);
                        }
                        return true;
                    }
                    catch (b_0 b_03) {
                        throw hd_0.a(b_03);
                    }
                }
                hd_04 = hd_03 = hd_03.c();
            }
            if (stringArray != null) continue;
        }
        return false;
    }

    public boolean G(hd_0 hd_02) throws b_0 {
        int n10;
        block10: {
            hd_0 hd_03 = this;
            String[] stringArray = RG.C();
            while (hd_03 != null) {
                block11: {
                    hd_0 hd_04;
                    hd_0[] hd_0Array;
                    hd_0[] hd_0Array2 = hd_0Array = hd_03.L();
                    int n11 = hd_0Array2.length;
                    n10 = 0;
                    if (stringArray == null) break block10;
                    for (int i2 = v12405771; i2 < n11; ++i2) {
                        boolean bl;
                        block14: {
                            block13: {
                                hd_0 hd_05;
                                hd_0 hd_06;
                                block12: {
                                    hd_0 hd_07 = hd_0Array2[i2];
                                    try {
                                        try {
                                            try {
                                                hd_04 = hd_07;
                                                if (stringArray == null) break block11;
                                                hd_06 = hd_02;
                                                if (stringArray == null) break block12;
                                            }
                                            catch (b_0 b_02) {
                                                throw hd_0.a(b_02);
                                            }
                                            if (hd_04 == hd_06) break block13;
                                        }
                                        catch (b_0 b_03) {
                                            throw hd_0.a(b_03);
                                        }
                                        hd_05 = hd_07;
                                        hd_06 = hd_02;
                                    }
                                    catch (b_0 b_04) {
                                        throw hd_0.a(b_04);
                                    }
                                }
                                try {
                                    bl = hd_05.G(hd_06);
                                    if (stringArray == null) break block14;
                                    if (!bl) continue;
                                }
                                catch (b_0 b_05) {
                                    throw hd_0.a(b_05);
                                }
                            }
                            bl = true;
                        }
                        return bl;
                    }
                    hd_04 = hd_03 = hd_03.c();
                }
                if (stringArray != null) continue;
            }
            n10 = 0;
        }
        return n10 != 0;
    }

    hd_0[] W(@c String string) throws b_0 {
        hd_0[] hd_0Array;
        block6: {
            hd_0[] hd_0Array2;
            block7: {
                hd_0[] hd_0Array3;
                block10: {
                    HashSet hashSet;
                    HashSet hashSet2;
                    block8: {
                        block9: {
                            hd_0Array2 = (hd_0[])this.C.get(string);
                            String[] stringArray = RG.C();
                            try {
                                hd_0Array = hd_0Array2;
                                if (stringArray == null) break block6;
                                if (hd_0Array != null) break block7;
                            }
                            catch (b_0 b_02) {
                                throw hd_0.a(b_02);
                            }
                            hashSet2 = new HashSet();
                            try {
                                try {
                                    this.c(string, hashSet2);
                                    hashSet = hashSet2;
                                    if (stringArray == null) break block8;
                                    if (!hashSet.isEmpty()) break block9;
                                }
                                catch (b_0 b_03) {
                                    throw hd_0.a(b_03);
                                }
                                hd_0Array3 = Y;
                                break block10;
                            }
                            catch (b_0 b_04) {
                                throw hd_0.a(b_04);
                            }
                        }
                        hashSet = hashSet2;
                    }
                    hd_0Array3 = hashSet.toArray(new hd_0[hashSet2.size()]);
                }
                hd_0Array2 = hd_0Array3;
                this.C.put(string, hd_0Array2);
            }
            hd_0Array = hd_0Array2;
        }
        return hd_0Array;
    }

    private void c(@c String string, Collection collection) throws b_0 {
        block43: {
            Object object;
            block44: {
                hd_0 hd_02;
                Object object2;
                String[] stringArray;
                block42: {
                    block40: {
                        block41: {
                            hd_0 hd_03;
                            block39: {
                                hd_0[] hd_0Array;
                                block37: {
                                    block38: {
                                        hd_0 hd_04;
                                        block35: {
                                            block33: {
                                                String string2;
                                                hd_0[] hd_0Array2;
                                                block31: {
                                                    hd_0Array2 = this.p();
                                                    stringArray = RG.C();
                                                    try {
                                                        block32: {
                                                            try {
                                                                try {
                                                                    string2 = string;
                                                                    if (stringArray == null) break block31;
                                                                    if (string2 != null) break block32;
                                                                }
                                                                catch (b_0 b_02) {
                                                                    throw hd_0.a(b_02);
                                                                }
                                                                collection.addAll(Arrays.asList(hd_0Array2));
                                                                if (stringArray != null) break block33;
                                                            }
                                                            catch (b_0 b_03) {
                                                                throw hd_0.a(b_03);
                                                            }
                                                        }
                                                        string2 = f0.n(f0.F(this.z()) + (char)hd_0.a(2798, 2616070818844882691L) + string);
                                                    }
                                                    catch (b_0 b_04) {
                                                        throw hd_0.a(b_04);
                                                    }
                                                }
                                                object2 = string2;
                                                hd_0[] hd_0Array3 = hd_0Array2;
                                                int n10 = hd_0Array3.length;
                                                int n11 = 0;
                                                while (n11 < n10) {
                                                    block34: {
                                                        block36: {
                                                            hd_0 hd_05 = hd_0Array3[n11];
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (stringArray == null) break block34;
                                                                        hd_04 = hd_05;
                                                                        if (stringArray == null) break block35;
                                                                    }
                                                                    catch (b_0 b_05) {
                                                                        throw hd_0.a(b_05);
                                                                    }
                                                                    if (!hd_04.z().equals(object2)) break block36;
                                                                }
                                                                catch (b_0 b_06) {
                                                                    throw hd_0.a(b_06);
                                                                }
                                                                collection.add(hd_05);
                                                                return;
                                                            }
                                                            catch (b_0 b_07) {
                                                                throw hd_0.a(b_07);
                                                            }
                                                        }
                                                        ++n11;
                                                    }
                                                    if (stringArray != null) continue;
                                                }
                                            }
                                            hd_04 = this.c();
                                        }
                                        object2 = hd_04;
                                        try {
                                            try {
                                                hd_0Array = object2;
                                                if (stringArray == null) break block37;
                                                if (hd_0Array == null) break block38;
                                            }
                                            catch (b_0 b_08) {
                                                throw hd_0.a(b_08);
                                            }
                                            super.c(string, collection);
                                        }
                                        catch (b_0 b_09) {
                                            throw hd_0.a(b_09);
                                        }
                                    }
                                    hd_0Array = this;
                                }
                                for (hd_0 hd_06 : hd_0Array.L()) {
                                    try {
                                        hd_03 = hd_06;
                                        if (stringArray != null) {
                                            hd_03.c(string, collection);
                                            if (stringArray != null) continue;
                                            break;
                                        }
                                        break block39;
                                    }
                                    catch (b_0 b_010) {
                                        throw hd_0.a(b_010);
                                    }
                                }
                                hd_03 = this.L();
                            }
                            object2 = hd_03;
                            hd_02 = this.i();
                            try {
                                try {
                                    object = object2;
                                    if (stringArray == null) break block40;
                                    if (object == null) break block41;
                                }
                                catch (b_0 b_011) {
                                    throw hd_0.a(b_011);
                                }
                                super.c(string, collection);
                            }
                            catch (b_0 b_012) {
                                throw hd_0.a(b_012);
                            }
                        }
                        object = hd_02;
                    }
                    try {
                        if (stringArray == null) break block42;
                        if (object == null) break block43;
                    }
                    catch (b_0 b_013) {
                        throw hd_0.a(b_013);
                    }
                    object = hd_02;
                }
                try {
                    try {
                        if (stringArray == null) break block44;
                        if (object == object2) break block43;
                    }
                    catch (b_0 b_014) {
                        throw hd_0.a(b_014);
                    }
                    object = hd_02;
                }
                catch (b_0 b_015) {
                    throw hd_0.a(b_015);
                }
            }
            super.c(string, collection);
        }
    }

    public final h4[] A() throws b_0 {
        h4[] h4Array;
        block4: {
            block5: {
                String[] stringArray = RG.C();
                try {
                    try {
                        h4Array = this.W;
                        if (stringArray == null) break block4;
                        if (h4Array == null) break block5;
                    }
                    catch (b_0 b_02) {
                        throw hd_0.a(b_02);
                    }
                    return this.W;
                }
                catch (b_0 b_03) {
                    throw hd_0.a(b_03);
                }
            }
            this.W = this.a();
            h4Array = this.W;
        }
        return h4Array;
    }

    protected h4[] a() throws b_0 {
        return u;
    }

    public void R() {
        this.K = null;
        this.p = null;
    }

    public static hd_0 R(q_2 q_22) {
        q_2 q_23;
        block8: {
            block6: {
                boolean bl;
                block7: {
                    String[] stringArray = RG.C();
                    while (q_22 instanceof i_0) {
                        q_22 = ((i_0)q_22).V();
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block6;
                    }
                    bl = N;
                    if (stringArray == null) break block7;
                    if (bl) break block6;
                    q_23 = q_22;
                    if (stringArray == null) break block8;
                    bl = q_23 instanceof hd_0;
                }
                if (!bl) {
                    throw new AssertionError();
                }
            }
            q_23 = q_22;
        }
        return (hd_0)q_23;
    }

    static Logger P() {
        return b;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block29: {
                block28: {
                    block27: {
                        var13 = new String[26];
                        var11_1 = 0;
                        var10_2 = "\u00ac\u00c2\u0002\u00f0\u00cb\u0002\u00d9)\u0002\u00bc\u00a0\u00023\u001e\u0002\u00cbq\u0002K\u00b6\u0002\u0081\u00c6\u0012\u00be_ci\u001aV\u00db\u00ff9\u00c5x&K\u00b1\u00bc\u00bf:\u0010\u0002\u00aa\u00c4\u0002\u009e\u00e5\u0002\u00b3u \u00cbd#\u00cd\u0000h\u00c7\u00deH\u00ec\u0093\u00a4$\u00be>R\u00eaC5\u00c5\u0083\u008a$\u00fc=[\u00a2\\\u0081\u009e\u0082\u001e\u0002\u0010Q\u0012\u00ee(i\u0087[\u008b\u00f3D<\u00b2\u00d8\u00c8_l>\u0004jg\n)\u00fed @\u00c9;(\u0080\u0098\u00022L\u0002\u0081*\u0016\r/\u0015g\u00d4\u0097\u0007\u00c9F\u00f8\u00b4\u000e\u00da%\u00edM6_\u00cb&\u008b\u0080$\u00ce\u0080\u00dd\u0005i\u00e3\u00c9+\u00dcZ\u00e2\\\u00cd\u0015n\fg\u00c1\u0092\u009c\u00d6\u00d7%\u00ab\u00eb\u0083\bt\u00f5\u00ddG\u00e6\u00f9\u00e8$\u009d\u0002l\u0085\u0015\u008f6ED\u00de\u00f3CK*S\u001a\u00f8\t\u00e20v\u00d4\u00b6\u00e1q_\u0002\u001c6\u0002g\u00d3";
                        var12_3 = "\u00ac\u00c2\u0002\u00f0\u00cb\u0002\u00d9)\u0002\u00bc\u00a0\u00023\u001e\u0002\u00cbq\u0002K\u00b6\u0002\u0081\u00c6\u0012\u00be_ci\u001aV\u00db\u00ff9\u00c5x&K\u00b1\u00bc\u00bf:\u0010\u0002\u00aa\u00c4\u0002\u009e\u00e5\u0002\u00b3u \u00cbd#\u00cd\u0000h\u00c7\u00deH\u00ec\u0093\u00a4$\u00be>R\u00eaC5\u00c5\u0083\u008a$\u00fc=[\u00a2\\\u0081\u009e\u0082\u001e\u0002\u0010Q\u0012\u00ee(i\u0087[\u008b\u00f3D<\u00b2\u00d8\u00c8_l>\u0004jg\n)\u00fed @\u00c9;(\u0080\u0098\u00022L\u0002\u0081*\u0016\r/\u0015g\u00d4\u0097\u0007\u00c9F\u00f8\u00b4\u000e\u00da%\u00edM6_\u00cb&\u008b\u0080$\u00ce\u0080\u00dd\u0005i\u00e3\u00c9+\u00dcZ\u00e2\\\u00cd\u0015n\fg\u00c1\u0092\u009c\u00d6\u00d7%\u00ab\u00eb\u0083\bt\u00f5\u00ddG\u00e6\u00f9\u00e8$\u009d\u0002l\u0085\u0015\u008f6ED\u00de\u00f3CK*S\u001a\u00f8\t\u00e20v\u00d4\u00b6\u00e1q_\u0002\u001c6\u0002g\u00d3".length();
                        var9_4 = 2;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 10;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block27;
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
                            var10_2 = "\u00ee\u000b\u0002\u0000\u00a5";
                            var12_3 = "\u00ee\u000b\u0002\u0000\u00a5".length();
                            var9_4 = 2;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 23;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block27;
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
                            break block28;
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
                                    v15 = 81;
                                    break;
                                }
                                case 1: {
                                    v15 = 36;
                                    break;
                                }
                                case 2: {
                                    v15 = 113;
                                    break;
                                }
                                case 3: {
                                    v15 = 28;
                                    break;
                                }
                                case 4: {
                                    v15 = 63;
                                    break;
                                }
                                case 5: {
                                    v15 = 36;
                                    break;
                                }
                                default: {
                                    v15 = 21;
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
                hd_0.i = var13;
                hd_0.w = new String[26];
                var0_7 = 8317457223667326940L;
                var6_8 = new long[17];
                var3_9 = 0;
                var4_10 = "?\u00f2\u00f1\u00c2\u008e\u00ac\u00af\u0002`.q\u000e)\u00e8{\u000e\u00b0\u0089}\u00d8+\u00a2\u0093\u00e9\u00c4\u00f7_\u001c\u00fb\u008f~j\u00a6\u0005\u00fa#E\u00dciG\u00b4MB`)\u00e6\u0010\u00c1G\u00f8$4\u00ca\u00ad\u0012\u00c3|\u0012\u00d0\u00d5mh\u00fb\u00ac\u007f\"\u00b6'\u00049N\u00ab\u00da\u0088\u00bdk\u00b2\u00f2\u0093\u00b9\u008f\u0081\u00e7}\u00b5\u00edm\u00c5x]\u00ce\u00ffEWt-\u00ea-\u00b8\u00c9\u00dbL\u00b5\u0013\u00913\u0003\u00b9\u0013\u00c8\u0012\u0007 _\u00dekk\u00b1(\u00fb";
                var5_11 = "?\u00f2\u00f1\u00c2\u008e\u00ac\u00af\u0002`.q\u000e)\u00e8{\u000e\u00b0\u0089}\u00d8+\u00a2\u0093\u00e9\u00c4\u00f7_\u001c\u00fb\u008f~j\u00a6\u0005\u00fa#E\u00dciG\u00b4MB`)\u00e6\u0010\u00c1G\u00f8$4\u00ca\u00ad\u0012\u00c3|\u0012\u00d0\u00d5mh\u00fb\u00ac\u007f\"\u00b6'\u00049N\u00ab\u00da\u0088\u00bdk\u00b2\u00f2\u0093\u00b9\u008f\u0081\u00e7}\u00b5\u00edm\u00c5x]\u00ce\u00ffEWt-\u00ea-\u00b8\u00c9\u00dbL\u00b5\u0013\u00913\u0003\u00b9\u0013\u00c8\u0012\u0007 _\u00dekk\u00b1(\u00fb".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block29;
                    break;
                }
lbl112:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u001d\u0004\u00d1\u00d5\u00af\f\u0095\u00ff\u0005\u0010\u00a1Q\u0084Y\u00be\u0083";
                    var5_11 = "\u001d\u0004\u00d1\u00d5\u00af\f\u0095\u00ff\u0005\u0010\u00a1Q\u0084Y\u00be\u0083".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block29;
                        break;
                    }
                    break;
                }
lbl125:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block30;
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
        hd_0.L = var6_8;
        hd_0.T = new Integer[17];
        hd_0.N = hd_0.class.desiredAssertionStatus() == false;
        hd_0.b = Logger.getLogger(hd_0.class.getName());
        hd_0.M = new he_0();
        hd_0.I = new hr_0("");
        hd_0.s = new hr_0("V");
        hd_0.E = new hr_0("B");
        hd_0.O = new hr_0("C");
        hd_0.D = new hr_0("D");
        hd_0.l = new hr_0("F");
        hd_0.G = new hr_0("I");
        hd_0.S = new hr_0("J");
        hd_0.e = new hr_0("S");
        hd_0.t = new hr_0("Z");
        hd_0.H = new hP[0];
        hd_0.y = new HashSet<E>();
        v22 = new String[hd_0.a(7359, 91374271584739660L)];
        v22[0] = hd_0.a(24639, 15997);
        v22[1] = hd_0.a(24615, 15995);
        v22[2] = hd_0.a(24610, 5591);
        v22[3] = hd_0.a(24625, -14189);
        v22[4] = hd_0.a(24623, -6664);
        v22[5] = hd_0.a(24624, -320);
        v22[hd_0.a((int)20470, (long)3706966831049732639L)] = hd_0.a(24620, -17215);
        v22[hd_0.a((int)22046, (long)2854065080455523318L)] = hd_0.a(24609, -14151);
        v22[hd_0.a((int)12349, (long)6799388736099093971L)] = hd_0.a(24638, 30434);
        v22[hd_0.a((int)12678, (long)4331772014323829868L)] = hd_0.a(24611, 13020);
        v22[hd_0.a((int)19318, (long)6738677895195981457L)] = hd_0.a(24621, 18646);
        v22[hd_0.a((int)12529, (long)8283781889519488276L)] = hd_0.a(24630, 11047);
        v22[hd_0.a((int)3377, (long)1659444098196451538L)] = hd_0.a(24613, -27270);
        v22[hd_0.a((int)27793, (long)549551085531681146L)] = hd_0.a(24614, 14405);
        v22[hd_0.a((int)14273, (long)8894533008459958829L)] = hd_0.a(24612, -11166);
        v22[hd_0.a((int)5935, (long)8615691842265950912L)] = hd_0.a(24608, 8857);
        v22[hd_0.a((int)13035, (long)5670053924763373325L)] = hd_0.a(24619, -24473);
        v22[hd_0.a((int)23623, (long)6119853420808364455L)] = hd_0.a(24626, 16590);
        v22[hd_0.a((int)22918, (long)825072003426444386L)] = hd_0.a(24631, 26306);
        for (String var19_18 : var15_14 = v22) {
            hd_0.y.add(var19_18);
        }
        hd_0.Y = new hd_0[0];
        hd_0.u = new h4[0];
    }

    private static b_0 a(b_0 b_02) {
        return b_02;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6026) & 0xFFFF;
        if (w[n12] == null) {
            int n13;
            int n14;
            char[] cArray = i[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 90;
                    break;
                }
                case 1: {
                    n14 = 135;
                    break;
                }
                case 2: {
                    n14 = 9;
                    break;
                }
                case 3: {
                    n14 = 249;
                    break;
                }
                case 4: {
                    n14 = 161;
                    break;
                }
                case 5: {
                    n14 = 165;
                    break;
                }
                case 6: {
                    n14 = 131;
                    break;
                }
                case 7: {
                    n14 = 240;
                    break;
                }
                case 8: {
                    n14 = 193;
                    break;
                }
                case 9: {
                    n14 = 46;
                    break;
                }
                case 10: {
                    n14 = 143;
                    break;
                }
                case 11: {
                    n14 = 86;
                    break;
                }
                case 12: {
                    n14 = 223;
                    break;
                }
                case 13: {
                    n14 = 235;
                    break;
                }
                case 14: {
                    n14 = 31;
                    break;
                }
                case 15: {
                    n14 = 103;
                    break;
                }
                case 16: {
                    n14 = 70;
                    break;
                }
                case 17: {
                    n14 = 159;
                    break;
                }
                case 18: {
                    n14 = 113;
                    break;
                }
                case 19: {
                    n14 = 206;
                    break;
                }
                case 20: {
                    n14 = 217;
                    break;
                }
                case 21: {
                    n14 = 134;
                    break;
                }
                case 22: {
                    n14 = 137;
                    break;
                }
                case 23: {
                    n14 = 84;
                    break;
                }
                case 24: {
                    n14 = 244;
                    break;
                }
                case 25: {
                    n14 = 83;
                    break;
                }
                case 26: {
                    n14 = 24;
                    break;
                }
                case 27: {
                    n14 = 151;
                    break;
                }
                case 28: {
                    n14 = 130;
                    break;
                }
                case 29: {
                    n14 = 218;
                    break;
                }
                case 30: {
                    n14 = 157;
                    break;
                }
                case 31: {
                    n14 = 185;
                    break;
                }
                case 32: {
                    n14 = 41;
                    break;
                }
                case 33: {
                    n14 = 230;
                    break;
                }
                case 34: {
                    n14 = 233;
                    break;
                }
                case 35: {
                    n14 = 53;
                    break;
                }
                case 36: {
                    n14 = 150;
                    break;
                }
                case 37: {
                    n14 = 142;
                    break;
                }
                case 38: {
                    n14 = 220;
                    break;
                }
                case 39: {
                    n14 = 49;
                    break;
                }
                case 40: {
                    n14 = 250;
                    break;
                }
                case 41: {
                    n14 = 149;
                    break;
                }
                case 42: {
                    n14 = 17;
                    break;
                }
                case 43: {
                    n14 = 91;
                    break;
                }
                case 44: {
                    n14 = 94;
                    break;
                }
                case 45: {
                    n14 = 210;
                    break;
                }
                case 46: {
                    n14 = 16;
                    break;
                }
                case 47: {
                    n14 = 190;
                    break;
                }
                case 48: {
                    n14 = 99;
                    break;
                }
                case 49: {
                    n14 = 164;
                    break;
                }
                case 50: {
                    n14 = 204;
                    break;
                }
                case 51: {
                    n14 = 136;
                    break;
                }
                case 52: {
                    n14 = 6;
                    break;
                }
                case 53: {
                    n14 = 234;
                    break;
                }
                case 54: {
                    n14 = 255;
                    break;
                }
                case 55: {
                    n14 = 81;
                    break;
                }
                case 56: {
                    n14 = 232;
                    break;
                }
                case 57: {
                    n14 = 78;
                    break;
                }
                case 58: {
                    n14 = 22;
                    break;
                }
                case 59: {
                    n14 = 153;
                    break;
                }
                case 60: {
                    n14 = 20;
                    break;
                }
                case 61: {
                    n14 = 118;
                    break;
                }
                case 62: {
                    n14 = 197;
                    break;
                }
                case 63: {
                    n14 = 166;
                    break;
                }
                case 64: {
                    n14 = 92;
                    break;
                }
                case 65: {
                    n14 = 0;
                    break;
                }
                case 66: {
                    n14 = 180;
                    break;
                }
                case 67: {
                    n14 = 187;
                    break;
                }
                case 68: {
                    n14 = 163;
                    break;
                }
                case 69: {
                    n14 = 209;
                    break;
                }
                case 70: {
                    n14 = 121;
                    break;
                }
                case 71: {
                    n14 = 172;
                    break;
                }
                case 72: {
                    n14 = 42;
                    break;
                }
                case 73: {
                    n14 = 178;
                    break;
                }
                case 74: {
                    n14 = 129;
                    break;
                }
                case 75: {
                    n14 = 101;
                    break;
                }
                case 76: {
                    n14 = 33;
                    break;
                }
                case 77: {
                    n14 = 177;
                    break;
                }
                case 78: {
                    n14 = 88;
                    break;
                }
                case 79: {
                    n14 = 251;
                    break;
                }
                case 80: {
                    n14 = 243;
                    break;
                }
                case 81: {
                    n14 = 97;
                    break;
                }
                case 82: {
                    n14 = 104;
                    break;
                }
                case 83: {
                    n14 = 57;
                    break;
                }
                case 84: {
                    n14 = 219;
                    break;
                }
                case 85: {
                    n14 = 2;
                    break;
                }
                case 86: {
                    n14 = 102;
                    break;
                }
                case 87: {
                    n14 = 174;
                    break;
                }
                case 88: {
                    n14 = 114;
                    break;
                }
                case 89: {
                    n14 = 194;
                    break;
                }
                case 90: {
                    n14 = 167;
                    break;
                }
                case 91: {
                    n14 = 100;
                    break;
                }
                case 92: {
                    n14 = 15;
                    break;
                }
                case 93: {
                    n14 = 95;
                    break;
                }
                case 94: {
                    n14 = 96;
                    break;
                }
                case 95: {
                    n14 = 188;
                    break;
                }
                case 96: {
                    n14 = 122;
                    break;
                }
                case 97: {
                    n14 = 221;
                    break;
                }
                case 98: {
                    n14 = 208;
                    break;
                }
                case 99: {
                    n14 = 128;
                    break;
                }
                case 100: {
                    n14 = 52;
                    break;
                }
                case 101: {
                    n14 = 112;
                    break;
                }
                case 102: {
                    n14 = 207;
                    break;
                }
                case 103: {
                    n14 = 23;
                    break;
                }
                case 104: {
                    n14 = 156;
                    break;
                }
                case 105: {
                    n14 = 7;
                    break;
                }
                case 106: {
                    n14 = 3;
                    break;
                }
                case 107: {
                    n14 = 133;
                    break;
                }
                case 108: {
                    n14 = 98;
                    break;
                }
                case 109: {
                    n14 = 27;
                    break;
                }
                case 110: {
                    n14 = 28;
                    break;
                }
                case 111: {
                    n14 = 189;
                    break;
                }
                case 112: {
                    n14 = 238;
                    break;
                }
                case 113: {
                    n14 = 184;
                    break;
                }
                case 114: {
                    n14 = 171;
                    break;
                }
                case 115: {
                    n14 = 85;
                    break;
                }
                case 116: {
                    n14 = 182;
                    break;
                }
                case 117: {
                    n14 = 37;
                    break;
                }
                case 118: {
                    n14 = 26;
                    break;
                }
                case 119: {
                    n14 = 173;
                    break;
                }
                case 120: {
                    n14 = 21;
                    break;
                }
                case 121: {
                    n14 = 141;
                    break;
                }
                case 122: {
                    n14 = 214;
                    break;
                }
                case 123: {
                    n14 = 252;
                    break;
                }
                case 124: {
                    n14 = 76;
                    break;
                }
                case 125: {
                    n14 = 77;
                    break;
                }
                case 126: {
                    n14 = 247;
                    break;
                }
                case 127: {
                    n14 = 168;
                    break;
                }
                case 128: {
                    n14 = 116;
                    break;
                }
                case 129: {
                    n14 = 115;
                    break;
                }
                case 130: {
                    n14 = 145;
                    break;
                }
                case 131: {
                    n14 = 175;
                    break;
                }
                case 132: {
                    n14 = 213;
                    break;
                }
                case 133: {
                    n14 = 93;
                    break;
                }
                case 134: {
                    n14 = 40;
                    break;
                }
                case 135: {
                    n14 = 4;
                    break;
                }
                case 136: {
                    n14 = 48;
                    break;
                }
                case 137: {
                    n14 = 160;
                    break;
                }
                case 138: {
                    n14 = 19;
                    break;
                }
                case 139: {
                    n14 = 13;
                    break;
                }
                case 140: {
                    n14 = 64;
                    break;
                }
                case 141: {
                    n14 = 202;
                    break;
                }
                case 142: {
                    n14 = 246;
                    break;
                }
                case 143: {
                    n14 = 34;
                    break;
                }
                case 144: {
                    n14 = 25;
                    break;
                }
                case 145: {
                    n14 = 147;
                    break;
                }
                case 146: {
                    n14 = 32;
                    break;
                }
                case 147: {
                    n14 = 50;
                    break;
                }
                case 148: {
                    n14 = 239;
                    break;
                }
                case 149: {
                    n14 = 152;
                    break;
                }
                case 150: {
                    n14 = 196;
                    break;
                }
                case 151: {
                    n14 = 201;
                    break;
                }
                case 152: {
                    n14 = 54;
                    break;
                }
                case 153: {
                    n14 = 119;
                    break;
                }
                case 154: {
                    n14 = 183;
                    break;
                }
                case 155: {
                    n14 = 195;
                    break;
                }
                case 156: {
                    n14 = 12;
                    break;
                }
                case 157: {
                    n14 = 203;
                    break;
                }
                case 158: {
                    n14 = 229;
                    break;
                }
                case 159: {
                    n14 = 10;
                    break;
                }
                case 160: {
                    n14 = 222;
                    break;
                }
                case 161: {
                    n14 = 231;
                    break;
                }
                case 162: {
                    n14 = 62;
                    break;
                }
                case 163: {
                    n14 = 11;
                    break;
                }
                case 164: {
                    n14 = 199;
                    break;
                }
                case 165: {
                    n14 = 212;
                    break;
                }
                case 166: {
                    n14 = 225;
                    break;
                }
                case 167: {
                    n14 = 215;
                    break;
                }
                case 168: {
                    n14 = 248;
                    break;
                }
                case 169: {
                    n14 = 132;
                    break;
                }
                case 170: {
                    n14 = 55;
                    break;
                }
                case 171: {
                    n14 = 146;
                    break;
                }
                case 172: {
                    n14 = 254;
                    break;
                }
                case 173: {
                    n14 = 67;
                    break;
                }
                case 174: {
                    n14 = 65;
                    break;
                }
                case 175: {
                    n14 = 39;
                    break;
                }
                case 176: {
                    n14 = 18;
                    break;
                }
                case 177: {
                    n14 = 155;
                    break;
                }
                case 178: {
                    n14 = 111;
                    break;
                }
                case 179: {
                    n14 = 140;
                    break;
                }
                case 180: {
                    n14 = 127;
                    break;
                }
                case 181: {
                    n14 = 66;
                    break;
                }
                case 182: {
                    n14 = 108;
                    break;
                }
                case 183: {
                    n14 = 227;
                    break;
                }
                case 184: {
                    n14 = 179;
                    break;
                }
                case 185: {
                    n14 = 73;
                    break;
                }
                case 186: {
                    n14 = 148;
                    break;
                }
                case 187: {
                    n14 = 125;
                    break;
                }
                case 188: {
                    n14 = 5;
                    break;
                }
                case 189: {
                    n14 = 237;
                    break;
                }
                case 190: {
                    n14 = 61;
                    break;
                }
                case 191: {
                    n14 = 107;
                    break;
                }
                case 192: {
                    n14 = 120;
                    break;
                }
                case 193: {
                    n14 = 29;
                    break;
                }
                case 194: {
                    n14 = 186;
                    break;
                }
                case 195: {
                    n14 = 14;
                    break;
                }
                case 196: {
                    n14 = 45;
                    break;
                }
                case 197: {
                    n14 = 59;
                    break;
                }
                case 198: {
                    n14 = 236;
                    break;
                }
                case 199: {
                    n14 = 245;
                    break;
                }
                case 200: {
                    n14 = 72;
                    break;
                }
                case 201: {
                    n14 = 30;
                    break;
                }
                case 202: {
                    n14 = 68;
                    break;
                }
                case 203: {
                    n14 = 126;
                    break;
                }
                case 204: {
                    n14 = 138;
                    break;
                }
                case 205: {
                    n14 = 56;
                    break;
                }
                case 206: {
                    n14 = 74;
                    break;
                }
                case 207: {
                    n14 = 211;
                    break;
                }
                case 208: {
                    n14 = 154;
                    break;
                }
                case 209: {
                    n14 = 89;
                    break;
                }
                case 210: {
                    n14 = 47;
                    break;
                }
                case 211: {
                    n14 = 170;
                    break;
                }
                case 212: {
                    n14 = 176;
                    break;
                }
                case 213: {
                    n14 = 139;
                    break;
                }
                case 214: {
                    n14 = 226;
                    break;
                }
                case 215: {
                    n14 = 110;
                    break;
                }
                case 216: {
                    n14 = 1;
                    break;
                }
                case 217: {
                    n14 = 224;
                    break;
                }
                case 218: {
                    n14 = 38;
                    break;
                }
                case 219: {
                    n14 = 82;
                    break;
                }
                case 220: {
                    n14 = 63;
                    break;
                }
                case 221: {
                    n14 = 106;
                    break;
                }
                case 222: {
                    n14 = 191;
                    break;
                }
                case 223: {
                    n14 = 253;
                    break;
                }
                case 224: {
                    n14 = 44;
                    break;
                }
                case 225: {
                    n14 = 79;
                    break;
                }
                case 226: {
                    n14 = 80;
                    break;
                }
                case 227: {
                    n14 = 8;
                    break;
                }
                case 228: {
                    n14 = 60;
                    break;
                }
                case 229: {
                    n14 = 87;
                    break;
                }
                case 230: {
                    n14 = 158;
                    break;
                }
                case 231: {
                    n14 = 205;
                    break;
                }
                case 232: {
                    n14 = 43;
                    break;
                }
                case 233: {
                    n14 = 241;
                    break;
                }
                case 234: {
                    n14 = 200;
                    break;
                }
                case 235: {
                    n14 = 216;
                    break;
                }
                case 236: {
                    n14 = 51;
                    break;
                }
                case 237: {
                    n14 = 105;
                    break;
                }
                case 238: {
                    n14 = 169;
                    break;
                }
                case 239: {
                    n14 = 117;
                    break;
                }
                case 240: {
                    n14 = 162;
                    break;
                }
                case 241: {
                    n14 = 69;
                    break;
                }
                case 242: {
                    n14 = 35;
                    break;
                }
                case 243: {
                    n14 = 75;
                    break;
                }
                case 244: {
                    n14 = 109;
                    break;
                }
                case 245: {
                    n14 = 181;
                    break;
                }
                case 246: {
                    n14 = 192;
                    break;
                }
                case 247: {
                    n14 = 144;
                    break;
                }
                case 248: {
                    n14 = 123;
                    break;
                }
                case 249: {
                    n14 = 124;
                    break;
                }
                case 250: {
                    n14 = 198;
                    break;
                }
                case 251: {
                    n14 = 71;
                    break;
                }
                case 252: {
                    n14 = 228;
                    break;
                }
                case 253: {
                    n14 = 36;
                    break;
                }
                case 254: {
                    n14 = 242;
                    break;
                }
                default: {
                    n14 = 58;
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
            hd_0.w[n12] = new String(cArray).intern();
        }
        return w[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3DE3;
        if (T[n11] == null) {
            hd_0.T[n11] = (int)(L[n11] ^ l2);
        }
        return T[n11];
    }
}

