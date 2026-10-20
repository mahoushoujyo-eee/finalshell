/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.TO;
import com.k3_0;
import com.ky_2;
import java.awt.Component;

/*
 * Renamed from com.kO
 */
public class ko_1
extends ky_2 {
    public ko_1(Component[] componentArray) {
        this(true, componentArray);
    }

    public ko_1(int n10, Component[] componentArray) {
        this(n10, true, componentArray);
    }

    public ko_1(boolean bl, Component[] componentArray) {
        this(0, bl, componentArray);
    }

    public ko_1(int n10, boolean bl, Component[] componentArray) {
        int[] nArray = k3_0.L();
        super(new TO(0, n10, n10, bl, false));
        Component[] componentArray2 = componentArray;
        int[] nArray2 = nArray;
        for (Component component : componentArray2) {
            this.add(component);
            if (nArray2 != null) continue;
        }
    }
}

