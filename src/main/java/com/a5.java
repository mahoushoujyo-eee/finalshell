/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.cy_1;
import com.u2;
import java.io.File;

class a5
implements Runnable {
    final File g;
    final u2 r;

    a5(u2 u22, File file) {
        this.r = u22;
        this.g = file;
    }

    @Override
    public void run() {
        cy_1 cy_12 = this.r.d(this.g);
        if (cy_12 != null) {
            this.r.b(cy_12);
        }
    }
}

