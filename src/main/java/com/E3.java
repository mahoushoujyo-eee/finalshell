/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.LC;
import com.pf_1;
import java.util.HashMap;
import java.util.Map;

public class E3 {
    private Map p = new HashMap();

    public pf_1 A(String string) {
        return (pf_1)this.p.get(string);
    }

    public void w(String string, pf_1 pf_12) {
        this.p.put(string, pf_12);
    }

    public Map k() {
        return this.p;
    }

    public void G(Map map) {
        this.p = map;
    }

    public LC W() {
        return new LC(this.p);
    }
}

