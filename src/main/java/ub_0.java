/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ub
 */
public abstract class ub_0 {
    private static String[] J;

    public abstract ky_0 R();

    public static void i(String[] stringArray) {
        J = stringArray;
    }

    public static String[] A() {
        return J;
    }

    static {
        if (ub_0.A() != null) {
            ub_0.i(new String[1]);
        }
    }
}

