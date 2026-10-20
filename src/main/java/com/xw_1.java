/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.X0;
import com._y_0;
import com.aD;
import com.c6_0;
import com.cn_0;
import com.l6_0;
import com.qd_0;
import com.wh_1;
import com.wv_0;
import com.zK;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from com.xW
 */
class xw_1
extends JPanel
implements FocusListener {
    private final _y_0 i;
    private final l6_0 G;
    final cn_0 u;
    private static final String a;

    private xw_1(@NotNull cn_0 cn_02, wh_1 wh_12, _y_0 _y_02) {
        this.u = cn_02;
        super(new FlowLayout(0, 0, 0));
        this.G = new l6_0(this, null);
        this.i = _y_02;
        this.setOpaque(false);
        this.setFocusable(false);
        this.addFocusListener(this);
        wv_0 wv_02 = new wv_0(this);
        wv_02.addFocusListener(this);
        wv_02.addMouseListener(new c6_0(this, cn_02, wh_12, _y_02));
        this.G.o(wv_02);
        this.add(this.G);
    }

    protected void M(MouseEvent mouseEvent) {
        block4: {
            MouseEvent mouseEvent2;
            block6: {
                int n10;
                block5: {
                    String[] stringArray;
                    block2: {
                        block3: {
                            stringArray = cn_0.Q();
                            n10 = mouseEvent.isPopupTrigger();
                            if (stringArray == null) break block2;
                            if (n10 == 0) break block3;
                            JPopupMenu jPopupMenu = this.B();
                            jPopupMenu.show(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY());
                            if (stringArray != null) break block4;
                        }
                        n10 = mouseEvent.getClickCount();
                    }
                    if (stringArray == null) break block5;
                    if (n10 != 2) break block4;
                    mouseEvent2 = mouseEvent;
                    if (stringArray == null) break block6;
                    n10 = mouseEvent2.isConsumed() ? 1 : 0;
                }
                if (n10 != 0) break block4;
                mouseEvent2 = mouseEvent;
            }
            mouseEvent2.consume();
            this.V();
        }
    }

    protected JPopupMenu B() {
        JPopupMenu jPopupMenu = new JPopupMenu();
        aD.m(jPopupMenu, this.u);
        JMenuItem jMenuItem = new JMenuItem(a);
        jMenuItem.addActionListener(this::lambda$createPopup$0);
        jPopupMenu.add(jMenuItem);
        return jPopupMenu;
    }

    private void V() {
        int n10 = cn_0.l(this.u).z();
        JLabel jLabel = (JLabel)this.G.getComponent(0);
        new X0().B(n10, jLabel.getText(), jLabel, new qd_0(this));
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        this.i.M().requestFocusInWindow();
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
    }

    private void lambda$createPopup$0(ActionEvent actionEvent) {
        this.V();
    }

    xw_1(cn_0 cn_02, wh_1 wh_12, _y_0 _y_02, zK zK2) {
        this(cn_02, wh_12, _y_02);
    }

    static l6_0 w(xw_1 xw_12) {
        return xw_12.G;
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
                char[] cArray3 = "\u001f!\u0014\u0018adN\u0019%\u0018".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 109;
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
                            n17 = 41;
                            break;
                        }
                        case 2: {
                            n17 = 23;
                            break;
                        }
                        case 3: {
                            n17 = 20;
                            break;
                        }
                        case 4: {
                            n17 = 97;
                            break;
                        }
                        case 5: {
                            n17 = 108;
                            break;
                        }
                        default: {
                            n17 = 3;
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

