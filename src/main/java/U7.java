/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class U7
implements ActionListener {
    final yb_1 N;

    U7(yb_1 yb_12) {
        this.N = yb_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.N.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

