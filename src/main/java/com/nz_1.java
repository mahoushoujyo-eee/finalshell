/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.OG;
import com.ky_2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * Renamed from com.nZ
 */
class nz_1
extends KeyAdapter {
    final OG t;

    nz_1(OG oG) {
        this.t = oG;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block3: {
            block4: {
                boolean bl;
                block5: {
                    ky_2[] ky_2Array;
                    block2: {
                        ky_2Array = OG.P();
                        bl = this.t.isEnabled();
                        if (ky_2Array == null) break block2;
                        if (!bl) break block3;
                        bl = GR.rN.J(keyEvent);
                    }
                    if (ky_2Array == null) break block4;
                    if (bl) break block5;
                    bl = GR.lZ.J(keyEvent);
                    if (ky_2Array == null) break block4;
                    if (!bl) break block3;
                }
                bl = OG.s(this.t, true);
            }
            this.t.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        block4: {
            OG oG;
            block5: {
                block6: {
                    boolean bl;
                    ky_2[] ky_2Array;
                    block2: {
                        block3: {
                            ky_2Array = OG.P();
                            bl = GR.rN.J(keyEvent);
                            if (ky_2Array == null) break block2;
                            if (bl) break block3;
                            bl = GR.lZ.J(keyEvent);
                            if (ky_2Array == null) break block2;
                            if (!bl) break block4;
                        }
                        OG.s(this.t, false);
                        oG = this.t;
                        if (ky_2Array == null) break block5;
                        bl = oG.isEnabled();
                    }
                    if (!bl) break block6;
                    this.t.I();
                    if (ky_2Array != null) break block4;
                }
                oG = this.t;
            }
            oG.repaint();
        }
    }
}

