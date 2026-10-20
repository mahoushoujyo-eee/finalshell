/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

public class W3
extends WC {
    public short L = D6.nD;
    byte[] w;
    int J;
    private static final long[] a;
    private static final Integer[] b;

    public W3(int n10, int n11, int n12) {
        byte[] byArray = new byte[W3.a(660, 8682643668078980936L)];
        this.H = n11;
        this.l = n10;
        B8.P(this.W, byArray, 0);
        B8.P(this.L, byArray, 2);
        lh_1.u(n10, byArray, 4);
        lh_1.u(n11, byArray, W3.a(26438, 6535507677913844379L));
        lh_1.u(n12, byArray, W3.a(20183, 9193592327274799880L));
        this.g = new DatagramPacket(byArray, byArray.length);
    }

    public W3(DatagramPacket datagramPacket) {
        this.g = datagramPacket;
        this.w = datagramPacket.getData();
        this.W = B8.M(this.w, 0);
        this.L = B8.M(this.w, 2);
        this.l = lh_1.z(this.w, 4);
        this.H = lh_1.z(this.w, W3.a(3728, 1680226957031498570L));
        this.J = lh_1.z(this.w, W3.a(7495, 7033419662847373465L));
    }

    public int r() {
        return this.J;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8230557311823859542L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "t!?X\u00ba\u0082\u00bf\u00c3\u00d1\u00f6\u00ac\u00f3\u00869\u00ecR\u00bb(\u00b2gQ\u00e5 \u000e";
                var5_4 = "t!?X\u00ba\u0082\u00bf\u00c3\u00d1\u00f6\u00ac\u00f3\u00869\u00ecR\u00bb(\u00b2gQ\u00e5 \u000e".length();
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
                    var4_3 = "\u008f\u00ef\u00bab\u00ca%\u00c5\u00c5\u00da\u00c2x\ri$\u00ac\u0014";
                    var5_4 = "\u008f\u00ef\u00bab\u00ca%\u00c5\u00c5\u00da\u00c2x\ri$\u00ac\u0014".length();
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
        W3.a = var6_1;
        W3.b = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x6DDE;
        if (b[n11] == null) {
            W3.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

