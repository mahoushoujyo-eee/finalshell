/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FJ;
import com.l9_0;
import com.pb_2;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

/*
 * Renamed from com.lp
 */
class lp_2
implements PropertyChangeListener {
    final FJ e;

    lp_2(FJ fJ2) {
        this.e = fJ2;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block2: {
            block4: {
                int[] nArray;
                block8: {
                    boolean bl;
                    block5: {
                        Component component;
                        block6: {
                            block7: {
                                Component component2;
                                block3: {
                                    nArray = pb_2.g();
                                    if (propertyChangeEvent.getNewValue() != Boolean.TRUE) break block2;
                                    component2 = component = FJ.T(this.e).getInvoker();
                                    if (nArray == null) break block3;
                                    if (component2 == null) break block4;
                                    component2 = component;
                                }
                                bl = component2 instanceof JMenu;
                                if (nArray == null) break block5;
                                if (!bl) break block6;
                                if (!(component.getParent() instanceof JPopupMenu)) break block7;
                                this.e.E.v(l9_0.menuBarSubMenu);
                                if (nArray != null) break block2;
                            }
                            this.e.E.v(l9_0.menuBarMenu);
                            if (nArray != null) break block2;
                        }
                        bl = component instanceof JComboBox;
                    }
                    if (!bl) break block8;
                    this.e.E.v(l9_0.comboBoxMenu);
                    if (nArray != null) break block2;
                }
                this.e.E.v(l9_0.customPopupMenu);
                if (nArray != null) break block2;
            }
            this.e.E.v(l9_0.customPopupMenu);
        }
    }
}

