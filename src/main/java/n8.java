/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import javax.swing.JDialog;

public class n8
extends JDialog {
    U D;
    zm_0 k;
    private static final String a;

    public n8(U u10) {
        super(u10);
        this.D = u10;
        boolean bl = zm_0.e();
        this.setTitle(a);
        boolean bl2 = bl;
        this.k = new zm_0();
        this.setContentPane((zm_0)this.k);
        this.pack();
        this.setLocationRelativeTo(u10);
        this.setVisible(true);
        if (ky_2.F() != null) {
            zm_0.D(!bl2);
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
                char[] cArray3 = "\u9f53\u680d\u8b97\u7f74".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 109;
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
                            n17 = 30;
                            break;
                        }
                        case 1: {
                            n17 = 103;
                            break;
                        }
                        case 2: {
                            n17 = 68;
                            break;
                        }
                        case 3: {
                            n17 = 119;
                            break;
                        }
                        case 4: {
                            n17 = 40;
                            break;
                        }
                        case 5: {
                            n17 = 70;
                            break;
                        }
                        default: {
                            n17 = 9;
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

