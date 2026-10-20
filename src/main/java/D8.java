/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class D8 {
    qm_0 I;
    x1 q;
    public InetAddress g;
    public int U;
    HashMap t = new HashMap();
    int w = -1;
    int G = -1;
    Object k = new Object();
    boolean y = false;
    Object Y = new Object();
    byte[] h = new byte[4];
    int z = 0;
    int n = (int)d;
    int F = -1;
    tz_2 V;
    float m = cs_0.r;
    int l;
    int D;
    boolean v = false;
    boolean b = false;
    static int x;
    static int W;
    boolean Z = false;
    public int H;
    long S;
    private static final String[] a;
    private static final String[] c;
    private static final long d;

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            block14: {
                var7 = new String[3];
                var5_1 = 0;
                var4_2 = "\u8f35\u6329\u67fc\u5e7f\u7a67\u0005\u8ff8\u6354\u5d9d\u6587\u5f43\f\u8f2b\u635d\u5de7\u65a6\u5f0c\u001fH\u00f7o\u00e70\u00cc";
                var6_3 = "\u8f35\u6329\u67fc\u5e7f\u7a67\u0005\u8ff8\u6354\u5d9d\u6587\u5f43\f\u8f2b\u635d\u5de7\u65a6\u5f0c\u001fH\u00f7o\u00e70\u00cc".length();
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
                v4 = 111;
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
                                v11 = 84;
                                break;
                            }
                            case 1: {
                                v11 = 72;
                                break;
                            }
                            case 2: {
                                v11 = 125;
                                break;
                            }
                            case 3: {
                                v11 = 58;
                                break;
                            }
                            case 4: {
                                v11 = 113;
                                break;
                            }
                            case 5: {
                                v11 = 117;
                                break;
                            }
                            default: {
                                v11 = 6;
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
            D8.a = var7;
            D8.c = new String[3];
            break block15;
lbl78:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 5167279490983469835L;
        ** while (true)
        D8.d = 4292586453142807297L ^ var0_7;
        D8.x = 0;
    }

    D8(qm_0 qm_02) {
        this.I = qm_02;
        this.V = new tz_2(qm_02);
        this.q = qm_02.J;
        this.g = qm_02.c;
        this.U = qm_02.i;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public byte[] e() throws fg_1 {
        block24: {
            block23: {
                var2_1 = null;
                var1_2 = qm_0.J();
                v0 /* !! */  = this.I;
                if (var1_2 == null) break block23;
                try {
                    block30: {
                        if (!v0 /* !! */ .Z()) break block24;
                        break block30;
                        catch (InterruptedException v1) {
                            throw D8.a(v1);
                        }
                    }
                    v0 /* !! */  = this.t.get(this.w + 1);
                }
                catch (InterruptedException v2) {
                    throw D8.a(v2);
                }
            }
            var2_1 = (vw_0)v0 /* !! */ ;
            var3_3 = this.k;
            synchronized (var3_3) {
                v3 = var2_1;
                if (var1_2 != null) {
                    block25: {
                        block26: {
                            try {
                                if (v3 != null) break block25;
                                this.k.wait();
                                break block26;
                            }
                            catch (fg_1 v4) {
                                throw D8.a(v4);
                            }
                            {
                                catch (InterruptedException var4_4) {
                                    var4_4.printStackTrace();
                                }
                            }
                        }
                        var2_1 = (vw_0)this.t.get(this.w + 1);
                    }
                    v3 = var3_3;
                }
                // ** MonitorExit[v3] (shouldn't be in output)
            }
        }
        throw new fg_1("连接未建立");
        {
            block28: {
                block29: {
                    block27: {
                        v6 = this;
                        if (var1_2 == null) break block27;
                        try {
                            block31: {
                                if (v6.v) break block28;
                                break block31;
                                catch (InterruptedException v7) {
                                    throw D8.a(v7);
                                }
                            }
                            v6 = this;
                        }
                        catch (InterruptedException v8) {
                            throw D8.a(v8);
                        }
                    }
                    v6.M();
                    v9 = var2_1;
                    if (var1_2 == null) ** GOTO lbl78
                    try {
                        block32: {
                            if (v9 != null) break block29;
                            break block32;
                            catch (InterruptedException v10) {
                                throw D8.a(v10);
                            }
                        }
                        throw new fg_1("连接已断开ccccccc");
                    }
                    catch (InterruptedException v11) {
                        throw D8.a(v11);
                    }
                }
                this.I.J.S();
                ++this.w;
                var3_3 = this.k;
                synchronized (var3_3) {
                    this.t.remove(var2_1.N());
                    v9 = var3_3;
lbl78:
                    // 2 sources

                    // ** MonitorExit[v9] (shouldn't be in output)
                    this.S += (long)var2_1.q().length;
                    return var2_1.q();
                }
            }
            throw new fg_1("连接已断开");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void t(DatagramPacket var1_1) {
        block34: {
            block35: {
                block29: {
                    block30: {
                        block33: {
                            block32: {
                                block31: {
                                    block26: {
                                        block27: {
                                            block28: {
                                                block25: {
                                                    block24: {
                                                        var2_2 = qm_0.J();
                                                        if (var1_1 == null) ** GOTO lbl127
                                                        v0 = this.I.Z();
                                                        if (var2_2 == null) break block24;
                                                        if (v0 == 0) ** GOTO lbl127
                                                        v0 = ym_2.i(var1_1);
                                                    }
                                                    var4_3 = v0;
                                                    var5_4 = ym_2.y(var1_1);
                                                    v1 = var4_3;
                                                    v2 = cs_0.a;
                                                    if (var2_2 == null) break block25;
                                                    if (v1 != v2) ** GOTO lbl127
                                                    this.I.T();
                                                    v1 = var5_4;
                                                    v2 = BN.B;
                                                }
                                                if (var2_2 == null) break block26;
                                                if (v1 != v2) break block27;
                                                var3_5 = new vw_0(var1_1);
                                                var6_6 = var3_5.o();
                                                v3 = var7_8 = (fr_0)this.I.d.X.get(var6_6);
                                                if (var2_2 != null) {
                                                    if (v3 == null) {
                                                        var7_8 = new fr_0();
                                                        var7_8.H(var6_6);
                                                        this.I.d.X.put(var6_6, var7_8);
                                                    }
                                                    v3 = var7_8;
                                                }
                                                v3.A(var3_5.q().length);
                                                v4 = var6_6;
                                                if (var2_2 != null) {
                                                    if (v4 > this.l) {
                                                        this.l = var6_6;
                                                    }
                                                    v4 = var3_5.N();
                                                }
                                                var8_10 = v4;
                                                v5 = this.I.J;
                                                v6 = var3_5;
                                                if (var2_2 == null) break block28;
                                                v5.w(v6.N());
                                                if (var8_10 <= this.w) ** GOTO lbl127
                                                v7 = this.k;
                                                v6 = v7;
                                                v5 = v7;
                                            }
                                            var9_12 = v6;
                                            synchronized (v5) {
                                                this.t.put(var8_10, var3_5);
                                                v8 = this.t;
                                                if (var2_2 != null) {
                                                    if (v8.containsKey(this.w + 1)) {
                                                        this.k.notify();
                                                    }
                                                    v8 = var9_12;
                                                }
                                                // ** MonitorExit[v8] (shouldn't be in output)
                                            }
                                        }
                                        v1 = var5_4;
                                        v2 = BN.D;
                                    }
                                    if (var2_2 == null) break block29;
                                    if (v1 != v2) break block30;
                                    var6_7 = new vt_0(var1_1);
                                    var7_9 = var6_7.n();
                                    if (var7_9 > this.F) {
                                        this.F = var7_9;
                                    }
                                    var8_11 = var6_7.t();
                                    var9_13 = 0;
                                    if (var2_2 != null) ** GOTO lbl81
                                    block3: while (true) {
                                        v10 = var8_11.get(var9_13);
                                        do {
                                            var10_15 = (Integer)v10;
                                            this.I.J.a(var10_15);
                                            ++var9_13;
lbl81:
                                            // 2 sources

                                            if (var9_13 < var8_11.size()) continue block3;
                                            v10 = this.I.d.A(var6_7.W());
                                        } while (var2_2 == null);
                                        break;
                                    }
                                    v11 = var9_14 = v10;
                                    if (var2_2 != null) {
                                        if (v11 != null && var6_7.L() > var9_14.o()) {
                                            var9_14.C(var6_7.L());
                                        }
                                        v11 = this.I.d.A(var6_7.r());
                                    }
                                    v12 = var10_16 = v11;
                                    if (var2_2 != null) {
                                        if (v12 != null && var6_7.N() > var10_16.o()) {
                                            var10_16.C(var6_7.N());
                                        }
                                        v12 = this.I.d.A(var6_7.O());
                                    }
                                    if ((var11_17 = v12) == null) break block31;
                                    v13 = var6_7.Z();
                                    if (var2_2 == null) break block32;
                                    if (v13 > var11_17.o()) {
                                        var11_17.C(var6_7.Z());
                                    }
                                }
                                v14 = this;
                                if (var2_2 == null) break block33;
                                v13 = (int)v14.Q();
                            }
                            if (v13 == 0) ** GOTO lbl127
                            v14 = this;
                        }
                        v14.I.J.H();
                        if (var2_2 != null) ** GOTO lbl127
                    }
                    v1 = var5_4;
                    v2 = BN.Y;
                }
                if (var2_2 == null) break block34;
                if (v1 != v2) break block35;
                var6_7 = new vm_0(var1_1);
                this.b = true;
                var7_9 = var6_7.v();
                this.A(var7_9);
                if (var2_2 != null) ** GOTO lbl127
            }
            v1 = var5_4;
            v2 = BN.f;
        }
        if (v1 == v2) {
            var6_7 = new VK(var1_1);
            this.I.N();
        }
lbl127:
        // 11 sources

    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void J() {
        Object object = this.k;
        synchronized (object) {
            this.t.clear();
        }
    }

    boolean Q() {
        this.H = this.I.J.B - this.F;
        ky_2[] ky_2Array = qm_0.J();
        boolean bl = false;
        float f10 = (float)this.H - this.m;
        float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (ky_2Array != null) {
            if (f11 < 0) {
                bl = true;
            }
            f11 = (float)bl;
        }
        return (boolean)f11;
    }

    void A(int n10) {
        block3: {
            D8 d8;
            block2: {
                this.D = n10;
                ky_2[] ky_2Array = qm_0.J();
                d8 = this;
                if (ky_2Array == null) break block2;
                if (d8.v) break block3;
                d8 = this;
            }
            d8.M();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void M() {
        Object object;
        block8: {
            int n10;
            block7: {
                ky_2[] ky_2Array = qm_0.J();
                n10 = this.v;
                if (ky_2Array != null) {
                    if (n10 != 0) return;
                    n10 = this.b;
                }
                if (ky_2Array == null) break block7;
                if (n10 == 0) return;
                object = this;
                if (ky_2Array == null) break block8;
                n10 = ((D8)object).w;
            }
            if (n10 < this.D - 1) return;
            this.v = true;
            object = this.k;
        }
        D8 d8 = object;
        synchronized (object) {
            this.k.notifyAll();
            // ** MonitorExit[var2_2] (shouldn't be in output)
            this.I.J.N();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void g() {
        block5: {
            int n10;
            block4: {
                ky_2[] ky_2Array = qm_0.J();
                n10 = this.v;
                if (ky_2Array == null) break block4;
                if (n10 != 0) break block5;
                n10 = W + 1;
            }
            W = n10;
            this.v = true;
            Object object = this.k;
            synchronized (object) {
                this.k.notifyAll();
            }
            this.I.J.O();
        }
    }

    public int C() {
        return this.l;
    }

    public void B(int n10) {
        this.l = n10;
    }

    public int J() {
        return this.D;
    }

    public void o(int n10) {
        this.D = n10;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x413A) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            char[] cArray = a[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 11;
                case 1 -> 91;
                case 2 -> 32;
                case 3 -> 103;
                case 4 -> 131;
                case 5 -> 197;
                case 6 -> 205;
                case 7 -> 240;
                case 8 -> 54;
                case 9 -> 89;
                case 10 -> 34;
                case 11 -> 165;
                case 12 -> 212;
                case 13 -> 15;
                case 14 -> 213;
                case 15 -> 244;
                case 16 -> 116;
                case 17 -> 108;
                case 18 -> 6;
                case 19 -> 49;
                case 20 -> 107;
                case 21 -> 79;
                case 22 -> 95;
                case 23 -> 36;
                case 24 -> 113;
                case 25 -> 245;
                case 26 -> 223;
                case 27 -> 160;
                case 28 -> 247;
                case 29 -> 166;
                case 30 -> 55;
                case 31 -> 10;
                case 32 -> 224;
                case 33 -> 226;
                case 34 -> 225;
                case 35 -> 241;
                case 36 -> 236;
                case 37 -> 178;
                case 38 -> 145;
                case 39 -> 137;
                case 40 -> 80;
                case 41 -> 70;
                case 42 -> 227;
                case 43 -> 254;
                case 44 -> 201;
                case 45 -> 132;
                case 46 -> 35;
                case 47 -> 82;
                case 48 -> 192;
                case 49 -> 207;
                case 50 -> 56;
                case 51 -> 21;
                case 52 -> 3;
                case 53 -> 105;
                case 54 -> 84;
                case 55 -> 177;
                case 56 -> 58;
                case 57 -> 211;
                case 58 -> 203;
                case 59 -> 48;
                case 60 -> 93;
                case 61 -> 243;
                case 62 -> 196;
                case 63 -> 157;
                case 64 -> 175;
                case 65 -> 200;
                case 66 -> 189;
                case 67 -> 122;
                case 68 -> 51;
                case 69 -> 174;
                case 70 -> 69;
                case 71 -> 77;
                case 72 -> 135;
                case 73 -> 13;
                case 74 -> 143;
                case 75 -> 90;
                case 76 -> 26;
                case 77 -> 126;
                case 78 -> 156;
                case 79 -> 50;
                case 80 -> 163;
                case 81 -> 161;
                case 82 -> 42;
                case 83 -> 25;
                case 84 -> 195;
                case 85 -> 41;
                case 86 -> 248;
                case 87 -> 216;
                case 88 -> 120;
                case 89 -> 45;
                case 90 -> 233;
                case 91 -> 46;
                case 92 -> 134;
                case 93 -> 104;
                case 94 -> 17;
                case 95 -> 154;
                case 96 -> 9;
                case 97 -> 139;
                case 98 -> 167;
                case 99 -> 43;
                case 100 -> 168;
                case 101 -> 78;
                case 102 -> 16;
                case 103 -> 60;
                case 104 -> 117;
                case 105 -> 209;
                case 106 -> 232;
                case 107 -> 210;
                case 108 -> 29;
                case 109 -> 251;
                case 110 -> 181;
                case 111 -> 176;
                case 112 -> 73;
                case 113 -> 222;
                case 114 -> 76;
                case 115 -> 33;
                case 116 -> 149;
                case 117 -> 159;
                case 118 -> 96;
                case 119 -> 229;
                case 120 -> 172;
                case 121 -> 124;
                case 122 -> 2;
                case 123 -> 164;
                case 124 -> 31;
                case 125 -> 246;
                case 126 -> 202;
                case 127 -> 115;
                case 128 -> 194;
                case 129 -> 150;
                case 130 -> 47;
                case 131 -> 112;
                case 132 -> 198;
                case 133 -> 102;
                case 134 -> 14;
                case 135 -> 66;
                case 136 -> 180;
                case 137 -> 138;
                case 138 -> 250;
                case 139 -> 99;
                case 140 -> 8;
                case 141 -> 24;
                case 142 -> 64;
                case 143 -> 228;
                case 144 -> 147;
                case 145 -> 230;
                case 146 -> 220;
                case 147 -> 231;
                case 148 -> 234;
                case 149 -> 100;
                case 150 -> 146;
                case 151 -> 39;
                case 152 -> 52;
                case 153 -> 128;
                case 154 -> 86;
                case 155 -> 237;
                case 156 -> 19;
                case 157 -> 57;
                case 158 -> 83;
                case 159 -> 38;
                case 160 -> 53;
                case 161 -> 74;
                case 162 -> 152;
                case 163 -> 151;
                case 164 -> 4;
                case 165 -> 158;
                case 166 -> 87;
                case 167 -> 255;
                case 168 -> 75;
                case 169 -> 94;
                case 170 -> 23;
                case 171 -> 215;
                case 172 -> 68;
                case 173 -> 133;
                case 174 -> 106;
                case 175 -> 190;
                case 176 -> 121;
                case 177 -> 62;
                case 178 -> 155;
                case 179 -> 85;
                case 180 -> 0;
                case 181 -> 101;
                case 182 -> 199;
                case 183 -> 12;
                case 184 -> 188;
                case 185 -> 136;
                case 186 -> 98;
                case 187 -> 169;
                case 188 -> 110;
                case 189 -> 7;
                case 190 -> 5;
                case 191 -> 125;
                case 192 -> 20;
                case 193 -> 185;
                case 194 -> 238;
                case 195 -> 109;
                case 196 -> 140;
                case 197 -> 204;
                case 198 -> 127;
                case 199 -> 239;
                case 200 -> 170;
                case 201 -> 71;
                case 202 -> 141;
                case 203 -> 37;
                case 204 -> 249;
                case 205 -> 67;
                case 206 -> 217;
                case 207 -> 183;
                case 208 -> 111;
                case 209 -> 235;
                case 210 -> 81;
                case 211 -> 114;
                case 212 -> 129;
                case 213 -> 218;
                case 214 -> 182;
                case 215 -> 144;
                case 216 -> 214;
                case 217 -> 97;
                case 218 -> 72;
                case 219 -> 153;
                case 220 -> 206;
                case 221 -> 44;
                case 222 -> 61;
                case 223 -> 63;
                case 224 -> 130;
                case 225 -> 186;
                case 226 -> 221;
                case 227 -> 92;
                case 228 -> 148;
                case 229 -> 187;
                case 230 -> 219;
                case 231 -> 208;
                case 232 -> 40;
                case 233 -> 30;
                case 234 -> 27;
                case 235 -> 179;
                case 236 -> 242;
                case 237 -> 171;
                case 238 -> 191;
                case 239 -> 28;
                case 240 -> 193;
                case 241 -> 59;
                case 242 -> 123;
                case 243 -> 173;
                case 244 -> 253;
                case 245 -> 142;
                case 246 -> 18;
                case 247 -> 65;
                case 248 -> 22;
                case 249 -> 119;
                case 250 -> 184;
                case 251 -> 162;
                case 252 -> 252;
                case 253 -> 118;
                case 254 -> 1;
                default -> 88;
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
            D8.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }
}

