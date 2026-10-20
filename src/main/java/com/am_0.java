/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.KO;
import com.YP;
import com.aG;
import com.aK;
import com.dx_2;
import com.ya_1;
import com.yw_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from com.am
 */
public class am_0
extends aG {
    @NotNull
    private ya_1 H;
    @NotNull
    private YP q;
    @Nullable
    private YP n;
    @NotNull
    private KO h;

    private am_0(@NotNull yw_0 yw_02) {
        this.H = yw_0.L(yw_02);
        this.q = yw_0.h(yw_02);
        this.n = yw_0.J(yw_02);
        this.h = yw_0.x(yw_02);
    }

    @NotNull
    public yw_0 g() {
        return this.I(false);
    }

    /*
     * Unable to fully structure code
     */
    @NotNull
    public yw_0 I(boolean var1_1) {
        block4: {
            var3_2 = this.q.K();
            var4_3 = this.q.s();
            var2_4 = dx_2.g();
            if (!var1_1) break block4;
            v0 = var5_5 = super.y();
            if (var2_4 != null) ** GOTO lbl11
            if (v0.K() != null) {
                v1 = var5_5.K();
            } else {
                v0 = this.q;
lbl11:
                // 2 sources

                v1 = v0.K();
            }
            var3_2 = v1;
            v2 = var5_5;
            if (var2_4 != null) ** GOTO lbl19
            if (v2.s() != null) {
                v3 = var5_5.s();
            } else {
                v2 = this.q;
lbl19:
                // 2 sources

                v3 = v2.s();
            }
            var4_3 = v3;
        }
        return new yw_0(var1_1, var3_2, var4_3, this.H, this.h, this.n, null);
    }

    @Override
    @NotNull
    public YP y() {
        return this.g();
    }

    am_0(yw_0 yw_02, aK aK2) {
        this(yw_02);
    }
}

