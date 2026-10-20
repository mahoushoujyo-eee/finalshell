/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.FN;
import com.Z.Q;
import com.kd_1;
import com.ne_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/*
 * Renamed from com.l7
 */
class l7_0
implements ActionListener {
    private Q I;
    final kd_1 R;
    private static final String a;

    l7_0(kd_1 kd_12) {
        this.R = kd_12;
        this.I = null;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void actionPerformed(ActionEvent var1_1) {
        block17: {
            block15: {
                block16: {
                    block13: {
                        block14: {
                            var2_2 = kd_1.u();
                            v0 = this;
                            if (var2_2 != null) break block13;
                            try {
                                block18: {
                                    if (v0.I != null) break block14;
                                    break block18;
                                    catch (IOException v1) {
                                        throw l7_0.a(v1);
                                    }
                                }
                                this.I = new Q(kd_1.b(this.R));
                                this.I.t(l7_0.a);
                                this.I.setMultiSelectionEnabled(false);
                            }
                            catch (IOException v2) {
                                throw l7_0.a(v2);
                            }
                        }
                        v0 = this;
                    }
                    if (var2_2 != null) break block15;
                    try {
                        block19: {
                            if (kd_1.b(v0.R) == null) break block16;
                            break block19;
                            catch (IOException v3) {
                                throw l7_0.a(v3);
                            }
                        }
                        this.I.f(kd_1.b(this.R));
                    }
                    catch (IOException v4) {
                        throw l7_0.a(v4);
                    }
                }
                v0 = this;
            }
            try {
                if (var2_2 == null) {
                    if (v0.I.showSaveDialog(FN.L(this.R)) != 0) break block17;
                }
                ** GOTO lbl45
            }
            catch (IOException v5) {
                throw l7_0.a(v5);
            }
            try {
                kd_1.U(this.R, this.I.getSelectedFile());
                v0 = this;
lbl45:
                // 2 sources

                kd_1.J(v0.R).setEnabled(true);
            }
            catch (IOException var3_3) {
                ne_1.g(this, var3_3);
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
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
                char[] cArray3 = "8\u0005l\u001du\u0012\u0004*\u0018 \u001fd\u0011N&\u0014a\u0003:\u0007K9\u0005G\u001cu\u0013O\u000e\u0013 \u0005}\u0000F*".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 81;
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
                            n17 = 30;
                            break;
                        }
                        case 1: {
                            n17 = 49;
                            break;
                        }
                        case 2: {
                            n17 = 95;
                            break;
                        }
                        case 3: {
                            n17 = 32;
                            break;
                        }
                        case 4: {
                            n17 = 69;
                            break;
                        }
                        case 5: {
                            n17 = 37;
                            break;
                        }
                        default: {
                            n17 = 123;
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

