/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.w;

/*
 * Renamed from com.Fw
 */
class fw_0 {
    private Thread r = null;
    private int w = -1;
    private int Y = 0;

    private fw_0() {
    }

    void V(Thread thread) {
        this.r = thread;
        this.w = -1;
    }

    Thread p() {
        return this.r;
    }

    void P(int n10) {
        this.w = n10;
    }

    int G() {
        return this.w;
    }

    int o() {
        return this.Y;
    }

    void D(int n10) {
        this.Y = n10;
    }

    fw_0(w w2) {
        this();
    }
}

