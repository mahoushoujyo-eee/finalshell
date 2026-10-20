/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

/*
 * Renamed from zp
 */
class zp_0
implements ActionListener {
    final JCheckBox Q;
    final ak_0 C;

    zp_0(ak_0 ak_02, JCheckBox jCheckBox) {
        this.C = ak_02;
        this.Q = jCheckBox;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.C.i = ((JCheckBox)this.Q).isSelected();
    }
}

