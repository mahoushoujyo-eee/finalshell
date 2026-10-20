/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Renamed from yY
 */
class yy_1
implements Runnable {
    String I;
    final F6 L;
    private static final String a;

    yy_1(F6 f62) {
        this.L = f62;
        this.I = null;
    }

    @Override
    public void run() {
        yy_1 yy_12;
        block8: {
            block9: {
                boolean bl = F6.g();
                ((JButton)this.L.a).setEnabled(false);
                boolean bl2 = bl;
                zD zD2 = (zD)this.L.E;
                String string = (String)this.L.y;
                try {
                    tf_2 tf_22;
                    try {
                        tf_22 = (tf_2)zD2.o(string);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    tf_2 tf_23 = tf_22;
                    SwingUtilities.invokeAndWait(new ce_1(this, tf_23));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    this.I = a + exception;
                }
                try {
                    try {
                        yy_12 = this;
                        if (bl2) break block8;
                        if ((String)yy_12.I == null) break block9;
                    }
                    catch (Exception exception) {
                        throw yy_1.a(exception);
                    }
                    JOptionPane.showMessageDialog((F6)this.L, (String)this.I);
                }
                catch (Exception exception) {
                    throw yy_1.a(exception);
                }
            }
            yy_12 = this;
        }
        ((JButton)yy_12.L.a).setEnabled(true);
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
                char[] cArray3 = "\u521d\u65bb\u5952\u8d78\u001bW".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 43;
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
                            n17 = 1;
                            break;
                        }
                        case 1: {
                            n17 = 32;
                            break;
                        }
                        case 2: {
                            n17 = 72;
                            break;
                        }
                        case 3: {
                            n17 = 118;
                            break;
                        }
                        case 4: {
                            n17 = 17;
                            break;
                        }
                        case 5: {
                            n17 = 118;
                            break;
                        }
                        default: {
                            n17 = 58;
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

