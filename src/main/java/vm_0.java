/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;

/*
 * Renamed from Vm
 */
public class vm_0
extends vb_0 {
    public short i = BN.Y;
    byte[] a;
    int l;
    private static final long[] b;
    private static final Integer[] c;

    public vm_0(int n10, int n11, int n12) {
        byte[] byArray = new byte[vm_0.a(18939, 8071793413677388423L)];
        this.x = n11;
        this.p = n10;
        nb_0.s(this.V, byArray, 0);
        nb_0.s(this.i, byArray, 2);
        cn_1.P(n10, byArray, 4);
        cn_1.P(n11, byArray, vm_0.a(32718, 3293839845692220593L));
        cn_1.P(n12, byArray, vm_0.a(5451, 687540867649982006L));
        this.O = new DatagramPacket(byArray, byArray.length);
    }

    public vm_0(DatagramPacket datagramPacket) {
        this.O = datagramPacket;
        this.a = datagramPacket.getData();
        this.V = nb_0.Q(this.a, 0);
        this.i = nb_0.Q(this.a, 2);
        this.p = cn_1.m(this.a, 4);
        this.x = cn_1.m(this.a, vm_0.a(24546, 4597251211352736923L));
        this.l = cn_1.m(this.a, vm_0.a(23658, 1865988980011403028L));
    }

    public int v() {
        return this.l;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 3680482825237557889L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "\u0094O\u0090\u0086\u00e8\u00e2\u00bc\u00bbSV\u00a1\r\u00da\u00a1\u00e0\u0016\u00a7o\u0089du\u00b6\u00d68";
                var5_4 = "\u0094O\u0090\u0086\u00e8\u00e2\u00bc\u00bbSV\u00a1\r\u00da\u00a1\u00e0\u0016\u00a7o\u0089du\u00b6\u00d68".length();
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
                    var4_3 = "\u0096m\u00e8\u00a1lju\u0099\u009c\u008c\u00eba\u00bb\u00df\u00f6\u0012";
                    var5_4 = "\u0096m\u00e8\u00a1lju\u0099\u009c\u008c\u00eba\u00bb\u00df\u00f6\u0012".length();
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
        vm_0.b = var6_1;
        vm_0.c = new Integer[5];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5B7D;
        if (c[n11] == null) {
            vm_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

