/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

public class WJ
extends WC {
    public short o = D6.X;
    byte[] e;
    private static final long[] a;
    private static final Integer[] b;

    public WJ(int n10, int n11) {
        byte[] byArray = new byte[WJ.a(22789, 1154950531792643365L)];
        this.H = n11;
        this.l = n10;
        B8.P(this.W, byArray, 0);
        B8.P(this.o, byArray, 2);
        lh_1.u(n10, byArray, 4);
        lh_1.u(n11, byArray, WJ.a(26079, 5579751648188340732L));
        this.g = new DatagramPacket(byArray, byArray.length);
    }

    public WJ(DatagramPacket datagramPacket) {
        this.g = datagramPacket;
        this.e = datagramPacket.getData();
        this.W = B8.M(this.e, 0);
        this.o = B8.M(this.e, 2);
        this.l = lh_1.z(this.e, 4);
        this.H = lh_1.z(this.e, WJ.a(3445, 3865969664778727764L));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 5705416763788016438L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "\u00bb\u00ebP#\b\u00b6\u00cajpr\u007f7\u00d9\u0082\u009e\u001f>h\u00de{\u00c0\u000e\"\u00c2";
        int n11 = "\u00bb\u00ebP#\b\u00b6\u00cajpr\u007f7\u00d9\u0082\u009e\u001f>h\u00de{\u00c0\u000e\"\u00c2".length();
        int n12 = 0;
        do {
            byte[] byArray = string.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            lArray[n13] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n12 < n11);
        a = lArray;
        b = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7C21;
        if (b[n11] == null) {
            WJ.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

