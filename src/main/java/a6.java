/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.util.ArrayList;
import java.util.HashMap;

public class a6 {
    public int r;
    public String B;
    public int a = (int)b;
    public String m;
    public String j;
    b2_0 g;
    HashMap G = new HashMap();
    boolean U = false;
    public String Z;
    public ArrayList k = new ArrayList();
    public ArrayList E = new ArrayList();
    public ArrayList w = new ArrayList();
    private static ky_2[] V;
    private static final long b;

    void g(String string, b2_0 b2_02) {
        this.G.put(string, b2_02);
    }

    void h(nD nD2) {
        this.w.add(nD2);
        nD2.F = this;
    }

    public ArrayList k() {
        return this.w;
    }

    public void d(ArrayList arrayList) {
        this.w = arrayList;
    }

    public static void i(ky_2[] ky_2Array) {
        V = ky_2Array;
    }

    public static ky_2[] P() {
        return V;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (a6.P() == null) {
            a6.i(new ky_2[2]);
        }
        long l2 = 7002487834923142730L;
        b = 0x49D2A8EC8968EACL ^ l2;
    }
}

