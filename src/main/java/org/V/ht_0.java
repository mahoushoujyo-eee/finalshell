/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import org.F.c;
import org.H.CX;
import org.H.G;
import org.H.R;
import org.H.Y;
import org.P;
import org.b_0;
import org.h.c_0;
import org.h.cb_0;
import org.h.cc_0;
import org.h.ce_0;
import org.h.cq_0;
import org.h.cr_0;
import org.h.r_0;
import org.h.v_0;
import org.i.M;
import org.i.O;
import org.i.y;
import org.i.z_0;
import org.v.RG;
import org.v._J;
import org.v._L;
import org.v._S;
import org.v._T;
import org.v._f_0;
import org.v.f0;
import org.v.f3;
import org.v.f7;
import org.v.fm_0;
import org.v.h4;
import org.v.h5;
import org.v.hM;
import org.v.hP;
import org.v.hd_0;
import org.v.hu_0;
import org.v.hv_0;
import org.v.o_0;
import org.v.u_1;
import org.v.z_1;
import org.v.z_2;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from org.v.ht
 */
public class ht_0
extends hd_0 {
    private static final Logger c;
    private final cr_0 P;
    private final _L U;
    private final short n;
    @c
    private final org.i.P J;
    private final Map a;
    private final Map j;
    private final Map k;
    private static final String[] q;
    private static final String[] B;
    private static final long[] F;
    private static final Integer[] Q;

    /*
     * Loose catch block
     */
    public ht_0(cr_0 cr_02, _L _L2) {
        block6: {
            cc_0 cc_02;
            block7: {
                this.a = new HashMap();
                String[] stringArray = RG.C();
                this.j = new HashMap();
                this.k = new HashMap();
                this.P = cr_02;
                this.U = _L2;
                this.n = cr_02.f;
                cc_02 = cr_02.P();
                if (stringArray == null) break block6;
                try {
                    block8: {
                        if (cc_02 != null) break block7;
                        break block8;
                        catch (y y2) {
                            throw ht_0.a(y2);
                        }
                    }
                    this.J = null;
                    if (stringArray != null) break block6;
                }
                catch (y y3) {
                    throw ht_0.a(y3);
                }
            }
            try {
                this.J = new M().k(cc_02.Q(cr_02));
            }
            catch (y y4) {
                throw new P(ht_0.b(13585, 15030) + this + "\"", y4);
            }
        }
    }

    @Override
    protected _J[] V() throws b_0 {
        _J[] _JArray;
        block10: {
            org.i.P p2;
            String[] stringArray;
            org.i.P p3;
            block8: {
                block9: {
                    p3 = this.J;
                    stringArray = RG.C();
                    try {
                        try {
                            p2 = p3;
                            if (stringArray == null) break block8;
                            if (p2 != null) break block9;
                        }
                        catch (b_0 b_02) {
                            throw ht_0.a(b_02);
                        }
                        return new _J[0];
                    }
                    catch (b_0 b_03) {
                        throw ht_0.a(b_03);
                    }
                }
                p2 = p3;
            }
            _J[] _JArray2 = new _J[p2.v.size()];
            for (int i2 = 0; i2 < _JArray2.length; ++i2) {
                O o2 = (O)p3.v.get(i2);
                _f_0[] _f_0Array = this.G(o2);
                try {
                    _JArray = _JArray2;
                    if (stringArray != null) {
                        _JArray[i2] = new fm_0(this, o2, _f_0Array);
                        if (stringArray != null) continue;
                        break;
                    }
                    break block10;
                }
                catch (b_0 b_04) {
                    throw ht_0.a(b_04);
                }
            }
            _JArray = _JArray2;
        }
        return _JArray;
    }

    private _f_0[] G(O o2) throws b_0 {
        ArrayList<_f_0> arrayList = new ArrayList<_f_0>();
        try {
            if (o2.j != null) {
                arrayList.add(this.F(o2.j));
            }
        }
        catch (b_0 b_02) {
            throw ht_0.a(b_02);
        }
        return arrayList.toArray(new _f_0[arrayList.size()]);
    }

    private _f_0 F(z_0 z_02) throws b_0 {
        return (_f_0)z_02.P(new z_1(this));
    }

    @Override
    protected hv_0[] C() {
        ArrayList<hu_0> arrayList = new ArrayList<hu_0>();
        String[] stringArray = RG.C();
        for (org.H.P p2 : this.P.P) {
            block7: {
                hu_0 hu_02;
                try {
                    hu_02 = this.j(p2);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw new P(classNotFoundException.getMessage(), classNotFoundException);
                }
                try {
                    boolean bl;
                    try {
                        bl = hu_02 instanceof hv_0;
                        if (stringArray == null || !bl) break block7;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        throw ht_0.a(classNotFoundException);
                    }
                    bl = arrayList.add(hu_02);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw ht_0.a(classNotFoundException);
                }
            }
            if (stringArray != null) continue;
        }
        return arrayList.toArray(new hv_0[arrayList.size()]);
    }

    @Override
    protected hP[] H() {
        ArrayList<hP> arrayList = new ArrayList<hP>();
        Iterator iterator = this.P.P.iterator();
        String[] stringArray = RG.C();
        while (iterator.hasNext()) {
            block7: {
                hu_0 hu_02;
                org.H.P p2 = (org.H.P)iterator.next();
                try {
                    hu_02 = this.j(p2);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw new P(classNotFoundException.getMessage(), classNotFoundException);
                }
                try {
                    boolean bl;
                    try {
                        bl = hu_02 instanceof hP;
                        if (stringArray == null || !bl) break block7;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        throw ht_0.a(classNotFoundException);
                    }
                    bl = arrayList.add((hP)hu_02);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw ht_0.a(classNotFoundException);
                }
            }
            if (stringArray != null) continue;
        }
        return arrayList.toArray(new hP[arrayList.size()]);
    }

    @Override
    protected u_1[] A() {
        u_1[] u_1Array;
        block5: {
            u_1[] u_1Array2 = new u_1[this.P.r.size()];
            String[] stringArray = RG.C();
            for (int i2 = 0; i2 < this.P.r.size(); ++i2) {
                try {
                    u_1Array = u_1Array2;
                    if (stringArray != null) {
                        u_1Array[i2] = this.R((c_0)this.P.r.get(i2));
                        continue;
                    }
                    break block5;
                }
                catch (P p2) {
                    throw ht_0.a(p2);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw new P(classNotFoundException.getMessage(), classNotFoundException);
                }
            }
            u_1Array = u_1Array2;
        }
        return u_1Array;
    }

    @Override
    protected hd_0[] j() throws b_0 {
        cq_0 cq_02 = this.P.F();
        String[] stringArray = RG.C();
        try {
            if (cq_02 == null) {
                return new hd_0[0];
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw ht_0.a(classNotFoundException);
        }
        ArrayList arrayList = new ArrayList();
        for (CX cX : cq_02.u()) {
            block8: {
                short s2;
                try {
                    s2 = cX.a;
                    if (stringArray == null) break block8;
                    if (s2 != this.P.m) break block8;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw ht_0.a(classNotFoundException);
                }
                try {
                    s2 = (short)(arrayList.add(this.w(cX.w)) ? 1 : 0);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw new b_0(classNotFoundException.getMessage(), null);
                }
            }
            if (stringArray != null) continue;
        }
        return arrayList.toArray(new hd_0[arrayList.size()]);
    }

    /*
     * Loose catch block
     */
    @Override
    @c
    protected hd_0 V() throws b_0 {
        cq_0 cq_02;
        String[] stringArray;
        block17: {
            cq_0 cq_03;
            block14: {
                cq_03 = this.P.F();
                stringArray = RG.C();
                cq_02 = cq_03;
                if (stringArray == null) break block17;
                try {
                    block18: {
                        if (cq_02 != null) break block14;
                        break block18;
                        catch (ClassNotFoundException classNotFoundException) {
                            throw ht_0.a(classNotFoundException);
                        }
                    }
                    return null;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw ht_0.a(classNotFoundException);
                }
            }
            cq_02 = cq_03;
        }
        for (CX cX : cq_02.u()) {
            block16: {
                short s2;
                block15: {
                    s2 = cX.w;
                    if (stringArray == null) break block15;
                    try {
                        block19: {
                            if (s2 != this.P.m) break block16;
                            break block19;
                            catch (ClassNotFoundException classNotFoundException) {
                                throw ht_0.a(classNotFoundException);
                            }
                        }
                        s2 = cX.a;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        throw ht_0.a(classNotFoundException);
                    }
                }
                try {
                    if (s2 == 0) {
                        return null;
                    }
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw ht_0.a(classNotFoundException);
                }
                try {
                    return this.w(cX.a);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw new b_0(classNotFoundException.getMessage(), null);
                }
            }
            if (stringArray != null) continue;
        }
        return null;
    }

    /*
     * Loose catch block
     */
    @Override
    @c
    protected hd_0 l() throws b_0 {
        cq_0 cq_02;
        String[] stringArray;
        block23: {
            cq_0 cq_03;
            block18: {
                cq_03 = this.P.F();
                stringArray = RG.C();
                cq_02 = cq_03;
                if (stringArray == null) break block23;
                try {
                    block24: {
                        if (cq_02 != null) break block18;
                        break block24;
                        catch (ClassNotFoundException classNotFoundException) {
                            throw ht_0.a(classNotFoundException);
                        }
                    }
                    return null;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw ht_0.a(classNotFoundException);
                }
            }
            cq_02 = cq_03;
        }
        for (CX cX : cq_02.u()) {
            block20: {
                short s2;
                block21: {
                    block22: {
                        block19: {
                            s2 = cX.w;
                            if (stringArray == null) break block19;
                            try {
                                block25: {
                                    if (s2 != this.P.m) break block20;
                                    break block25;
                                    catch (ClassNotFoundException classNotFoundException) {
                                        throw ht_0.a(classNotFoundException);
                                    }
                                }
                                s2 = cX.a;
                            }
                            catch (ClassNotFoundException classNotFoundException) {
                                throw ht_0.a(classNotFoundException);
                            }
                        }
                        if (stringArray == null) break block21;
                        try {
                            block26: {
                                if (s2 != 0) break block22;
                                break block26;
                                catch (ClassNotFoundException classNotFoundException) {
                                    throw ht_0.a(classNotFoundException);
                                }
                            }
                            return null;
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            throw ht_0.a(classNotFoundException);
                        }
                    }
                    s2 = (short)(f7.G(cX.q) ? 1 : 0);
                }
                try {
                    if (s2 != 0) {
                        return null;
                    }
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw ht_0.a(classNotFoundException);
                }
                try {
                    return this.w(cX.a);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw new b_0(classNotFoundException.getMessage(), null);
                }
            }
            if (stringArray != null) continue;
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @c
    protected hd_0 g() throws b_0 {
        hd_0 hd_02;
        int n10;
        block11: {
            String[] stringArray;
            block12: {
                stringArray = RG.C();
                n10 = this.P.c;
                if (stringArray == null) break block11;
                if (n10 == 0) return null;
                break block12;
                catch (ClassNotFoundException classNotFoundException) {
                    throw ht_0.a(classNotFoundException);
                }
            }
            try {
                block13: {
                    hd_02 = this;
                    if (stringArray == null) return hd_02;
                    break block13;
                    catch (ClassNotFoundException classNotFoundException) {
                        throw ht_0.a(classNotFoundException);
                    }
                }
                n10 = hd_02.P.f & ht_0.b(14922, 714984759096482349L);
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw ht_0.a(classNotFoundException);
            }
        }
        try {
            if (n10 != 0) {
                return null;
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw ht_0.a(classNotFoundException);
        }
        try {
            hd_02 = this.w(this.P.c);
            return hd_02;
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new b_0(classNotFoundException.getMessage(), null);
        }
    }

    @Override
    public _S r() {
        return ht_0.i(this.n);
    }

    @Override
    public boolean M() {
        return f7.Y(this.n);
    }

    @Override
    protected hd_0[] l() throws b_0 {
        return this.x(this.P.v);
    }

    @Override
    public boolean B() {
        return f7.M(this.n);
    }

    @Override
    protected String J() {
        return f0.n(this.P.t());
    }

    @Override
    public boolean s() {
        return f7.A(this.n);
    }

    @Override
    public boolean P() {
        return f7.Z(this.n);
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    @c
    protected hd_0 G() {
        return null;
    }

    @Override
    protected h4[] a() throws b_0 {
        return this.e(this.P.R(true));
    }

    private h4[] e(v_0[] v_0Array) throws b_0 {
        h4[] h4Array;
        block10: {
            int n10;
            String[] stringArray;
            int n11;
            block8: {
                block9: {
                    n11 = v_0Array.length;
                    stringArray = RG.C();
                    try {
                        try {
                            n10 = n11;
                            if (stringArray == null) break block8;
                            if (n10 != 0) break block9;
                        }
                        catch (b_0 b_02) {
                            throw ht_0.a(b_02);
                        }
                        return new h4[0];
                    }
                    catch (b_0 b_03) {
                        throw ht_0.a(b_03);
                    }
                }
                n10 = n11;
            }
            h4[] h4Array2 = new h4[n10];
            for (int i2 = 0; i2 < n11; ++i2) {
                try {
                    h4Array = h4Array2;
                    if (stringArray != null) {
                        h4Array[i2] = this.Q(v_0Array[i2]);
                        if (stringArray != null) continue;
                        break;
                    }
                    break block10;
                }
                catch (b_0 b_04) {
                    throw ht_0.a(b_04);
                }
            }
            h4Array = h4Array2;
        }
        return h4Array;
    }

    private h4 Q(v_0 v_02) throws b_0 {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        String[] stringArray = RG.C();
        for (Map.Entry entry : v_02.P.entrySet()) {
            Short s2 = (Short)entry.getKey();
            r_0 r_02 = (r_0)entry.getValue();
            Object object = r_02.d(new _T(this));
            hashMap.put(this.P.S(s2), object);
            if (stringArray != null) continue;
        }
        return new o_0(this, hashMap, v_02);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void S() throws ClassNotFoundException {
        var2_1 = 1;
        var1_2 = RG.C();
        while (var2_1 < this.P.u()) {
            block22: {
                block23: {
                    block21: {
                        block20: {
                            block18: {
                                var3_3 = this.P.R(var2_1);
                                try {
                                    block19: {
                                        try {
                                            try {
                                                v0 = var3_3 instanceof G;
                                                if (var1_2 == null) break block18;
                                                if (v0 == 0) break block19;
                                            }
                                            catch (ClassNotFoundException v1) {
                                                throw ht_0.a(v1);
                                            }
                                            this.w(var2_1);
                                            if (var1_2 != null) break block20;
                                        }
                                        catch (ClassNotFoundException v2) {
                                            throw ht_0.a(v2);
                                        }
                                    }
                                    v0 = var3_3 instanceof R;
                                }
                                catch (ClassNotFoundException v3) {
                                    throw ht_0.a(v3);
                                }
                            }
                            try {
                                if (var1_2 == null) break block21;
                                if (v0 == 0) break block20;
                            }
                            catch (ClassNotFoundException v4) {
                                throw ht_0.a(v4);
                            }
                            var4_4 = ((R)var3_3).U(this.P);
                            if (var4_4.charAt(0) != ht_0.b(24428, 8021850222998093578L)) ** GOTO lbl49
                            var5_5 = new f3(var4_4);
                            this.X(var5_5.O);
                            for (String var9_9 : var5_5.R) {
                                try {
                                    this.X(var9_9);
                                    if (var1_2 != null) {
                                        if (var1_2 != null) continue;
                                        break;
                                    }
                                    break block20;
                                }
                                catch (ClassNotFoundException v5) {
                                    throw ht_0.a(v5);
                                }
                            }
                            try {
                                if (var1_2 != null) break block20;
lbl49:
                                // 2 sources

                                this.X(var4_4);
                            }
                            catch (ClassNotFoundException v6) {
                                throw ht_0.a(v6);
                            }
                        }
                        v0 = var3_3.x();
                    }
                    try {
                        if (var1_2 == null) break block22;
                        if (v0 == 0) break block23;
                    }
                    catch (ClassNotFoundException v7) {
                        throw ht_0.a(v7);
                    }
                    var2_1 = (short)(var2_1 + 1);
                }
                v0 = var2_1 = (short)(var2_1 + 1);
            }
            if (var1_2 != null) continue;
        }
    }

    private hd_0 w(short s2) throws ClassNotFoundException {
        c.entering(null, ht_0.b(13591, -15158), s2);
        String string = this.P.X(s2).E(this.P);
        try {
            return this.X(f0.q(string));
        }
        catch (RuntimeException runtimeException) {
            throw new RuntimeException(ht_0.b(13584, -23181) + string + ht_0.b(13588, 27580) + runtimeException.getMessage(), runtimeException);
        }
    }

    private hd_0 X(String string) throws ClassNotFoundException {
        hd_0 hd_02;
        block10: {
            hd_0 hd_03;
            block11: {
                String[] stringArray;
                block8: {
                    block9: {
                        String[] stringArray2 = RG.C();
                        c.entering(null, ht_0.b(13590, 2035), string);
                        hd_03 = (hd_0)this.j.get(string);
                        stringArray = stringArray2;
                        try {
                            try {
                                hd_02 = hd_03;
                                if (stringArray == null) break block8;
                                if (hd_02 == null) break block9;
                            }
                            catch (ClassNotFoundException classNotFoundException) {
                                throw ht_0.a(classNotFoundException);
                            }
                            return hd_03;
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            throw ht_0.a(classNotFoundException);
                        }
                    }
                    hd_02 = hd_03 = this.U.X(string);
                }
                try {
                    try {
                        if (stringArray == null) break block10;
                        if (hd_02 != null) break block11;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        throw ht_0.a(classNotFoundException);
                    }
                    throw new ClassNotFoundException(string);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw ht_0.a(classNotFoundException);
                }
            }
            this.j.put(string, hd_03);
            hd_02 = hd_03;
        }
        return hd_02;
    }

    private hd_0[] x(short[] sArray) throws b_0 {
        hd_0[] hd_0Array;
        block5: {
            hd_0[] hd_0Array2 = new hd_0[sArray.length];
            String[] stringArray = RG.C();
            for (int i2 = 0; i2 < hd_0Array2.length; ++i2) {
                try {
                    hd_0Array = hd_0Array2;
                    if (stringArray != null) {
                        hd_0Array[i2] = this.w(sArray[i2]);
                        continue;
                    }
                    break block5;
                }
                catch (b_0 b_02) {
                    throw ht_0.a(b_02);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw new b_0(classNotFoundException.getMessage(), null);
                }
            }
            hd_0Array = hd_0Array2;
        }
        return hd_0Array;
    }

    /*
     * Loose catch block
     */
    private hu_0 j(org.H.P p2) throws ClassNotFoundException {
        hu_0 hu_02;
        block29: {
            h4[] h4Array;
            _S _S2;
            Y[] yArray;
            hd_0[] hd_0Array;
            hd_0 hd_02;
            String string;
            block28: {
                hd_0[] hd_0Array2;
                String[] stringArray;
                block25: {
                    hd_0[] hd_0Array3;
                    block26: {
                        int n10;
                        block23: {
                            Y[] yArray2;
                            block21: {
                                hu_0 hu_03;
                                block20: {
                                    hu_02 = (hu_0)this.k.get(p2);
                                    stringArray = RG.C();
                                    try {
                                        hu_03 = hu_02;
                                        if (stringArray == null) break block20;
                                        if (hu_03 == null) break block21;
                                    }
                                    catch (b_0 b_02) {
                                        throw ht_0.a(b_02);
                                    }
                                    hu_03 = hu_02;
                                }
                                return hu_03;
                            }
                            string = p2.s();
                            f3 f32 = new f3(p2.q());
                            hd_02 = this.X(f32.O);
                            hd_0Array = new hd_0[f32.R.length];
                            for (int i2 = 0; i2 < hd_0Array.length; ++i2) {
                                hd_0Array[i2] = this.X(f32.R[i2]);
                                if (stringArray != null) continue;
                            }
                            hd_0Array3 = null;
                            yArray = yArray2 = p2.i();
                            int n11 = yArray.length;
                            int n12 = 0;
                            while (n12 < n11) {
                                block22: {
                                    block24: {
                                        Y y2 = yArray[n12];
                                        if (stringArray == null) break block22;
                                        try {
                                            block27: {
                                                n10 = y2 instanceof cb_0;
                                                if (stringArray == null) break block23;
                                                break block27;
                                                catch (b_0 b_03) {
                                                    throw ht_0.a(b_03);
                                                }
                                            }
                                            if (n10 == 0) break block24;
                                        }
                                        catch (b_0 b_04) {
                                            throw ht_0.a(b_04);
                                        }
                                        G[] gArray = ((cb_0)y2).m(this.P);
                                        hd_0Array3 = new hd_0[gArray.length];
                                        for (int i3 = 0; i3 < hd_0Array3.length; ++i3) {
                                            try {
                                                hd_0Array3[i3] = this.X(f0.q(gArray[i3].E(this.P)));
                                                if (stringArray != null) {
                                                    if (stringArray != null) continue;
                                                    break;
                                                }
                                                break block22;
                                            }
                                            catch (b_0 b_05) {
                                                throw ht_0.a(b_05);
                                            }
                                        }
                                    }
                                    ++n12;
                                }
                                if (stringArray != null) continue;
                            }
                            try {
                                hd_0Array2 = hd_0Array3;
                                if (stringArray == null) break block25;
                                if (hd_0Array2 != null) break block26;
                            }
                            catch (b_0 b_06) {
                                throw ht_0.a(b_06);
                            }
                            n10 = 0;
                        }
                        hd_0Array2 = new hd_0[n10];
                        break block25;
                    }
                    hd_0Array2 = hd_0Array3;
                }
                yArray = hd_0Array2;
                _S2 = ht_0.i(p2.D());
                try {
                    h4Array = this.e(p2.R(true));
                }
                catch (b_0 b_07) {
                    throw new P(b_07.getMessage(), b_07);
                }
                if (!ht_0.b(13589, 2489).equals(string)) break block28;
                hu_02 = new h5(this, p2, hd_0Array, (hd_0[])yArray, _S2, h4Array);
                if (stringArray != null) break block29;
            }
            hu_02 = new hM(this, h4Array, _S2, p2, hd_02, string, hd_0Array, (hd_0[])yArray);
        }
        this.k.put(p2, hu_02);
        return hu_02;
    }

    /*
     * Loose catch block
     */
    private u_1 R(c_0 c_02) throws ClassNotFoundException {
        h4[] h4Array;
        Object object;
        Object object2;
        hd_0 hd_02;
        String string;
        u_1 u_12;
        block15: {
            ce_0 ce_02;
            block16: {
                ce_0 ce_03;
                block14: {
                    String[] stringArray;
                    block12: {
                        u_1 u_13;
                        block11: {
                            u_12 = (u_1)this.a.get(c_02);
                            stringArray = RG.C();
                            try {
                                u_13 = u_12;
                                if (stringArray == null) break block11;
                                if (u_13 == null) break block12;
                            }
                            catch (b_0 b_02) {
                                throw ht_0.a(b_02);
                            }
                            u_13 = u_12;
                        }
                        return u_13;
                    }
                    string = c_02.K(this.P);
                    String string2 = c_02.P(this.P);
                    hd_02 = this.X(string2);
                    ce_03 = null;
                    object2 = c_02.M();
                    int n10 = ((Y[])object2).length;
                    int n11 = 0;
                    while (n11 < n10) {
                        block13: {
                            Y y2 = object2[n11];
                            try {
                                if (stringArray == null) continue;
                                if (!(y2 instanceof ce_0)) break block13;
                            }
                            catch (b_0 b_03) {
                                throw ht_0.a(b_03);
                            }
                            ce_03 = (ce_0)y2;
                            break;
                        }
                        ++n11;
                    }
                    ce_02 = ce_03;
                    if (stringArray == null) break block16;
                    try {
                        block17: {
                            if (ce_02 != null) break block14;
                            break block17;
                            catch (b_0 b_04) {
                                throw ht_0.a(b_04);
                            }
                        }
                        object = hd_0.M;
                        break block15;
                    }
                    catch (b_0 b_05) {
                        throw ht_0.a(b_05);
                    }
                }
                ce_02 = ce_03;
            }
            object = ce_02.j(this.P).w(this.P);
        }
        object2 = object;
        _S _S2 = ht_0.i(c_02.w());
        try {
            h4Array = this.e(c_02.R(true));
        }
        catch (b_0 b_06) {
            throw new P(b_06.getMessage(), b_06);
        }
        u_12 = new z_2(this, object2, string, hd_02, c_02, _S2, h4Array);
        this.a.put(c_02, u_12);
        return u_12;
    }

    private static _S i(short s2) {
        _S _S2;
        block12: {
            boolean bl;
            block13: {
                block14: {
                    String[] stringArray;
                    block10: {
                        block11: {
                            stringArray = RG.C();
                            try {
                                try {
                                    bl = f7.N(s2);
                                    if (stringArray == null) break block10;
                                    if (!bl) break block11;
                                }
                                catch (P p2) {
                                    throw ht_0.a(p2);
                                }
                                _S2 = _S.PUBLIC;
                                break block12;
                            }
                            catch (P p3) {
                                throw ht_0.a(p3);
                            }
                        }
                        bl = f7.S(s2);
                    }
                    try {
                        try {
                            if (stringArray == null) break block13;
                            if (!bl) break block14;
                        }
                        catch (P p5) {
                            throw ht_0.a(p5);
                        }
                        _S2 = _S.PROTECTED;
                        break block12;
                    }
                    catch (P p6) {
                        throw ht_0.a(p6);
                    }
                }
                bl = f7.c(s2);
            }
            try {
                _S2 = bl ? _S.PRIVATE : _S.DEFAULT;
            }
            catch (P p7) {
                throw ht_0.a(p7);
            }
        }
        return _S2;
    }

    static _L U(ht_0 ht_02) {
        return ht_02.U;
    }

    static cr_0 j(ht_0 ht_02) {
        return ht_02.P;
    }

    static hd_0 p(ht_0 ht_02, String string) throws ClassNotFoundException {
        return ht_02.X(string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    block21: {
                        var13 = new String[6];
                        var11_1 = 0;
                        var10_2 = "\u00ab\u00a3m\u0006z\u00de\u00c4\u0090GL\r\rG\u00b0(o\u00d5#\u00b14d\u00aa\u0016O\f@\u001c\u0019CZ\u00b8\u0085\u0016\u00cf\u00d6\r\u00ec";
                        var12_3 = "\u00ab\u00a3m\u0006z\u00de\u00c4\u0090GL\r\rG\u00b0(o\u00d5#\u00b14d\u00aa\u0016O\f@\u001c\u0019CZ\u00b8\u0085\u0016\u00cf\u00d6\r\u00ec".length();
                        var9_4 = 3;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = 94;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block21;
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
                            var10_2 = "\u0017\u00b3\u00f9\u0098h\u00ed\u00e1\u00bf\u00eb\u0004\u00dd\u00ee\u00df+\u0011\u00acm\u0017C\u009f\u00b7\u001d\u00bbB\u0095\u00bf\u00c5\u007f\u00bd\u00b3\u0097\u00f8\u00f1\u00d3\u00c6\u008c\u00e2=z\u00d13";
                            var12_3 = "\u0017\u00b3\u00f9\u0098h\u00ed\u00e1\u00bf\u00eb\u0004\u00dd\u00ee\u00df+\u0011\u00acm\u0017C\u009f\u00b7\u001d\u00bbB\u0095\u00bf\u00c5\u007f\u00bd\u00b3\u0097\u00f8\u00f1\u00d3\u00c6\u008c\u00e2=z\u00d13".length();
                            var9_4 = 17;
                            var8_5 = -1;
lbl22:
                            // 2 sources

                            while (true) {
                                v0 = 60;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block21;
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
                            break block22;
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
                                    v15 = 36;
                                    break;
                                }
                                case 1: {
                                    v15 = 101;
                                    break;
                                }
                                case 2: {
                                    v15 = 79;
                                    break;
                                }
                                case 3: {
                                    v15 = 95;
                                    break;
                                }
                                case 4: {
                                    v15 = 116;
                                    break;
                                }
                                case 5: {
                                    v15 = 90;
                                    break;
                                }
                                default: {
                                    v15 = 81;
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
                ht_0.q = var13;
                ht_0.B = new String[6];
                var0_7 = 354518284994571314L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "6'\u0091\u00ad\u00d2\u00b8\u00f4\u001f\u00c5\u00f8mT\u00ccK\u0013\u0010";
                var5_11 = "6'\u0091\u00ad\u00d2\u00b8\u00f4\u001f\u00c5\u00f8mT\u00ccK\u0013\u0010".length();
                var2_12 = 0;
                while (true) {
                    break block23;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_8[v17] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v17 = var3_9++;
            ** while (true)
        }
        ht_0.F = var6_8;
        ht_0.Q = new Integer[2];
        ht_0.c = Logger.getLogger(ht_0.class.getName());
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0x3514) & 0xFFFF;
        if (B[n12] == null) {
            int n13;
            int n14;
            char[] cArray = q[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 125;
                    break;
                }
                case 1: {
                    n14 = 180;
                    break;
                }
                case 2: {
                    n14 = 243;
                    break;
                }
                case 3: {
                    n14 = 207;
                    break;
                }
                case 4: {
                    n14 = 242;
                    break;
                }
                case 5: {
                    n14 = 124;
                    break;
                }
                case 6: {
                    n14 = 147;
                    break;
                }
                case 7: {
                    n14 = 106;
                    break;
                }
                case 8: {
                    n14 = 145;
                    break;
                }
                case 9: {
                    n14 = 184;
                    break;
                }
                case 10: {
                    n14 = 251;
                    break;
                }
                case 11: {
                    n14 = 88;
                    break;
                }
                case 12: {
                    n14 = 232;
                    break;
                }
                case 13: {
                    n14 = 245;
                    break;
                }
                case 14: {
                    n14 = 120;
                    break;
                }
                case 15: {
                    n14 = 22;
                    break;
                }
                case 16: {
                    n14 = 172;
                    break;
                }
                case 17: {
                    n14 = 231;
                    break;
                }
                case 18: {
                    n14 = 31;
                    break;
                }
                case 19: {
                    n14 = 89;
                    break;
                }
                case 20: {
                    n14 = 186;
                    break;
                }
                case 21: {
                    n14 = 3;
                    break;
                }
                case 22: {
                    n14 = 248;
                    break;
                }
                case 23: {
                    n14 = 135;
                    break;
                }
                case 24: {
                    n14 = 7;
                    break;
                }
                case 25: {
                    n14 = 86;
                    break;
                }
                case 26: {
                    n14 = 35;
                    break;
                }
                case 27: {
                    n14 = 153;
                    break;
                }
                case 28: {
                    n14 = 36;
                    break;
                }
                case 29: {
                    n14 = 220;
                    break;
                }
                case 30: {
                    n14 = 185;
                    break;
                }
                case 31: {
                    n14 = 138;
                    break;
                }
                case 32: {
                    n14 = 154;
                    break;
                }
                case 33: {
                    n14 = 246;
                    break;
                }
                case 34: {
                    n14 = 202;
                    break;
                }
                case 35: {
                    n14 = 56;
                    break;
                }
                case 36: {
                    n14 = 164;
                    break;
                }
                case 37: {
                    n14 = 95;
                    break;
                }
                case 38: {
                    n14 = 25;
                    break;
                }
                case 39: {
                    n14 = 57;
                    break;
                }
                case 40: {
                    n14 = 121;
                    break;
                }
                case 41: {
                    n14 = 241;
                    break;
                }
                case 42: {
                    n14 = 183;
                    break;
                }
                case 43: {
                    n14 = 67;
                    break;
                }
                case 44: {
                    n14 = 240;
                    break;
                }
                case 45: {
                    n14 = 157;
                    break;
                }
                case 46: {
                    n14 = 74;
                    break;
                }
                case 47: {
                    n14 = 96;
                    break;
                }
                case 48: {
                    n14 = 73;
                    break;
                }
                case 49: {
                    n14 = 71;
                    break;
                }
                case 50: {
                    n14 = 129;
                    break;
                }
                case 51: {
                    n14 = 177;
                    break;
                }
                case 52: {
                    n14 = 39;
                    break;
                }
                case 53: {
                    n14 = 29;
                    break;
                }
                case 54: {
                    n14 = 252;
                    break;
                }
                case 55: {
                    n14 = 79;
                    break;
                }
                case 56: {
                    n14 = 234;
                    break;
                }
                case 57: {
                    n14 = 83;
                    break;
                }
                case 58: {
                    n14 = 130;
                    break;
                }
                case 59: {
                    n14 = 53;
                    break;
                }
                case 60: {
                    n14 = 93;
                    break;
                }
                case 61: {
                    n14 = 11;
                    break;
                }
                case 62: {
                    n14 = 94;
                    break;
                }
                case 63: {
                    n14 = 239;
                    break;
                }
                case 64: {
                    n14 = 20;
                    break;
                }
                case 65: {
                    n14 = 43;
                    break;
                }
                case 66: {
                    n14 = 255;
                    break;
                }
                case 67: {
                    n14 = 198;
                    break;
                }
                case 68: {
                    n14 = 159;
                    break;
                }
                case 69: {
                    n14 = 179;
                    break;
                }
                case 70: {
                    n14 = 249;
                    break;
                }
                case 71: {
                    n14 = 70;
                    break;
                }
                case 72: {
                    n14 = 112;
                    break;
                }
                case 73: {
                    n14 = 2;
                    break;
                }
                case 74: {
                    n14 = 48;
                    break;
                }
                case 75: {
                    n14 = 105;
                    break;
                }
                case 76: {
                    n14 = 221;
                    break;
                }
                case 77: {
                    n14 = 10;
                    break;
                }
                case 78: {
                    n14 = 149;
                    break;
                }
                case 79: {
                    n14 = 85;
                    break;
                }
                case 80: {
                    n14 = 13;
                    break;
                }
                case 81: {
                    n14 = 46;
                    break;
                }
                case 82: {
                    n14 = 6;
                    break;
                }
                case 83: {
                    n14 = 14;
                    break;
                }
                case 84: {
                    n14 = 161;
                    break;
                }
                case 85: {
                    n14 = 211;
                    break;
                }
                case 86: {
                    n14 = 208;
                    break;
                }
                case 87: {
                    n14 = 19;
                    break;
                }
                case 88: {
                    n14 = 225;
                    break;
                }
                case 89: {
                    n14 = 196;
                    break;
                }
                case 90: {
                    n14 = 21;
                    break;
                }
                case 91: {
                    n14 = 151;
                    break;
                }
                case 92: {
                    n14 = 1;
                    break;
                }
                case 93: {
                    n14 = 173;
                    break;
                }
                case 94: {
                    n14 = 143;
                    break;
                }
                case 95: {
                    n14 = 28;
                    break;
                }
                case 96: {
                    n14 = 237;
                    break;
                }
                case 97: {
                    n14 = 37;
                    break;
                }
                case 98: {
                    n14 = 229;
                    break;
                }
                case 99: {
                    n14 = 41;
                    break;
                }
                case 100: {
                    n14 = 75;
                    break;
                }
                case 101: {
                    n14 = 52;
                    break;
                }
                case 102: {
                    n14 = 178;
                    break;
                }
                case 103: {
                    n14 = 224;
                    break;
                }
                case 104: {
                    n14 = 187;
                    break;
                }
                case 105: {
                    n14 = 217;
                    break;
                }
                case 106: {
                    n14 = 34;
                    break;
                }
                case 107: {
                    n14 = 55;
                    break;
                }
                case 108: {
                    n14 = 90;
                    break;
                }
                case 109: {
                    n14 = 91;
                    break;
                }
                case 110: {
                    n14 = 64;
                    break;
                }
                case 111: {
                    n14 = 134;
                    break;
                }
                case 112: {
                    n14 = 195;
                    break;
                }
                case 113: {
                    n14 = 63;
                    break;
                }
                case 114: {
                    n14 = 47;
                    break;
                }
                case 115: {
                    n14 = 72;
                    break;
                }
                case 116: {
                    n14 = 26;
                    break;
                }
                case 117: {
                    n14 = 247;
                    break;
                }
                case 118: {
                    n14 = 76;
                    break;
                }
                case 119: {
                    n14 = 238;
                    break;
                }
                case 120: {
                    n14 = 163;
                    break;
                }
                case 121: {
                    n14 = 32;
                    break;
                }
                case 122: {
                    n14 = 199;
                    break;
                }
                case 123: {
                    n14 = 142;
                    break;
                }
                case 124: {
                    n14 = 215;
                    break;
                }
                case 125: {
                    n14 = 254;
                    break;
                }
                case 126: {
                    n14 = 84;
                    break;
                }
                case 127: {
                    n14 = 212;
                    break;
                }
                case 128: {
                    n14 = 210;
                    break;
                }
                case 129: {
                    n14 = 109;
                    break;
                }
                case 130: {
                    n14 = 116;
                    break;
                }
                case 131: {
                    n14 = 236;
                    break;
                }
                case 132: {
                    n14 = 77;
                    break;
                }
                case 133: {
                    n14 = 158;
                    break;
                }
                case 134: {
                    n14 = 100;
                    break;
                }
                case 135: {
                    n14 = 81;
                    break;
                }
                case 136: {
                    n14 = 4;
                    break;
                }
                case 137: {
                    n14 = 97;
                    break;
                }
                case 138: {
                    n14 = 233;
                    break;
                }
                case 139: {
                    n14 = 117;
                    break;
                }
                case 140: {
                    n14 = 148;
                    break;
                }
                case 141: {
                    n14 = 15;
                    break;
                }
                case 142: {
                    n14 = 190;
                    break;
                }
                case 143: {
                    n14 = 23;
                    break;
                }
                case 144: {
                    n14 = 131;
                    break;
                }
                case 145: {
                    n14 = 123;
                    break;
                }
                case 146: {
                    n14 = 51;
                    break;
                }
                case 147: {
                    n14 = 140;
                    break;
                }
                case 148: {
                    n14 = 99;
                    break;
                }
                case 149: {
                    n14 = 189;
                    break;
                }
                case 150: {
                    n14 = 82;
                    break;
                }
                case 151: {
                    n14 = 191;
                    break;
                }
                case 152: {
                    n14 = 222;
                    break;
                }
                case 153: {
                    n14 = 218;
                    break;
                }
                case 154: {
                    n14 = 40;
                    break;
                }
                case 155: {
                    n14 = 175;
                    break;
                }
                case 156: {
                    n14 = 193;
                    break;
                }
                case 157: {
                    n14 = 169;
                    break;
                }
                case 158: {
                    n14 = 166;
                    break;
                }
                case 159: {
                    n14 = 194;
                    break;
                }
                case 160: {
                    n14 = 104;
                    break;
                }
                case 161: {
                    n14 = 152;
                    break;
                }
                case 162: {
                    n14 = 155;
                    break;
                }
                case 163: {
                    n14 = 250;
                    break;
                }
                case 164: {
                    n14 = 167;
                    break;
                }
                case 165: {
                    n14 = 209;
                    break;
                }
                case 166: {
                    n14 = 80;
                    break;
                }
                case 167: {
                    n14 = 5;
                    break;
                }
                case 168: {
                    n14 = 136;
                    break;
                }
                case 169: {
                    n14 = 126;
                    break;
                }
                case 170: {
                    n14 = 171;
                    break;
                }
                case 171: {
                    n14 = 108;
                    break;
                }
                case 172: {
                    n14 = 69;
                    break;
                }
                case 173: {
                    n14 = 24;
                    break;
                }
                case 174: {
                    n14 = 200;
                    break;
                }
                case 175: {
                    n14 = 133;
                    break;
                }
                case 176: {
                    n14 = 62;
                    break;
                }
                case 177: {
                    n14 = 174;
                    break;
                }
                case 178: {
                    n14 = 45;
                    break;
                }
                case 179: {
                    n14 = 107;
                    break;
                }
                case 180: {
                    n14 = 139;
                    break;
                }
                case 181: {
                    n14 = 42;
                    break;
                }
                case 182: {
                    n14 = 54;
                    break;
                }
                case 183: {
                    n14 = 223;
                    break;
                }
                case 184: {
                    n14 = 204;
                    break;
                }
                case 185: {
                    n14 = 58;
                    break;
                }
                case 186: {
                    n14 = 197;
                    break;
                }
                case 187: {
                    n14 = 114;
                    break;
                }
                case 188: {
                    n14 = 44;
                    break;
                }
                case 189: {
                    n14 = 122;
                    break;
                }
                case 190: {
                    n14 = 0;
                    break;
                }
                case 191: {
                    n14 = 253;
                    break;
                }
                case 192: {
                    n14 = 12;
                    break;
                }
                case 193: {
                    n14 = 170;
                    break;
                }
                case 194: {
                    n14 = 65;
                    break;
                }
                case 195: {
                    n14 = 132;
                    break;
                }
                case 196: {
                    n14 = 188;
                    break;
                }
                case 197: {
                    n14 = 192;
                    break;
                }
                case 198: {
                    n14 = 30;
                    break;
                }
                case 199: {
                    n14 = 156;
                    break;
                }
                case 200: {
                    n14 = 113;
                    break;
                }
                case 201: {
                    n14 = 165;
                    break;
                }
                case 202: {
                    n14 = 17;
                    break;
                }
                case 203: {
                    n14 = 33;
                    break;
                }
                case 204: {
                    n14 = 137;
                    break;
                }
                case 205: {
                    n14 = 160;
                    break;
                }
                case 206: {
                    n14 = 227;
                    break;
                }
                case 207: {
                    n14 = 101;
                    break;
                }
                case 208: {
                    n14 = 144;
                    break;
                }
                case 209: {
                    n14 = 201;
                    break;
                }
                case 210: {
                    n14 = 244;
                    break;
                }
                case 211: {
                    n14 = 92;
                    break;
                }
                case 212: {
                    n14 = 203;
                    break;
                }
                case 213: {
                    n14 = 16;
                    break;
                }
                case 214: {
                    n14 = 230;
                    break;
                }
                case 215: {
                    n14 = 38;
                    break;
                }
                case 216: {
                    n14 = 168;
                    break;
                }
                case 217: {
                    n14 = 150;
                    break;
                }
                case 218: {
                    n14 = 87;
                    break;
                }
                case 219: {
                    n14 = 18;
                    break;
                }
                case 220: {
                    n14 = 226;
                    break;
                }
                case 221: {
                    n14 = 219;
                    break;
                }
                case 222: {
                    n14 = 127;
                    break;
                }
                case 223: {
                    n14 = 119;
                    break;
                }
                case 224: {
                    n14 = 176;
                    break;
                }
                case 225: {
                    n14 = 102;
                    break;
                }
                case 226: {
                    n14 = 50;
                    break;
                }
                case 227: {
                    n14 = 68;
                    break;
                }
                case 228: {
                    n14 = 128;
                    break;
                }
                case 229: {
                    n14 = 103;
                    break;
                }
                case 230: {
                    n14 = 162;
                    break;
                }
                case 231: {
                    n14 = 49;
                    break;
                }
                case 232: {
                    n14 = 235;
                    break;
                }
                case 233: {
                    n14 = 118;
                    break;
                }
                case 234: {
                    n14 = 228;
                    break;
                }
                case 235: {
                    n14 = 98;
                    break;
                }
                case 236: {
                    n14 = 213;
                    break;
                }
                case 237: {
                    n14 = 182;
                    break;
                }
                case 238: {
                    n14 = 216;
                    break;
                }
                case 239: {
                    n14 = 66;
                    break;
                }
                case 240: {
                    n14 = 78;
                    break;
                }
                case 241: {
                    n14 = 59;
                    break;
                }
                case 242: {
                    n14 = 60;
                    break;
                }
                case 243: {
                    n14 = 8;
                    break;
                }
                case 244: {
                    n14 = 214;
                    break;
                }
                case 245: {
                    n14 = 146;
                    break;
                }
                case 246: {
                    n14 = 111;
                    break;
                }
                case 247: {
                    n14 = 141;
                    break;
                }
                case 248: {
                    n14 = 9;
                    break;
                }
                case 249: {
                    n14 = 110;
                    break;
                }
                case 250: {
                    n14 = 27;
                    break;
                }
                case 251: {
                    n14 = 205;
                    break;
                }
                case 252: {
                    n14 = 206;
                    break;
                }
                case 253: {
                    n14 = 61;
                    break;
                }
                case 254: {
                    n14 = 115;
                    break;
                }
                default: {
                    n14 = 181;
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
            ht_0.B[n12] = new String(cArray).intern();
        }
        return B[n12];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2067;
        if (Q[n11] == null) {
            ht_0.Q[n11] = (int)(F[n11] ^ l2);
        }
        return Q[n11];
    }
}

