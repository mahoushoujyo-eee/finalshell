/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GR;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import javax.swing.KeyStroke;

/*
 * Renamed from com.Cs
 */
@XStreamAlias(value="HotkeyData")
public class cs_0
implements Serializable,
Cloneable {
    @XStreamAsAttribute
    protected boolean A;
    @XStreamAsAttribute
    protected boolean e;
    @XStreamAsAttribute
    protected boolean L;
    @XStreamAsAttribute
    protected Integer W;
    protected transient Integer O;
    private static final long a;

    public cs_0() {
        this.A = false;
        this.e = false;
        this.L = false;
        this.W = null;
        this.O = null;
    }

    public cs_0(KeyEvent keyEvent) {
        this.A = FN.m(keyEvent);
        this.e = FN.O(keyEvent);
        this.L = FN.y(keyEvent);
        this.W = keyEvent.getKeyCode();
        this.O = null;
    }

    public cs_0(Integer n10) {
        this.A = false;
        this.e = false;
        this.L = false;
        this.W = n10;
        this.O = null;
    }

    public cs_0(boolean bl, boolean bl2, boolean bl3, Integer n10) {
        this.A = bl;
        this.e = bl2;
        this.L = bl3;
        this.W = n10;
        this.O = null;
    }

    public cs_0(KeyStroke keyStroke) {
        this.z(keyStroke.getModifiers());
        this.W = keyStroke.getKeyCode();
        this.O = null;
    }

    public boolean I() {
        return this.A;
    }

    public void s(boolean bl) {
        this.A = bl;
        this.O = null;
    }

    public boolean p() {
        return this.e;
    }

    public void M(boolean bl) {
        this.e = bl;
        this.O = null;
    }

    public boolean w() {
        return this.L;
    }

    public void x(boolean bl) {
        this.L = bl;
        this.O = null;
    }

    public Integer c() {
        return this.W;
    }

    public void D(Integer n10) {
        this.W = n10;
        this.O = null;
    }

    public boolean g() {
        return this.W != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean J(KeyEvent keyEvent) {
        String[] stringArray = GR.I();
        boolean bl = this.q(keyEvent);
        if (stringArray != null) {
            if (!bl) return false;
            bl = this.v(keyEvent);
        }
        if (stringArray == null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean q(KeyEvent keyEvent) {
        String[] stringArray = GR.I();
        boolean bl = FN.i(keyEvent);
        boolean bl2 = this.A;
        if (stringArray != null) {
            if (bl != bl2) return false;
            bl = FN.O(keyEvent);
            bl2 = this.e;
        }
        if (stringArray != null) {
            if (bl != bl2) return false;
            bl = FN.y(keyEvent);
            if (stringArray == null) return bl;
            bl2 = this.L;
        }
        if (bl != bl2) return false;
        return true;
    }

    public boolean v(KeyEvent keyEvent) {
        String[] stringArray = GR.I();
        int n10 = keyEvent.getKeyCode();
        if (stringArray != null) {
            n10 = n10 == this.W ? 1 : 0;
        }
        return n10 != 0;
    }

    public KeyStroke U() {
        return KeyStroke.getKeyStroke(this.W, this.X());
    }

    public int X() {
        String[] stringArray = GR.I();
        int n10 = this.A;
        if (stringArray != null) {
            n10 = n10 != 0 ? FN.I() : 0;
        }
        int n11 = this.e;
        if (stringArray != null) {
            n11 = n11 != 0 ? (int)a : 0;
        }
        int n13 = n10 | n11;
        n13 = this.L;
        if (stringArray != null) {
            n13 = n13 != 0 ? 1 : 0;
        }
        return n12 | n13;
    }

    public void z(int n10) {
        this.A = FN.k(n10);
        this.e = FN.g(n10);
        this.L = FN.J(n10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String[] stringArray = GR.I();
        Object object2 = object;
        if (stringArray != null) {
            if (object2 == null) return 0 != 0;
            object2 = object;
        }
        int n10 = object2 instanceof cs_0;
        if (stringArray != null) {
            if (n10 == 0) return 0 != 0;
            n10 = object.hashCode();
        }
        if (stringArray == null) return n10 != 0;
        if (n10 != this.hashCode()) return 0 != 0;
        return 1 != 0;
    }

    public String toString() {
        return FN.r(this);
    }

    public int hashCode() {
        String[] stringArray = GR.I();
        Integer n10 = this.O;
        if (stringArray != null) {
            if (n10 == null) {
                this.O = this.toString().hashCode();
            }
            n10 = this.O;
        }
        return n10;
    }

    protected cs_0 D() {
        return new cs_0(this.I(), this.p(), this.w(), this.c());
    }

    protected Object clone() throws CloneNotSupportedException {
        return this.D();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3590876076870950547L;
        a = 0x707B4BFA42575E9BL ^ l2;
    }
}

