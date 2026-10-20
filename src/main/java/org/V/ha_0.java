/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.v._S;
import org.v.h4;
import org.v.hA;
import org.v.hP;
import org.v.hd_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from org.v.ha
 */
public class ha_0
extends hP {
    private final Method O;
    final hA I;

    ha_0(hA hA2, Method method) {
        this.I = hA2;
        super(hA2);
        this.O = method;
    }

    @Override
    public _S p() {
        return hA.J(this.O.getModifiers());
    }

    @Override
    public h4[] f() {
        return new h4[0];
    }

    @Override
    public String K() {
        return this.O.getName();
    }

    @Override
    public boolean c() {
        return Modifier.isTransient(this.O.getModifiers());
    }

    @Override
    public hd_0[] d() {
        return hA.f(this.I, this.O.getParameterTypes());
    }

    @Override
    public boolean u() {
        return Modifier.isStatic(this.O.getModifiers());
    }

    @Override
    public boolean F() {
        return Modifier.isAbstract(this.O.getModifiers());
    }

    @Override
    public hd_0 p() {
        return hA.r(this.I, this.O.getReturnType());
    }

    @Override
    public hd_0[] S() {
        return hA.f(this.I, this.O.getExceptionTypes());
    }
}

