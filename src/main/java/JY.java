/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class JY
implements ActionListener {
    final xw_0 X;

    JY(xw_0 xw_02) {
        this.X = xw_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.X.F();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

