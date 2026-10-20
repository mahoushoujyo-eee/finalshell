/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

class UB
implements MouseListener {
    final nd_0 S;

    UB(nd_0 nd_02) {
        this.S = nd_02;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        block6: {
            BS bS;
            Object object;
            int n10;
            block7: {
                int n11;
                block5: {
                    String[] stringArray = br_0.w();
                    n10 = mouseEvent.getButton();
                    n11 = 3;
                    if (stringArray != null) break block5;
                    if (n10 != n11) break block6;
                    n10 = mouseEvent.getClickCount();
                    if (stringArray != null) break block7;
                    n11 = 1;
                }
                if (n10 != n11) break block6;
                n10 = ((nd_0)this.S).rowAtPoint(mouseEvent.getPoint());
            }
            int n12 = n10;
            int n13 = ((nd_0)this.S).convertRowIndexToModel(n12);
            ((nd_0)this.S).getSelectionModel().setSelectionInterval(n13, n13);
            try {
                object = this.S.C();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            try {
                bS = (BS)object.a(n13);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            BS bS2 = bS;
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
        block7: {
            int n10;
            int n11;
            block6: {
                String[] stringArray = br_0.w();
                n11 = mouseEvent.getButton();
                n10 = 1;
                if (stringArray != null) break block6;
                if (n11 != n10) break block7;
                n11 = mouseEvent.getClickCount();
                n10 = 2;
            }
            if (n11 == n10) {
                try {
                    this.S.p();
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
            }
        }
    }
}

