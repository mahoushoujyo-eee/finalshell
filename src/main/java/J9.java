/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class J9
implements ActionListener {
    final kb_0 E;

    J9(kb_0 kb_02) {
        this.E = kb_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            try {
                this.E.X(this.E.o, false);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

