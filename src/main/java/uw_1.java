/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JPopupMenu;

/*
 * Renamed from uW
 */
class uw_1
implements MouseListener {
    final JPopupMenu O;
    final O3 M;

    uw_1(O3 o3, JPopupMenu jPopupMenu) {
        this.M = o3;
        this.O = jPopupMenu;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        int n10;
        int n11;
        block25: {
            block26: {
                yx_1 yx_12;
                kw_2 kw_22;
                block28: {
                    int[] nArray;
                    block27: {
                        t3_0 t3_02;
                        Object object;
                        yx_1 yx_13;
                        int n12;
                        ArrayList arrayList;
                        int n13;
                        block23: {
                            block24: {
                                boolean bl = true;
                                boolean bl2 = true;
                                nArray = CE.S();
                                n13 = mouseEvent.getButton();
                                if (nArray == null) break block23;
                                if (n13 == 1) break block24;
                                n11 = mouseEvent.getButton();
                                n10 = 3;
                                if (nArray == null) break block25;
                                if (n11 != n10) break block26;
                            }
                            n13 = ((UT)this.M.x).rowAtPoint(mouseEvent.getPoint());
                        }
                        int n14 = n13;
                        int n15 = ((UT)this.M.x).convertRowIndexToModel(n14);
                        ((UT)this.M.x).getSelectionModel().setSelectionInterval(n14, n14);
                        n11 = n14;
                        n10 = -1;
                        if (nArray == null) break block25;
                        if (n11 <= n10) break block26;
                        try {
                            arrayList = (ArrayList)this.M.o.T();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        kw_22 = (kw_2)arrayList.get(n15);
                        this.M.z = n15;
                        try {
                            n12 = (Integer)kw_22.f();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        this.M.G = n12;
                        n11 = mouseEvent.getButton();
                        n10 = 1;
                        if (nArray == null) break block25;
                        if (n11 != n10) break block26;
                        try {
                            yx_13 = (yx_1)this.M.j.W();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        yx_12 = yx_13;
                        try {
                            object = kw_22.C();
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        try {
                            t3_02 = (t3_0)yx_12.g(object);
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                        t3_0 t3_03 = t3_02;
                        if (nArray == null) break block27;
                        if (t3_03 != null) {
                            Object object2;
                            try {
                                object2 = yx_12.w();
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
                        break block28;
                    }
                    if (nArray != null) break block26;
                }
                try {
                    yx_12.K(kw_22);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
            n11 = mouseEvent.getButton();
            n10 = 3;
        }
        if (n11 == n10) {
            ((JPopupMenu)this.O).show((UT)this.M.x, mouseEvent.getX(), mouseEvent.getY());
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
}

