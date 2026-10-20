/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

public class V_
extends vb_0 {
    public short R = BN.y;
    byte[] B;
    int r;
    int z;
    int G;
    private static final long[] a;
    private static final Integer[] b;

    public V_(int n10, int n11, int n12, int n13, int n14) {
        this.B = new byte[V_.a(13899, 3384811622759484692L)];
        nb_0.s(this.V, this.B, 0);
        nb_0.s(this.R, this.B, 2);
        cn_1.P(n10, this.B, 4);
        cn_1.P(n11, this.B, V_.a(25798, 7007651448375320465L));
        cn_1.P(n12, this.B, V_.a(16913, 1114947073741142341L));
        nb_0.s((short)(n13 / V_.a(5668, 2403136607807696248L)), this.B, V_.a(28269, 8983863149012751676L));
        nb_0.s((short)(n14 / V_.a(20449, 7836925158754628791L)), this.B, V_.a(13361, 8364430354140385122L));
        this.O = new DatagramPacket(this.B, this.B.length);
    }

    public V_(DatagramPacket datagramPacket) {
        this.B = new byte[V_.a(23100, 4086099864281817454L)];
        this.O = datagramPacket;
        this.B = datagramPacket.getData();
        this.V = nb_0.Q(this.B, 0);
        this.R = nb_0.Q(this.B, 2);
        this.p = cn_1.m(this.B, 4);
        this.x = cn_1.m(this.B, V_.a(21423, 5678773943378487546L));
        this.r = cn_1.m(this.B, V_.a(1695, 158662474167090625L));
        this.z = nb_0.Q(this.B, V_.a(15051, 7087397558827762070L));
        this.G = nb_0.Q(this.B, V_.a(18477, 3961241305414022013L));
    }

    public int m() {
        return this.r;
    }

    public void G(int n10) {
        this.r = n10;
    }

    public int K() {
        return this.z;
    }

    public void e(int n10) {
        this.z = n10;
    }

    public int A() {
        return this.G;
    }

    public void L(int n10) {
        this.G = n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 7157113023317754834L;
                var6_1 = new long[12];
                var3_2 = 0;
                var4_3 = "\b\u0099\u009f7\u0016\u00c9seZ\u00f1\u0096\u00ad\u00d6\u0004\u00dcKW\u0002)\u007f=\u009e\u00fa\u009b\u0095a3\u00c1\u008a\u00fc\u00eb s\u00e5\u00c0\u0018\u0083gb\u00a8_\u00c70\u0081\u00cb%\f\u00a2\u00dcB)\u00e0\"\u00e3\u00f0\u00bdl\u00e1I4\u0097\u008d\u00d6\u00feQ\u009d{\u009e\u0017\u00c4\u00be\u001f\u0014-\u00ca\u0080*\u001c\u000e\u00d2";
                var5_4 = "\b\u0099\u009f7\u0016\u00c9seZ\u00f1\u0096\u00ad\u00d6\u0004\u00dcKW\u0002)\u007f=\u009e\u00fa\u009b\u0095a3\u00c1\u008a\u00fc\u00eb s\u00e5\u00c0\u0018\u0083gb\u00a8_\u00c70\u0081\u00cb%\f\u00a2\u00dcB)\u00e0\"\u00e3\u00f0\u00bdl\u00e1I4\u0097\u008d\u00d6\u00feQ\u009d{\u009e\u0017\u00c4\u00be\u001f\u0014-\u00ca\u0080*\u001c\u000e\u00d2".length();
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
                    var4_3 = "\u00c3T\u00cf^\u00c30*\u00aaq\u008e|A\u009f\u00cb\u0002T";
                    var5_4 = "\u00c3T\u00cf^\u00c30*\u00aaq\u008e|A\u009f\u00cb\u0002T".length();
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
        V_.a = var6_1;
        V_.b = new Integer[12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7B56;
        if (b[n11] == null) {
            V_.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

