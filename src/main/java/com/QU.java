/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FC;
import com.oj_0;

class QU
implements Runnable {
    final String p;
    final oj_0 Q;

    QU(oj_0 oj_02, String string) {
        this.Q = oj_02;
        this.p = string;
    }

    @Override
    public void run() {
        this.Q.d.execute(new FC(this));
    }
}

