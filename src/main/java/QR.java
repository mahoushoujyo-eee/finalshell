/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class QR
implements ActionListener {
    final l5_0 k;

    QR(l5_0 l5_02) {
        this.k = l5_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((aJ)this.k.D).startEditingAtPath(((aJ)this.k.D).getSelectionPath());
    }
}

