/*
 * Decompiled with CFR 0.152.
 */
import com._C;
import com.c;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;

class QV
implements MouseListener {
    final String V;
    final fx_1 j;
    final JLabel F;
    final Color O;
    final W8 l;
    final JPopupMenu X;
    final jx_0 y;
    private static final String a;

    QV(jx_0 jx_02, String string, fx_1 fx_12, JLabel jLabel, Color color, W8 w8, JPopupMenu jPopupMenu) {
        this.y = jx_02;
        this.V = string;
        this.j = fx_12;
        this.F = jLabel;
        this.O = color;
        this.l = w8;
        this.X = jPopupMenu;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block12: {
            int n10;
            W8 w8;
            block11: {
                int[] nArray = jx_0.O();
                if (nArray != null) break block11;
                if (mouseEvent.getButton() != 1) break block12;
                ((_C)this.y.H).setText(a + new File((String)this.V).getAbsolutePath());
                ((_C)this.y.H).setToolTipText((String)this.V);
                try {
                    this.j.f(this.V);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.y.q.z(this.V);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.y.W();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ((JLabel)this.F).setBackground((Color)this.O);
                ((W8)this.l).setBackground((Color)this.O);
                ((JPopupMenu)this.X).setVisible(false);
            }
            try {
                w8 = (W8)this.y.d(this.V);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            W8 w82 = w8;
            ((ArrayList)this.y.s).remove(w82);
            ((ArrayList)this.y.s).add(0, w82);
            ((JPopupMenu)this.X).remove(w82);
            try {
                n10 = (Integer)this.j.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((JPopupMenu)this.X).insert(w82, n10 - 1);
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
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
                char[] cArray3 = "\u4e20\u8f2as\u0001".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 123;
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
                            n17 = 80;
                            break;
                        }
                        case 1: {
                            n17 = 44;
                            break;
                        }
                        case 2: {
                            n17 = 50;
                            break;
                        }
                        case 3: {
                            n17 = 90;
                            break;
                        }
                        case 4: {
                            n17 = 30;
                            break;
                        }
                        case 5: {
                            n17 = 91;
                            break;
                        }
                        default: {
                            n17 = 48;
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

