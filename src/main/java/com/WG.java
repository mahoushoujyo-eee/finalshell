/*
 * Decompiled with CFR 0.152.
 */
package com;

public class WG
extends RuntimeException {
    private static int s;

    public WG() {
    }

    public WG(String string) {
        super(string);
    }

    public WG(String string, Throwable throwable) {
        super(string, throwable);
    }

    public WG(Throwable throwable) {
        super(throwable);
    }

    public static void z(int n10) {
        s = n10;
    }

    public static int t() {
        return s;
    }

    public static int C() {
        int n10 = WG.t();
        try {
            if (n10 == 0) {
                return 30;
            }
        }
        catch (RuntimeException runtimeException) {
            throw WG.a(runtimeException);
        }
        return 0;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    static {
        if (WG.t() != 0) {
            WG.z(86);
        }
    }
}

