/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.G9;
import com.GX;
import com.ac_0;
import com.en_2;
import com.i2_0;
import com.wd_0;
import com.wp_0;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.JComponent;

/*
 * Renamed from com.Hv
 */
public class hv_0
implements en_2 {
    protected final Map k = new WeakHashMap();

    @Override
    public void Q(Component component, G9 g92) {
        block11: {
            List list;
            boolean bl;
            boolean bl2;
            block13: {
                block12: {
                    G9 g93;
                    block10: {
                        block9: {
                            boolean bl3;
                            block8: {
                                bl2 = component instanceof JComponent;
                                bl = i2_0.K();
                                bl3 = this.k.containsKey(component);
                                if (!bl) break block8;
                                if (!bl3) break block9;
                                bl3 = bl2;
                            }
                            if (bl3) {
                                ((JComponent)component).setToolTipText(null);
                            }
                            ac_0.S(component, (List)this.k.get(component));
                            ((List)this.k.get(component)).clear();
                        }
                        g93 = g92;
                        if (!bl) break block10;
                        if (g93 == null) break block11;
                        g93 = g92;
                    }
                    list = g93.e();
                    if (!bl) break block12;
                    if (list == null) break block11;
                    list = g92.e();
                }
                if (!bl) break block13;
                if (list.size() <= 0) break block11;
                list = g92.e();
            }
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                block16: {
                    wp_0 wp_02;
                    block17: {
                        wp_0 wp_03;
                        block14: {
                            block15: {
                                wp_03 = wp_02 = (wp_0)iterator.next();
                                if (!bl) break block14;
                                if (!wp_03.w().equals((Object)GX.swing)) break block15;
                                if (!bl2) break block16;
                                ((JComponent)component).setToolTipText(wp_02.A());
                                if (bl) break block16;
                            }
                            wp_03 = wp_02;
                        }
                        if (wp_03.h() == null) break block17;
                        this.E(ac_0.l(component, wp_02.A(), wp_02.m(), wp_02.h()));
                        if (bl) break block16;
                    }
                    this.E(ac_0.I(component, wp_02.A()));
                }
                if (bl) continue;
            }
        }
    }

    protected void E(wd_0 wd_02) {
        Component component = wd_02.N();
        boolean bl = i2_0.K();
        boolean bl2 = this.k.containsKey(component);
        if (bl) {
            if (!bl2) {
                this.k.put(component, new ArrayList());
            }
            bl2 = ((List)this.k.get(component)).add(wd_02);
        }
    }
}

