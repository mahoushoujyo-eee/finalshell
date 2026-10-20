/*
 * Decompiled with CFR 0.152.
 */
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;

/*
 * Renamed from o_
 */
public class o__0 {
    UR r;
    P g;
    public InetAddress O;
    public int U;
    HashMap x = new HashMap();
    int k = -1;
    int i = -1;
    Object G = new Object();
    boolean D = false;
    Object u = new Object();
    byte[] S = new byte[4];
    int Y = 0;
    int h = (int)e;
    int A = -1;
    br_2 n;
    float M = yh_0.D;
    int Z;
    int J;
    boolean d = false;
    boolean c = false;
    static int q;
    static int W;
    boolean C = false;
    public int T;
    long V;
    private static final String[] a;
    private static final String[] b;
    private static final long e;

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            block14: {
                var7 = new String[3];
                var5_1 = 0;
                var4_2 = "\u8fe6\u6312\u671c\u5e26\u7ae4\f\u8f2b\u6388\u5d7d\u6522\u5fc0L\u00ac_Sh\u0089\u00a2\u0005\u8fed\u6342\u5da5\u657b\u5fdb";
                var6_3 = "\u8fe6\u6312\u671c\u5e26\u7ae4\f\u8f2b\u6388\u5d7d\u6522\u5fc0L\u00ac_Sh\u0089\u00a2\u0005\u8fed\u6342\u5da5\u657b\u5fdb".length();
                var3_4 = 5;
                var2_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    var7[var5_1++] = new String(v0).intern();
                    if ((var2_5 += var3_4) < var6_3) {
                        var3_4 = var4_2.charAt(var2_5);
                        ** continue;
                    }
                    break block14;
                    break;
                }
                v1 = ++var2_5;
                v2 = var4_2.substring(v1, v1 + var3_4).toCharArray();
                v3 = v2.length;
                var8_6 = 0;
                v4 = 93;
                v5 = v2;
                v6 = v3;
                if (v3 > 1) ** GOTO lbl67
                do {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v11 = 1;
                                break;
                            }
                            case 1: {
                                v11 = 48;
                                break;
                            }
                            case 2: {
                                v11 = 57;
                                break;
                            }
                            case 3: {
                                v11 = 127;
                                break;
                            }
                            case 4: {
                                v11 = 18;
                                break;
                            }
                            case 5: {
                                v11 = 106;
                                break;
                            }
                            default: {
                                v11 = 99;
                            }
                        }
                        v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                        ++var8_6;
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
                } while (v6 > var8_6);
                ** while (true)
            }
            o__0.a = var7;
            o__0.b = new String[3];
            break block15;
