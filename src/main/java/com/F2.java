/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ax_0;
import com.ky_2;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.zo_0;
import java.io.Serializable;

@XStreamAlias(value="ResourceFile")
public class F2
implements Serializable {
    @XStreamAsAttribute
    private zo_0 B;
    @XStreamAsAttribute
    private String u;
    @XStreamAsAttribute
    private String h;
    private static int[] I;

    public F2(zo_0 zo_02, String string) {
        this(zo_02, string, (String)null);
    }

    public F2(zo_0 zo_02, String string, Class clazz) {
        this(zo_02, string, clazz.getCanonicalName());
    }

    public F2(zo_0 zo_02, String string, String string2) {
        int[] nArray = F2.T();
        this.u(zo_02);
        int[] nArray2 = nArray;
        this.f(string);
        this.G(string2);
        if (ky_2.F() != null) {
            F2.Q(new int[3]);
        }
    }

    public zo_0 G() {
        return this.B;
    }

    public void u(zo_0 zo_02) {
        this.B = zo_02;
    }

    public String b() {
        return this.u;
    }

    public void f(String string) {
        this.u = string;
    }

    public String D() {
        return this.h;
    }

    public void G(String string) {
        this.h = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        F2 f22;
        int[] nArray = F2.T();
        Object object2 = object;
        if (nArray != null) {
            if (object2 == null) return false;
            object2 = object;
        }
        boolean bl = object2 instanceof F2;
        if (nArray == null) return bl;
        if (!bl) return false;
        F2 f23 = f22 = (F2)object;
        if (nArray != null) {
            if (f23.B != this.B) return false;
            f23 = f22;
        }
        boolean bl2 = ax_0.Z(f23.u, new Object[]{this.u});
        if (nArray != null) {
            if (!bl2) return false;
            bl2 = ax_0.Z(f22.h, new Object[]{this.h});
        }
        if (nArray == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static void Q(int[] nArray) {
        I = nArray;
    }

    public static int[] T() {
        return I;
    }

    static {
        if (F2.T() == null) {
            F2.Q(new int[4]);
        }
    }
}

