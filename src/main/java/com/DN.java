/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.NE;
import com.WF;
import com.cs_0;
import com.ky_2;
import com.wc_0;
import java.awt.Component;
import java.lang.ref.WeakReference;
import javax.swing.JComponent;

public class DN {
    private String t = null;
    private boolean j = false;
    private WeakReference x = null;
    private WeakReference K = null;
    private cs_0 O;
    private WF p;
    private wc_0 J;
    private static final String a;

    public DN() {
        String[] stringArray = GR.I();
        this.O = null;
        this.p = null;
        this.J = null;
        if (ky_2.F() != null) {
            GR.O(new String[2]);
        }
    }

    public String k() {
        String[] stringArray = GR.I();
        String string = this.t;
        if (stringArray != null) {
            if (string == null) {
                this.C();
            }
            string = this.t;
        }
        return string;
    }

    public void b(String string) {
        this.t = string;
    }

    public void C() {
        this.t = NE.E(a);
    }

    public boolean o() {
        return this.j;
    }

    public DN s(boolean bl) {
        this.j = bl;
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Component R() {
        String[] stringArray = GR.I();
        WeakReference weakReference = this.x;
        if (stringArray != null) {
            if (weakReference == null) return null;
            weakReference = this.x.get();
        }
        Component component = (Component)((Object)weakReference);
        return component;
    }

    public DN p(Component component) {
        this.x = new WeakReference<Component>(component);
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JComponent j() {
        String[] stringArray = GR.I();
        WeakReference weakReference = this.K;
        if (stringArray != null) {
            if (weakReference == null) return null;
            weakReference = this.K.get();
        }
        JComponent jComponent = (JComponent)((Object)weakReference);
        return jComponent;
    }

    public DN u(JComponent jComponent) {
        this.K = new WeakReference<JComponent>(jComponent);
        return this;
    }

    public cs_0 x() {
        return this.O;
    }

    public DN M(cs_0 cs_02) {
        this.O = cs_02;
        return this;
    }

    public WF O() {
        return this.p;
    }

    public DN T(WF wF) {
        this.p = wF;
        return this;
    }

    public wc_0 t() {
        return this.J;
    }

    public DN v(wc_0 wc_02) {
        this.J = wc_02;
        return this;
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
                char[] cArray3 = "V_".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 20;
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
                            n17 = 10;
                            break;
                        }
                        case 1: {
                            n17 = 2;
                            break;
                        }
                        case 2: {
                            n17 = 4;
                            break;
                        }
                        case 3: {
                            n17 = 111;
                            break;
                        }
                        case 4: {
                            n17 = 29;
                            break;
                        }
                        case 5: {
                            n17 = 99;
                            break;
                        }
                        default: {
                            n17 = 124;
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

