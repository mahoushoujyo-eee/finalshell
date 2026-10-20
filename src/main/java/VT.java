/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class VT
implements ActionListener {
    final o2_0 x;

    VT(o2_0 o2_02) {
        this.x = o2_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.x.D();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

