/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.icmp4j.j;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class xE
implements bk_0 {
    static EventLoopGroup g;
    static Bootstrap c;
    int P;
    String d;
    String K;
    String G;
    int C;
    String v;
    String A;
    bk_0 U;
    Channel D;
    yu_0 w = new yu_0();
    BA Q;
    ArrayList h = new ArrayList();
    HashMap u = new HashMap();
    VD q = null;
    boolean I = true;
    boolean e = false;
    private static int s;
    private static final String[] a;
    private static final String[] b;
    private static final long f;

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var7 = new String[12];
                    var5_1 = 0;
                    var4_2 = "\u009e\u0016\u00d61\u0011b\u00a6\u0013f\f\u0089w\u00a4V\u00e2\u00e0\u00e6\u0018\u00af\u00deS\u00d9\u00b6\u00e5\u00b0\u00fc\u00d0\u000e\u008ao\u00cb\u0015\u0087\u00dc\u008c\u00b6\u007f\u0013\u00d0\u00fc\u001c\u0086\t\u00b5\u00b0\u00cd\u00f9\u00c1\u00aa}\u0093\u0018\u0003\n\u0007\u001d\u000et\u00c9\u00b9Y\u0095\u00aa@{\u00ae\u00a2\u00a3/\u000b\u00eb\tk+\u0016\u008a\u00ba\u00c4\u0012^\u00f5\u000em\u00f6\u009a\u00be\u00f1V\u00cc\u00e4?Q\u0091QM$\u000b\u0002c;\u0083\u001f\u00e5\u00a6\u007fni\u00ad\u000b1n]\"\u00d3\u00d1?\u00fcZ\u00a9\u00d7";
                    var6_3 = "\u009e\u0016\u00d61\u0011b\u00a6\u0013f\f\u0089w\u00a4V\u00e2\u00e0\u00e6\u0018\u00af\u00deS\u00d9\u00b6\u00e5\u00b0\u00fc\u00d0\u000e\u008ao\u00cb\u0015\u0087\u00dc\u008c\u00b6\u007f\u0013\u00d0\u00fc\u001c\u0086\t\u00b5\u00b0\u00cd\u00f9\u00c1\u00aa}\u0093\u0018\u0003\n\u0007\u001d\u000et\u00c9\u00b9Y\u0095\u00aa@{\u00ae\u00a2\u00a3/\u000b\u00eb\tk+\u0016\u008a\u00ba\u00c4\u0012^\u00f5\u000em\u00f6\u009a\u00be\u00f1V\u00cc\u00e4?Q\u0091QM$\u000b\u0002c;\u0083\u001f\u00e5\u00a6\u007fni\u00ad\u000b1n]\"\u00d3\u00d1?\u00fcZ\u00a9\u00d7".length();
                    xE.R(0);
                    var3_4 = 7;
                    var2_5 = -1;
lbl8:
                    // 2 sources

                    while (true) {
                        v0 = 105;
                        v1 = ++var2_5;
                        v2 = var4_2.substring(v1, v1 + var3_4);
                        v3 = -1;
                        break block20;
                        break;
                    }
lbl14:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "X\u00d3\u00b8h\u00c9\u009f`S\u000b\u00f9\u00deD4\u00f0\u0013[\u00a3\u00d9\u00aeC";
                        var6_3 = "X\u00d3\u00b8h\u00c9\u009f`S\u000b\u00f9\u00deD4\u00f0\u0013[\u00a3\u00d9\u00aeC".length();
                        var3_4 = 8;
                        var2_5 = -1;
lbl23:
                        // 2 sources

                        while (true) {
                            v0 = 105;
                            v5 = ++var2_5;
                            v2 = var4_2.substring(v5, v5 + var3_4);
                            v3 = 0;
                            break block20;
                            break;
                        }
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v4.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block21;
                        break;
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var8_6 = 0;
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > 1) ** GOTO lbl86
                do {
                    v11 = v8;
                    v9 = v9;
                    v12 = v9;
                    v13 = v8;
                    v14 = var8_6;
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v15 = 80;
                                break;
                            }
                            case 1: {
                                v15 = 105;
                                break;
                            }
                            case 2: {
                                v15 = 90;
                                break;
                            }
                            case 3: {
                                v15 = 57;
                                break;
                            }
                            case 4: {
                                v15 = 46;
                                break;
                            }
                            case 5: {
                                v15 = 60;
                                break;
                            }
                            default: {
                                v15 = 82;
                            }
                        }
                        v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                        ++var8_6;
                        v8 = v11;
                        if (v11 != 0) break;
                        v11 = v8;
                        v9 = v9;
                        v14 = v8;
                        v12 = v9;
                        v13 = v8;
                    }
