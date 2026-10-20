/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import org.F.c;
import org.v.hI;

/*
 * Renamed from org.v._a
 */
class _a_0 {
    protected boolean i;
    protected boolean G;
    @c
    protected Class K;
    private String v;
    private String[] T;
    private Class[] L;
    private Class[] e;
    final hI m;

    _a_0(hI hI2, String string) {
        this.m = hI2;
        this.G = true;
        this.T = new String[0];
        this.L = new Class[0];
        this.e = new Class[0];
        this.v = string;
    }

    static String q(_a_0 _a_02, String string) {
        _a_02.v = string;
        return _a_02.v;
    }

    static String[] R(_a_0 _a_02, String[] stringArray) {
        _a_02.T = stringArray;
        return stringArray;
    }

    static Class[] d(_a_0 _a_02, Class[] classArray) {
        _a_02.L = classArray;
        return classArray;
    }

    static Class[] c(_a_0 _a_02, Class[] classArray) {
        _a_02.e = classArray;
        return classArray;
    }

    static String E(_a_0 _a_02) {
        return _a_02.v;
    }

    static Class[] V(_a_0 _a_02) {
        return _a_02.L;
    }

    static String[] x(_a_0 _a_02) {
        return _a_02.T;
    }

    static Class[] B(_a_0 _a_02) {
        return _a_02.e;
    }
}

