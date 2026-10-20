/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class x7
implements ActionListener {
    final nj_0 Y;

    x7(nj_0 nj_02) {
        this.Y = nj_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.Y.L();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

