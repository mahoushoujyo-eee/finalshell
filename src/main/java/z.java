/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class z
implements ActionListener {
    final oh_1 q;

    z(oh_1 oh_12) {
        this.q = oh_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.q.j.S();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

