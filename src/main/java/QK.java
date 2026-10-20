/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

class QK
implements ItemListener {
    final uq_1 R;
    private static final String a;

    QK(uq_1 uq_12) {
        this.R = uq_12;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        boolean bl;
        block4: {
            boolean bl2;
            block2: {
                block3: {
                    bl = false;
                    String string = zw_0.V();
                    bl2 = ((JComboBox)this.R.p).getSelectedItem().equals(a);
                    if (string == null) break block2;
                    if (!bl2) break block3;
                    bl = false;
                    if (string != null) break block4;
                }
                bl2 = true;
            }
            bl = bl2;
        }
        ((JLabel)this.R.v).setEnabled(bl);
        ((JLabel)this.R.I).setEnabled(bl);
        ((JTextField)this.R.T).setEnabled(bl);
        ((JTextField)this.R.n).setEnabled(bl);
        ((JTextField)this.R.T).setEditable(bl);
        ((JTextField)this.R.n).setEditable(bl);
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
                char[] cArray3 = ";]&\u001bm\u0012".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 37;
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
                            n17 = 77;
                            break;
                        }
                        case 1: {
                            n17 = 55;
                            break;
                        }
                        case 2: {
                            n17 = 64;
                            break;
                        }
                        case 3: {
                            n17 = 117;
                            break;
                        }
                        case 4: {
                            n17 = 27;
                            break;
                        }
                        case 5: {
                            n17 = 2;
                            break;
                        }
                        default: {
                            n17 = 32;
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

