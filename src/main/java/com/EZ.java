/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NE;
import com.pf_1;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.awt.Rectangle;
import java.io.Serializable;

@XStreamAlias(value="NinePatchInterval")
public final class EZ
implements Serializable,
Cloneable {
    @XStreamAsAttribute
    private transient String E;
    @XStreamAsAttribute
    private boolean Y;
    @XStreamAsAttribute
    private int v;
    @XStreamAsAttribute
    private int P;
    private static final String a;

    public EZ() {
        this(0);
    }

    public EZ(int n10) {
        this(n10, n10);
    }

    public EZ(int n10, boolean bl) {
        this(n10, n10, bl);
    }

    public EZ(int n10, int n11) {
        this(n10, n11, true);
    }

    public EZ(int n10, int n11, boolean bl) {
        this.k();
        this.i(bl);
        this.z(n10);
        this.T(n11);
    }

    public String P() {
        return this.E;
    }

    public void Z(String string) {
        this.E = string;
    }

    public void k() {
        this.E = NE.E(a);
    }

    public boolean C() {
        return this.Y;
    }

    public void i(boolean bl) {
        this.Y = bl;
    }

    public int x() {
        return this.v;
    }

    public void z(int n10) {
        this.v = n10;
    }

    public int f() {
        return this.P;
    }

    public void T(int n10) {
        this.P = n10;
    }

    public boolean s(EZ eZ) {
        return new Rectangle(this.x(), 0, this.f() - this.x(), 1).intersects(new Rectangle(eZ.x(), 0, eZ.f() - eZ.x(), 1));
    }

    public EZ R() {
        EZ eZ = new EZ();
        eZ.Z(this.P());
        eZ.i(this.C());
        eZ.z(this.x());
        eZ.T(this.f());
        return eZ;
    }

    public int s() {
        return this.f() - this.x();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Y(EZ eZ) {
        String string = pf_1.c();
        EZ eZ2 = eZ;
        if (string == null) {
            if (eZ2 == null) return false;
            eZ2 = this;
        }
        boolean bl = eZ2.P().equals(eZ.P());
        if (string != null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        String string = pf_1.c();
        Object object2 = object;
        if (string == null) {
            if (object2 == null) return false;
            object2 = object;
        }
        boolean bl = object2 instanceof EZ;
        if (string != null) return bl;
        if (!bl) return false;
        EZ eZ = (EZ)object;
        int n10 = this.C();
        int n11 = eZ.C();
        if (string == null) {
            if (n10 != n11) return 0 != 0;
            n10 = this.x();
            n11 = eZ.x();
        }
        if (string == null) {
            if (n10 != n11) return 0 != 0;
            n10 = this.f();
            if (string != null) return n10 != 0;
            n11 = eZ.f();
        }
        if (n10 != n11) return 0 != 0;
        return 1 != 0;
    }

    public Object clone() throws CloneNotSupportedException {
        return this.R();
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "Ny/".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 16;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 16;
                            break;
                        }
                        case 1: {
                            n17 = 57;
                            break;
                        }
                        case 2: {
                            n17 = 118;
                            break;
                        }
                        case 3: {
                            n17 = 55;
                            break;
                        }
                        case 4: {
                            n17 = 64;
                            break;
                        }
                        case 5: {
                            n17 = 93;
                            break;
                        }
                        default: {
                            n17 = 39;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

