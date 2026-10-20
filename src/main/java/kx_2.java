/*
 * Decompiled with CFR 0.152.
 */
import com.SI;
import com.c;
import com.xf_1;
import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

/*
 * Renamed from kx
 */
public class kx_2 {
    public static int l;
    public static int w;
    nY Y;
    nY z;
    public static int q;
    private static final String[] a;
    private static final String[] b;
    private static final long[] c;
    private static final Integer[] d;

    public kx_2() {
        this.z = new nY();
        try {
            this.z.c(new xf_1(new Color(0.8352941f, 0.8f, 0.7294118f)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.z.T(new xf_1(new Color(0.27058825f, 0.21568628f, 0.23529412f)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.z.M(new xf_1(new Color(0.5882353f, 0.54901963f, 0.5137255f)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.z.Y(new xf_1(new Color(0.27058825f, 0.21568628f, 0.23529412f)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            this.z.m(new xf_1(new Color(0.47058824f, 0.41568628f, 0.43529412f)));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        xf_1[] xf_1Array = new xf_1[kx_2.a(31690, 8628412214721101799L)];
        xf_1Array[0] = new xf_1(kx_2.a(24423, 5146334473861864282L));
        xf_1Array[1] = new xf_1(kx_2.a(1684, 4039935677526688431L));
        xf_1Array[2] = new xf_1(kx_2.a(6907, 8756122475605712599L));
        xf_1Array[3] = new xf_1(kx_2.a(10236, 4774934879673050066L));
        xf_1Array[4] = new xf_1(kx_2.a(3666, 2810679370775415421L));
        xf_1Array[5] = new xf_1(kx_2.a(23075, 3981810400714399263L));
        xf_1Array[kx_2.a((int)19630, (long)6597201366771271828L)] = new xf_1(kx_2.a(22035, 8845479885970969136L));
        xf_1Array[kx_2.a((int)12883, (long)3611985686335420026L)] = new xf_1(kx_2.a(25154, 1932617673854625382L));
        xf_1Array[kx_2.a((int)14088, (long)7517147510436655904L)] = new xf_1(kx_2.a(6311, 6686590675552853150L));
        xf_1Array[kx_2.a((int)23937, (long)9097216146352806326L)] = new xf_1(kx_2.a(3507, 3187538251654351244L));
        xf_1Array[kx_2.a((int)16607, (long)8516064370429527295L)] = new xf_1(kx_2.a(26253, 8669895057450443452L));
        xf_1Array[kx_2.a((int)26852, (long)1599531084961819854L)] = new xf_1(kx_2.a(12254, 6695165874712505322L));
        xf_1Array[kx_2.a((int)23236, (long)7485029964039692005L)] = new xf_1(kx_2.a(15278, 1934987899626651532L));
        xf_1Array[kx_2.a((int)11444, (long)4742214671564499073L)] = new xf_1(kx_2.a(27318, 626440786465304211L));
        xf_1Array[kx_2.a((int)20191, (long)6381277109636401901L)] = new xf_1(kx_2.a(8026, 5988583397512403818L));
        xf_1Array[kx_2.a((int)31892, (long)3254743700623505599L)] = new xf_1(kx_2.a(3603, 8106551052472142381L));
        SI sI = new SI(xf_1Array);
        try {
            this.z.B(sI);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    void z() {
        this.Y = this.z;
    }

    public void g(String string) {
        this.Y = this.z;
        try {
            Object object;
            try {
                object = FV.c("/resources/theme/" + string + ".json");
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            this.Y = object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public nY F() {
        return (nY)this.Y;
    }

    public void Q(nY nY2) {
        this.Y = nY2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var13 = new String[2];
                    var11_1 = 0;
                    var10_2 = "\u00b3\u0003\u00db\u00ba\"\u00f9\u0006\u0004M\u00fe\u00daI?\u0004l\u00f8`\u0005\u00c6\u00d5Bg\u00c4";
                    var12_3 = "\u00b3\u0003\u00db\u00ba\"\u00f9\u0006\u0004M\u00fe\u00daI?\u0004l\u00f8`\u0005\u00c6\u00d5Bg\u00c4".length();
                    var9_4 = 17;
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
                    v4 = 32;
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
                                    v11 = 2;
                                    break;
                                }
                                case 1: {
                                    v11 = 126;
                                    break;
                                }
                                case 2: {
                                    v11 = 102;
                                    break;
                                }
                                case 3: {
                                    v11 = 126;
                                    break;
                                }
                                case 4: {
                                    v11 = 23;
                                    break;
                                }
                                case 5: {
                                    v11 = 45;
                                    break;
                                }
                                default: {
                                    v11 = 116;
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
                kx_2.a = var13;
                kx_2.b = new String[2];
                var0_7 = 8369775979316235492L;
                var6_8 = new long[30];
                var3_9 = 0;
                var4_10 = "\u00c7\u00aaw\u0098V5\u00dc6\u00f2\u00f5-\u00a6\u00146\"\nr\u0094;\u0000\u009e\u0017\u000eKP\u0089\t\b\n\u00a2DvoE\u00df\u00b4\u0081l\u00e4\u008d?xdJ\u0001\u00f9R6\u0099J\u00fd\u00f3M\u0091\u0005hh\u00d8,Z\u00dcx\u00e8'\u00c2>\u00daY#\u0082\u0091X\u00ce\u00f7\u00ee\u00c9\u0084:hq\"\u0090\u0094\u00ee\u00f3\u00f0\u00b8\u00e8YqU>E\u0088F\u0007+\u00e3k\u00fc\u00d3\u0082\u00a4h.)\u00a4\u00a9z\u00ccX\u000e\u00f1\u0085\u00b4hP\u00f3U[\u00eb\u00f5rS\u00d8\u001a\u00d2T\u0097\u0003;\u0018\u00b7l\u00ba\u0099Q\u0090-\u00d5\u00cbt?\u00cc\u00c3\u009f\b\u0086>'tT\u00d9~!\u00b0\u008e\u00e5\u00e0!p|\u00fb`*\u00aas\u0013B,\u008e\u001bh\u00f7\u00df3\u0082\\9\u00b6\u00805\u0016f\u008d\u00bc\u00ea=\u00f0\u00f8\u00e26}\u00fc`\u001f\u00cb\u0000R\r\u00abz\u0088<Cm\u00c8\u0011\u00d9\u0095V \u00c7\u0094\u0093\u0019|\u0011\u00adt\u00a1\u0017\u00b1\u00dc";
                var5_11 = "\u00c7\u00aaw\u0098V5\u00dc6\u00f2\u00f5-\u00a6\u00146\"\nr\u0094;\u0000\u009e\u0017\u000eKP\u0089\t\b\n\u00a2DvoE\u00df\u00b4\u0081l\u00e4\u008d?xdJ\u0001\u00f9R6\u0099J\u00fd\u00f3M\u0091\u0005hh\u00d8,Z\u00dcx\u00e8'\u00c2>\u00daY#\u0082\u0091X\u00ce\u00f7\u00ee\u00c9\u0084:hq\"\u0090\u0094\u00ee\u00f3\u00f0\u00b8\u00e8YqU>E\u0088F\u0007+\u00e3k\u00fc\u00d3\u0082\u00a4h.)\u00a4\u00a9z\u00ccX\u000e\u00f1\u0085\u00b4hP\u00f3U[\u00eb\u00f5rS\u00d8\u001a\u00d2T\u0097\u0003;\u0018\u00b7l\u00ba\u0099Q\u0090-\u00d5\u00cbt?\u00cc\u00c3\u009f\b\u0086>'tT\u00d9~!\u00b0\u008e\u00e5\u00e0!p|\u00fb`*\u00aas\u0013B,\u008e\u001bh\u00f7\u00df3\u0082\\9\u00b6\u00805\u0016f\u008d\u00bc\u00ea=\u00f0\u00f8\u00e26}\u00fc`\u001f\u00cb\u0000R\r\u00abz\u0088<Cm\u00c8\u0011\u00d9\u0095V \u00c7\u0094\u0093\u0019|\u0011\u00adt\u00a1\u0017\u00b1\u00dc".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v12 = var6_8;
                    v13 = var3_9++;
                    v14 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v15 = -1;
                    break block21;
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "Y\u00cb\u0095\u008d\u0006Vb\u0088\u00bd\\f\u00adp\u00e7\u000fg";
                    var5_11 = "Y\u00cb\u0095\u008d\u0006Vb\u0088\u00bd\\f\u00adp\u00e7\u000fg".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v12 = var6_8;
                        v13 = var3_9++;
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
                    if (var2_12 < var5_11) ** continue;
                    break block22;
                    break;
                }
            }
            v16 = v14 ^ var0_7;
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
        kx_2.c = var6_8;
        kx_2.d = new Integer[30];
        kx_2.l = kx_2.a(10930, 393152542739787402L);
        kx_2.w = kx_2.a(23118, 480610282178551416L);
        kx_2.q = new Random(fx_2.v).nextInt(kx_2.a(27467, 7432002284127268728L));
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x565D) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 181;
                    break;
                }
                case 1: {
                    n14 = 147;
                    break;
                }
                case 2: {
                    n14 = 50;
                    break;
                }
                case 3: {
                    n14 = 215;
                    break;
                }
                case 4: {
                    n14 = 131;
                    break;
                }
                case 5: {
                    n14 = 245;
                    break;
                }
                case 6: {
                    n14 = 255;
                    break;
                }
                case 7: {
                    n14 = 12;
                    break;
                }
                case 8: {
                    n14 = 253;
                    break;
                }
                case 9: {
                    n14 = 178;
                    break;
                }
                case 10: {
                    n14 = 28;
                    break;
                }
                case 11: {
                    n14 = 99;
                    break;
                }
                case 12: {
                    n14 = 56;
                    break;
                }
                case 13: {
                    n14 = 226;
                    break;
                }
                case 14: {
                    n14 = 2;
                    break;
                }
                case 15: {
                    n14 = 153;
                    break;
                }
                case 16: {
                    n14 = 246;
                    break;
                }
                case 17: {
                    n14 = 235;
                    break;
                }
                case 18: {
                    n14 = 132;
                    break;
                }
                case 19: {
                    n14 = 217;
                    break;
                }
                case 20: {
                    n14 = 171;
                    break;
                }
                case 21: {
                    n14 = 170;
                    break;
                }
                case 22: {
                    n14 = 47;
                    break;
                }
                case 23: {
                    n14 = 105;
                    break;
                }
                case 24: {
                    n14 = 134;
                    break;
                }
                case 25: {
                    n14 = 167;
                    break;
                }
                case 26: {
                    n14 = 155;
                    break;
                }
                case 27: {
                    n14 = 107;
                    break;
                }
                case 28: {
                    n14 = 93;
                    break;
                }
                case 29: {
                    n14 = 22;
                    break;
                }
                case 30: {
                    n14 = 98;
                    break;
                }
                case 31: {
                    n14 = 174;
                    break;
                }
                case 32: {
                    n14 = 14;
                    break;
                }
                case 33: {
                    n14 = 92;
                    break;
                }
                case 34: {
                    n14 = 211;
                    break;
                }
                case 35: {
                    n14 = 23;
                    break;
                }
                case 36: {
                    n14 = 52;
                    break;
                }
                case 37: {
                    n14 = 45;
                    break;
                }
                case 38: {
                    n14 = 85;
                    break;
                }
                case 39: {
                    n14 = 118;
                    break;
                }
                case 40: {
                    n14 = 208;
                    break;
                }
                case 41: {
                    n14 = 31;
                    break;
                }
                case 42: {
                    n14 = 160;
                    break;
                }
                case 43: {
                    n14 = 137;
                    break;
                }
                case 44: {
                    n14 = 32;
                    break;
                }
                case 45: {
                    n14 = 187;
                    break;
                }
                case 46: {
                    n14 = 75;
                    break;
                }
                case 47: {
                    n14 = 69;
                    break;
                }
                case 48: {
                    n14 = 242;
                    break;
                }
                case 49: {
                    n14 = 66;
                    break;
                }
                case 50: {
                    n14 = 154;
                    break;
                }
                case 51: {
                    n14 = 113;
                    break;
                }
                case 52: {
                    n14 = 0;
                    break;
                }
                case 53: {
                    n14 = 111;
                    break;
                }
                case 54: {
                    n14 = 185;
                    break;
                }
                case 55: {
                    n14 = 250;
                    break;
                }
                case 56: {
                    n14 = 149;
                    break;
                }
                case 57: {
                    n14 = 197;
                    break;
                }
                case 58: {
                    n14 = 168;
                    break;
                }
                case 59: {
                    n14 = 87;
                    break;
                }
                case 60: {
                    n14 = 237;
                    break;
                }
                case 61: {
                    n14 = 65;
                    break;
                }
                case 62: {
                    n14 = 89;
                    break;
                }
                case 63: {
                    n14 = 38;
                    break;
                }
                case 64: {
                    n14 = 234;
                    break;
                }
                case 65: {
                    n14 = 108;
                    break;
                }
                case 66: {
                    n14 = 203;
                    break;
                }
                case 67: {
                    n14 = 97;
                    break;
                }
                case 68: {
                    n14 = 42;
                    break;
                }
                case 69: {
                    n14 = 183;
                    break;
                }
                case 70: {
                    n14 = 241;
                    break;
                }
                case 71: {
                    n14 = 214;
                    break;
                }
                case 72: {
                    n14 = 46;
                    break;
                }
                case 73: {
                    n14 = 115;
                    break;
                }
                case 74: {
                    n14 = 117;
                    break;
                }
                case 75: {
                    n14 = 212;
                    break;
                }
                case 76: {
                    n14 = 195;
                    break;
                }
                case 77: {
                    n14 = 27;
                    break;
                }
                case 78: {
                    n14 = 244;
                    break;
                }
                case 79: {
                    n14 = 1;
                    break;
                }
                case 80: {
                    n14 = 126;
                    break;
                }
                case 81: {
                    n14 = 143;
                    break;
                }
                case 82: {
                    n14 = 221;
                    break;
                }
                case 83: {
                    n14 = 222;
                    break;
                }
                case 84: {
                    n14 = 104;
                    break;
                }
                case 85: {
                    n14 = 169;
                    break;
                }
                case 86: {
                    n14 = 239;
                    break;
                }
                case 87: {
                    n14 = 74;
                    break;
                }
                case 88: {
                    n14 = 165;
                    break;
                }
                case 89: {
                    n14 = 216;
                    break;
                }
                case 90: {
                    n14 = 35;
                    break;
                }
                case 91: {
                    n14 = 8;
                    break;
                }
                case 92: {
                    n14 = 236;
                    break;
                }
                case 93: {
                    n14 = 6;
                    break;
                }
                case 94: {
                    n14 = 158;
                    break;
                }
                case 95: {
                    n14 = 249;
                    break;
                }
                case 96: {
                    n14 = 5;
                    break;
                }
                case 97: {
                    n14 = 210;
                    break;
                }
                case 98: {
                    n14 = 123;
                    break;
                }
                case 99: {
                    n14 = 95;
                    break;
                }
                case 100: {
                    n14 = 15;
                    break;
                }
                case 101: {
                    n14 = 33;
                    break;
                }
                case 102: {
                    n14 = 81;
                    break;
                }
                case 103: {
                    n14 = 229;
                    break;
                }
                case 104: {
                    n14 = 243;
                    break;
                }
                case 105: {
                    n14 = 130;
                    break;
                }
                case 106: {
                    n14 = 152;
                    break;
                }
                case 107: {
                    n14 = 26;
                    break;
                }
                case 108: {
                    n14 = 219;
                    break;
                }
                case 109: {
                    n14 = 121;
                    break;
                }
                case 110: {
                    n14 = 73;
                    break;
                }
                case 111: {
                    n14 = 220;
                    break;
                }
                case 112: {
                    n14 = 44;
                    break;
                }
                case 113: {
                    n14 = 55;
                    break;
                }
                case 114: {
                    n14 = 251;
                    break;
                }
                case 115: {
                    n14 = 70;
                    break;
                }
                case 116: {
                    n14 = 13;
                    break;
                }
                case 117: {
                    n14 = 4;
                    break;
                }
                case 118: {
                    n14 = 67;
                    break;
                }
                case 119: {
                    n14 = 238;
                    break;
                }
                case 120: {
                    n14 = 11;
                    break;
                }
                case 121: {
                    n14 = 133;
                    break;
                }
                case 122: {
                    n14 = 41;
                    break;
                }
                case 123: {
                    n14 = 57;
                    break;
                }
                case 124: {
                    n14 = 80;
                    break;
                }
                case 125: {
                    n14 = 146;
                    break;
                }
                case 126: {
                    n14 = 145;
                    break;
                }
                case 127: {
                    n14 = 37;
                    break;
                }
                case 128: {
                    n14 = 161;
                    break;
                }
                case 129: {
                    n14 = 25;
                    break;
                }
                case 130: {
                    n14 = 103;
                    break;
                }
                case 131: {
                    n14 = 122;
                    break;
                }
                case 132: {
                    n14 = 231;
                    break;
                }
                case 133: {
                    n14 = 247;
                    break;
                }
                case 134: {
                    n14 = 112;
                    break;
                }
                case 135: {
                    n14 = 29;
                    break;
                }
                case 136: {
                    n14 = 150;
                    break;
                }
                case 137: {
                    n14 = 125;
                    break;
                }
                case 138: {
                    n14 = 124;
                    break;
                }
                case 139: {
                    n14 = 144;
                    break;
                }
                case 140: {
                    n14 = 252;
                    break;
                }
                case 141: {
                    n14 = 173;
                    break;
                }
                case 142: {
                    n14 = 39;
                    break;
                }
                case 143: {
                    n14 = 58;
                    break;
                }
                case 144: {
                    n14 = 86;
                    break;
                }
                case 145: {
                    n14 = 213;
                    break;
                }
                case 146: {
                    n14 = 191;
                    break;
                }
                case 147: {
                    n14 = 232;
                    break;
                }
                case 148: {
                    n14 = 9;
                    break;
                }
                case 149: {
                    n14 = 163;
                    break;
                }
                case 150: {
                    n14 = 102;
                    break;
                }
                case 151: {
                    n14 = 84;
                    break;
                }
                case 152: {
                    n14 = 166;
                    break;
                }
                case 153: {
                    n14 = 205;
                    break;
                }
                case 154: {
                    n14 = 199;
                    break;
                }
                case 155: {
                    n14 = 194;
                    break;
                }
                case 156: {
                    n14 = 190;
                    break;
                }
                case 157: {
                    n14 = 175;
                    break;
                }
                case 158: {
                    n14 = 59;
                    break;
                }
                case 159: {
                    n14 = 248;
                    break;
                }
                case 160: {
                    n14 = 151;
                    break;
                }
                case 161: {
                    n14 = 36;
                    break;
                }
                case 162: {
                    n14 = 228;
                    break;
                }
                case 163: {
                    n14 = 110;
                    break;
                }
                case 164: {
                    n14 = 176;
                    break;
                }
                case 165: {
                    n14 = 128;
                    break;
                }
                case 166: {
                    n14 = 182;
                    break;
                }
                case 167: {
                    n14 = 225;
                    break;
                }
                case 168: {
                    n14 = 224;
                    break;
                }
                case 169: {
                    n14 = 157;
                    break;
                }
                case 170: {
                    n14 = 164;
                    break;
                }
                case 171: {
                    n14 = 90;
                    break;
                }
                case 172: {
                    n14 = 159;
                    break;
                }
                case 173: {
                    n14 = 40;
                    break;
                }
                case 174: {
                    n14 = 119;
                    break;
                }
                case 175: {
                    n14 = 68;
                    break;
                }
                case 176: {
                    n14 = 201;
                    break;
                }
                case 177: {
                    n14 = 60;
                    break;
                }
                case 178: {
                    n14 = 16;
                    break;
                }
                case 179: {
                    n14 = 100;
                    break;
                }
                case 180: {
                    n14 = 209;
                    break;
                }
                case 181: {
                    n14 = 17;
                    break;
                }
                case 182: {
                    n14 = 223;
                    break;
                }
                case 183: {
                    n14 = 206;
                    break;
                }
                case 184: {
                    n14 = 34;
                    break;
                }
                case 185: {
                    n14 = 76;
                    break;
                }
                case 186: {
                    n14 = 139;
                    break;
                }
                case 187: {
                    n14 = 193;
                    break;
                }
                case 188: {
                    n14 = 21;
                    break;
                }
                case 189: {
                    n14 = 227;
                    break;
                }
                case 190: {
                    n14 = 230;
                    break;
                }
                case 191: {
                    n14 = 141;
                    break;
                }
                case 192: {
                    n14 = 48;
                    break;
                }
                case 193: {
                    n14 = 172;
                    break;
                }
                case 194: {
                    n14 = 94;
                    break;
                }
                case 195: {
                    n14 = 109;
                    break;
                }
                case 196: {
                    n14 = 63;
                    break;
                }
                case 197: {
                    n14 = 188;
                    break;
                }
                case 198: {
                    n14 = 129;
                    break;
                }
                case 199: {
                    n14 = 43;
                    break;
                }
                case 200: {
                    n14 = 186;
                    break;
                }
                case 201: {
                    n14 = 7;
                    break;
                }
                case 202: {
                    n14 = 202;
                    break;
                }
                case 203: {
                    n14 = 19;
                    break;
                }
                case 204: {
                    n14 = 207;
                    break;
                }
                case 205: {
                    n14 = 30;
                    break;
                }
                case 206: {
                    n14 = 156;
                    break;
                }
                case 207: {
                    n14 = 62;
                    break;
                }
                case 208: {
                    n14 = 127;
                    break;
                }
                case 209: {
                    n14 = 49;
                    break;
                }
                case 210: {
                    n14 = 180;
                    break;
                }
                case 211: {
                    n14 = 91;
                    break;
                }
                case 212: {
                    n14 = 218;
                    break;
                }
                case 213: {
                    n14 = 101;
                    break;
                }
                case 214: {
                    n14 = 71;
                    break;
                }
                case 215: {
                    n14 = 254;
                    break;
                }
                case 216: {
                    n14 = 24;
                    break;
                }
                case 217: {
                    n14 = 51;
                    break;
                }
                case 218: {
                    n14 = 114;
                    break;
                }
                case 219: {
                    n14 = 88;
                    break;
                }
                case 220: {
                    n14 = 184;
                    break;
                }
                case 221: {
                    n14 = 179;
                    break;
                }
                case 222: {
                    n14 = 189;
                    break;
                }
                case 223: {
                    n14 = 61;
                    break;
                }
                case 224: {
                    n14 = 240;
                    break;
                }
                case 225: {
                    n14 = 148;
                    break;
                }
                case 226: {
                    n14 = 140;
                    break;
                }
                case 227: {
                    n14 = 78;
                    break;
                }
                case 228: {
                    n14 = 79;
                    break;
                }
                case 229: {
                    n14 = 233;
                    break;
                }
                case 230: {
                    n14 = 64;
                    break;
                }
                case 231: {
                    n14 = 3;
                    break;
                }
                case 232: {
                    n14 = 82;
                    break;
                }
                case 233: {
                    n14 = 192;
                    break;
                }
                case 234: {
                    n14 = 53;
                    break;
                }
                case 235: {
                    n14 = 96;
                    break;
                }
                case 236: {
                    n14 = 83;
                    break;
                }
                case 237: {
                    n14 = 120;
                    break;
                }
                case 238: {
                    n14 = 54;
                    break;
                }
                case 239: {
                    n14 = 196;
                    break;
                }
                case 240: {
                    n14 = 200;
                    break;
                }
                case 241: {
                    n14 = 198;
                    break;
                }
                case 242: {
                    n14 = 162;
                    break;
                }
                case 243: {
                    n14 = 136;
                    break;
                }
                case 244: {
                    n14 = 177;
                    break;
                }
                case 245: {
                    n14 = 116;
                    break;
                }
                case 246: {
                    n14 = 138;
                    break;
                }
                case 247: {
                    n14 = 72;
                    break;
                }
                case 248: {
                    n14 = 18;
                    break;
                }
                case 249: {
                    n14 = 77;
                    break;
                }
                case 250: {
                    n14 = 204;
                    break;
                }
                case 251: {
                    n14 = 135;
                    break;
                }
                case 252: {
                    n14 = 106;
                    break;
                }
                case 253: {
                    n14 = 142;
                    break;
                }
                case 254: {
                    n14 = 20;
                    break;
                }
                default: {
                    n14 = 10;
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
            kx_2.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4439;
        if (d[n11] == null) {
            kx_2.d[n11] = (int)(c[n11] ^ l2);
        }
        return d[n11];
    }
}

