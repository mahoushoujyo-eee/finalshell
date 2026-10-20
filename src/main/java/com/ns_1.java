/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.kj_2;
import com.ky_2;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from com.nS
 */
public class ns_1 {
    private BufferedInputStream y;
    private int A;
    private int n;
    private int g;
    private boolean b;
    private int X;
    private int M = 1;
    private int[] t;
    private int[] T;
    private int[] K;
    private int d;
    private int J;
    private int Z;
    private int a;
    private boolean f;
    private boolean c;
    private int H;
    private int i;
    private int k;
    private int q;
    private int h;
    private Rectangle O;
    private BufferedImage u;
    private BufferedImage x;
    private final byte[] m = new byte[ns_1.a(17160, 7905076392615279196L)];
    private int r = 0;
    private int z = 0;
    private int C = 0;
    private boolean B = false;
    private int e = 0;
    private int V;
    private short[] P;
    private byte[] w;
    private byte[] s;
    private byte[] L;
    private ArrayList R;
    private int o;
    private static final String[] j;
    private static final String[] l;
    private static final long[] p;
    private static final Integer[] v;

    public int e() {
        return this.a;
    }

    public int F(int n10) {
        int n11;
        block4: {
            block5: {
                this.e = -1;
                ky_2[] ky_2Array = kj_2.d();
                n11 = n10;
                if (ky_2Array == null) break block4;
                if (n11 < 0) break block5;
                n11 = n10;
                if (ky_2Array == null) break block4;
                if (n11 < this.o) {
                    this.e = ((kj_2)this.R.get((int)n10)).p;
                }
            }
            n11 = this.e;
        }
        return n11;
    }

    public BufferedImage j(int n10) {
        BufferedImage bufferedImage;
        block5: {
            int n11;
            block4: {
                bufferedImage = null;
                ky_2[] ky_2Array = kj_2.d();
                n11 = n10;
                if (ky_2Array == null) break block4;
                if (n11 < 0) break block5;
                n11 = n10;
            }
            if (n11 < this.o) {
                bufferedImage = ((kj_2)this.R.get((int)n10)).W;
            }
        }
        return bufferedImage;
    }

    public int f() {
        return this.o;
    }

    public BufferedImage s() {
        return this.j(0);
    }

    public int c() {
        return this.M;
    }

    /*
     * Unable to fully structure code
     */
    public int P(BufferedInputStream var1_1) {
        block17: {
            block18: {
                block16: {
                    block23: {
                        block22: {
                            block21: {
                                block20: {
                                    block19: {
                                        var2_2 = kj_2.d();
                                        v0 = this;
                                        if (var2_2 == null) break block16;
                                        v0.E();
                                        if (var1_1 == null) ** GOTO lbl45
                                        break block19;
                                        catch (IOException v1) {
                                            throw ns_1.a(v1);
                                        }
                                    }
                                    this.y = var1_1;
                                    this.k();
                                    if (var2_2 == null) break block17;
                                    break block20;
                                    catch (IOException v2) {
                                        throw ns_1.a(v2);
                                    }
                                }
                                if (this.o()) break block18;
                                break block21;
                                catch (IOException v3) {
                                    throw ns_1.a(v3);
                                }
                            }
                            this.C();
                            if (var2_2 == null) break block17;
                            break block22;
                            catch (IOException v4) {
                                throw ns_1.a(v4);
                            }
                        }
                        if (this.o >= 0) break block18;
                        break block23;
                        catch (IOException v5) {
                            throw ns_1.a(v5);
                        }
                    }
                    try {
                        block24: {
                            this.A = 1;
                            if (var2_2 != null) break block18;
                            break block24;
                            catch (IOException v6) {
                                throw ns_1.a(v6);
                            }
                        }
                        v0 = this;
                    }
                    catch (IOException v7) {
                        throw ns_1.a(v7);
                    }
                }
                v0.A = ns_1.a(20520, 3943895479944374626L);
            }
            try {
                var1_1.close();
            }
            catch (IOException var3_3) {
                // empty catch block
            }
        }
        return this.A;
    }

