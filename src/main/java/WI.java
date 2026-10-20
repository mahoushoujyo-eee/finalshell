/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.InetAddress;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class WI
extends WC {
    short F;
    int o;
    int i;
    byte[] K;
    byte[] y;
    int Q;
    InetAddress J;
    int p;
    int P;
    static String s;
    static byte[] b;
    int B;
    long h;
    private static final long[] a;
    private static final Integer[] c;

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block23: {
                block22: {
                    var8 = new String[2];
                    var12_1 = 0;
                    var11_2 = "\u0004hNw0\"A.m\u001b~:/CnnL\u007f7)D?=\u001a\u0005\".\u001eb;";
                    var13_3 = "\u0004hNw0\"A.m\u001b~:/CnnL\u007f7)D?=\u001a\u0005\".\u001eb;".length();
                    var10_4 = 24;
                    var9_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var8[var12_1++] = new String(v0).intern();
                        if ((var9_5 += var10_4) < var13_3) {
                            var10_4 = var11_2.charAt(var9_5);
                            ** continue;
                        }
                        break block22;
                        break;
                    }
                    v1 = ++var9_5;
                    v2 = var11_2.substring(v1, v1 + var10_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 1;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v11 = 86;
                                    break;
                                }
                                case 1: {
                                    v11 = 91;
                                    break;
                                }
                                case 2: {
                                    v11 = 121;
                                    break;
                                }
                                case 3: {
                                    v11 = 78;
                                    break;
                                }
                                case 4: {
                                    v11 = 2;
                                    break;
                                }
                                case 5: {
                                    v11 = 27;
                                    break;
                                }
                                default: {
                                    v11 = 112;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var14_6;
                            v4 = v7;
                            if (v7 != 0) break;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        }
lbl67:
                        // 2 sources

                        v0 = v5;
                        v6 = v6;
                    } while (v6 > var14_6);
                    ** while (true)
                }
                var0_7 = 3138444534506236775L;
                var6_8 = new long[10];
                var3_9 = 0;
                var4_10 = "\u00f2kVy7\u00fc\u00e1\u0084\u00bc\u00f6\u0089\u0083D\u0017\u0082\u00e7\u009a\u00c8^\u00d6\u0003\u00af#\u0004;Y\u00d9\u00bd\u00b4\u0098\u00fd\u00fc\u00c0\u00cf\b\u008e\u0015|c\u00eaw\u000br3\u00b8\u00f3\u009a\u00bbw\u008e\u0090!N\u00b3\u0094k\u00b7s\u0093\u00f1Hp\u000b\u00d6";
                var5_11 = "\u00f2kVy7\u00fc\u00e1\u0084\u00bc\u00f6\u0089\u0083D\u0017\u0082\u00e7\u009a\u00c8^\u00d6\u0003\u00af#\u0004;Y\u00d9\u00bd\u00b4\u0098\u00fd\u00fc\u00c0\u00cf\b\u008e\u0015|c\u00eaw\u000br3\u00b8\u00f3\u009a\u00bbw\u008e\u0090!N\u00b3\u0094k\u00b7s\u0093\u00f1Hp\u000b\u00d6".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block23;
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00bb\u00d9T\u009b\u00c4vqF\u00f2RX\u00d7\u00b2z:\u001b";
                    var5_11 = "\u00bb\u00d9T\u009b\u00c4vqF\u00f2RX\u00d7\u00b2z:\u001b".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block23;
                        break;
                    }
                    break;
                }
lbl101:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block24;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl112:
                // 1 sources

                ** continue;
            }
        }
        WI.a = var6_8;
        WI.c = new Integer[10];
        WI.s = var8[0];
        try {
            WI.b = WI.s.getBytes(var8[1]);
        }
        catch (UnsupportedEncodingException var15_14) {
            var15_14.printStackTrace();
        }
    }

    public WI(int n10, byte[] byArray, int n11, short s2, int n12, int n13) {
        this.F = D6.nu;
        this.o = 0;
        this.i = 0;
        this.o = n10;
        this.P = n11;
        this.i = s2;
        this.K = new byte[this.i];
        this.H = n13;
        this.l = n12;
        System.arraycopy(byArray, n11, this.K, 0, s2);
        try {
            this.K = to_2.R(this.K, b);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.i = this.K.length;
    }

    public void F(int n10) {
        this.Q = n10;
        this.y = new byte[this.i + WI.a(7233, 3990813192303492892L) + WI.a(12838, 15515319057027444L)];
        B8.P(this.W, this.y, 0);
        B8.P(this.F, this.y, 2);
        lh_1.u(this.l, this.y, 4);
        lh_1.u(this.H, this.y, WI.a(12838, 15515319057027444L));
        lh_1.u(this.o, this.y, WI.a(993, 264113324159049917L));
        B8.P((short)this.i, this.y, WI.a(7233, 3990813192303492892L));
        lh_1.u(this.Q, this.y, WI.a(27050, 4874772128051645169L));
        System.arraycopy(this.K, 0, this.y, WI.a(27588, 2206203659723655323L), this.i);
        this.g = new DatagramPacket(this.y, this.y.length);
        this.g.setAddress(this.J);
        this.g.setPort(this.p);
    }

    /*
     * Loose catch block
     */
    public WI(DatagramPacket datagramPacket) {
        block8: {
            int n10;
            block7: {
                this.F = D6.nu;
                this.o = 0;
                this.i = 0;
                this.g = datagramPacket;
                this.y = datagramPacket.getData();
                this.W = B8.M(this.y, 0);
                this.F = B8.M(this.y, 2);
                this.l = lh_1.z(this.y, 4);
                this.H = lh_1.z(this.y, WI.a(31098, 7018684942682217001L));
                this.o = lh_1.z(this.y, WI.a(2774, 252412390330935692L));
                ky_2[] ky_2Array = WC.U();
                n10 = this.i = (int)B8.M(this.y, WI.a(4754, 4978641614805217740L));
                if (ky_2Array == null) break block7;
                try {
                    block9: {
                        if (n10 <= 0) break block8;
                        break block9;
                        catch (Exception exception) {
                            throw WI.a(exception);
                        }
                    }
                    n10 = datagramPacket.getLength();
                }
                catch (Exception exception) {
                    throw WI.a(exception);
                }
            }
            if (n10 > WI.a(30165, 6461985661042448013L)) {
                this.Q = lh_1.z(this.y, WI.a(11048, 4765825183584716913L));
                this.K = new byte[this.i];
                System.arraycopy(this.y, WI.a(27588, 2206203659723655323L), this.K, 0, this.i);
                try {
                    this.K = to_2.b(this.K, b);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    public int D() {
        return this.o;
    }

    public byte[] G() {
        return this.K;
    }

    public int k() {
        return this.i;
    }

    public int c() {
        return this.Q;
    }

    public void z(int n10) {
        this.Q = n10;
    }

    public InetAddress F() {
        return this.J;
    }

    @Override
    public void K(InetAddress inetAddress) {
        this.J = inetAddress;
    }

    public int F() {
        return this.p;
    }

    @Override
    public void S(int n10) {
        this.p = n10;
    }

    public int K() {
        return this.B;
    }

    public void C(int n10) {
        this.B = n10;
    }

    public long a() {
        return this.h;
    }

    public void s(long l2) {
        this.h = l2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x235B;
        if (c[n11] == null) {
            WI.c[n11] = (int)(a[n11] ^ l2);
        }
        return c[n11];
    }
}

