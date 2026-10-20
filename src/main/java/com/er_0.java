/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EY;
import com.kd_1;
import com.xg_0;
import java.io.File;
import java.util.List;

/*
 * Renamed from com.Er
 */
class er_0
extends EY {
    final kd_1 T;

    er_0(kd_1 kd_12) {
        this.T = kd_12;
    }

    @Override
    public boolean d(List list) {
        boolean bl;
        block3: {
            block5: {
                List list2;
                int[] nArray;
                block4: {
                    nArray = kd_1.u();
                    list2 = list;
                    if (nArray != null) break block4;
                    if (list2 == null) break block5;
                    list2 = list;
                }
                for (File file : list2) {
                    block7: {
                        boolean bl2;
                        block6: {
                            bl = xg_0.P(file.getName());
                            if (nArray != null) break block3;
                            if (nArray != null) break block6;
                            if (!bl) break block7;
                            this.T.v(file);
                            bl2 = true;
                        }
                        return bl2;
                    }
                    if (nArray == null) continue;
                }
            }
            bl = false;
        }
        return bl;
    }
}

