/*
 * Decompiled with CFR 0.152.
 */
import com.c;

public class BJ {
    String M;
    public static int f;
    public static int w;
    int W;

    public String B() {
        return (String)this.M;
    }

    public void o(String string) {
        this.M = string;
    }

    public int P() {
        return this.W;
    }

    public void V(int n10) {
        this.W = n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8290374672878413104L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u0098\u00dc\u007fd7\u00d0&\u00d9\u00ca~\u0017\u00077\u00d0&\u00d8";
        int n11 = "\u0098\u00dc\u007fd7\u00d0&\u00d9\u00ca~\u0017\u00077\u00d0&\u00d8".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        BJ.f = (int)lArray[1];
        BJ.w = (int)lArray[0];
    }
}

