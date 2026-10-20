/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.io.OutputStream;

/*
 * Renamed from xd
 */
public class xd_0 {
    int q = -1;
    boolean f = false;
    byte[] g;
    int W;
    int U;
    int M = -1;
    fs_0 l;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    /*
     * Unable to fully structure code
     */
    public void f(InputStream var1_1, CU var2_2, int var3_3, xd_0 var4_4) throws Exception {
        var6_5 = 0;
        var7_6 = new byte[xd_0.a(8587, 5394582921031408935L)];
        var8_7 = false;
        var5_8 = qm_0.J();
        try {
            if (var5_8 == null) {
                while (true) {
                    this.f = true;
                    break;
                }
            }
            ** GOTO lbl22
        }
        catch (Exception v0) {
            throw xd_0.a(v0);
        }
        do {
            block10: {
                block9: {
                    v1 = var8_7;
                    if (var5_8 == null) break block9;
                    if (v1) break block10;
                    v1 = true;
                }
                var8_7 = v1;
            }
            var2_2.V(var7_6, 0, var6_5);
lbl22:
            // 2 sources

            if ((var6_5 = var1_1.read(var7_6)) > 0) ** continue;
        } while (var5_8 == null);
    }

    /*
     * Unable to fully structure code
     */
    void x(long var1_1, int var3_2, int var4_3) {
        block5: {
            var6_4 = (long)(1000.0f * (float)var4_3 / (float)var3_2);
            var5_5 = qm_0.J();
            var8_6 = System.currentTimeMillis() - var1_1;
            try {
                v0 = var8_6;
                v1 = var6_4;
                if (var5_5 != null) {
                    if (v0 >= v1) break block5;
                }
                ** GOTO lbl16
            }
            catch (InterruptedException v2) {
                throw xd_0.a(v2);
            }
            try {
                v0 = var6_4;
                v1 = var8_6;
lbl16:
                // 2 sources

                Thread.sleep(v0 - v1);
            }
            catch (InterruptedException var10_7) {
                var10_7.printStackTrace();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void S(InputStream var1_1, OutputStream var2_2, int var3_3, qm_0 var4_4) throws Exception {
        var6_5 = 0;
        var7_6 = new byte[xd_0.a(12310, 4116637390755646651L)];
        var8_7 = 0;
        var9_8 = 0;
        var10_9 = false;
        var11_10 = 0;
        var5_11 = qm_0.J();
        try {
            if (var5_11 == null) {
                while (true) {
                    this.U += var6_5;
                    break;
                }
            }
            ** GOTO lbl61
        }
        catch (Exception v0) {
            throw xd_0.a(v0);
        }
        do {
            block19: {
                block20: {
                    block17: {
                        block18: {
                            v1 = var9_8;
                            if (var5_11 != null) {
                                if (v1 == 0) {
                                    this.g = var7_6;
                                    this.W = var6_5;
                                    var9_8 = 1;
                                }
                                v1 = this.M;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (var5_11 == null) break block17;
                                            if (v1 <= 0) break block18;
                                        }
                                        catch (Exception v2) {
                                            throw xd_0.a(v2);
                                        }
                                        if (this.l == null) break block18;
                                    }
                                    catch (Exception v3) {
                                        throw xd_0.a(v3);
                                    }
                                    v1 = var11_10;
                                    if (var5_11 == null) break block17;
                                }
                                catch (Exception v4) {
                                    throw xd_0.a(v4);
                                }
                                if (v1 != 0) break block18;
                            }
                            catch (Exception v5) {
                                throw xd_0.a(v5);
                            }
                            var11_10 = 1;
                            var12_12 = "端口" + this.M + "连接成功";
                            this.l.V(var12_12);
                            lx_2.u(var12_12);
                        }
                        var2_2.write(var7_6, 0, var6_5);
                        v1 = var8_7;
                    }
                    try {
                        if (var5_11 == null) break block19;
                        if (v1 != 0) break block20;
                    }
                    catch (Exception v6) {
                        throw xd_0.a(v6);
                    }
                    var8_7 = 1;
                }
                v1 = var1_1.read(var7_6, 0, var7_6.length);
            }
            if (v1 > 0) ** continue;
        } while (var5_11 == null);
    }

    public int P() {
        return this.U;
    }

    public void i(int n10) {
        this.M = n10;
    }

    public fs_0 L() {
        return this.l;
    }

