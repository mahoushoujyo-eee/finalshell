/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.I1;
import com.I7;
import com.I9;
import com.IE;
import com.QL;
import com.cl_2;
import com.id_0;
import com.iy_0;
import com.k3_0;
import com.ks_2;
import com.lk_2;
import com.m.s;
import com.ou_2;
import com.w9_0;

public class u6 {
    protected static boolean F = false;

    public static synchronized void J() {
        block3: {
            boolean bl;
            block2: {
                String string = cl_2.I();
                bl = F;
                if (string != null) break block2;
                if (bl) break block3;
                bl = true;
            }
            F = bl;
            cl_2.L();
            w9_0.d(QL.class, iy_0.class);
            w9_0.d(s.class, id_0.class);
            w9_0.d(lk_2.class, I7.class);
            w9_0.d(k3_0.class, I9.class);
            w9_0.d(ks_2.class, I1.class);
            w9_0.d(ou_2.class, IE.class);
        }
    }
}

