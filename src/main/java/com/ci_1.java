/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CI;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JList;

/*
 * Renamed from com.cI
 */
public class ci_1
extends MouseMotionAdapter {
    private final JList l;

    public ci_1(JList jList) {
        this.l = jList;
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        block5: {
            int n10;
            int n11;
            block4: {
                String[] stringArray = CI.c();
                n11 = this.l.isEnabled();
                if (stringArray != null) break block4;
                if (n11 == 0) break block5;
                n11 = this.l.locationToIndex(mouseEvent.getPoint());
            }
            if ((n10 = n11) != this.l.getSelectedIndex()) {
                this.l.setSelectedIndex(n10);
            }
        }
    }

    public static ci_1 w(JList jList) {
        ci_1.z(jList);
        ci_1 ci_12 = new ci_1(jList);
        jList.addMouseMotionListener(ci_12);
        return ci_12;
    }

    public static void z(JList jList) {
        MouseMotionListener[] mouseMotionListenerArray = jList.getMouseMotionListeners();
        String[] stringArray = CI.c();
        int n10 = mouseMotionListenerArray.length;
        int n11 = 0;
        while (n11 < n10) {
            MouseMotionListener mouseMotionListener = mouseMotionListenerArray[n11];
            if (stringArray == null) {
                if (mouseMotionListener instanceof ci_1) {
                    jList.removeMouseMotionListener(mouseMotionListener);
                }
                ++n11;
            }
            if (stringArray == null) continue;
        }
    }

    public static boolean V(JList jList) {
        boolean bl;
        block4: {
            MouseMotionListener[] mouseMotionListenerArray = jList.getMouseMotionListeners();
            int n10 = mouseMotionListenerArray.length;
            String[] stringArray = CI.c();
            int n11 = 0;
            while (n11 < n10) {
                MouseMotionListener mouseMotionListener = mouseMotionListenerArray[n11];
                if (stringArray == null) {
                    bl = mouseMotionListener instanceof ci_1;
                    if (stringArray != null) break block4;
                    if (bl) {
                        return true;
                    }
                    ++n11;
                }
                if (stringArray == null) continue;
            }
            bl = false;
        }
        return bl;
    }
}

