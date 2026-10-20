/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBox;

/*
 * Renamed from bM
 */
class bm_1
implements ActionListener {
    final JCheckBox u;
    final nj_0 L;

    bm_1(nj_0 nj_02, JCheckBox jCheckBox) {
        this.L = nj_02;
        this.u = jCheckBox;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        aJ aJ2;
        String[] stringArray = F8.y();
        try {
            aJ2 = (aJ)this.L.O.b();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        boolean bl = ((JCheckBox)this.u).isSelected();
        if (stringArray == null) {
            bl = !bl;
        }
        try {
            aJ2.Q(bl);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

