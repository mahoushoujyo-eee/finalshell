/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

/*
 * Renamed from com.m.b
 */
@XStreamAlias(value="NodeState")
public class b_0
implements Serializable,
Cloneable {
    @XStreamAsAttribute
    protected boolean C;
    @XStreamAsAttribute
    protected boolean r;

    public b_0() {
        this.C = false;
        this.r = false;
    }

    public b_0(boolean bl, boolean bl2) {
        this.C = bl;
        this.r = bl2;
    }

    public boolean P() {
        return this.C;
    }

    public void H(boolean bl) {
        this.C = bl;
    }

    public boolean a() {
        return this.r;
    }

    public void f(boolean bl) {
        this.r = bl;
    }

    protected b_0 w() {
        return new b_0(this.C, this.r);
    }

    protected Object clone() throws CloneNotSupportedException {
        return this.w();
    }
}

