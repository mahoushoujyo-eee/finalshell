/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.T;
import java.io.File;

/*
 * Renamed from com.Z.a
 */
class a_0
implements Runnable {
    final File X;
    final T N;

    a_0(T t2, File file) {
        this.N = t2;
        this.X = file;
    }

    @Override
    public void run() {
        this.N.H.removeTreeSelectionListener(this.N.U);
        this.N.H.s(this.N.H.d(this.X));
        this.N.H.addTreeSelectionListener(this.N.U);
    }
}

