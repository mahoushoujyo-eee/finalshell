/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

@XStreamAlias(value="langInfo")
public class IJ
implements Serializable {
    @XStreamAsAttribute
    private String j;
    @XStreamAsAttribute
    private String x;
    @XStreamAsAttribute
    private String K;
    @XStreamAsAttribute
    private String M;

    public String k() {
        return this.j;
    }

    public void a(String string) {
        this.j = string;
    }

    public String y() {
        return this.x;
    }

    public void t(String string) {
        this.x = string;
    }

    public String h() {
        return this.K;
    }

    public void F(String string) {
        this.K = string;
    }

    public String I() {
        return this.M;
    }

    public void O(String string) {
        this.M = string;
    }
}

