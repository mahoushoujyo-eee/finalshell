/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.util.Objects;
import org.F.c;
import org.P;
import org.b_0;
import org.v.M;
import org.v.RG;
import org.v._S;
import org.v._n_0;
import org.v.h4;
import org.v.hV;
import org.v.h_1;
import org.v.hd_0;
import org.v.k_0;
import org.v.nt_0;
import org.v.u_1;

class L
extends u_1 {
    @c
    private h4[] S;
    final k_0 r;
    final _S g;
    final hV[] q;
    final boolean O;
    final nt_0 M;
    final int f;
    final String T;
    final boolean x;
    final M I;
    final h_1 h;

    L(h_1 h_12, hd_0 hd_02, k_0 k_02, _S _S2, hV[] hVArray, boolean bl, nt_0 nt_02, int n10, String string, boolean bl2, M m10) {
        this.h = h_12;
        this.r = k_02;
        this.g = _S2;
        this.q = hVArray;
        this.O = bl;
        this.M = nt_02;
        this.f = n10;
        this.T = string;
        this.x = bl2;
        this.I = m10;
        hd_0 hd_03 = hd_02;
        Objects.requireNonNull(hd_03);
        super(hd_03);
    }

    @Override
    public _S p() {
        _S _S2;
        block6: {
            L l2;
            block4: {
                block5: {
                    String[] stringArray = RG.C();
                    try {
                        try {
                            l2 = this;
                            if (stringArray == null) break block4;
                            if (!(l2.r instanceof _n_0)) break block5;
                        }
                        catch (P p2) {
                            throw L.a(p2);
                        }
                        _S2 = _S.PUBLIC;
                        break block6;
                    }
                    catch (P p3) {
                        throw L.a(p3);
                    }
                }
                l2 = this;
            }
            _S2 = l2.g;
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
            h4Array = this.S;
            if (stringArray == null) return h4Array;
            try {
                if (h4Array == null) break block6;
                return this.S;
                catch (b_0 b_02) {
                    throw L.a(b_02);
                }
            }
            catch (b_0 b_03) {
                throw L.a(b_03);
            }
        }
        try {
            this.S = h_1.R(this.h, this.q);
            h4Array = this.S;
            return h4Array;
        }
        catch (b_0 b_04) {
            throw new P(this.r.Q(), null, b_04);
        }
    }

    @Override
    public boolean b() {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    String[] stringArray = RG.C();
                    try {
                        try {
                            try {
                                bl = this.r instanceof _n_0;
                                if (stringArray == null) break block6;
                                if (bl) break block7;
                            }
                            catch (P p2) {
                                throw L.a(p2);
                            }
                            bl = this.O;
                            if (stringArray == null) break block6;
                        }
                        catch (P p3) {
                            throw L.a(p3);
                        }
                        if (!bl) break block8;
                    }
                    catch (P p5) {
                        throw L.a(p5);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public hd_0 P() throws b_0 {
        return h_1.Q(this.h).f(h_1.c(this.h, this.M), this.f);
    }

    @Override
    public String h() {
        return this.T;
    }

    @Override
    @c
    public Object J() throws b_0 {
        Object object;
        block10: {
            block11: {
                String[] stringArray = RG.C();
                try {
                    try {
                        try {
                            object = this;
                            if (stringArray == null) break block10;
                            if (!((L)object).x) break block11;
                        }
                        catch (b_0 b_02) {
                            throw L.a(b_02);
                        }
                        object = this.I;
                        if (stringArray == null) break block10;
                    }
                    catch (b_0 b_03) {
                        throw L.a(b_03);
                    }
                    if (object == null) break block11;
                }
                catch (b_0 b_04) {
                    throw L.a(b_04);
                }
                Object object2 = this.h.R(this.I);
                try {
                    try {
                        object = object2;
                        if (stringArray == null) break block10;
                        if (object == h_1.K) break block11;
                    }
                    catch (b_0 b_05) {
                        throw L.a(b_05);
                    }
                    return h_1.f(this.h, this.I, object2, this.P());
                }
                catch (b_0 b_06) {
                    throw L.a(b_06);
                }
            }
            object = h_1.K;
        }
        return object;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

