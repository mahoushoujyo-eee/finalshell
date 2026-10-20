/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.awt.Toolkit;
import javax.swing.JDialog;

/*
 * Renamed from yQ
 */
public class yq_1
extends JDialog {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public yq_1() {
        int n10 = dp_0.n();
        int n11 = n10;
        dp_0 dp_02 = new dp_0();
        this.setContentPane(dp_02);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(a));
        if (ky_2.F() != null) {
            dp_0.j(++n11);
        }
    }

    public void h() {
        this.setSize(yq_1.a(9423, 8649565482458701637L), yq_1.a(6264, 633285047693173747L));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void O() {
        this.setVisible(false);
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
                char[] cArray3 = "I\u001bZO`\\i\bS\\\fw\u001db".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 57;
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
                            n17 = 94;
                            break;
                        }
                        case 1: {
                            n17 = 13;
                            break;
                        }
                        case 2: {
                            n17 = 10;
                            break;
                        }
                        case 3: {
                            n17 = 27;
                            break;
                        }
                        case 4: {
                            n17 = 62;
                            break;
                        }
                        case 5: {
                            n17 = 74;
                            break;
                        }
                        default: {
                            n17 = 60;
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
        long l2 = 3980993059803167700L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "\u00d7\u00c0\u0015(\u00e5\u00b2\u00a5\u00bd\u0001\u0002^q;\u008d\u0098\u00b1";
        int n19 = "\u00d7\u00c0\u0015(\u00e5\u00b2\u00a5\u00bd\u0001\u0002^q;\u008d\u0098\u00b1".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7B8A;
        if (c[n11] == null) {
            yq_1.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

