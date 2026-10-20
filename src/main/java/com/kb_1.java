/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.B;
import com.R;
import com.kl_0;
import com.ky_2;
import com.od_2;
import com.oe_1;

/*
 * Renamed from com.kB
 */
public class kb_1 {
    public float n;
    public float i;
    public float Z;
    public float e;
    public float C;
    public float B;
    public float a;
    public float Y;
    public float v;
    public float T;
    public float P;
    public float D;
    public float L;
    public float H;
    public float E;
    public float Q;
    private static final long[] b;
    private static final Integer[] c;

    public kb_1() {
        this.h();
    }

    public kb_1(kb_1 kb_12) {
        this.T(kb_12);
    }

    public kb_1(float[] fArray) {
        this.L(fArray);
    }

    public void T(kb_1 kb_12) {
        this.n = kb_12.n;
        this.i = kb_12.i;
        this.Z = kb_12.Z;
        this.e = kb_12.e;
        this.C = kb_12.C;
        this.B = kb_12.B;
        this.a = kb_12.a;
        this.Y = kb_12.Y;
        this.v = kb_12.v;
        this.T = kb_12.T;
        this.P = kb_12.P;
        this.D = kb_12.D;
        this.L = kb_12.L;
        this.H = kb_12.H;
        this.E = kb_12.E;
        this.Q = kb_12.Q;
    }

    public void L(float[] fArray) {
        this.n = fArray[0];
        this.i = fArray[1];
        this.Z = fArray[2];
        this.e = fArray[3];
        this.C = fArray[4];
        this.B = fArray[5];
        this.a = fArray[kb_1.a(16924, 4151299614982860977L)];
        this.Y = fArray[kb_1.a(8169, 3532208586903760204L)];
        this.v = fArray[kb_1.a(12517, 292077663659524674L)];
        this.T = fArray[kb_1.a(5036, 4718186387161063694L)];
        this.P = fArray[kb_1.a(1207, 86680155689137689L)];
        this.D = fArray[kb_1.a(32641, 2897227884615781666L)];
        this.L = fArray[kb_1.a(743, 8728177995766149197L)];
        this.H = fArray[kb_1.a(1605, 266041320694134010L)];
        this.E = fArray[kb_1.a(4948, 650310218650853885L)];
        this.Q = fArray[kb_1.a(8395, 9063869472285889120L)];
    }

    public void q(kb_1 kb_12) {
        kb_12.n = this.n;
        kb_12.i = this.i;
        kb_12.Z = this.Z;
        kb_12.e = this.e;
        kb_12.C = this.C;
        kb_12.B = this.B;
        kb_12.a = this.a;
        kb_12.Y = this.Y;
        kb_12.v = this.v;
        kb_12.T = this.T;
        kb_12.P = this.P;
        kb_12.D = this.D;
        kb_12.L = this.L;
        kb_12.H = this.H;
        kb_12.E = this.E;
        kb_12.Q = this.Q;
    }

    public void u(float[] fArray) {
        fArray[0] = this.n;
        fArray[1] = this.i;
        fArray[2] = this.Z;
        fArray[3] = this.e;
        fArray[4] = this.C;
        fArray[5] = this.B;
        fArray[kb_1.a((int)5586, (long)1964429935450597236L)] = this.a;
        fArray[kb_1.a((int)5040, (long)2872316149067882765L)] = this.Y;
        fArray[kb_1.a((int)13735, (long)3498001318591923971L)] = this.v;
        fArray[kb_1.a((int)23623, (long)926816394515541734L)] = this.T;
        fArray[kb_1.a((int)14730, (long)6624271552371559202L)] = this.P;
        fArray[kb_1.a((int)21790, (long)3540108726088460192L)] = this.D;
        fArray[kb_1.a((int)10397, (long)7785798044555837L)] = this.L;
        fArray[kb_1.a((int)26259, (long)4221029804295509039L)] = this.H;
        fArray[kb_1.a((int)14480, (long)98519134223436348L)] = this.E;
        fArray[kb_1.a((int)23721, (long)4696929993345854982L)] = this.Q;
    }

    public void h() {
        this.n = 1.0f;
        this.i = 0.0f;
        this.Z = 0.0f;
        this.e = 0.0f;
        this.C = 0.0f;
        this.B = 1.0f;
        this.a = 0.0f;
        this.Y = 0.0f;
        this.v = 0.0f;
        this.T = 0.0f;
        this.P = 1.0f;
        this.D = 0.0f;
        this.L = 0.0f;
        this.H = 0.0f;
        this.E = 0.0f;
        this.Q = 1.0f;
    }

