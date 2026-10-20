/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B_;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import java.io.Serializable;

@XStreamAlias(value="text")
@XStreamConverter(value=B_.class)
public final class N7
implements Serializable,
Cloneable {
    private String F;
    private String k;

    public N7() {
        this("");
    }

    public N7(String string) {
        this(string, null);
    }

    public N7(String string, String string2) {
        this.F = string;
        this.k = string2;
    }

    public String c() {
        return this.F;
    }

    public void U(String string) {
        this.F = string;
    }

    public String m() {
        return this.k;
    }

    public void j(String string) {
        this.k = string;
    }

    public N7 w() {
        return new N7(this.F, this.k);
    }

    public String toString() {
        return this.F;
    }

    public Object clone() throws CloneNotSupportedException {
        return this.w();
    }
}

