/*
 * Decompiled with CFR 0.152.
 */
import com._C;
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from lP
 */
class lp_1
implements ActionListener {
    final C5 v;
    final jx_0 d;
    private static final String a;

    lp_1(jx_0 jx_02, C5 c5) {
        this.d = jx_02;
        this.v = c5;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n10;
        YB yB;
        String string;
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
            string = (String)this.d.q.J();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        String string2 = string;
        int[] nArray = jx_0.O();
        try {
            yB = (YB)this.d.l((Object)string2, (Object)u11);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        YB yB2 = yB;
        try {
            n10 = (Integer)yB2.s();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        int n11 = n10;
        if (nArray == null) {
            if (n11 == YB.O) {
                fx_1 fx_12;
                String string3;
                try {
                    string3 = (String)yB2.E();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                String string4 = string3;
                ((_C)this.d.H).setText(a + new File(string4).getAbsolutePath());
                ((_C)this.d.H).setToolTipText(string4);
                try {
                    this.d.q.z(string4);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    fx_12 = (fx_1)this.d.q.j();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                fx_1 fx_13 = fx_12;
                try {
                    fx_13.f(string4);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                try {
                    this.d.W();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            try {
                this.d.W(this.d.H);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((C5)this.v).setVisible(true);
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
                char[] cArray3 = "\u4e64\u8f57\u001f8".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 95;
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
                            n17 = 48;
                            break;
                        }
                        case 1: {
                            n17 = 117;
                            break;
                        }
                        case 2: {
                            n17 = 122;
                            break;
                        }
                        case 3: {
                            n17 = 71;
                            break;
                        }
                        case 4: {
                            n17 = 23;
                            break;
                        }
                        case 5: {
                            n17 = 48;
                            break;
                        }
                        default: {
                            n17 = 32;
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

