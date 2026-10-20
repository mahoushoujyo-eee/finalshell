/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.aD;
import com.pa_1;
import com.zT;
import java.awt.event.KeyEvent;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

class aR
extends aD {
    final pa_1 b;

    aR(pa_1 pa_12, zT zT2, Predicate predicate) {
        this.b = pa_12;
        super(zT2, predicate);
    }

    @Override
    public boolean X(@Nullable KeyEvent keyEvent) {
        return keyEvent != null || pa_1.e(this.b) != null;
    }
}

