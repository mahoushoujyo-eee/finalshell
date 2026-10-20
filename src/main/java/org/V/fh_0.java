/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.File;
import java.io.IOException;
import org.h.cr_0;
import org.v.hH;
import org.v.w_1;

/*
 * Renamed from org.v.fh
 */
class fh_0
implements hH {
    final File A;
    final w_1 x;

    fh_0(w_1 w_12, File file) {
        this.x = w_12;
        this.A = file;
    }

    @Override
    public void n(cr_0 cr_02) throws IOException {
        this.x.Z(cr_02, this.A);
    }
}

