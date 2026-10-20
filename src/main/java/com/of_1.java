/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.a9;
import com.kd_1;
import com.xc_2;

/*
 * Renamed from com.oF
 */
class of_1
implements Runnable {
    final String[] V;

    of_1(String[] stringArray) {
        this.V = stringArray;
    }

    @Override
    public void run() {
        xc_2 xc_22;
        block4: {
            block3: {
                String[] stringArray;
                int[] nArray;
                block2: {
                    int[] nArray2 = kd_1.u();
                    a9.x();
                    nArray = nArray2;
                    stringArray = this.V;
                    if (nArray != null) break block2;
                    if (stringArray == null) break block3;
                    stringArray = this.V;
                }
                if (stringArray.length <= 0) break block3;
                xc_22 = new xc_2(this.V[0]);
                if (nArray == null) break block4;
            }
            xc_22 = new xc_2();
        }
        xc_22.setVisible(true);
    }
}

