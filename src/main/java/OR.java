/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class OR
implements ActionListener {
    final l5_0 Y;

    OR(l5_0 l5_02) {
        this.Y = l5_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.Y.D.N();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

