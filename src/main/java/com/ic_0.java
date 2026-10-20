/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.CA;
import com.CI;
import com.CO;
import com.FN;
import com.OY;
import com.SZ;
import com.aq_0;
import com.ck_1;
import com.kz_2;
import com.no_0;
import com.pw_2;
import com.ur_0;
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.File;
import java.util.List;
import javax.swing.JWindow;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/*
 * Renamed from com.Ic
 */
class ic_0
implements CaretListener {
    private CI O;
    private SZ t;
    final kz_2 L;
    private static final String a;

    ic_0(kz_2 kz_22) {
        this.L = kz_22;
        this.O = null;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void caretUpdate(CaretEvent var1_1) {
        block19: {
            block18: {
                block17: {
                    block12: {
                        block13: {
                            block15: {
                                block16: {
                                    block14: {
                                        block10: {
                                            block11: {
                                                var2_2 = kz_2.M();
                                                v0 = this.L;
                                                if (var2_2 == null) break block10;
                                                if (!v0.u) break block11;
                                                v0 = this.L;
                                                if (var2_2 == null) break block10;
                                                if (!v0.Z.isVisible()) break block11;
                                                v1 = this.L;
                                                if (var2_2 == null) break block12;
                                                if (v1.Z.isShowing()) break block13;
                                            }
                                            v0 = this.L;
                                        }
                                        v2 = v0.d;
                                        if (var2_2 == null) break block14;
                                        if (v2 == null) break block15;
                                        v3 = this;
                                        if (var2_2 == null) break block16;
                                        v2 = v3.L.d;
                                    }
                                    if (!v2.isVisible()) break block15;
                                    v3 = this;
                                }
                                v3.H();
                            }
                            return;
                        }
                        v1 = this.L;
                    }
                    if (var2_2 != null) {
                        if (v1.d == null) {
                            this.L.d = new JWindow(FN.L(this.L));
                            this.L.d.getContentPane().setLayout(new BorderLayout());
                            this.L.d.setFocusable(false);
                            FN.L(this.L).addComponentListener(new ck_1(this));
                            this.O = new CI();
                            this.O.setFocusable(false);
                            this.O.setSelectionMode(0);
                            this.O.d(true);
                            this.O.setCellRenderer(new OY(this));
                            this.O.addMouseListener(new CA(this));
                            this.O.addKeyListener(new ur_0(this));
                            this.t = new SZ(this.O);
                            this.t.G(0);
                            this.L.d.getContentPane().add((Component)this.t, ic_0.a);
                            this.L.Z.addKeyListener(new pw_2(this));
                            this.L.Z.addFocusListener(new aq_0(this));
                        }
                        v1 = this.L;
                    }
                    var3_3 = v1.Z.getText().substring(0, this.L.Z.getCaretPosition());
                    v4 = var4_4 = var3_3.lastIndexOf(File.separator);
                    v5 = -1;
                    if (var2_2 == null) ** GOTO lbl57
                    if (v4 != v5) {
                        v4 = var4_4;
                        v5 = 1;
lbl57:
                        // 2 sources

                        v6 = v4 + v5;
                    } else {
                        v6 = 0;
                    }
                    var4_4 = v6;
                    var5_5 = var3_3.substring(0, var4_4);
                    var6_6 = var5_5.trim().equals("") != false ? null : new File(var5_5);
                    v7 = var7_7 = this.L.q(var6_6, var3_3.substring(var4_4));
                    if (var2_2 == null) break block17;
                    if (v7 == null) break block18;
                    v7 = var7_7;
                }
                if (v7.size() <= 0) break block18;
                this.p(var7_7);
                if (var2_2 != null) break block19;
            }
            this.H();
        }
    }

    private void p(List list) {
        FN.p(new no_0(this, list));
    }

    private void H() {
        FN.p(new CO(this));
    }

    private void L(File file) {
        String string = file.getAbsolutePath();
        String string2 = kz_2.M();
        String string3 = string;
        if (string2 != null) {
            string3 = string3.endsWith(File.separator) ? string : string + File.separator;
        }
        string = string3;
        this.L.Z.setText(string);
        this.L.Z.setCaretPosition(string.length());
    }

    static void w(ic_0 ic_02) {
        ic_02.H();
    }

    static CI g(ic_0 ic_02) {
        return ic_02.O;
    }

    static void i(ic_0 ic_02, File file) {
        ic_02.L(file);
    }

    static SZ a(ic_0 ic_02) {
        return ic_02.t;
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
                char[] cArray3 = "r[>08v".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 2;
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
                            n17 = 51;
                            break;
                        }
                        case 1: {
                            n17 = 60;
                            break;
                        }
                        case 2: {
                            n17 = 82;
                            break;
                        }
                        case 3: {
                            n17 = 70;
                            break;
                        }
                        case 4: {
                            n17 = 95;
                            break;
                        }
                        case 5: {
                            n17 = 6;
                            break;
                        }
                        default: {
                            n17 = 11;
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

