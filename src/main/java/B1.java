/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class B1
implements ActionListener {
    final uq_1 z;

    B1(uq_1 uq_12) {
        this.z = uq_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((uq_1)this.z).setVisible(false);
    }
}

