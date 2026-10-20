/*
 * Decompiled with CFR 0.152.
 */
package com.m;

import com.m.X;
import com.m.b_0;
import com.m.s;
import com.rt_1;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Renamed from com.m.p
 */
@XStreamAlias(value="TreeState")
@XStreamConverter(value=X.class)
public class p_0
implements Serializable,
Cloneable {
    protected Map i;

    public p_0() {
        this.i = new LinkedHashMap();
    }

    public p_0(Map map) {
        block3: {
            Map map2;
            p_0 p_02;
            block2: {
                String string = s.d();
                String string2 = string;
                p_02 = this;
                map2 = new LinkedHashMap();
                if (string2 == null) break block2;
                p_02.i = map2;
                if (map == null) break block3;
                p_02 = this;
                map2 = map;
            }
            p_02.E(map2);
        }
    }

    public Map c() {
        return this.i;
    }

    public void E(Map map) {
        this.i = map;
    }

    public void P(String string, boolean bl, boolean bl2) {
        this.i.put(string, new b_0(bl, bl2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean y(String string) {
        b_0 b_02 = (b_0)this.i.get(string);
        String string2 = s.d();
        b_0 b_03 = b_02;
        if (string2 != null) {
            if (b_03 == null) return false;
            b_03 = b_02;
        }
        boolean bl = b_03.P();
        if (string2 == null) return bl;
        if (!bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean D(String string) {
        b_0 b_02 = (b_0)this.i.get(string);
        String string2 = s.d();
        b_0 b_03 = b_02;
        if (string2 != null) {
            if (b_03 == null) return false;
            b_03 = b_02;
        }
        boolean bl = b_03.a();
        if (string2 == null) return bl;
        if (!bl) return false;
        return true;
    }

    public p_0 G() {
        return new p_0(rt_1.r((LinkedHashMap)this.i));
    }

    public Object clone() throws CloneNotSupportedException {
        return this.G();
    }
}

