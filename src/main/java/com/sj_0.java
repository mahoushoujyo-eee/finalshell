/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BX;
import com.F5;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.io.Serializable;
import java.util.List;

/*
 * Renamed from com.Sj
 */
@XStreamAlias(value="DocumentPaneState")
public class sj_0
implements Serializable {
    @XStreamAsAttribute
    private Boolean A;
    @XStreamAsAttribute
    private String D;
    @XStreamImplicit
    private List y;
    @XStreamAsAttribute
    private Integer B;
    @XStreamAsAttribute
    private Double b;
    private F5 e;

    public sj_0() {
    }

    public sj_0(String string, List list) {
        this.A = false;
        this.D = string;
        this.y = list;
    }

    public sj_0(int n10, double d2, F5 f52) {
        this.A = true;
        this.B = n10;
        this.b = d2;
        this.e = f52;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Boolean T() {
        boolean bl;
        block5: {
            Boolean bl2;
            String[] stringArray;
            block4: {
                stringArray = BX.B();
                bl2 = this.A;
                if (stringArray != null) break block4;
                if (bl2 == null) break block5;
                bl2 = this.A;
            }
            bl = bl2;
            if (stringArray != null) return bl;
            if (bl) {
                bl = true;
                return bl;
            }
        }
        bl = false;
        return bl;
    }

    public void K(Boolean bl) {
        this.A = bl;
    }

    public String e() {
        return this.D;
    }

    public void K(String string) {
        this.D = string;
    }

    public List n() {
        return this.y;
    }

    public void H(List list) {
        this.y = list;
    }

    public Integer Z() {
        return this.B;
    }

    public void Q(Integer n10) {
        this.B = n10;
    }

    public Double b() {
        return this.b;
    }

    public void u(Double d2) {
        this.b = d2;
    }

    public F5 d() {
        return this.e;
    }

    public void n(F5 f52) {
        this.e = f52;
    }
}

