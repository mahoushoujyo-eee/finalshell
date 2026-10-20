/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class UQ
implements ActionListener {
    final yj_0 d;

    UQ(yj_0 yj_02) {
        this.d = yj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.d.c.b();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

