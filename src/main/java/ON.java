/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class ON
implements ActionListener {
    final tg_0 v;

    ON(tg_0 tg_02) {
        this.v = tg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.v.W.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