    public void E(kb_1 kb_12) {
        float f10 = this.n;
        float f11 = this.i;
        float f12 = this.Z;
        float f13 = this.e;
        float f14 = this.C;
        float f15 = this.B;
        float f16 = this.a;
        float f17 = this.Y;
        float f18 = this.v;
        float f19 = this.T;
        float f20 = this.P;
        float f21 = this.D;
        float f22 = this.L;
        float f23 = this.H;
        float f24 = this.E;
        float f25 = this.Q;
        this.n = f10 * kb_12.n + f14 * kb_12.i + f18 * kb_12.Z + f22 * kb_12.e;
        this.i = f11 * kb_12.n + f15 * kb_12.i + f19 * kb_12.Z + f23 * kb_12.e;
        this.Z = f12 * kb_12.n + f16 * kb_12.i + f20 * kb_12.Z + f24 * kb_12.e;
        this.e = f13 * kb_12.n + f17 * kb_12.i + f21 * kb_12.Z + f25 * kb_12.e;
        this.C = f10 * kb_12.C + f14 * kb_12.B + f18 * kb_12.a + f22 * kb_12.Y;
        this.B = f11 * kb_12.C + f15 * kb_12.B + f19 * kb_12.a + f23 * kb_12.Y;
        this.a = f12 * kb_12.C + f16 * kb_12.B + f20 * kb_12.a + f24 * kb_12.Y;
        this.Y = f13 * kb_12.C + f17 * kb_12.B + f21 * kb_12.a + f25 * kb_12.Y;
        this.v = f10 * kb_12.v + f14 * kb_12.T + f18 * kb_12.P + f22 * kb_12.D;
        this.T = f11 * kb_12.v + f15 * kb_12.T + f19 * kb_12.P + f23 * kb_12.D;
        this.P = f12 * kb_12.v + f16 * kb_12.T + f20 * kb_12.P + f24 * kb_12.D;
        this.D = f13 * kb_12.v + f17 * kb_12.T + f21 * kb_12.P + f25 * kb_12.D;
        this.L = f10 * kb_12.L + f14 * kb_12.H + f18 * kb_12.E + f22 * kb_12.Q;
        int n10 = R.F();
        this.H = f11 * kb_12.L + f15 * kb_12.H + f19 * kb_12.E + f23 * kb_12.Q;
        this.E = f12 * kb_12.L + f16 * kb_12.H + f20 * kb_12.E + f24 * kb_12.Q;
        this.Q = f13 * kb_12.L + f17 * kb_12.H + f21 * kb_12.E + f25 * kb_12.Q;
        if (n10 == 0) {
            ky_2.K(new String[5]);
        }
    }

    public void N() {
        kb_1 kb_12 = new kb_1(this);
        this.e(kb_12);
    }

    public void e(kb_1 kb_12) {
        this.n = kb_12.n;
        this.i = kb_12.C;
        this.Z = kb_12.v;
        this.e = kb_12.e;
        this.C = kb_12.i;
        this.B = kb_12.B;
        this.a = kb_12.T;
        this.Y = kb_12.Y;
        this.v = kb_12.Z;
        this.T = kb_12.a;
        this.P = kb_12.P;
        this.D = kb_12.D;
        this.L *= -1.0f;
        this.H *= -1.0f;
        this.E *= -1.0f;
        this.Q = kb_12.Q;
    }

    public void U(kl_0 kl_02) {
        float f10 = kl_02.G * 0.5f;
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        this.M(new B(kl_02.C * f12, kl_02.w * f12, kl_02.J * f12, f11));
    }

    public void M(B b2) {
        float f10 = b2.T + b2.T;
        float f11 = b2.o + b2.o;
        float f12 = b2.I + b2.I;
        float f13 = b2.T * f10;
        float f14 = b2.T * f11;
        float f15 = b2.T * f12;
        float f16 = b2.o * f11;
        float f17 = b2.o * f12;
        float f18 = b2.I * f12;
        float f19 = b2.z * f10;
        float f20 = b2.z * f11;
        float f21 = b2.z * f12;
        this.n = 1.0f - (f16 + f18);
        this.i = f14 - f21;
        this.Z = f15 + f20;
        this.e = 0.0f;
        this.C = f14 + f21;
        this.B = 1.0f - (f13 + f18);
        this.a = f17 - f19;
        this.Y = 0.0f;
        this.v = f15 - f20;
        this.T = f17 + f19;
        this.P = 1.0f - (f13 + f16);
        this.D = 0.0f;
        this.L = 0.0f;
        int n10 = R.F();
        this.H = 0.0f;
        this.E = 0.0f;
        this.Q = 1.0f;
        if (ky_2.F() != null) {
            R.T(++n10);
        }
    }

    public void Y(oe_1 oe_12) {
        float f10 = oe_12.e * this.n + oe_12.I * this.C + oe_12.k * this.v + this.L;
        float f11 = oe_12.e * this.i + oe_12.I * this.B + oe_12.k * this.T + this.H;
        float f12 = oe_12.e * this.Z + oe_12.I * this.a + oe_12.k * this.P + this.E;
        oe_12.e = f10;
        oe_12.I = f11;
        oe_12.k = f12;
    }

    public void b(od_2 od_22) {
        float f10 = od_22.e * this.n + od_22.I * this.C + od_22.k * this.v;
        float f11 = od_22.e * this.i + od_22.I * this.B + od_22.k * this.T;
        float f12 = od_22.e * this.Z + od_22.I * this.a + od_22.k * this.P;
        od_22.e = f10;
        od_22.I = f11;
        od_22.k = f12;
    }

