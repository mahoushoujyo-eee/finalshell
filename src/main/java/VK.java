/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

public class VK
extends vb_0 {
    public short m = BN.f;
    byte[] j;
    private static final long[] a;
    private static final Integer[] b;

    public VK(int n10, int n11) {
        byte[] byArray = new byte[VK.a(7801, 2773220949880713373L)];
        this.x = n11;
        this.p = n10;
        nb_0.s(this.V, byArray, 0);
        nb_0.s(this.m, byArray, 2);
        cn_1.P(n10, byArray, 4);
        cn_1.P(n11, byArray, VK.a(14423, 1592735203207583408L));
        this.O = new DatagramPacket(byArray, byArray.length);
    }

    public VK(DatagramPacket datagramPacket) {
        this.O = datagramPacket;
        this.j = datagramPacket.getData();
        this.V = nb_0.Q(this.j, 0);
        this.m = nb_0.Q(this.j, 2);
        this.p = cn_1.m(this.j, 4);
        this.x = cn_1.m(this.j, VK.a(12173, 8627473504472596843L));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 2648420409332840680L;
        long[] lArray = new long[3];
        int n10 = 0;
        String string = "$\u0086.p\u00b5\u0002\u00b9\u008b\u00dfy\u00ee\u0089\u001a_.Pk\u00d7\u009c\u0092Sb\by";
        int n11 = "$\u0086.p\u00b5\u0002\u00b9\u008b\u00dfy\u00ee\u0089\u001a_.Pk\u00d7\u009c\u0092Sb\by".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2EE6;
        if (b[n11] == null) {
            VK.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

