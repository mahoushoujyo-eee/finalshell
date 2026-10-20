/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.K9;
import com.QR;
import java.util.Comparator;

class OI
implements Comparator {
    final QR a;

    OI(QR qR) {
        this.a = qR;
    }

    public int d(K9 k9, K9 k92) {
        Integer n10 = this.a.J.indexOf(k9);
        Integer n11 = this.a.J.indexOf(k92);
        return n10.compareTo(n11);
    }

    public int compare(Object object, Object object2) {
        return this.d((K9)object, (K9)object2);
    }
}

