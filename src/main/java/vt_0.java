/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.net.DatagramPacket;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Renamed from Vt
 */
public class vt_0
extends vb_0 {
    ArrayList L;
    byte[] Q;
    int Y;
    int m;
    int N;
    int o;
    int q;
    int S;
    int l;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public vt_0(long var1_1, ArrayList var3_2, int var4_3, HashMap var5_4, int var6_5, int var7_6, int var8_7) {
        block7: {
            super();
            this.Q = null;
            var9_8 = vb_0.U();
            this.x = var8_7;
            this.p = var7_6;
            this.L = var3_2;
            this.Y = var4_3;
            var10_9 = vt_0.a(9016, 5994328404459824730L) + 4 * var3_2.size();
            this.Q = new byte[var10_9 + vt_0.a(28510, 5123224870878439991L) + vt_0.a(16934, 8215653496271816520L)];
            this.E = BN.D;
            nb_0.s(this.V, this.Q, 0);
            nb_0.s(this.E, this.Q, 2);
            cn_1.P(var7_6, this.Q, 4);
            cn_1.P(var8_7, this.Q, vt_0.a(21768, 2705968805839196260L));
            cn_1.P(var4_3, this.Q, vt_0.a(6322, 8436200449901600215L));
            nb_0.s((short)var3_2.size(), this.Q, vt_0.a(28706, 8579420013791999301L));
            var11_10 = 0;
            if (var9_8 != null) ** GOTO lbl29
            ky_2.K(new String[4]);
            block0: while (true) {
                v0 /* !! */  = var3_2.get(var11_10);
                do {
                    var12_11 = (Integer)v0 /* !! */ ;
                    cn_1.P(var12_11, this.Q, vt_0.a(11491, 6181462868340812171L) + 4 * var11_10 + vt_0.a(21768, 2705968805839196260L));
                    ++var11_10;
lbl29:
                    // 2 sources

                    if (var11_10 < var3_2.size()) continue block0;
                    var11_10 = var6_5 - 2;
                    cn_1.P(var11_10, this.Q, var10_9 + vt_0.a(21768, 2705968805839196260L));
                    var12_12 = (fr_0)var5_4.get(var11_10);
                    var13_13 = 0;
                    if (var9_8 == null) break block7;
                    v0 /* !! */  = var12_12;
                } while (var9_8 == null);
                break;
            }
            if (v0 /* !! */  != null) {
                var13_13 = var12_12.R();
            }
            cn_1.P(var13_13, this.Q, var10_9 + 4 + vt_0.a(21768, 2705968805839196260L));
        }
        var14_14 = var6_5 - 1;
        cn_1.P(var14_14, this.Q, var10_9 + vt_0.a(21768, 2705968805839196260L) + vt_0.a(21768, 2705968805839196260L));
        var15_15 = (fr_0)var5_4.get(var14_14);
        var16_16 = 0;
        if (var9_8 != null) {
            if (var15_15 != null) {
                var16_16 = var15_15.R();
            }
            cn_1.P(var16_16, this.Q, var10_9 + vt_0.a(6322, 8436200449901600215L) + vt_0.a(21768, 2705968805839196260L));
        }
        var17_17 = var6_5;
        cn_1.P(var17_17, this.Q, var10_9 + vt_0.a(28706, 8579420013791999301L) + vt_0.a(21768, 2705968805839196260L));
        var18_18 = (fr_0)var5_4.get(var17_17);
        var19_19 = 0;
        if (var9_8 != null) {
            if (var18_18 != null) {
                var19_19 = var18_18.R();
            }
            cn_1.P(var19_19, this.Q, var10_9 + vt_0.a(18344, 6210854252616598215L) + vt_0.a(21768, 2705968805839196260L));
            this.O = new DatagramPacket(this.Q, this.Q.length);
        }
    }

    public ArrayList t() {
        return this.L;
    }

    /*
     * Unable to fully structure code
     */
    public vt_0(DatagramPacket var1_1) {
        v0 = vb_0.U();
        super();
        this.Q = null;
        this.O = var1_1;
        this.Q = var1_1.getData();
        this.V = nb_0.Q(this.Q, 0);
        this.E = nb_0.Q(this.Q, 2);
        this.p = cn_1.m(this.Q, 4);
        this.x = cn_1.m(this.Q, vt_0.a(3746, 1652101361221536705L));
        this.Y = cn_1.m(this.Q, vt_0.a(412, 7203171563503977719L));
        var2_2 = v0;
        var3_3 = nb_0.Q(this.Q, vt_0.a(11434, 8312314825262279118L));
        this.L = new ArrayList<E>();
        var4_4 = 0;
        var5_5 = 0;
        if (var2_2 != null) ** GOTO lbl24
        block0: while (true) {
            var4_4 = vt_0.a(568, 1234053477104650078L) + 4 * var5_5;
            do {
                var6_6 = cn_1.m(this.Q, var4_4 + vt_0.a(21768, 2705968805839196260L));
                this.L.add(var6_6);
                ++var5_5;
lbl24:
                // 2 sources

                if (var5_5 < var3_3) continue block0;
                var4_4 = vt_0.a(11491, 6181462868340812171L) + 4 * var3_3 - 4;
                this.m = cn_1.m(this.Q, var4_4 + 4 + vt_0.a(21768, 2705968805839196260L));
                this.q = cn_1.m(this.Q, var4_4 + vt_0.a(21768, 2705968805839196260L) + vt_0.a(21768, 2705968805839196260L));
                this.N = cn_1.m(this.Q, var4_4 + vt_0.a(6322, 8436200449901600215L) + vt_0.a(21768, 2705968805839196260L));
                this.S = cn_1.m(this.Q, var4_4 + vt_0.a(28706, 8579420013791999301L) + vt_0.a(21768, 2705968805839196260L));
                this.o = cn_1.m(this.Q, var4_4 + vt_0.a(27143, 2693644969276796778L) + vt_0.a(21768, 2705968805839196260L));
                this.l = cn_1.m(this.Q, var4_4 + vt_0.a(4447, 257635185061303349L) + vt_0.a(21768, 2705968805839196260L));
            } while (var2_2 == null);
            break;
        }
        if (ky_2.F() != null) {
            vb_0.x(new ky_2[1]);
        }
    }

    public int n() {
        return this.Y;
    }

    public int W() {
        return this.m;
    }

    public int O() {
        return this.o;
    }

    public int L() {
        return this.q;
    }

    public int N() {
        return this.S;
    }

    public int Z() {
        return this.l;
    }

    public int r() {
        return this.N;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 5110959540831211674L;
                var6_1 = new long[14];
                var3_2 = 0;
                var4_3 = "\u00e9\u0084r\u00c0\u0006Y\u0017\u00db\u00a1\u008e\u00fd\u00d5\u00d2L\u0092I\u00bf\u001b\u009enQ\u00f6\u0000\u00f6\u00b2\u00b2\u00e6fla\u00bf\u00e4\u009b\u00b1R\u00c4c\u009b\u00c4\u00b7\u0014\u00bf\\W\u00eez\u00d4a\u001d\u0096\u00d9\u00c6\u00cf\u001b\u00f9\u001b\u0099\u009e\u00cae\u00d1\u0084\u00ba\u00b5z\u00b1\u00117\u00f4\u000b\u00d7\u00ce\u00fd\u0090.\u00a2hQ\u00a5\u00cf\u00cbXX9\u0090[\u00f9DSa\u00e9\u0003*\u00c3MA";
                var5_4 = "\u00e9\u0084r\u00c0\u0006Y\u0017\u00db\u00a1\u008e\u00fd\u00d5\u00d2L\u0092I\u00bf\u001b\u009enQ\u00f6\u0000\u00f6\u00b2\u00b2\u00e6fla\u00bf\u00e4\u009b\u00b1R\u00c4c\u009b\u00c4\u00b7\u0014\u00bf\\W\u00eez\u00d4a\u001d\u0096\u00d9\u00c6\u00cf\u001b\u00f9\u001b\u0099\u009e\u00cae\u00d1\u0084\u00ba\u00b5z\u00b1\u00117\u00f4\u000b\u00d7\u00ce\u00fd\u0090.\u00a2hQ\u00a5\u00cf\u00cbXX9\u0090[\u00f9DSa\u00e9\u0003*\u00c3MA".length();
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
                    var4_3 = "\u0000Ee}:\u007f\u00f6\u00d2Te\u00a6~\u00c4/\u00dbS";
                    var5_4 = "\u0000Ee}:\u007f\u00f6\u00d2Te\u00a6~\u00c4/\u00dbS".length();
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
        vt_0.a = var6_1;
        vt_0.b = new Integer[14];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x56E;
        if (b[n11] == null) {
            vt_0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

