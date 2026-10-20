/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CI;
import javax.swing.DefaultListSelectionModel;

/*
 * Renamed from com.Kd
 */
public class kd_0
extends DefaultListSelectionModel {
    @Override
    public void clearSelection() {
    }

    @Override
    public void removeSelectionInterval(int n10, int n11) {
        block4: {
            block3: {
                int n12;
                int n13;
                block2: {
                    String[] stringArray = CI.c();
                    n13 = n10;
                    n12 = this.getMinSelectionIndex();
                    if (stringArray != null) break block2;
                    if (n13 > n12) break block3;
                    n13 = n11;
                    n12 = this.getMaxSelectionIndex();
                }
                if (n13 >= n12) break block4;
            }
            super.removeSelectionInterval(n10, n11);
        }
    }
}

