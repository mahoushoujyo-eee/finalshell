/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.io.IOException;

/*
 * Renamed from Vk
 */
public class vk_0 {
    private static boolean m;
    private static boolean y;
    private static boolean H;
    private static boolean k;
    private static boolean L;
    private static boolean g;
    private static boolean w;
    private static boolean p;
    private static ky_2[] R;

    /*
     * Unable to fully structure code
     */
    static {
        block46: {
            block45: {
                block44: {
                    block43: {
                        block42: {
                            block41: {
                                block47: {
                                    block40: {
                                        block39: {
                                            var0 = new String[14];
                                            var4_1 = 0;
                                            var3_2 = "-4.\u00064~u\u0014ai\u0007#5mX%>\u0017\u0003>6.\u0007#5mW60\u001a\u0003\"3;\u0003\"/;\u0007-'1Z?kK\u0003;/-\u0005-+'\u000fc\u0005 ),W0\u0003!' ";
                                            var5_3 = "-4.\u00064~u\u0014ai\u0007#5mX%>\u0017\u0003>6.\u0007#5mW60\u001a\u0003\"3;\u0003\"/;\u0007-'1Z?kK\u0003;/-\u0005-+'\u000fc\u0005 ),W0\u0003!' ".length();
                                            var2_4 = 3;
                                            var1_5 = -1;
                                            vk_0.P(new ky_2[4]);
lbl8:
                                            // 2 sources

                                            while (true) {
                                                v0 = 42;
                                                v1 = ++var1_5;
                                                v2 = var3_2.substring(v1, v1 + var2_4);
                                                v3 = -1;
                                                break block39;
                                                break;
                                            }
lbl14:
                                            // 1 sources

                                            while (true) {
                                                var0[var4_1++] = v4.intern();
                                                if ((var1_5 += var2_4) < var5_3) {
                                                    var2_4 = var3_2.charAt(var1_5);
                                                    ** continue;
                                                }
                                                var3_2 = "\u0004\u001a\u0004r\u0006\u0018RYJME";
                                                var5_3 = "\u0004\u001a\u0004r\u0006\u0018RYJME".length();
                                                var2_4 = 4;
                                                var1_5 = -1;
lbl23:
                                                // 2 sources

                                                while (true) {
                                                    v0 = 6;
                                                    v5 = ++var1_5;
                                                    v2 = var3_2.substring(v5, v5 + var2_4);
                                                    v3 = 0;
                                                    break block39;
                                                    break;
                                                }
                                                break;
                                            }
lbl29:
                                            // 1 sources

                                            while (true) {
                                                var0[var4_1++] = v4.intern();
                                                if ((var1_5 += var2_4) < var5_3) {
                                                    var2_4 = var3_2.charAt(var1_5);
                                                    ** continue;
                                                }
                                                break block40;
                                                break;
                                            }
                                        }
                                        v6 = v2.toCharArray();
                                        v7 = v6.length;
                                        var6_6 = 0;
                                        v8 = v0;
                                        v9 = v6;
                                        v10 = v7;
                                        if (v7 > 1) ** GOTO lbl86
                                        do {
                                            v11 = v8;
                                            v9 = v9;
                                            v12 = v9;
                                            v13 = v8;
                                            v14 = var6_6;
                                            while (true) {
                                                switch (var6_6 % 7) {
                                                    case 0: {
                                                        v15 = 102;
                                                        break;
                                                    }
                                                    case 1: {
                                                        v15 = 108;
                                                        break;
                                                    }
                                                    case 2: {
                                                        v15 = 105;
                                                        break;
                                                    }
                                                    case 3: {
                                                        v15 = 19;
                                                        break;
                                                    }
                                                    case 4: {
                                                        v15 = 125;
                                                        break;
                                                    }
                                                    case 5: {
                                                        v15 = 119;
                                                        break;
                                                    }
                                                    default: {
                                                        v15 = 85;
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
lbl86:
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
lbl96:
                                            // 1 sources

                                            ** continue;
                                        }
                                    }
                                    vk_0.m = false;
                                    vk_0.y = false;
                                    vk_0.H = false;
                                    vk_0.k = false;
                                    vk_0.L = false;
                                    vk_0.g = false;
                                    vk_0.w = false;
                                    vk_0.p = false;
                                    var7_7 = System.getProperty(var0[2]).toLowerCase();
                                    var8_8 = System.getProperty(var0[4]).toLowerCase();
                                    if (var7_7.contains(var0[9])) break block41;
                                    if (var7_7.contains(var0[13])) break block41;
                                    break block47;
                                    catch (IOException v17) {
                                        throw vk_0.a(v17);
                                    }
                                }
                                try {
                                    block48: {
                                        if (var7_7.contains(var0[1])) break block41;
                                        break block48;
                                        catch (IOException v18) {
                                            throw vk_0.a(v18);
                                        }
                                    }
                                    v19 = false;
                                    break block42;
                                }
                                catch (IOException v20) {
                                    throw vk_0.a(v20);
                                }
                            }
                            v19 = true;
                        }
                        vk_0.w = v19;
                        if (var7_7.contains(var0[0])) break block43;
                        try {
                            block49: {
                                if (var7_7.contains(var0[7])) break block43;
                                break block49;
                                catch (IOException v21) {
                                    throw vk_0.a(v21);
                                }
                            }
                            v22 = false;
                            break block44;
                        }
                        catch (IOException v23) {
                            throw vk_0.a(v23);
                        }
                    }
                    v22 = true;
                }
                vk_0.g = v22;
                vk_0.p = var7_7.contains(var0[10]);
                vk_0.m = var8_8.contains(var0[8]);
                if (var8_8.contains(var0[5])) break block45;
                try {
                    block50: {
                        if (var8_8.contains(var0[6])) break block45;
                        break block50;
                        catch (IOException v24) {
                            throw vk_0.a(v24);
                        }
                    }
                    v25 = false;
                    break block46;
                }
                catch (IOException v26) {
                    throw vk_0.a(v26);
                }
            }
            v25 = true;
        }
        vk_0.y = v25;
        vk_0.H = var8_8.contains(var0[11]);
        if (vk_0.y) {
            try {
                Runtime.getRuntime().exec(new String[]{var0[12]}, null);
                vk_0.L = true;
            }
            catch (IOException var9_9) {
                // empty catch block
            }
            if (!vk_0.L) {
                try {
                    Runtime.getRuntime().exec(new String[]{var0[3]}, null);
                    vk_0.k = true;
                }
                catch (IOException var9_10) {
                    // empty catch block
                }
            }
        }
    }

    public static boolean s() {
        return vk_0.m;
    }

    public static boolean f() {
        return vk_0.y;
    }

    public static boolean g() {
        return vk_0.H;
    }

    public static boolean k() {
        return vk_0.k;
    }

    public static boolean Y() {
        return vk_0.L;
    }

    public static boolean j() {
        return vk_0.g;
    }

    public static boolean R() {
        return vk_0.w;
    }

    public static boolean E() {
        return vk_0.p;
    }

    public static void P(ky_2[] ky_2Array) {
        R = ky_2Array;
    }

    public static ky_2[] y() {
        return R;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

