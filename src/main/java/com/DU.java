/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.GO;
import com.c;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicEditorPaneUI;
import javax.swing.text.JTextComponent;

public class DU
extends BasicEditorPaneUI {
    private static final String a;

    public static ComponentUI createUI(JComponent jComponent) {
        return new DU();
    }

    @Override
    public void installUI(JComponent jComponent) {
        super.installUI(jComponent);
        JTextComponent jTextComponent = this.getComponent();
        FN.Y(jTextComponent);
        LookAndFeel.installProperty(jTextComponent, a, Boolean.TRUE);
        jTextComponent.setMargin(new Insets(2, 2, 2, 2));
        jTextComponent.setFocusable(true);
        jTextComponent.setBackground(Color.WHITE);
        jTextComponent.setSelectionColor(GO.F4);
        jTextComponent.setForeground(Color.BLACK);
        jTextComponent.setSelectedTextColor(Color.BLACK);
        jTextComponent.setCaretColor(Color.GRAY);
    }

    @Override
    protected void paintSafely(Graphics graphics) {
        Graphics graphics2;
        try {
            graphics2 = (Graphics)lk_0.E((Object)this.getComponent(), (Object)graphics);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        graphics = graphics2;
        Graphics2D graphics2D = (Graphics2D)graphics;
        Map map = FN.Y(graphics2D);
        super.paintSafely(graphics);
        FN.k(graphics2D, map);
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
                char[] cArray3 = "C\u001a\u0019..S".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 87;
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
                            n17 = 123;
                            break;
                        }
                        case 1: {
                            n17 = 61;
                            break;
                        }
                        case 2: {
                            n17 = 47;
                            break;
                        }
                        case 3: {
                            n17 = 8;
                            break;
                        }
                        case 4: {
                            n17 = 12;
                            break;
                        }
                        case 5: {
                            n17 = 97;
                            break;
                        }
                        default: {
                            n17 = 78;
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

