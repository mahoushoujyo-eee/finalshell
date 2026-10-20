/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Renamed from y0
 */
class y0_0
implements ActionListener {
    final boolean z;
    final BS v;
    final br_0 J;
    final FB r;
    private static final String a;

    y0_0(FB fB2, boolean bl, BS bS, br_0 br_02) {
        this.r = fB2;
        this.z = bl;
        this.v = bS;
        this.J = br_02;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void actionPerformed(ActionEvent var1_1) {
        var2_2 = br_0.w();
        try {
            block38: {
                try {
                    this.r.p(((JTextField)this.r.i).getText());
                }
                catch (InvocationTargetException v0) {
                    throw v0.getTargetException();
                }
                try {
                    this.r.N(((JTextField)this.r.T).getText());
                }
                catch (InvocationTargetException v1) {
                    throw v1.getTargetException();
                }
                try {
                    this.r.N(((JTextField)this.r.I).getText());
                }
                catch (InvocationTargetException v2) {
                    throw v2.getTargetException();
                }
                try {
                    this.r.q(((JTextField)this.r.C).getText());
                }
                catch (InvocationTargetException v3) {
                    throw v3.getTargetException();
                }
                var3_3 = ((JTextField)this.r.i).getText();
                var4_5 = ((JTextField)this.r.C).getText().trim();
                var5_6 = Integer.parseInt(((JTextField)this.r.T).getText());
                var6_7 = Integer.parseInt(((JTextField)this.r.I).getText());
                var7_8 = new BS();
                try {
                    var7_8.m(var3_3);
                }
                catch (InvocationTargetException v4) {
                    throw v4.getTargetException();
                }
                var7_8.F = var5_6;
                try {
                    var7_8.D(var4_5);
                }
                catch (InvocationTargetException v5) {
                    throw v5.getTargetException();
                }
                try {
                    var7_8.W(var6_7);
                }
                catch (InvocationTargetException v6) {
                    throw v6.getTargetException();
                }
                if (var2_2 != null) break block38;
                try {
                    block39: {
                        if (this.z) ** GOTO lbl83
                        break block39;
                        catch (Exception v7) {
                            throw y0_0.a(v7);
                        }
                    }
                    try {
                        v8 = yt_1.i();
                    }
                    catch (InvocationTargetException v9) {
                        throw v9.getTargetException();
                    }
                    try {
                        v10 = v8.b();
                    }
                    catch (InvocationTargetException v11) {
                        throw v11.getTargetException();
                    }
                    try {
                        v10.S(var7_8);
                    }
                    catch (InvocationTargetException v12) {
                        throw v12.getTargetException();
                    }
                }
                catch (Exception v13) {
                    throw y0_0.a(v13);
                }
            }
            try {
                if (var2_2 == null) ** GOTO lbl101
lbl83:
                // 2 sources

                try {
                    v14 = yt_1.i();
                }
                catch (InvocationTargetException v15) {
                    throw v15.getTargetException();
                }
                try {
                    v16 = v14.b();
                }
                catch (InvocationTargetException v17) {
                    throw v17.getTargetException();
                }
                try {
                    v16.b(this.v, (Object)var7_8);
                }
                catch (InvocationTargetException v18) {
                    throw v18.getTargetException();
                }
            }
            catch (Exception v19) {
                throw y0_0.a(v19);
            }
lbl101:
            // 2 sources

            try {
                this.J.h();
            }
            catch (InvocationTargetException v20) {
                throw v20.getTargetException();
            }
            try {
                this.J.C(var7_8.C);
            }
            catch (InvocationTargetException v21) {
                throw v21.getTargetException();
            }
            ((FB)this.r).setVisible(false);
        }
        catch (Exception var3_4) {
            JOptionPane.showMessageDialog((br_0)this.J, var3_4.getMessage(), y0_0.a, 2);
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
                char[] cArray3 = "\u6dd2\u601f".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 82;
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
                            n17 = 8;
                            break;
                        }
                        case 1: {
                            n17 = 34;
                            break;
                        }
                        case 2: {
                            n17 = 16;
                            break;
                        }
                        case 3: {
                            n17 = 83;
                            break;
                        }
                        case 4: {
                            n17 = 9;
                            break;
                        }
                        case 5: {
                            n17 = 105;
                            break;
                        }
                        default: {
                            n17 = 80;
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

