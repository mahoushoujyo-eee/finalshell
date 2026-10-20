/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class FH
implements ActionListener {
    final JCheckBox q;
    final VN B;

    FH(VN vN, JCheckBox jCheckBox) {
        this.B = vN;
        this.q = jCheckBox;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.B.E = ((JCheckBox)this.q).isSelected();
    }
}

