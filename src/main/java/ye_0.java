/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import javax.swing.JDialog;

/*
 * Renamed from Ye
 */
public class ye_0
extends JDialog {
    U e;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public ye_0(U u10) {
        super(u10);
        this.e = u10;
        this.setTitle(a);
        this.setSize(ye_0.a(23595, 1049017461928232027L), ye_0.a(2166, 9039202300322467847L));
        this.setLocationRelativeTo(u10);
        this.setVisible(true);
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
                char[] cArray3 = "\u912d\u8274\u8ba1\u7f1f".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 108;
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
                            n17 = 12;
                            break;
                        }
                        case 1: {
                            n17 = 106;
                            break;
                        }
                        case 2: {
                            n17 = 115;
                            break;
                        }
                        case 3: {
                            n17 = 29;
                            break;
                        }
                        case 4: {
                            n17 = 79;
                            break;
                        }
                        case 5: {
                            n17 = 76;
                            break;
                        }
                        default: {
                            n17 = 124;
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
        long l2 = 1375602504535032690L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "|Mj\u00169o\u0091-\u00e8\u00d8\u009aNW\u0098\u00c6\u00b9";
        int n19 = "|Mj\u00169o\u0091-\u00e8\u00d8\u009aNW\u0098\u00c6\u00b9".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5871;
        if (c[n11] == null) {
            ye_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

