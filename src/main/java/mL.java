/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class mL
implements ListSelectionListener {
    final JCheckBox N;
    final zM T;
    private static final String a;

    mL(zM zM2, JCheckBox jCheckBox) {
        this.T = zM2;
        this.N = jCheckBox;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        block12: {
            String string;
            block15: {
                yt_1 yt_12;
                block16: {
                    boolean bl;
                    block14: {
                        ky_2[] ky_2Array;
                        block13: {
                            string = (String)((JList)this.T.O).getSelectedValue();
                            ky_2Array = zM.I();
                            if (string == null) break block12;
                            bl = listSelectionEvent.getValueIsAdjusting();
                            if (ky_2Array == null) break block13;
                            if (bl) break block12;
                            bl = string.startsWith(a);
                        }
                        if (ky_2Array == null) break block14;
                        if (bl) break block15;
                        try {
                            yt_12 = (yt_1)yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (ky_2Array != null) {
                            Object object;
                            try {
                                object = yt_12.P();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                bl = (Boolean)object.w();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                        }
                        break block16;
                    }
                    if (!bl) {
                        try {
                            yt_12 = (yt_1)yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    break block15;
                }
                try {
                    yt_12.g();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                return;
            }
            this.T.F = true;
            ((JCheckBox)this.N).setSelected(true);
            SwingUtilities.invokeLater(new QW(this, string));
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
                char[] cArray3 = "*S".toCharArray();
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
                            n17 = 52;
                            break;
                        }
                        case 1: {
                            n17 = 72;
                            break;
                        }
                        case 2: {
                            n17 = 116;
                            break;
                        }
                        case 3: {
                            n17 = 54;
                            break;
                        }
                        case 4: {
                            n17 = 79;
                            break;
                        }
                        case 5: {
                            n17 = 37;
                            break;
                        }
                        default: {
                            n17 = 70;
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

