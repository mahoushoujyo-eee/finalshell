/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class m0
implements ActionListener {
    final m4 S;

    m0(m4 m42) {
        this.S = m42;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.S.o.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

