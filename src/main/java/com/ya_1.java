/*
 * Decompiled with CFR 0.152.
 */
package com;

import org.jetbrains.annotations.NotNull;

/*
 * Renamed from com.yA
 */
public class ya_1 {
    private final Runnable e;
    private static boolean x;

    public ya_1(@NotNull Runnable runnable) {
        this.e = runnable;
    }

    public void v() {
        this.e.run();
    }

    public static void K(boolean bl) {
        x = bl;
    }

    public static boolean w() {
        return x;
    }

    public static boolean H() {
        boolean bl = ya_1.w();
        return !bl;
    }

    static {
        if (!ya_1.w()) {
            ya_1.K(true);
        }
    }
}

