/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.JComponent;
import javax.swing.tree.DefaultMutableTreeNode;
import net.miginfocom.swing.MigLayout;

public abstract class z7
extends JComponent {
    String h;
    DefaultMutableTreeNode c;
    private static int K;
    private static final String e;

    public z7() {
        this.setLayout(new MigLayout(e));
        this.setName(this.getClass().getName());
    }

    public abstract void A(lv_2 var1);

    public abstract vg_0 c();

    public abstract void F(lv_2 var1);

    public String l() {
        return (String)this.h;
    }

    public void A(String string) {
        this.h = string;
    }

    public DefaultMutableTreeNode B() {
        return (DefaultMutableTreeNode)this.c;
    }

    public void Q(DefaultMutableTreeNode defaultMutableTreeNode) {
        this.c = defaultMutableTreeNode;
    }

    public static void z(int n10) {
        K = n10;
    }

    public static int M() {
        return K;
    }

    public static int m() {
        int n10 = z7.M();
        if (n10 == 0) {
            return 125;
        }
        return 0;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                if (z7.m() == 0) {
                    z7.z(106);
                }
                char[] cArray3 = "'Gy\u0005+\u0011w\u007f\u0019*QoBf~\t;P".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 122;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 52;
                            break;
                        }
                        case 1: {
                            n17 = 83;
                            break;
                        }
                        case 2: {
                            n17 = 112;
                            break;
                        }
                        case 3: {
                            n17 = 26;
                            break;
                        }
                        case 4: {
                            n17 = 37;
                            break;
                        }
                        case 5: {
                            n17 = 24;
                            break;
                        }
                        default: {
                            n17 = 45;
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
        e = new String(cArray).intern();
    }
}