    public void d(od_2 od_22) {
        this.L = od_22.e;
        this.H = od_22.I;
        this.E = od_22.k;
    }

    public void c(float f10) {
        this.n = f10;
        this.B = f10;
        this.P = f10;
    }

    public void w(float f10) {
        float f11 = (float)Math.sin(f10);
        float f12 = (float)Math.cos(f10);
        this.n = 1.0f;
        this.i = 0.0f;
        this.Z = 0.0f;
        this.e = 0.0f;
        this.C = 0.0f;
        this.B = f12;
        this.a = f11;
        this.Y = 0.0f;
        this.v = 0.0f;
        this.T = -f11;
        this.P = f12;
        this.D = 0.0f;
        this.L = 0.0f;
        this.H = 0.0f;
        this.E = 0.0f;
        this.Q = 1.0f;
    }

    public void b(float f10) {
        float f11;
        float f12 = (float)Math.sin(f10);
        this.n = f11 = (float)Math.cos(f10);
        this.i = 0.0f;
        this.Z = -f12;
        this.e = 0.0f;
        this.C = 0.0f;
        this.B = 1.0f;
        this.a = 0.0f;
        this.Y = 0.0f;
        this.v = f12;
        this.T = 0.0f;
        this.P = f11;
        this.D = 0.0f;
        this.L = 0.0f;
        this.H = 0.0f;
        this.E = 0.0f;
        this.Q = 1.0f;
    }

    public void U(float f10) {
        float f11;
        float f12 = (float)Math.sin(f10);
        this.n = f11 = (float)Math.cos(f10);
        this.i = f12;
        this.Z = 0.0f;
        this.e = 0.0f;
        this.C = -f12;
        this.B = f11;
        this.a = 0.0f;
        this.Y = 0.0f;
        this.v = 0.0f;
        this.T = 0.0f;
        this.P = 1.0f;
        this.D = 0.0f;
        this.L = 0.0f;
        this.H = 0.0f;
        this.E = 0.0f;
        this.Q = 1.0f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 935663372430368056L;
                var6_1 = new long[20];
                var3_2 = 0;
                var4_3 = "\u0010@\u00f6PO\u00e3k+\u00da\u00d6\u00a9`\u00b3O\u00b313fV\u00b2Q\u00f9\u00d7\n\u00c9\u0082r\u00aadJ\u00ad\u008fs\u00b8hn\u0091\u000b\u00edy\u00d6\u00ca\u00b13\u0005\u0015\u00cfW}[V\u0085y\u00dbV\u0010m\u00c6v6\u00f7s\u00fc\u00cb\u00b2-W\u00c2w\u00a3zJ\u001a\u00b3\u0015\u00baRN\u00dfrl\u00a0\u00f5\u00c2\u00bd\u008bZ3\u0091U.\u00ed\u00f1\u00f5\u00f0sZ\u009c\u00f1;Y\u00df\u00fc?(\u00f8\u001f#\u0010\u00ef\u0010\u0011\u0000\u00c2G\u00f8a\u00b3G\t\f\t%\u00e2\u0090\u00153\u00d7\u0001\u00ac\u0091\u00c9s\u00cd:\u0093^1\u00d4\u00af\u00d0\u0082\u00e9\u00cf";
                var5_4 = "\u0010@\u00f6PO\u00e3k+\u00da\u00d6\u00a9`\u00b3O\u00b313fV\u00b2Q\u00f9\u00d7\n\u00c9\u0082r\u00aadJ\u00ad\u008fs\u00b8hn\u0091\u000b\u00edy\u00d6\u00ca\u00b13\u0005\u0015\u00cfW}[V\u0085y\u00dbV\u0010m\u00c6v6\u00f7s\u00fc\u00cb\u00b2-W\u00c2w\u00a3zJ\u001a\u00b3\u0015\u00baRN\u00dfrl\u00a0\u00f5\u00c2\u00bd\u008bZ3\u0091U.\u00ed\u00f1\u00f5\u00f0sZ\u009c\u00f1;Y\u00df\u00fc?(\u00f8\u001f#\u0010\u00ef\u0010\u0011\u0000\u00c2G\u00f8a\u00b3G\t\f\t%\u00e2\u0090\u00153\u00d7\u0001\u00ac\u0091\u00c9s\u00cd:\u0093^1\u00d4\u00af\u00d0\u0082\u00e9\u00cf".length();
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
                    var4_3 = "\u0011\u00f0\u00ef\u00af\bP\u0089\u001a\u00d6\u00a3L\u00f8\u00fc\u00c1|2";
                    var5_4 = "\u0011\u00f0\u00ef\u00af\bP\u0089\u001a\u00d6\u00a3L\u00f8\u00fc\u00c1|2".length();
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
        kb_1.b = var6_1;
        kb_1.c = new Integer[20];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x32AE;
        if (c[n11] == null) {
            kb_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

