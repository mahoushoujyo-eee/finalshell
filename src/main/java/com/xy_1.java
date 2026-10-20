/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.O4;
import com.x1_0;
import com.x9_0;
import com.xa_2;
import com.xe_2;
import com.xg_2;
import com.xh_1;
import com.xq_1;
import com.xr_2;
import com.xx_2;

/*
 * Renamed from com.xY
 */
@O4(w={xe_2.class, xx_2.class, xa_2.class, x1_0.class, xr_2.class, x9_0.class, xh_1.class, xq_1.class, xg_2.class}, W="type")
public abstract class xy_1 {
    private final String S;
    private double[] r;
    private static String[] u;

    protected xy_1(String string) {
        this.S = string;
    }

    public String b() {
        return this.S;
    }

    public double[] a() {
        return this.r;
    }

    public void C(double[] dArray) {
        this.r = dArray;
    }

    public static void P(String[] stringArray) {
        u = stringArray;
    }

    public static String[] q() {
        return u;
    }

    static {
        if (xy_1.q() != null) {
            xy_1.P(new String[1]);
        }
    }
}

