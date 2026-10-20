/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/*
 * Renamed from gy
 */
class gy_0
implements ActionListener {
    final aM J;
    final xT W;

    gy_0(xT xT2, aM aM2) {
        this.W = xT2;
        this.J = aM2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        try {
            object = this.J.G();
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        try {
            object.d(this.W.o);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
}

