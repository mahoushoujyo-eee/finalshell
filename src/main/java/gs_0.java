/*
 * Decompiled with CFR 0.152.
 */
import com.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from gs
 */
public class gs_0 {
    String s;
    int w;
    int k;
    String C;
    long o;
    boolean i;
    private static final long a;

    gs_0(String string, int n10, String string2) {
        this.o = a;
        this.s = string;
        this.w = n10;
        this.C = string2;
        this.k = (string2 + string + n10).hashCode();
    }

    public String V() {
        return (String)this.s;
    }

    public void f(String string) {
        this.s = string;
    }

    public int l() {
        return this.w;
    }

    public void c(int n10) {
        this.w = n10;
    }

    public int H() {
        return this.k;
    }

    public String H() {
        return (String)this.C;
    }

    public void n(String string) {
        this.C = string;
    }

    public boolean x() {
        return this.i;
    }

    public void Q(boolean bl) {
        this.i = bl;
    }

    public long C() {
        return this.o;
    }

    public void p(long l2) {
        this.o = l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2800751769422750593L;
        a = 0xD921BB1ACF829C7EL ^ l2;
    }
}

