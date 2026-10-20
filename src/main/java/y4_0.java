/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * Renamed from y4
 */
class y4_0
implements MouseListener {
    final nA L;

    y4_0(nA nA2) {
        this.L = nA2;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block12: {
            int n10;
            int n11;
            block11: {
                String[] stringArray;
                block8: {
                    block10: {
                        block9: {
                            int n12 = ((nA)this.L).rowAtPoint(mouseEvent.getPoint());
                            stringArray = Y_.j();
                            n11 = mouseEvent.getButton();
                            n10 = 3;
                            if (stringArray == null) break block8;
                            if (n11 != n10) break block9;
                            n11 = ((nA)this.L).isRowSelected(n12) ? 1 : 0;
                            if (stringArray == null) break block10;
                            if (n11 == 0) {
                                ((nA)this.L).getSelectionModel().setSelectionInterval(n12, n12);
                            }
                        }
                        n11 = mouseEvent.getButton();
                    }
                    n10 = 1;
                }
                if (stringArray == null) break block11;
                if (n11 != n10) break block12;
                n11 = mouseEvent.getClickCount();
                n10 = 2;
            }
            if (n11 == n10) {
                // empty if block
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

