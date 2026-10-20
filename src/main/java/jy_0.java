/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Jy
 */
public class jy_0 {
    private static int i;

    public static void b(Object object) {
        System.out.println(object);
    }

    public static void g(String string) {
        System.out.println(string);
    }

    public static void W(int n10) {
        i = n10;
    }

    public static int C() {
        return i;
    }

    public static int G() {
        int n10 = jy_0.C();
        if (n10 == 0) {
            return 30;
        }
        return 0;
    }

    static {
        if (jy_0.C() != 0) {
            jy_0.W(43);
        }
    }
}

