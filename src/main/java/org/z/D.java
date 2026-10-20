/*
 * Decompiled with CFR 0.152.
 */
package org.z;

import com.ky_2;
import java.io.IOException;
import java.lang.reflect.Method;
import org.h.x_1;
import org.w.d;
import org.w.j;
import org.z.a;

public class D {
    private static final Class f;
    private static final Method R;
    private static final Method Z;
    private final Object F;
    private static String[] X;

    public D(Object object) {
        this.F = object;
    }

    public x_1 H() {
        String[] stringArray = D.b();
        x_1 x_12 = new x_1(j.o(R, this.F, new Object[0]));
        if (ky_2.F() != null) {
            D.T(new String[4]);
        }
        return x_12;
    }

    public a G() throws IOException {
        a a10;
        String[] stringArray = D.b();
        try {
            a10 = new a(j.o(Z, this.F, new Object[0]));
            if (stringArray == null) {
                ky_2.K(new String[2]);
            }
        }
        catch (IOException iOException) {
            throw D.a(iOException);
        }
        return a10;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "0S+aD-\f2 6]>a\u001e(\u00022[fm_ \u00160YfM_ \u00160Y\u001aeV!\u00119R+e\u00043L-n";
            var5_3 = "0S+aD-\f2 6]>a\u001e(\u00022[fm_ \u00160YfM_ \u00160Y\u001aeV!\u00119R+e\u00043L-n".length();
            var2_4 = 8;
            D.T(new String[5]);
            var1_5 = -1;
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
            v4 = 96;
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
                            v11 = 60;
                            break;
                        }
                        case 1: {
                            v11 = 92;
                            break;
                        }
                        case 2: {
                            v11 = 40;
                            break;
                        }
                        case 3: {
                            v11 = 96;
                            break;
                        }
                        case 4: {
                            v11 = 80;
                            break;
                        }
                        case 5: {
                            v11 = 36;
                            break;
                        }
                        default: {
                            v11 = 3;
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
        D.f = d.Z(var0[1]);
        D.R = d.z(D.f, var0[0], new Class[0]);
        D.Z = d.z(D.f, var0[2], new Class[0]);
    }

    public static void T(String[] stringArray) {
        X = stringArray;
    }

    public static String[] b() {
        return X;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

