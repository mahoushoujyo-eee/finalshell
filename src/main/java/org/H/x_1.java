/*
 * Decompiled with CFR 0.152.
 */
package org.h;

import java.lang.reflect.Method;
import org.w.d;
import org.w.j;

/*
 * Renamed from org.h.x
 */
public class x_1 {
    private static final Class J;
    private static final Method t;
    private final Object C;
    private static String[] v;

    public x_1(Object object) {
        this.C = object;
    }

    public Object l() {
        return j.o(t, this.C, new Object[0]);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "4MZ\u00129IX!l\fT:D\u0000\u000f2\rI<FO,";
            var5_3 = "4MZ\u00129IX!l\fT:D\u0000\u000f2\rI<FO,".length();
            var2_4 = 3;
            var1_5 = -1;
            x_1.e(new String[1]);
lbl8:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl10:
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
            v4 = 82;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl68
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 1;
                            break;
                        }
                        case 1: {
                            v11 = 122;
                            break;
                        }
                        case 2: {
                            v11 = 124;
                            break;
                        }
                        case 3: {
                            v11 = 18;
                            break;
                        }
                        case 4: {
                            v11 = 16;
                            break;
                        }
                        case 5: {
                            v11 = 43;
                            break;
                        }
                        default: {
                            v11 = 114;
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
lbl68:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        x_1.J = d.Z(var0[1]);
        x_1.t = d.z(x_1.J, var0[0], new Class[0]);
    }

    public static void e(String[] stringArray) {
        v = stringArray;
    }

    public static String[] s() {
        return v;
    }
}

