/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class xX
implements ActionListener {
    final wx_0 h;

    xX(wx_0 wx_02) {
        this.h = wx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.h.d.f(this.h.i);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

