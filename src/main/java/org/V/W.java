/*
 * Decompiled with CFR 0.152.
 */
package org.V;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.V.N;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class W
implements N {
    private final String W;
    private final byte[] v;

    public W(String string, String string2) {
        this.W = string;
        this.v = string2.getBytes();
    }

    @Override
    public final String o() {
        return this.W;
    }

    @Override
    public final InputStream o() {
        return new ByteArrayInputStream(this.v);
    }

    @Override
    public final long z() {
        return 0L;
    }

    public final String toString() {
        return this.o();
    }
}

