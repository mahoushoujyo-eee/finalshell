/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.a9;
import com.xd_1;
import java.awt.Component;
import java.awt.Container;
import java.awt.KeyEventPostProcessor;
import java.awt.Window;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.ComboPopup;

public class YR
implements KeyEventPostProcessor {
    private static boolean r;
    private static boolean q;
    private static JRootPane f;
    private static Window e;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean postProcessKeyEvent(KeyEvent var1_1) {
        block22: {
            block14: {
                block15: {
                    block18: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        block16: {
                                            var2_2 = xd_1.U();
                                            v0 = var1_1.isConsumed();
                                            if (var2_2 == null) {
                                                if (v0 != 0) {
                                                    return false;
                                                }
                                                v0 = var1_1.getKeyCode();
                                            }
                                            if (var2_2 != null) break block14;
                                            if (v0 != YR.a(32254, 5881030798086241633L)) break block15;
                                            v1 = YR.f = SwingUtilities.getRootPane(var1_1.getComponent());
                                            if (var2_2 != null) ** GOTO lbl15
                                            if (v1 == null) {
                                                v2 = null;
                                            } else {
                                                v1 = YR.f;
lbl15:
                                                // 2 sources

                                                v2 = FN.L(v1);
                                            }
                                            YR.e = v2;
                                            v3 = var1_1.getID();
                                            v4 = YR.a(31642, 9012265058378480391L);
                                            if (var2_2 != null) break block16;
                                            if (v3 == v4) {
                                                v5 = YR.r;
                                                if (var2_2 == null) {
                                                    if (!v5) {
                                                        this.t(var1_1);
                                                    }
                                                    YR.r = true;
                                                    v5 = true;
                                                }
                                                return v5;
                                            }
                                            v3 = var1_1.getID();
                                            if (var2_2 != null) break block17;
                                            v4 = YR.a(14031, 3092722417169708627L);
                                        }
                                        if (v3 != v4) break block18;
                                        v3 = (int)YR.r;
                                    }
                                    if (v3 == 0) break block19;
                                    this.M();
                                    if (var2_2 == null) break block20;
                                }
                                var3_3 = MenuSelectionManager.defaultManager();
                                var4_4 = var3_3.getSelectedPath();
                                v6 = var4_4.length;
                                if (var2_2 != null) break block21;
                                if (v6 <= 0) {
                                    a9.I(true);
                                    this.L(YR.e);
                                }
                            }
                            v6 = 0;
                        }
                        YR.r = v6;
                    }
                    YR.f = null;
                    YR.e = null;
                    if (var2_2 == null) break block22;
                }
                v0 = 0;
            }
            YR.r = v0;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private void t(KeyEvent var1_1) {
        block10: {
            block13: {
                block14: {
                    block15: {
                        block11: {
                            block12: {
                                block8: {
                                    block9: {
                                        var3_2 = MenuSelectionManager.defaultManager();
                                        var2_3 = xd_1.U();
                                        var4_4 = var3_2.getSelectedPath();
                                        v0 = var4_4.length;
                                        if (var2_3 != null) break block8;
                                        if (v0 <= false) break block9;
                                        v0 = var4_4[0] instanceof ComboPopup;
                                        if (var2_3 != null) break block8;
                                        if (v0) break block9;
                                        var3_2.clearSelectedPath();
                                        YR.q = true;
                                        var1_1.consume();
                                        if (var2_3 == null) break block10;
                                    }
                                    v0 = var4_4.length;
                                }
                                if (var2_3 != null) break block11;
                                if (v0 <= false) break block12;
                                YR.q = false;
                                a9.I(false);
                                this.L(YR.e);
                                var1_1.consume();
                                if (var2_3 == null) break block10;
                            }
                            YR.q = false;
                            v0 = false;
                        }
                        a9.I(v0);
                        this.L(YR.e);
                        v1 = YR.f;
                        if (var2_3 != null) ** GOTO lbl34
                        if (v1 != null) {
                            v1 = YR.f;
lbl34:
                            // 2 sources

                            v2 = v1.getJMenuBar();
                        } else {
                            v2 = null;
                        }
                        v3 = var5_5 = v2;
                        if (var2_3 != null) break block13;
                        if (v3 != null) break block14;
                        v4 = YR.e;
                        if (var2_3 != null) break block15;
                        if (!(v4 instanceof JFrame)) break block14;
                        v4 = YR.e;
                    }
                    var5_5 = ((JFrame)v4).getJMenuBar();
                }
                v3 = var5_5;
            }
            if (var2_3 != null) ** GOTO lbl52
            if (v3 != null) {
                v3 = var5_5;
lbl52:
                // 2 sources

                v5 = v3.getMenu(0);
            } else {
                v5 = var6_6 = null;
            }
            if (var6_6 != null) {
                var1_1.consume();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void M() {
        block26: {
            block27: {
                block18: {
                    block19: {
                        block24: {
                            block25: {
                                block23: {
                                    block20: {
                                        block21: {
                                            block22: {
                                                block17: {
                                                    block16: {
                                                        var1_1 = xd_1.U();
                                                        v0 = YR.q;
                                                        if (var1_1 != null) break block16;
                                                        if (!v0) break block17;
                                                        v0 = true;
                                                    }
                                                    a9.I(v0);
                                                    this.L(YR.e);
                                                    return;
                                                }
                                                var2_2 = MenuSelectionManager.defaultManager();
                                                v1 = var2_2.getSelectedPath().length;
                                                if (var1_1 != null) break block18;
                                                if (v1) break block19;
                                                v2 = YR.f;
                                                if (var1_1 != null) ** GOTO lbl19
                                                if (v2 != null) {
                                                    v2 = YR.f;
lbl19:
                                                    // 2 sources

                                                    v3 = v2.getJMenuBar();
                                                } else {
                                                    v3 = null;
                                                }
                                                v4 = var3_3 = v3;
                                                if (var1_1 != null) break block20;
                                                if (v4 != null) break block21;
                                                v5 = YR.e;
                                                if (var1_1 != null) break block22;
                                                if (!(v5 instanceof JFrame)) break block21;
                                                v5 = YR.e;
                                            }
                                            var3_3 = ((JFrame)v5).getJMenuBar();
                                        }
                                        v4 = var3_3;
                                    }
                                    if (var1_1 != null) ** GOTO lbl37
                                    if (v4 != null) {
                                        v4 = var3_3;
lbl37:
                                        // 2 sources

                                        v6 = v4.getMenu(0);
                                    } else {
                                        v6 = var4_4 = null;
                                    }
                                    if (var4_4 == null) break block23;
                                    var5_5 = new MenuElement[]{var3_3, var4_4};
                                    var2_2.setSelectedPath(var5_5);
                                    if (var1_1 == null) break block24;
                                }
                                v7 = a9.R();
                                if (var1_1 != null) break block25;
                                if (v7) break block24;
                                v7 = true;
                            }
                            a9.I(v7);
                            this.L(YR.e);
                        }
                        if (var1_1 == null) break block26;
                    }
                    v1 = var2_2.getSelectedPath()[0] instanceof ComboPopup;
                }
                if (var1_1 != null) break block27;
                if (!v1) break block26;
                v1 = true;
            }
            a9.I(v1);
            this.L(YR.e);
        }
    }

    private void L(Window window) {
        block6: {
            Window[] windowArray;
            Window window2;
            String[] stringArray;
            block9: {
                block10: {
                    block8: {
                        block7: {
                            stringArray = xd_1.U();
                            window2 = window;
                            if (stringArray != null) break block7;
                            if (window2 == null) break block8;
                            window2 = window;
                        }
                        if (stringArray != null) break block9;
                        if (window2.isShowing()) break block10;
                    }
                    return;
                }
                window2 = window;
            }
            for (Window window3 : windowArray = window2.getOwnedWindows()) {
                this.L(window3);
                if (stringArray == null) {
                    if (stringArray == null) continue;
                }
                break block6;
            }
            this.k(window);
        }
    }

    private void k(Container container) {
        int n10 = 0;
        String[] stringArray = xd_1.U();
        while (n10 < container.getComponentCount()) {
            block5: {
                block6: {
                    int n11;
                    Component component;
                    block10: {
                        block11: {
                            block8: {
                                block9: {
                                    block7: {
                                        component = container.getComponent(n10);
                                        if (stringArray != null) break block5;
                                        if (component == null) break block6;
                                        n11 = component.isVisible();
                                        if (stringArray != null) break block7;
                                        if (n11 == 0 && stringArray == null) break block6;
                                        n11 = component instanceof AbstractButton;
                                    }
                                    if (stringArray != null) break block8;
                                    if (n11 == 0) break block9;
                                    n11 = ((AbstractButton)component).getMnemonic();
                                    if (stringArray != null) break block8;
                                    if (n11 == 0) break block9;
                                    component.repaint();
                                    if (stringArray == null) break block6;
                                }
                                n11 = component instanceof JLabel;
                            }
                            if (stringArray != null) break block10;
                            if (n11 == 0) break block11;
                            n11 = ((JLabel)component).getDisplayedMnemonic();
                            if (stringArray != null) break block10;
                            if (n11 == 0) break block11;
                            component.repaint();
                            if (stringArray == null) break block6;
                        }
                        n11 = component instanceof Container;
                    }
                    if (n11 != 0) {
                        this.k((Container)component);
                    }
                }
                ++n10;
            }
            if (stringArray == null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3026366423101576160L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00a1S\u00e9Rks\u00e9vh\u00be\u00a7K1j$!\\\u00e4\f2(,n\u0093";
        int n11 = "\u00a1S\u00e9Rks\u00e9vh\u00be\u00a7K1j$!\\\u00e4\f2(,n\u0093".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
        r = false;
        q = false;
        f = null;
        e = null;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x9D;
        if (b[n11] == null) {
            YR.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

