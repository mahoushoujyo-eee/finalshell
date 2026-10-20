/*
 * Decompiled with CFR 0.152.
 */
package com.h;

import com.h.K;
import com.h.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class g
implements ItemListener {
    final c d;

    g(c c2) {
        this.d = c2;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        block6: {
            c c2;
            block2: {
                block3: {
                    boolean bl;
                    block4: {
                        boolean bl2;
                        block5: {
                            bl = K.Z();
                            c2 = this.d;
                            if (!bl) break block2;
                            if (!c.l(c2)) break block3;
                            bl2 = c.T(this.d).isSelected();
                            if (!bl) break block4;
                            if (!bl2) break block5;
                            c.K(this.d, true);
                            c.t(this.d).u();
                            if (bl) break block6;
                        }
                        bl2 = c.K(this.d, false);
                    }
                    c.t(this.d).u();
                    if (bl) break block6;
                }
                c2 = this.d;
            }
            c2.K();
        }
    }
}

