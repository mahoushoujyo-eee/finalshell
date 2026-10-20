/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EN;
import com.HO;
import com.ON;
import com.ac_0;
import com.kg_2;
import com.ky_2;
import com.ne_1;
import com.ox_2;
import com.rn_0;
import com.u6;
import com.w6_0;

/*
 * Renamed from com.nK
 */
public class nk_1 {
    private static String t;

    public static synchronized void Y() {
        ne_1.d();
        String string = nk_1.P();
        EN.b();
        HO.n();
        u6.J();
        w6_0.U();
        ON.e();
        ac_0.S();
        ox_2.Q();
        kg_2.j();
        rn_0.z();
        String string2 = string;
        if (string2 == null) {
            ky_2.K(new String[3]);
        }
    }

    public static void H(String string) {
        t = string;
    }

    public static String P() {
        return t;
    }

    static {
        if (nk_1.P() == null) {
            nk_1.H("Z8CUib");
        }
    }
}

