/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from uD
 */
public final class ud_1
extends Enum {
    public static final ud_1 KECCAK_224;
    public static final ud_1 KECCAK_256;
    public static final ud_1 KECCAK_384;
    public static final ud_1 KECCAK_512;
    public static final ud_1 SHA3_224;
    public static final ud_1 SHA3_256;
    public static final ud_1 SHA3_384;
    public static final ud_1 SHA3_512;
    public static final ud_1 SHAKE128;
    public static final ud_1 SHAKE256;
    private final int X;
    public final int d;
    public final int outputLen;
    private static final /* synthetic */ ud_1[] I;
    private static int R;
    private static final long[] a;
    private static final Integer[] b;

    public static ud_1[] values() {
        return (ud_1[])((ud_1[])ud_1.I).clone();
    }

    public static ud_1 valueOf(String string) {
        return Enum.valueOf(ud_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ud_1(int n11) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.X = n11;
        this.d = var4_2;
        this.outputLen = var5_3;
    }

    public int w() {
        return (Object)this.X;
    }

    public int D() {
        return (Object)this.d;
    }

    public int X() {
        return (Object)this.outputLen;
    }

    private static /* synthetic */ ud_1[] p() {
        ud_1[] ud_1Array = new ud_1[ud_1.a(23670, 221258290993875212L)];
        ud_1Array[0] = (ud_1)((Object)ud_1.KECCAK_224);
        ud_1Array[1] = (ud_1)((Object)ud_1.KECCAK_256);
        ud_1Array[2] = (ud_1)((Object)ud_1.KECCAK_384);
        ud_1Array[3] = (ud_1)((Object)ud_1.KECCAK_512);
        ud_1Array[4] = (ud_1)((Object)ud_1.SHA3_224);
        ud_1Array[5] = (ud_1)((Object)ud_1.SHA3_256);
        ud_1Array[ud_1.a((int)28738, (long)287702315350091069L)] = (ud_1)((Object)ud_1.SHA3_384);
        ud_1Array[ud_1.a((int)10686, (long)7819802688001490135L)] = (ud_1)((Object)ud_1.SHA3_512);
        ud_1Array[ud_1.a((int)7830, (long)610006610073324532L)] = (ud_1)((Object)ud_1.SHAKE128);
        ud_1Array[ud_1.a((int)21177, (long)7562051468566808530L)] = (ud_1)((Object)ud_1.SHAKE256);
        return ud_1Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        var8 = new String[10];
                        var12_1 = 0;
                        ud_1.q(0);
                        var11_2 = "\u0006%/W\u0014\u0010g\u007fRX\n\u0006%/W\u0014\u0010gxQ^\b\u001e(-_\u0010j\nu\b\u001e(-'\nn\t\u007f\n\u0006%/W\u0014\u0010g~XX\b\u001e(-_\u0010i\r{\b\u001e(-'\nh\u0000y\n\u0006%/W\u0014\u0010g\u007fUZ";
                        var13_3 = "\u0006%/W\u0014\u0010g\u007fRX\n\u0006%/W\u0014\u0010gxQ^\b\u001e(-_\u0010j\nu\b\u001e(-'\nn\t\u007f\n\u0006%/W\u0014\u0010g~XX\b\u001e(-_\u0010i\r{\b\u001e(-'\nh\u0000y\n\u0006%/W\u0014\u0010g\u007fUZ".length();
                        var10_4 = 10;
                        var9_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 63;
                            v1 = ++var9_5;
                            v2 = var11_2.substring(v1, v1 + var10_4);
                            v3 = -1;
                            break block28;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            var11_2 = "\u001e(-'\ni\ny\b\u001e(-'\ni\r{";
                            var13_3 = "\u001e(-'\ni\ny\b\u001e(-'\ni\r{".length();
                            var10_4 = 8;
                            var9_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 63;
                                v5 = ++var9_5;
                                v2 = var11_2.substring(v5, v5 + var10_4);
                                v3 = 0;
                                break block28;
                                break;
                            }
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var8[var12_1++] = v4.intern();
                            if ((var9_5 += var10_4) < var13_3) {
                                var10_4 = var11_2.charAt(var9_5);
                                ** continue;
                            }
                            break block29;
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
                                    v15 = 114;
                                    break;
                                }
                                case 1: {
                                    v15 = 95;
                                    break;
                                }
                                case 2: {
                                    v15 = 83;
                                    break;
                                }
                                case 3: {
                                    v15 = 43;
                                    break;
                                }
                                case 4: {
                                    v15 = 106;
                                    break;
                                }
                                case 5: {
                                    v15 = 100;
                                    break;
                                }
                                default: {
                                    v15 = 7;
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
                var0_7 = 4617410809995068129L;
                var6_8 = new long[28];
                var3_9 = 0;
                var4_10 = "\u00fcB,+\u00d3\u00d5\u0004\u0007\u00f0@X>\u00c9\u00a5\u0086\u0085'\u008a9\u00c5\u00a9\u0082\u00cb\u00e7\u0083r?S;\na\u0092\u00adg\u00e9\u00f4F3_\u00a9\u00d5tC\u008d6\u0084<\u00a8\u00b9\u00b13\u000fr\u00fa\u00a4X\u00d1\u008a>\u00f4\u00a4\u00b1\u00e7\u00da\u0091\u00f6u\u00b3\u0017r&\u00b4\u0015\u00efi-$G\u00a5\u00dcVO\u00f3\u00deO_\u0013\u0097[\u00fd\u00da\u00aepZv\u00d9O\u00a5Y\u00c5x!#\u009b\u000f]J\f\u00a7\u0094\u00a0y\u001bM^u{\u008b\u008cD\u0083\u00ebZE\u00a2\u0097\u0007\u0090\u00fa_\u00c4\u0082`k\u00dc\"\u007f\u0089\u00ce\u00f4\u00f07>1\u00dc\u00cf2\u000bp\u0017\u00b8J\u00a9>(\"\"\u00ebE:\u0096\u0014W\u00f8\u0019\u008b\u00d5\u00dd\u00b1\u0088A6C\u00ed\u0019\u0088\u00fcG\u008c\u001e\u0084C\u00c2\"v2\u0002\u00d4P\u00a5S\u0019z\u00b2\u00efw\u00ff\\\u00b1&\u00ab\u0000pZdJO\u00ae";
                var5_11 = "\u00fcB,+\u00d3\u00d5\u0004\u0007\u00f0@X>\u00c9\u00a5\u0086\u0085'\u008a9\u00c5\u00a9\u0082\u00cb\u00e7\u0083r?S;\na\u0092\u00adg\u00e9\u00f4F3_\u00a9\u00d5tC\u008d6\u0084<\u00a8\u00b9\u00b13\u000fr\u00fa\u00a4X\u00d1\u008a>\u00f4\u00a4\u00b1\u00e7\u00da\u0091\u00f6u\u00b3\u0017r&\u00b4\u0015\u00efi-$G\u00a5\u00dcVO\u00f3\u00deO_\u0013\u0097[\u00fd\u00da\u00aepZv\u00d9O\u00a5Y\u00c5x!#\u009b\u000f]J\f\u00a7\u0094\u00a0y\u001bM^u{\u008b\u008cD\u0083\u00ebZE\u00a2\u0097\u0007\u0090\u00fa_\u00c4\u0082`k\u00dc\"\u007f\u0089\u00ce\u00f4\u00f07>1\u00dc\u00cf2\u000bp\u0017\u00b8J\u00a9>(\"\"\u00ebE:\u0096\u0014W\u00f8\u0019\u008b\u00d5\u00dd\u00b1\u0088A6C\u00ed\u0019\u0088\u00fcG\u008c\u001e\u0084C\u00c2\"v2\u0002\u00d4P\u00a5S\u0019z\u00b2\u00efw\u00ff\\\u00b1&\u00ab\u0000pZdJO\u00ae".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v17 = var6_8;
                    v18 = var3_9++;
                    v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v20 = -1;
                    break block30;
                    break;
                }
lbl111:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "\u00c5W\u00db\u00e5O\u00c1\u0089\u001dN\u00afRm~\u00cf\u0098\u0087";
                    var5_11 = "\u00c5W\u00db\u00e5O\u00c1\u0089\u001dN\u00afRm~\u00cf\u0098\u0087".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v17 = var6_8;
                        v18 = var3_9++;
                        v19 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v20 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl124:
                // 1 sources

                while (true) {
                    v17[v18] = v21;
                    if (var2_12 < var5_11) ** continue;
                    break block31;
                    break;
                }
            }
            v21 = v19 ^ var0_7;
            switch (v20) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl135:
                // 1 sources

                ** continue;
            }
        }
        ud_1.a = var6_8;
        ud_1.b = new Integer[28];
        ud_1.KECCAK_224 = new ud_1(var8[0], 0, ud_1.a(16407, 9138444954348770680L), 1, ud_1.a(13550, 5646768475112153498L));
        ud_1.KECCAK_256 = new ud_1(var8[7], 1, ud_1.a(2885, 1605270035473997350L), 1, ud_1.a(1284, 5320819442908729462L));
        ud_1.KECCAK_384 = new ud_1(var8[4], 2, ud_1.a(25099, 7664139722282006392L), 1, ud_1.a(4638, 5844513187132278630L));
        ud_1.KECCAK_512 = new ud_1(var8[1], 3, ud_1.a(6547, 6200376634085051621L), 1, ud_1.a(16464, 6906228650828748092L));
        ud_1.SHA3_224 = new ud_1(var8[8], 4, ud_1.a(19636, 352749270215776712L), ud_1.a(4379, 7088530050343732322L), ud_1.a(12741, 1930095995475731637L));
        ud_1.SHA3_256 = new ud_1(var8[9], 5, ud_1.a(13836, 6674199333804024701L), ud_1.a(4379, 7088530050343732322L), ud_1.a(10151, 593571618955113159L));
        ud_1.SHA3_384 = new ud_1(var8[6], ud_1.a(4379, 7088530050343732322L), ud_1.a(23406, 4124492542920379919L), ud_1.a(4379, 7088530050343732322L), ud_1.a(12871, 1393016711601760057L));
        ud_1.SHA3_512 = new ud_1(var8[3], ud_1.a(11059, 4131419742358093390L), ud_1.a(4678, 4675652569552979761L), ud_1.a(4379, 7088530050343732322L), ud_1.a(11713, 3453989477267627L));
        ud_1.SHAKE128 = new ud_1(var8[2], ud_1.a(14309, 3082601748584112784L), ud_1.a(29512, 752510962959148595L), ud_1.a(21938, 1073569009071145180L), ud_1.a(10151, 593571618955113159L));
        ud_1.SHAKE256 = new ud_1(var8[5], ud_1.a(3597, 6171893776909540192L), ud_1.a(13836, 6674199333804024701L), ud_1.a(19380, 2506986019407388380L), ud_1.a(11713, 3453989477267627L));
        try {
            v22 = (ud_1[])ud_1.p();
        }
        catch (InvocationTargetException v23) {
            throw v23.getTargetException();
        }
        ud_1.I = v22;
    }

    public static void q(int n10) {
        R = n10;
    }

    public static int U() {
        return R;
    }

    public static int I() {
        int n10 = ud_1.U();
        if (n10 == 0) {
            return 60;
        }
        return 0;
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x1578;
        if (b[n11] == null) {
            ud_1.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }
}

