/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

class KR
implements ActionListener {
    final DU d;
    private static final String a;

    KR(DU dU) {
        this.d = dU;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String string;
        try {
            string = (String)lk_0.B(a);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string2 = string;
        ((JLabel)this.d.c).setText(string2);
        try {
            yt_1.F.J(new yk_0(this));
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
                char[] cArray3 = "1nohn-K,|\f\u001aN\u0015v.\u007f\u00197~vZ\bZ\f\u0012[3z\u0013R\u0011pk\tZWx\u0019\u0010\u007f\u001c2\n~\f\r=#N\u0012@\b4@\u0014$\f\u0001(f".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 24;
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
                            n17 = 123;
                            break;
                        }
                        case 1: {
                            n17 = 50;
                            break;
                        }
                        case 2: {
                            n17 = 71;
                            break;
                        }
                        case 3: {
                            n17 = 67;
                            break;
                        }
                        case 4: {
                            n17 = 21;
                            break;
                        }
                        case 5: {
                            n17 = 92;
                            break;
                        }
                        default: {
                            n17 = 5;
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

