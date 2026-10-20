/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.W5;
import com.hn_1;
import com.ky_2;
import com.uZ;
import com.zb_0;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.Random;

/*
 * Renamed from com.hW
 */
public class hw_1
extends hn_1 {
    private float C;
    private float u;
    private float V;
    private float K;
    private float v;
    private float b;
    private float Y;
    private float c;
    private float h;
    private int x;
    private float B;
    private float f;
    protected Random P;
    private float l;
    private float R;
    private float S;
    private float i;
    private float o;
    private float M;
    private float U;
    private float k;
    private int j;
    private float F;
    private float X;
    private float E;
    private float z;
    private float W;
    private float r;
    private float d;
    private float p;
    private float G;
    private float[] w;
    private float[] Q;
    private BufferedImage T;
    private float y;
    private float a;
    float I;
    float J;
    private static final String[] e;
    private static final String[] g;
    private static final long[] m;
    private static final Integer[] n;

    public hw_1() {
        block3: {
            block2: {
                this.C = 0.1f;
                this.u = 1.0f;
                this.V = 0.0f;
                this.K = 1.0f;
                this.v = 1.0f;
                this.b = 8.0f;
                this.Y = 2.0f;
                this.c = 1.0f;
                this.h = 0.6f;
                this.P = new Random();
                this.l = 0.5f;
                String[] stringArray = W5.q();
                this.R = 0.5f;
                this.S = 0.3f;
                this.i = 0.5f;
                this.o = 0.5f;
                this.M = 0.96f;
                this.U = 0.0f;
                this.k = 10.0f;
                this.j = -1;
                this.z = 0.5f;
                this.W = 0.5f;
                this.r = 0.0f;
                this.d = 0.0f;
                this.p = 0.0f;
                this.G = 1.0f;
                hw_1 hw_12 = this;
                if (stringArray == null) break block2;
                if (hw_12.T != null) break block3;
                hw_12 = this;
            }
            hw_12.T = zb_0.d(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource(hw_1.a(30435, 4608))).getSource());
        }
    }

    public void k(float f10) {
        this.K = f10;
    }

    public float E() {
        return this.K;
    }

    public void U(int n10) {
        this.x = n10;
    }

    public int x() {
        return this.x;
    }

    public void x(float f10) {
        this.C = f10;
    }

    public float p() {
        return this.C;
    }

    public void H(float f10) {
        this.u = f10;
    }

    public float q() {
        return this.u;
    }

    public void l(float f10) {
        this.U = f10;
    }

    public float Q() {
        return this.U;
    }

    public void R(float f10) {
        this.G = f10;
    }

    public float G() {
        return this.G;
    }

    public void e(float f10) {
        this.l = f10;
    }

    public float g() {
        return this.l;
    }

    public void r(float f10) {
        this.R = f10;
    }

    public float k() {
        return this.R;
    }

    public void P(float f10) {
        this.S = f10;
    }

    public float S() {
        return this.S;
    }

    public void K(float f10) {
        this.i = f10;
    }

    public float o() {
        return this.i;
    }

    public void S(float f10) {
        this.o = f10;
    }

    public float Z() {
        return this.o;
    }

    public void O(float f10) {
        this.V = f10;
    }

    public float X() {
        return this.V;
    }

    public void Q(float f10) {
        this.b = f10;
    }

    public float t() {
        return this.b;
    }

    public void y(float f10) {
        this.v = f10;
    }

    public float F() {
        return this.v;
    }

    public void U(float f10) {
        this.Y = f10;
    }

    public float m() {
        return this.Y;
    }

    public void i(float f10) {
        this.c = f10;
    }

    public float u() {
        return this.c;
    }

    public void d(float f10) {
        this.h = f10;
    }

    public float b() {
        return this.h;
    }

    public void Z(float f10) {
        this.M = f10;
    }

    public float l() {
        return this.M;
    }

    public void n(float f10) {
        this.W = f10;
    }

    public float c() {
        return this.W;
    }

    public void D(float f10) {
        this.z = f10;
    }

    public float J() {
        return this.z;
    }

    public void K(int n10) {
        this.j = n10;
    }

    public int W() {
        return this.j;
    }

    public void J(float f10) {
        this.p = f10;
    }

    public float i() {
        return this.p;
    }

    public void o(float f10) {
        this.d = f10;
    }

    public float a() {
        return this.d;
    }

    public void m(float f10) {
        this.r = f10;
    }

    public float r() {
        return this.r;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        BufferedImage bufferedImage3;
        int n10;
        long l2;
        block11: {
            block10: {
                int n11;
                String[] stringArray;
                block9: {
                    l2 = System.currentTimeMillis();
                    this.F = (float)(this.j >> hw_1.a(441, 1969262590378910249L) & hw_1.a(19191, 7104045652179741039L)) * 0.003921569f;
                    this.X = (float)(this.j >> hw_1.a(24501, 4506612208273161250L) & hw_1.a(7626, 6180954340632280668L)) * 0.003921569f;
                    stringArray = W5.q();
                    this.E = (float)(this.j & hw_1.a(7626, 6180954340632280668L)) * 0.003921569f;
                    this.I = 10000.0f;
                    this.J = -10000.0f;
                    this.w = new float[(int)this.b + 1];
                    float f10 = 1.0f;
                    for (n11 = 0; n11 <= (int)this.b; ++n11) {
                        this.w[n11] = (float)Math.pow(2.0, -n11);
                        f10 *= this.Y;
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block9;
                    }
                    this.B = -1.0f;
                    this.f = 1.0f;
                    this.y = bufferedImage.getWidth();
                    this.a = bufferedImage.getHeight();
                    n11 = bufferedImage.getHeight();
                    this.Q = new float[n11];
                }
                for (n10 = 0; n10 < n11; ++n10) {
                    this.Q[n10] = (float)Math.tan((double)(this.G * (float)n10 / (float)n11) * Math.PI * 0.5);
                    if (stringArray != null) {
                        if (stringArray != null) continue;
                    }
                    break block10;
                }
                bufferedImage3 = bufferedImage2;
                if (stringArray == null) break block11;
                if (bufferedImage3 == null) {
                    bufferedImage2 = this.createCompatibleDestImage(bufferedImage, null);
                }
                n10 = (int)(63.0f * this.S);
            }
            bufferedImage3 = bufferedImage2;
        }
        Graphics2D graphics2D = bufferedImage3.createGraphics();
        graphics2D.drawImage(this.T, 0, 0, bufferedImage2.getWidth(), bufferedImage2.getHeight(), n10, 0, n10 + 1, hw_1.a(1713, 1373492479831942432L), null);
        graphics2D.dispose();
        BufferedImage bufferedImage4 = super.filter(bufferedImage2, bufferedImage2);
        long l3 = System.currentTimeMillis();
        System.out.println(this.I + " " + this.J + " " + (float)(l3 - l2) * 0.001f);
        this.w = null;
        this.Q = null;
        return bufferedImage2;
    }

    public float k(float f10, float f11) {
        float f12;
        float f13;
        int n10;
        String[] stringArray;
        float f14;
        block4: {
            f14 = 0.0f;
            f10 += 371.0f;
            stringArray = W5.q();
            f11 += 529.0f;
            for (n10 = 0; n10 < (int)this.b; ++n10) {
                f14 += uZ.G(f10, f11, this.U) * this.w[n10];
                f10 *= this.Y;
                f13 = f11 * this.Y;
                if (stringArray != null) {
                    f11 = f13;
                    if (stringArray != null) continue;
                }
                break block4;
            }
            f13 = this.b - (float)((int)this.b);
        }
        float f15 = f12 = f13;
        if (stringArray != null) {
            if (f15 != 0.0f) {
                f14 += f12 * uZ.G(f10, f11, this.U) * this.w[n10];
            }
            f15 = f14;
        }
        return f15;
    }

    @Override
    public int C(int n10, int n11, int n12) {
        float f10;
        float f11;
        float f12 = (float)n10 / this.y;
        float f13 = (float)n11 / this.a;
        float f14 = (float)Math.pow(this.M, 100.0f * f13 * f13);
        float f15 = (float)(n12 >> hw_1.a(27537, 9161988940983322626L) & hw_1.a(7626, 6180954340632280668L)) * 0.003921569f;
        float f16 = (float)(n12 >> hw_1.a(27458, 4500278557435775191L) & hw_1.a(7626, 6180954340632280668L)) * 0.003921569f;
        float f17 = (float)(n12 & hw_1.a(7626, 6180954340632280668L)) * 0.003921569f;
        float f18 = this.y * 0.5f;
        float f19 = (float)n10 - f18;
        float f20 = n11;
        f20 = this.Q[n11];
        f19 = (f12 - 0.5f) * (1.0f + f20);
        f20 += this.U * this.r;
        String[] stringArray = W5.q();
        float f21 = f11 = this.k(f19 /= this.C, f20 /= this.C * this.u);
        f11 = (f11 + 1.23f) / 2.46f;
        int n13 = n12 & hw_1.a(16129, 5220240986096016531L);
        float f22 = f10 = f11 - this.l;
        float f23 = 0.0f;
        if (stringArray != null) {
            if (f22 < f23) {
                f10 = 0.0f;
            }
            f22 = 1.0f;
            f23 = (float)Math.pow(this.R, f10);
        }
        float f24 = f22 - f23;
        this.I = Math.min(this.I, f24);
        this.J = Math.max(this.J, f24);
        float f25 = this.y * this.z;
        float f26 = this.a * this.W;
        float f27 = (float)n10 - f25;
        float f28 = (float)n11 - f26;
        float f29 = f27 * f27 + f28 * f28;
        f29 = (float)Math.pow(f29, this.o);
        float f30 = 10.0f * (float)Math.exp(-f29 * this.i * 0.1f);
        f15 += f30 * this.F;
        f16 += f30 * this.X;
        f17 += f30 * this.E;
        float f31 = (1.0f - f24 * f24 * f24 * f24) * this.K;
        float f32 = this.F * f31;
        float f33 = this.X * f31;
        float f34 = this.E * f31;
        float f35 = 1.0f - (f24 *= f14);
        f15 = f35 * f15 + f24 * f32;
        f16 = f35 * f16 + f24 * f33;
        f17 = f35 * f17 + f24 * f34;
        float f36 = this.c;
        f15 = 1.0f - (float)Math.exp(-f15 * f36);
        f16 = 1.0f - (float)Math.exp(-f16 * f36);
        f17 = 1.0f - (float)Math.exp(-f17 * f36);
        int n14 = (int)(255.0f * f15) << hw_1.a(27537, 9161988940983322626L);
        int n15 = (int)(255.0f * f16) << hw_1.a(27458, 4500278557435775191L);
        int n16 = (int)(255.0f * f17);
        int n17 = hw_1.a(9837, 6872046394534364665L) | n14 | n15 | n16;
        if (stringArray == null) {
            ky_2.K(new String[1]);
        }
        return n17;
    }

    public String toString() {
        return hw_1.a(30434, 14254);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "\u00df\u00d4{t\u00b7>\u00d2\u0007\u00da2\u009d\"]\u000e\u00baE1\u00be\u00c5\u00a8\u00cfU\u0012\u00cb\u00a9\u00b0\u00ba\u001a";
                    var12_3 = "\u00df\u00d4{t\u00b7>\u00d2\u0007\u00da2\u009d\"]\u000e\u00baE1\u00be\u00c5\u00a8\u00cfU\u0012\u00cb\u00a9\u00b0\u00ba\u001a".length();
                    var9_4 = 13;
                    var8_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var13[var11_1++] = new String(v0).intern();
                        if ((var8_5 += var9_4) < var12_3) {
                            var9_4 = var10_2.charAt(var8_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 69;
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
                                    v11 = 120;
                                    break;
                                }
                                case 1: {
                                    v11 = 57;
                                    break;
                                }
                                case 2: {
                                    v11 = 34;
                                    break;
                                }
                                case 3: {
                                    v11 = 97;
                                    break;
                                }
                                case 4: {
                                    v11 = 72;
                                    break;
                                }
                                case 5: {
                                    v11 = 54;
                                    break;
                                }
                                default: {
                                    v11 = 45;
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
                hw_1.e = var13;
                hw_1.g = new String[2];
                var0_7 = 5667884269538468402L;
                var6_8 = new long[9];
                var3_9 = 0;
                var4_10 = "\"\u00f4\u0086?\u00d0\u00dd@\u000b\u00b7\u00fb2\u00d9\u0083\u00d0\u00c7R\u0001\u00d2\u00ea\u0088\u008c\u00ed~\u00a1~F\u0010l\u00e6\u0083* \u008f\u00e4\u0092\u000e\u001c\u00e4\u00e7\u00cbc\u00d4\u00d8\u00f5\u0087\u0099*\u00ed\u001e\u00b6\u00feX'\u0096\u00dc\u0091";
                var5_11 = "\"\u00f4\u0086?\u00d0\u00dd@\u000b\u00b7\u00fb2\u00d9\u0083\u00d0\u00c7R\u0001\u00d2\u00ea\u0088\u008c\u00ed~\u00a1~F\u0010l\u00e6\u0083* \u008f\u00e4\u0092\u000e\u001c\u00e4\u00e7\u00cbc\u00d4\u00d8\u00f5\u0087\u0099*\u00ed\u001e\u00b6\u00feX'\u0096\u00dc\u0091".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00bb\u00fa\u0003\u00c8\u0087R\u001e\u0018\u0010\u00dc\u00abD\u001f\u0089\u008b\u00a2";
                    var5_11 = "\u00bb\u00fa\u0003\u00c8\u0087R\u001e\u0018\u0010\u00dc\u00abD\u001f\u0089\u008b\u00a2".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
                        v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v15 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl103:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
            switch (v15) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl114:
                // 1 sources

                ** continue;
            }
        }
        hw_1.m = var6_8;
        hw_1.n = new Integer[9];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x76E3) & 0xFFFF;
        if (g[n12] == null) {
            int n13;
            int n14;
            char[] cArray = e[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 249;
                    break;
                }
                case 1: {
                    n14 = 93;
                    break;
                }
                case 2: {
                    n14 = 194;
                    break;
                }
                case 3: {
                    n14 = 190;
                    break;
                }
                case 4: {
                    n14 = 185;
                    break;
                }
                case 5: {
                    n14 = 156;
                    break;
                }
                case 6: {
                    n14 = 210;
                    break;
                }
                case 7: {
                    n14 = 17;
                    break;
                }
                case 8: {
                    n14 = 1;
                    break;
                }
                case 9: {
                    n14 = 145;
                    break;
                }
                case 10: {
                    n14 = 89;
                    break;
                }
                case 11: {
                    n14 = 118;
                    break;
                }
                case 12: {
                    n14 = 30;
                    break;
                }
                case 13: {
                    n14 = 98;
                    break;
                }
                case 14: {
                    n14 = 121;
                    break;
                }
                case 15: {
                    n14 = 180;
                    break;
                }
                case 16: {
                    n14 = 63;
                    break;
                }
                case 17: {
                    n14 = 81;
                    break;
                }
                case 18: {
                    n14 = 85;
                    break;
                }
                case 19: {
                    n14 = 200;
                    break;
                }
                case 20: {
                    n14 = 94;
                    break;
                }
                case 21: {
                    n14 = 203;
                    break;
                }
                case 22: {
                    n14 = 174;
                    break;
                }
                case 23: {
                    n14 = 218;
                    break;
                }
                case 24: {
                    n14 = 187;
                    break;
                }
                case 25: {
                    n14 = 248;
                    break;
                }
                case 26: {
                    n14 = 232;
                    break;
                }
                case 27: {
                    n14 = 82;
                    break;
                }
                case 28: {
                    n14 = 141;
                    break;
                }
                case 29: {
                    n14 = 5;
                    break;
                }
                case 30: {
                    n14 = 182;
                    break;
                }
                case 31: {
                    n14 = 253;
                    break;
                }
                case 32: {
                    n14 = 10;
                    break;
                }
                case 33: {
                    n14 = 117;
                    break;
                }
                case 34: {
                    n14 = 176;
                    break;
                }
                case 35: {
                    n14 = 107;
                    break;
                }
                case 36: {
                    n14 = 255;
                    break;
                }
                case 37: {
                    n14 = 27;
                    break;
                }
                case 38: {
                    n14 = 44;
                    break;
                }
                case 39: {
                    n14 = 50;
                    break;
                }
                case 40: {
                    n14 = 206;
                    break;
                }
                case 41: {
                    n14 = 110;
                    break;
                }
                case 42: {
                    n14 = 138;
                    break;
                }
                case 43: {
                    n14 = 84;
                    break;
                }
                case 44: {
                    n14 = 123;
                    break;
                }
                case 45: {
                    n14 = 193;
                    break;
                }
                case 46: {
                    n14 = 155;
                    break;
                }
                case 47: {
                    n14 = 34;
                    break;
                }
                case 48: {
                    n14 = 211;
                    break;
                }
                case 49: {
                    n14 = 238;
                    break;
                }
                case 50: {
                    n14 = 42;
                    break;
                }
                case 51: {
                    n14 = 104;
                    break;
                }
                case 52: {
                    n14 = 242;
                    break;
                }
                case 53: {
                    n14 = 8;
                    break;
                }
                case 54: {
                    n14 = 96;
                    break;
                }
                case 55: {
                    n14 = 24;
                    break;
                }
                case 56: {
                    n14 = 209;
                    break;
                }
                case 57: {
                    n14 = 112;
                    break;
                }
                case 58: {
                    n14 = 204;
                    break;
                }
                case 59: {
                    n14 = 62;
                    break;
                }
                case 60: {
                    n14 = 6;
                    break;
                }
                case 61: {
                    n14 = 197;
                    break;
                }
                case 62: {
                    n14 = 151;
                    break;
                }
                case 63: {
                    n14 = 163;
                    break;
                }
                case 64: {
                    n14 = 158;
                    break;
                }
                case 65: {
                    n14 = 201;
                    break;
                }
                case 66: {
                    n14 = 101;
                    break;
                }
                case 67: {
                    n14 = 95;
                    break;
                }
                case 68: {
                    n14 = 159;
                    break;
                }
                case 69: {
                    n14 = 64;
                    break;
                }
                case 70: {
                    n14 = 68;
                    break;
                }
                case 71: {
                    n14 = 114;
                    break;
                }
                case 72: {
                    n14 = 111;
                    break;
                }
                case 73: {
                    n14 = 227;
                    break;
                }
                case 74: {
                    n14 = 229;
                    break;
                }
                case 75: {
                    n14 = 199;
                    break;
                }
                case 76: {
                    n14 = 55;
                    break;
                }
                case 77: {
                    n14 = 240;
                    break;
                }
                case 78: {
                    n14 = 91;
                    break;
                }
                case 79: {
                    n14 = 83;
                    break;
                }
                case 80: {
                    n14 = 61;
                    break;
                }
                case 81: {
                    n14 = 70;
                    break;
                }
                case 82: {
                    n14 = 184;
                    break;
                }
                case 83: {
                    n14 = 22;
                    break;
                }
                case 84: {
                    n14 = 212;
                    break;
                }
                case 85: {
                    n14 = 18;
                    break;
                }
                case 86: {
                    n14 = 125;
                    break;
                }
                case 87: {
                    n14 = 130;
                    break;
                }
                case 88: {
                    n14 = 21;
                    break;
                }
                case 89: {
                    n14 = 246;
                    break;
                }
                case 90: {
                    n14 = 191;
                    break;
                }
                case 91: {
                    n14 = 129;
                    break;
                }
                case 92: {
                    n14 = 65;
                    break;
                }
                case 93: {
                    n14 = 215;
                    break;
                }
                case 94: {
                    n14 = 164;
                    break;
                }
                case 95: {
                    n14 = 250;
                    break;
                }
                case 96: {
                    n14 = 244;
                    break;
                }
                case 97: {
                    n14 = 31;
                    break;
                }
                case 98: {
                    n14 = 195;
                    break;
                }
                case 99: {
                    n14 = 40;
                    break;
                }
                case 100: {
                    n14 = 77;
                    break;
                }
                case 101: {
                    n14 = 228;
                    break;
                }
                case 102: {
                    n14 = 144;
                    break;
                }
                case 103: {
                    n14 = 72;
                    break;
                }
                case 104: {
                    n14 = 181;
                    break;
                }
                case 105: {
                    n14 = 47;
                    break;
                }
                case 106: {
                    n14 = 78;
                    break;
                }
                case 107: {
                    n14 = 29;
                    break;
                }
                case 108: {
                    n14 = 252;
                    break;
                }
                case 109: {
                    n14 = 157;
                    break;
                }
                case 110: {
                    n14 = 124;
                    break;
                }
                case 111: {
                    n14 = 103;
                    break;
                }
                case 112: {
                    n14 = 2;
                    break;
                }
                case 113: {
                    n14 = 119;
                    break;
                }
                case 114: {
                    n14 = 154;
                    break;
                }
                case 115: {
                    n14 = 90;
                    break;
                }
                case 116: {
                    n14 = 241;
                    break;
                }
                case 117: {
                    n14 = 57;
                    break;
                }
                case 118: {
                    n14 = 73;
                    break;
                }
                case 119: {
                    n14 = 69;
                    break;
                }
                case 120: {
                    n14 = 175;
                    break;
                }
                case 121: {
                    n14 = 15;
                    break;
                }
                case 122: {
                    n14 = 196;
                    break;
                }
                case 123: {
                    n14 = 188;
                    break;
                }
                case 124: {
                    n14 = 139;
                    break;
                }
                case 125: {
                    n14 = 205;
                    break;
                }
                case 126: {
                    n14 = 102;
                    break;
                }
                case 127: {
                    n14 = 4;
                    break;
                }
                case 128: {
                    n14 = 222;
                    break;
                }
                case 129: {
                    n14 = 146;
                    break;
                }
                case 130: {
                    n14 = 66;
                    break;
                }
                case 131: {
                    n14 = 136;
                    break;
                }
                case 132: {
                    n14 = 54;
                    break;
                }
                case 133: {
                    n14 = 153;
                    break;
                }
                case 134: {
                    n14 = 237;
                    break;
                }
                case 135: {
                    n14 = 219;
                    break;
                }
                case 136: {
                    n14 = 189;
                    break;
                }
                case 137: {
                    n14 = 106;
                    break;
                }
                case 138: {
                    n14 = 234;
                    break;
                }
                case 139: {
                    n14 = 76;
                    break;
                }
                case 140: {
                    n14 = 131;
                    break;
                }
                case 141: {
                    n14 = 172;
                    break;
                }
                case 142: {
                    n14 = 52;
                    break;
                }
                case 143: {
                    n14 = 46;
                    break;
                }
                case 144: {
                    n14 = 192;
                    break;
                }
                case 145: {
                    n14 = 178;
                    break;
                }
                case 146: {
                    n14 = 224;
                    break;
                }
                case 147: {
                    n14 = 59;
                    break;
                }
                case 148: {
                    n14 = 230;
                    break;
                }
                case 149: {
                    n14 = 152;
                    break;
                }
                case 150: {
                    n14 = 109;
                    break;
                }
                case 151: {
                    n14 = 39;
                    break;
                }
                case 152: {
                    n14 = 171;
                    break;
                }
                case 153: {
                    n14 = 127;
                    break;
                }
                case 154: {
                    n14 = 9;
                    break;
                }
                case 155: {
                    n14 = 116;
                    break;
                }
                case 156: {
                    n14 = 220;
                    break;
                }
                case 157: {
                    n14 = 16;
                    break;
                }
                case 158: {
                    n14 = 183;
                    break;
                }
                case 159: {
                    n14 = 67;
                    break;
                }
                case 160: {
                    n14 = 115;
                    break;
                }
                case 161: {
                    n14 = 165;
                    break;
                }
                case 162: {
                    n14 = 13;
                    break;
                }
                case 163: {
                    n14 = 33;
                    break;
                }
                case 164: {
                    n14 = 143;
                    break;
                }
                case 165: {
                    n14 = 208;
                    break;
                }
                case 166: {
                    n14 = 128;
                    break;
                }
                case 167: {
                    n14 = 25;
                    break;
                }
                case 168: {
                    n14 = 168;
                    break;
                }
                case 169: {
                    n14 = 137;
                    break;
                }
                case 170: {
                    n14 = 56;
                    break;
                }
                case 171: {
                    n14 = 32;
                    break;
                }
                case 172: {
                    n14 = 169;
                    break;
                }
                case 173: {
                    n14 = 254;
                    break;
                }
                case 174: {
                    n14 = 86;
                    break;
                }
                case 175: {
                    n14 = 150;
                    break;
                }
                case 176: {
                    n14 = 133;
                    break;
                }
                case 177: {
                    n14 = 148;
                    break;
                }
                case 178: {
                    n14 = 134;
                    break;
                }
                case 179: {
                    n14 = 108;
                    break;
                }
                case 180: {
                    n14 = 97;
                    break;
                }
                case 181: {
                    n14 = 80;
                    break;
                }
                case 182: {
                    n14 = 3;
                    break;
                }
                case 183: {
                    n14 = 161;
                    break;
                }
                case 184: {
                    n14 = 186;
                    break;
                }
                case 185: {
                    n14 = 92;
                    break;
                }
                case 186: {
                    n14 = 11;
                    break;
                }
                case 187: {
                    n14 = 231;
                    break;
                }
                case 188: {
                    n14 = 147;
                    break;
                }
                case 189: {
                    n14 = 236;
                    break;
                }
                case 190: {
                    n14 = 226;
                    break;
                }
                case 191: {
                    n14 = 245;
                    break;
                }
                case 192: {
                    n14 = 48;
                    break;
                }
                case 193: {
                    n14 = 53;
                    break;
                }
                case 194: {
                    n14 = 88;
                    break;
                }
                case 195: {
                    n14 = 214;
                    break;
                }
                case 196: {
                    n14 = 37;
                    break;
                }
                case 197: {
                    n14 = 223;
                    break;
                }
                case 198: {
                    n14 = 14;
                    break;
                }
                case 199: {
                    n14 = 162;
                    break;
                }
                case 200: {
                    n14 = 36;
                    break;
                }
                case 201: {
                    n14 = 99;
                    break;
                }
                case 202: {
                    n14 = 23;
                    break;
                }
                case 203: {
                    n14 = 170;
                    break;
                }
                case 204: {
                    n14 = 126;
                    break;
                }
                case 205: {
                    n14 = 217;
                    break;
                }
                case 206: {
                    n14 = 198;
                    break;
                }
                case 207: {
                    n14 = 142;
                    break;
                }
                case 208: {
                    n14 = 28;
                    break;
                }
                case 209: {
                    n14 = 100;
                    break;
                }
                case 210: {
                    n14 = 179;
                    break;
                }
                case 211: {
                    n14 = 221;
                    break;
                }
                case 212: {
                    n14 = 87;
                    break;
                }
                case 213: {
                    n14 = 38;
                    break;
                }
                case 214: {
                    n14 = 19;
                    break;
                }
                case 215: {
                    n14 = 35;
                    break;
                }
                case 216: {
                    n14 = 120;
                    break;
                }
                case 217: {
                    n14 = 75;
                    break;
                }
                case 218: {
                    n14 = 41;
                    break;
                }
                case 219: {
                    n14 = 12;
                    break;
                }
                case 220: {
                    n14 = 149;
                    break;
                }
                case 221: {
                    n14 = 243;
                    break;
                }
                case 222: {
                    n14 = 140;
                    break;
                }
                case 223: {
                    n14 = 247;
                    break;
                }
                case 224: {
                    n14 = 239;
                    break;
                }
                case 225: {
                    n14 = 213;
                    break;
                }
                case 226: {
                    n14 = 79;
                    break;
                }
                case 227: {
                    n14 = 7;
                    break;
                }
                case 228: {
                    n14 = 58;
                    break;
                }
                case 229: {
                    n14 = 122;
                    break;
                }
                case 230: {
                    n14 = 167;
                    break;
                }
                case 231: {
                    n14 = 135;
                    break;
                }
                case 232: {
                    n14 = 49;
                    break;
                }
                case 233: {
                    n14 = 160;
                    break;
                }
                case 234: {
                    n14 = 166;
                    break;
                }
                case 235: {
                    n14 = 60;
                    break;
                }
                case 236: {
                    n14 = 235;
                    break;
                }
                case 237: {
                    n14 = 202;
                    break;
                }
                case 238: {
                    n14 = 0;
                    break;
                }
                case 239: {
                    n14 = 43;
                    break;
                }
                case 240: {
                    n14 = 26;
                    break;
                }
                case 241: {
                    n14 = 225;
                    break;
                }
                case 242: {
                    n14 = 51;
                    break;
                }
                case 243: {
                    n14 = 20;
                    break;
                }
                case 244: {
                    n14 = 216;
                    break;
                }
                case 245: {
                    n14 = 207;
                    break;
                }
                case 246: {
                    n14 = 45;
                    break;
                }
                case 247: {
                    n14 = 74;
                    break;
                }
                case 248: {
                    n14 = 71;
                    break;
                }
                case 249: {
                    n14 = 177;
                    break;
                }
                case 250: {
                    n14 = 105;
                    break;
                }
                case 251: {
                    n14 = 132;
                    break;
                }
                case 252: {
                    n14 = 233;
                    break;
                }
                case 253: {
                    n14 = 113;
                    break;
                }
                case 254: {
                    n14 = 173;
                    break;
                }
                default: {
                    n14 = 251;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            hw_1.g[n12] = new String(cArray).intern();
        }
        return g[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x2390;
        if (n[n11] == null) {
            hw_1.n[n11] = (int)(m[n11] ^ l2);
        }
        return n[n11];
    }
}

