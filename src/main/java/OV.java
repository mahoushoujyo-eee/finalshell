/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

class OV
implements Runnable {
    final ck_2 W;
    final F6 J;
    private static final String a;

    OV(F6 f62, ck_2 ck_22) {
        this.J = f62;
        this.W = ck_22;
    }

    @Override
    public void run() {
        zD zD2;
        try {
            zD2 = (zD)this.J.S.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        zD zD3 = zD2;
        String string = null;
        try {
            Object object;
            Object object2;
            try {
                object2 = this.W.d();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                zD3.f(object2);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = this.W.d();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.J.S.i(object);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            string = a + exception;
        }
        try {
            if (string != null) {
                JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor((F6)this.J), string);
            }
        }
        catch (Exception exception) {
            throw OV.a(exception);
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
                char[] cArray3 = "\u5239\u966c\u65f8\u4e96\u5971\u8d5b&\u0013".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 89;
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
                            n17 = 81;
                            break;
                        }
                        case 2: {
                            n17 = 38;
                            break;
                        }
                        case 3: {
                            n17 = 57;
                            break;
                        }
                        case 4: {
                            n17 = 25;
                            break;
                        }
                        case 5: {
                            n17 = 39;
                            break;
                        }
                        default: {
                            n17 = 94;
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

