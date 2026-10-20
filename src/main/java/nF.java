/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPopupMenu;

class nF
implements ActionListener {
    final y1_0 b;
    final C_ M;
    final te_1 u;

    nF(te_1 te_12, y1_0 y1_02, C_ c_) {
        this.u = te_12;
        this.b = y1_02;
        this.M = c_;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block8: {
            nF nF2;
            block6: {
                block7: {
                    boolean bl;
                    int n10 = te_1.i();
                    nF2 = this;
                    if (n10 != 0) break block6;
                    try {
                        bl = (Boolean)nF2.b.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl) break block7;
                    try {
                        this.u.L();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    ((JPopupMenu)this.u.K).show((C_)this.M, 2, ((C_)this.M).getHeight());
                    if (n10 == 0) break block8;
                }
                nF2 = this;
            }
            ((JPopupMenu)nF2.u.K).setVisible(false);
        }
    }
}

