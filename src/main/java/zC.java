/*
 * Decompiled with CFR 0.152.
 */
public class zC {
    private static boolean J;

    public static void main(String[] stringArray) {
        new zC();
    }

    public static void X(boolean bl) {
        J = bl;
    }

    public static boolean z() {
        return J;
    }

    public static boolean u() {
        boolean bl = zC.z();
        return !bl;
    }

    static {
        if (zC.z()) {
            zC.X(true);
        }
    }
}

