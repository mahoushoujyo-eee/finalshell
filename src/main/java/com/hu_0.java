/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BX;
import com.FN;
import com.hd_0;
import com.wf_2;
import java.awt.Component;
import java.awt.Container;

/*
 * Renamed from com.Hu
 */
class hu_0
implements Runnable {
    final BX N;
    final wf_2 D;

    hu_0(wf_2 wf_22, BX bX) {
        this.D = wf_22;
        this.N = bX;
    }

    @Override
    public void run() {
        block3: {
            boolean bl;
            hd_0 hd_02;
            block6: {
                String[] stringArray;
                block4: {
                    block5: {
                        hd_0 hd_03;
                        block2: {
                            hd_02 = this.N.D();
                            stringArray = BX.B();
                            Component component = hd_02;
                            if (stringArray != null) break block2;
                            if (FN.l(component)) break block3;
                            component = hd_03 = hd_02.getSelectedComponent();
                        }
                        if (stringArray != null) break block4;
                        if (hd_03.isFocusable()) break block5;
                        bl = hd_03 instanceof Container;
                        if (stringArray != null) break block3;
                        if (!bl) break block6;
                        bl = FN.v(hd_03);
                        if (stringArray != null) break block3;
                        if (!bl) break block6;
                    }
                    hd_02.transferFocus();
                }
                if (stringArray == null) break block3;
            }
            bl = hd_02.requestFocusInWindow();
        }
    }
}

