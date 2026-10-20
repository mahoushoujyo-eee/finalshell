/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.JDialog;

public class YP
extends JDialog {
    U l;
    zK j;
    private static final String a;

    public YP(U u10) {
        super(u10);
        this.l = u10;
        this.setTitle(a);
        this.j = new zK();
        this.setContentPane((zK)this.j);
        this.pack();
        this.setLocationRelativeTo(u10);
        this.setVisible(true);
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
                char[] cArray3 = "\u5fc5\u630e\u9562\u8b98\u7f36".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 26;
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
                            n17 = 52;
                            break;
                        }
                        case 1: {
                            n17 = 99;
                            break;
                        }
                        case 2: {
                            n17 = 86;
                            break;
                        }
                        case 3: {
                            n17 = 60;
                            break;
                        }
                        case 4: {
                            n17 = 66;
                            break;
                        }
                        case 5: {
                            n17 = 36;
                            break;
                        }
                        default: {
                            n17 = 29;
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

