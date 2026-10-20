/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ph_0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.dL
 */
public final class dl_1 {
    private final Class s;
    private final ph_0 Z;
    private final String z;

    public dl_1(Class clazz, ph_0 ph_02) {
        this.s = clazz;
        this.Z = ph_02;
        this.z = ph_02.G();
    }

    public Class p() {
        return this.s;
    }

    public Method W() {
        return this.Z.Y;
    }

    public Field X() {
        return this.Z.w;
    }

    public String y() {
        return this.Z.I;
    }

    public String t() {
        return this.Z.N;
    }

    public Class w() {
        return this.Z.O;
    }

    public Type X() {
        return this.Z.a;
    }

    public int y() {
        return this.Z.c;
    }

    public boolean U() {
        return this.Z.s;
    }

    public Annotation V(Class clazz) {
        return this.Z.m(clazz);
    }

    public String Y() {
        return this.z;
    }
}

