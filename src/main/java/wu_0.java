/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

/*
 * Renamed from Wu
 */
public class wu_0
extends WC {
    public short Q = D6.s;
    byte[] X;
    int p;
    private static final long[] a;
    private static final Integer[] b;

    public wu_0(int n10) {
        this.X = new byte[wu_0.a(29939, 1766505960135745293L)];
        B8.P(this.W, this.X, 0);
        B8.P(this.Q, this.X, 2);
        lh_1.u(n10, this.X, 4);
        this.g = new DatagramPacket(this.X, this.X.length);
    }

    public wu_0(DatagramPacket datagramPacket) {
        this.X = new byte[wu_0.a(9739, 6944375963203177972L)];
        this.g = datagramPacket;
        this.X = datagramPacket.getData();
        this.W = B8.M(this.X, 0);
        this.Q = B8.M(this.X, 2);
        this.p = lh_1.z(this.X, 4);
    }

    public int l() {
        return this.p;
    }

    public void t(int n10) {
        this.p = n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2494929310710983813L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00b13\u00c8\u00b6\u0001\u00df\u00e1\u00b9\u00d0L\u00b5^\u00ff#3@";
        int n11 = "\u00b13\u00c8\u00b6\u0001\u00df\u00e1\u00b9\u00d0L\u00b5^\u00ff#3@".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2BFF;
        if (b[n11] == null) {
            wu_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

