/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pk_1;
import com.we_1;
import java.util.concurrent.Callable;

public class XJ {
    private static boolean C;

    public static Object L(Callable callable) {
        if (C) {
            try {
                return callable.call();
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
        return null;
    }

    public static Object w(we_1 we_12, Object object) {
        try {
            if (C) {
                return we_12.N(object);
            }
        }
        catch (RuntimeException runtimeException) {
            throw XJ.a(runtimeException);
        }
        return null;
    }

    public static Object h(pk_1 pk_12, Object object, Object object2) {
        try {
            if (C) {
                return pk_12.h(object, object2);
            }
        }
        catch (RuntimeException runtimeException) {
            throw XJ.a(runtimeException);
        }
        return null;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        char[] cArray;
        block14: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block13: {
                char[] cArray3 = "\")yb\nw\u001a$f[jIa".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 14;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block13;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block14;
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
                            n17 = 70;
                            break;
                        }
                        case 1: {
                            n17 = 70;
                            break;
                        }
                        case 2: {
                            n17 = 1;
                            break;
                        }
                        case 3: {
                            n17 = 13;
                            break;
                        }
                        case 4: {
                            n17 = 42;
                            break;
                        }
                        case 5: {
                            n17 = 10;
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
        String string = new String(cArray).intern();
        C = false;
        try {
            Class.forName(string);
            C = true;
            return;
        }
        catch (Throwable throwable) {
            C = false;
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

