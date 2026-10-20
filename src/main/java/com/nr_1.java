/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from com.nR
 */
public class nr_1 {
    private int u = 0;
    private int W = 0;
    private List X = new ArrayList();

    public int g() {
        return this.u;
    }

    public void A(int n10) {
        this.u = n10;
    }

    public int Z() {
        return this.W;
    }

    public void V(int n10) {
        this.W = n10;
    }

    public List X() {
        return this.X;
    }

    public void e(List list) {
        this.X = list;
    }

    public void Z(Component component) {
        this.X.add(component);
    }
}

