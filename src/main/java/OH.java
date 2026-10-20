/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class OH
implements ActionListener {
    final F6 j;

    OH(F6 f62) {
        this.j = f62;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.j.x(this.j.Y);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

