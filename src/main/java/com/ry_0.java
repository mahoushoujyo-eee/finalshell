/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.R7;
import com.ds_0;
import com.rt_0;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.ComponentAdapter;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;

/*
 * Renamed from com.Ry
 */
class ry_0
extends R7 {
    final Window c;
    final ComponentAdapter j;
    final rt_0 Q;
    final Component u;
    final ComponentAdapter A;
    final FY i;
    final PropertyChangeListener f;
    final ds_0 H;
    private static final String a;

    ry_0(ds_0 ds_02, Window window, ComponentAdapter componentAdapter, rt_0 rt_02, Component component, ComponentAdapter componentAdapter2, FY fY2, PropertyChangeListener propertyChangeListener) {
        this.H = ds_02;
        this.c = window;
        this.j = componentAdapter;
        this.Q = rt_02;
        this.u = component;
        this.A = componentAdapter2;
        this.i = fY2;
        this.f = propertyChangeListener;
    }

    @Override
    public void u(ds_0 ds_02) {
        this.T();
    }

    @Override
    public void f(ds_0 ds_02) {
        this.T();
    }

    protected void T() {
        this.H.b(this);
        this.c.removeComponentListener(this.j);
        int[] nArray = ds_0.U();
        this.c.removeComponentListener(this.Q);
        this.u.removeComponentListener(this.A);
        int[] nArray2 = nArray;
        ry_0 ry_02 = this;
        if (nArray2 == null) {
            if (ry_02.u instanceof JComponent) {
                ((JComponent)this.u).removeAncestorListener(this.i);
            }
            ry_02 = this;
        }
        ry_02.H.removePropertyChangeListener(a, this.f);
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
                char[] cArray3 = "Z_Q\u0013P>>WDs\u0011V55MQH\nP>".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 18;
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
                            n17 = 43;
                            break;
                        }
                        case 1: {
                            n17 = 34;
                            break;
                        }
                        case 2: {
                            n17 = 46;
                            break;
                        }
                        case 3: {
                            n17 = 113;
                            break;
                        }
                        case 4: {
                            n17 = 45;
                            break;
                        }
                        case 5: {
                            n17 = 66;
                            break;
                        }
                        default: {
                            n17 = 73;
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

