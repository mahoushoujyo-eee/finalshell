/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import com.pa_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Renamed from g
 */
class g_0
implements ActionListener {
    final pa_1 Z;
    final Y3 w;

    g_0(Y3 y3, pa_1 pa_12) {
        this.w = y3;
        this.Z = pa_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ((pa_1)this.Z).v();
    }
}

