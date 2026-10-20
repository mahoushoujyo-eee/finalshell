/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.C4;
import com.NM;
import com.RY;
import com.SC;
import com.W5;
import com._s_0;
import com.ei_1;
import com.ek_0;
import com.hn_1;
import com.iw_2;
import com.po_0;
import com.rr_2;
import com.uZ;
import java.awt.image.BufferedImage;
import java.util.Random;

/*
 * Renamed from com.h0
 */
public class h0_0
extends hn_1
implements Cloneable {
    private float a = 32.0f;
    private float f = 1.0f;
    private float t = 0.0f;
    private float N = 1.0f;
    private float E = 1.0f;
    private float n = 4.0f;
    private float D = 2.0f;
    private float i = 0.5f;
    private float F = 0.5f;
    private int W;
    private float m = 1.0f;
    private float J = 0.0f;
    private float M = 0.0f;
    private float j = 1.0f;
    private float s;
    private float Z;
    private po_0 Q = new C4();
    private ek_0 C;
    protected Random g = new Random();
    private int k = 0;
    private SC z;
    private static final String b;
    private static final long[] c;
    private static final Integer[] d;

    public h0_0() {
        this.C(0);
    }

    public void P(float f10) {
        this.N = f10;
    }

    public float X() {
        return this.N;
    }

    public void W(int n10) {
        this.W = n10;
    }

    public int k() {
        return this.W;
    }

    public void p(float f10) {
        this.a = f10;
    }

    public float e() {
        return this.a;
    }

    public void X(float f10) {
        this.f = f10;
    }

    public float y() {
        return this.f;
    }

    public void g(float f10) {
        this.t = f10;
        float f11 = (float)Math.cos(this.t);
        float f12 = (float)Math.sin(this.t);
        this.m = f11;
        this.J = f12;
        this.M = -f12;
        this.j = f11;
    }

    public float o() {
        return this.t;
    }

    public void y(float f10) {
        this.n = f10;
    }

    public float F() {
        return this.n;
    }

    public void q(float f10) {
        this.E = f10;
    }

    public float s() {
        return this.E;
    }

    public void f(float f10) {
        this.D = f10;
    }

    public float J() {
        return this.D;
    }

    public void v(float f10) {
        this.i = f10;
    }

    public float h() {
        return this.i;
    }

    public void J(float f10) {
        this.F = f10;
    }

    public float H() {
        return this.F;
    }

    public void z(po_0 po_02) {
        this.Q = po_02;
    }

    public po_0 d() {
        return this.Q;
    }

    public void C(int n10) {
        block7: {
            block6: {
                String[] stringArray = W5.q();
                h0_0 h0_02 = this;
                if (stringArray == null) break block6;
                h0_02.k = n10;
                switch (n10) {
                    default: {
                        this.z = new uZ();
                        if (stringArray != null) break block7;
                    }
                    case 1: {
                        this.z = new _s_0();
                        if (stringArray != null) break block7;
                    }
                    case 2: {
                        this.z = new rr_2();
                        if (stringArray != null) break block7;
                    }
                    case 3: {
                        this.z = new RY();
                        if (stringArray != null) break block7;
                    }
                    case 4: {
                        h0_02 = this;
                    }
                }
            }
            h0_02.z = new ei_1();
        }
    }

    public int r() {
        return this.k;
    }

    public void H(SC sC) {
        this.z = sC;
    }

    public SC P() {
        return this.z;
    }

    protected ek_0 O(float f10, float f11, float f12) {
        ek_0 ek_02 = new ek_0(f10, f11, f12, this.z);
        float[] fArray = uZ.B(ek_02, null);
        this.s = fArray[0];
        this.Z = fArray[1];
        return ek_02;
    }

    @Override
    public BufferedImage filter(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        this.C = this.O(this.E, this.D, this.n);
        return super.filter(bufferedImage, bufferedImage2);
    }

    @Override
    public int C(int n10, int n11, int n12) {
        int n13;
        String[] stringArray;
        block7: {
            int n14;
            float f10;
            block6: {
                po_0 po_02;
                block5: {
                    float f11 = this.m * (float)n10 + this.J * (float)n11;
                    stringArray = W5.q();
                    float f12 = this.M * (float)n10 + this.j * (float)n11;
                    f10 = this.C.h(f11 /= this.a, f12 /= this.a * this.f);
                    f10 = (f10 - this.s) / (this.Z - this.s);
                    f10 = NM.w(f10, this.i);
                    f10 = NM.E(f10, this.F);
                    f10 *= this.N;
                    n14 = n12 & h0_0.a(6877, 7730336372010838535L);
                    po_02 = this.Q;
                    if (stringArray == null) break block5;
                    if (po_02 == null) break block6;
                    po_02 = this.Q;
                }
                n13 = po_02.D(f10);
                if (stringArray != null) break block7;
            }
            n13 = iw_2.e((int)(f10 * 255.0f));
            int n15 = n13 << h0_0.a(6249, 8072282187260717233L);
            int n16 = n13 << h0_0.a(162, 4542516541923848313L);
            int n17 = n13;
            n13 = n14 | n15 | n16 | n17;
        }
        int n18 = this.W;
        if (stringArray != null) {
            if (n18 != 0) {
                n13 = iw_2.P(n12, n13, this.W);
            }
            n18 = n13;
        }
        return n18;
    }

    public String toString() {
        return b;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "\u001dM7]\u0012\u0011Jfn=H\u0004\u0017N%\b\r[\b\u0014A I!\t*\f[ G!\u0007IM".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 102;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 47;
                            break;
                        }
                        case 1: {
                            n17 = 78;
                            break;
                        }
                        case 2: {
                            n17 = 41;
                            break;
                        }
                        case 3: {
                            n17 = 79;
                            break;
                        }
                        case 4: {
                            n17 = 1;
                            break;
                        }
                        case 5: {
                            n17 = 5;
                            break;
                        }
                        default: {
                            n17 = 73;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        b = new String(cArray).intern();
        long l2 = 4915463846825656560L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "\u00ec\u009dk\u00c0\u0088\u00adj\u00f7\u0003%\u00a0\u008e\u0013\u00e5p\u0081\u00e2OU\u00d7:2\u00e8Q";
        int n19 = "\u00ec\u009dk\u00c0\u0088\u00adj\u00f7\u0003%\u00a0\u008e\u0013\u00e5p\u0081\u00e2OU\u00d7:2\u00e8Q".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        c = lArray;
        d = new Integer[3];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x70DA;
        if (d[n11] == null) {
            h0_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

