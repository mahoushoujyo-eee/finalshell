/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.T;
import java.util.List;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

class C
implements CaretListener {
    final T z;

    C(T t2) {
        this.z = t2;
    }

    @Override
    public void caretUpdate(CaretEvent caretEvent) {
        this.z.b((List)null);
    }
}

