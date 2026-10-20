/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import org.V.K;
import org.V.f;
import org.l.O;
import org.v.n_0;

/*
 * Renamed from org.V.y
 */
class y_0
extends O {
    y_0(Iterator iterator) {
        super(iterator);
    }

    protected Iterator W(Object object) {
        File file = (File)object;
        int[] nArray = f.h();
        File file2 = file;
        if (nArray == null) {
            if (!file2.exists()) {
                return Collections.emptyList().iterator();
            }
            file2 = file;
        }
        File[] fileArray = file2.listFiles(new K(this));
        return new n_0(this, Arrays.asList(fileArray).iterator());
    }

    @Override
    protected Object w(Object object) {
        return this.W(object);
    }
}

