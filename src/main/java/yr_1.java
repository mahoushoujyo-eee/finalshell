/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from yR
 */
class yr_1
implements ActionListener {
    final YB q;

    yr_1(YB yB) {
        this.q = yB;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.q.N = YB.v;
        ((YB)this.q).setVisible(false);
    }
}

