/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class zI
implements ActionListener {
    final yj_0 Y;

    zI(yj_0 yj_02) {
        this.Y = yj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.Y.c.m();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

