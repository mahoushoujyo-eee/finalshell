/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class mD
implements ActionListener {
    final l5_0 W;

    mD(l5_0 l5_02) {
        this.W = l5_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.W.D.a();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

