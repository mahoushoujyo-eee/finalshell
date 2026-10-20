/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.dj_0;
import com.r8_0;
import com.wb_0;
import com.xg_0;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;

/*
 * Renamed from com.rh
 */
class rh_2
extends r8_0 {
    final dj_0 W;

    rh_2(dj_0 dj_02) {
        this.W = dj_02;
    }

    @Override
    protected boolean h(List list) {
        boolean bl;
        block5: {
            Iterator iterator = list.iterator();
            String string = wb_0.m();
            while (true) {
                try {
                    bl = iterator.hasNext();
                    if (string == null) break block5;
                    if (!bl) break;
                }
                catch (Throwable throwable) {
                    throw rh_2.a(throwable);
                }
                ImageIcon imageIcon = (ImageIcon)iterator.next();
                try {
                    this.W.C(xg_0.Z(imageIcon));
                    return true;
                }
                catch (Throwable throwable) {
                    if (string != null) continue;
                }
                break;
            }
            bl = false;
        }
        return bl;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}

