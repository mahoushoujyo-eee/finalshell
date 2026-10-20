/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

class b
implements ActionListener {
    final z2 V;

    b(z2 z22) {
        this.V = z22;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        try {
            object = yt_1.i();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.a();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

