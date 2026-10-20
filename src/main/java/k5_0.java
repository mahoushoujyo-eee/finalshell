/*
 * Decompiled with CFR 0.152.
 */
import com._C;
import com.c;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;

/*
 * Renamed from k5
 */
class k5_0
implements ActionListener {
    final String Q;
    final fx_1 W;
    final JPopupMenu z;
    final Component a;
    final JLabel Z;
    final Color e;
    final W8 V;
    final jx_0 c;
    private static final String b;

    k5_0(jx_0 jx_02, String string, fx_1 fx_12, JPopupMenu jPopupMenu, Component component, JLabel jLabel, Color color, W8 w8) {
        this.c = jx_02;
        this.Q = string;
        this.W = fx_12;
        this.z = jPopupMenu;
        this.a = component;
        this.Z = jLabel;
        this.e = color;
        this.V = w8;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block35: {
            block36: {
                String string;
                block38: {
                    W8 w8;
                    block37: {
                        int n10;
                        W8 w82;
                        W8 w83;
                        boolean bl;
                        String string2;
                        int n11;
                        YB yB;
                        U u10;
                        Object object;
                        Object object2;
                        Object object3;
                        try {
                            object3 = yt_1.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object2 = object3.O();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            object = object2.G();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            u10 = (U)object.D();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        U u11 = u10;
                        try {
                            yB = (YB)this.c.l(this.Q, (Object)u11);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        YB yB2 = yB;
                        int[] nArray = jx_0.O();
                        try {
                            n11 = (Integer)yB2.s();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        int n12 = n11;
                        if (nArray != null) break block35;
                        if (n12 != YB.O) break block36;
                        try {
                            string2 = (String)yB2.E();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        string = string2;
                        try {
                            bl = (Boolean)this.W.C(string);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        boolean bl2 = bl;
                        try {
                            this.W.f(string);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            this.c.W();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            w83 = (W8)this.c.d(string);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        w8 = w83;
                        if (bl2) break block37;
                        try {
                            w82 = (W8)this.c.B(this.W, this.z, this.a, (Object)string);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        W8 w84 = w82;
                        try {
                            n10 = (Integer)this.W.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        ((JPopupMenu)this.z).insert(w84, n10 - 1);
                        ((ArrayList)this.c.s).remove(w8);
                        ((ArrayList)this.c.s).add(0, w84);
                        if (nArray == null) break block38;
                    }
                    if (w8 != null) {
                        int n13;
                        ((JPopupMenu)this.z).remove(w8);
                        try {
                            n13 = (Integer)this.W.i();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        ((JPopupMenu)this.z).insert(w8, n13 - 1);
                        ((ArrayList)this.c.s).remove(w8);
                        ((ArrayList)this.c.s).add(0, w8);
                    }
                }
                ((_C)this.c.H).setText(b + new File(string).getAbsolutePath());
                ((_C)this.c.H).setToolTipText(string);
                try {
                    this.c.q.z(string);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.c.W();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            ((JLabel)this.Z).setBackground((Color)this.e);
            ((W8)this.V).setBackground((Color)this.e);
            ((C5)this.c.z).setVisible(true);
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
                char[] cArray3 = "\u4e69\u8f1a\f*".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 105;
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
                            n17 = 11;
                            break;
                        }
                        case 1: {
                            n17 = 14;
                            break;
                        }
                        case 2: {
                            n17 = 95;
                            break;
                        }
                        case 3: {
                            n17 = 99;
                            break;
                        }
                        case 4: {
                            n17 = 114;
                            break;
                        }
                        case 5: {
                            n17 = 76;
                            break;
                        }
                        default: {
                            n17 = 93;
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
        b = new String(cArray).intern();
    }
}

