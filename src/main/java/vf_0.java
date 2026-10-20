/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

/*
 * Renamed from Vf
 */
public class vf_0
extends vb_0 {
    public short g = BN.I;
    byte[] W;
    int r;
    private static final long[] a;
    private static final Integer[] b;

    public vf_0(int n10, int n11, int n12) {
        this.W = new byte[vf_0.a(31623, 3560000825793062218L)];
        nb_0.s(this.V, this.W, 0);
        nb_0.s(this.g, this.W, 2);
        cn_1.P(n10, this.W, 4);
        cn_1.P(n11, this.W, vf_0.a(26635, 1623351260510533312L));
        cn_1.P(n12, this.W, vf_0.a(12340, 1231610951609511676L));
        this.O = new DatagramPacket(this.W, this.W.length);
    }

    public vf_0(DatagramPacket datagramPacket) {
        this.W = new byte[vf_0.a(8232, 4250574554732068577L)];
        this.O = datagramPacket;
        this.W = datagramPacket.getData();
        this.V = nb_0.Q(this.W, 0);
        this.g = nb_0.Q(this.W, 2);
        this.p = cn_1.m(this.W, 4);
        this.x = cn_1.m(this.W, vf_0.a(3019, 3479991318924547329L));
        this.r = cn_1.m(this.W, vf_0.a(5597, 1318463303062342417L));
    }

    public int R() {
        return this.r;
    }

    public void H(int n10) {
        this.r = n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1082900346347092124L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "\u0019G\u00e6\u000e\u00dd4\u0006m\u0081\u0088\u000e\u00b0?\u0000\u0016l\u00d7\u00ee7\u00bc{C\u00ceT\u0013[\u00c3J\u0016\u00da\u00ad\u0095";
                var5_4 = "\u0019G\u00e6\u000e\u00dd4\u0006m\u0081\u0088\u000e\u00b0?\u0000\u0016l\u00d7\u00ee7\u00bc{C\u00ceT\u0013[\u00c3J\u0016\u00da\u00ad\u0095".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "[U\u00ba\u00d2\nT]\u00c6\u00c4\u00ec\u00c6P\u00dbA3\u0081";
                    var5_4 = "[U\u00ba\u00d2\nT]\u00c6\u00c4\u00ec\u00c6P\u00dbA3\u0081".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        vf_0.a = var6_1;
        vf_0.b = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5EC9;
        if (b[n11] == null) {
            vf_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

