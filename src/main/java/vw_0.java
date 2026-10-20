/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;
import java.net.InetAddress;

/*
 * Renamed from Vw
 */
public class vw_0
extends vb_0 {
    short b = BN.B;
    int u = 0;
    int D = 0;
    byte[] k;
    byte[] H;
    int y;
    InetAddress z;
    int L;
    int j;
    int i;
    long m;
    private static final long[] a;
    private static final Integer[] c;

    public vw_0(int n10, byte[] byArray, int n11, short s2, int n12, int n13) {
        this.u = n10;
        this.j = n11;
        this.D = s2;
        this.k = new byte[this.D];
        this.x = n13;
        this.p = n12;
        System.arraycopy(byArray, n11, this.k, 0, s2);
        this.D = this.k.length;
    }

    public void Q(int n10) {
        this.y = n10;
        this.H = new byte[this.D + vw_0.a(27402, 3222684224957112110L) + vw_0.a(27165, 595597405137133115L)];
        nb_0.s(this.V, this.H, 0);
        nb_0.s(this.b, this.H, 2);
        cn_1.P(this.p, this.H, 4);
        cn_1.P(this.x, this.H, vw_0.a(27165, 595597405137133115L));
        cn_1.P(this.u, this.H, vw_0.a(2156, 9169129863271398475L));
        nb_0.s((short)this.D, this.H, vw_0.a(27402, 3222684224957112110L));
        cn_1.P(this.y, this.H, vw_0.a(9583, 3819245765274243399L));
        System.arraycopy(this.k, 0, this.H, vw_0.a(22415, 637977137435960236L), this.D);
        this.O = new DatagramPacket(this.H, this.H.length);
        this.O.setAddress(this.z);
        this.O.setPort(this.L);
    }

    public vw_0(DatagramPacket datagramPacket) {
        this.O = datagramPacket;
        this.H = datagramPacket.getData();
        this.V = nb_0.Q(this.H, 0);
        this.b = nb_0.Q(this.H, 2);
        this.p = cn_1.m(this.H, 4);
        this.x = cn_1.m(this.H, vw_0.a(18851, 7492612762599456134L));
        this.u = cn_1.m(this.H, vw_0.a(23631, 4948944298799917167L));
        this.D = nb_0.Q(this.H, vw_0.a(24360, 6143282504831462153L));
        this.y = cn_1.m(this.H, vw_0.a(18096, 7596157666804232850L));
        this.k = new byte[this.D];
        System.arraycopy(this.H, vw_0.a(3749, 3334769386291313292L), this.k, 0, this.D);
    }

    public int N() {
        return this.u;
    }

    public byte[] q() {
        return this.k;
    }

    public int u() {
        return this.D;
    }

    public int o() {
        return this.y;
    }

    public void R(int n10) {
        this.y = n10;
    }

    public InetAddress v() {
        return this.z;
    }

    @Override
    public void D(InetAddress inetAddress) {
        this.z = inetAddress;
    }

    public int x() {
        return this.L;
    }

    @Override
    public void A(int n10) {
        this.L = n10;
    }

    public int c() {
        return this.i;
    }

    public void w(int n10) {
        this.i = n10;
    }

    public long R() {
        return this.m;
    }

    public void a(long l2) {
        this.m = l2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3924284477287639224L;
                var6_1 = new long[10];
                var3_2 = 0;
                var4_3 = "\u00c9%\u008aZ\u0005\u0016\u00c3\u00a1*p\u00f91\u00c5f\u00c0\u00db\u00b46\u00c1\u00b11\u00ff\u00cb\u0002$\u00ae\b\u00b9a\u00f6\u00da8o\u0094\u0015C\u0090\u0003U6\u00e5j\u00ef<\u00d9\u009d\u00f7\u0086(\u0091:,u\u00f8\u0094\u00ffC@\u00d2z\u0088\u0018\u00f6\u008b";
                var5_4 = "\u00c9%\u008aZ\u0005\u0016\u00c3\u00a1*p\u00f91\u00c5f\u00c0\u00db\u00b46\u00c1\u00b11\u00ff\u00cb\u0002$\u00ae\b\u00b9a\u00f6\u00da8o\u0094\u0015C\u0090\u0003U6\u00e5j\u00ef<\u00d9\u009d\u00f7\u0086(\u0091:,u\u00f8\u0094\u00ffC@\u00d2z\u0088\u0018\u00f6\u008b".length();
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
                    var4_3 = "|\u00dd\u00d8!\u001f\u00f2\u0092\"\u00beg\u00e4'wY9\u00ed";
                    var5_4 = "|\u00dd\u00d8!\u001f\u00f2\u0092\"\u00beg\u00e4'wY9\u00ed".length();
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
        vw_0.a = var6_1;
        vw_0.c = new Integer[10];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3421;
        if (c[n11] == null) {
            vw_0.c[n11] = (int)(a[n11] ^ l2);
        }
        return c[n11];
    }
}

