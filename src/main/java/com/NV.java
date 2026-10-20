/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.nd_0;
import com.xo_0;

class NV
extends nd_0 {
    private static final long a;

    public NV() {
        super(new xo_0(new StringBuffer(), (int)a), false, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4954153242285371442L;
        a = 0x902BA66CD6BB0FAEL ^ l2;
    }
}

