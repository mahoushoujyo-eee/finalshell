/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.V.T;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from org.V.w
 */
class w_0
implements T {
    final URL Y;
    final String K;

    w_0(URL uRL, String string) {
        this.Y = uRL;
        this.K = string;
    }

    @Override
    public URL T() throws IOException {
        return this.Y;
    }

    @Override
    public InputStream o() throws IOException {
        return this.Y.openStream();
    }

    @Override
    public String o() {
        return this.K;
    }

    @Override
    public long z() {
        return 0L;
    }
}

