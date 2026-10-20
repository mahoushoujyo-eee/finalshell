/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PK;
import com.ra_2;

class BR
implements Runnable {
    final ra_2 N;

    BR(ra_2 ra_22) {
        this.N = ra_22;
    }

    @Override
    public void run() {
        PK.u(this.N.g);
    }
}

