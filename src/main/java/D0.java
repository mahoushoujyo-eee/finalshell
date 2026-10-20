/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class D0
implements ActionListener {
    final oh_1 S;

    D0(oh_1 oh_12) {
        this.S = oh_12;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.S.j.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

