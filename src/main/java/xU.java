/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.util.Arrays;

public class xU {
    private int S;
    private int P;
    private byte[] l;
    private static int[] r;
    private static final String[] a;
    private static final String[] b;

    public xU(int n10, byte[] byArray) {
        this.S = n10;
        int[] nArray = xU.t();
        this.l = byArray;
        this.P = byArray.length;
        if (ky_2.F() != null) {
            xU.w(new int[3]);
        }
    }

    public int S() {
        return this.S;
    }

    public int j() {
        return this.P;
    }

    public void d(int n10) {
        this.P = n10;
    }

    public byte[] C() {
        return this.l;
    }

    public void x(byte[] byArray) {
        this.l = byArray;
    }

    public String toString() {
        String string = Arrays.toString(this.l);
        int n10 = this.P;
        int n11 = this.S;
        return "SmartCarProtocol [head_data=" + n11 + ", contentLength=" + n10 + ", content=" + string + "]";
    }

    public static void w(int[] nArray) {
        r = nArray;
    }

    public static int[] t() {
        return r;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var5 = new String[3];
            var3_1 = 0;
            var2_2 = "\u00bc\u00fa!M\u00146\u001c\u0099`\u0093\u00993>\u00fa,\u00c2\u00c9B|\u00fd\u008e\u0014=\u00e0\u00d2\u0089\u0096\u00f3\n\u001bZG\u00a0\u0080\u0002\u00d3\u00d29*\u0010%\u0003\u0080\u008bxg\u00cc~\u00da\u00ced{\u00c2\u00bd\u00bd\u008e";
            var4_3 = "\u00bc\u00fa!M\u00146\u001c\u0099`\u0093\u00993>\u00fa,\u00c2\u00c9B|\u00fd\u008e\u0014=\u00e0\u00d2\u0089\u0096\u00f3\n\u001bZG\u00a0\u0080\u0002\u00d3\u00d29*\u0010%\u0003\u0080\u008bxg\u00cc~\u00da\u00ced{\u00c2\u00bd\u00bd\u008e".length();
            var1_4 = 28;
            var0_5 = -1;
            xU.w(new int[2]);
lbl8:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl10:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 107;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl68
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 76;
                            break;
                        }
                        case 1: {
                            v11 = 20;
                            break;
                        }
                        case 2: {
                            v11 = 97;
                            break;
                        }
                        case 3: {
                            v11 = 36;
                            break;
                        }
                        case 4: {
                            v11 = 35;
                            break;
                        }
                        case 5: {
                            v11 = 98;
                            break;
                        }
                        default: {
                            v11 = 103;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl68:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        xU.a = var5;
        xU.b = new String[3];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x268) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            char[] cArray = a[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 102;
                case 1 -> 37;
                case 2 -> 238;
                case 3 -> 23;
                case 4 -> 240;
                case 5 -> 111;
                case 6 -> 226;
                case 7 -> 91;
                case 8 -> 246;
                case 9 -> 32;
                case 10 -> 96;
                case 11 -> 17;
                case 12 -> 124;
                case 13 -> 45;
                case 14 -> 35;
                case 15 -> 78;
                case 16 -> 145;
                case 17 -> 225;
                case 18 -> 42;
                case 19 -> 173;
                case 20 -> 241;
                case 21 -> 106;
                case 22 -> 116;
                case 23 -> 193;
                case 24 -> 5;
                case 25 -> 207;
                case 26 -> 14;
                case 27 -> 184;
                case 28 -> 98;
                case 29 -> 175;
                case 30 -> 146;
                case 31 -> 123;
                case 32 -> 47;
                case 33 -> 118;
                case 34 -> 171;
                case 35 -> 84;
                case 36 -> 67;
                case 37 -> 6;
                case 38 -> 24;
                case 39 -> 179;
                case 40 -> 31;
                case 41 -> 147;
                case 42 -> 18;
                case 43 -> 40;
                case 44 -> 56;
                case 45 -> 150;
                case 46 -> 161;
                case 47 -> 201;
                case 48 -> 196;
                case 49 -> 126;
                case 50 -> 188;
                case 51 -> 93;
                case 52 -> 59;
                case 53 -> 223;
                case 54 -> 216;
                case 55 -> 195;
                case 56 -> 50;
                case 57 -> 130;
                case 58 -> 41;
                case 59 -> 163;
                case 60 -> 148;
                case 61 -> 82;
                case 62 -> 151;
                case 63 -> 55;
                case 64 -> 224;
                case 65 -> 132;
                case 66 -> 52;
                case 67 -> 92;
                case 68 -> 176;
                case 69 -> 153;
                case 70 -> 21;
                case 71 -> 85;
                case 72 -> 254;
                case 73 -> 167;
                case 74 -> 2;
                case 75 -> 245;
                case 76 -> 228;
                case 77 -> 233;
                case 78 -> 127;
                case 79 -> 81;
                case 80 -> 215;
                case 81 -> 73;
                case 82 -> 156;
                case 83 -> 100;
                case 84 -> 164;
                case 85 -> 198;
                case 86 -> 103;
                case 87 -> 108;
                case 88 -> 210;
                case 89 -> 101;
                case 90 -> 221;
                case 91 -> 20;
                case 92 -> 181;
                case 93 -> 39;
                case 94 -> 15;
                case 95 -> 62;
                case 96 -> 194;
                case 97 -> 230;
                case 98 -> 140;
                case 99 -> 204;
                case 100 -> 247;
                case 101 -> 0;
                case 102 -> 72;
                case 103 -> 154;
                case 104 -> 80;
                case 105 -> 190;
                case 106 -> 120;
                case 107 -> 44;
                case 108 -> 214;
                case 109 -> 203;
                case 110 -> 25;
                case 111 -> 158;
                case 112 -> 115;
                case 113 -> 206;
                case 114 -> 1;
                case 115 -> 177;
                case 116 -> 10;
                case 117 -> 251;
                case 118 -> 70;
                case 119 -> 168;
                case 120 -> 12;
                case 121 -> 243;
                case 122 -> 180;
                case 123 -> 131;
                case 124 -> 57;
                case 125 -> 231;
                case 126 -> 229;
                case 127 -> 68;
                case 128 -> 77;
                case 129 -> 165;
                case 130 -> 16;
                case 131 -> 187;
                case 132 -> 186;
                case 133 -> 232;
                case 134 -> 49;
                case 135 -> 144;
                case 136 -> 222;
                case 137 -> 60;
                case 138 -> 79;
                case 139 -> 220;
                case 140 -> 235;
                case 141 -> 166;
                case 142 -> 86;
                case 143 -> 29;
                case 144 -> 94;
                case 145 -> 97;
                case 146 -> 54;
                case 147 -> 7;
                case 148 -> 63;
                case 149 -> 253;
                case 150 -> 192;
                case 151 -> 87;
                case 152 -> 142;
                case 153 -> 3;
                case 154 -> 34;
                case 155 -> 30;
                case 156 -> 61;
                case 157 -> 36;
                case 158 -> 157;
                case 159 -> 66;
                case 160 -> 105;
                case 161 -> 88;
                case 162 -> 219;
                case 163 -> 117;
                case 164 -> 152;
                case 165 -> 43;
                case 166 -> 172;
                case 167 -> 141;
                case 168 -> 234;
                case 169 -> 128;
                case 170 -> 11;
                case 171 -> 218;
                case 172 -> 58;
                case 173 -> 205;
                case 174 -> 209;
                case 175 -> 22;
                case 176 -> 107;
                case 177 -> 242;
                case 178 -> 33;
                case 179 -> 48;
                case 180 -> 252;
                case 181 -> 155;
                case 182 -> 83;
                case 183 -> 27;
                case 184 -> 112;
                case 185 -> 182;
                case 186 -> 8;
                case 187 -> 170;
                case 188 -> 46;
                case 189 -> 211;
                case 190 -> 227;
                case 191 -> 51;
                case 192 -> 149;
                case 193 -> 185;
                case 194 -> 199;
                case 195 -> 135;
                case 196 -> 89;
                case 197 -> 239;
                case 198 -> 139;
                case 199 -> 75;
                case 200 -> 202;
                case 201 -> 110;
                case 202 -> 197;
                case 203 -> 213;
                case 204 -> 74;
                case 205 -> 200;
                case 206 -> 114;
                case 207 -> 129;
                case 208 -> 4;
                case 209 -> 250;
                case 210 -> 9;
                case 211 -> 189;
                case 212 -> 191;
                case 213 -> 183;
                case 214 -> 13;
                case 215 -> 122;
                case 216 -> 136;
                case 217 -> 71;
                case 218 -> 90;
                case 219 -> 174;
                case 220 -> 38;
                case 221 -> 208;
                case 222 -> 237;
                case 223 -> 76;
                case 224 -> 255;
                case 225 -> 69;
                case 226 -> 95;
                case 227 -> 169;
                case 228 -> 236;
                case 229 -> 133;
                case 230 -> 64;
                case 231 -> 121;
                case 232 -> 28;
                case 233 -> 162;
                case 234 -> 134;
                case 235 -> 109;
                case 236 -> 244;
                case 237 -> 53;
                case 238 -> 65;
                case 239 -> 125;
                case 240 -> 212;
                case 241 -> 217;
                case 242 -> 159;
                case 243 -> 138;
                case 244 -> 178;
                case 245 -> 249;
                case 246 -> 160;
                case 247 -> 119;
                case 248 -> 143;
                case 249 -> 19;
                case 250 -> 104;
                case 251 -> 113;
                case 252 -> 248;
                case 253 -> 26;
                case 254 -> 137;
                default -> 99;
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
            xU.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

