/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class n_
implements ActionListener {
    final kb_0 C;

    n_(kb_0 kb_02) {
        this.C = kb_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.C.setVisible(false);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

