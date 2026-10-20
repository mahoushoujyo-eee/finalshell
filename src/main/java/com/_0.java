/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NE;
import com.ky_2;
import com.kz_1;
import com.lo_1;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.io.Serializable;
import java.util.List;

@XStreamAlias(value="PluginInformation")
public class _0
implements Serializable {
    private String i;
    private String d;
    private String n;
    private boolean t;
    private String T;
    private String c;
    private String u;
    private lo_1 k;
    @XStreamImplicit
    private List m;
    @XStreamImplicit
    private List j;

    public _0() {
    }

    public _0(String string, boolean bl, String string2, String string3, String string4) {
        this(string, null, null, bl, string2, string3, string4, lo_1.L, null, null);
    }

    public _0(String string, boolean bl, String string2, String string3, String string4, lo_1 lo_12) {
        this(string, null, null, bl, string2, string3, string4, lo_12, null, null);
    }

    public _0(String string, String string2, String string3, boolean bl, String string4, String string5, String string6, lo_1 lo_12, List list) {
        this(string, string2, string3, bl, string4, string5, string6, lo_12, list, null);
    }

    public _0(String string, String string2, String string3, boolean bl, String string4, String string5, String string6, lo_1 lo_12, List list, List list2) {
        ky_2[] ky_2Array = kz_1.W();
        this.i = string;
        this.d = string2;
        this.n = string3;
        this.t = bl;
        ky_2[] ky_2Array2 = ky_2Array;
        this.T = string4;
        this.c = string5;
        this.u = string6;
        this.k = lo_12;
        this.m = list;
        this.j = list2;
        if (ky_2Array2 != null) {
            ky_2.K(new String[1]);
        }
    }

    public String B() {
        return this.i;
    }

    public void o(String string) {
        this.i = string;
    }

    public String e() {
        return this.d;
    }

    public void U(String string) {
        this.d = string;
    }

    public String r() {
        return this.n;
    }

    public List h() {
        return NE.D(this.n, ",");
    }

    public void R(String string) {
        this.n = string;
    }

    public void H(List list) {
        this.n = NE.I(list, ",");
    }

    public boolean m() {
        return this.t;
    }

    public void B(boolean bl) {
        this.t = bl;
    }

    public String X() {
        return this.T;
    }

    public void D(String string) {
        this.T = string;
    }

    public String v() {
        return this.c;
    }

    public void F(String string) {
        this.c = string;
    }

    public String t() {
        return this.u;
    }

    public void v(String string) {
        this.u = string;
    }

    public lo_1 w() {
        return this.k;
    }

    public void W(lo_1 lo_12) {
        this.k = lo_12;
    }

    public List b() {
        return this.m;
    }

    public void M(List list) {
        this.m = list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean O() {
        ky_2[] ky_2Array = kz_1.W();
        List list = this.m;
        if (ky_2Array == null) {
            if (list == null) return 0 != 0;
            list = this.m;
        }
        int n10 = list.size();
        if (ky_2Array != null) return n10 != 0;
        if (n10 <= 0) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int l() {
        ky_2[] ky_2Array = kz_1.W();
        List list = this.m;
        if (ky_2Array == null) {
            if (list == null) return 0;
            list = this.m;
        }
        int n10 = list.size();
        if (ky_2Array != null) return n10;
        if (n10 <= 0) return 0;
        n10 = this.m.size();
        return n10;
    }

    public List N() {
        return this.j;
    }

    public void D(List list) {
        this.j = list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean i() {
        ky_2[] ky_2Array = kz_1.W();
        List list = this.j;
        if (ky_2Array == null) {
            if (list == null) return 0 != 0;
            list = this.j;
        }
        int n10 = list.size();
        if (ky_2Array != null) return n10 != 0;
        if (n10 <= 0) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int c() {
        ky_2[] ky_2Array = kz_1.W();
        List list = this.j;
        if (ky_2Array == null) {
            if (list == null) return 0;
            list = this.j;
        }
        int n10 = list.size();
        if (ky_2Array != null) return n10;
        if (n10 <= 0) return 0;
        n10 = this.j.size();
        return n10;
    }

    public String toString() {
        return this.c + " " + this.k;
    }
}

