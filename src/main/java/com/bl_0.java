/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.c;
import com.pa_1;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

/*
 * Renamed from com.Bl
 */
class bl_0
implements Runnable {
    long n;
    final pa_1 u;
    private static final String a;

    bl_0(pa_1 pa_12) {
        this.u = pa_12;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block22: {
            block25: {
                boolean bl;
                pa_1 pa_12;
                block28: {
                    boolean bl2;
                    block29: {
                        int n10;
                        block26: {
                            Window window;
                            block27: {
                                pa_1 pa_13;
                                block24: {
                                    boolean bl3;
                                    block23: {
                                        block30: {
                                            pa_1 pa_14;
                                            block21: {
                                                pa_12 = this.u;
                                                n10 = _y_0.M();
                                                try {
                                                    pa_14 = pa_12;
                                                    if (n10 == 0) break block21;
                                                    if (pa_14 == null) break block22;
                                                }
                                                catch (Exception exception) {
                                                    throw bl_0.a(exception);
                                                }
                                                pa_14 = pa_12;
                                            }
                                            bl3 = pa_14.isShowing();
                                            if (n10 == 0) break block23;
                                            if (!bl3) break block22;
                                            break block30;
                                            catch (Exception exception) {
                                                throw bl_0.a(exception);
                                            }
                                        }
                                        try {
                                            block31: {
                                                pa_1.D(pa_12).F();
                                                pa_1.H(pa_12, false);
                                                pa_13 = pa_12;
                                                if (n10 == 0) break block24;
                                                break block31;
                                                catch (Exception exception) {
                                                    throw bl_0.a(exception);
                                                }
                                            }
                                            bl3 = pa_1.p(pa_13).getAndSet(false);
                                        }
                                        catch (Exception exception) {
                                            throw bl_0.a(exception);
                                        }
                                    }
                                    try {
                                        if (!bl3) break block25;
                                        pa_13 = this.u;
                                    }
                                    catch (Exception exception) {
                                        throw bl_0.a(exception);
                                    }
                                }
                                window = SwingUtilities.windowForComponent(pa_13);
                                bl2 = false;
                                try {
                                    bl = window instanceof U;
                                    if (n10 == 0) break block26;
                                    if (!bl) break block27;
                                }
                                catch (Exception exception) {
                                    throw bl_0.a(exception);
                                }
                                U u10 = (U)window;
                                try {
                                    _y_0 _y_02;
                                    try {
                                        _y_02 = (_y_0)u10.n();
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                        throw invocationTargetException.getTargetException();
                                    }
                                    bl = this.u.L.equals(_y_02);
                                    if (n10 == 0) break block26;
                                    if (!bl) break block27;
                                }
                                catch (Exception exception) {
                                    throw bl_0.a(exception);
                                }
                                bl2 = true;
                            }
                            bl = window instanceof U1;
                        }
                        try {
                            if (n10 == 0) break block28;
                            if (!bl) break block29;
                        }
                        catch (Exception exception) {
                            throw bl_0.a(exception);
                        }
                        bl2 = true;
                    }
                    bl = bl2;
                }
                if (bl) {
                    long l2 = System.currentTimeMillis();
                    try {
                        pa_1.V(pa_12);
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        pa_1.t().error(a, exception);
                    }
                }
            }
            this.n = System.currentTimeMillis();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = "\u0013j\u0002Y[UN>q\u001cS\t\u0001\\$u\u0019XH\u0019\u0019&y\u001eSEUK3|\u0002W^".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 23;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
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
                            n17 = 65;
                            break;
                        }
                        case 1: {
                            n17 = 15;
                            break;
                        }
                        case 2: {
                            n17 = 103;
                            break;
                        }
                        case 3: {
                            n17 = 33;
                            break;
                        }
                        case 4: {
                            n17 = 62;
                            break;
                        }
                        case 5: {
                            n17 = 98;
                            break;
                        }
                        default: {
                            n17 = 46;
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

