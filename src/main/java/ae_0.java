/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from ae
 */
class ae_0
implements ActionListener {
    final yj_0 w;

    ae_0(yj_0 yj_02) {
        this.w = yj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.w.c.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

