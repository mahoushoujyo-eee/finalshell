/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._w_0;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import java.io.Serializable;

/*
 * Renamed from com.dr
 */
@XStreamAlias(value="SettingsGroupState")
public class dr_2
implements Serializable {
    @XStreamAsAttribute
    private _w_0 Y;
    private Throwable s;

    public dr_2() {
        this(_w_0.none, null);
    }

    public dr_2(_w_0 _w_02) {
        this(_w_02, null);
    }

    public dr_2(_w_0 _w_02, Throwable throwable) {
        this.J(_w_02);
        this.V(throwable);
    }

    public _w_0 L() {
        return this.Y;
    }

    public void J(_w_0 _w_02) {
        this.Y = _w_02;
    }

    public Throwable c() {
        return this.s;
    }

    public void V(Throwable throwable) {
        this.s = throwable;
    }
}

