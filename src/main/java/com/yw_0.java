/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KO;
import com.SY;
import com.YP;
import com.aG;
import com.aK;
import com.am_0;
import com.et_0;
import com.ya_1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from com.Yw
 */
public class yw_0
extends YP {
    @NotNull
    private final ya_1 s;
    @NotNull
    private final YP Y;
    @Nullable
    private final YP T;
    @NotNull
    private final KO F;

    public yw_0(@NotNull YP yP, @NotNull ya_1 ya_12) {
        this(yP.K(), yP.s(), ya_12, KO.HOVER, yP);
    }

    public yw_0(@Nullable et_0 et_02, @Nullable et_0 et_03, @NotNull ya_1 ya_12, @NotNull KO kO, @Nullable YP yP) {
        this(false, et_02, et_03, ya_12, kO, yP);
    }

    private yw_0(boolean bl, @Nullable et_0 et_02, @Nullable et_0 et_03, @NotNull ya_1 ya_12, @NotNull KO kO, @Nullable YP yP) {
        super(bl ? et_02 : null, bl ? et_03 : null);
        this.Y = new aG().j(et_03).c(et_02).c(SY.UNDERLINED, true).y();
        this.s = ya_12;
        this.F = kO;
        this.T = yP;
    }

    @Nullable
    public YP J() {
        return this.T;
    }

    @NotNull
    public YP k() {
        return this.Y;
    }

    @NotNull
    public ya_1 g() {
        return this.s;
    }

    @NotNull
    public KO i() {
        return this.F;
    }

    @NotNull
    public am_0 Y() {
        return new am_0(this, null);
    }

    @Override
    @NotNull
    public aG n() {
        return this.Y();
    }

    static ya_1 L(yw_0 yw_02) {
        return yw_02.s;
    }

    static YP h(yw_0 yw_02) {
        return yw_02.Y;
    }

    static YP J(yw_0 yw_02) {
        return yw_02.T;
    }

    static KO x(yw_0 yw_02) {
        return yw_02.F;
    }

    yw_0(boolean bl, et_0 et_02, et_0 et_03, ya_1 ya_12, KO kO, YP yP, aK aK2) {
        this(bl, et_02, et_03, ya_12, kO, yP);
    }
}

