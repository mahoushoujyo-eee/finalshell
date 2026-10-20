/*
 * Decompiled with CFR 0.152.
 */
package org.w;

import com.ky_2;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import org.w.c;
import org.w.d;

public final class n {
    static final boolean y = !n.class.desiredAssertionStatus();

    private n() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Object A(Object var0, Method[] var1_1) {
        block22: {
            var3_2 = var1_1[0].getDeclaringClass();
            var2_3 = d.q();
            v0 = n.y;
            if (var2_3 == null) {
                if (v0 == 0) {
                    v0 = var3_2.isInterface();
                    if (var2_3 == null) {
                        if (v0 == 0) {
                            throw new AssertionError();
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    v0 = var4_4 = 0;
                }
            }
            while (var4_4 < var1_1.length) {
                block24: {
                    block23: {
                        var5_6 = var1_1[var4_4];
                        v1 = var1_1[var4_4 + 1];
                        if (var2_3 != null) break block22;
                        var6_7 = v1;
                        v2 = n.y;
                        if (var2_3 == null) {
                            if (!v2) {
                                v2 = var5_6.getDeclaringClass().equals(var3_2);
                                if (var2_3 == null) {
                                    if (!v2) {
                                        throw new AssertionError();
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                var6_7.setAccessible(true);
                                v2 = n.y;
                            }
                        }
                        if (var2_3 == null) {
                            if (!v2) {
                                v2 = var5_6.getReturnType().equals(var6_7.getReturnType());
                                if (var2_3 == null) {
                                    if (!v2) {
                                        throw new AssertionError();
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                v2 = n.y;
                            }
                        }
                        if (var2_3 != null) break block23;
                        if (v2) break block24;
                        v2 = Arrays.equals(var5_6.getParameterTypes(), var6_7.getParameterTypes());
                    }
                    if (!v2) {
                        throw new AssertionError();
                    }
                }
                var4_4 += 2;
                if (var2_3 == null) continue;
            }
            v1 = var4_5 = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{var3_2}, (InvocationHandler)new c(var1_1, var0));
        }
        if (ky_2.F() != null) {
            d.P(new int[3]);
        }
        return var4_5;
    }
}

