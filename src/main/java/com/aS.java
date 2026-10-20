/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cl_2;
import com.ky_2;
import java.lang.ref.WeakReference;
import javax.swing.JComponent;

public class aS {
    private WeakReference D;
    private String p;
    private String Q;
    private Object G;
    private boolean I;
    private boolean v;

    public aS() {
    }

    public aS(JComponent jComponent, String string, String string2, Object object, boolean bl, boolean bl2) {
        String string3 = cl_2.I();
        this.p(jComponent);
        this.b(string);
        this.h(string2);
        String string4 = string3;
        this.M(object);
        this.O(bl);
        this.e(bl2);
        if (ky_2.F() != null) {
            cl_2.A("Zjt7g");
        }
    }

    public JComponent l() {
        return (JComponent)this.D.get();
    }

    public void p(JComponent jComponent) {
        this.D = new WeakReference<JComponent>(jComponent);
    }

    public String d() {
        return this.p;
    }

    public void b(String string) {
        this.p = string;
    }

    public String N() {
        return this.Q;
    }

    public void h(String string) {
        this.Q = string;
    }

    public Object L() {
        return this.G;
    }

    public void M(Object object) {
        this.G = object;
    }

    public boolean G() {
        return this.I;
    }

    public void O(boolean bl) {
        this.I = bl;
    }

    public boolean V() {
        return this.v;
    }

    public void e(boolean bl) {
        this.v = bl;
    }
}

