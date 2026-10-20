/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class x1 {
    vw_0 f = null;
    public int M = 0;
    int Q = (int)d;
    qm_0 p;
    D8 K = null;
    boolean U = false;
    Object x = new Object();
    boolean k = false;
    public HashMap L = new HashMap();
    boolean T = false;
    Object z = new Object();
    Object H;
    public InetAddress G;
    public int V;
    public int s;
    int B;
    boolean r;
    int I;
    int A;
    int g;
    int F;
    CU e;
    int D;
    static Random R;
    long J;
    boolean W;
    boolean Z;
    static int Y;
    Object a;
    HashMap j;
    private static final String[] b;
    private static final String[] c;
    private static final long d;
    private static final long h;

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    var9 = new String[2];
                    var7_1 = 0;
                    var6_2 = "\u00adD\u00f3\u8f46\u630a\u5d10\u7ea1\u51cb\u9595\u0010\u0010\u00e7D\u8f32\u63fc\u5d9e\u651d\u5f69\u00b2F\u00f9\u00ee\u00f7jP\u001b";
                    var8_3 = "\u00adD\u00f3\u8f46\u630a\u5d10\u7ea1\u51cb\u9595\u0010\u0010\u00e7D\u8f32\u63fc\u5d9e\u651d\u5f69\u00b2F\u00f9\u00ee\u00f7jP\u001b".length();
                    var5_4 = 9;
                    var4_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var9[var7_1++] = new String(v0).intern();
                        if ((var4_5 += var5_4) < var8_3) {
                            var5_4 = var6_2.charAt(var4_5);
                            ** continue;
                        }
                        break block15;
                        break;
                    }
                    v1 = ++var4_5;
                    v2 = var6_2.substring(v1, v1 + var5_4).toCharArray();
                    v3 = v2.length;
                    var10_6 = 0;
                    v4 = 118;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) ** GOTO lbl67
                    do {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var10_6;
                        while (true) {
                            switch (var10_6 % 7) {
                                case 0: {
                                    v11 = 108;
                                    break;
                                }
                                case 1: {
                                    v11 = 67;
                                    break;
                                }
                                case 2: {
                                    v11 = 59;
                                    break;
                                }
                                case 3: {
                                    v11 = 12;
                                    break;
                                }
                                case 4: {
                                    v11 = 84;
                                    break;
                                }
                                case 5: {
                                    v11 = 22;
                                    break;
                                }
                                default: {
                                    v11 = 12;
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var10_6;
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
                    } while (v6 > var10_6);
                    ** while (true)
                }
                x1.b = var9;
                x1.c = new String[2];
                break block16;
lbl78:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var2_7 = 6739097583063211750L;
            ** while (true)
            x1.d = -3984705395860103550L ^ var2_7;
            break block17;
lbl88:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_8 = 2408091182883050072L;
        ** while (true)
        x1.h = -2408091182883050073L ^ var0_8;
        x1.R = new Random();
        x1.Y = 0;
    }

    x1(qm_0 qm_02) {
        ky_2[] ky_2Array = qm_0.J();
        this.H = new Object();
        this.s = 0;
        this.B = -1;
        this.r = false;
        this.I = 0;
        this.A = -1;
        this.g = 0;
        this.F = 0;
        this.D = 0;
        this.J = h;
        this.W = false;
        this.Z = false;
        this.a = new Object();
        this.j = new HashMap();
        this.p = qm_02;
        this.e = new CU(qm_02);
        this.K = qm_02.j;
        this.G = qm_02.c;
        this.V = qm_02.i;
        if (ky_2Array == null) {
            ky_2.K(new String[4]);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void V(byte[] byArray, int n10, int n11) throws fg_1, InterruptedException {
        block20: {
            int n12;
            int n13;
            ky_2[] ky_2Array;
            int n14;
            int n15;
            block18: {
                int n16;
                block16: {
                    block17: {
                        block15: {
                            n15 = cs_0.k;
                            n14 = n11 / n15;
                            ky_2Array = qm_0.J();
                            try {
                                n16 = n11 % n15;
                                if (ky_2Array == null) break block15;
                                if (n16 != 0) {
                                    // empty if block
                                }
                            }
                            catch (fg_1 fg_12) {
                                throw x1.a(fg_12);
                            }
                            n16 = ++n14;
                        }
                        try {
                            if (ky_2Array == null) break block16;
                            if (n16 != 0) break block17;
                        }
                        catch (fg_1 fg_13) {
                            throw x1.a(fg_13);
                        }
                        n14 = 1;
                    }
                    n16 = n15;
                }
                n13 = n16;
                try {
                    block19: {
                        try {
                            try {
                                n12 = n11;
                                if (ky_2Array == null) break block18;
                                if (n12 > n13) break block19;
                            }
                            catch (fg_1 fg_14) {
                                throw x1.a(fg_14);
                            }
                            ++this.D;
                            this.m(byArray, 0, n11);
                            --this.D;
                            if (ky_2Array != null) break block20;
                        }
                        catch (fg_1 fg_15) {
                            throw x1.a(fg_15);
                        }
                    }
                    n12 = 0;
                }
                catch (fg_1 fg_16) {
                    throw x1.a(fg_16);
                }
            }
            int n17 = n12;
            boolean bl = true;
            do {
                block21: {
                    if (bl && !(bl = false) && ky_2Array != null) continue;
                    byte[] byArray2 = new byte[n13];
                    System.arraycopy(byArray, n10, byArray2, 0, n13);
                    this.m(byArray2, 0, byArray2.length);
                    int n18 = (n10 += n15) + n13;
                    int n19 = n11;
                    if (ky_2Array != null) {
                        try {
                            if (n18 <= n19) break block21;
                            n18 = n11;
                            n19 = (n14 - 1) * n15;
                        }
                        catch (fg_1 fg_17) {
                            throw x1.a(fg_17);
                        }
                    }
                    n13 = n18 - n19;
                }
                ++n17;
            } while (n17 < n14);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void m(byte[] byArray, int n10, int n11) throws fg_1, InterruptedException {
        boolean bl;
        ky_2[] ky_2Array;
        block25: {
            ky_2Array = qm_0.J();
            bl = this.W;
            if (ky_2Array == null) break block25;
            try {
                block32: {
                    if (bl) throw new fg_1("RDP连接已经关闭");
                    break block32;
                    catch (InterruptedException interruptedException) {
                        throw x1.a(interruptedException);
                    }
                }
                bl = this.Z;
            }
            catch (InterruptedException interruptedException) {
                throw x1.a(interruptedException);
            }
        }
        if (bl) throw new fg_1("RDP连接已断开sendData");
        vw_0 vw_02 = new vw_0(this.s, byArray, 0, (short)n11, this.p.W, this.p.u.K);
        vw_02.D(this.G);
        vw_02.A(this.V);
        Object object = this.a;
        synchronized (object) {
            this.L.put(vw_02.N(), vw_02);
        }
        object = this.H;
        synchronized (object) {
            int n12;
            block29: {
                int n13;
                int n14;
                block31: {
                    boolean bl2;
                    block30: {
                        block27: {
                            block28: {
                                Object object2 = this.p.j;
                                if (ky_2Array != null) {
                                    block26: {
                                        try {
                                            if (((D8)object2).Q()) break block26;
                                            this.H.wait();
                                            break block26;
                                        }
                                        catch (fg_1 fg_12) {
                                            throw x1.a(fg_12);
                                        }
                                        {
                                            catch (InterruptedException interruptedException) {
                                                throw interruptedException;
                                            }
                                        }
                                    }
                                    object2 = object;
                                }
                                // ** MonitorExit[v4] (shouldn't be in output)
                                bl2 = false;
                                try {
                                    n12 = cs_0.D;
                                    if (ky_2Array == null) break block27;
                                    if (n12 == 0) break block28;
                                }
                                catch (InterruptedException interruptedException) {
                                    throw x1.a(interruptedException);
                                }
                                bl2 = true;
                            }
                            n12 = cs_0.Q;
                        }
                        try {
                            try {
                                try {
                                    if (ky_2Array == null) break block29;
                                    if (n12 == 0) break block30;
                                }
                                catch (InterruptedException interruptedException) {
                                    throw x1.a(interruptedException);
                                }
                                int n13 = vw_02.N();
                                n13 = 5;
                                if (ky_2Array == null) break block31;
                            }
                            catch (InterruptedException interruptedException) {
                                throw x1.a(interruptedException);
                            }
                            if (n14 > n13) break block30;
                        }
                        catch (InterruptedException interruptedException) {
                            throw x1.a(interruptedException);
                        }
                        bl2 = true;
                    }
                    this.E(vw_02, false, bl2, true);
                    this.J = System.currentTimeMillis();
                    ++this.B;
                    int n13 = Y;
                    n13 = vw_02.q().length;
                }
                n12 = n14 + n13;
            }
            try {
                Y = n12;
                this.p.d.z.x(this.p, this.s);
                ++this.s;
                if (ky_2Array != null) return;
                throw new fg_1("RDP连接已断开sendData");
            }
            catch (InterruptedException interruptedException) {
                throw x1.a(interruptedException);
            }
        }
    }

    public void O() {
        block3: {
            x1 x12;
            block4: {
                boolean bl;
                block2: {
                    ky_2[] ky_2Array = qm_0.J();
                    bl = this.Z;
                    if (ky_2Array == null) break block2;
                    if (bl) break block3;
                    this.Z = true;
                    this.p.j.g();
                    x12 = this;
                    if (ky_2Array == null) break block4;
                    bl = x12.p.Q;
                }
                if (bl) break block3;
                x12 = this;
            }
            x12.h();
        }
    }

    public void N() {
        block3: {
            block2: {
                ky_2[] ky_2Array = qm_0.J();
                x1 x12 = this;
                if (ky_2Array == null) break block2;
                if (x12.Z) break block3;
                x12 = this;
            }
            x12.Z = true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    void E(vw_0 vw_02, boolean bl, boolean bl2, boolean bl3) {
        Object object = this.p.d.V();
        synchronized (object) {
            long l2;
            ky_2[] ky_2Array;
            block17: {
                fr_0 fr_02;
                block16: {
                    block20: {
                        ky_2Array = qm_0.J();
                        l2 = System.nanoTime();
                        long l3 = System.currentTimeMillis();
                        this.p.d.W(this.p);
                        int n10 = this.p.d.M();
                        vw_02.Q(n10);
                        fr_02 = this.p.d.A(n10);
                        if (ky_2Array == null) break block20;
                        try {
                            block21: {
                                if (bl) break block16;
                                break block21;
                                catch (IOException iOException) {
                                    throw x1.a(iOException);
                                }
                            }
                            vw_02.w(n10);
                            vw_02.a(System.currentTimeMillis());
                            fr_02.q(vw_02.q().length);
                            fr_02.A(vw_02.q().length);
                        }
                        catch (IOException iOException) {
                            throw x1.a(iOException);
                        }
                    }
                    if (ky_2Array != null) break block17;
                }
                fr_0 fr_03 = this.p.d.A(vw_02.c());
                fr_03.h(vw_02.q().length);
                fr_02.A(vw_02.q().length);
            }
            try {
                boolean bl4;
                block18: {
                    block19: {
                        ++this.g;
                        ++this.M;
                        ++this.A;
                        long l4 = System.currentTimeMillis();
                        this.W(vw_02.S());
                        bl4 = bl2;
                        if (ky_2Array == null) break block18;
                        try {
                            block22: {
                                if (!bl4) break block19;
                                break block22;
                                catch (IOException iOException) {
                                    throw x1.a(iOException);
                                }
                            }
                            this.W(vw_02.S());
                        }
                        catch (IOException iOException) {
                            throw x1.a(iOException);
                        }
                    }
                    bl4 = bl3;
                }
                try {
                    if (bl4) {
                        this.p.d.l(l2, vw_02.q().length);
                    }
                }
                catch (IOException iOException) {
                    throw x1.a(iOException);
                }
                cr_2 cr_22 = new cr_2("", R.nextLong(), vw_02.q().length, cr_2.i);
                la_1.F(cr_22);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    void w(int n10) {
        this.p.u.x.S(this.p, n10);
    }

    void S() {
        this.p.u.x.e(this.p);
    }

    vw_0 Y(int n10) {
        return (vw_0)this.L.get(n10);
    }

    public void T(int n10, int n11) {
        block5: {
            vw_0 vw_02;
            Integer n12;
            HashMap hashMap;
            block4: {
                ky_2[] ky_2Array = qm_0.J();
                hashMap = this.L;
                n12 = n10;
                if (ky_2Array == null) break block4;
                if (!hashMap.containsKey(n12)) break block5;
                hashMap = this.L;
                n12 = n10;
            }
            if ((vw_02 = (vw_0)hashMap.get(n12)) != null) {
                this.E(vw_02, true, false, true);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void I() {
        Object object = this.a;
        synchronized (object) {
            this.L.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(int n10) {
        Object object = this.a;
        synchronized (object) {
            vw_0 vw_02 = (vw_0)this.L.remove(n10);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void H() {
        Object object = this.H;
        synchronized (object) {
            this.H.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void y() {
        Object object = this.H;
        synchronized (object) {
            this.W = true;
            this.H.notifyAll();
        }
    }

    void h() {
        vm_0 vm_02 = new vm_0(this.p.W, this.p.u.K, this.s);
        vm_02.D(this.G);
        vm_02.A(this.V);
        try {
            this.W(vm_02.S());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        try {
            this.W(vm_02.S());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    void l() {
        VK vK = new VK(this.p.W, this.p.u.K);
        vK.D(this.G);
        vK.A(this.V);
        try {
            this.W(vK.S());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        try {
            this.W(vK.S());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    void Y(ArrayList arrayList) {
        int n10 = this.p.j.C();
        vt_0 vt_02 = new vt_0(this.p.n, arrayList, this.p.j.w, this.p.d.X, n10, this.p.W, this.p.u.K);
        vt_02.D(this.G);
        vt_02.A(this.V);
        try {
            this.W(vt_02.S());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    void W(DatagramPacket datagramPacket) throws IOException {
        this.M(datagramPacket, this.p.W);
    }

    public void M(DatagramPacket datagramPacket, Integer n10) throws IOException {
        this.p.d.l(datagramPacket);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFF329) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            char[] cArray = b[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 128;
                case 1 -> 34;
                case 2 -> 150;
                case 3 -> 217;
                case 4 -> 32;
                case 5 -> 196;
                case 6 -> 157;
                case 7 -> 254;
                case 8 -> 72;
                case 9 -> 214;
                case 10 -> 47;
                case 11 -> 185;
                case 12 -> 64;
                case 13 -> 239;
                case 14 -> 211;
                case 15 -> 163;
                case 16 -> 80;
                case 17 -> 56;
                case 18 -> 248;
                case 19 -> 189;
                case 20 -> 130;
                case 21 -> 186;
                case 22 -> 124;
                case 23 -> 152;
                case 24 -> 212;
                case 25 -> 209;
                case 26 -> 219;
                case 27 -> 190;
                case 28 -> 164;
                case 29 -> 24;
                case 30 -> 153;
                case 31 -> 70;
                case 32 -> 245;
                case 33 -> 77;
                case 34 -> 110;
                case 35 -> 154;
                case 36 -> 54;
                case 37 -> 207;
                case 38 -> 112;
                case 39 -> 198;
                case 40 -> 66;
                case 41 -> 242;
                case 42 -> 246;
                case 43 -> 122;
                case 44 -> 20;
                case 45 -> 2;
                case 46 -> 142;
                case 47 -> 29;
                case 48 -> 179;
                case 49 -> 16;
                case 50 -> 17;
                case 51 -> 172;
                case 52 -> 0;
                case 53 -> 187;
                case 54 -> 99;
                case 55 -> 135;
                case 56 -> 91;
                case 57 -> 115;
                case 58 -> 53;
                case 59 -> 88;
                case 60 -> 141;
                case 61 -> 195;
                case 62 -> 222;
                case 63 -> 31;
                case 64 -> 8;
                case 65 -> 197;
                case 66 -> 181;
                case 67 -> 134;
                case 68 -> 241;
                case 69 -> 104;
                case 70 -> 113;
                case 71 -> 89;
                case 72 -> 158;
                case 73 -> 173;
                case 74 -> 184;
                case 75 -> 180;
                case 76 -> 40;
                case 77 -> 139;
                case 78 -> 73;
                case 79 -> 42;
                case 80 -> 149;
                case 81 -> 232;
                case 82 -> 201;
                case 83 -> 147;
                case 84 -> 137;
                case 85 -> 129;
                case 86 -> 151;
                case 87 -> 10;
                case 88 -> 33;
                case 89 -> 13;
                case 90 -> 200;
                case 91 -> 45;
                case 92 -> 138;
                case 93 -> 39;
                case 94 -> 199;
                case 95 -> 25;
                case 96 -> 238;
                case 97 -> 133;
                case 98 -> 85;
                case 99 -> 162;
                case 100 -> 230;
                case 101 -> 116;
                case 102 -> 221;
                case 103 -> 57;
                case 104 -> 236;
                case 105 -> 111;
                case 106 -> 26;
                case 107 -> 6;
                case 108 -> 86;
                case 109 -> 120;
                case 110 -> 231;
                case 111 -> 41;
                case 112 -> 233;
                case 113 -> 192;
                case 114 -> 48;
                case 115 -> 208;
                case 116 -> 251;
                case 117 -> 131;
                case 118 -> 252;
                case 119 -> 160;
                case 120 -> 229;
                case 121 -> 225;
                case 122 -> 35;
                case 123 -> 169;
                case 124 -> 228;
                case 125 -> 176;
                case 126 -> 101;
                case 127 -> 240;
                case 128 -> 193;
                case 129 -> 82;
                case 130 -> 126;
                case 131 -> 44;
                case 132 -> 100;
                case 133 -> 51;
                case 134 -> 71;
                case 135 -> 106;
                case 136 -> 127;
                case 137 -> 97;
                case 138 -> 30;
                case 139 -> 84;
                case 140 -> 22;
                case 141 -> 11;
                case 142 -> 165;
                case 143 -> 52;
                case 144 -> 140;
                case 145 -> 81;
                case 146 -> 227;
                case 147 -> 87;
                case 148 -> 224;
                case 149 -> 159;
                case 150 -> 5;
                case 151 -> 23;
                case 152 -> 61;
                case 153 -> 103;
                case 154 -> 36;
                case 155 -> 168;
                case 156 -> 177;
                case 157 -> 237;
                case 158 -> 167;
                case 159 -> 220;
                case 160 -> 117;
                case 161 -> 3;
                case 162 -> 119;
                case 163 -> 136;
                case 164 -> 76;
                case 165 -> 178;
                case 166 -> 105;
                case 167 -> 37;
                case 168 -> 59;
                case 169 -> 213;
                case 170 -> 79;
                case 171 -> 92;
                case 172 -> 202;
                case 173 -> 118;
                case 174 -> 94;
                case 175 -> 102;
                case 176 -> 210;
                case 177 -> 93;
                case 178 -> 175;
                case 179 -> 125;
                case 180 -> 191;
                case 181 -> 58;
                case 182 -> 4;
                case 183 -> 49;
                case 184 -> 226;
                case 185 -> 171;
                case 186 -> 15;
                case 187 -> 218;
                case 188 -> 27;
                case 189 -> 204;
                case 190 -> 223;
                case 191 -> 182;
                case 192 -> 96;
                case 193 -> 215;
                case 194 -> 247;
                case 195 -> 145;
                case 196 -> 1;
                case 197 -> 75;
                case 198 -> 18;
                case 199 -> 65;
                case 200 -> 205;
                case 201 -> 161;
                case 202 -> 9;
                case 203 -> 255;
                case 204 -> 83;
                case 205 -> 68;
                case 206 -> 170;
                case 207 -> 155;
                case 208 -> 143;
                case 209 -> 95;
                case 210 -> 132;
                case 211 -> 235;
                case 212 -> 46;
                case 213 -> 55;
                case 214 -> 174;
                case 215 -> 206;
                case 216 -> 203;
                case 217 -> 166;
                case 218 -> 38;
                case 219 -> 194;
                case 220 -> 7;
                case 221 -> 108;
                case 222 -> 244;
                case 223 -> 146;
                case 224 -> 156;
                case 225 -> 216;
                case 226 -> 90;
                case 227 -> 98;
                case 228 -> 78;
                case 229 -> 183;
                case 230 -> 43;
                case 231 -> 234;
                case 232 -> 63;
                case 233 -> 121;
                case 234 -> 107;
                case 235 -> 243;
                case 236 -> 28;
                case 237 -> 12;
                case 238 -> 21;
                case 239 -> 67;
                case 240 -> 123;
                case 241 -> 62;
                case 242 -> 60;
                case 243 -> 188;
                case 244 -> 14;
                case 245 -> 109;
                case 246 -> 74;
                case 247 -> 50;
                case 248 -> 144;
                case 249 -> 148;
                case 250 -> 114;
                case 251 -> 253;
                case 252 -> 19;
                case 253 -> 250;
                case 254 -> 69;
                default -> 249;
            };
            int n15 = (n11 & 0xFF) - n14;
            if (n15 < 0) {
                n15 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n14) < 0) {
                n13 += 256;
            }
            int n16 = 0;
            while (n16 < cArray.length) {
                int n17 = n16 % 2;
                int n18 = n16;
                char[] cArray2 = cArray;
                char c2 = cArray[n18];
                if (n17 == 0) {
                    cArray2[n18] = (char)(c2 ^ n15);
                    n15 = ((n15 >>> 3 | n15 << 5) ^ cArray[n16]) & 0xFF;
                } else {
                    cArray2[n18] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n16]) & 0xFF;
                }
                ++n16;
            }
            x1.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }
}

