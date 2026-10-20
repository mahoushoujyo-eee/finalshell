/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class xA {
    protected String m;
    private static ky_2[] M;

    public void W() {
        L2.B(this);
    }

    public abstract void N();

    public abstract void Y();

    public abstract void z();

    public abstract void c(int var1) throws mw_0;

    public abstract void V(int var1) throws mw_0;

    public abstract void b(int var1) throws mw_0;

    public abstract int S();

    public abstract InputStream S() throws IOException;

    public String F() {
        return this.m;
    }

    public abstract int h();

    public abstract OutputStream E() throws IOException;

    public abstract int q();

    public abstract int L();

    public abstract int E();

    public abstract boolean l();

    public abstract boolean x();

    public abstract boolean V();

    public abstract void A(int var1);

    public abstract void Z(int var1);

    public static void E(ky_2[] ky_2Array) {
        M = ky_2Array;
    }

    public static ky_2[] P() {
        return M;
    }

    static {
        if (xA.P() == null) {
            xA.E(new ky_2[5]);
        }
    }
}

