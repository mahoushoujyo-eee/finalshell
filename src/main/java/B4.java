/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class B4
implements ActionListener {
    final f7_0 I;

    B4(f7_0 f7_02) {
        this.I = f7_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((f7_0)this.I).setVisible(false);
    }
}

