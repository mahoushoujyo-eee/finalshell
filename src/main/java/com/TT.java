/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.T4;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TT
extends T4 {
    protected List L = new ArrayList(2);
    private static final long[] a;
    private static final Integer[] b;

    public List i() {
        return this.L;
    }

    public void K(List list) {
        this.L = list;
    }

    public void S(LayoutManager layoutManager) {
        this.L.add(layoutManager);
    }

    public void X(LayoutManager layoutManager) {
        this.L.remove(layoutManager);
    }

    @Override
    public void addLayoutComponent(Component component, Object object) {
        Iterator iterator = this.L.iterator();
        int n10 = T4.b();
        while (iterator.hasNext()) {
            block4: {
                LayoutManager layoutManager;
                block3: {
                    LayoutManager layoutManager2;
                    layoutManager = layoutManager2 = (LayoutManager)iterator.next();
                    if (n10 == 0) break block3;
                    if (!(layoutManager instanceof LayoutManager2)) break block4;
                    layoutManager = layoutManager2;
                }
                ((LayoutManager2)layoutManager).addLayoutComponent(component, object);
            }
            if (n10 != 0) continue;
        }
    }

    @Override
    public void addLayoutComponent(String string, Component component) {
        Iterator iterator = this.L.iterator();
        int n10 = T4.b();
        while (iterator.hasNext()) {
            LayoutManager layoutManager = (LayoutManager)iterator.next();
            layoutManager.addLayoutComponent(string, component);
            if (n10 != 0) continue;
        }
    }

    @Override
    public void removeLayoutComponent(Component component) {
        Iterator iterator = this.L.iterator();
        int n10 = T4.b();
        while (iterator.hasNext()) {
            LayoutManager layoutManager = (LayoutManager)iterator.next();
            layoutManager.removeLayoutComponent(component);
            if (n10 != 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void A(Component var1_1, Object var2_2) {
        var4_3 = this.L.iterator();
        var3_4 = T4.O();
        while (var4_3.hasNext()) {
            block5: {
                block3: {
                    block4: {
                        v0 = var5_5 = (LayoutManager)var4_3.next();
                        if (var3_4 != 0) break block3;
                        if (!(v0 instanceof LayoutManager2)) break block4;
                        ((LayoutManager2)var5_5).addLayoutComponent(var1_1, var2_2);
                        if (var3_4 == 0) break block5;
                    }
                    v0 = var5_5;
                }
                v1 = var2_2;
                if (var3_4 != 0) ** GOTO lbl18
                if (v1 == null) {
                    v2 = null;
                } else {
                    v1 = var2_2;
lbl18:
                    // 2 sources

                    v2 = v1.toString();
                }
                v0.addLayoutComponent(v2, var1_1);
            }
            if (var3_4 == 0) continue;
        }
    }

    @Override
    public void F(Component component) {
        Iterator iterator = this.L.iterator();
        int n10 = T4.b();
        while (iterator.hasNext()) {
            LayoutManager layoutManager = (LayoutManager)iterator.next();
            layoutManager.removeLayoutComponent(component);
            if (n10 != 0) continue;
        }
    }

    @Override
    public Dimension preferredLayoutSize(Container container) {
        Dimension dimension;
        block2: {
            Dimension dimension2 = new Dimension(0, 0);
            int n10 = T4.O();
            for (LayoutManager layoutManager : this.L) {
                dimension = FN.h(dimension2, layoutManager.preferredLayoutSize(container));
                if (n10 == 0) {
                    dimension2 = dimension;
                    if (n10 == 0) continue;
                }
                break block2;
            }
            dimension = dimension2;
        }
        return dimension;
    }

    @Override
    public Dimension minimumLayoutSize(Container container) {
        Dimension dimension;
        block2: {
            Dimension dimension2 = new Dimension(0, 0);
            Iterator iterator = this.L.iterator();
            int n10 = T4.b();
            while (iterator.hasNext()) {
                LayoutManager layoutManager = (LayoutManager)iterator.next();
                dimension = FN.h(dimension2, layoutManager.minimumLayoutSize(container));
                if (n10 != 0) {
                    dimension2 = dimension;
                    if (n10 != 0) continue;
                }
                break block2;
            }
            dimension = dimension2;
        }
        return dimension;
    }

    @Override
    public Dimension maximumLayoutSize(Container container) {
        Dimension dimension = new Dimension(TT.b(12582, 6338170939742045446L), TT.b(3620, 717116607235029509L));
        int n10 = T4.b();
        for (LayoutManager layoutManager : this.L) {
            if (layoutManager instanceof LayoutManager2) {
                dimension = FN.p(dimension, ((LayoutManager2)layoutManager).maximumLayoutSize(container));
            }
            if (n10 != 0) continue;
        }
        return dimension;
    }

    @Override
    public void invalidateLayout(Container container) {
        Iterator iterator = this.L.iterator();
        int n10 = T4.O();
        while (iterator.hasNext()) {
            block4: {
                LayoutManager layoutManager;
                block3: {
                    LayoutManager layoutManager2;
                    layoutManager = layoutManager2 = (LayoutManager)iterator.next();
                    if (n10 != 0) break block3;
                    if (!(layoutManager instanceof LayoutManager2)) break block4;
                    layoutManager = layoutManager2;
                }
                ((LayoutManager2)layoutManager).invalidateLayout(container);
            }
            if (n10 == 0) continue;
        }
    }

    @Override
    public void layoutContainer(Container container) {
        Iterator iterator = this.L.iterator();
        int n10 = T4.O();
        while (iterator.hasNext()) {
            LayoutManager layoutManager = (LayoutManager)iterator.next();
            layoutManager.layoutContainer(container);
            if (n10 == 0) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7005113298715388120L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u009f\f3\u00c87\u00b3\u0012!\u00ab\u00a7i\u0012vr\u00ad\"";
        int n11 = "\u009f\f3\u00c87\u00b3\u0012!\u00ab\u00a7i\u0012vr\u00ad\"".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int b(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7420;
        if (b[n11] == null) {
            TT.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

