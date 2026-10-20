/*
 * Decompiled with CFR 0.152.
 */
package org.J;

import com.ky_2;
import java.lang.reflect.Method;
import org.R.L;
import org.R.i;
import org.v._q_0;
import org.w.d;
import org.w.j;

public class Z {
    private static final Class C;
    private static final Method g;
    private final Object r;

    public Z(Object object) {
        this.r = object;
    }

    public void V(L l2) {
        boolean bl = _q_0.g();
        j.o(g, this.r, new Object[]{i.h(l2)});
        boolean bl2 = bl;
        if (bl2) {
            ky_2.K(new String[4]);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "4RzX%T\r\u00178\\~|jB\u0011;Q&n0E\u00003P&N0E\u00003P";
            var5_3 = "4RzX%T\r\u00178\\~|jB\u0011;Q&n0E\u00003P&N0E\u00003P".length();
            var2_4 = 7;
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
            v4 = 96;
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
                            v11 = 50;
                            break;
                        }
                        case 1: {
                            v11 = 93;
                            break;
                        }
                        case 2: {
                            v11 = 104;
                            break;
                        }
                        case 3: {
                            v11 = 125;
                            break;
                        }
                        case 4: {
                            v11 = 36;
                            break;
                        }
                        case 5: {
                            v11 = 87;
                            break;
                        }
                        default: {
                            v11 = 5;
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
        Z.C = d.Z(var0[1]);
        Z.g = d.z(Z.C, var0[0], new Class[]{L.r});
    }
}