    /*
     * Unable to fully structure code
     */
    public int A(String var1_1) {
        var2_2 = kj_2.d();
        v0 = this;
        if (var2_2 == null) ** GOTO lbl16
        v0.A = 0;
        try {
            block4: {
                var1_1 = var1_1.trim();
                if (var1_1.indexOf(ns_1.a(12422, 9821)) <= 0) ** GOTO lbl12
                var3_3 = new URL(var1_1);
                try {
                    this.y = new BufferedInputStream(var3_3.openStream());
                    if (var2_2 != null) break block4;
lbl12:
                    // 2 sources

                    v0 = this;
                }
                catch (IOException v1) {
                    throw ns_1.a(v1);
                }
lbl16:
                // 2 sources

                v0.y = new BufferedInputStream(new FileInputStream(var1_1));
            }
            this.A = this.P(this.y);
        }
        catch (IOException var3_4) {
            this.A = ns_1.a(8138, 4080239199235286670L);
        }
        return this.A;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    protected void r() {
        int n10;
        int n11;
        ky_2[] ky_2Array;
        block38: {
            int n12;
            int n13;
            ns_1 ns_12;
            block45: {
                byte[] byArray;
                block44: {
                    ns_1 ns_13;
                    block42: {
                        block43: {
                            block40: {
                                ns_1 ns_14;
                                block41: {
                                    int n14 = -1;
                                    ky_2Array = kj_2.d();
                                    n11 = this.q * this.h;
                                    ns_14 = this;
                                    if (ky_2Array == null) break block40;
                                    if (ns_14.L == null) break block41;
                                    ns_13 = this;
                                    if (ky_2Array == null) break block42;
                                    if (ns_13.L.length >= n11) break block43;
                                }
                                ns_14 = this;
                            }
                            ns_14.L = new byte[n11];
                        }
                        ns_13 = this;
                    }
                    if (ky_2Array != null) {
                        if (ns_13.P == null) {
                            this.P = new short[ns_1.a(8626, 164563254886799602L)];
                        }
                        ns_13 = this;
                    }
                    byArray = ns_13.w;
                    if (ky_2Array == null) break block44;
                    if (byArray == null) {
                        this.w = new byte[ns_1.a(9192, 480758518447348395L)];
                    }
                    ns_12 = this;
                    if (ky_2Array == null) break block45;
                    byArray = ns_12.s;
                }
                if (byArray == null) {
                    this.s = new byte[ns_1.a(25607, 6099643176437243200L)];
                }
                ns_12 = this;
            }
            int n15 = ns_12.M();
            int n16 = 1 << n15;
            int n17 = n16 + 1;
            int n18 = n16 + 2;
            int n19 = -1;
            int n20 = n15 + 1;
            int n21 = (1 << n20) - 1;
            for (n13 = 0; n13 < n16; ++n13) {
                this.P[n13] = 0;
                this.w[n13] = (byte)n13;
                if (ky_2Array != null) continue;
            }
            int n22 = 0;
            int n23 = 0;
            int n24 = 0;
            int n25 = 0;
            int n26 = 0;
            int n27 = 0;
            int n28 = 0;
            n10 = 0;
            while (n10 < n11) {
                block47: {
                    int n29;
                    block52: {
                        int n30;
                        block53: {
                            block39: {
                                int n31;
                                block49: {
                                    int n32;
                                    block48: {
                                        block46: {
                                            n12 = n24;
                                            if (ky_2Array == null) break block38;
                                            if (ky_2Array == null) break block46;
                                            if (n12 != 0) break block47;
                                            n12 = n27;
                                        }
                                        int n33 = n20;
                                        if (ky_2Array != null) {
                                            if (n12 < n33) {
                                                int n34 = n26;
                                                if (ky_2Array != null) {
                                                    if (n34 == 0) {
                                                        int n35 = n26 = this.L();
                                                        if (ky_2Array != null) {
                                                            if (n35 <= 0 && ky_2Array != null) break;
                                                            n35 = 0;
                                                        }
                                                        n22 = n35;
                                                    }
                                                    n34 = n28 + ((this.m[n22] & ns_1.a(29014, 6465265476012197917L)) << n27);
                                                }
                                                n28 = n34;
                                                n27 += 8;
                                                ++n22;
                                                --n26;
                                                if (ky_2Array != null) continue;
                                            }
                                            n13 = n28 & n21;
                                            n28 >>= n20;
                                            n27 -= n20;
                                            n12 = n13;
                                            if (ky_2Array == null) break block38;
                                            n33 = n18;
                                        }
                                        if (n12 > n33) break;
                                        n31 = n13;
                                        n32 = n17;
                                        if (ky_2Array != null) {
                                            if (n31 == n32 && ky_2Array != null) break;
                                            n31 = n13;
                                            n32 = n16;
                                        }
                                        if (ky_2Array == null) break block48;
                                        if (n31 == n32) {
                                            n20 = n15 + 1;
                                            n21 = (1 << n20) - 1;
                                            n18 = n16 + 2;
                                            n19 = -1;
                                            if (ky_2Array != null) continue;
                                        }
                                        n31 = n19;
                                        if (ky_2Array == null) break block49;
                                        n32 = -1;
                                    }
                                    if (n31 == n32) {
                                        this.s[n24++] = this.w[n13];
                                        n19 = n13;
                                        n25 = n13;
                                        if (ky_2Array != null) continue;
                                    }
                                    n31 = n13;
                                }
                                n30 = n31;
                                int n36 = n13;
                                int n37 = n18;
                                boolean bl = true;
                                do {
                                    block51: {
                                        block50: {
                                            if (!bl || (bl = false)) break block50;
                                            if (ky_2Array == null) break block51;
                                            if (n36 == n37) {
                                                this.s[n24++] = (byte)n25;
                                                n13 = n19;
                                            }
                                        }
                                        n36 = n13;
                                        n37 = n16;
                                    }
                                    if (n36 <= n37) break;
                                    this.s[n24++] = this.w[n13];
                                    n13 = this.P[n13];
                                    if (ky_2Array == null) break block39;
                                } while (ky_2Array != null);
                                n25 = this.w[n13] & ns_1.a(29014, 6465265476012197917L);
                            }
                            int n38 = n18;
                            int n39 = ns_1.a(9192, 480758518447348395L);
                            if (ky_2Array != null) {
                                if (n38 >= n39 && ky_2Array != null) break;
                                this.s[n24++] = (byte)n25;
                                this.P[n18] = (short)n19;
                                this.w[n18] = (byte)n25;
                                n38 = ++n18;
                                n39 = n21;
                            }
                            n29 = n38 & n39;
                            if (ky_2Array == null) break block52;
                            if (n29 != 0) break block53;
                            n29 = n18;
                            if (ky_2Array == null) break block52;
                            if (n29 < ns_1.a(9192, 480758518447348395L)) {
                                ++n20;
                                n21 += n18;
                            }
                        }
                        n29 = n30;
                    }
                    n19 = n29;
                }
                this.L[n23++] = this.s[--n24];
                ++n10;
                if (ky_2Array != null) continue;
            }
            n12 = n10 = n23;
        }
        while (n10 < n11) {
            this.L[n10] = 0;
            ++n10;
            if (ky_2Array != null) continue;
        }
        if (ky_2.F() != null) {
            kj_2.C(new ky_2[1]);
        }
    }

    protected boolean o() {
        ky_2[] ky_2Array = kj_2.d();
        boolean bl = this.A;
        if (ky_2Array != null) {
            bl = bl;
        }
        return bl;
    }

    protected void E() {
        this.A = 0;
        this.o = 0;
        this.R = new ArrayList();
        this.t = null;
        this.T = null;
    }

    protected int M() {
        int n10 = 0;
        try {
            n10 = this.y.read();
        }
        catch (IOException iOException) {
            this.A = 1;
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    protected int L() {
        block18: {
            block19: {
                block20: {
                    block22: {
                        this.r = this.M();
                        var2_1 = 0;
                        var1_2 = kj_2.d();
                        try {
                            v0 = this.r;
                            if (var1_2 == null) break block18;
                            if (v0 <= 0) break block19;
                        }
                        catch (IOException v1) {
                            throw ns_1.a(v1);
                        }
                        try {
                            while (var2_1 < this.r) {
                                block21: {
                                    block24: {
                                        block23: {
                                            var3_3 = this.y.read(this.m, var2_1, this.r - var2_1);
                                            v0 = var3_3;
                                            v2 = -1;
                                            if (var1_2 == null) break block20;
                                            if (var1_2 == null) break block21;
                                            break block23;
                                            catch (IOException v3) {
                                                throw ns_1.a(v3);
                                            }
                                        }
                                        if (v0 != v2) ** GOTO lbl35
                                        break block24;
                                        catch (IOException v4) {
                                            throw ns_1.a(v4);
                                        }
                                    }
                                    try {
                                        block25: {
                                            if (var1_2 != null) break block22;
                                            break block25;
                                            catch (IOException v5) {
                                                throw ns_1.a(v5);
                                            }
                                        }
                                        v6 = var2_1;
                                        v7 = var3_3;
                                    }
                                    catch (IOException v8) {
                                        throw ns_1.a(v8);
                                    }
                                }
                                var2_1 = v6 + v7;
                                if (var1_2 != null) continue;
                                break;
                            }
                        }
                        catch (IOException var3_4) {
                            // empty catch block
                        }
                    }
                    try {
                        v0 = var2_1;
                        if (var1_2 == null) break block18;
                        v2 = this.r;
                    }
                    catch (IOException v9) {
                        throw ns_1.a(v9);
                    }
                }
                try {
                    if (v0 < v2) {
                        this.A = 1;
                    }
                }
                catch (IOException v10) {
                    throw ns_1.a(v10);
                }
            }
            v0 = var2_1;
        }
        return v0;
    }

    protected int[] K(int n10) {
        int[] nArray;
        block15: {
            int[] nArray2;
            block14: {
                int n11;
                byte[] byArray;
                ky_2[] ky_2Array;
                block12: {
                    int n12 = 3 * n10;
                    nArray2 = null;
                    ky_2Array = kj_2.d();
                    byArray = new byte[n12];
                    int n13 = 0;
                    try {
                        n13 = this.y.read(byArray);
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                    try {
                        block13: {
                            try {
                                try {
                                    n11 = n13;
                                    if (ky_2Array == null) break block12;
                                    if (n11 >= n12) break block13;
                                }
                                catch (IOException iOException) {
                                    throw ns_1.a(iOException);
                                }
                                this.A = 1;
                                if (ky_2Array != null) break block14;
                            }
                            catch (IOException iOException) {
                                throw ns_1.a(iOException);
                            }
                        }
                        n11 = ns_1.a(15647, 1990267153661068369L);
                    }
                    catch (IOException iOException) {
                        throw ns_1.a(iOException);
                    }
                }
                nArray2 = new int[n11];
                int n14 = 0;
                int n15 = 0;
                while (n14 < n10) {
                    int n16 = byArray[n15++] & ns_1.a(5137, 9205847320407289180L);
                    int n17 = byArray[n15++] & ns_1.a(29014, 6465265476012197917L);
                    int n18 = byArray[n15++] & ns_1.a(29014, 6465265476012197917L);
                    try {
                        nArray = nArray2;
                        if (ky_2Array != null) {
                            nArray[n14++] = ns_1.a(23986, 7037906768170444019L) | n16 << ns_1.a(7198, 6126525539120522584L) | n17 << ns_1.a(8293, 3759626309519939892L) | n18;
                            if (ky_2Array != null) continue;
                            break;
                        }
                        break block15;
                    }
                    catch (IOException iOException) {
                        throw ns_1.a(iOException);
                    }
                }
            }
            nArray = nArray2;
        }
        return nArray;
    }

    /*
     * Unable to fully structure code
     */
    protected void C() {
        var2_1 = false;
        var1_2 = kj_2.d();
        while (!var2_1) {
            v0 = this.o();
            if (var1_2 != null) {
                if (v0 != 0) break;
                v0 = var3_3 = this.M();
            }
            if (var1_2 == null) ** GOTO lbl12
            block0 : switch (var3_3) {
                case 44: {
                    this.h();
lbl12:
                    // 2 sources

                    if (var1_2 != null) break;
                }
                case 33: {
                    var3_3 = this.M();
                    if (var1_2 == null) ** GOTO lbl36
                    switch (var3_3) {
                        case 249: {
                            this.q();
                            if (var1_2 != null) break block0;
                        }
                        case 255: {
                            this.L();
                            var4_4 = "";
                            for (var5_5 = 0; var5_5 < ns_1.a(22383, 5230609835344031271L); ++var5_5) {
                                var4_4 = var4_4 + (char)this.m[var5_5];
                                if (var1_2 != null) {
                                    if (var1_2 != null) continue;
                                }
                                ** GOTO lbl33
                            }
                            if (var4_4.equals(ns_1.a(12420, 19575))) {
                                this.W();
                                if (var1_2 != null) break block0;
                            }
                            this.K();
lbl33:
                            // 2 sources

                            if (var1_2 != null) break block0;
                        }
                        default: {
                            this.K();
                        }
                    }
lbl36:
                    // 2 sources

                    if (var1_2 != null) break;
                }
                case 59: {
                    var2_1 = true;
                    if (var1_2 != null) break;
                }
                default: {
                    this.A = 1;
                }
            }
            if (var1_2 != null) continue;
        }
    }

    protected void q() {
        ky_2[] ky_2Array = kj_2.d();
        this.M();
        ky_2[] ky_2Array2 = ky_2Array;
        int n10 = this.M();
        this.z = (n10 & ns_1.a(8264, 3197096439304493319L)) >> 2;
        ns_1 ns_12 = this;
        if (ky_2Array2 != null) {
            if (ns_12.z == 0) {
                this.z = 1;
            }
            ns_12 = this;
        }
        int n11 = n10 & 1;
        if (ky_2Array2 != null) {
            n11 = n11 != 0 ? 1 : 0;
        }
        ns_12.B = n11;
        this.e = this.v() * ns_1.a(350, 6868384764813129740L);
        this.V = this.M();
        this.M();
    }

    protected void k() {
        block14: {
            block15: {
                ns_1 ns_12;
                boolean bl;
                block13: {
                    ky_2[] ky_2Array;
                    block12: {
                        block11: {
                            String string = "";
                            ky_2Array = kj_2.d();
                            for (int i2 = 0; i2 < ns_1.a(716, 2577296619705613193L); ++i2) {
                                string = string + (char)this.M();
                                if (ky_2Array != null) {
                                    if (ky_2Array != null) continue;
                                }
                                break block11;
                            }
                            bl = string.startsWith(ns_1.a(12421, 25110));
                            if (ky_2Array == null) break block12;
                            if (!bl) {
                                this.A = 1;
                                return;
                            }
                            this.M();
                        }
                        bl = this.b;
                    }
                    if (ky_2Array == null) break block13;
                    if (!bl) break block14;
                    ns_12 = this;
                    if (ky_2Array == null) break block15;
                    bl = ns_12.o();
                }
                if (bl) break block14;
                this.t = this.K(this.X);
                ns_12 = this;
            }
            ns_12.J = this.t[this.d];
        }
    }

    protected void h() {
        ns_1 ns_12;
        block22: {
            boolean bl;
            int n10;
            block21: {
                int n11;
                ky_2[] ky_2Array;
                block20: {
                    block19: {
                        block17: {
                            block18: {
                                this.i = this.v();
                                ky_2Array = kj_2.d();
                                this.k = this.v();
                                this.q = this.v();
                                this.h = this.v();
                                int n12 = this.M();
                                int n13 = n12 & ns_1.a(5914, 5184386143853162070L);
                                if (ky_2Array != null) {
                                    n13 = n13 != 0 ? 1 : 0;
                                }
                                this.f = n13;
                                int n14 = n12 & ns_1.a(19308, 8216995625742070335L);
                                if (ky_2Array != null) {
                                    n14 = n14 != 0 ? 1 : 0;
                                }
                                this.c = n14;
                                this.H = 2 << (n12 & ns_1.a(27345, 3301359291208651672L));
                                n11 = this.f;
                                if (ky_2Array == null) break block17;
                                if (n11 == 0) break block18;
                                this.T = this.K(this.H);
                                this.K = this.T;
                                if (ky_2Array != null) break block19;
                            }
                            this.K = this.t;
                            n11 = this.d;
                        }
                        if (ky_2Array == null) break block20;
                        if (n11 == this.V) {
                            this.J = 0;
                        }
                    }
                    n11 = 0;
                }
                n10 = n11;
                ns_1 ns_13 = this;
                if (ky_2Array != null) {
                    if (ns_13.B) {
                        n10 = this.K[this.V];
                        this.K[this.V] = 0;
                    }
                    ns_13 = this;
                }
                if (ky_2Array != null) {
                    if (ns_13.K == null) {
                        this.A = 1;
                    }
                    ns_13 = this;
                }
                bl = ns_13.o();
                if (ky_2Array != null) {
                    if (bl) {
                        return;
                    }
                    this.r();
                    this.K();
                    bl = this.o();
                }
                if (ky_2Array == null) break block21;
                if (bl) {
                    return;
                }
                ++this.o;
                this.u = new BufferedImage(this.n, this.g, 3);
                this.L();
                this.R.add(new kj_2(this.u, this.e));
                ns_12 = this;
                if (ky_2Array == null) break block22;
                bl = ns_12.B;
            }
            if (bl) {
                this.K[this.V] = n10;
            }
            ns_12 = this;
        }
        ns_12.F();
    }

    protected void M() {
        this.n = this.v();
        this.g = this.v();
        int n10 = this.M();
        ky_2[] ky_2Array = kj_2.d();
        int n11 = n10 & ns_1.a(299, 4404463374864398441L);
        if (ky_2Array != null) {
            n11 = n11 != 0 ? 1 : 0;
        }
        this.b = n11;
        this.X = 2 << (n10 & ns_1.a(22707, 6445485269405196771L));
        this.d = this.M();
        this.a = this.M();
    }

    protected void W() {
        ky_2[] ky_2Array = kj_2.d();
        block0: while (true) {
            this.L();
            if (this.m[0] == 1) {
                int n10 = this.m[1] & ns_1.a(29014, 6465265476012197917L);
                int n11 = this.m[2] & ns_1.a(29014, 6465265476012197917L);
                this.M = n11 << ns_1.a(6751, 5214305717958681354L) | n10;
            }
            do {
                int n12 = this.r;
                if (ky_2Array != null) {
                    if (n12 <= 0) continue;
                    n12 = this.o() ? '\u0001' : '\u0000';
                }
                if (n12 == 0) continue block0;
            } while (ky_2Array == null);
            break;
        }
    }

    protected int v() {
        return this.M() | this.M() << ns_1.a(6751, 5214305717958681354L);
    }

    protected void F() {
        this.C = this.z;
        this.O = new Rectangle(this.i, this.k, this.q, this.h);
        this.x = this.u;
        this.Z = this.J;
        this.T = null;
    }

    protected void L() {
        int n10;
        int n11;
        ky_2[] ky_2Array;
        block22: {
            block23: {
                Color color;
                Graphics2D graphics2D;
                block30: {
                    block29: {
                        BufferedImage bufferedImage;
                        int[] nArray;
                        block28: {
                            ns_1 ns_12;
                            block24: {
                                block25: {
                                    block27: {
                                        block26: {
                                            nArray = ((DataBufferInt)this.u.getRaster().getDataBuffer()).getData();
                                            ky_2Array = kj_2.d();
                                            n11 = this.C;
                                            if (ky_2Array == null) break block22;
                                            if (n11 <= 0) break block23;
                                            ns_12 = this;
                                            if (ky_2Array == null) break block24;
                                            if (ns_12.C != 3) break block25;
                                            n10 = this.o - 2;
                                            if (ky_2Array == null) break block26;
                                            if (n10 <= 0) break block27;
                                            this.x = this.j(n10 - 1);
                                        }
                                        if (ky_2Array != null) break block25;
                                    }
                                    this.x = null;
                                }
                                ns_12 = this;
                            }
                            bufferedImage = ns_12.x;
                            if (ky_2Array == null) break block28;
                            if (bufferedImage == null) break block23;
                            bufferedImage = this.x;
                        }
                        int[] nArray2 = ((DataBufferInt)bufferedImage.getRaster().getDataBuffer()).getData();
                        System.arraycopy(nArray2, 0, nArray, 0, this.n * this.g);
                        n11 = this.C;
                        if (ky_2Array == null) break block22;
                        if (n11 != 2) break block23;
                        graphics2D = this.u.createGraphics();
                        if (!this.B) break block29;
                        color = new Color(0, 0, 0, 0);
                        if (ky_2Array != null) break block30;
                    }
                    color = new Color(this.Z);
                }
                graphics2D.setColor(color);
                graphics2D.setComposite(AlphaComposite.Src);
                graphics2D.fill(this.O);
                graphics2D.dispose();
            }
            n11 = 1;
        }
        n10 = n11;
        int n12 = ns_1.a(6751, 5214305717958681354L);
        int n13 = 0;
        int n14 = 0;
        block5: while (true) {
            int n15 = n14;
            block6: while (n15 < this.h) {
                int n16;
                int n17;
                block31: {
                    block32: {
                        int n18;
                        block35: {
                            int n19;
                            int n20;
                            block33: {
                                block34: {
                                    n17 = n14;
                                    n16 = this.c;
                                    if (ky_2Array == null) break block31;
                                    if (n16 == 0) break block32;
                                    n20 = n13;
                                    n19 = this.h;
                                    if (ky_2Array == null) break block33;
                                    if (n20 < n19) break block34;
                                    n18 = ++n10;
                                    if (ky_2Array == null) break block35;
                                    switch (n18) {
                                        case 2: {
                                            n13 = 4;
                                            if (ky_2Array != null) break;
                                        }
                                        case 3: {
                                            n13 = 2;
                                            n12 = 4;
                                            if (ky_2Array != null) break;
                                        }
                                        case 4: {
                                            n13 = 1;
                                            n12 = 2;
                                        }
                                    }
                                }
                                n17 = n13;
                                n20 = n13;
                                n19 = n12;
                            }
                            n18 = n20 + n19;
                        }
                        n13 = n18;
                    }
                    n17 += this.k;
                    if (ky_2Array == null) continue block5;
                    n16 = n17;
                }
                if (n16 < this.g) {
                    int n21 = n17 * this.n;
                    int n22 = n21 + this.i;
                    int n23 = n22 + this.q;
                    int n24 = n21 + this.n;
                    int n25 = n23;
                    if (ky_2Array != null) {
                        if (n24 < n25) {
                            n23 = n21 + this.n;
                        }
                        n24 = n14;
                        n25 = this.q;
                    }
                    int n26 = n24 * n25;
                    while (n22 < n23) {
                        int n27 = this.L[n26++] & ns_1.a(29014, 6465265476012197917L);
                        int n28 = this.K[n27];
                        if (ky_2Array != null) {
                            n15 = n28;
                            if (ky_2Array == null) continue block6;
                            if (n15 != 0) {
                                nArray[n22] = n28;
                            }
                            ++n22;
                        }
                        if (ky_2Array != null) continue;
                    }
                }
                ++n14;
                if (ky_2Array != null) continue block5;
            }
            break;
        }
    }

    protected void K() {
        do {
            this.L();
        } while (this.r > 0 && !this.o());
    }

    public int Y() {
        return this.A;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[3];
                    var11_1 = 0;
                    var10_2 = "E\u0086N\u00a0\u0099\u00e4\u0006\u0016\u00f14\u00b4\u0003\u00a4yH\u0003?\u00e2\u0080";
                    var12_3 = "E\u0086N\u00a0\u0099\u00e4\u0006\u0016\u00f14\u00b4\u0003\u00a4yH\u0003?\u00e2\u0080".length();
                    var9_4 = 11;
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
                    v4 = 87;
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
                                    v11 = 85;
                                    break;
                                }
                                case 1: {
                                    v11 = 74;
                                    break;
                                }
                                case 2: {
                                    v11 = 34;
                                    break;
                                }
                                case 3: {
                                    v11 = 58;
                                    break;
                                }
                                case 4: {
                                    v11 = 52;
                                    break;
                                }
                                case 5: {
                                    v11 = 114;
                                    break;
                                }
                                default: {
                                    v11 = 117;
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
                ns_1.j = var13;
                ns_1.l = new String[3];
                var0_7 = 880308453958512197L;
                var6_8 = new long[22];
                var3_9 = 0;
                var4_10 = "\u009235\u00b4|df\u00b7\u00b2sv\u00a9\u00c2\u00e5\u008a\u00b6\u0019\u00fb\u00d4\u00dfw\u00fa\u00d6\u00acS\u00bd2\u00a6\u00b84d\u00ee\u00e1\u00f7\u0018\u00b8\u00f7\u00f3H\u00c9\u00a8iG\u00a3(\u00a6U\u00ca\u00ba\u00c2\u00f7eP[K\rBN\u00a3\u00ab&\u00d5#\u0004\u00eax\u00d3\u00cfX\u00a0\u0000it@\"\u00bdF\u0095=\u00da\u00e3\u00c4th\u00eb\u00a2\u0007%C\u00d1\u00a8\u00a2\u00de\u00b5\u00a6\u00a7\u00a4\u0084\u0081\u0002 +@\u0093\u0097\u007f\u00ee\u001a\u000f\u00a3\u00c3\u00e6\u00f4\u00f8\u00d7\u008e\u009c\u00e0\u00eb\u0014\u0081^\u0018\u00a4;\u0091w^\u0000\u00d7x`\u001d\u0010\u008f\u00a1wM\u0002\u00cby\u00dewy\u0003^\u0085\u0095U\u009cVC\u0081\u0080hI\u0083\u00b3\u001c:";
                var5_11 = "\u009235\u00b4|df\u00b7\u00b2sv\u00a9\u00c2\u00e5\u008a\u00b6\u0019\u00fb\u00d4\u00dfw\u00fa\u00d6\u00acS\u00bd2\u00a6\u00b84d\u00ee\u00e1\u00f7\u0018\u00b8\u00f7\u00f3H\u00c9\u00a8iG\u00a3(\u00a6U\u00ca\u00ba\u00c2\u00f7eP[K\rBN\u00a3\u00ab&\u00d5#\u0004\u00eax\u00d3\u00cfX\u00a0\u0000it@\"\u00bdF\u0095=\u00da\u00e3\u00c4th\u00eb\u00a2\u0007%C\u00d1\u00a8\u00a2\u00de\u00b5\u00a6\u00a7\u00a4\u0084\u0081\u0002 +@\u0093\u0097\u007f\u00ee\u001a\u000f\u00a3\u00c3\u00e6\u00f4\u00f8\u00d7\u008e\u009c\u00e0\u00eb\u0014\u0081^\u0018\u00a4;\u0091w^\u0000\u00d7x`\u001d\u0010\u008f\u00a1wM\u0002\u00cby\u00dewy\u0003^\u0085\u0095U\u009cVC\u0081\u0080hI\u0083\u00b3\u001c:".length();
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
                    var4_10 = "\u00d5\u00aeT\u009eR\u00d0\u0095\u0019B\u00db\u000frw\u00cfMG";
                    var5_11 = "\u00d5\u00aeT\u009eR\u00d0\u0095\u0019B\u00db\u000frw\u00cfMG".length();
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
        ns_1.p = var6_8;
        ns_1.v = new Integer[22];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x3084) & 0xFFFF;
        if (l[n12] == null) {
            int n13;
            int n14;
            char[] cArray = j[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 155;
                    break;
                }
                case 1: {
                    n14 = 64;
                    break;
                }
                case 2: {
                    n14 = 233;
                    break;
                }
                case 3: {
                    n14 = 31;
                    break;
                }
                case 4: {
                    n14 = 7;
                    break;
                }
                case 5: {
                    n14 = 143;
                    break;
                }
                case 6: {
                    n14 = 45;
                    break;
                }
                case 7: {
                    n14 = 40;
                    break;
                }
                case 8: {
                    n14 = 138;
                    break;
                }
                case 9: {
                    n14 = 6;
                    break;
                }
                case 10: {
                    n14 = 135;
                    break;
                }
                case 11: {
                    n14 = 136;
                    break;
                }
                case 12: {
                    n14 = 218;
                    break;
                }
                case 13: {
                    n14 = 104;
                    break;
                }
                case 14: {
                    n14 = 54;
                    break;
                }
                case 15: {
                    n14 = 79;
                    break;
                }
                case 16: {
                    n14 = 163;
                    break;
                }
                case 17: {
                    n14 = 239;
                    break;
                }
                case 18: {
                    n14 = 220;
                    break;
                }
                case 19: {
                    n14 = 60;
                    break;
                }
                case 20: {
                    n14 = 167;
                    break;
                }
                case 21: {
                    n14 = 109;
                    break;
                }
                case 22: {
                    n14 = 249;
                    break;
                }
                case 23: {
                    n14 = 76;
                    break;
                }
                case 24: {
                    n14 = 152;
                    break;
                }
                case 25: {
                    n14 = 111;
                    break;
                }
                case 26: {
                    n14 = 137;
                    break;
                }
                case 27: {
                    n14 = 200;
                    break;
                }
                case 28: {
                    n14 = 82;
                    break;
                }
                case 29: {
                    n14 = 61;
                    break;
                }
                case 30: {
                    n14 = 91;
                    break;
                }
                case 31: {
                    n14 = 190;
                    break;
                }
                case 32: {
                    n14 = 16;
                    break;
                }
                case 33: {
                    n14 = 10;
                    break;
                }
                case 34: {
                    n14 = 56;
                    break;
                }
                case 35: {
                    n14 = 180;
                    break;
                }
                case 36: {
                    n14 = 198;
                    break;
                }
                case 37: {
                    n14 = 201;
                    break;
                }
                case 38: {
                    n14 = 230;
                    break;
                }
                case 39: {
                    n14 = 242;
                    break;
                }
                case 40: {
                    n14 = 203;
                    break;
                }
                case 41: {
                    n14 = 123;
                    break;
                }
                case 42: {
                    n14 = 189;
                    break;
                }
                case 43: {
                    n14 = 78;
                    break;
                }
                case 44: {
                    n14 = 47;
                    break;
                }
                case 45: {
                    n14 = 29;
                    break;
                }
                case 46: {
                    n14 = 20;
                    break;
                }
                case 47: {
                    n14 = 133;
                    break;
                }
                case 48: {
                    n14 = 156;
                    break;
                }
                case 49: {
                    n14 = 102;
                    break;
                }
                case 50: {
                    n14 = 85;
                    break;
                }
                case 51: {
                    n14 = 121;
                    break;
                }
                case 52: {
                    n14 = 214;
                    break;
                }
                case 53: {
                    n14 = 160;
                    break;
                }
                case 54: {
                    n14 = 132;
                    break;
                }
                case 55: {
                    n14 = 238;
                    break;
                }
                case 56: {
                    n14 = 175;
                    break;
                }
                case 57: {
                    n14 = 15;
                    break;
                }
                case 58: {
                    n14 = 23;
                    break;
                }
                case 59: {
                    n14 = 151;
                    break;
                }
                case 60: {
                    n14 = 206;
                    break;
                }
                case 61: {
                    n14 = 86;
                    break;
                }
                case 62: {
                    n14 = 157;
                    break;
                }
                case 63: {
                    n14 = 112;
                    break;
                }
                case 64: {
                    n14 = 74;
                    break;
                }
                case 65: {
                    n14 = 140;
                    break;
                }
                case 66: {
                    n14 = 2;
                    break;
                }
                case 67: {
                    n14 = 177;
                    break;
                }
                case 68: {
                    n14 = 131;
                    break;
                }
                case 69: {
                    n14 = 73;
                    break;
                }
                case 70: {
                    n14 = 215;
                    break;
                }
                case 71: {
                    n14 = 110;
                    break;
                }
                case 72: {
                    n14 = 83;
                    break;
                }
                case 73: {
                    n14 = 68;
                    break;
                }
                case 74: {
                    n14 = 176;
                    break;
                }
                case 75: {
                    n14 = 118;
                    break;
                }
                case 76: {
                    n14 = 182;
                    break;
                }
                case 77: {
                    n14 = 117;
                    break;
                }
                case 78: {
                    n14 = 27;
                    break;
                }
                case 79: {
                    n14 = 39;
                    break;
                }
                case 80: {
                    n14 = 142;
                    break;
                }
                case 81: {
                    n14 = 26;
                    break;
                }
                case 82: {
                    n14 = 141;
                    break;
                }
                case 83: {
                    n14 = 12;
                    break;
                }
                case 84: {
                    n14 = 43;
                    break;
                }
                case 85: {
                    n14 = 66;
                    break;
                }
                case 86: {
                    n14 = 75;
                    break;
                }
                case 87: {
                    n14 = 21;
                    break;
                }
                case 88: {
                    n14 = 87;
                    break;
                }
                case 89: {
                    n14 = 240;
                    break;
                }
                case 90: {
                    n14 = 245;
                    break;
                }
                case 91: {
                    n14 = 246;
                    break;
                }
                case 92: {
                    n14 = 59;
                    break;
                }
                case 93: {
                    n14 = 103;
                    break;
                }
                case 94: {
                    n14 = 32;
                    break;
                }
                case 95: {
                    n14 = 193;
                    break;
                }
                case 96: {
                    n14 = 222;
                    break;
                }
                case 97: {
                    n14 = 105;
                    break;
                }
                case 98: {
                    n14 = 46;
                    break;
                }
                case 99: {
                    n14 = 55;
                    break;
                }
                case 100: {
                    n14 = 212;
                    break;
                }
                case 101: {
                    n14 = 119;
                    break;
                }
                case 102: {
                    n14 = 178;
                    break;
                }
                case 103: {
                    n14 = 125;
                    break;
                }
                case 104: {
                    n14 = 244;
                    break;
                }
                case 105: {
                    n14 = 99;
                    break;
                }
                case 106: {
                    n14 = 229;
                    break;
                }
                case 107: {
                    n14 = 67;
                    break;
                }
                case 108: {
                    n14 = 216;
                    break;
                }
                case 109: {
                    n14 = 208;
                    break;
                }
                case 110: {
                    n14 = 128;
                    break;
                }
                case 111: {
                    n14 = 172;
                    break;
                }
                case 112: {
                    n14 = 3;
                    break;
                }
                case 113: {
                    n14 = 19;
                    break;
                }
                case 114: {
                    n14 = 97;
                    break;
                }
                case 115: {
                    n14 = 204;
                    break;
                }
                case 116: {
                    n14 = 210;
                    break;
                }
                case 117: {
                    n14 = 124;
                    break;
                }
                case 118: {
                    n14 = 30;
                    break;
                }
                case 119: {
                    n14 = 174;
                    break;
                }
                case 120: {
                    n14 = 224;
                    break;
                }
                case 121: {
                    n14 = 227;
                    break;
                }
                case 122: {
                    n14 = 221;
                    break;
                }
                case 123: {
                    n14 = 213;
                    break;
                }
                case 124: {
                    n14 = 72;
                    break;
                }
                case 125: {
                    n14 = 127;
                    break;
                }
                case 126: {
                    n14 = 90;
                    break;
                }
                case 127: {
                    n14 = 106;
                    break;
                }
                case 128: {
                    n14 = 223;
                    break;
                }
                case 129: {
                    n14 = 62;
                    break;
                }
                case 130: {
                    n14 = 232;
                    break;
                }
                case 131: {
                    n14 = 8;
                    break;
                }
                case 132: {
                    n14 = 92;
                    break;
                }
                case 133: {
                    n14 = 49;
                    break;
                }
                case 134: {
                    n14 = 134;
                    break;
                }
                case 135: {
                    n14 = 250;
                    break;
                }
                case 136: {
                    n14 = 154;
                    break;
                }
                case 137: {
                    n14 = 241;
                    break;
                }
                case 138: {
                    n14 = 253;
                    break;
                }
                case 139: {
                    n14 = 36;
                    break;
                }
                case 140: {
                    n14 = 129;
                    break;
                }
                case 141: {
                    n14 = 100;
                    break;
                }
                case 142: {
                    n14 = 145;
                    break;
                }
                case 143: {
                    n14 = 25;
                    break;
                }
                case 144: {
                    n14 = 18;
                    break;
                }
                case 145: {
                    n14 = 139;
                    break;
                }
                case 146: {
                    n14 = 93;
                    break;
                }
                case 147: {
                    n14 = 14;
                    break;
                }
                case 148: {
                    n14 = 33;
                    break;
                }
                case 149: {
                    n14 = 42;
                    break;
                }
                case 150: {
                    n14 = 161;
                    break;
                }
                case 151: {
                    n14 = 195;
                    break;
                }
                case 152: {
                    n14 = 191;
                    break;
                }
                case 153: {
                    n14 = 166;
                    break;
                }
                case 154: {
                    n14 = 81;
                    break;
                }
                case 155: {
                    n14 = 186;
                    break;
                }
                case 156: {
                    n14 = 148;
                    break;
                }
                case 157: {
                    n14 = 107;
                    break;
                }
                case 158: {
                    n14 = 209;
                    break;
                }
                case 159: {
                    n14 = 89;
                    break;
                }
                case 160: {
                    n14 = 225;
                    break;
                }
                case 161: {
                    n14 = 88;
                    break;
                }
                case 162: {
                    n14 = 0;
                    break;
                }
                case 163: {
                    n14 = 1;
                    break;
                }
                case 164: {
                    n14 = 34;
                    break;
                }
                case 165: {
                    n14 = 24;
                    break;
                }
                case 166: {
                    n14 = 53;
                    break;
                }
                case 167: {
                    n14 = 179;
                    break;
                }
                case 168: {
                    n14 = 217;
                    break;
                }
                case 169: {
                    n14 = 165;
                    break;
                }
                case 170: {
                    n14 = 35;
                    break;
                }
                case 171: {
                    n14 = 44;
                    break;
                }
                case 172: {
                    n14 = 96;
                    break;
                }
                case 173: {
                    n14 = 22;
                    break;
                }
                case 174: {
                    n14 = 52;
                    break;
                }
                case 175: {
                    n14 = 164;
                    break;
                }
                case 176: {
                    n14 = 58;
                    break;
                }
                case 177: {
                    n14 = 17;
                    break;
                }
                case 178: {
                    n14 = 184;
                    break;
                }
                case 179: {
                    n14 = 5;
                    break;
                }
                case 180: {
                    n14 = 243;
                    break;
                }
                case 181: {
                    n14 = 247;
                    break;
                }
                case 182: {
                    n14 = 71;
                    break;
                }
                case 183: {
                    n14 = 120;
                    break;
                }
                case 184: {
                    n14 = 98;
                    break;
                }
                case 185: {
                    n14 = 50;
                    break;
                }
                case 186: {
                    n14 = 170;
                    break;
                }
                case 187: {
                    n14 = 194;
                    break;
                }
                case 188: {
                    n14 = 226;
                    break;
                }
                case 189: {
                    n14 = 197;
                    break;
                }
                case 190: {
                    n14 = 144;
                    break;
                }
                case 191: {
                    n14 = 94;
                    break;
                }
                case 192: {
                    n14 = 159;
                    break;
                }
                case 193: {
                    n14 = 171;
                    break;
                }
                case 194: {
                    n14 = 188;
                    break;
                }
                case 195: {
                    n14 = 28;
                    break;
                }
                case 196: {
                    n14 = 115;
                    break;
                }
                case 197: {
                    n14 = 173;
                    break;
                }
                case 198: {
                    n14 = 70;
                    break;
                }
                case 199: {
                    n14 = 248;
                    break;
                }
                case 200: {
                    n14 = 254;
                    break;
                }
                case 201: {
                    n14 = 162;
                    break;
                }
                case 202: {
                    n14 = 51;
                    break;
                }
                case 203: {
                    n14 = 211;
                    break;
                }
                case 204: {
                    n14 = 48;
                    break;
                }
                case 205: {
                    n14 = 181;
                    break;
                }
                case 206: {
                    n14 = 255;
                    break;
                }
                case 207: {
                    n14 = 147;
                    break;
                }
                case 208: {
                    n14 = 38;
                    break;
                }
                case 209: {
                    n14 = 146;
                    break;
                }
                case 210: {
                    n14 = 37;
                    break;
                }
                case 211: {
                    n14 = 169;
                    break;
                }
                case 212: {
                    n14 = 130;
                    break;
                }
                case 213: {
                    n14 = 63;
                    break;
                }
                case 214: {
                    n14 = 41;
                    break;
                }
                case 215: {
                    n14 = 185;
                    break;
                }
                case 216: {
                    n14 = 4;
                    break;
                }
                case 217: {
                    n14 = 183;
                    break;
                }
                case 218: {
                    n14 = 252;
                    break;
                }
                case 219: {
                    n14 = 150;
                    break;
                }
                case 220: {
                    n14 = 80;
                    break;
                }
                case 221: {
                    n14 = 116;
                    break;
                }
                case 222: {
                    n14 = 84;
                    break;
                }
                case 223: {
                    n14 = 108;
                    break;
                }
                case 224: {
                    n14 = 219;
                    break;
                }
                case 225: {
                    n14 = 57;
                    break;
                }
                case 226: {
                    n14 = 199;
                    break;
                }
                case 227: {
                    n14 = 236;
                    break;
                }
                case 228: {
                    n14 = 13;
                    break;
                }
                case 229: {
                    n14 = 126;
                    break;
                }
                case 230: {
                    n14 = 234;
                    break;
                }
                case 231: {
                    n14 = 187;
                    break;
                }
                case 232: {
                    n14 = 168;
                    break;
                }
                case 233: {
                    n14 = 95;
                    break;
                }
                case 234: {
                    n14 = 235;
                    break;
                }
                case 235: {
                    n14 = 153;
                    break;
                }
                case 236: {
                    n14 = 196;
                    break;
                }
                case 237: {
                    n14 = 77;
                    break;
                }
                case 238: {
                    n14 = 69;
                    break;
                }
                case 239: {
                    n14 = 251;
                    break;
                }
                case 240: {
                    n14 = 158;
                    break;
                }
                case 241: {
                    n14 = 237;
                    break;
                }
                case 242: {
                    n14 = 65;
                    break;
                }
                case 243: {
                    n14 = 207;
                    break;
                }
                case 244: {
                    n14 = 202;
                    break;
                }
                case 245: {
                    n14 = 122;
                    break;
                }
                case 246: {
                    n14 = 192;
                    break;
                }
                case 247: {
                    n14 = 113;
                    break;
                }
                case 248: {
                    n14 = 9;
                    break;
                }
                case 249: {
                    n14 = 101;
                    break;
                }
                case 250: {
                    n14 = 231;
                    break;
                }
                case 251: {
                    n14 = 205;
                    break;
                }
                case 252: {
                    n14 = 228;
                    break;
                }
                case 253: {
                    n14 = 149;
                    break;
                }
                case 254: {
                    n14 = 11;
                    break;
                }
                default: {
                    n14 = 114;
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
            ns_1.l[n12] = new String(cArray).intern();
        }
        return l[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x3940;
        if (v[n11] == null) {
            ns_1.v[n11] = (int)(p[n11] ^ l2);
        }
        return v[n11];
    }
}

