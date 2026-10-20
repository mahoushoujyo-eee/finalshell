/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.na_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Renamed from com.Im
 */
class im_0
extends MouseAdapter {
    final na_2 b;

    im_0(na_2 na_22) {
        this.b = na_22;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        block3: {
            na_2 na_22;
            block4: {
                int n10;
                block2: {
                    boolean bl = na_2.e();
                    n10 = mouseEvent.getClickCount();
                    if (!bl) break block2;
                    if (n10 != 2) break block3;
                    na_22 = this.b;
                    if (!bl) break block4;
                    n10 = na_22.isEnabled() ? 1 : 0;
                }
                if (n10 == 0) break block3;
                this.b.Y();
                na_22 = this.b;
            }
            na_22.h();
        }
    }
}

