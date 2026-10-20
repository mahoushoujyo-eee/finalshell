/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ca_2;
import com.ky_2;
import com.ox_1;
import com.ya_1;
import com.yo_1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class RN {
    private Runnable i;
    private ca_2 V;
    private ox_1 v;

    @NotNull
    public RN g(@NotNull Runnable runnable) {
        this.i = runnable;
        return this;
    }

    @NotNull
    public RN j(@Nullable ca_2 ca_22) {
        this.V = ca_22;
        return this;
    }

    @NotNull
    public RN J(@Nullable ox_1 ox_12) {
        this.v = ox_12;
        return this;
    }

    @NotNull
    public ya_1 r() {
        boolean bl = yo_1.K();
        yo_1 yo_12 = new yo_1(this.i, this.V, this.v, null);
        if (!bl) {
            ky_2.K(new String[4]);
        }
        return yo_12;
    }
}

