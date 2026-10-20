/*
 * Decompiled with CFR 0.152.
 */
import com.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from lD
 */
public class ld_1
extends ln_2 {
    public static int v;
    public static int i;
    public static int X;
    int t;
    String E;
    int B;
    String z;
    String K;
    boolean F;
    private static int n;

    public ld_1() {
        this.a = "";
    }

    @Override
    public void p(String string) {
        super.p(string);
    }

    public int H() {
        return this.t;
    }

    public void u(int n10) {
        this.t = n10;
    }

    public String B() {
        return (String)this.E;
    }

    public void w(String string) {
        this.E = string;
    }

    public int p() {
        return this.B;
    }

    public void d(int n10) {
        this.B = n10;
    }

    public String f() {
        return (String)this.z;
    }

    public void S(String string) {
        this.z = string;
    }

    public String c() {
        return (String)this.K;
    }

    public void c(String string) {
        this.K = string;
    }

    public boolean o() {
        return this.F;
    }

    public void s(boolean bl) {
        this.F = bl;
    }

    @Override
    public ln_2 B() {
        return new ld_1();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 4098829763164179555L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "L(\u00a7'\u00fc3\f\u0007\u0007\u009b\u008b\u0095\u00fc3\f\u00ab";
        int n11 = "L(\u00a7'\u00fc3\f\u0007\u0007\u009b\u008b\u0095\u00fc3\f\u00ab".length();
        int n12 = 0;
        ld_1.b(0);
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        ld_1.v = (int)lArray[0];
        ld_1.i = (int)lArray[1];
        ld_1.X = 0;
    }

    public static void b(int n10) {
        n = n10;
    }

    public static int e() {
        return n;
    }

    public static int v() {
        int n10 = ld_1.e();
        if (n10 == 0) {
            return 107;
        }
        return 0;
    }
}

