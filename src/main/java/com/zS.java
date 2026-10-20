/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.X4;
import com.ky_2;
import com.yn_2;
import java.lang.reflect.Type;

public abstract class zS
implements X4 {
    private static ky_2[] g;

    @Override
    public Object z(yn_2 yn_22, Type type, Object object) {
        return this.p(yn_22, type, object, null, 0);
    }

    public abstract Object p(yn_2 var1, Type var2, Object var3, String var4, int var5);

    public static void v(ky_2[] ky_2Array) {
        g = ky_2Array;
    }

    public static ky_2[] p() {
        return g;
    }

    static {
        if (zS.p() != null) {
            zS.v(new ky_2[1]);
        }
    }
}

