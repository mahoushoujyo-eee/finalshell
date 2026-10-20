/*
 * Decompiled with CFR 0.152.
 */
package org.V;

import java.io.File;
import org.V.f;

public class E
extends f {
    private final File I;
    private static final long b;

    public E(File file) {
        this.I = file;
    }

    @Override
    protected final File r(String string) {
        return new File(this.I, string.replace((char)b, File.separatorChar));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5009753000943441928L;
        b = 0x6FF827DFC1AE5827L ^ l2;
    }
}

