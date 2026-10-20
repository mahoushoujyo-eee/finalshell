/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import org.jdesktop.swingx.JXList;

class a8
implements MouseListener {
    final FK U;

    a8(FK fK2) {
        this.U = fK2;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block10: {
            int n10;
            L1 l1;
            block12: {
                String string;
                L1 l12;
                int n11;
                String[] stringArray;
                block11: {
                    int n12;
                    int n13;
                    block9: {
                        n13 = ((JXList)this.U.l1).getSelectedIndex();
                        stringArray = FK.i();
                        n11 = mouseEvent.getButton();
                        n12 = 1;
                        if (stringArray != null) break block9;
                        if (n11 != n12) break block10;
                        n11 = n13;
                        if (stringArray != null) break block11;
                        n12 = -1;
                    }
                    if (n11 <= n12) break block10;
                    n11 = ((JXList)this.U.l1).convertIndexToModel(n13);
                }
                int n14 = n11;
                try {
                    l12 = (L1)this.U.v.Z(n14);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                l1 = l12;
                n10 = mouseEvent.getButton();
                if (stringArray != null) break block12;
                if (n10 != 1) break block10;
                try {
                    string = (String)l1.A();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                n10 = string.endsWith("/") ? 1 : 0;
            }
            if (n10 == 0) {
                // empty if block
            }
            try {
                this.U.k(l1);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
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

