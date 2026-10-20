/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._y_0;
import com.c;
import com.pa_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/*
 * Renamed from com.nT
 */
class nt_1
implements ActionListener {
    private WeakReference y;
    long O;
    final pa_1 R;
    private static final String a;

    public nt_1(pa_1 pa_12, pa_1 pa_13) {
        this.R = pa_12;
        this.y = new WeakReference<pa_1>(pa_13);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void actionPerformed(ActionEvent var1_1) {
        block20: {
            block16: {
                block17: {
                    block19: {
                        block18: {
                            block21: {
                                var3_2 = (pa_1)this.y.get();
                                var2_3 = _y_0.y();
                                v0 = var3_2;
                                if (var2_3 != 0) break block16;
                                if (v0 == null) ** GOTO lbl59
                                break block21;
                                catch (Exception v1) {
                                    throw nt_1.a(v1);
                                }
                            }
                            try {
                                block22: {
                                    pa_1.D(var3_2).F();
                                    pa_1.H(var3_2, false);
                                    if (var2_3 != 0) break block17;
                                    break block22;
                                    catch (Exception v2) {
                                        throw nt_1.a(v2);
                                    }
                                }
                                if (!pa_1.p(var3_2).getAndSet(false)) break block18;
                            }
                            catch (Exception v3) {
                                throw nt_1.a(v3);
                            }
                            var4_4 /* !! */  = SwingUtilities.windowForComponent(this.R);
                            try {
                                if (var2_3 != 0) break block17;
                                if (!(var4_4 /* !! */  instanceof U)) break block18;
                            }
                            catch (Exception v4) {
                                throw nt_1.a(v4);
                            }
                            var5_5 = (U)var4_4 /* !! */ ;
                            try {
                                v5 = this;
                                if (var2_3 != 0) break block19;
                                try {
                                    v6 = (_y_0)var5_5.n();
                                }
                                catch (InvocationTargetException v7) {
                                    throw v7.getTargetException();
                                }
                                if (!v5.R.L.equals(v6)) break block18;
                            }
                            catch (Exception v8) {
                                throw nt_1.a(v8);
                            }
                            var6_6 = System.currentTimeMillis();
                            try {
                                pa_1.V(var3_2);
                            }
                            catch (Exception var8_7) {
                                var8_7.printStackTrace();
                                pa_1.t().error(nt_1.a, var8_7);
                            }
                        }
                        v5 = this;
                    }
                    v5.O = System.currentTimeMillis();
                }
                try {
                    if (var2_3 == 0) break block20;
lbl59:
                    // 2 sources

                    v0 = var1_1.getSource();
                }
                catch (Exception v9) {
                    throw nt_1.a(v9);
                }
            }
            var4_4 /* !! */  = (Timer)v0;
            var4_4 /* !! */ .removeActionListener(this);
            var4_4 /* !! */ .stop();
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
                char[] cArray3 = "$&Fwip\u0019\t=X};$\u000b\u00139]vz<N\u00115Z}wp\u001c\u00040Fyl".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 75;
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
                            n17 = 42;
                            break;
                        }
                        case 1: {
                            n17 = 31;
                            break;
                        }
                        case 2: {
                            n17 = 127;
                            break;
                        }
                        case 3: {
                            n17 = 83;
                            break;
                        }
                        case 4: {
                            n17 = 80;
                            break;
                        }
                        case 5: {
                            n17 = 27;
                            break;
                        }
                        default: {
                            n17 = 37;
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

