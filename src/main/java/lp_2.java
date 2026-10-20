/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from lp
 */
class lp_2
implements ActionListener {
    final aM w;
    final t3_0 I;
    final xT P;

    lp_2(xT xT2, aM aM2, t3_0 t3_02) {
        this.P = xT2;
        this.w = aM2;
        this.I = t3_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.w.n(this.I);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

