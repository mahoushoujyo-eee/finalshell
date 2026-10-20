/*
 * Decompiled with CFR 0.152.
 */
package org.v;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.V.T;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from org.V.d
 */
public class d_0
implements T {
    private final File T;

    public d_0(File file) {
        this.T = file;
    }

    @Override
    public URL T() throws IOException {
        return this.T.toURI().toURL();
    }

    @Override
    public final String o() {
        return this.T.toString();
    }

    @Override
    public final InputStream o() throws IOException {
        return new FileInputStream(this.T);
    }

    @Override
    public final long z() {
        return this.T.lastModified();
    }

    public final File U() {
        return this.T;
    }

    public final String toString() {
        return this.o();
    }
}

