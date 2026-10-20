/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from od
 */
class od_2
implements ActionListener {
    final U h;

    od_2(U u10) {
        this.h = u10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String[] stringArray = F8.y();
        cb_1 cb_12 = (cb_1)yt_1.u;
        if (stringArray == null) {
            if (cb_12 == null) {
                yt_1.u = new cb_1((U)this.h);
            }
            ((cb_1)yt_1.u).setVisible(true);
            cb_12 = (cb_1)yt_1.u;
        }
        cb_12.toFront();
    }
}

