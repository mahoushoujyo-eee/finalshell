/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.ArrayList;
import java.util.Objects;
import org.F.c;
import org.P;
import org.b_0;
import org.v.NA;
import org.v.NS;
import org.v.R9;
import org.v.RG;
import org.v._S;
import org.v._n_0;
import org.v.h4;
import org.v.hP;
import org.v.h_1;
import org.v.hd_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class h3
extends hP {
    @c
    h4[] T;
    final NS n;
    final h_1 i;

    h3(h_1 h_12, hd_0 hd_02, NS nS2) {
        this.i = h_12;
        this.n = nS2;
        hd_0 hd_03 = hd_02;
        Objects.requireNonNull(hd_03);
        super(hd_03);
    }

    @Override
    public _S p() {
        _S _S2;
        block10: {
            NS nS2;
            block8: {
                block9: {
                    String[] stringArray = RG.C();
                    try {
                        try {
                            try {
                                try {
                                    nS2 = this.n;
                                    if (stringArray == null) break block8;
                                    if (!(nS2.H() instanceof _n_0)) break block9;
                                }
                                catch (P p2) {
                                    throw h3.a(p2);
                                }
                                nS2 = this.n;
                                if (stringArray == null) break block8;
                            }
                            catch (P p3) {
                                throw h3.a(p3);
                            }
                            if (nS2.A() != _S.DEFAULT) break block9;
                        }
                        catch (P p5) {
                            throw h3.a(p5);
                        }
                        _S2 = _S.PUBLIC;
                        break block10;
                    }
                    catch (P p6) {
                        throw h3.a(p6);
                    }
                }
                nS2 = this.n;
            }
            _S2 = nS2.A();
        }
        return _S2;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public h4[] f() {
        h4[] h4Array;
        block6: {
            String[] stringArray = RG.C();
            h4Array = this.T;
            if (stringArray == null) return h4Array;
            try {
                if (h4Array == null) break block6;
                return this.T;
                catch (b_0 b_02) {
                    throw h3.a(b_02);
                }
            }
            catch (b_0 b_03) {
                throw h3.a(b_03);
            }
        }
        try {
            this.T = h_1.R(this.i, this.n.d());
            h4Array = this.T;
            return h4Array;
        }
        catch (b_0 b_04) {
            throw new P(this.n.Q(), null, b_04);
        }
    }

    @Override
    public boolean c() {
        return this.n.t.v;
    }

    @Override
    public hd_0[] d() throws b_0 {
        R9[] r9Array = this.n.t.Q;
        hd_0[] hd_0Array = new hd_0[r9Array.length];
        String[] stringArray = RG.C();
        int n10 = 0;
        while (n10 < r9Array.length) {
            block9: {
                hd_0 hd_02;
                block10: {
                    h3 h32;
                    block11: {
                        hd_02 = h_1.c(this.i, r9Array[n10].Y);
                        try {
                            try {
                                try {
                                    try {
                                        if (stringArray == null) break block9;
                                        if (n10 != r9Array.length - 1) break block10;
                                    }
                                    catch (b_0 b_02) {
                                        throw h3.a(b_02);
                                    }
                                    h32 = this;
                                    if (stringArray == null) break block11;
                                }
                                catch (b_0 b_03) {
                                    throw h3.a(b_03);
                                }
                                if (!h32.n.t.v) break block10;
                            }
                            catch (b_0 b_04) {
                                throw h3.a(b_04);
                            }
                            h32 = this;
                        }
                        catch (b_0 b_05) {
                            throw h3.a(b_05);
                        }
                    }
                    hd_02 = h_1.Q(h32.i).h(hd_02);
                }
                hd_0Array[n10] = hd_02;
                ++n10;
            }
            if (stringArray != null) continue;
        }
        return hd_0Array;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public hd_0[] S() throws b_0 {
        block14: {
            var2_1 = new ArrayList<hd_0>();
            var3_2 = this.n.g;
            var4_3 = var3_2.length;
            var1_5 = RG.C();
            for (var5_4 = 0; var5_4 < var4_3; ++var5_4) {
                v0 = var3_2;
                if (var1_5 == null) break block14;
                var6_6 = v0[var5_4];
                try {
                    v1 = var6_6 instanceof NA;
                    if (var1_5 == null) continue;
                    if (v1 != 0) {
                    }
                    ** GOTO lbl42
                }
                catch (b_0 v2) {
                    throw h3.a(v2);
                }
                var7_7 = ((NA)var6_6).k;
                try {
                    block15: {
                        try {
                            try {
                                try {
                                    try {
                                        v1 = var7_7.length;
                                        if (var1_5 == null) continue;
                                        if (v1 != 1) break block15;
                                    }
                                    catch (b_0 v3) {
                                        throw h3.a(v3);
                                    }
                                    v1 = (int)h_1.F().matcher(var7_7[0]).matches();
                                    if (var1_5 == null) continue;
                                }
                                catch (b_0 v4) {
                                    throw h3.a(v4);
                                }
                                if (v1 == 0) break block15;
                            }
                            catch (b_0 v5) {
                                throw h3.a(v5);
                            }
                            if (var1_5 != null) continue;
                        }
                        catch (b_0 v6) {
                            throw h3.a(v6);
                        }
                    }
                    v1 = var2_1.add(h_1.c(this.i, var6_6));
                    continue;
                }
                catch (b_0 v7) {
                    throw h3.a(v7);
                }
            }
            v0 = var2_1.toArray(new hd_0[var2_1.size()]);
        }
        return (hd_0[])v0;
    }

    @Override
    public boolean u() {
        return this.n.N();
    }

    @Override
    public boolean F() {
        boolean bl;
        block18: {
            block19: {
                block17: {
                    String[] stringArray;
                    block14: {
                        NS nS2;
                        block16: {
                            stringArray = RG.C();
                            try {
                                block15: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        bl = this.n.H() instanceof _n_0;
                                                        if (stringArray == null) break block14;
                                                        if (!bl) break block15;
                                                    }
                                                    catch (P p2) {
                                                        throw h3.a(p2);
                                                    }
                                                    bl = this.n.R();
                                                    if (stringArray == null) break block14;
                                                }
                                                catch (P p3) {
                                                    throw h3.a(p3);
                                                }
                                                if (bl) break block15;
                                            }
                                            catch (P p5) {
                                                throw h3.a(p5);
                                            }
                                            nS2 = this.n;
                                            if (stringArray == null) break block16;
                                        }
                                        catch (P p6) {
                                            throw h3.a(p6);
                                        }
                                        if (nS2.A() != _S.PRIVATE) break block17;
                                    }
                                    catch (P p7) {
                                        throw h3.a(p7);
                                    }
                                }
                                nS2 = this.n;
                            }
                            catch (P p8) {
                                throw h3.a(p8);
                            }
                        }
                        bl = nS2.y();
                    }
                    try {
                        if (stringArray == null) break block18;
                        if (!bl) break block19;
                    }
                    catch (P p9) {
                        throw h3.a(p9);
                    }
                }
                bl = true;
                break block18;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public hd_0 p() throws b_0 {
        return h_1.T(h_1.a(this.i, this.n));
    }

    @Override
    public String K() {
        return this.n.P;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

