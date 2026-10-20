/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/*
 * Renamed from Qj
 */
public class qj_0 {
    JFrame l;
    gh_0 T;
    private static final String a;
    private static final long[] b;
    private static final Integer[] c;

    public qj_0() {
        this.l = new JFrame();
        ((JFrame)this.l).setSize(qj_0.a(6148, 2530760439969728436L), qj_0.a(31460, 965959573987960149L));
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new MigLayout());
        ((JFrame)this.l).setContentPane(jPanel);
        this.T = new gh_0();
        jPanel.add((gh_0)this.T);
        ((JFrame)this.l).setLocationRelativeTo(null);
        ((JFrame)this.l).setVisible(true);
        ((gh_0)this.T).setText(a);
    }

    public Icon Q(JButton jButton, String string) {
        ImageIcon imageIcon;
        block6: {
            BufferedImage bufferedImage;
            int n10;
            int n11;
            BufferedImage bufferedImage2;
            block5: {
                bufferedImage2 = null;
                imageIcon = null;
                ((gh_0)this.T).setText(string);
                int n12 = ((gh_0)this.T).M();
                n11 = ((gh_0)this.T).m();
                String[] stringArray = F8.y();
                float f10 = 1.0f;
                n12 = (int)(67.0f * f10);
                n11 = (int)(22.0f * f10);
                n10 = n12;
                if (stringArray != null) break block5;
                if (n10 <= 0) break block6;
                n10 = n12;
            }
            try {
                bufferedImage = (BufferedImage)lk_0.u(n10, n11);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            bufferedImage2 = bufferedImage;
            Graphics2D graphics2D = (Graphics2D)bufferedImage2.getGraphics();
            try {
                this.T.paint(graphics2D);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            graphics2D.dispose();
            imageIcon = new ImageIcon(bufferedImage2);
        }
        return imageIcon;
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
                char[] cArray3 = "iR-F\u0013d0iR-F\u0013a5".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 58;
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
                            n17 = 55;
                            break;
                        }
                        case 1: {
                            n17 = 12;
                            break;
                        }
                        case 2: {
                            n17 = 115;
                            break;
                        }
                        case 3: {
                            n17 = 24;
                            break;
                        }
                        case 4: {
                            n17 = 77;
                            break;
                        }
                        case 5: {
                            n17 = 58;
                            break;
                        }
                        default: {
                            n17 = 110;
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
        long l2 = 3544516012559959008L;
        long[] lArray = new long[2];
        int n18 = 0;
        String string = "(x\u0005\u00fc\u0089S\u00c5\u00a0\u00e5\u00ce\u00ee\u009f\u00ff\u00a2\u00a7A";
        int n19 = "(x\u0005\u00fc\u0089S\u00c5\u00a0\u00e5\u00ce\u00ee\u009f\u00ff\u00a2\u00a7A".length();
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
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x5FB0;
        if (c[n11] == null) {
            qj_0.c[n11] = (int)(b[n11] ^ l2);
        }
        return c[n11];
    }
}

