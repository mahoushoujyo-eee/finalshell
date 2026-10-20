/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ky_2;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from Jh
 */
class jh_0
implements MouseListener {
    final c6_0 y;
    final z_ F;
    final yy_0 J;

    jh_0(yy_0 yy_02, c6_0 c6_02, z_ z_3) {
        this.J = yy_02;
        this.y = c6_02;
        this.F = z_3;
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        block16: {
            int n10;
            int n11;
            block17: {
                int n12;
                block15: {
                    ky_2[] ky_2Array;
                    block12: {
                        block14: {
                            block13: {
                                n11 = ((yy_0)this.J).rowAtPoint(mouseEvent.getPoint());
                                ky_2Array = z_.t();
                                n10 = mouseEvent.getButton();
                                n12 = 3;
                                if (ky_2Array != null) break block12;
                                if (n10 != n12) break block13;
                                n10 = ((yy_0)this.J).isRowSelected(n11) ? 1 : 0;
                                if (ky_2Array != null) break block14;
                                if (n10 == 0) {
                                    ((yy_0)this.J).getSelectionModel().setSelectionInterval(n11, n11);
                                }
                            }
                            n10 = mouseEvent.getButton();
                        }
                        n12 = 1;
                    }
                    if (ky_2Array != null) break block15;
                    if (n10 != n12) break block16;
                    n10 = mouseEvent.getClickCount();
                    if (ky_2Array != null) break block17;
                    n12 = 2;
                }
                if (n10 != n12) break block16;
                n10 = n11;
            }
            if (n10 != 0) {
                ld_1 ld_12;
                try {
                    ld_12 = (ld_1)this.y.p(n11);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw invocationTargetException.getTargetException();
                }
                ld_1 ld_13 = ld_12;
                try {
                    this.F.c(ld_13);
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

