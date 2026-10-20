/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Renamed from Ft
 */
class ft_0
implements ActionListener {
    final JTextField m;
    final JPanel w;
    final boolean O;
    final yb_1 L;
    final t3_0 C;
    final k0_0 Y;
    private static final String a;

    ft_0(k0_0 k0_02, JTextField jTextField, JPanel jPanel, boolean bl, yb_1 yb_12, t3_0 t3_02) {
        this.Y = k0_02;
        this.m = jTextField;
        this.w = jPanel;
        this.O = bl;
        this.L = yb_12;
        this.C = t3_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        Object object2;
        block19: {
            ft_0 ft_02;
            String string;
            block17: {
                block18: {
                    boolean bl;
                    int[] nArray;
                    block16: {
                        string = ((JTextField)this.m).getText().trim();
                        nArray = yb_1.Y();
                        try {
                            bl = (Boolean)lk_0.Y(string);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (nArray != null) break block16;
                        if (bl) {
                            JOptionPane.showMessageDialog((JPanel)this.w, a);
                            return;
                        }
                        ft_02 = this;
                        if (nArray != null) break block17;
                        bl = ft_02.O;
                    }
                    if (!bl) break block18;
                    try {
                        this.L.F(this.C, this.Y.Q, string);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (nArray == null) break block19;
                }
                ft_02 = this;
            }
            try {
                ft_02.L.e(string);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        ((k0_0)this.Y).setVisible(false);
        try {
            object2 = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object = object2.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
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
                char[] cArray3 = "\u8bcd\u8fcb\u517a\u65ae\u4ecb\u5979\u546c\u79ca".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 124;
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
                            n17 = 70;
                            break;
                        }
                        case 1: {
                            n17 = 36;
                            break;
                        }
                        case 2: {
                            n17 = 99;
                            break;
                        }
                        case 3: {
                            n17 = 85;
                            break;
                        }
                        case 4: {
                            n17 = 65;
                            break;
                        }
                        case 5: {
                            n17 = 60;
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

