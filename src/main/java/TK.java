/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class TK
implements ActionListener {
    final l5_0 B;

    TK(l5_0 l5_02) {
        this.B = l5_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object = ((DefaultMutableTreeNode)this.B.B).getUserObject();
    }
}

