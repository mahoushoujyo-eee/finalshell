/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class Q2
implements ActionListener {
    final nx_0 d;

    Q2(nx_0 nx_02) {
        this.d = nx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            lk_0.j(this.d.s);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

