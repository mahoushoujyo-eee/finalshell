/*
 * Decompiled with CFR 0.152.
 */
package com;

/*
 * Renamed from com.Hi
 */
public class hi_0
extends RuntimeException {
    private static String Q;

    public hi_0() {
    }

    public hi_0(String string) {
        super(string);
    }

    public hi_0(String string, Throwable throwable) {
        super(string, throwable);
    }

    public static void F(String string) {
        Q = string;
    }

    public static String C() {
        return Q;
    }

    static {
        if (hi_0.C() != null) {
            hi_0.F("HDZEp");
        }
    }
}

