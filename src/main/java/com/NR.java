/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.y1_0;

class NR {
    NR() {
    }

    static void C(byte[] byArray) {
        boolean bl = y1_0.D();
        if (byArray == null) {
            return;
        }
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            byArray[i2] = 0;
            if (!bl) continue;
        }
    }
}