lbl86:
                    // 2 sources

                    v16 = v9;
                    v10 = v10;
                } while (v10 > var8_6);
                v4 = new String(v16);
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl96:
                    // 1 sources

                    ** continue;
                }
            }
            xE.a = var7;
            xE.b = new String[12];
            break block22;
lbl101:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 9079262986183371831L;
        ** while (true)
        xE.f = -56176067801519070L ^ var0_7;
        xE.g = new NioEventLoopGroup();
        xE.c = new Bootstrap();
        ((Bootstrap)((Bootstrap)((Bootstrap)xE.c.group(xE.g)).channel(NioSocketChannel.class)).option(ChannelOption.TCP_NODELAY, true)).handler(new aO());
    }

    public static void main(String[] stringArray) {
        long l2 = System.currentTimeMillis();
        xE xE2 = new xE("194.156.121.76", (int)f, "ru-xbly", "194.156.121.76");
        xE2.X(true);
        xE2.c();
        xE2.U(new l1_0(xE2));
    }

    public xE(String string, int n10, String string2, String string3) {
        this.d = string;
        int n11 = xE.D();
        this.P = n10;
        this.v = string2;
        this.K = string3;
        if (ky_2.F() != null) {
            xE.R(++n11);
        }
    }

    public void c() {
        ChannelFuture channelFuture = c.connect(this.d, this.P);
        channelFuture.addListener(new CI(this)).channel().attr(BA.i).set(this);
        this.D = channelFuture.channel();
    }

    public void n() {
        block3: {
            Channel channel;
            block2: {
                int n10 = xE.I();
                channel = this.D;
                if (n10 == 0) break block2;
                if (channel == null) break block3;
                channel = this.D;
            }
            channel.close();
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void d(xU var1_1) {
        block44: {
            block48: {
                block49: {
                    block47: {
                        block45: {
                            block40: {
                                block43: {
                                    block41: {
                                        block42: {
                                            block39: {
                                                block38: {
                                                    var2_2 = xE.I();
                                                    v0 = this;
                                                    if (var2_2 == 0) break block38;
                                                    try {
                                                        block50: {
                                                            if (v0.Q != null) break block39;
                                                            break block50;
                                                            catch (UnsupportedEncodingException v1) {
                                                                throw xE.a(v1);
                                                            }
                                                        }
                                                        v0 = this;
                                                    }
                                                    catch (UnsupportedEncodingException v2) {
                                                        throw xE.a(v2);
                                                    }
                                                }
                                                v0.Q = (BA)this.D.attr(BA.j).get();
                                            }
                                            var3_3 = ai_0.L(var1_1);
                                            var4_4 = var3_3.C("msg_type");
                                            try {
                                                v3 = var4_4.equals("remote_ping_respone");
                                                if (var2_2 == 0) break block40;
                                                if (v3) {
                                                }
                                                ** GOTO lbl63
                                            }
                                            catch (UnsupportedEncodingException v4) {
                                                throw xE.a(v4);
                                            }
                                            var5_5 = new j();
                                            var5_5.w(var3_3.b("rtt"));
                                            var5_5.P(true);
                                            if (var2_2 == 0) break block41;
                                            try {
                                                block51: {
                                                    if (var5_5.r() <= -1) break block42;
                                                    break block51;
                                                    catch (UnsupportedEncodingException v5) {
                                                        throw xE.a(v5);
                                                    }
                                                }
                                                var5_5.v(true);
                                            }
                                            catch (UnsupportedEncodingException v6) {
                                                throw xE.a(v6);
                                            }
                                        }
                                        this.w.T((j)var5_5);
                                    }
                                    v7 = this.U;
                                    if (var2_2 == 0) break block43;
                                    try {
                                        block52: {
                                            if (v7 == null) break block44;
                                            break block52;
                                            catch (UnsupportedEncodingException v8) {
                                                throw xE.a(v8);
                                            }
                                        }
                                        v7 = this.U;
                                    }
                                    catch (UnsupportedEncodingException v9) {
                                        throw xE.a(v9);
                                    }
                                }
                                try {
                                    v7.d(var1_1);
                                    if (var2_2 != 0) break block44;
lbl63:
                                    // 2 sources

                                    v3 = var4_4.equals("server_info");
                                }
                                catch (UnsupportedEncodingException v10) {
                                    throw xE.a(v10);
                                }
                            }
                            if (var2_2 == 0) break block45;
                            try {
                                block53: {
                                    if (!v3) break block44;
                                    break block53;
                                    catch (UnsupportedEncodingException v11) {
                                        throw xE.a(v11);
                                    }
                                }
                                v3 = this.e;
                            }
                            catch (UnsupportedEncodingException v12) {
                                throw xE.a(v12);
                            }
                        }
                        if (v3) break block44;
                        var5_5 = var3_3;
                        var6_6 = var5_5.C("server_id");
                        var7_7 = var5_5.C("default_server");
                        var8_8 = var5_5.J("server_list");
                        this.h.clear();
                        this.u.clear();
                        this.q = null;
                        var9_9 = false;
                        var10_10 = 0;
                        if (var2_2 != 0) ** GOTO lbl115
                        do {
                            block46: {
                                var11_12 = var8_8.V(var10_10);
                                var12_14 = new VD(var11_12.C("server_name"), var11_12.C("server_id"), null, -1);
                                this.h.add(var12_14);
                                this.u.put(var12_14.X(), var12_14);
                                v13 = this.v;
                                if (var2_2 != 0) {
                                    try {
                                        if (v13 == null) break block46;
                                        v13 = var12_14.X();
                                    }
                                    catch (UnsupportedEncodingException v14) {
                                        throw xE.a(v14);
                                    }
                                }
                                try {
                                    if (v13.equals(this.v)) {
                                        this.q = var12_14;
                                    }
                                }
                                catch (UnsupportedEncodingException v15) {
                                    throw xE.a(v15);
                                }
                            }
                            ++var10_10;
lbl115:
                            // 2 sources

                        } while (var10_10 < var8_8.size());
                        var10_11 = (VD)this.u.get(var7_7);
                        v16 = this;
                        if (var2_2 == 0) ** GOTO lbl135
                        try {
                            block54: {
                                if (v16.q != null) break block47;
                                break block54;
                                catch (UnsupportedEncodingException v17) {
                                    throw xE.a(v17);
                                }
                            }
                            this.q = var10_11;
                        }
                        catch (UnsupportedEncodingException v18) {
                            throw xE.a(v18);
                        }
                    }
                    this.v = this.q.X();
                    this.A = this.q.k();
                    try {
                        v16 = this;
lbl135:
                        // 2 sources

                        v16.Q.U();
                    }
                    catch (UnsupportedEncodingException var11_13) {
                        var11_13.printStackTrace();
                    }
                    try {
                        try {
                            v19 = this;
                            if (var2_2 == 0) break block48;
                            if (v19.U == null) break block49;
                        }
                        catch (UnsupportedEncodingException v20) {
                            throw xE.a(v20);
                        }
                        this.U.w(this.h, this.v, this.A);
                    }
                    catch (UnsupportedEncodingException v21) {
                        throw xE.a(v21);
                    }
                }
                v19 = this;
            }
            v19.e = true;
        }
    }

    @Override
    public void j() {
        block3: {
            bk_0 bk_02;
            block2: {
                int n10 = xE.I();
                bk_02 = this.U;
                if (n10 == 0) break block2;
                if (bk_02 == null) break block3;
                bk_02 = this.U;
            }
            bk_02.j();
        }
    }

    @Override
    public void V() {
        block3: {
            bk_0 bk_02;
            block2: {
                int n10 = xE.I();
                bk_02 = this.U;
                if (n10 == 0) break block2;
                if (bk_02 == null) break block3;
                bk_02 = this.U;
            }
            bk_02.V();
        }
    }

    @Override
    public void a() {
        block3: {
            bk_0 bk_02;
            block2: {
                int n10 = xE.I();
                bk_02 = this.U;
                if (n10 == 0) break block2;
                if (bk_02 == null) break block3;
                bk_02 = this.U;
            }
            bk_02.a();
        }
    }

    public int j() {
        return this.P;
    }

    public void m(int n10) {
        this.P = n10;
    }

    public String J() {
        return this.d;
    }

    public void H(String string) {
        this.d = string;
    }

    public String V() {
        return this.K;
    }

    public void r(String string) {
        this.K = string;
    }

    public String h() {
        return this.G;
    }

    public void D(String string) {
        this.G = string;
    }

    public int Q() {
        return this.C;
    }

    public void u(int n10) {
        this.C = n10;
    }

    public bk_0 z() {
        return this.U;
    }

    public void U(bk_0 bk_02) {
        this.U = bk_02;
    }

    public String B() {
        return this.v;
    }

    public void z(String string) {
        this.v = string;
    }

    public yu_0 B() {
        return this.w;
    }

    public void z(yu_0 yu_02) {
        this.w = yu_02;
    }

    @Override
    public void w(List list, String string, String string2) {
    }

    public boolean r() {
        return this.I;
    }

    public void X(boolean bl) {
        this.I = bl;
    }

    public static void R(int n10) {
        s = n10;
    }

    public static int D() {
        return s;
    }

    public static int I() {
        int n10 = xE.D();
        if (n10 == 0) {
            return 60;
        }
        return 0;
    }

    private static UnsupportedEncodingException a(UnsupportedEncodingException unsupportedEncodingException) {
        return unsupportedEncodingException;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF9E74) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            char[] cArray = a[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 175;
                case 1 -> 202;
                case 2 -> 245;
                case 3 -> 242;
                case 4 -> 185;
                case 5 -> 164;
                case 6 -> 116;
                case 7 -> 197;
                case 8 -> 78;
                case 9 -> 207;
                case 10 -> 60;
                case 11 -> 94;
                case 12 -> 82;
                case 13 -> 148;
                case 14 -> 24;
                case 15 -> 69;
                case 16 -> 146;
                case 17 -> 61;
                case 18 -> 170;
                case 19 -> 45;
                case 20 -> 23;
                case 21 -> 48;
                case 22 -> 72;
                case 23 -> 171;
                case 24 -> 246;
                case 25 -> 115;
                case 26 -> 51;
                case 27 -> 240;
                case 28 -> 194;
                case 29 -> 64;
                case 30 -> 149;
                case 31 -> 117;
                case 32 -> 125;
                case 33 -> 68;
                case 34 -> 43;
                case 35 -> 97;
                case 36 -> 222;
                case 37 -> 218;
                case 38 -> 249;
                case 39 -> 73;
                case 40 -> 157;
                case 41 -> 145;
                case 42 -> 58;
                case 43 -> 130;
                case 44 -> 28;
                case 45 -> 65;
                case 46 -> 255;
                case 47 -> 163;
                case 48 -> 74;
                case 49 -> 239;
                case 50 -> 205;
                case 51 -> 199;
                case 52 -> 95;
                case 53 -> 186;
                case 54 -> 166;
                case 55 -> 136;
                case 56 -> 141;
                case 57 -> 11;
                case 58 -> 174;
                case 59 -> 110;
                case 60 -> 10;
                case 61 -> 42;
                case 62 -> 167;
                case 63 -> 132;
                case 64 -> 89;
                case 65 -> 47;
                case 66 -> 143;
                case 67 -> 46;
                case 68 -> 62;
                case 69 -> 13;
                case 70 -> 2;
                case 71 -> 196;
                case 72 -> 200;
                case 73 -> 54;
                case 74 -> 144;
                case 75 -> 190;
                case 76 -> 84;
                case 77 -> 29;
                case 78 -> 36;
                case 79 -> 106;
                case 80 -> 7;
                case 81 -> 192;
                case 82 -> 169;
                case 83 -> 131;
                case 84 -> 81;
                case 85 -> 14;
                case 86 -> 126;
                case 87 -> 38;
                case 88 -> 101;
                case 89 -> 250;
                case 90 -> 252;
                case 91 -> 220;
                case 92 -> 177;
                case 93 -> 49;
                case 94 -> 215;
                case 95 -> 119;
                case 96 -> 93;
                case 97 -> 111;
                case 98 -> 183;
                case 99 -> 122;
                case 100 -> 217;
                case 101 -> 152;
                case 102 -> 123;
                case 103 -> 8;
                case 104 -> 31;
                case 105 -> 75;
                case 106 -> 153;
                case 107 -> 154;
                case 108 -> 203;
                case 109 -> 16;
                case 110 -> 92;
                case 111 -> 156;
                case 112 -> 227;
                case 113 -> 50;
                case 114 -> 212;
                case 115 -> 1;
                case 116 -> 213;
                case 117 -> 181;
                case 118 -> 151;
                case 119 -> 87;
                case 120 -> 59;
                case 121 -> 35;
                case 122 -> 109;
                case 123 -> 176;
                case 124 -> 85;
                case 125 -> 128;
                case 126 -> 19;
                case 127 -> 162;
                case 128 -> 22;
                case 129 -> 231;
                case 130 -> 209;
                case 131 -> 247;
                case 132 -> 150;
                case 133 -> 184;
                case 134 -> 172;
                case 135 -> 187;
                case 136 -> 56;
                case 137 -> 219;
                case 138 -> 178;
                case 139 -> 44;
                case 140 -> 83;
                case 141 -> 159;
                case 142 -> 86;
                case 143 -> 251;
                case 144 -> 225;
                case 145 -> 195;
                case 146 -> 214;
                case 147 -> 189;
                case 148 -> 204;
                case 149 -> 134;
                case 150 -> 99;
                case 151 -> 229;
                case 152 -> 160;
                case 153 -> 155;
                case 154 -> 112;
                case 155 -> 226;
                case 156 -> 9;
                case 157 -> 76;
                case 158 -> 120;
                case 159 -> 224;
                case 160 -> 0;
                case 161 -> 17;
                case 162 -> 100;
                case 163 -> 165;
                case 164 -> 20;
                case 165 -> 168;
                case 166 -> 53;
                case 167 -> 5;
                case 168 -> 107;
                case 169 -> 211;
                case 170 -> 71;
                case 171 -> 77;
                case 172 -> 241;
                case 173 -> 133;
                case 174 -> 188;
                case 175 -> 102;
                case 176 -> 12;
                case 177 -> 55;
                case 178 -> 191;
                case 179 -> 26;
                case 180 -> 137;
                case 181 -> 206;
                case 182 -> 233;
                case 183 -> 70;
                case 184 -> 232;
                case 185 -> 179;
                case 186 -> 27;
                case 187 -> 135;
                case 188 -> 127;
                case 189 -> 158;
                case 190 -> 30;
                case 191 -> 39;
                case 192 -> 57;
                case 193 -> 254;
                case 194 -> 129;
                case 195 -> 221;
                case 196 -> 201;
                case 197 -> 104;
                case 198 -> 79;
                case 199 -> 230;
                case 200 -> 121;
                case 201 -> 6;
                case 202 -> 96;
                case 203 -> 140;
                case 204 -> 248;
                case 205 -> 80;
                case 206 -> 161;
                case 207 -> 32;
                case 208 -> 244;
                case 209 -> 91;
                case 210 -> 198;
                case 211 -> 142;
                case 212 -> 114;
                case 213 -> 41;
                case 214 -> 180;
                case 215 -> 124;
                case 216 -> 147;
                case 217 -> 223;
                case 218 -> 208;
                case 219 -> 4;
                case 220 -> 182;
                case 221 -> 118;
                case 222 -> 216;
                case 223 -> 63;
                case 224 -> 40;
                case 225 -> 108;
                case 226 -> 139;
                case 227 -> 88;
                case 228 -> 33;
                case 229 -> 90;
                case 230 -> 113;
                case 231 -> 228;
                case 232 -> 21;
                case 233 -> 25;
                case 234 -> 234;
                case 235 -> 237;
                case 236 -> 193;
                case 237 -> 253;
                case 238 -> 236;
                case 239 -> 173;
                case 240 -> 66;
                case 241 -> 243;
                case 242 -> 103;
                case 243 -> 34;
                case 244 -> 98;
                case 245 -> 235;
                case 246 -> 37;
                case 247 -> 15;
                case 248 -> 52;
                case 249 -> 18;
                case 250 -> 105;
                case 251 -> 3;
                case 252 -> 67;
                case 253 -> 238;
                case 254 -> 210;
                default -> 138;
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
            xE.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

