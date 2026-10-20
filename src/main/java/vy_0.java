/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Renamed from Vy
 */
class vy_0
implements Runnable {
    String F;
    final zD N;
    final String s;
    final ArrayList Q;
    final fp_2 f;
    final tf_2 l;
    final boolean T;
    final Component O;
    final F6 p;
    private static final String a;

    vy_0(F6 f62, zD zD2, String string, ArrayList arrayList, fp_2 fp_22, tf_2 tf_22, boolean bl, Component component) {
        this.p = f62;
        this.N = zD2;
        this.s = string;
        this.Q = arrayList;
        this.f = fp_22;
        this.l = tf_22;
        this.T = bl;
        this.O = component;
        this.F = null;
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        block37: {
            vy_0 vy_02;
            block35: {
                boolean bl;
                block31: {
                    bl = F6.g();
                    try {
                        int n10;
                        try {
                            this.N.G(this.s, this.Q, this.f, true);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            n10 = (Integer)this.l.y();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        ((ArrayList)this.Q).add(new gZ((String)this.s, 0L, n10, true));
                        try {
                            this.N.q(this.Q, this.f);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        for (gZ gZ2 : (ArrayList)this.Q) {
                            block33: {
                                Object object;
                                Object object2;
                                vy_0 vy_03;
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
                                            this.p.S.m(object3);
                                        }
                                        catch (InvocationTargetException invocationTargetException) {
                                            throw invocationTargetException.getTargetException();
                                        }
                                        vy_02 = this;
                                        if (bl) break block31;
                                        if (bl) break block32;
                                        break block38;
                                        catch (Exception exception) {
                                            throw vy_0.a(exception);
                                        }
                                    }
                                    try {
                                        block39: {
                                            if (!vy_02.T) break block33;
                                            break block39;
                                            catch (Exception exception) {
                                                throw vy_0.a(exception);
                                            }
                                        }
                                        vy_03 = this;
                                    }
                                    catch (Exception exception) {
                                        throw vy_0.a(exception);
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
                                    vy_03.p.s(object, false, false);
                                }
                                catch (InvocationTargetException invocationTargetException) {
                                    throw invocationTargetException.getTargetException();
                                }
                            }
                            if (!bl) continue;
                            break;
                        }
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        this.F = a + exception;
                    }
                    vy_02 = this;
                }
                try {
                    block36: {
                        try {
                            try {
                                if (bl) break block35;
                                if ((String)vy_02.F == null) break block36;
                            }
                            catch (Exception exception) {
                                throw vy_0.a(exception);
                            }
                            JOptionPane.showMessageDialog((Component)this.O, (String)this.F);
                            if (!bl) break block37;
                        }
                        catch (Exception exception) {
                            throw vy_0.a(exception);
                        }
                    }
                    vy_02 = this;
                }
                catch (Exception exception) {
                    throw vy_0.a(exception);
                }
            }
            ((fp_2)vy_02.f).setVisible(false);
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
                char[] cArray3 = "\u527d\u962d\u65ce\u4e9f\u5960\u5930\u8d0d|C".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 64;
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
                            n17 = 29;
                            break;
                        }
                        case 1: {
                            n17 = 9;
                            break;
                        }
                        case 2: {
                            n17 = 9;
                            break;
                        }
                        case 3: {
                            n17 = 41;
                            break;
                        }
                        case 4: {
                            n17 = 25;
                            break;
                        }
                        case 5: {
                            n17 = 65;
                            break;
                        }
                        default: {
                            n17 = 104;
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

