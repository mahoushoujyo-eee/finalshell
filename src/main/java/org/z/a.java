/*
 * Decompiled with CFR 0.152.
 */
package org.z;

import java.io.IOException;
import java.lang.reflect.Method;
import org.J.Z;
import org.w.d;
import org.w.j;

public class a {
    private static final Class z;
    private static final Method a;
    private final Object K;

    public a(Object object) {
        this.K = object;
    }

    public Z Y() throws IOException {
        return new Z(j.o(a, this.K, new Object[0]));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = ")'L\u0001\u001d//I\u0014Ux\u0010+)\u0011\u0018\u0014p\u0004)+\u00118\u0014p\u0004)+m\u0010\u001ap\u00147";
            var5_3 = ")'L\u0001\u001d//I\u0014Ux\u0010+)\u0011\u0018\u0014p\u0004)+\u00118\u0014p\u0004)+m\u0010\u001ap\u00147".length();
            var2_4 = 4;
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
            v4 = 106;
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
                            v11 = 47;
                            break;
                        }
                        case 1: {
                            v11 = 36;
                            break;
                        }
                        case 2: {
                            v11 = 85;
                            break;
                        }
                        case 3: {
                            v11 = 31;
                            break;
                        }
                        case 4: {
                            v11 = 17;
                            break;
                        }
                        case 5: {
                            v11 = 126;
                            break;
                        }
                        default: {
                            v11 = 27;
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
        org.z.a.z = d.Z(var0[1]);
        org.z.a.a = d.z(org.z.a.z, var0[0], new Class[0]);
    }
}

