/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class QN
implements ActionListener {
    final kb_0 B;

    QN(kb_0 kb_02) {
        this.B = kb_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            try {
                this.B.X(this.B.o, true);
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

