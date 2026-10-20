/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from kK
 */
class kk_1
implements ActionListener {
    final yu_1 b;

    kk_1(yu_1 yu_12) {
        this.b = yu_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((yu_1)this.b).setVisible(false);
    }
}

