/*
 * Decompiled with CFR 0.152.
 */
package org.R;

import java.lang.reflect.Method;
import org.w.d;

public interface L {
    public static final Class r;
    public static final Method F;

    public void l(Object var1);

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "t~\u0019\u0013;1vwsA\u0014`*ajv\u0000\u001c;\u0007mpl\u001a\u001fp6\u0006\u007f|\f\u0017e0";
            var5_3 = "t~\u0019\u0013;1vwsA\u0014`*ajv\u0000\u001c;\u0007mpl\u001a\u001fp6\u0006\u007f|\f\u0017e0".length();
            var2_4 = 27;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 39;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 57;
                            break;
                        }
                        case 1: {
                            v11 = 56;
                            break;
                        }
                        case 2: {
                            v11 = 72;
                            break;
                        }
                        case 3: {
                            v11 = 85;
                            break;
                        }
                        case 4: {
                            v11 = 50;
                            break;
                        }
                        case 5: {
                            v11 = 99;
                            break;
                        }
                        default: {
                            v11 = 37;
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
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        L.r = d.Z(var0[0]);
        L.F = d.z(L.r, var0[1], new Class[]{Object.class});
    }
}

