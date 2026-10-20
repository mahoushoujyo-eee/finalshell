/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class mX
implements ActionListener {
    final ka_0 P;

    mX(ka_0 ka_02) {
        this.P = ka_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            ka_0.l(this.P.G, this.P.i);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

