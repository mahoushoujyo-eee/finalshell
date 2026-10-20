/*
 * Decompiled with CFR 0.152.
 */
import com.c;

public class YE {
    public static int e;
    public static int H;
    public static int A;
    int z;
    String n;
    int G;
    int E;
    String g;
    String u;
    int I;
    boolean J;
    private static int[] W;

    public YE() {
        this.J = false;
    }

    public int t() {
        return this.z;
    }

    public void Q(int n10) {
        this.z = n10;
    }

    public int O() {
        return this.G;
    }

    public void t(int n10) {
        this.G = n10;
    }

    public int r() {
        return this.E;
    }

    public void F(int n10) {
        this.E = n10;
    }

    public String b() {
        return (String)this.n;
    }

    public void y(String string) {
        this.n = string;
    }

    public String toString() {
        return (String)this.n;
    }

    public boolean H() {
        return this.J;
    }

    public void d(boolean bl) {
        this.J = bl;
    }

    public String B() {
        return (String)this.g;
    }

    public void V(String string) {
        this.g = string;
    }

    public String A() {
        return (String)this.u;
    }

    public void T(String string) {
        this.u = string;
    }

    public int D() {
        return this.I;
    }

    public void C(int n10) {
        this.I = n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5864339385746299505L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "K\u00bdG>\u00c9\u00bd\u009a\u00b9\n\u00c1\u00a90\u00c9\u00bd\u009a\u0015]\u00d7\u0012\u00ca\u00c9\u00bd\u009b]";
        int n11 = "K\u00bdG>\u00c9\u00bd\u009a\u00b9\n\u00c1\u00a90\u00c9\u00bd\u009a\u0015]\u00d7\u0012\u00ca\u00c9\u00bd\u009b]".length();
        int n12 = 0;
        YE.W(null);
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        YE.e = (int)lArray[2];
        YE.H = (int)lArray[0];
        YE.A = (int)lArray[1];
    }

    public static void W(int[] nArray) {
        W = nArray;
    }

    public static int[] n() {
        return W;
    }
}

