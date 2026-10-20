/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kz_2;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;

class R_
extends FocusAdapter {
    final kz_2 d;

    R_(kz_2 kz_22) {
        this.d = kz_22;
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        block7: {
            kz_2 kz_22;
            block4: {
                block5: {
                    String string;
                    block6: {
                        File file;
                        block2: {
                            block3: {
                                string = kz_2.M();
                                file = this.d.b;
                                if (string == null) break block2;
                                if (file != null) break block3;
                                kz_22 = this.d;
                                if (string == null) break block4;
                                if (kz_22.Z.getText().trim().equals("")) break block5;
                            }
                            kz_22 = this.d;
                            if (string == null) break block6;
                            file = kz_22.b;
                        }
                        if (file == null) break block7;
                        kz_22 = this.d;
                    }
                    if (string == null) break block4;
                    if (!kz_22.y().equals(this.d.Z.getText())) break block7;
                }
                kz_22 = this.d;
            }
            kz_22.P();
        }
    }
}

