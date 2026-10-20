/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/*
 * Renamed from o5
 */
class o5_0
implements MouseListener {
    final F5 A;
    final JMenuItem o;
    final JMenuItem O;
    final JPopupMenu p;
    final f3_0 x;
    private static final String a;

    o5_0(f3_0 f3_02, F5 f52, JMenuItem jMenuItem, JMenuItem jMenuItem2, JPopupMenu jPopupMenu) {
        this.x = f3_02;
        this.A = f52;
        this.o = jMenuItem;
        this.O = jMenuItem2;
        this.p = jPopupMenu;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block41: {
            block49: {
                block48: {
                    String string;
                    int[] nArray;
                    block47: {
                        o5_0 o5_02;
                        block45: {
                            block46: {
                                int n10;
                                int n11;
                                int n12;
                                String string2;
                                block39: {
                                    block40: {
                                        block44: {
                                            int n13;
                                            Object object;
                                            String string3;
                                            int n14;
                                            fy_1 fy_12;
                                            L9 l9;
                                            block43: {
                                                block42: {
                                                    t3_0 t3_02;
                                                    int n15;
                                                    fy_1 fy_13;
                                                    l9 = null;
                                                    nArray = L9.X();
                                                    string = null;
                                                    string2 = null;
                                                    Object var6_6 = null;
                                                    int n16 = ((ua_1)this.x.q).rowAtPoint(mouseEvent.getPoint());
                                                    n12 = ((ua_1)this.x.q).convertRowIndexToModel(n16);
                                                    if (n16 > -1) {
                                                        String string4;
                                                        String string5;
                                                        ArrayList arrayList;
                                                        try {
                                                            arrayList = (ArrayList)this.x.K.N();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        l9 = (L9)arrayList.get(n16);
                                                        try {
                                                            string5 = (String)l9.o();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        string = string5;
                                                        try {
                                                            string4 = (String)l9.K();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        string2 = string4;
                                                    }
                                                    n11 = mouseEvent.getButton();
                                                    n10 = 1;
                                                    if (nArray != null) break block39;
                                                    if (n11 != n10) break block40;
                                                    if (string == null) break block41;
                                                    try {
                                                        fy_13 = (fy_1)this.A.V();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    fy_12 = fy_13;
                                                    try {
                                                        n15 = (Integer)l9.O();
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    try {
                                                        t3_02 = (t3_0)fy_12.v(n15);
                                                    }
                                                    catch (InvocationTargetException invocationTargetException) {
                                                        throw invocationTargetException.getTargetException();
                                                    }
                                                    t3_0 t3_03 = t3_02;
                                                    if (nArray != null) break block42;
                                                    if (t3_03 != null) {
                                                        Object object2;
                                                        try {
                                                            object2 = fy_12.r();
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                        try {
                                                            object2.X(t3_03);
                                                        }
                                                        catch (InvocationTargetException invocationTargetException) {
                                                            throw invocationTargetException.getTargetException();
                                                        }
                                                    }
                                                    break block43;
                                                }
                                                if (nArray == null) break block44;
                                            }
                                            try {
                                                n14 = (Integer)l9.O();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                string3 = (String)l9.o();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                object = l9.o();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                n13 = (Integer)l9.O();
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                            try {
                                                fy_12.c((Object)(1 + n14 + a + string3), object, n13);
                                            }
                                            catch (InvocationTargetException invocationTargetException) {
                                                throw invocationTargetException.getTargetException();
                                            }
                                        }
                                        if (nArray == null) break block41;
                                    }
                                    n11 = mouseEvent.getButton();
                                    n10 = 3;
                                }
                                if (n11 != n10) break block41;
                                o5_02 = this;
                                if (nArray != null) break block45;
                                ((ua_1)o5_02.x.q).getSelectionModel().setSelectionInterval(n12, n12);
                                if (string2 == null) break block46;
                                ((JMenuItem)this.o).setEnabled(true);
                                if (nArray == null) break block47;
                            }
                            o5_02 = this;
                        }
                        ((JMenuItem)o5_02.o).setEnabled(false);
                    }
                    if (string == null) break block48;
                    ((JMenuItem)this.O).setEnabled(true);
                    if (nArray == null) break block49;
                }
                ((JMenuItem)this.O).setEnabled(false);
            }
            ((JPopupMenu)this.p).show((ua_1)this.x.q, mouseEvent.getX(), mouseEvent.getY());
        }
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
                char[] cArray3 = "90".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 57;
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
                            n17 = 35;
                            break;
                        }
                        case 1: {
                            n17 = 41;
                            break;
                        }
                        case 2: {
                            n17 = 86;
                            break;
                        }
                        case 3: {
                            n17 = 45;
                            break;
                        }
                        case 4: {
                            n17 = 56;
                            break;
                        }
                        case 5: {
                            n17 = 54;
                            break;
                        }
                        default: {
                            n17 = 97;
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

