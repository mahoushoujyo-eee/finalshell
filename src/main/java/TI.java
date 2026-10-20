/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Color;

public class TI {
    public static int d;
    public static int E;
    public static int i;
    public static int P;
    public static boolean L;
    public static String F;
    public static String v;
    public static boolean J;
    public static Color f;
    public static Color x;
    public static Color e;
    public static Color r;
    public static Color B;
    public static Color Z;
    public static int K;
    public static boolean Y;

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    var8 = new String[2];
                    var12_1 = 0;
                    var11_2 = "\u007f#i\fZ1fQ\r\u001bwB`3F fk\u0013I\nx\b)=Vk\u0014c\u001c6$V};Y=`?\u007fD\u0005q\u001aUXv8iS!KJ`'pS7dpAqkz\fK^\u007fIv\u0014*z@fVi\r";
                    var13_3 = "\u007f#i\fZ1fQ\r\u001bwB`3F fk\u0013I\nx\b)=Vk\u0014c\u001c6$V};Y=`?\u007fD\u0005q\u001aUXv8iS!KJ`'pS7dpAqkz\fK^\u007fIv\u0014*z@fVi\r".length();
                    var10_4 = 11;
                    var9_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var8[var12_1++] = new String(v0).intern();
                        if ((var9_5 += var10_4) < var13_3) {
                            var10_4 = var11_2.charAt(var9_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                    v1 = ++var9_5;
                    v2 = var11_2.substring(v1, v1 + var10_4).toCharArray();
                    v3 = v2.length;
                    var14_6 = 0;
                    v4 = 122;
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
                                    v11 = 127;
                                    break;
                                }
                                case 1: {
                                    v11 = 49;
                                    break;
                                }
                                case 2: {
                                    v11 = 76;
                                    break;
                                }
                                case 3: {
                                    v11 = 53;
                                    break;
                                }
                                case 4: {
                                    v11 = 110;
                                    break;
                                }
                                case 5: {
                                    v11 = 101;
                                    break;
                                }
                                default: {
                                    v11 = 73;
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
                var1_7 = 5676353707116835027L;
                var0_8 = new long[11];
                var4_9 = 0;
                var5_10 = "/\u0015\u0003\u00e3<+\u00b0,\u00eb(p\u001b<+\u00b0\u00b75\u00a9\u00b4.<;\u00b0\u00d3\u0092\u00f9}&<+\u00b0\u00dedU\u00d7\u0082<+\u00b0\u00d0\u00ea\u00a1\u00ca\u00cc<+\u00b0\u0095P\u00b5oK<+\u00b0E\u00b9\u00c7\u0007\u0019<+\u00b0\u00b7\u00c3;;c<\u008b\u00b0\u00d3";
                var6_11 = "/\u0015\u0003\u00e3<+\u00b0,\u00eb(p\u001b<+\u00b0\u00b75\u00a9\u00b4.<;\u00b0\u00d3\u0092\u00f9}&<+\u00b0\u00dedU\u00d7\u0082<+\u00b0\u00d0\u00ea\u00a1\u00ca\u00cc<+\u00b0\u0095P\u00b5oK<+\u00b0E\u00b9\u00c7\u0007\u0019<+\u00b0\u00b7\u00c3;;c<\u008b\u00b0\u00d3".length();
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
lbl88:
                // 1 sources

                while (true) {
                    v12[v13] = v16;
                    if (var3_12 < var6_11) ** continue;
                    var5_10 = "LZ\u00e6k<+\u00b0,.4N\r<+\u00b0\u0004";
                    var6_11 = "LZ\u00e6k<+\u00b0,.4N\r<+\u00b0\u0004".length();
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
lbl101:
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
lbl112:
                // 1 sources

                ** continue;
            }
        }
        TI.d = 1;
        TI.E = (int)var0_8[8];
        TI.i = (int)var0_8[2];
        TI.P = -1;
        TI.L = true;
        TI.F = var8[1];
        TI.v = var8[0];
        TI.J = true;
        TI.f = new Color((int)var0_8[0], (int)var0_8[5], 0, (int)var0_8[6]);
        TI.x = new Color((int)var0_8[9], (int)var0_8[9], (int)var0_8[1]);
        TI.e = new Color(0, 0, 0);
        TI.r = new Color((int)var0_8[9], (int)var0_8[7], (int)var0_8[10]);
        TI.B = TI.e;
        TI.Z = new Color(0, (int)var0_8[9], 0);
        TI.K = (int)var0_8[4];
        TI.Y = true;
        var15_14 = (int)var0_8[3];
    }
}

