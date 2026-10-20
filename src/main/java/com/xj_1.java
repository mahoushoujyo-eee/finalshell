/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kz_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/*
 * Renamed from com.xJ
 */
class xj_1
implements ActionListener {
    final kz_2 I;

    xj_1(kz_2 kz_22) {
        this.I = kz_22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            block8: {
                block10: {
                    boolean bl;
                    File file;
                    String string;
                    block9: {
                        block7: {
                            kz_2 kz_22;
                            block6: {
                                boolean bl2;
                                block4: {
                                    block2: {
                                        block3: {
                                            string = kz_2.M();
                                            kz_22 = this.I;
                                            if (string == null) break block2;
                                            if (kz_22.d == null) break block3;
                                            bl2 = this.I.d.isVisible();
                                            if (string == null) break block4;
                                            if (bl2) break block5;
                                        }
                                        kz_22 = this.I;
                                    }
                                    if (string == null) break block6;
                                    bl2 = kz_22.Z.getText().trim().equals("");
                                }
                                if (!bl2) break block7;
                                kz_22 = this.I;
                            }
                            kz_22.X(null);
                            if (string != null) break block8;
                        }
                        file = new File(this.I.Z.getText());
                        bl = file.exists();
                        if (string == null) break block9;
                        if (!bl) break block10;
                        bl = file.isDirectory();
                    }
                    if (!bl) break block10;
                    this.I.X(file);
                    if (string != null) break block8;
                }
                this.I.P();
            }
            this.I.transferFocus();
        }
    }
}

