/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import org.b_0;
import org.v._J;
import org.v._f_0;
import org.v.hA;
import org.v.q_2;

/*
 * Renamed from org.v._t
 */
class _t_0
implements _J {
    final TypeVariable G;
    final hA l;

    _t_0(hA hA2, TypeVariable typeVariable) {
        this.l = hA2;
        this.G = typeVariable;
    }

    @Override
    public String K() {
        return this.G.getName();
    }

    @Override
    public _f_0[] t() throws b_0 {
        q_2[] q_2Array = hA.f(this.l, this.G.getBounds());
        return (_f_0[])Arrays.copyOf(q_2Array, q_2Array.length, _f_0[].class);
    }
}

