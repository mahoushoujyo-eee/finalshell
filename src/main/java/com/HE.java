/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.F2;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XStreamAlias(value="ResourceList")
public class HE
implements Serializable {
    @XStreamImplicit
    private List i = new ArrayList();

    public void m(F2 f22) {
        this.i.add(f22);
    }

    public void B(F2 f22) {
        this.i.remove(f22);
    }

    public F2 i(int n10) {
        return (F2)this.i.get(n10);
    }

    public List i() {
        return this.i;
    }

    public void G(List list) {
        this.i = list;
    }
}

