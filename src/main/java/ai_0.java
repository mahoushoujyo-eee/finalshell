/*
 * Decompiled with CFR 0.152.
 */
import com.O0;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;

/*
 * Renamed from ai
 */
public class ai_0 {
    public static int f;
    public static HashSet k;
    public static int b;
    public static int S;
    public static int J;
    public static int V;
    private static final String[] a;
    private static final String[] c;

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "\u0096!0X\u000b\u0005\u0084\u009br\u000fC";
                    var12_3 = "\u0096!0X\u000b\u0005\u0084\u009br\u000fC".length();
                    var9_4 = 5;
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
                    v4 = 93;
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
                                    v11 = 71;
                                    break;
                                }
                                case 1: {
                                    v11 = 26;
                                    break;
                                }
                                case 2: {
                                    v11 = 65;
                                    break;
                                }
                                case 3: {
                                    v11 = 30;
                                    break;
                                }
                                case 4: {
                                    v11 = 65;
                                    break;
                                }
                                case 5: {
                                    v11 = 44;
                                    break;
                                }
                                default: {
                                    v11 = 57;
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
                ai_0.a = var13;
                ai_0.c = new String[2];
                var1_7 = 2271055143768585906L;
                var0_8 = new long[5];
                var4_9 = 0;
                var5_10 = "\u001a\u00a8z\u0081\u00e5\u00a6t\u00eaA$\u00f9\u00eb\u00e5\u00a6u[`9\u0019\u00de\u00e5\u00a92\u0087";
                var6_11 = "\u001a\u00a8z\u0081\u00e5\u00a6t\u00eaA$\u00f9\u00eb\u00e5\u00a6u[`9\u0019\u00de\u00e5\u00a92\u0087".length();
                var3_12 = 0;
                while (true) {
                    var7_13 = var5_10.substring(var3_12, var3_12 += 8).getBytes("ISO-8859-1");
                    v12 = var0_8;
                    v13 = var4_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var3_12 < var6_11) ** continue;
                    var5_10 = "\u00c0\u00b7\b+\u00e5\u00a6uZh4i\u000f\u00e5\u00a6wF";
                    var6_11 = "\u00c0\u00b7\b+\u00e5\u00a6uZh4i\u000f\u00e5\u00a6wF".length();
                    var3_12 = 0;
                    while (true) {
                        var7_13 = var5_10.substring(var3_12, var3_12 += 8).getBytes("ISO-8859-1");
                        v12 = var0_8;
                        v13 = var4_9++;
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
                    if (var3_12 < var6_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var1_7;
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
        ai_0.f = (int)var0_8[2];
        ai_0.k = new HashSet<E>();
        ai_0.b = (int)var0_8[3];
        ai_0.S = (int)var0_8[1];
        ai_0.J = (int)var0_8[4];
        ai_0.V = (int)var0_8[0];
        ai_0.k.add(ai_0.f);
    }

    public static O0 L(xU xU2) {
        O0 o0 = null;
        try {
            o0 = O0.y(new String(xU2.C(), "utf-8"));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        return o0;
    }

    public static xU N(O0 o0) {
        xU xU2 = null;
        try {
            byte[] byArray = o0.toString().getBytes("utf-8");
            xU2 = new xU(f, byArray);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        return xU2;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFD36E) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            char[] cArray = a[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 54;
                case 1 -> 64;
                case 2 -> 231;
                case 3 -> 229;
                case 4 -> 236;
                case 5 -> 20;
                case 6 -> 100;
                case 7 -> 141;
                case 8 -> 220;
                case 9 -> 183;
                case 10 -> 48;
                case 11 -> 202;
                case 12 -> 49;
                case 13 -> 201;
                case 14 -> 181;
                case 15 -> 249;
                case 16 -> 167;
                case 17 -> 218;
                case 18 -> 14;
                case 19 -> 66;
                case 20 -> 42;
                case 21 -> 160;
                case 22 -> 33;
                case 23 -> 179;
                case 24 -> 15;
                case 25 -> 96;
                case 26 -> 108;
                case 27 -> 219;
                case 28 -> 247;
                case 29 -> 149;
                case 30 -> 91;
                case 31 -> 102;
                case 32 -> 228;
                case 33 -> 39;
                case 34 -> 195;
                case 35 -> 175;
                case 36 -> 180;
                case 37 -> 75;
                case 38 -> 35;
                case 39 -> 117;
                case 40 -> 132;
                case 41 -> 255;
                case 42 -> 76;
                case 43 -> 155;
                case 44 -> 234;
                case 45 -> 166;
                case 46 -> 67;
                case 47 -> 90;
                case 48 -> 13;
                case 49 -> 95;
                case 50 -> 254;
                case 51 -> 71;
                case 52 -> 148;
                case 53 -> 144;
                case 54 -> 203;
                case 55 -> 70;
                case 56 -> 159;
                case 57 -> 192;
                case 58 -> 24;
                case 59 -> 189;
                case 60 -> 232;
                case 61 -> 122;
                case 62 -> 239;
                case 63 -> 188;
                case 64 -> 9;
                case 65 -> 190;
                case 66 -> 120;
                case 67 -> 105;
                case 68 -> 210;
                case 69 -> 191;
                case 70 -> 79;
                case 71 -> 21;
                case 72 -> 116;
                case 73 -> 45;
                case 74 -> 227;
                case 75 -> 114;
                case 76 -> 194;
                case 77 -> 246;
                case 78 -> 126;
                case 79 -> 59;
                case 80 -> 74;
                case 81 -> 0;
                case 82 -> 123;
                case 83 -> 110;
                case 84 -> 215;
                case 85 -> 27;
                case 86 -> 174;
                case 87 -> 41;
                case 88 -> 115;
                case 89 -> 57;
                case 90 -> 12;
                case 91 -> 147;
                case 92 -> 134;
                case 93 -> 11;
                case 94 -> 165;
                case 95 -> 31;
                case 96 -> 153;
                case 97 -> 86;
                case 98 -> 99;
                case 99 -> 89;
                case 100 -> 56;
                case 101 -> 6;
                case 102 -> 23;
                case 103 -> 85;
                case 104 -> 128;
                case 105 -> 197;
                case 106 -> 177;
                case 107 -> 53;
                case 108 -> 252;
                case 109 -> 109;
                case 110 -> 61;
                case 111 -> 152;
                case 112 -> 162;
                case 113 -> 32;
                case 114 -> 3;
                case 115 -> 46;
                case 116 -> 138;
                case 117 -> 118;
                case 118 -> 163;
                case 119 -> 43;
                case 120 -> 158;
                case 121 -> 68;
                case 122 -> 94;
                case 123 -> 150;
                case 124 -> 111;
                case 125 -> 187;
                case 126 -> 97;
                case 127 -> 22;
                case 128 -> 28;
                case 129 -> 178;
                case 130 -> 7;
                case 131 -> 154;
                case 132 -> 209;
                case 133 -> 98;
                case 134 -> 82;
                case 135 -> 200;
                case 136 -> 50;
                case 137 -> 69;
                case 138 -> 143;
                case 139 -> 212;
                case 140 -> 170;
                case 141 -> 224;
                case 142 -> 106;
                case 143 -> 58;
                case 144 -> 101;
                case 145 -> 161;
                case 146 -> 44;
                case 147 -> 253;
                case 148 -> 30;
                case 149 -> 206;
                case 150 -> 213;
                case 151 -> 146;
                case 152 -> 145;
                case 153 -> 135;
                case 154 -> 40;
                case 155 -> 1;
                case 156 -> 104;
                case 157 -> 26;
                case 158 -> 127;
                case 159 -> 151;
                case 160 -> 241;
                case 161 -> 93;
                case 162 -> 92;
                case 163 -> 235;
                case 164 -> 72;
                case 165 -> 83;
                case 166 -> 140;
                case 167 -> 184;
                case 168 -> 60;
                case 169 -> 186;
                case 170 -> 172;
                case 171 -> 211;
                case 172 -> 238;
                case 173 -> 205;
                case 174 -> 103;
                case 175 -> 38;
                case 176 -> 80;
                case 177 -> 17;
                case 178 -> 242;
                case 179 -> 139;
                case 180 -> 176;
                case 181 -> 198;
                case 182 -> 62;
                case 183 -> 8;
                case 184 -> 208;
                case 185 -> 63;
                case 186 -> 199;
                case 187 -> 124;
                case 188 -> 125;
                case 189 -> 133;
                case 190 -> 136;
                case 191 -> 237;
                case 192 -> 121;
                case 193 -> 4;
                case 194 -> 130;
                case 195 -> 185;
                case 196 -> 250;
                case 197 -> 156;
                case 198 -> 226;
                case 199 -> 207;
                case 200 -> 216;
                case 201 -> 47;
                case 202 -> 55;
                case 203 -> 245;
                case 204 -> 88;
                case 205 -> 230;
                case 206 -> 173;
                case 207 -> 107;
                case 208 -> 251;
                case 209 -> 73;
                case 210 -> 182;
                case 211 -> 137;
                case 212 -> 112;
                case 213 -> 221;
                case 214 -> 131;
                case 215 -> 164;
                case 216 -> 77;
                case 217 -> 119;
                case 218 -> 243;
                case 219 -> 51;
                case 220 -> 157;
                case 221 -> 36;
                case 222 -> 84;
                case 223 -> 5;
                case 224 -> 65;
                case 225 -> 37;
                case 226 -> 87;
                case 227 -> 129;
                case 228 -> 52;
                case 229 -> 222;
                case 230 -> 196;
                case 231 -> 2;
                case 232 -> 204;
                case 233 -> 244;
                case 234 -> 25;
                case 235 -> 223;
                case 236 -> 193;
                case 237 -> 10;
                case 238 -> 169;
                case 239 -> 78;
                case 240 -> 113;
                case 241 -> 217;
                case 242 -> 19;
                case 243 -> 214;
                case 244 -> 225;
                case 245 -> 248;
                case 246 -> 81;
                case 247 -> 168;
                case 248 -> 34;
                case 249 -> 233;
                case 250 -> 142;
                case 251 -> 18;
                case 252 -> 240;
                case 253 -> 171;
                case 254 -> 16;
                default -> 29;
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
            ai_0.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }
}

