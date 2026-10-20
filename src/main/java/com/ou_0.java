/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GR;
import com.kz_2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JWindow;

/*
 * Renamed from com.Ou
 */
class ou_0
extends KeyAdapter {
    final kz_2 y;

    ou_0(kz_2 kz_22) {
        this.y = kz_22;
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        block5: {
            kz_2 kz_22;
            block10: {
                block11: {
                    kz_2 kz_23;
                    String string;
                    block8: {
                        block9: {
                            File file;
                            block6: {
                                block7: {
                                    boolean bl;
                                    block4: {
                                        block3: {
                                            JWindow jWindow;
                                            block2: {
                                                string = kz_2.M();
                                                jWindow = this.y.d;
                                                if (string == null) break block2;
                                                if (jWindow == null) break block3;
                                                jWindow = this.y.d;
                                            }
                                            bl = jWindow.isVisible();
                                            if (string == null) break block4;
                                            if (bl) break block5;
                                        }
                                        bl = GR.lD.J(keyEvent);
                                    }
                                    if (!bl) break block5;
                                    file = this.y.b;
                                    if (string == null) break block6;
                                    if (file != null) break block7;
                                    kz_23 = this.y;
                                    if (string == null) break block8;
                                    if (kz_23.Z.getText().trim().equals("")) break block9;
                                }
                                kz_22 = this.y;
                                if (string == null) break block10;
                                file = kz_22.b;
                            }
                            if (file == null) break block11;
                            kz_22 = this.y;
                            if (string == null) break block10;
                            if (!kz_22.y().equals(this.y.Z.getText())) break block11;
                        }
                        this.y.P();
                        kz_23 = this.y;
                    }
                    kz_23.transferFocus();
                    if (string != null) break block5;
                }
                kz_22 = this.y;
            }
            kz_22.Z.setText(this.y.y());
        }
    }
}

