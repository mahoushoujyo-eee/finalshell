/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

public class WX
extends WC {
    public short h = D6.O;
    byte[] j;
    int M;
    private static final long[] a;
    private static final Integer[] b;

    public WX(int n10) {
        this.j = new byte[WX.a(15793, 8606240236008140772L)];
        B8.P(this.W, this.j, 0);
        B8.P(this.h, this.j, 2);
        lh_1.u(n10, this.j, 4);
        this.g = new DatagramPacket(this.j, this.j.length);
    }

    public WX(DatagramPacket datagramPacket) {
        this.j = new byte[WX.a(4950, 1293325122495889666L)];
        this.g = datagramPacket;
        this.j = datagramPacket.getData();
        this.W = B8.M(this.j, 0);
        this.h = B8.M(this.j, 2);
        this.M = lh_1.z(this.j, 4);
    }

    public int a() {
        return this.M;
    }

    public void I(int n10) {
        this.M = n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 8164599594053305871L;
        long[] lArray = new long[2];
        int n10 = 0;
        String string = "\u00a1F\u00b8m>(\u00e9\u00e3T=&5\u0011\u00acG\u0005";
        int n11 = "\u00a1F\u00b8m>(\u00e9\u00e3T=&5\u0011\u00acG\u0005".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5255;
        if (b[n11] == null) {
            WX.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

