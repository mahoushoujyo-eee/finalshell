/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public abstract class mW {
    private static boolean M;

    public abstract Object Z() throws IOException;

    public static void q(boolean bl) {
        M = bl;
    }

    public static boolean J() {
        return M;
    }

    public static boolean q() {
        boolean bl = mW.J();
        return !bl;
    }

    static {
        if (!mW.J()) {
            mW.q(true);
        }
    }
}

