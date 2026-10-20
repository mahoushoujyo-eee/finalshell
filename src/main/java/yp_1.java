/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Renamed from yP
 */
class yp_1
implements Runnable {
    String A;
    final t8_0 F;
    private static final String a;

    yp_1(t8_0 t8_02) {
        this.F = t8_02;
        this.A = null;
    }

    @Override
    public void run() {
        block16: {
            yp_1 yp_12;
            block15: {
                String string;
                zD zD2;
                try {
                    zD2 = (zD)this.F.e.d.N();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                zD zD3 = zD2;
                int[] nArray = a3.I();
                try {
                    string = (String)this.F.e.G.k();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String string2 = string;
                try {
                    tf_2 tf_22;
                    tf_2 tf_23 = null;
                    try {
                        tf_22 = (tf_2)zD3.o(string2);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    tf_23 = tf_22;
                    try {
                        this.F.e.d.x(tf_23);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    this.A = a + exception;
                }
                try {
                    try {
                        yp_12 = this;
                        if (nArray == null) break block15;
                        if ((String)yp_12.A == null) break block16;
                    }
                    catch (Exception exception) {
                        throw yp_1.a(exception);
                    }
                    yp_12 = this;
                }
                catch (Exception exception) {
                    throw yp_1.a(exception);
                }
            }
            JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor((a3)yp_12.F.e.d), (String)this.A);
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
                char[] cArray3 = "\u5249\u65a7\u596d\u8d03A\u91cf\u5ebcW6V".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 118;
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
                            n17 = 97;
                            break;
                        }
                        case 2: {
                            n17 = 42;
                            break;
                        }
                        case 3: {
                            n17 = 80;
                            break;
                        }
                        case 4: {
                            n17 = 31;
                            break;
                        }
                        case 5: {
                            n17 = 116;
                            break;
                        }
                        default: {
                            n17 = 48;
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

