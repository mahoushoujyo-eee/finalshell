/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class QL {
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;
    private static final long e;

    /*
     * Unable to fully structure code
     */
    public static void M(String[] var0) throws InterruptedException, ExecutionException {
        var2_1 = Executors.newFixedThreadPool(QL.a(29886, 7826841748864805573L));
        var1_2 = d8_0.Q();
        var3_3 = new ArrayList<Object>();
        var4_4 = 0;
        try {
            if (var1_2 != null) {
                ky_2.K(new String[4]);
            }
            ** GOTO lbl17
        }
        catch (InterruptedException v0) {
            throw QL.a(v0);
        }
        do {
            var5_6 = var2_1.submit((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$0(), ()V)());
            var3_3.add(var5_6);
            ++var4_4;
lbl17:
            // 2 sources

        } while (var4_4 < QL.a(6527, 8162298549557446405L));
        var5_6 = var3_3.iterator();
        try {
            if (var1_2 != null) {
                while (true) {
                    v1 = var5_6.next();
                    break;
                }
            }
            ** GOTO lbl31
        }
        catch (InterruptedException v2) {
            throw QL.a(v2);
        }
        do {
            var4_5 = (Future)v1;
            var4_5.get();
lbl31:
            // 2 sources

            if (var5_6.hasNext()) ** continue;
            var2_1.shutdown();
            v1 = System.out;
        } while (var1_2 != null);
        v1.println("All tasks are completed.");
    }

    private static void lambda$0() {
        try {
            System.out.println("Task " + Thread.currentThread().getName() + " is running");
            Thread.sleep(e);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block17: {
                    block16: {
                        var15 = new String[3];
                        var13_1 = 0;
                        var12_2 = " \u00d3\u00d7\u001d\u0098\u00ec\u0087Q\u0095\u00dah\u00fa/^\u00a5\u008b\u0000%[\u00b5\u00e3\u00f0\u00e9/\u0005\u00e0\u00d2g\u00da&\u000b\u001b\r\u00e2c\u00c47\u00d7\u00b9;,\u00e2";
                        var14_3 = " \u00d3\u00d7\u001d\u0098\u00ec\u0087Q\u0095\u00dah\u00fa/^\u00a5\u008b\u0000%[\u00b5\u00e3\u00f0\u00e9/\u0005\u00e0\u00d2g\u00da&\u000b\u001b\r\u00e2c\u00c47\u00d7\u00b9;,\u00e2".length();
                        var11_4 = 24;
                        var10_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            var15[var13_1++] = new String(v0).intern();
                            if ((var10_5 += var11_4) < var14_3) {
                                var11_4 = var12_2.charAt(var10_5);
                                ** continue;
                            }
                            break block16;
                            break;
                        }
                        v1 = ++var10_5;
                        v2 = var12_2.substring(v1, v1 + var11_4).toCharArray();
                        v3 = v2.length;
                        var16_6 = 0;
                        v4 = 61;
                        v5 = v2;
                        v6 = v3;
                        if (v3 > 1) ** GOTO lbl67
                        do {
                            v7 = v4;
                            v5 = v5;
                            v8 = v5;
                            v9 = v4;
                            v10 = var16_6;
                            while (true) {
                                switch (var16_6 % 7) {
                                    case 0: {
                                        v11 = 58;
                                        break;
                                    }
                                    case 1: {
                                        v11 = 81;
                                        break;
                                    }
                                    case 2: {
                                        v11 = 11;
                                        break;
                                    }
                                    case 3: {
                                        v11 = 22;
                                        break;
                                    }
                                    case 4: {
                                        v11 = 12;
                                        break;
                                    }
                                    case 5: {
                                        v11 = 82;
                                        break;
                                    }
                                    default: {
                                        v11 = 6;
                                    }
                                }
                                v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                                ++var16_6;
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
                        } while (v6 > var16_6);
                        ** while (true)
                    }
                    QL.a = var15;
                    QL.b = new String[3];
                    var2_7 = 3620785152225336531L;
                    var8_8 = new long[2];
                    var5_9 = 0;
                    var6_10 = "se\u00af\u0090\u00ac.\u00f6$\u00d7\b\u0019\u00a6{h\u009b\u00dc";
                    var7_11 = "se\u00af\u0090\u00ac.\u00f6$\u00d7\b\u0019\u00a6{h\u009b\u00dc".length();
                    var4_12 = 0;
                    while (true) {
                        break block17;
                        break;
                    }
lbl85:
                    // 1 sources

                    while (true) {
                        var8_8[v12] = (((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L) ^ var2_7;
                        if (var4_12 < var7_11) ** continue;
                        break block18;
                        break;
                    }
                }
                var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                v12 = var5_9++;
                ** while (true)
            }
            QL.c = var8_8;
            QL.d = new Integer[2];
            break block19;
lbl100:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 4182863905557583836L;
        ** while (true)
        QL.e = 4182863905557578836L ^ var0_14;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFF903E) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            char[] cArray = a[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 48;
                case 1 -> 192;
                case 2 -> 209;
                case 3 -> 61;
                case 4 -> 25;
                case 5 -> 117;
                case 6 -> 244;
                case 7 -> 71;
                case 8 -> 142;
                case 9 -> 15;
                case 10 -> 124;
                case 11 -> 17;
                case 12 -> 202;
                case 13 -> 208;
                case 14 -> 254;
                case 15 -> 68;
                case 16 -> 26;
                case 17 -> 140;
                case 18 -> 195;
                case 19 -> 96;
                case 20 -> 53;
                case 21 -> 49;
                case 22 -> 95;
                case 23 -> 215;
                case 24 -> 10;
                case 25 -> 176;
                case 26 -> 130;
                case 27 -> 87;
                case 28 -> 35;
                case 29 -> 131;
                case 30 -> 196;
                case 31 -> 16;
                case 32 -> 57;
                case 33 -> 180;
                case 34 -> 107;
                case 35 -> 67;
                case 36 -> 145;
                case 37 -> 28;
                case 38 -> 19;
                case 39 -> 42;
                case 40 -> 18;
                case 41 -> 64;
                case 42 -> 38;
                case 43 -> 233;
                case 44 -> 82;
                case 45 -> 219;
                case 46 -> 222;
                case 47 -> 33;
                case 48 -> 81;
                case 49 -> 129;
                case 50 -> 177;
                case 51 -> 133;
                case 52 -> 116;
                case 53 -> 12;
                case 54 -> 36;
                case 55 -> 230;
                case 56 -> 188;
                case 57 -> 50;
                case 58 -> 191;
                case 59 -> 189;
                case 60 -> 122;
                case 61 -> 106;
                case 62 -> 144;
                case 63 -> 74;
                case 64 -> 148;
                case 65 -> 90;
                case 66 -> 152;
                case 67 -> 37;
                case 68 -> 99;
                case 69 -> 146;
                case 70 -> 121;
                case 71 -> 20;
                case 72 -> 242;
                case 73 -> 161;
                case 74 -> 9;
                case 75 -> 212;
                case 76 -> 166;
                case 77 -> 123;
                case 78 -> 14;
                case 79 -> 7;
                case 80 -> 109;
                case 81 -> 190;
                case 82 -> 245;
                case 83 -> 172;
                case 84 -> 29;
                case 85 -> 151;
                case 86 -> 27;
                case 87 -> 115;
                case 88 -> 39;
                case 89 -> 239;
                case 90 -> 135;
                case 91 -> 70;
                case 92 -> 66;
                case 93 -> 32;
                case 94 -> 247;
                case 95 -> 243;
                case 96 -> 13;
                case 97 -> 184;
                case 98 -> 58;
                case 99 -> 241;
                case 100 -> 47;
                case 101 -> 174;
                case 102 -> 171;
                case 103 -> 24;
                case 104 -> 186;
                case 105 -> 225;
                case 106 -> 200;
                case 107 -> 199;
                case 108 -> 56;
                case 109 -> 136;
                case 110 -> 162;
                case 111 -> 165;
                case 112 -> 132;
                case 113 -> 113;
                case 114 -> 100;
                case 115 -> 5;
                case 116 -> 213;
                case 117 -> 59;
                case 118 -> 31;
                case 119 -> 182;
                case 120 -> 236;
                case 121 -> 163;
                case 122 -> 0;
                case 123 -> 118;
                case 124 -> 204;
                case 125 -> 175;
                case 126 -> 251;
                case 127 -> 51;
                case 128 -> 226;
                case 129 -> 111;
                case 130 -> 234;
                case 131 -> 170;
                case 132 -> 44;
                case 133 -> 138;
                case 134 -> 11;
                case 135 -> 228;
                case 136 -> 40;
                case 137 -> 23;
                case 138 -> 97;
                case 139 -> 63;
                case 140 -> 65;
                case 141 -> 143;
                case 142 -> 201;
                case 143 -> 221;
                case 144 -> 101;
                case 145 -> 198;
                case 146 -> 30;
                case 147 -> 105;
                case 148 -> 187;
                case 149 -> 21;
                case 150 -> 98;
                case 151 -> 114;
                case 152 -> 154;
                case 153 -> 235;
                case 154 -> 86;
                case 155 -> 76;
                case 156 -> 55;
                case 157 -> 75;
                case 158 -> 237;
                case 159 -> 4;
                case 160 -> 229;
                case 161 -> 8;
                case 162 -> 203;
                case 163 -> 210;
                case 164 -> 102;
                case 165 -> 179;
                case 166 -> 84;
                case 167 -> 1;
                case 168 -> 224;
                case 169 -> 253;
                case 170 -> 137;
                case 171 -> 206;
                case 172 -> 231;
                case 173 -> 207;
                case 174 -> 60;
                case 175 -> 218;
                case 176 -> 157;
                case 177 -> 223;
                case 178 -> 6;
                case 179 -> 159;
                case 180 -> 79;
                case 181 -> 156;
                case 182 -> 104;
                case 183 -> 83;
                case 184 -> 216;
                case 185 -> 211;
                case 186 -> 91;
                case 187 -> 149;
                case 188 -> 173;
                case 189 -> 103;
                case 190 -> 255;
                case 191 -> 94;
                case 192 -> 158;
                case 193 -> 126;
                case 194 -> 249;
                case 195 -> 41;
                case 196 -> 3;
                case 197 -> 139;
                case 198 -> 34;
                case 199 -> 169;
                case 200 -> 89;
                case 201 -> 205;
                case 202 -> 22;
                case 203 -> 214;
                case 204 -> 193;
                case 205 -> 197;
                case 206 -> 93;
                case 207 -> 164;
                case 208 -> 178;
                case 209 -> 52;
                case 210 -> 246;
                case 211 -> 62;
                case 212 -> 232;
                case 213 -> 2;
                case 214 -> 72;
                case 215 -> 134;
                case 216 -> 167;
                case 217 -> 252;
                case 218 -> 150;
                case 219 -> 73;
                case 220 -> 78;
                case 221 -> 168;
                case 222 -> 125;
                case 223 -> 250;
                case 224 -> 88;
                case 225 -> 54;
                case 226 -> 120;
                case 227 -> 45;
                case 228 -> 80;
                case 229 -> 141;
                case 230 -> 238;
                case 231 -> 181;
                case 232 -> 227;
                case 233 -> 69;
                case 234 -> 110;
                case 235 -> 43;
                case 236 -> 160;
                case 237 -> 185;
                case 238 -> 220;
                case 239 -> 128;
                case 240 -> 155;
                case 241 -> 153;
                case 242 -> 147;
                case 243 -> 46;
                case 244 -> 119;
                case 245 -> 183;
                case 246 -> 248;
                case 247 -> 217;
                case 248 -> 92;
                case 249 -> 127;
                case 250 -> 108;
                case 251 -> 77;
                case 252 -> 240;
                case 253 -> 112;
                case 254 -> 85;
                default -> 194;
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
            QL.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5E7B;
        if (d[n11] == null) {
            QL.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

