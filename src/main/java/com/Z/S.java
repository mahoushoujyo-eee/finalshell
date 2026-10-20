/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.T;
import com.cz_0;
import java.io.File;
import java.util.Comparator;

class S
implements Comparator {
    final T H;

    S(T t2) {
        this.H = t2;
    }

    public int L(File file, File file2) {
        boolean bl = cz_0.V(file);
        boolean bl2 = cz_0.V(file2);
        String string = bl ? cz_0.G(file.getName(), true) : "";
        String string2 = bl2 ? cz_0.G(file2.getName(), true) : "";
        return string.compareToIgnoreCase(string2);
    }

    public int compare(Object object, Object object2) {
        return this.L((File)object, (File)object2);
    }
}

