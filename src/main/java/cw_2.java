/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from cw
 */
class cw_2
implements ActionListener {
    final ka_0 a;

    cw_2(ka_0 ka_02) {
        this.a = ka_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            ka_0.i(this.a.G, this.a.i);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

