/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

/*
 * Renamed from Qq
 */
class qq_0
implements ActionListener {
    final y1_0 A;
    final mi_0 O;

    qq_0(mi_0 mi_02, y1_0 y1_02) {
        this.O = mi_02;
        this.A = y1_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block6: {
            qq_0 qq_02;
            block4: {
                block5: {
                    boolean bl;
                    int[] nArray = L9.X();
                    qq_02 = this;
                    if (nArray != null) break block4;
                    try {
                        bl = (Boolean)qq_02.A.i();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (bl) break block5;
                    Dimension dimension = ((JPopupMenu)this.O.t).getPreferredSize();
                    ((JPopupMenu)this.O.t).show((JTextField)this.O.g, 1, ((JTextField)this.O.g).getHeight() + 2);
                    if (nArray == null) break block6;
                }
                qq_02 = this;
            }
            ((JPopupMenu)qq_02.O.t).setVisible(false);
        }
    }
}

