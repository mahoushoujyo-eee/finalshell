/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.YI;
import com.e0_0;
import com.e4_0;
import com.ec_2;
import com.eh_2;
import com.ek_2;
import com.en_1;
import com.eu_2;
import com.ev_1;
import com.hv_0;
import com.i2_0;

public class HO {
    protected static boolean k = false;

    public static synchronized void n() {
        block3: {
            boolean bl;
            block2: {
                boolean bl2 = i2_0.X();
                bl = k;
                if (bl2) break block2;
                if (bl) break block3;
                bl = true;
            }
            k = bl;
            i2_0.L();
            i2_0.Z(new e4_0());
            i2_0.Z(new e0_0());
            i2_0.Z(new eu_2());
            i2_0.Z(new ek_2());
            i2_0.Z(new en_1());
            i2_0.Z(new eh_2());
            i2_0.Z(new ev_1());
            i2_0.Z(new ec_2());
            i2_0.M(new hv_0());
            i2_0.Z(new YI());
        }
    }
}

