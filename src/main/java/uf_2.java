/*
 * Decompiled with CFR 0.152.
 */
import com.c;

/*
 * Renamed from uf
 */
public class uf_2 {
    public static int e;
    public static int P;
    int J;
    tf_2 t;
    ck_2 u;

    public uf_2(int n10) {
        this.J = 0;
        this.J = n10;
    }

    public int Q() {
        return this.J;
    }

    public void D(int n10) {
        this.J = n10;
    }

    public tf_2 n() {
        return (tf_2)this.t;
    }

    public void w(tf_2 tf_22) {
        this.t = tf_22;
    }

    public ck_2 v() {
        return (ck_2)this.u;
    }

    public void b(ck_2 ck_22) {
        this.u = ck_22;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5378886281743865981L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "UZ\u00ca\u0089\u001e\u0090\u0098\u0018N\u007fz\u00b4\u001e\u0090\u0098\u0019";
        int n11 = "UZ\u00ca\u0089\u001e\u0090\u0098\u0018N\u007fz\u00b4\u001e\u0090\u0098\u0019".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        uf_2.e = (int)lArray[1];
        uf_2.P = (int)lArray[0];
    }
}

