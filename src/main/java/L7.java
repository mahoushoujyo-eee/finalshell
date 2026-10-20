/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

class L7
implements MouseListener {
    final c1_0 h;
    final zw_0 B;
    final nH d;

    L7(nH nH2, c1_0 c1_02, zw_0 zw_02) {
        this.d = nH2;
        this.h = c1_02;
        this.B = zw_02;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block16: {
            int n10;
            int n11;
            int n12;
            block17: {
                String string;
                block15: {
                    block12: {
                        block14: {
                            block13: {
                                n12 = ((nH)this.d).rowAtPoint(mouseEvent.getPoint());
                                string = zw_0.V();
                                n11 = mouseEvent.getButton();
                                n10 = 3;
                                if (string == null) break block12;
                                if (n11 != n10) break block13;
                                n11 = ((nH)this.d).isRowSelected(n12) ? 1 : 0;
                                if (string == null) break block14;
                                if (n11 == 0) {
                                    ((nH)this.d).getSelectionModel().setSelectionInterval(n12, n12);
                                }
                            }
                            n11 = mouseEvent.getButton();
                        }
                        n10 = 1;
                    }
                    if (string == null) break block15;
                    if (n11 != n10) break block16;
                    n11 = mouseEvent.getClickCount();
                    n10 = 2;
                }
                if (string == null) break block17;
                if (n11 != n10) break block16;
                n11 = n12;
                n10 = -1;
            }
            if (n11 > n10) {
                YE yE;
                try {
                    yE = (YE)this.h.s(n12);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                YE yE2 = yE;
                try {
                    this.B.o(yE2);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
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

