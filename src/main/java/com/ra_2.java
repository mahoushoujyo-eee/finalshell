/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BR;
import com.oj_0;
import java.io.File;

/*
 * Renamed from com.ra
 */
class ra_2
implements Runnable {
    final File g;
    final oj_0 N;

    ra_2(oj_0 oj_02, File file) {
        this.N = oj_02;
        this.g = file;
    }

    @Override
    public void run() {
        this.N.d.execute(new BR(this));
    }
}

