/*
 * Decompiled with CFR 0.152.
 */
package com.z;

import com.Z.T;
import java.io.File;
import java.util.Comparator;

/*
 * Renamed from com.Z.u
 */
class u_0
implements Comparator {
    final T k;

    u_0(T t2) {
        this.k = t2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int v(File file, File file2) {
        long l2 = file.lastModified();
        long l3 = file2.lastModified();
        String string = T.v();
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (string == null) {
            if (l4 < 0) {
                l4 = -1;
                return (int)l4;
            }
            l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        }
        if (string != null) return (int)l4;
        if (l4 > 0) {
            l4 = 1;
            return (int)l4;
        }
        l4 = 0;
        return (int)l4;
    }

    public int compare(Object object, Object object2) {
        return this.v((File)object, (File)object2);
    }
}

