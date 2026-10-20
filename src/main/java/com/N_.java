/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.cn_0;
import com.it_2;
import com.pn_1;
import com.wh_1;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;

public class N_
extends cn_0 {
    public N_(@NotNull pn_1 pn_12, @NotNull Function function) {
        super(pn_12, function::apply);
    }

    @Override
    public _y_0 x() {
        return new _y_0(this.f());
    }

    @Override
    protected wh_1 m() {
        return new it_2();
    }
}

