/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from Ov
 */
class ov_0
implements ActionListener {
    final xe_0 b;

    ov_0(xe_0 xe_02) {
        this.b = xe_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((xe_0)this.b).setVisible(false);
    }
}

