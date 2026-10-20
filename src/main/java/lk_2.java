/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from lk
 */
class lk_2
implements MouseListener {
    final FK d;

    lk_2(FK fK2) {
        this.d = fK2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void mouseReleased(MouseEvent var1_1) {
        block20: {
            block21: {
                block19: {
                    v0 = FK.i();
                    var3_2 = ((tq_2)this.d.s).getSelectedRow();
                    this.d.E = false;
                    var2_3 = v0;
                    v1 = var3_2;
                    if (var2_3 != null) break block19;
                    if (v1 <= -1) break block20;
                    v1 = ((tq_2)this.d.s).convertRowIndexToModel(var3_2);
                }
                var4_4 = v1;
                try {
                    v2 = this.d.H.getValueAt(var4_4, 0);
                }
                catch (InvocationTargetException v3) {
                    throw v3.getTargetException();
                }
                var5_5 = (L1)v2;
                v4 = (FK)this.d;
                if (var2_3 != null) break block21;
                v4.V = System.currentTimeMillis();
                if (var1_1.getButton() != 1) break block20;
                v4 = (FK)this.d;
            }
            v5 = ((tq_2)this.d.s).getRowCount() - var4_4;
            if (var2_3 == null) {
                v5 = v5 < TI.K ? 1 : 0;
            }
            v4.E = (boolean)v5;
            if (var2_3 != null) ** GOTO lbl67
            try {
                v6 = yt_1.i();
            }
            catch (InvocationTargetException v7) {
                throw v7.getTargetException();
            }
            try {
                v8 = v6.P();
            }
            catch (InvocationTargetException v9) {
                throw v9.getTargetException();
            }
            try {
                v10 = (Boolean)v8.v();
            }
            catch (InvocationTargetException v11) {
                throw v11.getTargetException();
            }
            if (!v10) {
                v12 = (FK)this.d;
                if (var2_3 == null) {
                    if (((tq_2)v12.s).getRowCount() - var4_4 > TI.K) {
                        try {
                            lk_0.n();
                        }
                        catch (InvocationTargetException v13) {
                            throw v13.getTargetException();
                        }
                        return;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                try {
                    this.d.o();
                }
                catch (InvocationTargetException v14) {
                    throw v14.getTargetException();
                }
lbl67:
                // 2 sources

                v12 = (FK)this.d;
            }
            try {
                v12.k(var5_5);
            }
            catch (InvocationTargetException v15) {
                throw v15.getTargetException();
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

