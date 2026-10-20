/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

/*
 * Renamed from Wk
 */
public class wk_0
extends WC {
    public short c = D6.G;
    byte[] i;
    int u;
    int Y;
    int w;
    private static final long[] a;
    private static final Integer[] b;

    public wk_0(int n10, int n11, int n12, int n13, int n14) {
        this.i = new byte[wk_0.a(16586, 3212115676478027188L)];
        B8.P(this.W, this.i, 0);
        B8.P(this.c, this.i, 2);
        lh_1.u(n10, this.i, 4);
        lh_1.u(n11, this.i, wk_0.a(21646, 3417960061659062770L));
        lh_1.u(n12, this.i, wk_0.a(23854, 7413987921695385695L));
        B8.P((short)(n13 / wk_0.a(32509, 3972529081864326023L)), this.i, wk_0.a(1971, 6995498658321625803L));
        B8.P((short)(n14 / wk_0.a(10711, 5701625640290114734L)), this.i, wk_0.a(4930, 6206280042808010290L));
        this.g = new DatagramPacket(this.i, this.i.length);
    }

    public wk_0(DatagramPacket datagramPacket) {
        this.i = new byte[wk_0.a(23962, 2309008171900840165L)];
        this.g = datagramPacket;
        this.i = datagramPacket.getData();
        this.W = B8.M(this.i, 0);
        this.c = B8.M(this.i, 2);
        this.l = lh_1.z(this.i, 4);
        this.H = lh_1.z(this.i, wk_0.a(5554, 2275927899000594633L));
        this.u = lh_1.z(this.i, wk_0.a(19940, 982829834226120855L));
        this.Y = B8.M(this.i, wk_0.a(6021, 5131672327724065527L));
        this.w = B8.M(this.i, wk_0.a(16618, 8654543269772309911L));
    }

    public int V() {
        return this.u;
    }

    public void g(int n10) {
        this.u = n10;
    }

    public int t() {
        return this.Y;
    }

    public void Y(int n10) {
        this.Y = n10;
    }

    public int p() {
        return this.w;
    }

    public void p(int n10) {
        this.w = n10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3448883374975898189L;
                var6_1 = new long[12];
                var3_2 = 0;
                var4_3 = "\u00f5\u00da\u00c4\u00f0\u00a6\u00f0\n\u00e3\u00a9^WA^\u00cb \u0096\u0089s\u00cc\u00f5\u00b7d\u00b2\u008c\u00b65c\"\u0005^\u00dd\u00ca\u0097\u00aa\u00c4[\u001d6\u00e7\u00c8f(\u009fa6\u0099s\u00b7]Q%n\u00c8\u00af\u00fa\u00bc\u0005\u00d4+\u0000d\u00df\u00e7\u00ed\u00fe\u0005\u00c3\u00ae\u00cc\u0080\u00fa\u001e\u0018gu\u0011\u0005\u001a\u00b4m";
                var5_4 = "\u00f5\u00da\u00c4\u00f0\u00a6\u00f0\n\u00e3\u00a9^WA^\u00cb \u0096\u0089s\u00cc\u00f5\u00b7d\u00b2\u008c\u00b65c\"\u0005^\u00dd\u00ca\u0097\u00aa\u00c4[\u001d6\u00e7\u00c8f(\u009fa6\u0099s\u00b7]Q%n\u00c8\u00af\u00fa\u00bc\u0005\u00d4+\u0000d\u00df\u00e7\u00ed\u00fe\u0005\u00c3\u00ae\u00cc\u0080\u00fa\u001e\u0018gu\u0011\u0005\u001a\u00b4m".length();
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
                    var4_3 = "\u001b\u0082jO\u00f2\u0084j\u00d6\u00c9|\u00ba\u00ae\u0000\u0081\u00b0\u00aa";
                    var5_4 = "\u001b\u0082jO\u00f2\u0084j\u00d6\u00c9|\u00ba\u00ae\u0000\u0081\u00b0\u00aa".length();
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
        wk_0.a = var6_1;
        wk_0.b = new Integer[12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7579;
        if (b[n11] == null) {
            wk_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

