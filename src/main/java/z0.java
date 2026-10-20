/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class z0
implements ActionListener {
    final U Z;

    z0(U u10) {
        this.Z = u10;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            U.s();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

