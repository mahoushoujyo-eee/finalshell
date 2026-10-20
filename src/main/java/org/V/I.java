/*
 * Decompiled with CFR 0.152.
 */
package org.V;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.V.C;
import org.V.H;

public class I
implements H {
    private final Map T;

    public I() {
        this.T = new HashMap();
    }

    public I(Map map) {
        this.T = map;
    }

    public final Map n() {
        return this.T;
    }

    @Override
    public final OutputStream X(String string) {
        return new C(this, string);
    }

    @Override
    public final boolean A(String string) {
        return this.T.remove(string) != null;
    }

    static Map T(I i2) {
        return i2.T;
    }
}

