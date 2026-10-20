/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.bg_0;
import com.ca_2;
import com.ox_1;
import com.ya_1;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from com.yO
 */
public final class yo_1
extends ya_1 {
    private final ca_2 t;
    private final ox_1 M;
    private static boolean G;

    public yo_1(@NotNull Runnable runnable) {
        this(runnable, null, null);
    }

    private yo_1(@NotNull Runnable runnable, @Nullable ca_2 ca_22, @Nullable ox_1 ox_12) {
        super(runnable);
        this.t = ca_22;
        this.M = ox_12;
    }

    @Nullable
    public ca_2 B() {
        return this.t;
    }

    @Nullable
    public ox_1 W() {
        return this.M;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public static ca_2 G(@Nullable ya_1 ya_12) {
        boolean bl = yo_1.V();
        ya_1 ya_13 = ya_12;
        if (!bl) {
            if (!(ya_13 instanceof yo_1)) return null;
            ya_13 = ya_12;
        }
        ca_2 ca_22 = ((yo_1)ya_13).B();
        return ca_22;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Contract(value="null -> null")
    @Nullable
    public static ox_1 e(@Nullable ya_1 ya_12) {
        boolean bl = yo_1.V();
        ya_1 ya_13 = ya_12;
        if (!bl) {
            if (!(ya_13 instanceof yo_1)) return null;
            ya_13 = ya_12;
        }
        ox_1 ox_12 = ((yo_1)ya_13).W();
        return ox_12;
    }

    yo_1(Runnable runnable, ca_2 ca_22, ox_1 ox_12, bg_0 bg_02) {
        this(runnable, ca_22, ox_12);
    }

    public static void H(boolean bl) {
        G = bl;
    }

    public static boolean K() {
        return G;
    }

    public static boolean V() {
        boolean bl = yo_1.K();
        return !bl;
    }

    static {
        if (yo_1.V()) {
            yo_1.H(true);
        }
    }
}

