/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from uT
 */
class ut_1
implements ActionListener {
    final o2_0 T;

    ut_1(o2_0 o2_02) {
        this.T = o2_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((o2_0)this.T).setVisible(false);
    }
}

