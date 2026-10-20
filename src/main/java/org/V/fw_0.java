/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.security.PrivilegedAction;
import java.util.Map;
import org.v.hO;
import org.w.h;

/*
 * Renamed from org.v.fw
 */
class fw_0
implements PrivilegedAction {
    final Map r;
    final hO Y;

    fw_0(hO hO2, Map map) {
        this.Y = hO2;
        this.r = map;
    }

    public ClassLoader B() {
        return new h(this.r, hO.E(this.Y));
    }

    public Object run() {
        return this.B();
    }
}

