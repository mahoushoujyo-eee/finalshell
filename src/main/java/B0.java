/*
 * Decompiled with CFR 0.152.
 */
import org.icmp4j.j;

public class B0 {
    public static int t;
    public static int Z;
    public static int m;
    int B;
    j f;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 1211598454893282570L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u0098\u0094E\u000b\u001aS\u0085o\u009f(\u00dd\u008a\u001aS\u0085d\u00e4\t\u00bdH\u001aS\u0085n";
        int n11 = "\u0098\u0094E\u000b\u001aS\u0085o\u009f(\u00dd\u008a\u001aS\u0085d\u00e4\t\u00bdH\u001aS\u0085n".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        t = (int)lArray[2];
        Z = (int)lArray[0];
        m = (int)lArray[1];
    }

    public B0(int n10) {
        this.B = n10;
    }

    public int p() {
        return this.B;
    }

    public void l(int n10) {
        this.B = n10;
    }

    public j w() {
        return this.f;
    }

    public void q(j j2) {
        this.f = j2;
    }
}