lbl78:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 6405138812213857662L;
        ** while (true)
        o__0.e = 8905028834702855540L ^ var0_7;
        o__0.q = 0;
    }

    o__0(UR uR2) {
        this.r = uR2;
        this.n = new br_2(uR2);
        this.g = uR2.z;
        this.O = uR2.s;
        this.U = uR2.f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public byte[] n() throws pV {
        block24: {
            block23: {
                var2_1 = null;
                var1_2 = QI.N();
                v0 /* !! */  = this.r;
                if (var1_2 == null) break block23;
                try {
                    block30: {
                        if (!v0 /* !! */ .V()) break block24;
                        break block30;
                        catch (InterruptedException v1) {
                            throw o__0.a(v1);
                        }
                    }
                    v0 /* !! */  = this.x.get(this.k + 1);
                }
                catch (InterruptedException v2) {
                    throw o__0.a(v2);
                }
            }
            var2_1 = (WI)v0 /* !! */ ;
            var3_3 = this.G;
            synchronized (var3_3) {
                v3 = var2_1;
                if (var1_2 != null) {
                    block25: {
                        block26: {
                            try {
                                if (v3 != null) break block25;
                                this.G.wait();
                                break block26;
                            }
                            catch (pV v4) {
                                throw o__0.a(v4);
                            }
                            {
                                catch (InterruptedException var4_4) {
                                    var4_4.printStackTrace();
                                }
                            }
                        }
                        var2_1 = (WI)this.x.get(this.k + 1);
                    }
                    v3 = var3_3;
                }
                // ** MonitorExit[v3] (shouldn't be in output)
            }
        }
        throw new pV("连接未建立");
        {
            block28: {
                block29: {
                    block27: {
                        v6 = this;
                        if (var1_2 == null) break block27;
                        try {
                            block31: {
                                if (v6.d) break block28;
                                break block31;
                                catch (InterruptedException v7) {
                                    throw o__0.a(v7);
                                }
                            }
                            v6 = this;
                        }
                        catch (InterruptedException v8) {
                            throw o__0.a(v8);
                        }
                    }
                    v6.Z();
                    v9 = var2_1;
                    if (var1_2 == null) ** GOTO lbl78
                    try {
                        block32: {
                            if (v9 != null) break block29;
                            break block32;
                            catch (InterruptedException v10) {
                                throw o__0.a(v10);
                            }
                        }
                        throw new pV("连接已断开ccccccc");
                    }
                    catch (InterruptedException v11) {
                        throw o__0.a(v11);
                    }
                }
                this.r.z.N();
                ++this.k;
                var3_3 = this.G;
                synchronized (var3_3) {
                    this.x.remove(var2_1.D());
                    v9 = var3_3;
lbl78:
                    // 2 sources

                    // ** MonitorExit[v9] (shouldn't be in output)
                    this.V += (long)var2_1.G().length;
                    return var2_1.G();
                }
            }
            throw new pV("连接已断开");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void s(DatagramPacket var1_1) {
        block22: {
            block23: {
                block20: {
                    block21: {
                        block17: {
                            block18: {
                                block19: {
                                    block16: {
                                        block15: {
                                            var2_2 = QI.N();
                                            if (var1_1 == null) ** GOTO lbl93
                                            v0 = this.r.V();
                                            if (var2_2 == null) break block15;
                                            if (v0 == 0) ** GOTO lbl93
                                            v0 = ca_1.I(var1_1);
                                        }
                                        var4_3 = v0;
                                        var5_4 = ca_1.m(var1_1);
                                        v1 = var4_3;
                                        v2 = yh_0.i;
                                        if (var2_2 == null) break block16;
                                        if (v1 != v2) ** GOTO lbl93
                                        this.r.g();
                                        v1 = var5_4;
                                        v2 = D6.nu;
                                    }
                                    if (var2_2 == null) break block17;
                                    if (v1 != v2) break block18;
                                    var3_5 = new WI(var1_1);
                                    var6_6 = var3_5.D();
                                    v3 = this.r.z;
                                    v4 = var3_5;
                                    if (var2_2 == null) break block19;
                                    v3.e(v4.D());
                                    if (var6_6 <= this.k) ** GOTO lbl93
                                    v5 = this.G;
                                    v4 = v5;
                                    v3 = v5;
                                }
                                var7_10 = v4;
                                synchronized (v3) {
                                    this.x.put(var6_6, var3_5);
                                    v6 = this.x;
                                    if (var2_2 != null) {
                                        if (v6.containsKey(this.k + 1)) {
                                            this.G.notify();
                                        }
                                        v6 = var7_10;
                                    }
                                    // ** MonitorExit[v6] (shouldn't be in output)
                                }
                            }
                            v1 = var5_4;
                            v2 = D6.f;
                        }
                        if (var2_2 == null) break block20;
                        if (v1 != v2) break block21;
                        var6_7 = System.currentTimeMillis();
                        var8_12 = new W0(var1_1);
                        var9_13 = var8_12.H();
                        if (var9_13 > this.A) {
                            this.A = var9_13;
                        }
                        var10_14 = var8_12.D();
                        var11_15 = 0;
                        if (var2_2 != null) ** GOTO lbl67
                        block3: while (true) {
                            v8 = (Integer)var10_14.get(var11_15);
                            do {
                                var12_17 = v8;
                                this.r.z.b(var12_17);
                                ++var11_15;
lbl67:
                                // 2 sources

                                if (var11_15 < var10_14.size()) continue block3;
                                v8 = (int)this.E();
                            } while (var2_2 == null);
                            break;
                        }
                        if (v8 == 0) ** GOTO lbl93
                        var11_16 = System.currentTimeMillis();
                        this.r.z.h();
                        var13_18 = (int)(System.currentTimeMillis() - var11_16);
                        if (var2_2 != null) ** GOTO lbl93
                    }
                    v1 = var5_4;
                    v2 = D6.nD;
                }
                if (var2_2 == null) break block22;
                if (v1 != v2) break block23;
                var6_8 = new W3(var1_1);
                this.c = true;
                var7_11 = var6_8.r();
                this.V(var7_11);
                if (var2_2 != null) ** GOTO lbl93
            }
            v1 = var5_4;
            v2 = D6.X;
        }
        if (v1 == v2) {
            var6_9 = new WJ(var1_1);
            this.r.d();
        }
lbl93:
        // 11 sources

    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void J() {
        Object object = this.G;
        synchronized (object) {
            this.x.clear();
        }
    }

    boolean E() {
        this.T = this.r.z.K - this.A;
        String[] stringArray = QI.N();
        boolean bl = false;
        float f10 = (float)this.T - this.M;
        float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (stringArray != null) {
            if (f11 < 0) {
                bl = true;
            }
            f11 = (float)bl;
        }
        return (boolean)f11;
    }

    void V(int n10) {
        block3: {
            o__0 o__02;
            block2: {
                this.J = n10;
                String[] stringArray = QI.N();
                o__02 = this;
                if (stringArray == null) break block2;
                if (o__02.d) break block3;
                o__02 = this;
            }
            o__02.Z();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void Z() {
        Object object;
        block8: {
            int n10;
            block7: {
                String[] stringArray = QI.N();
                n10 = this.d;
                if (stringArray != null) {
                    if (n10 != 0) return;
                    n10 = this.c;
                }
                if (stringArray == null) break block7;
                if (n10 == 0) return;
                object = this;
                if (stringArray == null) break block8;
                n10 = ((o__0)object).k;
            }
            if (n10 < this.J - 1) return;
            this.d = true;
            object = this.G;
        }
        o__0 o__02 = object;
        synchronized (object) {
            this.G.notifyAll();
            // ** MonitorExit[var2_2] (shouldn't be in output)
            this.r.z.d();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void F() {
        block5: {
            int n10;
            block4: {
                String[] stringArray = QI.N();
                n10 = this.d;
                if (stringArray == null) break block4;
                if (n10 != 0) break block5;
                n10 = W + 1;
            }
            W = n10;
            this.d = true;
            Object object = this.G;
            synchronized (object) {
                this.G.notifyAll();
            }
            this.r.z.z();
        }
    }

    public int R() {
        return this.Z;
    }

    public void A(int n10) {
        this.Z = n10;
    }

    public int e() {
        return this.J;
    }

    public void E(int n10) {
        this.J = n10;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x6844) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 12;
                    break;
                }
                case 1: {
                    n14 = 96;
                    break;
                }
                case 2: {
                    n14 = 251;
                    break;
                }
                case 3: {
                    n14 = 149;
                    break;
                }
                case 4: {
                    n14 = 158;
                    break;
                }
                case 5: {
                    n14 = 226;
                    break;
                }
                case 6: {
                    n14 = 127;
                    break;
                }
                case 7: {
                    n14 = 170;
                    break;
                }
                case 8: {
                    n14 = 228;
                    break;
                }
                case 9: {
                    n14 = 87;
                    break;
                }
                case 10: {
                    n14 = 234;
                    break;
                }
                case 11: {
                    n14 = 224;
                    break;
                }
                case 12: {
                    n14 = 43;
                    break;
                }
                case 13: {
                    n14 = 63;
                    break;
                }
                case 14: {
                    n14 = 14;
                    break;
                }
                case 15: {
                    n14 = 145;
                    break;
                }
                case 16: {
                    n14 = 129;
                    break;
                }
                case 17: {
                    n14 = 246;
                    break;
                }
                case 18: {
                    n14 = 131;
                    break;
                }
                case 19: {
                    n14 = 163;
                    break;
                }
                case 20: {
                    n14 = 221;
                    break;
                }
                case 21: {
                    n14 = 73;
                    break;
                }
                case 22: {
                    n14 = 133;
                    break;
                }
                case 23: {
                    n14 = 0;
                    break;
                }
                case 24: {
                    n14 = 172;
                    break;
                }
                case 25: {
                    n14 = 48;
                    break;
                }
                case 26: {
                    n14 = 218;
                    break;
                }
                case 27: {
                    n14 = 227;
                    break;
                }
                case 28: {
                    n14 = 19;
                    break;
                }
                case 29: {
                    n14 = 117;
                    break;
                }
                case 30: {
                    n14 = 196;
                    break;
                }
                case 31: {
                    n14 = 33;
                    break;
                }
                case 32: {
                    n14 = 46;
                    break;
                }
                case 33: {
                    n14 = 24;
                    break;
                }
                case 34: {
                    n14 = 70;
                    break;
                }
                case 35: {
                    n14 = 239;
                    break;
                }
                case 36: {
                    n14 = 230;
                    break;
                }
                case 37: {
                    n14 = 242;
                    break;
                }
                case 38: {
                    n14 = 8;
                    break;
                }
                case 39: {
                    n14 = 201;
                    break;
                }
                case 40: {
                    n14 = 65;
                    break;
                }
                case 41: {
                    n14 = 125;
                    break;
                }
                case 42: {
                    n14 = 212;
                    break;
                }
                case 43: {
                    n14 = 167;
                    break;
                }
                case 44: {
                    n14 = 245;
                    break;
                }
                case 45: {
                    n14 = 123;
                    break;
                }
                case 46: {
                    n14 = 197;
                    break;
                }
                case 47: {
                    n14 = 135;
                    break;
                }
                case 48: {
                    n14 = 200;
                    break;
                }
                case 49: {
                    n14 = 23;
                    break;
                }
                case 50: {
                    n14 = 162;
                    break;
                }
                case 51: {
                    n14 = 44;
                    break;
                }
                case 52: {
                    n14 = 45;
                    break;
                }
                case 53: {
                    n14 = 202;
                    break;
                }
                case 54: {
                    n14 = 179;
                    break;
                }
                case 55: {
                    n14 = 130;
                    break;
                }
                case 56: {
                    n14 = 219;
                    break;
                }
                case 57: {
                    n14 = 175;
                    break;
                }
                case 58: {
                    n14 = 144;
                    break;
                }
                case 59: {
                    n14 = 205;
                    break;
                }
                case 60: {
                    n14 = 241;
                    break;
                }
                case 61: {
                    n14 = 235;
                    break;
                }
                case 62: {
                    n14 = 112;
                    break;
                }
                case 63: {
                    n14 = 165;
                    break;
                }
                case 64: {
                    n14 = 62;
                    break;
                }
                case 65: {
                    n14 = 81;
                    break;
                }
                case 66: {
                    n14 = 229;
                    break;
                }
                case 67: {
                    n14 = 216;
                    break;
                }
                case 68: {
                    n14 = 54;
                    break;
                }
                case 69: {
                    n14 = 40;
                    break;
                }
                case 70: {
                    n14 = 6;
                    break;
                }
                case 71: {
                    n14 = 59;
                    break;
                }
                case 72: {
                    n14 = 210;
                    break;
                }
                case 73: {
                    n14 = 146;
                    break;
                }
                case 74: {
                    n14 = 122;
                    break;
                }
                case 75: {
                    n14 = 58;
                    break;
                }
                case 76: {
                    n14 = 61;
                    break;
                }
                case 77: {
                    n14 = 66;
                    break;
                }
                case 78: {
                    n14 = 75;
                    break;
                }
                case 79: {
                    n14 = 237;
                    break;
                }
                case 80: {
                    n14 = 118;
                    break;
                }
                case 81: {
                    n14 = 243;
                    break;
                }
                case 82: {
                    n14 = 49;
                    break;
                }
                case 83: {
                    n14 = 238;
                    break;
                }
                case 84: {
                    n14 = 143;
                    break;
                }
                case 85: {
                    n14 = 39;
                    break;
                }
                case 86: {
                    n14 = 138;
                    break;
                }
                case 87: {
                    n14 = 15;
                    break;
                }
                case 88: {
                    n14 = 204;
                    break;
                }
                case 89: {
                    n14 = 95;
                    break;
                }
                case 90: {
                    n14 = 42;
                    break;
                }
                case 91: {
                    n14 = 108;
                    break;
                }
                case 92: {
                    n14 = 60;
                    break;
                }
                case 93: {
                    n14 = 164;
                    break;
                }
                case 94: {
                    n14 = 86;
                    break;
                }
                case 95: {
                    n14 = 168;
                    break;
                }
                case 96: {
                    n14 = 32;
                    break;
                }
                case 97: {
                    n14 = 189;
                    break;
                }
                case 98: {
                    n14 = 80;
                    break;
                }
                case 99: {
                    n14 = 156;
                    break;
                }
                case 100: {
                    n14 = 100;
                    break;
                }
                case 101: {
                    n14 = 105;
                    break;
                }
                case 102: {
                    n14 = 26;
                    break;
                }
                case 103: {
                    n14 = 113;
                    break;
                }
                case 104: {
                    n14 = 13;
                    break;
                }
                case 105: {
                    n14 = 120;
                    break;
                }
                case 106: {
                    n14 = 124;
                    break;
                }
                case 107: {
                    n14 = 132;
                    break;
                }
                case 108: {
                    n14 = 231;
                    break;
                }
                case 109: {
                    n14 = 244;
                    break;
                }
                case 110: {
                    n14 = 29;
                    break;
                }
                case 111: {
                    n14 = 192;
                    break;
                }
                case 112: {
                    n14 = 199;
                    break;
                }
                case 113: {
                    n14 = 84;
                    break;
                }
                case 114: {
                    n14 = 102;
                    break;
                }
                case 115: {
                    n14 = 109;
                    break;
                }
                case 116: {
                    n14 = 111;
                    break;
                }
                case 117: {
                    n14 = 194;
                    break;
                }
                case 118: {
                    n14 = 136;
                    break;
                }
                case 119: {
                    n14 = 18;
                    break;
                }
                case 120: {
                    n14 = 7;
                    break;
                }
                case 121: {
                    n14 = 209;
                    break;
                }
                case 122: {
                    n14 = 85;
                    break;
                }
                case 123: {
                    n14 = 233;
                    break;
                }
                case 124: {
                    n14 = 20;
                    break;
                }
                case 125: {
                    n14 = 41;
                    break;
                }
                case 126: {
                    n14 = 4;
                    break;
                }
                case 127: {
                    n14 = 126;
                    break;
                }
                case 128: {
                    n14 = 119;
                    break;
                }
                case 129: {
                    n14 = 2;
                    break;
                }
                case 130: {
                    n14 = 187;
                    break;
                }
                case 131: {
                    n14 = 188;
                    break;
                }
                case 132: {
                    n14 = 71;
                    break;
                }
                case 133: {
                    n14 = 99;
                    break;
                }
                case 134: {
                    n14 = 16;
                    break;
                }
                case 135: {
                    n14 = 55;
                    break;
                }
                case 136: {
                    n14 = 250;
                    break;
                }
                case 137: {
                    n14 = 93;
                    break;
                }
                case 138: {
                    n14 = 217;
                    break;
                }
                case 139: {
                    n14 = 10;
                    break;
                }
                case 140: {
                    n14 = 37;
                    break;
                }
                case 141: {
                    n14 = 79;
                    break;
                }
                case 142: {
                    n14 = 5;
                    break;
                }
                case 143: {
                    n14 = 182;
                    break;
                }
                case 144: {
                    n14 = 141;
                    break;
                }
                case 145: {
                    n14 = 191;
                    break;
                }
                case 146: {
                    n14 = 11;
                    break;
                }
                case 147: {
                    n14 = 115;
                    break;
                }
                case 148: {
                    n14 = 186;
                    break;
                }
                case 149: {
                    n14 = 152;
                    break;
                }
                case 150: {
                    n14 = 50;
                    break;
                }
                case 151: {
                    n14 = 190;
                    break;
                }
                case 152: {
                    n14 = 220;
                    break;
                }
                case 153: {
                    n14 = 77;
                    break;
                }
                case 154: {
                    n14 = 74;
                    break;
                }
                case 155: {
                    n14 = 255;
                    break;
                }
                case 156: {
                    n14 = 151;
                    break;
                }
                case 157: {
                    n14 = 173;
                    break;
                }
                case 158: {
                    n14 = 76;
                    break;
                }
                case 159: {
                    n14 = 35;
                    break;
                }
                case 160: {
                    n14 = 254;
                    break;
                }
                case 161: {
                    n14 = 148;
                    break;
                }
                case 162: {
                    n14 = 90;
                    break;
                }
                case 163: {
                    n14 = 208;
                    break;
                }
                case 164: {
                    n14 = 157;
                    break;
                }
                case 165: {
                    n14 = 28;
                    break;
                }
                case 166: {
                    n14 = 114;
                    break;
                }
                case 167: {
                    n14 = 57;
                    break;
                }
                case 168: {
                    n14 = 171;
                    break;
                }
                case 169: {
                    n14 = 181;
                    break;
                }
                case 170: {
                    n14 = 207;
                    break;
                }
                case 171: {
                    n14 = 211;
                    break;
                }
                case 172: {
                    n14 = 9;
                    break;
                }
                case 173: {
                    n14 = 222;
                    break;
                }
                case 174: {
                    n14 = 223;
                    break;
                }
                case 175: {
                    n14 = 128;
                    break;
                }
                case 176: {
                    n14 = 101;
                    break;
                }
                case 177: {
                    n14 = 153;
                    break;
                }
                case 178: {
                    n14 = 169;
                    break;
                }
                case 179: {
                    n14 = 3;
                    break;
                }
                case 180: {
                    n14 = 53;
                    break;
                }
                case 181: {
                    n14 = 64;
                    break;
                }
                case 182: {
                    n14 = 252;
                    break;
                }
                case 183: {
                    n14 = 232;
                    break;
                }
                case 184: {
                    n14 = 193;
                    break;
                }
                case 185: {
                    n14 = 21;
                    break;
                }
                case 186: {
                    n14 = 240;
                    break;
                }
                case 187: {
                    n14 = 206;
                    break;
                }
                case 188: {
                    n14 = 103;
                    break;
                }
                case 189: {
                    n14 = 25;
                    break;
                }
                case 190: {
                    n14 = 249;
                    break;
                }
                case 191: {
                    n14 = 195;
                    break;
                }
                case 192: {
                    n14 = 92;
                    break;
                }
                case 193: {
                    n14 = 52;
                    break;
                }
                case 194: {
                    n14 = 78;
                    break;
                }
                case 195: {
                    n14 = 116;
                    break;
                }
                case 196: {
                    n14 = 213;
                    break;
                }
                case 197: {
                    n14 = 34;
                    break;
                }
                case 198: {
                    n14 = 107;
                    break;
                }
                case 199: {
                    n14 = 67;
                    break;
                }
                case 200: {
                    n14 = 150;
                    break;
                }
                case 201: {
                    n14 = 139;
                    break;
                }
                case 202: {
                    n14 = 104;
                    break;
                }
                case 203: {
                    n14 = 38;
                    break;
                }
                case 204: {
                    n14 = 174;
                    break;
                }
                case 205: {
                    n14 = 225;
                    break;
                }
                case 206: {
                    n14 = 56;
                    break;
                }
                case 207: {
                    n14 = 17;
                    break;
                }
                case 208: {
                    n14 = 247;
                    break;
                }
                case 209: {
                    n14 = 88;
                    break;
                }
                case 210: {
                    n14 = 178;
                    break;
                }
                case 211: {
                    n14 = 248;
                    break;
                }
                case 212: {
                    n14 = 68;
                    break;
                }
                case 213: {
                    n14 = 137;
                    break;
                }
                case 214: {
                    n14 = 69;
                    break;
                }
                case 215: {
                    n14 = 142;
                    break;
                }
                case 216: {
                    n14 = 166;
                    break;
                }
                case 217: {
                    n14 = 176;
                    break;
                }
                case 218: {
                    n14 = 106;
                    break;
                }
                case 219: {
                    n14 = 110;
                    break;
                }
                case 220: {
                    n14 = 180;
                    break;
                }
                case 221: {
                    n14 = 91;
                    break;
                }
                case 222: {
                    n14 = 159;
                    break;
                }
                case 223: {
                    n14 = 155;
                    break;
                }
                case 224: {
                    n14 = 134;
                    break;
                }
                case 225: {
                    n14 = 98;
                    break;
                }
                case 226: {
                    n14 = 160;
                    break;
                }
                case 227: {
                    n14 = 253;
                    break;
                }
                case 228: {
                    n14 = 47;
                    break;
                }
                case 229: {
                    n14 = 83;
                    break;
                }
                case 230: {
                    n14 = 214;
                    break;
                }
                case 231: {
                    n14 = 22;
                    break;
                }
                case 232: {
                    n14 = 82;
                    break;
                }
                case 233: {
                    n14 = 89;
                    break;
                }
                case 234: {
                    n14 = 147;
                    break;
                }
                case 235: {
                    n14 = 30;
                    break;
                }
                case 236: {
                    n14 = 183;
                    break;
                }
                case 237: {
                    n14 = 215;
                    break;
                }
                case 238: {
                    n14 = 154;
                    break;
                }
                case 239: {
                    n14 = 72;
                    break;
                }
                case 240: {
                    n14 = 236;
                    break;
                }
                case 241: {
                    n14 = 185;
                    break;
                }
                case 242: {
                    n14 = 177;
                    break;
                }
                case 243: {
                    n14 = 94;
                    break;
                }
                case 244: {
                    n14 = 184;
                    break;
                }
                case 245: {
                    n14 = 51;
                    break;
                }
                case 246: {
                    n14 = 198;
                    break;
                }
                case 247: {
                    n14 = 1;
                    break;
                }
                case 248: {
                    n14 = 36;
                    break;
                }
                case 249: {
                    n14 = 203;
                    break;
                }
                case 250: {
                    n14 = 121;
                    break;
                }
                case 251: {
                    n14 = 27;
                    break;
                }
                case 252: {
                    n14 = 31;
                    break;
                }
                case 253: {
                    n14 = 97;
                    break;
                }
                case 254: {
                    n14 = 140;
                    break;
                }
                default: {
                    n14 = 161;
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
            o__0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

