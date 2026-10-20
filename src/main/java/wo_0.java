/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

/*
 * Renamed from Wo
 */
public class wo_0
extends WC {
    public short a = D6.nJ;
    byte[] O;
    int R;
    private static final long[] b;
    private static final Integer[] c;

    public wo_0(int n10, int n11, int n12) {
        this.O = new byte[wo_0.a(15172, 2293638377211085841L)];
        B8.P(this.W, this.O, 0);
        B8.P(this.a, this.O, 2);
        lh_1.u(n10, this.O, 4);
        lh_1.u(n11, this.O, wo_0.a(1602, 1411417827883841809L));
        lh_1.u(n12, this.O, wo_0.a(14785, 1590220575283562134L));
        this.g = new DatagramPacket(this.O, this.O.length);
    }

    public wo_0(DatagramPacket datagramPacket) {
        this.O = new byte[wo_0.a(32366, 5696093919171117370L)];
        this.g = datagramPacket;
        this.O = datagramPacket.getData();
        this.W = B8.M(this.O, 0);
        this.a = B8.M(this.O, 2);
        this.l = lh_1.z(this.O, 4);
        this.H = lh_1.z(this.O, wo_0.a(7783, 7602016566115754289L));
        this.R = lh_1.z(this.O, wo_0.a(7275, 3882600448434561849L));
    }

    public int m() {
        return this.R;
    }

    public void f(int n10) {
        this.R = n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2068252910128690238L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "\u00ab\u00ce\u0012&U\u00a82\u00a4\u00c3\u009c\u00ab\u00c3j\u0015\u0095\u0007y\u00ab\u00ae]\u00e1=\u00b0?\u00e20\u00cd\u0017\u00ce\u0096u\u0014";
                var5_4 = "\u00ab\u00ce\u0012&U\u00a82\u00a4\u00c3\u009c\u00ab\u00c3j\u0015\u0095\u0007y\u00ab\u00ae]\u00e1=\u00b0?\u00e20\u00cd\u0017\u00ce\u0096u\u0014".length();
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
                    var4_3 = "\u001b\u0015\u00ad7\u0019H\r'\u00fc\u0018\u009b\u00ff8U\u0097\u000b";
                    var5_4 = "\u001b\u0015\u00ad7\u0019H\r'\u00fc\u0018\u009b\u00ff8U\u0097\u000b".length();
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
        wo_0.b = var6_1;
        wo_0.c = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7F57;
        if (c[n11] == null) {
            wo_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

