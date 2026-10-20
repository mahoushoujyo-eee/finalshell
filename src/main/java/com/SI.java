/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.S3;
import com.et_0;
import com.pv_2;
import com.xf_1;
import org.jetbrains.annotations.NotNull;

public class SI
extends S3 {
    private static final xf_1[] z;
    public static final S3 H;
    private static final xf_1[] S;
    public static final S3 u;
    private final xf_1[] L;

    public SI(@NotNull xf_1[] xf_1Array) {
        this.L = xf_1Array;
    }

    @Override
    @NotNull
    public xf_1 S(int n10) {
        return this.L[n10];
    }

    @Override
    @NotNull
    protected xf_1 L(int n10) {
        return this.L[n10];
    }

    @Override
    public xf_1 Q(et_0 et_02) {
        String string = pv_2.r();
        et_0 et_03 = et_02;
        if (string == null) {
            if (et_03.h()) {
                return this.L[et_02.q()];
            }
            et_03 = et_02;
        }
        return et_03.d();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var1 = 6816359692374196912L;
                var0_1 = new long[52];
                var4_2 = 0;
                var5_3 = "1\u00f0\u00ac\u0014\u008dAB0\u00d7ST\u00d2\u008dA\u00bdOxn\u00fb\u0017\u008d\u00c1B0\u001e\u00e6\u0095/\u008dAB\u00b8k\u00c3\u000f\u00d5\u008d\u00a4\u00a7Uz\u00c9#\\\u008dA\u00c20\u00d3\\\u0019\u0095\u008d\r\u000e\u00fc\u00d7)\u00e5p\u008dAB\u00bef\u0082\u00f8\u00f7\u008d\u00be\u00bd\u00b0H\u00b71\u009c\u008dAB\u00a0\u00acl h\u008dA\u00bd\u00b0\f\u00c2%`\u008dAB\u00bcw\u008d\u009dI\u008dAB\u00bd\u009c.\u0087\u00c5\u008dAB\u00b7s\u0099Dl\u008dAB\u00bd\u00ba\u008a?\u0011\u008dAB\u00bax\u00df\u0013\u0019\u008d\u0007\u00c0\u0004\u00a0\u00ad4\u00b8\u008d\u00be\u00bdO\u00d3\u00a2I\u008b\u008d\u008cB\u00b0\t\u00fbR\u00b6\u008dAB\u00b7\u0001\u00fb\u00de\u00ab\u008dAB\u00a0\u0082\u00b5\u00a6\u00d2\u008dA\u00bd\u00b0\u0014[\u0006\u00e5\u008dAB\u00be\u00a4b\u00c3U\u008dAB\u00bf.\u0002T\u00e6\u008dAB\u00bb\u00aa\t\u0005\u00f4\u008d\u008c\u008f\u00b0\u00ecKa\u00bc\u008d_\u00d2O\u000b\u000b\u00b6\u00c0\u008dAB\u00ba\u008f6\u00daU\u008d\u0081\u0082pp$\u00f4\u0095\u008dA\u00bdO\u00b9\u008d\u00fd\u0013\u008d\u00be\u00bdOg`\u00f9d\u008dAB\u00b8\u001b\u00c8\u00d2\u0097\u008dAB\u00b9\u0015B\u00c41\u008d\u008cB}\u00cc\u00e3\u00e1\b\u008d\u00c1\u00c20\u0098e'\u00f7\u008dAB\u00bc\u001f\u00a6(\u0015\u008d\u00beB\u00b0\\\u008a(\u00ab\u008d\u00beBO7\u0003j-\u008dAB\u00b9\u00c56\u00df\u00d9\u008dAB\u00bfE\u00a0\u0000D\u008dAB\u00b6F2Em\u008dA\u008f}\u009b\u0080\u008e\u0000\u008d\u0007\u00c0\u0004<\u00db02\u008d\u00be\u00bd\u00b0f\u00b7N\u00f9\u008dAB\u00bb\u00be\u00e3\u008cD\u008d\u00beB\u00b0\u00c5j\u00e0\u001d\u008dA\u008f\u00b0\u0002\u00bd\\\t\u008dAB\u00b6aL\u00af\u009d\u008d\u00c1\u00c2\u00b0;_R\u00b4\u008d\u00beBO";
                var6_4 = "1\u00f0\u00ac\u0014\u008dAB0\u00d7ST\u00d2\u008dA\u00bdOxn\u00fb\u0017\u008d\u00c1B0\u001e\u00e6\u0095/\u008dAB\u00b8k\u00c3\u000f\u00d5\u008d\u00a4\u00a7Uz\u00c9#\\\u008dA\u00c20\u00d3\\\u0019\u0095\u008d\r\u000e\u00fc\u00d7)\u00e5p\u008dAB\u00bef\u0082\u00f8\u00f7\u008d\u00be\u00bd\u00b0H\u00b71\u009c\u008dAB\u00a0\u00acl h\u008dA\u00bd\u00b0\f\u00c2%`\u008dAB\u00bcw\u008d\u009dI\u008dAB\u00bd\u009c.\u0087\u00c5\u008dAB\u00b7s\u0099Dl\u008dAB\u00bd\u00ba\u008a?\u0011\u008dAB\u00bax\u00df\u0013\u0019\u008d\u0007\u00c0\u0004\u00a0\u00ad4\u00b8\u008d\u00be\u00bdO\u00d3\u00a2I\u008b\u008d\u008cB\u00b0\t\u00fbR\u00b6\u008dAB\u00b7\u0001\u00fb\u00de\u00ab\u008dAB\u00a0\u0082\u00b5\u00a6\u00d2\u008dA\u00bd\u00b0\u0014[\u0006\u00e5\u008dAB\u00be\u00a4b\u00c3U\u008dAB\u00bf.\u0002T\u00e6\u008dAB\u00bb\u00aa\t\u0005\u00f4\u008d\u008c\u008f\u00b0\u00ecKa\u00bc\u008d_\u00d2O\u000b\u000b\u00b6\u00c0\u008dAB\u00ba\u008f6\u00daU\u008d\u0081\u0082pp$\u00f4\u0095\u008dA\u00bdO\u00b9\u008d\u00fd\u0013\u008d\u00be\u00bdOg`\u00f9d\u008dAB\u00b8\u001b\u00c8\u00d2\u0097\u008dAB\u00b9\u0015B\u00c41\u008d\u008cB}\u00cc\u00e3\u00e1\b\u008d\u00c1\u00c20\u0098e'\u00f7\u008dAB\u00bc\u001f\u00a6(\u0015\u008d\u00beB\u00b0\\\u008a(\u00ab\u008d\u00beBO7\u0003j-\u008dAB\u00b9\u00c56\u00df\u00d9\u008dAB\u00bfE\u00a0\u0000D\u008dAB\u00b6F2Em\u008dA\u008f}\u009b\u0080\u008e\u0000\u008d\u0007\u00c0\u0004<\u00db02\u008d\u00be\u00bd\u00b0f\u00b7N\u00f9\u008dAB\u00bb\u00be\u00e3\u008cD\u008d\u00beB\u00b0\u00c5j\u00e0\u001d\u008dA\u008f\u00b0\u0002\u00bd\\\t\u008dAB\u00b6aL\u00af\u009d\u008d\u00c1\u00c2\u00b0;_R\u00b4\u008d\u00beBO".length();
                var3_5 = 0;
                while (true) {
                    var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                    v0 = var0_1;
                    v1 = var4_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    var5_3 = "kQ\u00f0\u00b6\u008dA\u00c2\u00b0\u00f1\u0095\u00c3\u008e\u008d\u00c1B\u00b0";
                    var6_4 = "kQ\u00f0\u00b6\u008dA\u00c2\u00b0\u00f1\u0095\u00c3\u008e\u008d\u00c1B\u00b0".length();
                    var3_5 = 0;
                    while (true) {
                        var7_6 = var5_3.substring(var3_5, var3_5 += 8).getBytes("ISO-8859-1");
                        v0 = var0_1;
                        v1 = var4_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var3_5 < var6_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var1;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        v5 = new xf_1[(int)var0_1[20]];
        v5[0] = new xf_1(0);
        v5[1] = new xf_1((int)var0_1[18]);
        v5[2] = new xf_1((int)var0_1[46]);
        v5[3] = new xf_1((int)var0_1[25]);
        v5[4] = new xf_1((int)var0_1[26]);
        v5[5] = new xf_1((int)var0_1[33]);
        v5[(int)var0_1[47]] = new xf_1((int)var0_1[41]);
        v5[(int)var0_1[13]] = new xf_1((int)var0_1[4]);
        v5[(int)var0_1[3]] = new xf_1((int)var0_1[6]);
        v5[(int)var0_1[38]] = new xf_1((int)var0_1[36]);
        v5[(int)var0_1[15]] = new xf_1((int)var0_1[21]);
        v5[(int)var0_1[44]] = new xf_1((int)var0_1[8]);
        v5[(int)var0_1[11]] = new xf_1((int)var0_1[42]);
        v5[(int)var0_1[12]] = new xf_1((int)var0_1[49]);
        v5[(int)var0_1[22]] = new xf_1((int)var0_1[1]);
        v5[(int)var0_1[39]] = new xf_1((int)var0_1[17]);
        SI.z = v5;
        SI.H = new SI(SI.z);
        v6 = new xf_1[(int)var0_1[9]];
        v6[0] = new xf_1(0);
        v6[1] = new xf_1((int)var0_1[51]);
        v6[2] = new xf_1((int)var0_1[50]);
        v6[3] = new xf_1((int)var0_1[48]);
        v6[4] = new xf_1((int)var0_1[0]);
        v6[5] = new xf_1((int)var0_1[2]);
        v6[(int)var0_1[40]] = new xf_1((int)var0_1[5]);
        v6[(int)var0_1[19]] = new xf_1((int)var0_1[28]);
        v6[(int)var0_1[31]] = new xf_1((int)var0_1[34]);
        v6[(int)var0_1[32]] = new xf_1((int)var0_1[45]);
        v6[(int)var0_1[27]] = new xf_1((int)var0_1[10]);
        v6[(int)var0_1[24]] = new xf_1((int)var0_1[43]);
        v6[(int)var0_1[35]] = new xf_1((int)var0_1[16]);
        v6[(int)var0_1[14]] = new xf_1((int)var0_1[37]);
        v6[(int)var0_1[7]] = new xf_1((int)var0_1[29]);
        v6[(int)var0_1[23]] = new xf_1((int)var0_1[30]);
        SI.S = v6;
        SI.u = new SI(SI.S);
    }
}

