/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;

/*
 * Renamed from com.Su
 */
@XStreamAlias(value="PluginLibrary")
public class su_0
implements Serializable {
    private String a;
    private String M;
    private String A;
    private String O;
    private String F;

    public su_0() {
    }

    public su_0(String string, String string2, String string3, String string4, String string5) {
        this.a = string;
        this.M = string2;
        this.A = string3;
        this.O = string4;
        this.F = string5;
    }

    public String I() {
        return this.a;
    }

    public void G(String string) {
        this.a = string;
    }

    public String x() {
        return this.M;
    }

    public void q(String string) {
        this.M = string;
    }

    public String y() {
        return this.A;
    }

    public void a(String string) {
        this.A = string;
    }

    public String b() {
        return this.O;
    }

    public void m(String string) {
        this.O = string;
    }

    public String m() {
        return this.F;
    }

    public void e(String string) {
        this.F = string;
    }

    public String toString() {
        return this.M + " " + this.O;
    }
}

