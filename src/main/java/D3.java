/*
 * Decompiled with CFR 0.152.
 */
public class D3 {
    private static boolean X;

    public static void m(boolean bl) {
        X = bl;
    }

    public static boolean S() {
        return X;
    }

    public static boolean M() {
        boolean bl = D3.S();
        return !bl;
    }

    static {
        if (!D3.S()) {
            D3.m(true);
        }
    }
}

