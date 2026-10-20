/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.pa_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from oT
 */
class ot_1
implements ActionListener {
    final pa_1 U;
    final Y3 a;

    ot_1(Y3 y3, pa_1 pa_12) {
        this.a = y3;
        this.U = pa_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((pa_1)this.U).y();
    }
}

