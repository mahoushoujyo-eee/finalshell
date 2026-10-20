/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class YT
implements ActionListener {
    final l5_0 J;

    YT(l5_0 l5_02) {
        this.J = l5_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        try {
            object = this.J.D.n(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        this.J.D.I = object;
    }
}

