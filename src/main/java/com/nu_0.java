/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.F2;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from com.Nu
 */
@XStreamAlias(value="ResourceMap")
public class nu_0
implements Serializable {
    @XStreamImplicit
    private Map P = new HashMap();

    public void T(String string, F2 f22) {
        this.P.put(string, f22);
    }

    public void e(String string) {
        this.P.remove(string);
    }

    public F2 S(String string) {
        return (F2)this.P.get(string);
    }

    public Map b() {
        return this.P;
    }

    public void Y(Map map) {
        this.P = map;
    }
}

