/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class zH
implements Runnable {
    String u;
    final zD R;
    final String l;
    final ArrayList D;
    final fp_2 w;
    final tf_2 s;
    final boolean E;
    final Component n;
    final F6 g;
    private static final String a;

    zH(F6 f62, zD zD2, String string, ArrayList arrayList, fp_2 fp_22, tf_2 tf_22, boolean bl, Component component) {
        this.g = f62;
        this.R = zD2;
        this.l = string;
        this.D = arrayList;
        this.w = fp_22;
        this.s = tf_22;
        this.E = bl;
        this.n = component;
        this.u = null;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block37: {
            zH zH2;
            block35: {
                boolean bl;
                block31: {
                    bl = F6.i();
                    try {
                        int n10;
                        try {
                            this.R.G(this.l, this.D, this.w, true);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            n10 = (Integer)this.s.y();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        ((ArrayList)this.D).add(new gZ((String)this.l, 0L, n10, true));
                        try {
                            this.R.q(this.D, this.w);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        for (gZ gZ2 : (ArrayList)this.D) {
                            block33: {
                                Object object;
                                Object object2;
                                zH zH3;
                                block32: {
                                    block38: {
                                        Object object3;
                                        try {
                                            object3 = gZ2.z();
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        try {
                                            this.g.S.m(object3);
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        zH2 = this;
                                        if (!bl) break block31;
                                        if (!bl) break block32;
                                        break block38;
                                        catch (Exception exception) {
                                            throw zH.a(exception);
                                        }
                                    }
                                    try {
                                        block39: {
                                            if (!zH2.E) break block33;
                                            break block39;
                                            catch (Exception exception) {
                                                throw zH.a(exception);
                                            }
                                        }
                                        zH3 = this;
                                    }
                                    catch (Exception exception) {
                                        throw zH.a(exception);
                                    }
                                }
                                try {
                                    object2 = gZ2.z();
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    object = lk_0.M(object2);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                                try {
                                    zH3.g.s(object, false, false);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            if (bl) continue;
                            break;
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        this.u = a + exception;
                    }
                    zH2 = this;
                }
                try {
                    block36: {
                        try {
                            try {
                                if (!bl) break block35;
                                if ((String)zH2.u == null) break block36;
                            }
                            catch (Exception exception) {
                                throw zH.a(exception);
                            }
                            JOptionPane.showMessageDialog((Component)this.n, (String)this.u);
                            if (bl) break block37;
                        }
                        catch (Exception exception) {
                            throw zH.a(exception);
                        }
                    }
                    zH2 = this;
                }
                catch (Exception exception) {
                    throw zH.a(exception);
                }
            }
            ((fp_2)zH2.w).setVisible(false);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
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
                char[] cArray3 = "\u5235\u9616\u65d7\u4ec9\u5935\u596f\u8d564x".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 58;
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
                            n17 = 47;
                            break;
                        }
                        case 1: {
                            n17 = 72;
                            break;
                        }
                        case 2: {
                            n17 = 106;
                            break;
                        }
                        case 3: {
                            n17 = 5;
                            break;
                        }
                        case 4: {
                            n17 = 54;
                            break;
                        }
                        case 5: {
                            n17 = 100;
                            break;
                        }
                        default: {
                            n17 = 73;
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

