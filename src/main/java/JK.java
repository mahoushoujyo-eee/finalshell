/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class JK
implements ActionListener {
    final CW p;

    JK(CW cW) {
        this.p = cW;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.p.h.H();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

