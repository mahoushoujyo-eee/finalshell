/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from fP
 */
class fp_1
implements ActionListener {
    final vi_0 N;

    fp_1(vi_0 vi_02) {
        this.N = vi_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((vi_0)this.N).setVisible(false);
    }
}

