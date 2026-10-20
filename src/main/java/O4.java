/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JPopupMenu;

class O4
implements MouseListener {
    final JPopupMenu k;
    final CG I;

    O4(CG cG, JPopupMenu jPopupMenu) {
        this.I = cG;
        this.k = jPopupMenu;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        int n10;
        int n11;
        block10: {
            block11: {
                int n12;
                String[] stringArray;
                block8: {
                    block9: {
                        boolean bl = true;
                        stringArray = y6_0.Z();
                        boolean bl2 = true;
                        n12 = mouseEvent.getButton();
                        if (stringArray == null) break block8;
                        if (n12 == 1) break block9;
                        n11 = mouseEvent.getButton();
                        n10 = 3;
                        if (stringArray == null) break block10;
                        if (n11 != n10) break block11;
                    }
                    n12 = ((y6_0)this.I.y).rowAtPoint(mouseEvent.getPoint());
                }
                int n13 = n12;
                int n14 = ((y6_0)this.I.y).convertRowIndexToModel(n13);
                ((y6_0)this.I.y).getSelectionModel().setSelectionInterval(n13, n13);
                n11 = n13;
                n10 = -1;
                if (stringArray == null) break block10;
                if (n11 > n10) {
                    int n15;
                    ArrayList arrayList;
                    try {
                        arrayList = (ArrayList)this.I.C.F();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    ya_1 ya_12 = (ya_1)arrayList.get(n14);
                    this.I.A = n14;
                    try {
                        n15 = (Integer)ya_12.q();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    this.I.D = n15;
                }
            }
            n11 = mouseEvent.getButton();
            n10 = 3;
        }
        if (n11 == n10) {
            ((JPopupMenu)this.k).show((y6_0)this.I.y, mouseEvent.getX(), mouseEvent.getY());
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

