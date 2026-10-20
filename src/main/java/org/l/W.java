/*
 * Decompiled with CFR 0.152.
 */
package org.l;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Iterator;
import java.util.List;
import org.F.c;
import org.l.F;
import org.l.q;
import org.l.z;

class W
implements org.T.z {
    private final List W;
    final File B;
    final FilenameFilter h;
    final FilenameFilter c;

    W(File file, FilenameFilter filenameFilter, FilenameFilter filenameFilter2) {
        this.B = file;
        this.h = filenameFilter;
        this.c = filenameFilter2;
        this.W = q.V(new z(this, this.B));
    }

    @c
    public File u() {
        boolean bl = F.s();
        while (!this.W.isEmpty()) {
            block7: {
                Iterator iterator;
                boolean bl2;
                z z10;
                block5: {
                    block6: {
                        z10 = (z)this.W.get(this.W.size() - 1);
                        bl2 = z10.w.hasNext();
                        if (!bl) break block5;
                        if (!bl2) break block6;
                        this.W.add(new z(this, (File)z10.w.next()));
                        if (bl) break block7;
                    }
                    iterator = z10.Y;
                    if (!bl) break block7;
                    bl2 = iterator.hasNext();
                }
                if (bl2) {
                    File file = (File)z10.Y.next();
                    return file;
                }
                iterator = this.W.remove(this.W.size() - 1);
            }
            if (bl) continue;
        }
        return null;
    }

    @Override
    @c
    public Object h() {
        return this.u();
    }
}

