/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.c;
import com.pv_2;
import java.lang.reflect.InvocationTargetException;

class G
implements fb_2 {
    final CK e;
    final pv_2 N;

    G(pv_2 pv_22, CK cK) {
        this.N = pv_22;
        this.e = cK;
    }

    @Override
    public void a(int n10) {
        try {
            this.N.c.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void q(int n10, long l2, int n11) {
        try {
            this.N.c.G(n11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Override
    public void d(int n10, String string, long l2) {
        Object object;
        Object object2;
        String string2 = string;
        this.N.c = new YI(YI.l, n10, string2, string, l2, false);
        try {
            this.N.c.J(this.e);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.N.c.R(l2);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.N.c.y();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
            object.z(this.N.c);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

