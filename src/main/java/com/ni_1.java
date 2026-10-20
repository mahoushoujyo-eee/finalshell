/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.fm_0;
import com.uE;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

/*
 * Renamed from com.nI
 */
class ni_1
extends MouseAdapter {
    final fm_0 Q;
    private static final long a;

    ni_1(fm_0 fm_02) {
        this.Q = fm_02;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        block5: {
            JCheckBox jCheckBox;
            block4: {
                fm_0 fm_02;
                block2: {
                    block3: {
                        this.Q.m = true;
                        boolean bl = uE.Z();
                        fm_02 = this.Q;
                        if (bl) break block2;
                        if (!fm_02.O()) break block3;
                        jCheckBox = this.Q.U;
                        if (bl) break block4;
                        if (!jCheckBox.isEnabled()) break block3;
                        this.Q.g.u();
                        if (!bl) break block5;
                    }
                    this.Q.G = (int)a;
                    fm_02 = this.Q;
                }
                jCheckBox = fm_02.U;
            }
            jCheckBox.repaint();
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        block5: {
            JCheckBox jCheckBox;
            block4: {
                fm_0 fm_02;
                block2: {
                    block3: {
                        this.Q.m = false;
                        boolean bl = uE.o();
                        fm_02 = this.Q;
                        if (!bl) break block2;
                        if (!fm_02.O()) break block3;
                        jCheckBox = this.Q.U;
                        if (!bl) break block4;
                        if (!jCheckBox.isEnabled()) break block3;
                        this.Q.g.u();
                        if (bl) break block5;
                    }
                    this.Q.G = 0;
                    fm_02 = this.Q;
                }
                jCheckBox = fm_02.U;
            }
            jCheckBox.repaint();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 9020231411107979109L;
        a = 0x12CFC9EF5AE95F60L ^ l2;
    }
}

