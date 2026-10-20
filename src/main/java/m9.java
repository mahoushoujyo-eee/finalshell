/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

class m9
implements MouseListener {
    final jx_0 P;
    final fr_2 m;
    final DT T;

    m9(DT dT, jx_0 jx_02, fr_2 fr_22) {
        this.T = dT;
        this.P = jx_02;
        this.m = fr_22;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block14: {
            int n10;
            int n11;
            block13: {
                int[] nArray;
                block9: {
                    block10: {
                        block12: {
                            DT dT;
                            int n12;
                            block11: {
                                n12 = ((DT)this.T).rowAtPoint(mouseEvent.getPoint());
                                nArray = jx_0.O();
                                n11 = mouseEvent.getButton();
                                n10 = 3;
                                if (nArray != null) break block9;
                                if (n11 != n10) break block10;
                                dT = (DT)this.T;
                                if (nArray != null) break block11;
                                if (dT.isRowSelected(n12)) break block12;
                                dT = (DT)this.T;
                            }
                            dT.getSelectionModel().setSelectionInterval(n12, n12);
                        }
                        yj_0 yj_02 = new yj_0((jx_0)this.P, (DT)this.T.I, (fr_2)this.m);
                        yj_02.show((DT)this.T.I, mouseEvent.getX(), mouseEvent.getY());
                    }
                    n11 = mouseEvent.getButton();
                    n10 = 1;
                }
                if (nArray != null) break block13;
                if (n11 != n10) break block14;
                n11 = mouseEvent.getClickCount();
                n10 = 2;
            }
            if (n11 == n10) {
                try {
                    this.P.F();
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

