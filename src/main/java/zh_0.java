/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from zh
 */
public class zh_0 {
    String r;
    String O;
    String T;
    String d;
    String Z;
    private static int[] F;

    public String l() {
        String string;
        String string2;
        block4: {
            String string3;
            block5: {
                String string4;
                block6: {
                    block7: {
                        string3 = "";
                        int[] nArray = zh_0.n();
                        string2 = this.J();
                        if (nArray == null) break block4;
                        if (string2 == null) break block5;
                        string = this.R();
                        if (string.startsWith(this.J())) {
                            // empty if block
                        }
                        string4 = this.A();
                        if (nArray == null) break block6;
                        if (!string4.equals(this.k())) break block7;
                        string3 = this.J() + " " + this.A() + " " + string;
                        if (nArray != null) break block5;
                    }
                    string4 = this.J() + " " + this.A() + this.k() + " " + string;
                }
                string3 = string4;
            }
            string2 = string3;
        }
        string = string2;
        return string;
    }

    public void f(String string) {
        this.Z = string;
    }

    public String J() {
        return this.r;
    }

    public void B(String string) {
        this.r = string;
    }

    public String k() {
        return this.O;
    }

    public void M(String string) {
        this.O = string;
    }

    public String A() {
        return this.T;
    }

    public void n(String string) {
        this.T = string;
    }

    public String R() {
        return this.d;
    }

    public void y(String string) {
        this.d = string;
    }

    public static void T(int[] nArray) {
        F = nArray;
    }

    public static int[] n() {
        return F;
    }

    static {
        if (zh_0.n() == null) {
            zh_0.T(new int[1]);
        }
    }
}

