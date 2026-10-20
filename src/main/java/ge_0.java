/*
 * Decompiled with CFR 0.152.
 */
import com._y_0;
import javax.swing.JComponent;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/*
 * Renamed from ge
 */
public class ge_0
extends JPanel {
    private static final String a;

    ge_0() {
        this.setLayout(new MigLayout(a));
        this.setOpaque(false);
    }

    void f(JComponent jComponent) {
        String[] stringArray = aM.s();
        this.removeAll();
        String[] stringArray2 = stringArray;
        this.add(jComponent);
        this.validate();
        JComponent jComponent2 = jComponent;
        if (stringArray2 == null) {
            if (jComponent2 instanceof _y_0) {
                jComponent.requestFocusInWindow();
            }
            jComponent2 = jComponent;
        }
        jComponent2.repaint();
    }

    void S() {
        this.removeAll();
        this.doLayout();
        this.validate();
        this.updateUI();
        this.repaint();
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
                char[] cArray3 = ".@[nY3\"w\u000e\u0018+\u001d`2".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 113;
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
                            n17 = 54;
                            break;
                        }
                        case 1: {
                            n17 = 95;
                            break;
                        }
                        case 2: {
                            n17 = 89;
                            break;
                        }
                        case 3: {
                            n17 = 122;
                            break;
                        }
                        case 4: {
                            n17 = 92;
                            break;
                        }
                        case 5: {
                            n17 = 49;
                            break;
                        }
                        default: {
                            n17 = 115;
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

