/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

public class WH
extends WC {
    public short j = D6.n0;
    byte[] B;
    int K;
    int a;
    float y;
    private static final long[] b;
    private static final Integer[] c;

    public WH(int n10, int n11, float f10) {
        this.B = new byte[WH.a(14297, 1052285891736922553L)];
        B8.P(this.W, this.B, 0);
        B8.P(this.j, this.B, 2);
        lh_1.u(n10, this.B, 4);
        lh_1.u(n11, this.B, WH.a(30888, 3774858201995978442L));
        int n12 = (int)(f10 * 1000.0f * 1000.0f);
        lh_1.u(n12, this.B, WH.a(15195, 63642864682526014L));
        this.g = new DatagramPacket(this.B, this.B.length);
    }

    public WH(DatagramPacket datagramPacket) {
        this.B = new byte[WH.a(10875, 4678922022008288287L)];
        this.g = datagramPacket;
        this.B = datagramPacket.getData();
        this.W = B8.M(this.B, 0);
        this.j = B8.M(this.B, 2);
        this.K = lh_1.z(this.B, 4);
        this.a = lh_1.z(this.B, WH.a(7228, 2932923725124354655L));
        int n10 = lh_1.z(this.B, WH.a(7999, 7832484183645307230L));
        this.y = (float)n10 / 1000000.0f;
    }

    public int V() {
        return this.K;
    }

    public void j(int n10) {
        this.K = n10;
    }

    public int J() {
        return this.a;
    }

    public void V(int n10) {
        this.a = n10;
    }

    public float B() {
        return this.y;
    }

    public void B(float f10) {
        this.y = f10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3421718114979231406L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "EBW\u00e3g\u00f9_\u0007D\u000bo\u00df\u00ff\u00d0w\u00fcT\u0013\u00c4\u0006\u00c3\u00ab\u0090l\u00c9EM\u008f\u00a9\u0081t\u00f9";
                var5_4 = "EBW\u00e3g\u00f9_\u0007D\u000bo\u00df\u00ff\u00d0w\u00fcT\u0013\u00c4\u0006\u00c3\u00ab\u0090l\u00c9EM\u008f\u00a9\u0081t\u00f9".length();
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
                    var4_3 = "7^]\u00dc\u00e1UB\u00a1\u00a8\u0093o\u00a498\u00d3\u009c";
                    var5_4 = "7^]\u00dc\u00e1UB\u00a1\u00a8\u0093o\u00a498\u00d3\u009c".length();
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
        WH.b = var6_1;
        WH.c = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5E60;
        if (c[n11] == null) {
            WH.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

