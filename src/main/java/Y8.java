/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

class Y8
implements Runnable {
    final String S;
    final fj_1 y;
    private static final String a;

    Y8(fj_1 fj_12, String string) {
        this.y = fj_12;
        this.S = string;
    }

    @Override
    public void run() {
        try {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            try {
                object4 = this.y.Z.T.R();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object3 = this.y.Z.s.U();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object2 = object3.V();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = object2.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object4.j(object, this.S);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor((a3)this.y.Z.T), a);
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
                char[] cArray3 = "\u5219\u5eb7\u6580\u4eaf\u5926\u8d2c\u007f".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 58;
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
                            n17 = 56;
                            break;
                        }
                        case 1: {
                            n17 = 119;
                            break;
                        }
                        case 2: {
                            n17 = 61;
                            break;
                        }
                        case 3: {
                            n17 = 99;
                            break;
                        }
                        case 4: {
                            n17 = 45;
                            break;
                        }
                        case 5: {
                            n17 = 51;
                            break;
                        }
                        default: {
                            n17 = 100;
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

