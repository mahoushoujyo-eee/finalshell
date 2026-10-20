/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k3_0;
import com.ky_2;
import java.awt.Component;
import java.awt.FlowLayout;

/*
 * Renamed from com.kU
 */
public class ku_1
extends ky_2 {
    public ku_1(Component[] componentArray) {
        this(0, componentArray);
    }

    public ku_1(int n10, Component[] componentArray) {
        this(3, n10, componentArray);
    }

    public ku_1(int n10, int n11, Component[] componentArray) {
        block4: {
            Component[] componentArray2;
            int[] nArray;
            block3: {
                int[] nArray2 = k3_0.L();
                super(new FlowLayout(n10, n11, 0));
                nArray = nArray2;
                componentArray2 = componentArray;
                if (nArray == null) break block3;
                if (componentArray2 == null) break block4;
                componentArray2 = componentArray;
            }
            for (Component component : componentArray2) {
                this.add(component);
                if (nArray != null) continue;
            }
        }
    }
}

