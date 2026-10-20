/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Toolkit;
import javax.swing.JDialog;

/*
 * Renamed from u7
 */
public class u7_0
extends JDialog {
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public u7_0() {
        this.setModal(true);
        gg_0 gg_02 = new gg_0();
        this.setContentPane(gg_02);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(a));
    }

    public void U() {
        this.setSize(u7_0.a(30676, 7368661948799879176L), u7_0.a(28680, 5160522776274145237L));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void v() {
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
                char[] cArray3 = "wW%o\u0016\u0005\u00116\u001f#,\u0001D\u001a".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 53;
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
                            n17 = 108;
                            break;
                        }
                        case 1: {
                            n17 = 77;
                            break;
                        }
                        case 2: {
                            n17 = 121;
                            break;
                        }
                        case 3: {
                            n17 = 55;
                            break;
                        }
                        case 4: {
                            n17 = 68;
                            break;
                        }
                        case 5: {
                            n17 = 31;
                            break;
                        }
                        default: {
                            n17 = 72;
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
        long l2 = 4343560443751103786L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "/\u00d2\u00e0\u00bf\u00b6\u001ft\u000e\u00d9'\u009f<I\u001a\u00f2i";
        int n19 = "/\u00d2\u00e0\u00bf\u00b6\u001ft\u000e\u00d9'\u009f<I\u001a\u00f2i".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x7FDC;
        if (c[n11] == null) {
            u7_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

