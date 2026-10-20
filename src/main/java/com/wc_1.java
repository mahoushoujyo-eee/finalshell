/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.E3;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from com.wC
 */
public class wc_1 {
    private Map t = new HashMap();

    public E3 N(String string) {
        return (E3)this.t.get(string);
    }

    public void h(String string, E3 e3) {
        this.t.put(string, e3);
    }

    public Map m() {
        return this.t;
    }

    public void E(Map map) {
        this.t = map;
    }
}

