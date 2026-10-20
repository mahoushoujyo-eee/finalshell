/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ls_1;
import com.oj_0;
import java.util.Comparator;

/*
 * Renamed from com.Es
 */
public class es_0
implements Comparator {
    public int u(ls_1 ls_12, ls_1 ls_13) {
        int n10;
        block4: {
            int n11;
            block2: {
                boolean bl;
                block3: {
                    bl = oj_0.g();
                    n10 = ls_12.H();
                    n11 = ls_13.H();
                    if (!bl) break block2;
                    if (n10 >= n11) break block3;
                    n10 = -1;
                    break block4;
                }
                n10 = ls_12.H();
                if (!bl) break block4;
                n11 = ls_13.H();
            }
            n10 = n10 > n11 ? 1 : 0;
        }
        return n10;
    }

    public int compare(Object object, Object object2) {
        return this.u((ls_1)object, (ls_1)object2);
    }
}

