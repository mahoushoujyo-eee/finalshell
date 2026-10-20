/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

class JF
implements MouseListener {
    final oa_2 x;
    final zK K;
    final LQ S;

    JF(LQ lQ, oa_2 oa_22, zK zK2) {
        this.S = lQ;
        this.x = oa_22;
        this.K = zK2;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block16: {
            int n10;
            int n11;
            int n12;
            block15: {
                String[] stringArray;
                block12: {
                    block14: {
                        block13: {
                            n12 = ((LQ)this.S).rowAtPoint(mouseEvent.getPoint());
                            stringArray = zK.B();
                            n11 = mouseEvent.getButton();
                            n10 = 3;
                            if (stringArray == null) break block12;
                            if (n11 != n10) break block13;
                            n11 = ((LQ)this.S).isRowSelected(n12) ? 1 : 0;
                            if (stringArray == null) break block14;
                            if (n11 == 0) {
                                ((LQ)this.S).getSelectionModel().setSelectionInterval(n12, n12);
                            }
                        }
                        n11 = mouseEvent.getButton();
                    }
                    n10 = 1;
                }
                if (stringArray == null) break block15;
                if (n11 != n10) break block16;
                n11 = mouseEvent.getClickCount();
                n10 = 2;
            }
            if (n11 == n10) {
                zG zG2;
                try {
                    zG2 = (zG)this.x.q(n12);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                zG zG3 = zG2;
                try {
                    this.K.W(zG3);
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

