/*
 * Decompiled with CFR 0.152.
 */
import com.c;

public abstract class W2 {
    public String F;
    KV p;
    String T;
    tl_0 P;
    private static String y;

    public abstract void O();

    public String w() {
        return (String)this.F;
    }

    public void J(String string) {
        this.F = string;
    }

    public KV X() {
        return (KV)this.p;
    }

    public void M(KV kV) {
        this.p = kV;
    }

    public String j() {
        return (String)this.T;
    }

    public void G(String string) {
        this.T = string;
    }

    public tl_0 z() {
        return (tl_0)this.P;
    }

    public void s(tl_0 tl_02) {
        this.P = tl_02;
    }

    public static void d(String string) {
        y = string;
    }

    public static String F() {
        return y;
    }

    static {
        if (W2.F() == null) {
            W2.d("fFBz5b");
        }
    }
}

