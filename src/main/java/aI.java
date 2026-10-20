/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPopupMenu;

class aI
implements ActionListener {
    final JPopupMenu p;
    final JButton z;
    final nj_0 S;

    aI(nj_0 nj_02, JPopupMenu jPopupMenu, JButton jButton) {
        this.S = nj_02;
        this.p = jPopupMenu;
        this.z = jButton;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((JPopupMenu)this.p).show((JButton)this.z, 1, ((JButton)this.z).getHeight() - 2);
    }
}

