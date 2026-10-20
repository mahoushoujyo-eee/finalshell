/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KW;
import java.security.PrivilegedAction;

/*
 * Renamed from com.xw
 */
class xw_2
implements PrivilegedAction {
    xw_2() {
    }

    public Object run() {
        return KW.class.getProtectionDomain();
    }
}

