/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from kd
 */
class kd_2
implements ActionListener {
    final nx_0 v;

    kd_2(nx_0 nx_02) {
        this.v = nx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        try {
            object = this.v.T.R();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.E();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

