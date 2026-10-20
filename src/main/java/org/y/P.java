/*
 * Decompiled with CFR 0.152.
 */
package org.y;

import com.GO;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.y.C;
import org.y.S;
import org.z.D;

class P
implements S {
    final Set N;

    P(Set set) {
        this.N = set;
    }

    @Override
    public Map T(String string, boolean bl, boolean bl2) throws IOException {
        HashMap hashMap = new HashMap();
        Iterator iterator = this.N.iterator();
        boolean bl3 = GO.s();
        while (iterator.hasNext()) {
            D d2 = (D)iterator.next();
            URI uRI = (URI)d2.H().l();
            d2.G().Y().V(new C(this, string, bl2, uRI, hashMap));
            if (bl3) continue;
        }
        return hashMap;
    }
}

