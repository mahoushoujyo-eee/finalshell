/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ky_2;
import com.wd_2;
import java.util.List;

/*
 * Renamed from com._m
 */
public abstract class _m_0
implements wd_2 {
    private static ky_2[] t;

    @Override
    public void m(String string, boolean bl) {
    }

    @Override
    public void y(String string, boolean bl) {
    }

    @Override
    public void q(List list) {
    }

    @Override
    public void p(List list) {
    }

    public static void Q(ky_2[] ky_2Array) {
        t = ky_2Array;
    }

    public static ky_2[] b() {
        return t;
    }

    static {
        if (_m_0.b() != null) {
            _m_0.Q(new ky_2[1]);
        }
    }
}

