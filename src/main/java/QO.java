/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class QO
implements ActionListener {
    final YB C;
    private static final String a;

    QO(YB yB) {
        this.C = yB;
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
                char[] cArray3 = "J{\u0003R0#^\rx\u0000Umq\u001eQ{\u0015W%7\u0012MbXVl H\u0016!\u001fV.u".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 12;
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
                            n17 = 46;
                            break;
                        }
                        case 1: {
                            n17 = 3;
                            break;
                        }
                        case 2: {
                            n17 = 123;
                            break;
                        }
                        case 3: {
                            n17 = 46;
                            break;
                        }
                        case 4: {
                            n17 = 79;
                            break;
                        }
                        case 5: {
                            n17 = 21;
                            break;
                        }
                        default: {
                            n17 = 125;
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

