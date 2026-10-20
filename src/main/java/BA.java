/*
 * Decompiled with CFR 0.152.
 */
import com.O0;
import com.ky_2;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.AttributeKey;
import io.netty.util.ReferenceCountUtil;
import java.io.UnsupportedEncodingException;

public class BA
extends ChannelInboundHandlerAdapter {
    public static AttributeKey i;
    public static AttributeKey j;
    xE O = null;
    ChannelHandlerContext P;
    private static final String[] a;
    private static final String[] b;

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[8];
                var3_1 = 0;
                var2_2 = "\u00e6\u00ae\u007ft\u00e6k3\u00adS}\u0080\u0001\u00db\u0004\u00bc\u00c7`+\u0005#J8\u00bb\u00b6\u0011\nRx\u009aq\u00e0\u0003$\u00e1\u00b4v\n\u00cf\u008f4\u00be\u00b7\u0013u\u00d5\u001e9T\u0098+\u00f1\u00a2\u00cfR&\u00eb\u0011k\u0084\u00b6\u001dH\bI\u00cc\u0010I|\u009a\u00a2\u0006";
                var4_3 = "\u00e6\u00ae\u007ft\u00e6k3\u00adS}\u0080\u0001\u00db\u0004\u00bc\u00c7`+\u0005#J8\u00bb\u00b6\u0011\nRx\u009aq\u00e0\u0003$\u00e1\u00b4v\n\u00cf\u008f4\u00be\u00b7\u0013u\u00d5\u001e9T\u0098+\u00f1\u00a2\u00cfR&\u00eb\u0011k\u0084\u00b6\u001dH\bI\u00cc\u0010I|\u009a\u00a2\u0006".length();
                var1_4 = 13;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 7;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "=\u00dc\u00dd\u00c0[\u00b1\u00d9b\n\u00b2\u00c8\u00bf#\b\u00e7{\u001fc\u0083";
                    var4_3 = "=\u00dc\u00dd\u00c0[\u00b1\u00d9b\n\u00b2\u00c8\u00bf#\b\u00e7{\u001fc\u0083".length();
                    var1_4 = 8;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 117;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 90;
                            break;
                        }
                        case 1: {
                            v15 = 52;
                            break;
                        }
                        case 2: {
                            v15 = 77;
                            break;
                        }
                        case 3: {
                            v15 = 68;
                            break;
                        }
                        case 4: {
                            v15 = 109;
                            break;
                        }
                        case 5: {
                            v15 = 55;
                            break;
                        }
                        default: {
                            v15 = 78;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        BA.a = var5;
        BA.b = new String[8];
        BA.i = AttributeKey.valueOf("PingClient");
        BA.j = AttributeKey.valueOf("ClientHandler");
    }

    @Override
    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.P = channelHandlerContext;
        this.O = (xE)channelHandlerContext.channel().attr(i).get();
        channelHandlerContext.channel().attr(j).set(this);
    }

    void U() throws UnsupportedEncodingException {
        O0 o0 = new O0();
        int n10 = xE.I();
        o0.C("msg_type", "remote_ping_request");
        o0.C("forward_server_id", this.O.B());
        int n11 = n10;
        o0.C("host", this.O.V());
        o0.C("forward2", this.O.r());
        byte[] byArray = o0.toString().getBytes("utf-8");
        xU xU2 = new xU(ai_0.f, byArray);
        try {
            this.P.writeAndFlush(xU2);
            if (n11 == 0) {
                ky_2.K(new String[2]);
            }
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw BA.a(unsupportedEncodingException);
        }
    }

    @Override
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        block4: {
            int n10;
            block5: {
                int n11 = xE.D();
                try {
                    Channel channel = channelHandlerContext.channel();
                    xU xU2 = (xU)object;
                    int n12 = xU2.S();
                    try {
                        n10 = n12;
                        if (n11 != 0) break block4;
                        if (n10 != ai_0.f) break block5;
                    }
                    catch (Exception exception) {
                        throw BA.a(exception);
                    }
                    O0 o0 = ai_0.L(xU2);
                    this.O.d(xU2);
                }
                catch (Throwable throwable) {
                    ReferenceCountUtil.release(object);
                    throw throwable;
                }
            }
            n10 = ReferenceCountUtil.release(object) ? 1 : 0;
        }
    }

    @Override
    public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.O.a();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        channelHandlerContext.close();
        throwable.printStackTrace();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFD523) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            char[] cArray = a[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 76;
                case 1 -> 3;
                case 2 -> 158;
                case 3 -> 7;
                case 4 -> 16;
                case 5 -> 34;
                case 6 -> 163;
                case 7 -> 1;
                case 8 -> 74;
                case 9 -> 143;
                case 10 -> 196;
                case 11 -> 114;
                case 12 -> 15;
                case 13 -> 184;
                case 14 -> 36;
                case 15 -> 229;
                case 16 -> 206;
                case 17 -> 117;
                case 18 -> 137;
                case 19 -> 25;
                case 20 -> 141;
                case 21 -> 207;
                case 22 -> 13;
                case 23 -> 168;
                case 24 -> 4;
                case 25 -> 156;
                case 26 -> 21;
                case 27 -> 183;
                case 28 -> 215;
                case 29 -> 135;
                case 30 -> 52;
                case 31 -> 189;
                case 32 -> 125;
                case 33 -> 106;
                case 34 -> 144;
                case 35 -> 138;
                case 36 -> 40;
                case 37 -> 77;
                case 38 -> 185;
                case 39 -> 194;
                case 40 -> 72;
                case 41 -> 128;
                case 42 -> 216;
                case 43 -> 47;
                case 44 -> 177;
                case 45 -> 159;
                case 46 -> 200;
                case 47 -> 241;
                case 48 -> 64;
                case 49 -> 100;
                case 50 -> 198;
                case 51 -> 82;
                case 52 -> 19;
                case 53 -> 120;
                case 54 -> 165;
                case 55 -> 90;
                case 56 -> 123;
                case 57 -> 6;
                case 58 -> 227;
                case 59 -> 70;
                case 60 -> 56;
                case 61 -> 252;
                case 62 -> 175;
                case 63 -> 121;
                case 64 -> 48;
                case 65 -> 54;
                case 66 -> 103;
                case 67 -> 236;
                case 68 -> 108;
                case 69 -> 228;
                case 70 -> 66;
                case 71 -> 218;
                case 72 -> 8;
                case 73 -> 203;
                case 74 -> 89;
                case 75 -> 101;
                case 76 -> 139;
                case 77 -> 102;
                case 78 -> 27;
                case 79 -> 224;
                case 80 -> 245;
                case 81 -> 59;
                case 82 -> 22;
                case 83 -> 187;
                case 84 -> 181;
                case 85 -> 10;
                case 86 -> 182;
                case 87 -> 65;
                case 88 -> 247;
                case 89 -> 172;
                case 90 -> 239;
                case 91 -> 191;
                case 92 -> 30;
                case 93 -> 211;
                case 94 -> 251;
                case 95 -> 78;
                case 96 -> 119;
                case 97 -> 179;
                case 98 -> 230;
                case 99 -> 130;
                case 100 -> 253;
                case 101 -> 173;
                case 102 -> 237;
                case 103 -> 26;
                case 104 -> 240;
                case 105 -> 205;
                case 106 -> 62;
                case 107 -> 209;
                case 108 -> 223;
                case 109 -> 199;
                case 110 -> 41;
                case 111 -> 149;
                case 112 -> 212;
                case 113 -> 11;
                case 114 -> 153;
                case 115 -> 233;
                case 116 -> 244;
                case 117 -> 145;
                case 118 -> 154;
                case 119 -> 98;
                case 120 -> 80;
                case 121 -> 23;
                case 122 -> 60;
                case 123 -> 93;
                case 124 -> 92;
                case 125 -> 146;
                case 126 -> 20;
                case 127 -> 85;
                case 128 -> 192;
                case 129 -> 104;
                case 130 -> 148;
                case 131 -> 133;
                case 132 -> 35;
                case 133 -> 249;
                case 134 -> 67;
                case 135 -> 250;
                case 136 -> 171;
                case 137 -> 197;
                case 138 -> 42;
                case 139 -> 83;
                case 140 -> 162;
                case 141 -> 217;
                case 142 -> 170;
                case 143 -> 134;
                case 144 -> 188;
                case 145 -> 160;
                case 146 -> 157;
                case 147 -> 213;
                case 148 -> 68;
                case 149 -> 55;
                case 150 -> 235;
                case 151 -> 43;
                case 152 -> 91;
                case 153 -> 242;
                case 154 -> 208;
                case 155 -> 28;
                case 156 -> 51;
                case 157 -> 132;
                case 158 -> 176;
                case 159 -> 167;
                case 160 -> 131;
                case 161 -> 45;
                case 162 -> 49;
                case 163 -> 53;
                case 164 -> 31;
                case 165 -> 195;
                case 166 -> 44;
                case 167 -> 152;
                case 168 -> 254;
                case 169 -> 69;
                case 170 -> 210;
                case 171 -> 88;
                case 172 -> 124;
                case 173 -> 186;
                case 174 -> 140;
                case 175 -> 37;
                case 176 -> 214;
                case 177 -> 150;
                case 178 -> 75;
                case 179 -> 234;
                case 180 -> 222;
                case 181 -> 109;
                case 182 -> 226;
                case 183 -> 232;
                case 184 -> 113;
                case 185 -> 151;
                case 186 -> 17;
                case 187 -> 58;
                case 188 -> 107;
                case 189 -> 86;
                case 190 -> 63;
                case 191 -> 225;
                case 192 -> 50;
                case 193 -> 231;
                case 194 -> 46;
                case 195 -> 0;
                case 196 -> 202;
                case 197 -> 174;
                case 198 -> 39;
                case 199 -> 33;
                case 200 -> 204;
                case 201 -> 193;
                case 202 -> 219;
                case 203 -> 246;
                case 204 -> 12;
                case 205 -> 248;
                case 206 -> 122;
                case 207 -> 166;
                case 208 -> 81;
                case 209 -> 255;
                case 210 -> 169;
                case 211 -> 220;
                case 212 -> 57;
                case 213 -> 95;
                case 214 -> 29;
                case 215 -> 9;
                case 216 -> 110;
                case 217 -> 14;
                case 218 -> 115;
                case 219 -> 147;
                case 220 -> 97;
                case 221 -> 32;
                case 222 -> 73;
                case 223 -> 18;
                case 224 -> 221;
                case 225 -> 87;
                case 226 -> 178;
                case 227 -> 142;
                case 228 -> 161;
                case 229 -> 112;
                case 230 -> 79;
                case 231 -> 127;
                case 232 -> 5;
                case 233 -> 155;
                case 234 -> 126;
                case 235 -> 164;
                case 236 -> 243;
                case 237 -> 129;
                case 238 -> 84;
                case 239 -> 180;
                case 240 -> 71;
                case 241 -> 190;
                case 242 -> 238;
                case 243 -> 61;
                case 244 -> 201;
                case 245 -> 24;
                case 246 -> 99;
                case 247 -> 118;
                case 248 -> 94;
                case 249 -> 105;
                case 250 -> 96;
                case 251 -> 116;
                case 252 -> 136;
                case 253 -> 111;
                case 254 -> 2;
                default -> 38;
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
            BA.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

