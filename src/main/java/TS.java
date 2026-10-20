/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class TS
implements ActionListener {
    final WS Q;

    TS(WS wS) {
        this.Q = wS;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.Q.u.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

