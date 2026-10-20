/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Renamed from Uk
 */
class uk_0
implements Runnable {
    final ck_2 i;
    final F6 h;
    private static final String a;

    uk_0(F6 f62, ck_2 ck_22) {
        this.h = f62;
        this.i = ck_22;
    }

    @Override
    public void run() {
        zD zD2;
        try {
            zD2 = (zD)this.h.S.N();
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
                object2 = this.i.d();
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
                object = this.i.d();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.h.S.i(object);
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
                JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor((F6)this.h), string);
            }
        }
        catch (Exception exception) {
            throw uk_0.a(exception);
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
                char[] cArray3 = "\u5249\u963e\u65ce\u4ebc\u594a\u8d2cpc".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 55;
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
                            n17 = 94;
                            break;
                        }
                        case 1: {
                            n17 = 109;
                            break;
                        }
                        case 2: {
                            n17 = 126;
                            break;
                        }
                        case 3: {
                            n17 = 125;
                            break;
                        }
                        case 4: {
                            n17 = 76;
                            break;
                        }
                        case 5: {
                            n17 = 62;
                            break;
                        }
                        default: {
                            n17 = 102;
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

