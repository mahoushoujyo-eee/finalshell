/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.pa_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class F2
implements ActionListener {
    final pa_1 z;
    final Y3 c;

    F2(Y3 y3, pa_1 pa_12) {
        this.c = y3;
        this.z = pa_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((pa_1)this.z).A(false);
    }
}

