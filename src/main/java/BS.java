/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.io.Serializable;
import java.net.ServerSocket;

public class BS
implements Serializable {
    public int F;
    public int J;
    public String P;
    public String C;
    boolean Y;
    ServerSocket u;
    private static int l;

    public BS() {
        this.Y = false;
    }

    public int n() {
        return this.F;
    }

    public void j(int n10) {
        this.F = n10;
    }

    public int b() {
        return this.J;
    }

    public void W(int n10) {
        this.J = n10;
    }

    public String c() {
        return (String)this.P;
    }

    public void D(String string) {
        this.P = string;
    }

    public String f() {
        return (String)this.C;
    }

    public void m(String string) {
        this.C = string;
    }

    public static void q(int n10) {
        l = n10;
    }

    public static int s() {
        return l;
    }

    public static int t() {
        int n10 = BS.s();
        if (n10 == 0) {
            return 122;
        }
        return 0;
    }

    static {
        if (BS.t() != 0) {
            BS.q(121);
        }
    }
}

