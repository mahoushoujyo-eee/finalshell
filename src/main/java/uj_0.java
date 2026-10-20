/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Renamed from Uj
 */
class uj_0
implements ActionListener {
    final z2 S;
    private static final String a;

    uj_0(z2 z22) {
        this.S = z22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(a);
        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor((z2)this.S), stringBuffer.toString());
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
                char[] cArray3 = "\u5bb9\u514f\u600bl;U}\u6540\u6349\u5704\u677a\u670b\u4f1b\u757b\u543c\u6b42\u5bea\u7857\u5291\u5ba2\u545d\u627d\u4f3d\u4e26\u4f76\u5201\u5468\u6b36\u673d\u5286\u5644z\u6c90\u676d\u545f\u6b55\u5be1\u782dz\u4eca\u4f31\u4e53\u6589\u90da\u65cc\u6c83\u8386\u5ff3\u545f\u6b55\u51a2\u5b95x;V}\u543c\u6b42\u5bea\u7857\u53db\u574c\u677f\u670a\u5287\u5bea\u4f8b\u5b69JY\u0003\t\u528c\u5b90\u7ba6\u6cb1\u9194\u7518fi\u0005\u0003Qe\u001coa\u0017rI\u0000xf\u001ec\u0007H\u4eb6\u53fa\u593d\u91e1\u52f6\u5bf7\u6d93\u6d95\u001c\u9058\u5161\u7862\u89d2\u6ca0\u9761\u98fe\u964e\u0002\\;\u5468\u6b36\u51b5\u5b9e\u0016\\\u4e0a\u675e\u8f8d\u6395\u916a\u7f42z\u544c\u4e80\u53d5\u53c2\u000b\u65ab\u4ea0\u8dde\u5fe0\u53d5\u53c2\u000b\u5fc7\u6321\u544c\u4e80\u007f\u544d\u4ec3\u53ee\u6526\u53b7\u5396\u007f\u4ed3\u7421\u6721\u52f7\u5659H\u757b\u6207\u5be1\u9489x;n\u649e\u4f6c\u001d&\u545a\u6b54\u8fa3\u7a58\u81da\u528f\u5ba0\u6246\u001d\u9590\u96c7\u0003\u0017\u79fe\u5c4b\u8be4\u5468\u6b36\u4e30\u6b06\u0002\\;\u5468\u6b36\u7286\u6026\u98b0\u8224\u000bn\u7023\u8242\u001d\u65cc\u6c83\u543d\u6b01\u007f\u7ecf\u8255\u0016\u545a\u6b54\u5be8\u6243\u001c\u9ee3\u825el\u6738\u6514\u633d\u5c2a\u670d\u5420\u6b33\u001f".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 127;
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
                            n17 = 79;
                            break;
                        }
                        case 1: {
                            n17 = 88;
                            break;
                        }
                        case 2: {
                            n17 = 83;
                            break;
                        }
                        case 3: {
                            n17 = 41;
                            break;
                        }
                        case 4: {
                            n17 = 78;
                            break;
                        }
                        case 5: {
                            n17 = 27;
                            break;
                        }
                        default: {
                            n17 = 44;
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

