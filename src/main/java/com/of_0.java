/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D_;
import com.GQ;
import com.cq_1;
import com.ky_2;
import com.m.G;
import com.m.K;
import com.od_0;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTree;

/*
 * Renamed from com.Of
 */
public class of_0
extends od_0 {
    @Override
    public G x(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n10, boolean bl4) {
        of_0 of_02;
        block9: {
            block10: {
                cq_1 cq_12;
                block12: {
                    ImageIcon imageIcon;
                    int n11;
                    String[] stringArray;
                    block11: {
                        stringArray = GQ.W();
                        of_02 = this;
                        if (stringArray == null) break block9;
                        super.x(jTree, object, bl, bl2, bl3, n10, bl4);
                        if (!(object instanceof cq_1)) break block10;
                        cq_12 = (cq_1)object;
                        n11 = cq_12.d();
                        if (stringArray == null) break block11;
                        if (n11 != 0) break block12;
                        n11 = D_.K[cq_12.K().ordinal()];
                    }
                    switch (n11) {
                        case 1: {
                            imageIcon = K.E;
                            if (stringArray != null) break;
                        }
                        case 2: {
                            ImageIcon imageIcon2 = imageIcon = bl2 ? K.a : K.w;
                            if (stringArray != null) break;
                        }
                        case 3: {
                            imageIcon = K.s;
                            if (stringArray != null) break;
                        }
                        default: {
                            imageIcon = null;
                        }
                    }
                    this.setIcon(cq_12.u() ? of_0.p(imageIcon) : imageIcon);
                }
                this.setText(cq_12.w());
            }
            of_02 = this;
        }
        if (ky_2.F() != null) {
            GQ.w(new String[5]);
        }
        return of_02;
    }

    @Override
    public Component getTreeCellRendererComponent(JTree jTree, Object object, boolean bl, boolean bl2, boolean bl3, int n10, boolean bl4) {
        return this.x(jTree, object, bl, bl2, bl3, n10, bl4);
    }
}

