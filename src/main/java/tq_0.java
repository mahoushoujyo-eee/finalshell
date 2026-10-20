/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.ne_2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from Tq
 */
class tq_0
implements ActionListener {
    final nj_0 T;

    tq_0(nj_0 nj_02) {
        this.T = nj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((ne_2)this.T.B).setText("");
    }
}

