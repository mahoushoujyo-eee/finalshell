/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class xR
implements ActionListener {
    final yj_0 m;

    xR(yj_0 yj_02) {
        this.m = yj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.m.c.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

