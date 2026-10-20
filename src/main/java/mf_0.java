/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from mf
 */
class mf_0
implements ActionListener {
    final CW o;

    mf_0(CW cW) {
        this.o = cW;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        t3_0 t3_02;
        try {
            t3_02 = (t3_0)this.o.u.Q();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        t3_0 t3_03 = t3_02;
        try {
            this.o.a(t3_03);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

