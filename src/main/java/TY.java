/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TY
implements ActionListener {
    final xw_0 a;

    TY(xw_0 xw_02) {
        this.a = xw_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.a.S = xw_0.C;
        ((xw_0)this.a).setVisible(false);
    }
}

