/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class a9
implements ActionListener {
    final mi_0 W;

    a9(mi_0 mi_02) {
        this.W = mi_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.W.e(null);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

