/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k3_0;
import com.ky_2;
import java.awt.Component;
import java.awt.GridLayout;

/*
 * Renamed from com.kT
 */
public class kt_1
extends ky_2 {
    public kt_1(Component[] componentArray) {
        this(1, 0, componentArray);
    }

    public kt_1(int n10, int n11, Component[] componentArray) {
        this(n10, n11, 0, componentArray);
    }

    public kt_1(int n10, Component[] componentArray) {
        this(1, 0, n10, componentArray);
    }

    public kt_1(int n10, int n11, int n12, Component[] componentArray) {
        this(n10, n11, n12, n12, componentArray);
    }

    public kt_1(int n10, int n11, int n12, int n13, Component[] componentArray) {
        this.setOpaque(false);
        this.setLayout(new GridLayout(n10, n11, n12, n13));
        Component[] componentArray2 = componentArray;
        int n14 = componentArray2.length;
        int[] nArray = k3_0.L();
        for (int i2 = 0; i2 < n14; ++i2) {
            Component component = componentArray2[i2];
            this.add(component);
            if (nArray != null) continue;
        }
    }
}

