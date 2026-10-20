/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NM;
import com.O;
import com.SC;
import com.W5;
import com.bh_0;
import com.gt_1;
import com.hg_1;
import com.hx_1;
import com.od_2;
import com.oy_2;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

/*
 * Renamed from com.yB
 */
public class yb_1
extends gt_1 {
    private float G = 1.0f;
    private float O = 5.0f;
    private float D = 10000.0f;
    private int p = 0;
    private int a = 0;
    private SC I;
    private BufferedImage U;
    private int[] e;
    private int y = 1;
    private int z = 1;
    private od_2 S = new od_2();
    private od_2 V = new od_2();
    private od_2 k = new od_2();
    private O P = new O();
    private O K = new O();
    private O x = new O();
    private od_2 C = new od_2();
    private od_2 b = new od_2();
    private static final String c;
    private static final long[] d;
    private static final Integer[] f;

    public void i(SC sC) {
        this.I = sC;
    }

    public SC w() {
        return this.I;
    }

    public void k(float f10) {
        this.G = f10;
    }

    public float e() {
        return this.G;
    }

    public void h(float f10) {
        this.O = f10;
    }

    public float A() {
        return this.O;
    }

    public void T(BufferedImage bufferedImage) {
        block4: {
            block2: {
                block3: {
                    this.U = bufferedImage;
                    String[] stringArray = W5.q();
                    if (stringArray == null) break block2;
                    if (bufferedImage == null) break block3;
                    this.y = bufferedImage.getWidth();
                    this.z = bufferedImage.getHeight();
                    this.e = this.l(bufferedImage, 0, 0, this.y, this.z, null);
                    if (stringArray != null) break block4;
                }
                this.z = 1;
                this.y = 1;
            }
            this.e = null;
        }
    }

    public BufferedImage O() {
        return this.U;
    }

    public void f(int n10) {
        this.a = n10;
    }

    public int L() {
        return this.a;
    }

    protected void r(O o2, int n10) {
        o2.X((float)(n10 >> yb_1.a(30588, 337725760998618555L) & yb_1.a(8846, 3283555849333203016L)) * 0.003921569f, (float)(n10 >> yb_1.a(17989, 1541906153097856135L) & yb_1.a(32654, 6934188322788785487L)) * 0.003921569f, (float)(n10 & yb_1.a(32654, 6934188322788785487L)) * 0.003921569f, (float)(n10 >> yb_1.a(19117, 5731629207584933997L) & yb_1.a(32654, 6934188322788785487L)) * 0.003921569f);
    }

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        Object object;
        SC sC;
        O o2;
        od_2 od_22;
        od_2 od_23;
        od_2 od_24;
        float f10;
        float f11;
        String[] stringArray;
        int[] nArray2;
        int n12;
        block40: {
            block42: {
                Object object2;
                yb_1 yb_12;
                int n13;
                int n14;
                block43: {
                    block44: {
                        int n15;
                        block41: {
                            block38: {
                                float f12;
                                block39: {
                                    n12 = 0;
                                    nArray2 = new int[n10 * n11];
                                    stringArray = W5.q();
                                    f11 = Math.abs(6.0f * this.G);
                                    float f13 = this.G - 0.0f;
                                    float f14 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                                    if (stringArray != null) {
                                        f14 = f14 < 0 ? 1.0f : 0.0f;
                                    }
                                    f10 = f14;
                                    od_24 = new od_2(0.0f, 0.0f, 0.0f);
                                    od_23 = new od_2((float)n10 / 2.0f, (float)n11 / 2.0f, this.D);
                                    od_22 = new od_2();
                                    o2 = new O();
                                    sC = this.I;
                                    n15 = this.a;
                                    if (stringArray == null) break block38;
                                    if (n15 == 0) break block39;
                                    n15 = this.a;
                                    if (stringArray == null) break block38;
                                    if (n15 == 1) break block39;
                                    n15 = this.a;
                                    if (stringArray == null) break block38;
                                    if (n15 != 2 && sC != null) break block40;
                                }
                                n15 = (f12 = this.O - 0.0f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                            }
                            if (stringArray == null) break block41;
                            if (n15 == 0) break block42;
                            n15 = n10;
                        }
                        n14 = n15;
                        n13 = n11;
                        object = nArray;
                        yb_12 = this;
                        if (stringArray == null) break block43;
                        if (yb_12.a != 2) break block44;
                        yb_12 = this;
                        if (stringArray == null) break block43;
                        if (yb_12.I instanceof bh_0) {
                            object2 = (bh_0)this.I;
                            n14 = ((bh_0)object2).H();
                            n13 = ((bh_0)object2).n();
                            object = ((bh_0)object2).d();
                        }
                    }
                    yb_12 = this;
                }
                object2 = hx_1.n(yb_12.O);
                int[] nArray3 = new int[n14 * n13];
                int[] nArray4 = new int[n14 * n13];
                hx_1.V((Kernel)object2, (int[])object, nArray3, n14, n13, true, false, false, hg_1.Y);
                hx_1.V((Kernel)object2, nArray3, nArray4, n13, n14, true, false, false, hg_1.Y);
                sC = new bh_0(nArray4, n14, n13, 1, this.a == 1);
                if (stringArray != null) break block40;
            }
            sC = new bh_0(nArray, n10, n11, 1, this.a == 1);
        }
        od_2 od_25 = new od_2();
        od_2 od_26 = new od_2();
        object = new od_2();
        int n16 = 0;
        block0: while (true) {
            int n17 = n16;
            int n18 = n11;
            block1: while (n17 < n18) {
                float f15 = n16;
                od_24.I = n16;
                for (int i2 = 0; i2 < n10; ++i2) {
                    block57: {
                        block59: {
                            yb_1 yb_13;
                            int n19;
                            block58: {
                                int n20;
                                block45: {
                                    block46: {
                                        block54: {
                                            Object object3;
                                            block56: {
                                                float f16;
                                                block55: {
                                                    float f17;
                                                    float f18;
                                                    block53: {
                                                        block51: {
                                                            float f19;
                                                            block52: {
                                                                float f20;
                                                                block49: {
                                                                    float f21;
                                                                    block50: {
                                                                        float f22;
                                                                        block47: {
                                                                            float f23;
                                                                            block48: {
                                                                                float f24 = i2;
                                                                                n20 = this.a;
                                                                                if (stringArray == null) break block45;
                                                                                n18 = 3;
                                                                                if (stringArray == null) continue block1;
                                                                                if (n20 == n18) break block46;
                                                                                n19 = 0;
                                                                                od_22.k = 0.0f;
                                                                                od_22.I = 0.0f;
                                                                                od_22.e = 0.0f;
                                                                                float f25 = f11 * sC.h(f24, f15);
                                                                                f22 = i2 > 0 ? f11 * sC.h(f24 - 1.0f, f15) - f25 : -2.0f;
                                                                                f20 = n16 > 0 ? f11 * sC.h(f24, f15 - 1.0f) - f25 : -2.0f;
                                                                                f18 = i2 < n10 - 1 ? f11 * sC.h(f24 + 1.0f, f15) - f25 : -2.0f;
                                                                                f17 = n16 < n11 - 1 ? f11 * sC.h(f24, f15 + 1.0f) - f25 : -2.0f;
                                                                                float f26 = f22 - -2.0f;
                                                                                f16 = f26 == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1);
                                                                                if (stringArray == null) break block47;
                                                                                if (f16 == false) break block48;
                                                                                float f27 = f17 - -2.0f;
                                                                                f16 = f27 == 0.0f ? 0 : (f27 > 0.0f ? 1 : -1);
                                                                                if (stringArray == null) break block47;
                                                                                if (f16 != false) {
                                                                                    od_25.e = -1.0f;
                                                                                    od_25.I = 0.0f;
                                                                                    od_25.k = f22;
                                                                                    od_26.e = 0.0f;
                                                                                    od_26.I = 1.0f;
                                                                                    od_26.k = f17;
                                                                                    ((od_2)object).G(od_25, od_26);
                                                                                    ((od_2)object).E();
                                                                                    Object object4 = object;
                                                                                    if (stringArray != null) {
                                                                                        if ((double)((od_2)object4).k < 0.0) {
                                                                                            ((od_2)object).k = -((od_2)object).k;
                                                                                        }
                                                                                        object4 = od_22;
                                                                                    }
                                                                                    ((oy_2)object4).t((oy_2)object);
                                                                                    ++n19;
                                                                                }
                                                                            }
                                                                            f16 = (f23 = f22 - -2.0f) == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
                                                                        }
                                                                        if (stringArray == null) break block49;
                                                                        if (f16 == false) break block50;
                                                                        float f28 = f20 - -2.0f;
                                                                        f16 = f28 == 0.0f ? 0 : (f28 > 0.0f ? 1 : -1);
                                                                        if (stringArray == null) break block49;
                                                                        if (f16 != false) {
                                                                            od_25.e = -1.0f;
                                                                            od_25.I = 0.0f;
                                                                            od_25.k = f22;
                                                                            od_26.e = 0.0f;
                                                                            od_26.I = -1.0f;
                                                                            od_26.k = f20;
                                                                            ((od_2)object).G(od_25, od_26);
                                                                            ((od_2)object).E();
                                                                            Object object5 = object;
                                                                            if (stringArray != null) {
                                                                                if ((double)((od_2)object5).k < 0.0) {
                                                                                    ((od_2)object).k = -((od_2)object).k;
                                                                                }
                                                                                object5 = od_22;
                                                                            }
                                                                            ((oy_2)object5).t((oy_2)object);
                                                                            ++n19;
                                                                        }
                                                                    }
                                                                    f16 = (f21 = f20 - -2.0f) == 0.0f ? 0 : (f21 > 0.0f ? 1 : -1);
                                                                }
                                                                if (stringArray == null) break block51;
                                                                if (f16 == false) break block52;
                                                                float f29 = f18 - -2.0f;
                                                                f16 = f29 == 0.0f ? 0 : (f29 > 0.0f ? 1 : -1);
                                                                if (stringArray == null) break block51;
                                                                if (f16 != false) {
                                                                    od_25.e = 0.0f;
                                                                    od_25.I = -1.0f;
                                                                    od_25.k = f20;
                                                                    od_26.e = 1.0f;
                                                                    od_26.I = 0.0f;
                                                                    od_26.k = f18;
                                                                    ((od_2)object).G(od_25, od_26);
                                                                    ((od_2)object).E();
                                                                    Object object6 = object;
                                                                    if (stringArray != null) {
                                                                        if ((double)((od_2)object6).k < 0.0) {
                                                                            ((od_2)object).k = -((od_2)object).k;
                                                                        }
                                                                        object6 = od_22;
                                                                    }
                                                                    ((oy_2)object6).t((oy_2)object);
                                                                    ++n19;
                                                                }
                                                            }
                                                            f16 = (f19 = f18 - -2.0f) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                                                        }
                                                        if (stringArray == null) break block53;
                                                        if (f16 == false) break block54;
                                                        float f30 = f17 - -2.0f;
                                                        f16 = f30 == 0.0f ? 0 : (f30 > 0.0f ? 1 : -1);
                                                    }
                                                    if (stringArray == null) break block55;
                                                    if (f16 == false) break block54;
                                                    od_25.e = 1.0f;
                                                    od_25.I = 0.0f;
                                                    od_25.k = f18;
                                                    od_26.e = 0.0f;
                                                    od_26.I = 1.0f;
                                                    od_26.k = f17;
                                                    ((od_2)object).G(od_25, od_26);
                                                    ((od_2)object).E();
                                                    object3 = object;
                                                    if (stringArray == null) break block56;
                                                    double d2 = (double)((od_2)object3).k - 0.0;
                                                    f16 = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                                                }
                                                if (f16 < 0) {
                                                    ((od_2)object).k = -((od_2)object).k;
                                                }
                                                object3 = od_22;
                                            }
                                            ((oy_2)object3).t((oy_2)object);
                                            ++n19;
                                        }
                                        od_22.e /= (float)n19;
                                        od_22.I /= (float)n19;
                                        od_22.k /= (float)n19;
                                    }
                                    n20 = (int)f10;
                                }
                                if (stringArray != null) {
                                    if (n20 != 0) {
                                        od_22.e = -od_22.e;
                                        od_22.I = -od_22.I;
                                    }
                                    od_24.e = i2;
                                    float f31 = od_22.k - 0.0f;
                                    n20 = f31 == 0.0f ? 0 : (f31 > 0.0f ? 1 : -1);
                                }
                                if (n20 < 0) break block57;
                                yb_13 = this;
                                if (stringArray == null) break block58;
                                if (yb_13.U == null) break block59;
                                this.b.d(od_23);
                                this.b.q(od_24);
                                this.b.E();
                                this.C.d(od_22);
                                this.C.E();
                                this.C.J(2.0f * this.C.Y(this.b));
                                this.C.q(this.V);
                                this.C.E();
                                yb_13 = this;
                            }
                            yb_13.r(o2, this.Z(od_22, nArray, n10, n11));
                            n19 = nArray[n12] & yb_1.a(10818, 4912725374053247111L);
                            int n21 = (int)(o2.T * 255.0f) << yb_1.a(18296, 525076245730690491L) | (int)(o2.o * 255.0f) << yb_1.a(17880, 3620340349748840220L) | (int)(o2.I * 255.0f);
                            nArray2[n12++] = n19 | n21;
                            if (stringArray != null) continue;
                        }
                        nArray2[n12++] = 0;
                        if (stringArray != null) continue;
                    }
                    nArray2[n12++] = 0;
                    if (stringArray != null) continue;
                }
                ++n16;
                if (stringArray != null) continue block0;
            }
            break;
        }
        return nArray2;
    }

    private int Z(od_2 od_22, int[] nArray, int n10, int n11) {
        String[] stringArray = W5.q();
        if (this.U != null) {
            float f10 = 0.5f * (1.0f + od_22.e);
            float f11 = 0.5f * (1.0f + od_22.I);
            f10 = NM.X(f10 * (float)this.y, 0.0f, this.y - 1);
            f11 = NM.X(f11 * (float)this.z, 0.0f, this.z - 1);
            int n12 = (int)f10;
            int n13 = (int)f11;
            float f12 = f10 - (float)n12;
            float f13 = f11 - (float)n13;
            int n14 = this.y * n13 + n12;
            int n15 = n12;
            if (stringArray != null) {
                n15 = n15 == this.y - 1 ? 0 : 1;
            }
            int n16 = n15;
            int n17 = n13;
            if (stringArray != null) {
                n17 = n17 == this.z - 1 ? 0 : this.y;
            }
            int n18 = n17;
            return NM.O(f12, f13, this.e[n14], this.e[n14 + n16], this.e[n14 + n18], this.e[n14 + n16 + n18]);
        }
        return 0;
    }

    public String toString() {
        return c;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block20: {
                    break block20;
lbl1:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                v0 = "7i7_n\r_KN&Rc\u0012\u0014J3".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 26;
                v3 = v0;
                v4 = v1;
                if (v1 > 1) ** GOTO lbl54
                do {
                    v5 = v2;
                    v3 = v3;
                    v6 = v3;
                    v7 = v2;
                    v8 = var8;
                    while (true) {
                        switch (var8 % 7) {
                            case 0: {
                                v9 = 126;
                                break;
                            }
                            case 1: {
                                v9 = 7;
                                break;
                            }
                            case 2: {
                                v9 = 84;
                                break;
                            }
                            case 3: {
                                v9 = 41;
                                break;
                            }
                            case 4: {
                                v9 = 29;
                                break;
                            }
                            case 5: {
                                v9 = 109;
                                break;
                            }
                            default: {
                                v9 = 32;
                            }
                        }
                        v6[v8] = (char)(v6[v8] ^ (v7 ^ v9));
                        ++var8;
                        v2 = v5;
                        if (v5 != 0) break;
                        v5 = v2;
                        v3 = v3;
                        v8 = v2;
                        v6 = v3;
                        v7 = v2;
                    }
lbl54:
                    // 2 sources

                    v10 = v3;
                    v4 = v4;
                } while (v4 > var8);
                ** while (true)
                yb_1.c = new String(v10).intern();
                var0_1 = 7225103857345815336L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "\u00d5\u0094q@\u0004<k]K\u00f5\u00a9\u00af\u00fb\u001a^\u0098)\u00b1\u00a56\u0086\u0005\u00e7\u00a7\u0096\u00d9\u008cE\u00d0\u00a0\u00e6\u0083u6\u00f6\u00a5r\u00ad\u00e4<\u00da^\u00f3,\u0082\u001b\u000b\u00af";
                var5_5 = "\u00d5\u0094q@\u0004<k]K\u00f5\u00a9\u00af\u00fb\u001a^\u0098)\u00b1\u00a56\u0086\u0005\u00e7\u00a7\u0096\u00d9\u008cE\u00d0\u00a0\u00e6\u0083u6\u00f6\u00a5r\u00ad\u00e4<\u00da^\u00f3,\u0082\u001b\u000b\u00af".length();
                var2_6 = 0;
                while (true) {
                    var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                    v11 = var6_2;
                    v12 = var3_3++;
                    v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    var4_4 = "\u00eb\u00a2\u000b\u008dM\u00cf\u0083\u009fh\u00b8\u00eb&\u00dd\u00b4\u00d6\u0083";
                    var5_5 = "\u00eb\u00a2\u000b\u008dM\u00cf\u0083\u009fh\u00b8\u00eb&\u00dd\u00b4\u00d6\u0083".length();
                    var2_6 = 0;
                    while (true) {
                        var7_7 = var4_4.substring(var2_6, var2_6 += 8).getBytes("ISO-8859-1");
                        v11 = var6_2;
                        v12 = var3_3++;
                        v13 = ((long)var7_7[0] & 255L) << 56 | ((long)var7_7[1] & 255L) << 48 | ((long)var7_7[2] & 255L) << 40 | ((long)var7_7[3] & 255L) << 32 | ((long)var7_7[4] & 255L) << 24 | ((long)var7_7[5] & 255L) << 16 | ((long)var7_7[6] & 255L) << 8 | (long)var7_7[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_6 < var5_5) ** continue;
                    break block19;
                    break;
                }
            }
            v15 = v13 ^ var0_1;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl99:
                // 1 sources

                ** continue;
            }
        }
        yb_1.d = var6_2;
        yb_1.f = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x42C0;
        if (f[n11] == null) {
            yb_1.f[n11] = (int)(d[n11] ^ l2);
        }
        return f[n11];
    }
}

