/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.F.c;
import org.P;
import org.b_0;
import org.l.F;
import org.v.NA;
import org.v.NH;
import org.v.NS;
import org.v.NU;
import org.v.RD;
import org.v.RF;
import org.v.RG;
import org.v.RW;
import org.v._1;
import org.v._B;
import org.v._D;
import org.v._E;
import org.v._G;
import org.v._J;
import org.v._O;
import org.v._S;
import org.v._U;
import org.v._Y;
import org.v._f_0;
import org.v._h_0;
import org.v._i_0;
import org.v._j_0;
import org.v._n_0;
import org.v._q_0;
import org.v.c_1;
import org.v.f0;
import org.v.fW;
import org.v.h4;
import org.v.hP;
import org.v.hQ;
import org.v.hV;
import org.v.h_1;
import org.v.hd_0;
import org.v.hf_0;
import org.v.hv_0;
import org.v.k_0;
import org.v.k_1;
import org.v.nt_0;
import org.v.q_2;
import org.v.u_1;
import org.v.x_1;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from org.v.hg
 */
class hg_0
extends hd_0 {
    @c
    private hd_0[] q;
    static final boolean U;
    final _i_0 J;
    final k_0 P;
    final h_1 j;
    private static final String[] a;
    private static final String[] c;

    hg_0(h_1 h_12, _i_0 _i_02, k_0 k_02) {
        this.j = h_12;
        this.J = _i_02;
        this.P = k_02;
    }

    @Override
    protected _J[] V() throws b_0 {
        _U[] _UArray;
        _U[] _UArray2;
        String[] stringArray;
        block23: {
            block24: {
                _i_0 _i_02;
                block21: {
                    block22: {
                        stringArray = RG.C();
                        try {
                            try {
                                _i_02 = this.J;
                                if (stringArray == null) break block21;
                                if (_i_02 instanceof _Y) break block22;
                            }
                            catch (b_0 b_02) {
                                throw hg_0.a(b_02);
                            }
                            return new _J[0];
                        }
                        catch (b_0 b_03) {
                            throw hg_0.a(b_03);
                        }
                    }
                    _i_02 = this.J;
                }
                _Y _Y2 = (_Y)((Object)_i_02);
                _UArray2 = _Y2.a();
                try {
                    try {
                        _UArray = _UArray2;
                        if (stringArray == null) break block23;
                        if (_UArray != null) break block24;
                    }
                    catch (b_0 b_04) {
                        throw hg_0.a(b_04);
                    }
                    return new _J[0];
                }
                catch (b_0 b_05) {
                    throw hg_0.a(b_05);
                }
            }
            _UArray = _UArray2;
        }
        _J[] _JArray = new _J[_UArray.length];
        int n10 = 0;
        block18: while (true) {
            int n11 = n10;
            block19: while (n11 < _JArray.length) {
                int n12;
                _U _U2;
                block27: {
                    NA[] nAArray;
                    block25: {
                        block26: {
                            _U2 = _UArray2[n10];
                            try {
                                try {
                                    nAArray = _U2.t;
                                    if (stringArray == null) break block25;
                                    if (nAArray != null) break block26;
                                }
                                catch (b_0 b_06) {
                                    throw hg_0.a(b_06);
                                }
                                n12 = 0;
                                break block27;
                            }
                            catch (b_0 b_07) {
                                throw hg_0.a(b_07);
                            }
                        }
                        nAArray = _U2.t;
                    }
                    n12 = nAArray.length;
                }
                _f_0[] _f_0Array = new _f_0[n12];
                int n13 = 0;
                while (n13 < _f_0Array.length) {
                    block28: {
                        q_2 q_22;
                        block29: {
                            q_22 = h_1.v(this.j, _U2.t[n13]);
                            try {
                                if (stringArray == null) break block28;
                                n11 = U ? 1 : 0;
                                if (stringArray == null) continue block19;
                            }
                            catch (b_0 b_08) {
                                throw hg_0.a(b_08);
                            }
                            try {
                                try {
                                    if (n11 != 0 || q_22 instanceof _f_0) break block29;
                                }
                                catch (b_0 b_09) {
                                    throw hg_0.a(b_09);
                                }
                                throw new AssertionError();
                            }
                            catch (b_0 b_010) {
                                throw hg_0.a(b_010);
                            }
                        }
                        _f_0Array[n13] = (_f_0)q_22;
                        ++n13;
                    }
                    if (stringArray != null) continue;
                }
                _JArray[n10] = new c_1(this, _U2, _f_0Array);
                ++n10;
                if (stringArray != null) continue block18;
            }
            break;
        }
        return _JArray;
    }

    @Override
    protected hP[] H() {
        ArrayList<hP> arrayList;
        block8: {
            arrayList = new ArrayList<hP>(this.J.d().size());
            String[] stringArray = RG.C();
            for (NS nS2 : this.J.d()) {
                try {
                    arrayList.add(this.j.Y(nS2));
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                        break;
                    }
                    break block8;
                }
                catch (P p2) {
                    throw hg_0.a(p2);
                }
            }
            try {
                boolean bl;
                try {
                    bl = this.P instanceof k_1;
                    if (stringArray == null || !bl) break block8;
                }
                catch (P p3) {
                    throw hg_0.a(p3);
                }
                arrayList.add(new hQ(this));
                bl = arrayList.add(new hf_0(this));
            }
            catch (P p5) {
                throw hg_0.a(p5);
            }
        }
        return arrayList.toArray(new hP[arrayList.size()]);
    }

    @Override
    protected hd_0[] j() {
        hd_0[] hd_0Array;
        block10: {
            hg_0 hg_02;
            String[] stringArray;
            block8: {
                block9: {
                    stringArray = RG.C();
                    try {
                        try {
                            hg_02 = this;
                            if (stringArray == null) break block8;
                            if (hg_02.q == null) break block9;
                        }
                        catch (P p2) {
                            throw hg_0.a(p2);
                        }
                        return this.q;
                    }
                    catch (P p3) {
                        throw hg_0.a(p3);
                    }
                }
                hg_02 = this;
            }
            Collection collection = hg_02.P.L();
            hd_0[] hd_0Array2 = new hd_0[collection.size()];
            int n10 = 0;
            for (RW rW : collection) {
                try {
                    hd_0Array = hd_0Array2;
                    if (stringArray != null) {
                        hd_0Array[n10++] = h_1.e(this.j, rW);
                        if (stringArray != null) continue;
                        break;
                    }
                    break block10;
                }
                catch (P p5) {
                    throw hg_0.a(p5);
                }
            }
            this.q = hd_0Array2;
            hd_0Array = this.q;
        }
        return hd_0Array;
    }

    @Override
    @c
    protected hd_0 V() {
        _i_0 _i_02 = this.J;
        String[] stringArray = RG.C();
        while (!(_i_02 instanceof fW)) {
            block5: {
                x_1 x_12;
                block6: {
                    try {
                        try {
                            x_12 = _i_02;
                            if (stringArray == null) break block5;
                            if (!(x_12 instanceof RD)) break block6;
                        }
                        catch (P p2) {
                            throw hg_0.a(p2);
                        }
                        return null;
                    }
                    catch (P p3) {
                        throw hg_0.a(p3);
                    }
                }
                x_12 = _i_02 = _i_02.y();
            }
            if (stringArray != null) continue;
        }
        return h_1.e(this.j, (_i_0)_i_02.y());
    }

    @Override
    @c
    protected hd_0 l() {
        _i_0 _i_02 = (_i_0)h_1.V(this.J);
        try {
            if (_i_02 == null) {
                return null;
            }
        }
        catch (P p2) {
            throw hg_0.a(p2);
        }
        return h_1.e(this.j, _i_02);
    }

    @Override
    protected String J() {
        return f0.n(this.J.R());
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    protected hd_0 G() {
        throw new P(this.P.Q(), hg_0.b(-18572, -13878));
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
    protected hv_0[] C() {
        int n10;
        block6: {
            block7: {
                hv_0[] hv_0Array;
                block8: {
                    String[] stringArray = RG.C();
                    try {
                        n10 = this.J instanceof _q_0;
                        if (stringArray == null) break block6;
                        if (n10 == 0) break block7;
                    }
                    catch (P p2) {
                        throw hg_0.a(p2);
                    }
                    _q_0 _q_02 = (_q_0)this.J;
                    NU[] nUArray = _q_02.z();
                    hv_0[] hv_0Array2 = new hv_0[nUArray.length];
                    for (int i2 = 0; i2 < nUArray.length; ++i2) {
                        try {
                            hv_0Array = hv_0Array2;
                            if (stringArray != null) {
                                hv_0Array[i2] = this.j.Z(nUArray[i2]);
                                if (stringArray != null) continue;
                                break;
                            }
                            break block8;
                        }
                        catch (P p3) {
                            throw hg_0.a(p3);
                        }
                    }
                    hv_0Array = hv_0Array2;
                }
                return hv_0Array;
            }
            n10 = 0;
        }
        return new hv_0[n10];
    }

    @Override
    protected u_1[] A() {
        block28: {
            u_1[] u_1Array;
            ArrayList<u_1> arrayList;
            block29: {
                _i_0 _i_02;
                String[] stringArray;
                block27: {
                    boolean bl;
                    block22: {
                        block23: {
                            ArrayList<u_1> arrayList2;
                            ArrayList<u_1> arrayList3;
                            block26: {
                                block24: {
                                    _i_0 _i_03;
                                    block25: {
                                        stringArray = RG.C();
                                        try {
                                            bl = this.J instanceof _q_0;
                                            if (stringArray == null) break block22;
                                            if (!bl) break block23;
                                        }
                                        catch (P p2) {
                                            throw hg_0.a(p2);
                                        }
                                        _q_0 _q_02 = (_q_0)this.J;
                                        arrayList3 = new ArrayList<u_1>();
                                        for (Object object : F.L(_q_02.I, RF.class)) {
                                            try {
                                                arrayList3.addAll(Arrays.asList(h_1.N(this.j, (RF)object)));
                                                if (stringArray != null) {
                                                    if (stringArray != null) continue;
                                                    break;
                                                }
                                                break block24;
                                            }
                                            catch (P p3) {
                                                throw hg_0.a(p3);
                                            }
                                        }
                                        try {
                                            try {
                                                _i_03 = this.J;
                                                if (stringArray == null) break block25;
                                                if (!(_i_03 instanceof k_1)) break block24;
                                            }
                                            catch (P p5) {
                                                throw hg_0.a(p5);
                                            }
                                            _i_03 = this.J;
                                        }
                                        catch (P p6) {
                                            throw hg_0.a(p6);
                                        }
                                    }
                                    k_1 k_12 = (k_1)((Object)_i_03);
                                    for (_B _B2 : k_12.N()) {
                                        try {
                                            arrayList2 = arrayList3;
                                            if (stringArray != null) {
                                                arrayList2.add(h_1.E(this.j, k_12, new hV[0], _S.PUBLIC, true, true, new NH(k_12.Q(), h_1.e(this.j, k_12)), 0, _B2.f, null));
                                                if (stringArray != null) continue;
                                                break;
                                            }
                                            break block26;
                                        }
                                        catch (P p7) {
                                            throw hg_0.a(p7);
                                        }
                                    }
                                }
                                arrayList2 = arrayList3;
                            }
                            return arrayList2.toArray(new u_1[arrayList3.size()]);
                        }
                        try {
                            _i_02 = this.J;
                            if (stringArray == null) break block27;
                            bl = _i_02 instanceof _n_0;
                        }
                        catch (P p8) {
                            throw hg_0.a(p8);
                        }
                    }
                    try {
                        if (!bl) break block28;
                        _i_02 = this.J;
                    }
                    catch (P p9) {
                        throw hg_0.a(p9);
                    }
                }
                _n_0 _n_02 = (_n_0)_i_02;
                ArrayList<u_1> arrayList4 = new ArrayList<u_1>();
                for (RF rF : F.L(_n_02.Q, RF.class)) {
                    try {
                        arrayList = arrayList4;
                        u_1Array = h_1.N(this.j, rF);
                        if (stringArray != null) {
                            arrayList.addAll(Arrays.asList(u_1Array));
                            if (stringArray != null) continue;
                            break;
                        }
                        break block29;
                    }
                    catch (P p10) {
                        throw hg_0.a(p10);
                    }
                }
                arrayList = arrayList4;
                u_1Array = new u_1[arrayList4.size()];
            }
            return arrayList.toArray(u_1Array);
        }
        throw new P(this.P.Q(), hg_0.b(-18575, 32705));
    }

    @Override
    public u_1[] I() {
        int n10;
        block2: {
            block3: {
                String[] stringArray = RG.C();
                try {
                    n10 = this.J instanceof _q_0;
                    if (stringArray == null) break block2;
                    if (n10 == 0) break block3;
                }
                catch (P p2) {
                    throw hg_0.a(p2);
                }
                Collection collection = ((_q_0)this.J).E.values();
                return collection.toArray(new u_1[collection.size()]);
            }
            n10 = 0;
        }
        return new u_1[n10];
    }

    @Override
    @c
    protected hd_0 g() throws b_0 {
        block28: {
            hd_0 hd_02;
            block29: {
                hd_0 hd_03;
                block30: {
                    _i_0 _i_02;
                    String[] stringArray;
                    block27: {
                        boolean bl;
                        block23: {
                            block24: {
                                hd_0 hd_04;
                                block25: {
                                    hd_0 hd_05;
                                    block26: {
                                        block21: {
                                            block22: {
                                                stringArray = RG.C();
                                                try {
                                                    try {
                                                        bl = this.J instanceof k_1;
                                                        if (stringArray == null) break block21;
                                                        if (!bl) break block22;
                                                    }
                                                    catch (b_0 b_02) {
                                                        throw hg_0.a(b_02);
                                                    }
                                                    return h_1.Q((h_1)this.j).b;
                                                }
                                                catch (b_0 b_03) {
                                                    throw hg_0.a(b_03);
                                                }
                                            }
                                            bl = this.J instanceof _h_0;
                                        }
                                        try {
                                            if (stringArray == null) break block23;
                                            if (!bl) break block24;
                                        }
                                        catch (b_0 b_04) {
                                            throw hg_0.a(b_04);
                                        }
                                        hd_05 = h_1.c(this.j, ((_h_0)this.J).J);
                                        try {
                                            try {
                                                hd_04 = hd_05;
                                                if (stringArray == null) break block25;
                                                if (!h_1.u(hd_04)) break block26;
                                            }
                                            catch (b_0 b_05) {
                                                throw hg_0.a(b_05);
                                            }
                                            hd_04 = h_1.Q((h_1)this.j).P;
                                            break block25;
                                        }
                                        catch (b_0 b_06) {
                                            throw hg_0.a(b_06);
                                        }
                                    }
                                    hd_04 = hd_05;
                                }
                                return hd_04;
                            }
                            try {
                                _i_02 = this.J;
                                if (stringArray == null) break block27;
                                bl = _i_02 instanceof _D;
                            }
                            catch (b_0 b_07) {
                                throw hg_0.a(b_07);
                            }
                        }
                        try {
                            if (!bl) break block28;
                            _i_02 = this.J;
                        }
                        catch (b_0 b_08) {
                            throw hg_0.a(b_08);
                        }
                    }
                    _D _D2 = (_D)_i_02;
                    nt_0 nt_02 = _D2.s;
                    try {
                        if (nt_02 == null) {
                            return h_1.Q((h_1)this.j).P;
                        }
                    }
                    catch (b_0 b_09) {
                        throw hg_0.a(b_09);
                    }
                    hd_03 = h_1.c(this.j, nt_02);
                    try {
                        try {
                            hd_02 = hd_03;
                            if (stringArray == null) break block29;
                            if (!hd_02.P()) break block30;
                        }
                        catch (b_0 b_010) {
                            throw hg_0.a(b_010);
                        }
                        h_1.T(this.j, "\"" + hd_03.toString() + hg_0.b(-18569, -25637), this.P.Q());
                    }
                    catch (b_0 b_011) {
                        throw hg_0.a(b_011);
                    }
                }
                hd_02 = hd_03;
            }
            return hd_02;
        }
        return null;
    }

    @Override
    public _S r() {
        boolean bl;
        block31: {
            block32: {
                String[] stringArray;
                block29: {
                    block30: {
                        block27: {
                            block28: {
                                block25: {
                                    block26: {
                                        block23: {
                                            block24: {
                                                stringArray = RG.C();
                                                try {
                                                    try {
                                                        bl = this.J instanceof _j_0;
                                                        if (stringArray == null) break block23;
                                                        if (!bl) break block24;
                                                    }
                                                    catch (P p2) {
                                                        throw hg_0.a(p2);
                                                    }
                                                    return ((_j_0)this.J).Q();
                                                }
                                                catch (P p3) {
                                                    throw hg_0.a(p3);
                                                }
                                            }
                                            bl = this.J instanceof _E;
                                        }
                                        try {
                                            try {
                                                if (stringArray == null) break block25;
                                                if (!bl) break block26;
                                            }
                                            catch (P p5) {
                                                throw hg_0.a(p5);
                                            }
                                            return ((_E)this.J).Z();
                                        }
                                        catch (P p6) {
                                            throw hg_0.a(p6);
                                        }
                                    }
                                    bl = this.J instanceof _O;
                                }
                                try {
                                    try {
                                        if (stringArray == null) break block27;
                                        if (!bl) break block28;
                                    }
                                    catch (P p7) {
                                        throw hg_0.a(p7);
                                    }
                                    return ((_O)this.J).Q();
                                }
                                catch (P p8) {
                                    throw hg_0.a(p8);
                                }
                            }
                            bl = this.J instanceof _G;
                        }
                        try {
                            try {
                                if (stringArray == null) break block29;
                                if (!bl) break block30;
                            }
                            catch (P p9) {
                                throw hg_0.a(p9);
                            }
                            return ((_G)this.J).Z();
                        }
                        catch (P p10) {
                            throw hg_0.a(p10);
                        }
                    }
                    bl = this.J instanceof _h_0;
                }
                try {
                    try {
                        if (stringArray == null) break block31;
                        if (!bl) break block32;
                    }
                    catch (P p11) {
                        throw hg_0.a(p11);
                    }
                    return _S.PUBLIC;
                }
                catch (P p12) {
                    throw hg_0.a(p12);
                }
            }
            bl = this.J instanceof _1;
        }
        try {
            if (bl) {
                return _S.PUBLIC;
            }
        }
        catch (P p13) {
            throw hg_0.a(p13);
        }
        throw new P(this.P.Q(), this.J.getClass().getName());
    }

    @Override
    public boolean M() {
        boolean bl;
        block8: {
            block7: {
                String[] stringArray;
                block6: {
                    stringArray = RG.C();
                    try {
                        try {
                            bl = this.J instanceof _D;
                            if (stringArray == null) break block6;
                            if (!bl) break block7;
                        }
                        catch (P p2) {
                            throw hg_0.a(p2);
                        }
                        bl = ((_D)this.J).m();
                    }
                    catch (P p3) {
                        throw hg_0.a(p3);
                    }
                }
                try {
                    if (stringArray == null) break block8;
                    if (!bl) break block7;
                }
                catch (P p5) {
                    throw hg_0.a(p5);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    protected hd_0[] l() throws b_0 {
        block37: {
            hd_0[] hd_0Array;
            block39: {
                _i_0 _i_02;
                String[] stringArray;
                block36: {
                    boolean bl;
                    block31: {
                        block32: {
                            hd_0[] hd_0Array2;
                            block34: {
                                block26: {
                                    block27: {
                                        hd_0[] hd_0Array3;
                                        block30: {
                                            int n10;
                                            block28: {
                                                block29: {
                                                    stringArray = RG.C();
                                                    try {
                                                        bl = this.J instanceof _h_0;
                                                        if (stringArray == null) break block26;
                                                        if (!bl) break block27;
                                                    }
                                                    catch (b_0 b_02) {
                                                        throw hg_0.a(b_02);
                                                    }
                                                    hd_0 hd_02 = h_1.c(this.j, ((_h_0)this.J).J);
                                                    try {
                                                        try {
                                                            n10 = hd_02.P();
                                                            if (stringArray == null) break block28;
                                                            if (n10 == 0) break block29;
                                                        }
                                                        catch (b_0 b_03) {
                                                            throw hg_0.a(b_03);
                                                        }
                                                        hd_0[] hd_0Array3 = new hd_0[1];
                                                        hd_0Array3 = hd_0Array3;
                                                        hd_0Array4[0] = hd_02;
                                                        break block30;
                                                    }
                                                    catch (b_0 b_04) {
                                                        throw hg_0.a(b_04);
                                                    }
                                                }
                                                n10 = 0;
                                            }
                                            hd_0Array3 = new hd_0[n10];
                                        }
                                        return hd_0Array3;
                                    }
                                    bl = this.J instanceof _D;
                                }
                                try {
                                    if (stringArray == null) break block31;
                                    if (!bl) break block32;
                                }
                                catch (b_0 b_05) {
                                    throw hg_0.a(b_05);
                                }
                                _D _D2 = (_D)this.J;
                                hd_0[] hd_0Array5 = new hd_0[_D2.g.length];
                                int n11 = 0;
                                while (n11 < hd_0Array5.length) {
                                    block33: {
                                        block35: {
                                            try {
                                                try {
                                                    try {
                                                        hd_0Array5[n11] = h_1.c(this.j, _D2.g[n11]);
                                                        if (stringArray == null) break block33;
                                                        hd_0Array2 = hd_0Array5;
                                                        if (stringArray == null) break block34;
                                                    }
                                                    catch (b_0 b_06) {
                                                        throw hg_0.a(b_06);
                                                    }
                                                    if (hd_0Array2[n11].P()) break block35;
                                                }
                                                catch (b_0 b_07) {
                                                    throw hg_0.a(b_07);
                                                }
                                                h_1.T(this.j, "\"" + hd_0Array5[n11].toString() + hg_0.b(-18570, -12774), this.P.Q());
                                            }
                                            catch (b_0 b_08) {
                                                throw hg_0.a(b_08);
                                            }
                                        }
                                        ++n11;
                                    }
                                    if (stringArray != null) continue;
                                }
                                hd_0Array2 = hd_0Array5;
                            }
                            return hd_0Array2;
                        }
                        try {
                            _i_02 = this.J;
                            if (stringArray == null) break block36;
                            bl = _i_02 instanceof _n_0;
                        }
                        catch (b_0 b_09) {
                            throw hg_0.a(b_09);
                        }
                    }
                    try {
                        if (!bl) break block37;
                        _i_02 = this.J;
                    }
                    catch (b_0 b_010) {
                        throw hg_0.a(b_010);
                    }
                }
                _n_0 _n_02 = (_n_0)_i_02;
                hd_0[] hd_0Array6 = new hd_0[_n_02.q.length];
                int n12 = 0;
                while (n12 < hd_0Array6.length) {
                    block38: {
                        block40: {
                            try {
                                try {
                                    try {
                                        hd_0Array6[n12] = h_1.c(this.j, _n_02.q[n12]);
                                        if (stringArray == null) break block38;
                                        hd_0Array = hd_0Array6;
                                        if (stringArray == null) break block39;
                                    }
                                    catch (b_0 b_011) {
                                        throw hg_0.a(b_011);
                                    }
                                    if (hd_0Array[n12].P()) break block40;
                                }
                                catch (b_0 b_012) {
                                    throw hg_0.a(b_012);
                                }
                                h_1.T(this.j, "\"" + hd_0Array6[n12].toString() + hg_0.b(-18576, 27003), this.P.Q());
                            }
                            catch (b_0 b_013) {
                                throw hg_0.a(b_013);
                            }
                        }
                        ++n12;
                    }
                    if (stringArray != null) continue;
                }
                hd_0Array = hd_0Array6;
            }
            return hd_0Array;
        }
        throw new P(this.P.Q(), hg_0.b(-18571, -28658));
    }

    @Override
    protected h4[] a() throws b_0 {
        return h_1.R(this.j, this.P.d());
    }

    @Override
    public boolean B() {
        boolean bl;
        block10: {
            block13: {
                block11: {
                    String[] stringArray;
                    block12: {
                        stringArray = RG.C();
                        try {
                            try {
                                try {
                                    try {
                                        bl = this.J instanceof _n_0;
                                        if (stringArray == null) break block10;
                                        if (bl) break block11;
                                    }
                                    catch (P p2) {
                                        throw hg_0.a(p2);
                                    }
                                    bl = this.J instanceof _D;
                                    if (stringArray == null) break block12;
                                }
                                catch (P p3) {
                                    throw hg_0.a(p3);
                                }
                                if (!bl) break block13;
                            }
                            catch (P p5) {
                                throw hg_0.a(p5);
                            }
                            bl = ((_D)this.J).d();
                        }
                        catch (P p6) {
                            throw hg_0.a(p6);
                        }
                    }
                    try {
                        if (stringArray == null) break block10;
                        if (!bl) break block13;
                    }
                    catch (P p7) {
                        throw hg_0.a(p7);
                    }
                }
                bl = true;
                break block10;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public boolean s() {
        return this.J instanceof k_1;
    }

    @Override
    public boolean P() {
        return this.J instanceof _n_0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                var5 = new String[6];
                var3_1 = 0;
                var2_2 = "\u0007\u00f0\u00c1co\u00a9\u00ab^H\u00f3R\u00f0\u008aE\u00a3a\u0010\u00d6\u007f\u008cJ\u008e\u00bd\u00aa?\u00a0\u008b>\u00a2jT\u00e9(\u0085\u00cf|\u00b2G\u0081\u00d0\u00b6R\u00ed\u00bf\u00d4n3\u009b\u00c3l\u008c\u00f6\u0019+OO:C[y\u0018\u00a3I\u0011\u0088\u00fd~3\u00ffN\u00c5\u0002@%\u00b7\u00ce\u00da\u00e0\u0018\u00de\u00e9)\u00bb\u00d1VG\u009d\"\u00f8\u00dc\u00d7\u000e\u00c0/\u00bc\u00a0\u008bQ{`\u008d\u00ab\u0010As\u0012\u00dd\u00d8\u00c1\u00fa\u0002Z\u00e5$}\u009ab\u009f\u00a8*\u0088\u001e\u00db2Y\u00efsj\u00db\u00c81\u0005\u008b\u00bd\u0081\u00a0A\u00bb\u0004\u00d9\u00ff\u00cf\u00c7?\u00b0\u00f8\u00e3v\u00c4q\u0088P%\f\u009e\u008dH\u00a6\u00d3d.\u0087\u00b83z\u00cb\u00bd\u0097\u00e4\u001c\u0005\u00142\u00cd<\u00ddW\u00e3}\u00c9%r\u0002\u008b\u008c\u00fb-L\u00ef\u00c8\\\u00c6\u00e4T\u00ac\u00a2\u00d0\u00dar\u00d3\u00f1\u0011\u0000+\t\u00db\u009f\u00efk\u0090\u00d0?\u00a3\u00fddy\u00c5js\u0001\"]\u0013\u0016\u00906\u000f6\u00f6\u00b7q\u00da\u0080$\u00ac";
                var4_3 = "\u0007\u00f0\u00c1co\u00a9\u00ab^H\u00f3R\u00f0\u008aE\u00a3a\u0010\u00d6\u007f\u008cJ\u008e\u00bd\u00aa?\u00a0\u008b>\u00a2jT\u00e9(\u0085\u00cf|\u00b2G\u0081\u00d0\u00b6R\u00ed\u00bf\u00d4n3\u009b\u00c3l\u008c\u00f6\u0019+OO:C[y\u0018\u00a3I\u0011\u0088\u00fd~3\u00ffN\u00c5\u0002@%\u00b7\u00ce\u00da\u00e0\u0018\u00de\u00e9)\u00bb\u00d1VG\u009d\"\u00f8\u00dc\u00d7\u000e\u00c0/\u00bc\u00a0\u008bQ{`\u008d\u00ab\u0010As\u0012\u00dd\u00d8\u00c1\u00fa\u0002Z\u00e5$}\u009ab\u009f\u00a8*\u0088\u001e\u00db2Y\u00efsj\u00db\u00c81\u0005\u008b\u00bd\u0081\u00a0A\u00bb\u0004\u00d9\u00ff\u00cf\u00c7?\u00b0\u00f8\u00e3v\u00c4q\u0088P%\f\u009e\u008dH\u00a6\u00d3d.\u0087\u00b83z\u00cb\u00bd\u0097\u00e4\u001c\u0005\u00142\u00cd<\u00ddW\u00e3}\u00c9%r\u0002\u008b\u008c\u00fb-L\u00ef\u00c8\\\u00c6\u00e4T\u00ac\u00a2\u00d0\u00dar\u00d3\u00f1\u0011\u0000+\t\u00db\u009f\u00efk\u0090\u00d0?\u00a3\u00fddy\u00c5js\u0001\"]\u0013\u0016\u00906\u000f6\u00f6\u00b7q\u00da\u0080$\u00ac".length();
                var1_4 = 81;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 47;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block21;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "l\u00c7\u00b1\u0098|\u00cb\u00d4\u000f\u00ba\u00c4\u0011\u000b\u00ff'\u00100{\u00e1\u000fwY\u00ec\u00c2\u00fb\u00cd\u0097\u00c8\u00c5\u00d7\b\u00e7\u00b8C\u00b2\u00bf\u0087\u00a1%\u00fe\u0081De\u00aeD\u00a1\f\u0080\u00ca\u00a8[\u00fc\r\nI0\u001e\u00c8t\u0018\u0082m\u00c1\u00fa@\u00e3\u00ca\u000e\u00c8\u00ec,\u00baS\u00b2\u0012\u00f45\u00af\u0082\u00ab\u008f\u0082<\u0080\u0004U\n\u0002\u00d6\u0016a\u001a\u00fd\u00d4\u001e\u00b4\u0094\u00ca.\u009b\u00b7\u00e2\u00dbi#\u00be\u001b@\u009f*f\u0086\u00ebS\u0088\u00da\u001c8\u00aa\u001cr\u0092\u00c8X\u00de\u00a6\u0092\u00c22\u00866`)\u00f7%\u0013\u00ae\u000eg\u00f0_|J";
                    var4_3 = "l\u00c7\u00b1\u0098|\u00cb\u00d4\u000f\u00ba\u00c4\u0011\u000b\u00ff'\u00100{\u00e1\u000fwY\u00ec\u00c2\u00fb\u00cd\u0097\u00c8\u00c5\u00d7\b\u00e7\u00b8C\u00b2\u00bf\u0087\u00a1%\u00fe\u0081De\u00aeD\u00a1\f\u0080\u00ca\u00a8[\u00fc\r\nI0\u001e\u00c8t\u0018\u0082m\u00c1\u00fa@\u00e3\u00ca\u000e\u00c8\u00ec,\u00baS\u00b2\u0012\u00f45\u00af\u0082\u00ab\u008f\u0082<\u0080\u0004U\n\u0002\u00d6\u0016a\u001a\u00fd\u00d4\u001e\u00b4\u0094\u00ca.\u009b\u00b7\u00e2\u00dbi#\u00be\u001b@\u009f*f\u0086\u00ebS\u0088\u00da\u001c8\u00aa\u001cr\u0092\u00c8X\u00de\u00a6\u0092\u00c22\u00866`)\u00f7%\u0013\u00ae\u000eg\u00f0_|J".length();
                    var1_4 = 81;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 92;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block22;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 117;
                            break;
                        }
                        case 1: {
                            v15 = 1;
                            break;
                        }
                        case 2: {
                            v15 = 51;
                            break;
                        }
                        case 3: {
                            v15 = 42;
                            break;
                        }
                        case 4: {
                            v15 = 125;
                            break;
                        }
                        case 5: {
                            v15 = 118;
                            break;
                        }
                        default: {
                            v15 = 101;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
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
            } while (v10 > var6_6);
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
        hg_0.a = var5;
        hg_0.c = new String[6];
        try {
            v17 = h_1.class.desiredAssertionStatus() == false;
        }
        catch (P v18) {
            throw hg_0.a(v18);
        }
        hg_0.U = v17;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String b(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFB775) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 30;
                    break;
                }
                case 1: {
                    n14 = 210;
                    break;
                }
                case 2: {
                    n14 = 145;
                    break;
                }
                case 3: {
                    n14 = 186;
                    break;
                }
                case 4: {
                    n14 = 211;
                    break;
                }
                case 5: {
                    n14 = 27;
                    break;
                }
                case 6: {
                    n14 = 196;
                    break;
                }
                case 7: {
                    n14 = 96;
                    break;
                }
                case 8: {
                    n14 = 103;
                    break;
                }
                case 9: {
                    n14 = 47;
                    break;
                }
                case 10: {
                    n14 = 39;
                    break;
                }
                case 11: {
                    n14 = 46;
                    break;
                }
                case 12: {
                    n14 = 78;
                    break;
                }
                case 13: {
                    n14 = 224;
                    break;
                }
                case 14: {
                    n14 = 57;
                    break;
                }
                case 15: {
                    n14 = 86;
                    break;
                }
                case 16: {
                    n14 = 250;
                    break;
                }
                case 17: {
                    n14 = 89;
                    break;
                }
                case 18: {
                    n14 = 3;
                    break;
                }
                case 19: {
                    n14 = 236;
                    break;
                }
                case 20: {
                    n14 = 60;
                    break;
                }
                case 21: {
                    n14 = 166;
                    break;
                }
                case 22: {
                    n14 = 50;
                    break;
                }
                case 23: {
                    n14 = 68;
                    break;
                }
                case 24: {
                    n14 = 209;
                    break;
                }
                case 25: {
                    n14 = 98;
                    break;
                }
                case 26: {
                    n14 = 159;
                    break;
                }
                case 27: {
                    n14 = 237;
                    break;
                }
                case 28: {
                    n14 = 135;
                    break;
                }
                case 29: {
                    n14 = 128;
                    break;
                }
                case 30: {
                    n14 = 160;
                    break;
                }
                case 31: {
                    n14 = 254;
                    break;
                }
                case 32: {
                    n14 = 191;
                    break;
                }
                case 33: {
                    n14 = 142;
                    break;
                }
                case 34: {
                    n14 = 177;
                    break;
                }
                case 35: {
                    n14 = 58;
                    break;
                }
                case 36: {
                    n14 = 233;
                    break;
                }
                case 37: {
                    n14 = 178;
                    break;
                }
                case 38: {
                    n14 = 216;
                    break;
                }
                case 39: {
                    n14 = 121;
                    break;
                }
                case 40: {
                    n14 = 163;
                    break;
                }
                case 41: {
                    n14 = 161;
                    break;
                }
                case 42: {
                    n14 = 93;
                    break;
                }
                case 43: {
                    n14 = 23;
                    break;
                }
                case 44: {
                    n14 = 100;
                    break;
                }
                case 45: {
                    n14 = 125;
                    break;
                }
                case 46: {
                    n14 = 138;
                    break;
                }
                case 47: {
                    n14 = 14;
                    break;
                }
                case 48: {
                    n14 = 181;
                    break;
                }
                case 49: {
                    n14 = 143;
                    break;
                }
                case 50: {
                    n14 = 55;
                    break;
                }
                case 51: {
                    n14 = 223;
                    break;
                }
                case 52: {
                    n14 = 127;
                    break;
                }
                case 53: {
                    n14 = 65;
                    break;
                }
                case 54: {
                    n14 = 56;
                    break;
                }
                case 55: {
                    n14 = 187;
                    break;
                }
                case 56: {
                    n14 = 118;
                    break;
                }
                case 57: {
                    n14 = 249;
                    break;
                }
                case 58: {
                    n14 = 170;
                    break;
                }
                case 59: {
                    n14 = 91;
                    break;
                }
                case 60: {
                    n14 = 90;
                    break;
                }
                case 61: {
                    n14 = 11;
                    break;
                }
                case 62: {
                    n14 = 67;
                    break;
                }
                case 63: {
                    n14 = 51;
                    break;
                }
                case 64: {
                    n14 = 102;
                    break;
                }
                case 65: {
                    n14 = 144;
                    break;
                }
                case 66: {
                    n14 = 228;
                    break;
                }
                case 67: {
                    n14 = 203;
                    break;
                }
                case 68: {
                    n14 = 247;
                    break;
                }
                case 69: {
                    n14 = 171;
                    break;
                }
                case 70: {
                    n14 = 243;
                    break;
                }
                case 71: {
                    n14 = 40;
                    break;
                }
                case 72: {
                    n14 = 169;
                    break;
                }
                case 73: {
                    n14 = 134;
                    break;
                }
                case 74: {
                    n14 = 137;
                    break;
                }
                case 75: {
                    n14 = 202;
                    break;
                }
                case 76: {
                    n14 = 131;
                    break;
                }
                case 77: {
                    n14 = 219;
                    break;
                }
                case 78: {
                    n14 = 217;
                    break;
                }
                case 79: {
                    n14 = 45;
                    break;
                }
                case 80: {
                    n14 = 64;
                    break;
                }
                case 81: {
                    n14 = 208;
                    break;
                }
                case 82: {
                    n14 = 194;
                    break;
                }
                case 83: {
                    n14 = 16;
                    break;
                }
                case 84: {
                    n14 = 115;
                    break;
                }
                case 85: {
                    n14 = 255;
                    break;
                }
                case 86: {
                    n14 = 106;
                    break;
                }
                case 87: {
                    n14 = 182;
                    break;
                }
                case 88: {
                    n14 = 188;
                    break;
                }
                case 89: {
                    n14 = 88;
                    break;
                }
                case 90: {
                    n14 = 226;
                    break;
                }
                case 91: {
                    n14 = 147;
                    break;
                }
                case 92: {
                    n14 = 29;
                    break;
                }
                case 93: {
                    n14 = 0;
                    break;
                }
                case 94: {
                    n14 = 132;
                    break;
                }
                case 95: {
                    n14 = 108;
                    break;
                }
                case 96: {
                    n14 = 215;
                    break;
                }
                case 97: {
                    n14 = 31;
                    break;
                }
                case 98: {
                    n14 = 133;
                    break;
                }
                case 99: {
                    n14 = 123;
                    break;
                }
                case 100: {
                    n14 = 18;
                    break;
                }
                case 101: {
                    n14 = 116;
                    break;
                }
                case 102: {
                    n14 = 36;
                    break;
                }
                case 103: {
                    n14 = 154;
                    break;
                }
                case 104: {
                    n14 = 205;
                    break;
                }
                case 105: {
                    n14 = 251;
                    break;
                }
                case 106: {
                    n14 = 198;
                    break;
                }
                case 107: {
                    n14 = 207;
                    break;
                }
                case 108: {
                    n14 = 152;
                    break;
                }
                case 109: {
                    n14 = 195;
                    break;
                }
                case 110: {
                    n14 = 149;
                    break;
                }
                case 111: {
                    n14 = 157;
                    break;
                }
                case 112: {
                    n14 = 12;
                    break;
                }
                case 113: {
                    n14 = 4;
                    break;
                }
                case 114: {
                    n14 = 7;
                    break;
                }
                case 115: {
                    n14 = 148;
                    break;
                }
                case 116: {
                    n14 = 190;
                    break;
                }
                case 117: {
                    n14 = 246;
                    break;
                }
                case 118: {
                    n14 = 146;
                    break;
                }
                case 119: {
                    n14 = 180;
                    break;
                }
                case 120: {
                    n14 = 85;
                    break;
                }
                case 121: {
                    n14 = 21;
                    break;
                }
                case 122: {
                    n14 = 73;
                    break;
                }
                case 123: {
                    n14 = 87;
                    break;
                }
                case 124: {
                    n14 = 10;
                    break;
                }
                case 125: {
                    n14 = 172;
                    break;
                }
                case 126: {
                    n14 = 15;
                    break;
                }
                case 127: {
                    n14 = 20;
                    break;
                }
                case 128: {
                    n14 = 212;
                    break;
                }
                case 129: {
                    n14 = 70;
                    break;
                }
                case 130: {
                    n14 = 110;
                    break;
                }
                case 131: {
                    n14 = 66;
                    break;
                }
                case 132: {
                    n14 = 112;
                    break;
                }
                case 133: {
                    n14 = 35;
                    break;
                }
                case 134: {
                    n14 = 80;
                    break;
                }
                case 135: {
                    n14 = 117;
                    break;
                }
                case 136: {
                    n14 = 69;
                    break;
                }
                case 137: {
                    n14 = 26;
                    break;
                }
                case 138: {
                    n14 = 221;
                    break;
                }
                case 139: {
                    n14 = 75;
                    break;
                }
                case 140: {
                    n14 = 42;
                    break;
                }
                case 141: {
                    n14 = 158;
                    break;
                }
                case 142: {
                    n14 = 218;
                    break;
                }
                case 143: {
                    n14 = 99;
                    break;
                }
                case 144: {
                    n14 = 25;
                    break;
                }
                case 145: {
                    n14 = 122;
                    break;
                }
                case 146: {
                    n14 = 49;
                    break;
                }
                case 147: {
                    n14 = 48;
                    break;
                }
                case 148: {
                    n14 = 239;
                    break;
                }
                case 149: {
                    n14 = 6;
                    break;
                }
                case 150: {
                    n14 = 232;
                    break;
                }
                case 151: {
                    n14 = 242;
                    break;
                }
                case 152: {
                    n14 = 44;
                    break;
                }
                case 153: {
                    n14 = 235;
                    break;
                }
                case 154: {
                    n14 = 167;
                    break;
                }
                case 155: {
                    n14 = 248;
                    break;
                }
                case 156: {
                    n14 = 53;
                    break;
                }
                case 157: {
                    n14 = 95;
                    break;
                }
                case 158: {
                    n14 = 183;
                    break;
                }
                case 159: {
                    n14 = 71;
                    break;
                }
                case 160: {
                    n14 = 185;
                    break;
                }
                case 161: {
                    n14 = 61;
                    break;
                }
                case 162: {
                    n14 = 150;
                    break;
                }
                case 163: {
                    n14 = 113;
                    break;
                }
                case 164: {
                    n14 = 83;
                    break;
                }
                case 165: {
                    n14 = 43;
                    break;
                }
                case 166: {
                    n14 = 241;
                    break;
                }
                case 167: {
                    n14 = 101;
                    break;
                }
                case 168: {
                    n14 = 189;
                    break;
                }
                case 169: {
                    n14 = 240;
                    break;
                }
                case 170: {
                    n14 = 174;
                    break;
                }
                case 171: {
                    n14 = 151;
                    break;
                }
                case 172: {
                    n14 = 22;
                    break;
                }
                case 173: {
                    n14 = 72;
                    break;
                }
                case 174: {
                    n14 = 140;
                    break;
                }
                case 175: {
                    n14 = 164;
                    break;
                }
                case 176: {
                    n14 = 173;
                    break;
                }
                case 177: {
                    n14 = 63;
                    break;
                }
                case 178: {
                    n14 = 141;
                    break;
                }
                case 179: {
                    n14 = 153;
                    break;
                }
                case 180: {
                    n14 = 213;
                    break;
                }
                case 181: {
                    n14 = 13;
                    break;
                }
                case 182: {
                    n14 = 92;
                    break;
                }
                case 183: {
                    n14 = 231;
                    break;
                }
                case 184: {
                    n14 = 179;
                    break;
                }
                case 185: {
                    n14 = 165;
                    break;
                }
                case 186: {
                    n14 = 136;
                    break;
                }
                case 187: {
                    n14 = 8;
                    break;
                }
                case 188: {
                    n14 = 200;
                    break;
                }
                case 189: {
                    n14 = 126;
                    break;
                }
                case 190: {
                    n14 = 175;
                    break;
                }
                case 191: {
                    n14 = 227;
                    break;
                }
                case 192: {
                    n14 = 62;
                    break;
                }
                case 193: {
                    n14 = 234;
                    break;
                }
                case 194: {
                    n14 = 229;
                    break;
                }
                case 195: {
                    n14 = 82;
                    break;
                }
                case 196: {
                    n14 = 59;
                    break;
                }
                case 197: {
                    n14 = 230;
                    break;
                }
                case 198: {
                    n14 = 201;
                    break;
                }
                case 199: {
                    n14 = 104;
                    break;
                }
                case 200: {
                    n14 = 94;
                    break;
                }
                case 201: {
                    n14 = 97;
                    break;
                }
                case 202: {
                    n14 = 197;
                    break;
                }
                case 203: {
                    n14 = 120;
                    break;
                }
                case 204: {
                    n14 = 41;
                    break;
                }
                case 205: {
                    n14 = 76;
                    break;
                }
                case 206: {
                    n14 = 5;
                    break;
                }
                case 207: {
                    n14 = 238;
                    break;
                }
                case 208: {
                    n14 = 38;
                    break;
                }
                case 209: {
                    n14 = 34;
                    break;
                }
                case 210: {
                    n14 = 156;
                    break;
                }
                case 211: {
                    n14 = 28;
                    break;
                }
                case 212: {
                    n14 = 245;
                    break;
                }
                case 213: {
                    n14 = 1;
                    break;
                }
                case 214: {
                    n14 = 184;
                    break;
                }
                case 215: {
                    n14 = 222;
                    break;
                }
                case 216: {
                    n14 = 114;
                    break;
                }
                case 217: {
                    n14 = 168;
                    break;
                }
                case 218: {
                    n14 = 32;
                    break;
                }
                case 219: {
                    n14 = 129;
                    break;
                }
                case 220: {
                    n14 = 206;
                    break;
                }
                case 221: {
                    n14 = 19;
                    break;
                }
                case 222: {
                    n14 = 244;
                    break;
                }
                case 223: {
                    n14 = 111;
                    break;
                }
                case 224: {
                    n14 = 155;
                    break;
                }
                case 225: {
                    n14 = 24;
                    break;
                }
                case 226: {
                    n14 = 225;
                    break;
                }
                case 227: {
                    n14 = 139;
                    break;
                }
                case 228: {
                    n14 = 17;
                    break;
                }
                case 229: {
                    n14 = 193;
                    break;
                }
                case 230: {
                    n14 = 176;
                    break;
                }
                case 231: {
                    n14 = 2;
                    break;
                }
                case 232: {
                    n14 = 79;
                    break;
                }
                case 233: {
                    n14 = 253;
                    break;
                }
                case 234: {
                    n14 = 192;
                    break;
                }
                case 235: {
                    n14 = 52;
                    break;
                }
                case 236: {
                    n14 = 252;
                    break;
                }
                case 237: {
                    n14 = 214;
                    break;
                }
                case 238: {
                    n14 = 107;
                    break;
                }
                case 239: {
                    n14 = 9;
                    break;
                }
                case 240: {
                    n14 = 37;
                    break;
                }
                case 241: {
                    n14 = 74;
                    break;
                }
                case 242: {
                    n14 = 119;
                    break;
                }
                case 243: {
                    n14 = 105;
                    break;
                }
                case 244: {
                    n14 = 199;
                    break;
                }
                case 245: {
                    n14 = 77;
                    break;
                }
                case 246: {
                    n14 = 33;
                    break;
                }
                case 247: {
                    n14 = 204;
                    break;
                }
                case 248: {
                    n14 = 54;
                    break;
                }
                case 249: {
                    n14 = 81;
                    break;
                }
                case 250: {
                    n14 = 162;
                    break;
                }
                case 251: {
                    n14 = 124;
                    break;
                }
                case 252: {
                    n14 = 84;
                    break;
                }
                case 253: {
                    n14 = 109;
                    break;
                }
                case 254: {
                    n14 = 220;
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
            hg_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }
}

