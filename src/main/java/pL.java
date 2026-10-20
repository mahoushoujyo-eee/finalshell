/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class pL
implements ActionListener {
    final yj_0 E;

    pL(yj_0 yj_02) {
        this.E = yj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.E.c.w();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

