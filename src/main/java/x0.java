/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class x0
implements ActionListener {
    final ka_0 M;

    x0(ka_0 ka_02) {
        this.M = ka_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            ka_0.i(this.M.i);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

