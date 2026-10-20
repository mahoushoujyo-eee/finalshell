/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.security.PrivilegedAction;
import org.W;
import org.v._g_0;
import org.v.rh_0;

/*
 * Renamed from org.v.A
 */
class a_0
implements PrivilegedAction {
    final rh_0 k;

    a_0(rh_0 rh_02) {
        this.k = rh_02;
    }

    public W w() {
        return new _g_0();
    }

    public Object run() {
        return this.w();
    }
}

