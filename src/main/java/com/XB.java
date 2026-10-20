/*
 * Decompiled with CFR 0.152.
 */
package com;

public class XB {
    public static final XB x;
    public static final XB e;
    public static final XB z;
    public static final XB l;
    public static final XB d;
    public static final XB U;
    public static final XB I;
    public static final XB h;
    public static final XB S;
    protected final int q;
    private final char[] R;
    private final int s;
    private final int b;
    private static int[] j;
    private static final String[] a;
    private static final String[] c;
    private static final long[] f;
    private static final Integer[] g;

    private XB(int n10, char[] cArray, int n11, int n12) {
        this.q = n10;
        this.R = cArray;
        this.s = n11;
        this.b = n12;
    }

    public static XB G(String string) {
        return XB.V(string.toCharArray(), 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int V(String string) {
        int n10 = 1;
        int n11 = 1;
        int[] nArray = XB.X();
        while (true) {
            block17: {
                block16: {
                    int n12;
                    int n13;
                    block15: {
                        int n14;
                        if ((n14 = string.charAt(n11++)) == XB.a(19677, 9212253326056996958L)) {
                            n14 = string.charAt(n11);
                            n13 = n10 << 2;
                            n12 = n14;
                            if (nArray == null) {
                                int n15;
                                int n16 = XB.a(16136, 5089441160449143697L);
                                if (nArray == null) {
                                    if (n12 == n16) {
                                        n15 = 0;
                                        return n13 | n15;
                                    }
                                    n15 = n14;
                                    if (nArray != null) return n13 | n15;
                                    n16 = XB.a(13386, 2655541516436945108L);
                                }
                                if (n15 != n16) {
                                    n15 = n14;
                                    if (nArray != null) return n13 | n15;
                                    if (n15 != XB.a(3328, 7654443794262065562L)) {
                                        n15 = 1;
                                        return n13 | n15;
                                    }
                                }
                                n15 = 2;
                                return n13 | n15;
                            }
                        } else {
                            n13 = n14;
                            n12 = XB.a(24340, 3199410945360122752L);
                        }
                        if (nArray == null) {
                            if (n13 == n12) {
                                while (string.charAt(n11++) != XB.a(6569, 3524073762061227318L)) {
                                }
                                ++n10;
                                if (nArray == null) continue;
                            }
                            n13 = n14;
                            n12 = XB.a(19367, 2761181721334499127L);
                        }
                        if (nArray != null) break block15;
                        if (n13 == n12) break block16;
                        n13 = n14;
                        n12 = XB.a(18704, 6211238611294799235L);
                    }
                    if (n13 != n12) break block17;
                }
                n10 += 2;
                if (nArray == null) continue;
            }
            ++n10;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static XB V(char[] cArray, int n10) {
        int n11;
        int[] nArray = XB.X();
        int n12 = cArray[n10];
        if (nArray == null) {
            switch (n12) {
                case 86: {
                    return x;
                }
                case 90: {
                    return e;
                }
                case 67: {
                    return z;
                }
                case 66: {
                    return l;
                }
                case 83: {
                    return d;
                }
                case 73: {
                    return U;
                }
                case 70: {
                    return I;
                }
                case 74: {
                    return h;
                }
                case 68: {
                    return S;
                }
                case 91: {
                    int n13 = 1;
                    while (cArray[n10 + n13] == XB.a(10527, 8524241054097515927L)) {
                        ++n13;
                        if (nArray != null) return new XB(XB.a(32280, 6769965947101737605L), cArray, n10, n13 + 1);
                        if (nArray == null) continue;
                    }
                    if (cArray[n10 + n13] != XB.a(1160, 2419731413243463684L)) return new XB(XB.a(32280, 6769965947101737605L), cArray, n10, n13 + 1);
                    ++n13;
                    while (cArray[n10 + n13] != XB.a(9548, 4376527785595120066L)) {
                        ++n13;
                        if (nArray == null) continue;
                    }
                    return new XB(XB.a(32280, 6769965947101737605L), cArray, n10, n13 + 1);
                }
            }
            n12 = n11 = 1;
        }
        while (cArray[n10 + n11] != XB.a(6569, 3524073762061227318L)) {
            ++n11;
            if (nArray == null) continue;
        }
        return new XB(XB.a(19373, 4865834831405401892L), cArray, n10 + 1, n11 - 1);
    }

    public String o() {
        return new String(this.R, this.s, this.b);
    }

    String i() {
        return new String(this.R, this.s, this.b);
    }

    private int N() {
        int n10 = 1;
        int[] nArray = XB.X();
        while (this.R[this.s + n10] == XB.a(16235, 1543027663308207085L)) {
            ++n10;
            if (nArray == null) continue;
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     */
    static XB[] l(String var0) {
        block8: {
            var2_1 = var0.toCharArray();
            var1_2 = XB.X();
            var3_3 = 1;
            var4_4 = 0;
            do {
                block11: {
                    block10: {
                        block9: {
                            if ((var5_5 = var2_1[var3_3++]) != XB.a(26212, 4753149480752704252L)) break block9;
                            if (var1_2 == null) {
                                if (var1_2 == null) break;
                            }
                            break block10;
                        }
                        v0 = var5_5;
                        v1 = XB.a(24340, 3199410945360122752L);
                        if (var1_2 == null) {
                            if (v0 == v1) {
                                while (var2_1[var3_3++] != XB.a(6569, 3524073762061227318L)) {
                                }
                                ++var4_4;
                                if (var1_2 == null) continue;
                            } else {
                                ** GOTO lbl20
                            }
                        }
                        break block11;
                    }
                    v0 = var5_5;
                    v1 = XB.a(10527, 8524241054097515927L);
                }
                if (v0 == v1) continue;
                ++var4_4;
            } while (var1_2 == null);
            var5_6 = new XB[var4_4];
            var3_3 = 1;
            var4_4 = 0;
            while (var2_1[var3_3] != XB.a(19677, 9212253326056996958L)) {
                v2 = var5_6;
                if (var1_2 == null) {
                    v2[var4_4] = XB.V(var2_1, var3_3);
                    v3 = var5_6[var4_4].b;
                    v4 = var5_6[var4_4].q;
                    if (var1_2 == null) {
                        v4 = v4 == XB.a(8336, 2134290973955238933L) ? 2 : 0;
                    }
                    var3_3 += v3 + v4;
                    ++var4_4;
                    if (var1_2 == null) continue;
                }
                break block8;
            }
            v2 = var5_6;
        }
        return v2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected String G() {
        int[] nArray = XB.X();
        switch (this.q) {
            case 0: {
                return XB.a(-5338, 4214);
            }
            case 1: {
                return XB.a(-5334, 11900);
            }
            case 2: {
                return XB.a(-5340, -22418);
            }
            case 3: {
                return XB.a(-5339, -6645);
            }
            case 4: {
                return XB.a(-5341, 14794);
            }
            case 5: {
                return XB.a(-5333, 9808);
            }
            case 6: {
                return XB.a(-5344, 11938);
            }
            case 7: {
                return XB.a(-5343, -21539);
            }
            case 8: {
                return XB.a(-5342, 31438);
            }
            case 9: {
                StringBuilder stringBuilder;
                XB xB2 = XB.V(this.R, this.s + this.N());
                StringBuilder stringBuilder2 = new StringBuilder(xB2.G());
                for (int i2 = this.N(); i2 > 0; --i2) {
                    stringBuilder = stringBuilder2.append(XB.a(-5337, -13937));
                    if (nArray != null) return stringBuilder.toString();
                    if (nArray == null) continue;
                }
                stringBuilder = stringBuilder2;
                return stringBuilder.toString();
            }
        }
        return new String(this.R, this.s, this.b).replace((char)XB.a(23277, 6906823373596874346L), (char)XB.a(26771, 3288223279149671426L));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                block27: {
                    block26: {
                        var13 = new String[10];
                        var11_1 = 0;
                        var10_2 = "\u0082\u00dc\u00e0\u00a9?\u0006\u00f9\u00ba`\u0092n\u00d5\u0004\u0099|~O\u0005J\u00c8N\u00bc\u00ea\u0002\u00e5\u001d\u0004\u000b\u0088r\u00d2\u0004:2\u00dfP\u0004TQ&\u0018";
                        var12_3 = "\u0082\u00dc\u00e0\u00a9?\u0006\u00f9\u00ba`\u0092n\u00d5\u0004\u0099|~O\u0005J\u00c8N\u00bc\u00ea\u0002\u00e5\u001d\u0004\u000b\u0088r\u00d2\u0004:2\u00dfP\u0004TQ&\u0018".length();
                        XB.N(null);
                        var9_4 = 5;
                        var8_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 98;
                            v1 = ++var8_5;
                            v2 = var10_2.substring(v1, v1 + var9_4);
                            v3 = -1;
                            break block26;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "\u00af\u00f2\u00e6\u0007\u00d8\u0013yH\u00fc\u00a4g";
                            var12_3 = "\u00af\u00f2\u00e6\u0007\u00d8\u0013yH\u00fc\u00a4g".length();
                            var9_4 = 3;
                            var8_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 14;
                                v5 = ++var8_5;
                                v2 = var10_2.substring(v5, v5 + var9_4);
                                v3 = 0;
                                break block26;
                                break;
                            }
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v4.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var14_6 = 0;
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > 1) ** GOTO lbl86
                    do {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var14_6;
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v15 = 20;
                                    break;
                                }
                                case 1: {
                                    v15 = 32;
                                    break;
                                }
                                case 2: {
                                    v15 = 110;
                                    break;
                                }
                                case 3: {
                                    v15 = 15;
                                    break;
                                }
                                case 4: {
                                    v15 = 54;
                                    break;
                                }
                                case 5: {
                                    v15 = 3;
                                    break;
                                }
                                default: {
                                    v15 = 86;
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var14_6;
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
                    } while (v10 > var14_6);
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
                XB.a = var13;
                XB.c = new String[10];
                var0_7 = 3610043439657893188L;
                var6_8 = new long[30];
                var3_9 = 0;
                var4_10 = "S\u00e4\u00af\u00e4\u00e1f\u00a8I\u00c6Wt{)\u000f\u0005\u00d43\u0000u\u00faV\u00f4\u00cf\u00c8\u00cc\u0097f\u00a6\u0014\u00c0\u00c7\u00003\u00b0Q\u008e\u00ddH+\u00c6;\u00f2\u00a0\u008d\u00c2\u00a6\u00bc\u0094E\u00c4\u00f5\t\u0095[\u000e\u0083\u00d5\u00b8\u00c4\u0018P\u0011W\u0091\u0090\f\u00cbx\u00ea\u00e1\u00c9\u00dd\u00e0%?\u00f8)_\u00d8:a\u00cfp\u00fb`\u001bF\u00a0\u007f\r\u00fb\u009a\u0014&n\u0088{A'\u0099m\u00e3x\u008d(\u00c3\u0092\u00f2\u00fc\u00a00Z\u00e0\u00a5\u00c4\u00a5#kYh\u00b87\u00ba;\u00c0\u00f8z7<\u00e3\u00ce\u0093O{\u00f6\u0084,\u0083i\u009c\u00e6\u008f\u0094\u00bd\u00bb\u00fb\u00af\u0086\f\u00b2\u00d1a\u008c\u0083O\u00ac\u00c6\u00b2\u00b5\f\u00e3R#\u0084zNE(\u00a1\u00c0\u00a99T\u00f8\u00ee\u00c25\u00ac\u00d5\u00a6\u0019-\u00faj\u0012#\u00f3\u008e\u00e5\u00c1\u0018\u0088\u00edTl\u00b9\u0001\u0012\u00eb\u0001d4\u00ca\u00aa\u00aa\u009f\u008e\u00f2\u00e0\u00c2E\u0082\u0099e\u0011[\u00fcj\u00c2\u0086\u0088G\u001cM";
                var5_11 = "S\u00e4\u00af\u00e4\u00e1f\u00a8I\u00c6Wt{)\u000f\u0005\u00d43\u0000u\u00faV\u00f4\u00cf\u00c8\u00cc\u0097f\u00a6\u0014\u00c0\u00c7\u00003\u00b0Q\u008e\u00ddH+\u00c6;\u00f2\u00a0\u008d\u00c2\u00a6\u00bc\u0094E\u00c4\u00f5\t\u0095[\u000e\u0083\u00d5\u00b8\u00c4\u0018P\u0011W\u0091\u0090\f\u00cbx\u00ea\u00e1\u00c9\u00dd\u00e0%?\u00f8)_\u00d8:a\u00cfp\u00fb`\u001bF\u00a0\u007f\r\u00fb\u009a\u0014&n\u0088{A'\u0099m\u00e3x\u008d(\u00c3\u0092\u00f2\u00fc\u00a00Z\u00e0\u00a5\u00c4\u00a5#kYh\u00b87\u00ba;\u00c0\u00f8z7<\u00e3\u00ce\u0093O{\u00f6\u0084,\u0083i\u009c\u00e6\u008f\u0094\u00bd\u00bb\u00fb\u00af\u0086\f\u00b2\u00d1a\u008c\u0083O\u00ac\u00c6\u00b2\u00b5\f\u00e3R#\u0084zNE(\u00a1\u00c0\u00a99T\u00f8\u00ee\u00c25\u00ac\u00d5\u00a6\u0019-\u00faj\u0012#\u00f3\u008e\u00e5\u00c1\u0018\u0088\u00edTl\u00b9\u0001\u0012\u00eb\u0001d4\u00ca\u00aa\u00aa\u009f\u008e\u00f2\u00e0\u00c2E\u0082\u0099e\u0011[\u00fcj\u00c2\u0086\u0088G\u001cM".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block28;
                    break;
                }
lbl113:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00de0o\u00dd\u00c4\u0000}3\u00a9\u0007\u00cb$\u00ff\u007f\u00fe\u0096";
                    var5_11 = "\u00de0o\u00dd\u00c4\u0000}3\u00a9\u0007\u00cb$\u00ff\u007f\u00fe\u0096".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl126:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block29;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl137:
                // 1 sources

                ** continue;
            }
        }
        XB.f = var6_8;
        XB.g = new Integer[30];
        XB.x = new XB(0, null, XB.a(6681, 5397795107347142274L), 1);
        XB.e = new XB(1, null, XB.a(26025, 6275195678922336548L), 1);
        XB.z = new XB(2, null, XB.a(28889, 5250476856469716037L), 1);
        XB.l = new XB(3, null, XB.a(29296, 4966517492757495525L), 1);
        XB.d = new XB(4, null, XB.a(22541, 7322695028083610759L), 1);
        XB.U = new XB(5, null, XB.a(30735, 4254254051424236696L), 1);
        XB.I = new XB(XB.a(18249, 1287394451977817030L), null, XB.a(19793, 9048505484603310547L), 1);
        XB.h = new XB(XB.a(395, 5961826723189853465L), null, XB.a(11407, 2388564008179310603L), 1);
        XB.S = new XB(XB.a(27104, 5784144790343279990L), null, XB.a(30693, 8119979968718764910L), 1);
    }

    public static void N(int[] nArray) {
        j = nArray;
    }

    public static int[] X() {
        return j;
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0xFFFFEB23) & 0xFFFF;
        if (c[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 100;
                    break;
                }
                case 1: {
                    n14 = 184;
                    break;
                }
                case 2: {
                    n14 = 41;
                    break;
                }
                case 3: {
                    n14 = 254;
                    break;
                }
                case 4: {
                    n14 = 213;
                    break;
                }
                case 5: {
                    n14 = 19;
                    break;
                }
                case 6: {
                    n14 = 104;
                    break;
                }
                case 7: {
                    n14 = 4;
                    break;
                }
                case 8: {
                    n14 = 66;
                    break;
                }
                case 9: {
                    n14 = 97;
                    break;
                }
                case 10: {
                    n14 = 139;
                    break;
                }
                case 11: {
                    n14 = 192;
                    break;
                }
                case 12: {
                    n14 = 42;
                    break;
                }
                case 13: {
                    n14 = 73;
                    break;
                }
                case 14: {
                    n14 = 215;
                    break;
                }
                case 15: {
                    n14 = 106;
                    break;
                }
                case 16: {
                    n14 = 236;
                    break;
                }
                case 17: {
                    n14 = 32;
                    break;
                }
                case 18: {
                    n14 = 187;
                    break;
                }
                case 19: {
                    n14 = 12;
                    break;
                }
                case 20: {
                    n14 = 21;
                    break;
                }
                case 21: {
                    n14 = 1;
                    break;
                }
                case 22: {
                    n14 = 16;
                    break;
                }
                case 23: {
                    n14 = 198;
                    break;
                }
                case 24: {
                    n14 = 193;
                    break;
                }
                case 25: {
                    n14 = 99;
                    break;
                }
                case 26: {
                    n14 = 75;
                    break;
                }
                case 27: {
                    n14 = 231;
                    break;
                }
                case 28: {
                    n14 = 140;
                    break;
                }
                case 29: {
                    n14 = 112;
                    break;
                }
                case 30: {
                    n14 = 18;
                    break;
                }
                case 31: {
                    n14 = 122;
                    break;
                }
                case 32: {
                    n14 = 58;
                    break;
                }
                case 33: {
                    n14 = 174;
                    break;
                }
                case 34: {
                    n14 = 45;
                    break;
                }
                case 35: {
                    n14 = 81;
                    break;
                }
                case 36: {
                    n14 = 118;
                    break;
                }
                case 37: {
                    n14 = 243;
                    break;
                }
                case 38: {
                    n14 = 190;
                    break;
                }
                case 39: {
                    n14 = 136;
                    break;
                }
                case 40: {
                    n14 = 28;
                    break;
                }
                case 41: {
                    n14 = 74;
                    break;
                }
                case 42: {
                    n14 = 84;
                    break;
                }
                case 43: {
                    n14 = 170;
                    break;
                }
                case 44: {
                    n14 = 17;
                    break;
                }
                case 45: {
                    n14 = 46;
                    break;
                }
                case 46: {
                    n14 = 93;
                    break;
                }
                case 47: {
                    n14 = 54;
                    break;
                }
                case 48: {
                    n14 = 232;
                    break;
                }
                case 49: {
                    n14 = 39;
                    break;
                }
                case 50: {
                    n14 = 61;
                    break;
                }
                case 51: {
                    n14 = 185;
                    break;
                }
                case 52: {
                    n14 = 48;
                    break;
                }
                case 53: {
                    n14 = 169;
                    break;
                }
                case 54: {
                    n14 = 153;
                    break;
                }
                case 55: {
                    n14 = 246;
                    break;
                }
                case 56: {
                    n14 = 120;
                    break;
                }
                case 57: {
                    n14 = 151;
                    break;
                }
                case 58: {
                    n14 = 56;
                    break;
                }
                case 59: {
                    n14 = 77;
                    break;
                }
                case 60: {
                    n14 = 72;
                    break;
                }
                case 61: {
                    n14 = 211;
                    break;
                }
                case 62: {
                    n14 = 251;
                    break;
                }
                case 63: {
                    n14 = 175;
                    break;
                }
                case 64: {
                    n14 = 115;
                    break;
                }
                case 65: {
                    n14 = 163;
                    break;
                }
                case 66: {
                    n14 = 204;
                    break;
                }
                case 67: {
                    n14 = 62;
                    break;
                }
                case 68: {
                    n14 = 195;
                    break;
                }
                case 69: {
                    n14 = 159;
                    break;
                }
                case 70: {
                    n14 = 180;
                    break;
                }
                case 71: {
                    n14 = 181;
                    break;
                }
                case 72: {
                    n14 = 137;
                    break;
                }
                case 73: {
                    n14 = 255;
                    break;
                }
                case 74: {
                    n14 = 223;
                    break;
                }
                case 75: {
                    n14 = 131;
                    break;
                }
                case 76: {
                    n14 = 221;
                    break;
                }
                case 77: {
                    n14 = 216;
                    break;
                }
                case 78: {
                    n14 = 253;
                    break;
                }
                case 79: {
                    n14 = 33;
                    break;
                }
                case 80: {
                    n14 = 98;
                    break;
                }
                case 81: {
                    n14 = 200;
                    break;
                }
                case 82: {
                    n14 = 27;
                    break;
                }
                case 83: {
                    n14 = 188;
                    break;
                }
                case 84: {
                    n14 = 80;
                    break;
                }
                case 85: {
                    n14 = 179;
                    break;
                }
                case 86: {
                    n14 = 167;
                    break;
                }
                case 87: {
                    n14 = 78;
                    break;
                }
                case 88: {
                    n14 = 130;
                    break;
                }
                case 89: {
                    n14 = 191;
                    break;
                }
                case 90: {
                    n14 = 218;
                    break;
                }
                case 91: {
                    n14 = 128;
                    break;
                }
                case 92: {
                    n14 = 161;
                    break;
                }
                case 93: {
                    n14 = 222;
                    break;
                }
                case 94: {
                    n14 = 101;
                    break;
                }
                case 95: {
                    n14 = 189;
                    break;
                }
                case 96: {
                    n14 = 9;
                    break;
                }
                case 97: {
                    n14 = 7;
                    break;
                }
                case 98: {
                    n14 = 194;
                    break;
                }
                case 99: {
                    n14 = 148;
                    break;
                }
                case 100: {
                    n14 = 30;
                    break;
                }
                case 101: {
                    n14 = 105;
                    break;
                }
                case 102: {
                    n14 = 158;
                    break;
                }
                case 103: {
                    n14 = 244;
                    break;
                }
                case 104: {
                    n14 = 252;
                    break;
                }
                case 105: {
                    n14 = 92;
                    break;
                }
                case 106: {
                    n14 = 208;
                    break;
                }
                case 107: {
                    n14 = 229;
                    break;
                }
                case 108: {
                    n14 = 86;
                    break;
                }
                case 109: {
                    n14 = 59;
                    break;
                }
                case 110: {
                    n14 = 205;
                    break;
                }
                case 111: {
                    n14 = 23;
                    break;
                }
                case 112: {
                    n14 = 25;
                    break;
                }
                case 113: {
                    n14 = 177;
                    break;
                }
                case 114: {
                    n14 = 53;
                    break;
                }
                case 115: {
                    n14 = 89;
                    break;
                }
                case 116: {
                    n14 = 219;
                    break;
                }
                case 117: {
                    n14 = 238;
                    break;
                }
                case 118: {
                    n14 = 82;
                    break;
                }
                case 119: {
                    n14 = 55;
                    break;
                }
                case 120: {
                    n14 = 166;
                    break;
                }
                case 121: {
                    n14 = 135;
                    break;
                }
                case 122: {
                    n14 = 11;
                    break;
                }
                case 123: {
                    n14 = 138;
                    break;
                }
                case 124: {
                    n14 = 113;
                    break;
                }
                case 125: {
                    n14 = 107;
                    break;
                }
                case 126: {
                    n14 = 201;
                    break;
                }
                case 127: {
                    n14 = 145;
                    break;
                }
                case 128: {
                    n14 = 154;
                    break;
                }
                case 129: {
                    n14 = 224;
                    break;
                }
                case 130: {
                    n14 = 228;
                    break;
                }
                case 131: {
                    n14 = 70;
                    break;
                }
                case 132: {
                    n14 = 49;
                    break;
                }
                case 133: {
                    n14 = 168;
                    break;
                }
                case 134: {
                    n14 = 206;
                    break;
                }
                case 135: {
                    n14 = 69;
                    break;
                }
                case 136: {
                    n14 = 173;
                    break;
                }
                case 137: {
                    n14 = 230;
                    break;
                }
                case 138: {
                    n14 = 71;
                    break;
                }
                case 139: {
                    n14 = 160;
                    break;
                }
                case 140: {
                    n14 = 183;
                    break;
                }
                case 141: {
                    n14 = 109;
                    break;
                }
                case 142: {
                    n14 = 178;
                    break;
                }
                case 143: {
                    n14 = 227;
                    break;
                }
                case 144: {
                    n14 = 165;
                    break;
                }
                case 145: {
                    n14 = 88;
                    break;
                }
                case 146: {
                    n14 = 226;
                    break;
                }
                case 147: {
                    n14 = 199;
                    break;
                }
                case 148: {
                    n14 = 51;
                    break;
                }
                case 149: {
                    n14 = 127;
                    break;
                }
                case 150: {
                    n14 = 22;
                    break;
                }
                case 151: {
                    n14 = 26;
                    break;
                }
                case 152: {
                    n14 = 94;
                    break;
                }
                case 153: {
                    n14 = 96;
                    break;
                }
                case 154: {
                    n14 = 111;
                    break;
                }
                case 155: {
                    n14 = 44;
                    break;
                }
                case 156: {
                    n14 = 147;
                    break;
                }
                case 157: {
                    n14 = 50;
                    break;
                }
                case 158: {
                    n14 = 197;
                    break;
                }
                case 159: {
                    n14 = 36;
                    break;
                }
                case 160: {
                    n14 = 157;
                    break;
                }
                case 161: {
                    n14 = 5;
                    break;
                }
                case 162: {
                    n14 = 126;
                    break;
                }
                case 163: {
                    n14 = 214;
                    break;
                }
                case 164: {
                    n14 = 245;
                    break;
                }
                case 165: {
                    n14 = 57;
                    break;
                }
                case 166: {
                    n14 = 91;
                    break;
                }
                case 167: {
                    n14 = 8;
                    break;
                }
                case 168: {
                    n14 = 241;
                    break;
                }
                case 169: {
                    n14 = 150;
                    break;
                }
                case 170: {
                    n14 = 40;
                    break;
                }
                case 171: {
                    n14 = 108;
                    break;
                }
                case 172: {
                    n14 = 172;
                    break;
                }
                case 173: {
                    n14 = 203;
                    break;
                }
                case 174: {
                    n14 = 242;
                    break;
                }
                case 175: {
                    n14 = 249;
                    break;
                }
                case 176: {
                    n14 = 119;
                    break;
                }
                case 177: {
                    n14 = 31;
                    break;
                }
                case 178: {
                    n14 = 182;
                    break;
                }
                case 179: {
                    n14 = 162;
                    break;
                }
                case 180: {
                    n14 = 196;
                    break;
                }
                case 181: {
                    n14 = 116;
                    break;
                }
                case 182: {
                    n14 = 37;
                    break;
                }
                case 183: {
                    n14 = 233;
                    break;
                }
                case 184: {
                    n14 = 247;
                    break;
                }
                case 185: {
                    n14 = 34;
                    break;
                }
                case 186: {
                    n14 = 29;
                    break;
                }
                case 187: {
                    n14 = 212;
                    break;
                }
                case 188: {
                    n14 = 114;
                    break;
                }
                case 189: {
                    n14 = 133;
                    break;
                }
                case 190: {
                    n14 = 38;
                    break;
                }
                case 191: {
                    n14 = 125;
                    break;
                }
                case 192: {
                    n14 = 14;
                    break;
                }
                case 193: {
                    n14 = 248;
                    break;
                }
                case 194: {
                    n14 = 220;
                    break;
                }
                case 195: {
                    n14 = 129;
                    break;
                }
                case 196: {
                    n14 = 13;
                    break;
                }
                case 197: {
                    n14 = 144;
                    break;
                }
                case 198: {
                    n14 = 141;
                    break;
                }
                case 199: {
                    n14 = 47;
                    break;
                }
                case 200: {
                    n14 = 6;
                    break;
                }
                case 201: {
                    n14 = 142;
                    break;
                }
                case 202: {
                    n14 = 103;
                    break;
                }
                case 203: {
                    n14 = 85;
                    break;
                }
                case 204: {
                    n14 = 171;
                    break;
                }
                case 205: {
                    n14 = 0;
                    break;
                }
                case 206: {
                    n14 = 234;
                    break;
                }
                case 207: {
                    n14 = 121;
                    break;
                }
                case 208: {
                    n14 = 60;
                    break;
                }
                case 209: {
                    n14 = 24;
                    break;
                }
                case 210: {
                    n14 = 235;
                    break;
                }
                case 211: {
                    n14 = 79;
                    break;
                }
                case 212: {
                    n14 = 217;
                    break;
                }
                case 213: {
                    n14 = 164;
                    break;
                }
                case 214: {
                    n14 = 110;
                    break;
                }
                case 215: {
                    n14 = 63;
                    break;
                }
                case 216: {
                    n14 = 143;
                    break;
                }
                case 217: {
                    n14 = 124;
                    break;
                }
                case 218: {
                    n14 = 102;
                    break;
                }
                case 219: {
                    n14 = 87;
                    break;
                }
                case 220: {
                    n14 = 15;
                    break;
                }
                case 221: {
                    n14 = 132;
                    break;
                }
                case 222: {
                    n14 = 209;
                    break;
                }
                case 223: {
                    n14 = 10;
                    break;
                }
                case 224: {
                    n14 = 83;
                    break;
                }
                case 225: {
                    n14 = 152;
                    break;
                }
                case 226: {
                    n14 = 43;
                    break;
                }
                case 227: {
                    n14 = 176;
                    break;
                }
                case 228: {
                    n14 = 240;
                    break;
                }
                case 229: {
                    n14 = 250;
                    break;
                }
                case 230: {
                    n14 = 35;
                    break;
                }
                case 231: {
                    n14 = 155;
                    break;
                }
                case 232: {
                    n14 = 117;
                    break;
                }
                case 233: {
                    n14 = 95;
                    break;
                }
                case 234: {
                    n14 = 64;
                    break;
                }
                case 235: {
                    n14 = 68;
                    break;
                }
                case 236: {
                    n14 = 156;
                    break;
                }
                case 237: {
                    n14 = 65;
                    break;
                }
                case 238: {
                    n14 = 146;
                    break;
                }
                case 239: {
                    n14 = 90;
                    break;
                }
                case 240: {
                    n14 = 202;
                    break;
                }
                case 241: {
                    n14 = 225;
                    break;
                }
                case 242: {
                    n14 = 134;
                    break;
                }
                case 243: {
                    n14 = 123;
                    break;
                }
                case 244: {
                    n14 = 67;
                    break;
                }
                case 245: {
                    n14 = 52;
                    break;
                }
                case 246: {
                    n14 = 186;
                    break;
                }
                case 247: {
                    n14 = 76;
                    break;
                }
                case 248: {
                    n14 = 239;
                    break;
                }
                case 249: {
                    n14 = 237;
                    break;
                }
                case 250: {
                    n14 = 2;
                    break;
                }
                case 251: {
                    n14 = 207;
                    break;
                }
                case 252: {
                    n14 = 210;
                    break;
                }
                case 253: {
                    n14 = 149;
                    break;
                }
                case 254: {
                    n14 = 20;
                    break;
                }
                default: {
                    n14 = 3;
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
            XB.c[n12] = new String(cArray).intern();
        }
        return c[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0xC9F;
        if (g[n11] == null) {
            XB.g[n11] = (int)(f[n11] ^ l2);
        }
        return g[n11];
    }
}

