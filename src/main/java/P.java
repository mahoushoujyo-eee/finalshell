/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class P {
    WI I = null;
    public int w = 0;
    int y = (int)c;
    UR F;
    o__0 Z = null;
    boolean u = false;
    Object e = new Object();
    boolean T = false;
    public HashMap J = new HashMap();
    boolean B = false;
    Object W = new Object();
    Object k = new Object();
    public InetAddress R;
    public int D;
    public int M = 0;
    int K = -1;
    boolean l = false;
    int Q = 0;
    int q = -1;
    int N = 0;
    br_1 t;
    int V = 0;
    static Random C;
    long i = d;
    boolean s = false;
    boolean G = false;
    static int m;
    Object z = new Object();
    private static final String[] a;
    private static final String[] b;
    private static final long c;
    private static final long d;

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    var9 = new String[2];
                    var7_1 = 0;
                    var6_2 = "\u009d|\u009a\u8f2d\u6354\u5d3b\u65a3\u5fc5O\u00bc*\u00c2\u00cbD\u00cf\u00f4\ty\u0007\u0006\u8f42\u63c7\u5dd6\u7eb3\u510b\u95fd";
                    var8_3 = "\u009d|\u009a\u8f2d\u6354\u5d3b\u65a3\u5fc5O\u00bc*\u00c2\u00cbD\u00cf\u00f4\ty\u0007\u0006\u8f42\u63c7\u5dd6\u7eb3\u510b\u95fd".length();
                    var5_4 = 16;
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
                    v4 = 54;
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
                                    v11 = 92;
                                    break;
                                }
                                case 1: {
                                    v11 = 33;
                                    break;
                                }
                                case 2: {
                                    v11 = 26;
                                    break;
                                }
                                case 3: {
                                    v11 = 100;
                                    break;
                                }
                                case 4: {
                                    v11 = 75;
                                    break;
                                }
                                case 5: {
                                    v11 = 21;
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
                P.a = var9;
                P.b = new String[2];
                break block16;
lbl78:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var2_7 = 3286998495121616705L;
            ** while (true)
            P.c = 1025758631082569509L ^ var2_7;
            break block17;
lbl88:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_8 = 3006239151296201487L;
        ** while (true)
        P.d = -3006239151296201488L ^ var0_8;
        P.C = new Random();
        P.m = 0;
    }

    P(UR uR2) {
        this.F = uR2;
        this.t = new br_1(uR2);
        this.Z = uR2.e;
        this.R = uR2.s;
        this.D = uR2.f;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void i(byte[] byArray, int n10, int n11) throws pV, InterruptedException {
        block20: {
            int n12;
            int n13;
            String[] stringArray;
            int n14;
            int n15;
            block18: {
                int n16;
                block16: {
                    block17: {
                        block15: {
                            n15 = yh_0.e;
                            n14 = n11 / n15;
                            stringArray = QI.N();
                            try {
                                n16 = n11 % n15;
                                if (stringArray == null) break block15;
                                if (n16 != 0) {
                                    // empty if block
                                }
                            }
                            catch (pV pV2) {
                                throw P.a(pV2);
                            }
                            n16 = ++n14;
                        }
                        try {
                            if (stringArray == null) break block16;
                            if (n16 != 0) break block17;
                        }
                        catch (pV pV3) {
                            throw P.a(pV3);
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
                                if (stringArray == null) break block18;
                                if (n12 > n13) break block19;
                            }
                            catch (pV pV4) {
                                throw P.a(pV4);
                            }
                            this.Y(byArray, 0, n11);
                            if (stringArray != null) break block20;
                        }
                        catch (pV pV5) {
                            throw P.a(pV5);
                        }
                    }
                    n12 = 0;
                }
                catch (pV pV6) {
                    throw P.a(pV6);
                }
            }
            int n17 = n12;
            boolean bl = true;
            do {
                block21: {
                    if (bl && !(bl = false) && stringArray != null) continue;
                    byte[] byArray2 = new byte[n13];
                    System.arraycopy(byArray, n10, byArray2, 0, n13);
                    this.Y(byArray2, 0, byArray2.length);
                    int n18 = (n10 += n15) + n13;
                    int n19 = n11;
                    if (stringArray != null) {
                        try {
                            if (n18 <= n19) break block21;
                            n18 = n11;
                            n19 = (n14 - 1) * n15;
                        }
                        catch (pV pV7) {
                            throw P.a(pV7);
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
    void Y(byte[] byArray, int n10, int n11) throws pV, InterruptedException {
        boolean bl;
        String[] stringArray;
        block25: {
            stringArray = QI.N();
            bl = this.s;
            if (stringArray == null) break block25;
            try {
                block32: {
                    if (bl) throw new pV("RDP连接已经关闭");
                    break block32;
                    catch (InterruptedException interruptedException) {
                        throw P.a(interruptedException);
                    }
                }
                bl = this.G;
            }
            catch (InterruptedException interruptedException) {
                throw P.a(interruptedException);
            }
        }
        if (bl) throw new pV("RDP连接已断开sendData");
        WI wI = new WI(this.M, byArray, 0, (short)n11, this.F.v, this.F.Y.q);
        wI.K(this.R);
        wI.S(this.D);
        Object object = this.z;
        synchronized (object) {
            this.J.put(wI.D(), wI);
        }
        object = this.k;
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
                                Object object2 = this.F.e;
                                if (stringArray != null) {
                                    block26: {
                                        try {
                                            if (((o__0)object2).E()) break block26;
                                            this.k.wait();
                                            break block26;
                                        }
                                        catch (pV pV2) {
                                            throw P.a(pV2);
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
                                    n12 = yh_0.R;
                                    if (stringArray == null) break block27;
                                    if (n12 == 0) break block28;
                                }
                                catch (InterruptedException interruptedException) {
                                    throw P.a(interruptedException);
                                }
                                bl2 = true;
                            }
                            n12 = yh_0.p;
                        }
                        try {
                            try {
                                try {
                                    if (stringArray == null) break block29;
                                    if (n12 == 0) break block30;
                                }
                                catch (InterruptedException interruptedException) {
                                    throw P.a(interruptedException);
                                }
                                int n13 = wI.D();
                                n13 = 5;
                                if (stringArray == null) break block31;
                            }
                            catch (InterruptedException interruptedException) {
                                throw P.a(interruptedException);
                            }
                            if (n14 > n13) break block30;
                        }
                        catch (InterruptedException interruptedException) {
                            throw P.a(interruptedException);
                        }
                        bl2 = true;
                    }
                    this.v(wI, false, bl2, true);
                    this.i = System.currentTimeMillis();
                    ++this.K;
                    int n13 = m;
                    n13 = wI.G().length;
                }
                n12 = n14 + n13;
            }
            try {
                m = n12;
                this.F.B.x.T(this.F, this.M);
                ++this.M;
                if (stringArray != null) return;
                throw new pV("RDP连接已断开sendData");
            }
            catch (InterruptedException interruptedException) {
                throw P.a(interruptedException);
            }
        }
    }

    public void z() {
        block3: {
            P p2;
            block4: {
                boolean bl;
                block2: {
                    String[] stringArray = QI.N();
                    bl = this.G;
                    if (stringArray == null) break block2;
                    if (bl) break block3;
                    this.G = true;
                    this.F.e.F();
                    p2 = this;
                    if (stringArray == null) break block4;
                    bl = p2.F.H;
                }
                if (bl) break block3;
                p2 = this;
            }
            p2.U();
        }
    }

    public void d() {
        block3: {
            block2: {
                String[] stringArray = QI.N();
                P p2 = this;
                if (stringArray == null) break block2;
                if (p2.G) break block3;
                p2 = this;
            }
            p2.G = true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Could not resolve type clashes
     */
    void v(WI wI, boolean bl, boolean n10, boolean bl2) {
        Object object = this.F.B.R();
        synchronized (object) {
            block18: {
                Object object2;
                String[] stringArray = QI.N();
                long l2 = System.nanoTime();
                this.F.B.J(this.F);
                wI.F(0);
                try {
                    int n11;
                    block16: {
                        block17: {
                            this.i(wI.H());
                            n11 = n10;
                            if (stringArray != null) {
                                try {
                                    if (n11 != 0) {
                                        this.i(wI.H());
                                    }
                                }
                                catch (IOException iOException) {
                                    throw P.a(iOException);
                                }
                                n11 = bl2;
                            }
                            if (stringArray == null) break block16;
                            try {
                                block19: {
                                    if (n11 == 0) break block17;
                                    break block19;
                                    catch (IOException iOException) {
                                        throw P.a(iOException);
                                    }
                                }
                                this.F.B.z(l2, wI.G().length);
                            }
                            catch (IOException iOException) {
                                throw P.a(iOException);
                            }
                        }
                        try {
                            object2 = this.F.Y;
                            if (stringArray == null) break block18;
                            n11 = ((QI)object2).g;
                        }
                        catch (IOException iOException) {
                            throw P.a(iOException);
                        }
                    }
                    if (n11 == QI.w) {
                        uy_0 uy_02 = new uy_0("", C.nextLong(), wI.G().length, uy_0.T);
                        QI.V(uy_02);
                    }
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
                object2 = object;
            }
            // ** MonitorExit[v4] (shouldn't be in output)
            return;
        }
    }

    void e(int n10) {
        this.F.Y.Q.Q(this.F, n10);
    }

    void N() {
        this.F.Y.Q.u(this.F);
    }

    WI e(int n10) {
        return (WI)this.J.get(n10);
    }

    public void u(int n10, int n11) {
        block5: {
            int n12;
            WI wI;
            block7: {
                String[] stringArray;
                block6: {
                    Integer n13;
                    HashMap hashMap;
                    block4: {
                        stringArray = QI.N();
                        hashMap = this.J;
                        n13 = n10;
                        if (stringArray == null) break block4;
                        if (!hashMap.containsKey(n13)) break block5;
                        hashMap = this.J;
                        n13 = n10;
                    }
                    wI = (WI)hashMap.get(n13);
                    if (stringArray == null) break block6;
                    if (wI == null) break block5;
                    this.v(wI, true, false, true);
                }
                n12 = yh_0.n;
                if (stringArray == null) break block7;
                if (n12 == 0) break block5;
                n12 = n11;
            }
            if (n12 <= 1) {
                this.v(wI, true, false, true);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void w() {
        Object object = this.z;
        synchronized (object) {
            this.J.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void b(int n10) {
        Object object = this.z;
        synchronized (object) {
            WI wI = (WI)this.J.remove(n10);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void h() {
        Object object = this.k;
        synchronized (object) {
            this.k.notifyAll();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void V() {
        block6: {
            block5: {
                String[] stringArray;
                Object object = this.k;
                synchronized (object) {
                    stringArray = QI.N();
                    this.k.notifyAll();
                }
                P p2 = this;
                if (stringArray == null) break block5;
                if (p2.s) break block6;
                p2 = this;
            }
            p2.s = true;
        }
    }

    /*
     * Unable to fully structure code
     */
    void U() {
        v0 = QI.N();
        var2_1 = new W3(this.F.v, this.F.Y.q, this.M);
        var2_1.K(this.R);
        var2_1.S(this.D);
        var1_2 = v0;
        var3_3 = 0;
        if (var1_2 != null) ** GOTO lbl16
        block2: while (true) {
            try {
                this.i(var2_1.H());
            }
            catch (IOException var4_4) {
                var4_4.printStackTrace();
            }
            do {
                ++var3_3;
lbl16:
                // 2 sources

                if (var3_3 < 4) continue block2;
            } while (var1_2 == null);
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    void F() {
        var2_1 = new WJ(this.F.v, this.F.Y.q);
        var1_2 = QI.N();
        var2_1.K(this.R);
        var2_1.S(this.D);
        var3_3 = 0;
        if (var1_2 != null) ** GOTO lbl15
        block2: while (true) {
            try {
                this.i(var2_1.H());
            }
            catch (IOException var4_4) {
                var4_4.printStackTrace();
            }
            do {
                ++var3_3;
lbl15:
                // 2 sources

                if (var3_3 < 4) continue block2;
            } while (var1_2 == null);
            break;
        }
    }

    void s(ArrayList arrayList) {
        boolean bl = false;
        boolean bl2 = false;
        int n10 = this.F.e.R();
        W0 w0 = new W0(this.F.C, arrayList, this.F.e.k, n10, this.F.v, this.F.Y.q);
        w0.K(this.R);
        w0.S(this.D);
        try {
            this.i(w0.H());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    void i(DatagramPacket datagramPacket) throws IOException {
        this.r(datagramPacket, this.F.v);
    }

    public void r(DatagramPacket datagramPacket, Integer n10) throws IOException {
        this.F.B.P(datagramPacket);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF9E8A) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 254;
                    break;
                }
                case 1: {
                    n14 = 90;
                    break;
                }
                case 2: {
                    n14 = 37;
                    break;
                }
                case 3: {
                    n14 = 195;
                    break;
                }
                case 4: {
                    n14 = 237;
                    break;
                }
                case 5: {
                    n14 = 25;
                    break;
                }
                case 6: {
                    n14 = 235;
                    break;
                }
                case 7: {
                    n14 = 208;
                    break;
                }
                case 8: {
                    n14 = 125;
                    break;
                }
                case 9: {
                    n14 = 251;
                    break;
                }
                case 10: {
                    n14 = 245;
                    break;
                }
                case 11: {
                    n14 = 133;
                    break;
                }
                case 12: {
                    n14 = 38;
                    break;
                }
                case 13: {
                    n14 = 168;
                    break;
                }
                case 14: {
                    n14 = 12;
                    break;
                }
                case 15: {
                    n14 = 167;
                    break;
                }
                case 16: {
                    n14 = 101;
                    break;
                }
                case 17: {
                    n14 = 200;
                    break;
                }
                case 18: {
                    n14 = 187;
                    break;
                }
                case 19: {
                    n14 = 110;
                    break;
                }
                case 20: {
                    n14 = 179;
                    break;
                }
                case 21: {
                    n14 = 10;
                    break;
                }
                case 22: {
                    n14 = 43;
                    break;
                }
                case 23: {
                    n14 = 156;
                    break;
                }
                case 24: {
                    n14 = 226;
                    break;
                }
                case 25: {
                    n14 = 120;
                    break;
                }
                case 26: {
                    n14 = 150;
                    break;
                }
                case 27: {
                    n14 = 189;
                    break;
                }
                case 28: {
                    n14 = 14;
                    break;
                }
                case 29: {
                    n14 = 48;
                    break;
                }
                case 30: {
                    n14 = 9;
                    break;
                }
                case 31: {
                    n14 = 26;
                    break;
                }
                case 32: {
                    n14 = 13;
                    break;
                }
                case 33: {
                    n14 = 73;
                    break;
                }
                case 34: {
                    n14 = 155;
                    break;
                }
                case 35: {
                    n14 = 143;
                    break;
                }
                case 36: {
                    n14 = 123;
                    break;
                }
                case 37: {
                    n14 = 207;
                    break;
                }
                case 38: {
                    n14 = 198;
                    break;
                }
                case 39: {
                    n14 = 217;
                    break;
                }
                case 40: {
                    n14 = 247;
                    break;
                }
                case 41: {
                    n14 = 84;
                    break;
                }
                case 42: {
                    n14 = 202;
                    break;
                }
                case 43: {
                    n14 = 40;
                    break;
                }
                case 44: {
                    n14 = 191;
                    break;
                }
                case 45: {
                    n14 = 8;
                    break;
                }
                case 46: {
                    n14 = 39;
                    break;
                }
                case 47: {
                    n14 = 76;
                    break;
                }
                case 48: {
                    n14 = 145;
                    break;
                }
                case 49: {
                    n14 = 88;
                    break;
                }
                case 50: {
                    n14 = 91;
                    break;
                }
                case 51: {
                    n14 = 42;
                    break;
                }
                case 52: {
                    n14 = 103;
                    break;
                }
                case 53: {
                    n14 = 132;
                    break;
                }
                case 54: {
                    n14 = 219;
                    break;
                }
                case 55: {
                    n14 = 124;
                    break;
                }
                case 56: {
                    n14 = 19;
                    break;
                }
                case 57: {
                    n14 = 87;
                    break;
                }
                case 58: {
                    n14 = 51;
                    break;
                }
                case 59: {
                    n14 = 180;
                    break;
                }
                case 60: {
                    n14 = 96;
                    break;
                }
                case 61: {
                    n14 = 182;
                    break;
                }
                case 62: {
                    n14 = 227;
                    break;
                }
                case 63: {
                    n14 = 64;
                    break;
                }
                case 64: {
                    n14 = 253;
                    break;
                }
                case 65: {
                    n14 = 236;
                    break;
                }
                case 66: {
                    n14 = 49;
                    break;
                }
                case 67: {
                    n14 = 240;
                    break;
                }
                case 68: {
                    n14 = 242;
                    break;
                }
                case 69: {
                    n14 = 252;
                    break;
                }
                case 70: {
                    n14 = 144;
                    break;
                }
                case 71: {
                    n14 = 186;
                    break;
                }
                case 72: {
                    n14 = 146;
                    break;
                }
                case 73: {
                    n14 = 3;
                    break;
                }
                case 74: {
                    n14 = 199;
                    break;
                }
                case 75: {
                    n14 = 2;
                    break;
                }
                case 76: {
                    n14 = 157;
                    break;
                }
                case 77: {
                    n14 = 255;
                    break;
                }
                case 78: {
                    n14 = 17;
                    break;
                }
                case 79: {
                    n14 = 72;
                    break;
                }
                case 80: {
                    n14 = 194;
                    break;
                }
                case 81: {
                    n14 = 21;
                    break;
                }
                case 82: {
                    n14 = 83;
                    break;
                }
                case 83: {
                    n14 = 220;
                    break;
                }
                case 84: {
                    n14 = 126;
                    break;
                }
                case 85: {
                    n14 = 23;
                    break;
                }
                case 86: {
                    n14 = 95;
                    break;
                }
                case 87: {
                    n14 = 99;
                    break;
                }
                case 88: {
                    n14 = 249;
                    break;
                }
                case 89: {
                    n14 = 129;
                    break;
                }
                case 90: {
                    n14 = 98;
                    break;
                }
                case 91: {
                    n14 = 63;
                    break;
                }
                case 92: {
                    n14 = 135;
                    break;
                }
                case 93: {
                    n14 = 5;
                    break;
                }
                case 94: {
                    n14 = 188;
                    break;
                }
                case 95: {
                    n14 = 193;
                    break;
                }
                case 96: {
                    n14 = 113;
                    break;
                }
                case 97: {
                    n14 = 46;
                    break;
                }
                case 98: {
                    n14 = 232;
                    break;
                }
                case 99: {
                    n14 = 102;
                    break;
                }
                case 100: {
                    n14 = 216;
                    break;
                }
                case 101: {
                    n14 = 16;
                    break;
                }
                case 102: {
                    n14 = 203;
                    break;
                }
                case 103: {
                    n14 = 209;
                    break;
                }
                case 104: {
                    n14 = 170;
                    break;
                }
                case 105: {
                    n14 = 107;
                    break;
                }
                case 106: {
                    n14 = 97;
                    break;
                }
                case 107: {
                    n14 = 141;
                    break;
                }
                case 108: {
                    n14 = 213;
                    break;
                }
                case 109: {
                    n14 = 70;
                    break;
                }
                case 110: {
                    n14 = 223;
                    break;
                }
                case 111: {
                    n14 = 153;
                    break;
                }
                case 112: {
                    n14 = 162;
                    break;
                }
                case 113: {
                    n14 = 53;
                    break;
                }
                case 114: {
                    n14 = 158;
                    break;
                }
                case 115: {
                    n14 = 225;
                    break;
                }
                case 116: {
                    n14 = 112;
                    break;
                }
                case 117: {
                    n14 = 178;
                    break;
                }
                case 118: {
                    n14 = 44;
                    break;
                }
                case 119: {
                    n14 = 233;
                    break;
                }
                case 120: {
                    n14 = 67;
                    break;
                }
                case 121: {
                    n14 = 71;
                    break;
                }
                case 122: {
                    n14 = 117;
                    break;
                }
                case 123: {
                    n14 = 45;
                    break;
                }
                case 124: {
                    n14 = 106;
                    break;
                }
                case 125: {
                    n14 = 138;
                    break;
                }
                case 126: {
                    n14 = 62;
                    break;
                }
                case 127: {
                    n14 = 222;
                    break;
                }
                case 128: {
                    n14 = 66;
                    break;
                }
                case 129: {
                    n14 = 160;
                    break;
                }
                case 130: {
                    n14 = 206;
                    break;
                }
                case 131: {
                    n14 = 36;
                    break;
                }
                case 132: {
                    n14 = 52;
                    break;
                }
                case 133: {
                    n14 = 214;
                    break;
                }
                case 134: {
                    n14 = 171;
                    break;
                }
                case 135: {
                    n14 = 234;
                    break;
                }
                case 136: {
                    n14 = 29;
                    break;
                }
                case 137: {
                    n14 = 41;
                    break;
                }
                case 138: {
                    n14 = 174;
                    break;
                }
                case 139: {
                    n14 = 104;
                    break;
                }
                case 140: {
                    n14 = 61;
                    break;
                }
                case 141: {
                    n14 = 212;
                    break;
                }
                case 142: {
                    n14 = 154;
                    break;
                }
                case 143: {
                    n14 = 241;
                    break;
                }
                case 144: {
                    n14 = 0;
                    break;
                }
                case 145: {
                    n14 = 204;
                    break;
                }
                case 146: {
                    n14 = 82;
                    break;
                }
                case 147: {
                    n14 = 130;
                    break;
                }
                case 148: {
                    n14 = 114;
                    break;
                }
                case 149: {
                    n14 = 111;
                    break;
                }
                case 150: {
                    n14 = 85;
                    break;
                }
                case 151: {
                    n14 = 75;
                    break;
                }
                case 152: {
                    n14 = 183;
                    break;
                }
                case 153: {
                    n14 = 159;
                    break;
                }
                case 154: {
                    n14 = 201;
                    break;
                }
                case 155: {
                    n14 = 127;
                    break;
                }
                case 156: {
                    n14 = 11;
                    break;
                }
                case 157: {
                    n14 = 197;
                    break;
                }
                case 158: {
                    n14 = 239;
                    break;
                }
                case 159: {
                    n14 = 6;
                    break;
                }
                case 160: {
                    n14 = 136;
                    break;
                }
                case 161: {
                    n14 = 196;
                    break;
                }
                case 162: {
                    n14 = 68;
                    break;
                }
                case 163: {
                    n14 = 192;
                    break;
                }
                case 164: {
                    n14 = 33;
                    break;
                }
                case 165: {
                    n14 = 230;
                    break;
                }
                case 166: {
                    n14 = 1;
                    break;
                }
                case 167: {
                    n14 = 231;
                    break;
                }
                case 168: {
                    n14 = 47;
                    break;
                }
                case 169: {
                    n14 = 94;
                    break;
                }
                case 170: {
                    n14 = 137;
                    break;
                }
                case 171: {
                    n14 = 34;
                    break;
                }
                case 172: {
                    n14 = 131;
                    break;
                }
                case 173: {
                    n14 = 244;
                    break;
                }
                case 174: {
                    n14 = 243;
                    break;
                }
                case 175: {
                    n14 = 121;
                    break;
                }
                case 176: {
                    n14 = 148;
                    break;
                }
                case 177: {
                    n14 = 169;
                    break;
                }
                case 178: {
                    n14 = 175;
                    break;
                }
                case 179: {
                    n14 = 60;
                    break;
                }
                case 180: {
                    n14 = 86;
                    break;
                }
                case 181: {
                    n14 = 176;
                    break;
                }
                case 182: {
                    n14 = 108;
                    break;
                }
                case 183: {
                    n14 = 55;
                    break;
                }
                case 184: {
                    n14 = 164;
                    break;
                }
                case 185: {
                    n14 = 248;
                    break;
                }
                case 186: {
                    n14 = 228;
                    break;
                }
                case 187: {
                    n14 = 173;
                    break;
                }
                case 188: {
                    n14 = 89;
                    break;
                }
                case 189: {
                    n14 = 30;
                    break;
                }
                case 190: {
                    n14 = 177;
                    break;
                }
                case 191: {
                    n14 = 100;
                    break;
                }
                case 192: {
                    n14 = 122;
                    break;
                }
                case 193: {
                    n14 = 185;
                    break;
                }
                case 194: {
                    n14 = 250;
                    break;
                }
                case 195: {
                    n14 = 109;
                    break;
                }
                case 196: {
                    n14 = 184;
                    break;
                }
                case 197: {
                    n14 = 81;
                    break;
                }
                case 198: {
                    n14 = 65;
                    break;
                }
                case 199: {
                    n14 = 205;
                    break;
                }
                case 200: {
                    n14 = 215;
                    break;
                }
                case 201: {
                    n14 = 134;
                    break;
                }
                case 202: {
                    n14 = 78;
                    break;
                }
                case 203: {
                    n14 = 119;
                    break;
                }
                case 204: {
                    n14 = 77;
                    break;
                }
                case 205: {
                    n14 = 142;
                    break;
                }
                case 206: {
                    n14 = 74;
                    break;
                }
                case 207: {
                    n14 = 172;
                    break;
                }
                case 208: {
                    n14 = 28;
                    break;
                }
                case 209: {
                    n14 = 31;
                    break;
                }
                case 210: {
                    n14 = 165;
                    break;
                }
                case 211: {
                    n14 = 54;
                    break;
                }
                case 212: {
                    n14 = 27;
                    break;
                }
                case 213: {
                    n14 = 151;
                    break;
                }
                case 214: {
                    n14 = 211;
                    break;
                }
                case 215: {
                    n14 = 116;
                    break;
                }
                case 216: {
                    n14 = 59;
                    break;
                }
                case 217: {
                    n14 = 7;
                    break;
                }
                case 218: {
                    n14 = 118;
                    break;
                }
                case 219: {
                    n14 = 80;
                    break;
                }
                case 220: {
                    n14 = 210;
                    break;
                }
                case 221: {
                    n14 = 149;
                    break;
                }
                case 222: {
                    n14 = 238;
                    break;
                }
                case 223: {
                    n14 = 140;
                    break;
                }
                case 224: {
                    n14 = 4;
                    break;
                }
                case 225: {
                    n14 = 56;
                    break;
                }
                case 226: {
                    n14 = 139;
                    break;
                }
                case 227: {
                    n14 = 190;
                    break;
                }
                case 228: {
                    n14 = 152;
                    break;
                }
                case 229: {
                    n14 = 161;
                    break;
                }
                case 230: {
                    n14 = 93;
                    break;
                }
                case 231: {
                    n14 = 246;
                    break;
                }
                case 232: {
                    n14 = 15;
                    break;
                }
                case 233: {
                    n14 = 22;
                    break;
                }
                case 234: {
                    n14 = 18;
                    break;
                }
                case 235: {
                    n14 = 50;
                    break;
                }
                case 236: {
                    n14 = 35;
                    break;
                }
                case 237: {
                    n14 = 20;
                    break;
                }
                case 238: {
                    n14 = 58;
                    break;
                }
                case 239: {
                    n14 = 224;
                    break;
                }
                case 240: {
                    n14 = 92;
                    break;
                }
                case 241: {
                    n14 = 229;
                    break;
                }
                case 242: {
                    n14 = 218;
                    break;
                }
                case 243: {
                    n14 = 69;
                    break;
                }
                case 244: {
                    n14 = 181;
                    break;
                }
                case 245: {
                    n14 = 105;
                    break;
                }
                case 246: {
                    n14 = 24;
                    break;
                }
                case 247: {
                    n14 = 79;
                    break;
                }
                case 248: {
                    n14 = 115;
                    break;
                }
                case 249: {
                    n14 = 57;
                    break;
                }
                case 250: {
                    n14 = 163;
                    break;
                }
                case 251: {
                    n14 = 128;
                    break;
                }
                case 252: {
                    n14 = 32;
                    break;
                }
                case 253: {
                    n14 = 221;
                    break;
                }
                case 254: {
                    n14 = 166;
                    break;
                }
                default: {
                    n14 = 147;
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
            P.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

