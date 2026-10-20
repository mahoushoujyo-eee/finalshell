/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

class WG
implements Runnable {
    String A;
    final k_0 e;
    private static final String a;

    WG(k_0 k_02) {
        this.e = k_02;
        this.A = null;
    }

    @Override
    public void run() {
        block16: {
            WG wG;
            block15: {
                String string;
                zD zD2;
                try {
                    zD2 = (zD)this.e.z.d.N();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                zD zD3 = zD2;
                int[] nArray = a3.I();
                try {
                    string = (String)this.e.z.G.k();
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
                        this.e.z.d.x(tf_23);
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
                        wG = this;
                        if (nArray == null) break block15;
                        if ((String)wG.A == null) break block16;
                    }
                    catch (Exception exception) {
                        throw WG.a(exception);
                    }
                    wG = this;
                }
                catch (Exception exception) {
                    throw WG.a(exception);
                }
            }
            JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor((a3)wG.e.z.d), (String)this.A);
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
                char[] cArray3 = "\u5251\u65fa\u596e\u8d60j_".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 32;
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
                            n17 = 70;
                            break;
                        }
                        case 1: {
                            n17 = 106;
                            break;
                        }
                        case 2: {
                            n17 = 127;
                            break;
                        }
                        case 3: {
                            n17 = 101;
                            break;
                        }
                        case 4: {
                            n17 = 107;
                            break;
                        }
                        case 5: {
                            n17 = 117;
                            break;
                        }
                        default: {
                            n17 = 95;
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

