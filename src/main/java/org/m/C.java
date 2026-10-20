/*
 * Decompiled with CFR 0.152.
 */
package org.m;

import java.io.IOException;

public class C
extends IOException {
    private static boolean l;

    public C() {
    }

    public C(String string) {
        super(string);
    }

    public static void h(boolean bl) {
        l = bl;
    }

    public static boolean I() {
        return l;
    }

    public static boolean r() {
        boolean bl = C.I();
        return !bl;
    }

    static {
        if (!C.I()) {
            C.h(true);
        }
    }
}

