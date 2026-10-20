/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.io.Serializable;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class XS
implements Serializable {
    private String q;
    private boolean K;
    private String l;
    private Map x;

    public String x() {
        return this.q;
    }

    public void T(String string) {
        this.q = string;
    }

    public boolean p() {
        return this.K;
    }

    public void f(boolean bl) {
        this.K = bl;
    }

    public String b() {
        return this.l;
    }

    public void s(String string) {
        this.l = string;
    }

    public Map b() {
        return this.x;
    }

    public void p(Map map) {
        this.x = map;
    }
}

