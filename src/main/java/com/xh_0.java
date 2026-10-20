/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pa_1;
import com.pv_2;

/*
 * Renamed from com.Xh
 */
class xh_0
implements Runnable {
    final pa_1 n;
    final pv_2 i;
    private static final long a;

    xh_0(pv_2 pv_22, pa_1 pa_12) {
        this.i = pv_22;
        this.n = pa_12;
    }

    @Override
    public void run() {
        block5: {
            int n10;
            block6: {
                String string;
                block4: {
                    string = pv_2.r();
                    n10 = this.i.N;
                    if (string != null) break block4;
                    if (n10 == 0) break block5;
                    long l2 = this.i.D - this.i.u;
                    n10 = l2 == 0L ? (char)'\u0000' : (l2 < 0L ? (char)'\uffffffff' : '\u0001');
                }
                if (string != null) break block6;
                if (n10 <= 0) break block5;
                long l3 = System.currentTimeMillis() - this.i.u - a;
                n10 = l3 == 0L ? (char)'\u0000' : (l3 < 0L ? (char)'\uffffffff' : '\u0001');
            }
            if (n10 > 0) {
                this.i.u = System.currentTimeMillis();
                this.n.X().i();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2727671679669309245L;
        a = 0x25DAA2F0DA950F59L ^ l2;
    }
}

