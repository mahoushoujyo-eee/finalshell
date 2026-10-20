/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class YR
implements ActionListener {
    final p4 Y;

    YR(p4 p42) {
        this.Y = p42;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.Y.V();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

