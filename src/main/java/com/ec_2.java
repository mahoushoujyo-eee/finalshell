/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.A.d;
import com.FV;
import com.G9;
import com.e1_0;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Window;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.plaf.RootPaneUI;

/*
 * Renamed from com.ec
 */
public class ec_2
extends e1_0 {
    public void m(JRootPane jRootPane, String string, G9 g92, Object[] objectArray) {
        block9: {
            JComponent jComponent;
            block10: {
                JComponent jComponent2;
                RootPaneUI rootPaneUI;
                String[] stringArray;
                block8: {
                    boolean bl;
                    block7: {
                        block6: {
                            Window window;
                            block4: {
                                block5: {
                                    window = FV.L(jRootPane);
                                    stringArray = e1_0.A();
                                    bl = window instanceof Frame;
                                    if (stringArray == null) break block4;
                                    if (!bl) break block5;
                                    ((Frame)window).setTitle(this.q(g92, objectArray));
                                    if (stringArray != null) break block6;
                                }
                                bl = window instanceof Dialog;
                            }
                            if (stringArray == null) break block7;
                            if (bl) {
                                ((Dialog)window).setTitle(this.q(g92, objectArray));
                            }
                        }
                        rootPaneUI = jRootPane.getUI();
                        if (stringArray == null) break block8;
                        bl = rootPaneUI instanceof d;
                    }
                    if (!bl) break block9;
                    rootPaneUI = jRootPane.getUI();
                }
                jComponent = jComponent2 = ((d)rootPaneUI).R();
                if (stringArray == null) break block10;
                if (jComponent == null) break block9;
                jComponent = jComponent2;
            }
            jComponent.repaint();
        }
    }

    @Override
    public void L(JComponent jComponent, String string, G9 g92, Object[] objectArray) {
        this.m((JRootPane)jComponent, string, g92, objectArray);
    }
}

