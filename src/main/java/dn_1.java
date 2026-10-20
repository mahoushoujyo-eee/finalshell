/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ne_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFileChooser;

/*
 * Renamed from dN
 */
class dn_1
implements ActionListener {
    final KO S;
    private static final String a;

    dn_1(KO kO) {
        this.S = kO;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Serializable serializable;
        String string;
        u6_0 u6_02;
        block22: {
            String string2;
            block23: {
                String[] stringArray;
                block21: {
                    block20: {
                        boolean bl;
                        String string3;
                        u6_0 u6_03;
                        Object object;
                        try {
                            object = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            u6_03 = (u6_0)object.h();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        u6_02 = u6_03;
                        stringArray = Y_.j();
                        try {
                            string3 = (String)u6_02.Z();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        String string4 = string = string3;
                        if (stringArray == null) break block20;
                        try {
                            bl = (Boolean)lk_0.Y(string4);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        if (!bl) break block21;
                        string4 = string = (String)lk_0.G;
                    }
                    if (stringArray != null) break block22;
                }
                serializable = new File(string);
                string2 = ((File)serializable).getParent();
                if (stringArray == null) break block23;
                if (string2 == null) break block22;
                string2 = ((File)serializable).getParent();
            }
            string = string2;
        }
        serializable = new JFileChooser(string);
        ((JFileChooser)serializable).setDialogTitle(a);
        ((JFileChooser)serializable).setFileSelectionMode(0);
        ((JFileChooser)serializable).setMultiSelectionEnabled(false);
        int n10 = ((JFileChooser)serializable).showOpenDialog((KO)this.S);
        if (n10 == 0) {
            Object object;
            File file = ((JFileChooser)serializable).getSelectedFile();
            try {
                u6_02.k(file.getAbsolutePath());
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((ne_2)this.S.R).setText(file.getAbsolutePath());
            try {
                this.S.N(false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object = yt_1.i();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                object.S();
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
                char[] cArray3 = "\u9011\u62ea\u79c5\u94c6\u65c0\u4eab".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 103;
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
                            n17 = 127;
                            break;
                        }
                        case 1: {
                            n17 = 100;
                            break;
                        }
                        case 2: {
                            n17 = 99;
                            break;
                        }
                        case 3: {
                            n17 = 4;
                            break;
                        }
                        case 4: {
                            n17 = 32;
                            break;
                        }
                        case 5: {
                            n17 = 58;
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

