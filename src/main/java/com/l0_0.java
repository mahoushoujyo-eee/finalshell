/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.lr_1;
import java.lang.reflect.AccessibleObject;
import java.security.PrivilegedAction;

/*
 * Renamed from com.l0
 */
class l0_0
implements PrivilegedAction {
    final AccessibleObject A;
    final lr_1 a;

    l0_0(lr_1 lr_12, AccessibleObject accessibleObject) {
        this.a = lr_12;
        this.A = accessibleObject;
    }

    public Void d() {
        this.A.setAccessible(true);
        return null;
    }

    public Object run() {
        return this.d();
    }
}

