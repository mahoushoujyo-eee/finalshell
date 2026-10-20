/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

/*
 * Renamed from Og
 */
class og_0
implements ActionListener {
    final l5_0 R;

    og_0(l5_0 l5_02) {
        this.R = l5_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        SwingUtilities.invokeLater(new cv_0(this));
    }
}

