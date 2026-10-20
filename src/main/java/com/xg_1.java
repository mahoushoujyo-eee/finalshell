/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.BN;
import com.KH;
import com.PM;
import com.cc_0;
import com.x6_0;
import java.util.List;
import javax.swing.JComponent;

/*
 * Renamed from com.xG
 */
public class xg_1
extends x6_0 {
    protected cc_0 k;

    public xg_1(String string) {
        this.k = (cc_0)PM.s(this.getClass().getResource(string));
    }

    public xg_1(cc_0 cc_02) {
        this.k = cc_02;
    }

    public cc_0 C() {
        return this.k;
    }

    @Override
    public String z() {
        return this.k.a();
    }

    @Override
    public String P() {
        return this.k.H();
    }

    @Override
    public String O() {
        return this.k.L();
    }

    @Override
    public String A() {
        return this.k.X();
    }

    @Override
    public List f() {
        return this.k.B();
    }

    @Override
    public String M() {
        return this.k.O();
    }

    @Override
    public BN G(JComponent jComponent, KH kH) {
        return this.k.t(jComponent, kH);
    }
}

