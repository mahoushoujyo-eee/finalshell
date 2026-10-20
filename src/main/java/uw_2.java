/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/*
 * Renamed from uw
 */
class uw_2
implements ActionListener {
    final zb_0 U;

    uw_2(zb_0 zb_02) {
        this.U = zb_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block8: {
            String string;
            zb_0 zb_02;
            block9: {
                int n10;
                block7: {
                    Object object;
                    boolean bl;
                    Window window = SwingUtilities.getWindowAncestor((zb_0)this.U);
                    n10 = z7.M();
                    on_2 on_22 = new on_2(window);
                    on_22.setLocationRelativeTo(window);
                    on_22.setVisible(true);
                    if (n10 != 0) break block7;
                    try {
                        bl = (Boolean)on_22.W();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    if (!bl) break block8;
                    try {
                        object = on_22.P();
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        throw invocationTargetException.getTargetException();
                    }
                    this.U.w = object;
                }
                zb_02 = (zb_0)this.U;
                if (n10 != 0) break block9;
                if ((ln_1)zb_02.w == null) break block8;
                zb_02 = (zb_0)this.U;
            }
            try {
                string = (String)this.U.w.F();
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            ((JTextField)zb_02.W).setText(string);
        }
    }
}

