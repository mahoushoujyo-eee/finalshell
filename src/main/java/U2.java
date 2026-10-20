/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;

class U2
implements ActionListener {
    final nx_0 t;
    private static final String a;

    U2(nx_0 nx_02) {
        this.t = nx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block7: {
            String string;
            String string2;
            block6: {
                string2 = JOptionPane.showInputDialog(((km_0)this.t.s).getParent(), (Object)a);
                String string3 = km_0.U();
                string = string2;
                if (string3 != null) break block6;
                if (string == null) break block7;
                string = string2;
            }
            if (!string.equals("")) {
                try {
                    yt_1.F.J(new YL(this, string2));
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
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
                char[] cArray3 = "\u65aa\u4ec0\u590f\u542f\u79ea\u001bP".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 28;
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
                            n17 = 49;
                            break;
                        }
                        case 1: {
                            n17 = 42;
                            break;
                        }
                        case 2: {
                            n17 = 42;
                            break;
                        }
                        case 3: {
                            n17 = 62;
                            break;
                        }
                        case 4: {
                            n17 = 6;
                            break;
                        }
                        case 5: {
                            n17 = 61;
                            break;
                        }
                        default: {
                            n17 = 108;
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

