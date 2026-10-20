/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.security.PrivilegedAction;
import org.W;
import org.v._g_0;
import org.v.rh_0;

class RE
implements PrivilegedAction {
    final ClassLoader d;
    final rh_0 Y;

    RE(rh_0 rh_02, ClassLoader classLoader) {
        this.Y = rh_02;
        this.d = classLoader;
    }

    public W s() {
        return new _g_0(this.d);
    }

    public Object run() {
        return this.s();
    }
}

