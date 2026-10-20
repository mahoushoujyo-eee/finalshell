/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class VG
implements ActionListener {
    final yb_1 p;

    VG(yb_1 yb_12) {
        this.p = yb_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        t3_0 t3_02;
        try {
            t3_02 = (t3_0)this.p.Q.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        t3_0 t3_03 = t3_02;
        try {
            this.p.s(t3_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

