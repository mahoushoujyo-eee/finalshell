/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.net.DatagramPacket;
import java.util.ArrayList;

public class W0
extends WC {
    ArrayList J;
    byte[] h = null;
    int U;
    private static final long[] a;
    private static final Integer[] b;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public W0(long var1_1, ArrayList var3_2, int var4_3, int var5_4, int var6_5, int var7_6) {
        super();
        this.H = var7_6;
        this.l = var6_5;
        this.J = var3_2;
        this.U = var4_3;
        var9_7 = W0.a(27658, 2011528710946502434L) + 4 * var3_2.size();
        this.h = new byte[var9_7 + W0.a(23905, 1809452460359550541L) + W0.a(31657, 89840081446805634L)];
        this.T = D6.f;
        v0 = WC.U();
        B8.P(this.W, this.h, 0);
        var8_8 = v0;
        B8.P(this.T, this.h, 2);
        lh_1.u(var6_5, this.h, 4);
        lh_1.u(var7_6, this.h, W0.a(22548, 3739700784321528638L));
        lh_1.u(var4_3, this.h, W0.a(23171, 5149634884484825506L));
        B8.P((short)var3_2.size(), this.h, W0.a(4038, 8243946877283030248L));
        var10_9 = 0;
        if (var8_8 != null) ** GOTO lbl30
        ky_2.K(new String[2]);
        block0: while (true) {
            v1 /* !! */  = var3_2.get(var10_9);
            do {
                var11_10 = (Integer)v1 /* !! */ ;
                lh_1.u(var11_10, this.h, W0.a(21077, 5882690708802111864L) + 4 * var10_9 + W0.a(10102, 3376907576585354329L));
                ++var10_9;
lbl30:
                // 2 sources

                if (var10_9 < var3_2.size()) continue block0;
                v1 /* !! */  = this;
            } while (var8_8 == null);
            break;
        }
        v1 /* !! */ .g = new DatagramPacket(this.h, this.h.length);
    }

    public ArrayList D() {
        return this.J;
    }

    /*
     * Unable to fully structure code
     */
    public W0(DatagramPacket var1_1) {
        super();
        this.g = var1_1;
        this.h = var1_1.getData();
        this.W = B8.M(this.h, 0);
        this.T = B8.M(this.h, 2);
        this.l = lh_1.z(this.h, 4);
        this.H = lh_1.z(this.h, W0.a(10102, 3376907576585354329L));
        this.U = lh_1.z(this.h, W0.a(20846, 1410843843238234695L));
        var2_2 = WC.U();
        var3_3 = B8.M(this.h, W0.a(1132, 3807493028383219535L));
        this.J = new ArrayList<E>();
        var4_4 = 0;
        var5_5 = 0;
        if (var2_2 != null) ** GOTO lbl23
        block0: while (true) {
            var4_4 = W0.a(15976, 1467993332509009224L) + 4 * var5_5;
            do {
                var6_6 = lh_1.z(this.h, var4_4 + W0.a(10102, 3376907576585354329L));
                this.J.add(var6_6);
                ++var5_5;
lbl23:
                // 2 sources

                if (var5_5 < var3_3) continue block0;
            } while (var2_2 == null);
            break;
        }
    }

    public int H() {
        return this.U;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 2552429032503518028L;
                var6_1 = new long[11];
                var3_2 = 0;
                var4_3 = "\u00bc\u0083}\u000f\u0099\u0007)\u0007t[\u0014\u0093\u00fb\u00b3\u0014|uy)\u0086y\u00fe\u0083\u00c7;\u009f\u00e5&+x zO\u0080\f\u00a8\u00a1`*>\u000bG\u000eg\u0085t%\u0019v\u008b\u000e\b\u0019u\u00df\u001d\u0001V\u0099\u0080+aw\u00b4.\u00ce\u00ed\u00868i\u00a2\u00e2";
                var5_4 = "\u00bc\u0083}\u000f\u0099\u0007)\u0007t[\u0014\u0093\u00fb\u00b3\u0014|uy)\u0086y\u00fe\u0083\u00c7;\u009f\u00e5&+x zO\u0080\f\u00a8\u00a1`*>\u000bG\u000eg\u0085t%\u0019v\u008b\u000e\b\u0019u\u00df\u001d\u0001V\u0099\u0080+aw\u00b4.\u00ce\u00ed\u00868i\u00a2\u00e2".length();
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
                    var4_3 = "\u001a\u00a7\u008e~\u00f8\u0013F\u000e\u00eaf>\u00b9\u0005J\u00fc\u0013";
                    var5_4 = "\u001a\u00a7\u008e~\u00f8\u0013F\u000e\u00eaf>\u00b9\u0005J\u00fc\u0013".length();
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
        W0.a = var6_1;
        W0.b = new Integer[11];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5B29;
        if (b[n11] == null) {
            W0.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

