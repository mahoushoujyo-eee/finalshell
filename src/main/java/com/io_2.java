/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.PM;
import com.PV;
import com.a9;
import com.ed_0;
import com.m.b_0;
import com.m.p_0;
import com.sj_0;
import com.t.A;
import com.xd_1;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.UIManager;

/*
 * Renamed from com.io
 */
class io_2
implements PropertyChangeListener {
    final a9 U;
    private static final String a;

    io_2(a9 a92) {
        this.U = a92;
    }

    /*
     * Loose catch block
     */
    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        block11: {
            block13: {
                boolean bl;
                block12: {
                    String[] stringArray;
                    block10: {
                        stringArray = xd_1.U();
                        bl = propertyChangeEvent.getPropertyName().equals(a);
                        if (stringArray != null) break block10;
                        try {
                            block14: {
                                if (!bl) break block11;
                                break block14;
                                catch (Throwable throwable) {
                                    throw io_2.a(throwable);
                                }
                            }
                            bl = propertyChangeEvent.getNewValue() instanceof a9;
                        }
                        catch (Throwable throwable) {
                            throw io_2.a(throwable);
                        }
                    }
                    if (stringArray != null) break block12;
                    try {
                        block15: {
                            if (!bl) break block13;
                            break block15;
                            catch (Throwable throwable) {
                                throw io_2.a(throwable);
                            }
                        }
                        JFrame.setDefaultLookAndFeelDecorated(a9.w());
                        bl = a9.n();
                    }
                    catch (Throwable throwable) {
                        throw io_2.a(throwable);
                    }
                }
                JDialog.setDefaultLookAndFeelDecorated(bl);
                PM.m(sj_0.class);
                PM.m(p_0.class);
                PM.m(b_0.class);
                PM.m(ed_0.class);
                PM.m(PV.class);
                PM.m(A.class);
                a9.v();
                try {
                    new JSpinner();
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            UIManager.removePropertyChangeListener(this);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
                char[] cArray3 = "\u00125Xe=vB8?Rb".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 62;
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
                            n17 = 64;
                            break;
                        }
                        case 1: {
                            n17 = 100;
                            break;
                        }
                        case 2: {
                            n17 = 9;
                            break;
                        }
                        case 3: {
                            n17 = 48;
                            break;
                        }
                        case 4: {
                            n17 = 66;
                            break;
                        }
                        case 5: {
                            n17 = 38;
                            break;
                        }
                        default: {
                            n17 = 24;
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

