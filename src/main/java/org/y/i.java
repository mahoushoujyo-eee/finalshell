/*
 * Decompiled with CFR 0.152.
 */
package org.y;

import java.net.URL;
import java.util.Map;
import java.util.jar.JarFile;
import org.y.S;
import org.y.k;

class i
implements S {
    final URL q;
    final JarFile E;

    i(URL uRL, JarFile jarFile) {
        this.q = uRL;
        this.E = jarFile;
    }

    @Override
    public Map T(String string, boolean bl, boolean bl2) {
        return k.Z(this.q, this.E, string, bl, bl2);
    }
}

