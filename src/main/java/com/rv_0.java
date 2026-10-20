/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.WC;
import java.awt.Component;
import java.awt.Container;
import java.io.Serializable;
import java.util.Comparator;

/*
 * Renamed from com.Rv
 */
public class rv_0
implements Comparator,
Serializable {
    public int O(Component component, Component component2) {
        int n10;
        block4: {
            int n11;
            block2: {
                int n12;
                int n13;
                int[] nArray;
                block3: {
                    Container container = component.getParent();
                    Container container2 = component2.getParent();
                    nArray = WC.V();
                    n13 = container.getComponentZOrder(component);
                    n12 = container2.getComponentZOrder(component2);
                    n10 = n13;
                    n11 = n12;
                    if (nArray != null) break block2;
                    if (n10 >= n11) break block3;
                    n10 = -1;
                    break block4;
                }
                n10 = n13;
                if (nArray != null) break block4;
                n11 = n12;
            }
            n10 = n10 == n11 ? 0 : 1;
        }
        return n10;
    }

    public int compare(Object object, Object object2) {
        return this.O((Component)object, (Component)object2);
    }
}

