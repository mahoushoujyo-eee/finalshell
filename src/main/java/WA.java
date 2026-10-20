/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.net.DatagramPacket;
import java.util.ArrayList;

public class WA
extends WC {
    ArrayList b;
    byte[] X;
    int L;
    private static final long[] a;
    private static final Integer[] c;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public WA(long var1_1, ArrayList var3_2, int var4_3, int var5_4, int var6_5) {
        super();
        this.X = null;
        this.H = var6_5;
        this.l = var5_4;
        this.b = var3_2;
        this.L = var4_3;
        var8_6 = WA.a(2768, 7697344727123381129L) + 4 * var3_2.size();
        this.X = new byte[var8_6 + WA.a(10661, 8587183764665133306L) + WA.a(15896, 1958708777042018115L)];
        var7_7 = WC.U();
        this.T = D6.T;
        B8.P(this.W, this.X, 0);
        B8.P(this.T, this.X, 2);
        lh_1.u(var5_4, this.X, 4);
        lh_1.u(var6_5, this.X, WA.a(11899, 8979632000787214115L));
        lh_1.u(var4_3, this.X, WA.a(4822, 8761377893570499457L));
        B8.P((short)var3_2.size(), this.X, WA.a(25415, 214352039759487515L));
        var9_8 = 0;
        if (var7_7 != null) ** GOTO lbl28
        block0: while (true) {
            v0 /* !! */  = var3_2.get(var9_8);
            do {
                var10_9 = (Integer)v0 /* !! */ ;
                lh_1.u(var10_9, this.X, WA.a(9321, 3173362992766739775L) + 4 * var9_8 + WA.a(32120, 1094003818736106530L));
                ++var9_8;
lbl28:
                // 2 sources

                if (var9_8 < var3_2.size()) continue block0;
                v0 /* !! */  = this;
            } while (var7_7 == null);
            break;
        }
        v0 /* !! */ .g = new DatagramPacket(this.X, this.X.length);
        if (ky_2.F() != null) {
            WC.X(new ky_2[5]);
        }
    }

    public ArrayList Z() {
        return this.b;
    }

    /*
     * Unable to fully structure code
     */
    public WA(DatagramPacket var1_1) {
        v0 = WC.U();
        super();
        this.X = null;
        var2_2 = v0;
        this.g = var1_1;
        this.X = var1_1.getData();
        this.W = B8.M(this.X, 0);
        this.T = B8.M(this.X, 2);
        this.l = lh_1.z(this.X, 4);
        this.H = lh_1.z(this.X, WA.a(32120, 1094003818736106530L));
        this.L = lh_1.z(this.X, WA.a(17350, 441876042515579544L));
        var3_3 = B8.M(this.X, WA.a(28578, 1403793593207860983L));
        this.b = new ArrayList<E>();
        var4_4 = 0;
        var5_5 = 0;
        if (var2_2 != null) ** GOTO lbl24
        block0: while (true) {
            var4_4 = WA.a(11636, 3747009992210410537L) + 4 * var5_5;
            do {
                var6_6 = lh_1.z(this.X, var4_4 + WA.a(32120, 1094003818736106530L));
                this.b.add(var6_6);
                ++var5_5;
lbl24:
                // 2 sources

                if (var5_5 < var3_3) continue block0;
            } while (var2_2 == null);
            break;
        }
    }

    public int U() {
        return this.L;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8482846483527871467L;
                var6_1 = new long[11];
                var3_2 = 0;
                var4_3 = "\u0002\u00f2:\u0014\u00df\u0004C\to\u0081\u00e1f\u00a2<)\u007fB\u00f4\u00b0[\u0085S\u00c7\u00c8\u00ba\u00af\u001f\u00c4\u00a4g\t\u00e0\u00e2\u0098\u00e9\u00f9\u008c\u00de\u00d4\u00a1\u00e3\u00f8\u00ab2\u0080v\u0017\u00c1\u0093\u00f6X\u00e4\u00fb3\u00e0p\r\u00a9\u00d4\u009bB\u007fD\u00c07l\u0084K\u0087\u00e3xf";
                var5_4 = "\u0002\u00f2:\u0014\u00df\u0004C\to\u0081\u00e1f\u00a2<)\u007fB\u00f4\u00b0[\u0085S\u00c7\u00c8\u00ba\u00af\u001f\u00c4\u00a4g\t\u00e0\u00e2\u0098\u00e9\u00f9\u008c\u00de\u00d4\u00a1\u00e3\u00f8\u00ab2\u0080v\u0017\u00c1\u0093\u00f6X\u00e4\u00fb3\u00e0p\r\u00a9\u00d4\u009bB\u007fD\u00c07l\u0084K\u0087\u00e3xf".length();
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
                    var4_3 = "\u0000\u00ae\u00dd\u009b\u00e1\u00e2\u00ce\u00de\u00c5\u00d2\u001f\u00fb\u001b\u00c6\u0005\f";
                    var5_4 = "\u0000\u00ae\u00dd\u009b\u00e1\u00e2\u00ce\u00de\u00c5\u00d2\u001f\u00fb\u001b\u00c6\u0005\f".length();
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
        WA.a = var6_1;
        WA.c = new Integer[11];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x415F;
        if (c[n11] == null) {
            WA.c[n11] = (int)(a[n11] ^ l2);
        }
        return c[n11];
    }
}

