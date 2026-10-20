/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.c;
import com.ky_2;
import com.pv_2;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

class a_
implements fb_2 {
    final File b;
    final CK e;
    final pv_2 k;

    a_(pv_2 pv_22, File file, CK cK) {
        this.k = pv_22;
        this.b = file;
        this.e = cK;
    }

    @Override
    public void a(int n10) {
        try {
            this.k.c.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void q(int n10, long l2, int n11) {
        try {
            this.k.c.G(n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void d(int n10, String string, long l2) {
        Object object;
        Object object2;
        String string2 = pv_2.r();
        String string3 = this.b.getAbsolutePath() + File.separator + string;
        this.k.c = new YI(YI.l, n10, string3, null, l2, true);
        try {
            this.k.c.J(this.e);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.k.c.R(l2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.k.c.I(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.k.c.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string4 = string2;
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.E();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.z(this.k.c);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        if (ky_2.F() != null) {
            pv_2.Y("QxLumc");
        }
    }
}

