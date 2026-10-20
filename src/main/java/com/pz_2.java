/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.i8_0;
import com.y1_0;
import java.security.SecureRandom;

/*
 * Renamed from com.pz
 */
public class pz_2
implements i8_0 {
    private byte[] R = new byte[(int)a];
    private SecureRandom b = new SecureRandom();
    private static final long a;

    @Override
    public void Y(byte[] byArray, int n10, int n11) {
        boolean bl = y1_0.Q();
        if (bl) {
            if (n11 > this.R.length) {
                this.R = new byte[n11];
            }
            this.b.nextBytes(this.R);
            System.arraycopy(this.R, 0, byArray, n10, n11);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 3625005918259997645L;
        a = 0xF9AF383632936BDDL ^ l2;
    }
}

