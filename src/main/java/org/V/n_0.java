/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.zip.ZipFile;
import org.V.J;
import org.l.O;
import org.v.t_0;
import org.v.y_0;

/*
 * Renamed from org.V.n
 */
class n_0
extends O {
    final y_0 Z;

    n_0(y_0 y_02, Iterator iterator) {
        this.Z = y_02;
        super(iterator);
    }

    protected J c(Object object) {
        File file = (File)object;
        try {
            return new t_0(new ZipFile(file));
        }
        catch (IOException iOException) {
            return J.a;
        }
    }

    @Override
    protected Object w(Object object) {
        return this.c(object);
    }
}

