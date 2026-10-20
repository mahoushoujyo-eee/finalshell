/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.GW;
import com.NM;
import com.O;
import com.SC;
import com.W5;
import com.bh_0;
import com.go_0;
import com.gt_1;
import com.gy_0;
import com.hx_1;
import com.od_2;
import com.oy_2;
import com.wu_1;
import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.Kernel;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.yj
 */
public class yj_2
extends gt_1 {
    private float Q;
    private float m;
    private int z;
    private float j = 10000.0f;
    gy_0 e;
    private Vector x = new Vector();
    private int I = 0;
    private int T = 0;
    private SC t;
    private Image n;
    private int[] G;
    private int Y = 1;
    private int B = 1;
    private od_2 d;
    private od_2 V;
    private od_2 J;
    private O b;
    private O g;
    private O C;
    private od_2 N;
    private od_2 F;
    private static final String a;
    private static final long[] f;
    private static final Integer[] i;

    public yj_2() {
        this.d(new GW(this));
        this.Q = 1.0f;
        this.m = 5.0f;
        this.z = 0;
        this.e = new gy_0();
        this.d = new od_2();
        this.V = new od_2();
        this.J = new od_2();
        this.b = new O();
        this.g = new O();
        this.C = new O();
        this.N = new od_2();
        this.F = new od_2();
    }

    public void J(gy_0 gy_02) {
        this.e = gy_02;
    }

    public gy_0 F() {
        return this.e;
    }

    public void P(SC sC) {
        this.t = sC;
    }

    public SC V() {
        return this.t;
    }

    public void r(float f10) {
        this.Q = f10;
    }

    public float a() {
        return this.Q;
    }

    public void q(float f10) {
        this.m = f10;
    }

    public float x() {
        return this.m;
    }

    public void t(int n10) {
        this.z = n10;
    }

    public int w() {
        return this.z;
    }

    public void j(float f10) {
        this.j = f10;
    }

    public float F() {
        return this.j;
    }

    public void e(BufferedImage bufferedImage) {
        block4: {
            block2: {
                block3: {
                    this.n = bufferedImage;
                    String[] stringArray = W5.q();
                    if (stringArray == null) break block2;
                    if (bufferedImage == null) break block3;
                    this.Y = bufferedImage.getWidth();
                    this.B = bufferedImage.getHeight();
                    this.G = this.l(bufferedImage, 0, 0, this.Y, this.B, null);
                    if (stringArray != null) break block4;
                }
                this.B = 1;
                this.Y = 1;
            }
            this.G = null;
        }
    }

    public Image u() {
        return this.n;
    }

    public void E(int n10) {
        this.I = n10;
    }

    public int Z() {
        return this.I;
    }

    public void q(int n10) {
        this.T = n10;
    }

    public int J() {
        return this.T;
    }

    public void j(int n10) {
        this.e.M = n10;
    }

    public int M() {
        return this.e.M;
    }

    public void d(go_0 go_02) {
        this.x.addElement(go_02);
    }

    public void f(go_0 go_02) {
        this.x.removeElement(go_02);
    }

    public Vector W() {
        return this.x;
    }

    protected void Q(O o2, int n10) {
        o2.X((float)(n10 >> yj_2.a(13119, 2581595998403621982L) & yj_2.a(14544, 4175067001360220083L)) * 0.003921569f, (float)(n10 >> yj_2.a(24962, 6665134605975463653L) & yj_2.a(18639, 4088369156610592681L)) * 0.003921569f, (float)(n10 & yj_2.a(18639, 4088369156610592681L)) * 0.003921569f, (float)(n10 >> yj_2.a(25883, 56641675469300350L) & yj_2.a(18639, 4088369156610592681L)) * 0.003921569f);
    }

    @Override
    protected int[] K(int n10, int n11, int[] nArray, Rectangle rectangle) {
        int n12;
        float[][] fArray;
        float f10;
        float f11;
        Object[] objectArray;
        Object object;
        Object object2;
        Object object3;
        SC sC;
        O o2;
        O o3;
        O o4;
        od_2 od_22;
        od_2 od_23;
        od_2 od_24;
        float f12;
        float f13;
        String[] stringArray;
        int[] nArray2;
        int n13;
        block65: {
            yj_2 yj_22;
            block75: {
                block69: {
                    int n14;
                    block70: {
                        block71: {
                            int n15;
                            int n16;
                            int n17;
                            block74: {
                                int n18;
                                int n19;
                                block72: {
                                    block73: {
                                        block67: {
                                            float f14;
                                            block68: {
                                                n13 = 0;
                                                nArray2 = new int[n10 * n11];
                                                stringArray = W5.q();
                                                f13 = Math.abs(6.0f * this.Q);
                                                float f15 = this.Q - 0.0f;
                                                float f16 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                                                if (stringArray != null) {
                                                    f16 = f16 < 0 ? 1.0f : 0.0f;
                                                }
                                                f12 = f16;
                                                od_24 = new od_2(0.0f, 0.0f, 0.0f);
                                                od_23 = new od_2((float)n10 / 2.0f, (float)n11 / 2.0f, this.j);
                                                od_22 = new od_2();
                                                o4 = new O();
                                                o3 = new O(new Color(this.e.M));
                                                o2 = new O(new Color(this.e.R));
                                                sC = this.t;
                                                n14 = this.T;
                                                if (stringArray == null) break block67;
                                                if (n14 == 0) break block68;
                                                n14 = this.T;
                                                if (stringArray == null) break block67;
                                                if (n14 == 1) break block68;
                                                n14 = this.T;
                                                if (stringArray == null) break block67;
                                                if (n14 != 2 && sC != null) break block69;
                                            }
                                            n14 = (f14 = this.m - 0.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                        }
                                        if (stringArray == null) break block70;
                                        if (n14 == 0) break block71;
                                        n17 = n10;
                                        n16 = n11;
                                        object3 = nArray;
                                        n19 = this.T;
                                        n18 = 2;
                                        if (stringArray == null) break block72;
                                        if (n19 != n18) break block73;
                                        n15 = this.t instanceof bh_0;
                                        if (stringArray == null) break block74;
                                        if (n15 != 0) {
                                            object2 = (bh_0)this.t;
                                            n17 = ((bh_0)object2).H();
                                            n16 = ((bh_0)object2).n();
                                            object3 = ((bh_0)object2).d();
                                        }
                                    }
                                    n19 = n17;
                                    n18 = n16;
                                }
                                n15 = n19 * n18;
                            }
                            object2 = new int[n15];
                            object = new int[n17 * n16];
                            objectArray = hx_1.n(this.m);
                            hx_1.V((Kernel)objectArray, object3, (int[])object2, n17, n16, true, false, false, hx_1.M);
                            hx_1.V((Kernel)objectArray, (int[])object2, (int[])object, n16, n17, true, false, false, hx_1.M);
                            SC sC2 = sC = new bh_0((int[])object, n17, n16, 1, this.T == 1);
                            if (this.z != 0) {
                                sC = new wu_1(this, sC2);
                            }
                            if (stringArray != null) break block69;
                        }
                        yj_22 = this;
                        if (stringArray == null) break block75;
                        n14 = yj_22.T;
                    }
                    if (n14 != 2) {
                        sC = new bh_0(nArray, n10, n11, 1, this.T == 1);
                    }
                }
                yj_22 = this;
            }
            f11 = yj_22.e.g;
            f10 = 1.0f - f11;
            object3 = new od_2();
            object2 = new od_2();
            object = new od_2();
            objectArray = new go_0[this.x.size()];
            this.x.copyInto(objectArray);
            for (int i2 = 0; i2 < objectArray.length; ++i2) {
                ((go_0)objectArray[i2]).j(n10, n11);
                if (stringArray != null) continue;
            }
            fArray = new float[3][n10];
            for (n12 = 0; n12 < n10; ++n12) {
                fArray[1][n12] = f13 * sC.h(n12, 0.0f);
                if (stringArray != null) {
                    if (stringArray != null) continue;
                }
                break block65;
            }
            n12 = 0;
        }
        block2: while (true) {
            int n20 = n12;
            block3: while (n20 < n11) {
                int n21;
                int n22;
                int n23;
                block66: {
                    int n24 = n12;
                    if (stringArray != null) {
                        n24 = n24 > 0 ? 1 : 0;
                    }
                    n23 = n24;
                    int n25 = n12;
                    if (stringArray != null) {
                        n25 = n25 < n11 - 1 ? 1 : 0;
                    }
                    n22 = n25;
                    od_24.I = n12;
                    for (n21 = 0; n21 < n10; ++n21) {
                        fArray[2][n21] = f13 * sC.h(n21, n12 + 1);
                        if (stringArray != null) {
                            if (stringArray != null) continue;
                        }
                        break block66;
                    }
                    n21 = 0;
                }
                while (n21 < n10) {
                    block95: {
                        block89: {
                            yj_2 yj_23;
                            block94: {
                                block93: {
                                    block92: {
                                        yj_2 yj_24;
                                        block90: {
                                            block91: {
                                                int n26;
                                                block88: {
                                                    block76: {
                                                        block77: {
                                                            int n27;
                                                            block85: {
                                                                Object object4;
                                                                block87: {
                                                                    int n28;
                                                                    block86: {
                                                                        float f17;
                                                                        float f18;
                                                                        block84: {
                                                                            block82: {
                                                                                int n29;
                                                                                block83: {
                                                                                    float f19;
                                                                                    block80: {
                                                                                        block81: {
                                                                                            float f20;
                                                                                            block78: {
                                                                                                int n30;
                                                                                                block79: {
                                                                                                    int n31;
                                                                                                    n20 = n21;
                                                                                                    if (stringArray == null) continue block3;
                                                                                                    if (stringArray != null) {
                                                                                                        n31 = n20 > 0 ? 1 : 0;
                                                                                                    }
                                                                                                    n30 = n31;
                                                                                                    int n32 = n21;
                                                                                                    if (stringArray != null) {
                                                                                                        n32 = n32 < n10 - 1 ? 1 : 0;
                                                                                                    }
                                                                                                    n29 = n32;
                                                                                                    n26 = this.T;
                                                                                                    if (stringArray == null) break block76;
                                                                                                    if (n26 == 3) break block77;
                                                                                                    n27 = 0;
                                                                                                    od_22.k = 0.0f;
                                                                                                    od_22.I = 0.0f;
                                                                                                    od_22.e = 0.0f;
                                                                                                    float f21 = fArray[1][n21];
                                                                                                    f20 = n30 != 0 ? fArray[1][n21 - 1] - f21 : 0.0f;
                                                                                                    f19 = n23 != 0 ? fArray[0][n21] - f21 : 0.0f;
                                                                                                    f18 = n29 != 0 ? fArray[1][n21 + 1] - f21 : 0.0f;
                                                                                                    f17 = n22 != 0 ? fArray[2][n21] - f21 : 0.0f;
                                                                                                    n28 = n30;
                                                                                                    if (stringArray == null) break block78;
                                                                                                    if (n28 == 0) break block79;
                                                                                                    n28 = n22;
                                                                                                    if (stringArray == null) break block78;
                                                                                                    if (n28 != 0) {
                                                                                                        object3.e = -1.0f;
                                                                                                        object3.I = 0.0f;
                                                                                                        object3.k = f20;
                                                                                                        ((od_2)object2).e = 0.0f;
                                                                                                        ((od_2)object2).I = 1.0f;
                                                                                                        ((od_2)object2).k = f17;
                                                                                                        ((od_2)object).G((od_2)object3, (od_2)object2);
                                                                                                        ((od_2)object).E();
                                                                                                        Object object5 = object;
                                                                                                        if (stringArray != null) {
                                                                                                            if ((double)((od_2)object5).k < 0.0) {
                                                                                                                ((od_2)object).k = -((od_2)object).k;
                                                                                                            }
                                                                                                            object5 = od_22;
                                                                                                        }
                                                                                                        ((oy_2)object5).t((oy_2)object);
                                                                                                        ++n27;
                                                                                                    }
                                                                                                }
                                                                                                n28 = n30;
                                                                                            }
                                                                                            if (stringArray == null) break block80;
                                                                                            if (n28 == 0) break block81;
                                                                                            n28 = n23;
                                                                                            if (stringArray == null) break block80;
                                                                                            if (n28 != 0) {
                                                                                                object3.e = -1.0f;
                                                                                                object3.I = 0.0f;
                                                                                                object3.k = f20;
                                                                                                ((od_2)object2).e = 0.0f;
                                                                                                ((od_2)object2).I = -1.0f;
                                                                                                ((od_2)object2).k = f19;
                                                                                                ((od_2)object).G((od_2)object3, (od_2)object2);
                                                                                                ((od_2)object).E();
                                                                                                Object object6 = object;
                                                                                                if (stringArray != null) {
                                                                                                    if ((double)((od_2)object6).k < 0.0) {
                                                                                                        ((od_2)object).k = -((od_2)object).k;
                                                                                                    }
                                                                                                    object6 = od_22;
                                                                                                }
                                                                                                ((oy_2)object6).t((oy_2)object);
                                                                                                ++n27;
                                                                                            }
                                                                                        }
                                                                                        n28 = n23;
                                                                                    }
                                                                                    if (stringArray == null) break block82;
                                                                                    if (n28 == 0) break block83;
                                                                                    n28 = n29;
                                                                                    if (stringArray == null) break block82;
                                                                                    if (n28 != 0) {
                                                                                        object3.e = 0.0f;
                                                                                        object3.I = -1.0f;
                                                                                        object3.k = f19;
                                                                                        ((od_2)object2).e = 1.0f;
                                                                                        ((od_2)object2).I = 0.0f;
                                                                                        ((od_2)object2).k = f18;
                                                                                        ((od_2)object).G((od_2)object3, (od_2)object2);
                                                                                        ((od_2)object).E();
                                                                                        Object object7 = object;
                                                                                        if (stringArray != null) {
                                                                                            if ((double)((od_2)object7).k < 0.0) {
                                                                                                ((od_2)object).k = -((od_2)object).k;
                                                                                            }
                                                                                            object7 = od_22;
                                                                                        }
                                                                                        ((oy_2)object7).t((oy_2)object);
                                                                                        ++n27;
                                                                                    }
                                                                                }
                                                                                n28 = n29;
                                                                            }
                                                                            if (stringArray == null) break block84;
                                                                            if (n28 == 0) break block85;
                                                                            n28 = n22;
                                                                        }
                                                                        if (stringArray == null) break block86;
                                                                        if (n28 == 0) break block85;
                                                                        object3.e = 1.0f;
                                                                        object3.I = 0.0f;
                                                                        object3.k = f18;
                                                                        ((od_2)object2).e = 0.0f;
                                                                        ((od_2)object2).I = 1.0f;
                                                                        ((od_2)object2).k = f17;
                                                                        ((od_2)object).G((od_2)object3, (od_2)object2);
                                                                        ((od_2)object).E();
                                                                        object4 = object;
                                                                        if (stringArray == null) break block87;
                                                                        double d2 = (double)((od_2)object4).k - 0.0;
                                                                        n28 = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                                                                    }
                                                                    if (n28 < 0) {
                                                                        ((od_2)object).k = -((od_2)object).k;
                                                                    }
                                                                    object4 = od_22;
                                                                }
                                                                ((oy_2)object4).t((oy_2)object);
                                                                ++n27;
                                                            }
                                                            od_22.e /= (float)n27;
                                                            od_22.I /= (float)n27;
                                                            od_22.k /= (float)n27;
                                                        }
                                                        n26 = (int)f12;
                                                    }
                                                    if (stringArray != null) {
                                                        if (n26 != 0) {
                                                            od_22.e = -od_22.e;
                                                            od_22.I = -od_22.I;
                                                        }
                                                        od_24.e = n21;
                                                        float f22 = od_22.k - 0.0f;
                                                        n26 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                                                    }
                                                    if (stringArray == null) break block88;
                                                    if (n26 < 0) break block89;
                                                    yj_24 = this;
                                                    if (stringArray == null) break block90;
                                                    n26 = yj_24.I;
                                                }
                                                if (n26 != 0) break block91;
                                                this.Q(o3, nArray[n13]);
                                                if (stringArray != null) break block92;
                                            }
                                            yj_24 = this;
                                        }
                                        yj_24.Q(o3, this.e.M);
                                    }
                                    if (f11 == 0.0f) break block93;
                                    yj_23 = this;
                                    if (stringArray == null) break block94;
                                    if (yj_23.n != null) {
                                        this.F.d(od_23);
                                        this.F.q(od_24);
                                        this.F.E();
                                        this.N.d(od_22);
                                        this.N.E();
                                        this.N.J(2.0f * this.N.Y(this.F));
                                        this.N.q(this.V);
                                        this.N.E();
                                        this.Q(o4, this.r(this.N, nArray, n10, n11));
                                        o3.T = f11 * o4.T + f10 * o3.T;
                                        o3.o = f11 * o4.o + f10 * o3.o;
                                        o3.I = f11 * o4.I + f10 * o3.I;
                                    }
                                }
                                yj_23 = this;
                            }
                            O o5 = yj_23.U(od_24, od_23, od_22, o3, o2, this.e, (go_0[])objectArray);
                            int n33 = nArray[n13] & yj_2.a(14627, 8998207183960014403L);
                            int n34 = (int)(o5.T * 255.0f) << yj_2.a(6106, 9014800911978057912L) | (int)(o5.o * 255.0f) << yj_2.a(1744, 4619197307833172404L) | (int)(o5.I * 255.0f);
                            nArray2[n13++] = n33 | n34;
                            if (stringArray != null) break block95;
                        }
                        nArray2[n13++] = 0;
                    }
                    ++n21;
                    if (stringArray != null) continue;
                }
                float[] fArray2 = fArray[0];
                fArray[0] = fArray[1];
                fArray[1] = fArray[2];
                fArray[2] = fArray2;
                ++n12;
                if (stringArray != null) continue block2;
            }
            break;
        }
        return nArray2;
    }

    protected O U(od_2 od_22, od_2 od_23, od_2 od_24, O o2, O o3, gy_0 gy_02, go_0[] go_0Array) {
        block9: {
            this.b.t(o2);
            this.b.K(gy_02.e);
            int n10 = 0;
            String[] stringArray = W5.q();
            while (n10 < go_0Array.length) {
                block10: {
                    block11: {
                        float f10;
                        float f11;
                        go_0 go_02;
                        block19: {
                            go_0 go_03;
                            float f12;
                            block18: {
                                block17: {
                                    float f13;
                                    block15: {
                                        float f14;
                                        block16: {
                                            float f15;
                                            block14: {
                                                block12: {
                                                    block13: {
                                                        go_02 = go_0Array[n10];
                                                        this.J.d(od_24);
                                                        this.d.d(go_02.j);
                                                        if (stringArray == null) break block9;
                                                        if (stringArray != null) {
                                                            if (go_02.T != 1) {
                                                                this.d.q(od_22);
                                                            }
                                                            this.d.E();
                                                        }
                                                        f11 = this.J.Y(this.d);
                                                        if (stringArray == null) break block10;
                                                        if (!((double)f11 >= 0.0)) break block11;
                                                        f12 = 0.0f;
                                                        this.V.d(od_23);
                                                        this.V.q(od_22);
                                                        this.V.E();
                                                        if (stringArray == null) break block12;
                                                        if (go_02.T != 3) break block13;
                                                        f15 = f12 = go_02.r.Y(this.d);
                                                        if (stringArray == null) break block14;
                                                        if (f15 < go_02.X && stringArray != null) break block11;
                                                    }
                                                    this.J.J(2.0f * f11);
                                                    this.J.q(this.d);
                                                }
                                                f15 = this.J.Y(this.V);
                                            }
                                            f13 = f14 = f15;
                                            if (stringArray == null) break block15;
                                            if (!((double)f13 < 0.0)) break block16;
                                            f10 = 0.0f;
                                            if (stringArray != null) break block17;
                                        }
                                        f13 = f14 / (gy_02.G - gy_02.G * f14 + f14);
                                    }
                                    f10 = f13;
                                }
                                go_03 = go_02;
                                if (stringArray == null) break block18;
                                if (go_03.T != 3) break block19;
                                go_03 = go_02;
                            }
                            float f16 = f12 = go_03.X / f12;
                            f16 *= f16;
                            f16 *= f16;
                            f16 *= f16;
                            f16 = (float)Math.pow(f12, go_02.w * 10.0f) * (1.0f - f16);
                            f10 *= f16;
                            f11 *= f16;
                        }
                        this.g.t(o2);
                        this.g.K(gy_02.c);
                        this.g.T *= go_02.H.T * f11;
                        this.g.o *= go_02.H.o * f11;
                        this.g.I *= go_02.H.I * f11;
                        this.C.t(o3);
                        this.C.K(gy_02.p);
                        this.C.T *= go_02.H.T * f10;
                        this.C.o *= go_02.H.o * f10;
                        this.C.I *= go_02.H.I * f10;
                        this.g.v(this.C);
                        this.g.Z(0.0f, 1.0f);
                        this.b.v(this.g);
                    }
                    ++n10;
                }
                if (stringArray != null) continue;
            }
            this.b.Z(0.0f, 1.0f);
        }
        return this.b;
    }

    private int r(od_2 od_22, int[] nArray, int n10, int n11) {
        block6: {
            float f10;
            float f11;
            String[] stringArray;
            block11: {
                float f12;
                float f13;
                block15: {
                    float f14;
                    block14: {
                        float f15;
                        block12: {
                            block13: {
                                float f16;
                                float f17;
                                block9: {
                                    float f18;
                                    block10: {
                                        block7: {
                                            float f19;
                                            block8: {
                                                stringArray = W5.q();
                                                if (this.n == null) break block6;
                                                f18 = (float)Math.acos(-od_22.I);
                                                f19 = f11 = f18 / (float)Math.PI;
                                                if (stringArray == null) break block7;
                                                if (f19 == 0.0f) break block8;
                                                f17 = f11;
                                                f16 = 1.0f;
                                                if (stringArray == null) break block9;
                                                if (f17 != f16) break block10;
                                            }
                                            f19 = f10 = 0.0f;
                                        }
                                        if (stringArray != null) break block11;
                                    }
                                    f17 = od_22.e;
                                    f16 = (float)Math.sin(f18);
                                }
                                f14 = f17 / f16;
                                float f20 = f14 - 1.0f;
                                f15 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
                                if (stringArray == null) break block12;
                                if (f15 <= 0) break block13;
                                f14 = 1.0f;
                                if (stringArray != null) break block14;
                            }
                            f13 = f14;
                            f12 = -1.0f;
                            if (stringArray == null) break block15;
                            float f21 = f13 - f12;
                            f15 = f21 == 0.0f ? 0 : (f21 < 0.0f ? -1 : 1);
                        }
                        if (f15 < 0) {
                            f14 = -1.0f;
                        }
                    }
                    f13 = (float)Math.acos(f14);
                    f12 = (float)Math.PI;
                }
                f10 = f13 / f12;
            }
            f10 = NM.X(f10 * (float)this.Y, 0.0f, this.Y - 1);
            f11 = NM.X(f11 * (float)this.B, 0.0f, this.B - 1);
            int n12 = (int)f10;
            int n13 = (int)f11;
            float f22 = f10 - (float)n12;
            float f23 = f11 - (float)n13;
            int n14 = this.Y * n13 + n12;
            int n15 = n12;
            if (stringArray != null) {
                n15 = n15 == this.Y - 1 ? 0 : 1;
            }
            int n16 = n15;
            int n17 = n13;
            if (stringArray != null) {
                n17 = n17 == this.B - 1 ? 0 : this.Y;
            }
            int n18 = n17;
            return NM.O(f22, f23, this.G[n14], this.G[n14 + n16], this.G[n14 + n18], this.G[n14 + n16 + n18]);
        }
        return 0;
    }

    public String toString() {
        return a;
    }

    static int K(yj_2 yj_22) {
        return yj_22.z;
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
                v0 = "\t\u0006E{@r\u0015u>UpA|P\u001f\u0014ZrJ|\u0003t\\\u0012".toCharArray();
                v1 = v0.length;
                var8 = 0;
                v2 = 30;
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
                                v9 = 68;
                                break;
                            }
                            case 1: {
                                v9 = 108;
                                break;
                            }
                            case 2: {
                                v9 = 34;
                                break;
                            }
                            case 3: {
                                v9 = 9;
                                break;
                            }
                            case 4: {
                                v9 = 55;
                                break;
                            }
                            case 5: {
                                v9 = 22;
                                break;
                            }
                            default: {
                                v9 = 110;
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
                yj_2.a = new String(v10).intern();
                var0_1 = 8288026510707747843L;
                var6_2 = new long[8];
                var3_3 = 0;
                var4_4 = "\u00f1N\u00dc\u00b7\u00ed\u00ab\u0098M\u00d5PK\u0088\u00bb\u008c\u0092@\u009e\u00bf\u00b6\u00c5\"F\u0093O \u00d3\u00f2\u00c2\u00a4\u0090\u00bc\u00ab\u00dd\u0085%\u001c\u00da\u0015\u00ceew\u0090s\u009dC\u0017-\u00bf";
                var5_5 = "\u00f1N\u00dc\u00b7\u00ed\u00ab\u0098M\u00d5PK\u0088\u00bb\u008c\u0092@\u009e\u00bf\u00b6\u00c5\"F\u0093O \u00d3\u00f2\u00c2\u00a4\u0090\u00bc\u00ab\u00dd\u0085%\u001c\u00da\u0015\u00ceew\u0090s\u009dC\u0017-\u00bf".length();
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
                    var4_4 = "\u0011\u00e6\u00a9*B\u0095\u00ca\u00ee\u00cb\u00c6y\u00b9!\u00b1cU";
                    var5_5 = "\u0011\u00e6\u00a9*B\u0095\u00ca\u00ee\u00cb\u00c6y\u00b9!\u00b1cU".length();
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
        yj_2.f = var6_2;
        yj_2.i = new Integer[8];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4761;
        if (i[n11] == null) {
            yj_2.i[n11] = (int)(f[n11] ^ l2);
        }
        return i[n11];
    }
}

