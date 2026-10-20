/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.k3_0;
import com.ky_2;
import com.ts_0;
import java.awt.Component;

/*
 * Renamed from com.Qv
 */
public class qv_0
extends ky_2 {
    public qv_0(Component[] componentArray) {
        this(0, componentArray);
    }

    public qv_0(int n10, Component[] componentArray) {
        this(n10, n10, componentArray);
    }

    public qv_0(int n10, int n11, Component[] componentArray) {
        int[] nArray = k3_0.L();
        super(new ts_0(false, n10, n11));
        int[] nArray2 = nArray;
        this.setOpaque(false);
        for (Component component : componentArray) {
            this.add(component);
            if (nArray2 != null) continue;
        }
    }
}

