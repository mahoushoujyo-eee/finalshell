/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Cb
 */
class cb_0
implements ActionListener {
    final da_1 L;
    private static final String a;

    cb_0(da_1 da_12) {
        this.L = da_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            lk_0.X(a);
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
                char[] cArray3 = "5Y~Nmy9rZ}I0+y.YhKxmu2@%J1z.d\u0003bJs/);^".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 25;
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
                            n17 = 68;
                            break;
                        }
                        case 1: {
                            n17 = 52;
                            break;
                        }
                        case 2: {
                            n17 = 19;
                            break;
                        }
                        case 3: {
                            n17 = 39;
                            break;
                        }
                        case 4: {
                            n17 = 7;
                            break;
                        }
                        case 5: {
                            n17 = 90;
                            break;
                        }
                        default: {
                            n17 = 15;
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

