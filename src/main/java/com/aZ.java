/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.QT;
import com.YP;
import com.dc_1;
import com.im_2;
import com.j_0;
import com.rx_2;
import com.uS;
import com.ug_0;
import com.xo_0;
import org.jetbrains.annotations.NotNull;

public class aZ
implements ug_0 {
    @NotNull
    private final QT j;
    @NotNull
    private final im_2 b;
    @NotNull
    private final rx_2 p;
    @NotNull
    private uS d = uS.Unknown;
    private boolean v = false;

    public aZ(@NotNull QT qT, @NotNull im_2 im_22, @NotNull rx_2 rx_22) {
        this.j = qT;
        this.b = im_22;
        this.p = rx_22;
    }

    @Override
    public void N(char c2, int n10) {
        this.v = true;
        dc_1 dc_12 = this.d();
        YP yP = this.p.W().H();
        dc_12.V(n10, new j_0(c2, 1), yP);
        this.f(dc_12);
    }

    @Override
    public void O(int n10, int n11) {
        this.v = true;
        dc_1 dc_12 = this.d();
        dc_12.R(n10, n11, YP.r);
        this.f(dc_12);
    }

    @Override
    public void B() {
        this.b.z();
    }

    @Override
    public void e(int n10) {
    }

    @Override
    public void N() {
        boolean bl = j_0.P();
        aZ aZ2 = this;
        if (!bl) {
            if (aZ2.v) {
                this.b.D();
            }
            aZ2 = this;
        }
        aZ2.v = false;
    }

    @Override
    public void U() {
        this.b.w();
    }

    @Override
    public void D() {
        this.b.h();
    }

    @Override
    public boolean x() {
        return this.b.T();
    }

    @Override
    public boolean E() {
        return this.p.W().d();
    }

    @Override
    public long j() {
        return this.p.W().h();
    }

    @Override
    @NotNull
    public uS e() {
        return this.d;
    }

    public void O(uS uS2) {
        this.d = uS2;
    }

    @Override
    @NotNull
    public xo_0 S() {
        dc_1 dc_12 = this.b.D(this.j.A() - 1);
        return new xo_0(new StringBuffer(dc_12.V()), this.j.z() - 1);
    }

    @Override
    public int f() {
        return this.j.R();
    }

    @NotNull
    private dc_1 d() {
        dc_1 dc_12 = this.b.D(this.j.A() - 1);
        boolean bl = j_0.g();
        dc_1 dc_13 = dc_12.N;
        if (bl) {
            if (dc_13 != null) {
                dc_12 = dc_12.N;
            }
            dc_13 = dc_12.X();
        }
        return dc_13;
    }

    private void f(@NotNull dc_1 dc_12) {
        dc_1 dc_13 = this.b.D(this.j.A() - 1);
        dc_13.N = dc_12;
    }
}

