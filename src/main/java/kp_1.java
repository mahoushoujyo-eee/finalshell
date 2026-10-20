/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;

/*
 * Renamed from kP
 */
class kp_1
implements Runnable {
    final String s;
    final ly_2 X;
    private static final String a;

    kp_1(ly_2 ly_22, String string) {
        this.X = ly_22;
        this.s = string;
    }

    @Override
    public void run() {
        String string;
        String string2;
        Object object;
        zD zD2;
        try {
            zD2 = (zD)this.X.E.d.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        zD zD3 = zD2;
        String string3 = null;
        try {
            object = this.X.E.G.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            string2 = (String)lk_0.e(object);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string4 = string2;
        try {
            string = (String)this.X.E.G.k();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string5 = string + string4 + (String)this.s;
        try {
            Object object2;
            Object object3;
            try {
                object3 = this.X.E.d.R();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object2 = this.X.E.G.k();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object3.I((Object)((a3)this.X.E.d).getParent(), object2, this.s, true, true);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            string3 = a + exception;
        }
        try {
            if (string3 != null) {
                JOptionPane.showMessageDialog((a3)this.X.E.d, string3);
            }
        }
        catch (Exception exception) {
            throw kp_1.a(exception);
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
                char[] cArray3 = "\u523d\u5ed0\u5959\u8d59\"\f".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 111;
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
                            n17 = 73;
                            break;
                        }
                        case 1: {
                            n17 = 69;
                            break;
                        }
                        case 2: {
                            n17 = 7;
                            break;
                        }
                        case 3: {
                            n17 = 19;
                            break;
                        }
                        case 4: {
                            n17 = 108;
                            break;
                        }
                        case 5: {
                            n17 = 105;
                            break;
                        }
                        default: {
                            n17 = 22;
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

