/*
 * Decompiled with CFR 0.152.
 */
package com.L;

import com.GA;
import com.L.N;
import com.L.Z;
import com.L.m;
import com.Y9;
import com.a9;
import com.ky_2;
import com.l.j_0;
import com.xm_0;
import com.yc_0;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.plaf.ListUI;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.ScrollPaneUI;
import javax.swing.plaf.basic.BasicComboPopup;

class c
extends BasicComboPopup {
    final m Z;
    private static final String a;

    c(m m10, JComboBox jComboBox) {
        this.Z = m10;
        super(jComboBox);
    }

    @Override
    protected JScrollPane createScroller() {
        JScrollPane jScrollPane;
        block9: {
            block10: {
                ky_2[] ky_2Array;
                block8: {
                    block7: {
                        jScrollPane = super.createScroller();
                        ky_2Array = m.X();
                        if (ky_2Array != null) break block7;
                        if (!a9.H()) break block8;
                        jScrollPane.setOpaque(false);
                    }
                    jScrollPane.getViewport().setOpaque(false);
                }
                ScrollPaneUI scrollPaneUI = jScrollPane.getUI();
                if (ky_2Array != null) break block9;
                if (!(scrollPaneUI instanceof Y9)) break block10;
                Y9 y9 = (Y9)scrollPaneUI;
                y9.Y(false);
                ScrollBarUI scrollBarUI = jScrollPane.getVerticalScrollBar().getUI();
                if (ky_2Array != null) break block9;
                if (scrollBarUI instanceof xm_0) {
                    xm_0 xm_02 = (xm_0)scrollBarUI;
                    xm_02.i(com.L.Z.k);
                    xm_02.R(com.L.Z.m);
                    xm_02.Y(com.L.Z.K);
                }
            }
            GA.B(jScrollPane, a);
        }
        return jScrollPane;
    }

    protected JList createList() {
        JList<Object> jList = super.createList();
        ky_2[] ky_2Array = m.X();
        ListUI listUI = jList.getUI();
        if (ky_2Array == null) {
            if (listUI instanceof yc_0) {
                yc_0 yc_02 = (yc_0)listUI;
                yc_02.q(false);
                yc_02.C(false);
            }
            jList.addListSelectionListener(new j_0(this));
        }
        return jList;
    }

    @Override
    protected void configurePopup() {
        super.configurePopup();
        this.addPopupMenuListener(new N(this));
    }

    @Override
    public void show() {
        this.comboBox.firePopupMenuWillBecomeVisible();
        this.b(this.comboBox.getSelectedIndex());
        Point point = this.z();
        this.show(this.comboBox, point.x + cy_1.E, point.y + cy_1.Q);
    }

    private void b(int n10) {
        block4: {
            block2: {
                block3: {
                    ky_2[] ky_2Array = m.X();
                    if (ky_2Array != null) break block2;
                    if (n10 != -1) break block3;
                    this.list.clearSelection();
                    if (ky_2Array == null) break block4;
                }
                this.list.setSelectedIndex(n10);
            }
            this.list.ensureIndexIsVisible(n10);
        }
    }

    private Point z() {
        Cloneable cloneable;
        c c2;
        Dimension dimension;
        block4: {
            Dimension dimension2;
            block6: {
                block5: {
                    dimension = this.comboBox.getSize();
                    ky_2[] ky_2Array = m.X();
                    c2 = this;
                    if (ky_2Array != null) break block4;
                    if (!c2.Z.f) break block5;
                    cloneable = this.comboBox.getPreferredSize();
                    dimension2 = cloneable;
                    if (ky_2Array != null) break block6;
                    if (dimension2.width > dimension.width) {
                        dimension.width = ((Dimension)cloneable).width;
                    }
                }
                dimension2 = dimension;
            }
            dimension2.setSize(dimension.width - 2, this.getPopupHeightForRowCount(this.comboBox.getMaximumRowCount()));
            c2 = this;
        }
        cloneable = c2.computePopupBounds(0, this.comboBox.getBounds().height, dimension.width, dimension.height);
        Dimension dimension3 = ((Rectangle)cloneable).getSize();
        this.scroller.setMaximumSize(dimension3);
        this.scroller.setPreferredSize(dimension3);
        this.scroller.setMinimumSize(dimension3);
        this.list.revalidate();
        return ((Rectangle)cloneable).getLocation();
    }

    static JComboBox L(c c2) {
        return c2.comboBox;
    }

    static JComboBox O(c c2) {
        return c2.comboBox;
    }

    static JComboBox C(c c2) {
        return c2.comboBox;
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
                char[] cArray3 = "b\u0015@ \u0016O$n\u0002".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 74;
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
                            n17 = 75;
                            break;
                        }
                        case 1: {
                            n17 = 48;
                            break;
                        }
                        case 2: {
                            n17 = 103;
                            break;
                        }
                        case 3: {
                            n17 = 8;
                            break;
                        }
                        case 4: {
                            n17 = 51;
                            break;
                        }
                        case 5: {
                            n17 = 40;
                            break;
                        }
                        default: {
                            n17 = 12;
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

