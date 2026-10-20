/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.GX;
import com.en_2;
import com.i2_0;
import com.wp_0;
import java.awt.Component;
import java.util.List;
import javax.swing.JComponent;

public class KC
implements en_2 {
    @Override
    public void Q(Component component, G9 g92) {
        block5: {
            List list;
            JComponent jComponent;
            boolean bl;
            boolean bl2;
            block8: {
                block7: {
                    G9 g93;
                    block6: {
                        bl2 = component instanceof JComponent;
                        bl = i2_0.K();
                        if (!bl2) break block5;
                        jComponent = (JComponent)component;
                        jComponent.setToolTipText(null);
                        g93 = g92;
                        if (!bl) break block6;
                        if (g93 == null) break block5;
                        g93 = g92;
                    }
                    list = g93.e();
                    if (!bl) break block7;
                    if (list == null) break block5;
                    list = g92.e();
                }
                if (!bl) break block8;
                if (list.size() <= 0) break block5;
                list = g92.e();
            }
            for (wp_0 wp_02 : list) {
                block10: {
                    boolean bl3;
                    block9: {
                        bl3 = wp_02.w().equals((Object)GX.swing);
                        if (!bl) break block9;
                        if (!bl3) break block10;
                        bl3 = bl2;
                    }
                    if (bl3) {
                        jComponent.setToolTipText(wp_02.A());
                    }
                }
                if (bl) continue;
            }
        }
    }
}

