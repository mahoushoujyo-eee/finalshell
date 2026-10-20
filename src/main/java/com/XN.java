/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.C.L;
import com.C.M;
import com.FJ;
import com.dl_2;
import com.og_2;
import com.pb_2;
import java.awt.Container;
import java.awt.Rectangle;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.PopupMenuUI;

public class XN
implements ChangeListener {
    protected JMenuItem U;
    private static final String a;

    public static XN y(JMenuItem jMenuItem) {
        XN xN2 = new XN(jMenuItem);
        jMenuItem.getModel().addChangeListener(xN2);
        jMenuItem.addPropertyChangeListener(a, new dl_2(xN2, jMenuItem));
        return xN2;
    }

    public static void s(XN xN2, JMenuItem jMenuItem) {
        jMenuItem.getModel().removeChangeListener(xN2);
    }

    public XN(JMenuItem jMenuItem) {
        this.U = jMenuItem;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        block5: {
            int n10;
            int n11;
            JPopupMenu jPopupMenu;
            block11: {
                int n12;
                int[] nArray;
                block8: {
                    block10: {
                        L l2;
                        block9: {
                            og_2 og_22;
                            block7: {
                                og_2 og_23;
                                PopupMenuUI popupMenuUI;
                                block6: {
                                    Container container;
                                    block4: {
                                        Container container2 = this.U.getParent();
                                        nArray = pb_2.g();
                                        container = container2;
                                        if (nArray == null) break block4;
                                        if (!(container instanceof JPopupMenu)) break block5;
                                        container = container2;
                                    }
                                    jPopupMenu = (JPopupMenu)container;
                                    popupMenuUI = jPopupMenu.getUI();
                                    if (nArray == null) break block6;
                                    if (!(popupMenuUI instanceof FJ)) break block5;
                                    popupMenuUI = jPopupMenu.getUI();
                                }
                                FJ fJ2 = (FJ)popupMenuUI;
                                og_22 = og_23 = fJ2.a();
                                if (nArray == null) break block7;
                                if (!(og_22 instanceof L)) break block5;
                                og_22 = og_23;
                            }
                            if ((l2 = (L)og_22).M() != M.dropdown) break block5;
                            n12 = jPopupMenu.getComponentZOrder(this.U);
                            n11 = l2.I();
                            n10 = 1;
                            if (nArray == null) break block8;
                            if (n11 != n10) break block9;
                            n11 = n12;
                            if (nArray == null) break block10;
                            if (n11 != 0) break block9;
                            jPopupMenu.repaint(0, 0, jPopupMenu.getWidth(), this.U.getBounds().y);
                            if (nArray != null) break block5;
                        }
                        n11 = l2.I();
                    }
                    n10 = 5;
                }
                if (nArray == null) break block11;
                if (n11 != n10) break block5;
                n11 = n12;
                n10 = jPopupMenu.getComponentCount() - 1;
            }
            if (n11 == n10) {
                Rectangle rectangle = this.U.getBounds();
                int n13 = rectangle.y + rectangle.height;
                jPopupMenu.repaint(0, n13, jPopupMenu.getWidth(), jPopupMenu.getHeight() - n13);
            }
        }
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
                char[] cArray3 = "\u00130Ri\u0010".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 9;
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
                            n17 = 119;
                            break;
                        }
                        case 1: {
                            n17 = 86;
                            break;
                        }
                        case 2: {
                            n17 = 63;
                            break;
                        }
                        case 3: {
                            n17 = 5;
                            break;
                        }
                        case 4: {
                            n17 = 117;
                            break;
                        }
                        case 5: {
                            n17 = 14;
                            break;
                        }
                        default: {
                            n17 = 15;
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

