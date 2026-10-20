/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QX;
import com.ic_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from com.iW
 */
class iw_1
implements ActionListener {
    final QX A;

    iw_1(QX qX) {
        this.A = qX;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block6: {
            QX qX;
            block8: {
                block9: {
                    int n10;
                    String[] stringArray;
                    block7: {
                        block2: {
                            block3: {
                                QX qX2;
                                block4: {
                                    block5: {
                                        float f10 = 9.599999f;
                                        float f11 = 0.10416667f;
                                        stringArray = QX.Y();
                                        n10 = this.A.M.equals((Object)ic_1.fadeIn);
                                        if (stringArray != null) break block2;
                                        if (n10 == 0) break block3;
                                        qX2 = this.A;
                                        if (stringArray != null) break block4;
                                        if (!(qX2.F < 1.0f)) break block5;
                                        this.A.F = Math.min(this.A.F + 0.10416667f, 1.0f);
                                        this.A.repaint();
                                        if (stringArray == null) break block6;
                                    }
                                    qX2 = this.A;
                                }
                                qX2.C.Y();
                                if (stringArray == null) break block6;
                            }
                            n10 = this.A.M.equals((Object)ic_1.fadeOut) ? 1 : 0;
                        }
                        if (stringArray != null) break block7;
                        if (n10 == 0) break block6;
                        qX = this.A;
                        if (stringArray != null) break block8;
                        float f12 = qX.F - 0.0f;
                        n10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    }
                    if (n10 <= 0) break block9;
                    this.A.F = Math.max(this.A.F - 0.10416667f, 0.0f);
                    this.A.repaint();
                    if (stringArray == null) break block6;
                }
                this.A.Z();
                qX = this.A;
            }
            qX.C.Y();
        }
    }
}

