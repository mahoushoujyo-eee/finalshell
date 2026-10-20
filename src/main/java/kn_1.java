/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComboBox;

/*
 * Renamed from kN
 */
class kn_1
implements ActionListener {
    final nO b;

    kn_1(nO nO2) {
        this.b = nO2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JComboBox jComboBox;
        String string = km_0.U();
        nO nO2 = (nO)this.b;
        try {
            jComboBox = (JComboBox)nO.W(this.b);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        boolean bl = jComboBox.getSelectedIndex();
        if (string == null) {
            bl = bl;
        }
        try {
            nO.Z((Object)nO2, bl);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

