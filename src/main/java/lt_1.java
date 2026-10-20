/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.Serializable;

/*
 * Renamed from lT
 */
public class lt_1
implements Serializable {
    private String e = "";
    private String C = "";
    private boolean d = true;
    private boolean V = true;
    boolean T;

    public lt_1() {
        int n10 = WV.U();
        this.T = true;
        if (n10 != 0) {
            ky_2.K(new String[3]);
        }
    }

    public String A() {
        return this.e;
    }

    public void k(String string) {
        this.e = string;
    }

    public String X() {
        return this.C;
    }

    public void Z(String string) {
        this.C = string;
    }

    public boolean Q() {
        return this.d;
    }

    public void q(boolean bl) {
        this.d = bl;
    }

    public boolean F() {
        return this.V;
    }

    public void W(boolean bl) {
        this.V = bl;
    }

    public boolean M() {
        return this.T;
    }

    public void L(boolean bl) {
        this.T = bl;
    }
}

