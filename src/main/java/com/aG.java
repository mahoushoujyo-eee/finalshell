/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.SY;
import com.YP;
import com.et_0;
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class aG {
    private et_0 m;
    private et_0 L;
    private EnumSet j;
    boolean Q = false;
    boolean J = false;
    boolean t;
    YP v;

    public boolean C() {
        return this.Q;
    }

    public void H(boolean bl) {
        this.Q = bl;
    }

    public boolean o() {
        return this.J;
    }

    public void v(boolean bl) {
        this.J = bl;
    }

    public boolean b() {
        return this.t;
    }

    public void R(boolean bl) {
        this.t = bl;
    }

    public aG(@NotNull YP yP) {
        this.J = yP.m;
        this.Q = yP.W;
        this.v = yP;
        this.m = YP.i(yP);
        this.L = YP.r(yP);
        this.j = YP.h(yP).clone();
    }

    public aG() {
        this.m = null;
        this.L = null;
        this.j = EnumSet.noneOf(SY.class);
    }

    @NotNull
    public aG c(@Nullable et_0 et_02) {
        this.m = et_02;
        return this;
    }

    @NotNull
    public aG j(@Nullable et_0 et_02) {
        this.L = et_02;
        return this;
    }

    @NotNull
    public aG c(@NotNull SY sY, boolean bl) {
        SY.L(sY, this.j, bl);
        return this;
    }

    @NotNull
    public YP y() {
        YP yP = new YP(this.m, this.L, this.j);
        yP.e(this.J);
        yP.C(this.Q);
        yP.t(this.t);
        return yP;
    }
}

