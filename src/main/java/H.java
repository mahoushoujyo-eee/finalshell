/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class H
implements ActionListener {
    final k0_0 f;

    H(k0_0 k0_02) {
        this.f = k0_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((k0_0)this.f).setVisible(false);
    }
}

