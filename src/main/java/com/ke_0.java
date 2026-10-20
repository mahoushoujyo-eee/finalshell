/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.oj_0;
import com.zA;

/*
 * Renamed from com.Ke
 */
class ke_0
implements Runnable {
    final String T;
    final oj_0 j;

    ke_0(oj_0 oj_02, String string) {
        this.j = oj_02;
        this.T = string;
    }

    @Override
    public void run() {
        this.j.d.execute(new zA(this));
    }
}

