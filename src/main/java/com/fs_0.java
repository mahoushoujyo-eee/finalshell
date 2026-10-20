/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.C0;
import com.E_;
import com.F5;
import com.G4;
import com.G_;
import com.HT;
import com.J;
import com.KX;
import com.O5;
import com.P4;
import com.PB;
import com.QL;
import com.R7;
import com.RE;
import com.W8;
import com._8;
import com._d_0;
import com._f_0;
import com._h_0;
import com._i_0;
import com.aJ;
import com.aU;
import com.az_0;
import com.cs_0;
import com.d3_0;
import com.ds_0;
import com.e__0;
import com.ea_1;
import com.hk_0;
import com.kv_2;
import com.la_0;
import com.n4_0;
import com.nm_1;
import com.nn_0;
import com.oj_1;
import com.rd_0;
import com.rf_0;
import com.ri_0;
import com.rk_0;
import com.sr_0;
import com.uC;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import javax.swing.text.JTextComponent;

/*
 * Renamed from com.Fs
 */
public class fs_0 {
    private static final String a;

    public static MouseAdapter F(Component component, O5 o5) {
        return fs_0.h(component, null, o5);
    }

    public static MouseAdapter h(Component component, HT hT2, O5 o5) {
        uC uC2 = new uC(hT2, o5);
        component.addMouseListener(uC2);
        return uC2;
    }

    public static MouseAdapter P(Component component, O5 o5) {
        PB pB = new PB(o5);
        component.addMouseListener(pB);
        return pB;
    }

    public static MouseAdapter H(Component component, O5 o5) {
        P4 p42 = new P4(o5);
        component.addMouseListener(p42);
        return p42;
    }

    public static MouseAdapter W(Component component, O5 o5) {
        return fs_0.W(component, null, o5);
    }

    public static MouseAdapter W(Component component, HT hT2, O5 o5) {
        G4 g42 = new G4(hT2, o5);
        component.addMouseMotionListener(g42);
        return g42;
    }

    public static MouseAdapter J(Component component, O5 o5) {
        return fs_0.O(component, null, o5);
    }

    public static MouseAdapter O(Component component, HT hT2, O5 o5) {
        n4_0 n4_02 = new n4_0(hT2, o5);
        component.addMouseListener(n4_02);
        return n4_02;
    }

    public static MouseAdapter q(Component component, O5 o5) {
        hk_0 hk_02 = new hk_0(o5);
        component.addMouseListener(hk_02);
        return hk_02;
    }

    public static MouseAdapter o(Component component, O5 o5) {
        G_ g_2 = new G_(o5);
        component.addMouseListener(g_2);
        return g_2;
    }

    public static KeyAdapter G(Component component, sr_0 sr_02) {
        return fs_0.O(component, null, sr_02);
    }

    public static KeyAdapter O(Component component, cs_0 cs_02, sr_0 sr_02) {
        W8 w8 = new W8(cs_02, sr_02);
        component.addKeyListener(w8);
        return w8;
    }

    public static KeyAdapter Q(Component component, sr_0 sr_02) {
        return fs_0.R(component, null, sr_02);
    }

    public static KeyAdapter R(Component component, cs_0 cs_02, sr_0 sr_02) {
        J j2 = new J(cs_02, sr_02);
        component.addKeyListener(j2);
        return j2;
    }

    public static KeyAdapter u(Component component, sr_0 sr_02) {
        return fs_0.I(component, null, sr_02);
    }

    public static KeyAdapter I(Component component, cs_0 cs_02, sr_0 sr_02) {
        oj_1 oj_12 = new oj_1(cs_02, sr_02);
        component.addKeyListener(oj_12);
        return oj_12;
    }

    public static FocusAdapter K(Component component, az_0 az_02) {
        KX kX = new KX(az_02);
        component.addFocusListener(kX);
        return kX;
    }

    public static FocusAdapter t(Component component, az_0 az_02) {
        nn_0 nn_02 = new nn_0(az_02);
        component.addFocusListener(nn_02);
        return nn_02;
    }

    public static WindowAdapter G(Window window, E_ e_) {
        kv_2 kv_22 = new kv_2(e_);
        window.addWindowListener(kv_22);
        return kv_22;
    }

    public static aJ c(Window window, e__0 e__02) {
        aU aU2 = new aU(e__02);
        window.addWindowListener(aU2);
        window.addComponentListener(aU2);
        return aU2;
    }

    public static F5 X(JTextComponent jTextComponent, rk_0 rk_02) {
        ea_1 ea_12 = new ea_1(rk_02);
        jTextComponent.getDocument().addDocumentListener(ea_12);
        la_0 la_02 = new la_0(ea_12);
        jTextComponent.addPropertyChangeListener(a, la_02);
        return new F5(ea_12, la_02);
    }

    public static R7 r(ds_0 ds_02, C0 c0) {
        RE rE = new RE(c0);
        ds_02.D(rE);
        return rE;
    }

    public static R7 E(ds_0 ds_02, C0 c0) {
        rd_0 rd_02 = new rd_0(c0);
        ds_02.D(rd_02);
        return rd_02;
    }

    public static R7 w(ds_0 ds_02, C0 c0) {
        ri_0 ri_02 = new ri_0(c0);
        ds_02.D(ri_02);
        return ri_02;
    }

    public static R7 F(ds_0 ds_02, C0 c0) {
        rf_0 rf_02 = new rf_0(c0);
        ds_02.D(rf_02);
        return rf_02;
    }

    public static _d_0 P(QL qL, d3_0 d3_02) {
        _i_0 _i_02 = new _i_0(d3_02);
        qL.o(_i_02);
        return _i_02;
    }

    public static _d_0 l(QL qL, d3_0 d3_02) {
        _f_0 _f_02 = new _f_0(d3_02);
        qL.o(_f_02);
        return _f_02;
    }

    public static _d_0 H(QL qL, nm_1 nm_12) {
        _8 _82 = new _8(nm_12);
        qL.o(_82);
        return _82;
    }

    public static _d_0 b(QL qL, d3_0 d3_02) {
        _h_0 _h_02 = new _h_0(d3_02);
        qL.o(_h_02);
        return _h_02;
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
                char[] cArray3 = "\u001axUG\u001394\n".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 94;
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
                            n17 = 32;
                            break;
                        }
                        case 1: {
                            n17 = 73;
                            break;
                        }
                        case 2: {
                            n17 = 104;
                            break;
                        }
                        case 3: {
                            n17 = 108;
                            break;
                        }
                        case 4: {
                            n17 = 32;
                            break;
                        }
                        case 5: {
                            n17 = 2;
                            break;
                        }
                        default: {
                            n17 = 4;
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

