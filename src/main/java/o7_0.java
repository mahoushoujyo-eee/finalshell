/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from o7
 */
class o7_0
implements ActionListener {
    final p4 U;

    o7_0(p4 p42) {
        this.U = p42;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((p4)this.U).setVisible(false);
    }
}

