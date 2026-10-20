/*
 * Decompiled with CFR 0.152.
 */
package org.R;

import com.ky_2;
import java.lang.reflect.Method;
import org.R.L;
import org.R.M;
import org.w.d;
import org.w.n;

public final class i {
    private static ky_2[] Y;
    private static final String a;

    private i() {
    }

    public static L c(Object object) {
        return new M(object);
    }

    public static Object h(L l2) {
        ky_2[] ky_2Array = i.W();
        Object object = n.A(l2, new Method[]{L.F, d.z(l2.getClass(), a, new Class[]{Object.class})});
        if (ky_2Array != null) {
            ky_2.K(new String[1]);
        }
        return object;
    }

    public static void o(ky_2[] ky_2Array) {
        Y = ky_2Array;
    }

    public static ky_2[] W() {
        return Y;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                if (i.W() != null) {
                    i.o(new ky_2[3]);
                }
                char[] cArray3 = "rk0lOV".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 39;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 52;
                            break;
                        }
                        case 1: {
                            n17 = 47;
                            break;
                        }
                        case 2: {
                            n17 = 116;
                            break;
                        }
                        case 3: {
                            n17 = 46;
                            break;
                        }
                        case 4: {
                            n17 = 24;
                            break;
                        }
                        case 5: {
                            n17 = 5;
                            break;
                        }
                        default: {
                            n17 = 101;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