    public void T(fs_0 fs_02) {
        this.l = fs_02;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "\u8f31\u63b5\u6253\u5242\u0002\u7ab1\u536b";
                    var12_3 = "\u8f31\u63b5\u6253\u5242\u0002\u7ab1\u536b".length();
                    var9_4 = 4;
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
                        break block15;
                        break;
                    }
                    v1 = ++var8_5;
                    v2 = var10_2.substring(v1, v1 + var9_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 33;
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
                                    v11 = 32;
                                    break;
                                }
                                case 1: {
                                    v11 = 48;
                                    break;
                                }
                                case 2: {
                                    v11 = 97;
                                    break;
                                }
                                case 3: {
                                    v11 = 121;
                                    break;
                                }
                                case 4: {
                                    v11 = 42;
                                    break;
                                }
                                case 5: {
                                    v11 = 16;
                                    break;
                                }
                                default: {
                                    v11 = 99;
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
                xd_0.a = var13;
                xd_0.b = new String[2];
                var0_7 = 6481301779687671382L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "_\u00d3\u0096\u00b1up\u00c9\u0005E\u00bd\u00fc\u00e6\u00ab\u0012\u00cbq";
                var5_11 = "_\u00d3\u0096\u00b1up\u00c9\u0005E\u00bd\u00fc\u00e6\u00ab\u0012\u00cbq".length();
                var2_12 = 0;
                while (true) {
                    break block16;
                    break;
                }
lbl85:
                // 1 sources

                while (true) {
                    var6_8[v12] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block17;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v12 = var3_9++;
            ** while (true)
        }
        xd_0.c = var6_8;
        xd_0.d = new Integer[2];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x57BC) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            char[] cArray = a[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 5;
                case 1 -> 169;
                case 2 -> 222;
                case 3 -> 179;
                case 4 -> 0;
                case 5 -> 163;
                case 6 -> 252;
                case 7 -> 59;
                case 8 -> 236;
                case 9 -> 51;
                case 10 -> 60;
                case 11 -> 55;
                case 12 -> 178;
                case 13 -> 121;
                case 14 -> 109;
                case 15 -> 11;
                case 16 -> 12;
                case 17 -> 41;
                case 18 -> 137;
                case 19 -> 125;
                case 20 -> 220;
                case 21 -> 141;
                case 22 -> 39;
                case 23 -> 66;
                case 24 -> 176;
                case 25 -> 239;
                case 26 -> 203;
                case 27 -> 247;
                case 28 -> 38;
                case 29 -> 2;
                case 30 -> 213;
                case 31 -> 71;
                case 32 -> 162;
                case 33 -> 135;
                case 34 -> 68;
                case 35 -> 139;
                case 36 -> 16;
                case 37 -> 84;
                case 38 -> 81;
                case 39 -> 120;
                case 40 -> 111;
                case 41 -> 216;
                case 42 -> 64;
                case 43 -> 240;
                case 44 -> 234;
                case 45 -> 23;
                case 46 -> 147;
                case 47 -> 113;
                case 48 -> 7;
                case 49 -> 228;
                case 50 -> 72;
                case 51 -> 183;
                case 52 -> 43;
                case 53 -> 164;
                case 54 -> 1;
                case 55 -> 255;
                case 56 -> 229;
                case 57 -> 159;
                case 58 -> 9;
                case 59 -> 202;
                case 60 -> 177;
                case 61 -> 89;
                case 62 -> 32;
                case 63 -> 122;
                case 64 -> 184;
                case 65 -> 148;
                case 66 -> 145;
                case 67 -> 58;
                case 68 -> 26;
                case 69 -> 235;
                case 70 -> 108;
                case 71 -> 253;
                case 72 -> 134;
                case 73 -> 161;
                case 74 -> 107;
                case 75 -> 46;
                case 76 -> 175;
                case 77 -> 57;
                case 78 -> 224;
                case 79 -> 231;
                case 80 -> 254;
                case 81 -> 199;
                case 82 -> 237;
                case 83 -> 123;
                case 84 -> 52;
                case 85 -> 106;
                case 86 -> 33;
                case 87 -> 10;
                case 88 -> 227;
                case 89 -> 152;
                case 90 -> 127;
                case 91 -> 218;
                case 92 -> 20;
                case 93 -> 219;
                case 94 -> 77;
                case 95 -> 186;
                case 96 -> 97;
                case 97 -> 91;
                case 98 -> 6;
                case 99 -> 36;
                case 100 -> 223;
                case 101 -> 25;
                case 102 -> 87;
                case 103 -> 65;
                case 104 -> 168;
                case 105 -> 174;
                case 106 -> 144;
                case 107 -> 142;
                case 108 -> 211;
                case 109 -> 14;
                case 110 -> 246;
                case 111 -> 4;
                case 112 -> 251;
                case 113 -> 27;
                case 114 -> 130;
                case 115 -> 126;
                case 116 -> 30;
                case 117 -> 79;
                case 118 -> 225;
                case 119 -> 96;
                case 120 -> 193;
                case 121 -> 206;
                case 122 -> 29;
                case 123 -> 230;
                case 124 -> 197;
                case 125 -> 165;
                case 126 -> 187;
                case 127 -> 92;
                case 128 -> 241;
                case 129 -> 189;
                case 130 -> 62;
                case 131 -> 166;
                case 132 -> 76;
                case 133 -> 114;
                case 134 -> 136;
                case 135 -> 182;
                case 136 -> 19;
                case 137 -> 82;
                case 138 -> 149;
                case 139 -> 103;
                case 140 -> 3;
                case 141 -> 70;
                case 142 -> 112;
                case 143 -> 54;
                case 144 -> 21;
                case 145 -> 181;
                case 146 -> 158;
                case 147 -> 205;
                case 148 -> 115;
                case 149 -> 250;
                case 150 -> 132;
                case 151 -> 155;
                case 152 -> 99;
                case 153 -> 73;
                case 154 -> 232;
                case 155 -> 100;
                case 156 -> 8;
                case 157 -> 170;
                case 158 -> 190;
                case 159 -> 83;
                case 160 -> 48;
                case 161 -> 45;
                case 162 -> 42;
                case 163 -> 138;
                case 164 -> 104;
                case 165 -> 24;
                case 166 -> 192;
                case 167 -> 93;
                case 168 -> 86;
                case 169 -> 22;
                case 170 -> 95;
                case 171 -> 140;
                case 172 -> 74;
                case 173 -> 119;
                case 174 -> 53;
                case 175 -> 34;
                case 176 -> 56;
                case 177 -> 196;
                case 178 -> 238;
                case 179 -> 209;
                case 180 -> 69;
                case 181 -> 185;
                case 182 -> 50;
                case 183 -> 245;
                case 184 -> 226;
                case 185 -> 151;
                case 186 -> 208;
                case 187 -> 133;
                case 188 -> 102;
                case 189 -> 49;
                case 190 -> 221;
                case 191 -> 88;
                case 192 -> 63;
                case 193 -> 249;
                case 194 -> 61;
                case 195 -> 31;
                case 196 -> 40;
                case 197 -> 195;
                case 198 -> 243;
                case 199 -> 13;
                case 200 -> 98;
                case 201 -> 15;
                case 202 -> 90;
                case 203 -> 143;
                case 204 -> 180;
                case 205 -> 18;
                case 206 -> 172;
                case 207 -> 75;
                case 208 -> 37;
                case 209 -> 124;
                case 210 -> 47;
                case 211 -> 198;
                case 212 -> 150;
                case 213 -> 80;
                case 214 -> 201;
                case 215 -> 167;
                case 216 -> 105;
                case 217 -> 28;
                case 218 -> 188;
                case 219 -> 131;
                case 220 -> 78;
                case 221 -> 207;
                case 222 -> 67;
                case 223 -> 154;
                case 224 -> 35;
                case 225 -> 248;
                case 226 -> 146;
                case 227 -> 214;
                case 228 -> 17;
                case 229 -> 210;
                case 230 -> 160;
                case 231 -> 129;
                case 232 -> 85;
                case 233 -> 242;
                case 234 -> 200;
                case 235 -> 156;
                case 236 -> 117;
                case 237 -> 191;
                case 238 -> 171;
                case 239 -> 194;
                case 240 -> 217;
                case 241 -> 118;
                case 242 -> 101;
                case 243 -> 212;
                case 244 -> 157;
                case 245 -> 128;
                case 246 -> 116;
                case 247 -> 204;
                case 248 -> 153;
                case 249 -> 233;
                case 250 -> 173;
                case 251 -> 94;
                case 252 -> 110;
                case 253 -> 215;
                case 254 -> 244;
                default -> 44;
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
            xd_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7CAD;
        if (d[n11] == null) {
            xd_0.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

