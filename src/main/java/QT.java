/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class QT
implements Runnable {
    final tj_1 R;
    private static final String a;

    QT(tj_1 tj_12) {
        this.R = tj_12;
    }

    @Override
    public void run() {
        aW aW2;
        block33: {
            boolean bl;
            block32: {
                Object object;
                String string;
                String string2;
                int[] nArray;
                block30: {
                    block31: {
                        String string3;
                        DU dU;
                        block28: {
                            block29: {
                                boolean bl2;
                                boolean bl3;
                                nArray = DU.u();
                                dU = (DU)this.R.B;
                                if (nArray == null) break block28;
                                try {
                                    bl3 = (Boolean)lk_0.Y(((JTextField)dU.C).getText());
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (bl3) break block29;
                                string2 = new String(((JPasswordField)this.R.B.d).getPassword());
                                if (nArray == null) break block30;
                                try {
                                    bl2 = (Boolean)lk_0.Y(string2);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                if (!bl2) break block31;
                            }
                            dU = (DU)this.R.B;
                        }
                        try {
                            string3 = (String)lk_0.B(a);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        JOptionPane.showMessageDialog(dU, string3);
                        return;
                    }
                    ((JTextField)this.R.B.C).setText(((JTextField)this.R.B.C).getText().toLowerCase());
                    string2 = new String(((JPasswordField)this.R.B.d).getPassword());
                }
                String string4 = string2;
                try {
                    string = (String)this.R.B.Y.D();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                bl = string4.equals(string);
                if (nArray == null) break block32;
                if (!bl) {
                    String string5;
                    try {
                        string5 = (String)lk_0.Q(string4);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    String string6 = string5;
                    ((JPasswordField)this.R.B.d).setText(string6);
                }
                try {
                    this.R.B.Y.t(((JTextField)this.R.B.C).getText());
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.R.B.Y.g(new String(((JPasswordField)this.R.B.d).getPassword()));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object = yt_1.i();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    object.S();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                _y_0.b();
                aW2 = (aW)this.R.B.K;
                if (nArray == null) break block33;
                bl = aW2.isVisible();
            }
            if (!bl) {
                ((aW)this.R.B.K).setLocationRelativeTo((DU)this.R.B);
            }
            try {
                this.R.B.K.X();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            aW2 = (aW)this.R.B.K;
        }
        try {
            aW2.setVisible(true);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
                char[] cArray3 = ".FK}>3l>Jaq:\tKNelq`\f|\u0012@\u0010J\u001c\u000b\u0013LXTv9\u0013cM\u0000QV4\u000epIDu\u007f5)N0`\u0010I\u0012\fd\u001e\u0018\u001fC6\u0011|\u001beq+5\u0018H>bFK)kSNgKr-\rc\u0012YU~\u001b\u0002\u0015G".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 20;
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
                            n17 = 110;
                            break;
                        }
                        case 1: {
                            n17 = 63;
                            break;
                        }
                        case 2: {
                            n17 = 51;
                            break;
                        }
                        case 3: {
                            n17 = 13;
                            break;
                        }
                        case 4: {
                            n17 = 76;
                            break;
                        }
                        case 5: {
                            n17 = 79;
                            break;
                        }
                        default: {
                            n17 = 49;
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

