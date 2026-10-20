/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from f_
 */
class f__0
implements ActionListener {
    final mY p;

    f__0(mY mY2) {
        this.p = mY2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((mY)this.p).setVisible(false);
    }
}

