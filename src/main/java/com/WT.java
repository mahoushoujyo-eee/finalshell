/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.pb_2;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

public final class WT
implements SwingConstants {
    private static final long a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int r(JMenuItem jMenuItem, boolean bl) {
        Icon icon;
        JMenuItem jMenuItem2;
        int[] nArray;
        block7: {
            block6: {
                int n10;
                boolean bl2;
                block5: {
                    nArray = pb_2.g();
                    bl2 = bl;
                    if (nArray == null) break block5;
                    if (!bl2) break block6;
                    jMenuItem2 = jMenuItem;
                    if (nArray == null) break block7;
                    bl2 = jMenuItem2.getParent() instanceof JPopupMenu;
                }
                if (!bl2) break block6;
                int n11 = 0;
                JPopupMenu jPopupMenu = (JPopupMenu)jMenuItem.getParent();
                int n12 = 0;
                while (n12 < jPopupMenu.getComponentCount()) {
                    block8: {
                        block9: {
                            int n13;
                            block12: {
                                block13: {
                                    Component component;
                                    Component component2;
                                    block10: {
                                        block11: {
                                            JMenuItem jMenuItem3;
                                            component2 = jPopupMenu.getComponent(n12);
                                            if (nArray == null) break block8;
                                            n10 = component2 instanceof JMenuItem;
                                            if (nArray == null) return n10;
                                            if (n10 == 0) break block9;
                                            component = jMenuItem3 = (JMenuItem)component2;
                                            if (nArray == null) break block10;
                                            if (component.getIcon() == null) break block11;
                                            n11 = Math.max(n11, jMenuItem3.getIcon().getIconWidth());
                                            if (nArray != null) break block9;
                                        }
                                        component = component2;
                                    }
                                    n13 = component instanceof JCheckBoxMenuItem;
                                    if (nArray == null) break block12;
                                    if (n13 != 0) break block13;
                                    n13 = component2 instanceof JRadioButtonMenuItem;
                                    if (nArray == null) break block12;
                                    if (n13 == 0) break block9;
                                }
                                n13 = Math.max(n11, (int)a);
                            }
                            n11 = n13;
                        }
                        ++n12;
                    }
                    if (nArray != null) continue;
                }
                n10 = n11;
                return n10;
            }
            jMenuItem2 = jMenuItem;
        }
        Icon icon2 = icon = jMenuItem2.getIcon();
        if (nArray != null) {
            if (icon2 == null) return 0;
            icon2 = icon;
        }
        int n14 = icon2.getIconWidth();
        return n14;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String s(JMenuItem jMenuItem) {
        KeyStroke keyStroke = jMenuItem.getAccelerator();
        int[] nArray = pb_2.g();
        KeyStroke keyStroke2 = keyStroke;
        if (nArray != null) {
            if (keyStroke2 == null) return null;
            keyStroke2 = keyStroke;
        }
        String string = FN.Y(keyStroke2);
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4815222046804689306L;
        a = 0xFDD3AE827E6C418AL ^ l2;
    }
}

