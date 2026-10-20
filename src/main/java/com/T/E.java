/*
 * Decompiled with CFR 0.152.
 */
package com.T;

import com.T.s;
import com.a9;
import com.kp_0;
import com.ky_2;
import com.ne_1;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class E
extends JOptionPane {
    private static int W;

    public E() {
    }

    public E(Object object) {
        super(object);
    }

    public E(Object object, int n10) {
        super(object, n10);
    }

    public E(Object object, int n10, int n11) {
        super(object, n10, n11);
    }

    public E(Object object, int n10, int n11, Icon icon) {
        super(object, n10, n11, icon);
    }

    public E(Object object, int n10, int n11, Icon icon, Object[] objectArray) {
        super(object, n10, n11, icon, objectArray);
    }

    public E(Object object, int n10, int n11, Icon icon, Object[] objectArray, Object object2) {
        super(object, n10, n11, icon, objectArray, object2);
    }

    public s U() {
        return (s)this.getUI();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void updateUI() {
        block16: {
            block15: {
                block14: {
                    block17: {
                        var1_1 = E.f();
                        v0 = this;
                        if (var1_1 != 0) ** GOTO lbl26
                        if (v0.getUI() == null) break block14;
                        break block17;
                        catch (Throwable v1) {
                            throw E.a(v1);
                        }
                    }
                    try {
                        block18: {
                            v2 = this;
                            if (var1_1 != 0) break block15;
                            break block18;
                            catch (Throwable v3) {
                                throw E.a(v3);
                            }
                        }
                        if (!(v2.getUI() instanceof s)) {
                        }
                        ** GOTO lbl33
                    }
                    catch (Throwable v4) {
                        throw E.a(v4);
                    }
                }
                try {
                    v0 = this;
lbl26:
                    // 2 sources

                    v0.setUI((s)kp_0.w(a9.zw, new Object[0]));
                    break block16;
                }
                catch (Throwable var2_2) {
                    try {
                        ne_1.g(this, var2_2);
                        this.setUI(new s());
                        if (var1_1 == 0) break block16;
lbl33:
                        // 2 sources

                        v2 = this;
                    }
                    catch (Throwable v5) {
                        throw E.a(v5);
                    }
                }
            }
            v2.setUI(this.getUI());
        }
        try {
            if (ky_2.F() != null) {
                E.U(++var1_1);
            }
        }
        catch (Throwable v6) {
            throw E.a(v6);
        }
    }

    public static void U(int n10) {
        W = n10;
    }

    public static int D() {
        return W;
    }

    public static int f() {
        int n10 = E.D();
        if (n10 == 0) {
            return 75;
        }
        return 0;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        if (E.D() == 0) {
            E.U(3);
        }
    }
}

