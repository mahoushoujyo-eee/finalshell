/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Renamed from gi
 */
public class gi_0
extends Thread {
    private Runnable N;
    private AtomicInteger M;
    private static final String[] a;
    private static final String[] b;

    public gi_0(Runnable runnable, AtomicInteger atomicInteger) {
        this.N = runnable;
        this.M = atomicInteger;
    }

    @Override
    public void run() {
        try {
            ((Runnable)this.N).run();
        }
        catch (Throwable throwable) {
            int n10 = ((AtomicInteger)this.M).getAndDecrement();
            System.out.println("terminate no " + n10 + " Threads");
            throw throwable;
        }
        int n11 = ((AtomicInteger)this.M).getAndDecrement();
        System.out.println("terminate no " + n11 + " Threads");
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[4];
                var3_1 = 0;
                var2_2 = "V\u0014\u001b\u00d8\u00de\u0085'\u00e1\b\u00cd\u00b5h\u00ec\u00b0\u0003\u00ea1";
                var4_3 = "V\u0014\u001b\u00d8\u00de\u0085'\u00e1\b\u00cd\u00b5h\u00ec\u00b0\u0003\u00ea1".length();
                var1_4 = 8;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 96;
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
                    var2_2 = "\u0013\u00fa\u0095\u00ef\u00b8r\u0081\u0014\u008b'\u00c2\u00f0\u00fa\r\u00de\u00aa,\u00e5\u008f3g<W\"YP\u0089";
                    var4_3 = "\u0013\u00fa\u0095\u00ef\u00b8r\u0081\u0014\u008b'\u00c2\u00f0\u00fa\r\u00de\u00aa,\u00e5\u008f3g<W\"YP\u0089".length();
                    var1_4 = 13;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 70;
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
                            v15 = 39;
                            break;
                        }
                        case 1: {
                            v15 = 119;
                            break;
                        }
                        case 2: {
                            v15 = 21;
                            break;
                        }
                        case 3: {
                            v15 = 116;
                            break;
                        }
                        case 4: {
                            v15 = 115;
                            break;
                        }
                        case 5: {
                            v15 = 33;
                            break;
                        }
                        default: {
                            v15 = 83;
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
        gi_0.a = var5;
        gi_0.b = new String[4];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x59F) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            char[] cArray = a[n12].toCharArray();
            int n14 = switch (cArray[0] & 0xFF) {
                case 0 -> 142;
                case 1 -> 1;
                case 2 -> 245;
                case 3 -> 75;
                case 4 -> 113;
                case 5 -> 231;
                case 6 -> 45;
                case 7 -> 51;
                case 8 -> 187;
                case 9 -> 249;
                case 10 -> 102;
                case 11 -> 252;
                case 12 -> 25;
                case 13 -> 242;
                case 14 -> 93;
                case 15 -> 208;
                case 16 -> 77;
                case 17 -> 171;
                case 18 -> 160;
                case 19 -> 39;
                case 20 -> 63;
                case 21 -> 74;
                case 22 -> 18;
                case 23 -> 173;
                case 24 -> 121;
                case 25 -> 217;
                case 26 -> 65;
                case 27 -> 204;
                case 28 -> 225;
                case 29 -> 234;
                case 30 -> 4;
                case 31 -> 54;
                case 32 -> 174;
                case 33 -> 117;
                case 34 -> 181;
                case 35 -> 224;
                case 36 -> 47;
                case 37 -> 212;
                case 38 -> 179;
                case 39 -> 62;
                case 40 -> 92;
                case 41 -> 147;
                case 42 -> 255;
                case 43 -> 169;
                case 44 -> 95;
                case 45 -> 99;
                case 46 -> 60;
                case 47 -> 229;
                case 48 -> 35;
                case 49 -> 17;
                case 50 -> 32;
                case 51 -> 132;
                case 52 -> 44;
                case 53 -> 130;
                case 54 -> 94;
                case 55 -> 58;
                case 56 -> 162;
                case 57 -> 24;
                case 58 -> 221;
                case 59 -> 210;
                case 60 -> 211;
                case 61 -> 10;
                case 62 -> 101;
                case 63 -> 38;
                case 64 -> 126;
                case 65 -> 202;
                case 66 -> 88;
                case 67 -> 232;
                case 68 -> 72;
                case 69 -> 151;
                case 70 -> 16;
                case 71 -> 21;
                case 72 -> 109;
                case 73 -> 152;
                case 74 -> 155;
                case 75 -> 219;
                case 76 -> 199;
                case 77 -> 119;
                case 78 -> 159;
                case 79 -> 37;
                case 80 -> 134;
                case 81 -> 188;
                case 82 -> 7;
                case 83 -> 14;
                case 84 -> 107;
                case 85 -> 68;
                case 86 -> 19;
                case 87 -> 198;
                case 88 -> 85;
                case 89 -> 192;
                case 90 -> 76;
                case 91 -> 137;
                case 92 -> 209;
                case 93 -> 87;
                case 94 -> 177;
                case 95 -> 81;
                case 96 -> 247;
                case 97 -> 26;
                case 98 -> 82;
                case 99 -> 251;
                case 100 -> 78;
                case 101 -> 146;
                case 102 -> 112;
                case 103 -> 98;
                case 104 -> 71;
                case 105 -> 133;
                case 106 -> 57;
                case 107 -> 108;
                case 108 -> 89;
                case 109 -> 97;
                case 110 -> 66;
                case 111 -> 197;
                case 112 -> 161;
                case 113 -> 201;
                case 114 -> 183;
                case 115 -> 226;
                case 116 -> 104;
                case 117 -> 166;
                case 118 -> 124;
                case 119 -> 48;
                case 120 -> 61;
                case 121 -> 239;
                case 122 -> 96;
                case 123 -> 254;
                case 124 -> 153;
                case 125 -> 206;
                case 126 -> 144;
                case 127 -> 91;
                case 128 -> 31;
                case 129 -> 196;
                case 130 -> 69;
                case 131 -> 246;
                case 132 -> 182;
                case 133 -> 250;
                case 134 -> 148;
                case 135 -> 15;
                case 136 -> 141;
                case 137 -> 158;
                case 138 -> 100;
                case 139 -> 168;
                case 140 -> 180;
                case 141 -> 215;
                case 142 -> 84;
                case 143 -> 156;
                case 144 -> 70;
                case 145 -> 220;
                case 146 -> 150;
                case 147 -> 184;
                case 148 -> 203;
                case 149 -> 214;
                case 150 -> 8;
                case 151 -> 59;
                case 152 -> 86;
                case 153 -> 186;
                case 154 -> 235;
                case 155 -> 9;
                case 156 -> 176;
                case 157 -> 244;
                case 158 -> 190;
                case 159 -> 122;
                case 160 -> 30;
                case 161 -> 163;
                case 162 -> 11;
                case 163 -> 5;
                case 164 -> 79;
                case 165 -> 207;
                case 166 -> 172;
                case 167 -> 52;
                case 168 -> 216;
                case 169 -> 139;
                case 170 -> 240;
                case 171 -> 200;
                case 172 -> 175;
                case 173 -> 178;
                case 174 -> 28;
                case 175 -> 36;
                case 176 -> 12;
                case 177 -> 129;
                case 178 -> 116;
                case 179 -> 205;
                case 180 -> 223;
                case 181 -> 83;
                case 182 -> 118;
                case 183 -> 105;
                case 184 -> 13;
                case 185 -> 40;
                case 186 -> 238;
                case 187 -> 194;
                case 188 -> 34;
                case 189 -> 90;
                case 190 -> 241;
                case 191 -> 253;
                case 192 -> 3;
                case 193 -> 111;
                case 194 -> 29;
                case 195 -> 236;
                case 196 -> 115;
                case 197 -> 50;
                case 198 -> 33;
                case 199 -> 73;
                case 200 -> 145;
                case 201 -> 170;
                case 202 -> 27;
                case 203 -> 120;
                case 204 -> 165;
                case 205 -> 64;
                case 206 -> 237;
                case 207 -> 185;
                case 208 -> 243;
                case 209 -> 67;
                case 210 -> 49;
                case 211 -> 140;
                case 212 -> 227;
                case 213 -> 131;
                case 214 -> 125;
                case 215 -> 114;
                case 216 -> 248;
                case 217 -> 56;
                case 218 -> 6;
                case 219 -> 136;
                case 220 -> 2;
                case 221 -> 218;
                case 222 -> 195;
                case 223 -> 154;
                case 224 -> 233;
                case 225 -> 138;
                case 226 -> 110;
                case 227 -> 222;
                case 228 -> 149;
                case 229 -> 106;
                case 230 -> 20;
                case 231 -> 213;
                case 232 -> 189;
                case 233 -> 53;
                case 234 -> 43;
                case 235 -> 191;
                case 236 -> 0;
                case 237 -> 42;
                case 238 -> 193;
                case 239 -> 164;
                case 240 -> 228;
                case 241 -> 80;
                case 242 -> 46;
                case 243 -> 157;
                case 244 -> 135;
                case 245 -> 167;
                case 246 -> 103;
                case 247 -> 230;
                case 248 -> 22;
                case 249 -> 128;
                case 250 -> 123;
                case 251 -> 127;
                case 252 -> 23;
                case 253 -> 55;
                case 254 -> 41;
                default -> 143;
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
            gi_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

