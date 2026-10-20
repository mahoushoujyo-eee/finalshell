/*
 * Decompiled with CFR 0.152.
 */
package org.V;

import java.io.File;
import java.util.Iterator;
import org.V.J;
import org.V.a;
import org.l.O;

class Y
extends O {
    Y(Iterator iterator) {
        super(iterator);
    }

    protected J g(Object object) {
        return a.c((File)object);
    }

    @Override
    protected Object w(Object object) {
        return this.g(object);
    }
}

