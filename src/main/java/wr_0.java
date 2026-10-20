/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

/*
 * Renamed from Wr
 */
public class wr_0
extends WC {
    short q = D6.L;
    int J;
    int P;
    byte[] h;
    int n;
    byte[] i;
    private static final long[] a;
    private static final Integer[] b;

    public wr_0(int n10, int n11, int n12, byte[] byArray) {
        this.i = new byte[wr_0.a(7106, 7219922101616451607L) + byArray.length];
        this.n = n11;
        this.J = n10;
        this.P = n12;
        this.h = byArray;
        B8.P(this.W, this.i, 0);
        B8.P(this.q, this.i, 2);
        lh_1.u(n10, this.i, 4);
        lh_1.u(n11, this.i, wr_0.a(5848, 1430400230651243785L));
        lh_1.u(n12, this.i, wr_0.a(7960, 1235124188661916876L));
        System.arraycopy(byArray, 0, this.i, wr_0.a(1828, 7094500031115377906L), byArray.length);
    }

    public wr_0(DatagramPacket datagramPacket) {
        this.g = datagramPacket;
        byte[] byArray = datagramPacket.getData();
        this.W = B8.M(byArray, 0);
        this.q = B8.M(byArray, 2);
        this.J = lh_1.z(byArray, 4);
        this.n = lh_1.z(byArray, wr_0.a(551, 6793511191555783152L));
        this.P = lh_1.z(byArray, wr_0.a(26630, 404114103843410902L));
        int n10 = datagramPacket.getLength() - wr_0.a(1828, 7094500031115377906L);
        this.h = new byte[n10];
        System.arraycopy(byArray, wr_0.a(1828, 7094500031115377906L), this.h, 0, n10);
    }

    public int Y() {
        return this.J;
    }

    public void r(int n10) {
        this.J = n10;
    }

    public int i() {
        return this.P;
    }

    public void N(int n10) {
        this.P = n10;
    }

    public byte[] M() {
        return this.h;
    }

    public void d(byte[] byArray) {
        this.h = byArray;
    }

    public byte[] B() {
        return this.i;
    }

    public void A(byte[] byArray) {
        this.i = byArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 7921375694230284018L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "b\u00a44\u00cd\u008f\u00d5F\u00f5TT\u0084\u00c0U\u00ad\u00c22\u00ca\u0013\u00e7\u00b9\u00e5P\u00df\n\u009eP?\u00bd&\u00a3Z\u0010";
                var5_4 = "b\u00a44\u00cd\u008f\u00d5F\u00f5TT\u0084\u00c0U\u00ad\u00c22\u00ca\u0013\u00e7\u00b9\u00e5P\u00df\n\u009eP?\u00bd&\u00a3Z\u0010".length();
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
                    var4_3 = "\u0081\u00a4\u0014\u00f6\u00e1\u0098\u00cb\u00f3\u0094-\u00fa\u00dckM\u00b5(";
                    var5_4 = "\u0081\u00a4\u0014\u00f6\u00e1\u0098\u00cb\u00f3\u0094-\u00fa\u00dckM\u00b5(".length();
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
        wr_0.a = var6_1;
        wr_0.b = new Integer[6];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3BD5;
        if (b[n11] == null) {
            wr_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

