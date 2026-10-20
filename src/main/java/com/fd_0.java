/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FY;
import com.QX;
import com.ic_1;
import javax.swing.event.AncestorEvent;

/*
 * Renamed from com.Fd
 */
class fd_0
extends FY {
    final QX X;

    fd_0(QX qX) {
        this.X = qX;
    }

    @Override
    public void ancestorAdded(AncestorEvent ancestorEvent) {
        block10: {
            block8: {
                QX qX;
                block9: {
                    boolean bl;
                    String[] stringArray;
                    block4: {
                        block5: {
                            QX qX2;
                            block6: {
                                block7: {
                                    stringArray = QX.Y();
                                    bl = this.X.h;
                                    if (stringArray != null) break block4;
                                    if (!bl) break block5;
                                    qX2 = this.X;
                                    if (stringArray != null) break block6;
                                    if (qX2.v == null) break block7;
                                    this.X.v.requestFocusInWindow();
                                    if (stringArray == null) break block5;
                                }
                                qX2 = this.X;
                            }
                            qX2.transferFocus();
                        }
                        qX = this.X;
                        if (stringArray != null) break block8;
                        bl = qX.i;
                    }
                    if (!bl) break block9;
                    this.X.F = 0.0f;
                    this.X.M = ic_1.fadeIn;
                    this.X.C.u();
                    if (stringArray == null) break block10;
                }
                qX = this.X;
            }
            qX.F = 1.0f;
        }
        this.X.C();
    }

    @Override
    public void ancestorRemoved(AncestorEvent ancestorEvent) {
        this.X.H();
    }
}

