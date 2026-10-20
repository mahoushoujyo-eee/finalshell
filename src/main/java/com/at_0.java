/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BX;
import com.aL;
import com.cf_2;
import com.k__0;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;

/*
 * Renamed from com.at
 */
public class at_0 {
    protected transient List q = new ArrayList(1);
    protected String m;
    protected Icon Q;
    protected String N;
    protected Color E;
    protected Color i;
    protected boolean j;
    protected boolean f;
    protected Component d;

    public at_0(String string, String string2, Component component) {
        this(string, null, string2, null, component);
    }

    public at_0(String string, Icon icon, Component component) {
        this(string, icon, null, null, component);
    }

    public at_0(String string, Icon icon, String string2, Component component) {
        this(string, icon, string2, null, component);
    }

    public at_0(String string, Icon icon, String string2, Color color, Component component) {
        this(string, icon, string2, color, true, component);
    }

    public at_0(String string, Icon icon, String string2, Color color, boolean bl, Component component) {
        this(string, icon, string2, color, bl, true, component);
    }

    public at_0(String string, Icon icon, String string2, Color color, boolean bl, boolean bl2, Component component) {
        this(string, icon, string2, Color.BLACK, color, bl, bl2, component);
    }

    public at_0(String string, Icon icon, String string2, Color color, Color color2, boolean bl, boolean bl2, Component component) {
        this.m = string;
        this.Q = icon;
        this.N = string2;
        this.E = color;
        this.i = color2;
        this.j = bl;
        this.f = bl2;
        this.d = component;
    }

    public String B() {
        return this.m;
    }

    public void d(String string) {
        this.m = string;
    }

    public Icon I() {
        return this.Q;
    }

    public void T(Icon icon) {
        this.Q = icon;
        this.j();
    }

    public String T() {
        return this.N;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String V() {
        String string;
        String[] stringArray = BX.B();
        String string2 = this.N;
        if (stringArray == null) {
            if (string2 != null) {
                string = this.N;
                return string;
            }
            string2 = this.m;
        }
        string = cf_2.X(string2);
        return string;
    }

    public void f(String string) {
        this.N = string;
        this.j();
    }

    public Color Y() {
        return this.E;
    }

    public void T(Color color) {
        this.E = color;
        this.j();
    }

    public Color d() {
        return this.i;
    }

    public void q(Color color) {
        Color color2 = this.i;
        this.i = color;
        this.p(color2, color);
    }

    public boolean J() {
        return this.j;
    }

    public void d(boolean bl) {
        this.j = bl;
        this.j();
    }

    public boolean K() {
        return this.f;
    }

    public void u(boolean bl) {
        this.f = bl;
    }

    public Component c() {
        return this.d;
    }

    public void y(Component component) {
        Component component2 = this.d;
        this.d = component;
        this.U(component2, component);
    }

    public List U() {
        return aL.J((Collection)this.q);
    }

    public void f(k__0 k__02) {
        this.q.add(k__02);
    }

    public void m(k__0 k__02) {
        this.q.remove(k__02);
    }

    public void j() {
        Iterator iterator = aL.J((Collection)this.q).iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            k__0 k__02 = (k__0)iterator.next();
            k__02.k(this);
            if (stringArray == null) continue;
        }
    }

    public void p(Color color, Color color2) {
        Iterator iterator = aL.J((Collection)this.q).iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            k__0 k__02 = (k__0)iterator.next();
            k__02.K(this, color, color2);
            if (stringArray == null) continue;
        }
    }

    public void U(Component component, Component component2) {
        Iterator iterator = aL.J((Collection)this.q).iterator();
        String[] stringArray = BX.B();
        while (iterator.hasNext()) {
            k__0 k__02 = (k__0)iterator.next();
            k__02.V(this, component, component2);
            if (stringArray == null) continue;
        }
    }
}

