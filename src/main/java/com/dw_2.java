/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pv_2;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Renamed from com.dw
 */
class dw_2
implements Runnable {
    final ArrayList R;
    final CK d;
    final pv_2 N;

    dw_2(pv_2 pv_22, ArrayList arrayList, CK cK) {
        this.N = pv_22;
        this.R = arrayList;
        this.d = cK;
    }

    @Override
    public void run() {
        try {
            String[] stringArray = this.R.toArray(new String[this.R.size()]);
            this.d.d(stringArray);
        }
        catch (IOException iOException) {
            this.N.s = false;
            iOException.printStackTrace();
        }
    }
}

