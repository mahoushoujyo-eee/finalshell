/*
 * Decompiled with CFR 0.152.
 */
import com.c;

/*
 * Renamed from Fp
 */
class fp_0 {
    String W;
    boolean v;

    public fp_0(String string, boolean bl) {
        this.W = string;
        this.v = bl;
    }

    public boolean W() {
        return this.v;
    }

    public void c(boolean bl) {
        this.v = bl;
    }

    public String k() {
        return (String)this.W;
    }

    public void n(String string) {
        this.W = string;
    }

    public String toString() {
        return this.getClass().getName() + "[" + (String)this.W + "/" + this.v + "]";
    }
}

