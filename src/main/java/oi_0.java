/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

/*
 * Renamed from Oi
 */
class oi_0
implements ActionListener {
    final u6_0 p;
    final zM c;
    private static final String a;

    oi_0(zM zM2, u6_0 u6_02) {
        this.c = zM2;
        this.p = u6_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Serializable serializable;
        String string;
        block28: {
            String string2;
            block29: {
                ky_2[] ky_2Array;
                block27: {
                    block26: {
                        boolean bl;
                        String string3;
                        yt_1 yt_12;
                        ky_2Array = zM.I();
                        try {
                            yt_12 = (yt_1)yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (ky_2Array != null) {
                            boolean bl2;
                            Object object;
                            try {
                                object = yt_12.P();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            try {
                                bl2 = (Boolean)object.w();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            if (!bl2) {
                                try {
                                    yt_12 = (yt_1)yt_1.i();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                        } else {
                            try {
                                yt_12.g();
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getTargetException();
                            }
                            return;
                        }
                        try {
                            string3 = (String)this.p.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        String string4 = string = string3;
                        if (ky_2Array == null) break block26;
                        try {
                            bl = (Boolean)lk_0.Y(string4);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (!bl) break block27;
                        string4 = string = (String)lk_0.G;
                    }
                    if (ky_2Array != null) break block28;
                }
                serializable = new File(string);
                string2 = ((File)serializable).getParent();
                if (ky_2Array == null) break block29;
                if (string2 == null) break block28;
                string2 = ((File)serializable).getParent();
            }
            string = string2;
        }
        serializable = new JFileChooser(string);
        ((JFileChooser)serializable).setDialogTitle(a);
        ((JFileChooser)serializable).setFileSelectionMode(0);
        ((JFileChooser)serializable).setMultiSelectionEnabled(false);
        ((JFileChooser)serializable).setFileFilter(new KE(this));
        int n10 = ((JFileChooser)serializable).showOpenDialog(SwingUtilities.getWindowAncestor((zM)this.c));
        if (n10 == 0) {
            File file = ((JFileChooser)serializable).getSelectedFile();
            try {
                this.p.h(file.getAbsolutePath());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                this.c.g(file.getAbsolutePath());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
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
                char[] cArray3 = "\u9001\u6297\u56f3\u7236\u659a\u4ea2".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 107;
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
                            n17 = 99;
                            break;
                        }
                        case 1: {
                            n17 = 21;
                            break;
                        }
                        case 2: {
                            n17 = 102;
                            break;
                        }
                        case 3: {
                            n17 = 26;
                            break;
                        }
                        case 4: {
                            n17 = 118;
                            break;
                        }
                        case 5: {
                            n17 = 63;
                            break;
                        }
                        default: {
                            n17 = 114;
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

